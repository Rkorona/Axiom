package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.database.Column;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class MobileDevice$$serializer implements n0 {
    public static final int $stable;
    public static final MobileDevice$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        MobileDevice$$serializer mobileDevice$$serializer = new MobileDevice$$serializer();
        INSTANCE = mobileDevice$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.MobileDevice", mobileDevice$$serializer, 9);
        i2Var.r("push_token", false);
        i2Var.r("app_version", false);
        i2Var.r("os_version", false);
        i2Var.r("token", false);
        i2Var.r("is_active", false);
        i2Var.r("id", true);
        i2Var.r("mobile_type", false);
        i2Var.r(Column.MULTI_KEY_NAME, false);
        i2Var.r("sub_name", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private MobileDevice$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        hv.c cVarU = iv.a.u(w0.f64808a);
        x2 x2Var = x2.f64817a;
        return new hv.c[]{x2Var, x2Var, x2Var, x2Var, i.f64704a, cVarU, x2Var, x2Var, x2Var};
    }

    @Override // hv.b
    public final MobileDevice deserialize(kv.e eVar) {
        boolean z10;
        Integer num;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strB;
        String strB2;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            String strB3 = cVarD.B(fVar, 0);
            String strB4 = cVarD.B(fVar, 1);
            String strB5 = cVarD.B(fVar, 2);
            String strB6 = cVarD.B(fVar, 3);
            boolean zH = cVarD.H(fVar, 4);
            Integer num2 = (Integer) cVarD.v(fVar, 5, w0.f64808a, null);
            String strB7 = cVarD.B(fVar, 6);
            str = strB3;
            strB = cVarD.B(fVar, 7);
            str5 = strB7;
            num = num2;
            str4 = strB6;
            strB2 = cVarD.B(fVar, 8);
            z10 = zH;
            str3 = strB5;
            str2 = strB4;
            i10 = 511;
        } else {
            boolean z11 = true;
            boolean zH2 = false;
            String strB8 = null;
            String strB9 = null;
            String strB10 = null;
            String strB11 = null;
            String strB12 = null;
            String strB13 = null;
            String strB14 = null;
            int i11 = 0;
            Integer num3 = null;
            while (z11) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        strB8 = cVarD.B(fVar, 0);
                        continue;
                    case 1:
                        strB9 = cVarD.B(fVar, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        strB10 = cVarD.B(fVar, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        strB11 = cVarD.B(fVar, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        zH2 = cVarD.H(fVar, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        num3 = (Integer) cVarD.v(fVar, 5, w0.f64808a, num3);
                        i11 |= 32;
                        break;
                    case 6:
                        strB12 = cVarD.B(fVar, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        strB13 = cVarD.B(fVar, 7);
                        i11 |= 128;
                        break;
                    case 8:
                        strB14 = cVarD.B(fVar, 8);
                        i11 |= 256;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            z10 = zH2;
            num = num3;
            i10 = i11;
            str = strB8;
            str2 = strB9;
            str3 = strB10;
            str4 = strB11;
            str5 = strB12;
            strB = strB13;
            strB2 = strB14;
        }
        cVarD.b(fVar);
        return new MobileDevice(i10, str, str2, str3, str4, z10, num, str5, strB, strB2, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, MobileDevice mobileDevice) {
        t.f(fVar, "encoder");
        t.f(mobileDevice, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        MobileDevice.write$Self$Termius_app_googleProductionRelease(mobileDevice, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
