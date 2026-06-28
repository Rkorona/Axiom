package com.server.auditor.ssh.client.synchronization.api.models.telnet.config;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId$$serializer;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class TelnetConfigFullData$$serializer implements n0 {
    public static final int $stable;
    public static final TelnetConfigFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TelnetConfigFullData$$serializer telnetConfigFullData$$serializer = new TelnetConfigFullData$$serializer();
        INSTANCE = telnetConfigFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigFullData", telnetConfigFullData$$serializer, 10);
        i2Var.r("id", true);
        i2Var.r("updated_at", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("identity", true);
        i2Var.r("color_scheme", true);
        i2Var.r(Column.CHARSET, true);
        i2Var.r(Column.PORT, true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("content", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private TelnetConfigFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        w0 w0Var = w0.f64808a;
        x2 x2Var = x2.f64817a;
        h1 h1Var = h1.f64699a;
        return new c[]{w0Var, x2Var, a.u(h1Var), a.u(WithRecourseId$$serializer.INSTANCE), a.u(x2Var), a.u(x2Var), a.u(w0Var), a.u(i.f64704a), a.u(x2Var), a.u(h1Var)};
    }

    @Override // hv.b
    public final TelnetConfigFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        String str;
        Integer num;
        Boolean bool;
        String str2;
        String str3;
        WithRecourseId withRecourseId;
        int i10;
        String str4;
        Long l11;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 9;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            String strB = cVarD.B(fVar, 1);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 2, h1Var, null);
            WithRecourseId withRecourseId2 = (WithRecourseId) cVarD.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, null);
            x2 x2Var = x2.f64817a;
            String str5 = (String) cVarD.v(fVar, 4, x2Var, null);
            String str6 = (String) cVarD.v(fVar, 5, x2Var, null);
            Integer num2 = (Integer) cVarD.v(fVar, 6, w0.f64808a, null);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 7, i.f64704a, null);
            String str7 = (String) cVarD.v(fVar, 8, x2Var, null);
            l10 = (Long) cVarD.v(fVar, 9, h1Var, null);
            bool = bool2;
            num = num2;
            str2 = str6;
            withRecourseId = withRecourseId2;
            str = str7;
            str3 = str5;
            l11 = l12;
            str4 = strB;
            i10 = 1023;
        } else {
            boolean z10 = true;
            iE = 0;
            Long l13 = null;
            String str8 = null;
            Integer num3 = null;
            Boolean bool3 = null;
            String str9 = null;
            String str10 = null;
            String strB2 = null;
            Long l14 = null;
            int i12 = 0;
            WithRecourseId withRecourseId3 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        iE = cVarD.e(fVar, 0);
                        i11 = 9;
                        break;
                    case 1:
                        strB2 = cVarD.B(fVar, 1);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        l14 = (Long) cVarD.v(fVar, 2, h1.f64699a, l14);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        withRecourseId3 = (WithRecourseId) cVarD.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, withRecourseId3);
                        i12 |= 8;
                        i11 = 9;
                        break;
                    case 4:
                        str10 = (String) cVarD.v(fVar, 4, x2.f64817a, str10);
                        i12 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        str9 = (String) cVarD.v(fVar, 5, x2.f64817a, str9);
                        i12 |= 32;
                        i11 = 9;
                        break;
                    case 6:
                        num3 = (Integer) cVarD.v(fVar, 6, w0.f64808a, num3);
                        i12 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        bool3 = (Boolean) cVarD.v(fVar, 7, i.f64704a, bool3);
                        i12 |= 128;
                        i11 = 9;
                        break;
                    case 8:
                        str8 = (String) cVarD.v(fVar, 8, x2.f64817a, str8);
                        i12 |= 256;
                        break;
                    case 9:
                        l13 = (Long) cVarD.v(fVar, i11, h1.f64699a, l13);
                        i12 |= File.FLAG_O_TRUNC;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            l10 = l13;
            str = str8;
            num = num3;
            bool = bool3;
            str2 = str9;
            str3 = str10;
            withRecourseId = withRecourseId3;
            i10 = i12;
            str4 = strB2;
            l11 = l14;
        }
        int i13 = iE;
        cVarD.b(fVar);
        return new TelnetConfigFullData(i10, i13, str4, l11, withRecourseId, str3, str2, num, bool, str, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TelnetConfigFullData telnetConfigFullData) {
        t.f(fVar, "encoder");
        t.f(telnetConfigFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TelnetConfigFullData.write$Self$Termius_app_googleProductionRelease(telnetConfigFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
