package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogProtocol;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.x2;
import so.r;

/* JADX INFO: loaded from: classes4.dex */
@ut.e
public /* synthetic */ class PostHistoryConnectionModel$$serializer implements n0 {
    public static final int $stable;
    public static final PostHistoryConnectionModel$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        PostHistoryConnectionModel$$serializer postHistoryConnectionModel$$serializer = new PostHistoryConnectionModel$$serializer();
        INSTANCE = postHistoryConnectionModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.PostHistoryConnectionModel", postHistoryConnectionModel$$serializer, 6);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, false);
        i2Var.r("host", false);
        i2Var.r(Column.COMMAND, false);
        i2Var.r("timestamp", false);
        i2Var.r("encrypted_with", false);
        i2Var.r("protocol", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private PostHistoryConnectionModel$$serializer() {
    }

    @Override // lv.n0
    public final hv.c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        hv.c cVarU = iv.a.u(h1Var);
        hv.c cVarU2 = iv.a.u(h1Var);
        hv.c cVarU3 = iv.a.u(r.f78184b);
        x2 x2Var = x2.f64817a;
        return new hv.c[]{h1Var, cVarU, x2Var, x2Var, cVarU2, cVarU3};
    }

    @Override // hv.b
    public final PostHistoryConnectionModel deserialize(kv.e eVar) {
        int i10;
        Long l10;
        String str;
        String str2;
        Long l11;
        SessionLogProtocol sessionLogProtocol;
        long j10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        Long l12 = null;
        if (cVarD.l()) {
            long jO = cVarD.o(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l13 = (Long) cVarD.v(fVar, 1, h1Var, null);
            String strB = cVarD.B(fVar, 2);
            String strB2 = cVarD.B(fVar, 3);
            l11 = (Long) cVarD.v(fVar, 4, h1Var, null);
            sessionLogProtocol = (SessionLogProtocol) cVarD.v(fVar, 5, r.f78184b, null);
            str2 = strB2;
            i10 = 63;
            str = strB;
            l10 = l13;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Long l14 = null;
            SessionLogProtocol sessionLogProtocol2 = null;
            long jO2 = 0;
            String strB3 = null;
            String strB4 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        jO2 = cVarD.o(fVar, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        l12 = (Long) cVarD.v(fVar, 1, h1.f64699a, l12);
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
                        l14 = (Long) cVarD.v(fVar, 4, h1.f64699a, l14);
                        i11 |= 16;
                        break;
                    case 5:
                        sessionLogProtocol2 = (SessionLogProtocol) cVarD.v(fVar, 5, r.f78184b, sessionLogProtocol2);
                        i11 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i11;
            l10 = l12;
            str = strB3;
            str2 = strB4;
            l11 = l14;
            sessionLogProtocol = sessionLogProtocol2;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new PostHistoryConnectionModel(i10, j10, l10, str, str2, l11, sessionLogProtocol, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, PostHistoryConnectionModel postHistoryConnectionModel) {
        t.f(fVar, "encoder");
        t.f(postHistoryConnectionModel, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        PostHistoryConnectionModel.write$Self$Termius_app_googleProductionRelease(postHistoryConnectionModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
