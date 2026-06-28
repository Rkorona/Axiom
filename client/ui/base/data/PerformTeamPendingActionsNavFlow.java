package com.server.auditor.ssh.client.ui.base.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.models.DowngradeToPlanType;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PerformTeamPendingActionsNavFlow implements Parcelable {
    public static final int $stable = 0;

    public static final class TeamTrialOwnerAwaitingDowngradeFlow extends PerformTeamPendingActionsNavFlow {
        private final DowngradeToPlanType downgradeToPlanType;
        public static final Parcelable.Creator<TeamTrialOwnerAwaitingDowngradeFlow> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TeamTrialOwnerAwaitingDowngradeFlow createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new TeamTrialOwnerAwaitingDowngradeFlow((DowngradeToPlanType) parcel.readParcelable(TeamTrialOwnerAwaitingDowngradeFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TeamTrialOwnerAwaitingDowngradeFlow[] newArray(int i10) {
                return new TeamTrialOwnerAwaitingDowngradeFlow[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TeamTrialOwnerAwaitingDowngradeFlow(DowngradeToPlanType downgradeToPlanType) {
            super(null);
            t.f(downgradeToPlanType, "downgradeToPlanType");
            this.downgradeToPlanType = downgradeToPlanType;
        }

        public static /* synthetic */ TeamTrialOwnerAwaitingDowngradeFlow copy$default(TeamTrialOwnerAwaitingDowngradeFlow teamTrialOwnerAwaitingDowngradeFlow, DowngradeToPlanType downgradeToPlanType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                downgradeToPlanType = teamTrialOwnerAwaitingDowngradeFlow.downgradeToPlanType;
            }
            return teamTrialOwnerAwaitingDowngradeFlow.copy(downgradeToPlanType);
        }

        public final DowngradeToPlanType component1() {
            return this.downgradeToPlanType;
        }

        public final TeamTrialOwnerAwaitingDowngradeFlow copy(DowngradeToPlanType downgradeToPlanType) {
            t.f(downgradeToPlanType, "downgradeToPlanType");
            return new TeamTrialOwnerAwaitingDowngradeFlow(downgradeToPlanType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeamTrialOwnerAwaitingDowngradeFlow) && t.b(this.downgradeToPlanType, ((TeamTrialOwnerAwaitingDowngradeFlow) obj).downgradeToPlanType);
        }

        public final DowngradeToPlanType getDowngradeToPlanType() {
            return this.downgradeToPlanType;
        }

        public int hashCode() {
            return this.downgradeToPlanType.hashCode();
        }

        public String toString() {
            return "TeamTrialOwnerAwaitingDowngradeFlow(downgradeToPlanType=" + this.downgradeToPlanType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.downgradeToPlanType, i10);
        }
    }

    public /* synthetic */ PerformTeamPendingActionsNavFlow(k kVar) {
        this();
    }

    private PerformTeamPendingActionsNavFlow() {
    }
}
