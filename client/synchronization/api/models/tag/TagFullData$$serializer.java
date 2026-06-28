package com.server.auditor.ssh.client.synchronization.api.models.tag;

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
public /* synthetic */ class TagFullData$$serializer implements n0 {
    public static final int $stable;
    public static final TagFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        TagFullData$$serializer tagFullData$$serializer = new TagFullData$$serializer();
        INSTANCE = tagFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.tag.TagFullData", tagFullData$$serializer, 7);
        i2Var.r("id", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("updated_at", false);
        i2Var.r("label", true);
        i2Var.r("content", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private TagFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        c cVarU2 = a.u(i.f64704a);
        x2 x2Var = x2.f64817a;
        return new c[]{w0.f64808a, cVarU, cVarU2, x2Var, a.u(x2Var), a.u(x2Var), a.u(h1Var)};
    }

    @Override // hv.b
    public final TagFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        int i10;
        Long l11;
        Boolean bool;
        String str;
        String str2;
        String str3;
        boolean z10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 6;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 1, h1Var, null);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 2, i.f64704a, null);
            String strB = cVarD.B(fVar, 3);
            x2 x2Var = x2.f64817a;
            String str4 = (String) cVarD.v(fVar, 4, x2Var, null);
            String str5 = (String) cVarD.v(fVar, 5, x2Var, null);
            l10 = (Long) cVarD.v(fVar, 6, h1Var, null);
            str3 = str5;
            str = strB;
            str2 = str4;
            bool = bool2;
            l11 = l12;
            i10 = 127;
        } else {
            boolean z11 = true;
            iE = 0;
            Long l13 = null;
            Boolean bool3 = null;
            String strB2 = null;
            String str6 = null;
            String str7 = null;
            int i12 = 0;
            Long l14 = null;
            while (z11) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        z10 = true;
                        iE = cVarD.e(fVar, 0);
                        i12 |= 1;
                        i11 = 6;
                        break;
                    case 1:
                        z10 = true;
                        l13 = (Long) cVarD.v(fVar, 1, h1.f64699a, l13);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        bool3 = (Boolean) cVarD.v(fVar, 2, i.f64704a, bool3);
                        i12 |= 4;
                        break;
                    case 3:
                        strB2 = cVarD.B(fVar, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        str6 = (String) cVarD.v(fVar, 4, x2.f64817a, str6);
                        i12 |= 16;
                        break;
                    case 5:
                        str7 = (String) cVarD.v(fVar, 5, x2.f64817a, str7);
                        i12 |= 32;
                        break;
                    case 6:
                        l14 = (Long) cVarD.v(fVar, i11, h1.f64699a, l14);
                        i12 |= 64;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            l10 = l14;
            i10 = i12;
            l11 = l13;
            bool = bool3;
            str = strB2;
            str2 = str6;
            str3 = str7;
        }
        int i13 = iE;
        cVarD.b(fVar);
        return new TagFullData(i10, i13, l11, bool, str, str2, str3, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, TagFullData tagFullData) {
        t.f(fVar, "encoder");
        t.f(tagFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        TagFullData.write$Self$Termius_app_googleProductionRelease(tagFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
