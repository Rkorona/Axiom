package com.server.auditor.ssh.client.synchronization.api.models;

import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Table;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import java.util.ArrayList;
import ju.t;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class TerminalShellAssistMeta$$serializer implements n0 {
    public static final int $stable;
    public static final TerminalShellAssistMeta$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        TerminalShellAssistMeta$$serializer terminalShellAssistMeta$$serializer = new TerminalShellAssistMeta$$serializer();
        INSTANCE = terminalShellAssistMeta$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.TerminalShellAssistMeta", terminalShellAssistMeta$$serializer, 4);
        i2Var.r("os_name", true);
        i2Var.r(SshOptions.EXTRA_CONNECTION_TYPE, true);
        i2Var.r("shell_type", true);
        i2Var.r(Table.TAG, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private TerminalShellAssistMeta$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final hv.c[] childSerializers() {
        n[] nVarArr = TerminalShellAssistMeta.$childSerializers;
        x2 x2Var = x2.f64817a;
        return new hv.c[]{iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(x2Var), nVarArr[3].getValue()};
    }

    @Override // hv.b
    public final TerminalShellAssistMeta deserialize(kv.e eVar) {
        int i10;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = TerminalShellAssistMeta.$childSerializers;
        String str4 = null;
        if (cVarD.l()) {
            x2 x2Var = x2.f64817a;
            String str5 = (String) cVarD.v(fVar, 0, x2Var, null);
            String str6 = (String) cVarD.v(fVar, 1, x2Var, null);
            String str7 = (String) cVarD.v(fVar, 2, x2Var, null);
            arrayList = (ArrayList) cVarD.i(fVar, 3, (hv.b) nVarArr[3].getValue(), null);
            str3 = str7;
            i10 = 15;
            str2 = str6;
            str = str5;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str8 = null;
            String str9 = null;
            ArrayList arrayList2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    str4 = (String) cVarD.v(fVar, 0, x2.f64817a, str4);
                    i11 |= 1;
                } else if (iD == 1) {
                    str8 = (String) cVarD.v(fVar, 1, x2.f64817a, str8);
                    i11 |= 2;
                } else if (iD == 2) {
                    str9 = (String) cVarD.v(fVar, 2, x2.f64817a, str9);
                    i11 |= 4;
                } else {
                    if (iD != 3) {
                        throw new e0(iD);
                    }
                    arrayList2 = (ArrayList) cVarD.i(fVar, 3, (hv.b) nVarArr[3].getValue(), arrayList2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = str4;
            str2 = str8;
            str3 = str9;
            arrayList = arrayList2;
        }
        cVarD.b(fVar);
        return new TerminalShellAssistMeta(i10, str, str2, str3, arrayList, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TerminalShellAssistMeta terminalShellAssistMeta) {
        t.f(fVar, "encoder");
        t.f(terminalShellAssistMeta, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        TerminalShellAssistMeta.write$Self$Termius_app_googleProductionRelease(terminalShellAssistMeta, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
