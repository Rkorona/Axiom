package com.server.auditor.ssh.client.models.teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamMemberInvitation implements Parcelable {
    private String email;
    private TeamMemberRole role;
    public static final Parcelable.Creator<TeamMemberInvitation> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeamMemberInvitation createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new TeamMemberInvitation(parcel.readString(), TeamMemberRole.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TeamMemberInvitation[] newArray(int i10) {
            return new TeamMemberInvitation[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TeamMemberInvitation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TeamMemberInvitation copy$default(TeamMemberInvitation teamMemberInvitation, String str, TeamMemberRole teamMemberRole, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = teamMemberInvitation.email;
        }
        if ((i10 & 2) != 0) {
            teamMemberRole = teamMemberInvitation.role;
        }
        return teamMemberInvitation.copy(str, teamMemberRole);
    }

    public final String component1() {
        return this.email;
    }

    public final TeamMemberRole component2() {
        return this.role;
    }

    public final TeamMemberInvitation copy(String str, TeamMemberRole teamMemberRole) {
        t.f(str, "email");
        t.f(teamMemberRole, "role");
        return new TeamMemberInvitation(str, teamMemberRole);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamMemberInvitation)) {
            return false;
        }
        TeamMemberInvitation teamMemberInvitation = (TeamMemberInvitation) obj;
        return t.b(this.email, teamMemberInvitation.email) && this.role == teamMemberInvitation.role;
    }

    public final String getEmail() {
        return this.email;
    }

    public final TeamMemberRole getRole() {
        return this.role;
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + this.role.hashCode();
    }

    public final void setEmail(String str) {
        t.f(str, "<set-?>");
        this.email = str;
    }

    public final void setRole(TeamMemberRole teamMemberRole) {
        t.f(teamMemberRole, "<set-?>");
        this.role = teamMemberRole;
    }

    public String toString() {
        return "TeamMemberInvitation(email=" + this.email + ", role=" + this.role + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.email);
        parcel.writeString(this.role.name());
    }

    public TeamMemberInvitation(String str, TeamMemberRole teamMemberRole) {
        t.f(str, "email");
        t.f(teamMemberRole, "role");
        this.email = str;
        this.role = teamMemberRole;
    }

    public /* synthetic */ TeamMemberInvitation(String str, TeamMemberRole teamMemberRole, int i10, k kVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? TeamMemberRole.EDITOR : teamMemberRole);
    }
}
