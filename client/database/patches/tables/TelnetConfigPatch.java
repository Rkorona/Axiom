package com.server.auditor.ssh.client.database.patches.tables;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;

/* JADX INFO: loaded from: classes3.dex */
public class TelnetConfigPatch extends AbsPatch {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final int EMPTY_ID_ON_SERVER = -1;
    private static final int FALSE = 0;
    private static final int UPDATE_FAILED = 1;
    private static final String USE_SYNC_KEYS_PASSWORDS = "use_sync_keys_and_passwords";
    private SharedPreferences mSharedPreferences;

    public class Column {
        private static final String ADDRESS = "address";
        private static final String CHARSET = "charset";
        private static final String COLOR_SCHEME = "color_schema";
        private static final String FONT_SIZE = "font_size";
        private static final String GROUP_ID = "group_id";
        private static final String ICON = "icon";
        private static final String ID = "_id";
        private static final String IDENTITY_ID = "identity_id";
        private static final String ID_ON_SERVER = "id_on_server";
        private static final String INTERACTION_DATE = "interaction_date";
        private static final String IS_CUSROS_BLINK = "is_cursor_blink";
        private static final String IS_FORWARD_PORT = "is_forward_port";
        private static final String KEEP_ALIVE_PACKAGES = "keep_alive_packages";
        private static final String LOCAL_CONFIG_ID = "local_config_id";
        private static final String OS_NAME = "host_os";
        private static final String PORT = "port";
        private static final String RECENT_CONNECTION_DATE = "recent_connection_date";
        private static final String SSH_CONFIG_ID = "ssh_config_id";
        private static final String SSH_IDENTITY_ID = "ssh_identity_id";
        private static final String START_UP_SNIPPET_ID = "start_up_snippet_id";
        private static final String STATUS = "status";
        private static final String STRICT_CHECK_HOST_KEY = "strict_check_host_key";
        private static final String TELNET_CONFIG_ID = "telnet_config_id";
        private static final String TIMEOUT = "timeout";
        private static final String TITLE = "title";
        private static final String UPDATED_AT = "updated_at";
        private static final String USE_SSH_KEY = "use_ssh_key";

        public Column() {
        }
    }

