package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class TeamPublicKey$$serializer implements n0 {
    public static final int $stable;
    public static final TeamPublicKey$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TeamPublicKey$$serializer teamPublicKey$$serializer = new TeamPublicKey$$serializer();
        INSTANCE = teamPublicKey$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKey", teamPublicKey$$serializer, 3);
        i2Var.r(Column.DEVICE_ID, false);
        i2Var.r(SyncConstants.Bundle.PUBLIC_KEY, true);
        i2Var.r("generated_at", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private TeamPublicKey$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{h1.f64699a, a.u(x2Var), a.u(x2Var)};
    }

    @Override // hv.b
    public final TeamPublicKey deserialize(kv.e eVar) {
        int i10;
        String str;
        String str2;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String str3 = null;
        if (cVarD.l()) {
            long jO = cVarD.o(fVar, 0);
            x2 x2Var = x2.f64817a;
            String str4 = (String) cVarD.v(fVar, 1, x2Var, null);
            str2 = (String) cVarD.v(fVar, 2, x2Var, null);
            i10 = 7;
            str = str4;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i11 = 0;
            long jO2 = 0;
            String str5 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    jO2 = cVarD.o(fVar, 0);
                    i11 |= 1;
                } else if (iD == 1) {
                    str3 = (String) cVarD.v(fVar, 1, x2.f64817a, str3);
                    i11 |= 2;
                } else {
                    if (iD != 2) {
                        throw new e0(iD);
                    }
                    str5 = (String) cVarD.v(fVar, 2, x2.f64817a, str5);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = str3;
            str2 = str5;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new TeamPublicKey(i10, j10, str, str2, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TeamPublicKey teamPublicKey) {
        t.f(fVar, "encoder");
        t.f(teamPublicKey, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TeamPublicKey.write$Self$Termius_app_googleProductionRelease(teamPublicKey, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
