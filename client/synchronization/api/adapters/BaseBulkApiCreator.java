package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import ju.t;
import ut.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseBulkApiCreator<P, V3 extends P, V5 extends P, DB extends SyncableModel> implements BulkApiAdapter.BulkItemCreator<P, DB> {
    public static final int $stable = 8;
    private final IRelevantVaultKeyIdRepository relevantVaultKeyIdRepository;
    private final a termiusStorage;

    public BaseBulkApiCreator(a aVar, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        t.f(aVar, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.termiusStorage = aVar;
        this.relevantVaultKeyIdRepository = iRelevantVaultKeyIdRepository;
    }

    private final boolean isV5Enabled(boolean z10) {
        if (z10) {
            return this.termiusStorage.A0();
        }
        if (z10) {
            throw new s();
        }
        return this.termiusStorage.p0();
    }

    public abstract V3 createV3(DB db2);

    public abstract V5 createV5(DB db2);

    public final long prepareIdOnServer(long j10) {
        if (j10 == -1) {
            return 0L;
        }
        return j10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter.BulkItemCreator
    public final P createItem(DB db2) {
        t.f(db2, "dbModel");
        IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository = this.relevantVaultKeyIdRepository;
        boolean zIsShared = db2.isShared();
        VaultKeyId vaultKeyId = db2.getVaultKeyId();
        t.e(vaultKeyId, "<get-vaultKeyId>(...)");
        db2.setVaultKeyId(iRelevantVaultKeyIdRepository.getRelevantVaultKeyId(zIsShared, vaultKeyId));
        return isV5Enabled(db2.isShared()) ? (P) createV5(db2) : (P) createV3(db2);
    }
}
