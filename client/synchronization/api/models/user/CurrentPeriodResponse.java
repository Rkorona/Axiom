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
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CurrentPeriodResponse implements Parcelable {
    private final String from;
    private final String until;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CurrentPeriodResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CurrentPeriodResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<CurrentPeriodResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrentPeriodResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new CurrentPeriodResponse(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrentPeriodResponse[] newArray(int i10) {
            return new CurrentPeriodResponse[i10];
        }
    }

    public /* synthetic */ CurrentPeriodResponse(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, CurrentPeriodResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.until = str2;
    }

    public static /* synthetic */ CurrentPeriodResponse copy$default(CurrentPeriodResponse currentPeriodResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = currentPeriodResponse.from;
        }
        if ((i10 & 2) != 0) {
            str2 = currentPeriodResponse.until;
        }
        return currentPeriodResponse.copy(str, str2);
    }

    @o("from")
    public static /* synthetic */ void getFrom$annotations() {
    }

    @o("until")
    public static /* synthetic */ void getUntil$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CurrentPeriodResponse currentPeriodResponse, d dVar, f fVar) {
        dVar.f(fVar, 0, currentPeriodResponse.from);
        dVar.f(fVar, 1, currentPeriodResponse.until);
    }

    public final String component1() {
        return this.from;
    }

    public final String component2() {
        return this.until;
    }

    public final CurrentPeriodResponse copy(String str, String str2) {
        t.f(str, "from");
        t.f(str2, "until");
        return new CurrentPeriodResponse(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentPeriodResponse)) {
            return false;
        }
        CurrentPeriodResponse currentPeriodResponse = (CurrentPeriodResponse) obj;
        return t.b(this.from, currentPeriodResponse.from) && t.b(this.until, currentPeriodResponse.until);
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getUntil() {
        return this.until;
    }

    public int hashCode() {
        return (this.from.hashCode() * 31) + this.until.hashCode();
    }

    public String toString() {
        return "CurrentPeriodResponse(from=" + this.from + ", until=" + this.until + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.from);
        parcel.writeString(this.until);
    }

    public CurrentPeriodResponse(String str, String str2) {
        t.f(str, "from");
        t.f(str2, "until");
        this.from = str;
        this.until = str2;
    }
}
