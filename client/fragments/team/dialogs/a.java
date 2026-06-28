package com.server.auditor.ssh.client.fragments.team.dialogs;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.team.dialogs.a$a, reason: collision with other inner class name */
    public static class C0418a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26738a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26738a.containsKey("endOfTeamTrialTargetAction")) {
                EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.f26738a.get("endOfTeamTrialTargetAction");
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
            return R.id.action_teamTrialPromoExtensionScreen_to_removeTeamMembersConfirmationScreen;
        }

        public EndOfTeamTrialTargetAction c() {
            return (EndOfTeamTrialTargetAction) this.f26738a.get("endOfTeamTrialTargetAction");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0418a c0418a = (C0418a) obj;
            if (this.f26738a.containsKey("endOfTeamTrialTargetAction") != c0418a.f26738a.containsKey("endOfTeamTrialTargetAction")) {
                return false;
            }
            if (c() == null ? c0418a.c() == null : c().equals(c0418a.c())) {
                return b() == c0418a.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionTeamTrialPromoExtensionScreenToRemoveTeamMembersConfirmationScreen(actionId=" + b() + "){endOfTeamTrialTargetAction=" + c() + "}";
        }

        private C0418a(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            HashMap map = new HashMap();
            this.f26738a = map;
            if (endOfTeamTrialTargetAction == null) {
                throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
            }
            map.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        }
    }

    public static class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26739a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26739a.containsKey("endOfTeamTrialTargetAction")) {
                EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.f26739a.get("endOfTeamTrialTargetAction");
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
            return R.id.action_teamTrialPromoExtensionScreen_to_teamDeactivationProgressScreen;
        }

        public EndOfTeamTrialTargetAction c() {
            return (EndOfTeamTrialTargetAction) this.f26739a.get("endOfTeamTrialTargetAction");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f26739a.containsKey("endOfTeamTrialTargetAction") != bVar.f26739a.containsKey("endOfTeamTrialTargetAction")) {
                return false;
            }
            if (c() == null ? bVar.c() == null : c().equals(bVar.c())) {
                return b() == bVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionTeamTrialPromoExtensionScreenToTeamDeactivationProgressScreen(actionId=" + b() + "){endOfTeamTrialTargetAction=" + c() + "}";
        }

        private b(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            HashMap map = new HashMap();
            this.f26739a = map;
            if (endOfTeamTrialTargetAction == null) {
                throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
            }
            map.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        }
    }

    public static k1 a() {
        return new androidx.navigation.a(R.id.action_teamTrialPromoExtensionScreen_to_endOfTrialOopsScreen);
    }

    public static C0418a b(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        return new C0418a(endOfTeamTrialTargetAction);
    }

    public static b c(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        return new b(endOfTeamTrialTargetAction);
    }

    public static k1 d() {
        return new androidx.navigation.a(R.id.action_teamTrialPromoExtensionScreen_to_teamTrialRequestExtensionScreen);
    }
}
