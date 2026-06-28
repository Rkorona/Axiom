package com.server.auditor.ssh.client.ui.sessionlogs.data;

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

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HistoryConnectionDeviceInfo {
    public static final int $stable = 0;
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f40370id;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40372b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40371a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.HistoryConnectionDeviceInfo", aVar, 1);
            i2Var.r("id", false);
            descriptor = i2Var;
            f40372b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HistoryConnectionDeviceInfo deserialize(e eVar) {
            long jO;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            int i10 = 1;
            if (cVarD.l()) {
                jO = cVarD.o(fVar, 0);
            } else {
                long jO2 = 0;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        jO2 = cVarD.o(fVar, 0);
                        i11 = 1;
                    }
                }
                jO = jO2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new HistoryConnectionDeviceInfo(i10, jO, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, HistoryConnectionDeviceInfo historyConnectionDeviceInfo) {
            t.f(fVar, "encoder");
            t.f(historyConnectionDeviceInfo, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            HistoryConnectionDeviceInfo.write$Self$Termius_app_googleProductionRelease(historyConnectionDeviceInfo, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{h1.f64699a};
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
            return a.f40371a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ HistoryConnectionDeviceInfo(int i10, long j10, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f40371a.getDescriptor());
        }
        this.f40370id = j10;
    }

    public static /* synthetic */ HistoryConnectionDeviceInfo copy$default(HistoryConnectionDeviceInfo historyConnectionDeviceInfo, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = historyConnectionDeviceInfo.f40370id;
        }
        return historyConnectionDeviceInfo.copy(j10);
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HistoryConnectionDeviceInfo historyConnectionDeviceInfo, d dVar, f fVar) {
        dVar.q(fVar, 0, historyConnectionDeviceInfo.f40370id);
    }

    public final long component1() {
        return this.f40370id;
    }

    public final HistoryConnectionDeviceInfo copy(long j10) {
        return new HistoryConnectionDeviceInfo(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HistoryConnectionDeviceInfo) && this.f40370id == ((HistoryConnectionDeviceInfo) obj).f40370id;
    }

    public final long getId() {
        return this.f40370id;
    }

    public int hashCode() {
        return Long.hashCode(this.f40370id);
    }

    public String toString() {
        return "HistoryConnectionDeviceInfo(id=" + this.f40370id + ")";
    }

    public HistoryConnectionDeviceInfo(long j10) {
        this.f40370id = j10;
    }
}
