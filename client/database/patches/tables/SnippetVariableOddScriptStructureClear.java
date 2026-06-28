package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import com.server.auditor.ssh.client.database.patches.tables.SnippetVariableOddScriptStructureClear;
import hv.p;
import iu.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import lv.d2;
import lv.j0;
import lv.s2;
import mv.t;
import su.s;
import ut.m0;
import ut.n;
import ut.o;
import ut.r;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
public final class SnippetVariableOddScriptStructureClear extends AbsPatch {
    private static final int DELETE_FAILED = 2;
    private static final String SNIPPET_EXPRESSION_COLUMN_NAME = "expression";
    private static final String SNIPPET_ID_COLUMN_NAME = "_id";
    private static final String SNIPPET_SCRIPT_STRUCTURE_COLUMN_NAME = "script_structure";
    private static final String SNIPPET_STATUS_COLUMN_NAME = "status";
    private static final String SNIPPET_TABLE_NAME = "snippet";
    private static final int UPDATE_FAILED = 1;
    private final mv.b jsonConverter = t.b(null, new l() { // from class: com.server.auditor.ssh.client.database.patches.tables.c
        @Override // iu.l
        public final Object invoke(Object obj) {
            return SnippetVariableOddScriptStructureClear.jsonConverter$lambda$0((mv.d) obj);
        }
    }, 1, null);
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @p
    @Keep
    static final class ContentType {
        private static final /* synthetic */ bu.a $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        private static final n $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final ContentType TEXT = new ContentType("TEXT", 0);
        public static final ContentType VARIABLE = new ContentType("VARIABLE", 1);

        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ hv.c get$cachedSerializer() {
                return (hv.c) ContentType.$cachedSerializer$delegate.getValue();
            }

