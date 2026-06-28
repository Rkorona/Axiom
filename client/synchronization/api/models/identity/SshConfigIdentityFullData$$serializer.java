package com.server.auditor.ssh.client.synchronization.api.models.identity;

import com.server.auditor.ssh.client.database.Column;
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
public /* synthetic */ class SshConfigIdentityFullData$$serializer implements n0 {
    public static final int $stable;
    public static final SshConfigIdentityFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SshConfigIdentityFullData$$serializer sshConfigIdentityFullData$$serializer = new SshConfigIdentityFullData$$serializer();
        INSTANCE = sshConfigIdentityFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityFullData", sshConfigIdentityFullData$$serializer, 7);
        i2Var.r("id", true);
        i2Var.r("updated_at", false);
        i2Var.r("ssh_config", false);
        i2Var.r("identity", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SshConfigIdentityFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        c cVarU2 = a.u(h1Var);
        WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
        return new c[]{w0.f64808a, x2.f64817a, withRecourseId$$serializer, withRecourseId$$serializer, cVarU, i.f64704a, cVarU2};
    }

    @Override // hv.b
    public final SshConfigIdentityFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        boolean z10;
        int i10;
        String str;
        WithRecourseId withRecourseId;
        WithRecourseId withRecourseId2;
        Long l11;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            String strB = cVarD.B(fVar, 1);
            WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
            WithRecourseId withRecourseId3 = (WithRecourseId) cVarD.i(fVar, 2, withRecourseId$$serializer, null);
            WithRecourseId withRecourseId4 = (WithRecourseId) cVarD.i(fVar, 3, withRecourseId$$serializer, null);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 4, h1Var, null);
            boolean zH = cVarD.H(fVar, 5);
            l10 = (Long) cVarD.v(fVar, 6, h1Var, null);
            z10 = zH;
            withRecourseId2 = withRecourseId4;
            l11 = l12;
            withRecourseId = withRecourseId3;
            str = strB;
            i10 = 127;
        } else {
            boolean z11 = true;
            iE = 0;
            int i11 = 0;
            String strB2 = null;
            WithRecourseId withRecourseId5 = null;
            WithRecourseId withRecourseId6 = null;
            Long l13 = null;
            boolean zH2 = false;
            Long l14 = null;
            while (z11) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        iE = cVarD.e(fVar, 0);
                        continue;
                    case 1:
                        strB2 = cVarD.B(fVar, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        withRecourseId5 = (WithRecourseId) cVarD.i(fVar, 2, WithRecourseId$$serializer.INSTANCE, withRecourseId5);
                        i11 |= 4;
                        break;
                    case 3:
                        withRecourseId6 = (WithRecourseId) cVarD.i(fVar, 3, WithRecourseId$$serializer.INSTANCE, withRecourseId6);
                        i11 |= 8;
                        break;
                    case 4:
                        l13 = (Long) cVarD.v(fVar, 4, h1.f64699a, l13);
                        i11 |= 16;
                        break;
                    case 5:
                        zH2 = cVarD.H(fVar, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        l14 = (Long) cVarD.v(fVar, 6, h1.f64699a, l14);
                        i11 |= 64;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            l10 = l14;
            z10 = zH2;
            i10 = i11;
            str = strB2;
            withRecourseId = withRecourseId5;
            withRecourseId2 = withRecourseId6;
            l11 = l13;
        }
        int i12 = iE;
        cVarD.b(fVar);
        return new SshConfigIdentityFullData(i10, i12, str, withRecourseId, withRecourseId2, l11, z10, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SshConfigIdentityFullData sshConfigIdentityFullData) {
        t.f(fVar, "encoder");
        t.f(sshConfigIdentityFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SshConfigIdentityFullData.write$Self$Termius_app_googleProductionRelease(sshConfigIdentityFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
