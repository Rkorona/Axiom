package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedWith;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedWith$$serializer;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class EncryptionKeyApiModel$$serializer implements n0 {
    public static final int $stable;
    public static final EncryptionKeyApiModel$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        EncryptionKeyApiModel$$serializer encryptionKeyApiModel$$serializer = new EncryptionKeyApiModel$$serializer();
        INSTANCE = encryptionKeyApiModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.EncryptionKeyApiModel", encryptionKeyApiModel$$serializer, 6);
        i2Var.r("original_key", false);
        i2Var.r("encrypted_with", false);
        i2Var.r("encrypted_key", false);
        i2Var.r("role", false);
        i2Var.r("id", false);
        i2Var.r("is_default", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private EncryptionKeyApiModel$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        x2 x2Var = x2.f64817a;
        return new hv.c[]{h1Var, EncryptedWith$$serializer.INSTANCE, x2Var, x2Var, h1Var, i.f64704a};
    }

    @Override // hv.b
    public final EncryptionKeyApiModel deserialize(kv.e eVar) {
        boolean zH;
        int i10;
        long j10;
        EncryptedWith encryptedWith;
        String str;
        String str2;
        long j11;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            long jO = cVarD.o(fVar, 0);
            EncryptedWith encryptedWith2 = (EncryptedWith) cVarD.i(fVar, 1, EncryptedWith$$serializer.INSTANCE, null);
            String strB = cVarD.B(fVar, 2);
            String strB2 = cVarD.B(fVar, 3);
            long jO2 = cVarD.o(fVar, 4);
            encryptedWith = encryptedWith2;
            zH = cVarD.H(fVar, 5);
            str2 = strB2;
            i10 = 63;
            str = strB;
            j10 = jO2;
            j11 = jO;
        } else {
            long jO3 = 0;
            boolean z10 = true;
            boolean zH2 = false;
            EncryptedWith encryptedWith3 = null;
            String strB3 = null;
            String strB4 = null;
            long jO4 = 0;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        jO4 = cVarD.o(fVar, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        encryptedWith3 = (EncryptedWith) cVarD.i(fVar, 1, EncryptedWith$$serializer.INSTANCE, encryptedWith3);
                        i11 |= 2;
                        break;
                    case 2:
                        strB3 = cVarD.B(fVar, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        strB4 = cVarD.B(fVar, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        jO3 = cVarD.o(fVar, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        zH2 = cVarD.H(fVar, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            zH = zH2;
            i10 = i11;
            j10 = jO3;
            encryptedWith = encryptedWith3;
            str = strB3;
            str2 = strB4;
            j11 = jO4;
        }
        cVarD.b(fVar);
        return new EncryptionKeyApiModel(i10, j11, encryptedWith, str, str2, j10, zH, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, EncryptionKeyApiModel encryptionKeyApiModel) {
        t.f(fVar, "encoder");
        t.f(encryptionKeyApiModel, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        EncryptionKeyApiModel.write$Self$Termius_app_googleProductionRelease(encryptionKeyApiModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