            public final hv.c serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }
        }

        private static final /* synthetic */ ContentType[] $values() {
            return new ContentType[]{TEXT, VARIABLE};
        }

        static {
            ContentType[] contentTypeArr$values = $values();
            $VALUES = contentTypeArr$values;
            $ENTRIES = bu.b.a(contentTypeArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.database.patches.tables.d
                @Override // iu.a
                public final Object a() {
                    return SnippetVariableOddScriptStructureClear.ContentType._init_$_anonymous_();
                }
            });
        }

        private ContentType(String str, int i10) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return j0.b("com.server.auditor.ssh.client.database.patches.tables.SnippetVariableOddScriptStructureClear.ContentType", values());
        }

        public static bu.a getEntries() {
            return $ENTRIES;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    @Keep
    private static final class Snippet {
        private final String expression;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f23546id;
        private final String scriptStructure;
        private final int status;

        public Snippet(long j10, String str, String str2, int i10) {
            ju.t.f(str, "expression");
            this.f23546id = j10;
            this.expression = str;
            this.scriptStructure = str2;
            this.status = i10;
        }

        public static /* synthetic */ Snippet copy$default(Snippet snippet, long j10, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j10 = snippet.f23546id;
            }
            long j11 = j10;
            if ((i11 & 2) != 0) {
                str = snippet.expression;
            }
            String str3 = str;
            if ((i11 & 4) != 0) {
                str2 = snippet.scriptStructure;
            }
            String str4 = str2;
            if ((i11 & 8) != 0) {
                i10 = snippet.status;
            }
            return snippet.copy(j11, str3, str4, i10);
        }

        public final long component1() {
            return this.f23546id;
        }

        public final String component2() {
            return this.expression;
        }

        public final String component3() {
            return this.scriptStructure;
        }

        public final int component4() {
            return this.status;
        }

        public final Snippet copy(long j10, String str, String str2, int i10) {
            ju.t.f(str, "expression");
            return new Snippet(j10, str, str2, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snippet)) {
                return false;
            }
            Snippet snippet = (Snippet) obj;
            return this.f23546id == snippet.f23546id && ju.t.b(this.expression, snippet.expression) && ju.t.b(this.scriptStructure, snippet.scriptStructure) && this.status == snippet.status;
        }

        public final String getExpression() {
            return this.expression;
        }

        public final long getId() {
            return this.f23546id;
        }

        public final String getScriptStructure() {
            return this.scriptStructure;
        }

        public final int getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.f23546id) * 31) + this.expression.hashCode()) * 31;
            String str = this.scriptStructure;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.status);
        }

        public String toString() {
            return "Snippet(id=" + this.f23546id + ", expression=" + this.expression + ", scriptStructure=" + this.scriptStructure + ", status=" + this.status + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p
    @Keep
    static final class WorkaroundSnippetScriptStructure {
        private final String content;
        private final ContentType type;
        public static final Companion Companion = new Companion(null);
        private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.database.patches.tables.e
            @Override // iu.a
            public final Object a() {
                return SnippetVariableOddScriptStructureClear.WorkaroundSnippetScriptStructure._childSerializers$_anonymous_();
            }
        }), null};

        public static final class Companion {
            private Companion() {
            }

            public final hv.c serializer() {
                return SnippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }
        }

        public /* synthetic */ WorkaroundSnippetScriptStructure(int i10, ContentType contentType, String str, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, SnippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer.INSTANCE.getDescriptor());
            }
            this.type = contentType;
            this.content = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return ContentType.Companion.serializer();
        }

        public static /* synthetic */ WorkaroundSnippetScriptStructure copy$default(WorkaroundSnippetScriptStructure workaroundSnippetScriptStructure, ContentType contentType, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                contentType = workaroundSnippetScriptStructure.type;
            }
            if ((i10 & 2) != 0) {
                str = workaroundSnippetScriptStructure.content;
            }
            return workaroundSnippetScriptStructure.copy(contentType, str);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(WorkaroundSnippetScriptStructure workaroundSnippetScriptStructure, kv.d dVar, jv.f fVar) {
            dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), workaroundSnippetScriptStructure.type);
            dVar.f(fVar, 1, workaroundSnippetScriptStructure.content);
        }

        public final ContentType component1() {
            return this.type;
        }

        public final String component2() {
            return this.content;
        }

        public final WorkaroundSnippetScriptStructure copy(ContentType contentType, String str) {
            ju.t.f(contentType, Column.TYPE);
            ju.t.f(str, "content");
            return new WorkaroundSnippetScriptStructure(contentType, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkaroundSnippetScriptStructure)) {
                return false;
            }
            WorkaroundSnippetScriptStructure workaroundSnippetScriptStructure = (WorkaroundSnippetScriptStructure) obj;
            return this.type == workaroundSnippetScriptStructure.type && ju.t.b(this.content, workaroundSnippetScriptStructure.content);
        }

        public final String getContent() {
            return this.content;
        }

        public final ContentType getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.content.hashCode();
        }

        public String toString() {
            return "WorkaroundSnippetScriptStructure(type=" + this.type + ", content=" + this.content + ")";
        }

        public WorkaroundSnippetScriptStructure(ContentType contentType, String str) {
            ju.t.f(contentType, Column.TYPE);
            ju.t.f(str, "content");
            this.type = contentType;
            this.content = str;
        }
    }

    private final String createPlainScript(String str) {
        List<WorkaroundSnippetScriptStructure> listO;
        if (str == null) {
            return "";
        }
        try {
            mv.b bVar = this.jsonConverter;
            bVar.a();
            listO = (List) bVar.b(new lv.f(WorkaroundSnippetScriptStructure.Companion.serializer()), str);
        } catch (IllegalArgumentException unused) {
            listO = v.o();
        }
        StringBuilder sb2 = new StringBuilder();
        for (WorkaroundSnippetScriptStructure workaroundSnippetScriptStructure : listO) {
            if (workaroundSnippetScriptStructure.getType() == ContentType.TEXT) {
                sb2.append(workaroundSnippetScriptStructure.getContent());
            } else if (workaroundSnippetScriptStructure.getType() == ContentType.VARIABLE) {
                sb2.append("<");
                sb2.append(workaroundSnippetScriptStructure.getContent());
                sb2.append(">");
            }
        }
        String string = sb2.toString();
        ju.t.e(string, "toString(...)");
        return string;
    }

    private final List<Snippet> fetchSnippets(SQLiteDatabase sQLiteDatabase) throws IOException {
        Cursor cursorQuery = sQLiteDatabase.query("snippet", new String[]{"_id", "status", "expression", "script_structure"}, null, null, null, null, "_id ASC", null);
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (!cursorQuery.moveToNext()) {
                    fu.c.a(cursorQuery, null);
                    return arrayList;
                }
                long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                int i10 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status"));
                if (i10 != 2) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("expression"));
                    int columnIndex = cursorQuery.getColumnIndex("script_structure");
                    ju.t.c(cursorQuery);
                    String string2 = cursorQuery.isNull(columnIndex) ? null : cursorQuery.getString(columnIndex);
                    ju.t.c(string);
                    arrayList.add(new Snippet(j10, string, string2, i10));
                }
            }
        } finally {
        }
    }

    private static /* synthetic */ void getJsonConverter$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 jsonConverter$lambda$0(mv.d dVar) {
        ju.t.f(dVar, "$this$Json");
        dVar.d(false);
        return m0.f82633a;
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) throws IOException {
        ju.t.f(sQLiteDatabase, "db");
        ju.t.f(context, "ct");
        List<Snippet> listFetchSnippets = fetchSnippets(sQLiteDatabase);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFetchSnippets) {
            Snippet snippet = (Snippet) obj;
            String scriptStructure = snippet.getScriptStructure();
            if (scriptStructure != null && !s.m0(scriptStructure) && !ju.t.b(snippet.getExpression(), createPlainScript(snippet.getScriptStructure()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("UPDATE snippet\nSET script_structure = '', status = 1\nWHERE _id = ?", new Long[]{Long.valueOf(((Snippet) it.next()).getId())});
        }
    }
}
