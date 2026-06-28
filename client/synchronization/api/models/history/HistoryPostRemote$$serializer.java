package com.server.auditor.ssh.client.synchronization.api.models.history;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
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
public /* synthetic */ class HistoryPostRemote$$serializer implements n0 {
    public static final int $stable;
    public static final HistoryPostRemote$$serializer INSTANCE;
    private static final f descriptor;

    static {
        HistoryPostRemote$$serializer historyPostRemote$$serializer = new HistoryPostRemote$$serializer();
        INSTANCE = historyPostRemote$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.history.HistoryPostRemote", historyPostRemote$$serializer, 2);
        i2Var.r("id", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, false);
        descriptor = i2Var;
        $stable = 8;
    }

    private HistoryPostRemote$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        return new c[]{h1Var, h1Var};
    }

    @Override // hv.b
    public final HistoryPostRemote deserialize(kv.e eVar) {
        int i10;
        long jO;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            long jO2 = cVarD.o(fVar, 0);
            jO = cVarD.o(fVar, 1);
            j10 = jO2;
            i10 = 3;
        } else {
            long jO3 = 0;
            boolean z10 = true;
            int i11 = 0;
            long jO4 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    jO4 = cVarD.o(fVar, 0);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    jO3 = cVarD.o(fVar, 1);
                    i11 |= 2;
                }
            }
            i10 = i11;
            jO = jO3;
            j10 = jO4;
        }
        cVarD.b(fVar);
        return new HistoryPostRemote(i10, j10, jO, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, HistoryPostRemote historyPostRemote) {
        t.f(fVar, "encoder");
        t.f(historyPostRemote, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        HistoryPostRemote.write$Self$Termius_app_googleProductionRelease(historyPostRemote, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
