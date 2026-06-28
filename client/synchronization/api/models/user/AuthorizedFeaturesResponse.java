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

/* JADX INFO: loaded from: classes4.dex */
@p
public final class AuthorizedFeaturesResponse implements Parcelable {
    private final Boolean generateMultiKeyPair;
    private final Boolean isEligibleForTrialExtend;
    private final Boolean multipleVaults;
    private final Boolean showBell;
    private final Boolean showCreateTeamPromotions;
    private final Boolean showMultiKeyPromotion;
    private final Boolean showPresenceEffect;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AuthorizedFeaturesResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return AuthorizedFeaturesResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<AuthorizedFeaturesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthorizedFeaturesResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            t.f(parcel, "parcel");
            Boolean boolValueOf7 = null;
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthorizedFeaturesResponse(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthorizedFeaturesResponse[] newArray(int i10) {
            return new AuthorizedFeaturesResponse[i10];
        }
    }

    public AuthorizedFeaturesResponse() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 127, (k) null);
    }

    public static /* synthetic */ AuthorizedFeaturesResponse copy$default(AuthorizedFeaturesResponse authorizedFeaturesResponse, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = authorizedFeaturesResponse.showCreateTeamPromotions;
        }
        if ((i10 & 2) != 0) {
            bool2 = authorizedFeaturesResponse.showBell;
        }
        if ((i10 & 4) != 0) {
            bool3 = authorizedFeaturesResponse.generateMultiKeyPair;
        }
        if ((i10 & 8) != 0) {
            bool4 = authorizedFeaturesResponse.showPresenceEffect;
        }
        if ((i10 & 16) != 0) {
            bool5 = authorizedFeaturesResponse.showMultiKeyPromotion;
        }
        if ((i10 & 32) != 0) {
            bool6 = authorizedFeaturesResponse.isEligibleForTrialExtend;
        }
        if ((i10 & 64) != 0) {
            bool7 = authorizedFeaturesResponse.multipleVaults;
        }
        Boolean bool8 = bool6;
        Boolean bool9 = bool7;
        Boolean bool10 = bool5;
        Boolean bool11 = bool3;
        return authorizedFeaturesResponse.copy(bool, bool2, bool11, bool4, bool10, bool8, bool9);
    }

    @o("generate_multi_key_pair")
    public static /* synthetic */ void getGenerateMultiKeyPair$annotations() {
    }

    @o("multiple_vaults")
    public static /* synthetic */ void getMultipleVaults$annotations() {
    }

    @o("show_bell")
    public static /* synthetic */ void getShowBell$annotations() {
    }

    @o("show_create_team_promotions")
    public static /* synthetic */ void getShowCreateTeamPromotions$annotations() {
    }

    @o("show_multi_key_promotion")
    public static /* synthetic */ void getShowMultiKeyPromotion$annotations() {
    }

    @o("show_presence_effect")
    public static /* synthetic */ void getShowPresenceEffect$annotations() {
    }

    @o("is_eligible_for_trial_extend")
    public static /* synthetic */ void isEligibleForTrialExtend$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AuthorizedFeaturesResponse authorizedFeaturesResponse, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || authorizedFeaturesResponse.showCreateTeamPromotions != null) {
            dVar.v(fVar, 0, i.f64704a, authorizedFeaturesResponse.showCreateTeamPromotions);
        }
        if (dVar.E(fVar, 1) || authorizedFeaturesResponse.showBell != null) {
            dVar.v(fVar, 1, i.f64704a, authorizedFeaturesResponse.showBell);
        }
        if (dVar.E(fVar, 2) || authorizedFeaturesResponse.generateMultiKeyPair != null) {
            dVar.v(fVar, 2, i.f64704a, authorizedFeaturesResponse.generateMultiKeyPair);
        }
        if (dVar.E(fVar, 3) || authorizedFeaturesResponse.showPresenceEffect != null) {
            dVar.v(fVar, 3, i.f64704a, authorizedFeaturesResponse.showPresenceEffect);
        }
        if (dVar.E(fVar, 4) || authorizedFeaturesResponse.showMultiKeyPromotion != null) {
            dVar.v(fVar, 4, i.f64704a, authorizedFeaturesResponse.showMultiKeyPromotion);
        }
        if (dVar.E(fVar, 5) || authorizedFeaturesResponse.isEligibleForTrialExtend != null) {
            dVar.v(fVar, 5, i.f64704a, authorizedFeaturesResponse.isEligibleForTrialExtend);
        }
        if (!dVar.E(fVar, 6) && authorizedFeaturesResponse.multipleVaults == null) {
            return;
        }
        dVar.v(fVar, 6, i.f64704a, authorizedFeaturesResponse.multipleVaults);
    }

    public final Boolean component1() {
        return this.showCreateTeamPromotions;
    }

    public final Boolean component2() {
        return this.showBell;
    }

    public final Boolean component3() {
        return this.generateMultiKeyPair;
    }

    public final Boolean component4() {
        return this.showPresenceEffect;
    }

    public final Boolean component5() {
        return this.showMultiKeyPromotion;
    }

    public final Boolean component6() {
        return this.isEligibleForTrialExtend;
    }

    public final Boolean component7() {
        return this.multipleVaults;
    }

    public final AuthorizedFeaturesResponse copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        return new AuthorizedFeaturesResponse(bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedFeaturesResponse)) {
            return false;
        }
        AuthorizedFeaturesResponse authorizedFeaturesResponse = (AuthorizedFeaturesResponse) obj;
        return t.b(this.showCreateTeamPromotions, authorizedFeaturesResponse.showCreateTeamPromotions) && t.b(this.showBell, authorizedFeaturesResponse.showBell) && t.b(this.generateMultiKeyPair, authorizedFeaturesResponse.generateMultiKeyPair) && t.b(this.showPresenceEffect, authorizedFeaturesResponse.showPresenceEffect) && t.b(this.showMultiKeyPromotion, authorizedFeaturesResponse.showMultiKeyPromotion) && t.b(this.isEligibleForTrialExtend, authorizedFeaturesResponse.isEligibleForTrialExtend) && t.b(this.multipleVaults, authorizedFeaturesResponse.multipleVaults);
    }

    public final Boolean getGenerateMultiKeyPair() {
        return this.generateMultiKeyPair;
    }

    public final Boolean getMultipleVaults() {
        return this.multipleVaults;
    }

    public final Boolean getShowBell() {
        return this.showBell;
    }

    public final Boolean getShowCreateTeamPromotions() {
        return this.showCreateTeamPromotions;
    }

    public final Boolean getShowMultiKeyPromotion() {
        return this.showMultiKeyPromotion;
    }

    public final Boolean getShowPresenceEffect() {
        return this.showPresenceEffect;
    }

    public int hashCode() {
        Boolean bool = this.showCreateTeamPromotions;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showBell;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.generateMultiKeyPair;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showPresenceEffect;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.showMultiKeyPromotion;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isEligibleForTrialExtend;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.multipleVaults;
        return iHashCode6 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final Boolean isEligibleForTrialExtend() {
        return this.isEligibleForTrialExtend;
    }

    public String toString() {
        return "AuthorizedFeaturesResponse(showCreateTeamPromotions=" + this.showCreateTeamPromotions + ", showBell=" + this.showBell + ", generateMultiKeyPair=" + this.generateMultiKeyPair + ", showPresenceEffect=" + this.showPresenceEffect + ", showMultiKeyPromotion=" + this.showMultiKeyPromotion + ", isEligibleForTrialExtend=" + this.isEligibleForTrialExtend + ", multipleVaults=" + this.multipleVaults + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        Boolean bool = this.showCreateTeamPromotions;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showBell;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.generateMultiKeyPair;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.showPresenceEffect;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.showMultiKeyPromotion;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.isEligibleForTrialExtend;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.multipleVaults;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ AuthorizedFeaturesResponse(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.showCreateTeamPromotions = null;
        } else {
            this.showCreateTeamPromotions = bool;
        }
        if ((i10 & 2) == 0) {
            this.showBell = null;
        } else {
            this.showBell = bool2;
        }
        if ((i10 & 4) == 0) {
            this.generateMultiKeyPair = null;
        } else {
            this.generateMultiKeyPair = bool3;
        }
        if ((i10 & 8) == 0) {
            this.showPresenceEffect = null;
        } else {
            this.showPresenceEffect = bool4;
        }
        if ((i10 & 16) == 0) {
            this.showMultiKeyPromotion = null;
        } else {
            this.showMultiKeyPromotion = bool5;
        }
        if ((i10 & 32) == 0) {
            this.isEligibleForTrialExtend = null;
        } else {
            this.isEligibleForTrialExtend = bool6;
        }
        if ((i10 & 64) == 0) {
            this.multipleVaults = null;
        } else {
            this.multipleVaults = bool7;
        }
    }

    public AuthorizedFeaturesResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.showCreateTeamPromotions = bool;
        this.showBell = bool2;
        this.generateMultiKeyPair = bool3;
        this.showPresenceEffect = bool4;
        this.showMultiKeyPromotion = bool5;
        this.isEligibleForTrialExtend = bool6;
        this.multipleVaults = bool7;
    }

    public /* synthetic */ AuthorizedFeaturesResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? null : bool4, (i10 & 16) != 0 ? null : bool5, (i10 & 32) != 0 ? null : bool6, (i10 & 64) != 0 ? null : bool7);
    }
}
