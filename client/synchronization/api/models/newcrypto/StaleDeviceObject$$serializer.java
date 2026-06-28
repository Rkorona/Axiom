package com.server.auditor.ssh.client.synchronization.api.models.newcrypto;

import com.crystalnix.termius.libtermius.sftp.File;
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
import lv.w0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class StaleDeviceObject$$serializer implements n0 {
    public static final int $stable;
    public static final StaleDeviceObject$$serializer INSTANCE;
    private static final f descriptor;

    static {
        StaleDeviceObject$$serializer staleDeviceObject$$serializer = new StaleDeviceObject$$serializer();
        INSTANCE = staleDeviceObject$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.newcrypto.StaleDeviceObject", staleDeviceObject$$serializer, 11);
        i2Var.r("id", false);
        i2Var.r("latest_activity", true);
        i2Var.r("logoutable", false);
        i2Var.r(Column.MULTI_KEY_NAME, true);
        i2Var.r("sub_name", true);
        i2Var.r("token", true);
        i2Var.r("push_token", true);
        i2Var.r("mobile_type", true);
        i2Var.r("os_version", true);
        i2Var.r("app_version", true);
        i2Var.r("is_active", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private StaleDeviceObject$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = a.u(x2Var);
        c cVarU2 = a.u(x2Var);
        c cVarU3 = a.u(x2Var);
        c cVarU4 = a.u(x2Var);
        c cVarU5 = a.u(x2Var);
        c cVarU6 = a.u(x2Var);
        c cVarU7 = a.u(x2Var);
        c cVarU8 = a.u(x2Var);
        i iVar = i.f64704a;
        return new c[]{w0.f64808a, cVarU, iVar, cVarU2, cVarU3, cVarU4, cVarU5, cVarU6, cVarU7, cVarU8, iVar};
    }

    @Override // hv.b
    public final StaleDeviceObject deserialize(kv.e eVar) {
        int iE;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean zH;
        boolean z10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i10 = 10;
        int i11 = 9;
        int i12 = 0;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            x2 x2Var = x2.f64817a;
            String str9 = (String) cVarD.v(fVar, 1, x2Var, null);
            boolean zH2 = cVarD.H(fVar, 2);
            String str10 = (String) cVarD.v(fVar, 3, x2Var, null);
            String str11 = (String) cVarD.v(fVar, 4, x2Var, null);
            String str12 = (String) cVarD.v(fVar, 5, x2Var, null);
            String str13 = (String) cVarD.v(fVar, 6, x2Var, null);
            String str14 = (String) cVarD.v(fVar, 7, x2Var, null);
            String str15 = (String) cVarD.v(fVar, 8, x2Var, null);
            String str16 = (String) cVarD.v(fVar, 9, x2Var, null);
            i12 = 2047;
            zH = cVarD.H(fVar, 10);
            str2 = str16;
            str4 = str14;
            str6 = str13;
            str5 = str12;
            str8 = str10;
            str3 = str15;
            str7 = str11;
            z10 = zH2;
            str = str9;
        } else {
            boolean z11 = true;
            iE = 0;
            boolean zH3 = false;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            boolean zH4 = false;
            while (z11) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z11 = false;
                        i10 = 10;
                        i11 = 9;
                        break;
                    case 0:
                        iE = cVarD.e(fVar, 0);
                        i12 |= 1;
                        i10 = 10;
                        i11 = 9;
                        break;
                    case 1:
                        i12 |= 2;
                        str24 = (String) cVarD.v(fVar, 1, x2.f64817a, str24);
                        i10 = 10;
                        i11 = 9;
                        break;
                    case 2:
                        zH3 = cVarD.H(fVar, 2);
                        i12 |= 4;
                        i10 = 10;
                        break;
                    case 3:
                        str23 = (String) cVarD.v(fVar, 3, x2.f64817a, str23);
                        i12 |= 8;
                        i10 = 10;
                        break;
                    case 4:
                        str22 = (String) cVarD.v(fVar, 4, x2.f64817a, str22);
                        i12 |= 16;
                        i10 = 10;
                        break;
                    case 5:
                        str20 = (String) cVarD.v(fVar, 5, x2.f64817a, str20);
                        i12 |= 32;
                        i10 = 10;
                        break;
                    case 6:
                        str21 = (String) cVarD.v(fVar, 6, x2.f64817a, str21);
                        i12 |= 64;
                        i10 = 10;
                        break;
                    case 7:
                        str19 = (String) cVarD.v(fVar, 7, x2.f64817a, str19);
                        i12 |= 128;
                        i10 = 10;
                        break;
                    case 8:
                        str18 = (String) cVarD.v(fVar, 8, x2.f64817a, str18);
                        i12 |= 256;
                        i10 = 10;
                        break;
                    case 9:
                        str17 = (String) cVarD.v(fVar, i11, x2.f64817a, str17);
                        i12 |= File.FLAG_O_TRUNC;
                        break;
                    case 10:
                        zH4 = cVarD.H(fVar, i10);
                        i12 |= File.FLAG_O_APPEND;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            str = str24;
            str2 = str17;
            str3 = str18;
            str4 = str19;
            str5 = str20;
            str6 = str21;
            str7 = str22;
            str8 = str23;
            zH = zH4;
            z10 = zH3;
        }
        int i13 = iE;
        int i14 = i12;
        cVarD.b(fVar);
        return new StaleDeviceObject(i14, i13, str, z10, str8, str7, str5, str6, str4, str3, str2, zH, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, StaleDeviceObject staleDeviceObject) {
        t.f(fVar, "encoder");
        t.f(staleDeviceObject, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        StaleDeviceObject.write$Self$Termius_app_googleProductionRelease(staleDeviceObject, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
