package com.server.auditor.ssh.client.database.patches.tables;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.patches.tables.SnippetVariableOddScriptStructureClear;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.n;

/* JADX INFO: loaded from: classes3.dex */
@ut.e
public /* synthetic */ class SnippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer implements n0 {
    public static final int $stable;
    public static final SnippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer INSTANCE;
    private static final jv.f descriptor;

    static {
        SnippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer snippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer = new SnippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer();
        INSTANCE = snippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.database.patches.tables.SnippetVariableOddScriptStructureClear.WorkaroundSnippetScriptStructure", snippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer, 2);
        i2Var.r(Column.TYPE, false);
        i2Var.r("content", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private SnippetVariableOddScriptStructureClear$WorkaroundSnippetScriptStructure$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final hv.c[] childSerializers() {
        return new hv.c[]{SnippetVariableOddScriptStructureClear.WorkaroundSnippetScriptStructure.$childSerializers[0].getValue(), x2.f64817a};
    }

    @Override // hv.b
    public final SnippetVariableOddScriptStructureClear.WorkaroundSnippetScriptStructure deserialize(kv.e eVar) {
        SnippetVariableOddScriptStructureClear.ContentType contentType;
        String strB;
        int i10;
        t.f(eVar, "decoder");
        jv.f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = SnippetVariableOddScriptStructureClear.WorkaroundSnippetScriptStructure.$childSerializers;
        if (cVarD.l()) {
            contentType = (SnippetVariableOddScriptStructureClear.ContentType) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
            strB = cVarD.B(fVar, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            SnippetVariableOddScriptStructureClear.ContentType contentType2 = null;
            String strB2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    contentType2 = (SnippetVariableOddScriptStructureClear.ContentType) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), contentType2);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    strB2 = cVarD.B(fVar, 1);
                    i11 |= 2;
                }
            }
            contentType = contentType2;
            strB = strB2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new SnippetVariableOddScriptStructureClear.WorkaroundSnippetScriptStructure(i10, contentType, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final jv.f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SnippetVariableOddScriptStructureClear.WorkaroundSnippetScriptStructure workaroundSnippetScriptStructure) {
        t.f(fVar, "encoder");
        t.f(workaroundSnippetScriptStructure, SerializableEvent.VALUE_FIELD);
        jv.f fVar2 = descriptor;
        kv.d dVarD = fVar.d(fVar2);
        SnippetVariableOddScriptStructureClear.WorkaroundSnippetScriptStructure.write$Self$Termius_app_googleProductionRelease(workaroundSnippetScriptStructure, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public hv.c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
