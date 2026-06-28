package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.identity.CertificateBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.CertificateBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.identity.CertificateBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.certificates.CertificateContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class CertificateBulkCreator extends BaseBulkApiCreator<CertificateBulk, CertificateBulkV3, CertificateBulkV5, SshCertificateDBModel> {
    private static final String emptyLabel = "";
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
    public CertificateBulkCreator(SshKeyDBAdapter sshKeyDBAdapter, a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.sshKeyDBAdapter = sshKeyDBAdapter;
        this.contentPatcher = contentPatcher;
    }

    private final boolean isNotEmptyServerId(Long l10) {
        return l10 == null || -1 != l10.longValue();
    }

    private final Object prepareSshKeyId(Long l10) {
        if (l10 == null) {
            return null;
        }
        SshKeyDBModel itemByLocalId = this.sshKeyDBAdapter.getItemByLocalId(l10.longValue());
        Long lValueOf = itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null;
        if (isNotEmptyServerId(lValueOf)) {
            return lValueOf;
        }
        return sshKeyPrefix + l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public CertificateBulkV3 createV3(SshCertificateDBModel sshCertificateDBModel) {
        t.f(sshCertificateDBModel, "dbModel");
        return new CertificateBulkV3(sshCertificateDBModel.getMaterial(), prepareSshKeyId(Long.valueOf(sshCertificateDBModel.getKeyId())), Long.valueOf(sshCertificateDBModel.getIdInDatabase()), prepareIdOnServer(sshCertificateDBModel.getIdOnServer()), sshCertificateDBModel.getUpdatedAtTime(), sshCertificateDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public CertificateBulkV5 createV5(SshCertificateDBModel sshCertificateDBModel) throws JSONException {
        t.f(sshCertificateDBModel, "dbModel");
        CertificateContent certificateContent = new CertificateContent(sshCertificateDBModel.getMaterial(), "", 0, 4, (k) null);
        String content = sshCertificateDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(CertificateContent.Companion.serializer(), certificateContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new CertificateBulkV5(strC, prepareSshKeyId(Long.valueOf(sshCertificateDBModel.getKeyId())), Long.valueOf(sshCertificateDBModel.getIdInDatabase()), prepareIdOnServer(sshCertificateDBModel.getIdOnServer()), sshCertificateDBModel.getUpdatedAtTime(), sshCertificateDBModel.getVaultKeyId().getId());
    }
}
