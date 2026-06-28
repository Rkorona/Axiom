package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import ju.t;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class SshCertificateDBModel extends SyncableModel {
    public static final int $stable = 8;
    private long keyId;
    private String material;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshCertificateDBModel(String str, long j10, boolean z10) {
        super(-1L, null, 1);
        t.f(str, Column.CERTIFICATE_MATERIAL);
        this.material = str;
        this.keyId = j10;
        this.isShared = Boolean.valueOf(z10);
    }

    public final long getKeyId() {
        return this.keyId;
    }

    public final String getMaterial() {
        return this.material;
    }

    public final void setKeyId(long j10) {
        this.keyId = j10;
    }

    public final void setMaterial(String str) {
        t.f(str, "<set-?>");
        this.material = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        t.f(sVar, "cryptor");
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.CERTIFICATE_MATERIAL, sVar.a(this.material));
        contentValues.put(Column.SSH_KEY_ID, Long.valueOf(this.keyId));
        t.c(contentValues);
        return contentValues;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshCertificateDBModel(String str, long j10, boolean z10, long j11, String str2, int i10) {
        super(j11, str2, i10);
        t.f(str, Column.CERTIFICATE_MATERIAL);
        t.f(str2, "updatedAt");
        this.material = str;
        this.keyId = j10;
        this.isShared = Boolean.valueOf(z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshCertificateDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        t.f(cursor, "cursor");
        t.f(sVar, "cryptor");
        String strB = sVar.b(cursor.getString(cursor.getColumnIndex(Column.CERTIFICATE_MATERIAL)));
        t.e(strB, "decrypt(...)");
        this.material = strB;
        this.keyId = cursor.getLong(cursor.getColumnIndex(Column.SSH_KEY_ID));
    }
}
