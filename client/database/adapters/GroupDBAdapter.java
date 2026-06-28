package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class GroupDBAdapter extends DbAdapterAbstract<GroupDBModel> {
    private static final String TABLE = "group_t";

    public GroupDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public List<GroupDBModel> getItemsListByGroupId(Long l10) {
        return l10 == null ? getItemList(String.format("%s is NULL", Column.PARENT_GROUP_ID)) : getItemList(String.format("%s=%s", Column.PARENT_GROUP_ID, l10));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "group_t";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public GroupDBModel createItemFromCursor(Cursor cursor) {
        return new GroupDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public GroupDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        GroupDBModel groupDBModelWithExternalReferences = GroupDBModel.getGroupDBModelWithExternalReferences(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.GROUP, groupDBModelWithExternalReferences.getIdOnServer());
        }
        return groupDBModelWithExternalReferences;
    }
}
