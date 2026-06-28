package com.server.auditor.ssh.client.synchronization.api.models.identity;

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
import tp.b;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class SshConfigIdentityBulk$$serializer implements n0 {
    public static final int $stable;
    public static final SshConfigIdentityBulk$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SshConfigIdentityBulk$$serializer sshConfigIdentityBulk$$serializer = new SshConfigIdentityBulk$$serializer();
        INSTANCE = sshConfigIdentityBulk$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk", sshConfigIdentityBulk$$serializer, 6);
        i2Var.r("identity", true);
        i2Var.r("ssh_config", true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("id", true);
        i2Var.r("updated_at", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SshConfigIdentityBulk$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        b bVar = b.f80841a;
        c cVarU = a.u(bVar);
        c cVarU2 = a.u(bVar);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, cVarU2, a.u(h1Var), a.u(h1Var), a.u(x2.f64817a), a.u(h1Var)};
    }

    @Override // hv.b
    public final SshConfigIdentityBulk deserialize(kv.e eVar) {
        int i10;
        Object obj;
        Object obj2;
        Long l10;
        Long l11;
        String str;
        Long l12;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 5;
        Object objV = null;
        if (cVarD.l()) {
            b bVar = b.f80841a;
            Object objV2 = cVarD.v(fVar, 0, bVar, null);
            Object objV3 = cVarD.v(fVar, 1, bVar, null);
            h1 h1Var = h1.f64699a;
            Long l13 = (Long) cVarD.v(fVar, 2, h1Var, null);
            Long l14 = (Long) cVarD.v(fVar, 3, h1Var, null);
            String str2 = (String) cVarD.v(fVar, 4, x2.f64817a, null);
            obj2 = objV3;
            l12 = (Long) cVarD.v(fVar, 5, h1Var, null);
            l11 = l14;
            str = str2;
            l10 = l13;
            i10 = 63;
            obj = objV2;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object objV4 = null;
            Long l15 = null;
            Long l16 = null;
            String str3 = null;
            Long l17 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        objV = cVarD.v(fVar, 0, b.f80841a, objV);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        objV4 = cVarD.v(fVar, 1, b.f80841a, objV4);
                        i12 |= 2;
                        break;
                    case 2:
                        l15 = (Long) cVarD.v(fVar, 2, h1.f64699a, l15);
                        i12 |= 4;
                        break;
                    case 3:
                        l16 = (Long) cVarD.v(fVar, 3, h1.f64699a, l16);
                        i12 |= 8;
                        break;
                    case 4:
                        str3 = (String) cVarD.v(fVar, 4, x2.f64817a, str3);
                        i12 |= 16;
                        break;
                    case 5:
                        l17 = (Long) cVarD.v(fVar, i11, h1.f64699a, l17);
                        i12 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i12;
            obj = objV;
            obj2 = objV4;
            l10 = l15;
            l11 = l16;
            str = str3;
            l12 = l17;
        }
        cVarD.b(fVar);
        return new SshConfigIdentityBulk(i10, obj, obj2, l10, l11, str, l12, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SshConfigIdentityBulk sshConfigIdentityBulk) {
        t.f(fVar, "encoder");
        t.f(sshConfigIdentityBulk, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SshConfigIdentityBulk.write$Self$Termius_app_googleProductionRelease(sshConfigIdentityBulk, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
