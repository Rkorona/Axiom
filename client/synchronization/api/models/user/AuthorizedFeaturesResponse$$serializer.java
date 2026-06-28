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
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class AuthorizedFeaturesResponse$$serializer implements n0 {
    public static final int $stable;
    public static final AuthorizedFeaturesResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AuthorizedFeaturesResponse$$serializer authorizedFeaturesResponse$$serializer = new AuthorizedFeaturesResponse$$serializer();
        INSTANCE = authorizedFeaturesResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.AuthorizedFeaturesResponse", authorizedFeaturesResponse$$serializer, 7);
        i2Var.r("show_create_team_promotions", true);
        i2Var.r("show_bell", true);
        i2Var.r("generate_multi_key_pair", true);
        i2Var.r("show_presence_effect", true);
        i2Var.r("show_multi_key_promotion", true);
        i2Var.r("is_eligible_for_trial_extend", true);
        i2Var.r("multiple_vaults", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private AuthorizedFeaturesResponse$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        i iVar = i.f64704a;
        return new c[]{a.u(iVar), a.u(iVar), a.u(iVar), a.u(iVar), a.u(iVar), a.u(iVar), a.u(iVar)};
    }

    @Override // hv.b
    public final AuthorizedFeaturesResponse deserialize(kv.e eVar) {
        int i10;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 6;
        Boolean bool8 = null;
        if (cVarD.l()) {
            i iVar = i.f64704a;
            Boolean bool9 = (Boolean) cVarD.v(fVar, 0, iVar, null);
            Boolean bool10 = (Boolean) cVarD.v(fVar, 1, iVar, null);
            Boolean bool11 = (Boolean) cVarD.v(fVar, 2, iVar, null);
            Boolean bool12 = (Boolean) cVarD.v(fVar, 3, iVar, null);
            Boolean bool13 = (Boolean) cVarD.v(fVar, 4, iVar, null);
            Boolean bool14 = (Boolean) cVarD.v(fVar, 5, iVar, null);
            bool = (Boolean) cVarD.v(fVar, 6, iVar, null);
            i10 = 127;
            bool7 = bool14;
            bool5 = bool12;
            bool6 = bool13;
            bool4 = bool11;
            bool3 = bool10;
            bool2 = bool9;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 6;
                        break;
                    case 0:
                        bool8 = (Boolean) cVarD.v(fVar, 0, i.f64704a, bool8);
                        i12 |= 1;
                        i11 = 6;
                        break;
                    case 1:
                        bool16 = (Boolean) cVarD.v(fVar, 1, i.f64704a, bool16);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        bool17 = (Boolean) cVarD.v(fVar, 2, i.f64704a, bool17);
                        i12 |= 4;
                        break;
                    case 3:
                        bool18 = (Boolean) cVarD.v(fVar, 3, i.f64704a, bool18);
                        i12 |= 8;
                        break;
                    case 4:
                        bool19 = (Boolean) cVarD.v(fVar, 4, i.f64704a, bool19);
                        i12 |= 16;
                        break;
                    case 5:
                        bool20 = (Boolean) cVarD.v(fVar, 5, i.f64704a, bool20);
                        i12 |= 32;
                        break;
                    case 6:
                        bool15 = (Boolean) cVarD.v(fVar, i11, i.f64704a, bool15);
                        i12 |= 64;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i12;
            bool = bool15;
            bool2 = bool8;
            bool3 = bool16;
            bool4 = bool17;
            bool5 = bool18;
            bool6 = bool19;
            bool7 = bool20;
        }
        cVarD.b(fVar);
        return new AuthorizedFeaturesResponse(i10, bool2, bool3, bool4, bool5, bool6, bool7, bool, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, AuthorizedFeaturesResponse authorizedFeaturesResponse) {
        t.f(fVar, "encoder");
        t.f(authorizedFeaturesResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        AuthorizedFeaturesResponse.write$Self$Termius_app_googleProductionRelease(authorizedFeaturesResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
