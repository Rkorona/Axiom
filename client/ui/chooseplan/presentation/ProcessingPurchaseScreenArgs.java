package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ProcessingPurchaseScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private ProcessingPurchaseScreenArgs() {
        this.arguments = new HashMap();
    }

    public static ProcessingPurchaseScreenArgs fromBundle(Bundle bundle) {
        ProcessingPurchaseScreenArgs processingPurchaseScreenArgs = new ProcessingPurchaseScreenArgs();
        bundle.setClassLoader(ProcessingPurchaseScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("purchasedSubscriptionInfo")) {
            throw new IllegalArgumentException("Required argument \"purchasedSubscriptionInfo\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(AcknowledgeSubscriptionInfo.class) && !Serializable.class.isAssignableFrom(AcknowledgeSubscriptionInfo.class)) {
            throw new UnsupportedOperationException(AcknowledgeSubscriptionInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = (AcknowledgeSubscriptionInfo) bundle.get("purchasedSubscriptionInfo");
        if (acknowledgeSubscriptionInfo == null) {
            throw new IllegalArgumentException("Argument \"purchasedSubscriptionInfo\" is marked as non-null but was passed a null value.");
        }
        processingPurchaseScreenArgs.arguments.put("purchasedSubscriptionInfo", acknowledgeSubscriptionInfo);
        return processingPurchaseScreenArgs;
    }

    public static ProcessingPurchaseScreenArgs fromSavedStateHandle(u0 u0Var) {
        ProcessingPurchaseScreenArgs processingPurchaseScreenArgs = new ProcessingPurchaseScreenArgs();
        if (!u0Var.b("purchasedSubscriptionInfo")) {
            throw new IllegalArgumentException("Required argument \"purchasedSubscriptionInfo\" is missing and does not have an android:defaultValue");
        }
        AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = (AcknowledgeSubscriptionInfo) u0Var.c("purchasedSubscriptionInfo");
        if (acknowledgeSubscriptionInfo == null) {
            throw new IllegalArgumentException("Argument \"purchasedSubscriptionInfo\" is marked as non-null but was passed a null value.");
        }
        processingPurchaseScreenArgs.arguments.put("purchasedSubscriptionInfo", acknowledgeSubscriptionInfo);
        return processingPurchaseScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessingPurchaseScreenArgs processingPurchaseScreenArgs = (ProcessingPurchaseScreenArgs) obj;
        if (this.arguments.containsKey("purchasedSubscriptionInfo") != processingPurchaseScreenArgs.arguments.containsKey("purchasedSubscriptionInfo")) {
            return false;
        }
        return getPurchasedSubscriptionInfo() == null ? processingPurchaseScreenArgs.getPurchasedSubscriptionInfo() == null : getPurchasedSubscriptionInfo().equals(processingPurchaseScreenArgs.getPurchasedSubscriptionInfo());
    }

    public AcknowledgeSubscriptionInfo getPurchasedSubscriptionInfo() {
        return (AcknowledgeSubscriptionInfo) this.arguments.get("purchasedSubscriptionInfo");
    }

    public int hashCode() {
        return 31 + (getPurchasedSubscriptionInfo() != null ? getPurchasedSubscriptionInfo().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("purchasedSubscriptionInfo")) {
            AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = (AcknowledgeSubscriptionInfo) this.arguments.get("purchasedSubscriptionInfo");
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

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("purchasedSubscriptionInfo")) {
            AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = (AcknowledgeSubscriptionInfo) this.arguments.get("purchasedSubscriptionInfo");
            if (!Parcelable.class.isAssignableFrom(AcknowledgeSubscriptionInfo.class) && acknowledgeSubscriptionInfo != null) {
                if (Serializable.class.isAssignableFrom(AcknowledgeSubscriptionInfo.class)) {
                    u0Var.h("purchasedSubscriptionInfo", (Serializable) Serializable.class.cast(acknowledgeSubscriptionInfo));
                    return u0Var;
                }
                throw new UnsupportedOperationException(AcknowledgeSubscriptionInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("purchasedSubscriptionInfo", (Parcelable) Parcelable.class.cast(acknowledgeSubscriptionInfo));
        }
        return u0Var;
    }

    public String toString() {
        return "ProcessingPurchaseScreenArgs{purchasedSubscriptionInfo=" + getPurchasedSubscriptionInfo() + "}";
    }

    private ProcessingPurchaseScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
