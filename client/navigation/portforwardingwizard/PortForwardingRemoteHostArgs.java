package com.server.auditor.ssh.client.navigation.portforwardingwizard;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class PortForwardingRemoteHostArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29510a;

        public a(PortForwardingWizardData portForwardingWizardData) {
            HashMap map = new HashMap();
            this.f29510a = map;
            if (portForwardingWizardData == null) {
                throw new IllegalArgumentException("Argument \"wizardData\" is marked as non-null but was passed a null value.");
            }
            map.put("wizardData", portForwardingWizardData);
        }

        public PortForwardingRemoteHostArgs a() {
            return new PortForwardingRemoteHostArgs(this.f29510a);
        }
    }

    public static PortForwardingRemoteHostArgs fromBundle(Bundle bundle) {
        PortForwardingRemoteHostArgs portForwardingRemoteHostArgs = new PortForwardingRemoteHostArgs();
        bundle.setClassLoader(PortForwardingRemoteHostArgs.class.getClassLoader());
        if (!bundle.containsKey("wizardData")) {
            throw new IllegalArgumentException("Required argument \"wizardData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(PortForwardingWizardData.class) && !Serializable.class.isAssignableFrom(PortForwardingWizardData.class)) {
            throw new UnsupportedOperationException(PortForwardingWizardData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        PortForwardingWizardData portForwardingWizardData = (PortForwardingWizardData) bundle.get("wizardData");
        if (portForwardingWizardData == null) {
            throw new IllegalArgumentException("Argument \"wizardData\" is marked as non-null but was passed a null value.");
        }
        portForwardingRemoteHostArgs.arguments.put("wizardData", portForwardingWizardData);
        return portForwardingRemoteHostArgs;
    }

    public static PortForwardingRemoteHostArgs fromSavedStateHandle(u0 u0Var) {
        PortForwardingRemoteHostArgs portForwardingRemoteHostArgs = new PortForwardingRemoteHostArgs();
        if (!u0Var.b("wizardData")) {
            throw new IllegalArgumentException("Required argument \"wizardData\" is missing and does not have an android:defaultValue");
        }
        PortForwardingWizardData portForwardingWizardData = (PortForwardingWizardData) u0Var.c("wizardData");
        if (portForwardingWizardData == null) {
            throw new IllegalArgumentException("Argument \"wizardData\" is marked as non-null but was passed a null value.");
        }
        portForwardingRemoteHostArgs.arguments.put("wizardData", portForwardingWizardData);
        return portForwardingRemoteHostArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortForwardingRemoteHostArgs portForwardingRemoteHostArgs = (PortForwardingRemoteHostArgs) obj;
        if (this.arguments.containsKey("wizardData") != portForwardingRemoteHostArgs.arguments.containsKey("wizardData")) {
            return false;
        }
        return getWizardData() == null ? portForwardingRemoteHostArgs.getWizardData() == null : getWizardData().equals(portForwardingRemoteHostArgs.getWizardData());
    }

    public PortForwardingWizardData getWizardData() {
        return (PortForwardingWizardData) this.arguments.get("wizardData");
    }

    public int hashCode() {
        return 31 + (getWizardData() != null ? getWizardData().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("wizardData")) {
            PortForwardingWizardData portForwardingWizardData = (PortForwardingWizardData) this.arguments.get("wizardData");
            if (!Parcelable.class.isAssignableFrom(PortForwardingWizardData.class) && portForwardingWizardData != null) {
                if (Serializable.class.isAssignableFrom(PortForwardingWizardData.class)) {
                    bundle.putSerializable("wizardData", (Serializable) Serializable.class.cast(portForwardingWizardData));
                    return bundle;
                }
                throw new UnsupportedOperationException(PortForwardingWizardData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("wizardData", (Parcelable) Parcelable.class.cast(portForwardingWizardData));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("wizardData")) {
            PortForwardingWizardData portForwardingWizardData = (PortForwardingWizardData) this.arguments.get("wizardData");
            if (!Parcelable.class.isAssignableFrom(PortForwardingWizardData.class) && portForwardingWizardData != null) {
                if (Serializable.class.isAssignableFrom(PortForwardingWizardData.class)) {
                    u0Var.h("wizardData", (Serializable) Serializable.class.cast(portForwardingWizardData));
                    return u0Var;
                }
                throw new UnsupportedOperationException(PortForwardingWizardData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("wizardData", (Parcelable) Parcelable.class.cast(portForwardingWizardData));
        }
        return u0Var;
    }

    public String toString() {
        return "PortForwardingRemoteHostArgs{wizardData=" + getWizardData() + "}";
    }

    private PortForwardingRemoteHostArgs() {
        this.arguments = new HashMap();
    }

    private PortForwardingRemoteHostArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
