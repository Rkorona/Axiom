package com.server.auditor.ssh.client.synchronization.retrofit;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
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
public /* synthetic */ class CreateTeamTrialRequest$$serializer implements n0 {
    public static final int $stable;
    public static final CreateTeamTrialRequest$$serializer INSTANCE;
    private static final f descriptor;

    static {
        CreateTeamTrialRequest$$serializer createTeamTrialRequest$$serializer = new CreateTeamTrialRequest$$serializer();
        INSTANCE = createTeamTrialRequest$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.retrofit.CreateTeamTrialRequest", createTeamTrialRequest$$serializer, 2);
        i2Var.r("team_name", false);
        i2Var.r("invites", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private CreateTeamTrialRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{x2.f64817a, CreateTeamTrialRequest.$childSerializers[1].getValue()};
    }

    @Override // hv.b
    public final CreateTeamTrialRequest deserialize(kv.e eVar) {
        List list;
        String strB;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = CreateTeamTrialRequest.$childSerializers;
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            list = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            String strB2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    strB2 = cVarD.B(fVar, 0);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list2);
                    i11 |= 2;
                }
            }
            list = list2;
            strB = strB2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new CreateTeamTrialRequest(i10, strB, list, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, CreateTeamTrialRequest createTeamTrialRequest) {
        t.f(fVar, "encoder");
        t.f(createTeamTrialRequest, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        CreateTeamTrialRequest.write$Self$Termius_app_googleProductionRelease(createTeamTrialRequest, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
