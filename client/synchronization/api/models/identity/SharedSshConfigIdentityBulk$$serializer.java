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
public /* synthetic */ class SharedSshConfigIdentityBulk$$serializer implements n0 {
    public static final int $stable;
    public static final SharedSshConfigIdentityBulk$$serializer INSTANCE;
    private static final f descriptor;

    static {
        SharedSshConfigIdentityBulk$$serializer sharedSshConfigIdentityBulk$$serializer = new SharedSshConfigIdentityBulk$$serializer();
        INSTANCE = sharedSshConfigIdentityBulk$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk", sharedSshConfigIdentityBulk$$serializer, 6);
        i2Var.r("identity", true);
        i2Var.r("ssh_config", true);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("id", false);
        i2Var.r("updated_at", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private SharedSshConfigIdentityBulk$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        b bVar = b.f80841a;
        c cVarU = a.u(bVar);
        c cVarU2 = a.u(bVar);
        h1 h1Var = h1.f64699a;
        return new c[]{cVarU, cVarU2, a.u(h1Var), h1Var, a.u(x2.f64817a), a.u(h1Var)};
    }

    @Override // hv.b
    public final SharedSshConfigIdentityBulk deserialize(kv.e eVar) {
        int i10;
        Object obj;
        Object obj2;
        Long l10;
        String str;
        Long l11;
        long j10;
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
            Long l12 = (Long) cVarD.v(fVar, 2, h1Var, null);
            long jO = cVarD.o(fVar, 3);
            String str2 = (String) cVarD.v(fVar, 4, x2.f64817a, null);
            obj2 = objV3;
            l11 = (Long) cVarD.v(fVar, 5, h1Var, null);
            str = str2;
            i10 = 63;
            l10 = l12;
            obj = objV2;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str3 = null;
            Long l13 = null;
            long jO2 = 0;
            Object objV4 = null;
            Long l14 = null;
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
                        l14 = (Long) cVarD.v(fVar, 2, h1.f64699a, l14);
                        i12 |= 4;
                        break;
                    case 3:
                        jO2 = cVarD.o(fVar, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        str3 = (String) cVarD.v(fVar, 4, x2.f64817a, str3);
                        i12 |= 16;
                        break;
                    case 5:
                        l13 = (Long) cVarD.v(fVar, i11, h1.f64699a, l13);
                        i12 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i12;
            obj = objV;
            obj2 = objV4;
            l10 = l14;
            str = str3;
            l11 = l13;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new SharedSshConfigIdentityBulk(i10, obj, obj2, l10, j10, str, l11, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, SharedSshConfigIdentityBulk sharedSshConfigIdentityBulk) {
        t.f(fVar, "encoder");
        t.f(sharedSshConfigIdentityBulk, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        SharedSshConfigIdentityBulk.write$Self$Termius_app_googleProductionRelease(sharedSshConfigIdentityBulk, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
