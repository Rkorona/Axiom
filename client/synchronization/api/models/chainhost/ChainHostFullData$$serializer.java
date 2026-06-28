package com.server.auditor.ssh.client.synchronization.api.models.chainhost;

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
import lv.h1;
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
public /* synthetic */ class ChainHostFullData$$serializer implements n0 {
    public static final int $stable;
    public static final ChainHostFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ChainHostFullData$$serializer chainHostFullData$$serializer = new ChainHostFullData$$serializer();
        INSTANCE = chainHostFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostFullData", chainHostFullData$$serializer, 6);
        i2Var.r("id", false);
        i2Var.r("updated_at", true);
        i2Var.r("ssh_config", true);
        i2Var.r("hosts_chain", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private ChainHostFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = ChainHostFullData.$childSerializers;
        c cVarU = a.u(x2.f64817a);
        h1 h1Var = h1.f64699a;
        return new c[]{w0.f64808a, cVarU, a.u(h1Var), a.u((c) nVarArr[3].getValue()), a.u(i.f64704a), a.u(h1Var)};
    }

    @Override // hv.b
    public final ChainHostFullData deserialize(kv.e eVar) {
        int iE;
        int i10;
        String str;
        Long l10;
        List list;
        Boolean bool;
        Long l11;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = ChainHostFullData.$childSerializers;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            String str2 = (String) cVarD.v(fVar, 1, x2.f64817a, null);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 2, h1Var, null);
            List list2 = (List) cVarD.v(fVar, 3, (b) nVarArr[3].getValue(), null);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 4, i.f64704a, null);
            list = list2;
            l11 = (Long) cVarD.v(fVar, 5, h1Var, null);
            bool = bool2;
            l10 = l12;
            i10 = 63;
            str = str2;
        } else {
            boolean z10 = true;
            iE = 0;
            String str3 = null;
            Long l13 = null;
            List list3 = null;
            Boolean bool3 = null;
            Long l14 = null;
            int i11 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        iE = cVarD.e(fVar, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str3 = (String) cVarD.v(fVar, 1, x2.f64817a, str3);
                        i11 |= 2;
                        break;
                    case 2:
                        l13 = (Long) cVarD.v(fVar, 2, h1.f64699a, l13);
                        i11 |= 4;
                        break;
                    case 3:
                        list3 = (List) cVarD.v(fVar, 3, (b) nVarArr[3].getValue(), list3);
                        i11 |= 8;
                        break;
                    case 4:
                        bool3 = (Boolean) cVarD.v(fVar, 4, i.f64704a, bool3);
                        i11 |= 16;
                        break;
                    case 5:
                        l14 = (Long) cVarD.v(fVar, 5, h1.f64699a, l14);
                        i11 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i11;
            str = str3;
            l10 = l13;
            list = list3;
            bool = bool3;
            l11 = l14;
        }
        int i12 = iE;
        cVarD.b(fVar);
        return new ChainHostFullData(i10, i12, str, l10, list, bool, l11, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ChainHostFullData chainHostFullData) {
        t.f(fVar, "encoder");
        t.f(chainHostFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        ChainHostFullData.write$Self$Termius_app_googleProductionRelease(chainHostFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
