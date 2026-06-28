package com.server.auditor.ssh.client.database;

import android.database.Cursor;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class VaultKeyIdDbConverter {
    public static final int $stable = 0;

    public final Long fromVaultKeyId(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "vaultKeyId");
        return vaultKeyId.getId();
    }

    public final VaultKeyId toVaultKeyId(Cursor cursor) {
        t.f(cursor, "cursor");
        int columnIndex = cursor.getColumnIndex("encrypted_with");
        return com.server.auditor.ssh.client.ui.vaults.data.a.d(cursor.isNull(columnIndex) ? null : Long.valueOf(cursor.getLong(columnIndex)));
    }
}
