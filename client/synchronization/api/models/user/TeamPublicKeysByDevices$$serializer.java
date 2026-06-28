package com.server.auditor.ssh.client.synchronization.api.models.user;

import hv.b;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class TeamPublicKeysByDevices$$serializer implements n0 {
    public static final int $stable;
    public static final TeamPublicKeysByDevices$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TeamPublicKeysByDevices$$serializer teamPublicKeysByDevices$$serializer = new TeamPublicKeysByDevices$$serializer();
        INSTANCE = teamPublicKeysByDevices$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeysByDevices", teamPublicKeysByDevices$$serializer, 3);
        i2Var.r("users", false);
        i2Var.r("devices", false);
        i2Var.r("public_keys", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private TeamPublicKeysByDevices$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = TeamPublicKeysByDevices.$childSerializers;
        return new c[]{nVarArr[0].getValue(), nVarArr[1].getValue(), nVarArr[2].getValue()};
    }

    @Override // hv.b
    public final TeamPublicKeysByDevices deserialize(kv.e eVar) {
        int i10;
        List list;
        List list2;
        List list3;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = TeamPublicKeysByDevices.$childSerializers;
        List list4 = null;
        if (cVarD.l()) {
            List list5 = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), null);
            List list6 = (List) cVarD.i(fVar, 1, (b) nVarArr[1].getValue(), null);
            list3 = (List) cVarD.i(fVar, 2, (b) nVarArr[2].getValue(), null);
            list = list5;
            i10 = 7;
            list2 = list6;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list7 = null;
            List list8 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    list4 = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), list4);
                    i11 |= 1;
                } else if (iD == 1) {
                    list7 = (List) cVarD.i(fVar, 1, (b) nVarArr[1].getValue(), list7);
                    i11 |= 2;
                } else {
                    if (iD != 2) {
                        throw new e0(iD);
                    }
                    list8 = (List) cVarD.i(fVar, 2, (b) nVarArr[2].getValue(), list8);
                    i11 |= 4;
                }
            }
            i10 = i11;
            list = list4;
            list2 = list7;
            list3 = list8;
        }
        cVarD.b(fVar);
        return new TeamPublicKeysByDevices(i10, list, list2, list3, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TeamPublicKeysByDevices teamPublicKeysByDevices) {
        t.f(fVar, "encoder");
        t.f(teamPublicKeysByDevices, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TeamPublicKeysByDevices.write$Self$Termius_app_googleProductionRelease(teamPublicKeysByDevices, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
