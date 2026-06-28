package com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage;

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
public /* synthetic */ class PackageFullData$$serializer implements n0 {
    public static final int $stable;
    public static final PackageFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        PackageFullData$$serializer packageFullData$$serializer = new PackageFullData$$serializer();
        INSTANCE = packageFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageFullData", packageFullData$$serializer, 8);
        i2Var.r("id", true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("updated_at", false);
        i2Var.r(Column.CREATED_AT, true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("label", true);
        i2Var.r("content", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private PackageFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        x2 x2Var = x2.f64817a;
        return new c[]{w0.f64808a, cVarU, x2Var, a.u(x2Var), i.f64704a, x2Var, a.u(x2Var), a.u(h1Var)};
    }

    @Override // hv.b
    public final PackageFullData deserialize(kv.e eVar) {
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
        int i12 = 6;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 1, h1Var, null);
            String strB = cVarD.B(fVar, 2);
            x2 x2Var = x2.f64817a;
            String str5 = (String) cVarD.v(fVar, 3, x2Var, null);
            boolean zH = cVarD.H(fVar, 4);
            String strB2 = cVarD.B(fVar, 5);
            String str6 = (String) cVarD.v(fVar, 6, x2Var, null);
            l10 = (Long) cVarD.v(fVar, 7, h1Var, null);
            str = str6;
            str4 = strB2;
            str3 = str5;
            z10 = zH;
            str2 = strB;
            l11 = l12;
            i10 = 255;
        } else {
            boolean z11 = true;
            iE = 0;
            int i13 = 0;
            Long l13 = null;
            Long l14 = null;
            String strB3 = null;
            String str7 = null;
            String strB4 = null;
            boolean zH2 = false;
            String str8 = null;
            while (z11) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z11 = false;
                        i11 = 7;
                        break;
                    case 0:
                        iE = cVarD.e(fVar, 0);
                        i13 |= 1;
                        i11 = 7;
                        i12 = 6;
                        break;
                    case 1:
                        l14 = (Long) cVarD.v(fVar, 1, h1.f64699a, l14);
                        i13 |= 2;
                        i11 = 7;
                        i12 = 6;
                        break;
                    case 2:
                        strB3 = cVarD.B(fVar, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        str7 = (String) cVarD.v(fVar, 3, x2.f64817a, str7);
                        i13 |= 8;
                        break;
                    case 4:
                        zH2 = cVarD.H(fVar, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        strB4 = cVarD.B(fVar, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        str8 = (String) cVarD.v(fVar, i12, x2.f64817a, str8);
                        i13 |= 64;
                        break;
                    case 7:
                        l13 = (Long) cVarD.v(fVar, i11, h1.f64699a, l13);
                        i13 |= 128;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            l10 = l13;
            str = str8;
            z10 = zH2;
            i10 = i13;
            l11 = l14;
            str2 = strB3;
            str3 = str7;
            str4 = strB4;
        }
        int i14 = iE;
        cVarD.b(fVar);
        return new PackageFullData(i10, i14, l11, str2, str3, z10, str4, str, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, PackageFullData packageFullData) {
        t.f(fVar, "encoder");
        t.f(packageFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        PackageFullData.write$Self$Termius_app_googleProductionRelease(packageFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
