package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import hv.r;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.t;
import lv.i2;
import lv.n0;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class TerminalShellAssistBadResponse$$serializer implements n0 {
    public static final int $stable;
    public static final TerminalShellAssistBadResponse$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        TerminalShellAssistBadResponse$$serializer terminalShellAssistBadResponse$$serializer = new TerminalShellAssistBadResponse$$serializer();
        INSTANCE = terminalShellAssistBadResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.TerminalShellAssistBadResponse", terminalShellAssistBadResponse$$serializer, 1);
        i2Var.r("prompt", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private TerminalShellAssistBadResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{TerminalShellAssistBadResponse.$childSerializers[0].getValue()};
    }

    @Override // hv.b
    public final TerminalShellAssistBadResponse deserialize(kv.e eVar) {
        List list;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = TerminalShellAssistBadResponse.$childSerializers;
        int i10 = 1;
        if (cVarD.l()) {
            list = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    list2 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list2);
                    i11 = 1;
                }
            }
            list = list2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new TerminalShellAssistBadResponse(i10, list, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TerminalShellAssistBadResponse terminalShellAssistBadResponse) {
        t.f(fVar, "encoder");
        t.f(terminalShellAssistBadResponse, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        dVarD.o(fVar2, 0, (r) TerminalShellAssistBadResponse.$childSerializers[0].getValue(), terminalShellAssistBadResponse.promptErrors);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
