package com.server.auditor.ssh.client.synchronization.api.models.teams;

import hv.b;
import hv.c;
import hv.e0;
import hv.r;
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
public /* synthetic */ class ListPendingInvitesResponse$$serializer implements n0 {
    public static final int $stable;
    public static final ListPendingInvitesResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ListPendingInvitesResponse$$serializer listPendingInvitesResponse$$serializer = new ListPendingInvitesResponse$$serializer();
        INSTANCE = listPendingInvitesResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.teams.ListPendingInvitesResponse", listPendingInvitesResponse$$serializer, 1);
        i2Var.r("results", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private ListPendingInvitesResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{ListPendingInvitesResponse.$childSerializers[0].getValue()};
    }

    @Override // hv.b
    public final ListPendingInvitesResponse deserialize(kv.e eVar) {
        List list;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = ListPendingInvitesResponse.$childSerializers;
        int i10 = 1;
        if (cVarD.l()) {
            list = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    list2 = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), list2);
                    i11 = 1;
                }
            }
            list = list2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new ListPendingInvitesResponse(i10, list, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ListPendingInvitesResponse listPendingInvitesResponse) {
        t.f(fVar, "encoder");
        t.f(listPendingInvitesResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        dVarD.o(fVar2, 0, (r) ListPendingInvitesResponse.$childSerializers[0].getValue(), listPendingInvitesResponse.results);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
