package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExpiredSubscriptionScreenType implements Parcelable {
    public static final int $stable = 0;

    public static final class ExpiredEnterprise extends ExpiredSubscriptionScreenType {
        public static final ExpiredEnterprise INSTANCE = new ExpiredEnterprise();
        public static final Parcelable.Creator<ExpiredEnterprise> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredEnterprise createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return ExpiredEnterprise.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredEnterprise[] newArray(int i10) {
                return new ExpiredEnterprise[i10];
            }
        }

        private ExpiredEnterprise() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExpiredEnterprise);
        }

        public int hashCode() {
            return 1399436683;
        }

        public String toString() {
            return "ExpiredEnterprise";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class ExpiredGitHubStudent extends ExpiredSubscriptionScreenType {
        public static final ExpiredGitHubStudent INSTANCE = new ExpiredGitHubStudent();
        public static final Parcelable.Creator<ExpiredGitHubStudent> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredGitHubStudent createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return ExpiredGitHubStudent.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredGitHubStudent[] newArray(int i10) {
                return new ExpiredGitHubStudent[i10];
            }
        }

        private ExpiredGitHubStudent() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExpiredGitHubStudent);
        }

        public int hashCode() {
            return -1640523122;
        }

        public String toString() {
            return "ExpiredGitHubStudent";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class ExpiredGitHubTeacher extends ExpiredSubscriptionScreenType {
        public static final ExpiredGitHubTeacher INSTANCE = new ExpiredGitHubTeacher();
        public static final Parcelable.Creator<ExpiredGitHubTeacher> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredGitHubTeacher createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return ExpiredGitHubTeacher.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredGitHubTeacher[] newArray(int i10) {
                return new ExpiredGitHubTeacher[i10];
            }
        }

        private ExpiredGitHubTeacher() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExpiredGitHubTeacher);
        }

        public int hashCode() {
            return -1200954315;
        }

        public String toString() {
            return "ExpiredGitHubTeacher";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class ExpiredProPaid extends ExpiredSubscriptionScreenType {
        public static final ExpiredProPaid INSTANCE = new ExpiredProPaid();
        public static final Parcelable.Creator<ExpiredProPaid> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredProPaid createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return ExpiredProPaid.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredProPaid[] newArray(int i10) {
                return new ExpiredProPaid[i10];
            }
        }

        private ExpiredProPaid() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExpiredProPaid);
        }

        public int hashCode() {
            return 2129340719;
        }

        public String toString() {
            return "ExpiredProPaid";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class ExpiredProPaidAndTrialTeamOwner extends ExpiredSubscriptionScreenType {
        private final boolean hasMembers;
        private final boolean hasSharedGroups;
        public static final Parcelable.Creator<ExpiredProPaidAndTrialTeamOwner> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredProPaidAndTrialTeamOwner createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new ExpiredProPaidAndTrialTeamOwner(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredProPaidAndTrialTeamOwner[] newArray(int i10) {
                return new ExpiredProPaidAndTrialTeamOwner[i10];
            }
        }

        public ExpiredProPaidAndTrialTeamOwner(boolean z10, boolean z11) {
            super(null);
            this.hasMembers = z10;
            this.hasSharedGroups = z11;
        }

        public static /* synthetic */ ExpiredProPaidAndTrialTeamOwner copy$default(ExpiredProPaidAndTrialTeamOwner expiredProPaidAndTrialTeamOwner, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = expiredProPaidAndTrialTeamOwner.hasMembers;
            }
            if ((i10 & 2) != 0) {
                z11 = expiredProPaidAndTrialTeamOwner.hasSharedGroups;
            }
            return expiredProPaidAndTrialTeamOwner.copy(z10, z11);
        }

        public final boolean component1() {
            return this.hasMembers;
        }

        public final boolean component2() {
            return this.hasSharedGroups;
        }

        public final ExpiredProPaidAndTrialTeamOwner copy(boolean z10, boolean z11) {
            return new ExpiredProPaidAndTrialTeamOwner(z10, z11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpiredProPaidAndTrialTeamOwner)) {
                return false;
            }
            ExpiredProPaidAndTrialTeamOwner expiredProPaidAndTrialTeamOwner = (ExpiredProPaidAndTrialTeamOwner) obj;
            return this.hasMembers == expiredProPaidAndTrialTeamOwner.hasMembers && this.hasSharedGroups == expiredProPaidAndTrialTeamOwner.hasSharedGroups;
        }

        public final boolean getHasMembers() {
            return this.hasMembers;
        }

        public final boolean getHasSharedGroups() {
            return this.hasSharedGroups;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.hasMembers) * 31) + Boolean.hashCode(this.hasSharedGroups);
        }

        public String toString() {
            return "ExpiredProPaidAndTrialTeamOwner(hasMembers=" + this.hasMembers + ", hasSharedGroups=" + this.hasSharedGroups + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(this.hasMembers ? 1 : 0);
            parcel.writeInt(this.hasSharedGroups ? 1 : 0);
        }
    }

    public static final class ExpiredProTrial extends ExpiredSubscriptionScreenType {
        public static final ExpiredProTrial INSTANCE = new ExpiredProTrial();
        public static final Parcelable.Creator<ExpiredProTrial> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredProTrial createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return ExpiredProTrial.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredProTrial[] newArray(int i10) {
                return new ExpiredProTrial[i10];
            }
        }

        private ExpiredProTrial() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExpiredProTrial);
        }

        public int hashCode() {
            return 1589253395;
        }

        public String toString() {
            return "ExpiredProTrial";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class ExpiredTeamMember extends ExpiredSubscriptionScreenType {
        public static final ExpiredTeamMember INSTANCE = new ExpiredTeamMember();
        public static final Parcelable.Creator<ExpiredTeamMember> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredTeamMember createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return ExpiredTeamMember.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredTeamMember[] newArray(int i10) {
                return new ExpiredTeamMember[i10];
            }
        }

        private ExpiredTeamMember() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExpiredTeamMember);
        }

        public int hashCode() {
            return 520765825;
        }

        public String toString() {
            return "ExpiredTeamMember";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class ExpiredTeamOwner extends ExpiredSubscriptionScreenType {
        public static final ExpiredTeamOwner INSTANCE = new ExpiredTeamOwner();
        public static final Parcelable.Creator<ExpiredTeamOwner> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredTeamOwner createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return ExpiredTeamOwner.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredTeamOwner[] newArray(int i10) {
                return new ExpiredTeamOwner[i10];
            }
        }

        private ExpiredTeamOwner() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExpiredTeamOwner);
        }

        public int hashCode() {
            return -950648084;
        }

        public String toString() {
            return "ExpiredTeamOwner";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class ExpiredTrialTeamOwner extends ExpiredSubscriptionScreenType {
        private final boolean hasMembers;
        private final boolean hasSharedGroups;
        public static final Parcelable.Creator<ExpiredTrialTeamOwner> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExpiredTrialTeamOwner createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new ExpiredTrialTeamOwner(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExpiredTrialTeamOwner[] newArray(int i10) {
                return new ExpiredTrialTeamOwner[i10];
            }
        }

        public ExpiredTrialTeamOwner(boolean z10, boolean z11) {
            super(null);
            this.hasMembers = z10;
            this.hasSharedGroups = z11;
        }

        public static /* synthetic */ ExpiredTrialTeamOwner copy$default(ExpiredTrialTeamOwner expiredTrialTeamOwner, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = expiredTrialTeamOwner.hasMembers;
            }
            if ((i10 & 2) != 0) {
                z11 = expiredTrialTeamOwner.hasSharedGroups;
            }
            return expiredTrialTeamOwner.copy(z10, z11);
        }

        public final boolean component1() {
            return this.hasMembers;
        }

        public final boolean component2() {
            return this.hasSharedGroups;
        }

        public final ExpiredTrialTeamOwner copy(boolean z10, boolean z11) {
            return new ExpiredTrialTeamOwner(z10, z11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpiredTrialTeamOwner)) {
                return false;
            }
            ExpiredTrialTeamOwner expiredTrialTeamOwner = (ExpiredTrialTeamOwner) obj;
            return this.hasMembers == expiredTrialTeamOwner.hasMembers && this.hasSharedGroups == expiredTrialTeamOwner.hasSharedGroups;
        }

        public final boolean getHasMembers() {
            return this.hasMembers;
        }

        public final boolean getHasSharedGroups() {
            return this.hasSharedGroups;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.hasMembers) * 31) + Boolean.hashCode(this.hasSharedGroups);
        }

        public String toString() {
            return "ExpiredTrialTeamOwner(hasMembers=" + this.hasMembers + ", hasSharedGroups=" + this.hasSharedGroups + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(this.hasMembers ? 1 : 0);
            parcel.writeInt(this.hasSharedGroups ? 1 : 0);
        }
    }

    @ut.e
    public static final class TeamTrialOwnerAwaitingDowngrade extends ExpiredSubscriptionScreenType {
        public static final TeamTrialOwnerAwaitingDowngrade INSTANCE = new TeamTrialOwnerAwaitingDowngrade();
        public static final Parcelable.Creator<TeamTrialOwnerAwaitingDowngrade> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TeamTrialOwnerAwaitingDowngrade createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return TeamTrialOwnerAwaitingDowngrade.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TeamTrialOwnerAwaitingDowngrade[] newArray(int i10) {
                return new TeamTrialOwnerAwaitingDowngrade[i10];
            }
        }

        private TeamTrialOwnerAwaitingDowngrade() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TeamTrialOwnerAwaitingDowngrade);
        }

        public int hashCode() {
            return 1927972628;
        }

        public String toString() {
            return "TeamTrialOwnerAwaitingDowngrade";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class UndefinedType extends ExpiredSubscriptionScreenType {
        public static final UndefinedType INSTANCE = new UndefinedType();
        public static final Parcelable.Creator<UndefinedType> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UndefinedType createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return UndefinedType.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UndefinedType[] newArray(int i10) {
                return new UndefinedType[i10];
            }
        }

        private UndefinedType() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UndefinedType);
        }

        public int hashCode() {
            return 799768655;
        }

        public String toString() {
            return "UndefinedType";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ExpiredSubscriptionScreenType(ju.k kVar) {
        this();
    }

    private ExpiredSubscriptionScreenType() {
    }
}
