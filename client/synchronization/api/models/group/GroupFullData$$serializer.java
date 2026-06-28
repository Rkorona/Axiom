package com.server.auditor.ssh.client.synchronization.api.models.group;

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
public /* synthetic */ class GroupFullData$$serializer implements n0 {
    public static final int $stable;
    public static final GroupFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        GroupFullData$$serializer groupFullData$$serializer = new GroupFullData$$serializer();
        INSTANCE = groupFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.group.GroupFullData", groupFullData$$serializer, 12);
        i2Var.r("id", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("updated_at", false);
        i2Var.r("ssh_config", true);
        i2Var.r("telnet_config", true);
        i2Var.r("parent_group", true);
        i2Var.r("content", true);
        i2Var.r("label", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("sharing_mode", true);
        i2Var.r("credentials_mode", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private GroupFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        x2 x2Var = x2.f64817a;
        WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
        return new c[]{w0.f64808a, cVarU, x2Var, a.u(withRecourseId$$serializer), a.u(withRecourseId$$serializer), a.u(withRecourseId$$serializer), a.u(x2Var), a.u(x2Var), a.u(i.f64704a), a.u(x2Var), a.u(x2Var), a.u(h1Var)};
    }

    @Override // hv.b
    public final GroupFullData deserialize(kv.e eVar) {
        Long l10;
        int i10;
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        WithRecourseId withRecourseId;
        WithRecourseId withRecourseId2;
        WithRecourseId withRecourseId3;
        Long l11;
        int i11;
        int i12;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        Long l12 = null;
        if (cVarD.l()) {
            int iE = cVarD.e(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l13 = (Long) cVarD.v(fVar, 1, h1Var, null);
            String strB = cVarD.B(fVar, 2);
            WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
            WithRecourseId withRecourseId4 = (WithRecourseId) cVarD.v(fVar, 3, withRecourseId$$serializer, null);
            WithRecourseId withRecourseId5 = (WithRecourseId) cVarD.v(fVar, 4, withRecourseId$$serializer, null);
            WithRecourseId withRecourseId6 = (WithRecourseId) cVarD.v(fVar, 5, withRecourseId$$serializer, null);
            x2 x2Var = x2.f64817a;
            String str6 = (String) cVarD.v(fVar, 6, x2Var, null);
            String str7 = (String) cVarD.v(fVar, 7, x2Var, null);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 8, i.f64704a, null);
            String str8 = (String) cVarD.v(fVar, 9, x2Var, null);
            String str9 = (String) cVarD.v(fVar, 10, x2Var, null);
            l10 = (Long) cVarD.v(fVar, 11, h1Var, null);
            i11 = iE;
            withRecourseId = withRecourseId6;
            bool = bool2;
            str3 = str8;
            str5 = str7;
            str4 = str6;
            str2 = str9;
            withRecourseId3 = withRecourseId4;
            withRecourseId2 = withRecourseId5;
            str = strB;
            l11 = l13;
            i10 = 4095;
        } else {
            boolean z10 = true;
            int iE2 = 0;
            int i13 = 0;
            String strB2 = null;
            String str10 = null;
            String str11 = null;
            Boolean bool3 = null;
            String str12 = null;
            l10 = null;
            String str13 = null;
            WithRecourseId withRecourseId7 = null;
            WithRecourseId withRecourseId8 = null;
            WithRecourseId withRecourseId9 = null;
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
                        l12 = (Long) cVarD.v(fVar, 1, h1.f64699a, l12);
                        i13 |= 2;
                        iE2 = i12;
                        break;
                    case 2:
                        i12 = iE2;
                        strB2 = cVarD.B(fVar, 2);
                        i13 |= 4;
                        iE2 = i12;
                        break;
                    case 3:
                        i12 = iE2;
                        withRecourseId9 = (WithRecourseId) cVarD.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, withRecourseId9);
                        i13 |= 8;
                        iE2 = i12;
                        break;
                    case 4:
                        i12 = iE2;
                        withRecourseId8 = (WithRecourseId) cVarD.v(fVar, 4, WithRecourseId$$serializer.INSTANCE, withRecourseId8);
                        i13 |= 16;
                        iE2 = i12;
                        break;
                    case 5:
                        i12 = iE2;
                        withRecourseId7 = (WithRecourseId) cVarD.v(fVar, 5, WithRecourseId$$serializer.INSTANCE, withRecourseId7);
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
                        str13 = (String) cVarD.v(fVar, 7, x2.f64817a, str13);
                        i13 |= 128;
                        iE2 = i12;
                        break;
                    case 8:
                        i12 = iE2;
                        bool3 = (Boolean) cVarD.v(fVar, 8, i.f64704a, bool3);
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
                        str10 = (String) cVarD.v(fVar, 10, x2.f64817a, str10);
                        i13 |= File.FLAG_O_APPEND;
                        iE2 = i12;
                        break;
                    case 11:
                        i12 = iE2;
                        l10 = (Long) cVarD.v(fVar, 11, h1.f64699a, l10);
                        i13 |= 2048;
                        iE2 = i12;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i13;
            str = strB2;
            str2 = str10;
            str3 = str11;
            bool = bool3;
            str4 = str12;
            str5 = str13;
            withRecourseId = withRecourseId7;
            withRecourseId2 = withRecourseId8;
            withRecourseId3 = withRecourseId9;
            l11 = l12;
            i11 = iE2;
        }
        Long l14 = l10;
        cVarD.b(fVar);
        return new GroupFullData(i10, i11, l11, str, withRecourseId3, withRecourseId2, withRecourseId, str4, str5, bool, str3, str2, l14, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, GroupFullData groupFullData) {
        t.f(fVar, "encoder");
        t.f(groupFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        GroupFullData.write$Self$Termius_app_googleProductionRelease(groupFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
