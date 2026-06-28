package com.server.auditor.ssh.client.synchronization.api.models;

import hv.p;
import java.util.List;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TerminalShellAssistBadResponse {
    private final List<String> promptErrors;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.api.models.c
        @Override // iu.a
        public final Object a() {
            return TerminalShellAssistBadResponse._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return TerminalShellAssistBadResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TerminalShellAssistBadResponse(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, TerminalShellAssistBadResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.promptErrors = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TerminalShellAssistBadResponse copy$default(TerminalShellAssistBadResponse terminalShellAssistBadResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = terminalShellAssistBadResponse.promptErrors;
        }
        return terminalShellAssistBadResponse.copy(list);
    }

    @hv.o("prompt")
    public static /* synthetic */ void getPromptErrors$annotations() {
    }

    public final List<String> component1() {
        return this.promptErrors;
    }

    public final TerminalShellAssistBadResponse copy(List<String> list) {
        t.f(list, "promptErrors");
        return new TerminalShellAssistBadResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TerminalShellAssistBadResponse) && t.b(this.promptErrors, ((TerminalShellAssistBadResponse) obj).promptErrors);
    }

    public final List<String> getPromptErrors() {
        return this.promptErrors;
    }

    public int hashCode() {
        return this.promptErrors.hashCode();
    }

    public String toString() {
        return "TerminalShellAssistBadResponse(promptErrors=" + this.promptErrors + ")";
    }

    public TerminalShellAssistBadResponse(List<String> list) {
        t.f(list, "promptErrors");
        this.promptErrors = list;
    }
}
