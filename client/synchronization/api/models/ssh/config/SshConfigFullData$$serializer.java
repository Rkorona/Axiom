package com.server.auditor.ssh.client.synchronization.api.models.ssh.config;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
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
public /* synthetic */ class SshConfigFullData$$serializer implements n0 {
    public static final int $stable;
    public static final SshConfigFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SshConfigFullData$$serializer sshConfigFullData$$serializer = new SshConfigFullData$$serializer();
        INSTANCE = sshConfigFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigFullData", sshConfigFullData$$serializer, 23);
        i2Var.r("id", false);
        i2Var.r("updated_at", true);
        i2Var.r("identity", true);
        i2Var.r(SshConfigBulk.PROXY_ID_SERIAL_NAME, true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r(SshConfigBulk.STARTUP_SNIPPET_ID_SERIAL_NAME, true);
        i2Var.r("color_scheme", true);
        i2Var.r(Column.CHARSET, true);
        i2Var.r(Column.PORT, true);
        i2Var.r(Column.FONT_SIZE, true);
        i2Var.r("strict_host_key_check", true);
        i2Var.r(Column.USE_SSH_KEY, true);
        i2Var.r(Column.TIMEOUT, true);
        i2Var.r("is_forward_ports", true);
        i2Var.r(Column.KEEP_ALIVE_PACKAGES, true);
        i2Var.r("cursor_blink", true);
        i2Var.r(SshOptions.EXTRA_SSH_USE_MOSH, true);
        i2Var.r("agent_forwarding", true);
        i2Var.r(Column.MOSH_SERVER_COMMAND, true);
        i2Var.r(Column.ENVIRONMENT_VARIABLES, true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("content", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SshConfigFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        w0 w0Var = w0.f64808a;
        x2 x2Var = x2.f64817a;
        c cVarU = a.u(x2Var);
        WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
        c cVarU2 = a.u(withRecourseId$$serializer);
        c cVarU3 = a.u(withRecourseId$$serializer);
        h1 h1Var = h1.f64699a;
        c cVarU4 = a.u(h1Var);
        c cVarU5 = a.u(withRecourseId$$serializer);
        c cVarU6 = a.u(x2Var);
        c cVarU7 = a.u(x2Var);
        c cVarU8 = a.u(w0Var);
        c cVarU9 = a.u(w0Var);
        i iVar = i.f64704a;
        return new c[]{w0Var, cVarU, cVarU2, cVarU3, cVarU4, cVarU5, cVarU6, cVarU7, cVarU8, cVarU9, a.u(iVar), a.u(iVar), a.u(w0Var), a.u(iVar), a.u(w0Var), a.u(iVar), a.u(iVar), a.u(iVar), a.u(x2Var), a.u(x2Var), a.u(iVar), a.u(x2Var), a.u(h1Var)};
    }

    @Override // hv.b
    public final SshConfigFullData deserialize(kv.e eVar) {
        String str;
        int i10;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        Boolean bool4;
        Integer num2;
        Long l10;
        Boolean bool5;
        Boolean bool6;
        WithRecourseId withRecourseId;
        WithRecourseId withRecourseId2;
        Long l11;
        WithRecourseId withRecourseId3;
        String str5;
        String str6;
        Integer num3;
        Integer num4;
        Boolean bool7;
        int i11;
        Boolean bool8;
        int i12;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            int iE = cVarD.e(fVar, 0);
            x2 x2Var = x2.f64817a;
            String str7 = (String) cVarD.v(fVar, 1, x2Var, null);
            WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
            WithRecourseId withRecourseId4 = (WithRecourseId) cVarD.v(fVar, 2, withRecourseId$$serializer, null);
            WithRecourseId withRecourseId5 = (WithRecourseId) cVarD.v(fVar, 3, withRecourseId$$serializer, null);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 4, h1Var, null);
            WithRecourseId withRecourseId6 = (WithRecourseId) cVarD.v(fVar, 5, withRecourseId$$serializer, null);
            String str8 = (String) cVarD.v(fVar, 6, x2Var, null);
            String str9 = (String) cVarD.v(fVar, 7, x2Var, null);
            w0 w0Var = w0.f64808a;
            Integer num5 = (Integer) cVarD.v(fVar, 8, w0Var, null);
            Integer num6 = (Integer) cVarD.v(fVar, 9, w0Var, null);
            i iVar = i.f64704a;
            Boolean bool12 = (Boolean) cVarD.v(fVar, 10, iVar, null);
            Boolean bool13 = (Boolean) cVarD.v(fVar, 11, iVar, null);
            Integer num7 = (Integer) cVarD.v(fVar, 12, w0Var, null);
            Boolean bool14 = (Boolean) cVarD.v(fVar, 13, iVar, null);
            Integer num8 = (Integer) cVarD.v(fVar, 14, w0Var, null);
            Boolean bool15 = (Boolean) cVarD.v(fVar, 15, iVar, null);
            Boolean bool16 = (Boolean) cVarD.v(fVar, 16, iVar, null);
            Boolean bool17 = (Boolean) cVarD.v(fVar, 17, iVar, null);
            String str10 = (String) cVarD.v(fVar, 18, x2Var, null);
            String str11 = (String) cVarD.v(fVar, 19, x2Var, null);
            Boolean bool18 = (Boolean) cVarD.v(fVar, 20, iVar, null);
            str = (String) cVarD.v(fVar, 21, x2Var, null);
            i10 = 8388607;
            bool = bool18;
            withRecourseId2 = withRecourseId5;
            l11 = l12;
            num3 = num5;
            withRecourseId = withRecourseId4;
            str2 = str7;
            l10 = (Long) cVarD.v(fVar, 22, h1Var, null);
            str5 = str8;
            num4 = num6;
            str6 = str9;
            bool4 = bool15;
            str3 = str11;
            str4 = str10;
            bool2 = bool17;
            bool3 = bool16;
            num = num8;
            bool5 = bool14;
            num2 = num7;
            bool6 = bool13;
            bool7 = bool12;
            i11 = iE;
            withRecourseId3 = withRecourseId6;
        } else {
            boolean z10 = true;
            int iE2 = 0;
            Boolean bool19 = null;
            str = null;
            String str12 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            String str13 = null;
            Boolean bool22 = null;
            Integer num9 = null;
            Boolean bool23 = null;
            Integer num10 = null;
            Boolean bool24 = null;
            Long l13 = null;
            String str14 = null;
            WithRecourseId withRecourseId7 = null;
            WithRecourseId withRecourseId8 = null;
            Long l14 = null;
            WithRecourseId withRecourseId9 = null;
            String str15 = null;
            String str16 = null;
            Integer num11 = null;
            Integer num12 = null;
            i10 = 0;
            Boolean bool25 = null;
            while (z10) {
                Boolean bool26 = bool24;
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        bool9 = bool19;
                        bool10 = bool21;
                        bool11 = bool26;
                        z10 = false;
                        bool19 = bool9;
                        bool21 = bool10;
                        bool24 = bool11;
                        break;
                    case 0:
                        bool9 = bool19;
                        bool10 = bool21;
                        bool11 = bool26;
                        iE2 = cVarD.e(fVar, 0);
                        i10 |= 1;
                        bool19 = bool9;
                        bool21 = bool10;
                        bool24 = bool11;
                        break;
                    case 1:
                        bool11 = bool26;
                        str14 = (String) cVarD.v(fVar, 1, x2.f64817a, str14);
                        i10 |= 2;
                        bool19 = bool19;
                        bool21 = bool21;
                        withRecourseId7 = withRecourseId7;
                        bool24 = bool11;
                        break;
                    case 2:
                        bool11 = bool26;
                        withRecourseId7 = (WithRecourseId) cVarD.v(fVar, 2, WithRecourseId$$serializer.INSTANCE, withRecourseId7);
                        i10 |= 4;
                        bool19 = bool19;
                        bool21 = bool21;
                        withRecourseId8 = withRecourseId8;
                        bool24 = bool11;
                        break;
                    case 3:
                        bool11 = bool26;
                        withRecourseId8 = (WithRecourseId) cVarD.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, withRecourseId8);
                        i10 |= 8;
                        bool19 = bool19;
                        bool21 = bool21;
                        l14 = l14;
                        bool24 = bool11;
                        break;
                    case 4:
                        bool11 = bool26;
                        l14 = (Long) cVarD.v(fVar, 4, h1.f64699a, l14);
                        i10 |= 16;
                        bool19 = bool19;
                        bool21 = bool21;
                        withRecourseId9 = withRecourseId9;
                        bool24 = bool11;
                        break;
                    case 5:
                        bool11 = bool26;
                        withRecourseId9 = (WithRecourseId) cVarD.v(fVar, 5, WithRecourseId$$serializer.INSTANCE, withRecourseId9);
                        i10 |= 32;
                        bool19 = bool19;
                        bool21 = bool21;
                        str15 = str15;
                        bool24 = bool11;
                        break;
                    case 6:
                        bool11 = bool26;
                        str15 = (String) cVarD.v(fVar, 6, x2.f64817a, str15);
                        i10 |= 64;
                        bool19 = bool19;
                        bool21 = bool21;
                        str16 = str16;
                        bool24 = bool11;
                        break;
                    case 7:
                        bool11 = bool26;
                        str16 = (String) cVarD.v(fVar, 7, x2.f64817a, str16);
                        i10 |= 128;
                        bool19 = bool19;
                        bool21 = bool21;
                        num11 = num11;
                        bool24 = bool11;
                        break;
                    case 8:
                        bool11 = bool26;
                        num11 = (Integer) cVarD.v(fVar, 8, w0.f64808a, num11);
                        i10 |= 256;
                        bool19 = bool19;
                        bool21 = bool21;
                        num12 = num12;
                        bool24 = bool11;
                        break;
                    case 9:
                        bool9 = bool19;
                        bool10 = bool21;
                        bool11 = bool26;
                        num12 = (Integer) cVarD.v(fVar, 9, w0.f64808a, num12);
                        i10 |= File.FLAG_O_TRUNC;
                        bool19 = bool9;
                        bool21 = bool10;
                        bool24 = bool11;
                        break;
                    case 10:
                        Boolean bool27 = bool19;
                        Boolean bool28 = (Boolean) cVarD.v(fVar, 10, i.f64704a, bool26);
                        i10 |= File.FLAG_O_APPEND;
                        bool24 = bool28;
                        bool19 = bool27;
                        bool21 = bool21;
                        break;
                    case 11:
                        bool21 = (Boolean) cVarD.v(fVar, 11, i.f64704a, bool21);
                        i10 |= 2048;
                        bool19 = bool19;
                        bool24 = bool26;
                        break;
                    case 12:
                        bool8 = bool21;
                        num10 = (Integer) cVarD.v(fVar, 12, w0.f64808a, num10);
                        i10 |= 4096;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 13:
                        bool8 = bool21;
                        bool19 = (Boolean) cVarD.v(fVar, 13, i.f64704a, bool19);
                        i10 |= 8192;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 14:
                        bool8 = bool21;
                        num9 = (Integer) cVarD.v(fVar, 14, w0.f64808a, num9);
                        i10 |= 16384;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 15:
                        bool8 = bool21;
                        bool23 = (Boolean) cVarD.v(fVar, 15, i.f64704a, bool23);
                        i12 = 32768;
                        i10 |= i12;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 16:
                        bool8 = bool21;
                        bool25 = (Boolean) cVarD.v(fVar, 16, i.f64704a, bool25);
                        i12 = LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE;
                        i10 |= i12;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 17:
                        bool8 = bool21;
                        bool22 = (Boolean) cVarD.v(fVar, 17, i.f64704a, bool22);
                        i12 = 131072;
                        i10 |= i12;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 18:
                        bool8 = bool21;
                        str13 = (String) cVarD.v(fVar, 18, x2.f64817a, str13);
                        i12 = 262144;
                        i10 |= i12;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 19:
                        bool8 = bool21;
                        str12 = (String) cVarD.v(fVar, 19, x2.f64817a, str12);
                        i12 = 524288;
                        i10 |= i12;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 20:
                        bool8 = bool21;
                        bool20 = (Boolean) cVarD.v(fVar, 20, i.f64704a, bool20);
                        i12 = 1048576;
                        i10 |= i12;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 21:
                        bool8 = bool21;
                        str = (String) cVarD.v(fVar, 21, x2.f64817a, str);
                        i12 = 2097152;
                        i10 |= i12;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    case 22:
                        bool8 = bool21;
                        l13 = (Long) cVarD.v(fVar, 22, h1.f64699a, l13);
                        i12 = 4194304;
                        i10 |= i12;
                        bool24 = bool26;
                        bool21 = bool8;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            str2 = str14;
            str3 = str12;
            bool = bool20;
            str4 = str13;
            bool2 = bool22;
            bool3 = bool25;
            num = num9;
            bool4 = bool23;
            num2 = num10;
            l10 = l13;
            bool5 = bool19;
            bool6 = bool21;
            withRecourseId = withRecourseId7;
            withRecourseId2 = withRecourseId8;
            l11 = l14;
            withRecourseId3 = withRecourseId9;
            str5 = str15;
            str6 = str16;
            num3 = num11;
            num4 = num12;
            bool7 = bool24;
            i11 = iE2;
        }
        String str17 = str;
        int i13 = i10;
        cVarD.b(fVar);
        return new SshConfigFullData(i13, i11, str2, withRecourseId, withRecourseId2, l11, withRecourseId3, str5, str6, num3, num4, bool7, bool6, num2, bool5, num, bool4, bool3, bool2, str4, str3, bool, str17, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SshConfigFullData sshConfigFullData) {
        t.f(fVar, "encoder");
        t.f(sshConfigFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SshConfigFullData.write$Self$Termius_app_googleProductionRelease(sshConfigFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
