package com.server.auditor.ssh.client.synchronization.api.models.snippet;

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
public /* synthetic */ class SnippetFullData$$serializer implements n0 {
    public static final int $stable;
    public static final SnippetFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SnippetFullData$$serializer snippetFullData$$serializer = new SnippetFullData$$serializer();
        INSTANCE = snippetFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetFullData", snippetFullData$$serializer, 10);
        i2Var.r("id", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("updated_at", true);
        i2Var.r("content", true);
        i2Var.r("label", true);
        i2Var.r("script", true);
        i2Var.r("auto_close", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("package", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SnippetFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        x2 x2Var = x2.f64817a;
        c cVarU2 = a.u(x2Var);
        c cVarU3 = a.u(x2Var);
        c cVarU4 = a.u(x2Var);
        c cVarU5 = a.u(x2Var);
        i iVar = i.f64704a;
        return new c[]{w0.f64808a, cVarU, cVarU2, cVarU3, cVarU4, cVarU5, a.u(iVar), a.u(iVar), a.u(WithRecourseId$$serializer.INSTANCE), a.u(h1Var)};
    }

    @Override // hv.b
    public final SnippetFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        WithRecourseId withRecourseId;
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        String str3;
        int i10;
        Long l11;
        String str4;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 9;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 1, h1Var, null);
            x2 x2Var = x2.f64817a;
            String str5 = (String) cVarD.v(fVar, 2, x2Var, null);
            String str6 = (String) cVarD.v(fVar, 3, x2Var, null);
            String str7 = (String) cVarD.v(fVar, 4, x2Var, null);
            String str8 = (String) cVarD.v(fVar, 5, x2Var, null);
            i iVar = i.f64704a;
            Boolean bool3 = (Boolean) cVarD.v(fVar, 6, iVar, null);
            Boolean bool4 = (Boolean) cVarD.v(fVar, 7, iVar, null);
            WithRecourseId withRecourseId2 = (WithRecourseId) cVarD.v(fVar, 8, WithRecourseId$$serializer.INSTANCE, null);
            l10 = (Long) cVarD.v(fVar, 9, h1Var, null);
            bool2 = bool4;
            bool = bool3;
            str = str8;
            str3 = str6;
            withRecourseId = withRecourseId2;
            str2 = str7;
            str4 = str5;
            l11 = l12;
            i10 = 1023;
        } else {
            boolean z10 = true;
            iE = 0;
            Long l13 = null;
            WithRecourseId withRecourseId3 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str9 = null;
            String str10 = null;
            Long l14 = null;
            String str11 = null;
            int i12 = 0;
            String str12 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        iE = cVarD.e(fVar, 0);
                        i12 |= 1;
                        i11 = 9;
                        break;
                    case 1:
                        l14 = (Long) cVarD.v(fVar, 1, h1.f64699a, l14);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        str11 = (String) cVarD.v(fVar, 2, x2.f64817a, str11);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        str12 = (String) cVarD.v(fVar, 3, x2.f64817a, str12);
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
                        bool5 = (Boolean) cVarD.v(fVar, 6, i.f64704a, bool5);
                        i12 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        bool6 = (Boolean) cVarD.v(fVar, 7, i.f64704a, bool6);
                        i12 |= 128;
                        i11 = 9;
                        break;
                    case 8:
                        withRecourseId3 = (WithRecourseId) cVarD.v(fVar, 8, WithRecourseId$$serializer.INSTANCE, withRecourseId3);
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
            withRecourseId = withRecourseId3;
            bool = bool5;
            bool2 = bool6;
            str = str9;
            str2 = str10;
            str3 = str12;
            i10 = i12;
            l11 = l14;
            str4 = str11;
        }
        int i13 = iE;
        cVarD.b(fVar);
        return new SnippetFullData(i10, i13, l11, str4, str3, str2, str, bool, bool2, withRecourseId, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SnippetFullData snippetFullData) {
        t.f(fVar, "encoder");
        t.f(snippetFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SnippetFullData.write$Self$Termius_app_googleProductionRelease(snippetFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
