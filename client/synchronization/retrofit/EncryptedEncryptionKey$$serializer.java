package com.server.auditor.ssh.client.synchronization.retrofit;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class EncryptedEncryptionKey$$serializer implements n0 {
    public static final int $stable;
    public static final EncryptedEncryptionKey$$serializer INSTANCE;
    private static final f descriptor;

    static {
        EncryptedEncryptionKey$$serializer encryptedEncryptionKey$$serializer = new EncryptedEncryptionKey$$serializer();
        INSTANCE = encryptedEncryptionKey$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.retrofit.EncryptedEncryptionKey", encryptedEncryptionKey$$serializer, 3);
        i2Var.r("original_key", true);
        i2Var.r("encrypted_key", true);
        i2Var.r("encrypted_with", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private EncryptedEncryptionKey$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{iv.a.u(h1.f64699a), x2.f64817a, EncryptedWith$$serializer.INSTANCE};
    }

    @Override // hv.b
    public final EncryptedEncryptionKey deserialize(kv.e eVar) {
        int i10;
        Long l10;
        String str;
        EncryptedWith encryptedWith;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        Long l11 = null;
        if (cVarD.l()) {
            Long l12 = (Long) cVarD.v(fVar, 0, h1.f64699a, null);
            String strB = cVarD.B(fVar, 1);
            l10 = l12;
            encryptedWith = (EncryptedWith) cVarD.i(fVar, 2, EncryptedWith$$serializer.INSTANCE, null);
            str = strB;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strB2 = null;
            EncryptedWith encryptedWith2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    l11 = (Long) cVarD.v(fVar, 0, h1.f64699a, l11);
                    i11 |= 1;
                } else if (iD == 1) {
                    strB2 = cVarD.B(fVar, 1);
                    i11 |= 2;
                } else {
                    if (iD != 2) {
                        throw new e0(iD);
                    }
                    encryptedWith2 = (EncryptedWith) cVarD.i(fVar, 2, EncryptedWith$$serializer.INSTANCE, encryptedWith2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            l10 = l11;
            str = strB2;
            encryptedWith = encryptedWith2;
        }
        cVarD.b(fVar);
        return new EncryptedEncryptionKey(i10, l10, str, encryptedWith, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, EncryptedEncryptionKey encryptedEncryptionKey) {
        t.f(fVar, "encoder");
        t.f(encryptedEncryptionKey, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        EncryptedEncryptionKey.write$Self$Termius_app_googleProductionRelease(encryptedEncryptionKey, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
