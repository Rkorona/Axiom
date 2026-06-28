package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.config.LocalConfigDBModel;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class LocalConfigDBAdapter extends DbAdapterAbstract<LocalConfigDBModel> {
    public LocalConfigDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    public List<LocalConfigDBModel> getItemListWhichNotDeleted() {
        return getItemList(null);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "local_config";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public LocalConfigDBModel createItemFromCursor(Cursor cursor) {
        return new LocalConfigDBModel(cursor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public LocalConfigDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        return new LocalConfigDBModel(cursor);
    }
}