    private static class HostDBModel {
        private String mAddress;
        private Long mGroupId;
        private String mIcon;
        private long mIdOnServer;
        private String mInteractionDate;
        private Long mLocalConfigId;
        private HostIconUtil.OsModelType mOsModelType;
        private Long mSshConfigId;
        private int mStatus;
        private Long mTelnetConfigId;
        private String mTitle;
        private String mUpdateAtTime;

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof HostDBModel)) {
                return false;
            }
            HostDBModel hostDBModel = (HostDBModel) obj;
            return hostDBModel.mAddress.equals(this.mAddress) && hostDBModel.mTitle.equals(this.mTitle) && hostDBModel.mSshConfigId.equals(this.mSshConfigId) && hostDBModel.mTelnetConfigId.equals(this.mTelnetConfigId) && hostDBModel.mLocalConfigId.equals(this.mLocalConfigId);
        }

        public ContentValues toContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put(com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, Long.valueOf(this.mIdOnServer));
            contentValues.put("updated_at", this.mUpdateAtTime);
            contentValues.put(com.server.auditor.ssh.client.database.Column.STATUS, Integer.valueOf(this.mStatus));
            contentValues.put(com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, this.mSshConfigId);
            contentValues.put(com.server.auditor.ssh.client.database.Column.TELNET_CONFIG_ID, this.mTelnetConfigId);
            contentValues.put(com.server.auditor.ssh.client.database.Column.LOCAL_CONFIG_ID, this.mLocalConfigId);
            contentValues.put(com.server.auditor.ssh.client.database.Column.GROUP_ID, this.mGroupId);
            contentValues.put(com.server.auditor.ssh.client.database.Column.ICON, this.mIcon);
            contentValues.put(com.server.auditor.ssh.client.database.Column.ADDRESS, this.mAddress);
            contentValues.put("title", this.mTitle);
            contentValues.put(com.server.auditor.ssh.client.database.Column.OS_NAME, this.mOsModelType.toString());
            String str = this.mInteractionDate;
            if (str != null) {
                contentValues.put(com.server.auditor.ssh.client.database.Column.INTERACTION_DATE, str);
            }
            return contentValues;
        }

        private HostDBModel(Cursor cursor) {
            this.mIdOnServer = 0L;
            this.mUpdateAtTime = null;
            this.mStatus = 0;
            this.mSshConfigId = null;
            this.mLocalConfigId = null;
            this.mTelnetConfigId = null;
            this.mGroupId = null;
            this.mOsModelType = HostIconUtil.OsModelType.none;
            int columnIndex = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID_ON_SERVER);
            int columnIndex2 = cursor.getColumnIndex("updated_at");
            int columnIndex3 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.STATUS);
            int columnIndex4 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.ICON);
            int columnIndex5 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.ADDRESS);
            int columnIndex6 = cursor.getColumnIndex("title");
            this.mIdOnServer = cursor.getLong(columnIndex);
            this.mUpdateAtTime = cursor.getString(columnIndex2);
            this.mStatus = cursor.getInt(columnIndex3);
            int columnIndex7 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID);
            int columnIndex8 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.TELNET_CONFIG_ID);
            int columnIndex9 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.LOCAL_CONFIG_ID);
            int columnIndex10 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.GROUP_ID);
            int columnIndex11 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.INTERACTION_DATE);
            this.mIcon = cursor.getString(columnIndex4);
            this.mAddress = cursor.getString(columnIndex5);
            this.mTitle = cursor.getString(columnIndex6);
            if (cursor.isNull(columnIndex7)) {
                this.mSshConfigId = null;
            } else {
                this.mSshConfigId = Long.valueOf(cursor.getLong(columnIndex7));
            }
            if (cursor.isNull(columnIndex9)) {
                this.mLocalConfigId = null;
            } else {
                this.mLocalConfigId = Long.valueOf(cursor.getLong(columnIndex9));
            }
            if (cursor.isNull(columnIndex8)) {
                this.mTelnetConfigId = null;
            } else {
                this.mTelnetConfigId = Long.valueOf(cursor.getLong(columnIndex8));
            }
            if (cursor.isNull(columnIndex10)) {
                this.mGroupId = null;
            } else {
                this.mGroupId = Long.valueOf(cursor.getLong(columnIndex10));
            }
            if (cursor.isNull(columnIndex11)) {
                this.mInteractionDate = null;
            } else {
                this.mInteractionDate = cursor.getString(columnIndex11);
            }
            try {
                this.mOsModelType = HostIconUtil.OsModelType.valueOf(cursor.getString(cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.OS_NAME)));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private static class SshRemoteConfigDBModel {
        private String mCharset;
        private String mColorScheme;
        private Integer mFontSize;
        private long mId;
        private long mIdOnServer;
        private Long mIdentityId;
        private Boolean mIsCursorBlink;
        private boolean mIsIdentitySynced;
        private Boolean mIsPortForwarding;
        private Integer mKeepAlivePackages;
        private Integer mPort;
        private Long mStartupSnippetId;
        private int mStatus;
        private Boolean mStrictCheckHostKey;
        private String mUpdateAtTime;
        private Boolean mUseSshKey;

        public long getIdInDatabase() {
            return this.mId;
        }

        public void setCharset(String str) {
            this.mCharset = str;
        }

        public void setColorScheme(String str) {
            this.mColorScheme = str;
        }

        public void setFontSize(int i10) {
            this.mFontSize = Integer.valueOf(i10);
        }

        public void setIdInDatabase(long j10) {
            this.mId = j10;
        }

        public void setIdOnServer(long j10) {
            this.mIdOnServer = j10;
        }

        public void setIdentityId(long j10) {
            this.mIdentityId = Long.valueOf(j10);
        }

        public void setIdentitySynced(boolean z10) {
            this.mIsIdentitySynced = z10;
        }

        public void setPort(int i10) {
            this.mPort = Integer.valueOf(i10);
        }

        void setStartupSnippetId(Long l10) {
            this.mStartupSnippetId = l10;
        }

        public void setUpdatedAtTime(String str) {
            this.mUpdateAtTime = str;
        }

        public ContentValues toContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put(com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, Long.valueOf(this.mIdOnServer));
            contentValues.put("updated_at", this.mUpdateAtTime);
            contentValues.put(com.server.auditor.ssh.client.database.Column.STATUS, Integer.valueOf(this.mStatus));
            contentValues.put(com.server.auditor.ssh.client.database.Column.FONT_SIZE, this.mFontSize);
            contentValues.put(com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, this.mColorScheme);
            contentValues.put(com.server.auditor.ssh.client.database.Column.CHARSET, this.mCharset);
            if (this.mIsIdentitySynced || this.mIdentityId != null) {
                contentValues.put(com.server.auditor.ssh.client.database.Column.IDENTITY_ID, this.mIdentityId);
            }
            contentValues.put(com.server.auditor.ssh.client.database.Column.PORT, this.mPort);
            contentValues.put(com.server.auditor.ssh.client.database.Column.IS_CUSROS_BLINK, this.mIsCursorBlink);
            contentValues.put(com.server.auditor.ssh.client.database.Column.STRICT_CHECK_HOST_KEY, this.mStrictCheckHostKey);
            contentValues.put(com.server.auditor.ssh.client.database.Column.USE_SSH_KEY, this.mUseSshKey);
            contentValues.put(com.server.auditor.ssh.client.database.Column.IS_FORWARD_PORT, this.mIsPortForwarding);
            contentValues.put(com.server.auditor.ssh.client.database.Column.KEEP_ALIVE_PACKAGES, this.mKeepAlivePackages);
            contentValues.put(com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, this.mStartupSnippetId);
            return contentValues;
        }

        private SshRemoteConfigDBModel() {
            this.mStrictCheckHostKey = null;
            this.mUseSshKey = null;
            this.mIsPortForwarding = null;
            this.mKeepAlivePackages = null;
            this.mStartupSnippetId = null;
            this.mIdentityId = null;
            this.mIsCursorBlink = null;
            this.mId = 0L;
            this.mIdOnServer = 0L;
            this.mUpdateAtTime = "";
            this.mStatus = 0;
            this.mIsIdentitySynced = false;
        }
    }

    private static final class Table {
        private static final String GROUP = "group_t";
        private static final String HOSTS = "hosts";
        private static final String IDENTITY = "identity";
        private static final String SNIPPET = "snippet";
        private static final String USERS_ADDITIONAL_KEYS = "users_keys";

        private static final class LOCAL {
            private static final String CONFIG = "local_config";

            private LOCAL() {
            }
        }

        private static final class SSH {
            private static final String CONFIG = "ssh_config";
            private static final String IDENTITY = "ssh_identity";
            private static final String KEY = "ssh_key";

            private SSH() {
            }
        }

        private static final class TELNET {
            private static final String CONFIG = "telnet_config";

            private TELNET() {
            }
        }

        private Table() {
        }
    }

    private void alterIdentityTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE ssh_identity RENAME TO identity");
    }

    private void alterSshConfigTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", "ssh_config", "temp_ssh_config_table"));
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT \"%s\", %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", "ssh_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.FONT_SIZE, com.server.auditor.ssh.client.database.Column.PORT, com.server.auditor.ssh.client.database.Column.STRICT_CHECK_HOST_KEY, com.server.auditor.ssh.client.database.Column.USE_SSH_KEY, com.server.auditor.ssh.client.database.Column.IS_FORWARD_PORT, com.server.auditor.ssh.client.database.Column.IS_CUSROS_BLINK, com.server.auditor.ssh.client.database.Column.TIMEOUT, com.server.auditor.ssh.client.database.Column.KEEP_ALIVE_PACKAGES, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, com.server.auditor.ssh.client.database.Column.CHARSET, "UTF-8", com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.IDENTITY_ID, com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, com.server.auditor.ssh.client.database.Column.IDENTITY_ID, "identity", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, com.server.auditor.ssh.client.database.Table.SNIPPET, com.server.auditor.ssh.client.database.Column.ID));
        Cursor cursorQuery = sQLiteDatabase.query("temp_ssh_config_table", null, null, null, null, null, null);
        migrateSshConfigForImproveDefaultValues(cursorQuery, sQLiteDatabase);
        cursorQuery.close();
        sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", "temp_ssh_config_table"));
    }

    private void alterTelnetColumnToGroupTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s; FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE;", com.server.auditor.ssh.client.database.Table.GROUP, com.server.auditor.ssh.client.database.Column.TELNET_CONFIG_ID, com.server.auditor.ssh.client.database.Column.TELNET_CONFIG_ID, "telnet_config", com.server.auditor.ssh.client.database.Column.ID));
    }

    private void alterTelnetConfigColumnToHostTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", com.server.auditor.ssh.client.database.Table.HOSTS, "temp_hosts_table"));
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s DATETIME, %s DATETIME, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.ID, "title", com.server.auditor.ssh.client.database.Column.ADDRESS, com.server.auditor.ssh.client.database.Column.OS_NAME, com.server.auditor.ssh.client.database.Column.ICON, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, com.server.auditor.ssh.client.database.Column.TELNET_CONFIG_ID, com.server.auditor.ssh.client.database.Column.LOCAL_CONFIG_ID, com.server.auditor.ssh.client.database.Column.GROUP_ID, com.server.auditor.ssh.client.database.Column.RECENT_CONNECTION_DATE, com.server.auditor.ssh.client.database.Column.INTERACTION_DATE, com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, "ssh_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.TELNET_CONFIG_ID, "telnet_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.LOCAL_CONFIG_ID, "local_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.GROUP_ID, com.server.auditor.ssh.client.database.Table.GROUP, com.server.auditor.ssh.client.database.Column.ID));
        Cursor cursorQuery = sQLiteDatabase.query("temp_hosts_table", null, null, null, null, null, null);
        migrateHostForAddLocalConfigForeignKeyColumn(cursorQuery, sQLiteDatabase);
        cursorQuery.close();
        sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", "temp_hosts_table"));
    }

    private void createTelnetConfigTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s BOOLEAN NOT NULL DEFAULT %s, %s TEXT DEFAULT NULL, %s TEXT DEFAULT \"%s\", %s INTEGER DEFAULT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", "telnet_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.FONT_SIZE, com.server.auditor.ssh.client.database.Column.PORT, com.server.auditor.ssh.client.database.Column.IS_CUSROS_BLINK, 0, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, com.server.auditor.ssh.client.database.Column.CHARSET, "UTF-8", com.server.auditor.ssh.client.database.Column.IDENTITY_ID, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.IDENTITY_ID, "identity", com.server.auditor.ssh.client.database.Column.ID));
    }

    private boolean isIdentitySynced() {
        return this.mSharedPreferences.getBoolean(USE_SYNC_KEYS_PASSWORDS, true);
    }

    private void migrateHostForAddLocalConfigForeignKeyColumn(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        if (cursor.moveToFirst()) {
            do {
                sQLiteDatabase.insert(com.server.auditor.ssh.client.database.Table.HOSTS, null, new HostDBModel(cursor).toContentValues());
            } while (cursor.moveToNext());
        }
    }

    private void migrateSshConfigForImproveDefaultValues(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        int i10;
        int i11;
        if (cursor.moveToFirst()) {
            do {
                int columnIndex = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID);
                int columnIndex2 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID_ON_SERVER);
                int columnIndex3 = cursor.getColumnIndex("updated_at");
                SshRemoteConfigDBModel sshRemoteConfigDBModel = new SshRemoteConfigDBModel();
                sshRemoteConfigDBModel.setIdentitySynced(isIdentitySynced());
                sshRemoteConfigDBModel.setIdInDatabase(cursor.getLong(columnIndex));
                sshRemoteConfigDBModel.setIdOnServer(cursor.getLong(columnIndex2));
                sshRemoteConfigDBModel.setUpdatedAtTime(cursor.getString(columnIndex3));
                int columnIndex4 = cursor.getColumnIndex("ssh_identity_id");
                int columnIndex5 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID);
                if (!cursor.isNull(columnIndex4)) {
                    sshRemoteConfigDBModel.setIdentityId(cursor.getLong(columnIndex4));
                }
                if (!cursor.isNull(columnIndex5)) {
                    sshRemoteConfigDBModel.setStartupSnippetId(Long.valueOf(cursor.getLong(columnIndex5)));
                }
                int columnIndex6 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.FONT_SIZE);
                if (!cursor.isNull(columnIndex6) && (i11 = cursor.getInt(columnIndex6)) != 0) {
                    sshRemoteConfigDBModel.setFontSize(i11);
                }
                int columnIndex7 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.PORT);
                if (!cursor.isNull(columnIndex7) && (i10 = cursor.getInt(columnIndex7)) != 0) {
                    sshRemoteConfigDBModel.setPort(i10);
                }
                int columnIndex8 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.COLOR_SCHEME);
                int columnIndex9 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.CHARSET);
                sshRemoteConfigDBModel.setColorScheme(cursor.getString(columnIndex8));
                sshRemoteConfigDBModel.setCharset(cursor.getString(columnIndex9));
                long jInsert = sQLiteDatabase.insert("ssh_config", null, sshRemoteConfigDBModel.toContentValues());
                Cursor cursorQuery = sQLiteDatabase.query(com.server.auditor.ssh.client.database.Table.HOSTS, null, String.format("%s = %s", com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, Long.valueOf(sshRemoteConfigDBModel.getIdInDatabase())), null, null, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, Long.valueOf(jInsert));
                        sQLiteDatabase.update(com.server.auditor.ssh.client.database.Table.HOSTS, contentValues, String.format("%s = %s", com.server.auditor.ssh.client.database.Column.ID, Integer.valueOf(i12)), null);
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
                Cursor cursorQuery2 = sQLiteDatabase.query(com.server.auditor.ssh.client.database.Table.GROUP, null, String.format("%s = %s", com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, Long.valueOf(sshRemoteConfigDBModel.getIdInDatabase())), null, null, null, null, null);
                if (cursorQuery2.moveToFirst()) {
                    do {
                        int i13 = cursorQuery2.getInt(cursorQuery2.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID));
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put(com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, Long.valueOf(jInsert));
                        sQLiteDatabase.update(com.server.auditor.ssh.client.database.Table.GROUP, contentValues2, String.format("%s = %s", com.server.auditor.ssh.client.database.Column.ID, Integer.valueOf(i13)), null);
                    } while (cursorQuery2.moveToNext());
                }
                cursorQuery2.close();
            } while (cursor.moveToNext());
        }
    }

    private void removeUsersKeysTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s;", com.server.auditor.ssh.client.database.Table.USERS_ADDITIONAL_KEYS));
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        this.mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        alterIdentityTable(sQLiteDatabase);
        alterSshConfigTable(sQLiteDatabase);
        createTelnetConfigTable(sQLiteDatabase);
        alterTelnetConfigColumnToHostTable(sQLiteDatabase);
        alterTelnetColumnToGroupTable(sQLiteDatabase);
        removeUsersKeysTable(sQLiteDatabase);
    }
}
