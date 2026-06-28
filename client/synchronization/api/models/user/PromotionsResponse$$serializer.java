package com.server.auditor.ssh.client.synchronization.api.models.user;

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
public /* synthetic */ class PromotionsResponse$$serializer implements n0 {
    public static final int $stable;
    public static final PromotionsResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        PromotionsResponse$$serializer promotionsResponse$$serializer = new PromotionsResponse$$serializer();
        INSTANCE = promotionsResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.PromotionsResponse", promotionsResponse$$serializer, 4);
        i2Var.r("has_desktop_device", true);
        i2Var.r("upgrade_to_business_via_vaults", true);
        i2Var.r("enterprise_trial", true);
        i2Var.r("session_logs_banner_type", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private PromotionsResponse$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        i iVar = i.f64704a;
        return new c[]{a.u(iVar), a.u(iVar), a.u(iVar), a.u(x2.f64817a)};
    }

    @Override // hv.b
    public final PromotionsResponse deserialize(kv.e eVar) {
        int i10;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        Boolean bool4 = null;
        if (cVarD.l()) {
            i iVar = i.f64704a;
            Boolean bool5 = (Boolean) cVarD.v(fVar, 0, iVar, null);
            Boolean bool6 = (Boolean) cVarD.v(fVar, 1, iVar, null);
            bool3 = (Boolean) cVarD.v(fVar, 2, iVar, null);
            str = (String) cVarD.v(fVar, 3, x2.f64817a, null);
            i10 = 15;
            bool2 = bool6;
            bool = bool5;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Boolean bool7 = null;
            Boolean bool8 = null;
            String str2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    bool4 = (Boolean) cVarD.v(fVar, 0, i.f64704a, bool4);
                    i11 |= 1;
                } else if (iD == 1) {
                    bool7 = (Boolean) cVarD.v(fVar, 1, i.f64704a, bool7);
                    i11 |= 2;
                } else if (iD == 2) {
                    bool8 = (Boolean) cVarD.v(fVar, 2, i.f64704a, bool8);
                    i11 |= 4;
                } else {
                    if (iD != 3) {
                        throw new e0(iD);
                    }
                    str2 = (String) cVarD.v(fVar, 3, x2.f64817a, str2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            bool = bool4;
            bool2 = bool7;
            bool3 = bool8;
            str = str2;
        }
        cVarD.b(fVar);
        return new PromotionsResponse(i10, bool, bool2, bool3, str, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, PromotionsResponse promotionsResponse) {
        t.f(fVar, "encoder");
        t.f(promotionsResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        PromotionsResponse.write$Self$Termius_app_googleProductionRelease(promotionsResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
