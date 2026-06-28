package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class DeactivateTeamRequestBody$$serializer implements n0 {
    public static final int $stable;
    public static final DeactivateTeamRequestBody$$serializer INSTANCE;
    private static final f descriptor;

    static {
        DeactivateTeamRequestBody$$serializer deactivateTeamRequestBody$$serializer = new DeactivateTeamRequestBody$$serializer();
        INSTANCE = deactivateTeamRequestBody$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.bulk.DeactivateTeamRequestBody", deactivateTeamRequestBody$$serializer, 1);
        i2Var.r("terminal_objects", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private DeactivateTeamRequestBody$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{DeactivateTeamTerminalObjects$$serializer.INSTANCE};
    }

    @Override // hv.b
    public final DeactivateTeamRequestBody deserialize(kv.e eVar) {
        DeactivateTeamTerminalObjects deactivateTeamTerminalObjects;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i10 = 1;
        if (cVarD.l()) {
            deactivateTeamTerminalObjects = (DeactivateTeamTerminalObjects) cVarD.i(fVar, 0, DeactivateTeamTerminalObjects$$serializer.INSTANCE, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            deactivateTeamTerminalObjects = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    deactivateTeamTerminalObjects = (DeactivateTeamTerminalObjects) cVarD.i(fVar, 0, DeactivateTeamTerminalObjects$$serializer.INSTANCE, deactivateTeamTerminalObjects);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        cVarD.b(fVar);
        return new DeactivateTeamRequestBody(i10, deactivateTeamTerminalObjects, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, DeactivateTeamRequestBody deactivateTeamRequestBody) {
        t.f(fVar, "encoder");
        t.f(deactivateTeamRequestBody, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        dVarD.o(fVar2, 0, DeactivateTeamTerminalObjects$$serializer.INSTANCE, deactivateTeamRequestBody.terminalObjects);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
