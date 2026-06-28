package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
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
public /* synthetic */ class SshKeyChangePasswordModel$$serializer implements n0 {
    public static final int $stable;
    public static final SshKeyChangePasswordModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SshKeyChangePasswordModel$$serializer sshKeyChangePasswordModel$$serializer = new SshKeyChangePasswordModel$$serializer();
        INSTANCE = sshKeyChangePasswordModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.SshKeyChangePasswordModel", sshKeyChangePasswordModel$$serializer, 8);
        i2Var.r("label", true);
        i2Var.r(SshOptions.EXTRA_PASSPHRASE, true);
        i2Var.r("private_key", true);
        i2Var.r(SyncConstants.Bundle.PUBLIC_KEY, true);
        i2Var.r("id", false);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        i2Var.r(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SshKeyChangePasswordModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = iv.a.u(x2Var);
        c cVarU2 = iv.a.u(x2Var);
        c cVarU3 = iv.a.u(x2Var);
        c cVarU4 = iv.a.u(x2Var);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, cVarU2, cVarU3, cVarU4, h1Var, iv.a.u(i.f64704a), iv.a.u(h1Var), x2Var};
    }

    @Override // hv.b
    public final SshKeyChangePasswordModel deserialize(kv.e eVar) {
        int i10;
        String str;
        Long l10;
        Boolean bool;
        String str2;
        long j10;
        String str3;
        String str4;
        String strB;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 7;
        if (cVarD.l()) {
            x2 x2Var = x2.f64817a;
            String str5 = (String) cVarD.v(fVar, 0, x2Var, null);
            String str6 = (String) cVarD.v(fVar, 1, x2Var, null);
            String str7 = (String) cVarD.v(fVar, 2, x2Var, null);
            String str8 = (String) cVarD.v(fVar, 3, x2Var, null);
            long jO = cVarD.o(fVar, 4);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 5, i.f64704a, null);
            Long l11 = (Long) cVarD.v(fVar, 6, h1.f64699a, null);
            i10 = 255;
            str2 = str8;
            strB = cVarD.B(fVar, 7);
            l10 = l11;
            bool = bool2;
            j10 = jO;
            str4 = str7;
            str3 = str6;
            str = str5;
        } else {
            long jO2 = 0;
            boolean z10 = true;
            String str9 = null;
            Long l12 = null;
            Boolean bool3 = null;
            String str10 = null;
            String str11 = null;
            String strB2 = null;
            i10 = 0;
            String str12 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 7;
                        break;
                    case 0:
                        str9 = (String) cVarD.v(fVar, 0, x2.f64817a, str9);
                        i10 |= 1;
                        i11 = 7;
                        break;
                    case 1:
                        str10 = (String) cVarD.v(fVar, 1, x2.f64817a, str10);
                        i10 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        str11 = (String) cVarD.v(fVar, 2, x2.f64817a, str11);
                        i10 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        str12 = (String) cVarD.v(fVar, 3, x2.f64817a, str12);
                        i10 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        jO2 = cVarD.o(fVar, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        bool3 = (Boolean) cVarD.v(fVar, 5, i.f64704a, bool3);
                        i10 |= 32;
                        break;
                    case 6:
                        l12 = (Long) cVarD.v(fVar, 6, h1.f64699a, l12);
                        i10 |= 64;
                        break;
                    case 7:
                        strB2 = cVarD.B(fVar, i11);
                        i10 |= 128;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            str = str9;
            l10 = l12;
            bool = bool3;
            str2 = str12;
            j10 = jO2;
            str3 = str10;
            str4 = str11;
            strB = strB2;
        }
        int i12 = i10;
        cVarD.b(fVar);
        return new SshKeyChangePasswordModel(i12, str, str3, str4, str2, j10, bool, l10, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SshKeyChangePasswordModel sshKeyChangePasswordModel) {
        t.f(fVar, "encoder");
        t.f(sshKeyChangePasswordModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SshKeyChangePasswordModel.write$Self$Termius_app_googleProductionRelease(sshKeyChangePasswordModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
