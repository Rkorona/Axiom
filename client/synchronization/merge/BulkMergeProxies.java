package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.proxycommand.ProxyCommandContent;
import com.server.auditor.ssh.client.ui.util.JsonDecodeFromStringFailed;
import io.sentry.f;
import io.sentry.h7;
import java.util.Iterator;
import ju.n0;
import ju.t;
import mv.b;
import np.k;
import np.l;
import po.b;
import po.c;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeProxies extends BulkDataMergeService<ProxyFullData> {
    public static final int $stable = 8;
    private final IdentityDBAdapter identityDBAdapter;
    private final b jsonConverter;
    private final ProxyDBAdapter proxyDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeProxies(h hVar, v vVar, ProxyDBAdapter proxyDBAdapter, IdentityDBAdapter identityDBAdapter, b bVar) {
        super(hVar, vVar, ProxyFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(proxyDBAdapter, "proxyDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        t.f(bVar, "jsonConverter");
        this.proxyDBAdapter = proxyDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
        this.jsonConverter = bVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getProxies().iterator();
        while (it.hasNext()) {
            this.proxyDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(ProxyFullData proxyFullData) throws po.a {
        ProxyDBModel proxyDBModel;
        IdentityDBModel itemByRemoteId;
        ProxyDBModel itemByRemoteId2;
        ProxyDBModel itemByLocalId;
        t.f(proxyFullData, "item");
        String str = proxyFullData.content;
        Object[] objArr = str != null;
        Long identityId = null;
        lValueOf = null;
        Long lValueOf = null;
        Long lValueOf2 = proxyFullData.getIdentityId() != null ? Long.valueOf(r6.getId()) : null;
        if (objArr == true) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str != null ? str : "";
                try {
                    bVar.a();
                    ProxyCommandContent proxyCommandContent = (ProxyCommandContent) bVar.b(ProxyCommandContent.Companion.serializer(), str2);
                    proxyDBModel = new ProxyDBModel(proxyCommandContent.getType(), proxyCommandContent.getHostname(), proxyCommandContent.getPort(), lValueOf2, proxyFullData.getId(), 0, proxyFullData.getUpdatedAt());
                    proxyDBModel.setContent(str);
                    proxyDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("ProxyFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(ProxyCommandContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(proxyFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            String str3 = proxyFullData.hostname;
            String str4 = str3 == null ? "" : str3;
            String type = proxyFullData.getType();
            Integer port = proxyFullData.getPort();
            proxyDBModel = new ProxyDBModel(type, str4, port != null ? port.intValue() : 0, lValueOf2, proxyFullData.getId(), 0, proxyFullData.getUpdatedAt());
        }
        proxyDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(proxyFullData.getEncryptedWith()));
        proxyDBModel.setShared(t.b(proxyFullData.getShared(), Boolean.TRUE));
        if (SyncServiceHelper.isIdentitySynced() || proxyDBModel.isShared()) {
            if (lValueOf2 != null && (itemByRemoteId = this.identityDBAdapter.getItemByRemoteId(lValueOf2.longValue())) != null) {
                lValueOf = Long.valueOf(itemByRemoteId.getIdInDatabase());
            }
            proxyDBModel.setIdentityId(lValueOf);
        } else {
            Long localId = proxyFullData.getLocalId();
            if (localId != null) {
                itemByLocalId = this.proxyDBAdapter.getItemByLocalId(localId.longValue());
                itemByRemoteId2 = null;
            } else {
                itemByRemoteId2 = this.proxyDBAdapter.getItemByRemoteId(proxyFullData.getId());
                itemByLocalId = null;
            }
            if (itemByRemoteId2 != null) {
                identityId = itemByRemoteId2.getIdentityId();
            } else if (itemByLocalId != null) {
                identityId = itemByLocalId.getIdentityId();
            }
            proxyDBModel.setIdentityId(identityId);
        }
        Long localId2 = proxyFullData.getLocalId();
        if (localId2 == null) {
            this.proxyDBAdapter.editByRemoteId(proxyFullData.getId(), proxyDBModel);
        } else {
            proxyDBModel.setIdInDatabase(localId2.longValue());
            this.proxyDBAdapter.editByLocalId(localId2.longValue(), proxyDBModel);
        }
    }
}
