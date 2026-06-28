package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class DeviceModel$$serializer implements n0 {
    public static final int $stable;
    public static final DeviceModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        DeviceModel$$serializer deviceModel$$serializer = new DeviceModel$$serializer();
        INSTANCE = deviceModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.DeviceModel", deviceModel$$serializer, 8);
        i2Var.r(Column.MULTI_KEY_NAME, false);
        i2Var.r("sub_name", true);
        i2Var.r("token", false);
        i2Var.r("push_token", true);
        i2Var.r("mobile_type", false);
        i2Var.r("os_version", true);
        i2Var.r("app_version", true);
        i2Var.r("is_active", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private DeviceModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, a.u(x2Var), x2Var, a.u(x2Var), x2Var, a.u(x2Var), a.u(x2Var), a.u(i.f64704a)};
    }

    @Override // hv.b
    public final DeviceModel deserialize(kv.e eVar) {
        int i10;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        char c10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 7;
        int i12 = 6;
        String strB = null;
        if (cVarD.l()) {
            String strB2 = cVarD.B(fVar, 0);
            x2 x2Var = x2.f64817a;
            String str8 = (String) cVarD.v(fVar, 1, x2Var, null);
            String strB3 = cVarD.B(fVar, 2);
            String str9 = (String) cVarD.v(fVar, 3, x2Var, null);
            String strB4 = cVarD.B(fVar, 4);
            String str10 = (String) cVarD.v(fVar, 5, x2Var, null);
            String str11 = (String) cVarD.v(fVar, 6, x2Var, null);
            str3 = strB2;
            bool = (Boolean) cVarD.v(fVar, 7, i.f64704a, null);
            str = str11;
            str2 = str10;
            str6 = str9;
            str7 = strB4;
            str5 = strB3;
            str4 = str8;
            i10 = 255;
        } else {
            boolean z10 = true;
            int i13 = 0;
            Boolean bool2 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String strB5 = null;
            String str15 = null;
            String strB6 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 7;
                        break;
                    case 0:
                        strB = cVarD.B(fVar, 0);
                        i13 |= 1;
                        i11 = 7;
                        i12 = 6;
                        break;
                    case 1:
                        str14 = (String) cVarD.v(fVar, 1, x2.f64817a, str14);
                        i13 |= 2;
                        i11 = 7;
                        i12 = 6;
                        break;
                    case 2:
                        c10 = 3;
                        strB5 = cVarD.B(fVar, 2);
                        i13 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        c10 = 3;
                        str15 = (String) cVarD.v(fVar, 3, x2.f64817a, str15);
                        i13 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        strB6 = cVarD.B(fVar, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        str13 = (String) cVarD.v(fVar, 5, x2.f64817a, str13);
                        i13 |= 32;
                        break;
                    case 6:
                        str12 = (String) cVarD.v(fVar, i12, x2.f64817a, str12);
                        i13 |= 64;
                        break;
                    case 7:
                        bool2 = (Boolean) cVarD.v(fVar, i11, i.f64704a, bool2);
                        i13 |= 128;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i13;
            bool = bool2;
            str = str12;
            str2 = str13;
            str3 = strB;
            str4 = str14;
            str5 = strB5;
            str6 = str15;
            str7 = strB6;
        }
        cVarD.b(fVar);
        return new DeviceModel(i10, str3, str4, str5, str6, str7, str2, str, bool, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, DeviceModel deviceModel) {
        t.f(fVar, "encoder");
        t.f(deviceModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        DeviceModel.write$Self$Termius_app_googleProductionRelease(deviceModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
