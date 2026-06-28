package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.VaultKeyIdDbConverter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class IdentityDBAdapter extends DbAdapterAbstract<IdentityDBModel> {
    private static final String APP_VIEW = "identity_app";
    private static final String TABLE = "identity";

    public IdentityDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public Identity getApplicationModel(long j10) {
        Identity identity;
        SshKeyDBModel sshKeyDBModel;
        Cursor cursorQuery = this.mContentResolver.query(ContentUris.withAppendedId(getViewContentUri("identity_app"), j10), null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        int columnIndex = cursorQuery.getColumnIndex("title");
        int columnIndex2 = cursorQuery.getColumnIndex("password");
        int columnIndex3 = cursorQuery.getColumnIndex("username");
        int columnIndex4 = cursorQuery.getColumnIndex(Column.SSH_KEY_ID);
        int columnIndex5 = cursorQuery.getColumnIndex(Column.KEY_PRIVATE);
        int columnIndex6 = cursorQuery.getColumnIndex(Column.PASS_PHRASE);
        int columnIndex7 = cursorQuery.getColumnIndex(Column.SSH_KEY_TITLE);
        int columnIndex8 = cursorQuery.getColumnIndex(Column.IS_VISIBLE);
        int columnIndex9 = cursorQuery.getColumnIndex(Column.IS_SHARED);
        int columnIndex10 = cursorQuery.getColumnIndex(Column.SSH_ID_MODE);
        if (cursorQuery.moveToFirst()) {
            String string = cursorQuery.getString(columnIndex3);
            String strB = this.localCryptor.b(cursorQuery.getString(columnIndex2));
            String string2 = cursorQuery.getString(columnIndex);
            boolean z10 = false;
            boolean z11 = 1 == cursorQuery.getInt(columnIndex8);
            if (!cursorQuery.isNull(columnIndex9) && cursorQuery.getInt(columnIndex9) == 1) {
                z10 = true;
            }
            VaultKeyId vaultKeyId = new VaultKeyIdDbConverter().toVaultKeyId(cursorQuery);
            String string3 = cursorQuery.getString(columnIndex10);
            if (cursorQuery.isNull(columnIndex4)) {
                sshKeyDBModel = null;
            } else {
                SshKeyDBModel sshKeyDBModel2 = new SshKeyDBModel(cursorQuery.getString(columnIndex7), this.localCryptor.b(cursorQuery.getString(columnIndex6)), this.localCryptor.b(cursorQuery.getString(columnIndex5)), "");
                sshKeyDBModel2.setIdInDatabase(cursorQuery.getLong(columnIndex4));
                sshKeyDBModel = sshKeyDBModel2;
            }
            Identity identity2 = new Identity(string2, string, strB, sshKeyDBModel, j10, z11, vaultKeyId, string3);
            identity2.setShared(z10);
            identity = identity2;
        } else {
            identity = null;
        }
        cursorQuery.close();
        return identity;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.server.auditor.ssh.client.models.Identity> getItemsForBaseAdapter() {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter.getItemsForBaseAdapter():java.util.List");
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "identity";
    }

    public int getVisibleItemsCountWhichNotDeleted() {
        return getItemCount(String.format("%s!=%s and %s==1", Column.STATUS, 2, Column.IS_VISIBLE));
    }

    public List<IdentityDBModel> listItemsBySshKeyId(Long l10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status != 2 AND ssh_key_id = " + l10.toString(), null, null);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            do {
                arrayList.add(new IdentityDBModel(cursorQuery, this.localCryptor));
            } while (cursorQuery.moveToNext());
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public int resetSshIdModeForPersonalEntities() {
        ContentValues contentValues = new ContentValues();
        contentValues.putNull(Column.SSH_ID_MODE);
        contentValues.put(Column.STATUS, (Integer) 1);
        return this.mContentResolver.update(getContentUri(), contentValues, String.format("%s IS NOT NULL AND (%s IS NULL OR %s = 0) AND %s != %s", Column.SSH_ID_MODE, "encrypted_with", "encrypted_with", Column.STATUS, 2), null);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public IdentityDBModel createItemFromCursor(Cursor cursor) {
        return new IdentityDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public IdentityDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        IdentityDBModel sshIdentityModelWithExternalReferences = IdentityDBModel.getSshIdentityModelWithExternalReferences(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.IDENTITY, sshIdentityModelWithExternalReferences.getIdOnServer());
        }
        return sshIdentityModelWithExternalReferences;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract, com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public IdentityDBModel getItemByLocalId(long j10) {
        Cursor cursorQuery = this.mContentResolver.query(ContentUris.withAppendedId(getContentUri(), j10), null, null, null, null);
        IdentityDBModel identityDBModelCreateItemFromCursor = (cursorQuery == null || !cursorQuery.moveToFirst()) ? null : createItemFromCursor(cursorQuery);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return identityDBModelCreateItemFromCursor;
    }
}
