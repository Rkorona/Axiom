package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EndOfTeamTrialTargetAction implements Parcelable {
    public static final int $stable = 0;

    public static final class BuyProMonthlyPlan extends EndOfTeamTrialTargetAction {
        private final String price;
        public static final Parcelable.Creator<BuyProMonthlyPlan> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BuyProMonthlyPlan createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new BuyProMonthlyPlan(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BuyProMonthlyPlan[] newArray(int i10) {
                return new BuyProMonthlyPlan[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyProMonthlyPlan(String str) {
            super(null);
            ju.t.f(str, "price");
            this.price = str;
        }

        public static /* synthetic */ BuyProMonthlyPlan copy$default(BuyProMonthlyPlan buyProMonthlyPlan, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = buyProMonthlyPlan.price;
            }
            return buyProMonthlyPlan.copy(str);
        }

        public final String component1() {
            return this.price;
        }

        public final BuyProMonthlyPlan copy(String str) {
            ju.t.f(str, "price");
            return new BuyProMonthlyPlan(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyProMonthlyPlan) && ju.t.b(this.price, ((BuyProMonthlyPlan) obj).price);
        }

        public final String getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.price.hashCode();
        }

        public String toString() {
            return "BuyProMonthlyPlan(price=" + this.price + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.price);
        }
    }

    public static final class BuyProYearlyPlan extends EndOfTeamTrialTargetAction {
        private final String price;
        public static final Parcelable.Creator<BuyProYearlyPlan> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BuyProYearlyPlan createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new BuyProYearlyPlan(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BuyProYearlyPlan[] newArray(int i10) {
                return new BuyProYearlyPlan[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyProYearlyPlan(String str) {
            super(null);
            ju.t.f(str, "price");
            this.price = str;
        }

        public static /* synthetic */ BuyProYearlyPlan copy$default(BuyProYearlyPlan buyProYearlyPlan, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = buyProYearlyPlan.price;
            }
            return buyProYearlyPlan.copy(str);
        }

        public final String component1() {
            return this.price;
        }

        public final BuyProYearlyPlan copy(String str) {
            ju.t.f(str, "price");
            return new BuyProYearlyPlan(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyProYearlyPlan) && ju.t.b(this.price, ((BuyProYearlyPlan) obj).price);
        }

        public final String getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.price.hashCode();
        }

        public String toString() {
            return "BuyProYearlyPlan(price=" + this.price + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.price);
        }
    }

    public static final class DowngradeToProPlan extends EndOfTeamTrialTargetAction {
        public static final DowngradeToProPlan INSTANCE = new DowngradeToProPlan();
        public static final Parcelable.Creator<DowngradeToProPlan> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DowngradeToProPlan createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return DowngradeToProPlan.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DowngradeToProPlan[] newArray(int i10) {
                return new DowngradeToProPlan[i10];
            }
        }

        private DowngradeToProPlan() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DowngradeToProPlan);
        }

        public int hashCode() {
            return 1809779249;
        }

        public String toString() {
            return "DowngradeToProPlan";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class DowngradeToStarterPlan extends EndOfTeamTrialTargetAction {
        public static final DowngradeToStarterPlan INSTANCE = new DowngradeToStarterPlan();
        public static final Parcelable.Creator<DowngradeToStarterPlan> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DowngradeToStarterPlan createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return DowngradeToStarterPlan.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DowngradeToStarterPlan[] newArray(int i10) {
                return new DowngradeToStarterPlan[i10];
            }
        }

        private DowngradeToStarterPlan() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DowngradeToStarterPlan);
        }

        public int hashCode() {
            return -104136301;
        }

        public String toString() {
            return "DowngradeToStarterPlan";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ EndOfTeamTrialTargetAction(ju.k kVar) {
        this();
    }

    private EndOfTeamTrialTargetAction() {
    }
}
