package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulk;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.telnetconfig.TelnetConfigContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class TelnetConfigBulkCreator extends BaseBulkApiCreator<TelnetConfigBulk, TelnetConfigBulkV3, TelnetConfigBulkV5, TelnetRemoteConfigDBModel> {
    public static final int $stable = 8;
    private final ContentPatcher contentPatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelnetConfigBulkCreator(a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.contentPatcher = contentPatcher;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public TelnetConfigBulkV3 createV3(TelnetRemoteConfigDBModel telnetRemoteConfigDBModel) {
        t.f(telnetRemoteConfigDBModel, "dbModel");
        return new TelnetConfigBulkV3(telnetRemoteConfigDBModel.getPort(), telnetRemoteConfigDBModel.getCharset(), VariablesConverter.deconvertToAPIColorScheme(telnetRemoteConfigDBModel.getColorScheme()), telnetRemoteConfigDBModel.getIdInDatabase(), prepareIdOnServer(telnetRemoteConfigDBModel.getIdOnServer()), telnetRemoteConfigDBModel.getUpdatedAtTime(), telnetRemoteConfigDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public TelnetConfigBulkV5 createV5(TelnetRemoteConfigDBModel telnetRemoteConfigDBModel) throws JSONException {
        t.f(telnetRemoteConfigDBModel, "dbModel");
        TelnetConfigContent telnetConfigContent = new TelnetConfigContent(telnetRemoteConfigDBModel.getPort(), telnetRemoteConfigDBModel.getCharset(), VariablesConverter.deconvertToAPIColorScheme(telnetRemoteConfigDBModel.getColorScheme()), 0, 8, (k) null);
        String content = telnetRemoteConfigDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(TelnetConfigContent.Companion.serializer(), telnetConfigContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new TelnetConfigBulkV5(strC, Long.valueOf(telnetRemoteConfigDBModel.getIdInDatabase()), prepareIdOnServer(telnetRemoteConfigDBModel.getIdOnServer()), telnetRemoteConfigDBModel.getUpdatedAtTime(), telnetRemoteConfigDBModel.getVaultKeyId().getId());
    }
}
