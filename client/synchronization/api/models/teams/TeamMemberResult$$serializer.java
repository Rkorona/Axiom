package com.server.auditor.ssh.client.synchronization.api.models.teams;

import hv.b;
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
import lv.w0;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class TeamMemberResult$$serializer implements n0 {
    public static final int $stable;
    public static final TeamMemberResult$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TeamMemberResult$$serializer teamMemberResult$$serializer = new TeamMemberResult$$serializer();
        INSTANCE = teamMemberResult$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberResult", teamMemberResult$$serializer, 6);
        i2Var.r("id", false);
        i2Var.r("user_id", false);
        i2Var.r("email", false);
        i2Var.r("full_name", false);
        i2Var.r("is_access_granted", false);
        i2Var.r("role", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private TeamMemberResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = TeamMemberResult.$childSerializers;
        w0 w0Var = w0.f64808a;
        x2 x2Var = x2.f64817a;
        return new c[]{w0Var, w0Var, x2Var, a.u(x2Var), i.f64704a, nVarArr[5].getValue()};
    }

    @Override // hv.b
    public final TeamMemberResult deserialize(kv.e eVar) {
        int iE;
        boolean z10;
        int i10;
        int i11;
        String str;
        String str2;
        TeamMemberRole teamMemberRole;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = TeamMemberResult.$childSerializers;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            int iE2 = cVarD.e(fVar, 1);
            String strB = cVarD.B(fVar, 2);
            String str3 = (String) cVarD.v(fVar, 3, x2.f64817a, null);
            boolean zH = cVarD.H(fVar, 4);
            teamMemberRole = (TeamMemberRole) cVarD.i(fVar, 5, (b) nVarArr[5].getValue(), null);
            str2 = str3;
            z10 = zH;
            str = strB;
            i10 = 63;
            i11 = iE2;
        } else {
            boolean z11 = true;
            iE = 0;
            int i12 = 0;
            int iE3 = 0;
            String strB2 = null;
            String str4 = null;
            TeamMemberRole teamMemberRole2 = null;
            boolean zH2 = false;
            while (z11) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        iE = cVarD.e(fVar, 0);
                        i12 |= 1;
                        continue;
                    case 1:
                        iE3 = cVarD.e(fVar, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        strB2 = cVarD.B(fVar, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        str4 = (String) cVarD.v(fVar, 3, x2.f64817a, str4);
                        i12 |= 8;
                        break;
                    case 4:
                        zH2 = cVarD.H(fVar, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        teamMemberRole2 = (TeamMemberRole) cVarD.i(fVar, 5, (b) nVarArr[5].getValue(), teamMemberRole2);
                        i12 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            z10 = zH2;
            i10 = i12;
            i11 = iE3;
            str = strB2;
            str2 = str4;
            teamMemberRole = teamMemberRole2;
        }
        int i13 = iE;
        cVarD.b(fVar);
        return new TeamMemberResult(i10, i13, i11, str, str2, z10, teamMemberRole, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TeamMemberResult teamMemberResult) {
        t.f(fVar, "encoder");
        t.f(teamMemberResult, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TeamMemberResult.write$Self$Termius_app_googleProductionRelease(teamMemberResult, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
