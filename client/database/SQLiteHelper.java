package com.server.auditor.ssh.client.database;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import com.server.auditor.ssh.client.database.patches.AgentForwardingPatch;
import com.server.auditor.ssh.client.database.patches.BackspaceHostPatch;
import com.server.auditor.ssh.client.database.patches.ChainingHostPatch;
import com.server.auditor.ssh.client.database.patches.KnownHostsPatch;
import com.server.auditor.ssh.client.database.patches.LastConnectionSyncPatch;
import com.server.auditor.ssh.client.database.patches.MigrateOfIsSharedPatch;
import com.server.auditor.ssh.client.database.patches.MoshSupportPatch;
import com.server.auditor.ssh.client.database.patches.ProxyPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddBiometricKeyIdIdentityPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddContentFieldPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddEncryptedWithColumnPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddGroupHostCredentialsModeColumnPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddHostRelationToHistoryPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddIsBiometricKeyTablePatch;
import com.server.auditor.ssh.client.database.patches.tables.AddNewConfigIdentityRelationsPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddPackagesTablePatch;
import com.server.auditor.ssh.client.database.patches.tables.AddSharedSshConfigIdentityTablePatch;
import com.server.auditor.ssh.client.database.patches.tables.AddSharedTelnetConfigIdentityTablePatch;
import com.server.auditor.ssh.client.database.patches.tables.AddSharingModeFieldPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddShiftTabShortcutToKeyboardAddonPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddSnippetVariablesColumnPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddSshCertificatesTablePatch;
import com.server.auditor.ssh.client.database.patches.tables.AddSshIdModeColumnPatch;
import com.server.auditor.ssh.client.database.patches.tables.AddTimestampToHistoryPatch;
import com.server.auditor.ssh.client.database.patches.tables.ChangeBashToShPatch;
import com.server.auditor.ssh.client.database.patches.tables.CompletionDictTable;
import com.server.auditor.ssh.client.database.patches.tables.CreateMultiKeyTable;
import com.server.auditor.ssh.client.database.patches.tables.DefaultLocalConnection;
import com.server.auditor.ssh.client.database.patches.tables.DropObsoleteHistoryDatesTablePatch;
import com.server.auditor.ssh.client.database.patches.tables.DropObsoleteHistoryTablePatch;
import com.server.auditor.ssh.client.database.patches.tables.FakePatch;
import com.server.auditor.ssh.client.database.patches.tables.FixIncorrectStartupSnippetPatch;
import com.server.auditor.ssh.client.database.patches.tables.FixSharedByMistakePatch;
import com.server.auditor.ssh.client.database.patches.tables.FreqUsedHostsPatch;
import com.server.auditor.ssh.client.database.patches.tables.HistoryCollapsedPatch;
import com.server.auditor.ssh.client.database.patches.tables.MakeHistoryShareablePatch;
import com.server.auditor.ssh.client.database.patches.tables.MergeLastConnectionTablesPatch;
import com.server.auditor.ssh.client.database.patches.tables.MigrateConfigIdentityDataRelationsPatch;
import com.server.auditor.ssh.client.database.patches.tables.MigrateSharingModeToCredentialsModePatch;
import com.server.auditor.ssh.client.database.patches.tables.NonUniqueTagsPatch;
import com.server.auditor.ssh.client.database.patches.tables.PackagesForSnippetsPatch;
import com.server.auditor.ssh.client.database.patches.tables.PortForwardingLabelPatch;
import com.server.auditor.ssh.client.database.patches.tables.RemoteRulesPortMixPatch;
import com.server.auditor.ssh.client.database.patches.tables.RemovePortKnockingDataPatch;
import com.server.auditor.ssh.client.database.patches.tables.ReplaceAutoKeyWithAIKey;
import com.server.auditor.ssh.client.database.patches.tables.SharedFieldPatch;
import com.server.auditor.ssh.client.database.patches.tables.ShortCtrlLabel;
import com.server.auditor.ssh.client.database.patches.tables.ShortcutsTable;
import com.server.auditor.ssh.client.database.patches.tables.SnippetDefaultOptionFields;
import com.server.auditor.ssh.client.database.patches.tables.SnippetVariableOddScriptStructureClear;
import com.server.auditor.ssh.client.database.patches.tables.SshEnvVariablesPatch;
import com.server.auditor.ssh.client.database.patches.tables.SshKeyTypePatch;
import com.server.auditor.ssh.client.database.patches.tables.SyncableHistoryPatch;
import com.server.auditor.ssh.client.database.patches.tables.TelnetConfigPatch;
import com.server.auditor.ssh.client.database.patches.tables.ValidateDbPatch;
import com.server.auditor.ssh.client.database.patches.views.ConfigApiViewPatch;
import com.server.auditor.ssh.client.database.patches.views.GroupApiViewPatch;
import com.server.auditor.ssh.client.database.patches.views.HostApiViewPatch;
import com.server.auditor.ssh.client.database.patches.views.HostAppModelViewPatch;
import com.server.auditor.ssh.client.database.patches.views.IdentityAppModelViewPatch;
import com.server.auditor.ssh.client.database.patches.views.PFAppModelViewPatch;
import com.server.auditor.ssh.client.database.patches.views.ProxyApiViewPatch;
import com.server.auditor.ssh.client.database.patches.views.SnippetHostApiViewPatch;
import com.server.auditor.ssh.client.database.patches.views.TagHostApiViewPatch;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.interactors.e;
import com.server.auditor.ssh.client.interactors.q0;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.utils.ApplySQLiteMigrationPatchException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import lj.z;

/* JADX INFO: loaded from: classes3.dex */
public class SQLiteHelper extends SQLiteOpenHelper {

