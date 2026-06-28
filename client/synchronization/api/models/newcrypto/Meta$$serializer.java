package com.server.auditor.ssh.client.synchronization.api.models.newcrypto;

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
import lv.w0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class Meta$$serializer implements n0 {
    public static final int $stable;
    public static final Meta$$serializer INSTANCE;
    private static final f descriptor;

    static {
        Meta$$serializer meta$$serializer = new Meta$$serializer();
        INSTANCE = meta$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.newcrypto.Meta", meta$$serializer, 5);
        i2Var.r("next", true);
        i2Var.r("previous", true);
        i2Var.r("total_count", false);
        i2Var.r("limit", false);
        i2Var.r("offset", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private Meta$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = a.u(x2Var);
        c cVarU2 = a.u(x2Var);
        w0 w0Var = w0.f64808a;
        return new c[]{cVarU, cVarU2, w0Var, w0Var, w0Var};
    }

    @Override // hv.b
    public final Meta deserialize(kv.e eVar) {
        int iE;
        int iE2;
        int i10;
        int i11;
        String str;
        String str2;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            x2 x2Var = x2.f64817a;
            String str3 = (String) cVarD.v(fVar, 0, x2Var, null);
            String str4 = (String) cVarD.v(fVar, 1, x2Var, null);
            int iE3 = cVarD.e(fVar, 2);
            str2 = str4;
            iE = cVarD.e(fVar, 3);
            iE2 = cVarD.e(fVar, 4);
            i10 = iE3;
            i11 = 31;
            str = str3;
        } else {
            boolean z10 = true;
            int iE4 = 0;
            int iE5 = 0;
            int i12 = 0;
            String str5 = null;
            String str6 = null;
            int iE6 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    str5 = (String) cVarD.v(fVar, 0, x2.f64817a, str5);
                    i12 |= 1;
                } else if (iD == 1) {
                    str6 = (String) cVarD.v(fVar, 1, x2.f64817a, str6);
                    i12 |= 2;
                } else if (iD == 2) {
                    iE5 = cVarD.e(fVar, 2);
                    i12 |= 4;
                } else if (iD == 3) {
                    iE4 = cVarD.e(fVar, 3);
                    i12 |= 8;
                } else {
                    if (iD != 4) {
                        throw new e0(iD);
                    }
                    iE6 = cVarD.e(fVar, 4);
                    i12 |= 16;
                }
            }
            iE = iE4;
            iE2 = iE6;
            i10 = iE5;
            i11 = i12;
            str = str5;
            str2 = str6;
        }
        cVarD.b(fVar);
        return new Meta(i11, str, str2, i10, iE, iE2, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, Meta meta) {
        t.f(fVar, "encoder");
        t.f(meta, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        Meta.write$Self$Termius_app_googleProductionRelease(meta, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
