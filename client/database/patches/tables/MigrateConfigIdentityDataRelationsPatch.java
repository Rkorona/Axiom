package com.server.auditor.ssh.client.database.patches.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import su.s;

/* JADX INFO: loaded from: classes3.dex */
public final class MigrateConfigIdentityDataRelationsPatch extends AbsPatch {
    private static final long FAILED_INSERT = -1;
    private static final Integer NUL_IDENTITY_ID = null;
    private static final int STATUS_DELETED = 2;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class ConfigIdentityMigrationException extends RuntimeException {
        public static final int $stable = 8;
    }

    public static final class Identity {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f23543id;
        private final boolean isShared;
        private final int status;
        private final String updatedAt;

        public Identity(long j10, int i10, String str, boolean z10) {
            this.f23543id = j10;
            this.status = i10;
            this.updatedAt = str;
            this.isShared = z10;
        }

        public static /* synthetic */ Identity copy$default(Identity identity, long j10, int i10, String str, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j10 = identity.f23543id;
            }
            long j11 = j10;
            if ((i11 & 2) != 0) {
                i10 = identity.status;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                str = identity.updatedAt;
            }
            String str2 = str;
            if ((i11 & 8) != 0) {
                z10 = identity.isShared;
            }
            return identity.copy(j11, i12, str2, z10);
        }

        public final long component1() {
            return this.f23543id;
        }

        public final int component2() {
            return this.status;
        }

        public final String component3() {
            return this.updatedAt;
        }

        public final boolean component4() {
            return this.isShared;
        }

