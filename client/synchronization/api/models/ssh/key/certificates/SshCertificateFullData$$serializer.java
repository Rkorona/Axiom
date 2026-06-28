package com.server.auditor.ssh.client.synchronization.api.models.ssh.key.certificates;

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
public /* synthetic */ class SshCertificateFullData$$serializer implements n0 {
    public static final int $stable;
    public static final SshCertificateFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SshCertificateFullData$$serializer sshCertificateFullData$$serializer = new SshCertificateFullData$$serializer();
        INSTANCE = sshCertificateFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.ssh.key.certificates.SshCertificateFullData", sshCertificateFullData$$serializer, 8);
        i2Var.r("id", true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r(Table.SSH_CERTIFICATE, true);
        i2Var.r("content", true);
        i2Var.r("ssh_key", false);
        i2Var.r("updated_at", false);
        i2Var.r(Column.IS_SHARED, false);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SshCertificateFullData$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        c cVarU = a.u(h1Var);
        x2 x2Var = x2.f64817a;
        return new c[]{w0.f64808a, cVarU, a.u(x2Var), a.u(x2Var), WithRecourseId$$serializer.INSTANCE, x2Var, i.f64704a, a.u(h1Var)};
    }

    @Override // hv.b
    public final SshCertificateFullData deserialize(kv.e eVar) {
        int iE;
        Long l10;
        WithRecourseId withRecourseId;
        boolean z10;
        int i10;
        Long l11;
        String str;
        String str2;
        String str3;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 7;
        if (cVarD.l()) {
            iE = cVarD.e(fVar, 0);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 1, h1Var, null);
            x2 x2Var = x2.f64817a;
            String str4 = (String) cVarD.v(fVar, 2, x2Var, null);
            String str5 = (String) cVarD.v(fVar, 3, x2Var, null);
            WithRecourseId withRecourseId2 = (WithRecourseId) cVarD.i(fVar, 4, WithRecourseId$$serializer.INSTANCE, null);
            String strB = cVarD.B(fVar, 5);
            boolean zH = cVarD.H(fVar, 6);
            l10 = (Long) cVarD.v(fVar, 7, h1Var, null);
            z10 = zH;
            str3 = strB;
            str2 = str5;
            withRecourseId = withRecourseId2;
            str = str4;
            l11 = l12;
            i10 = 255;
        } else {
            boolean z11 = true;
            iE = 0;
            int i12 = 0;
            Long l13 = null;
            Long l14 = null;
            String str6 = null;
            String str7 = null;
            String strB2 = null;
            boolean zH2 = false;
            WithRecourseId withRecourseId3 = null;
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
                        str6 = (String) cVarD.v(fVar, 2, x2.f64817a, str6);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        str7 = (String) cVarD.v(fVar, 3, x2.f64817a, str7);
                        i12 |= 8;
                        break;
                    case 4:
                        withRecourseId3 = (WithRecourseId) cVarD.i(fVar, 4, WithRecourseId$$serializer.INSTANCE, withRecourseId3);
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
            withRecourseId = withRecourseId3;
            z10 = zH2;
            i10 = i12;
            l11 = l14;
            str = str6;
            str2 = str7;
            str3 = strB2;
        }
        int i13 = iE;
        cVarD.b(fVar);
        return new SshCertificateFullData(i10, i13, l11, str, str2, withRecourseId, str3, z10, l10, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SshCertificateFullData sshCertificateFullData) {
        t.f(fVar, "encoder");
        t.f(sshCertificateFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SshCertificateFullData.write$Self$Termius_app_googleProductionRelease(sshCertificateFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
