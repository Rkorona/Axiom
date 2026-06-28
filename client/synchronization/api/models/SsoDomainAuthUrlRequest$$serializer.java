package com.server.auditor.ssh.client.synchronization.api.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i2;
import lv.n0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class SsoDomainAuthUrlRequest$$serializer implements n0 {
    public static final int $stable;
    public static final SsoDomainAuthUrlRequest$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        SsoDomainAuthUrlRequest$$serializer ssoDomainAuthUrlRequest$$serializer = new SsoDomainAuthUrlRequest$$serializer();
        INSTANCE = ssoDomainAuthUrlRequest$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlRequest", ssoDomainAuthUrlRequest$$serializer, 2);
        i2Var.r("email", false);
        i2Var.r("redirect_url", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private SsoDomainAuthUrlRequest$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new hv.c[]{x2Var, x2Var};
    }

    @Override // hv.b
    public final SsoDomainAuthUrlRequest deserialize(kv.e eVar) {
        String strB;
        String strB2;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            strB2 = cVarD.B(fVar, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strB = null;
            String strB3 = null;
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
                    strB3 = cVarD.B(fVar, 1);
                    i11 |= 2;
                }
            }
            strB2 = strB3;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new SsoDomainAuthUrlRequest(i10, strB, strB2, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SsoDomainAuthUrlRequest ssoDomainAuthUrlRequest) {
        t.f(fVar, "encoder");
        t.f(ssoDomainAuthUrlRequest, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        SsoDomainAuthUrlRequest.write$Self$Termius_app_googleProductionRelease(ssoDomainAuthUrlRequest, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
