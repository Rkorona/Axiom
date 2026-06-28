package com.server.auditor.ssh.client.synchronization.api.models.autocomplete;

import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.w0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class DictionaryItem$$serializer implements n0 {
    public static final int $stable;
    public static final DictionaryItem$$serializer INSTANCE;
    private static final f descriptor;

    static {
        DictionaryItem$$serializer dictionaryItem$$serializer = new DictionaryItem$$serializer();
        INSTANCE = dictionaryItem$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.autocomplete.DictionaryItem", dictionaryItem$$serializer, 4);
        i2Var.r("id", false);
        i2Var.r(Column.COMMAND, false);
        i2Var.r("rating", false);
        i2Var.r("updated_at", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private DictionaryItem$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        w0 w0Var = w0.f64808a;
        return new c[]{w0Var, x2.f64817a, w0Var, h1.f64699a};
    }

    @Override // hv.b
    public final DictionaryItem deserialize(kv.e eVar) {
        int iE;
        int i10;
        int iE2;
        String str;
        long jO;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            String strB = cVarD.B(fVar, 1);
            i10 = 15;
            iE2 = cVarD.e(fVar, 2);
            str = strB;
            jO = cVarD.o(fVar, 3);
        } else {
            String strB2 = null;
            boolean z10 = true;
            iE = 0;
            long jO2 = 0;
            int i11 = 0;
            int iE3 = 0;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    iE = cVarD.e(fVar, 0);
                    i11 |= 1;
                } else if (iD == 1) {
                    strB2 = cVarD.B(fVar, 1);
                    i11 |= 2;
                } else if (iD == 2) {
                    iE3 = cVarD.e(fVar, 2);
                    i11 |= 4;
                } else {
                    if (iD != 3) {
                        throw new e0(iD);
                    }
                    jO2 = cVarD.o(fVar, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            iE2 = iE3;
            str = strB2;
            jO = jO2;
        }
        int i12 = iE;
        cVarD.b(fVar);
        return new DictionaryItem(i10, i12, str, iE2, jO, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, DictionaryItem dictionaryItem) {
        t.f(fVar, "encoder");
        t.f(dictionaryItem, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        DictionaryItem.write$Self$Termius_app_googleProductionRelease(dictionaryItem, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
