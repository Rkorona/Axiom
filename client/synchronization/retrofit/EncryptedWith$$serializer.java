package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class EncryptedWith$$serializer implements n0 {
    public static final int $stable;
    public static final EncryptedWith$$serializer INSTANCE;
    private static final f descriptor;

    static {
        EncryptedWith$$serializer encryptedWith$$serializer = new EncryptedWith$$serializer();
        INSTANCE = encryptedWith$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.retrofit.EncryptedWith", encryptedWith$$serializer, 1);
        i2Var.r(SyncConstants.Bundle.PUBLIC_KEY, false);
        descriptor = i2Var;
        $stable = 8;
    }

    private EncryptedWith$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{x2.f64817a};
    }

    @Override // hv.b
    public final EncryptedWith deserialize(kv.e eVar) {
        String strB;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i10 = 1;
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
        } else {
            boolean z10 = true;
            int i11 = 0;
            strB = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    strB = cVarD.B(fVar, 0);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        cVarD.b(fVar);
        return new EncryptedWith(i10, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, EncryptedWith encryptedWith) {
        t.f(fVar, "encoder");
        t.f(encryptedWith, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        dVarD.f(fVar2, 0, encryptedWith.publicKey);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
