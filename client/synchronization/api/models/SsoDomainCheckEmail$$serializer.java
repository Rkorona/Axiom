package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i;
import lv.i2;
import lv.n0;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class SsoDomainCheckEmail$$serializer implements n0 {
    public static final int $stable;
    public static final SsoDomainCheckEmail$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        SsoDomainCheckEmail$$serializer ssoDomainCheckEmail$$serializer = new SsoDomainCheckEmail$$serializer();
        INSTANCE = ssoDomainCheckEmail$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.SsoDomainCheckEmail", ssoDomainCheckEmail$$serializer, 1);
        i2Var.r("has_enterprise_sso", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private SsoDomainCheckEmail$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{i.f64704a};
    }

    @Override // hv.b
    public final SsoDomainCheckEmail deserialize(kv.e eVar) {
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
        return new SsoDomainCheckEmail(i10, zH, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SsoDomainCheckEmail ssoDomainCheckEmail) {
        t.f(fVar, "encoder");
        t.f(ssoDomainCheckEmail, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        dVarD.u(fVar2, 0, ssoDomainCheckEmail.hasEnterpriseSSO);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
