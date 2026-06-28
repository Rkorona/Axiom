package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.List;
import java.util.Objects;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class TagHostDBAdapter extends DbAdapterAbstract<TagHostDBModel> {
    private static final String TABLE = "tag_host";

    public TagHostDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    private void createTagHostModel(Long l10, Long l11, VaultKeyId vaultKeyId) {
        TagHostDBModel tagHostDBModel = new TagHostDBModel(l10.longValue(), l11.longValue());
        tagHostDBModel.setVaultKeyId(vaultKeyId);
        tagHostDBModel.setShared(!com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId));
        tagHostDBModel.setIdInDatabase(add(tagHostDBModel));
    }

    public TagHostDBModel getItem(String str) {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, str, null, null);
        TagHostDBModel tagHostDBModelCreateItemFromCursor = cursorQuery.moveToFirst() ? createItemFromCursor(cursorQuery) : null;
        cursorQuery.close();
        return tagHostDBModelCreateItemFromCursor;
    }

    public void getOrCreate(long j10, List<TagDBModel> list, VaultKeyId vaultKeyId) {
        for (TagDBModel tagDBModel : list) {
            if (getTagHostByParameters(Long.valueOf(tagDBModel.getIdInDatabase()), Long.valueOf(j10), vaultKeyId) == null) {
                createTagHostModel(Long.valueOf(tagDBModel.getIdInDatabase()), Long.valueOf(j10), vaultKeyId);
            }
        }
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "tag_host";
    }

    public TagHostDBModel getTagHostByParameters(Long l10, Long l11, VaultKeyId vaultKeyId) {
        for (TagHostDBModel tagHostDBModel : getItemListWhichNotDeleted()) {
            if (Long.valueOf(tagHostDBModel.getTagId()).equals(l10) && Long.valueOf(tagHostDBModel.getHostId()).equals(l11) && Objects.equals(tagHostDBModel.getVaultKeyId(), vaultKeyId)) {
                return tagHostDBModel;
            }
        }
        return null;
    }

    public List<TagHostDBModel> getTagHostsByHostId(long j10) {
        return getItemList(String.format("%s=%s", Column.HOST_ID, Long.valueOf(j10)));
    }

    public List<TagHostDBModel> getTagHostsByHostIdWhichNotDeleted(long j10) {
        return getItemList(String.format("%s=%s AND %s!=%s", Column.HOST_ID, Long.valueOf(j10), Column.STATUS, 2));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public TagHostDBModel createItemFromCursor(Cursor cursor) {
        return new TagHostDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public TagHostDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        return TagHostDBModel.getTagHostDBModelWithExternalReferences(cursor, this.localCryptor);
    }
}
