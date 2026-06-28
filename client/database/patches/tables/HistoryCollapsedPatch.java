package com.server.auditor.ssh.client.database.patches.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.SQLiteHelper;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Stack;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;
import tp.d1;

/* JADX INFO: loaded from: classes3.dex */
public class HistoryCollapsedPatch extends AbsPatch {
    private static final String CHARSET = "charset";
    private static final String COLOR_SCHEME = "color_schema";
    private static final String COMMAND = "command";
    private static final String CONNECTION_STATUS = "connection_status";
    private static final String CREATED_AT = "created_at";
    private static final String DEFAULT_COLOR_SCHEME_TERMIUS_DARK = "Termius Dark";
    private static final String DEFAULT_SHELL_PATH = "/system/bin/sh";
    private static final int DEFAULT_SSH_PORT = 22;
    private static final String DefaultFontSize = "8";
    private static final String ERROR_MESSAGE = "error_message";
    private static final String FONT_SIZE = "font_size";
    private static final String HISTORY = "history";
    private static final String HISTORY_DATES = "history_dates";
    private static final String HISTORY_ID = "history_id";
    private static final String HISTORY_TYPE = "history_type";
    private static final String HOST = "host";
    private static final String HOSTS = "hosts";
    private static final String HOST_ICONE_UTIL_NONE = "none";
    private static final String HOST_ID = "host_id";
    private static final String ID = "_id";
    private static final String LOCAL_SHELL_ARGC = "local_shell_argc";
    private static final String LOCAL_SHELL_PATH = "local_shell_path";
    private static final String OS_NAME = "host_os";
    private static final String PASSWORD = "password";
    private static final String PORT = "port";
    private static final String SNIPPET = "snippet";
    private static final String SSH_KEY = "ssh_key";
    private static final String SSH_KEY_ID = "ssh_key_id";
    private static final String START_UP_SNIPPET_ID = "start_up_snippet_id";
    private static final String TITLE = "title";
    private static final String USERNAME = "username";
    private static final String sSelectionById = "_id=?";
    private static final String[] sSelectionByIdArg = {"0"};

    private static class HistoryDBModel {
        String mCharset;
        String mColorScheme;
        String mConnectionType;
        Integer mFontSize;
        String mHost;
        long mId;
        String mLocalShellArgc;
        String mLocalShellPath;
        String mPassword;
        Integer mPort;
        Long mSshKeyId;
        Long mStartupSnippetId;
        String mTitle;
        String mUserName;

        HistoryDBModel(String str, String str2, String str3, Integer num, String str4, Long l10, String str5, Long l11, Integer num2, String str6, String str7, String str8, String str9) {
            this.mTitle = str;
            if (TextUtils.isEmpty(str)) {
                this.mTitle = "";
            }
            this.mUserName = str2;
            if (TextUtils.isEmpty(str2)) {
                this.mUserName = "";
            }
            this.mHost = str3;
            this.mPort = num;
            this.mPassword = str4;
            this.mSshKeyId = l10;
            this.mConnectionType = str5;
            this.mStartupSnippetId = l11;
            this.mFontSize = num2;
            this.mColorScheme = str6;
            this.mCharset = str7;
            this.mLocalShellPath = str8;
            this.mLocalShellArgc = str9;
        }

