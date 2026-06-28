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
public /* synthetic */ class CheckEmailModel$$serializer implements n0 {
    public static final int $stable;
    public static final CheckEmailModel$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        CheckEmailModel$$serializer checkEmailModel$$serializer = new CheckEmailModel$$serializer();
        INSTANCE = checkEmailModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.CheckEmailModel", checkEmailModel$$serializer, 2);
        i2Var.r("email", false);
        i2Var.r("recaptcha", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private CheckEmailModel$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new hv.c[]{x2Var, iv.a.u(x2Var)};
    }

    @Override // hv.b
    public final CheckEmailModel deserialize(kv.e eVar) {
        String strB;
        String str;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            str = (String) cVarD.v(fVar, 1, x2.f64817a, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strB = null;
            String str2 = null;
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
                    str2 = (String) cVarD.v(fVar, 1, x2.f64817a, str2);
                    i11 |= 2;
                }
            }
            str = str2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new CheckEmailModel(i10, strB, str, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, CheckEmailModel checkEmailModel) {
        t.f(fVar, "encoder");
        t.f(checkEmailModel, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        CheckEmailModel.write$Self$Termius_app_googleProductionRelease(checkEmailModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
