package com.server.auditor.ssh.client.fragments.trials;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class EndOfTrialScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26961a;

        public a(boolean z10, String str) {
            HashMap map = new HashMap();
            this.f26961a = map;
            map.put("isPromoMode", Boolean.valueOf(z10));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"avoChoosePlanSource\" is marked as non-null but was passed a null value.");
            }
            map.put("avoChoosePlanSource", str);
        }

        public EndOfTrialScreenArgs a() {
            return new EndOfTrialScreenArgs(this.f26961a);
        }
    }

    public static EndOfTrialScreenArgs fromBundle(Bundle bundle) {
        EndOfTrialScreenArgs endOfTrialScreenArgs = new EndOfTrialScreenArgs();
        bundle.setClassLoader(EndOfTrialScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("isPromoMode")) {
            throw new IllegalArgumentException("Required argument \"isPromoMode\" is missing and does not have an android:defaultValue");
        }
        endOfTrialScreenArgs.arguments.put("isPromoMode", Boolean.valueOf(bundle.getBoolean("isPromoMode")));
        if (!bundle.containsKey("avoChoosePlanSource")) {
            throw new IllegalArgumentException("Required argument \"avoChoosePlanSource\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("avoChoosePlanSource");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"avoChoosePlanSource\" is marked as non-null but was passed a null value.");
        }
        endOfTrialScreenArgs.arguments.put("avoChoosePlanSource", string);
        return endOfTrialScreenArgs;
    }

    public static EndOfTrialScreenArgs fromSavedStateHandle(u0 u0Var) {
        EndOfTrialScreenArgs endOfTrialScreenArgs = new EndOfTrialScreenArgs();
        if (!u0Var.b("isPromoMode")) {
            throw new IllegalArgumentException("Required argument \"isPromoMode\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("isPromoMode");
        bool.booleanValue();
        endOfTrialScreenArgs.arguments.put("isPromoMode", bool);
        if (!u0Var.b("avoChoosePlanSource")) {
            throw new IllegalArgumentException("Required argument \"avoChoosePlanSource\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("avoChoosePlanSource");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"avoChoosePlanSource\" is marked as non-null but was passed a null value.");
        }
        endOfTrialScreenArgs.arguments.put("avoChoosePlanSource", str);
        return endOfTrialScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndOfTrialScreenArgs endOfTrialScreenArgs = (EndOfTrialScreenArgs) obj;
        if (this.arguments.containsKey("isPromoMode") == endOfTrialScreenArgs.arguments.containsKey("isPromoMode") && getIsPromoMode() == endOfTrialScreenArgs.getIsPromoMode() && this.arguments.containsKey("avoChoosePlanSource") == endOfTrialScreenArgs.arguments.containsKey("avoChoosePlanSource")) {
            return getAvoChoosePlanSource() == null ? endOfTrialScreenArgs.getAvoChoosePlanSource() == null : getAvoChoosePlanSource().equals(endOfTrialScreenArgs.getAvoChoosePlanSource());
        }
        return false;
    }

    public String getAvoChoosePlanSource() {
        return (String) this.arguments.get("avoChoosePlanSource");
    }

    public boolean getIsPromoMode() {
        return ((Boolean) this.arguments.get("isPromoMode")).booleanValue();
    }

    public int hashCode() {
        return (((getIsPromoMode() ? 1 : 0) + 31) * 31) + (getAvoChoosePlanSource() != null ? getAvoChoosePlanSource().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("isPromoMode")) {
            bundle.putBoolean("isPromoMode", ((Boolean) this.arguments.get("isPromoMode")).booleanValue());
        }
        if (this.arguments.containsKey("avoChoosePlanSource")) {
            bundle.putString("avoChoosePlanSource", (String) this.arguments.get("avoChoosePlanSource"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("isPromoMode")) {
            Boolean bool = (Boolean) this.arguments.get("isPromoMode");
            bool.booleanValue();
            u0Var.h("isPromoMode", bool);
        }
        if (this.arguments.containsKey("avoChoosePlanSource")) {
            u0Var.h("avoChoosePlanSource", (String) this.arguments.get("avoChoosePlanSource"));
        }
        return u0Var;
    }

    public String toString() {
        return "EndOfTrialScreenArgs{isPromoMode=" + getIsPromoMode() + ", avoChoosePlanSource=" + getAvoChoosePlanSource() + "}";
    }

    private EndOfTrialScreenArgs() {
        this.arguments = new HashMap();
    }

    private EndOfTrialScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
