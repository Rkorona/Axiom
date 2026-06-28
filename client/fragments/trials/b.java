package com.server.auditor.ssh.client.fragments.trials;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26963a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26963a.containsKey("isNeedCreateTeam")) {
                bundle.putBoolean("isNeedCreateTeam", ((Boolean) this.f26963a.get("isNeedCreateTeam")).booleanValue());
            } else {
                bundle.putBoolean("isNeedCreateTeam", true);
            }
            if (this.f26963a.containsKey("isNeedShowSuccessScreen")) {
                bundle.putBoolean("isNeedShowSuccessScreen", ((Boolean) this.f26963a.get("isNeedShowSuccessScreen")).booleanValue());
            } else {
                bundle.putBoolean("isNeedShowSuccessScreen", true);
            }
            if (this.f26963a.containsKey("canSkipInviteColleagues")) {
                bundle.putBoolean("canSkipInviteColleagues", ((Boolean) this.f26963a.get("canSkipInviteColleagues")).booleanValue());
            }
            if (this.f26963a.containsKey("canNavigateBack")) {
                bundle.putBoolean("canNavigateBack", ((Boolean) this.f26963a.get("canNavigateBack")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_endOfTrialScreen_to_endOfTrialInviteColleaguesScreen;
        }

        public boolean c() {
            return ((Boolean) this.f26963a.get("canNavigateBack")).booleanValue();
        }

        public boolean d() {
            return ((Boolean) this.f26963a.get("canSkipInviteColleagues")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f26963a.get("isNeedCreateTeam")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26963a.containsKey("isNeedCreateTeam") == aVar.f26963a.containsKey("isNeedCreateTeam") && e() == aVar.e() && this.f26963a.containsKey("isNeedShowSuccessScreen") == aVar.f26963a.containsKey("isNeedShowSuccessScreen") && f() == aVar.f() && this.f26963a.containsKey("canSkipInviteColleagues") == aVar.f26963a.containsKey("canSkipInviteColleagues") && d() == aVar.d() && this.f26963a.containsKey("canNavigateBack") == aVar.f26963a.containsKey("canNavigateBack") && c() == aVar.c() && b() == aVar.b();
        }

        public boolean f() {
            return ((Boolean) this.f26963a.get("isNeedShowSuccessScreen")).booleanValue();
        }

        public int hashCode() {
            return (((((((((e() ? 1 : 0) + 31) * 31) + (f() ? 1 : 0)) * 31) + (d() ? 1 : 0)) * 31) + (c() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionEndOfTrialScreenToEndOfTrialInviteColleaguesScreen(actionId=" + b() + "){isNeedCreateTeam=" + e() + ", isNeedShowSuccessScreen=" + f() + ", canSkipInviteColleagues=" + d() + ", canNavigateBack=" + c() + "}";
        }

        private a(boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f26963a = map;
            map.put("canSkipInviteColleagues", Boolean.valueOf(z10));
            map.put("canNavigateBack", Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.trials.b$b, reason: collision with other inner class name */
    public static class C0426b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26964a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26964a.containsKey("purchasedSubscriptionInfo")) {
                AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = (AcknowledgeSubscriptionInfo) this.f26964a.get("purchasedSubscriptionInfo");
                if (!Parcelable.class.isAssignableFrom(AcknowledgeSubscriptionInfo.class) && acknowledgeSubscriptionInfo != null) {
                    if (Serializable.class.isAssignableFrom(AcknowledgeSubscriptionInfo.class)) {
                        bundle.putSerializable("purchasedSubscriptionInfo", (Serializable) Serializable.class.cast(acknowledgeSubscriptionInfo));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(AcknowledgeSubscriptionInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("purchasedSubscriptionInfo", (Parcelable) Parcelable.class.cast(acknowledgeSubscriptionInfo));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_endOfTrialScreen_to_processingPurchaseScreen;
        }

        public AcknowledgeSubscriptionInfo c() {
            return (AcknowledgeSubscriptionInfo) this.f26964a.get("purchasedSubscriptionInfo");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0426b c0426b = (C0426b) obj;
            if (this.f26964a.containsKey("purchasedSubscriptionInfo") != c0426b.f26964a.containsKey("purchasedSubscriptionInfo")) {
                return false;
            }
            if (c() == null ? c0426b.c() == null : c().equals(c0426b.c())) {
                return b() == c0426b.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionEndOfTrialScreenToProcessingPurchaseScreen(actionId=" + b() + "){purchasedSubscriptionInfo=" + c() + "}";
        }

        private C0426b(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
            HashMap map = new HashMap();
            this.f26964a = map;
            if (acknowledgeSubscriptionInfo == null) {
                throw new IllegalArgumentException("Argument \"purchasedSubscriptionInfo\" is marked as non-null but was passed a null value.");
            }
            map.put("purchasedSubscriptionInfo", acknowledgeSubscriptionInfo);
        }
    }

    public static class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26965a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26965a.containsKey("endOfTeamTrialTargetAction")) {
                EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.f26965a.get("endOfTeamTrialTargetAction");
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
            return R.id.action_endOfTrialScreen_to_removeTeamMembersConfirmationScreen;
        }

        public EndOfTeamTrialTargetAction c() {
            return (EndOfTeamTrialTargetAction) this.f26965a.get("endOfTeamTrialTargetAction");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f26965a.containsKey("endOfTeamTrialTargetAction") != cVar.f26965a.containsKey("endOfTeamTrialTargetAction")) {
                return false;
            }
            if (c() == null ? cVar.c() == null : c().equals(cVar.c())) {
                return b() == cVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionEndOfTrialScreenToRemoveTeamMembersConfirmationScreen(actionId=" + b() + "){endOfTeamTrialTargetAction=" + c() + "}";
        }

        private c(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            HashMap map = new HashMap();
            this.f26965a = map;
            if (endOfTeamTrialTargetAction == null) {
                throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
            }
            map.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        }
    }

    public static class d implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26966a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26966a.containsKey("endOfTeamTrialTargetAction")) {
                EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.f26966a.get("endOfTeamTrialTargetAction");
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
            return R.id.action_endOfTrialScreen_to_teamDeactivationProgressScreen;
        }

        public EndOfTeamTrialTargetAction c() {
            return (EndOfTeamTrialTargetAction) this.f26966a.get("endOfTeamTrialTargetAction");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f26966a.containsKey("endOfTeamTrialTargetAction") != dVar.f26966a.containsKey("endOfTeamTrialTargetAction")) {
                return false;
            }
            if (c() == null ? dVar.c() == null : c().equals(dVar.c())) {
                return b() == dVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionEndOfTrialScreenToTeamDeactivationProgressScreen(actionId=" + b() + "){endOfTeamTrialTargetAction=" + c() + "}";
        }

        private d(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            HashMap map = new HashMap();
            this.f26966a = map;
            if (endOfTeamTrialTargetAction == null) {
                throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
            }
            map.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        }
    }

    public static class e implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26967a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26967a.containsKey("isPromoMode")) {
                bundle.putBoolean("isPromoMode", ((Boolean) this.f26967a.get("isPromoMode")).booleanValue());
            }
            if (this.f26967a.containsKey("endOfTeamTrialTargetAction")) {
                EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.f26967a.get("endOfTeamTrialTargetAction");
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
            return R.id.action_endOfTrialScreen_to_teamTrialPromoExtensionScreen;
        }

        public EndOfTeamTrialTargetAction c() {
            return (EndOfTeamTrialTargetAction) this.f26967a.get("endOfTeamTrialTargetAction");
        }

        public boolean d() {
            return ((Boolean) this.f26967a.get("isPromoMode")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f26967a.containsKey("isPromoMode") != eVar.f26967a.containsKey("isPromoMode") || d() != eVar.d() || this.f26967a.containsKey("endOfTeamTrialTargetAction") != eVar.f26967a.containsKey("endOfTeamTrialTargetAction")) {
                return false;
            }
            if (c() == null ? eVar.c() == null : c().equals(eVar.c())) {
                return b() == eVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((((d() ? 1 : 0) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionEndOfTrialScreenToTeamTrialPromoExtensionScreen(actionId=" + b() + "){isPromoMode=" + d() + ", endOfTeamTrialTargetAction=" + c() + "}";
        }

        private e(boolean z10, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            HashMap map = new HashMap();
            this.f26967a = map;
            map.put("isPromoMode", Boolean.valueOf(z10));
            if (endOfTeamTrialTargetAction == null) {
                throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
            }
            map.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        }
    }

    public static a a(boolean z10, boolean z11) {
        return new a(z10, z11);
    }

    public static k1 b() {
        return new androidx.navigation.a(R.id.action_endOfTrialScreen_to_proPaidRenewPromoScreen);
    }

    public static k1 c() {
        return new androidx.navigation.a(R.id.action_endOfTrialScreen_to_proSuccessfullyDeactivatedScreen);
    }

    public static k1 d() {
        return new androidx.navigation.a(R.id.action_endOfTrialScreen_to_proTrialExtensionPromotion);
    }

    public static C0426b e(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
        return new C0426b(acknowledgeSubscriptionInfo);
    }

    public static c f(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        return new c(endOfTeamTrialTargetAction);
    }

    public static k1 g() {
        return new androidx.navigation.a(R.id.action_endOfTrialScreen_to_restoringPurchaseScreen);
    }

    public static d h(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        return new d(endOfTeamTrialTargetAction);
    }

    public static e i(boolean z10, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        return new e(z10, endOfTeamTrialTargetAction);
    }

    public static k1 j() {
        return new androidx.navigation.a(R.id.action_endOfTrialScreen_to_thanksForPurchaseSubscriptionScreen);
    }
}
