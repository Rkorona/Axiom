package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.SubscriptionPeriodInfo;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25966a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25966a.containsKey("subscriptionPeriodInfo")) {
                SubscriptionPeriodInfo subscriptionPeriodInfo = (SubscriptionPeriodInfo) this.f25966a.get("subscriptionPeriodInfo");
                if (!Parcelable.class.isAssignableFrom(SubscriptionPeriodInfo.class) && subscriptionPeriodInfo != null) {
                    if (Serializable.class.isAssignableFrom(SubscriptionPeriodInfo.class)) {
                        bundle.putSerializable("subscriptionPeriodInfo", (Serializable) Serializable.class.cast(subscriptionPeriodInfo));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(SubscriptionPeriodInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("subscriptionPeriodInfo", (Parcelable) Parcelable.class.cast(subscriptionPeriodInfo));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_freeOpenAiPromotionScreen_to_enabledOpenAiAndGotTrialScreen;
        }

        public SubscriptionPeriodInfo c() {
            return (SubscriptionPeriodInfo) this.f25966a.get("subscriptionPeriodInfo");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25966a.containsKey("subscriptionPeriodInfo") != aVar.f25966a.containsKey("subscriptionPeriodInfo")) {
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
            return "ActionFreeOpenAiPromotionScreenToEnabledOpenAiAndGotTrialScreen(actionId=" + b() + "){subscriptionPeriodInfo=" + c() + "}";
        }

        private a(SubscriptionPeriodInfo subscriptionPeriodInfo) {
            HashMap map = new HashMap();
            this.f25966a = map;
            if (subscriptionPeriodInfo == null) {
                throw new IllegalArgumentException("Argument \"subscriptionPeriodInfo\" is marked as non-null but was passed a null value.");
            }
            map.put("subscriptionPeriodInfo", subscriptionPeriodInfo);
        }
    }

    public static a a(SubscriptionPeriodInfo subscriptionPeriodInfo) {
        return new a(subscriptionPeriodInfo);
    }

    public static k1 b() {
        return new androidx.navigation.a(R.id.action_freeOpenAiPromotionScreen_to_enabledOpenAiScreen);
    }
}
