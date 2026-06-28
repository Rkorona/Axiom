package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.user.BulkAccountResponse;
import hv.c;
import hv.p;
import iu.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class BulkAccountResponse implements Parcelable {
    private final List<AccessObjectResponse> accessObjects;
    private final AccountResponse account;
    private final EnterpriseResponse enterprise;
    private final PersonalSubscriptionResponse personalSubscription;
    private final TeamResponse team;
    private final TeamSubscriptionResponse teamSubscription;
    private final TrialResponse trial;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BulkAccountResponse> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, null, null, null, null, o.b(r.f82638b, new a() { // from class: gn.a
        @Override // iu.a
        public final Object a() {
            return BulkAccountResponse._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return BulkAccountResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<BulkAccountResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BulkAccountResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            TrialResponse trialResponseCreateFromParcel = parcel.readInt() == 0 ? null : TrialResponse.CREATOR.createFromParcel(parcel);
            PersonalSubscriptionResponse personalSubscriptionResponseCreateFromParcel = parcel.readInt() == 0 ? null : PersonalSubscriptionResponse.CREATOR.createFromParcel(parcel);
            TeamSubscriptionResponse teamSubscriptionResponseCreateFromParcel = parcel.readInt() == 0 ? null : TeamSubscriptionResponse.CREATOR.createFromParcel(parcel);
            AccountResponse accountResponseCreateFromParcel = parcel.readInt() == 0 ? null : AccountResponse.CREATOR.createFromParcel(parcel);
            TeamResponse teamResponseCreateFromParcel = parcel.readInt() == 0 ? null : TeamResponse.CREATOR.createFromParcel(parcel);
            EnterpriseResponse enterpriseResponseCreateFromParcel = parcel.readInt() != 0 ? EnterpriseResponse.CREATOR.createFromParcel(parcel) : null;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(AccessObjectResponse.CREATOR.createFromParcel(parcel));
            }
            return new BulkAccountResponse(trialResponseCreateFromParcel, personalSubscriptionResponseCreateFromParcel, teamSubscriptionResponseCreateFromParcel, accountResponseCreateFromParcel, teamResponseCreateFromParcel, enterpriseResponseCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BulkAccountResponse[] newArray(int i10) {
            return new BulkAccountResponse[i10];
        }
    }

    public /* synthetic */ BulkAccountResponse(int i10, TrialResponse trialResponse, PersonalSubscriptionResponse personalSubscriptionResponse, TeamSubscriptionResponse teamSubscriptionResponse, AccountResponse accountResponse, TeamResponse teamResponse, EnterpriseResponse enterpriseResponse, List list, s2 s2Var) {
        if (64 != (i10 & 64)) {
            d2.a(i10, 64, BulkAccountResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.trial = null;
        } else {
            this.trial = trialResponse;
        }
        if ((i10 & 2) == 0) {
            this.personalSubscription = null;
        } else {
            this.personalSubscription = personalSubscriptionResponse;
        }
        if ((i10 & 4) == 0) {
            this.teamSubscription = null;
        } else {
            this.teamSubscription = teamSubscriptionResponse;
        }
        if ((i10 & 8) == 0) {
            this.account = null;
        } else {
            this.account = accountResponse;
        }
        if ((i10 & 16) == 0) {
            this.team = null;
        } else {
            this.team = teamResponse;
        }
        if ((i10 & 32) == 0) {
            this.enterprise = null;
        } else {
            this.enterprise = enterpriseResponse;
        }
        this.accessObjects = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(AccessObjectResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulkAccountResponse copy$default(BulkAccountResponse bulkAccountResponse, TrialResponse trialResponse, PersonalSubscriptionResponse personalSubscriptionResponse, TeamSubscriptionResponse teamSubscriptionResponse, AccountResponse accountResponse, TeamResponse teamResponse, EnterpriseResponse enterpriseResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            trialResponse = bulkAccountResponse.trial;
        }
        if ((i10 & 2) != 0) {
            personalSubscriptionResponse = bulkAccountResponse.personalSubscription;
        }
        if ((i10 & 4) != 0) {
            teamSubscriptionResponse = bulkAccountResponse.teamSubscription;
        }
        if ((i10 & 8) != 0) {
            accountResponse = bulkAccountResponse.account;
        }
        if ((i10 & 16) != 0) {
            teamResponse = bulkAccountResponse.team;
        }
        if ((i10 & 32) != 0) {
            enterpriseResponse = bulkAccountResponse.enterprise;
        }
        if ((i10 & 64) != 0) {
            list = bulkAccountResponse.accessObjects;
        }
        EnterpriseResponse enterpriseResponse2 = enterpriseResponse;
        List list2 = list;
        TeamResponse teamResponse2 = teamResponse;
        TeamSubscriptionResponse teamSubscriptionResponse2 = teamSubscriptionResponse;
        return bulkAccountResponse.copy(trialResponse, personalSubscriptionResponse, teamSubscriptionResponse2, accountResponse, teamResponse2, enterpriseResponse2, list2);
    }

    @hv.o("access_objects")
    public static /* synthetic */ void getAccessObjects$annotations() {
    }

    @hv.o("account")
    public static /* synthetic */ void getAccount$annotations() {
    }

    @hv.o("enterprise")
    public static /* synthetic */ void getEnterprise$annotations() {
    }

    @hv.o("personal_subscription")
    public static /* synthetic */ void getPersonalSubscription$annotations() {
    }

    @hv.o("team")
    public static /* synthetic */ void getTeam$annotations() {
    }

    @hv.o("team_subscription")
    public static /* synthetic */ void getTeamSubscription$annotations() {
    }

    @hv.o("trial")
    public static /* synthetic */ void getTrial$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(BulkAccountResponse bulkAccountResponse, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || bulkAccountResponse.trial != null) {
            dVar.v(fVar, 0, TrialResponse$$serializer.INSTANCE, bulkAccountResponse.trial);
        }
        if (dVar.E(fVar, 1) || bulkAccountResponse.personalSubscription != null) {
            dVar.v(fVar, 1, PersonalSubscriptionResponse$$serializer.INSTANCE, bulkAccountResponse.personalSubscription);
        }
        if (dVar.E(fVar, 2) || bulkAccountResponse.teamSubscription != null) {
            dVar.v(fVar, 2, TeamSubscriptionResponse$$serializer.INSTANCE, bulkAccountResponse.teamSubscription);
        }
        if (dVar.E(fVar, 3) || bulkAccountResponse.account != null) {
            dVar.v(fVar, 3, AccountResponse$$serializer.INSTANCE, bulkAccountResponse.account);
        }
        if (dVar.E(fVar, 4) || bulkAccountResponse.team != null) {
            dVar.v(fVar, 4, TeamResponse$$serializer.INSTANCE, bulkAccountResponse.team);
        }
        if (dVar.E(fVar, 5) || bulkAccountResponse.enterprise != null) {
            dVar.v(fVar, 5, EnterpriseResponse$$serializer.INSTANCE, bulkAccountResponse.enterprise);
        }
        dVar.o(fVar, 6, (hv.r) nVarArr[6].getValue(), bulkAccountResponse.accessObjects);
    }

    public final TrialResponse component1() {
        return this.trial;
    }

    public final PersonalSubscriptionResponse component2() {
        return this.personalSubscription;
    }

    public final TeamSubscriptionResponse component3() {
        return this.teamSubscription;
    }

    public final AccountResponse component4() {
        return this.account;
    }

    public final TeamResponse component5() {
        return this.team;
    }

    public final EnterpriseResponse component6() {
        return this.enterprise;
    }

    public final List<AccessObjectResponse> component7() {
        return this.accessObjects;
    }

    public final BulkAccountResponse copy(TrialResponse trialResponse, PersonalSubscriptionResponse personalSubscriptionResponse, TeamSubscriptionResponse teamSubscriptionResponse, AccountResponse accountResponse, TeamResponse teamResponse, EnterpriseResponse enterpriseResponse, List<AccessObjectResponse> list) {
        t.f(list, "accessObjects");
        return new BulkAccountResponse(trialResponse, personalSubscriptionResponse, teamSubscriptionResponse, accountResponse, teamResponse, enterpriseResponse, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkAccountResponse)) {
            return false;
        }
        BulkAccountResponse bulkAccountResponse = (BulkAccountResponse) obj;
        return t.b(this.trial, bulkAccountResponse.trial) && t.b(this.personalSubscription, bulkAccountResponse.personalSubscription) && t.b(this.teamSubscription, bulkAccountResponse.teamSubscription) && t.b(this.account, bulkAccountResponse.account) && t.b(this.team, bulkAccountResponse.team) && t.b(this.enterprise, bulkAccountResponse.enterprise) && t.b(this.accessObjects, bulkAccountResponse.accessObjects);
    }

    public final List<AccessObjectResponse> getAccessObjects() {
        return this.accessObjects;
    }

    public final AccountResponse getAccount() {
        return this.account;
    }

    public final EnterpriseResponse getEnterprise() {
        return this.enterprise;
    }

    public final PersonalSubscriptionResponse getPersonalSubscription() {
        return this.personalSubscription;
    }

    public final TeamResponse getTeam() {
        return this.team;
    }

    public final TeamSubscriptionResponse getTeamSubscription() {
        return this.teamSubscription;
    }

    public final TrialResponse getTrial() {
        return this.trial;
    }

    public int hashCode() {
        TrialResponse trialResponse = this.trial;
        int iHashCode = (trialResponse == null ? 0 : trialResponse.hashCode()) * 31;
        PersonalSubscriptionResponse personalSubscriptionResponse = this.personalSubscription;
        int iHashCode2 = (iHashCode + (personalSubscriptionResponse == null ? 0 : personalSubscriptionResponse.hashCode())) * 31;
        TeamSubscriptionResponse teamSubscriptionResponse = this.teamSubscription;
        int iHashCode3 = (iHashCode2 + (teamSubscriptionResponse == null ? 0 : teamSubscriptionResponse.hashCode())) * 31;
        AccountResponse accountResponse = this.account;
        int iHashCode4 = (iHashCode3 + (accountResponse == null ? 0 : accountResponse.hashCode())) * 31;
        TeamResponse teamResponse = this.team;
        int iHashCode5 = (iHashCode4 + (teamResponse == null ? 0 : teamResponse.hashCode())) * 31;
        EnterpriseResponse enterpriseResponse = this.enterprise;
        return ((iHashCode5 + (enterpriseResponse != null ? enterpriseResponse.hashCode() : 0)) * 31) + this.accessObjects.hashCode();
    }

    public String toString() {
        return "BulkAccountResponse(trial=" + this.trial + ", personalSubscription=" + this.personalSubscription + ", teamSubscription=" + this.teamSubscription + ", account=" + this.account + ", team=" + this.team + ", enterprise=" + this.enterprise + ", accessObjects=" + this.accessObjects + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        TrialResponse trialResponse = this.trial;
        if (trialResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trialResponse.writeToParcel(parcel, i10);
        }
        PersonalSubscriptionResponse personalSubscriptionResponse = this.personalSubscription;
        if (personalSubscriptionResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            personalSubscriptionResponse.writeToParcel(parcel, i10);
        }
        TeamSubscriptionResponse teamSubscriptionResponse = this.teamSubscription;
        if (teamSubscriptionResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            teamSubscriptionResponse.writeToParcel(parcel, i10);
        }
        AccountResponse accountResponse = this.account;
        if (accountResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountResponse.writeToParcel(parcel, i10);
        }
        TeamResponse teamResponse = this.team;
        if (teamResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            teamResponse.writeToParcel(parcel, i10);
        }
        EnterpriseResponse enterpriseResponse = this.enterprise;
        if (enterpriseResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            enterpriseResponse.writeToParcel(parcel, i10);
        }
        List<AccessObjectResponse> list = this.accessObjects;
        parcel.writeInt(list.size());
        Iterator<AccessObjectResponse> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i10);
        }
    }

    public BulkAccountResponse(TrialResponse trialResponse, PersonalSubscriptionResponse personalSubscriptionResponse, TeamSubscriptionResponse teamSubscriptionResponse, AccountResponse accountResponse, TeamResponse teamResponse, EnterpriseResponse enterpriseResponse, List<AccessObjectResponse> list) {
        t.f(list, "accessObjects");
        this.trial = trialResponse;
        this.personalSubscription = personalSubscriptionResponse;
        this.teamSubscription = teamSubscriptionResponse;
        this.account = accountResponse;
        this.team = teamResponse;
        this.enterprise = enterpriseResponse;
        this.accessObjects = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BulkAccountResponse(TrialResponse trialResponse, PersonalSubscriptionResponse personalSubscriptionResponse, TeamSubscriptionResponse teamSubscriptionResponse, AccountResponse accountResponse, TeamResponse teamResponse, EnterpriseResponse enterpriseResponse, List list, int i10, k kVar) {
        List list2;
        EnterpriseResponse enterpriseResponse2;
        trialResponse = (i10 & 1) != 0 ? null : trialResponse;
        personalSubscriptionResponse = (i10 & 2) != 0 ? null : personalSubscriptionResponse;
        teamSubscriptionResponse = (i10 & 4) != 0 ? null : teamSubscriptionResponse;
        accountResponse = (i10 & 8) != 0 ? null : accountResponse;
        teamResponse = (i10 & 16) != 0 ? null : teamResponse;
        if ((i10 & 32) != 0) {
            list2 = list;
            enterpriseResponse2 = null;
        } else {
            list2 = list;
            enterpriseResponse2 = enterpriseResponse;
        }
        this(trialResponse, personalSubscriptionResponse, teamSubscriptionResponse, accountResponse, teamResponse, enterpriseResponse2, list2);
    }
}
