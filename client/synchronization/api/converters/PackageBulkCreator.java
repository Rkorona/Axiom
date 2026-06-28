package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.snippet.PackageContent;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class PackageBulkCreator extends BaseBulkApiCreator<PackageBulk, PackageBulkV3, PackageBulkV5, SnippetPackageDBModel> {
    public static final int $stable = 8;
    private final ContentPatcher contentPatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageBulkCreator(a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.contentPatcher = contentPatcher;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public PackageBulkV3 createV3(SnippetPackageDBModel snippetPackageDBModel) {
        t.f(snippetPackageDBModel, "dbModel");
        return new PackageBulkV3(snippetPackageDBModel.getLabel(), Long.valueOf(snippetPackageDBModel.getIdInDatabase()), prepareIdOnServer(snippetPackageDBModel.getIdOnServer()), snippetPackageDBModel.getUpdatedAtTime(), snippetPackageDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public PackageBulkV5 createV5(SnippetPackageDBModel snippetPackageDBModel) throws JSONException {
        t.f(snippetPackageDBModel, "dbModel");
        PackageContent packageContent = new PackageContent(snippetPackageDBModel.getLabel());
        String content = snippetPackageDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(PackageContent.Companion.serializer(), packageContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new PackageBulkV5(strC, Long.valueOf(snippetPackageDBModel.getIdInDatabase()), prepareIdOnServer(snippetPackageDBModel.getIdOnServer()), snippetPackageDBModel.getUpdatedAtTime(), snippetPackageDBModel.getVaultKeyId().getId());
    }
}
