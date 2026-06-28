package com.server.auditor.ssh.client.searchview;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Column;
import io.sentry.android.core.performance.j;
import java.util.List;
import p9.a;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public class SearchSuggestionProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UriMatcher f38857b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static List f38859d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f38856a = Uri.parse("content://com.crystalnix.gloria.searchview.PlacesSuggestionProvider/search_suggest_query");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f38858c = {Column.ID, "suggest_text_1", "suggest_intent_data_id", "suggest_icon_1"};

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f38857b = uriMatcher;
        uriMatcher.addURI("com.crystalnix.gloria.searchview.PlacesSuggestionProvider", "search_suggest_query", 1);
        uriMatcher.addURI("com.crystalnix.gloria.searchview.PlacesSuggestionProvider", "search_suggest_query/*", 1);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (f38857b.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.android.search.suggest";
        }
        throw new IllegalArgumentException("Unknown URL " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        j.u(this);
        j.v(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Timber.j("query = %s", uri);
        String lowerCase = uri.getLastPathSegment().toLowerCase();
        String[] strArr3 = new String[4];
        MatrixCursor matrixCursor = new MatrixCursor(f38858c, 1);
        if (f38859d != null) {
            for (int i10 = 0; i10 < f38859d.size(); i10++) {
                a aVar = (a) f38859d.get(i10);
                if (aVar.b().toLowerCase().contains(lowerCase)) {
                    strArr3[0] = String.valueOf(aVar.hashCode());
                    strArr3[1] = aVar.b();
                    strArr3[2] = aVar.b();
                    if (aVar.l()) {
                        strArr3[3] = String.valueOf(R.drawable.folder);
                    } else {
                        strArr3[3] = String.valueOf(wl.a.b(getContext(), aVar.b()));
                    }
                    if (f38857b.match(uri) != 1) {
                        throw new IllegalArgumentException("Unknown Uri: " + uri);
                    }
                    matrixCursor.addRow(strArr3);
                }
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
