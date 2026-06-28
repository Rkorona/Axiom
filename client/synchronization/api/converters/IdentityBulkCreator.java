package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.identity.IdentityContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class IdentityBulkCreator extends BaseBulkApiCreator<IdentityBulk, IdentityBulkV3, IdentityBulkV5, IdentityDBModel> {
    private static final String sshKeyPrefix = "sshkeycrypt_set/";
    private final ContentPatcher contentPatcher;
    private final SshKeyDBAdapter sshKeyDBAdapter;
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
    public IdentityBulkCreator(SshKeyDBAdapter sshKeyDBAdapter, a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.sshKeyDBAdapter = sshKeyDBAdapter;
        this.contentPatcher = contentPatcher;
    }

    private final Object prepareSshKeyId(Long l10) {
        if (l10 == null) {
            return null;
        }
        SshKeyDBModel itemByRemoteId = this.sshKeyDBAdapter.getItemByRemoteId(l10.longValue());
        if (itemByRemoteId != null) {
            return Long.valueOf(itemByRemoteId.getIdOnServer());
        }
        return sshKeyPrefix + l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public IdentityBulkV3 createV3(IdentityDBModel identityDBModel) {
        t.f(identityDBModel, "dbModel");
        return new IdentityBulkV3(identityDBModel.getUsername(), identityDBModel.getTitle(), identityDBModel.getPassword(), Boolean.valueOf(identityDBModel.isVisible()), prepareSshKeyId(identityDBModel.getSshKeyId()), Long.valueOf(identityDBModel.getIdInDatabase()), prepareIdOnServer(identityDBModel.getIdOnServer()), identityDBModel.getUpdatedAtTime(), identityDBModel.getVaultKeyId().getId(), identityDBModel.getSshIdMode());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public IdentityBulkV5 createV5(IdentityDBModel identityDBModel) throws JSONException {
        t.f(identityDBModel, "dbModel");
        String username = identityDBModel.getUsername();
        String password = identityDBModel.getPassword();
        boolean zIsVisible = identityDBModel.isVisible();
        String title = identityDBModel.getTitle();
        t.e(title, "getTitle(...)");
        IdentityContent identityContent = new IdentityContent(username, password, zIsVisible, title, 0, 16, (k) null);
        String content = identityDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(IdentityContent.Companion.serializer(), identityContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new IdentityBulkV5(strC, prepareSshKeyId(identityDBModel.getSshKeyId()), Long.valueOf(identityDBModel.getIdInDatabase()), prepareIdOnServer(identityDBModel.getIdOnServer()), identityDBModel.getUpdatedAtTime(), identityDBModel.getVaultKeyId().getId(), identityDBModel.getSshIdMode());
    }
}
