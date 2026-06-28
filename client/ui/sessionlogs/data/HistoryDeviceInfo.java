package com.server.auditor.ssh.client.ui.sessionlogs.data;

import com.server.auditor.ssh.client.database.Column;
import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import so.d;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HistoryDeviceInfo {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final HistoryDeviceType deviceType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f40373id;
    private final String name;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40375b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40374a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.HistoryDeviceInfo", aVar, 3);
            i2Var.r("id", false);
            i2Var.r("mobile_type", false);
            i2Var.r(Column.MULTI_KEY_NAME, true);
            descriptor = i2Var;
            f40375b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HistoryDeviceInfo deserialize(e eVar) {
            int i10;
            HistoryDeviceType historyDeviceType;
            String str;
            long j10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            HistoryDeviceType historyDeviceType2 = null;
            if (cVarD.l()) {
                long jO = cVarD.o(fVar, 0);
                historyDeviceType = (HistoryDeviceType) cVarD.i(fVar, 1, d.f78128a, null);
                str = (String) cVarD.v(fVar, 2, x2.f64817a, null);
                i10 = 7;
                j10 = jO;
            } else {
                boolean z10 = true;
                int i11 = 0;
                long jO2 = 0;
                String str2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        jO2 = cVarD.o(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        historyDeviceType2 = (HistoryDeviceType) cVarD.i(fVar, 1, d.f78128a, historyDeviceType2);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        str2 = (String) cVarD.v(fVar, 2, x2.f64817a, str2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                historyDeviceType = historyDeviceType2;
                str = str2;
                j10 = jO2;
            }
            cVarD.b(fVar);
            return new HistoryDeviceInfo(i10, j10, historyDeviceType, str, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, HistoryDeviceInfo historyDeviceInfo) {
            t.f(fVar, "encoder");
            t.f(historyDeviceInfo, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            HistoryDeviceInfo.write$Self$Termius_app_googleProductionRelease(historyDeviceInfo, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{h1.f64699a, d.f78128a, iv.a.u(x2.f64817a)};
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
            return a.f40374a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ HistoryDeviceInfo(int i10, long j10, HistoryDeviceType historyDeviceType, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f40374a.getDescriptor());
        }
        this.f40373id = j10;
        this.deviceType = historyDeviceType;
        if ((i10 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public static /* synthetic */ HistoryDeviceInfo copy$default(HistoryDeviceInfo historyDeviceInfo, long j10, HistoryDeviceType historyDeviceType, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = historyDeviceInfo.f40373id;
        }
        if ((i10 & 2) != 0) {
            historyDeviceType = historyDeviceInfo.deviceType;
        }
        if ((i10 & 4) != 0) {
            str = historyDeviceInfo.name;
        }
        return historyDeviceInfo.copy(j10, historyDeviceType, str);
    }

    @o("mobile_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HistoryDeviceInfo historyDeviceInfo, kv.d dVar, f fVar) {
        dVar.q(fVar, 0, historyDeviceInfo.f40373id);
        dVar.o(fVar, 1, d.f78128a, historyDeviceInfo.deviceType);
        if (!dVar.E(fVar, 2) && historyDeviceInfo.name == null) {
            return;
        }
        dVar.v(fVar, 2, x2.f64817a, historyDeviceInfo.name);
    }

    public final long component1() {
        return this.f40373id;
    }

    public final HistoryDeviceType component2() {
        return this.deviceType;
    }

    public final String component3() {
        return this.name;
    }

    public final HistoryDeviceInfo copy(long j10, HistoryDeviceType historyDeviceType, String str) {
        t.f(historyDeviceType, "deviceType");
        return new HistoryDeviceInfo(j10, historyDeviceType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryDeviceInfo)) {
            return false;
        }
        HistoryDeviceInfo historyDeviceInfo = (HistoryDeviceInfo) obj;
        return this.f40373id == historyDeviceInfo.f40373id && this.deviceType == historyDeviceInfo.deviceType && t.b(this.name, historyDeviceInfo.name);
    }

    public final HistoryDeviceType getDeviceType() {
        return this.deviceType;
    }

    public final long getId() {
        return this.f40373id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f40373id) * 31) + this.deviceType.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HistoryDeviceInfo(id=" + this.f40373id + ", deviceType=" + this.deviceType + ", name=" + this.name + ")";
    }

    public HistoryDeviceInfo(long j10, HistoryDeviceType historyDeviceType, String str) {
        t.f(historyDeviceType, "deviceType");
        this.f40373id = j10;
        this.deviceType = historyDeviceType;
        this.name = str;
    }

    public /* synthetic */ HistoryDeviceInfo(long j10, HistoryDeviceType historyDeviceType, String str, int i10, k kVar) {
        this(j10, historyDeviceType, (i10 & 4) != 0 ? null : str);
    }
}
