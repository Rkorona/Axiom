package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TerminalShellAssistRequest {
    private final TerminalShellAssistMeta meta;
    private final String prompt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return TerminalShellAssistRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TerminalShellAssistRequest(int i10, String str, TerminalShellAssistMeta terminalShellAssistMeta, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, TerminalShellAssistRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.prompt = str;
        if ((i10 & 2) == 0) {
            this.meta = null;
        } else {
            this.meta = terminalShellAssistMeta;
        }
    }

    public static /* synthetic */ TerminalShellAssistRequest copy$default(TerminalShellAssistRequest terminalShellAssistRequest, String str, TerminalShellAssistMeta terminalShellAssistMeta, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalShellAssistRequest.prompt;
        }
        if ((i10 & 2) != 0) {
            terminalShellAssistMeta = terminalShellAssistRequest.meta;
        }
        return terminalShellAssistRequest.copy(str, terminalShellAssistMeta);
    }

    @o("meta")
    public static /* synthetic */ void getMeta$annotations() {
    }

    @o("prompt")
    public static /* synthetic */ void getPrompt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TerminalShellAssistRequest terminalShellAssistRequest, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, terminalShellAssistRequest.prompt);
        if (!dVar.E(fVar, 1) && terminalShellAssistRequest.meta == null) {
            return;
        }
        dVar.v(fVar, 1, TerminalShellAssistMeta$$serializer.INSTANCE, terminalShellAssistRequest.meta);
    }

    public final String component1() {
        return this.prompt;
    }

    public final TerminalShellAssistMeta component2() {
        return this.meta;
    }

    public final TerminalShellAssistRequest copy(String str, TerminalShellAssistMeta terminalShellAssistMeta) {
        t.f(str, "prompt");
        return new TerminalShellAssistRequest(str, terminalShellAssistMeta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TerminalShellAssistRequest)) {
            return false;
        }
        TerminalShellAssistRequest terminalShellAssistRequest = (TerminalShellAssistRequest) obj;
        return t.b(this.prompt, terminalShellAssistRequest.prompt) && t.b(this.meta, terminalShellAssistRequest.meta);
    }

    public final TerminalShellAssistMeta getMeta() {
        return this.meta;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public int hashCode() {
        int iHashCode = this.prompt.hashCode() * 31;
        TerminalShellAssistMeta terminalShellAssistMeta = this.meta;
        return iHashCode + (terminalShellAssistMeta == null ? 0 : terminalShellAssistMeta.hashCode());
    }

    public String toString() {
        return "TerminalShellAssistRequest(prompt=" + this.prompt + ", meta=" + this.meta + ")";
    }

    public TerminalShellAssistRequest(String str, TerminalShellAssistMeta terminalShellAssistMeta) {
        t.f(str, "prompt");
        this.prompt = str;
        this.meta = terminalShellAssistMeta;
    }

    public /* synthetic */ TerminalShellAssistRequest(String str, TerminalShellAssistMeta terminalShellAssistMeta, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : terminalShellAssistMeta);
    }
}
