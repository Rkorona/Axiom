package com.server.auditor.ssh.client.synchronization.api.submodels;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.w0;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class WithRecourseId$$serializer implements n0 {
    public static final int $stable;
    public static final WithRecourseId$$serializer INSTANCE;
    private static final f descriptor;

    static {
        WithRecourseId$$serializer withRecourseId$$serializer = new WithRecourseId$$serializer();
        INSTANCE = withRecourseId$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId", withRecourseId$$serializer, 1);
        i2Var.r("id", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private WithRecourseId$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{w0.f64808a};
    }

    @Override // hv.b
    public final WithRecourseId deserialize(kv.e eVar) {
        int iE;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i10 = 1;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
        } else {
            boolean z10 = true;
            iE = 0;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    iE = cVarD.e(fVar, 0);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        cVarD.b(fVar);
        return new WithRecourseId(i10, iE, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, WithRecourseId withRecourseId) {
        t.f(fVar, "encoder");
        t.f(withRecourseId, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        WithRecourseId.write$Self$Termius_app_googleProductionRelease(withRecourseId, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
