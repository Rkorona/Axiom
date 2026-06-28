package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UserType implements Parcelable {
    public static final int $stable = 0;

    public static final class BusinessTeamMember extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BusinessTeamMember> CREATOR = new a();
        private final boolean isTeamExpired;
        private final String teamName;
        private final SubscriptionPeriod teamSubscriptionPeriod;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BusinessTeamMember createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new BusinessTeamMember(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BusinessTeamMember[] newArray(int i10) {
                return new BusinessTeamMember[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BusinessTeamMember(String str, boolean z10, String str2, SubscriptionPeriod subscriptionPeriod) {
            super(null);
            ju.t.f(str2, "teamName");
            this.title = str;
            this.isTeamExpired = z10;
            this.teamName = str2;
            this.teamSubscriptionPeriod = subscriptionPeriod;
        }

        public static /* synthetic */ BusinessTeamMember copy$default(BusinessTeamMember businessTeamMember, String str, boolean z10, String str2, SubscriptionPeriod subscriptionPeriod, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = businessTeamMember.title;
            }
            if ((i10 & 2) != 0) {
                z10 = businessTeamMember.isTeamExpired;
            }
            if ((i10 & 4) != 0) {
                str2 = businessTeamMember.teamName;
            }
            if ((i10 & 8) != 0) {
                subscriptionPeriod = businessTeamMember.teamSubscriptionPeriod;
            }
            return businessTeamMember.copy(str, z10, str2, subscriptionPeriod);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isTeamExpired;
        }

        public final String component3() {
            return this.teamName;
        }

        public final SubscriptionPeriod component4() {
            return this.teamSubscriptionPeriod;
        }

        public final BusinessTeamMember copy(String str, boolean z10, String str2, SubscriptionPeriod subscriptionPeriod) {
            ju.t.f(str2, "teamName");
            return new BusinessTeamMember(str, z10, str2, subscriptionPeriod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BusinessTeamMember)) {
                return false;
            }
            BusinessTeamMember businessTeamMember = (BusinessTeamMember) obj;
            return ju.t.b(this.title, businessTeamMember.title) && this.isTeamExpired == businessTeamMember.isTeamExpired && ju.t.b(this.teamName, businessTeamMember.teamName) && ju.t.b(this.teamSubscriptionPeriod, businessTeamMember.teamSubscriptionPeriod);
        }

        public final String getTeamName() {
            return this.teamName;
        }

        public final SubscriptionPeriod getTeamSubscriptionPeriod() {
            return this.teamSubscriptionPeriod;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isTeamExpired)) * 31) + this.teamName.hashCode()) * 31;
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            return iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0);
        }

        public final boolean isTeamExpired() {
            return this.isTeamExpired;
        }

        public String toString() {
            return "BusinessTeamMember(title=" + this.title + ", isTeamExpired=" + this.isTeamExpired + ", teamName=" + this.teamName + ", teamSubscriptionPeriod=" + this.teamSubscriptionPeriod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isTeamExpired ? 1 : 0);
            parcel.writeString(this.teamName);
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
        }
    }

    public static final class BusinessTeamOwner extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BusinessTeamOwner> CREATOR = new a();
        private final boolean isExpired;
        private final String teamName;
        private final SubscriptionPeriod teamSubscriptionPeriod;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BusinessTeamOwner createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new BusinessTeamOwner(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BusinessTeamOwner[] newArray(int i10) {
                return new BusinessTeamOwner[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BusinessTeamOwner(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            super(null);
            ju.t.f(str2, "teamName");
            this.title = str;
            this.isExpired = z10;
            this.teamSubscriptionPeriod = subscriptionPeriod;
            this.teamName = str2;
        }

        public static /* synthetic */ BusinessTeamOwner copy$default(BusinessTeamOwner businessTeamOwner, String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = businessTeamOwner.title;
            }
            if ((i10 & 2) != 0) {
                z10 = businessTeamOwner.isExpired;
            }
            if ((i10 & 4) != 0) {
                subscriptionPeriod = businessTeamOwner.teamSubscriptionPeriod;
            }
            if ((i10 & 8) != 0) {
                str2 = businessTeamOwner.teamName;
            }
            return businessTeamOwner.copy(str, z10, subscriptionPeriod, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isExpired;
        }

        public final SubscriptionPeriod component3() {
            return this.teamSubscriptionPeriod;
        }

        public final String component4() {
            return this.teamName;
        }

        public final BusinessTeamOwner copy(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            ju.t.f(str2, "teamName");
            return new BusinessTeamOwner(str, z10, subscriptionPeriod, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BusinessTeamOwner)) {
                return false;
            }
            BusinessTeamOwner businessTeamOwner = (BusinessTeamOwner) obj;
            return ju.t.b(this.title, businessTeamOwner.title) && this.isExpired == businessTeamOwner.isExpired && ju.t.b(this.teamSubscriptionPeriod, businessTeamOwner.teamSubscriptionPeriod) && ju.t.b(this.teamName, businessTeamOwner.teamName);
        }

        public final String getTeamName() {
            return this.teamName;
        }

        public final SubscriptionPeriod getTeamSubscriptionPeriod() {
            return this.teamSubscriptionPeriod;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31;
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            return ((iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0)) * 31) + this.teamName.hashCode();
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public String toString() {
            return "BusinessTeamOwner(title=" + this.title + ", isExpired=" + this.isExpired + ", teamSubscriptionPeriod=" + this.teamSubscriptionPeriod + ", teamName=" + this.teamName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isExpired ? 1 : 0);
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.teamName);
        }
    }

    public static final class BusinessTrialOwner extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BusinessTrialOwner> CREATOR = new a();
        private final boolean isExpired;
        private final SubscriptionPeriod subscriptionPeriod;
        private final String teamName;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BusinessTrialOwner createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new BusinessTrialOwner(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BusinessTrialOwner[] newArray(int i10) {
                return new BusinessTrialOwner[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BusinessTrialOwner(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            super(null);
            ju.t.f(str2, "teamName");
            this.title = str;
            this.isExpired = z10;
            this.subscriptionPeriod = subscriptionPeriod;
            this.teamName = str2;
        }

        public static /* synthetic */ BusinessTrialOwner copy$default(BusinessTrialOwner businessTrialOwner, String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = businessTrialOwner.title;
            }
            if ((i10 & 2) != 0) {
                z10 = businessTrialOwner.isExpired;
            }
            if ((i10 & 4) != 0) {
                subscriptionPeriod = businessTrialOwner.subscriptionPeriod;
            }
            if ((i10 & 8) != 0) {
                str2 = businessTrialOwner.teamName;
            }
            return businessTrialOwner.copy(str, z10, subscriptionPeriod, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isExpired;
        }

        public final SubscriptionPeriod component3() {
            return this.subscriptionPeriod;
        }

        public final String component4() {
            return this.teamName;
        }

        public final BusinessTrialOwner copy(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            ju.t.f(str2, "teamName");
            return new BusinessTrialOwner(str, z10, subscriptionPeriod, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BusinessTrialOwner)) {
                return false;
            }
            BusinessTrialOwner businessTrialOwner = (BusinessTrialOwner) obj;
            return ju.t.b(this.title, businessTrialOwner.title) && this.isExpired == businessTrialOwner.isExpired && ju.t.b(this.subscriptionPeriod, businessTrialOwner.subscriptionPeriod) && ju.t.b(this.teamName, businessTrialOwner.teamName);
        }

        public final SubscriptionPeriod getSubscriptionPeriod() {
            return this.subscriptionPeriod;
        }

        public final String getTeamName() {
            return this.teamName;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31;
            SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
            return ((iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0)) * 31) + this.teamName.hashCode();
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public String toString() {
            return "BusinessTrialOwner(title=" + this.title + ", isExpired=" + this.isExpired + ", subscriptionPeriod=" + this.subscriptionPeriod + ", teamName=" + this.teamName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isExpired ? 1 : 0);
            SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.teamName);
        }
    }

    public static final class Enterprise extends UserType {
        private final String organizationName;
        private final String subscriptionTitle;
        public static final Parcelable.Creator<Enterprise> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Enterprise createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new Enterprise(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Enterprise[] newArray(int i10) {
                return new Enterprise[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enterprise(String str, String str2) {
            super(null);
            ju.t.f(str2, "organizationName");
            this.subscriptionTitle = str;
            this.organizationName = str2;
        }

        public static /* synthetic */ Enterprise copy$default(Enterprise enterprise, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = enterprise.subscriptionTitle;
            }
            if ((i10 & 2) != 0) {
                str2 = enterprise.organizationName;
            }
            return enterprise.copy(str, str2);
        }

        public final String component1() {
            return this.subscriptionTitle;
        }

        public final String component2() {
            return this.organizationName;
        }

        public final Enterprise copy(String str, String str2) {
            ju.t.f(str2, "organizationName");
            return new Enterprise(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Enterprise)) {
                return false;
            }
            Enterprise enterprise = (Enterprise) obj;
            return ju.t.b(this.subscriptionTitle, enterprise.subscriptionTitle) && ju.t.b(this.organizationName, enterprise.organizationName);
        }

        public final String getOrganizationName() {
            return this.organizationName;
        }

        public final String getSubscriptionTitle() {
            return this.subscriptionTitle;
        }

        public int hashCode() {
            String str = this.subscriptionTitle;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.organizationName.hashCode();
        }

        public String toString() {
            return "Enterprise(subscriptionTitle=" + this.subscriptionTitle + ", organizationName=" + this.organizationName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.subscriptionTitle);
            parcel.writeString(this.organizationName);
        }
    }

    public static final class GitHubStudent extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GitHubStudent> CREATOR = new a();
        private final boolean isExpired;
        private final String teamName;
        private final SubscriptionPeriod teamSubscriptionPeriod;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GitHubStudent createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new GitHubStudent(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GitHubStudent[] newArray(int i10) {
                return new GitHubStudent[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GitHubStudent(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            super(null);
            ju.t.f(str2, "teamName");
            this.title = str;
            this.isExpired = z10;
            this.teamSubscriptionPeriod = subscriptionPeriod;
            this.teamName = str2;
        }

        public static /* synthetic */ GitHubStudent copy$default(GitHubStudent gitHubStudent, String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gitHubStudent.title;
            }
            if ((i10 & 2) != 0) {
                z10 = gitHubStudent.isExpired;
            }
            if ((i10 & 4) != 0) {
                subscriptionPeriod = gitHubStudent.teamSubscriptionPeriod;
            }
            if ((i10 & 8) != 0) {
                str2 = gitHubStudent.teamName;
            }
            return gitHubStudent.copy(str, z10, subscriptionPeriod, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isExpired;
        }

        public final SubscriptionPeriod component3() {
            return this.teamSubscriptionPeriod;
        }

        public final String component4() {
            return this.teamName;
        }

        public final GitHubStudent copy(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            ju.t.f(str2, "teamName");
            return new GitHubStudent(str, z10, subscriptionPeriod, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GitHubStudent)) {
                return false;
            }
            GitHubStudent gitHubStudent = (GitHubStudent) obj;
            return ju.t.b(this.title, gitHubStudent.title) && this.isExpired == gitHubStudent.isExpired && ju.t.b(this.teamSubscriptionPeriod, gitHubStudent.teamSubscriptionPeriod) && ju.t.b(this.teamName, gitHubStudent.teamName);
        }

        public final String getTeamName() {
            return this.teamName;
        }

        public final SubscriptionPeriod getTeamSubscriptionPeriod() {
            return this.teamSubscriptionPeriod;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31;
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            return ((iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0)) * 31) + this.teamName.hashCode();
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public String toString() {
            return "GitHubStudent(title=" + this.title + ", isExpired=" + this.isExpired + ", teamSubscriptionPeriod=" + this.teamSubscriptionPeriod + ", teamName=" + this.teamName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isExpired ? 1 : 0);
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.teamName);
        }
    }

    public static final class GitHubTeacher extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GitHubTeacher> CREATOR = new a();
        private final boolean isExpired;
        private final String teamName;
        private final SubscriptionPeriod teamSubscriptionPeriod;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GitHubTeacher createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new GitHubTeacher(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GitHubTeacher[] newArray(int i10) {
                return new GitHubTeacher[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GitHubTeacher(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            super(null);
            ju.t.f(str2, "teamName");
            this.title = str;
            this.isExpired = z10;
            this.teamSubscriptionPeriod = subscriptionPeriod;
            this.teamName = str2;
        }

        public static /* synthetic */ GitHubTeacher copy$default(GitHubTeacher gitHubTeacher, String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gitHubTeacher.title;
            }
            if ((i10 & 2) != 0) {
                z10 = gitHubTeacher.isExpired;
            }
            if ((i10 & 4) != 0) {
                subscriptionPeriod = gitHubTeacher.teamSubscriptionPeriod;
            }
            if ((i10 & 8) != 0) {
                str2 = gitHubTeacher.teamName;
            }
            return gitHubTeacher.copy(str, z10, subscriptionPeriod, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isExpired;
        }

        public final SubscriptionPeriod component3() {
            return this.teamSubscriptionPeriod;
        }

        public final String component4() {
            return this.teamName;
        }

        public final GitHubTeacher copy(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            ju.t.f(str2, "teamName");
            return new GitHubTeacher(str, z10, subscriptionPeriod, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GitHubTeacher)) {
                return false;
            }
            GitHubTeacher gitHubTeacher = (GitHubTeacher) obj;
            return ju.t.b(this.title, gitHubTeacher.title) && this.isExpired == gitHubTeacher.isExpired && ju.t.b(this.teamSubscriptionPeriod, gitHubTeacher.teamSubscriptionPeriod) && ju.t.b(this.teamName, gitHubTeacher.teamName);
        }

        public final String getTeamName() {
            return this.teamName;
        }

        public final SubscriptionPeriod getTeamSubscriptionPeriod() {
            return this.teamSubscriptionPeriod;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31;
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            return ((iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0)) * 31) + this.teamName.hashCode();
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public String toString() {
            return "GitHubTeacher(title=" + this.title + ", isExpired=" + this.isExpired + ", teamSubscriptionPeriod=" + this.teamSubscriptionPeriod + ", teamName=" + this.teamName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isExpired ? 1 : 0);
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.teamName);
        }
    }

    public static final class Pro extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Pro> CREATOR = new a();
        private final boolean isExpired;
        private final SubscriptionPeriod subscriptionPeriod;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pro createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new Pro(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pro[] newArray(int i10) {
                return new Pro[i10];
            }
        }

        public Pro(String str, boolean z10, SubscriptionPeriod subscriptionPeriod) {
            super(null);
            this.title = str;
            this.isExpired = z10;
            this.subscriptionPeriod = subscriptionPeriod;
        }

        public static /* synthetic */ Pro copy$default(Pro pro, String str, boolean z10, SubscriptionPeriod subscriptionPeriod, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pro.title;
            }
            if ((i10 & 2) != 0) {
                z10 = pro.isExpired;
            }
            if ((i10 & 4) != 0) {
                subscriptionPeriod = pro.subscriptionPeriod;
            }
            return pro.copy(str, z10, subscriptionPeriod);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isExpired;
        }

        public final SubscriptionPeriod component3() {
            return this.subscriptionPeriod;
        }

        public final Pro copy(String str, boolean z10, SubscriptionPeriod subscriptionPeriod) {
            return new Pro(str, z10, subscriptionPeriod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pro)) {
                return false;
            }
            Pro pro = (Pro) obj;
            return ju.t.b(this.title, pro.title) && this.isExpired == pro.isExpired && ju.t.b(this.subscriptionPeriod, pro.subscriptionPeriod);
        }

        public final SubscriptionPeriod getSubscriptionPeriod() {
            return this.subscriptionPeriod;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31;
            SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
            return iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0);
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public String toString() {
            return "Pro(title=" + this.title + ", isExpired=" + this.isExpired + ", subscriptionPeriod=" + this.subscriptionPeriod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isExpired ? 1 : 0);
            SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
        }
    }

    public static final class ProTrial extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ProTrial> CREATOR = new a();
        private final boolean isExpired;
        private final SubscriptionPeriod subscriptionPeriod;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProTrial createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new ProTrial(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProTrial[] newArray(int i10) {
                return new ProTrial[i10];
            }
        }

        public ProTrial(String str, boolean z10, SubscriptionPeriod subscriptionPeriod) {
            super(null);
            this.title = str;
            this.isExpired = z10;
            this.subscriptionPeriod = subscriptionPeriod;
        }

        public static /* synthetic */ ProTrial copy$default(ProTrial proTrial, String str, boolean z10, SubscriptionPeriod subscriptionPeriod, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = proTrial.title;
            }
            if ((i10 & 2) != 0) {
                z10 = proTrial.isExpired;
            }
            if ((i10 & 4) != 0) {
                subscriptionPeriod = proTrial.subscriptionPeriod;
            }
            return proTrial.copy(str, z10, subscriptionPeriod);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isExpired;
        }

        public final SubscriptionPeriod component3() {
            return this.subscriptionPeriod;
        }

        public final ProTrial copy(String str, boolean z10, SubscriptionPeriod subscriptionPeriod) {
            return new ProTrial(str, z10, subscriptionPeriod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProTrial)) {
                return false;
            }
            ProTrial proTrial = (ProTrial) obj;
            return ju.t.b(this.title, proTrial.title) && this.isExpired == proTrial.isExpired && ju.t.b(this.subscriptionPeriod, proTrial.subscriptionPeriod);
        }

        public final SubscriptionPeriod getSubscriptionPeriod() {
            return this.subscriptionPeriod;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31;
            SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
            return iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0);
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public String toString() {
            return "ProTrial(title=" + this.title + ", isExpired=" + this.isExpired + ", subscriptionPeriod=" + this.subscriptionPeriod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isExpired ? 1 : 0);
            SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
        }
    }

    public static final class Starter extends UserType {
        private final String title;
        public static final Parcelable.Creator<Starter> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Starter createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new Starter(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Starter[] newArray(int i10) {
                return new Starter[i10];
            }
        }

        public Starter(String str) {
            super(null);
            this.title = str;
        }

        public static /* synthetic */ Starter copy$default(Starter starter, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = starter.title;
            }
            return starter.copy(str);
        }

        public final String component1() {
            return this.title;
        }

        public final Starter copy(String str) {
            return new Starter(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Starter) && ju.t.b(this.title, ((Starter) obj).title);
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Starter(title=" + this.title + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
        }
    }

    public static final class TeamMember extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TeamMember> CREATOR = new a();
        private final boolean isTeamExpired;
        private final String teamName;
        private final SubscriptionPeriod teamSubscriptionPeriod;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TeamMember createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new TeamMember(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TeamMember[] newArray(int i10) {
                return new TeamMember[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TeamMember(String str, boolean z10, String str2, SubscriptionPeriod subscriptionPeriod) {
            super(null);
            ju.t.f(str2, "teamName");
            this.title = str;
            this.isTeamExpired = z10;
            this.teamName = str2;
            this.teamSubscriptionPeriod = subscriptionPeriod;
        }

        public static /* synthetic */ TeamMember copy$default(TeamMember teamMember, String str, boolean z10, String str2, SubscriptionPeriod subscriptionPeriod, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = teamMember.title;
            }
            if ((i10 & 2) != 0) {
                z10 = teamMember.isTeamExpired;
            }
            if ((i10 & 4) != 0) {
                str2 = teamMember.teamName;
            }
            if ((i10 & 8) != 0) {
                subscriptionPeriod = teamMember.teamSubscriptionPeriod;
            }
            return teamMember.copy(str, z10, str2, subscriptionPeriod);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isTeamExpired;
        }

        public final String component3() {
            return this.teamName;
        }

        public final SubscriptionPeriod component4() {
            return this.teamSubscriptionPeriod;
        }

        public final TeamMember copy(String str, boolean z10, String str2, SubscriptionPeriod subscriptionPeriod) {
            ju.t.f(str2, "teamName");
            return new TeamMember(str, z10, str2, subscriptionPeriod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TeamMember)) {
                return false;
            }
            TeamMember teamMember = (TeamMember) obj;
            return ju.t.b(this.title, teamMember.title) && this.isTeamExpired == teamMember.isTeamExpired && ju.t.b(this.teamName, teamMember.teamName) && ju.t.b(this.teamSubscriptionPeriod, teamMember.teamSubscriptionPeriod);
        }

        public final String getTeamName() {
            return this.teamName;
        }

        public final SubscriptionPeriod getTeamSubscriptionPeriod() {
            return this.teamSubscriptionPeriod;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isTeamExpired)) * 31) + this.teamName.hashCode()) * 31;
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            return iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0);
        }

        public final boolean isTeamExpired() {
            return this.isTeamExpired;
        }

        public String toString() {
            return "TeamMember(title=" + this.title + ", isTeamExpired=" + this.isTeamExpired + ", teamName=" + this.teamName + ", teamSubscriptionPeriod=" + this.teamSubscriptionPeriod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isTeamExpired ? 1 : 0);
            parcel.writeString(this.teamName);
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
        }
    }

    public static final class TeamOwner extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TeamOwner> CREATOR = new a();
        private final boolean isExpired;
        private final String teamName;
        private final SubscriptionPeriod teamSubscriptionPeriod;
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TeamOwner createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new TeamOwner(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SubscriptionPeriod.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TeamOwner[] newArray(int i10) {
                return new TeamOwner[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TeamOwner(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            super(null);
            ju.t.f(str2, "teamName");
            this.title = str;
            this.isExpired = z10;
            this.teamSubscriptionPeriod = subscriptionPeriod;
            this.teamName = str2;
        }

        public static /* synthetic */ TeamOwner copy$default(TeamOwner teamOwner, String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = teamOwner.title;
            }
            if ((i10 & 2) != 0) {
                z10 = teamOwner.isExpired;
            }
            if ((i10 & 4) != 0) {
                subscriptionPeriod = teamOwner.teamSubscriptionPeriod;
            }
            if ((i10 & 8) != 0) {
                str2 = teamOwner.teamName;
            }
            return teamOwner.copy(str, z10, subscriptionPeriod, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isExpired;
        }

        public final SubscriptionPeriod component3() {
            return this.teamSubscriptionPeriod;
        }

        public final String component4() {
            return this.teamName;
        }

        public final TeamOwner copy(String str, boolean z10, SubscriptionPeriod subscriptionPeriod, String str2) {
            ju.t.f(str2, "teamName");
            return new TeamOwner(str, z10, subscriptionPeriod, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TeamOwner)) {
                return false;
            }
            TeamOwner teamOwner = (TeamOwner) obj;
            return ju.t.b(this.title, teamOwner.title) && this.isExpired == teamOwner.isExpired && ju.t.b(this.teamSubscriptionPeriod, teamOwner.teamSubscriptionPeriod) && ju.t.b(this.teamName, teamOwner.teamName);
        }

        public final String getTeamName() {
            return this.teamName;
        }

        public final SubscriptionPeriod getTeamSubscriptionPeriod() {
            return this.teamSubscriptionPeriod;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31;
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            return ((iHashCode + (subscriptionPeriod != null ? subscriptionPeriod.hashCode() : 0)) * 31) + this.teamName.hashCode();
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public String toString() {
            return "TeamOwner(title=" + this.title + ", isExpired=" + this.isExpired + ", teamSubscriptionPeriod=" + this.teamSubscriptionPeriod + ", teamName=" + this.teamName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.title);
            parcel.writeInt(this.isExpired ? 1 : 0);
            SubscriptionPeriod subscriptionPeriod = this.teamSubscriptionPeriod;
            if (subscriptionPeriod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscriptionPeriod.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.teamName);
        }
    }

    public static final class TrialWithPro extends UserType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TrialWithPro> CREATOR = new a();
        private final Pro proUserType;
        private final BusinessTrialOwner trialUserType;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TrialWithPro createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new TrialWithPro(BusinessTrialOwner.CREATOR.createFromParcel(parcel), Pro.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TrialWithPro[] newArray(int i10) {
                return new TrialWithPro[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrialWithPro(BusinessTrialOwner businessTrialOwner, Pro pro) {
            super(null);
            ju.t.f(businessTrialOwner, "trialUserType");
            ju.t.f(pro, "proUserType");
            this.trialUserType = businessTrialOwner;
            this.proUserType = pro;
        }

        public static /* synthetic */ TrialWithPro copy$default(TrialWithPro trialWithPro, BusinessTrialOwner businessTrialOwner, Pro pro, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                businessTrialOwner = trialWithPro.trialUserType;
            }
            if ((i10 & 2) != 0) {
                pro = trialWithPro.proUserType;
            }
            return trialWithPro.copy(businessTrialOwner, pro);
        }

        public final BusinessTrialOwner component1() {
            return this.trialUserType;
        }

        public final Pro component2() {
            return this.proUserType;
        }

        public final TrialWithPro copy(BusinessTrialOwner businessTrialOwner, Pro pro) {
            ju.t.f(businessTrialOwner, "trialUserType");
            ju.t.f(pro, "proUserType");
            return new TrialWithPro(businessTrialOwner, pro);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrialWithPro)) {
                return false;
            }
            TrialWithPro trialWithPro = (TrialWithPro) obj;
            return ju.t.b(this.trialUserType, trialWithPro.trialUserType) && ju.t.b(this.proUserType, trialWithPro.proUserType);
        }

        public final Pro getProUserType() {
            return this.proUserType;
        }

        public final BusinessTrialOwner getTrialUserType() {
            return this.trialUserType;
        }

        public int hashCode() {
            return (this.trialUserType.hashCode() * 31) + this.proUserType.hashCode();
        }

        public String toString() {
            return "TrialWithPro(trialUserType=" + this.trialUserType + ", proUserType=" + this.proUserType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            this.trialUserType.writeToParcel(parcel, i10);
            this.proUserType.writeToParcel(parcel, i10);
        }
    }

    public static final class Undefined extends UserType {
        public static final Undefined INSTANCE = new Undefined();
        public static final Parcelable.Creator<Undefined> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Undefined createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return Undefined.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Undefined[] newArray(int i10) {
                return new Undefined[i10];
            }
        }

        private Undefined() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Undefined);
        }

        public int hashCode() {
            return 1902380764;
        }

        public String toString() {
            return "Undefined";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ UserType(ju.k kVar) {
        this();
    }

    private UserType() {
    }
}
