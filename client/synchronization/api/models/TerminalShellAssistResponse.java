package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TerminalShellAssistResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String result;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return TerminalShellAssistResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TerminalShellAssistResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, TerminalShellAssistResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.result = str;
    }

    public static /* synthetic */ TerminalShellAssistResponse copy$default(TerminalShellAssistResponse terminalShellAssistResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalShellAssistResponse.result;
        }
        return terminalShellAssistResponse.copy(str);
    }

    @o("result")
    public static /* synthetic */ void getResult$annotations() {
    }

    public final String component1() {
        return this.result;
    }

    public final TerminalShellAssistResponse copy(String str) {
        t.f(str, "result");
        return new TerminalShellAssistResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TerminalShellAssistResponse) && t.b(this.result, ((TerminalShellAssistResponse) obj).result);
    }

    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "TerminalShellAssistResponse(result=" + this.result + ")";
    }

    public TerminalShellAssistResponse(String str) {
        t.f(str, "result");
        this.result = str;
    }
}
