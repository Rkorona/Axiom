package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.snippet.SnippetContent;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
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
public final class BulkMergeSnippets extends BulkDataMergeService<SnippetFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final SnippetPackageDBAdapter packageDBAdapter;
    private final SnippetDBAdapter snippetDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeSnippets(h hVar, v vVar, SnippetDBAdapter snippetDBAdapter, SnippetPackageDBAdapter snippetPackageDBAdapter, b bVar) {
        super(hVar, vVar, SnippetFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(snippetDBAdapter, "snippetDBAdapter");
        t.f(snippetPackageDBAdapter, "packageDBAdapter");
        t.f(bVar, "jsonConverter");
        this.snippetDBAdapter = snippetDBAdapter;
        this.packageDBAdapter = snippetPackageDBAdapter;
        this.jsonConverter = bVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getSnippets().iterator();
        while (it.hasNext()) {
            this.snippetDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(SnippetFullData snippetFullData) throws po.a {
        SnippetDBModel snippetDBModel;
        t.f(snippetFullData, "item");
        WithRecourseId withRecourseId = snippetFullData.packageId;
        String str = snippetFullData.content;
        boolean z10 = true;
        Object[] objArr = str != null;
        Long localId = snippetFullData.getLocalId();
        if (objArr == true) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str != null ? str : "";
                try {
                    bVar.a();
                    SnippetContent snippetContent = (SnippetContent) bVar.b(SnippetContent.Companion.serializer(), str2);
                    snippetDBModel = new SnippetDBModel(snippetContent.getLabel(), snippetContent.getScript(), snippetContent.getAutoClose());
                    snippetDBModel.setContent(str);
                    snippetDBModel.setScriptStructure(snippetContent.getScriptStructure());
                    snippetDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("SnippetFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(SnippetContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(snippetFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            String str3 = snippetFullData.label;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = snippetFullData.script;
            if (str4 == null) {
                str4 = "";
            }
            Boolean bool = snippetFullData.autoClose;
            if (bool != null && !t.b(bool, Boolean.TRUE)) {
                z10 = false;
            }
            SnippetDBModel snippetDBModel2 = new SnippetDBModel(str3, str4, z10);
            SnippetDBModel itemByLocalId = localId != null ? this.snippetDBAdapter.getItemByLocalId(localId.longValue()) : this.snippetDBAdapter.getItemByRemoteId(snippetFullData.getId());
            String scriptStructure = itemByLocalId != null ? itemByLocalId.getScriptStructure() : null;
            snippetDBModel2.setScriptStructure(scriptStructure != null ? scriptStructure : "");
            snippetDBModel = snippetDBModel2;
        }
        snippetDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(snippetFullData.getEncryptedWith()));
        if (withRecourseId != null) {
            SnippetPackageDBModel itemByRemoteId = this.packageDBAdapter.getItemByRemoteId(withRecourseId.getId());
            snippetDBModel.setPackageId(itemByRemoteId != null ? Long.valueOf(itemByRemoteId.getIdInDatabase()) : null);
        }
        snippetDBModel.setIdOnServer(snippetFullData.getId());
        snippetDBModel.setUpdatedAtTime(snippetFullData.getUpdatedAt());
        snippetDBModel.setStatus(0);
        if (snippetFullData.getShared() != null) {
            snippetDBModel.setShared(t.b(snippetFullData.isShared(), Boolean.TRUE));
        }
        if (localId == null) {
            this.snippetDBAdapter.editByRemoteId(snippetFullData.getId(), snippetDBModel);
        } else {
            snippetDBModel.setIdInDatabase(localId.longValue());
            this.snippetDBAdapter.editByLocalId(localId.longValue(), snippetDBModel);
        }
    }
}
