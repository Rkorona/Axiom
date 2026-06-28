package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.tag.TagContent;
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
public final class BulkMergeTags extends BulkDataMergeService<TagFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final TagDBAdapter tagDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeTags(h hVar, v vVar, TagDBAdapter tagDBAdapter, b bVar) {
        super(hVar, vVar, TagFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(tagDBAdapter, "tagDBAdapter");
        t.f(bVar, "jsonConverter");
        this.tagDBAdapter = tagDBAdapter;
        this.jsonConverter = bVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getTags().iterator();
        while (it.hasNext()) {
            this.tagDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(TagFullData tagFullData) throws po.a {
        TagDBModel tagDBModel;
        t.f(tagFullData, "item");
        String str = tagFullData.content;
        if (str != null) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    tagDBModel = new TagDBModel(((TagContent) bVar.b(TagContent.Companion.serializer(), str2)).getLabel());
                    tagDBModel.setContent(str);
                    tagDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("TagFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(TagContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(tagFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            tagDBModel = new TagDBModel(tagFullData.label);
        }
        tagDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(tagFullData.getEncryptedWith()));
        tagDBModel.setShared(t.b(tagFullData.isShared(), Boolean.TRUE));
        tagDBModel.setIdOnServer(tagFullData.getId());
        tagDBModel.setUpdatedAtTime(tagFullData.getUpdatedAt());
        tagDBModel.setStatus(0);
        Long localId = tagFullData.getLocalId();
        if (localId == null) {
            this.tagDBAdapter.editByRemoteId(tagFullData.getId(), tagDBModel);
        } else {
            tagDBModel.setIdInDatabase(localId.longValue());
            this.tagDBAdapter.editByLocalId(localId.longValue(), tagDBModel);
        }
    }
}
