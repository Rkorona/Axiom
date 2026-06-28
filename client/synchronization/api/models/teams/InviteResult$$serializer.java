package com.server.auditor.ssh.client.synchronization.api.models.teams;

import hv.b;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class InviteResult$$serializer implements n0 {
    public static final int $stable;
    public static final InviteResult$$serializer INSTANCE;
    private static final f descriptor;

    static {
        InviteResult$$serializer inviteResult$$serializer = new InviteResult$$serializer();
        INSTANCE = inviteResult$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.teams.InviteResult", inviteResult$$serializer, 2);
        i2Var.r("role", false);
        i2Var.r("email", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private InviteResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{InviteResult.$childSerializers[0].getValue(), x2.f64817a};
    }

    @Override // hv.b
    public final InviteResult deserialize(kv.e eVar) {
        TeamMemberRole teamMemberRole;
        String strB;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = InviteResult.$childSerializers;
        if (cVarD.l()) {
            teamMemberRole = (TeamMemberRole) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), null);
            strB = cVarD.B(fVar, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            TeamMemberRole teamMemberRole2 = null;
            String strB2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    teamMemberRole2 = (TeamMemberRole) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), teamMemberRole2);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    strB2 = cVarD.B(fVar, 1);
                    i11 |= 2;
                }
            }
            teamMemberRole = teamMemberRole2;
            strB = strB2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new InviteResult(i10, teamMemberRole, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, InviteResult inviteResult) {
        t.f(fVar, "encoder");
        t.f(inviteResult, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        InviteResult.write$Self$Termius_app_googleProductionRelease(inviteResult, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
