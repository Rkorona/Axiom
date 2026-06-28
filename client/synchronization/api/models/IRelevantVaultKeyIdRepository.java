package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;

/* JADX INFO: loaded from: classes4.dex */
public interface IRelevantVaultKeyIdRepository {
    VaultKeyId getRelevantVaultKeyId(boolean z10, VaultKeyId vaultKeyId);
}
