package com.server.auditor.ssh.client.synchronization.api.models.host;

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
public /* synthetic */ class HostFullData$$serializer implements n0 {
    public static final int $stable;
    public static final HostFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        HostFullData$$serializer hostFullData$$serializer = new HostFullData$$serializer();
        INSTANCE = hostFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.host.HostFullData", hostFullData$$serializer, 15);
        i2Var.r("id", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("updated_at", false);
        i2Var.r("ssh_config", true);
        i2Var.r("telnet_config", true);
        i2Var.r(HostBulk.GROUP_ID_SERIAL_NAME, true);
        i2Var.r("content", true);
        i2Var.r(Column.ADDRESS, true);
        i2Var.r("label", true);
        i2Var.r("os_name", true);
        i2Var.r(Column.INTERACTION_DATE, true);
        i2Var.r("backspace", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("credentials_mode", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private HostFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        x2 x2Var = x2.f64817a;
        WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
        return new c[]{w0.f64808a, cVarU, x2Var, a.u(withRecourseId$$serializer), a.u(withRecourseId$$serializer), a.u(withRecourseId$$serializer), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(i.f64704a), a.u(x2Var), a.u(h1Var)};
    }

    @Override // hv.b
    public final HostFullData deserialize(kv.e eVar) {
        int i10;
        Long l10;
        WithRecourseId withRecourseId;
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        WithRecourseId withRecourseId2;
        String str8;
        WithRecourseId withRecourseId3;
        Long l11;
        int i11;
        WithRecourseId withRecourseId4;
        Long l12;
        WithRecourseId withRecourseId5;
        Long l13;
        Long l14;
        WithRecourseId withRecourseId6;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            int iE = cVarD.e(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l15 = (Long) cVarD.v(fVar, 1, h1Var, null);
            String strB = cVarD.B(fVar, 2);
            WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
            WithRecourseId withRecourseId7 = (WithRecourseId) cVarD.v(fVar, 3, withRecourseId$$serializer, null);
            WithRecourseId withRecourseId8 = (WithRecourseId) cVarD.v(fVar, 4, withRecourseId$$serializer, null);
            WithRecourseId withRecourseId9 = (WithRecourseId) cVarD.v(fVar, 5, withRecourseId$$serializer, null);
            x2 x2Var = x2.f64817a;
            String str9 = (String) cVarD.v(fVar, 6, x2Var, null);
            String str10 = (String) cVarD.v(fVar, 7, x2Var, null);
            String str11 = (String) cVarD.v(fVar, 8, x2Var, null);
            String str12 = (String) cVarD.v(fVar, 9, x2Var, null);
            String str13 = (String) cVarD.v(fVar, 10, x2Var, null);
            String str14 = (String) cVarD.v(fVar, 11, x2Var, null);
            i10 = 32767;
            bool = (Boolean) cVarD.v(fVar, 12, i.f64704a, null);
            str = (String) cVarD.v(fVar, 13, x2Var, null);
            l11 = (Long) cVarD.v(fVar, 14, h1Var, null);
            withRecourseId2 = withRecourseId9;
            str2 = str13;
            str3 = str12;
            str7 = str10;
            str5 = str9;
            withRecourseId3 = withRecourseId7;
            str4 = str11;
            withRecourseId = withRecourseId8;
            str8 = strB;
            str6 = str14;
            i11 = iE;
            l10 = l15;
        } else {
            boolean z10 = true;
            int iE2 = 0;
            Long l16 = null;
            WithRecourseId withRecourseId10 = null;
            Long l17 = null;
            String str15 = null;
            Boolean bool2 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            WithRecourseId withRecourseId11 = null;
            String strB2 = null;
            i10 = 0;
            WithRecourseId withRecourseId12 = null;
            while (z10) {
                Long l18 = l17;
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        l12 = l16;
                        withRecourseId5 = withRecourseId12;
                        l17 = l18;
                        z10 = false;
                        withRecourseId12 = withRecourseId5;
                        l16 = l12;
                        break;
                    case 0:
                        l12 = l16;
                        withRecourseId5 = withRecourseId12;
                        l13 = l18;
                        iE2 = cVarD.e(fVar, 0);
                        i10 |= 1;
                        l17 = l13;
                        withRecourseId12 = withRecourseId5;
                        l16 = l12;
                        break;
                    case 1:
                        l12 = l16;
                        withRecourseId5 = withRecourseId12;
                        l13 = (Long) cVarD.v(fVar, 1, h1.f64699a, l18);
                        i10 |= 2;
                        l17 = l13;
                        withRecourseId12 = withRecourseId5;
                        l16 = l12;
                        break;
                    case 2:
                        l14 = l16;
                        withRecourseId6 = withRecourseId12;
                        strB2 = cVarD.B(fVar, 2);
                        i10 |= 4;
                        withRecourseId12 = withRecourseId6;
                        l16 = l14;
                        l17 = l18;
                        break;
                    case 3:
                        l14 = l16;
                        withRecourseId6 = (WithRecourseId) cVarD.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, withRecourseId12);
                        i10 |= 8;
                        withRecourseId12 = withRecourseId6;
                        l16 = l14;
                        l17 = l18;
                        break;
                    case 4:
                        withRecourseId4 = withRecourseId12;
                        withRecourseId10 = (WithRecourseId) cVarD.v(fVar, 4, WithRecourseId$$serializer.INSTANCE, withRecourseId10);
                        i10 |= 16;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 5:
                        withRecourseId4 = withRecourseId12;
                        withRecourseId11 = (WithRecourseId) cVarD.v(fVar, 5, WithRecourseId$$serializer.INSTANCE, withRecourseId11);
                        i10 |= 32;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 6:
                        withRecourseId4 = withRecourseId12;
                        str19 = (String) cVarD.v(fVar, 6, x2.f64817a, str19);
                        i10 |= 64;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 7:
                        withRecourseId4 = withRecourseId12;
                        str21 = (String) cVarD.v(fVar, 7, x2.f64817a, str21);
                        i10 |= 128;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 8:
                        withRecourseId4 = withRecourseId12;
                        str18 = (String) cVarD.v(fVar, 8, x2.f64817a, str18);
                        i10 |= 256;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 9:
                        withRecourseId4 = withRecourseId12;
                        str17 = (String) cVarD.v(fVar, 9, x2.f64817a, str17);
                        i10 |= File.FLAG_O_TRUNC;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 10:
                        withRecourseId4 = withRecourseId12;
                        str16 = (String) cVarD.v(fVar, 10, x2.f64817a, str16);
                        i10 |= File.FLAG_O_APPEND;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 11:
                        withRecourseId4 = withRecourseId12;
                        str20 = (String) cVarD.v(fVar, 11, x2.f64817a, str20);
                        i10 |= 2048;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 12:
                        withRecourseId4 = withRecourseId12;
                        bool2 = (Boolean) cVarD.v(fVar, 12, i.f64704a, bool2);
                        i10 |= 4096;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 13:
                        withRecourseId4 = withRecourseId12;
                        str15 = (String) cVarD.v(fVar, 13, x2.f64817a, str15);
                        i10 |= 8192;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    case 14:
                        withRecourseId4 = withRecourseId12;
                        l16 = (Long) cVarD.v(fVar, 14, h1.f64699a, l16);
                        i10 |= 16384;
                        l17 = l18;
                        withRecourseId12 = withRecourseId4;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            l10 = l17;
            withRecourseId = withRecourseId10;
            str = str15;
            bool = bool2;
            str2 = str16;
            str3 = str17;
            str4 = str18;
            str5 = str19;
            str6 = str20;
            str7 = str21;
            withRecourseId2 = withRecourseId11;
            str8 = strB2;
            withRecourseId3 = withRecourseId12;
            l11 = l16;
            i11 = iE2;
        }
        int i12 = i10;
        cVarD.b(fVar);
        return new HostFullData(i12, i11, l10, str8, withRecourseId3, withRecourseId, withRecourseId2, str5, str7, str4, str3, str2, str6, bool, str, l11, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, HostFullData hostFullData) {
        t.f(fVar, "encoder");
        t.f(hostFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        HostFullData.write$Self$Termius_app_googleProductionRelease(hostFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
