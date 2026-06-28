package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MasterPasswordEnterEmailScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f28297a;

        public a(String str) {
            HashMap map = new HashMap();
            this.f28297a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            map.put("email", str);
        }

        public MasterPasswordEnterEmailScreenArgs a() {
            return new MasterPasswordEnterEmailScreenArgs(this.f28297a);
        }
    }

    public static MasterPasswordEnterEmailScreenArgs fromBundle(Bundle bundle) {
        MasterPasswordEnterEmailScreenArgs masterPasswordEnterEmailScreenArgs = new MasterPasswordEnterEmailScreenArgs();
        bundle.setClassLoader(MasterPasswordEnterEmailScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("email");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        masterPasswordEnterEmailScreenArgs.arguments.put("email", string);
        return masterPasswordEnterEmailScreenArgs;
    }

    public static MasterPasswordEnterEmailScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        MasterPasswordEnterEmailScreenArgs masterPasswordEnterEmailScreenArgs = new MasterPasswordEnterEmailScreenArgs();
        if (!u0Var.b("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("email");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        masterPasswordEnterEmailScreenArgs.arguments.put("email", str);
        return masterPasswordEnterEmailScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MasterPasswordEnterEmailScreenArgs masterPasswordEnterEmailScreenArgs = (MasterPasswordEnterEmailScreenArgs) obj;
        if (this.arguments.containsKey("email") != masterPasswordEnterEmailScreenArgs.arguments.containsKey("email")) {
            return false;
        }
        return getEmail() == null ? masterPasswordEnterEmailScreenArgs.getEmail() == null : getEmail().equals(masterPasswordEnterEmailScreenArgs.getEmail());
    }

    public String getEmail() {
        return (String) this.arguments.get("email");
    }

    public int hashCode() {
        return 31 + (getEmail() != null ? getEmail().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("email")) {
            bundle.putString("email", (String) this.arguments.get("email"));
        }
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
        if (this.arguments.containsKey("email")) {
            u0Var.h("email", (String) this.arguments.get("email"));
        }
        return u0Var;
    }

    public String toString() {
        return "MasterPasswordEnterEmailScreenArgs{email=" + getEmail() + "}";
    }

    private MasterPasswordEnterEmailScreenArgs() {
        this.arguments = new HashMap();
    }

    private MasterPasswordEnterEmailScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
