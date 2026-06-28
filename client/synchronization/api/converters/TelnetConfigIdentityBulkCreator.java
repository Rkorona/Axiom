package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk;
import iu.a;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class TelnetConfigIdentityBulkCreator extends BaseBulkApiCreator<TelnetConfigIdentityBulk, TelnetConfigIdentityBulk, TelnetConfigIdentityBulk, TelnetConfigIdentityDBModel> {
    private static final String identityIdPrefix = "identity_set/";
    private static final String telnetConfigIdPrefix = "telnetconfig_set/";
    private final IdentityDBAdapter identityDBAdapter;
    private final a isIdentitySynced;
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
    public TelnetConfigIdentityBulkCreator(TelnetConfigDBAdapter telnetConfigDBAdapter, IdentityDBAdapter identityDBAdapter, a aVar, com.server.auditor.ssh.client.app.a aVar2, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar2, iRelevantVaultKeyIdRepository);
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        t.f(aVar, "isIdentitySynced");
        t.f(aVar2, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
        this.isIdentitySynced = aVar;
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

    public final TelnetConfigIdentityBulk create(TelnetConfigIdentityDBModel telnetConfigIdentityDBModel) {
        t.f(telnetConfigIdentityDBModel, "dbModel");
        return new TelnetConfigIdentityBulk(prepareIdentityId(Long.valueOf(telnetConfigIdentityDBModel.getIdentityId())), prepareTelnetConfigId(Long.valueOf(telnetConfigIdentityDBModel.getTelnetConfigId())), Long.valueOf(telnetConfigIdentityDBModel.getIdInDatabase()), Long.valueOf(prepareIdOnServer(telnetConfigIdentityDBModel.getIdOnServer())), telnetConfigIdentityDBModel.getUpdatedAtTime(), telnetConfigIdentityDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public TelnetConfigIdentityBulk createV3(TelnetConfigIdentityDBModel telnetConfigIdentityDBModel) {
        t.f(telnetConfigIdentityDBModel, "dbModel");
        return create(telnetConfigIdentityDBModel);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public TelnetConfigIdentityBulk createV5(TelnetConfigIdentityDBModel telnetConfigIdentityDBModel) {
        t.f(telnetConfigIdentityDBModel, "dbModel");
        return create(telnetConfigIdentityDBModel);
    }
}
