package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class ChangeEmailRequest$$serializer implements n0 {
    public static final int $stable;
    public static final ChangeEmailRequest$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ChangeEmailRequest$$serializer changeEmailRequest$$serializer = new ChangeEmailRequest$$serializer();
        INSTANCE = changeEmailRequest$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.ChangeEmailRequest", changeEmailRequest$$serializer, 3);
        i2Var.r("email", false);
        i2Var.r("security_token", false);
        i2Var.r(SyncConstants.Bundle.OTP_TOKEN, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private ChangeEmailRequest$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, x2Var, a.u(x2Var)};
    }

    @Override // hv.b
    public final ChangeEmailRequest deserialize(kv.e eVar) {
        int i10;
        String str;
        String str2;
        String str3;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String strB = null;
        if (cVarD.l()) {
            String strB2 = cVarD.B(fVar, 0);
            String strB3 = cVarD.B(fVar, 1);
            str = strB2;
            str3 = (String) cVarD.v(fVar, 2, x2.f64817a, null);
            str2 = strB3;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strB4 = null;
            String str4 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    strB = cVarD.B(fVar, 0);
                    i11 |= 1;
                } else if (iD == 1) {
                    strB4 = cVarD.B(fVar, 1);
                    i11 |= 2;
                } else {
                    if (iD != 2) {
                        throw new e0(iD);
                    }
                    str4 = (String) cVarD.v(fVar, 2, x2.f64817a, str4);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strB;
            str2 = strB4;
            str3 = str4;
        }
        cVarD.b(fVar);
        return new ChangeEmailRequest(i10, str, str2, str3, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ChangeEmailRequest changeEmailRequest) {
        t.f(fVar, "encoder");
        t.f(changeEmailRequest, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        ChangeEmailRequest.write$Self$Termius_app_googleProductionRelease(changeEmailRequest, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
