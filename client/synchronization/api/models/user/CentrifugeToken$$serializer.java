package com.server.auditor.ssh.client.synchronization.api.models.user;

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
public /* synthetic */ class CentrifugeToken$$serializer implements n0 {
    public static final int $stable;
    public static final CentrifugeToken$$serializer INSTANCE;
    private static final f descriptor;

    static {
        CentrifugeToken$$serializer centrifugeToken$$serializer = new CentrifugeToken$$serializer();
        INSTANCE = centrifugeToken$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.CentrifugeToken", centrifugeToken$$serializer, 2);
        i2Var.r("token", false);
        i2Var.r("client_id", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private CentrifugeToken$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{x2.f64817a, h1.f64699a};
    }

    @Override // hv.b
    public final CentrifugeToken deserialize(kv.e eVar) {
        String strB;
        long jO;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            jO = cVarD.o(fVar, 1);
            i10 = 3;
        } else {
            strB = null;
            long jO2 = 0;
            boolean z10 = true;
            int i11 = 0;
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
                    jO2 = cVarD.o(fVar, 1);
                    i11 |= 2;
                }
            }
            jO = jO2;
            i10 = i11;
        }
        String str = strB;
        cVarD.b(fVar);
        return new CentrifugeToken(i10, str, jO, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, CentrifugeToken centrifugeToken) {
        t.f(fVar, "encoder");
        t.f(centrifugeToken, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        CentrifugeToken.write$Self$Termius_app_googleProductionRelease(centrifugeToken, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
