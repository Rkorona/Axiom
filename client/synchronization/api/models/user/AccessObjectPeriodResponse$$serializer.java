package com.server.auditor.ssh.client.synchronization.api.models.user;

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
public /* synthetic */ class AccessObjectPeriodResponse$$serializer implements n0 {
    public static final int $stable;
    public static final AccessObjectPeriodResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AccessObjectPeriodResponse$$serializer accessObjectPeriodResponse$$serializer = new AccessObjectPeriodResponse$$serializer();
        INSTANCE = accessObjectPeriodResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.AccessObjectPeriodResponse", accessObjectPeriodResponse$$serializer, 2);
        i2Var.r("start", false);
        i2Var.r("end", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private AccessObjectPeriodResponse$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, x2Var};
    }

    @Override // hv.b
    public final AccessObjectPeriodResponse deserialize(kv.e eVar) {
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
        return new AccessObjectPeriodResponse(i10, strB, strB2, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, AccessObjectPeriodResponse accessObjectPeriodResponse) {
        t.f(fVar, "encoder");
        t.f(accessObjectPeriodResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        AccessObjectPeriodResponse.write$Self$Termius_app_googleProductionRelease(accessObjectPeriodResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