    @Deprecated
    static final String COLUMN_ALIAS = "alias";

    @Deprecated
    static final String COLUMN_FAVOR = "is_favor";

    @Deprecated
    static final String COLUMN_HOST_OS = "host_os";
    public static final String COLUMN_URI_QUERY;
    public static final String CONCAT_URI;
    public static final String DATABASE_NAME = "ssh_connections.db";
    public static final String DEFAULT_ALIAS = "";
    public static final String DEFAULT_CHARSET = "UTF-8";
    public static final String DEFAULT_LOCAL_SHELL_PATH = "/system/bin/sh";
    public static final int DELETE_FAILED = 2;
    public static final int EMPTY_ID_ON_SERVER = -1;
    private static final int EMPTY_LOG_PATCH_EXCEPTION_STACK_TRACE_LIMIT = 5;
    public static final int FALSE = 0;

    @Deprecated
    private static final AbsPatch[] PATCHES;
    public static final int SYNCHRONIZED = 0;
    public static final int SYNCHRONIZING = -2;

    @Deprecated
    static final String TABLE_AUTHENTICATION = "authentication";

    @Deprecated
    static final String TABLE_CONNECTIONS = "ssh_connections";

    @Deprecated
    static final String TABLE_FAVORITE = "favorite";

    @Deprecated
    static final String TABLE_OLD_RECENT = "recent";

    @Deprecated
    static final String TABLE_OLD_URIS = "old_uris";

    @Deprecated
    static final String TABLE_RECENT = "new_recent";

    @Deprecated
    static final String TABLE_URIS = "uris";
    public static final int TRUE = 1;
    public static final int UPDATE_FAILED = 1;
    private static final AbsPatch[] VIEW_PATCHES;
    private Context mContext;
    private final SQLiteHelperKt sqliteHelperKt;

    private static class Column {
        private static final String ADDRESS = "address";
        private static final String AUTO_FORWARD = "auto_forwarding";
        private static final String BACKSPACE_TYPE = "backspace_type";
        private static final String BOUND_ADDRESS = "bound_address";
        private static final String CHAINING_HOSTS = "chaining_hosts";
        private static final String CHARSET = "charset";
        private static final String CLOSE_AFTER_RUN = "close_after_run";
        private static final String COLOR_SCHEME = "color_schema";
        private static final String COMMAND = "command";
        private static final String COMMENT = "comment";
        private static final String COMPLETION_DICT_ID = "dict_id";
        private static final String CONNECTION_STATUS = "connection_status";
        private static final String CREATED_AT = "created_at";
        private static final String DATETIME = "datetime";
        private static final String DEVICE_ID = "device_id";
        private static final String ENVIRONMENT_VARIABLES = "env_variables";
        private static final String ERROR_MESSAGE = "error_message";
        private static final String EXPRESSION = "expression";
        private static final String FONT_SIZE = "font_size";
        private static final String FORWARDING_HOST = "forwarding_host";
        private static final String GROUP_ID = "group_id";
        private static final String GROUP_TITLE = "group_title";
        private static final String HISTORY_ID = "history_id";
        private static final String HISTORY_TYPE = "history_type";
        private static final String HOST = "host";
        private static final String HOSTNAMES = "hostnames";
        private static final String HOST_ID = "host_id";
        private static final String HOST_TITLE = "host_title";
        private static final String ICON = "icon";
        private static final String ID = "_id";
        private static final String IDENTITY_ID = "identity_id";
        private static final String ID_ON_SERVER = "id_on_server";
        private static final String INTERACTION_DATE = "interaction_date";
        private static final String IS_CUSROS_BLINK = "is_cursor_blink";
        private static final String IS_FORWARD_PORT = "is_forward_port";
        private static final String IS_USE_AGENT_FORWARDING = "is_use_agent_forwarding";
        private static final String IS_USE_MOSH = "is_use_mosh";
        private static final String IS_VISIBLE = "is_visible";
        private static final String KEEP_ALIVE_PACKAGES = "keep_alive_packages";
        private static final String KEY_PRIVATE = "privateKey";
        private static final String KEY_PUBLIC = "publicKey";
        private static final String LOCAL_CONFIG_ID = "local_config_id";
        private static final String LOCAL_PORT = "local_port";
        private static final String LOCAL_SHELL_ARGC = "local_shell_argc";
        private static final String LOCAL_SHELL_PATH = "local_shell_path";
        private static final String MARKER = "marker";
        private static final String MOSH_SERVER_COMMAND = "mosh_server_command";
        private static final String OS_NAME = "host_os";
        private static final String PARENT_GROUP_ID = "parent_group_id";
        private static final String PASSWORD = "password";
        private static final String PASS_PHRASE = "passPhrase";
        private static final String PORT = "port";
        private static final String PROXY_HOST = "proxy_host";
        private static final String PROXY_ID = "proxy_id";
        private static final String PROXY_PASSWORD = "proxy_password";
        private static final String PROXY_PORT = "proxy_port";
        private static final String PROXY_TYPE = "proxy_type";
        private static final String PROXY_USERNAME = "proxy_username";
        private static final String RECENT_CONNECTION_DATE = "recent_connection_date";
        private static final String REMOTE_PORT = "remote_port";
        private static final String RULE_LABEL = "label";
        private static final String SHORTCUT_1 = "shortcut_1";
        private static final String SHORTCUT_2 = "shortcut_2";
        private static final String SHORTCUT_3 = "shortcut_3";
        private static final String SHORTCUT_4 = "shortcut_4";
        private static final String SHORTCUT_ORDER = "shortcut_order";
        private static final String SNIPPET_ID = "snippet_id";
        private static final String SSH_CONFIG_ID = "ssh_config_id";
        private static final String SSH_IDENTITY_ID = "ssh_identity_id";
        private static final String SSH_KEY_ID = "ssh_key_id";
        private static final String SSH_KEY_TITLE = "ssh_key_title";
        private static final String START_UP_SNIPPET_EXPRESSION = "start_up_snippet_expression";
        private static final String START_UP_SNIPPET_ID = "start_up_snippet_id";
        private static final String START_UP_SNIPPET_TITLE = "start_up_snippet_title";
        private static final String STATUS = "status";
        private static final String STRICT_CHECK_HOST_KEY = "strict_check_host_key";
        private static final String TAG_ID = "tag_id";
        private static final String TELNET_CONFIG_ID = "telnet_config_id";
        private static final String TELNET_IDENTITY_ID = "telnet_identity_id";
        private static final String TIMEOUT = "timeout";
        private static final String TITLE = "title";
        private static final String TITLE_USERS_KEY = "title";
        private static final String TYPE = "type";
        private static final String UPDATED_AT = "updated_at";
        private static final String URI = "uri";
        private static final String URI_ID = "uri_id";
        private static final String USERNAME = "username";
        private static final String USE_COUNTER = "use_counter";
        private static final String USE_SSH_KEY = "use_ssh_key";

