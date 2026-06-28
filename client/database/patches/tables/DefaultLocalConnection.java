package com.server.auditor.ssh.client.database.patches.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultLocalConnection extends AbsPatch {
    private static final String CHARSET = "charset";
    private static final String COLOR_SCHEME = "color_schema";
    private static final String FONT_SIZE = "font_size";
    private static final String HOSTS = "hosts";
    private static final String LOCAL_CONFIG = "local_config";
    private static final String LOCAL_SHELL_ARGC = "local_shell_argc";
    private static final String LOCAL_SHELL_PATH = "local_shell_path";
    private static final String START_UP_SNIPPET_ID = "start_up_snippet_id";

    private static class LocalConfigDBModel {
        private String mCharset;
        private String mColorScheme;
        private Integer mFontSize;
        private long mId;
        private String[] mLocalShellArgc;
        private String mLocalShellPath;
        private Long mStartupSnippetId;

        public String getCharset() {
            return this.mCharset;
        }

        public String getColorScheme() {
            return this.mColorScheme;
        }

        public Integer getFontSize() {
            return this.mFontSize;
        }

        public long getId() {
            return this.mId;
        }

        public String[] getLocalShellArgc() {
            return this.mLocalShellArgc;
        }

        public String getLocalShellPath() {
            return this.mLocalShellPath;
        }

        public Long getStartupSnippetId() {
            return this.mStartupSnippetId;
        }

        public void setCharset(String str) {
            this.mCharset = str;
        }

        public void setColorScheme(String str) {
            this.mColorScheme = str;
        }

        public void setFontSize(Integer num) {
            this.mFontSize = num;
        }

        public void setId(long j10) {
            this.mId = j10;
        }

        public void setLocalShellArgc(String[] strArr) {
            this.mLocalShellArgc = strArr;
        }

        public void setLocalShellPath(String str) {
            this.mLocalShellPath = str;
        }

        public void setStartupSnippetId(Long l10) {
            this.mStartupSnippetId = l10;
        }

        public ContentValues toContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("font_size", this.mFontSize);
            contentValues.put("color_schema", this.mColorScheme);
            contentValues.put("charset", this.mCharset);
            contentValues.put("start_up_snippet_id", this.mStartupSnippetId);
            contentValues.put("local_shell_path", this.mLocalShellPath);
            String[] strArr = this.mLocalShellArgc;
            if (strArr != null) {
                contentValues.put("local_shell_argc", Arrays.toString(strArr));
            }
            return contentValues;
        }

        private LocalConfigDBModel(Integer num, String str, String str2, Long l10, String str3, String[] strArr) {
            this.mFontSize = num;
            this.mColorScheme = str;
            this.mCharset = str2;
            this.mStartupSnippetId = l10;
            this.mLocalShellPath = str3;
            this.mLocalShellArgc = strArr;
        }
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        Cursor cursorQuery = sQLiteDatabase.query("hosts", null, null, null, null, null, null);
        int count = cursorQuery.getCount();
        cursorQuery.close();
        if (count == 0) {
            LocalConfigDBModel localConfigDBModel = new LocalConfigDBModel(null, null, null, null, null, null);
            localConfigDBModel.setLocalShellPath(com.server.auditor.ssh.client.utils.binaries.b.b(context, "bash_bin"));
            sQLiteDatabase.insert("local_config", null, localConfigDBModel.toContentValues());
        }
    }
}
