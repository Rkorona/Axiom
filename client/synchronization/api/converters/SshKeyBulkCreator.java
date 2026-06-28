package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.key.SshKeyContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SshKeyBulkCreator extends BaseBulkApiCreator<SshKeyBulk, SshKeyBulkV3, SshKeyBulkV5, SshKeyDBModel> {
    public static final int $stable = 8;
    private final ContentPatcher contentPatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshKeyBulkCreator(a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.contentPatcher = contentPatcher;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SshKeyBulkV3 createV3(SshKeyDBModel sshKeyDBModel) {
        t.f(sshKeyDBModel, "dbModel");
        return new SshKeyBulkV3(sshKeyDBModel.getLabel(), sshKeyDBModel.getPassphrase(), sshKeyDBModel.getPrivateKey(), sshKeyDBModel.getPublicKey(), Long.valueOf(sshKeyDBModel.getIdInDatabase()), prepareIdOnServer(sshKeyDBModel.getIdOnServer()), sshKeyDBModel.getUpdatedAtTime(), sshKeyDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SshKeyBulkV5 createV5(SshKeyDBModel sshKeyDBModel) throws JSONException {
        t.f(sshKeyDBModel, "dbModel");
        String passphrase = sshKeyDBModel.getPassphrase();
        if (passphrase == null) {
            passphrase = "";
        }
        String privateKey = sshKeyDBModel.getPrivateKey();
        if (privateKey == null) {
            privateKey = "";
        }
        String publicKey = sshKeyDBModel.getPublicKey();
        if (publicKey == null) {
            publicKey = "";
        }
        String label = sshKeyDBModel.getLabel();
        if (label == null) {
            label = "";
        }
        SshKeyContent sshKeyContent = new SshKeyContent(passphrase, privateKey, publicKey, label, 0, 16, (k) null);
        String content = sshKeyDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(SshKeyContent.Companion.serializer(), sshKeyContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new SshKeyBulkV5(strC, Long.valueOf(sshKeyDBModel.getIdInDatabase()), prepareIdOnServer(sshKeyDBModel.getIdOnServer()), sshKeyDBModel.getUpdatedAtTime(), sshKeyDBModel.getVaultKeyId().getId());
    }
}
