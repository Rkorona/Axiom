package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import java.util.Iterator;
import java.util.List;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(List list, VaultKeyId vaultKeyId) {
        t.f(list, "<this>");
        t.f(vaultKeyId, "vaultKeyId");
        if (list.isEmpty()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!t.b(((IVaultKeyIdHolder) it.next()).getVaultKeyId(), vaultKeyId)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "<this>");
        return t.b(vaultKeyId, VaultKeyId.Companion.a());
    }

    public static final boolean c(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "<this>");
        return t.b(vaultKeyId, VaultKeyId.Companion.b());
    }

    public static final VaultKeyId d(Long l10) {
        return l10 == null ? VaultKeyId.Companion.a() : new VaultKeyId(l10);
    }

    public static final VaultKeyIdSpecification e(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "<this>");
        return new VaultKeyIdSpecification.Specified(vaultKeyId);
    }
}
