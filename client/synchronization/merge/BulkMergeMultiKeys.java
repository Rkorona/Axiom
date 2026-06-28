package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.MultiKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.MultiKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.key.MultiKeyContent;
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
public final class BulkMergeMultiKeys extends BulkDataMergeService<MultiKeyFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final MultiKeyDBAdapter multiKeyDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeMultiKeys(h hVar, v vVar, MultiKeyDBAdapter multiKeyDBAdapter, b bVar) {
        super(hVar, vVar, MultiKeyFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(multiKeyDBAdapter, "multiKeyDBAdapter");
        t.f(bVar, "jsonConverter");
        this.multiKeyDBAdapter = multiKeyDBAdapter;
        this.jsonConverter = bVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getMultiKeys().iterator();
        while (it.hasNext()) {
            this.multiKeyDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(MultiKeyFullData multiKeyFullData) throws po.a {
        MultiKeyDBModel multiKeyDBModel;
        t.f(multiKeyFullData, "item");
        String str = multiKeyFullData.content;
        if (str != null) {
            try {
                b bVar = this.jsonConverter;
                try {
                    bVar.a();
                    MultiKeyContent multiKeyContent = (MultiKeyContent) bVar.b(MultiKeyContent.Companion.serializer(), str);
                    String name = multiKeyContent.getName();
                    String username = multiKeyContent.getUsername();
                    if (username == null) {
                        username = "";
                    }
                    multiKeyDBModel = new MultiKeyDBModel(name, username, multiKeyFullData.getRemoteId(), multiKeyFullData.getUpdatedAt(), 0);
                    multiKeyDBModel.setContent(str);
                    multiKeyDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("MultiKeyFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(MultiKeyContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(multiKeyFullData.getRemoteId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            multiKeyDBModel = new MultiKeyDBModel(multiKeyFullData.name, multiKeyFullData.username, multiKeyFullData.getRemoteId(), multiKeyFullData.getUpdatedAt(), 0);
        }
        multiKeyDBModel.setShared(true);
        multiKeyDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(multiKeyFullData.getEncryptedWith()));
        Long localId = multiKeyFullData.getLocalId();
        if (localId == null) {
            this.multiKeyDBAdapter.editByRemoteId(multiKeyFullData.getId(), multiKeyDBModel);
        } else {
            multiKeyDBModel.setIdInDatabase(localId.longValue());
            this.multiKeyDBAdapter.editByLocalId(localId.longValue(), multiKeyDBModel);
        }
    }
}
