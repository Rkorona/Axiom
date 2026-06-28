package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

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
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class KnownHostChangePasswordModel$$serializer implements n0 {
    public static final int $stable;
    public static final KnownHostChangePasswordModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        KnownHostChangePasswordModel$$serializer knownHostChangePasswordModel$$serializer = new KnownHostChangePasswordModel$$serializer();
        INSTANCE = knownHostChangePasswordModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.KnownHostChangePasswordModel", knownHostChangePasswordModel$$serializer, 6);
        i2Var.r(Column.HOSTNAMES, true);
        i2Var.r(SerializableEvent.KEY_FIELD, true);
        i2Var.r("id", false);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        i2Var.r(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private KnownHostChangePasswordModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = iv.a.u(x2Var);
        c cVarU2 = iv.a.u(x2Var);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, cVarU2, h1Var, iv.a.u(i.f64704a), iv.a.u(h1Var), x2Var};
    }

    @Override // hv.b
    public final KnownHostChangePasswordModel deserialize(kv.e eVar) {
        int i10;
        String str;
        long j10;
        String str2;
        Boolean bool;
        Long l10;
        String strB;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 5;
        if (cVarD.l()) {
            x2 x2Var = x2.f64817a;
            String str3 = (String) cVarD.v(fVar, 0, x2Var, null);
            String str4 = (String) cVarD.v(fVar, 1, x2Var, null);
            long jO = cVarD.o(fVar, 2);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 3, i.f64704a, null);
            Long l11 = (Long) cVarD.v(fVar, 4, h1.f64699a, null);
            i10 = 63;
            str2 = str4;
            strB = cVarD.B(fVar, 5);
            bool = bool2;
            l10 = l11;
            j10 = jO;
            str = str3;
        } else {
            long jO2 = 0;
            boolean z10 = true;
            String str5 = null;
            String str6 = null;
            Boolean bool3 = null;
            Long l12 = null;
            String strB2 = null;
            i10 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        str5 = (String) cVarD.v(fVar, 0, x2.f64817a, str5);
                        i10 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        str6 = (String) cVarD.v(fVar, 1, x2.f64817a, str6);
                        i10 |= 2;
                        break;
                    case 2:
                        jO2 = cVarD.o(fVar, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        bool3 = (Boolean) cVarD.v(fVar, 3, i.f64704a, bool3);
                        i10 |= 8;
                        break;
                    case 4:
                        l12 = (Long) cVarD.v(fVar, 4, h1.f64699a, l12);
                        i10 |= 16;
                        break;
                    case 5:
                        strB2 = cVarD.B(fVar, i11);
                        i10 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            str = str5;
            j10 = jO2;
            str2 = str6;
            bool = bool3;
            l10 = l12;
            strB = strB2;
        }
        int i12 = i10;
        cVarD.b(fVar);
        return new KnownHostChangePasswordModel(i12, str, str2, j10, bool, l10, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, KnownHostChangePasswordModel knownHostChangePasswordModel) {
        t.f(fVar, "encoder");
        t.f(knownHostChangePasswordModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        KnownHostChangePasswordModel.write$Self$Termius_app_googleProductionRelease(knownHostChangePasswordModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
