package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.SetupTeamVaultCredentialsModeScreenArgs;
import com.server.auditor.ssh.client.fragments.SetupTeamVaultOnboardingScreenArgs;
import com.server.auditor.ssh.client.fragments.premium.GracePeriodScreenArgs;
import com.server.auditor.ssh.client.fragments.team.TeamPresenceInviteColleaguesScreenArgs;
import com.server.auditor.ssh.client.models.GracePeriodSubscription;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigationPopUpWhenLargeActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28304b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28305c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ut.n f28306a = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.v1
        @Override // iu.a
        public final Object a() {
            return NavigationPopUpWhenLargeActivity.j0(this.f35086a);
        }
    });

    public static abstract class NavigationDestination implements Parcelable {
        public static final int $stable = 0;

        public static final class AccountLogoutFlow extends NavigationDestination {
            public static final AccountLogoutFlow INSTANCE = new AccountLogoutFlow();
            public static final Parcelable.Creator<AccountLogoutFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AccountLogoutFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return AccountLogoutFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final AccountLogoutFlow[] newArray(int i10) {
                    return new AccountLogoutFlow[i10];
                }
            }

            private AccountLogoutFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AccountLogoutFlow);
            }

            public int hashCode() {
                return 990558790;
            }

            public String toString() {
                return "AccountLogoutFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class BusinessVaultsPromoFlow extends NavigationDestination {
            public static final BusinessVaultsPromoFlow INSTANCE = new BusinessVaultsPromoFlow();
            public static final Parcelable.Creator<BusinessVaultsPromoFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final BusinessVaultsPromoFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return BusinessVaultsPromoFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final BusinessVaultsPromoFlow[] newArray(int i10) {
                    return new BusinessVaultsPromoFlow[i10];
                }
            }

            private BusinessVaultsPromoFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof BusinessVaultsPromoFlow);
            }

            public int hashCode() {
                return -218279651;
            }

            public String toString() {
                return "BusinessVaultsPromoFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class ChangeEmailFlow extends NavigationDestination {
            public static final ChangeEmailFlow INSTANCE = new ChangeEmailFlow();
            public static final Parcelable.Creator<ChangeEmailFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ChangeEmailFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return ChangeEmailFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ChangeEmailFlow[] newArray(int i10) {
                    return new ChangeEmailFlow[i10];
                }
            }

            private ChangeEmailFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ChangeEmailFlow);
            }

            public int hashCode() {
                return 1663867835;
            }

            public String toString() {
                return "ChangeEmailFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class ChangePasswordFlow extends NavigationDestination {
            public static final ChangePasswordFlow INSTANCE = new ChangePasswordFlow();
            public static final Parcelable.Creator<ChangePasswordFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ChangePasswordFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return ChangePasswordFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ChangePasswordFlow[] newArray(int i10) {
                    return new ChangePasswordFlow[i10];
                }
            }

            private ChangePasswordFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ChangePasswordFlow);
            }

            public int hashCode() {
                return 1324901368;
            }

            public String toString() {
                return "ChangePasswordFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class FreeOpenAiPromoFlow extends NavigationDestination {
            public static final FreeOpenAiPromoFlow INSTANCE = new FreeOpenAiPromoFlow();
            public static final Parcelable.Creator<FreeOpenAiPromoFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FreeOpenAiPromoFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return FreeOpenAiPromoFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final FreeOpenAiPromoFlow[] newArray(int i10) {
                    return new FreeOpenAiPromoFlow[i10];
                }
            }

            private FreeOpenAiPromoFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof FreeOpenAiPromoFlow);
            }

            public int hashCode() {
                return -1399977728;
            }

            public String toString() {
                return "FreeOpenAiPromoFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class GracePeriodFlow extends NavigationDestination {
            private final GracePeriodSubscription gracePeriodSubscription;
            public static final Parcelable.Creator<GracePeriodFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final GracePeriodFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    return new GracePeriodFlow((GracePeriodSubscription) parcel.readParcelable(GracePeriodFlow.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final GracePeriodFlow[] newArray(int i10) {
                    return new GracePeriodFlow[i10];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GracePeriodFlow(GracePeriodSubscription gracePeriodSubscription) {
                super(null);
                ju.t.f(gracePeriodSubscription, "gracePeriodSubscription");
                this.gracePeriodSubscription = gracePeriodSubscription;
            }

            public static /* synthetic */ GracePeriodFlow copy$default(GracePeriodFlow gracePeriodFlow, GracePeriodSubscription gracePeriodSubscription, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    gracePeriodSubscription = gracePeriodFlow.gracePeriodSubscription;
                }
                return gracePeriodFlow.copy(gracePeriodSubscription);
            }

            public final GracePeriodSubscription component1() {
                return this.gracePeriodSubscription;
            }

            public final GracePeriodFlow copy(GracePeriodSubscription gracePeriodSubscription) {
                ju.t.f(gracePeriodSubscription, "gracePeriodSubscription");
                return new GracePeriodFlow(gracePeriodSubscription);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GracePeriodFlow) && ju.t.b(this.gracePeriodSubscription, ((GracePeriodFlow) obj).gracePeriodSubscription);
            }

            public final GracePeriodSubscription getGracePeriodSubscription() {
                return this.gracePeriodSubscription;
            }

            public int hashCode() {
                return this.gracePeriodSubscription.hashCode();
            }

            public String toString() {
                return "GracePeriodFlow(gracePeriodSubscription=" + this.gracePeriodSubscription + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeParcelable(this.gracePeriodSubscription, i10);
            }
        }

        public static final class MultikeyPromotionFlow extends NavigationDestination {
            public static final MultikeyPromotionFlow INSTANCE = new MultikeyPromotionFlow();
            public static final Parcelable.Creator<MultikeyPromotionFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final MultikeyPromotionFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return MultikeyPromotionFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final MultikeyPromotionFlow[] newArray(int i10) {
                    return new MultikeyPromotionFlow[i10];
                }
            }

            private MultikeyPromotionFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof MultikeyPromotionFlow);
            }

            public int hashCode() {
                return -749115028;
            }

            public String toString() {
                return "MultikeyPromotionFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class SetupTeamVaultFlow extends NavigationDestination {
            private final SetupTeamVaultFlowStartDestination startDestination;
            public static final Parcelable.Creator<SetupTeamVaultFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SetupTeamVaultFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    return new SetupTeamVaultFlow((SetupTeamVaultFlowStartDestination) parcel.readParcelable(SetupTeamVaultFlow.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SetupTeamVaultFlow[] newArray(int i10) {
                    return new SetupTeamVaultFlow[i10];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupTeamVaultFlow(SetupTeamVaultFlowStartDestination setupTeamVaultFlowStartDestination) {
                super(null);
                ju.t.f(setupTeamVaultFlowStartDestination, "startDestination");
                this.startDestination = setupTeamVaultFlowStartDestination;
            }

            public static /* synthetic */ SetupTeamVaultFlow copy$default(SetupTeamVaultFlow setupTeamVaultFlow, SetupTeamVaultFlowStartDestination setupTeamVaultFlowStartDestination, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    setupTeamVaultFlowStartDestination = setupTeamVaultFlow.startDestination;
                }
                return setupTeamVaultFlow.copy(setupTeamVaultFlowStartDestination);
            }

            public final SetupTeamVaultFlowStartDestination component1() {
                return this.startDestination;
            }

            public final SetupTeamVaultFlow copy(SetupTeamVaultFlowStartDestination setupTeamVaultFlowStartDestination) {
                ju.t.f(setupTeamVaultFlowStartDestination, "startDestination");
                return new SetupTeamVaultFlow(setupTeamVaultFlowStartDestination);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetupTeamVaultFlow) && ju.t.b(this.startDestination, ((SetupTeamVaultFlow) obj).startDestination);
            }

            public final SetupTeamVaultFlowStartDestination getStartDestination() {
                return this.startDestination;
            }

            public int hashCode() {
                return this.startDestination.hashCode();
            }

            public String toString() {
                return "SetupTeamVaultFlow(startDestination=" + this.startDestination + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeParcelable(this.startDestination, i10);
            }
        }

        public static final class TeamPresenceFlow extends NavigationDestination {
            public static final int $stable = 0;
            public static final Parcelable.Creator<TeamPresenceFlow> CREATOR = new a();
            private final TeamPresenceFlowStartDestination startDestination;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final TeamPresenceFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    return new TeamPresenceFlow((TeamPresenceFlowStartDestination) parcel.readParcelable(TeamPresenceFlow.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final TeamPresenceFlow[] newArray(int i10) {
                    return new TeamPresenceFlow[i10];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TeamPresenceFlow(TeamPresenceFlowStartDestination teamPresenceFlowStartDestination) {
                super(null);
                ju.t.f(teamPresenceFlowStartDestination, "startDestination");
                this.startDestination = teamPresenceFlowStartDestination;
            }

            public static /* synthetic */ TeamPresenceFlow copy$default(TeamPresenceFlow teamPresenceFlow, TeamPresenceFlowStartDestination teamPresenceFlowStartDestination, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    teamPresenceFlowStartDestination = teamPresenceFlow.startDestination;
                }
                return teamPresenceFlow.copy(teamPresenceFlowStartDestination);
            }

            public final TeamPresenceFlowStartDestination component1() {
                return this.startDestination;
            }

            public final TeamPresenceFlow copy(TeamPresenceFlowStartDestination teamPresenceFlowStartDestination) {
                ju.t.f(teamPresenceFlowStartDestination, "startDestination");
                return new TeamPresenceFlow(teamPresenceFlowStartDestination);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TeamPresenceFlow) && ju.t.b(this.startDestination, ((TeamPresenceFlow) obj).startDestination);
            }

            public final TeamPresenceFlowStartDestination getStartDestination() {
                return this.startDestination;
            }

            public int hashCode() {
                return this.startDestination.hashCode();
            }

            public String toString() {
                return "TeamPresenceFlow(startDestination=" + this.startDestination + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeParcelable(this.startDestination, i10);
            }
        }

        public /* synthetic */ NavigationDestination(ju.k kVar) {
            this();
        }

        private NavigationDestination() {
        }
    }

    public static abstract class SetupTeamVaultFlowStartDestination implements Parcelable {
        public static final int $stable = 0;

        public static final class CredentialsMode extends SetupTeamVaultFlowStartDestination {
            private final String analyticsFunnelId;
            private final String callerFeature;
            private final int invitedColleaguesCount;
            private final List<TypedEntityIdentifier> typedEntityToShareIdentifiers;
            public static final Parcelable.Creator<CredentialsMode> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CredentialsMode createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    int i10 = parcel.readInt();
                    int i11 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(parcel.readParcelable(CredentialsMode.class.getClassLoader()));
                    }
                    return new CredentialsMode(i10, arrayList, parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CredentialsMode[] newArray(int i10) {
                    return new CredentialsMode[i10];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CredentialsMode(int i10, List<TypedEntityIdentifier> list, String str, String str2) {
                super(null);
                ju.t.f(list, "typedEntityToShareIdentifiers");
                ju.t.f(str2, "analyticsFunnelId");
                this.invitedColleaguesCount = i10;
                this.typedEntityToShareIdentifiers = list;
                this.callerFeature = str;
                this.analyticsFunnelId = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CredentialsMode copy$default(CredentialsMode credentialsMode, int i10, List list, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = credentialsMode.invitedColleaguesCount;
                }
                if ((i11 & 2) != 0) {
                    list = credentialsMode.typedEntityToShareIdentifiers;
                }
                if ((i11 & 4) != 0) {
                    str = credentialsMode.callerFeature;
                }
                if ((i11 & 8) != 0) {
                    str2 = credentialsMode.analyticsFunnelId;
                }
                return credentialsMode.copy(i10, list, str, str2);
            }

            public final int component1() {
                return this.invitedColleaguesCount;
            }

            public final List<TypedEntityIdentifier> component2() {
                return this.typedEntityToShareIdentifiers;
            }

            public final String component3() {
                return this.callerFeature;
            }

            public final String component4() {
                return this.analyticsFunnelId;
            }

            public final CredentialsMode copy(int i10, List<TypedEntityIdentifier> list, String str, String str2) {
                ju.t.f(list, "typedEntityToShareIdentifiers");
                ju.t.f(str2, "analyticsFunnelId");
                return new CredentialsMode(i10, list, str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CredentialsMode)) {
                    return false;
                }
                CredentialsMode credentialsMode = (CredentialsMode) obj;
                return this.invitedColleaguesCount == credentialsMode.invitedColleaguesCount && ju.t.b(this.typedEntityToShareIdentifiers, credentialsMode.typedEntityToShareIdentifiers) && ju.t.b(this.callerFeature, credentialsMode.callerFeature) && ju.t.b(this.analyticsFunnelId, credentialsMode.analyticsFunnelId);
            }

            public final String getAnalyticsFunnelId() {
                return this.analyticsFunnelId;
            }

            public final String getCallerFeature() {
                return this.callerFeature;
            }

            public final int getInvitedColleaguesCount() {
                return this.invitedColleaguesCount;
            }

            public final List<TypedEntityIdentifier> getTypedEntityToShareIdentifiers() {
                return this.typedEntityToShareIdentifiers;
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.invitedColleaguesCount) * 31) + this.typedEntityToShareIdentifiers.hashCode()) * 31;
                String str = this.callerFeature;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.analyticsFunnelId.hashCode();
            }

            public String toString() {
                return "CredentialsMode(invitedColleaguesCount=" + this.invitedColleaguesCount + ", typedEntityToShareIdentifiers=" + this.typedEntityToShareIdentifiers + ", callerFeature=" + this.callerFeature + ", analyticsFunnelId=" + this.analyticsFunnelId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(this.invitedColleaguesCount);
                List<TypedEntityIdentifier> list = this.typedEntityToShareIdentifiers;
                parcel.writeInt(list.size());
                Iterator<TypedEntityIdentifier> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeParcelable(it.next(), i10);
                }
                parcel.writeString(this.callerFeature);
                parcel.writeString(this.analyticsFunnelId);
            }
        }

        public static final class Onboarding extends SetupTeamVaultFlowStartDestination {
            private final String analyticsFunnelId;
            private final List<TypedEntityIdentifier> typedEntityToShareIdentifiers;
            public static final Parcelable.Creator<Onboarding> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Onboarding createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    int i10 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList.add(parcel.readParcelable(Onboarding.class.getClassLoader()));
                    }
                    return new Onboarding(arrayList, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Onboarding[] newArray(int i10) {
                    return new Onboarding[i10];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Onboarding(List<TypedEntityIdentifier> list, String str) {
                super(null);
                ju.t.f(list, "typedEntityToShareIdentifiers");
                ju.t.f(str, "analyticsFunnelId");
                this.typedEntityToShareIdentifiers = list;
                this.analyticsFunnelId = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, List list, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = onboarding.typedEntityToShareIdentifiers;
                }
                if ((i10 & 2) != 0) {
                    str = onboarding.analyticsFunnelId;
                }
                return onboarding.copy(list, str);
            }

            public final List<TypedEntityIdentifier> component1() {
                return this.typedEntityToShareIdentifiers;
            }

            public final String component2() {
                return this.analyticsFunnelId;
            }

            public final Onboarding copy(List<TypedEntityIdentifier> list, String str) {
                ju.t.f(list, "typedEntityToShareIdentifiers");
                ju.t.f(str, "analyticsFunnelId");
                return new Onboarding(list, str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Onboarding)) {
                    return false;
                }
                Onboarding onboarding = (Onboarding) obj;
                return ju.t.b(this.typedEntityToShareIdentifiers, onboarding.typedEntityToShareIdentifiers) && ju.t.b(this.analyticsFunnelId, onboarding.analyticsFunnelId);
            }

            public final String getAnalyticsFunnelId() {
                return this.analyticsFunnelId;
            }

            public final List<TypedEntityIdentifier> getTypedEntityToShareIdentifiers() {
                return this.typedEntityToShareIdentifiers;
            }

            public int hashCode() {
                return (this.typedEntityToShareIdentifiers.hashCode() * 31) + this.analyticsFunnelId.hashCode();
            }

            public String toString() {
                return "Onboarding(typedEntityToShareIdentifiers=" + this.typedEntityToShareIdentifiers + ", analyticsFunnelId=" + this.analyticsFunnelId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                List<TypedEntityIdentifier> list = this.typedEntityToShareIdentifiers;
                parcel.writeInt(list.size());
                Iterator<TypedEntityIdentifier> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeParcelable(it.next(), i10);
                }
                parcel.writeString(this.analyticsFunnelId);
            }
        }

        public /* synthetic */ SetupTeamVaultFlowStartDestination(ju.k kVar) {
            this();
        }

        private SetupTeamVaultFlowStartDestination() {
        }
    }

    public interface TeamPresenceFlowStartDestination extends Parcelable {

        public static final class Default implements TeamPresenceFlowStartDestination {
            public static final Default INSTANCE = new Default();
            public static final Parcelable.Creator<Default> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Default createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return Default.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Default[] newArray(int i10) {
                    return new Default[i10];
                }
            }

            private Default() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Default);
            }

            public int hashCode() {
                return -1857501456;
            }

            public String toString() {
                return VariablesConverter.CLIENT_COLOR_SCHEME_DEFAULT;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class InviteMembers implements TeamPresenceFlowStartDestination {
            private final boolean isNeedShowTeamVaultPromotion;
            public static final Parcelable.Creator<InviteMembers> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InviteMembers createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    return new InviteMembers(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final InviteMembers[] newArray(int i10) {
                    return new InviteMembers[i10];
                }
            }

            public InviteMembers(boolean z10) {
                this.isNeedShowTeamVaultPromotion = z10;
            }

            public static /* synthetic */ InviteMembers copy$default(InviteMembers inviteMembers, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = inviteMembers.isNeedShowTeamVaultPromotion;
                }
                return inviteMembers.copy(z10);
            }

            public final boolean component1() {
                return this.isNeedShowTeamVaultPromotion;
            }

            public final InviteMembers copy(boolean z10) {
                return new InviteMembers(z10);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InviteMembers) && this.isNeedShowTeamVaultPromotion == ((InviteMembers) obj).isNeedShowTeamVaultPromotion;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isNeedShowTeamVaultPromotion);
            }

            public final boolean isNeedShowTeamVaultPromotion() {
                return this.isNeedShowTeamVaultPromotion;
            }

            public String toString() {
                return "InviteMembers(isNeedShowTeamVaultPromotion=" + this.isNeedShowTeamVaultPromotion + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(this.isNeedShowTeamVaultPromotion ? 1 : 0);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private final Intent a(Context context, NavigationDestination navigationDestination) {
            Intent intent = new Intent(context, (Class<?>) NavigationPopUpWhenLargeActivity.class);
            intent.putExtra("NAVIGATION_DESTINATION_KEY", navigationDestination);
            return intent;
        }

        public final void b(Context context, NavigationDestination navigationDestination) {
            ju.t.f(context, "context");
            ju.t.f(navigationDestination, "navigationFlow");
            context.startActivity(a(context, navigationDestination));
        }

        public final void c(g.b bVar, Context context, NavigationDestination navigationDestination) {
            ju.t.f(bVar, "<this>");
            ju.t.f(context, "context");
            ju.t.f(navigationDestination, "navigationFlow");
            bVar.a(a(context, navigationDestination));
        }

        private a() {
        }
    }

    private final androidx.navigation.m0 g0() {
        return (androidx.navigation.m0) this.f28306a.getValue();
    }

    private final Bundle h0() {
        return getIntent().getExtras();
    }

    private final void i0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.navigation.m0 j0(NavigationPopUpWhenLargeActivity navigationPopUpWhenLargeActivity) {
        Fragment fragmentN0 = navigationPopUpWhenLargeActivity.getSupportFragmentManager().n0(R.id.main_navigation_container);
        ju.t.d(fragmentN0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) fragmentN0).wf();
    }

    private final void k0() {
        g0().f0(g0().y().b(R.navigation.account_logout_flow), h0());
    }

    private final void l0() {
        g0().f0(g0().y().b(R.navigation.business_vaults_promo_flow), h0());
    }

    private final void m0() {
        g0().f0(g0().y().b(R.navigation.change_email_flow), h0());
    }

    private final void n0() {
        g0().f0(g0().y().b(R.navigation.change_password_flow), h0());
    }

    private final void o0() {
        g0().f0(g0().y().b(R.navigation.free_open_ai_flow), h0());
    }

    private final void p0(NavigationDestination.GracePeriodFlow gracePeriodFlow) {
        androidx.navigation.m1 m1VarB = g0().y().b(R.navigation.grace_period_flow);
        Bundle bundle = new GracePeriodScreenArgs.a(gracePeriodFlow.getGracePeriodSubscription()).a().toBundle();
        ju.t.e(bundle, "toBundle(...)");
        t0(bundle);
        g0().f0(m1VarB, h0());
    }

    private final void q0() {
        g0().f0(g0().y().b(R.navigation.multikey_promotion_flow), h0());
    }

    private final void r0(NavigationDestination.SetupTeamVaultFlow setupTeamVaultFlow) {
        androidx.navigation.m1 m1VarB = g0().y().b(R.navigation.setup_team_vault_flow);
        SetupTeamVaultFlowStartDestination startDestination = setupTeamVaultFlow.getStartDestination();
        if (startDestination instanceof SetupTeamVaultFlowStartDestination.Onboarding) {
            SetupTeamVaultFlowStartDestination.Onboarding onboarding = (SetupTeamVaultFlowStartDestination.Onboarding) startDestination;
            Bundle bundle = new SetupTeamVaultOnboardingScreenArgs.a((TypedEntityIdentifier[]) onboarding.getTypedEntityToShareIdentifiers().toArray(new TypedEntityIdentifier[0]), onboarding.getAnalyticsFunnelId()).a().toBundle();
            ju.t.e(bundle, "toBundle(...)");
            t0(bundle);
            m1VarB.W(R.id.setupTeamVaultOnboardingScreen);
        } else {
            if (!(startDestination instanceof SetupTeamVaultFlowStartDestination.CredentialsMode)) {
                throw new ut.s();
            }
            SetupTeamVaultFlowStartDestination.CredentialsMode credentialsMode = (SetupTeamVaultFlowStartDestination.CredentialsMode) startDestination;
            Bundle bundle2 = new SetupTeamVaultCredentialsModeScreenArgs.a(credentialsMode.getInvitedColleaguesCount(), (TypedEntityIdentifier[]) credentialsMode.getTypedEntityToShareIdentifiers().toArray(new TypedEntityIdentifier[0]), credentialsMode.getAnalyticsFunnelId()).b(credentialsMode.getCallerFeature()).a().toBundle();
            ju.t.e(bundle2, "toBundle(...)");
            t0(bundle2);
            m1VarB.W(R.id.setupTeamVaultCredentialsModeScreen);
        }
        g0().f0(m1VarB, h0());
    }

    private final void s0(NavigationDestination.TeamPresenceFlow teamPresenceFlow) {
        androidx.navigation.m1 m1VarB = g0().y().b(R.navigation.team_presence_flow);
        TeamPresenceFlowStartDestination startDestination = teamPresenceFlow.getStartDestination();
        if (ju.t.b(startDestination, TeamPresenceFlowStartDestination.Default.INSTANCE)) {
            m1VarB.W(R.id.teamPresenceScreen);
        } else {
            if (!(startDestination instanceof TeamPresenceFlowStartDestination.InviteMembers)) {
                throw new ut.s();
            }
            Bundle bundle = new TeamPresenceInviteColleaguesScreenArgs.a(((TeamPresenceFlowStartDestination.InviteMembers) startDestination).isNeedShowTeamVaultPromotion()).a().toBundle();
            ju.t.e(bundle, "toBundle(...)");
            t0(bundle);
            m1VarB.W(R.id.teamPresenceInviteColleaguesScreen);
        }
        g0().f0(m1VarB, h0());
    }

    private final void t0(Bundle bundle) {
        getIntent().putExtras(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        i0();
        super.onCreate(bundle);
        o4.m1.b(getWindow(), false);
        setFinishOnTouchOutside(false);
        setContentView(R.layout.navigation_router_activity);
        Bundle extras = getIntent().getExtras();
        NavigationDestination navigationDestination = null;
        if (Build.VERSION.SDK_INT >= 33) {
            if (extras != null) {
                navigationDestination = (NavigationDestination) extras.getParcelable("NAVIGATION_DESTINATION_KEY", NavigationDestination.class);
            }
        } else if (extras != null) {
            navigationDestination = (NavigationDestination) extras.getParcelable("NAVIGATION_DESTINATION_KEY");
        }
        if (navigationDestination == null) {
            throw new NullPointerException("Cannot retrieve the 'NAVIGATION_DESTINATION_KEY' from activity arguments!");
        }
        if (navigationDestination instanceof NavigationDestination.GracePeriodFlow) {
            p0((NavigationDestination.GracePeriodFlow) navigationDestination);
            return;
        }
        if (ju.t.b(navigationDestination, NavigationDestination.AccountLogoutFlow.INSTANCE)) {
            k0();
            return;
        }
        if (ju.t.b(navigationDestination, NavigationDestination.ChangeEmailFlow.INSTANCE)) {
            m0();
            return;
        }
        if (ju.t.b(navigationDestination, NavigationDestination.ChangePasswordFlow.INSTANCE)) {
            n0();
            return;
        }
        if (ju.t.b(navigationDestination, NavigationDestination.MultikeyPromotionFlow.INSTANCE)) {
            q0();
            return;
        }
        if (navigationDestination instanceof NavigationDestination.TeamPresenceFlow) {
            s0((NavigationDestination.TeamPresenceFlow) navigationDestination);
            return;
        }
        if (navigationDestination instanceof NavigationDestination.SetupTeamVaultFlow) {
            r0((NavigationDestination.SetupTeamVaultFlow) navigationDestination);
        } else if (navigationDestination instanceof NavigationDestination.BusinessVaultsPromoFlow) {
            l0();
        } else {
            if (!ju.t.b(navigationDestination, NavigationDestination.FreeOpenAiPromoFlow.INSTANCE)) {
                throw new ut.s();
            }
            o0();
        }
    }
}
