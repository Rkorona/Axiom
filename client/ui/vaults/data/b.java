package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import ju.t;
import ut.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final VaultKeyId a(VaultKeyIdSpecification vaultKeyIdSpecification) {
        t.f(vaultKeyIdSpecification, "<this>");
        if (vaultKeyIdSpecification instanceof VaultKeyIdSpecification.NotSpecified) {
            return null;
        }
        if (vaultKeyIdSpecification instanceof VaultKeyIdSpecification.Specified) {
            return ((VaultKeyIdSpecification.Specified) vaultKeyIdSpecification).getVaultKeyId();
        }
        throw new s();
    }

    public static final boolean b(VaultKeyIdSpecification vaultKeyIdSpecification) {
        t.f(vaultKeyIdSpecification, "<this>");
        return vaultKeyIdSpecification instanceof VaultKeyIdSpecification.NotSpecified;
    }
}
