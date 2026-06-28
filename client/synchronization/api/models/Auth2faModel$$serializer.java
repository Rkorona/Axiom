package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i2;
import lv.n0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class Auth2faModel$$serializer implements n0 {
    public static final int $stable;
    public static final Auth2faModel$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        Auth2faModel$$serializer auth2faModel$$serializer = new Auth2faModel$$serializer();
        INSTANCE = auth2faModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.Auth2faModel", auth2faModel$$serializer, 2);
        i2Var.r("security_token", false);
        i2Var.r(SyncConstants.Bundle.OTP_TOKEN, false);
        descriptor = i2Var;
        $stable = 8;
    }

    private Auth2faModel$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new hv.c[]{x2Var, x2Var};
    }

    @Override // hv.b
    public final Auth2faModel deserialize(kv.e eVar) {
        String strB;
        String strB2;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
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
        return new Auth2faModel(i10, strB, strB2, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, Auth2faModel auth2faModel) {
        t.f(fVar, "encoder");
        t.f(auth2faModel, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        Auth2faModel.write$Self$Termius_app_googleProductionRelease(auth2faModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
