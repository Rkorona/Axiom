package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySet;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySet$$serializer;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class ApiKey$$serializer implements n0 {
    public static final int $stable;
    public static final ApiKey$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        ApiKey$$serializer apiKey$$serializer = new ApiKey$$serializer();
        INSTANCE = apiKey$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.ApiKey", apiKey$$serializer, 5);
        i2Var.r("username", true);
        i2Var.r("token", true);
        i2Var.r("salt", true);
        i2Var.r("hmac_salt", true);
        i2Var.r("personal_keyset", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private ApiKey$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new hv.c[]{iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(EncryptedPersonalKeySet$$serializer.INSTANCE)};
    }

    @Override // hv.b
    public final ApiKey deserialize(kv.e eVar) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        EncryptedPersonalKeySet encryptedPersonalKeySet;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String str5 = null;
        if (cVarD.l()) {
            x2 x2Var = x2.f64817a;
            String str6 = (String) cVarD.v(fVar, 0, x2Var, null);
            String str7 = (String) cVarD.v(fVar, 1, x2Var, null);
            String str8 = (String) cVarD.v(fVar, 2, x2Var, null);
            str4 = (String) cVarD.v(fVar, 3, x2Var, null);
            encryptedPersonalKeySet = (EncryptedPersonalKeySet) cVarD.v(fVar, 4, EncryptedPersonalKeySet$$serializer.INSTANCE, null);
            i10 = 31;
            str3 = str8;
            str2 = str7;
            str = str6;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            EncryptedPersonalKeySet encryptedPersonalKeySet2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    str5 = (String) cVarD.v(fVar, 0, x2.f64817a, str5);
                    i11 |= 1;
                } else if (iD == 1) {
                    str9 = (String) cVarD.v(fVar, 1, x2.f64817a, str9);
                    i11 |= 2;
                } else if (iD == 2) {
                    str10 = (String) cVarD.v(fVar, 2, x2.f64817a, str10);
                    i11 |= 4;
                } else if (iD == 3) {
                    str11 = (String) cVarD.v(fVar, 3, x2.f64817a, str11);
                    i11 |= 8;
                } else {
                    if (iD != 4) {
                        throw new e0(iD);
                    }
                    encryptedPersonalKeySet2 = (EncryptedPersonalKeySet) cVarD.v(fVar, 4, EncryptedPersonalKeySet$$serializer.INSTANCE, encryptedPersonalKeySet2);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = str5;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            encryptedPersonalKeySet = encryptedPersonalKeySet2;
        }
        cVarD.b(fVar);
        return new ApiKey(i10, str, str2, str3, str4, encryptedPersonalKeySet, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ApiKey apiKey) {
        t.f(fVar, "encoder");
        t.f(apiKey, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        ApiKey.write$Self$Termius_app_googleProductionRelease(apiKey, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
