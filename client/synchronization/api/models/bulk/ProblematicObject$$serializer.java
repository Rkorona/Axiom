package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class ProblematicObject$$serializer implements n0 {
    public static final int $stable;
    public static final ProblematicObject$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ProblematicObject$$serializer problematicObject$$serializer = new ProblematicObject$$serializer();
        INSTANCE = problematicObject$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.bulk.ProblematicObject", problematicObject$$serializer, 3);
        i2Var.r("object_set", true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("id", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private ProblematicObject$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        c cVarU = a.u(x2.f64817a);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, a.u(h1Var), a.u(h1Var)};
    }

    @Override // hv.b
    public final ProblematicObject deserialize(kv.e eVar) {
        int i10;
        String str;
        Long l10;
        Long l11;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String str2 = null;
        if (cVarD.l()) {
            String str3 = (String) cVarD.v(fVar, 0, x2.f64817a, null);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 1, h1Var, null);
            str = str3;
            l11 = (Long) cVarD.v(fVar, 2, h1Var, null);
            l10 = l12;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Long l13 = null;
            Long l14 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    str2 = (String) cVarD.v(fVar, 0, x2.f64817a, str2);
                    i11 |= 1;
                } else if (iD == 1) {
                    l13 = (Long) cVarD.v(fVar, 1, h1.f64699a, l13);
                    i11 |= 2;
                } else {
                    if (iD != 2) {
                        throw new e0(iD);
                    }
                    l14 = (Long) cVarD.v(fVar, 2, h1.f64699a, l14);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = str2;
            l10 = l13;
            l11 = l14;
        }
        cVarD.b(fVar);
        return new ProblematicObject(i10, str, l10, l11, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ProblematicObject problematicObject) {
        t.f(fVar, "encoder");
        t.f(problematicObject, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        ProblematicObject.write$Self$Termius_app_googleProductionRelease(problematicObject, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
