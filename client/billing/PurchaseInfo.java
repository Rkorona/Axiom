package com.server.auditor.ssh.client.billing;

import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes2.dex */
@p
public final class PurchaseInfo {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final boolean acknowledged;
    private final boolean autoRenewing;
    private final String orderId;
    private final String packageName;
    private final String productId;
    private final long purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f21497b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f21496a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.billing.PurchaseInfo", aVar, 8);
            i2Var.r("orderId", true);
            i2Var.r("packageName", false);
            i2Var.r("productId", true);
            i2Var.r("purchaseTime", true);
            i2Var.r("purchaseState", true);
            i2Var.r("purchaseToken", false);
            i2Var.r("autoRenewing", true);
            i2Var.r("acknowledged", true);
            descriptor = i2Var;
            f21497b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PurchaseInfo deserialize(e eVar) {
            boolean zH;
            String str;
            boolean z10;
            long j10;
            int i10;
            String str2;
            String str3;
            long j11;
            String str4;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            int i11 = 7;
            int i12 = 6;
            if (cVarD.l()) {
                x2 x2Var = x2.f64817a;
                String str5 = (String) cVarD.v(fVar, 0, x2Var, null);
                String strB = cVarD.B(fVar, 1);
                String str6 = (String) cVarD.v(fVar, 2, x2Var, null);
                long jO = cVarD.o(fVar, 3);
                long jO2 = cVarD.o(fVar, 4);
                String strB2 = cVarD.B(fVar, 5);
                boolean zH2 = cVarD.H(fVar, 6);
                str = str6;
                zH = cVarD.H(fVar, 7);
                z10 = zH2;
                str4 = strB2;
                j10 = jO2;
                i10 = 255;
                str3 = strB;
                str2 = str5;
                j11 = jO;
            } else {
                long jO3 = 0;
                boolean z11 = true;
                boolean zH3 = false;
                int i13 = 0;
                String str7 = null;
                String strB3 = null;
                String strB4 = null;
                long jO4 = 0;
                boolean zH4 = false;
                String str8 = null;
                while (z11) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            break;
                        case 0:
                            str7 = (String) cVarD.v(fVar, 0, x2.f64817a, str7);
                            i13 |= 1;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 1:
                            strB3 = cVarD.B(fVar, 1);
                            i13 |= 2;
                            break;
                        case 2:
                            str8 = (String) cVarD.v(fVar, 2, x2.f64817a, str8);
                            i13 |= 4;
                            break;
                        case 3:
                            jO4 = cVarD.o(fVar, 3);
                            i13 |= 8;
                            break;
                        case 4:
                            jO3 = cVarD.o(fVar, 4);
                            i13 |= 16;
                            break;
                        case 5:
                            strB4 = cVarD.B(fVar, 5);
                            i13 |= 32;
                            break;
                        case 6:
                            zH4 = cVarD.H(fVar, i12);
                            i13 |= 64;
                            break;
                        case 7:
                            zH3 = cVarD.H(fVar, i11);
                            i13 |= 128;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                zH = zH3;
                str = str8;
                z10 = zH4;
                j10 = jO3;
                i10 = i13;
                str2 = str7;
                str3 = strB3;
                j11 = jO4;
                str4 = strB4;
            }
            cVarD.b(fVar);
            return new PurchaseInfo(i10, str2, str3, str, j11, j10, str4, z10, zH, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, PurchaseInfo purchaseInfo) {
            t.f(fVar, "encoder");
            t.f(purchaseInfo, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            PurchaseInfo.write$Self$Termius_app_googleProductionRelease(purchaseInfo, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            hv.c cVarU = iv.a.u(x2Var);
            hv.c cVarU2 = iv.a.u(x2Var);
            h1 h1Var = h1.f64699a;
            i iVar = i.f64704a;
            return new hv.c[]{cVarU, x2Var, cVarU2, h1Var, h1Var, x2Var, iVar, iVar};
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
            return a.f21496a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ PurchaseInfo(int i10, String str, String str2, String str3, long j10, long j11, String str4, boolean z10, boolean z11, s2 s2Var) {
        if (34 != (i10 & 34)) {
            d2.a(i10, 34, a.f21496a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str;
        }
        this.packageName = str2;
        if ((i10 & 4) == 0) {
            this.productId = null;
        } else {
            this.productId = str3;
        }
        if ((i10 & 8) == 0) {
            this.purchaseTime = 0L;
        } else {
            this.purchaseTime = j10;
        }
        if ((i10 & 16) == 0) {
            this.purchaseState = 0L;
        } else {
            this.purchaseState = j11;
        }
        this.purchaseToken = str4;
        if ((i10 & 64) == 0) {
            this.autoRenewing = false;
        } else {
            this.autoRenewing = z10;
        }
        if ((i10 & 128) == 0) {
            this.acknowledged = false;
        } else {
            this.acknowledged = z11;
        }
    }

    public static /* synthetic */ PurchaseInfo copy$default(PurchaseInfo purchaseInfo, String str, String str2, String str3, long j10, long j11, String str4, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = purchaseInfo.orderId;
        }
        if ((i10 & 2) != 0) {
            str2 = purchaseInfo.packageName;
        }
        if ((i10 & 4) != 0) {
            str3 = purchaseInfo.productId;
        }
        if ((i10 & 8) != 0) {
            j10 = purchaseInfo.purchaseTime;
        }
        if ((i10 & 16) != 0) {
            j11 = purchaseInfo.purchaseState;
        }
        if ((i10 & 32) != 0) {
            str4 = purchaseInfo.purchaseToken;
        }
        if ((i10 & 64) != 0) {
            z10 = purchaseInfo.autoRenewing;
        }
        if ((i10 & 128) != 0) {
            z11 = purchaseInfo.acknowledged;
        }
        boolean z12 = z11;
        String str5 = str4;
        long j12 = j11;
        long j13 = j10;
        String str6 = str3;
        return purchaseInfo.copy(str, str2, str6, j13, j12, str5, z10, z12);
    }

    @o("acknowledged")
    public static /* synthetic */ void getAcknowledged$annotations() {
    }

    @o("autoRenewing")
    public static /* synthetic */ void getAutoRenewing$annotations() {
    }

    @o("orderId")
    public static /* synthetic */ void getOrderId$annotations() {
    }

    @o("packageName")
    public static /* synthetic */ void getPackageName$annotations() {
    }

    @o("productId")
    public static /* synthetic */ void getProductId$annotations() {
    }

    @o("purchaseState")
    public static /* synthetic */ void getPurchaseState$annotations() {
    }

    @o("purchaseTime")
    public static /* synthetic */ void getPurchaseTime$annotations() {
    }

    @o("purchaseToken")
    public static /* synthetic */ void getPurchaseToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PurchaseInfo purchaseInfo, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || purchaseInfo.orderId != null) {
            dVar.v(fVar, 0, x2.f64817a, purchaseInfo.orderId);
        }
        dVar.f(fVar, 1, purchaseInfo.packageName);
        if (dVar.E(fVar, 2) || purchaseInfo.productId != null) {
            dVar.v(fVar, 2, x2.f64817a, purchaseInfo.productId);
        }
        if (dVar.E(fVar, 3) || purchaseInfo.purchaseTime != 0) {
            dVar.q(fVar, 3, purchaseInfo.purchaseTime);
        }
        if (dVar.E(fVar, 4) || purchaseInfo.purchaseState != 0) {
            dVar.q(fVar, 4, purchaseInfo.purchaseState);
        }
        dVar.f(fVar, 5, purchaseInfo.purchaseToken);
        if (dVar.E(fVar, 6) || purchaseInfo.autoRenewing) {
            dVar.u(fVar, 6, purchaseInfo.autoRenewing);
        }
        if (dVar.E(fVar, 7) || purchaseInfo.acknowledged) {
            dVar.u(fVar, 7, purchaseInfo.acknowledged);
        }
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.packageName;
    }

    public final String component3() {
        return this.productId;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final long component5() {
        return this.purchaseState;
    }

    public final String component6() {
        return this.purchaseToken;
    }

    public final boolean component7() {
        return this.autoRenewing;
    }

    public final boolean component8() {
        return this.acknowledged;
    }

    public final PurchaseInfo copy(String str, String str2, String str3, long j10, long j11, String str4, boolean z10, boolean z11) {
        t.f(str2, "packageName");
        t.f(str4, "purchaseToken");
        return new PurchaseInfo(str, str2, str3, j10, j11, str4, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseInfo)) {
            return false;
        }
        PurchaseInfo purchaseInfo = (PurchaseInfo) obj;
        return t.b(this.orderId, purchaseInfo.orderId) && t.b(this.packageName, purchaseInfo.packageName) && t.b(this.productId, purchaseInfo.productId) && this.purchaseTime == purchaseInfo.purchaseTime && this.purchaseState == purchaseInfo.purchaseState && t.b(this.purchaseToken, purchaseInfo.purchaseToken) && this.autoRenewing == purchaseInfo.autoRenewing && this.acknowledged == purchaseInfo.acknowledged;
    }

    public final boolean getAcknowledged() {
        return this.acknowledged;
    }

    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final long getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.packageName.hashCode()) * 31;
        String str2 = this.productId;
        return ((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.purchaseTime)) * 31) + Long.hashCode(this.purchaseState)) * 31) + this.purchaseToken.hashCode()) * 31) + Boolean.hashCode(this.autoRenewing)) * 31) + Boolean.hashCode(this.acknowledged);
    }

    public String toString() {
        return "PurchaseInfo(orderId=" + this.orderId + ", packageName=" + this.packageName + ", productId=" + this.productId + ", purchaseTime=" + this.purchaseTime + ", purchaseState=" + this.purchaseState + ", purchaseToken=" + this.purchaseToken + ", autoRenewing=" + this.autoRenewing + ", acknowledged=" + this.acknowledged + ")";
    }

    public PurchaseInfo(String str, String str2, String str3, long j10, long j11, String str4, boolean z10, boolean z11) {
        t.f(str2, "packageName");
        t.f(str4, "purchaseToken");
        this.orderId = str;
        this.packageName = str2;
        this.productId = str3;
        this.purchaseTime = j10;
        this.purchaseState = j11;
        this.purchaseToken = str4;
        this.autoRenewing = z10;
        this.acknowledged = z11;
    }

    public /* synthetic */ PurchaseInfo(String str, String str2, String str3, long j10, long j11, String str4, boolean z10, boolean z11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? 0L : j11, str4, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? false : z11);
    }
}
