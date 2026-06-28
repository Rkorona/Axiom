package com.server.auditor.ssh.client.synchronization.api.models.teams;

import hv.b;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import java.util.List;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class ListTeamMembersResponse$$serializer implements n0 {
    public static final int $stable;
    public static final ListTeamMembersResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ListTeamMembersResponse$$serializer listTeamMembersResponse$$serializer = new ListTeamMembersResponse$$serializer();
        INSTANCE = listTeamMembersResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.teams.ListTeamMembersResponse", listTeamMembersResponse$$serializer, 4);
        i2Var.r("results", false);
        i2Var.r("count", false);
        i2Var.r("previous", true);
        i2Var.r("next", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private ListTeamMembersResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{ListTeamMembersResponse.$childSerializers[0].getValue(), w0.f64808a, a.u(x2Var), a.u(x2Var)};
    }

    @Override // hv.b
    public final ListTeamMembersResponse deserialize(kv.e eVar) {
        int iE;
        int i10;
        List list;
        String str;
        String str2;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = ListTeamMembersResponse.$childSerializers;
        if (cVarD.l()) {
            List list2 = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), null);
            iE = cVarD.e(fVar, 1);
            x2 x2Var = x2.f64817a;
            String str3 = (String) cVarD.v(fVar, 2, x2Var, null);
            list = list2;
            str2 = (String) cVarD.v(fVar, 3, x2Var, null);
            str = str3;
            i10 = 15;
        } else {
            boolean z10 = true;
            iE = 0;
            List list3 = null;
            String str4 = null;
            String str5 = null;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    list3 = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), list3);
                    i11 |= 1;
                } else if (iD == 1) {
                    iE = cVarD.e(fVar, 1);
                    i11 |= 2;
                } else if (iD == 2) {
                    str4 = (String) cVarD.v(fVar, 2, x2.f64817a, str4);
                    i11 |= 4;
                } else {
                    if (iD != 3) {
                        throw new e0(iD);
                    }
                    str5 = (String) cVarD.v(fVar, 3, x2.f64817a, str5);
                    i11 |= 8;
                }
            }
            i10 = i11;
            list = list3;
            str = str4;
            str2 = str5;
        }
        int i12 = iE;
        cVarD.b(fVar);
        return new ListTeamMembersResponse(i10, list, i12, str, str2, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ListTeamMembersResponse listTeamMembersResponse) {
        t.f(fVar, "encoder");
        t.f(listTeamMembersResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        ListTeamMembersResponse.write$Self$Termius_app_googleProductionRelease(listTeamMembersResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