        private Column() {
        }
    }

    private static class Table {
        private static final String CHAIN_HOSTS = "chain_hosts";
        private static final String COMPLETION_DICTIONARY = "completion_dictionary";
        private static final String GROUP = "group_t";
        private static final String HISTORY = "history";
        private static final String HOSTS = "hosts";
        private static final String IDENTITY = "identity";
        private static final String KNOWN_HOSTS = "known_hosts";
        private static final String PARENT_GROUP = "parent_group";
        private static final String PORT_FORWARDING = "port_forwarding";
        private static final String PROXY = "proxy";
        private static final String SHORTCUT_TRAINS = "shortcut_trains";
        private static final String SNIPPET = "snippet";
        private static final String SNIPPET_HOST = "snippet_host";
        private static final String TAG = "tags";
        private static final String TAG_HOST = "tag_host";
        private static final String USERS_ADDITIONAL_KEYS = "users_keys";

        private static final class LOCAL {
            public static final String CONFIG = "local_config";

            private LOCAL() {
            }
        }

        private static final class SSH {
            public static final String CONFIG = "ssh_config";
            public static final String IDENTITY = "ssh_identity";
            public static final String KEY = "ssh_key";

            private SSH() {
            }
        }

        private static final class TELNET {
            public static final String CONFIG = "telnet_config";

            private TELNET() {
            }
        }

        private Table() {
        }
    }

