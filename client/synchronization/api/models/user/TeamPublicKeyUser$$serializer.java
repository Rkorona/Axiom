package com.server.auditor.ssh.client.synchronization.api.models.user;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class TeamPublicKeyUser$$serializer implements n0 {
    public static final int $stable;
    public static final TeamPublicKeyUser$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TeamPublicKeyUser$$serializer teamPublicKeyUser$$serializer = new TeamPublicKeyUser$$serializer();
        INSTANCE = teamPublicKeyUser$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeyUser", teamPublicKeyUser$$serializer, 2);
        i2Var.r("id", false);
        i2Var.r("email", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private TeamPublicKeyUser$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{h1.f64699a, x2.f64817a};
    }

    @Override // hv.b
    public final TeamPublicKeyUser deserialize(kv.e eVar) {
        String strB;
        int i10;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            long jO = cVarD.o(fVar, 0);
            strB = cVarD.B(fVar, 1);
            i10 = 3;
            j10 = jO;
        } else {
            strB = null;
            boolean z10 = true;
            long jO2 = 0;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    jO2 = cVarD.o(fVar, 0);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    strB = cVarD.B(fVar, 1);
                    i11 |= 2;
                }
            }
            i10 = i11;
            j10 = jO2;
        }
        String str = strB;
        cVarD.b(fVar);
        return new TeamPublicKeyUser(i10, j10, str, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TeamPublicKeyUser teamPublicKeyUser) {
        t.f(fVar, "encoder");
        t.f(teamPublicKeyUser, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TeamPublicKeyUser.write$Self$Termius_app_googleProductionRelease(teamPublicKeyUser, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