        public ContentValues toContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", this.mTitle);
            contentValues.put("username", this.mUserName);
            contentValues.put("host", this.mHost);
            contentValues.put("port", this.mPort);
            contentValues.put("password", this.mPassword);
            contentValues.put("ssh_key_id", this.mSshKeyId);
            contentValues.put("history_type", this.mConnectionType);
            contentValues.put("start_up_snippet_id", this.mStartupSnippetId);
            contentValues.put("font_size", this.mFontSize);
            contentValues.put("color_schema", this.mColorScheme);
            contentValues.put("charset", this.mCharset);
            contentValues.put("local_shell_path", this.mLocalShellPath);
            contentValues.put("local_shell_argc", this.mLocalShellArgc);
            return contentValues;
        }
    }

    private static class MigrateHistoryElement {
        String alias;
        String charset;
        String colorScheme;
        String command;
        String createdAt;
        Integer fontSize;
        long historyId;
        String host;
        Long hostId;
        Long keyId;
        String localArgs;
        String localPath;
        String password;
        Integer port;
        String user;

        private MigrateHistoryElement() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.server.auditor.ssh.client.database.patches.tables.HistoryCollapsedPatch.HistoryDBModel convertHistoryElement(android.database.sqlite.SQLiteDatabase r30, java.lang.String r31, com.server.auditor.ssh.client.database.patches.tables.HistoryCollapsedPatch.HistoryDBModel r32, com.server.auditor.ssh.client.database.patches.tables.HistoryCollapsedPatch.MigrateHistoryElement r33) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.database.patches.tables.HistoryCollapsedPatch.convertHistoryElement(android.database.sqlite.SQLiteDatabase, java.lang.String, com.server.auditor.ssh.client.database.patches.tables.HistoryCollapsedPatch$HistoryDBModel, com.server.auditor.ssh.client.database.patches.tables.HistoryCollapsedPatch$MigrateHistoryElement):com.server.auditor.ssh.client.database.patches.tables.HistoryCollapsedPatch$HistoryDBModel");
    }

    private static Stack<MigrateHistoryElement> prepareOldHistoryStack(Cursor cursor) {
        Stack<MigrateHistoryElement> stack = new Stack<>();
        if (cursor.moveToFirst()) {
            do {
                try {
                    MigrateHistoryElement migrateHistoryElement = new MigrateHistoryElement();
                    int columnIndex = cursor.getColumnIndex("_id");
                    int columnIndex2 = cursor.getColumnIndex("created_at");
                    migrateHistoryElement.historyId = cursor.getLong(columnIndex);
                    String string = cursor.getString(columnIndex2);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
                    simpleDateFormat.setTimeZone(TimeZone.getDefault());
                    Date date = simpleDateFormat.parse(string);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    migrateHistoryElement.createdAt = simpleDateFormat.format(date);
                    JSONObject jSONObject = new JSONObject(cursor.getString(cursor.getColumnIndex("command")));
                    migrateHistoryElement.fontSize = Integer.valueOf(jSONObject.optInt("font_size", Integer.valueOf(DefaultFontSize).intValue()));
                    migrateHistoryElement.colorScheme = jSONObject.optString("color_scheme", DEFAULT_COLOR_SCHEME_TERMIUS_DARK);
                    migrateHistoryElement.charset = jSONObject.optString("charset", SQLiteHelper.DEFAULT_CHARSET);
                    migrateHistoryElement.alias = jSONObject.optString("title", "");
                    migrateHistoryElement.host = jSONObject.optString("host", "");
                    migrateHistoryElement.hostId = Long.valueOf(jSONObject.optLong("host_id", 0L));
                    migrateHistoryElement.command = jSONObject.optString("command", null);
                    migrateHistoryElement.port = Integer.valueOf(jSONObject.optInt("port", 22));
                    migrateHistoryElement.user = jSONObject.optString("username", "");
                    migrateHistoryElement.password = jSONObject.optString("password", null);
                    migrateHistoryElement.keyId = Long.valueOf(jSONObject.optLong("ssh_key_id", 0L));
                    String strOptString = jSONObject.optString("local_shell_path", null);
                    migrateHistoryElement.localPath = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        migrateHistoryElement.localPath = "/system/bin/sh";
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("local_shell_args");
                    if (jSONArrayOptJSONArray != null) {
                        int length = jSONArrayOptJSONArray.length();
                        String[] strArr = new String[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            strArr[i10] = jSONArrayOptJSONArray.optString(i10, null);
                        }
                        if (length > 0) {
                            migrateHistoryElement.localArgs = TextUtils.join(",", strArr);
                        }
                    }
                    stack.push(migrateHistoryElement);
                } catch (ParseException | JSONException unused) {
                }
            } while (cursor.moveToNext());
        }
        return stack;
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL("ALTER TABLE history RENAME TO history_old");
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT DEFAULT NULL, %s TEXT, %s TEXT, %s INTEGER default %s, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT NULL REFERENCES %s(%s) ON DELETE SET NULL, %s TEXT, %s INTEGER DEFAULT NULL REFERENCES %s(%s) ON DELETE SET NULL, %s INTEGER DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL)", HISTORY, "_id", "title", "username", "host", "port", 22, "password", "ssh_key_id", "ssh_key", "_id", "history_type", "start_up_snippet_id", "snippet", "_id", "font_size", "color_schema", "charset", "local_shell_path", "local_shell_argc"));
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) ON DELETE CASCADE, %s INTEGER DEFAULT NULL REFERENCES %s(%s) ON DELETE SET NULL, %s TEXT, %s INTEGER DEFAULT 0, %s TEXT DEFAULT NULL, %s DATETIME DEFAULT (datetime('now', 'localtime')));", HISTORY_DATES, "_id", "history_id", HISTORY, "_id", "host_id", "hosts", "_id", "host_os", "connection_status", "error_message", "created_at"));
        migrateHistoryModel(sQLiteDatabase, "history_old");
        sQLiteDatabase.execSQL(String.format("drop table if exists %s", "history_old"));
    }

    public void migrateHistoryModel(SQLiteDatabase sQLiteDatabase, String str) {
        Timber.d("migrateHistoryModelV2", new Object[0]);
        Cursor cursorQuery = sQLiteDatabase.query(str, null, null, null, null, null, String.format("%s DESC", "_id"), "1000");
        Stack<MigrateHistoryElement> stackPrepareOldHistoryStack = prepareOldHistoryStack(cursorQuery);
        cursorQuery.close();
        HistoryDBModel historyDBModelConvertHistoryElement = null;
        while (!stackPrepareOldHistoryStack.isEmpty()) {
            historyDBModelConvertHistoryElement = convertHistoryElement(sQLiteDatabase, str, historyDBModelConvertHistoryElement, stackPrepareOldHistoryStack.pop());
        }
    }

    private static class HistoryDatesDBModel {
        String mCreatedAt;
        String mErrorMessage;
        long mHistoryId;
        String mHostOsName;
        int mStatus;

        HistoryDatesDBModel(long j10, String str, int i10) {
            this.mStatus = 0;
            this.mErrorMessage = null;
            this.mCreatedAt = d1.b(new Date());
            this.mHistoryId = j10;
            this.mHostOsName = str;
            this.mStatus = i10;
        }

        public ContentValues toContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("history_id", Long.valueOf(this.mHistoryId));
            contentValues.put("host_os", this.mHostOsName);
            contentValues.put("connection_status", Integer.valueOf(this.mStatus));
            contentValues.put("error_message", this.mErrorMessage);
            if (!TextUtils.isEmpty(this.mCreatedAt)) {
                contentValues.put("created_at", this.mCreatedAt);
            }
            return contentValues;
        }

        HistoryDatesDBModel(long j10, String str, String str2, int i10, String str3) {
            this(j10, str, i10);
            this.mErrorMessage = str3;
            this.mCreatedAt = str2;
        }
    }
}
