package com.server.auditor.ssh.client.synchronization.api.models.history;

import hv.b;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
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
public /* synthetic */ class PostHistoryConnectionsRequest$$serializer implements n0 {
    public static final int $stable;
    public static final PostHistoryConnectionsRequest$$serializer INSTANCE;
    private static final f descriptor;

    static {
        PostHistoryConnectionsRequest$$serializer postHistoryConnectionsRequest$$serializer = new PostHistoryConnectionsRequest$$serializer();
        INSTANCE = postHistoryConnectionsRequest$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.history.PostHistoryConnectionsRequest", postHistoryConnectionsRequest$$serializer, 2);
        i2Var.r("historyconnection_set", false);
        i2Var.r("revision", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private PostHistoryConnectionsRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{PostHistoryConnectionsRequest.$childSerializers[0].getValue(), a.u(x2.f64817a)};
    }

    @Override // hv.b
    public final PostHistoryConnectionsRequest deserialize(kv.e eVar) {
        List list;
        String str;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = PostHistoryConnectionsRequest.$childSerializers;
        if (cVarD.l()) {
            list = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), null);
            str = (String) cVarD.v(fVar, 1, x2.f64817a, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            String str2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    list2 = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), list2);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    str2 = (String) cVarD.v(fVar, 1, x2.f64817a, str2);
                    i11 |= 2;
                }
            }
            list = list2;
            str = str2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new PostHistoryConnectionsRequest(i10, list, str, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, PostHistoryConnectionsRequest postHistoryConnectionsRequest) {
        t.f(fVar, "encoder");
        t.f(postHistoryConnectionsRequest, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        PostHistoryConnectionsRequest.write$Self$Termius_app_googleProductionRelease(postHistoryConnectionsRequest, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
