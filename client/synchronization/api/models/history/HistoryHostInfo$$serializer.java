package com.server.auditor.ssh.client.synchronization.api.models.history;

import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i2;
import lv.n0;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class HistoryHostInfo$$serializer implements n0 {
    public static final int $stable;
    public static final HistoryHostInfo$$serializer INSTANCE;
    private static final f descriptor;

    static {
        HistoryHostInfo$$serializer historyHostInfo$$serializer = new HistoryHostInfo$$serializer();
        INSTANCE = historyHostInfo$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.history.HistoryHostInfo", historyHostInfo$$serializer, 1);
        i2Var.r("id", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private HistoryHostInfo$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{h1.f64699a};
    }

    @Override // hv.b
    public final HistoryHostInfo deserialize(kv.e eVar) {
        long jO;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i10 = 1;
        if (cVarD.l()) {
            jO = cVarD.o(fVar, 0);
        } else {
            long jO2 = 0;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    jO2 = cVarD.o(fVar, 0);
                    i11 = 1;
                }
            }
            jO = jO2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new HistoryHostInfo(i10, jO, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, HistoryHostInfo historyHostInfo) {
        t.f(fVar, "encoder");
        t.f(historyHostInfo, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        dVarD.q(fVar2, 0, historyHostInfo.f39047id);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
