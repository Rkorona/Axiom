package com.server.auditor.ssh.client.synchronization.retrofit;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.w0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class NewEncryptedEncryptionKey$$serializer implements n0 {
    public static final int $stable;
    public static final NewEncryptedEncryptionKey$$serializer INSTANCE;
    private static final f descriptor;

    static {
        NewEncryptedEncryptionKey$$serializer newEncryptedEncryptionKey$$serializer = new NewEncryptedEncryptionKey$$serializer();
        INSTANCE = newEncryptedEncryptionKey$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.retrofit.NewEncryptedEncryptionKey", newEncryptedEncryptionKey$$serializer, 2);
        i2Var.r("encrypted_for", false);
        i2Var.r("encrypted_key", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private NewEncryptedEncryptionKey$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{w0.f64808a, x2.f64817a};
    }

    @Override // hv.b
    public final NewEncryptedEncryptionKey deserialize(kv.e eVar) {
        int iE;
        String strB;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            strB = cVarD.B(fVar, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            iE = 0;
            int i11 = 0;
            String strB2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    iE = cVarD.e(fVar, 0);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    strB2 = cVarD.B(fVar, 1);
                    i11 |= 2;
                }
            }
            strB = strB2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new NewEncryptedEncryptionKey(i10, iE, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, NewEncryptedEncryptionKey newEncryptedEncryptionKey) {
        t.f(fVar, "encoder");
        t.f(newEncryptedEncryptionKey, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        NewEncryptedEncryptionKey.write$Self$Termius_app_googleProductionRelease(newEncryptedEncryptionKey, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
