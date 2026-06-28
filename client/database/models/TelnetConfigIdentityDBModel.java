package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.ConfigIdentityDbModelInterface;
import ju.t;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class TelnetConfigIdentityDBModel extends SyncableModel implements ConfigIdentityDbModelInterface {
    public static final int $stable = 8;
    private long identityId;
    private long telnetConfigId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelnetConfigIdentityDBModel(long j10, long j11, long j12, String str, int i10) {
        super(j12, str, i10);
        t.f(str, "updatedAt");
        this.telnetConfigId = j10;
        this.identityId = j11;
    }

    public final long getIdentityId() {
        return this.identityId;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.ConfigIdentityDbModelInterface
    public long getIdentityIdOfConfig() {
        return this.identityId;
    }

    public final long getTelnetConfigId() {
        return this.telnetConfigId;
    }

    public final void setIdentityId(long j10) {
        this.identityId = j10;
    }

    public final void setTelnetConfigId(long j10) {
        this.telnetConfigId = j10;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        t.f(sVar, "cryptor");
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.TELNET_CONFIG_ID, Long.valueOf(this.telnetConfigId));
        contentValues.put(Column.IDENTITY_ID, Long.valueOf(this.identityId));
        t.c(contentValues);
        return contentValues;
    }

    public TelnetConfigIdentityDBModel(long j10, long j11) {
        super(-1L, null, 1);
        this.telnetConfigId = j10;
        this.identityId = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelnetConfigIdentityDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        t.f(cursor, "cursor");
        t.f(sVar, "cryptor");
        int columnIndex = cursor.getColumnIndex(Column.TELNET_CONFIG_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.IDENTITY_ID);
        this.telnetConfigId = cursor.getLong(columnIndex);
        this.identityId = cursor.getLong(columnIndex2);
    }
}
