package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DowngradeToPlanType implements Parcelable {
    public static final int $stable = 0;

    public static final class DowngradeToIndividual extends DowngradeToPlanType {
        public static final DowngradeToIndividual INSTANCE = new DowngradeToIndividual();
        public static final Parcelable.Creator<DowngradeToIndividual> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DowngradeToIndividual createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return DowngradeToIndividual.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DowngradeToIndividual[] newArray(int i10) {
                return new DowngradeToIndividual[i10];
            }
        }

        private DowngradeToIndividual() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DowngradeToIndividual);
        }

        public int hashCode() {
            return -369463719;
        }

        public String toString() {
            return "DowngradeToIndividual";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class DowngradeToTeam extends DowngradeToPlanType {
        public static final DowngradeToTeam INSTANCE = new DowngradeToTeam();
        public static final Parcelable.Creator<DowngradeToTeam> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DowngradeToTeam createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return DowngradeToTeam.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DowngradeToTeam[] newArray(int i10) {
                return new DowngradeToTeam[i10];
            }
        }

        private DowngradeToTeam() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DowngradeToTeam);
        }

        public int hashCode() {
            return 1046928925;
        }

        public String toString() {
            return "DowngradeToTeam";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ DowngradeToPlanType(ju.k kVar) {
        this();
    }

    private DowngradeToPlanType() {
    }
}
