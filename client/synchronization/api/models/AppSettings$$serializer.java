package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class AppSettings$$serializer implements n0 {
    public static final int $stable;
    public static final AppSettings$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        AppSettings$$serializer appSettings$$serializer = new AppSettings$$serializer();
        INSTANCE = appSettings$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.AppSettings", appSettings$$serializer, 2);
        i2Var.r("color_scheme", true);
        i2Var.r("synchronize_key", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private AppSettings$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{iv.a.u(x2.f64817a), i.f64704a};
    }

    @Override // hv.b
    public final AppSettings deserialize(kv.e eVar) {
        String str;
        boolean zH;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            str = (String) cVarD.v(fVar, 0, x2.f64817a, null);
            zH = cVarD.H(fVar, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            boolean zH2 = false;
            int i11 = 0;
            str = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    str = (String) cVarD.v(fVar, 0, x2.f64817a, str);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    zH2 = cVarD.H(fVar, 1);
                    i11 |= 2;
                }
            }
            zH = zH2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new AppSettings(i10, str, zH, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, AppSettings appSettings) {
        t.f(fVar, "encoder");
        t.f(appSettings, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        AppSettings.write$Self$Termius_app_googleProductionRelease(appSettings, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
