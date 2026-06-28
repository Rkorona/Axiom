package com.server.auditor.ssh.client.synchronization.api.models.history;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class HostInteractionModel$$serializer implements n0 {
    public static final int $stable;
    public static final HostInteractionModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        HostInteractionModel$$serializer hostInteractionModel$$serializer = new HostInteractionModel$$serializer();
        INSTANCE = hostInteractionModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.history.HostInteractionModel", hostInteractionModel$$serializer, 2);
        i2Var.r("host", false);
        i2Var.r("last_interacted_at", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private HostInteractionModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{h1.f64699a, x2.f64817a};
    }

    @Override // hv.b
    public final HostInteractionModel deserialize(kv.e eVar) {
        String strB;
        int i10;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            long jO = cVarD.o(fVar, 0);
            strB = cVarD.B(fVar, 1);
            i10 = 3;
            j10 = jO;
        } else {
            strB = null;
            boolean z10 = true;
            long jO2 = 0;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    jO2 = cVarD.o(fVar, 0);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    strB = cVarD.B(fVar, 1);
                    i11 |= 2;
                }
            }
            i10 = i11;
            j10 = jO2;
        }
        String str = strB;
        cVarD.b(fVar);
        return new HostInteractionModel(i10, j10, str, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, HostInteractionModel hostInteractionModel) {
        t.f(fVar, "encoder");
        t.f(hostInteractionModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        HostInteractionModel.write$Self$Termius_app_googleProductionRelease(hostInteractionModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
