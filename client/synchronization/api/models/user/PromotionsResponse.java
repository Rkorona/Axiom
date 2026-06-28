package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.i;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class PromotionsResponse implements Parcelable {
    private final Boolean hasDesktopDevice;
    private final Boolean isEnterpriseTrial;
    private final Boolean isUpgradeToBusinessViaVaultsAvailable;
    private final String sessionLogsBannerType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PromotionsResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return PromotionsResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<PromotionsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromotionsResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            t.f(parcel, "parcel");
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PromotionsResponse(boolValueOf, boolValueOf2, boolValueOf3, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromotionsResponse[] newArray(int i10) {
            return new PromotionsResponse[i10];
        }
    }

    public PromotionsResponse() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (String) null, 15, (k) null);
    }

    public static /* synthetic */ PromotionsResponse copy$default(PromotionsResponse promotionsResponse, Boolean bool, Boolean bool2, Boolean bool3, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = promotionsResponse.hasDesktopDevice;
        }
        if ((i10 & 2) != 0) {
            bool2 = promotionsResponse.isUpgradeToBusinessViaVaultsAvailable;
        }
        if ((i10 & 4) != 0) {
            bool3 = promotionsResponse.isEnterpriseTrial;
        }
        if ((i10 & 8) != 0) {
            str = promotionsResponse.sessionLogsBannerType;
        }
        return promotionsResponse.copy(bool, bool2, bool3, str);
    }

    @o("has_desktop_device")
    public static /* synthetic */ void getHasDesktopDevice$annotations() {
    }

    @o("session_logs_banner_type")
    public static /* synthetic */ void getSessionLogsBannerType$annotations() {
    }

    @o("enterprise_trial")
    public static /* synthetic */ void isEnterpriseTrial$annotations() {
    }

    @o("upgrade_to_business_via_vaults")
    public static /* synthetic */ void isUpgradeToBusinessViaVaultsAvailable$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PromotionsResponse promotionsResponse, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || promotionsResponse.hasDesktopDevice != null) {
            dVar.v(fVar, 0, i.f64704a, promotionsResponse.hasDesktopDevice);
        }
        if (dVar.E(fVar, 1) || promotionsResponse.isUpgradeToBusinessViaVaultsAvailable != null) {
            dVar.v(fVar, 1, i.f64704a, promotionsResponse.isUpgradeToBusinessViaVaultsAvailable);
        }
        if (dVar.E(fVar, 2) || promotionsResponse.isEnterpriseTrial != null) {
            dVar.v(fVar, 2, i.f64704a, promotionsResponse.isEnterpriseTrial);
        }
        if (!dVar.E(fVar, 3) && promotionsResponse.sessionLogsBannerType == null) {
            return;
        }
        dVar.v(fVar, 3, x2.f64817a, promotionsResponse.sessionLogsBannerType);
    }

    public final Boolean component1() {
        return this.hasDesktopDevice;
    }

    public final Boolean component2() {
        return this.isUpgradeToBusinessViaVaultsAvailable;
    }

    public final Boolean component3() {
        return this.isEnterpriseTrial;
    }

    public final String component4() {
        return this.sessionLogsBannerType;
    }

    public final PromotionsResponse copy(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        return new PromotionsResponse(bool, bool2, bool3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionsResponse)) {
            return false;
        }
        PromotionsResponse promotionsResponse = (PromotionsResponse) obj;
        return t.b(this.hasDesktopDevice, promotionsResponse.hasDesktopDevice) && t.b(this.isUpgradeToBusinessViaVaultsAvailable, promotionsResponse.isUpgradeToBusinessViaVaultsAvailable) && t.b(this.isEnterpriseTrial, promotionsResponse.isEnterpriseTrial) && t.b(this.sessionLogsBannerType, promotionsResponse.sessionLogsBannerType);
    }

    public final Boolean getHasDesktopDevice() {
        return this.hasDesktopDevice;
    }

    public final String getSessionLogsBannerType() {
        return this.sessionLogsBannerType;
    }

    public int hashCode() {
        Boolean bool = this.hasDesktopDevice;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isUpgradeToBusinessViaVaultsAvailable;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEnterpriseTrial;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.sessionLogsBannerType;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isEnterpriseTrial() {
        return this.isEnterpriseTrial;
    }

    public final Boolean isUpgradeToBusinessViaVaultsAvailable() {
        return this.isUpgradeToBusinessViaVaultsAvailable;
    }

    public String toString() {
        return "PromotionsResponse(hasDesktopDevice=" + this.hasDesktopDevice + ", isUpgradeToBusinessViaVaultsAvailable=" + this.isUpgradeToBusinessViaVaultsAvailable + ", isEnterpriseTrial=" + this.isEnterpriseTrial + ", sessionLogsBannerType=" + this.sessionLogsBannerType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        Boolean bool = this.hasDesktopDevice;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isUpgradeToBusinessViaVaultsAvailable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isEnterpriseTrial;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.sessionLogsBannerType);
    }

    public /* synthetic */ PromotionsResponse(int i10, Boolean bool, Boolean bool2, Boolean bool3, String str, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.hasDesktopDevice = null;
        } else {
            this.hasDesktopDevice = bool;
        }
        if ((i10 & 2) == 0) {
            this.isUpgradeToBusinessViaVaultsAvailable = null;
        } else {
            this.isUpgradeToBusinessViaVaultsAvailable = bool2;
        }
        if ((i10 & 4) == 0) {
            this.isEnterpriseTrial = null;
        } else {
            this.isEnterpriseTrial = bool3;
        }
        if ((i10 & 8) == 0) {
            this.sessionLogsBannerType = null;
        } else {
            this.sessionLogsBannerType = str;
        }
    }

    public PromotionsResponse(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.hasDesktopDevice = bool;
        this.isUpgradeToBusinessViaVaultsAvailable = bool2;
        this.isEnterpriseTrial = bool3;
        this.sessionLogsBannerType = str;
    }

    public /* synthetic */ PromotionsResponse(Boolean bool, Boolean bool2, Boolean bool3, String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? null : str);
    }
}
