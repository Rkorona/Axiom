package com.server.auditor.ssh.client.synchronization.api.models;

import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Table;
import hv.p;
import java.util.ArrayList;
import ju.k;
import ju.t;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TerminalShellAssistMeta {
    private final String connectionType;
    private final String osName;
    private final String shellType;
    private final ArrayList<String> tags;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, null, o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.api.models.d
        @Override // iu.a
        public final Object a() {
            return TerminalShellAssistMeta._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return TerminalShellAssistMeta$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public TerminalShellAssistMeta() {
        this((String) null, (String) null, (String) null, (ArrayList) null, 15, (k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TerminalShellAssistMeta copy$default(TerminalShellAssistMeta terminalShellAssistMeta, String str, String str2, String str3, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalShellAssistMeta.osName;
        }
        if ((i10 & 2) != 0) {
            str2 = terminalShellAssistMeta.connectionType;
        }
        if ((i10 & 4) != 0) {
            str3 = terminalShellAssistMeta.shellType;
        }
        if ((i10 & 8) != 0) {
            arrayList = terminalShellAssistMeta.tags;
        }
        return terminalShellAssistMeta.copy(str, str2, str3, arrayList);
    }

    @hv.o(SshOptions.EXTRA_CONNECTION_TYPE)
    public static /* synthetic */ void getConnectionType$annotations() {
    }

    @hv.o("os_name")
    public static /* synthetic */ void getOsName$annotations() {
    }

    @hv.o("shell_type")
    public static /* synthetic */ void getShellType$annotations() {
    }

    @hv.o(Table.TAG)
    public static /* synthetic */ void getTags$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TerminalShellAssistMeta terminalShellAssistMeta, kv.d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || terminalShellAssistMeta.osName != null) {
            dVar.v(fVar, 0, x2.f64817a, terminalShellAssistMeta.osName);
        }
        if (dVar.E(fVar, 1) || terminalShellAssistMeta.connectionType != null) {
            dVar.v(fVar, 1, x2.f64817a, terminalShellAssistMeta.connectionType);
        }
        if (dVar.E(fVar, 2) || terminalShellAssistMeta.shellType != null) {
            dVar.v(fVar, 2, x2.f64817a, terminalShellAssistMeta.shellType);
        }
        if (!dVar.E(fVar, 3) && t.b(terminalShellAssistMeta.tags, new ArrayList())) {
            return;
        }
        dVar.o(fVar, 3, (hv.r) nVarArr[3].getValue(), terminalShellAssistMeta.tags);
    }

    public final String component1() {
        return this.osName;
    }

    public final String component2() {
        return this.connectionType;
    }

    public final String component3() {
        return this.shellType;
    }

    public final ArrayList<String> component4() {
        return this.tags;
    }

    public final TerminalShellAssistMeta copy(String str, String str2, String str3, ArrayList<String> arrayList) {
        t.f(arrayList, Table.TAG);
        return new TerminalShellAssistMeta(str, str2, str3, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TerminalShellAssistMeta)) {
            return false;
        }
        TerminalShellAssistMeta terminalShellAssistMeta = (TerminalShellAssistMeta) obj;
        return t.b(this.osName, terminalShellAssistMeta.osName) && t.b(this.connectionType, terminalShellAssistMeta.connectionType) && t.b(this.shellType, terminalShellAssistMeta.shellType) && t.b(this.tags, terminalShellAssistMeta.tags);
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getShellType() {
        return this.shellType;
    }

    public final ArrayList<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        String str = this.osName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.connectionType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shellType;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.tags.hashCode();
    }

    public String toString() {
        return "TerminalShellAssistMeta(osName=" + this.osName + ", connectionType=" + this.connectionType + ", shellType=" + this.shellType + ", tags=" + this.tags + ")";
    }

    public /* synthetic */ TerminalShellAssistMeta(int i10, String str, String str2, String str3, ArrayList arrayList, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.osName = null;
        } else {
            this.osName = str;
        }
        if ((i10 & 2) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = str2;
        }
        if ((i10 & 4) == 0) {
            this.shellType = null;
        } else {
            this.shellType = str3;
        }
        if ((i10 & 8) == 0) {
            this.tags = new ArrayList<>();
        } else {
            this.tags = arrayList;
        }
    }

    public TerminalShellAssistMeta(String str, String str2, String str3, ArrayList<String> arrayList) {
        t.f(arrayList, Table.TAG);
        this.osName = str;
        this.connectionType = str2;
        this.shellType = str3;
        this.tags = arrayList;
    }

    public /* synthetic */ TerminalShellAssistMeta(String str, String str2, String str3, ArrayList arrayList, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? new ArrayList() : arrayList);
    }
}
