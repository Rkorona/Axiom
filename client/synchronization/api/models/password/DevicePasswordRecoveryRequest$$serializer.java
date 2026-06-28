package com.server.auditor.ssh.client.synchronization.api.models.password;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest$$serializer;
import hv.b;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class DevicePasswordRecoveryRequest$$serializer implements n0 {
    public static final int $stable;
    public static final DevicePasswordRecoveryRequest$$serializer INSTANCE;
    private static final f descriptor;

    static {
        DevicePasswordRecoveryRequest$$serializer devicePasswordRecoveryRequest$$serializer = new DevicePasswordRecoveryRequest$$serializer();
        INSTANCE = devicePasswordRecoveryRequest$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryRequest", devicePasswordRecoveryRequest$$serializer, 6);
        i2Var.r("security_token", false);
        i2Var.r(SyncConstants.Bundle.NEW_PASSWORD, false);
        i2Var.r("personal_keyset", false);
        i2Var.r("objects", false);
        i2Var.r("salt", false);
        i2Var.r("hmac_salt", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private DevicePasswordRecoveryRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = DevicePasswordRecoveryRequest.$childSerializers;
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, x2Var, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, nVarArr[3].getValue(), x2Var, x2Var};
    }

    @Override // hv.b
    public final DevicePasswordRecoveryRequest deserialize(kv.e eVar) {
        int i10;
        String str;
        String str2;
        EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest;
        List list;
        String str3;
        String strB;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = DevicePasswordRecoveryRequest.$childSerializers;
        String strB2 = null;
        if (cVarD.l()) {
            String strB3 = cVarD.B(fVar, 0);
            String strB4 = cVarD.B(fVar, 1);
            EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest2 = (EncryptedPersonalKeySetRequest) cVarD.i(fVar, 2, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, null);
            List list2 = (List) cVarD.i(fVar, 3, (b) nVarArr[3].getValue(), null);
            String strB5 = cVarD.B(fVar, 4);
            list = list2;
            str = strB3;
            strB = cVarD.B(fVar, 5);
            str3 = strB5;
            encryptedPersonalKeySetRequest = encryptedPersonalKeySetRequest2;
            i10 = 63;
            str2 = strB4;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strB6 = null;
            EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest3 = null;
            List list3 = null;
            String strB7 = null;
            String strB8 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strB2 = cVarD.B(fVar, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        strB6 = cVarD.B(fVar, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        encryptedPersonalKeySetRequest3 = (EncryptedPersonalKeySetRequest) cVarD.i(fVar, 2, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, encryptedPersonalKeySetRequest3);
                        i11 |= 4;
                        break;
                    case 3:
                        list3 = (List) cVarD.i(fVar, 3, (b) nVarArr[3].getValue(), list3);
                        i11 |= 8;
                        break;
                    case 4:
                        strB7 = cVarD.B(fVar, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        strB8 = cVarD.B(fVar, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i11;
            str = strB2;
            str2 = strB6;
            encryptedPersonalKeySetRequest = encryptedPersonalKeySetRequest3;
            list = list3;
            str3 = strB7;
            strB = strB8;
        }
        cVarD.b(fVar);
        return new DevicePasswordRecoveryRequest(i10, str, str2, encryptedPersonalKeySetRequest, list, str3, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, DevicePasswordRecoveryRequest devicePasswordRecoveryRequest) {
        t.f(fVar, "encoder");
        t.f(devicePasswordRecoveryRequest, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        DevicePasswordRecoveryRequest.write$Self$Termius_app_googleProductionRelease(devicePasswordRecoveryRequest, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
