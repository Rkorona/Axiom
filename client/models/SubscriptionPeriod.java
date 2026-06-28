package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionPeriod implements Parcelable {
    private final String from;
    private final String until;
    public static final Parcelable.Creator<SubscriptionPeriod> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SubscriptionPeriod createFromParcel(Parcel parcel) {
            ju.t.f(parcel, "parcel");
            return new SubscriptionPeriod(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SubscriptionPeriod[] newArray(int i10) {
            return new SubscriptionPeriod[i10];
        }
    }

    public SubscriptionPeriod(String str, String str2) {
        ju.t.f(str, "from");
        ju.t.f(str2, "until");
        this.from = str;
        this.until = str2;
    }

    public static /* synthetic */ SubscriptionPeriod copy$default(SubscriptionPeriod subscriptionPeriod, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionPeriod.from;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriptionPeriod.until;
        }
        return subscriptionPeriod.copy(str, str2);
    }

    public final String component1() {
        return this.from;
    }

    public final String component2() {
        return this.until;
    }

    public final SubscriptionPeriod copy(String str, String str2) {
        ju.t.f(str, "from");
        ju.t.f(str2, "until");
        return new SubscriptionPeriod(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPeriod)) {
            return false;
        }
        SubscriptionPeriod subscriptionPeriod = (SubscriptionPeriod) obj;
        return ju.t.b(this.from, subscriptionPeriod.from) && ju.t.b(this.until, subscriptionPeriod.until);
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
        return "SubscriptionPeriod(from=" + this.from + ", until=" + this.until + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ju.t.f(parcel, "dest");
        parcel.writeString(this.from);
        parcel.writeString(this.until);
    }
}
