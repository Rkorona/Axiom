package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.server.auditor.ssh.client.models.SubscriptionPeriodInfo;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class EnabledOpenAiAndGotTrialScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private EnabledOpenAiAndGotTrialScreenArgs() {
        this.arguments = new HashMap();
    }

    public static EnabledOpenAiAndGotTrialScreenArgs fromBundle(Bundle bundle) {
        EnabledOpenAiAndGotTrialScreenArgs enabledOpenAiAndGotTrialScreenArgs = new EnabledOpenAiAndGotTrialScreenArgs();
        bundle.setClassLoader(EnabledOpenAiAndGotTrialScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("subscriptionPeriodInfo")) {
            throw new IllegalArgumentException("Required argument \"subscriptionPeriodInfo\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SubscriptionPeriodInfo.class) && !Serializable.class.isAssignableFrom(SubscriptionPeriodInfo.class)) {
            throw new UnsupportedOperationException(SubscriptionPeriodInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        SubscriptionPeriodInfo subscriptionPeriodInfo = (SubscriptionPeriodInfo) bundle.get("subscriptionPeriodInfo");
        if (subscriptionPeriodInfo == null) {
            throw new IllegalArgumentException("Argument \"subscriptionPeriodInfo\" is marked as non-null but was passed a null value.");
        }
        enabledOpenAiAndGotTrialScreenArgs.arguments.put("subscriptionPeriodInfo", subscriptionPeriodInfo);
        return enabledOpenAiAndGotTrialScreenArgs;
    }

    public static EnabledOpenAiAndGotTrialScreenArgs fromSavedStateHandle(u0 u0Var) {
        EnabledOpenAiAndGotTrialScreenArgs enabledOpenAiAndGotTrialScreenArgs = new EnabledOpenAiAndGotTrialScreenArgs();
        if (!u0Var.b("subscriptionPeriodInfo")) {
            throw new IllegalArgumentException("Required argument \"subscriptionPeriodInfo\" is missing and does not have an android:defaultValue");
        }
        SubscriptionPeriodInfo subscriptionPeriodInfo = (SubscriptionPeriodInfo) u0Var.c("subscriptionPeriodInfo");
        if (subscriptionPeriodInfo == null) {
            throw new IllegalArgumentException("Argument \"subscriptionPeriodInfo\" is marked as non-null but was passed a null value.");
        }
        enabledOpenAiAndGotTrialScreenArgs.arguments.put("subscriptionPeriodInfo", subscriptionPeriodInfo);
        return enabledOpenAiAndGotTrialScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnabledOpenAiAndGotTrialScreenArgs enabledOpenAiAndGotTrialScreenArgs = (EnabledOpenAiAndGotTrialScreenArgs) obj;
        if (this.arguments.containsKey("subscriptionPeriodInfo") != enabledOpenAiAndGotTrialScreenArgs.arguments.containsKey("subscriptionPeriodInfo")) {
            return false;
        }
        return getSubscriptionPeriodInfo() == null ? enabledOpenAiAndGotTrialScreenArgs.getSubscriptionPeriodInfo() == null : getSubscriptionPeriodInfo().equals(enabledOpenAiAndGotTrialScreenArgs.getSubscriptionPeriodInfo());
    }

    public SubscriptionPeriodInfo getSubscriptionPeriodInfo() {
        return (SubscriptionPeriodInfo) this.arguments.get("subscriptionPeriodInfo");
    }

    public int hashCode() {
        return 31 + (getSubscriptionPeriodInfo() != null ? getSubscriptionPeriodInfo().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("subscriptionPeriodInfo")) {
            SubscriptionPeriodInfo subscriptionPeriodInfo = (SubscriptionPeriodInfo) this.arguments.get("subscriptionPeriodInfo");
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

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("subscriptionPeriodInfo")) {
            SubscriptionPeriodInfo subscriptionPeriodInfo = (SubscriptionPeriodInfo) this.arguments.get("subscriptionPeriodInfo");
            if (!Parcelable.class.isAssignableFrom(SubscriptionPeriodInfo.class) && subscriptionPeriodInfo != null) {
                if (Serializable.class.isAssignableFrom(SubscriptionPeriodInfo.class)) {
                    u0Var.h("subscriptionPeriodInfo", (Serializable) Serializable.class.cast(subscriptionPeriodInfo));
                    return u0Var;
                }
                throw new UnsupportedOperationException(SubscriptionPeriodInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("subscriptionPeriodInfo", (Parcelable) Parcelable.class.cast(subscriptionPeriodInfo));
        }
        return u0Var;
    }

    public String toString() {
        return "EnabledOpenAiAndGotTrialScreenArgs{subscriptionPeriodInfo=" + getSubscriptionPeriodInfo() + "}";
    }

    private EnabledOpenAiAndGotTrialScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
