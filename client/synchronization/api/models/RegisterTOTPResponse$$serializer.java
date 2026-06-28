package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i2;
import lv.n0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class RegisterTOTPResponse$$serializer implements n0 {
    public static final int $stable;
    public static final RegisterTOTPResponse$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        RegisterTOTPResponse$$serializer registerTOTPResponse$$serializer = new RegisterTOTPResponse$$serializer();
        INSTANCE = registerTOTPResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.RegisterTOTPResponse", registerTOTPResponse$$serializer, 3);
        i2Var.r("secret", false);
        i2Var.r("issuer", false);
        i2Var.r("account", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private RegisterTOTPResponse$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new hv.c[]{x2Var, x2Var, x2Var};
    }

    @Override // hv.b
    public final RegisterTOTPResponse deserialize(kv.e eVar) {
        String strB;
        String strB2;
        String str;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            String strB3 = cVarD.B(fVar, 1);
            strB2 = cVarD.B(fVar, 2);
            str = strB3;
            i10 = 7;
        } else {
            strB = null;
            String strB4 = null;
            String strB5 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    strB = cVarD.B(fVar, 0);
                    i11 |= 1;
                } else if (iD == 1) {
                    strB5 = cVarD.B(fVar, 1);
                    i11 |= 2;
                } else {
                    if (iD != 2) {
                        throw new e0(iD);
                    }
                    strB4 = cVarD.B(fVar, 2);
                    i11 |= 4;
                }
            }
            strB2 = strB4;
            str = strB5;
            i10 = i11;
        }
        String str2 = strB;
        cVarD.b(fVar);
        return new RegisterTOTPResponse(i10, str2, str, strB2, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, RegisterTOTPResponse registerTOTPResponse) {
        t.f(fVar, "encoder");
        t.f(registerTOTPResponse, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        RegisterTOTPResponse.write$Self$Termius_app_googleProductionRelease(registerTOTPResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
