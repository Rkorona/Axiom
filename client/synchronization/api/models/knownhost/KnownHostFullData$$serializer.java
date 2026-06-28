package com.server.auditor.ssh.client.synchronization.api.models.knownhost;

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
public /* synthetic */ class KnownHostFullData$$serializer implements n0 {
    public static final int $stable;
    public static final KnownHostFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        KnownHostFullData$$serializer knownHostFullData$$serializer = new KnownHostFullData$$serializer();
        INSTANCE = knownHostFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostFullData", knownHostFullData$$serializer, 8);
        i2Var.r("id", true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("updated_at", true);
        i2Var.r(Column.HOSTNAMES, true);
        i2Var.r(SerializableEvent.KEY_FIELD, true);
        i2Var.r("content", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private KnownHostFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        x2 x2Var = x2.f64817a;
        return new c[]{w0.f64808a, cVarU, a.u(x2Var), a.u(x2Var), a.u(x2Var), a.u(x2Var), i.f64704a, a.u(h1Var)};
    }

    @Override // hv.b
    public final KnownHostFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        String str;
        String str2;
        boolean z10;
        int i10;
        Long l11;
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
            String str8 = (String) cVarD.v(fVar, 5, x2Var, null);
            boolean zH = cVarD.H(fVar, 6);
            l10 = (Long) cVarD.v(fVar, 7, h1Var, null);
            z10 = zH;
            str = str8;
            str4 = str6;
            str2 = str7;
            str3 = str5;
            l11 = l12;
            i10 = 255;
        } else {
            boolean z11 = true;
            iE = 0;
            int i12 = 0;
            Long l13 = null;
            String str9 = null;
            Long l14 = null;
            String str10 = null;
            String str11 = null;
            boolean zH2 = false;
            String str12 = null;
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
                        str10 = (String) cVarD.v(fVar, 2, x2.f64817a, str10);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        str11 = (String) cVarD.v(fVar, 3, x2.f64817a, str11);
                        i12 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        str12 = (String) cVarD.v(fVar, 4, x2.f64817a, str12);
                        i12 |= 16;
                        break;
                    case 5:
                        str9 = (String) cVarD.v(fVar, 5, x2.f64817a, str9);
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
            str = str9;
            str2 = str12;
            z10 = zH2;
            i10 = i12;
            l11 = l14;
            str3 = str10;
            str4 = str11;
        }
        int i13 = iE;
        cVarD.b(fVar);
        return new KnownHostFullData(i10, i13, l11, str3, str4, str2, str, z10, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, KnownHostFullData knownHostFullData) {
        t.f(fVar, "encoder");
        t.f(knownHostFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        KnownHostFullData.write$Self$Termius_app_googleProductionRelease(knownHostFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
