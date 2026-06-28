package com.server.auditor.ssh.client.database;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.server.auditor.ssh.client.app.TermiusApplication;
import io.sentry.android.core.performance.j;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public class SAContentProvider extends ContentProvider {
    public static final String SA_CONTENT_HOST = "com.server.auditor.ssh.client.provider";
    private static final String TAG = "SAContentProvider";
    private SQLiteDatabase mDB;
    private SQLiteHelper mDBManager;

    private String constructSubtypes(Uri uri) throws IndexOutOfBoundsException {
        return uri.getPathSegments().get(0);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        try {
            this.mDB.beginTransaction();
            String strConstructSubtypes = constructSubtypes(uri);
            int i10 = 0;
            for (ContentValues contentValues : contentValuesArr) {
                this.mDB.insert(strConstructSubtypes, null, contentValues);
                i10++;
            }
            this.mDB.setTransactionSuccessful();
            this.mDB.endTransaction();
            return i10;
        } catch (Throwable th2) {
            this.mDB.endTransaction();
            throw th2;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) throws IndexOutOfBoundsException {
        String str2;
        try {
            str2 = String.format("%s=%s", Column.ID, Long.valueOf(ContentUris.parseId(uri)));
        } catch (NumberFormatException unused) {
            str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        String strConstructSubtypes = constructSubtypes(uri);
        if (str != null) {
            str2 = String.format("(%s) and %s", str, str2);
        }
        return this.mDB.delete(strConstructSubtypes, str2, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (!uri.getHost().equals(SA_CONTENT_HOST)) {
            return null;
        }
        try {
            ContentUris.parseId(uri);
            return "vnd.android.cursor.dir/" + constructSubtypes(uri);
        } catch (NumberFormatException unused) {
            return "vnd.android.cursor.item/" + constructSubtypes(uri);
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) throws IndexOutOfBoundsException {
        String strConstructSubtypes = constructSubtypes(uri);
        Timber.j("Insert Table = %s; Values = %s", strConstructSubtypes, contentValues);
        return ContentUris.withAppendedId(uri, this.mDB.insert(strConstructSubtypes, null, contentValues));
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        j.u(this);
        TermiusApplication.b0(getContext());
        SQLiteHelper sQLiteHelper = new SQLiteHelper(getContext());
        this.mDBManager = sQLiteHelper;
        this.mDB = sQLiteHelper.getWritableDatabase();
        j.v(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws IndexOutOfBoundsException {
        String str3;
        try {
            str3 = String.format("%s=%s", Column.ID, Long.valueOf(ContentUris.parseId(uri)));
        } catch (NumberFormatException unused) {
            str3 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        String strConstructSubtypes = constructSubtypes(uri);
        if (str != null) {
            str3 = String.format("(%s) and %s", str, str3);
        }
        return this.mDB.query(strConstructSubtypes, strArr, str3, strArr2, null, null, str2);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) throws IndexOutOfBoundsException {
        String lastPathSegment = uri.getLastPathSegment();
        String strConstructSubtypes = constructSubtypes(uri);
        Timber.j("Update Table = %s; Values = %s", strConstructSubtypes, contentValues);
        if (str == null && lastPathSegment != null && lastPathSegment.matches("\\d+(?:\\.\\d+)?")) {
            str = String.format("%s=%s", Column.ID, lastPathSegment);
        }
        return this.mDB.update(strConstructSubtypes, contentValues, str, strArr);
    }
}
