package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityBulk;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedTelnetConfigIdentityBulkCreator extends BaseBulkApiCreator<SharedTelnetConfigIdentityBulk, SharedTelnetConfigIdentityBulk, SharedTelnetConfigIdentityBulk, SharedTelnetConfigIdentityDBModel> {
    private static final String identityIdPrefix = "identity_set/";
    private static final String telnetConfigIdPrefix = "telnetconfig_set/";
    private final IdentityDBAdapter identityDBAdapter;
    private final TelnetConfigDBAdapter telnetConfigDBAdapter;
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
    public SharedTelnetConfigIdentityBulkCreator(TelnetConfigDBAdapter telnetConfigDBAdapter, IdentityDBAdapter identityDBAdapter, a aVar, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
    }

    private final SharedTelnetConfigIdentityBulk create(SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel) {
        return new SharedTelnetConfigIdentityBulk(prepareIdentityId(Long.valueOf(sharedTelnetConfigIdentityDBModel.getIdentityId())), prepareTelnetConfigId(Long.valueOf(sharedTelnetConfigIdentityDBModel.getTelnetConfigId())), Long.valueOf(sharedTelnetConfigIdentityDBModel.getIdInDatabase()), prepareIdOnServer(sharedTelnetConfigIdentityDBModel.getIdOnServer()), sharedTelnetConfigIdentityDBModel.getUpdatedAtTime(), sharedTelnetConfigIdentityDBModel.getVaultKeyId().getId());
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

    private final Object prepareTelnetConfigId(Long l10) {
        if (l10 == null) {
            return null;
        }
        TelnetRemoteConfigDBModel itemByLocalId = this.telnetConfigDBAdapter.getItemByLocalId(l10.longValue());
        Long lValueOf = itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null;
        if (isNotEmptyServerId(lValueOf)) {
            return lValueOf;
        }
        return telnetConfigIdPrefix + l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SharedTelnetConfigIdentityBulk createV3(SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel) {
        t.f(sharedTelnetConfigIdentityDBModel, "dbModel");
        return create(sharedTelnetConfigIdentityDBModel);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SharedTelnetConfigIdentityBulk createV5(SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel) {
        t.f(sharedTelnetConfigIdentityDBModel, "dbModel");
        return create(sharedTelnetConfigIdentityDBModel);
    }
}
