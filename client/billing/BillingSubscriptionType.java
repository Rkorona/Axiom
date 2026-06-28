package com.server.auditor.ssh.client.billing;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BillingSubscriptionType implements Parcelable {
    public static final int $stable = 0;

    public static final class Pro extends BillingSubscriptionType {
        private final ProSubscriptionType type;
        public static final Parcelable.Creator<Pro> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pro createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new Pro((ProSubscriptionType) parcel.readParcelable(Pro.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pro[] newArray(int i10) {
                return new Pro[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pro(ProSubscriptionType proSubscriptionType) {
            super(null);
            t.f(proSubscriptionType, Column.TYPE);
            this.type = proSubscriptionType;
        }

        public static /* synthetic */ Pro copy$default(Pro pro, ProSubscriptionType proSubscriptionType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                proSubscriptionType = pro.type;
            }
            return pro.copy(proSubscriptionType);
        }

        public final ProSubscriptionType component1() {
            return this.type;
        }

        public final Pro copy(ProSubscriptionType proSubscriptionType) {
            t.f(proSubscriptionType, Column.TYPE);
            return new Pro(proSubscriptionType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pro) && t.b(this.type, ((Pro) obj).type);
        }

        public final ProSubscriptionType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "Pro(type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.type, i10);
        }
    }

    public /* synthetic */ BillingSubscriptionType(k kVar) {
        this();
    }

    private BillingSubscriptionType() {
    }
}
