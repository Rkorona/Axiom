package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SubscriptionPeriodInfo implements Parcelable {
    public static final int $stable = 0;

    public static final class Days extends SubscriptionPeriodInfo {
        private final int days;
        public static final Parcelable.Creator<Days> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Days createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new Days(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Days[] newArray(int i10) {
                return new Days[i10];
            }
        }

        public Days(int i10) {
            super(null);
            this.days = i10;
        }

        public static /* synthetic */ Days copy$default(Days days, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = days.days;
            }
            return days.copy(i10);
        }

        public final int component1() {
            return this.days;
        }

        public final Days copy(int i10) {
            return new Days(i10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Days) && this.days == ((Days) obj).days;
        }

        public final int getDays() {
            return this.days;
        }

        public int hashCode() {
            return Integer.hashCode(this.days);
        }

        public String toString() {
            return "Days(days=" + this.days + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(this.days);
        }
    }

    public /* synthetic */ SubscriptionPeriodInfo(ju.k kVar) {
        this();
    }

    private SubscriptionPeriodInfo() {
    }
}
