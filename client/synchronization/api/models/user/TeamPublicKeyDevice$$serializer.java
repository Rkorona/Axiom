package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
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
public /* synthetic */ class TeamPublicKeyDevice$$serializer implements n0 {
    public static final int $stable;
    public static final TeamPublicKeyDevice$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TeamPublicKeyDevice$$serializer teamPublicKeyDevice$$serializer = new TeamPublicKeyDevice$$serializer();
        INSTANCE = teamPublicKeyDevice$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeyDevice", teamPublicKeyDevice$$serializer, 4);
        i2Var.r("id", false);
        i2Var.r(Column.MULTI_KEY_NAME, false);
        i2Var.r("os_version", false);
        i2Var.r("user_id", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private TeamPublicKeyDevice$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        x2 x2Var = x2.f64817a;
        return new c[]{h1Var, x2Var, x2Var, h1Var};
    }

    @Override // hv.b
    public final TeamPublicKeyDevice deserialize(kv.e eVar) {
        String strB;
        int i10;
        String strB2;
        long j10;
        long jO;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            long jO2 = cVarD.o(fVar, 0);
            strB = cVarD.B(fVar, 1);
            i10 = 15;
            strB2 = cVarD.B(fVar, 2);
            j10 = jO2;
            jO = cVarD.o(fVar, 3);
        } else {
            strB = null;
            boolean z10 = true;
            long jO3 = 0;
            long jO4 = 0;
            String strB3 = null;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    jO3 = cVarD.o(fVar, 0);
                    i11 |= 1;
                } else if (iD == 1) {
                    strB = cVarD.B(fVar, 1);
                    i11 |= 2;
                } else if (iD == 2) {
                    strB3 = cVarD.B(fVar, 2);
                    i11 |= 4;
                } else {
                    if (iD != 3) {
                        throw new e0(iD);
                    }
                    jO4 = cVarD.o(fVar, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            strB2 = strB3;
            j10 = jO3;
            jO = jO4;
        }
        String str = strB;
        cVarD.b(fVar);
        return new TeamPublicKeyDevice(i10, j10, str, strB2, jO, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TeamPublicKeyDevice teamPublicKeyDevice) {
        t.f(fVar, "encoder");
        t.f(teamPublicKeyDevice, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TeamPublicKeyDevice.write$Self$Termius_app_googleProductionRelease(teamPublicKeyDevice, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
