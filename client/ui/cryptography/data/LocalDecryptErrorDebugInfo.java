package com.server.auditor.ssh.client.ui.cryptography.data;

import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class LocalDecryptErrorDebugInfo {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final long entityRemoteId;
    private final String entityType;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40169b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40168a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.cryptography.data.LocalDecryptErrorDebugInfo", aVar, 2);
            i2Var.r("entity_type", false);
            i2Var.r("entity_remote_id", false);
            descriptor = i2Var;
            f40169b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocalDecryptErrorDebugInfo deserialize(e eVar) {
            String str;
            int i10;
            long jO;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                str = (String) cVarD.v(fVar, 0, x2.f64817a, null);
                i10 = 3;
                jO = cVarD.o(fVar, 1);
            } else {
                long jO2 = 0;
                boolean z10 = true;
                str = null;
                i10 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        str = (String) cVarD.v(fVar, 0, x2.f64817a, str);
                        i10 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        jO2 = cVarD.o(fVar, 1);
                        i10 |= 2;
                    }
                }
                jO = jO2;
            }
            String str2 = str;
            int i11 = i10;
            cVarD.b(fVar);
            return new LocalDecryptErrorDebugInfo(i11, str2, jO, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, LocalDecryptErrorDebugInfo localDecryptErrorDebugInfo) {
            t.f(fVar, "encoder");
            t.f(localDecryptErrorDebugInfo, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            LocalDecryptErrorDebugInfo.write$Self$Termius_app_googleProductionRelease(localDecryptErrorDebugInfo, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{iv.a.u(x2.f64817a), h1.f64699a};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f40168a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ LocalDecryptErrorDebugInfo(int i10, String str, long j10, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f40168a.getDescriptor());
        }
        this.entityType = str;
        this.entityRemoteId = j10;
    }

    public static /* synthetic */ LocalDecryptErrorDebugInfo copy$default(LocalDecryptErrorDebugInfo localDecryptErrorDebugInfo, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localDecryptErrorDebugInfo.entityType;
        }
        if ((i10 & 2) != 0) {
            j10 = localDecryptErrorDebugInfo.entityRemoteId;
        }
        return localDecryptErrorDebugInfo.copy(str, j10);
    }

    @o("entity_remote_id")
    public static /* synthetic */ void getEntityRemoteId$annotations() {
    }

    @o("entity_type")
    public static /* synthetic */ void getEntityType$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(LocalDecryptErrorDebugInfo localDecryptErrorDebugInfo, d dVar, f fVar) {
        dVar.v(fVar, 0, x2.f64817a, localDecryptErrorDebugInfo.entityType);
        dVar.q(fVar, 1, localDecryptErrorDebugInfo.entityRemoteId);
    }

    public final String component1() {
        return this.entityType;
    }

    public final long component2() {
        return this.entityRemoteId;
    }

    public final LocalDecryptErrorDebugInfo copy(String str, long j10) {
        return new LocalDecryptErrorDebugInfo(str, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDecryptErrorDebugInfo)) {
            return false;
        }
        LocalDecryptErrorDebugInfo localDecryptErrorDebugInfo = (LocalDecryptErrorDebugInfo) obj;
        return t.b(this.entityType, localDecryptErrorDebugInfo.entityType) && this.entityRemoteId == localDecryptErrorDebugInfo.entityRemoteId;
    }

    public final long getEntityRemoteId() {
        return this.entityRemoteId;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public int hashCode() {
        String str = this.entityType;
        return ((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.entityRemoteId);
    }

    public String toString() {
        return "LocalDecryptErrorDebugInfo(entityType=" + this.entityType + ", entityRemoteId=" + this.entityRemoteId + ")";
    }

    public LocalDecryptErrorDebugInfo(String str, long j10) {
        this.entityType = str;
        this.entityRemoteId = j10;
    }
}
