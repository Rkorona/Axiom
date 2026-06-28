package com.server.auditor.ssh.client.synchronization.api.models.snippethost;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
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
public /* synthetic */ class SnippetHostFullData$$serializer implements n0 {
    public static final int $stable;
    public static final SnippetHostFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SnippetHostFullData$$serializer snippetHostFullData$$serializer = new SnippetHostFullData$$serializer();
        INSTANCE = snippetHostFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostFullData", snippetHostFullData$$serializer, 7);
        i2Var.r("id", false);
        i2Var.r("updated_at", true);
        i2Var.r(Table.SNIPPET, true);
        i2Var.r("host", true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SnippetHostFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        c cVarU = a.u(x2.f64817a);
        WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
        c cVarU2 = a.u(withRecourseId$$serializer);
        c cVarU3 = a.u(withRecourseId$$serializer);
        h1 h1Var = h1.f64699a;
        return new c[]{w0.f64808a, cVarU, cVarU2, cVarU3, a.u(h1Var), a.u(i.f64704a), a.u(h1Var)};
    }

    @Override // hv.b
    public final SnippetHostFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        int i10;
        String str;
        WithRecourseId withRecourseId;
        WithRecourseId withRecourseId2;
        Long l11;
        Boolean bool;
        boolean z10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 6;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            String str2 = (String) cVarD.v(fVar, 1, x2.f64817a, null);
            WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
            WithRecourseId withRecourseId3 = (WithRecourseId) cVarD.v(fVar, 2, withRecourseId$$serializer, null);
            WithRecourseId withRecourseId4 = (WithRecourseId) cVarD.v(fVar, 3, withRecourseId$$serializer, null);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 4, h1Var, null);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 5, i.f64704a, null);
            l10 = (Long) cVarD.v(fVar, 6, h1Var, null);
            bool = bool2;
            withRecourseId2 = withRecourseId4;
            l11 = l12;
            withRecourseId = withRecourseId3;
            str = str2;
            i10 = 127;
        } else {
            boolean z11 = true;
            iE = 0;
            String str3 = null;
            WithRecourseId withRecourseId5 = null;
            WithRecourseId withRecourseId6 = null;
            Long l13 = null;
            Boolean bool3 = null;
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
                        str3 = (String) cVarD.v(fVar, 1, x2.f64817a, str3);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        withRecourseId5 = (WithRecourseId) cVarD.v(fVar, 2, WithRecourseId$$serializer.INSTANCE, withRecourseId5);
                        i12 |= 4;
                        break;
                    case 3:
                        withRecourseId6 = (WithRecourseId) cVarD.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, withRecourseId6);
                        i12 |= 8;
                        break;
                    case 4:
                        l13 = (Long) cVarD.v(fVar, 4, h1.f64699a, l13);
                        i12 |= 16;
                        break;
                    case 5:
                        bool3 = (Boolean) cVarD.v(fVar, 5, i.f64704a, bool3);
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
            str = str3;
            withRecourseId = withRecourseId5;
            withRecourseId2 = withRecourseId6;
            l11 = l13;
            bool = bool3;
        }
        int i13 = iE;
        cVarD.b(fVar);
        return new SnippetHostFullData(i10, i13, str, withRecourseId, withRecourseId2, l11, bool, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SnippetHostFullData snippetHostFullData) {
        t.f(fVar, "encoder");
        t.f(snippetHostFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SnippetHostFullData.write$Self$Termius_app_googleProductionRelease(snippetHostFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
