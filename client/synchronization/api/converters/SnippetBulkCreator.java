package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.snippet.SnippetContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SnippetBulkCreator extends BaseBulkApiCreator<SnippetBulk, SnippetBulkV3, SnippetBulkV5, SnippetDBModel> {
    private static final String packageIdPrefix = "package_set/";
    private final ContentPatcher contentPatcher;
    private final SnippetPackageDBAdapter packageDBAdapter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetBulkCreator(a aVar, SnippetPackageDBAdapter snippetPackageDBAdapter, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(aVar, "termiusStorage");
        t.f(snippetPackageDBAdapter, "packageDBAdapter");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.packageDBAdapter = snippetPackageDBAdapter;
        this.contentPatcher = contentPatcher;
    }

    private final boolean isNotEmptyServerId(Long l10) {
        return l10 == null || -1 != l10.longValue();
    }

    private final Object preparePackageId(Long l10) {
        if (l10 == null) {
            return null;
        }
        SnippetPackageDBModel itemByLocalId = this.packageDBAdapter.getItemByLocalId(l10.longValue());
        Long lValueOf = itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null;
        if (isNotEmptyServerId(lValueOf)) {
            return lValueOf;
        }
        return packageIdPrefix + l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SnippetBulkV3 createV3(SnippetDBModel snippetDBModel) {
        t.f(snippetDBModel, "dbModel");
        String title = snippetDBModel.getTitle();
        String expression = snippetDBModel.getExpression();
        boolean closeAfterRunDefault = snippetDBModel.getCloseAfterRunDefault();
        long idInDatabase = snippetDBModel.getIdInDatabase();
        long jPrepareIdOnServer = prepareIdOnServer(snippetDBModel.getIdOnServer());
        String updatedAtTime = snippetDBModel.getUpdatedAtTime();
        Object objPreparePackageId = preparePackageId(snippetDBModel.getPackageId());
        return new SnippetBulkV3(title, expression, Boolean.valueOf(closeAfterRunDefault), Long.valueOf(idInDatabase), jPrepareIdOnServer, updatedAtTime, snippetDBModel.getVaultKeyId().getId(), objPreparePackageId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SnippetBulkV5 createV5(SnippetDBModel snippetDBModel) throws JSONException {
        t.f(snippetDBModel, "dbModel");
        String title = snippetDBModel.getTitle();
        t.e(title, "getTitle(...)");
        String expression = snippetDBModel.getExpression();
        t.e(expression, "getExpression(...)");
        boolean closeAfterRunDefault = snippetDBModel.getCloseAfterRunDefault();
        String scriptStructure = snippetDBModel.getScriptStructure();
        t.e(scriptStructure, "getScriptStructure(...)");
        SnippetContent snippetContent = new SnippetContent(title, expression, closeAfterRunDefault, 0, scriptStructure, 8, (k) null);
        String content = snippetDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(SnippetContent.Companion.serializer(), snippetContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        long idInDatabase = snippetDBModel.getIdInDatabase();
        long jPrepareIdOnServer = prepareIdOnServer(snippetDBModel.getIdOnServer());
        String updatedAtTime = snippetDBModel.getUpdatedAtTime();
        Object objPreparePackageId = preparePackageId(snippetDBModel.getPackageId());
        return new SnippetBulkV5(strC, Long.valueOf(idInDatabase), jPrepareIdOnServer, updatedAtTime, snippetDBModel.getVaultKeyId().getId(), objPreparePackageId);
    }
}
