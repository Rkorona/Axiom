package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import hv.b;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import java.util.List;
import ju.t;
import jv.f;
import kv.d;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class TeamResponse$$serializer implements n0 {
    public static final int $stable;
    public static final TeamResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TeamResponse$$serializer teamResponse$$serializer = new TeamResponse$$serializer();
        INSTANCE = teamResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.TeamResponse", teamResponse$$serializer, 13);
        i2Var.r("id", false);
        i2Var.r("owner", false);
        i2Var.r("owner_name", false);
        i2Var.r("owner_id", false);
        i2Var.r("owner_latest_activity", true);
        i2Var.r("is_owner", false);
        i2Var.r("pending_action", true);
        i2Var.r("members_count", false);
        i2Var.r("slots_count", false);
        i2Var.r(Column.MULTI_KEY_NAME, false);
        i2Var.r("two_factor_auth", false);
        i2Var.r("team_permissions", true);
        i2Var.r("encryption_schema", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private TeamResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = TeamResponse.$childSerializers;
        w0 w0Var = w0.f64808a;
        x2 x2Var = x2.f64817a;
        i iVar = i.f64704a;
        return new c[]{w0Var, x2Var, a.u(x2Var), w0Var, a.u(x2Var), iVar, a.u(x2Var), w0Var, w0Var, x2Var, iVar, nVarArr[11].getValue(), x2Var};
    }

    @Override // hv.b
    public final TeamResponse deserialize(kv.e eVar) {
        String str;
        List list;
        int i10;
        String str2;
        int i11;
        String str3;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        String str4;
        String str5;
        String strB;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = TeamResponse.$childSerializers;
        int i15 = 10;
        if (cVarD.l()) {
            int iE = cVarD.e(fVar, 0);
            String strB2 = cVarD.B(fVar, 1);
            x2 x2Var = x2.f64817a;
            String str6 = (String) cVarD.v(fVar, 2, x2Var, null);
            int iE2 = cVarD.e(fVar, 3);
            String str7 = (String) cVarD.v(fVar, 4, x2Var, null);
            boolean zH = cVarD.H(fVar, 5);
            String str8 = (String) cVarD.v(fVar, 6, x2Var, null);
            int iE3 = cVarD.e(fVar, 7);
            int iE4 = cVarD.e(fVar, 8);
            String strB3 = cVarD.B(fVar, 9);
            boolean zH2 = cVarD.H(fVar, 10);
            list = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), null);
            i11 = iE;
            str4 = strB2;
            z10 = zH2;
            str5 = strB3;
            i12 = iE3;
            str2 = str8;
            z11 = zH;
            i13 = iE2;
            i14 = iE4;
            str3 = str7;
            str = str6;
            strB = cVarD.B(fVar, 12);
            i10 = 8191;
        } else {
            int i16 = 12;
            int i17 = 0;
            boolean zH3 = false;
            int iE5 = 0;
            boolean zH4 = false;
            int iE6 = 0;
            int iE7 = 0;
            List list2 = null;
            String str9 = null;
            String strB4 = null;
            String strB5 = null;
            String strB6 = null;
            boolean z12 = true;
            int iE8 = 0;
            String str10 = null;
            String str11 = null;
            while (z12) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z12 = false;
                        i16 = 12;
                        break;
                    case 0:
                        i17 |= 1;
                        iE8 = cVarD.e(fVar, 0);
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 1:
                        strB4 = cVarD.B(fVar, 1);
                        i17 |= 2;
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 2:
                        str10 = (String) cVarD.v(fVar, 2, x2.f64817a, str10);
                        i17 |= 4;
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 3:
                        iE6 = cVarD.e(fVar, 3);
                        i17 |= 8;
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 4:
                        str11 = (String) cVarD.v(fVar, 4, x2.f64817a, str11);
                        i17 |= 16;
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 5:
                        zH4 = cVarD.H(fVar, 5);
                        i17 |= 32;
                        i16 = 12;
                        break;
                    case 6:
                        str9 = (String) cVarD.v(fVar, 6, x2.f64817a, str9);
                        i17 |= 64;
                        i16 = 12;
                        break;
                    case 7:
                        iE5 = cVarD.e(fVar, 7);
                        i17 |= 128;
                        i16 = 12;
                        break;
                    case 8:
                        iE7 = cVarD.e(fVar, 8);
                        i17 |= 256;
                        i16 = 12;
                        break;
                    case 9:
                        strB5 = cVarD.B(fVar, 9);
                        i17 |= File.FLAG_O_TRUNC;
                        i16 = 12;
                        break;
                    case 10:
                        zH3 = cVarD.H(fVar, i15);
                        i17 |= File.FLAG_O_APPEND;
                        i16 = 12;
                        break;
                    case 11:
                        list2 = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), list2);
                        i17 |= 2048;
                        i16 = 12;
                        break;
                    case 12:
                        strB6 = cVarD.B(fVar, i16);
                        i17 |= 4096;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            str = str10;
            list = list2;
            i10 = i17;
            str2 = str9;
            i11 = iE8;
            str3 = str11;
            z10 = zH3;
            i12 = iE5;
            z11 = zH4;
            i13 = iE6;
            i14 = iE7;
            str4 = strB4;
            str5 = strB5;
            strB = strB6;
        }
        cVarD.b(fVar);
        return new TeamResponse(i10, i11, str4, str, i13, str3, z11, str2, i12, i14, str5, z10, list, strB, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TeamResponse teamResponse) {
        t.f(fVar, "encoder");
        t.f(teamResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TeamResponse.write$Self$Termius_app_googleProductionRelease(teamResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
