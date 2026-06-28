package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.knownhost.KnownHostContent;
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
public final class BulkMergeKnownHosts extends BulkDataMergeService<KnownHostFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final KnownHostsDBAdapter knownHostsDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeKnownHosts(h hVar, v vVar, KnownHostsDBAdapter knownHostsDBAdapter, b bVar) {
        super(hVar, vVar, KnownHostFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(knownHostsDBAdapter, "knownHostsDBAdapter");
        t.f(bVar, "jsonConverter");
        this.knownHostsDBAdapter = knownHostsDBAdapter;
        this.jsonConverter = bVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getKnownHosts().iterator();
        while (it.hasNext()) {
            this.knownHostsDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(KnownHostFullData knownHostFullData) throws po.a {
        KnownHostsDBModel knownHostsDBModel;
        t.f(knownHostFullData, "item");
        String str = knownHostFullData.content;
        if (str != null) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    KnownHostContent knownHostContent = (KnownHostContent) bVar.b(KnownHostContent.Companion.serializer(), str2);
                    knownHostsDBModel = new KnownHostsDBModel(knownHostContent.getHostnames(), knownHostContent.getKey(), "", "", knownHostFullData.getId(), 0, knownHostFullData.getUpdatedAt());
                    knownHostsDBModel.setContent(str);
                    knownHostsDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("KnownHostFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(KnownHostContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(knownHostFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            knownHostsDBModel = new KnownHostsDBModel(knownHostFullData.hostname, knownHostFullData.publicKey, "", "", knownHostFullData.getId(), 0, knownHostFullData.getUpdatedAt());
        }
        knownHostsDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(knownHostFullData.getEncryptedWith()));
        knownHostsDBModel.setShared(knownHostFullData.isShared());
        Long localId = knownHostFullData.getLocalId();
        if (localId == null) {
            this.knownHostsDBAdapter.editByRemoteId(knownHostFullData.getId(), knownHostsDBModel);
        } else {
            knownHostsDBModel.setIdInDatabase(localId.longValue());
            this.knownHostsDBAdapter.editByLocalId(localId.longValue(), knownHostsDBModel);
        }
    }
}
