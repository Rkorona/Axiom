package com.server.auditor.ssh.client.synchronization.api.models.history;

import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class HistoryCommandSessionLogFileMetaData$$serializer implements n0 {
    public static final int $stable;
    public static final HistoryCommandSessionLogFileMetaData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        HistoryCommandSessionLogFileMetaData$$serializer historyCommandSessionLogFileMetaData$$serializer = new HistoryCommandSessionLogFileMetaData$$serializer();
        INSTANCE = historyCommandSessionLogFileMetaData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.history.HistoryCommandSessionLogFileMetaData", historyCommandSessionLogFileMetaData$$serializer, 2);
        i2Var.r(Column.MULTI_KEY_NAME, true);
        i2Var.r("secretKey", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private HistoryCommandSessionLogFileMetaData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{a.u(x2Var), a.u(x2Var)};
    }

    @Override // hv.b
    public final HistoryCommandSessionLogFileMetaData deserialize(kv.e eVar) {
        String str;
        int i10;
        String str2;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            x2 x2Var = x2.f64817a;
            str2 = (String) cVarD.v(fVar, 0, x2Var, null);
            str = (String) cVarD.v(fVar, 1, x2Var, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            str = null;
            String str3 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    str3 = (String) cVarD.v(fVar, 0, x2.f64817a, str3);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    str = (String) cVarD.v(fVar, 1, x2.f64817a, str);
                    i11 |= 2;
                }
            }
            i10 = i11;
            str2 = str3;
        }
        cVarD.b(fVar);
        return new HistoryCommandSessionLogFileMetaData(i10, str2, str, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, HistoryCommandSessionLogFileMetaData historyCommandSessionLogFileMetaData) {
        t.f(fVar, "encoder");
        t.f(historyCommandSessionLogFileMetaData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        HistoryCommandSessionLogFileMetaData.write$Self$Termius_app_googleProductionRelease(historyCommandSessionLogFileMetaData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
