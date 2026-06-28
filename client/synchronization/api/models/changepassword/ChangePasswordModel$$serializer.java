package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

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
import lv.s2;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class ChangePasswordModel$$serializer implements n0 {
    public static final int $stable;
    public static final ChangePasswordModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ChangePasswordModel$$serializer changePasswordModel$$serializer = new ChangePasswordModel$$serializer();
        INSTANCE = changePasswordModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.ChangePasswordModel", changePasswordModel$$serializer, 7);
        i2Var.r(SyncConstants.Bundle.NEW_PASSWORD, false);
        i2Var.r(SyncConstants.Bundle.OLD_PASSWORD, false);
        i2Var.r("salt", true);
        i2Var.r("hmac_salt", true);
        i2Var.r("objects", false);
        i2Var.r("authy_token", true);
        i2Var.r("personal_keyset", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private ChangePasswordModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = ChangePasswordModel.$childSerializers;
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, x2Var, iv.a.u(x2Var), iv.a.u(x2Var), nVarArr[4].getValue(), iv.a.u(x2Var), EncryptedPersonalKeySetRequest$$serializer.INSTANCE};
    }

    @Override // hv.b
    public final ChangePasswordModel deserialize(kv.e eVar) {
        int i10;
        EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List list;
        char c10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = ChangePasswordModel.$childSerializers;
        int i11 = 6;
        String strB = null;
        if (cVarD.l()) {
            String strB2 = cVarD.B(fVar, 0);
            String strB3 = cVarD.B(fVar, 1);
            x2 x2Var = x2.f64817a;
            String str6 = (String) cVarD.v(fVar, 2, x2Var, null);
            String str7 = (String) cVarD.v(fVar, 3, x2Var, null);
            List list2 = (List) cVarD.i(fVar, 4, (b) nVarArr[4].getValue(), null);
            String str8 = (String) cVarD.v(fVar, 5, x2Var, null);
            list = list2;
            str2 = strB2;
            encryptedPersonalKeySetRequest = (EncryptedPersonalKeySetRequest) cVarD.i(fVar, 6, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, null);
            str = str8;
            str5 = str7;
            str4 = str6;
            i10 = 127;
            str3 = strB3;
        } else {
            boolean z10 = true;
            int i12 = 0;
            EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest2 = null;
            String str9 = null;
            String strB4 = null;
            String str10 = null;
            String str11 = null;
            List list3 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        strB = cVarD.B(fVar, 0);
                        i11 = 6;
                        break;
                    case 1:
                        c10 = 2;
                        strB4 = cVarD.B(fVar, 1);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        c10 = 2;
                        str10 = (String) cVarD.v(fVar, 2, x2.f64817a, str10);
                        i12 |= 4;
                        i11 = 6;
                        break;
                    case 3:
                        str11 = (String) cVarD.v(fVar, 3, x2.f64817a, str11);
                        i12 |= 8;
                        break;
                    case 4:
                        list3 = (List) cVarD.i(fVar, 4, (b) nVarArr[4].getValue(), list3);
                        i12 |= 16;
                        break;
                    case 5:
                        str9 = (String) cVarD.v(fVar, 5, x2.f64817a, str9);
                        i12 |= 32;
                        break;
                    case 6:
                        encryptedPersonalKeySetRequest2 = (EncryptedPersonalKeySetRequest) cVarD.i(fVar, i11, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, encryptedPersonalKeySetRequest2);
                        i12 |= 64;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i12;
            encryptedPersonalKeySetRequest = encryptedPersonalKeySetRequest2;
            str = str9;
            str2 = strB;
            str3 = strB4;
            str4 = str10;
            str5 = str11;
            list = list3;
        }
        cVarD.b(fVar);
        return new ChangePasswordModel(i10, str2, str3, str4, str5, list, str, encryptedPersonalKeySetRequest, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ChangePasswordModel changePasswordModel) {
        t.f(fVar, "encoder");
        t.f(changePasswordModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        ChangePasswordModel.write$Self$Termius_app_googleProductionRelease(changePasswordModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
