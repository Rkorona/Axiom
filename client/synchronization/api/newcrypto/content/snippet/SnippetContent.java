package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.snippet;

import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SnippetContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final boolean autoClose;
    private final String label;
    private final String script;
    private final String scriptStructure;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return SnippetContent.serializer;
        }

        public final c serializer() {
            return SnippetContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public SnippetContent() {
        this((String) null, (String) null, false, 0, (String) null, 31, (k) null);
    }

    public static /* synthetic */ SnippetContent copy$default(SnippetContent snippetContent, String str, String str2, boolean z10, int i10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = snippetContent.label;
        }
        if ((i11 & 2) != 0) {
            str2 = snippetContent.script;
        }
        if ((i11 & 4) != 0) {
            z10 = snippetContent.autoClose;
        }
        if ((i11 & 8) != 0) {
            i10 = snippetContent.version;
        }
        if ((i11 & 16) != 0) {
            str3 = snippetContent.scriptStructure;
        }
        String str4 = str3;
        boolean z11 = z10;
        return snippetContent.copy(str, str2, z11, i10, str4);
    }

    @o("auto_close")
    public static /* synthetic */ void getAutoClose$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o("script")
    public static /* synthetic */ void getScript$annotations() {
    }

    @o(Column.SNIPPET_SCRIPT_STRUCTURE)
    public static /* synthetic */ void getScriptStructure$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SnippetContent snippetContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(snippetContent.label, "")) {
            dVar.f(fVar, 0, snippetContent.label);
        }
        if (dVar.E(fVar, 1) || !t.b(snippetContent.script, "")) {
            dVar.f(fVar, 1, snippetContent.script);
        }
        if (dVar.E(fVar, 2) || !snippetContent.autoClose) {
            dVar.u(fVar, 2, snippetContent.autoClose);
        }
        if (dVar.E(fVar, 3) || snippetContent.version != 1) {
            dVar.t(fVar, 3, snippetContent.version);
        }
        if (!dVar.E(fVar, 4) && t.b(snippetContent.scriptStructure, "")) {
            return;
        }
        dVar.f(fVar, 4, snippetContent.scriptStructure);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.script;
    }

    public final boolean component3() {
        return this.autoClose;
    }

    public final int component4() {
        return this.version;
    }

    public final String component5() {
        return this.scriptStructure;
    }

    public final SnippetContent copy(String str, String str2, boolean z10, int i10, String str3) {
        t.f(str, "label");
        t.f(str2, "script");
        t.f(str3, "scriptStructure");
        return new SnippetContent(str, str2, z10, i10, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetContent)) {
            return false;
        }
        SnippetContent snippetContent = (SnippetContent) obj;
        return t.b(this.label, snippetContent.label) && t.b(this.script, snippetContent.script) && this.autoClose == snippetContent.autoClose && this.version == snippetContent.version && t.b(this.scriptStructure, snippetContent.scriptStructure);
    }

    public final boolean getAutoClose() {
        return this.autoClose;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getScript() {
        return this.script;
    }

    public final String getScriptStructure() {
        return this.scriptStructure;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((this.label.hashCode() * 31) + this.script.hashCode()) * 31) + Boolean.hashCode(this.autoClose)) * 31) + Integer.hashCode(this.version)) * 31) + this.scriptStructure.hashCode();
    }

    public String toString() {
        return "SnippetContent(label=" + this.label + ", script=" + this.script + ", autoClose=" + this.autoClose + ", version=" + this.version + ", scriptStructure=" + this.scriptStructure + ")";
    }

    public /* synthetic */ SnippetContent(int i10, String str, String str2, boolean z10, int i11, String str3, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i10 & 2) == 0) {
            this.script = "";
        } else {
            this.script = str2;
        }
        if ((i10 & 4) == 0) {
            this.autoClose = true;
        } else {
            this.autoClose = z10;
        }
        if ((i10 & 8) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
        if ((i10 & 16) == 0) {
            this.scriptStructure = "";
        } else {
            this.scriptStructure = str3;
        }
    }

    public SnippetContent(String str, String str2, boolean z10, int i10, String str3) {
        t.f(str, "label");
        t.f(str2, "script");
        t.f(str3, "scriptStructure");
        this.label = str;
        this.script = str2;
        this.autoClose = z10;
        this.version = i10;
        this.scriptStructure = str3;
    }

    public /* synthetic */ SnippetContent(String str, String str2, boolean z10, int i10, String str3, int i11, k kVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? true : z10, (i11 & 8) != 0 ? 1 : i10, (i11 & 16) != 0 ? "" : str3);
    }
}
