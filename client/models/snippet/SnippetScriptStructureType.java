package com.server.auditor.ssh.client.models.snippet;

import bu.b;
import com.server.auditor.ssh.client.models.snippet.SnippetScriptStructureType;
import hv.c;
import hv.p;
import ju.k;
import lv.j0;
import ut.n;
import ut.o;
import ut.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@p
public final class SnippetScriptStructureType {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ SnippetScriptStructureType[] $VALUES;
    private static final n $cachedSerializer$delegate;
    public static final a Companion;
    public static final SnippetScriptStructureType TEXT = new SnippetScriptStructureType("TEXT", 0);
    public static final SnippetScriptStructureType VARIABLE = new SnippetScriptStructureType("VARIABLE", 1);

    public static final class a {
        private a() {
        }

        private final /* synthetic */ c a() {
            return (c) SnippetScriptStructureType.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ SnippetScriptStructureType[] $values() {
        return new SnippetScriptStructureType[]{TEXT, VARIABLE};
    }

    static {
        SnippetScriptStructureType[] snippetScriptStructureTypeArr$values = $values();
        $VALUES = snippetScriptStructureTypeArr$values;
        $ENTRIES = b.a(snippetScriptStructureTypeArr$values);
        Companion = new a(null);
        $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: pj.b
            @Override // iu.a
            public final Object a() {
                return SnippetScriptStructureType._init_$_anonymous_();
            }
        });
    }

    private SnippetScriptStructureType(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return j0.b("com.server.auditor.ssh.client.models.snippet.SnippetScriptStructureType", values());
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static SnippetScriptStructureType valueOf(String str) {
        return (SnippetScriptStructureType) Enum.valueOf(SnippetScriptStructureType.class, str);
    }

    public static SnippetScriptStructureType[] values() {
        return (SnippetScriptStructureType[]) $VALUES.clone();
    }
}
