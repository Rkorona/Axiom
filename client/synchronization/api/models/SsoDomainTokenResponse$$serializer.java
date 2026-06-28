package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class SsoDomainTokenResponse$$serializer implements n0 {
    public static final int $stable;
    public static final SsoDomainTokenResponse$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        SsoDomainTokenResponse$$serializer ssoDomainTokenResponse$$serializer = new SsoDomainTokenResponse$$serializer();
        INSTANCE = ssoDomainTokenResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenResponse", ssoDomainTokenResponse$$serializer, 2);
        i2Var.r("token", false);
        i2Var.r("user", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SsoDomainTokenResponse$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{x2.f64817a, iv.a.u(SsoDomainUser$$serializer.INSTANCE)};
    }

    @Override // hv.b
    public final SsoDomainTokenResponse deserialize(kv.e eVar) {
        String strB;
        SsoDomainUser ssoDomainUser;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            ssoDomainUser = (SsoDomainUser) cVarD.v(fVar, 1, SsoDomainUser$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strB = null;
            SsoDomainUser ssoDomainUser2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    strB = cVarD.B(fVar, 0);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    ssoDomainUser2 = (SsoDomainUser) cVarD.v(fVar, 1, SsoDomainUser$$serializer.INSTANCE, ssoDomainUser2);
                    i11 |= 2;
                }
            }
            ssoDomainUser = ssoDomainUser2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new SsoDomainTokenResponse(i10, strB, ssoDomainUser, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SsoDomainTokenResponse ssoDomainTokenResponse) {
        t.f(fVar, "encoder");
        t.f(ssoDomainTokenResponse, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        SsoDomainTokenResponse.write$Self$Termius_app_googleProductionRelease(ssoDomainTokenResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
