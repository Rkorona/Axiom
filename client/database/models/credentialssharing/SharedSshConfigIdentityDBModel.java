package com.server.auditor.ssh.client.database.models.credentialssharing;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.ConfigIdentityDbModelInterface;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import ju.t;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class SharedSshConfigIdentityDBModel extends SyncableModel implements ConfigIdentityDbModelInterface {
    public static final int $stable = 8;
    private long identityId;
    private long sshConfigId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSshConfigIdentityDBModel(long j10, long j11, long j12, String str, int i10) {
        super(j12, str, i10, Boolean.TRUE);
        t.f(str, "updatedAt");
        this.sshConfigId = j10;
        this.identityId = j11;
    }

    public final long getIdentityId() {
        return this.identityId;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.ConfigIdentityDbModelInterface
    public long getIdentityIdOfConfig() {
        return this.identityId;
    }

    public final long getSshConfigId() {
        return this.sshConfigId;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel
    public boolean isShared() {
        return true;
    }

    public final void setIdentityId(long j10) {
        this.identityId = j10;
    }

    public final void setSshConfigId(long j10) {
        this.sshConfigId = j10;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        t.f(sVar, "cryptor");
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.IS_SHARED, Boolean.valueOf(isShared()));
        contentValues.put(Column.SSH_CONFIG_ID, Long.valueOf(this.sshConfigId));
        contentValues.put(Column.IDENTITY_ID, Long.valueOf(this.identityId));
        t.c(contentValues);
        return contentValues;
    }

    public SharedSshConfigIdentityDBModel(long j10, long j11) {
        super(-1L, null, 1, Boolean.TRUE);
        this.sshConfigId = j10;
        this.identityId = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSshConfigIdentityDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        t.f(cursor, "cursor");
        t.f(sVar, "cryptor");
        this.isShared = Boolean.TRUE;
        int columnIndex = cursor.getColumnIndex(Column.SSH_CONFIG_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.IDENTITY_ID);
        this.sshConfigId = cursor.getLong(columnIndex);
        this.identityId = cursor.getLong(columnIndex2);
    }
}
