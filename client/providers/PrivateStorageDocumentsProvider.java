package com.server.auditor.ssh.client.providers;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsProvider;
import android.webkit.MimeTypeMap;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Column;
import fu.i;
import io.sentry.android.core.performance.j;
import java.io.File;
import java.io.FileNotFoundException;
import ju.k;
import ju.t;
import su.s;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateStorageDocumentsProvider extends DocumentsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38546a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38547b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f38548c = {"root_id", "mime_types", "flags", Column.ICON, "title", "summary", "document_id"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f38549d = {"document_id", "mime_type", "_display_name", "last_modified", "flags", "_size"};

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    private final File a() {
        Context context = getContext();
        if (context == null) {
            throw new IllegalStateException("Context is null");
        }
        File file = new File(context.getFilesDir().getAbsolutePath() + "/private");
        try {
            File canonicalFile = file.getCanonicalFile();
            t.c(canonicalFile);
            return canonicalFile;
        } catch (Exception unused) {
            return file;
        }
    }

    private final String b(File file) throws FileNotFoundException {
        String strSubstring;
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = a().getAbsolutePath();
        if (t.b(absolutePath, absolutePath2)) {
            strSubstring = "";
        } else {
            t.c(absolutePath);
            t.c(absolutePath2);
            if (!s.S(absolutePath, absolutePath2, false, 2, null)) {
                throw new FileNotFoundException("File " + absolutePath + " is not under " + absolutePath2);
            }
            t.c(absolutePath);
            strSubstring = absolutePath.substring(absolutePath2.length());
            t.e(strSubstring, "substring(...)");
            if (s.S(strSubstring, "/", false, 2, null)) {
                strSubstring = strSubstring.substring(1);
                t.e(strSubstring, "substring(...)");
            }
        }
        return "root:" + strSubstring;
    }

    private final File c(String str) throws FileNotFoundException {
        if (str == null) {
            throw new FileNotFoundException("Document ID is null");
        }
        File fileA = a();
        if (t.b(str, "root:") || t.b(str, "root")) {
            return fileA;
        }
        String strSubstring = str.substring(5);
        t.e(strSubstring, "substring(...)");
        File file = new File(fileA, strSubstring);
        if (!file.exists()) {
            throw new FileNotFoundException("File does not exist: " + file.getAbsolutePath());
        }
        try {
            File canonicalFile = file.getCanonicalFile();
            String path = canonicalFile.getPath();
            t.e(path, "getPath(...)");
            String path2 = fileA.getPath();
            t.e(path2, "getPath(...)");
            if (s.S(path, path2, false, 2, null)) {
                t.c(canonicalFile);
                return canonicalFile;
            }
            throw new SecurityException("File is outside private storage: " + canonicalFile.getAbsolutePath());
        } catch (Exception unused) {
            throw new FileNotFoundException("Could not resolve file: " + file.getAbsolutePath());
        }
    }

    private final String d(File file) {
        if (file.isDirectory()) {
            return "vnd.android.document/directory";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(i.n(file));
        return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(android.database.MatrixCursor r8, java.io.File r9) {
        /*
            r7 = this;
            boolean r0 = r9.isDirectory()
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r9.canWrite()
            if (r0 == 0) goto L18
            r0 = 8
            goto L19
        L10:
            boolean r0 = r9.canWrite()
            if (r0 == 0) goto L18
            r0 = 6
            goto L19
        L18:
            r0 = r1
        L19:
            java.io.File r2 = r7.a()
            boolean r2 = ju.t.b(r9, r2)
            if (r2 == 0) goto L35
            android.content.Context r2 = r7.getContext()
            if (r2 == 0) goto L32
            r3 = 2132018786(0x7f140662, float:1.9675888E38)
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L39
        L32:
            java.lang.String r2 = "Private Storage"
            goto L39
        L35:
            java.lang.String r2 = r9.getName()
        L39:
            java.lang.String r3 = r7.d(r9)
            r4 = 2
            r5 = 0
            java.lang.String r6 = "image/"
            boolean r1 = su.s.S(r3, r6, r1, r4, r5)
            if (r1 == 0) goto L49
            r0 = r0 | 1
        L49:
            android.database.MatrixCursor$RowBuilder r8 = r8.newRow()
            java.lang.String r1 = "document_id"
            java.lang.String r4 = r7.b(r9)
            r8.add(r1, r4)
            java.lang.String r1 = "_display_name"
            r8.add(r1, r2)
            long r1 = r9.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "_size"
            r8.add(r2, r1)
            java.lang.String r1 = "mime_type"
            r8.add(r1, r3)
            long r1 = r9.lastModified()
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "last_modified"
            r8.add(r1, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "flags"
            r8.add(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.providers.PrivateStorageDocumentsProvider.e(android.database.MatrixCursor, java.io.File):void");
    }

    @Override // android.provider.DocumentsProvider
    public boolean isChildDocument(String str, String str2) {
        if (str2 != null) {
            if (str == null) {
                str = "";
            }
            if (s.S(str2, str, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        j.u(this);
        j.v(this);
        return true;
    }

    @Override // android.provider.DocumentsProvider
    public ParcelFileDescriptor openDocument(String str, String str2, CancellationSignal cancellationSignal) throws FileNotFoundException {
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(c(str), ParcelFileDescriptor.parseMode(str2));
        t.e(parcelFileDescriptorOpen, "open(...)");
        return parcelFileDescriptorOpen;
    }

    @Override // android.provider.DocumentsProvider
    public Cursor queryChildDocuments(String str, String[] strArr, String str2) throws FileNotFoundException {
        File[] fileArrListFiles;
        if (strArr == null) {
            strArr = f38549d;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        File fileC = c(str);
        if (fileC.isDirectory() && (fileArrListFiles = fileC.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                t.c(file);
                e(matrixCursor, file);
            }
        }
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public Cursor queryDocument(String str, String[] strArr) {
        if (strArr == null) {
            strArr = f38549d;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        e(matrixCursor, c(str));
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public Cursor queryRoots(String[] strArr) {
        File[] fileArrListFiles;
        if (strArr == null) {
            strArr = f38548c;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        Context context = getContext();
        if (context != null) {
            File fileA = a();
            if (fileA.exists() && fileA.isDirectory() && (fileArrListFiles = fileA.listFiles()) != null) {
                if (!(fileArrListFiles.length == 0)) {
                    MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
                    rowBuilderNewRow.add("root_id", "private_storage_root");
                    rowBuilderNewRow.add("mime_types", "*/*");
                    rowBuilderNewRow.add("flags", 2);
                    rowBuilderNewRow.add(Column.ICON, Integer.valueOf(R.mipmap.ic_launcher));
                    rowBuilderNewRow.add("title", context.getString(R.string.private_storage_provider_title));
                    rowBuilderNewRow.add("summary", context.getString(R.string.private_storage_provider_summary));
                    rowBuilderNewRow.add("document_id", b(a()));
                }
            }
        }
        return matrixCursor;
    }
}
