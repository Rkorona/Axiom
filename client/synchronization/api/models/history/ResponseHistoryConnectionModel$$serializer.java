package com.server.auditor.ssh.client.synchronization.api.models.history;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.ui.sessionlogs.data.HistoryConnectionDeviceInfo;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogProtocol;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import so.r;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class ResponseHistoryConnectionModel$$serializer implements n0 {
    public static final int $stable;
    public static final ResponseHistoryConnectionModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ResponseHistoryConnectionModel$$serializer responseHistoryConnectionModel$$serializer = new ResponseHistoryConnectionModel$$serializer();
        INSTANCE = responseHistoryConnectionModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.history.ResponseHistoryConnectionModel", responseHistoryConnectionModel$$serializer, 11);
        i2Var.r("id", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("device", false);
        i2Var.r("host", true);
        i2Var.r("updated_at", false);
        i2Var.r(Column.CREATED_AT, false);
        i2Var.r("timestamp", false);
        i2Var.r("actor_id", true);
        i2Var.r(Column.COMMAND, false);
        i2Var.r("protocol", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private ResponseHistoryConnectionModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        c cVarU2 = a.u(HistoryHostInfo$$serializer.INSTANCE);
        c cVarU3 = a.u(h1Var);
        c cVarU4 = a.u(r.f78184b);
        c cVarU5 = a.u(h1Var);
        x2 x2Var = x2.f64817a;
        return new c[]{h1Var, cVarU, HistoryConnectionDeviceInfo.a.f40371a, cVarU2, x2Var, x2Var, x2Var, cVarU3, x2Var, cVarU4, cVarU5};
    }

    @Override // hv.b
    public final ResponseHistoryConnectionModel deserialize(kv.e eVar) {
        int i10;
        Long l10;
        SessionLogProtocol sessionLogProtocol;
        Long l11;
        HistoryHostInfo historyHostInfo;
        Long l12;
        HistoryConnectionDeviceInfo historyConnectionDeviceInfo;
        String str;
        String str2;
        String str3;
        String str4;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 10;
        int i12 = 9;
        Long l13 = null;
        if (cVarD.l()) {
            long jO = cVarD.o(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l14 = (Long) cVarD.v(fVar, 1, h1Var, null);
            HistoryConnectionDeviceInfo historyConnectionDeviceInfo2 = (HistoryConnectionDeviceInfo) cVarD.i(fVar, 2, HistoryConnectionDeviceInfo.a.f40371a, null);
            HistoryHostInfo historyHostInfo2 = (HistoryHostInfo) cVarD.v(fVar, 3, HistoryHostInfo$$serializer.INSTANCE, null);
            String strB = cVarD.B(fVar, 4);
            String strB2 = cVarD.B(fVar, 5);
            String strB3 = cVarD.B(fVar, 6);
            Long l15 = (Long) cVarD.v(fVar, 7, h1Var, null);
            String strB4 = cVarD.B(fVar, 8);
            SessionLogProtocol sessionLogProtocol2 = (SessionLogProtocol) cVarD.v(fVar, 9, r.f78184b, null);
            l10 = (Long) cVarD.v(fVar, 10, h1Var, null);
            i10 = 2047;
            sessionLogProtocol = sessionLogProtocol2;
            l11 = l15;
            str3 = strB3;
            str2 = strB2;
            historyHostInfo = historyHostInfo2;
            str4 = strB4;
            str = strB;
            historyConnectionDeviceInfo = historyConnectionDeviceInfo2;
            l12 = l14;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i13 = 0;
            Long l16 = null;
            SessionLogProtocol sessionLogProtocol3 = null;
            Long l17 = null;
            HistoryHostInfo historyHostInfo3 = null;
            String strB5 = null;
            String strB6 = null;
            String strB7 = null;
            long jO2 = 0;
            HistoryConnectionDeviceInfo historyConnectionDeviceInfo3 = null;
            String strB8 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 10;
                        break;
                    case 0:
                        jO2 = cVarD.o(fVar, 0);
                        i13 |= 1;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 1:
                        l13 = (Long) cVarD.v(fVar, 1, h1.f64699a, l13);
                        i13 |= 2;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 2:
                        historyConnectionDeviceInfo3 = (HistoryConnectionDeviceInfo) cVarD.i(fVar, 2, HistoryConnectionDeviceInfo.a.f40371a, historyConnectionDeviceInfo3);
                        i13 |= 4;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 3:
                        historyHostInfo3 = (HistoryHostInfo) cVarD.v(fVar, 3, HistoryHostInfo$$serializer.INSTANCE, historyHostInfo3);
                        i13 |= 8;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 4:
                        strB8 = cVarD.B(fVar, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        strB5 = cVarD.B(fVar, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        strB6 = cVarD.B(fVar, 6);
                        i13 |= 64;
                        break;
                    case 7:
                        l17 = (Long) cVarD.v(fVar, 7, h1.f64699a, l17);
                        i13 |= 128;
                        break;
                    case 8:
                        strB7 = cVarD.B(fVar, 8);
                        i13 |= 256;
                        break;
                    case 9:
                        sessionLogProtocol3 = (SessionLogProtocol) cVarD.v(fVar, i12, r.f78184b, sessionLogProtocol3);
                        i13 |= File.FLAG_O_TRUNC;
                        break;
                    case 10:
                        l16 = (Long) cVarD.v(fVar, i11, h1.f64699a, l16);
                        i13 |= File.FLAG_O_APPEND;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i13;
            l10 = l16;
            sessionLogProtocol = sessionLogProtocol3;
            l11 = l17;
            historyHostInfo = historyHostInfo3;
            l12 = l13;
            historyConnectionDeviceInfo = historyConnectionDeviceInfo3;
            str = strB8;
            str2 = strB5;
            str3 = strB6;
            str4 = strB7;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new ResponseHistoryConnectionModel(i10, j10, l12, historyConnectionDeviceInfo, historyHostInfo, str, str2, str3, l11, str4, sessionLogProtocol, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ResponseHistoryConnectionModel responseHistoryConnectionModel) {
        t.f(fVar, "encoder");
        t.f(responseHistoryConnectionModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        ResponseHistoryConnectionModel.write$Self$Termius_app_googleProductionRelease(responseHistoryConnectionModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
