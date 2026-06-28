package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedSshConfigIdentityBulkCreator extends BaseBulkApiCreator<SharedSshConfigIdentityBulk, SharedSshConfigIdentityBulk, SharedSshConfigIdentityBulk, SharedSshConfigIdentityDBModel> {
    private static final String identityIdPrefix = "identity_set/";
    private static final String sshConfigIdPrefix = "sshconfig_set/";
    private final IdentityDBAdapter identityDBAdapter;
    private final SshConfigDBAdapter sshConfigDBAdapter;
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
    public SharedSshConfigIdentityBulkCreator(SshConfigDBAdapter sshConfigDBAdapter, IdentityDBAdapter identityDBAdapter, a aVar, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
    }

    private final boolean isNotEmptyServerId(Long l10) {
        return l10 == null || -1 != l10.longValue();
    }

    private final Object prepareIdentityId(Long l10) {
        if (l10 == null) {
            return null;
        }
        IdentityDBModel itemByLocalId = this.identityDBAdapter.getItemByLocalId(l10.longValue());
        Long lValueOf = itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null;
        if (isNotEmptyServerId(lValueOf)) {
            return lValueOf;
        }
        return identityIdPrefix + l10;
    }

    private final Object prepareSshConfigId(Long l10) {
        if (l10 == null) {
            return null;
        }
        SshRemoteConfigDBModel itemByLocalId = this.sshConfigDBAdapter.getItemByLocalId(l10.longValue());
        Long lValueOf = itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null;
        if (isNotEmptyServerId(lValueOf)) {
            return lValueOf;
        }
        return sshConfigIdPrefix + l10;
    }

    public final SharedSshConfigIdentityBulk create(SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel) {
        t.f(sharedSshConfigIdentityDBModel, "dbModel");
        return new SharedSshConfigIdentityBulk(prepareIdentityId(Long.valueOf(sharedSshConfigIdentityDBModel.getIdentityId())), prepareSshConfigId(Long.valueOf(sharedSshConfigIdentityDBModel.getSshConfigId())), Long.valueOf(sharedSshConfigIdentityDBModel.getIdInDatabase()), prepareIdOnServer(sharedSshConfigIdentityDBModel.getIdOnServer()), sharedSshConfigIdentityDBModel.getUpdatedAtTime(), sharedSshConfigIdentityDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SharedSshConfigIdentityBulk createV3(SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel) {
        t.f(sharedSshConfigIdentityDBModel, "dbModel");
        return create(sharedSshConfigIdentityDBModel);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SharedSshConfigIdentityBulk createV5(SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel) {
        t.f(sharedSshConfigIdentityDBModel, "dbModel");
        return create(sharedSshConfigIdentityDBModel);
    }
}
