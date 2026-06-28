package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i2;
import lv.n0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class SsoDomainUser$$serializer implements n0 {
    public static final int $stable;
    public static final SsoDomainUser$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        SsoDomainUser$$serializer ssoDomainUser$$serializer = new SsoDomainUser$$serializer();
        INSTANCE = ssoDomainUser$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.SsoDomainUser", ssoDomainUser$$serializer, 1);
        i2Var.r("encryption_schema", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private SsoDomainUser$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{x2.f64817a};
    }

    @Override // hv.b
    public final SsoDomainUser deserialize(kv.e eVar) {
        String strB;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i10 = 1;
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
        } else {
            boolean z10 = true;
            int i11 = 0;
            strB = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    strB = cVarD.B(fVar, 0);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        cVarD.b(fVar);
        return new SsoDomainUser(i10, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SsoDomainUser ssoDomainUser) {
        t.f(fVar, "encoder");
        t.f(ssoDomainUser, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        dVarD.f(fVar2, 0, ssoDomainUser.encryptionSchema);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
