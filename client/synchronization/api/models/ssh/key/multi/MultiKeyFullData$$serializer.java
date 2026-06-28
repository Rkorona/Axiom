package com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi;

import com.server.auditor.ssh.client.database.Column;
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
public /* synthetic */ class MultiKeyFullData$$serializer implements n0 {
    public static final int $stable;
    public static final MultiKeyFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        MultiKeyFullData$$serializer multiKeyFullData$$serializer = new MultiKeyFullData$$serializer();
        INSTANCE = multiKeyFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyFullData", multiKeyFullData$$serializer, 8);
        i2Var.r("id", true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r(Column.MULTI_KEY_NAME, true);
        i2Var.r("username", true);
        i2Var.r("content", true);
        i2Var.r("updated_at", false);
        i2Var.r(Column.IS_SHARED, false);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private MultiKeyFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        x2 x2Var = x2.f64817a;
        return new c[]{w0.f64808a, cVarU, a.u(x2Var), a.u(x2Var), a.u(x2Var), x2Var, i.f64704a, a.u(h1Var)};
    }

    @Override // hv.b
    public final MultiKeyFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        String str;
        boolean z10;
        int i10;
        Long l11;
        String str2;
        String str3;
        String str4;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 7;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 1, h1Var, null);
            x2 x2Var = x2.f64817a;
            String str5 = (String) cVarD.v(fVar, 2, x2Var, null);
            String str6 = (String) cVarD.v(fVar, 3, x2Var, null);
            String str7 = (String) cVarD.v(fVar, 4, x2Var, null);
            String strB = cVarD.B(fVar, 5);
            boolean zH = cVarD.H(fVar, 6);
            l10 = (Long) cVarD.v(fVar, 7, h1Var, null);
            z10 = zH;
            str4 = strB;
            str3 = str6;
            str = str7;
            str2 = str5;
            l11 = l12;
            i10 = 255;
        } else {
            boolean z11 = true;
            iE = 0;
            int i12 = 0;
            Long l13 = null;
            Long l14 = null;
            String str8 = null;
            String str9 = null;
            String strB2 = null;
            boolean zH2 = false;
            String str10 = null;
            while (z11) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        iE = cVarD.e(fVar, 0);
                        i12 |= 1;
                        i11 = 7;
                        break;
                    case 1:
                        l14 = (Long) cVarD.v(fVar, 1, h1.f64699a, l14);
                        i12 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        str8 = (String) cVarD.v(fVar, 2, x2.f64817a, str8);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        str9 = (String) cVarD.v(fVar, 3, x2.f64817a, str9);
                        i12 |= 8;
                        break;
                    case 4:
                        str10 = (String) cVarD.v(fVar, 4, x2.f64817a, str10);
                        i12 |= 16;
                        break;
                    case 5:
                        strB2 = cVarD.B(fVar, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        zH2 = cVarD.H(fVar, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        l13 = (Long) cVarD.v(fVar, i11, h1.f64699a, l13);
                        i12 |= 128;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            l10 = l13;
            str = str10;
            z10 = zH2;
            i10 = i12;
            l11 = l14;
            str2 = str8;
            str3 = str9;
            str4 = strB2;
        }
        int i13 = iE;
        cVarD.b(fVar);
        return new MultiKeyFullData(i10, i13, l11, str2, str3, str, str4, z10, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, MultiKeyFullData multiKeyFullData) {
        t.f(fVar, "encoder");
        t.f(multiKeyFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        MultiKeyFullData.write$Self$Termius_app_googleProductionRelease(multiKeyFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
