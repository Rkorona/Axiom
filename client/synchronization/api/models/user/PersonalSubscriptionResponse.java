package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class PersonalSubscriptionResponse implements Parcelable {
    public static final int $stable = 0;
    private final String createdAt;
    private final CurrentPeriodResponse currentPeriod;
    private final String platform;
    private final String status;
    private final String validUntil;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PersonalSubscriptionResponse> CREATOR = new Creator();

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return PersonalSubscriptionResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<PersonalSubscriptionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalSubscriptionResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new PersonalSubscriptionResponse(parcel.readString(), parcel.readInt() == 0 ? null : CurrentPeriodResponse.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalSubscriptionResponse[] newArray(int i10) {
            return new PersonalSubscriptionResponse[i10];
        }
    }

    public /* synthetic */ PersonalSubscriptionResponse(int i10, String str, CurrentPeriodResponse currentPeriodResponse, String str2, String str3, String str4, s2 s2Var) {
        if (13 != (i10 & 13)) {
            d2.a(i10, 13, PersonalSubscriptionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.platform = str;
        if ((i10 & 2) == 0) {
            this.currentPeriod = null;
        } else {
            this.currentPeriod = currentPeriodResponse;
        }
        this.validUntil = str2;
        this.createdAt = str3;
        if ((i10 & 16) == 0) {
            this.status = null;
        } else {
            this.status = str4;
        }
    }

    public static /* synthetic */ PersonalSubscriptionResponse copy$default(PersonalSubscriptionResponse personalSubscriptionResponse, String str, CurrentPeriodResponse currentPeriodResponse, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = personalSubscriptionResponse.platform;
        }
        if ((i10 & 2) != 0) {
            currentPeriodResponse = personalSubscriptionResponse.currentPeriod;
        }
        if ((i10 & 4) != 0) {
            str2 = personalSubscriptionResponse.validUntil;
        }
        if ((i10 & 8) != 0) {
            str3 = personalSubscriptionResponse.createdAt;
        }
        if ((i10 & 16) != 0) {
            str4 = personalSubscriptionResponse.status;
        }
        String str5 = str4;
        String str6 = str2;
        return personalSubscriptionResponse.copy(str, currentPeriodResponse, str6, str3, str5);
    }

    @o(Column.CREATED_AT)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @o("current_period")
    public static /* synthetic */ void getCurrentPeriod$annotations() {
    }

    @o("platform")
    public static /* synthetic */ void getPlatform$annotations() {
    }

    @o(Column.STATUS)
    public static /* synthetic */ void getStatus$annotations() {
    }

    @o("valid_until")
    public static /* synthetic */ void getValidUntil$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PersonalSubscriptionResponse personalSubscriptionResponse, d dVar, f fVar) {
        dVar.f(fVar, 0, personalSubscriptionResponse.platform);
        if (dVar.E(fVar, 1) || personalSubscriptionResponse.currentPeriod != null) {
            dVar.v(fVar, 1, CurrentPeriodResponse$$serializer.INSTANCE, personalSubscriptionResponse.currentPeriod);
        }
        dVar.f(fVar, 2, personalSubscriptionResponse.validUntil);
        dVar.f(fVar, 3, personalSubscriptionResponse.createdAt);
        if (!dVar.E(fVar, 4) && personalSubscriptionResponse.status == null) {
            return;
        }
        dVar.v(fVar, 4, x2.f64817a, personalSubscriptionResponse.status);
    }

    public final String component1() {
        return this.platform;
    }

    public final CurrentPeriodResponse component2() {
        return this.currentPeriod;
    }

    public final String component3() {
        return this.validUntil;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final String component5() {
        return this.status;
    }

    public final PersonalSubscriptionResponse copy(String str, CurrentPeriodResponse currentPeriodResponse, String str2, String str3, String str4) {
        t.f(str, "platform");
        t.f(str2, "validUntil");
        t.f(str3, "createdAt");
        return new PersonalSubscriptionResponse(str, currentPeriodResponse, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalSubscriptionResponse)) {
            return false;
        }
        PersonalSubscriptionResponse personalSubscriptionResponse = (PersonalSubscriptionResponse) obj;
        return t.b(this.platform, personalSubscriptionResponse.platform) && t.b(this.currentPeriod, personalSubscriptionResponse.currentPeriod) && t.b(this.validUntil, personalSubscriptionResponse.validUntil) && t.b(this.createdAt, personalSubscriptionResponse.createdAt) && t.b(this.status, personalSubscriptionResponse.status);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final CurrentPeriodResponse getCurrentPeriod() {
        return this.currentPeriod;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        int iHashCode = this.platform.hashCode() * 31;
        CurrentPeriodResponse currentPeriodResponse = this.currentPeriod;
        int iHashCode2 = (((((iHashCode + (currentPeriodResponse == null ? 0 : currentPeriodResponse.hashCode())) * 31) + this.validUntil.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        String str = this.status;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PersonalSubscriptionResponse(platform=" + this.platform + ", currentPeriod=" + this.currentPeriod + ", validUntil=" + this.validUntil + ", createdAt=" + this.createdAt + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.platform);
        CurrentPeriodResponse currentPeriodResponse = this.currentPeriod;
        if (currentPeriodResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currentPeriodResponse.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.validUntil);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.status);
    }

    public PersonalSubscriptionResponse(String str, CurrentPeriodResponse currentPeriodResponse, String str2, String str3, String str4) {
        t.f(str, "platform");
        t.f(str2, "validUntil");
        t.f(str3, "createdAt");
        this.platform = str;
        this.currentPeriod = currentPeriodResponse;
        this.validUntil = str2;
        this.createdAt = str3;
        this.status = str4;
    }

    public /* synthetic */ PersonalSubscriptionResponse(String str, CurrentPeriodResponse currentPeriodResponse, String str2, String str3, String str4, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : currentPeriodResponse, str2, str3, (i10 & 16) != 0 ? null : str4);
    }
}
