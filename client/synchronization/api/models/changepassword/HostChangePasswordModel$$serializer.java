package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.HostChangePasswordModel;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class HostChangePasswordModel$$serializer implements n0 {
    public static final int $stable;
    public static final HostChangePasswordModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        HostChangePasswordModel$$serializer hostChangePasswordModel$$serializer = new HostChangePasswordModel$$serializer();
        INSTANCE = hostChangePasswordModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.HostChangePasswordModel", hostChangePasswordModel$$serializer, 10);
        i2Var.r("id", false);
        i2Var.r(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME, true);
        i2Var.r("encrypted_with", true);
        i2Var.r(Column.ADDRESS, true);
        i2Var.r("label", true);
        i2Var.r("os_name", false);
        i2Var.r(Column.INTERACTION_DATE, false);
        i2Var.r("ssh_config", true);
        i2Var.r("backspace", false);
        i2Var.r(Column.IS_SHARED, false);
        descriptor = i2Var;
        $stable = 8;
    }

    private HostChangePasswordModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        x2 x2Var = x2.f64817a;
        return new c[]{h1Var, x2Var, iv.a.u(h1Var), iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(HostChangePasswordModel$SshConfig$$serializer.INSTANCE), iv.a.u(x2Var), i.f64704a};
    }

    @Override // hv.b
    public final HostChangePasswordModel deserialize(kv.e eVar) {
        boolean zH;
        String str;
        String str2;
        HostChangePasswordModel.SshConfig sshConfig;
        String str3;
        String str4;
        String str5;
        int i10;
        String str6;
        Long l10;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 9;
        if (cVarD.l()) {
            long jO = cVarD.o(fVar, 0);
            String strB = cVarD.B(fVar, 1);
            Long l11 = (Long) cVarD.v(fVar, 2, h1.f64699a, null);
            x2 x2Var = x2.f64817a;
            String str7 = (String) cVarD.v(fVar, 3, x2Var, null);
            String str8 = (String) cVarD.v(fVar, 4, x2Var, null);
            String str9 = (String) cVarD.v(fVar, 5, x2Var, null);
            String str10 = (String) cVarD.v(fVar, 6, x2Var, null);
            HostChangePasswordModel.SshConfig sshConfig2 = (HostChangePasswordModel.SshConfig) cVarD.v(fVar, 7, HostChangePasswordModel$SshConfig$$serializer.INSTANCE, null);
            String str11 = (String) cVarD.v(fVar, 8, x2Var, null);
            str6 = strB;
            zH = cVarD.H(fVar, 9);
            sshConfig = sshConfig2;
            str2 = str10;
            str3 = str9;
            str5 = str7;
            str = str11;
            str4 = str8;
            l10 = l11;
            i10 = 1023;
            j10 = jO;
        } else {
            boolean z10 = true;
            boolean zH2 = false;
            String str12 = null;
            String str13 = null;
            HostChangePasswordModel.SshConfig sshConfig3 = null;
            String str14 = null;
            String str15 = null;
            long jO2 = 0;
            int i12 = 0;
            String str16 = null;
            String strB2 = null;
            Long l12 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        break;
                    case 0:
                        jO2 = cVarD.o(fVar, 0);
                        i12 |= 1;
                        i11 = 9;
                        break;
                    case 1:
                        strB2 = cVarD.B(fVar, 1);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        l12 = (Long) cVarD.v(fVar, 2, h1.f64699a, l12);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        str16 = (String) cVarD.v(fVar, 3, x2.f64817a, str16);
                        i12 |= 8;
                        i11 = 9;
                        break;
                    case 4:
                        str15 = (String) cVarD.v(fVar, 4, x2.f64817a, str15);
                        i12 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        str14 = (String) cVarD.v(fVar, 5, x2.f64817a, str14);
                        i12 |= 32;
                        i11 = 9;
                        break;
                    case 6:
                        str13 = (String) cVarD.v(fVar, 6, x2.f64817a, str13);
                        i12 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        sshConfig3 = (HostChangePasswordModel.SshConfig) cVarD.v(fVar, 7, HostChangePasswordModel$SshConfig$$serializer.INSTANCE, sshConfig3);
                        i12 |= 128;
                        break;
                    case 8:
                        str12 = (String) cVarD.v(fVar, 8, x2.f64817a, str12);
                        i12 |= 256;
                        break;
                    case 9:
                        zH2 = cVarD.H(fVar, i11);
                        i12 |= File.FLAG_O_TRUNC;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            zH = zH2;
            str = str12;
            str2 = str13;
            sshConfig = sshConfig3;
            str3 = str14;
            str4 = str15;
            str5 = str16;
            i10 = i12;
            str6 = strB2;
            l10 = l12;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new HostChangePasswordModel(i10, j10, str6, l10, str5, str4, str3, str2, sshConfig, str, zH, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, HostChangePasswordModel hostChangePasswordModel) {
        t.f(fVar, "encoder");
        t.f(hostChangePasswordModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        HostChangePasswordModel.write$Self$Termius_app_googleProductionRelease(hostChangePasswordModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
