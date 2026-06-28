package com.server.auditor.ssh.client.billing;

import android.os.Parcel;
import android.os.Parcelable;
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
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes2.dex */
@p
public final class AcknowledgeSubscriptionInfo implements Parcelable {
    private final String packageName;
    private final String platform;
    private final String productId;
    private final String purchaseToken;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<AcknowledgeSubscriptionInfo> CREATOR = new c();
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f21495b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f21494a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo", aVar, 4);
            i2Var.r("platform", false);
            i2Var.r("user_id_in_shop", false);
            i2Var.r("subscription_id", false);
            i2Var.r("package_name", false);
            descriptor = i2Var;
            f21495b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AcknowledgeSubscriptionInfo deserialize(e eVar) {
            String strB;
            String strB2;
            String str;
            String str2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                String strB3 = cVarD.B(fVar, 1);
                String strB4 = cVarD.B(fVar, 2);
                strB2 = cVarD.B(fVar, 3);
                str = strB4;
                str2 = strB3;
                i10 = 15;
            } else {
                strB = null;
                String strB5 = null;
                String strB6 = null;
                String strB7 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB7 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB6 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iD != 3) {
                            throw new e0(iD);
                        }
                        strB5 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    }
                }
                strB2 = strB5;
                str = strB6;
                str2 = strB7;
                i10 = i11;
            }
            String str3 = strB;
            cVarD.b(fVar);
            return new AcknowledgeSubscriptionInfo(i10, str3, str2, str, strB2, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
            t.f(fVar, "encoder");
            t.f(acknowledgeSubscriptionInfo, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            AcknowledgeSubscriptionInfo.write$Self$Termius_app_googleProductionRelease(acknowledgeSubscriptionInfo, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var, x2Var, x2Var};
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
            return a.f21494a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AcknowledgeSubscriptionInfo createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new AcknowledgeSubscriptionInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AcknowledgeSubscriptionInfo[] newArray(int i10) {
            return new AcknowledgeSubscriptionInfo[i10];
        }
    }

    public /* synthetic */ AcknowledgeSubscriptionInfo(int i10, String str, String str2, String str3, String str4, s2 s2Var) {
        if (15 != (i10 & 15)) {
            d2.a(i10, 15, a.f21494a.getDescriptor());
        }
        this.platform = str;
        this.purchaseToken = str2;
        this.productId = str3;
        this.packageName = str4;
    }

    public static /* synthetic */ AcknowledgeSubscriptionInfo copy$default(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = acknowledgeSubscriptionInfo.platform;
        }
        if ((i10 & 2) != 0) {
            str2 = acknowledgeSubscriptionInfo.purchaseToken;
        }
        if ((i10 & 4) != 0) {
            str3 = acknowledgeSubscriptionInfo.productId;
        }
        if ((i10 & 8) != 0) {
            str4 = acknowledgeSubscriptionInfo.packageName;
        }
        return acknowledgeSubscriptionInfo.copy(str, str2, str3, str4);
    }

    @o("package_name")
    public static /* synthetic */ void getPackageName$annotations() {
    }

    @o("platform")
    public static /* synthetic */ void getPlatform$annotations() {
    }

    @o("subscription_id")
    public static /* synthetic */ void getProductId$annotations() {
    }

    @o("user_id_in_shop")
    public static /* synthetic */ void getPurchaseToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo, d dVar, f fVar) {
        dVar.f(fVar, 0, acknowledgeSubscriptionInfo.platform);
        dVar.f(fVar, 1, acknowledgeSubscriptionInfo.purchaseToken);
        dVar.f(fVar, 2, acknowledgeSubscriptionInfo.productId);
        dVar.f(fVar, 3, acknowledgeSubscriptionInfo.packageName);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.purchaseToken;
    }

    public final String component3() {
        return this.productId;
    }

    public final String component4() {
        return this.packageName;
    }

    public final AcknowledgeSubscriptionInfo copy(String str, String str2, String str3, String str4) {
        t.f(str, "platform");
        t.f(str2, "purchaseToken");
        t.f(str3, "productId");
        t.f(str4, "packageName");
        return new AcknowledgeSubscriptionInfo(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcknowledgeSubscriptionInfo)) {
            return false;
        }
        AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = (AcknowledgeSubscriptionInfo) obj;
        return t.b(this.platform, acknowledgeSubscriptionInfo.platform) && t.b(this.purchaseToken, acknowledgeSubscriptionInfo.purchaseToken) && t.b(this.productId, acknowledgeSubscriptionInfo.productId) && t.b(this.packageName, acknowledgeSubscriptionInfo.packageName);
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public int hashCode() {
        return (((((this.platform.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.packageName.hashCode();
    }

    public String toString() {
        return "AcknowledgeSubscriptionInfo(platform=" + this.platform + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ", packageName=" + this.packageName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.platform);
        parcel.writeString(this.purchaseToken);
        parcel.writeString(this.productId);
        parcel.writeString(this.packageName);
    }

    public AcknowledgeSubscriptionInfo(String str, String str2, String str3, String str4) {
        t.f(str, "platform");
        t.f(str2, "purchaseToken");
        t.f(str3, "productId");
        t.f(str4, "packageName");
        this.platform = str;
        this.purchaseToken = str2;
        this.productId = str3;
        this.packageName = str4;
    }
}
