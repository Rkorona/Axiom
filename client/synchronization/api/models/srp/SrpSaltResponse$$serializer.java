package com.server.auditor.ssh.client.synchronization.api.models.srp;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class SrpSaltResponse$$serializer implements n0 {
    public static final int $stable;
    public static final SrpSaltResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SrpSaltResponse$$serializer srpSaltResponse$$serializer = new SrpSaltResponse$$serializer();
        INSTANCE = srpSaltResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.srp.SrpSaltResponse", srpSaltResponse$$serializer, 2);
        i2Var.r("salt", false);
        i2Var.r("identifier", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private SrpSaltResponse$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, x2Var};
    }

    @Override // hv.b
    public final SrpSaltResponse deserialize(kv.e eVar) {
        String strB;
        String strB2;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            strB2 = cVarD.B(fVar, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strB = null;
            String strB3 = null;
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
                    strB3 = cVarD.B(fVar, 1);
                    i11 |= 2;
                }
            }
            strB2 = strB3;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new SrpSaltResponse(i10, strB, strB2, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SrpSaltResponse srpSaltResponse) {
        t.f(fVar, "encoder");
        t.f(srpSaltResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SrpSaltResponse.write$Self$Termius_app_googleProductionRelease(srpSaltResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
