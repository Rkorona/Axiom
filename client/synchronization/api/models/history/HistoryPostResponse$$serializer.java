package com.server.auditor.ssh.client.synchronization.api.models.history;

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
public /* synthetic */ class HistoryPostResponse$$serializer implements n0 {
    public static final int $stable;
    public static final HistoryPostResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        HistoryPostResponse$$serializer historyPostResponse$$serializer = new HistoryPostResponse$$serializer();
        INSTANCE = historyPostResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.history.HistoryPostResponse", historyPostResponse$$serializer, 2);
        i2Var.r("now", false);
        i2Var.r("objects", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private HistoryPostResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{x2.f64817a, HistoryPostResponse.$childSerializers[1].getValue()};
    }

    @Override // hv.b
    public final HistoryPostResponse deserialize(kv.e eVar) {
        List list;
        String strB;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = HistoryPostResponse.$childSerializers;
        if (cVarD.l()) {
            strB = cVarD.B(fVar, 0);
            list = (List) cVarD.i(fVar, 1, (b) nVarArr[1].getValue(), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            String strB2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    strB2 = cVarD.B(fVar, 0);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    list2 = (List) cVarD.i(fVar, 1, (b) nVarArr[1].getValue(), list2);
                    i11 |= 2;
                }
            }
            list = list2;
            strB = strB2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new HistoryPostResponse(i10, strB, list, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, HistoryPostResponse historyPostResponse) {
        t.f(fVar, "encoder");
        t.f(historyPostResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        HistoryPostResponse.write$Self$Termius_app_googleProductionRelease(historyPostResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
