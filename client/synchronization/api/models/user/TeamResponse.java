package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.user.TeamResponse;
import hv.c;
import hv.p;
import iu.a;
import java.util.ArrayList;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TeamResponse implements Parcelable {
    private final String encryptionSchema;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f39071id;
    private final boolean isOwner;
    private final int membersCount;
    private final String name;
    private final String owner;
    private final String ownerFullName;
    private final int ownerId;
    private final String ownerLatestActivity;
    private final String pendingAction;
    private final int slotsCount;
    private final List<String> teamPermissions;
    private final boolean twoFactorAuth;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TeamResponse> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, o.b(r.f82638b, new a() { // from class: gn.h
        @Override // iu.a
        public final Object a() {
            return TeamResponse._childSerializers$_anonymous_();
        }
    }), null};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<TeamResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeamResponse createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            t.f(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            String string3 = parcel.readString();
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z12 = true;
                z11 = true;
            } else {
                z10 = false;
                z11 = true;
            }
            String string4 = parcel.readString();
            boolean z13 = z11;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            boolean z14 = z13;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                z14 = z10;
            }
            return new TeamResponse(i10, string, string2, i11, string3, z12, string4, i12, i13, string5, z14, parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeamResponse[] newArray(int i10) {
            return new TeamResponse[i10];
        }
    }

    public /* synthetic */ TeamResponse(int i10, int i11, String str, String str2, int i12, String str3, boolean z10, String str4, int i13, int i14, String str5, boolean z11, List list, String str6, s2 s2Var) {
        if (1967 != (i10 & 1967)) {
            d2.a(i10, 1967, TeamResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f39071id = i11;
        this.owner = str;
        this.ownerFullName = str2;
        this.ownerId = i12;
        if ((i10 & 16) == 0) {
            this.ownerLatestActivity = null;
        } else {
            this.ownerLatestActivity = str3;
        }
        this.isOwner = z10;
        if ((i10 & 64) == 0) {
            this.pendingAction = null;
        } else {
            this.pendingAction = str4;
        }
        this.membersCount = i13;
        this.slotsCount = i14;
        this.name = str5;
        this.twoFactorAuth = z11;
        if ((i10 & 2048) == 0) {
            this.teamPermissions = new ArrayList();
        } else {
            this.teamPermissions = list;
        }
        this.encryptionSchema = (i10 & 4096) == 0 ? "v3" : str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamResponse copy$default(TeamResponse teamResponse, int i10, String str, String str2, int i11, String str3, boolean z10, String str4, int i12, int i13, String str5, boolean z11, List list, String str6, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = teamResponse.f39071id;
        }
        return teamResponse.copy(i10, (i14 & 2) != 0 ? teamResponse.owner : str, (i14 & 4) != 0 ? teamResponse.ownerFullName : str2, (i14 & 8) != 0 ? teamResponse.ownerId : i11, (i14 & 16) != 0 ? teamResponse.ownerLatestActivity : str3, (i14 & 32) != 0 ? teamResponse.isOwner : z10, (i14 & 64) != 0 ? teamResponse.pendingAction : str4, (i14 & 128) != 0 ? teamResponse.membersCount : i12, (i14 & 256) != 0 ? teamResponse.slotsCount : i13, (i14 & File.FLAG_O_TRUNC) != 0 ? teamResponse.name : str5, (i14 & File.FLAG_O_APPEND) != 0 ? teamResponse.twoFactorAuth : z11, (i14 & 2048) != 0 ? teamResponse.teamPermissions : list, (i14 & 4096) != 0 ? teamResponse.encryptionSchema : str6);
    }

    @hv.o("encryption_schema")
    public static /* synthetic */ void getEncryptionSchema$annotations() {
    }

    @hv.o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @hv.o("members_count")
    public static /* synthetic */ void getMembersCount$annotations() {
    }

    @hv.o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    @hv.o("owner")
    public static /* synthetic */ void getOwner$annotations() {
    }

    @hv.o("owner_name")
    public static /* synthetic */ void getOwnerFullName$annotations() {
    }

    @hv.o("owner_id")
    public static /* synthetic */ void getOwnerId$annotations() {
    }

    @hv.o("owner_latest_activity")
    public static /* synthetic */ void getOwnerLatestActivity$annotations() {
    }

    @hv.o("pending_action")
    public static /* synthetic */ void getPendingAction$annotations() {
    }

    @hv.o("slots_count")
    public static /* synthetic */ void getSlotsCount$annotations() {
    }

    @hv.o("team_permissions")
    public static /* synthetic */ void getTeamPermissions$annotations() {
    }

    @hv.o("two_factor_auth")
    public static /* synthetic */ void getTwoFactorAuth$annotations() {
    }

    @hv.o("is_owner")
    public static /* synthetic */ void isOwner$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamResponse teamResponse, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.t(fVar, 0, teamResponse.f39071id);
        dVar.f(fVar, 1, teamResponse.owner);
        x2 x2Var = x2.f64817a;
        dVar.v(fVar, 2, x2Var, teamResponse.ownerFullName);
        dVar.t(fVar, 3, teamResponse.ownerId);
        if (dVar.E(fVar, 4) || teamResponse.ownerLatestActivity != null) {
            dVar.v(fVar, 4, x2Var, teamResponse.ownerLatestActivity);
        }
        dVar.u(fVar, 5, teamResponse.isOwner);
        if (dVar.E(fVar, 6) || teamResponse.pendingAction != null) {
            dVar.v(fVar, 6, x2Var, teamResponse.pendingAction);
        }
        dVar.t(fVar, 7, teamResponse.membersCount);
        dVar.t(fVar, 8, teamResponse.slotsCount);
        dVar.f(fVar, 9, teamResponse.name);
        dVar.u(fVar, 10, teamResponse.twoFactorAuth);
        if (dVar.E(fVar, 11) || !t.b(teamResponse.teamPermissions, new ArrayList())) {
            dVar.o(fVar, 11, (hv.r) nVarArr[11].getValue(), teamResponse.teamPermissions);
        }
        if (!dVar.E(fVar, 12) && t.b(teamResponse.encryptionSchema, "v3")) {
            return;
        }
        dVar.f(fVar, 12, teamResponse.encryptionSchema);
    }

    public final int component1() {
        return this.f39071id;
    }

    public final String component10() {
        return this.name;
    }

    public final boolean component11() {
        return this.twoFactorAuth;
    }

    public final List<String> component12() {
        return this.teamPermissions;
    }

    public final String component13() {
        return this.encryptionSchema;
    }

    public final String component2() {
        return this.owner;
    }

    public final String component3() {
        return this.ownerFullName;
    }

    public final int component4() {
        return this.ownerId;
    }

    public final String component5() {
        return this.ownerLatestActivity;
    }

    public final boolean component6() {
        return this.isOwner;
    }

    public final String component7() {
        return this.pendingAction;
    }

    public final int component8() {
        return this.membersCount;
    }

    public final int component9() {
        return this.slotsCount;
    }

    public final TeamResponse copy(int i10, String str, String str2, int i11, String str3, boolean z10, String str4, int i12, int i13, String str5, boolean z11, List<String> list, String str6) {
        t.f(str, "owner");
        t.f(str5, Column.MULTI_KEY_NAME);
        t.f(list, "teamPermissions");
        t.f(str6, "encryptionSchema");
        return new TeamResponse(i10, str, str2, i11, str3, z10, str4, i12, i13, str5, z11, list, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamResponse)) {
            return false;
        }
        TeamResponse teamResponse = (TeamResponse) obj;
        return this.f39071id == teamResponse.f39071id && t.b(this.owner, teamResponse.owner) && t.b(this.ownerFullName, teamResponse.ownerFullName) && this.ownerId == teamResponse.ownerId && t.b(this.ownerLatestActivity, teamResponse.ownerLatestActivity) && this.isOwner == teamResponse.isOwner && t.b(this.pendingAction, teamResponse.pendingAction) && this.membersCount == teamResponse.membersCount && this.slotsCount == teamResponse.slotsCount && t.b(this.name, teamResponse.name) && this.twoFactorAuth == teamResponse.twoFactorAuth && t.b(this.teamPermissions, teamResponse.teamPermissions) && t.b(this.encryptionSchema, teamResponse.encryptionSchema);
    }

    public final String getEncryptionSchema() {
        return this.encryptionSchema;
    }

    public final int getId() {
        return this.f39071id;
    }

    public final int getMembersCount() {
        return this.membersCount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getOwnerFullName() {
        return this.ownerFullName;
    }

    public final int getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerLatestActivity() {
        return this.ownerLatestActivity;
    }

    public final String getPendingAction() {
        return this.pendingAction;
    }

    public final int getSlotsCount() {
        return this.slotsCount;
    }

    public final List<String> getTeamPermissions() {
        return this.teamPermissions;
    }

    public final boolean getTwoFactorAuth() {
        return this.twoFactorAuth;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f39071id) * 31) + this.owner.hashCode()) * 31;
        String str = this.ownerFullName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.ownerId)) * 31;
        String str2 = this.ownerLatestActivity;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isOwner)) * 31;
        String str3 = this.pendingAction;
        return ((((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.membersCount)) * 31) + Integer.hashCode(this.slotsCount)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.twoFactorAuth)) * 31) + this.teamPermissions.hashCode()) * 31) + this.encryptionSchema.hashCode();
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    public String toString() {
        return "TeamResponse(id=" + this.f39071id + ", owner=" + this.owner + ", ownerFullName=" + this.ownerFullName + ", ownerId=" + this.ownerId + ", ownerLatestActivity=" + this.ownerLatestActivity + ", isOwner=" + this.isOwner + ", pendingAction=" + this.pendingAction + ", membersCount=" + this.membersCount + ", slotsCount=" + this.slotsCount + ", name=" + this.name + ", twoFactorAuth=" + this.twoFactorAuth + ", teamPermissions=" + this.teamPermissions + ", encryptionSchema=" + this.encryptionSchema + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeInt(this.f39071id);
        parcel.writeString(this.owner);
        parcel.writeString(this.ownerFullName);
        parcel.writeInt(this.ownerId);
        parcel.writeString(this.ownerLatestActivity);
        parcel.writeInt(this.isOwner ? 1 : 0);
        parcel.writeString(this.pendingAction);
        parcel.writeInt(this.membersCount);
        parcel.writeInt(this.slotsCount);
        parcel.writeString(this.name);
        parcel.writeInt(this.twoFactorAuth ? 1 : 0);
        parcel.writeStringList(this.teamPermissions);
        parcel.writeString(this.encryptionSchema);
    }

    public TeamResponse(int i10, String str, String str2, int i11, String str3, boolean z10, String str4, int i12, int i13, String str5, boolean z11, List<String> list, String str6) {
        t.f(str, "owner");
        t.f(str5, Column.MULTI_KEY_NAME);
        t.f(list, "teamPermissions");
        t.f(str6, "encryptionSchema");
        this.f39071id = i10;
        this.owner = str;
        this.ownerFullName = str2;
        this.ownerId = i11;
        this.ownerLatestActivity = str3;
        this.isOwner = z10;
        this.pendingAction = str4;
        this.membersCount = i12;
        this.slotsCount = i13;
        this.name = str5;
        this.twoFactorAuth = z11;
        this.teamPermissions = list;
        this.encryptionSchema = str6;
    }

    public /* synthetic */ TeamResponse(int i10, String str, String str2, int i11, String str3, boolean z10, String str4, int i12, int i13, String str5, boolean z11, List list, String str6, int i14, k kVar) {
        this(i10, str, str2, i11, (i14 & 16) != 0 ? null : str3, z10, (i14 & 64) != 0 ? null : str4, i12, i13, str5, z11, (i14 & 2048) != 0 ? new ArrayList() : list, (i14 & 4096) != 0 ? "v3" : str6);
    }
}
