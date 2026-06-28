package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk;
import iu.a;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SshConfigIdentityBulkCreator extends BaseBulkApiCreator<SshConfigIdentityBulk, SshConfigIdentityBulk, SshConfigIdentityBulk, SshConfigIdentityDBModel> {
    private static final String identityIdPrefix = "identity_set/";
    private static final String sshConfigIdPrefix = "sshconfig_set/";
    private final IdentityDBAdapter identityDBAdapter;
    private final a isIdentitySynced;
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
    public SshConfigIdentityBulkCreator(SshConfigDBAdapter sshConfigDBAdapter, IdentityDBAdapter identityDBAdapter, a aVar, com.server.auditor.ssh.client.app.a aVar2, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar2, iRelevantVaultKeyIdRepository);
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        t.f(aVar, "isIdentitySynced");
        t.f(aVar2, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
        this.isIdentitySynced = aVar;
    }

    private final SshConfigIdentityBulk create(SshConfigIdentityDBModel sshConfigIdentityDBModel) {
        return new SshConfigIdentityBulk(prepareIdentityId(Long.valueOf(sshConfigIdentityDBModel.getIdentityId())), prepareSshConfigId(Long.valueOf(sshConfigIdentityDBModel.getSshConfigId())), Long.valueOf(sshConfigIdentityDBModel.getIdInDatabase()), Long.valueOf(prepareIdOnServer(sshConfigIdentityDBModel.getIdOnServer())), sshConfigIdentityDBModel.getUpdatedAtTime(), sshConfigIdentityDBModel.getVaultKeyId().getId());
    }

    private final boolean isNotEmptyServerId(Long l10) {
        return l10 == null || -1 != l10.longValue();
    }

    private final Object prepareIdentityId(Long l10) {
        if (!((Boolean) this.isIdentitySynced.a()).booleanValue() || l10 == null) {
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

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SshConfigIdentityBulk createV3(SshConfigIdentityDBModel sshConfigIdentityDBModel) {
        t.f(sshConfigIdentityDBModel, "dbModel");
        return create(sshConfigIdentityDBModel);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SshConfigIdentityBulk createV5(SshConfigIdentityDBModel sshConfigIdentityDBModel) {
        t.f(sshConfigIdentityDBModel, "dbModel");
        return create(sshConfigIdentityDBModel);
    }
}
