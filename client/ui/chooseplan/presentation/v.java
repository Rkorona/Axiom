package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f39969a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f39969a.containsKey("endOfTeamTrialTargetAction")) {
                EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.f39969a.get("endOfTeamTrialTargetAction");
                if (!Parcelable.class.isAssignableFrom(EndOfTeamTrialTargetAction.class) && endOfTeamTrialTargetAction != null) {
                    if (Serializable.class.isAssignableFrom(EndOfTeamTrialTargetAction.class)) {
                        bundle.putSerializable("endOfTeamTrialTargetAction", (Serializable) Serializable.class.cast(endOfTeamTrialTargetAction));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(EndOfTeamTrialTargetAction.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("endOfTeamTrialTargetAction", (Parcelable) Parcelable.class.cast(endOfTeamTrialTargetAction));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_teamDeactivationProgressScreen_to_teamSuccessfullyDeactivatedScreen;
        }

        public EndOfTeamTrialTargetAction c() {
            return (EndOfTeamTrialTargetAction) this.f39969a.get("endOfTeamTrialTargetAction");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f39969a.containsKey("endOfTeamTrialTargetAction") != aVar.f39969a.containsKey("endOfTeamTrialTargetAction")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionTeamDeactivationProgressScreenToTeamSuccessfullyDeactivatedScreen(actionId=" + b() + "){endOfTeamTrialTargetAction=" + c() + "}";
        }

        private a(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            HashMap map = new HashMap();
            this.f39969a = map;
            if (endOfTeamTrialTargetAction == null) {
                throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
            }
            map.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        }
    }

    public static k1 a() {
        return new androidx.navigation.a(R.id.action_teamDeactivationProgressScreen_to_endOfTrialOopsScreen);
    }

    public static a b(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        return new a(endOfTeamTrialTargetAction);
    }
}
