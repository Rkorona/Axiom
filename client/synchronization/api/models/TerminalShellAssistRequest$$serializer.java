package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class TerminalShellAssistRequest$$serializer implements n0 {
    public static final int $stable;
    public static final TerminalShellAssistRequest$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        TerminalShellAssistRequest$$serializer terminalShellAssistRequest$$serializer = new TerminalShellAssistRequest$$serializer();
        INSTANCE = terminalShellAssistRequest$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.TerminalShellAssistRequest", terminalShellAssistRequest$$serializer, 2);
        i2Var.r("prompt", false);
        i2Var.r("meta", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private TerminalShellAssistRequest$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{x2.f64817a, iv.a.u(TerminalShellAssistMeta$$serializer.INSTANCE)};
    }

    @Override // hv.b
    public final TerminalShellAssistRequest deserialize(kv.e eVar) {
        String strB;
        TerminalShellAssistMeta terminalShellAssistMeta;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            terminalShellAssistMeta = (TerminalShellAssistMeta) cVarD.v(fVar, 1, TerminalShellAssistMeta$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strB = null;
            TerminalShellAssistMeta terminalShellAssistMeta2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    strB = cVarD.B(fVar, 0);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    terminalShellAssistMeta2 = (TerminalShellAssistMeta) cVarD.v(fVar, 1, TerminalShellAssistMeta$$serializer.INSTANCE, terminalShellAssistMeta2);
                    i11 |= 2;
                }
            }
            terminalShellAssistMeta = terminalShellAssistMeta2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new TerminalShellAssistRequest(i10, strB, terminalShellAssistMeta, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TerminalShellAssistRequest terminalShellAssistRequest) {
        t.f(fVar, "encoder");
        t.f(terminalShellAssistRequest, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        TerminalShellAssistRequest.write$Self$Termius_app_googleProductionRelease(terminalShellAssistRequest, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
