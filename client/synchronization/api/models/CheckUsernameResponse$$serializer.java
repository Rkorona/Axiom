package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i;
import lv.i2;
import lv.n0;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class CheckUsernameResponse$$serializer implements n0 {
    public static final int $stable;
    public static final CheckUsernameResponse$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        CheckUsernameResponse$$serializer checkUsernameResponse$$serializer = new CheckUsernameResponse$$serializer();
        INSTANCE = checkUsernameResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.CheckUsernameResponse", checkUsernameResponse$$serializer, 1);
        i2Var.r("is_available", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private CheckUsernameResponse$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{i.f64704a};
    }

    @Override // hv.b
    public final CheckUsernameResponse deserialize(kv.e eVar) {
        boolean zH;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i10 = 1;
        if (cVarD.l()) {
            zH = cVarD.H(fVar, 0);
        } else {
            boolean z10 = true;
            zH = false;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    zH = cVarD.H(fVar, 0);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        cVarD.b(fVar);
        return new CheckUsernameResponse(i10, zH, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, CheckUsernameResponse checkUsernameResponse) {
        t.f(fVar, "encoder");
        t.f(checkUsernameResponse, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        dVarD.u(fVar2, 0, checkUsernameResponse.isAvailable);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
