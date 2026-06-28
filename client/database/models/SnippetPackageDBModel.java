package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import ju.k;
import ju.t;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class SnippetPackageDBModel extends SyncableModel {
    public static final int $stable = 8;
    private String label;

    public /* synthetic */ SnippetPackageDBModel(String str, boolean z10, VaultKeyId vaultKeyId, int i10, k kVar) {
        this(str, z10, (i10 & 4) != 0 ? VaultKeyId.Companion.a() : vaultKeyId);
    }

    public final String getLabel() {
        return this.label;
    }

    public final void setLabel(String str) {
        t.f(str, "<set-?>");
        this.label = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        t.f(sVar, "cryptor");
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put("label", this.label);
        contentValues.put(Column.IS_SHARED, this.isShared);
        t.c(contentValues);
        return contentValues;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetPackageDBModel(String str, boolean z10, VaultKeyId vaultKeyId) {
        super(-1L, null, 1);
        t.f(str, "label");
        t.f(vaultKeyId, "vaultKeyId");
        this.label = str;
        this.isShared = Boolean.valueOf(z10);
        this.vaultKeyId = vaultKeyId;
    }

    public /* synthetic */ SnippetPackageDBModel(String str, VaultKeyId vaultKeyId, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? VaultKeyId.Companion.a() : vaultKeyId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetPackageDBModel(String str, VaultKeyId vaultKeyId) {
        super(-1L, null, 1);
        t.f(str, "label");
        t.f(vaultKeyId, "vaultKeyId");
        this.label = str;
        this.vaultKeyId = vaultKeyId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetPackageDBModel(String str, boolean z10, long j10, String str2, int i10) {
        super(j10, str2, i10);
        t.f(str, "label");
        t.f(str2, "updatedAt");
        this.label = str;
        this.isShared = Boolean.valueOf(z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetPackageDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        t.f(cursor, "cursor");
        t.f(sVar, "cryptor");
        String string = cursor.getString(cursor.getColumnIndex("label"));
        t.e(string, "getString(...)");
        this.label = string;
    }
}
