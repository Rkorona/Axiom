package com.server.auditor.ssh.client.synchronization.api.models.identity;

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
public /* synthetic */ class IdentityFullData$$serializer implements n0 {
    public static final int $stable;
    public static final IdentityFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        IdentityFullData$$serializer identityFullData$$serializer = new IdentityFullData$$serializer();
        INSTANCE = identityFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityFullData", identityFullData$$serializer, 12);
        i2Var.r("id", false);
        i2Var.r("updated_at", false);
        i2Var.r("ssh_key", true);
        i2Var.r(Column.IS_VISIBLE, true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("username", true);
        i2Var.r("label", true);
        i2Var.r("password", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("content", true);
        i2Var.r("encrypted_with", true);
        i2Var.r(IdentityBulk.SSHID_MODE_NAME, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private IdentityFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = a.u(WithRecourseId$$serializer.INSTANCE);
        i iVar = i.f64704a;
        c cVarU2 = a.u(iVar);
        h1 h1Var = h1.f64699a;
        return new c[]{w0.f64808a, x2Var, cVarU, cVarU2, a.u(h1Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(iVar), a.u(x2Var), a.u(h1Var), a.u(x2Var)};
    }

    @Override // hv.b
    public final IdentityFullData deserialize(kv.e eVar) {
        int i10;
        WithRecourseId withRecourseId;
        Long l10;
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l11;
        Boolean bool2;
        String str6;
        int i11;
        int i12;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String strB = null;
        if (cVarD.l()) {
            int iE = cVarD.e(fVar, 0);
            String strB2 = cVarD.B(fVar, 1);
            WithRecourseId withRecourseId2 = (WithRecourseId) cVarD.v(fVar, 2, WithRecourseId$$serializer.INSTANCE, null);
            i iVar = i.f64704a;
            Boolean bool3 = (Boolean) cVarD.v(fVar, 3, iVar, null);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 4, h1Var, null);
            x2 x2Var = x2.f64817a;
            String str7 = (String) cVarD.v(fVar, 5, x2Var, null);
            String str8 = (String) cVarD.v(fVar, 6, x2Var, null);
            String str9 = (String) cVarD.v(fVar, 7, x2Var, null);
            Boolean bool4 = (Boolean) cVarD.v(fVar, 8, iVar, null);
            String str10 = (String) cVarD.v(fVar, 9, x2Var, null);
            i11 = iE;
            l10 = (Long) cVarD.v(fVar, 10, h1Var, null);
            str3 = (String) cVarD.v(fVar, 11, x2Var, null);
            str = str10;
            str4 = str9;
            str2 = str8;
            str5 = str7;
            bool2 = bool3;
            bool = bool4;
            l11 = l12;
            withRecourseId = withRecourseId2;
            str6 = strB2;
            i10 = 4095;
        } else {
            boolean z10 = true;
            int iE2 = 0;
            int i13 = 0;
            WithRecourseId withRecourseId3 = null;
            Long l13 = null;
            String str11 = null;
            Boolean bool5 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            Long l14 = null;
            Boolean bool6 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        i12 = iE2;
                        z10 = false;
                        iE2 = i12;
                        break;
                    case 0:
                        i13 |= 1;
                        iE2 = cVarD.e(fVar, 0);
                        break;
                    case 1:
                        i12 = iE2;
                        strB = cVarD.B(fVar, 1);
                        i13 |= 2;
                        iE2 = i12;
                        break;
                    case 2:
                        i12 = iE2;
                        withRecourseId3 = (WithRecourseId) cVarD.v(fVar, 2, WithRecourseId$$serializer.INSTANCE, withRecourseId3);
                        i13 |= 4;
                        iE2 = i12;
                        break;
                    case 3:
                        i12 = iE2;
                        bool6 = (Boolean) cVarD.v(fVar, 3, i.f64704a, bool6);
                        i13 |= 8;
                        iE2 = i12;
                        break;
                    case 4:
                        i12 = iE2;
                        l14 = (Long) cVarD.v(fVar, 4, h1.f64699a, l14);
                        i13 |= 16;
                        iE2 = i12;
                        break;
                    case 5:
                        i12 = iE2;
                        str15 = (String) cVarD.v(fVar, 5, x2.f64817a, str15);
                        i13 |= 32;
                        iE2 = i12;
                        break;
                    case 6:
                        i12 = iE2;
                        str12 = (String) cVarD.v(fVar, 6, x2.f64817a, str12);
                        i13 |= 64;
                        iE2 = i12;
                        break;
                    case 7:
                        i12 = iE2;
                        str14 = (String) cVarD.v(fVar, 7, x2.f64817a, str14);
                        i13 |= 128;
                        iE2 = i12;
                        break;
                    case 8:
                        i12 = iE2;
                        bool5 = (Boolean) cVarD.v(fVar, 8, i.f64704a, bool5);
                        i13 |= 256;
                        iE2 = i12;
                        break;
                    case 9:
                        str11 = (String) cVarD.v(fVar, 9, x2.f64817a, str11);
                        i13 |= File.FLAG_O_TRUNC;
                        iE2 = iE2;
                        break;
                    case 10:
                        i12 = iE2;
                        l13 = (Long) cVarD.v(fVar, 10, h1.f64699a, l13);
                        i13 |= File.FLAG_O_APPEND;
                        iE2 = i12;
                        break;
                    case 11:
                        i12 = iE2;
                        str13 = (String) cVarD.v(fVar, 11, x2.f64817a, str13);
                        i13 |= 2048;
                        iE2 = i12;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i13;
            withRecourseId = withRecourseId3;
            l10 = l13;
            str = str11;
            bool = bool5;
            str2 = str12;
            str3 = str13;
            str4 = str14;
            str5 = str15;
            l11 = l14;
            bool2 = bool6;
            str6 = strB;
            i11 = iE2;
        }
        cVarD.b(fVar);
        return new IdentityFullData(i10, i11, str6, withRecourseId, bool2, l11, str5, str2, str4, bool, str, l10, str3, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, IdentityFullData identityFullData) {
        t.f(fVar, "encoder");
        t.f(identityFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        IdentityFullData.write$Self$Termius_app_googleProductionRelease(identityFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
