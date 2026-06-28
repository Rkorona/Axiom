package com.server.auditor.ssh.client.synchronization.api.models;

import com.crystalnix.termius.libtermius.sftp.File;
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
public /* synthetic */ class UserActiveDeviceResponse$$serializer implements n0 {
    public static final int $stable;
    public static final UserActiveDeviceResponse$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        UserActiveDeviceResponse$$serializer userActiveDeviceResponse$$serializer = new UserActiveDeviceResponse$$serializer();
        INSTANCE = userActiveDeviceResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.UserActiveDeviceResponse", userActiveDeviceResponse$$serializer, 10);
        i2Var.r("id", false);
        i2Var.r("latest_activity", true);
        i2Var.r("logoutable", true);
        i2Var.r(Column.MULTI_KEY_NAME, false);
        i2Var.r("sub_name", true);
        i2Var.r("token", false);
        i2Var.r("push_token", true);
        i2Var.r("mobile_type", false);
        i2Var.r("os_version", true);
        i2Var.r("app_version", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private UserActiveDeviceResponse$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new hv.c[]{w0.f64808a, iv.a.u(x2Var), iv.a.u(i.f64704a), x2Var, iv.a.u(x2Var), x2Var, iv.a.u(x2Var), UserDeviceTypeSerializer.INSTANCE, iv.a.u(x2Var), iv.a.u(x2Var)};
    }

    @Override // hv.b
    public final UserActiveDeviceResponse deserialize(kv.e eVar) {
        int iE;
        String str;
        String str2;
        UserDeviceType userDeviceType;
        String str3;
        String str4;
        int i10;
        String str5;
        Boolean bool;
        String str6;
        String str7;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 9;
        int i12 = 7;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            x2 x2Var = x2.f64817a;
            String str8 = (String) cVarD.v(fVar, 1, x2Var, null);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 2, i.f64704a, null);
            String strB = cVarD.B(fVar, 3);
            String str9 = (String) cVarD.v(fVar, 4, x2Var, null);
            String strB2 = cVarD.B(fVar, 5);
            String str10 = (String) cVarD.v(fVar, 6, x2Var, null);
            UserDeviceType userDeviceType2 = (UserDeviceType) cVarD.i(fVar, 7, UserDeviceTypeSerializer.INSTANCE, null);
            String str11 = (String) cVarD.v(fVar, 8, x2Var, null);
            str2 = (String) cVarD.v(fVar, 9, x2Var, null);
            userDeviceType = userDeviceType2;
            str3 = str10;
            str7 = strB2;
            str6 = strB;
            str = str11;
            str4 = str9;
            bool = bool2;
            str5 = str8;
            i10 = 1023;
        } else {
            boolean z10 = true;
            iE = 0;
            String str12 = null;
            String str13 = null;
            UserDeviceType userDeviceType3 = null;
            String str14 = null;
            String str15 = null;
            Boolean bool3 = null;
            String strB3 = null;
            String strB4 = null;
            int i13 = 0;
            String str16 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        break;
                    case 0:
                        iE = cVarD.e(fVar, 0);
                        i13 |= 1;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 1:
                        str15 = (String) cVarD.v(fVar, 1, x2.f64817a, str15);
                        i13 |= 2;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 2:
                        bool3 = (Boolean) cVarD.v(fVar, 2, i.f64704a, bool3);
                        i13 |= 4;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 3:
                        strB3 = cVarD.B(fVar, 3);
                        i13 |= 8;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 4:
                        str16 = (String) cVarD.v(fVar, 4, x2.f64817a, str16);
                        i13 |= 16;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 5:
                        strB4 = cVarD.B(fVar, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        str14 = (String) cVarD.v(fVar, 6, x2.f64817a, str14);
                        i13 |= 64;
                        break;
                    case 7:
                        userDeviceType3 = (UserDeviceType) cVarD.i(fVar, i12, UserDeviceTypeSerializer.INSTANCE, userDeviceType3);
                        i13 |= 128;
                        break;
                    case 8:
                        str12 = (String) cVarD.v(fVar, 8, x2.f64817a, str12);
                        i13 |= 256;
                        break;
                    case 9:
                        str13 = (String) cVarD.v(fVar, i11, x2.f64817a, str13);
                        i13 |= File.FLAG_O_TRUNC;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            str = str12;
            str2 = str13;
            userDeviceType = userDeviceType3;
            str3 = str14;
            str4 = str16;
            i10 = i13;
            str5 = str15;
            bool = bool3;
            str6 = strB3;
            str7 = strB4;
        }
        int i14 = iE;
        cVarD.b(fVar);
        return new UserActiveDeviceResponse(i10, i14, str5, bool, str6, str4, str7, str3, userDeviceType, str, str2, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, UserActiveDeviceResponse userActiveDeviceResponse) {
        t.f(fVar, "encoder");
        t.f(userActiveDeviceResponse, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        UserActiveDeviceResponse.write$Self$Termius_app_googleProductionRelease(userActiveDeviceResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
