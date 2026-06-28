package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.database.Column;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class VaultApiModel$$serializer implements n0 {
    public static final int $stable;
    public static final VaultApiModel$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        VaultApiModel$$serializer vaultApiModel$$serializer = new VaultApiModel$$serializer();
        INSTANCE = vaultApiModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel", vaultApiModel$$serializer, 5);
        i2Var.r(Column.MULTI_KEY_NAME, false);
        i2Var.r("id", false);
        i2Var.r("is_default", false);
        i2Var.r("original_key", true);
        i2Var.r("role", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private VaultApiModel$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        hv.c cVarU = iv.a.u(h1Var);
        x2 x2Var = x2.f64817a;
        return new hv.c[]{x2Var, h1Var, i.f64704a, cVarU, x2Var};
    }

    @Override // hv.b
    public final VaultApiModel deserialize(kv.e eVar) {
        int i10;
        boolean z10;
        long j10;
        String str;
        Long l10;
        String strB;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            String strB2 = cVarD.B(fVar, 0);
            long jO = cVarD.o(fVar, 1);
            boolean zH = cVarD.H(fVar, 2);
            i10 = 31;
            str = strB2;
            l10 = (Long) cVarD.v(fVar, 3, h1.f64699a, null);
            strB = cVarD.B(fVar, 4);
            z10 = zH;
            j10 = jO;
        } else {
            long jO2 = 0;
            boolean z11 = true;
            boolean zH2 = false;
            String strB3 = null;
            Long l11 = null;
            String strB4 = null;
            i10 = 0;
            while (z11) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z11 = false;
                } else if (iD == 0) {
                    strB3 = cVarD.B(fVar, 0);
                    i10 |= 1;
                } else if (iD == 1) {
                    jO2 = cVarD.o(fVar, 1);
                    i10 |= 2;
                } else if (iD == 2) {
                    zH2 = cVarD.H(fVar, 2);
                    i10 |= 4;
                } else if (iD == 3) {
                    l11 = (Long) cVarD.v(fVar, 3, h1.f64699a, l11);
                    i10 |= 8;
                } else {
                    if (iD != 4) {
                        throw new e0(iD);
                    }
                    strB4 = cVarD.B(fVar, 4);
                    i10 |= 16;
                }
            }
            z10 = zH2;
            j10 = jO2;
            str = strB3;
            l10 = l11;
            strB = strB4;
        }
        int i11 = i10;
        cVarD.b(fVar);
        return new VaultApiModel(i11, str, j10, z10, l10, strB, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, VaultApiModel vaultApiModel) {
        t.f(fVar, "encoder");
        t.f(vaultApiModel, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        VaultApiModel.write$Self$Termius_app_googleProductionRelease(vaultApiModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
