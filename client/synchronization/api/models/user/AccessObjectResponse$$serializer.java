package com.server.auditor.ssh.client.synchronization.api.models.user;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class AccessObjectResponse$$serializer implements n0 {
    public static final int $stable;
    public static final AccessObjectResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AccessObjectResponse$$serializer accessObjectResponse$$serializer = new AccessObjectResponse$$serializer();
        INSTANCE = accessObjectResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.AccessObjectResponse", accessObjectResponse$$serializer, 2);
        i2Var.r("period", true);
        i2Var.r("title", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private AccessObjectResponse$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{a.u(AccessObjectPeriodResponse$$serializer.INSTANCE), x2.f64817a};
    }

    @Override // hv.b
    public final AccessObjectResponse deserialize(kv.e eVar) {
        AccessObjectPeriodResponse accessObjectPeriodResponse;
        String strB;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            accessObjectPeriodResponse = (AccessObjectPeriodResponse) cVarD.v(fVar, 0, AccessObjectPeriodResponse$$serializer.INSTANCE, null);
            strB = cVarD.B(fVar, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            accessObjectPeriodResponse = null;
            String strB2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    accessObjectPeriodResponse = (AccessObjectPeriodResponse) cVarD.v(fVar, 0, AccessObjectPeriodResponse$$serializer.INSTANCE, accessObjectPeriodResponse);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    strB2 = cVarD.B(fVar, 1);
                    i11 |= 2;
                }
            }
            strB = strB2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new AccessObjectResponse(i10, accessObjectPeriodResponse, strB, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, AccessObjectResponse accessObjectResponse) {
        t.f(fVar, "encoder");
        t.f(accessObjectResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        AccessObjectResponse.write$Self$Termius_app_googleProductionRelease(accessObjectResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
