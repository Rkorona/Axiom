package com.server.auditor.ssh.client.synchronization.api.models.ssh.key;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
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
public /* synthetic */ class SshKeyFullData$$serializer implements n0 {
    public static final int $stable;
    public static final SshKeyFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SshKeyFullData$$serializer sshKeyFullData$$serializer = new SshKeyFullData$$serializer();
        INSTANCE = sshKeyFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyFullData", sshKeyFullData$$serializer, 11);
        i2Var.r("id", false);
        i2Var.r(Column.CREATED_AT, true);
        i2Var.r("updated_at", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("label", true);
        i2Var.r(SshOptions.EXTRA_PASSPHRASE, true);
        i2Var.r("private_key", true);
        i2Var.r(SyncConstants.Bundle.PUBLIC_KEY, true);
        i2Var.r("content", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SshKeyFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = a.u(x2Var);
        h1 h1Var = h1.f64699a;
        return new c[]{w0.f64808a, cVarU, x2Var, a.u(h1Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(i.f64704a), a.u(h1Var)};
    }

    @Override // hv.b
    public final SshKeyFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l11;
        int i10;
        String str6;
        String str7;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 10;
        int i12 = 9;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            x2 x2Var = x2.f64817a;
            String str8 = (String) cVarD.v(fVar, 1, x2Var, null);
            String strB = cVarD.B(fVar, 2);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 3, h1Var, null);
            String str9 = (String) cVarD.v(fVar, 4, x2Var, null);
            String str10 = (String) cVarD.v(fVar, 5, x2Var, null);
            String str11 = (String) cVarD.v(fVar, 6, x2Var, null);
            String str12 = (String) cVarD.v(fVar, 7, x2Var, null);
            String str13 = (String) cVarD.v(fVar, 8, x2Var, null);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 9, i.f64704a, null);
            l10 = (Long) cVarD.v(fVar, 10, h1Var, null);
            bool = bool2;
            str3 = str12;
            str2 = str11;
            str4 = str10;
            l11 = l12;
            str = str13;
            str5 = str9;
            str7 = strB;
            str6 = str8;
            i10 = 2047;
        } else {
            boolean z10 = true;
            iE = 0;
            Long l13 = null;
            Boolean bool3 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String strB2 = null;
            int i13 = 0;
            Long l14 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 10;
                        break;
                    case 0:
                        iE = cVarD.e(fVar, 0);
                        i13 |= 1;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 1:
                        str19 = (String) cVarD.v(fVar, 1, x2.f64817a, str19);
                        i13 |= 2;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 2:
                        strB2 = cVarD.B(fVar, 2);
                        i13 |= 4;
                        i11 = 10;
                        break;
                    case 3:
                        l14 = (Long) cVarD.v(fVar, 3, h1.f64699a, l14);
                        i13 |= 8;
                        i11 = 10;
                        break;
                    case 4:
                        str18 = (String) cVarD.v(fVar, 4, x2.f64817a, str18);
                        i13 |= 16;
                        i11 = 10;
                        break;
                    case 5:
                        str17 = (String) cVarD.v(fVar, 5, x2.f64817a, str17);
                        i13 |= 32;
                        i11 = 10;
                        break;
                    case 6:
                        str15 = (String) cVarD.v(fVar, 6, x2.f64817a, str15);
                        i13 |= 64;
                        i11 = 10;
                        break;
                    case 7:
                        str16 = (String) cVarD.v(fVar, 7, x2.f64817a, str16);
                        i13 |= 128;
                        i11 = 10;
                        break;
                    case 8:
                        str14 = (String) cVarD.v(fVar, 8, x2.f64817a, str14);
                        i13 |= 256;
                        i11 = 10;
                        break;
                    case 9:
                        bool3 = (Boolean) cVarD.v(fVar, i12, i.f64704a, bool3);
                        i13 |= File.FLAG_O_TRUNC;
                        break;
                    case 10:
                        l13 = (Long) cVarD.v(fVar, i11, h1.f64699a, l13);
                        i13 |= File.FLAG_O_APPEND;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            l10 = l13;
            bool = bool3;
            str = str14;
            str2 = str15;
            str3 = str16;
            str4 = str17;
            str5 = str18;
            l11 = l14;
            i10 = i13;
            str6 = str19;
            str7 = strB2;
        }
        int i14 = iE;
        cVarD.b(fVar);
        return new SshKeyFullData(i10, i14, str6, str7, l11, str5, str4, str2, str3, str, bool, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SshKeyFullData sshKeyFullData) {
        t.f(fVar, "encoder");
        t.f(sshKeyFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SshKeyFullData.write$Self$Termius_app_googleProductionRelease(sshKeyFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
