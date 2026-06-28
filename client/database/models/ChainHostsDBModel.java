package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import hg.f;
import java.util.ArrayList;
import rg.s;
import tp.h;

/* JADX INFO: loaded from: classes3.dex */
public class ChainHostsDBModel extends SyncableModel {
    private String mChainingHosts;
    private long mSshConfigId;

    public ChainHostsDBModel(long j10, String str, long j11, String str2, int i10) {
        super(j11, str2, i10);
        this.mSshConfigId = j10;
        this.mChainingHosts = str;
    }

    public static ChainHostsDBModel getChainHostDBModelWithExternalReferences(Cursor cursor, s sVar) {
        ChainHostsDBModel chainHostsDBModel = new ChainHostsDBModel(cursor, sVar);
        SshRemoteConfigDBModel itemByLocalId = f.p().S().getItemByLocalId(chainHostsDBModel.getSshConfigId());
        if (itemByLocalId != null) {
            long j10 = itemByLocalId.mIdOnServer;
            if (j10 != -1) {
                chainHostsDBModel.mSshConfigId = j10;
            }
        }
        ArrayList<Long> arrayListD = h.d(chainHostsDBModel.mChainingHosts);
        ArrayList arrayList = new ArrayList();
        for (Long l10 : arrayListD) {
            HostDBModel itemByLocalId2 = f.p().i().getItemByLocalId(l10.longValue());
            if (itemByLocalId2 != null) {
                long j11 = itemByLocalId2.mIdOnServer;
                if (j11 != -1) {
                    arrayList.add(Long.valueOf(j11));
                }
            }
            arrayList.add(l10);
        }
        chainHostsDBModel.mChainingHosts = h.b(arrayList);
        return chainHostsDBModel;
    }

    public String getChainigHosts() {
        return this.mChainingHosts;
    }

    public long getSshConfigId() {
        return this.mSshConfigId;
    }

    public void setChainigHosts(String str) {
        this.mChainingHosts = str;
    }

    public void setSshConfigId(long j10) {
        this.mSshConfigId = j10;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.SSH_CONFIG_ID, Long.valueOf(this.mSshConfigId));
        contentValues.put(Column.CHAINING_HOSTS, this.mChainingHosts);
        return contentValues;
    }

    public ChainHostsDBModel(long j10, String str) {
        this.mSshConfigId = j10;
        this.mChainingHosts = str;
    }

    public ChainHostsDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        int columnIndex = cursor.getColumnIndex(Column.SSH_CONFIG_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.CHAINING_HOSTS);
        this.mSshConfigId = cursor.getLong(columnIndex);
        this.mChainingHosts = cursor.getString(columnIndex2);
    }
}
