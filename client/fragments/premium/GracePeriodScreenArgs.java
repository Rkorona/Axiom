package com.server.auditor.ssh.client.fragments.premium;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.models.GracePeriodSubscription;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class GracePeriodScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25990a;

        public a(GracePeriodSubscription gracePeriodSubscription) {
            HashMap map = new HashMap();
            this.f25990a = map;
            if (gracePeriodSubscription == null) {
                throw new IllegalArgumentException("Argument \"gracePeriodSubscription\" is marked as non-null but was passed a null value.");
            }
            map.put("gracePeriodSubscription", gracePeriodSubscription);
        }

        public GracePeriodScreenArgs a() {
            return new GracePeriodScreenArgs(this.f25990a);
        }
    }

    public static GracePeriodScreenArgs fromBundle(Bundle bundle) {
        GracePeriodScreenArgs gracePeriodScreenArgs = new GracePeriodScreenArgs();
        bundle.setClassLoader(GracePeriodScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("gracePeriodSubscription")) {
            throw new IllegalArgumentException("Required argument \"gracePeriodSubscription\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(GracePeriodSubscription.class) && !Serializable.class.isAssignableFrom(GracePeriodSubscription.class)) {
            throw new UnsupportedOperationException(GracePeriodSubscription.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        GracePeriodSubscription gracePeriodSubscription = (GracePeriodSubscription) bundle.get("gracePeriodSubscription");
        if (gracePeriodSubscription == null) {
            throw new IllegalArgumentException("Argument \"gracePeriodSubscription\" is marked as non-null but was passed a null value.");
        }
        gracePeriodScreenArgs.arguments.put("gracePeriodSubscription", gracePeriodSubscription);
        return gracePeriodScreenArgs;
    }

    public static GracePeriodScreenArgs fromSavedStateHandle(u0 u0Var) {
        GracePeriodScreenArgs gracePeriodScreenArgs = new GracePeriodScreenArgs();
        if (!u0Var.b("gracePeriodSubscription")) {
            throw new IllegalArgumentException("Required argument \"gracePeriodSubscription\" is missing and does not have an android:defaultValue");
        }
        GracePeriodSubscription gracePeriodSubscription = (GracePeriodSubscription) u0Var.c("gracePeriodSubscription");
        if (gracePeriodSubscription == null) {
            throw new IllegalArgumentException("Argument \"gracePeriodSubscription\" is marked as non-null but was passed a null value.");
        }
        gracePeriodScreenArgs.arguments.put("gracePeriodSubscription", gracePeriodSubscription);
        return gracePeriodScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GracePeriodScreenArgs gracePeriodScreenArgs = (GracePeriodScreenArgs) obj;
        if (this.arguments.containsKey("gracePeriodSubscription") != gracePeriodScreenArgs.arguments.containsKey("gracePeriodSubscription")) {
            return false;
        }
        return getGracePeriodSubscription() == null ? gracePeriodScreenArgs.getGracePeriodSubscription() == null : getGracePeriodSubscription().equals(gracePeriodScreenArgs.getGracePeriodSubscription());
    }

    public GracePeriodSubscription getGracePeriodSubscription() {
        return (GracePeriodSubscription) this.arguments.get("gracePeriodSubscription");
    }

    public int hashCode() {
        return 31 + (getGracePeriodSubscription() != null ? getGracePeriodSubscription().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("gracePeriodSubscription")) {
            GracePeriodSubscription gracePeriodSubscription = (GracePeriodSubscription) this.arguments.get("gracePeriodSubscription");
            if (!Parcelable.class.isAssignableFrom(GracePeriodSubscription.class) && gracePeriodSubscription != null) {
                if (Serializable.class.isAssignableFrom(GracePeriodSubscription.class)) {
                    bundle.putSerializable("gracePeriodSubscription", (Serializable) Serializable.class.cast(gracePeriodSubscription));
                    return bundle;
                }
                throw new UnsupportedOperationException(GracePeriodSubscription.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("gracePeriodSubscription", (Parcelable) Parcelable.class.cast(gracePeriodSubscription));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("gracePeriodSubscription")) {
            GracePeriodSubscription gracePeriodSubscription = (GracePeriodSubscription) this.arguments.get("gracePeriodSubscription");
            if (!Parcelable.class.isAssignableFrom(GracePeriodSubscription.class) && gracePeriodSubscription != null) {
                if (Serializable.class.isAssignableFrom(GracePeriodSubscription.class)) {
                    u0Var.h("gracePeriodSubscription", (Serializable) Serializable.class.cast(gracePeriodSubscription));
                    return u0Var;
                }
                throw new UnsupportedOperationException(GracePeriodSubscription.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("gracePeriodSubscription", (Parcelable) Parcelable.class.cast(gracePeriodSubscription));
        }
        return u0Var;
    }

    public String toString() {
        return "GracePeriodScreenArgs{gracePeriodSubscription=" + getGracePeriodSubscription() + "}";
    }

    private GracePeriodScreenArgs() {
        this.arguments = new HashMap();
    }

    private GracePeriodScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
