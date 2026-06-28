package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.database.Column;
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
public /* synthetic */ class SnippetChangePasswordModel$$serializer implements n0 {
    public static final int $stable;
    public static final SnippetChangePasswordModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SnippetChangePasswordModel$$serializer snippetChangePasswordModel$$serializer = new SnippetChangePasswordModel$$serializer();
        INSTANCE = snippetChangePasswordModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.SnippetChangePasswordModel", snippetChangePasswordModel$$serializer, 7);
        i2Var.r("label", true);
        i2Var.r("script", true);
        i2Var.r("auto_close", true);
        i2Var.r("id", false);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        i2Var.r(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SnippetChangePasswordModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        c cVarU = iv.a.u(x2Var);
        c cVarU2 = iv.a.u(x2Var);
        i iVar = i.f64704a;
        c cVarU3 = iv.a.u(iVar);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, cVarU2, cVarU3, h1Var, iv.a.u(iVar), iv.a.u(h1Var), x2Var};
    }

    @Override // hv.b
    public final SnippetChangePasswordModel deserialize(kv.e eVar) {
        int i10;
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        Long l10;
        String strB;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 6;
        String str3 = null;
        if (cVarD.l()) {
            x2 x2Var = x2.f64817a;
            String str4 = (String) cVarD.v(fVar, 0, x2Var, null);
            String str5 = (String) cVarD.v(fVar, 1, x2Var, null);
            i iVar = i.f64704a;
            Boolean bool3 = (Boolean) cVarD.v(fVar, 2, iVar, null);
            long jO = cVarD.o(fVar, 3);
            Boolean bool4 = (Boolean) cVarD.v(fVar, 4, iVar, null);
            Long l11 = (Long) cVarD.v(fVar, 5, h1.f64699a, null);
            str2 = str5;
            strB = cVarD.B(fVar, 6);
            l10 = l11;
            bool2 = bool4;
            i10 = 127;
            bool = bool3;
            str = str4;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Boolean bool5 = null;
            Long l12 = null;
            String strB2 = null;
            long jO2 = 0;
            String str6 = null;
            Boolean bool6 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 6;
                        break;
                    case 0:
                        str3 = (String) cVarD.v(fVar, 0, x2.f64817a, str3);
                        i12 |= 1;
                        i11 = 6;
                        break;
                    case 1:
                        str6 = (String) cVarD.v(fVar, 1, x2.f64817a, str6);
                        i12 |= 2;
                        break;
                    case 2:
                        bool6 = (Boolean) cVarD.v(fVar, 2, i.f64704a, bool6);
                        i12 |= 4;
                        break;
                    case 3:
                        jO2 = cVarD.o(fVar, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        bool5 = (Boolean) cVarD.v(fVar, 4, i.f64704a, bool5);
                        i12 |= 16;
                        break;
                    case 5:
                        l12 = (Long) cVarD.v(fVar, 5, h1.f64699a, l12);
                        i12 |= 32;
                        break;
                    case 6:
                        strB2 = cVarD.B(fVar, i11);
                        i12 |= 64;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i12;
            str = str3;
            str2 = str6;
            bool = bool6;
            bool2 = bool5;
            l10 = l12;
            strB = strB2;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new SnippetChangePasswordModel(i10, str, str2, bool, j10, bool2, l10, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SnippetChangePasswordModel snippetChangePasswordModel) {
        t.f(fVar, "encoder");
        t.f(snippetChangePasswordModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SnippetChangePasswordModel.write$Self$Termius_app_googleProductionRelease(snippetChangePasswordModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
