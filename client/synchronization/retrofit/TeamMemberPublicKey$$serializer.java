package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
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
public /* synthetic */ class TeamMemberPublicKey$$serializer implements n0 {
    public static final int $stable;
    public static final TeamMemberPublicKey$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TeamMemberPublicKey$$serializer teamMemberPublicKey$$serializer = new TeamMemberPublicKey$$serializer();
        INSTANCE = teamMemberPublicKey$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.retrofit.TeamMemberPublicKey", teamMemberPublicKey$$serializer, 2);
        i2Var.r(SyncConstants.Bundle.PUBLIC_KEY, true);
        i2Var.r("has_team_key", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private TeamMemberPublicKey$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{iv.a.u(x2.f64817a), i.f64704a};
    }

    @Override // hv.b
    public final TeamMemberPublicKey deserialize(kv.e eVar) {
        String str;
        boolean zH;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
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
        return new TeamMemberPublicKey(i10, str, zH, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TeamMemberPublicKey teamMemberPublicKey) {
        t.f(fVar, "encoder");
        t.f(teamMemberPublicKey, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TeamMemberPublicKey.write$Self$Termius_app_googleProductionRelease(teamMemberPublicKey, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
