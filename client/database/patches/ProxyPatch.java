package com.server.auditor.ssh.client.database.patches;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyPatch extends AbsPatch {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final int EMPTY_ID_ON_SERVER = -1;
    private static final int UPDATE_FAILED = 1;
    private static final String USE_SYNC_KEYS_PASSWORDS = "use_sync_keys_and_passwords";
    private SharedPreferences mSharedPreferences;

    private static final class Column {
        private static final String CHARSET = "charset";
        private static final String COLOR_SCHEME = "color_schema";
        private static final String FONT_SIZE = "font_size";
        private static final String HOST = "host";
        private static final String ID = "_id";
        private static final String IDENTITY_ID = "identity_id";
        private static final String ID_ON_SERVER = "id_on_server";
        private static final String IS_CUSROS_BLINK = "is_cursor_blink";
        private static final String IS_FORWARD_PORT = "is_forward_port";
        private static final String KEEP_ALIVE_PACKAGES = "keep_alive_packages";
        private static final String PORT = "port";
        private static final String PROXY_HOST = "proxy_host";
        private static final String PROXY_ID = "proxy_id";
        private static final String PROXY_PASSWORD = "proxy_password";
        private static final String PROXY_PORT = "proxy_port";
        private static final String PROXY_TYPE = "proxy_type";
        private static final String PROXY_USERNAME = "proxy_username";
        private static final String SSH_CONFIG_ID = "ssh_config_id";
        private static final String SSH_IDENTITY_ID = "ssh_identity_id";
        private static final String START_UP_SNIPPET_ID = "start_up_snippet_id";
        private static final String STATUS = "status";
        private static final String STRICT_CHECK_HOST_KEY = "strict_check_host_key";
        private static final String TIMEOUT = "timeout";
        private static final String TYPE = "type";
        private static final String UPDATED_AT = "updated_at";
        private static final String USE_SSH_KEY = "use_ssh_key";

        private Column() {
        }
    }

    private static class SshRemoteConfigDBModel {
        private String mCharset;
        private String mColorScheme;
        private Integer mPort;
        private long mId = 0;
        private String mUpdateAtTime = null;
        private Long mIdentityId = null;
        private Boolean mIsCursorBlink = null;
        private Integer mTimeout = null;
        private Long mStartupSnippetId = null;
        private Long mProxyId = null;
        private boolean mIsIdentitySynced = false;
        private long mIdOnServer = -1;
        private int mStatus = 1;

        public long getIdInDatabase() {
            return this.mId;
        }

        public void setCharset(String str) {
            this.mCharset = str;
        }

        public void setColorScheme(String str) {
            this.mColorScheme = str;
        }

        public void setIdInDatabase(long j10) {
            this.mId = j10;
        }

        public void setIdOnServer(long j10) {
            this.mIdOnServer = j10;
        }

        public void setIdentityId(Long l10) {
            this.mIdentityId = l10;
        }

        public void setIdentitySynced(boolean z10) {
            this.mIsIdentitySynced = z10;
        }

        public void setPort(Integer num) {
            this.mPort = num;
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
            contentValues.put(com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, this.mColorScheme);
            contentValues.put(com.server.auditor.ssh.client.database.Column.CHARSET, this.mCharset);
            if (this.mIsIdentitySynced || this.mIdentityId != null) {
                contentValues.put(com.server.auditor.ssh.client.database.Column.IDENTITY_ID, this.mIdentityId);
            }
            contentValues.put(com.server.auditor.ssh.client.database.Column.PORT, this.mPort);
            contentValues.put(com.server.auditor.ssh.client.database.Column.IS_CUSROS_BLINK, this.mIsCursorBlink);
            contentValues.put(com.server.auditor.ssh.client.database.Column.TIMEOUT, this.mTimeout);
            contentValues.put(com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, this.mStartupSnippetId);
            contentValues.put(com.server.auditor.ssh.client.database.Column.PROXY_ID, this.mProxyId);
            return contentValues;
        }
    }

    private static final class Table {
        private static final String GROUP = "group_t";
        private static final String HOSTS = "hosts";
        private static final String IDENTITY = "identity";
        private static final String LAST_CONNECTION = "last_connection";
        private static final String PROXY = "proxy";
        private static final String SNIPPET = "snippet";

        private static final class SSH {
            private static final String CONFIG = "ssh_config";

            private SSH() {
            }
        }

        private Table() {
        }
    }

    private void addProxyToHistoryTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT NULL;", "last_connection", com.server.auditor.ssh.client.database.Column.PROXY_TYPE));
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT NULL;", "last_connection", com.server.auditor.ssh.client.database.Column.PROXY_HOST));
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT NULL;", "last_connection", com.server.auditor.ssh.client.database.Column.PROXY_PORT));
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT NULL;", "last_connection", com.server.auditor.ssh.client.database.Column.PROXY_USERNAME));
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT NULL;", "last_connection", com.server.auditor.ssh.client.database.Column.PROXY_PASSWORD));
    }

    private void alterProxyColumnToSshConfigTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", "ssh_config", "temp_ssh_config_table"));
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT \"%s\", %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", "ssh_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.FONT_SIZE, com.server.auditor.ssh.client.database.Column.PORT, com.server.auditor.ssh.client.database.Column.STRICT_CHECK_HOST_KEY, com.server.auditor.ssh.client.database.Column.USE_SSH_KEY, com.server.auditor.ssh.client.database.Column.IS_FORWARD_PORT, com.server.auditor.ssh.client.database.Column.IS_CUSROS_BLINK, com.server.auditor.ssh.client.database.Column.TIMEOUT, com.server.auditor.ssh.client.database.Column.KEEP_ALIVE_PACKAGES, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, com.server.auditor.ssh.client.database.Column.CHARSET, "UTF-8", com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.IDENTITY_ID, com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, com.server.auditor.ssh.client.database.Column.PROXY_ID, com.server.auditor.ssh.client.database.Column.IDENTITY_ID, "identity", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, com.server.auditor.ssh.client.database.Table.SNIPPET, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.PROXY_ID, com.server.auditor.ssh.client.database.Table.PROXY, com.server.auditor.ssh.client.database.Column.ID));
        Cursor cursorQuery = sQLiteDatabase.query("temp_ssh_config_table", null, null, null, null, null, null);
        migrateSshConfigForImproveDefaultValues(cursorQuery, sQLiteDatabase);
        cursorQuery.close();
        sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", "temp_ssh_config_table"));
    }

    private void createProxyTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", com.server.auditor.ssh.client.database.Table.PROXY, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.TYPE, "host", com.server.auditor.ssh.client.database.Column.PORT, com.server.auditor.ssh.client.database.Column.IDENTITY_ID, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.IDENTITY_ID, "identity", com.server.auditor.ssh.client.database.Column.ID));
    }

    private boolean isIdentitySynced() {
        return this.mSharedPreferences.getBoolean(USE_SYNC_KEYS_PASSWORDS, true);
    }

    private void migrateSshConfigForImproveDefaultValues(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        int i10;
        if (cursor.moveToFirst()) {
            do {
                SshRemoteConfigDBModel sshRemoteConfigDBModel = new SshRemoteConfigDBModel();
                sshRemoteConfigDBModel.setIdentitySynced(isIdentitySynced());
                int columnIndex = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID);
                int columnIndex2 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID_ON_SERVER);
                int columnIndex3 = cursor.getColumnIndex("updated_at");
                sshRemoteConfigDBModel.setIdInDatabase(cursor.getLong(columnIndex));
                sshRemoteConfigDBModel.setIdOnServer(cursor.getLong(columnIndex2));
                sshRemoteConfigDBModel.setUpdatedAtTime(cursor.getString(columnIndex3));
                int columnIndex4 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.IDENTITY_ID);
                if (columnIndex4 == -1) {
                    columnIndex4 = cursor.getColumnIndex("ssh_identity_id");
                }
                int columnIndex5 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID);
                if (!cursor.isNull(columnIndex4)) {
                    sshRemoteConfigDBModel.setIdentityId(Long.valueOf(cursor.getLong(columnIndex4)));
                }
                if (!cursor.isNull(columnIndex5)) {
                    sshRemoteConfigDBModel.setStartupSnippetId(Long.valueOf(cursor.getLong(columnIndex5)));
                }
                int columnIndex6 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.PORT);
                if (!cursor.isNull(columnIndex6) && (i10 = cursor.getInt(columnIndex6)) != 0) {
                    sshRemoteConfigDBModel.setPort(Integer.valueOf(i10));
                }
                int columnIndex7 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.COLOR_SCHEME);
                int columnIndex8 = cursor.getColumnIndex(com.server.auditor.ssh.client.database.Column.CHARSET);
                sshRemoteConfigDBModel.setColorScheme(cursor.getString(columnIndex7));
                sshRemoteConfigDBModel.setCharset(cursor.getString(columnIndex8));
                long jInsert = sQLiteDatabase.insert("ssh_config", null, sshRemoteConfigDBModel.toContentValues());
                Cursor cursorQuery = sQLiteDatabase.query(com.server.auditor.ssh.client.database.Table.HOSTS, null, String.format("%s = %s", com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, Long.valueOf(sshRemoteConfigDBModel.getIdInDatabase())), null, null, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, Long.valueOf(jInsert));
                        sQLiteDatabase.update(com.server.auditor.ssh.client.database.Table.HOSTS, contentValues, String.format("%s = %s", com.server.auditor.ssh.client.database.Column.ID, Integer.valueOf(i11)), null);
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
                Cursor cursorQuery2 = sQLiteDatabase.query(com.server.auditor.ssh.client.database.Table.GROUP, null, String.format("%s = %s", com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, Long.valueOf(sshRemoteConfigDBModel.getIdInDatabase())), null, null, null, null, null);
                if (cursorQuery2.moveToFirst()) {
                    do {
                        int i12 = cursorQuery2.getInt(cursorQuery2.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID));
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put(com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, Long.valueOf(jInsert));
                        sQLiteDatabase.update(com.server.auditor.ssh.client.database.Table.GROUP, contentValues2, String.format("%s = %s", com.server.auditor.ssh.client.database.Column.ID, Integer.valueOf(i12)), null);
                    } while (cursorQuery2.moveToNext());
                }
                cursorQuery2.close();
            } while (cursor.moveToNext());
        }
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        this.mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        createProxyTable(sQLiteDatabase);
        alterProxyColumnToSshConfigTable(sQLiteDatabase);
        addProxyToHistoryTable(sQLiteDatabase);
    }
}
