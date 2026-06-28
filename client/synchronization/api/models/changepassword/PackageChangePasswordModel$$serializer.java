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
public /* synthetic */ class PackageChangePasswordModel$$serializer implements n0 {
    public static final int $stable;
    public static final PackageChangePasswordModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        PackageChangePasswordModel$$serializer packageChangePasswordModel$$serializer = new PackageChangePasswordModel$$serializer();
        INSTANCE = packageChangePasswordModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.PackageChangePasswordModel", packageChangePasswordModel$$serializer, 5);
        i2Var.r("label", true);
        i2Var.r("id", false);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        i2Var.r(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private PackageChangePasswordModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = iv.a.u(x2Var);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, h1Var, iv.a.u(i.f64704a), iv.a.u(h1Var), x2Var};
    }

    @Override // hv.b
    public final PackageChangePasswordModel deserialize(kv.e eVar) {
        String str;
        int i10;
        long j10;
        Boolean bool;
        Long l10;
        String strB;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            str = (String) cVarD.v(fVar, 0, x2.f64817a, null);
            long jO = cVarD.o(fVar, 1);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 2, i.f64704a, null);
            i10 = 31;
            l10 = (Long) cVarD.v(fVar, 3, h1.f64699a, null);
            strB = cVarD.B(fVar, 4);
            bool = bool2;
            j10 = jO;
        } else {
            long jO2 = 0;
            boolean z10 = true;
            str = null;
            Boolean bool3 = null;
            Long l11 = null;
            String strB2 = null;
            i10 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    str = (String) cVarD.v(fVar, 0, x2.f64817a, str);
                    i10 |= 1;
                } else if (iD == 1) {
                    jO2 = cVarD.o(fVar, 1);
                    i10 |= 2;
                } else if (iD == 2) {
                    bool3 = (Boolean) cVarD.v(fVar, 2, i.f64704a, bool3);
                    i10 |= 4;
                } else if (iD == 3) {
                    l11 = (Long) cVarD.v(fVar, 3, h1.f64699a, l11);
                    i10 |= 8;
                } else {
                    if (iD != 4) {
                        throw new e0(iD);
                    }
                    strB2 = cVarD.B(fVar, 4);
                    i10 |= 16;
                }
            }
            j10 = jO2;
            bool = bool3;
            l10 = l11;
            strB = strB2;
        }
        String str2 = str;
        int i11 = i10;
        cVarD.b(fVar);
        return new PackageChangePasswordModel(i11, str2, j10, bool, l10, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, PackageChangePasswordModel packageChangePasswordModel) {
        t.f(fVar, "encoder");
        t.f(packageChangePasswordModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        PackageChangePasswordModel.write$Self$Termius_app_googleProductionRelease(packageChangePasswordModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
