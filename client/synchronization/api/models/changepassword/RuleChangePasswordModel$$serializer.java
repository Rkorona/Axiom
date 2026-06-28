package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.w0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class RuleChangePasswordModel$$serializer implements n0 {
    public static final int $stable;
    public static final RuleChangePasswordModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        RuleChangePasswordModel$$serializer ruleChangePasswordModel$$serializer = new RuleChangePasswordModel$$serializer();
        INSTANCE = ruleChangePasswordModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.RuleChangePasswordModel", ruleChangePasswordModel$$serializer, 10);
        i2Var.r("label", true);
        i2Var.r("pf_type", true);
        i2Var.r(Column.BOUND_ADDRESS, true);
        i2Var.r("hostname", true);
        i2Var.r(Column.LOCAL_PORT, true);
        i2Var.r(Column.REMOTE_PORT, true);
        i2Var.r("id", false);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        i2Var.r(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private RuleChangePasswordModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = iv.a.u(x2Var);
        c cVarU2 = iv.a.u(x2Var);
        c cVarU3 = iv.a.u(x2Var);
        c cVarU4 = iv.a.u(x2Var);
        w0 w0Var = w0.f64808a;
        c cVarU5 = iv.a.u(w0Var);
        c cVarU6 = iv.a.u(w0Var);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, cVarU2, cVarU3, cVarU4, cVarU5, cVarU6, h1Var, iv.a.u(i.f64704a), iv.a.u(h1Var), x2Var};
    }

    @Override // hv.b
    public final RuleChangePasswordModel deserialize(kv.e eVar) {
        int i10;
        Boolean bool;
        Long l10;
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        String str4;
        String strB;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 9;
        String str5 = null;
        if (cVarD.l()) {
            x2 x2Var = x2.f64817a;
            String str6 = (String) cVarD.v(fVar, 0, x2Var, null);
            String str7 = (String) cVarD.v(fVar, 1, x2Var, null);
            String str8 = (String) cVarD.v(fVar, 2, x2Var, null);
            String str9 = (String) cVarD.v(fVar, 3, x2Var, null);
            w0 w0Var = w0.f64808a;
            Integer num3 = (Integer) cVarD.v(fVar, 4, w0Var, null);
            Integer num4 = (Integer) cVarD.v(fVar, 5, w0Var, null);
            long jO = cVarD.o(fVar, 6);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 7, i.f64704a, null);
            Long l11 = (Long) cVarD.v(fVar, 8, h1.f64699a, null);
            str = str9;
            strB = cVarD.B(fVar, 9);
            bool = bool2;
            l10 = l11;
            num = num4;
            i10 = 1023;
            num2 = num3;
            str4 = str8;
            str3 = str7;
            str2 = str6;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Boolean bool3 = null;
            Long l12 = null;
            Integer num5 = null;
            Integer num6 = null;
            String str10 = null;
            String strB2 = null;
            long jO2 = 0;
            String str11 = null;
            String str12 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        break;
                    case 0:
                        str5 = (String) cVarD.v(fVar, 0, x2.f64817a, str5);
                        i12 |= 1;
                        i11 = 9;
                        break;
                    case 1:
                        str11 = (String) cVarD.v(fVar, 1, x2.f64817a, str11);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        str12 = (String) cVarD.v(fVar, 2, x2.f64817a, str12);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        str10 = (String) cVarD.v(fVar, 3, x2.f64817a, str10);
                        i12 |= 8;
                        i11 = 9;
                        break;
                    case 4:
                        num6 = (Integer) cVarD.v(fVar, 4, w0.f64808a, num6);
                        i12 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        num5 = (Integer) cVarD.v(fVar, 5, w0.f64808a, num5);
                        i12 |= 32;
                        i11 = 9;
                        break;
                    case 6:
                        jO2 = cVarD.o(fVar, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        bool3 = (Boolean) cVarD.v(fVar, 7, i.f64704a, bool3);
                        i12 |= 128;
                        break;
                    case 8:
                        l12 = (Long) cVarD.v(fVar, 8, h1.f64699a, l12);
                        i12 |= 256;
                        break;
                    case 9:
                        strB2 = cVarD.B(fVar, i11);
                        i12 |= File.FLAG_O_TRUNC;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i12;
            bool = bool3;
            l10 = l12;
            num = num5;
            num2 = num6;
            str = str10;
            str2 = str5;
            str3 = str11;
            str4 = str12;
            strB = strB2;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new RuleChangePasswordModel(i10, str2, str3, str4, str, num2, num, j10, bool, l10, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, RuleChangePasswordModel ruleChangePasswordModel) {
        t.f(fVar, "encoder");
        t.f(ruleChangePasswordModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        RuleChangePasswordModel.write$Self$Termius_app_googleProductionRelease(ruleChangePasswordModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