        public final Identity copy(long j10, int i10, String str, boolean z10) {
            return new Identity(j10, i10, str, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Identity)) {
                return false;
            }
            Identity identity = (Identity) obj;
            return this.f23543id == identity.f23543id && this.status == identity.status && t.b(this.updatedAt, identity.updatedAt) && this.isShared == identity.isShared;
        }

        public final long getId() {
            return this.f23543id;
        }

        public final int getStatus() {
            return this.status;
        }

        public final String getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.f23543id) * 31) + Integer.hashCode(this.status)) * 31;
            String str = this.updatedAt;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isShared);
        }

        public final boolean isShared() {
            return this.isShared;
        }

        public String toString() {
            return "Identity(id=" + this.f23543id + ", status=" + this.status + ", updatedAt=" + this.updatedAt + ", isShared=" + this.isShared + ")";
        }
    }

    public static final class SshConfig {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f23544id;
        private final Long identityId;
        private final boolean isShared;
        private final Long remoteId;
        private final int status;
        private final String updatedAt;

        public SshConfig(long j10, Long l10, Long l11, int i10, String str, boolean z10) {
            this.f23544id = j10;
            this.remoteId = l10;
            this.identityId = l11;
            this.status = i10;
            this.updatedAt = str;
            this.isShared = z10;
        }

        public static /* synthetic */ SshConfig copy$default(SshConfig sshConfig, long j10, Long l10, Long l11, int i10, String str, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j10 = sshConfig.f23544id;
            }
            long j11 = j10;
            if ((i11 & 2) != 0) {
                l10 = sshConfig.remoteId;
            }
            Long l12 = l10;
            if ((i11 & 4) != 0) {
                l11 = sshConfig.identityId;
            }
            Long l13 = l11;
            if ((i11 & 8) != 0) {
                i10 = sshConfig.status;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                str = sshConfig.updatedAt;
            }
            String str2 = str;
            if ((i11 & 32) != 0) {
                z10 = sshConfig.isShared;
            }
            return sshConfig.copy(j11, l12, l13, i12, str2, z10);
        }

        public final long component1() {
            return this.f23544id;
        }

        public final Long component2() {
            return this.remoteId;
        }

        public final Long component3() {
            return this.identityId;
        }

        public final int component4() {
            return this.status;
        }

        public final String component5() {
            return this.updatedAt;
        }

        public final boolean component6() {
            return this.isShared;
        }

        public final SshConfig copy(long j10, Long l10, Long l11, int i10, String str, boolean z10) {
            return new SshConfig(j10, l10, l11, i10, str, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SshConfig)) {
                return false;
            }
            SshConfig sshConfig = (SshConfig) obj;
            return this.f23544id == sshConfig.f23544id && t.b(this.remoteId, sshConfig.remoteId) && t.b(this.identityId, sshConfig.identityId) && this.status == sshConfig.status && t.b(this.updatedAt, sshConfig.updatedAt) && this.isShared == sshConfig.isShared;
        }

        public final long getId() {
            return this.f23544id;
        }

        public final Long getIdentityId() {
            return this.identityId;
        }

        public final Long getRemoteId() {
            return this.remoteId;
        }

        public final int getStatus() {
            return this.status;
        }

        public final String getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f23544id) * 31;
            Long l10 = this.remoteId;
            int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.identityId;
            int iHashCode3 = (((iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31) + Integer.hashCode(this.status)) * 31;
            String str = this.updatedAt;
            return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isShared);
        }

        public final boolean isShared() {
            return this.isShared;
        }

        public String toString() {
            return "SshConfig(id=" + this.f23544id + ", remoteId=" + this.remoteId + ", identityId=" + this.identityId + ", status=" + this.status + ", updatedAt=" + this.updatedAt + ", isShared=" + this.isShared + ")";
        }
    }

    public static final class TelnetConfig {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f23545id;
        private final Long identityId;
        private final boolean isShared;
        private final Long remoteId;
        private final int status;
        private final String updatedAt;

        public TelnetConfig(long j10, Long l10, Long l11, int i10, String str, boolean z10) {
            this.f23545id = j10;
            this.remoteId = l10;
            this.identityId = l11;
            this.status = i10;
            this.updatedAt = str;
            this.isShared = z10;
        }

        public static /* synthetic */ TelnetConfig copy$default(TelnetConfig telnetConfig, long j10, Long l10, Long l11, int i10, String str, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j10 = telnetConfig.f23545id;
            }
            long j11 = j10;
            if ((i11 & 2) != 0) {
                l10 = telnetConfig.remoteId;
            }
            Long l12 = l10;
            if ((i11 & 4) != 0) {
                l11 = telnetConfig.identityId;
            }
            Long l13 = l11;
            if ((i11 & 8) != 0) {
                i10 = telnetConfig.status;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                str = telnetConfig.updatedAt;
            }
            String str2 = str;
            if ((i11 & 32) != 0) {
                z10 = telnetConfig.isShared;
            }
            return telnetConfig.copy(j11, l12, l13, i12, str2, z10);
        }

        public final long component1() {
            return this.f23545id;
        }

        public final Long component2() {
            return this.remoteId;
        }

        public final Long component3() {
            return this.identityId;
        }

        public final int component4() {
            return this.status;
        }

        public final String component5() {
            return this.updatedAt;
        }

        public final boolean component6() {
            return this.isShared;
        }

        public final TelnetConfig copy(long j10, Long l10, Long l11, int i10, String str, boolean z10) {
            return new TelnetConfig(j10, l10, l11, i10, str, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TelnetConfig)) {
                return false;
            }
            TelnetConfig telnetConfig = (TelnetConfig) obj;
            return this.f23545id == telnetConfig.f23545id && t.b(this.remoteId, telnetConfig.remoteId) && t.b(this.identityId, telnetConfig.identityId) && this.status == telnetConfig.status && t.b(this.updatedAt, telnetConfig.updatedAt) && this.isShared == telnetConfig.isShared;
        }

        public final long getId() {
            return this.f23545id;
        }

        public final Long getIdentityId() {
            return this.identityId;
        }

        public final Long getRemoteId() {
            return this.remoteId;
        }

        public final int getStatus() {
            return this.status;
        }

        public final String getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f23545id) * 31;
            Long l10 = this.remoteId;
            int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.identityId;
            int iHashCode3 = (((iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31) + Integer.hashCode(this.status)) * 31;
            String str = this.updatedAt;
            return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isShared);
        }

        public final boolean isShared() {
            return this.isShared;
        }

        public String toString() {
            return "TelnetConfig(id=" + this.f23545id + ", remoteId=" + this.remoteId + ", identityId=" + this.identityId + ", status=" + this.status + ", updatedAt=" + this.updatedAt + ", isShared=" + this.isShared + ")";
        }
    }

    private final void clearSshConfigIdentityIdField(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(s.p("UPDATE ssh_config SET identity_id = " + NUL_IDENTITY_ID + "\n                    | WHERE status != 2", null, 1, null));
    }

    private final void clearSshConfigIdentitySets(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM ssh_config_identity;");
    }

    private final void clearTelnetConfigIdentityIdField(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(s.p("UPDATE telnet_config SET identity_id = " + NUL_IDENTITY_ID + "\n                    | WHERE status != 2", null, 1, null));
    }

    private final void clearTelnetConfigIdentitySets(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM telnet_config_identity;");
    }

    private final boolean createSshConfigIdentities(SQLiteDatabase sQLiteDatabase, List<SshConfig> list, List<Identity> list2) {
        for (SshConfig sshConfig : list) {
            if (sshConfig.getIdentityId() != null && isIdentityExists(list2, sshConfig.getIdentityId().longValue())) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(Column.SSH_CONFIG_ID, Long.valueOf(sshConfig.getId()));
                contentValues.put(Column.IDENTITY_ID, sshConfig.getIdentityId());
                contentValues.put(Column.STATUS, Integer.valueOf(sshConfig.getStatus()));
                contentValues.put("updated_at", sshConfig.getUpdatedAt());
                contentValues.put(Column.ID_ON_SERVER, sshConfig.getRemoteId());
                if (sQLiteDatabase.insert(Table.SSH_CONFIG_IDENTITY, null, contentValues) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean createTelnetConfigIdentities(SQLiteDatabase sQLiteDatabase, List<TelnetConfig> list, List<Identity> list2) {
        for (TelnetConfig telnetConfig : list) {
            if (telnetConfig.getIdentityId() != null && isIdentityExists(list2, telnetConfig.getIdentityId().longValue())) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(Column.TELNET_CONFIG_ID, Long.valueOf(telnetConfig.getId()));
                contentValues.put(Column.IDENTITY_ID, telnetConfig.getIdentityId());
                contentValues.put(Column.STATUS, Integer.valueOf(telnetConfig.getStatus()));
                contentValues.put("updated_at", telnetConfig.getUpdatedAt());
                contentValues.put(Column.ID_ON_SERVER, telnetConfig.getRemoteId());
                if (sQLiteDatabase.insert(Table.TELNET_CONFIG_IDENTITY, null, contentValues) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    private final List<Identity> fetchIdentities(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("identity", null, null, null, null, null, "_id ASC", null);
        t.e(cursorQuery, "query(...)");
        if (cursorQuery.moveToFirst()) {
            do {
                int columnIndex = cursorQuery.getColumnIndex(Column.ID);
                int columnIndex2 = cursorQuery.getColumnIndex(Column.STATUS);
                int columnIndex3 = cursorQuery.getColumnIndex("updated_at");
                arrayList.add(new Identity(cursorQuery.getLong(columnIndex), cursorQuery.getInt(columnIndex2), cursorQuery.isNull(columnIndex3) ? null : cursorQuery.getString(columnIndex3), getBool(cursorQuery, cursorQuery.getColumnIndex(Column.IS_SHARED))));
            } while (cursorQuery.moveToNext());
        }
        cursorQuery.close();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Identity) obj).getStatus() != 2) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final List<SshConfig> fetchSshConfigs(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("ssh_config", null, null, null, null, null, "_id ASC", null);
        t.e(cursorQuery, "query(...)");
        if (cursorQuery.moveToFirst()) {
            do {
                int columnIndex = cursorQuery.getColumnIndex(Column.ID);
                int columnIndex2 = cursorQuery.getColumnIndex(Column.ID_ON_SERVER);
                int columnIndex3 = cursorQuery.getColumnIndex(Column.IDENTITY_ID);
                int columnIndex4 = cursorQuery.getColumnIndex(Column.STATUS);
                int columnIndex5 = cursorQuery.getColumnIndex("updated_at");
                int columnIndex6 = cursorQuery.getColumnIndex(Column.IS_SHARED);
                arrayList.add(new SshConfig(cursorQuery.getLong(columnIndex), cursorQuery.isNull(columnIndex2) ? null : Long.valueOf(cursorQuery.getLong(columnIndex2)), cursorQuery.isNull(columnIndex3) ? null : Long.valueOf(cursorQuery.getLong(columnIndex3)), cursorQuery.getInt(columnIndex4), cursorQuery.isNull(columnIndex5) ? null : cursorQuery.getString(columnIndex5), getBool(cursorQuery, columnIndex6)));
            } while (cursorQuery.moveToNext());
        }
        cursorQuery.close();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            SshConfig sshConfig = (SshConfig) obj;
            if (sshConfig.getStatus() != 2 && sshConfig.getIdentityId() != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final List<TelnetConfig> fetchTelnetConfigs(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("telnet_config", null, null, null, null, null, "_id ASC", null);
        t.e(cursorQuery, "query(...)");
        if (cursorQuery.moveToFirst()) {
            do {
                int columnIndex = cursorQuery.getColumnIndex(Column.ID);
                int columnIndex2 = cursorQuery.getColumnIndex(Column.ID_ON_SERVER);
                int columnIndex3 = cursorQuery.getColumnIndex(Column.IDENTITY_ID);
                int columnIndex4 = cursorQuery.getColumnIndex(Column.STATUS);
                int columnIndex5 = cursorQuery.getColumnIndex("updated_at");
                int columnIndex6 = cursorQuery.getColumnIndex(Column.IS_SHARED);
                arrayList.add(new TelnetConfig(cursorQuery.getLong(columnIndex), cursorQuery.isNull(columnIndex2) ? null : Long.valueOf(cursorQuery.getLong(columnIndex2)), cursorQuery.isNull(columnIndex3) ? null : Long.valueOf(cursorQuery.getLong(columnIndex3)), cursorQuery.getInt(columnIndex4), cursorQuery.isNull(columnIndex5) ? null : cursorQuery.getString(columnIndex5), getBool(cursorQuery, columnIndex6)));
            } while (cursorQuery.moveToNext());
        }
        cursorQuery.close();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            TelnetConfig telnetConfig = (TelnetConfig) obj;
            if (telnetConfig.getStatus() != 2 && telnetConfig.getIdentityId() != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final boolean getBool(Cursor cursor, int i10) {
        return cursor.getInt(i10) == 1;
    }

    private final boolean isIdentityExists(List<Identity> list, long j10) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Identity) it.next()).getId() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        List<SshConfig> listFetchSshConfigs = fetchSshConfigs(sQLiteDatabase);
        List<TelnetConfig> listFetchTelnetConfigs = fetchTelnetConfigs(sQLiteDatabase);
        List<Identity> listFetchIdentities = fetchIdentities(sQLiteDatabase);
        clearSshConfigIdentitySets(sQLiteDatabase);
        clearTelnetConfigIdentitySets(sQLiteDatabase);
        boolean zCreateSshConfigIdentities = createSshConfigIdentities(sQLiteDatabase, listFetchSshConfigs, listFetchIdentities);
        boolean zCreateTelnetConfigIdentities = createTelnetConfigIdentities(sQLiteDatabase, listFetchTelnetConfigs, listFetchIdentities);
        if (!zCreateSshConfigIdentities || !zCreateTelnetConfigIdentities) {
            throw new ConfigIdentityMigrationException();
        }
        clearSshConfigIdentityIdField(sQLiteDatabase);
        clearTelnetConfigIdentityIdField(sQLiteDatabase);
    }
}