    static {
        String str = String.format("'ssh://' || %s || '@' || %s || ':' || %s", "username", "host", com.server.auditor.ssh.client.database.Column.PORT);
        CONCAT_URI = str;
        COLUMN_URI_QUERY = str + " as " + com.server.auditor.ssh.client.database.Column.URI;
        PATCHES = new AbsPatch[]{new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.1
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("drop table if exists %s", SQLiteHelper.TABLE_CONNECTIONS));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.2
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.3
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("drop table if exists %s", SQLiteHelper.TABLE_URIS));
                sQLiteDatabase.execSQL(String.format("drop table if exists %s", SQLiteHelper.TABLE_FAVORITE));
                sQLiteDatabase.execSQL(String.format("drop table if exists %s", SQLiteHelper.TABLE_OLD_RECENT));
                sQLiteDatabase.execSQL(String.format("create table %s ( %s integer primary key autoincrement, %s text not null, %s text not null, %s integer default 22, unique (%s, %s, %s));", SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID, "username", "host", com.server.auditor.ssh.client.database.Column.PORT, "username", "host", com.server.auditor.ssh.client.database.Column.PORT));
                sQLiteDatabase.execSQL(String.format("create table %s ( %s integer primary key autoincrement, %s integer, foreign key (%s) references %s(%s), unique (%s));", SQLiteHelper.TABLE_FAVORITE, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.URI_ID, com.server.auditor.ssh.client.database.Column.URI_ID, SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.URI_ID));
                sQLiteDatabase.execSQL(String.format("create table %s ( %s integer primary key autoincrement, %s integer, %s datetime default (datetime('now', 'localtime')), foreign key (%s) references %s(%s));", SQLiteHelper.TABLE_OLD_RECENT, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.URI_ID, com.server.auditor.ssh.client.database.Column.DATETIME, com.server.auditor.ssh.client.database.Column.URI_ID, SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.4
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                String[] strArr;
                int i10;
                int i11;
                sQLiteDatabase.execSQL(String.format("alter table %s add column %s boolean default 0", SQLiteHelper.TABLE_URIS, SQLiteHelper.COLUMN_FAVOR));
                sQLiteDatabase.execSQL(String.format("alter table %s add column %s text", SQLiteHelper.TABLE_URIS, SQLiteHelper.COLUMN_ALIAS));
                sQLiteDatabase.execSQL(String.format("alter table %s add column %s text default \"%s\"", SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, VariablesConverter.getDefaultColorSchemeName()));
                sQLiteDatabase.execSQL(String.format("update %s set %s = 1 where %s in (select %s from %s);", SQLiteHelper.TABLE_URIS, SQLiteHelper.COLUMN_FAVOR, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.URI_ID, SQLiteHelper.TABLE_FAVORITE));
                sQLiteDatabase.execSQL(String.format("drop table if exists %s", SQLiteHelper.TABLE_FAVORITE));
                sQLiteDatabase.execSQL(String.format("delete from %s where %s.%s not in (select %s.%s from %s inner join %s on %s.%s = %s.%s) and %s.%s = 0;", SQLiteHelper.TABLE_URIS, SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID, SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID, SQLiteHelper.TABLE_URIS, SQLiteHelper.TABLE_OLD_RECENT, SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID, SQLiteHelper.TABLE_OLD_RECENT, com.server.auditor.ssh.client.database.Column.URI_ID, SQLiteHelper.TABLE_URIS, SQLiteHelper.COLUMN_FAVOR));
                sQLiteDatabase.execSQL(String.format("create table %s ( %s integer primary key autoincrement, %s text, %s text, %s text, %s text, %s datetime default (datetime('now', 'localtime')));", SQLiteHelper.TABLE_AUTHENTICATION, com.server.auditor.ssh.client.database.Column.ID, "title", com.server.auditor.ssh.client.database.Column.KEY_PRIVATE, com.server.auditor.ssh.client.database.Column.KEY_PUBLIC, com.server.auditor.ssh.client.database.Column.PASS_PHRASE, com.server.auditor.ssh.client.database.Column.DATETIME));
                String[] strArrDatabaseList = context.databaseList();
                if (strArrDatabaseList != null) {
                    int length = strArrDatabaseList.length;
                    int i12 = 0;
                    while (i12 < length) {
                        if (strArrDatabaseList[i12].equals("myDataBaseWithPublicKeys")) {
                            z zVar = new z(context);
                            Cursor cursorQuery = zVar.getReadableDatabase().query("myTableWithPublicKeys", null, null, null, null, null, com.server.auditor.ssh.client.database.Column.ID);
                            cursorQuery.moveToFirst();
                            while (!cursorQuery.isAfterLast()) {
                                int columnIndex = cursorQuery.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID);
                                int columnIndex2 = cursorQuery.getColumnIndex("title");
                                int columnIndex3 = cursorQuery.getColumnIndex(com.server.auditor.ssh.client.database.Column.KEY_PRIVATE);
                                int columnIndex4 = cursorQuery.getColumnIndex(com.server.auditor.ssh.client.database.Column.KEY_PUBLIC);
                                String[] strArr2 = strArrDatabaseList;
                                int columnIndex5 = cursorQuery.getColumnIndex(com.server.auditor.ssh.client.database.Column.PASS_PHRASE);
                                int i13 = length;
                                int i14 = i12;
                                String str2 = String.format("%s  %s", cursorQuery.getString(cursorQuery.getColumnIndex("dateOfCreateKey")), cursorQuery.getString(cursorQuery.getColumnIndex("timeOfCreateKey")));
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(com.server.auditor.ssh.client.database.Column.ID, Integer.valueOf(cursorQuery.getInt(columnIndex)));
                                contentValues.put("title", cursorQuery.getString(columnIndex2));
                                contentValues.put(com.server.auditor.ssh.client.database.Column.KEY_PRIVATE, cursorQuery.getString(columnIndex3));
                                contentValues.put(com.server.auditor.ssh.client.database.Column.KEY_PUBLIC, cursorQuery.getString(columnIndex4));
                                contentValues.put(com.server.auditor.ssh.client.database.Column.PASS_PHRASE, cursorQuery.getString(columnIndex5));
                                contentValues.put(com.server.auditor.ssh.client.database.Column.DATETIME, str2);
                                sQLiteDatabase.insert(SQLiteHelper.TABLE_AUTHENTICATION, null, contentValues);
                                cursorQuery.moveToNext();
                                strArrDatabaseList = strArr2;
                                length = i13;
                                i12 = i14;
                            }
                            strArr = strArrDatabaseList;
                            i10 = length;
                            i11 = i12;
                            cursorQuery.close();
                            zVar.close();
                            context.deleteDatabase("myTableWithPublicKeys");
                        } else {
                            strArr = strArrDatabaseList;
                            i10 = length;
                            i11 = i12;
                        }
                        i12 = i11 + 1;
                        strArrDatabaseList = strArr;
                        length = i10;
                    }
                }
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.5
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("alter table %s add column %s integer default %s", SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1));
                sQLiteDatabase.execSQL(String.format("alter table %s add column %s integer default %s", SQLiteHelper.TABLE_AUTHENTICATION, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.6
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("alter table %s add column %s integer not null default %s", SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.STATUS, 1));
                sQLiteDatabase.execSQL(String.format("alter table %s add column %s integer not null default %s", SQLiteHelper.TABLE_AUTHENTICATION, com.server.auditor.ssh.client.database.Column.STATUS, 1));
                sQLiteDatabase.execSQL(String.format("alter table %s add column %s text not null default '%s'", SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.CHARSET, SQLiteHelper.DEFAULT_CHARSET));
                sQLiteDatabase.execSQL(String.format("create table %s ( %s integer primary key autoincrement, %s integer not null, %s datetime not null default (datetime('now', 'localtime')), foreign key (%s) references %s(%s) on delete cascade);", SQLiteHelper.TABLE_RECENT, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.URI_ID, com.server.auditor.ssh.client.database.Column.DATETIME, com.server.auditor.ssh.client.database.Column.URI_ID, SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("insert into %s select * from %s;", SQLiteHelper.TABLE_RECENT, SQLiteHelper.TABLE_OLD_RECENT));
                sQLiteDatabase.execSQL(String.format("drop table %s;", SQLiteHelper.TABLE_OLD_RECENT));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.7
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s", SQLiteHelper.TABLE_URIS, SQLiteHelper.TABLE_OLD_URIS));
                sQLiteDatabase.execSQL(String.format("create table %s ( %s integer primary key autoincrement, %s text not null, %s integer not null, %s text not null, unique (%s, %s, %s));", SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID, "host", com.server.auditor.ssh.client.database.Column.PORT, "username", "host", com.server.auditor.ssh.client.database.Column.PORT, "username"));
                sQLiteDatabase.execSQL(String.format("create table %s ( %s integer primary key autoincrement, %s integer unique not null, %s text not null default '%s', %s text not null default '%s', %s text not null default '%s', %s integer not null default %s, %s integer not null default %s, foreign key (%s) references %s(%s) on delete cascade);", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.URI_ID, com.server.auditor.ssh.client.database.Column.CHARSET, SQLiteHelper.DEFAULT_CHARSET, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, VariablesConverter.getDefaultColorSchemeName(), SQLiteHelper.COLUMN_ALIAS, "", com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, com.server.auditor.ssh.client.database.Column.URI_ID, SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("create table %s ( %s integer primary key autoincrement, %s integer not null, %s text not null default (datetime('now', 'localtime')), foreign key (%s) references %s(%s) on delete cascade);", SQLiteHelper.TABLE_CONNECTIONS, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.URI_ID, com.server.auditor.ssh.client.database.Column.DATETIME, com.server.auditor.ssh.client.database.Column.URI_ID, SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("insert into %s (%s, %s, %s, %s) select %s.%s, %s.%s, %s.%s, %s.%s from %s;", SQLiteHelper.TABLE_URIS, com.server.auditor.ssh.client.database.Column.ID, "host", com.server.auditor.ssh.client.database.Column.PORT, "username", SQLiteHelper.TABLE_OLD_URIS, com.server.auditor.ssh.client.database.Column.ID, SQLiteHelper.TABLE_OLD_URIS, "host", SQLiteHelper.TABLE_OLD_URIS, com.server.auditor.ssh.client.database.Column.PORT, SQLiteHelper.TABLE_OLD_URIS, "username", SQLiteHelper.TABLE_OLD_URIS));
                sQLiteDatabase.execSQL(String.format("insert into %s (%s, %s) select %s.%s, %s.%s from %s;", SQLiteHelper.TABLE_CONNECTIONS, com.server.auditor.ssh.client.database.Column.URI_ID, com.server.auditor.ssh.client.database.Column.DATETIME, SQLiteHelper.TABLE_RECENT, com.server.auditor.ssh.client.database.Column.URI_ID, SQLiteHelper.TABLE_RECENT, com.server.auditor.ssh.client.database.Column.DATETIME, SQLiteHelper.TABLE_RECENT));
                sQLiteDatabase.execSQL(String.format("update %s set %s = '' where %s is NULL;", SQLiteHelper.TABLE_OLD_URIS, SQLiteHelper.COLUMN_ALIAS, SQLiteHelper.COLUMN_ALIAS));
                sQLiteDatabase.execSQL(String.format("insert into %s (%s, %s, %s, %s, %s, %s) select %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s from %s;", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.URI_ID, com.server.auditor.ssh.client.database.Column.CHARSET, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, SQLiteHelper.COLUMN_ALIAS, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, com.server.auditor.ssh.client.database.Column.STATUS, SQLiteHelper.TABLE_OLD_URIS, com.server.auditor.ssh.client.database.Column.ID, SQLiteHelper.TABLE_OLD_URIS, com.server.auditor.ssh.client.database.Column.CHARSET, SQLiteHelper.TABLE_OLD_URIS, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, SQLiteHelper.TABLE_OLD_URIS, SQLiteHelper.COLUMN_ALIAS, SQLiteHelper.TABLE_OLD_URIS, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, SQLiteHelper.TABLE_OLD_URIS, com.server.auditor.ssh.client.database.Column.STATUS, SQLiteHelper.TABLE_OLD_URIS));
                sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", SQLiteHelper.TABLE_OLD_URIS));
                sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", SQLiteHelper.TABLE_RECENT));
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s;", "port_forwarding"));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.8
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SshConnectionsActivity", 0);
                ArrayList arrayList = new ArrayList();
                Cursor cursorQuery = sQLiteDatabase.query(SQLiteHelper.TABLE_URIS, new String[]{SQLiteHelper.COLUMN_URI_QUERY, com.server.auditor.ssh.client.database.Column.ID}, null, null, null, null, null);
                StringBuilder sb2 = new StringBuilder();
                if (cursorQuery != null) {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex(com.server.auditor.ssh.client.database.Column.URI);
                        int columnIndex2 = cursorQuery.getColumnIndex(com.server.auditor.ssh.client.database.Column.ID);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        do {
                            String string = cursorQuery.getString(columnIndex);
                            try {
                                URI.create(string);
                            } catch (IllegalArgumentException unused) {
                                if (sharedPreferences.contains(string)) {
                                    editorEdit.remove(string);
                                }
                                arrayList.add(String.valueOf(cursorQuery.getInt(columnIndex2)));
                                sb2.append("?,");
                            }
                        } while (cursorQuery.moveToNext());
                        editorEdit.apply();
                    }
                    cursorQuery.close();
                }
                int length = sb2.length();
                if (length != 0) {
                    sb2.deleteCharAt(length - 1);
                    sQLiteDatabase.delete(SQLiteHelper.TABLE_URIS, String.format("%s IN (%s)", com.server.auditor.ssh.client.database.Column.ID, sb2), (String[]) arrayList.toArray(new String[arrayList.size()]));
                }
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT NOT NULL DEFAULT %s", com.server.auditor.ssh.client.database.Table.HOSTS, "host_os", HostIconUtil.SupportedOS.DefaultOS));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.9
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.10
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, UNIQUE (%s, %s, %s, %s, %s) FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE CASCADE);", "port_forwarding", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Column.TYPE, com.server.auditor.ssh.client.database.Column.BOUND_ADDRESS, com.server.auditor.ssh.client.database.Column.LOCAL_PORT, com.server.auditor.ssh.client.database.Column.FORWARDING_HOST, com.server.auditor.ssh.client.database.Column.REMOTE_PORT, com.server.auditor.ssh.client.database.Column.AUTO_FORWARD, 1, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Column.BOUND_ADDRESS, com.server.auditor.ssh.client.database.Column.LOCAL_PORT, com.server.auditor.ssh.client.database.Column.FORWARDING_HOST, com.server.auditor.ssh.client.database.Column.REMOTE_PORT, com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("CREATE INDEX %s_index ON %s (%s);", "port_forwarding", "port_forwarding", com.server.auditor.ssh.client.database.Column.HOST_ID));
                sQLiteDatabase.execSQL(String.format("CREATE INDEX %s_index ON %s (%s);", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.URI_ID));
                sQLiteDatabase.execSQL(String.format("CREATE INDEX %s_index ON %s (%s);", SQLiteHelper.TABLE_CONNECTIONS, SQLiteHelper.TABLE_CONNECTIONS, com.server.auditor.ssh.client.database.Column.URI_ID));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.11
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL UNIQUE, %s TEXT NOT NULL );", com.server.auditor.ssh.client.database.Table.USERS_ADDITIONAL_KEYS, com.server.auditor.ssh.client.database.Column.ID, "title", com.server.auditor.ssh.client.database.Column.EXPRESSION));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.12
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER NOT NULL DEFAULT %s", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.FONT_SIZE, -1));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.13
            private static final String sTempTableHost = "temp_table_host";
            private static final String sTempTablePF = "temp_table_pf";

            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", SQLiteHelper.TABLE_AUTHENTICATION, "ssh_key"));
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", com.server.auditor.ssh.client.database.Table.HOSTS, sTempTableHost));
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", "port_forwarding", sTempTablePF));
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s DATETIME;", "ssh_key", "updated_at"));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL,  %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME);", com.server.auditor.ssh.client.database.Table.SNIPPET, com.server.auditor.ssh.client.database.Column.ID, "title", com.server.auditor.ssh.client.database.Column.EXPRESSION, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at"));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL UNIQUE, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME);", com.server.auditor.ssh.client.database.Table.TAG, com.server.auditor.ssh.client.database.Column.ID, "title", com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at"));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s BOOLEAN NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", Table.SSH.IDENTITY, com.server.auditor.ssh.client.database.Column.ID, "title", "username", "password", com.server.auditor.ssh.client.database.Column.IS_VISIBLE, 0, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.SSH_KEY_ID, com.server.auditor.ssh.client.database.Column.SSH_KEY_ID, "ssh_key", com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s BOOLEAN NOT NULL DEFAULT %s, %s BOOLEAN NOT NULL DEFAULT %s, %s BOOLEAN NOT NULL DEFAULT %s, %s BOOLEAN NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s TEXT DEFAULT NULL, %s TEXT DEFAULT \"%s\", %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", "ssh_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.FONT_SIZE, com.server.auditor.ssh.client.database.Column.PORT, com.server.auditor.ssh.client.database.Column.STRICT_CHECK_HOST_KEY, 1, com.server.auditor.ssh.client.database.Column.USE_SSH_KEY, 1, com.server.auditor.ssh.client.database.Column.IS_FORWARD_PORT, 0, com.server.auditor.ssh.client.database.Column.IS_CUSROS_BLINK, 0, com.server.auditor.ssh.client.database.Column.TIMEOUT, com.server.auditor.ssh.client.database.Column.KEEP_ALIVE_PACKAGES, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, com.server.auditor.ssh.client.database.Column.CHARSET, SQLiteHelper.DEFAULT_CHARSET, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", "ssh_identity_id", com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, "ssh_identity_id", Table.SSH.IDENTITY, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, com.server.auditor.ssh.client.database.Table.SNIPPET, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s INTEGER NOT NULL DEFAULT \"%s\", %s INTEGER NOT NULL DEFAULT \"%s\", %s DATETIME, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", com.server.auditor.ssh.client.database.Table.GROUP, com.server.auditor.ssh.client.database.Column.ID, "title", com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.PARENT_GROUP_ID, com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, "ssh_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.PARENT_GROUP_ID, com.server.auditor.ssh.client.database.Table.GROUP, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.ID, "title", com.server.auditor.ssh.client.database.Column.ADDRESS, "host_os", com.server.auditor.ssh.client.database.Column.ICON, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, com.server.auditor.ssh.client.database.Column.GROUP_ID, com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, "ssh_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.GROUP_ID, com.server.auditor.ssh.client.database.Table.GROUP, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, UNIQUE (%s, %s) FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE CASCADE ON UPDATE CASCADE,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE CASCADE ON UPDATE CASCADE);", com.server.auditor.ssh.client.database.Table.TAG_HOST, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.TAG_ID, com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.TAG_ID, com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Column.TAG_ID, com.server.auditor.ssh.client.database.Table.TAG, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER NOT NULL, UNIQUE (%s, %s, %s, %s, %s, %s) FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE CASCADE ON UPDATE CASCADE);", "port_forwarding", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.TYPE, com.server.auditor.ssh.client.database.Column.BOUND_ADDRESS, com.server.auditor.ssh.client.database.Column.LOCAL_PORT, com.server.auditor.ssh.client.database.Column.FORWARDING_HOST, com.server.auditor.ssh.client.database.Column.REMOTE_PORT, com.server.auditor.ssh.client.database.Column.AUTO_FORWARD, 1, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Column.BOUND_ADDRESS, com.server.auditor.ssh.client.database.Column.LOCAL_PORT, com.server.auditor.ssh.client.database.Column.FORWARDING_HOST, com.server.auditor.ssh.client.database.Column.REMOTE_PORT, com.server.auditor.ssh.client.database.Column.STATUS, com.server.auditor.ssh.client.database.Column.HOST_ID, com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s DATETIME NOT NULL DEFAULT (DATETIME('now', 'localtime')));", "history", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.COMMAND, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.CREATED_AT));
                sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", sTempTablePF));
                sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", sTempTableHost));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.14
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.15
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.16
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", "ssh_config", "Temp_ssh_config_table"));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s BOOLEAN DEFAULT NULL, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT \"%s\", %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", "ssh_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.FONT_SIZE, com.server.auditor.ssh.client.database.Column.PORT, com.server.auditor.ssh.client.database.Column.STRICT_CHECK_HOST_KEY, com.server.auditor.ssh.client.database.Column.USE_SSH_KEY, com.server.auditor.ssh.client.database.Column.IS_FORWARD_PORT, com.server.auditor.ssh.client.database.Column.IS_CUSROS_BLINK, com.server.auditor.ssh.client.database.Column.TIMEOUT, com.server.auditor.ssh.client.database.Column.KEEP_ALIVE_PACKAGES, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, com.server.auditor.ssh.client.database.Column.CHARSET, SQLiteHelper.DEFAULT_CHARSET, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", "ssh_identity_id", com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, "ssh_identity_id", Table.SSH.IDENTITY, com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, com.server.auditor.ssh.client.database.Table.SNIPPET, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", "Temp_ssh_config_table"));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.17
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
            }
        }, new FakePatch(), new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.18
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT \"%s\", %s TEXT DEFAULT NULL, %s TEXT DEFAULT \"%s\", %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", "local_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.FONT_SIZE, com.server.auditor.ssh.client.database.Column.COLOR_SCHEME, com.server.auditor.ssh.client.database.Column.LOCAL_SHELL_PATH, "/system/bin/sh", com.server.auditor.ssh.client.database.Column.LOCAL_SHELL_ARGC, com.server.auditor.ssh.client.database.Column.CHARSET, SQLiteHelper.DEFAULT_CHARSET, com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, com.server.auditor.ssh.client.database.Column.START_UP_SNIPPET_ID, com.server.auditor.ssh.client.database.Table.SNIPPET, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", com.server.auditor.ssh.client.database.Table.HOSTS, "temp_hosts_table"));
                sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, %s INTEGER DEFAULT NULL, FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE SET DEFAULT ON UPDATE CASCADE);", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.ID, "title", com.server.auditor.ssh.client.database.Column.ADDRESS, "host_os", com.server.auditor.ssh.client.database.Column.ICON, com.server.auditor.ssh.client.database.Column.ID_ON_SERVER, -1, com.server.auditor.ssh.client.database.Column.STATUS, 1, "updated_at", com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, com.server.auditor.ssh.client.database.Column.LOCAL_CONFIG_ID, com.server.auditor.ssh.client.database.Column.GROUP_ID, com.server.auditor.ssh.client.database.Column.SSH_CONFIG_ID, "ssh_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.LOCAL_CONFIG_ID, "local_config", com.server.auditor.ssh.client.database.Column.ID, com.server.auditor.ssh.client.database.Column.GROUP_ID, com.server.auditor.ssh.client.database.Table.GROUP, com.server.auditor.ssh.client.database.Column.ID));
                sQLiteDatabase.execSQL(String.format("DROP TABLE %s;", "temp_hosts_table"));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.19
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s DATETIME", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.RECENT_CONNECTION_DATE));
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s DATETIME", com.server.auditor.ssh.client.database.Table.HOSTS, com.server.auditor.ssh.client.database.Column.INTERACTION_DATE));
            }
        }, new AbsPatch() { // from class: com.server.auditor.ssh.client.database.SQLiteHelper.20
            @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
            public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
                sQLiteDatabase.execSQL("ALTER TABLE port_forwarding RENAME TO port_forwarding_old");
                sQLiteDatabase.execSQL("CREATE TABLE port_forwarding ( _id INTEGER PRIMARY KEY AUTOINCREMENT, type TEXT NOT NULL, bound_address TEXT NOT NULL, local_port INTEGER NOT NULL, forwarding_host TEXT NOT NULL, remote_port INTEGER NOT NULL, auto_forwarding INTEGER NOT NULL DEFAULT 1, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, host_id INTEGER NOT NULL, FOREIGN KEY (host_id) REFERENCES hosts(_id) ON DELETE CASCADE);");
                sQLiteDatabase.execSQL("CREATE INDEX port_forwarding_index ON port_forwarding (host_id);");
                sQLiteDatabase.execSQL("INSERT INTO port_forwarding select * from port_forwarding_old;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS port_forwarding_old");
            }
        }, new FakePatch(), new HistoryCollapsedPatch(), new FakePatch(), new ShortcutsTable(), new ShortCtrlLabel(), new FakePatch(), new TelnetConfigPatch(), new SyncableHistoryPatch(), new DefaultLocalConnection(), new CompletionDictTable(), new FreqUsedHostsPatch(), new BackspaceHostPatch(), new KnownHostsPatch(), new ProxyPatch(), new MoshSupportPatch(), new LastConnectionSyncPatch(), new SshEnvVariablesPatch(), new ChainingHostPatch(), new RemoteRulesPortMixPatch(), new AgentForwardingPatch(), new FakePatch(), new SnippetDefaultOptionFields(), new FakePatch(), new FakePatch(), new FakePatch(), new FakePatch(), new ValidateDbPatch(), new PortForwardingLabelPatch(), new SshKeyTypePatch(), new SharedFieldPatch(), new NonUniqueTagsPatch(), new FixSharedByMistakePatch(), new FixIncorrectStartupSnippetPatch(), new AddContentFieldPatch()};
        VIEW_PATCHES = new AbsPatch[]{new HostAppModelViewPatch(), new IdentityAppModelViewPatch(), new ConfigApiViewPatch(), new PFAppModelViewPatch(), new HostApiViewPatch(), new TagHostApiViewPatch(), new GroupApiViewPatch(), new ProxyApiViewPatch(), new SnippetHostApiViewPatch()};
    }

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, prepareDBPatchArray(context).length);
        this.mContext = context;
        TermiusApplication.b0(context);
        this.sqliteHelperKt = new SQLiteHelperKt(new zk.a(), new e(), new q0());
    }

    public static /* synthetic */ void a(StringBuilder sb2, StackTraceElement stackTraceElement) {
        sb2.append(stackTraceElement.toString());
        sb2.append("\n");
    }

    private void logPatchException(Exception exc) {
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            final StringBuilder sb2 = new StringBuilder(String.format("Original exception name: %s\nDetailed message not provided. Stack trace:\n", exc.getClass().getSimpleName()));
            Arrays.stream(exc.getStackTrace()).limit(5L).forEach(new Consumer() { // from class: com.server.auditor.ssh.client.database.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    SQLiteHelper.a(sb2, (StackTraceElement) obj);
                }
            });
            message = sb2.toString();
        }
        y9.a.f86838a.i(new ApplySQLiteMigrationPatchException(message));
    }

    private static AbsPatch[] prepareDBPatchArray(Context context) {
        ArrayList arrayList = new ArrayList(Arrays.asList(PATCHES));
        arrayList.add(new AddNewConfigIdentityRelationsPatch());
        arrayList.add(new MigrateConfigIdentityDataRelationsPatch());
        arrayList.add(new ChangeBashToShPatch());
        arrayList.add(new CreateMultiKeyTable());
        arrayList.add(new AddSharingModeFieldPatch());
        arrayList.add(new AddSharedSshConfigIdentityTablePatch());
        arrayList.add(new AddSharedTelnetConfigIdentityTablePatch());
        arrayList.add(new AddIsBiometricKeyTablePatch());
        arrayList.add(new AddBiometricKeyIdIdentityPatch());
        arrayList.add(new AddPackagesTablePatch());
        arrayList.add(new PackagesForSnippetsPatch());
        arrayList.add(new AddSshCertificatesTablePatch());
        arrayList.add(new RemovePortKnockingDataPatch());
        arrayList.add(new AddSnippetVariablesColumnPatch());
        arrayList.add(new AddGroupHostCredentialsModeColumnPatch());
        arrayList.add(new MigrateSharingModeToCredentialsModePatch());
        arrayList.add(new AddEncryptedWithColumnPatch());
        arrayList.add(new MakeHistoryShareablePatch());
        arrayList.add(new FakePatch());
        arrayList.add(new ReplaceAutoKeyWithAIKey());
        arrayList.add(new SnippetVariableOddScriptStructureClear());
        arrayList.add(new MigrateOfIsSharedPatch());
        arrayList.add(new AddHostRelationToHistoryPatch());
        arrayList.add(new AddTimestampToHistoryPatch());
        arrayList.add(new DropObsoleteHistoryTablePatch());
        arrayList.add(new DropObsoleteHistoryDatesTablePatch());
        arrayList.add(new MergeLastConnectionTablesPatch());
        arrayList.add(new AddShiftTabShortcutToKeyboardAddonPatch());
        arrayList.add(new AddSshIdModeColumnPatch());
        return (AbsPatch[]) arrayList.toArray(new AbsPatch[0]);
    }

    private void runViewPatching(SQLiteDatabase sQLiteDatabase) {
        for (AbsPatch absPatch : VIEW_PATCHES) {
            absPatch.apply(sQLiteDatabase, this.mContext);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws Exception {
        try {
            y9.a.f86838a.b("Initial SQLite database creation");
            int i10 = 0;
            for (AbsPatch absPatch : prepareDBPatchArray(this.mContext)) {
                y9.a.f86838a.b("Creation SQLite. Trying to apply patch version: " + i10);
                absPatch.apply(sQLiteDatabase, this.mContext);
                i10++;
            }
            runViewPatching(sQLiteDatabase);
            y9.a.f86838a.b("Initial SQLite database creation successfully finished.");
        } catch (Exception e10) {
            logPatchException(e10);
            this.sqliteHelperKt.waitSentryEventsToSent();
            throw e10;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=OFF;");
            sQLiteDatabase.execSQL("PRAGMA auto_vacuum=full;");
        }
        this.sqliteHelperKt.checkDatabaseIntegrity(this.mContext, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws Exception {
        try {
            y9.a.f86838a.b(String.format("Upgrading SQLite database from %d to %d", Integer.valueOf(i10), Integer.valueOf(i11)));
            AbsPatch[] absPatchArrPrepareDBPatchArray = prepareDBPatchArray(this.mContext);
            while (i10 < i11) {
                y9.a.f86838a.b("Upgrading SQLite. Trying to apply patch version: " + i10);
                absPatchArrPrepareDBPatchArray[i10].apply(sQLiteDatabase, this.mContext);
                i10++;
            }
            runViewPatching(sQLiteDatabase);
            y9.a.f86838a.b("Upgrading SQLite database successfully finished.");
        } catch (Exception e10) {
            logPatchException(e10);
            this.sqliteHelperKt.waitSentryEventsToSent();
            throw e10;
        }
    }
}
