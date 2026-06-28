package com.server.auditor.ssh.client.interactors.snippets;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.interactors.snippets.SnippetVariablesWorkaround;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import iu.l;
import java.util.List;
import ju.k;
import jv.f;
import lv.d2;
import lv.i2;
import lv.j0;
import lv.n0;
import lv.s2;
import lv.x2;
import mv.t;
import ut.m0;
import ut.n;
import ut.o;
import ut.r;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class SnippetVariablesWorkaround {
    public static final int $stable = 8;
    private final mv.b jsonConverter = t.b(null, new l() { // from class: com.server.auditor.ssh.client.interactors.snippets.c
        @Override // iu.l
        public final Object invoke(Object obj) {
            return SnippetVariablesWorkaround.jsonConverter$lambda$0((mv.d) obj);
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @p
    @Keep
    static final class ContentType {
        private static final /* synthetic */ bu.a $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        private static final n $cachedSerializer$delegate;
        public static final a Companion;
        public static final ContentType TEXT = new ContentType("TEXT", 0);
        public static final ContentType VARIABLE = new ContentType("VARIABLE", 1);

        public static final class a {
            private a() {
            }

            private final /* synthetic */ hv.c a() {
                return (hv.c) ContentType.$cachedSerializer$delegate.getValue();
            }

            public final hv.c serializer() {
                return a();
            }

            public /* synthetic */ a(k kVar) {
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
            Companion = new a(null);
            $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.interactors.snippets.d
                @Override // iu.a
                public final Object a() {
                    return SnippetVariablesWorkaround.ContentType._init_$_anonymous_();
                }
            });
        }

        private ContentType(String str, int i10) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return j0.b("com.server.auditor.ssh.client.interactors.snippets.SnippetVariablesWorkaround.ContentType", values());
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

    /* JADX INFO: Access modifiers changed from: private */
    @p
    @Keep
    static final class WorkaroundSnippetScriptStructure {
        private final String content;
        private final ContentType type;
        public static final b Companion = new b(null);
        private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.interactors.snippets.e
            @Override // iu.a
            public final Object a() {
                return SnippetVariablesWorkaround.WorkaroundSnippetScriptStructure._childSerializers$_anonymous_();
            }
        }), null};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27597b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f27596a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.interactors.snippets.SnippetVariablesWorkaround.WorkaroundSnippetScriptStructure", aVar, 2);
                i2Var.r(Column.TYPE, false);
                i2Var.r("content", false);
                descriptor = i2Var;
                f27597b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WorkaroundSnippetScriptStructure deserialize(kv.e eVar) {
                ContentType contentType;
                String strB;
                int i10;
                ju.t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = WorkaroundSnippetScriptStructure.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    contentType = (ContentType) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                    strB = cVarD.B(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    ContentType contentType2 = null;
                    String strB2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            contentType2 = (ContentType) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), contentType2);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            strB2 = cVarD.B(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    contentType = contentType2;
                    strB = strB2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new WorkaroundSnippetScriptStructure(i10, contentType, strB, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, WorkaroundSnippetScriptStructure workaroundSnippetScriptStructure) {
                ju.t.f(fVar, "encoder");
                ju.t.f(workaroundSnippetScriptStructure, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                WorkaroundSnippetScriptStructure.write$Self$Termius_app_googleProductionRelease(workaroundSnippetScriptStructure, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{WorkaroundSnippetScriptStructure.$childSerializers[0].getValue(), x2.f64817a};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f27596a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ WorkaroundSnippetScriptStructure(int i10, ContentType contentType, String str, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f27596a.getDescriptor());
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

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(WorkaroundSnippetScriptStructure workaroundSnippetScriptStructure, kv.d dVar, f fVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 jsonConverter$lambda$0(mv.d dVar) {
        ju.t.f(dVar, "$this$Json");
        dVar.d(true);
        return m0.f82633a;
    }

    public final String createPlainScriptFromStructureJson(String str) {
        List<WorkaroundSnippetScriptStructure> listO;
        if (str == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            mv.b bVar = this.jsonConverter;
            bVar.a();
            listO = (List) bVar.b(new lv.f(WorkaroundSnippetScriptStructure.Companion.serializer()), str);
        } catch (IllegalArgumentException unused) {
            listO = v.o();
        }
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
        ju.t.c(string);
        return string;
    }
}
