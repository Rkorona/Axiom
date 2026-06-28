package com.server.auditor.ssh.client.synchronization.api.models.pfrule;

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
public /* synthetic */ class RuleFullData$$serializer implements n0 {
    public static final int $stable;
    public static final RuleFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        RuleFullData$$serializer ruleFullData$$serializer = new RuleFullData$$serializer();
        INSTANCE = ruleFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleFullData", ruleFullData$$serializer, 14);
        i2Var.r("host", true);
        i2Var.r("id", false);
        i2Var.r(Column.CREATED_AT, true);
        i2Var.r("updated_at", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("pf_type", true);
        i2Var.r(Column.BOUND_ADDRESS, true);
        i2Var.r(Column.LOCAL_PORT, true);
        i2Var.r(Column.REMOTE_PORT, true);
        i2Var.r("hostname", true);
        i2Var.r("content", true);
        i2Var.r("label", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private RuleFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        c cVarU = a.u(WithRecourseId$$serializer.INSTANCE);
        w0 w0Var = w0.f64808a;
        x2 x2Var = x2.f64817a;
        c cVarU2 = a.u(x2Var);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, w0Var, cVarU2, x2Var, a.u(h1Var), a.u(x2Var), a.u(x2Var), a.u(w0Var), a.u(w0Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(i.f64704a), a.u(h1Var)};
    }

    @Override // hv.b
    public final RuleFullData deserialize(kv.e eVar) {
        WithRecourseId withRecourseId;
        Long l10;
        String str;
        Long l11;
        String str2;
        String str3;
        String str4;
        Integer num;
        Boolean bool;
        Integer num2;
        String str5;
        String str6;
        int i10;
        int i11;
        String str7;
        WithRecourseId withRecourseId2;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        WithRecourseId withRecourseId3 = null;
        if (cVarD.l()) {
            WithRecourseId withRecourseId4 = (WithRecourseId) cVarD.v(fVar, 0, WithRecourseId$$serializer.INSTANCE, null);
            int iE = cVarD.e(fVar, 1);
            x2 x2Var = x2.f64817a;
            String str8 = (String) cVarD.v(fVar, 2, x2Var, null);
            String strB = cVarD.B(fVar, 3);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 4, h1Var, null);
            String str9 = (String) cVarD.v(fVar, 5, x2Var, null);
            String str10 = (String) cVarD.v(fVar, 6, x2Var, null);
            w0 w0Var = w0.f64808a;
            Integer num3 = (Integer) cVarD.v(fVar, 7, w0Var, null);
            Integer num4 = (Integer) cVarD.v(fVar, 8, w0Var, null);
            String str11 = (String) cVarD.v(fVar, 9, x2Var, null);
            String str12 = (String) cVarD.v(fVar, 10, x2Var, null);
            String str13 = (String) cVarD.v(fVar, 11, x2Var, null);
            bool = (Boolean) cVarD.v(fVar, 12, i.f64704a, null);
            i11 = iE;
            l11 = (Long) cVarD.v(fVar, 13, h1Var, null);
            i10 = 16383;
            num2 = num4;
            str4 = str11;
            num = num3;
            str5 = str10;
            str6 = str9;
            str7 = strB;
            str3 = str12;
            l10 = l12;
            str = str8;
            str2 = str13;
            withRecourseId = withRecourseId4;
        } else {
            int i12 = 0;
            int iE2 = 0;
            Long l13 = null;
            String str14 = null;
            String strB2 = null;
            Long l14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            Integer num5 = null;
            Boolean bool2 = null;
            Integer num6 = null;
            String str18 = null;
            boolean z10 = true;
            String str19 = null;
            while (z10) {
                String str20 = strB2;
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i12 = i12;
                        strB2 = str20;
                        break;
                    case 0:
                        withRecourseId3 = (WithRecourseId) cVarD.v(fVar, 0, WithRecourseId$$serializer.INSTANCE, withRecourseId3);
                        i12 |= 1;
                        strB2 = str20;
                        break;
                    case 1:
                        withRecourseId2 = withRecourseId3;
                        iE2 = cVarD.e(fVar, 1);
                        i12 |= 2;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 2:
                        withRecourseId2 = withRecourseId3;
                        str14 = (String) cVarD.v(fVar, 2, x2.f64817a, str14);
                        i12 |= 4;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 3:
                        withRecourseId2 = withRecourseId3;
                        i12 |= 8;
                        strB2 = cVarD.B(fVar, 3);
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 4:
                        withRecourseId2 = withRecourseId3;
                        l13 = (Long) cVarD.v(fVar, 4, h1.f64699a, l13);
                        i12 |= 16;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 5:
                        withRecourseId2 = withRecourseId3;
                        str19 = (String) cVarD.v(fVar, 5, x2.f64817a, str19);
                        i12 |= 32;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 6:
                        withRecourseId2 = withRecourseId3;
                        str18 = (String) cVarD.v(fVar, 6, x2.f64817a, str18);
                        i12 |= 64;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 7:
                        withRecourseId2 = withRecourseId3;
                        num5 = (Integer) cVarD.v(fVar, 7, w0.f64808a, num5);
                        i12 |= 128;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 8:
                        withRecourseId2 = withRecourseId3;
                        num6 = (Integer) cVarD.v(fVar, 8, w0.f64808a, num6);
                        i12 |= 256;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 9:
                        withRecourseId2 = withRecourseId3;
                        str17 = (String) cVarD.v(fVar, 9, x2.f64817a, str17);
                        i12 |= File.FLAG_O_TRUNC;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 10:
                        withRecourseId2 = withRecourseId3;
                        str16 = (String) cVarD.v(fVar, 10, x2.f64817a, str16);
                        i12 |= File.FLAG_O_APPEND;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 11:
                        withRecourseId2 = withRecourseId3;
                        str15 = (String) cVarD.v(fVar, 11, x2.f64817a, str15);
                        i12 |= 2048;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 12:
                        withRecourseId2 = withRecourseId3;
                        bool2 = (Boolean) cVarD.v(fVar, 12, i.f64704a, bool2);
                        i12 |= 4096;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    case 13:
                        withRecourseId2 = withRecourseId3;
                        l14 = (Long) cVarD.v(fVar, 13, h1.f64699a, l14);
                        i12 |= 8192;
                        strB2 = str20;
                        withRecourseId3 = withRecourseId2;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            withRecourseId = withRecourseId3;
            l10 = l13;
            str = str14;
            l11 = l14;
            str2 = str15;
            str3 = str16;
            str4 = str17;
            num = num5;
            bool = bool2;
            num2 = num6;
            str5 = str18;
            str6 = str19;
            i10 = i12;
            i11 = iE2;
            str7 = strB2;
        }
        cVarD.b(fVar);
        return new RuleFullData(i10, withRecourseId, i11, str, str7, l10, str6, str5, num, num2, str4, str3, str2, bool, l11, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, RuleFullData ruleFullData) {
        t.f(fVar, "encoder");
        t.f(ruleFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        RuleFullData.write$Self$Termius_app_googleProductionRelease(ruleFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
