package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.snippet.PackageContent;
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
public final class BulkMergePackages extends BulkDataMergeService<PackageFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final SnippetPackageDBAdapter packageDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergePackages(h hVar, v vVar, SnippetPackageDBAdapter snippetPackageDBAdapter, b bVar) {
        super(hVar, vVar, PackageFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(snippetPackageDBAdapter, "packageDBAdapter");
        t.f(bVar, "jsonConverter");
        this.packageDBAdapter = snippetPackageDBAdapter;
        this.jsonConverter = bVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getPackages().iterator();
        while (it.hasNext()) {
            this.packageDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(PackageFullData packageFullData) throws po.a {
        SnippetPackageDBModel snippetPackageDBModel;
        t.f(packageFullData, "item");
        String str = packageFullData.content;
        if (str != null) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    snippetPackageDBModel = new SnippetPackageDBModel(((PackageContent) bVar.b(PackageContent.Companion.serializer(), str2)).getLabel(), packageFullData.isShared(), packageFullData.getId(), packageFullData.getUpdatedAt(), 0);
                    snippetPackageDBModel.setContent(str);
                    snippetPackageDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("PackageFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(PackageContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(packageFullData.getRemoteId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            snippetPackageDBModel = new SnippetPackageDBModel(packageFullData.label, packageFullData.isShared(), packageFullData.getId(), packageFullData.getUpdatedAt(), 0);
        }
        snippetPackageDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(packageFullData.getEncryptedWith()));
        Long localId = packageFullData.getLocalId();
        if (localId == null) {
            this.packageDBAdapter.editByRemoteId(packageFullData.getId(), snippetPackageDBModel);
        } else {
            snippetPackageDBModel.setIdInDatabase(localId.longValue());
            this.packageDBAdapter.editByLocalId(localId.longValue(), snippetPackageDBModel);
        }
    }
}
