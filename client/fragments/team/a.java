package com.server.auditor.ssh.client.fragments.team;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.team.a$a, reason: collision with other inner class name */
    public static class C0417a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26691a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26691a.containsKey("endOfTeamTrialTargetAction")) {
                EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.f26691a.get("endOfTeamTrialTargetAction");
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
            return R.id.action_removeTeamMembersConfirmationScreen_to_teamDeactivationProgressScreen;
        }

        public EndOfTeamTrialTargetAction c() {
            return (EndOfTeamTrialTargetAction) this.f26691a.get("endOfTeamTrialTargetAction");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0417a c0417a = (C0417a) obj;
            if (this.f26691a.containsKey("endOfTeamTrialTargetAction") != c0417a.f26691a.containsKey("endOfTeamTrialTargetAction")) {
                return false;
            }
            if (c() == null ? c0417a.c() == null : c().equals(c0417a.c())) {
                return b() == c0417a.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionRemoveTeamMembersConfirmationScreenToTeamDeactivationProgressScreen(actionId=" + b() + "){endOfTeamTrialTargetAction=" + c() + "}";
        }

        private C0417a(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            HashMap map = new HashMap();
            this.f26691a = map;
            if (endOfTeamTrialTargetAction == null) {
                throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
            }
            map.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        }
    }

    public static C0417a a(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        return new C0417a(endOfTeamTrialTargetAction);
    }
}
