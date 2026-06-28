package com.server.auditor.ssh.client.billing;

import android.os.Parcel;
import android.os.Parcelable;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProSubscriptionType implements Parcelable {
    public static final int $stable = 0;

    public static final class Annual extends ProSubscriptionType {
        public static final Annual INSTANCE = new Annual();
        public static final Parcelable.Creator<Annual> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Annual createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return Annual.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Annual[] newArray(int i10) {
                return new Annual[i10];
            }
        }

        private Annual() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class AnnualFreeTrial extends ProSubscriptionType {
        public static final AnnualFreeTrial INSTANCE = new AnnualFreeTrial();
        public static final Parcelable.Creator<AnnualFreeTrial> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnnualFreeTrial createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return AnnualFreeTrial.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AnnualFreeTrial[] newArray(int i10) {
                return new AnnualFreeTrial[i10];
            }
        }

        private AnnualFreeTrial() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class Monthly extends ProSubscriptionType {
        public static final Monthly INSTANCE = new Monthly();
        public static final Parcelable.Creator<Monthly> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Monthly createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return Monthly.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Monthly[] newArray(int i10) {
                return new Monthly[i10];
            }
        }

        private Monthly() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class MonthlyFreeTrial extends ProSubscriptionType {
        public static final MonthlyFreeTrial INSTANCE = new MonthlyFreeTrial();
        public static final Parcelable.Creator<MonthlyFreeTrial> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MonthlyFreeTrial createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return MonthlyFreeTrial.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MonthlyFreeTrial[] newArray(int i10) {
                return new MonthlyFreeTrial[i10];
            }
        }

        private MonthlyFreeTrial() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ProSubscriptionType(k kVar) {
        this();
    }

    private ProSubscriptionType() {
    }
}
