package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.Meta;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.Meta$$serializer;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.t;
import lv.i2;
import lv.n0;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class VaultModelResponse$$serializer implements n0 {
    public static final int $stable;
    public static final VaultModelResponse$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        VaultModelResponse$$serializer vaultModelResponse$$serializer = new VaultModelResponse$$serializer();
        INSTANCE = vaultModelResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.VaultModelResponse", vaultModelResponse$$serializer, 2);
        i2Var.r("meta", false);
        i2Var.r("objects", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private VaultModelResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{Meta$$serializer.INSTANCE, VaultModelResponse.$childSerializers[1].getValue()};
    }

    @Override // hv.b
    public final VaultModelResponse deserialize(kv.e eVar) {
        List list;
        Meta meta;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = VaultModelResponse.$childSerializers;
        if (cVarD.l()) {
            meta = (Meta) cVarD.i(fVar, 0, Meta$$serializer.INSTANCE, null);
            list = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            Meta meta2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    meta2 = (Meta) cVarD.i(fVar, 0, Meta$$serializer.INSTANCE, meta2);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list2);
                    i11 |= 2;
                }
            }
            list = list2;
            meta = meta2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new VaultModelResponse(i10, meta, list, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, VaultModelResponse vaultModelResponse) {
        t.f(fVar, "encoder");
        t.f(vaultModelResponse, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        VaultModelResponse.write$Self$Termius_app_googleProductionRelease(vaultModelResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
