package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.config.SshConfigContent;
import java.util.Locale;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SshConfigBulkCreator extends BaseBulkApiCreator<SshConfigBulk, SshConfigBulkV3, SshConfigBulkV5, SshRemoteConfigDBModel> {
    private static final String proxyIdPrefix = "proxycommand_set/";
    private static final String snippetIdPrefix = "snippet_set/";
    private final ContentPatcher contentPatcher;
    private final ProxyDBAdapter proxyDBAdapter;
    private final SnippetDBAdapter snippetDBAdapter;
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
    public SshConfigBulkCreator(ProxyDBAdapter proxyDBAdapter, SnippetDBAdapter snippetDBAdapter, a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(proxyDBAdapter, "proxyDBAdapter");
        t.f(snippetDBAdapter, "snippetDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.proxyDBAdapter = proxyDBAdapter;
        this.snippetDBAdapter = snippetDBAdapter;
        this.contentPatcher = contentPatcher;
    }

    private final Object prepareProxyId(Long l10) {
        if (l10 == null) {
            return null;
        }
        ProxyDBModel itemByRemoteId = this.proxyDBAdapter.getItemByRemoteId(l10.longValue());
        if (itemByRemoteId != null) {
            return Long.valueOf(itemByRemoteId.getIdOnServer());
        }
        return proxyIdPrefix + l10;
    }

    private final Object prepareSnippetId(Long l10) {
        if (l10 == null) {
            return null;
        }
        SnippetDBModel itemByRemoteId = this.snippetDBAdapter.getItemByRemoteId(l10.longValue());
        if (itemByRemoteId != null) {
            return Long.valueOf(itemByRemoteId.getIdOnServer());
        }
        return snippetIdPrefix + l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SshConfigBulkV3 createV3(SshRemoteConfigDBModel sshRemoteConfigDBModel) {
        t.f(sshRemoteConfigDBModel, "dbModel");
        return new SshConfigBulkV3(sshRemoteConfigDBModel.isUseMosh(), sshRemoteConfigDBModel.isUseAgentForwarding(), sshRemoteConfigDBModel.getMoshServerCommand(), sshRemoteConfigDBModel.getEnvironmentVariables(), sshRemoteConfigDBModel.getPort(), sshRemoteConfigDBModel.getCharset(), VariablesConverter.deconvertToAPIColorScheme(sshRemoteConfigDBModel.getColorScheme()), prepareProxyId(sshRemoteConfigDBModel.getProxyId()), prepareSnippetId(sshRemoteConfigDBModel.getStartupSnippetId()), Long.valueOf(sshRemoteConfigDBModel.getIdInDatabase()), prepareIdOnServer(sshRemoteConfigDBModel.getIdOnServer()), sshRemoteConfigDBModel.getUpdatedAtTime(), sshRemoteConfigDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SshConfigBulkV5 createV5(SshRemoteConfigDBModel sshRemoteConfigDBModel) throws JSONException {
        String lowerCase;
        t.f(sshRemoteConfigDBModel, "dbModel");
        Boolean boolIsUseMosh = sshRemoteConfigDBModel.isUseMosh();
        Boolean boolIsUseAgentForwarding = sshRemoteConfigDBModel.isUseAgentForwarding();
        String moshServerCommand = sshRemoteConfigDBModel.getMoshServerCommand();
        String environmentVariables = sshRemoteConfigDBModel.getEnvironmentVariables();
        Integer port = sshRemoteConfigDBModel.getPort();
        String charset = sshRemoteConfigDBModel.getCharset();
        String strDeconvertToAPIColorScheme = VariablesConverter.deconvertToAPIColorScheme(sshRemoteConfigDBModel.getColorScheme());
        if (strDeconvertToAPIColorScheme != null) {
            lowerCase = strDeconvertToAPIColorScheme.toLowerCase(Locale.ROOT);
            t.e(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        SshConfigContent sshConfigContent = new SshConfigContent(boolIsUseMosh, boolIsUseAgentForwarding, moshServerCommand, environmentVariables, port, charset, lowerCase, 0, 128, (k) null);
        String content = sshRemoteConfigDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(SshConfigContent.Companion.serializer(), sshConfigContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new SshConfigBulkV5(strC, prepareProxyId(sshRemoteConfigDBModel.getProxyId()), prepareSnippetId(sshRemoteConfigDBModel.getStartupSnippetId()), Long.valueOf(sshRemoteConfigDBModel.getIdInDatabase()), prepareIdOnServer(sshRemoteConfigDBModel.getIdOnServer()), sshRemoteConfigDBModel.getUpdatedAtTime(), sshRemoteConfigDBModel.getVaultKeyId().getId());
    }
}
