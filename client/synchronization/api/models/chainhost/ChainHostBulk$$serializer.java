package com.server.auditor.ssh.client.synchronization.api.models.chainhost;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import java.util.List;
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
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class ChainHostBulk$$serializer implements n0 {
    public static final int $stable;
    public static final ChainHostBulk$$serializer INSTANCE;
    private static final f descriptor;

    static {
        ChainHostBulk$$serializer chainHostBulk$$serializer = new ChainHostBulk$$serializer();
        INSTANCE = chainHostBulk$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostBulk", chainHostBulk$$serializer, 6);
        i2Var.r("ssh_config", true);
        i2Var.r("hosts_chain", false);
        i2Var.r(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, true);
        i2Var.r("id", false);
        i2Var.r("updated_at", true);
        i2Var.r("encrypted_with", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private ChainHostBulk$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = ChainHostBulk.$childSerializers;
        h1 h1Var = h1.f64699a;
        return new c[]{a.u(b.f80841a), nVarArr[1].getValue(), a.u(h1Var), h1Var, a.u(x2.f64817a), a.u(h1Var)};
    }

    @Override // hv.b
    public final ChainHostBulk deserialize(kv.e eVar) {
        int i10;
        Object obj;
        List list;
        Long l10;
        String str;
        Long l11;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = ChainHostBulk.$childSerializers;
        int i11 = 5;
        Object objV = null;
        if (cVarD.l()) {
            Object objV2 = cVarD.v(fVar, 0, b.f80841a, null);
            List list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
            h1 h1Var = h1.f64699a;
            Long l12 = (Long) cVarD.v(fVar, 2, h1Var, null);
            long jO = cVarD.o(fVar, 3);
            String str2 = (String) cVarD.v(fVar, 4, x2.f64817a, null);
            list = list2;
            obj = objV2;
            l11 = (Long) cVarD.v(fVar, 5, h1Var, null);
            str = str2;
            i10 = 63;
            l10 = l12;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str3 = null;
            Long l13 = null;
            long jO2 = 0;
            List list3 = null;
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
                        list3 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list3);
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
            list = list3;
            l10 = l14;
            str = str3;
            l11 = l13;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new ChainHostBulk(i10, obj, list, l10, j10, str, l11, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, ChainHostBulk chainHostBulk) {
        t.f(fVar, "encoder");
        t.f(chainHostBulk, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        ChainHostBulk.write$Self$Termius_app_googleProductionRelease(chainHostBulk, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
