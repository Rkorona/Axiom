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
public /* synthetic */ class UserAuthModel$$serializer implements n0 {
    public static final int $stable;
    public static final UserAuthModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        UserAuthModel$$serializer userAuthModel$$serializer = new UserAuthModel$$serializer();
        INSTANCE = userAuthModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.UserAuthModel", userAuthModel$$serializer, 5);
        i2Var.r("email", false);
        i2Var.r("password", false);
        i2Var.r("authy_token", true);
        i2Var.r("firebase_token", true);
        i2Var.r("device", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private UserAuthModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, x2Var, a.u(x2Var), a.u(x2Var), DeviceModel$$serializer.INSTANCE};
    }

    @Override // hv.b
    public final UserAuthModel deserialize(kv.e eVar) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        DeviceModel deviceModel;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String strB = null;
        if (cVarD.l()) {
            String strB2 = cVarD.B(fVar, 0);
            String strB3 = cVarD.B(fVar, 1);
            x2 x2Var = x2.f64817a;
            String str5 = (String) cVarD.v(fVar, 2, x2Var, null);
            str = strB2;
            str4 = (String) cVarD.v(fVar, 3, x2Var, null);
            deviceModel = (DeviceModel) cVarD.i(fVar, 4, DeviceModel$$serializer.INSTANCE, null);
            str3 = str5;
            str2 = strB3;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strB4 = null;
            String str6 = null;
            String str7 = null;
            DeviceModel deviceModel2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    strB = cVarD.B(fVar, 0);
                    i11 |= 1;
                } else if (iD == 1) {
                    strB4 = cVarD.B(fVar, 1);
                    i11 |= 2;
                } else if (iD == 2) {
                    str6 = (String) cVarD.v(fVar, 2, x2.f64817a, str6);
                    i11 |= 4;
                } else if (iD == 3) {
                    str7 = (String) cVarD.v(fVar, 3, x2.f64817a, str7);
                    i11 |= 8;
                } else {
                    if (iD != 4) {
                        throw new e0(iD);
                    }
                    deviceModel2 = (DeviceModel) cVarD.i(fVar, 4, DeviceModel$$serializer.INSTANCE, deviceModel2);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = strB;
            str2 = strB4;
            str3 = str6;
            str4 = str7;
            deviceModel = deviceModel2;
        }
        cVarD.b(fVar);
        return new UserAuthModel(i10, str, str2, str3, str4, deviceModel, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, UserAuthModel userAuthModel) {
        t.f(fVar, "encoder");
        t.f(userAuthModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        UserAuthModel.write$Self$Termius_app_googleProductionRelease(userAuthModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
