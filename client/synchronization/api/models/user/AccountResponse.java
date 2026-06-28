package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.crystalnix.termius.libtermius.sftp.File;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class AccountResponse implements Parcelable {
    public static final int $stable = 0;
    private final AuthorizedFeaturesResponse authorizedFeatures;
    private final CurrentPeriodResponse currentPeriod;
    private final String email;
    private final String expiredScreenType;
    private final FeatureTogglesResponse featureToggles;
    private final String fullName;
    private final boolean hasSSO;
    private final boolean isEmailConfirmed;
    private final String now;
    private final String planType;
    private final boolean proMode;
    private final PromotionsResponse promotions;
    private final boolean team;
    private final boolean twoFactorAuth;
    private final Integer userId;
    private final String userType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountResponse> CREATOR = new Creator();

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return AccountResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<AccountResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountResponse createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            Integer num;
            PromotionsResponse promotionsResponseCreateFromParcel;
            t.f(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z13 = false;
            boolean z14 = true;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z10 = false;
                z13 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z14 = z10;
            }
            if (parcel.readInt() != 0) {
                z12 = z10;
                z10 = z11;
            } else {
                z12 = z10;
            }
            FeatureTogglesResponse featureTogglesResponseCreateFromParcel = FeatureTogglesResponse.CREATOR.createFromParcel(parcel);
            AuthorizedFeaturesResponse authorizedFeaturesResponseCreateFromParcel = parcel.readInt() == 0 ? null : AuthorizedFeaturesResponse.CREATOR.createFromParcel(parcel);
            boolean z16 = z11;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z17 = z12;
            String string6 = parcel.readString();
            CurrentPeriodResponse currentPeriodResponseCreateFromParcel = parcel.readInt() == 0 ? null : CurrentPeriodResponse.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z17 = z16;
            }
            if (parcel.readInt() == 0) {
                num = numValueOf;
                promotionsResponseCreateFromParcel = null;
            } else {
                num = numValueOf;
                promotionsResponseCreateFromParcel = PromotionsResponse.CREATOR.createFromParcel(parcel);
            }
            return new AccountResponse(num, string, string2, z15, z13, z14, z10, featureTogglesResponseCreateFromParcel, authorizedFeaturesResponseCreateFromParcel, string3, string4, string5, string6, currentPeriodResponseCreateFromParcel, z17, promotionsResponseCreateFromParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountResponse[] newArray(int i10) {
            return new AccountResponse[i10];
        }
    }

    public /* synthetic */ AccountResponse(int i10, Integer num, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, FeatureTogglesResponse featureTogglesResponse, AuthorizedFeaturesResponse authorizedFeaturesResponse, String str3, String str4, String str5, String str6, CurrentPeriodResponse currentPeriodResponse, boolean z14, PromotionsResponse promotionsResponse, s2 s2Var) {
        if (23802 != (i10 & 23802)) {
            d2.a(i10, 23802, AccountResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.userId = null;
        } else {
            this.userId = num;
        }
        this.email = str;
        if ((i10 & 4) == 0) {
            this.fullName = null;
        } else {
            this.fullName = str2;
        }
        this.isEmailConfirmed = z10;
        this.proMode = z11;
        this.twoFactorAuth = z12;
        this.team = z13;
        this.featureToggles = featureTogglesResponse;
        if ((i10 & 256) == 0) {
            this.authorizedFeatures = null;
        } else {
            this.authorizedFeatures = authorizedFeaturesResponse;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.expiredScreenType = null;
        } else {
            this.expiredScreenType = str3;
        }
        this.now = str4;
        this.planType = str5;
        this.userType = str6;
        if ((i10 & 8192) == 0) {
            this.currentPeriod = null;
        } else {
            this.currentPeriod = currentPeriodResponse;
        }
        this.hasSSO = z14;
        if ((i10 & 32768) == 0) {
            this.promotions = null;
        } else {
            this.promotions = promotionsResponse;
        }
    }

    @o("authorized_features")
    public static /* synthetic */ void getAuthorizedFeatures$annotations() {
    }

    @o("current_period")
    public static /* synthetic */ void getCurrentPeriod$annotations() {
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @o("expired_screen_type")
    public static /* synthetic */ void getExpiredScreenType$annotations() {
    }

    @o("feature_toggles")
    public static /* synthetic */ void getFeatureToggles$annotations() {
    }

    @o("full_name")
    public static /* synthetic */ void getFullName$annotations() {
    }

    @o("has_sso")
    public static /* synthetic */ void getHasSSO$annotations() {
    }

    @o("now")
    public static /* synthetic */ void getNow$annotations() {
    }

    @o("plan_type")
    public static /* synthetic */ void getPlanType$annotations() {
    }

    @o("pro_mode")
    public static /* synthetic */ void getProMode$annotations() {
    }

    @o("promotions")
    public static /* synthetic */ void getPromotions$annotations() {
    }

    @o("team")
    public static /* synthetic */ void getTeam$annotations() {
    }

    @o("two_factor_auth")
    public static /* synthetic */ void getTwoFactorAuth$annotations() {
    }

    @o("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @o("user_type")
    public static /* synthetic */ void getUserType$annotations() {
    }

    @o("is_email_confirmed")
    public static /* synthetic */ void isEmailConfirmed$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AccountResponse accountResponse, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || accountResponse.userId != null) {
            dVar.v(fVar, 0, w0.f64808a, accountResponse.userId);
        }
        dVar.f(fVar, 1, accountResponse.email);
        if (dVar.E(fVar, 2) || accountResponse.fullName != null) {
            dVar.v(fVar, 2, x2.f64817a, accountResponse.fullName);
        }
        dVar.u(fVar, 3, accountResponse.isEmailConfirmed);
        dVar.u(fVar, 4, accountResponse.proMode);
        dVar.u(fVar, 5, accountResponse.twoFactorAuth);
        dVar.u(fVar, 6, accountResponse.team);
        dVar.o(fVar, 7, FeatureTogglesResponse$$serializer.INSTANCE, accountResponse.featureToggles);
        if (dVar.E(fVar, 8) || accountResponse.authorizedFeatures != null) {
            dVar.v(fVar, 8, AuthorizedFeaturesResponse$$serializer.INSTANCE, accountResponse.authorizedFeatures);
        }
        if (dVar.E(fVar, 9) || accountResponse.expiredScreenType != null) {
            dVar.v(fVar, 9, x2.f64817a, accountResponse.expiredScreenType);
        }
        dVar.f(fVar, 10, accountResponse.now);
        dVar.f(fVar, 11, accountResponse.planType);
        dVar.f(fVar, 12, accountResponse.userType);
        if (dVar.E(fVar, 13) || accountResponse.currentPeriod != null) {
            dVar.v(fVar, 13, CurrentPeriodResponse$$serializer.INSTANCE, accountResponse.currentPeriod);
        }
        dVar.u(fVar, 14, accountResponse.hasSSO);
        if (!dVar.E(fVar, 15) && accountResponse.promotions == null) {
            return;
        }
        dVar.v(fVar, 15, PromotionsResponse$$serializer.INSTANCE, accountResponse.promotions);
    }

    public final Integer component1() {
        return this.userId;
    }

    public final String component10() {
        return this.expiredScreenType;
    }

    public final String component11() {
        return this.now;
    }

    public final String component12() {
        return this.planType;
    }

    public final String component13() {
        return this.userType;
    }

    public final CurrentPeriodResponse component14() {
        return this.currentPeriod;
    }

    public final boolean component15() {
        return this.hasSSO;
    }

    public final PromotionsResponse component16() {
        return this.promotions;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.fullName;
    }

    public final boolean component4() {
        return this.isEmailConfirmed;
    }

    public final boolean component5() {
        return this.proMode;
    }

    public final boolean component6() {
        return this.twoFactorAuth;
    }

    public final boolean component7() {
        return this.team;
    }

    public final FeatureTogglesResponse component8() {
        return this.featureToggles;
    }

    public final AuthorizedFeaturesResponse component9() {
        return this.authorizedFeatures;
    }

    public final AccountResponse copy(Integer num, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, FeatureTogglesResponse featureTogglesResponse, AuthorizedFeaturesResponse authorizedFeaturesResponse, String str3, String str4, String str5, String str6, CurrentPeriodResponse currentPeriodResponse, boolean z14, PromotionsResponse promotionsResponse) {
        t.f(str, "email");
        t.f(featureTogglesResponse, "featureToggles");
        t.f(str4, "now");
        t.f(str5, "planType");
        t.f(str6, "userType");
        return new AccountResponse(num, str, str2, z10, z11, z12, z13, featureTogglesResponse, authorizedFeaturesResponse, str3, str4, str5, str6, currentPeriodResponse, z14, promotionsResponse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountResponse)) {
            return false;
        }
        AccountResponse accountResponse = (AccountResponse) obj;
        return t.b(this.userId, accountResponse.userId) && t.b(this.email, accountResponse.email) && t.b(this.fullName, accountResponse.fullName) && this.isEmailConfirmed == accountResponse.isEmailConfirmed && this.proMode == accountResponse.proMode && this.twoFactorAuth == accountResponse.twoFactorAuth && this.team == accountResponse.team && t.b(this.featureToggles, accountResponse.featureToggles) && t.b(this.authorizedFeatures, accountResponse.authorizedFeatures) && t.b(this.expiredScreenType, accountResponse.expiredScreenType) && t.b(this.now, accountResponse.now) && t.b(this.planType, accountResponse.planType) && t.b(this.userType, accountResponse.userType) && t.b(this.currentPeriod, accountResponse.currentPeriod) && this.hasSSO == accountResponse.hasSSO && t.b(this.promotions, accountResponse.promotions);
    }

    public final AuthorizedFeaturesResponse getAuthorizedFeatures() {
        return this.authorizedFeatures;
    }

    public final CurrentPeriodResponse getCurrentPeriod() {
        return this.currentPeriod;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getExpiredScreenType() {
        return this.expiredScreenType;
    }

    public final FeatureTogglesResponse getFeatureToggles() {
        return this.featureToggles;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final boolean getHasSSO() {
        return this.hasSSO;
    }

    public final String getNow() {
        return this.now;
    }

    public final String getPlanType() {
        return this.planType;
    }

    public final boolean getProMode() {
        return this.proMode;
    }

    public final PromotionsResponse getPromotions() {
        return this.promotions;
    }

    public final boolean getTeam() {
        return this.team;
    }

    public final boolean getTwoFactorAuth() {
        return this.twoFactorAuth;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        Integer num = this.userId;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.email.hashCode()) * 31;
        String str = this.fullName;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isEmailConfirmed)) * 31) + Boolean.hashCode(this.proMode)) * 31) + Boolean.hashCode(this.twoFactorAuth)) * 31) + Boolean.hashCode(this.team)) * 31) + this.featureToggles.hashCode()) * 31;
        AuthorizedFeaturesResponse authorizedFeaturesResponse = this.authorizedFeatures;
        int iHashCode3 = (iHashCode2 + (authorizedFeaturesResponse == null ? 0 : authorizedFeaturesResponse.hashCode())) * 31;
        String str2 = this.expiredScreenType;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.now.hashCode()) * 31) + this.planType.hashCode()) * 31) + this.userType.hashCode()) * 31;
        CurrentPeriodResponse currentPeriodResponse = this.currentPeriod;
        int iHashCode5 = (((iHashCode4 + (currentPeriodResponse == null ? 0 : currentPeriodResponse.hashCode())) * 31) + Boolean.hashCode(this.hasSSO)) * 31;
        PromotionsResponse promotionsResponse = this.promotions;
        return iHashCode5 + (promotionsResponse != null ? promotionsResponse.hashCode() : 0);
    }

    public final boolean isEmailConfirmed() {
        return this.isEmailConfirmed;
    }

    public String toString() {
        return "AccountResponse(userId=" + this.userId + ", email=" + this.email + ", fullName=" + this.fullName + ", isEmailConfirmed=" + this.isEmailConfirmed + ", proMode=" + this.proMode + ", twoFactorAuth=" + this.twoFactorAuth + ", team=" + this.team + ", featureToggles=" + this.featureToggles + ", authorizedFeatures=" + this.authorizedFeatures + ", expiredScreenType=" + this.expiredScreenType + ", now=" + this.now + ", planType=" + this.planType + ", userType=" + this.userType + ", currentPeriod=" + this.currentPeriod + ", hasSSO=" + this.hasSSO + ", promotions=" + this.promotions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        Integer num = this.userId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.email);
        parcel.writeString(this.fullName);
        parcel.writeInt(this.isEmailConfirmed ? 1 : 0);
        parcel.writeInt(this.proMode ? 1 : 0);
        parcel.writeInt(this.twoFactorAuth ? 1 : 0);
        parcel.writeInt(this.team ? 1 : 0);
        this.featureToggles.writeToParcel(parcel, i10);
        AuthorizedFeaturesResponse authorizedFeaturesResponse = this.authorizedFeatures;
        if (authorizedFeaturesResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authorizedFeaturesResponse.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.expiredScreenType);
        parcel.writeString(this.now);
        parcel.writeString(this.planType);
        parcel.writeString(this.userType);
        CurrentPeriodResponse currentPeriodResponse = this.currentPeriod;
        if (currentPeriodResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currentPeriodResponse.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.hasSSO ? 1 : 0);
        PromotionsResponse promotionsResponse = this.promotions;
        if (promotionsResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionsResponse.writeToParcel(parcel, i10);
        }
    }

    public AccountResponse(Integer num, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, FeatureTogglesResponse featureTogglesResponse, AuthorizedFeaturesResponse authorizedFeaturesResponse, String str3, String str4, String str5, String str6, CurrentPeriodResponse currentPeriodResponse, boolean z14, PromotionsResponse promotionsResponse) {
        t.f(str, "email");
        t.f(featureTogglesResponse, "featureToggles");
        t.f(str4, "now");
        t.f(str5, "planType");
        t.f(str6, "userType");
        this.userId = num;
        this.email = str;
        this.fullName = str2;
        this.isEmailConfirmed = z10;
        this.proMode = z11;
        this.twoFactorAuth = z12;
        this.team = z13;
        this.featureToggles = featureTogglesResponse;
        this.authorizedFeatures = authorizedFeaturesResponse;
        this.expiredScreenType = str3;
        this.now = str4;
        this.planType = str5;
        this.userType = str6;
        this.currentPeriod = currentPeriodResponse;
        this.hasSSO = z14;
        this.promotions = promotionsResponse;
    }

    public /* synthetic */ AccountResponse(Integer num, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, FeatureTogglesResponse featureTogglesResponse, AuthorizedFeaturesResponse authorizedFeaturesResponse, String str3, String str4, String str5, String str6, CurrentPeriodResponse currentPeriodResponse, boolean z14, PromotionsResponse promotionsResponse, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : num, str, (i10 & 4) != 0 ? null : str2, z10, z11, z12, z13, featureTogglesResponse, (i10 & 256) != 0 ? null : authorizedFeaturesResponse, (i10 & File.FLAG_O_TRUNC) != 0 ? null : str3, str4, str5, str6, (i10 & 8192) != 0 ? null : currentPeriodResponse, z14, (i10 & 32768) != 0 ? null : promotionsResponse);
    }
}
