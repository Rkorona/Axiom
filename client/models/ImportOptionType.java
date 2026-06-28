package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImportOptionType implements Parcelable {
    public static final int $stable = 0;

    public static final class AWS extends ImportOptionType {
        public static final AWS INSTANCE = new AWS();
        public static final Parcelable.Creator<AWS> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AWS createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return AWS.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AWS[] newArray(int i10) {
                return new AWS[i10];
            }
        }

        private AWS() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AWS);
        }

        public int hashCode() {
            return -655573448;
        }

        public String toString() {
            return "AWS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class CSV extends ImportOptionType {
        public static final CSV INSTANCE = new CSV();
        public static final Parcelable.Creator<CSV> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CSV createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return CSV.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CSV[] newArray(int i10) {
                return new CSV[i10];
            }
        }

        private CSV() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CSV);
        }

        public int hashCode() {
            return -655571647;
        }

        public String toString() {
            return "CSV";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class DigitalOcean extends ImportOptionType {
        public static final DigitalOcean INSTANCE = new DigitalOcean();
        public static final Parcelable.Creator<DigitalOcean> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DigitalOcean createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return DigitalOcean.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DigitalOcean[] newArray(int i10) {
                return new DigitalOcean[i10];
            }
        }

        private DigitalOcean() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DigitalOcean);
        }

        public int hashCode() {
            return -1314286357;
        }

        public String toString() {
            return "DigitalOcean";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class MobaXTerm extends ImportOptionType {
        public static final MobaXTerm INSTANCE = new MobaXTerm();
        public static final Parcelable.Creator<MobaXTerm> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MobaXTerm createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return MobaXTerm.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MobaXTerm[] newArray(int i10) {
                return new MobaXTerm[i10];
            }
        }

        private MobaXTerm() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MobaXTerm);
        }

        public int hashCode() {
            return 1587017502;
        }

        public String toString() {
            return "MobaXTerm";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class PuTTY extends ImportOptionType {
        public static final PuTTY INSTANCE = new PuTTY();
        public static final Parcelable.Creator<PuTTY> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PuTTY createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return PuTTY.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PuTTY[] newArray(int i10) {
                return new PuTTY[i10];
            }
        }

        private PuTTY() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PuTTY);
        }

        public int hashCode() {
            return 1368859183;
        }

        public String toString() {
            return "PuTTY";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class SecureCRT extends ImportOptionType {
        public static final SecureCRT INSTANCE = new SecureCRT();
        public static final Parcelable.Creator<SecureCRT> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SecureCRT createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return SecureCRT.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SecureCRT[] newArray(int i10) {
                return new SecureCRT[i10];
            }
        }

        private SecureCRT() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SecureCRT);
        }

        public int hashCode() {
            return 568562153;
        }

        public String toString() {
            return "SecureCRT";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class SshConfig extends ImportOptionType {
        public static final SshConfig INSTANCE = new SshConfig();
        public static final Parcelable.Creator<SshConfig> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SshConfig createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return SshConfig.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SshConfig[] newArray(int i10) {
                return new SshConfig[i10];
            }
        }

        private SshConfig() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SshConfig);
        }

        public int hashCode() {
            return -2093271451;
        }

        public String toString() {
            return "SshConfig";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ImportOptionType(ju.k kVar) {
        this();
    }

    private ImportOptionType() {
    }
}
