package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class HostsDBAdapter extends DbAdapterAbstract<HostDBModel> {
    public static String TABLE = "hosts";

    public HostsDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public HostDBModel getHostBySshConfigId(Long l10) {
        for (HostDBModel hostDBModel : getItemListWhichNotDeleted()) {
            if (l10.equals(hostDBModel.getSshConfigId())) {
                return hostDBModel;
            }
        }
        return null;
    }

    public HostDBModel getHostByTelnetConfigId(Long l10) {
        for (HostDBModel hostDBModel : getItemListWhichNotDeleted()) {
            if (l10.equals(hostDBModel.getTelnetConfigId())) {
                return hostDBModel;
            }
        }
        return null;
    }

    public int getItemsCountWhichNotDeleted(long j10) {
        return getItemCount(String.format("%s=%s and %s!=%s", Column.GROUP_ID, Long.valueOf(j10), Column.STATUS, 2));
    }

    public List<HostDBModel> getItemsListByGroupId(long j10) {
        return getItemList(String.format("%s=%s", Column.GROUP_ID, Long.valueOf(j10)));
    }

    public int getRemoteOnlyItemsCountWhichNotDeleted() {
        return getItemCount(String.format("%s!=%s and %s is null", Column.STATUS, 2, Column.LOCAL_CONFIG_ID));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return TABLE;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public HostDBModel createItemFromCursor(Cursor cursor) {
        return new HostDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public HostDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        HostDBModel hostDBModelWithExternalReferences = HostDBModel.getHostDBModelWithExternalReferences(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.HOST, hostDBModelWithExternalReferences.getIdOnServer());
        }
        return hostDBModelWithExternalReferences;
    }
}
