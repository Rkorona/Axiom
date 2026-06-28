package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest$$serializer;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
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
public /* synthetic */ class AuthDevicePasswordRequest$$serializer implements n0 {
    public static final int $stable;
    public static final AuthDevicePasswordRequest$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AuthDevicePasswordRequest$$serializer authDevicePasswordRequest$$serializer = new AuthDevicePasswordRequest$$serializer();
        INSTANCE = authDevicePasswordRequest$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordRequest", authDevicePasswordRequest$$serializer, 6);
        i2Var.r("verifier", false);
        i2Var.r("srp_salt", false);
        i2Var.r("personal_keyset", false);
        i2Var.r("cryptospec", false);
        i2Var.r("security_token", false);
        i2Var.r(SyncConstants.Bundle.OTP_TOKEN, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private AuthDevicePasswordRequest$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, x2Var, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, CryptoSpecRequest$$serializer.INSTANCE, x2Var, iv.a.u(x2Var)};
    }

    @Override // hv.b
    public final AuthDevicePasswordRequest deserialize(kv.e eVar) {
        int i10;
        String str;
        String str2;
        EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest;
        CryptoSpecRequest cryptoSpecRequest;
        String str3;
        String str4;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String strB = null;
        if (cVarD.l()) {
            String strB2 = cVarD.B(fVar, 0);
            String strB3 = cVarD.B(fVar, 1);
            EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest2 = (EncryptedPersonalKeySetRequest) cVarD.i(fVar, 2, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, null);
            CryptoSpecRequest cryptoSpecRequest2 = (CryptoSpecRequest) cVarD.i(fVar, 3, CryptoSpecRequest$$serializer.INSTANCE, null);
            String strB4 = cVarD.B(fVar, 4);
            str = strB2;
            str4 = (String) cVarD.v(fVar, 5, x2.f64817a, null);
            cryptoSpecRequest = cryptoSpecRequest2;
            str3 = strB4;
            encryptedPersonalKeySetRequest = encryptedPersonalKeySetRequest2;
            str2 = strB3;
            i10 = 63;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strB5 = null;
            EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest3 = null;
            CryptoSpecRequest cryptoSpecRequest3 = null;
            String strB6 = null;
            String str5 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        strB5 = cVarD.B(fVar, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        encryptedPersonalKeySetRequest3 = (EncryptedPersonalKeySetRequest) cVarD.i(fVar, 2, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, encryptedPersonalKeySetRequest3);
                        i11 |= 4;
                        break;
                    case 3:
                        cryptoSpecRequest3 = (CryptoSpecRequest) cVarD.i(fVar, 3, CryptoSpecRequest$$serializer.INSTANCE, cryptoSpecRequest3);
                        i11 |= 8;
                        break;
                    case 4:
                        strB6 = cVarD.B(fVar, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        str5 = (String) cVarD.v(fVar, 5, x2.f64817a, str5);
                        i11 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i11;
            str = strB;
            str2 = strB5;
            encryptedPersonalKeySetRequest = encryptedPersonalKeySetRequest3;
            cryptoSpecRequest = cryptoSpecRequest3;
            str3 = strB6;
            str4 = str5;
        }
        cVarD.b(fVar);
        return new AuthDevicePasswordRequest(i10, str, str2, encryptedPersonalKeySetRequest, cryptoSpecRequest, str3, str4, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, AuthDevicePasswordRequest authDevicePasswordRequest) {
        t.f(fVar, "encoder");
        t.f(authDevicePasswordRequest, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        AuthDevicePasswordRequest.write$Self$Termius_app_googleProductionRelease(authDevicePasswordRequest, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
