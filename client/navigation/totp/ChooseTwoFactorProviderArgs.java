package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ChooseTwoFactorProviderArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29962a;

        public a(String str) {
            HashMap map = new HashMap();
            this.f29962a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            map.put("action", str);
        }

        public ChooseTwoFactorProviderArgs a() {
            return new ChooseTwoFactorProviderArgs(this.f29962a);
        }
    }

    public static ChooseTwoFactorProviderArgs fromBundle(Bundle bundle) {
        ChooseTwoFactorProviderArgs chooseTwoFactorProviderArgs = new ChooseTwoFactorProviderArgs();
        bundle.setClassLoader(ChooseTwoFactorProviderArgs.class.getClassLoader());
        if (!bundle.containsKey("action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("action");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
        chooseTwoFactorProviderArgs.arguments.put("action", string);
        return chooseTwoFactorProviderArgs;
    }

    public static ChooseTwoFactorProviderArgs fromSavedStateHandle(u0 u0Var) {
        ChooseTwoFactorProviderArgs chooseTwoFactorProviderArgs = new ChooseTwoFactorProviderArgs();
        if (!u0Var.b("action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("action");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
        chooseTwoFactorProviderArgs.arguments.put("action", str);
        return chooseTwoFactorProviderArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChooseTwoFactorProviderArgs chooseTwoFactorProviderArgs = (ChooseTwoFactorProviderArgs) obj;
        if (this.arguments.containsKey("action") != chooseTwoFactorProviderArgs.arguments.containsKey("action")) {
            return false;
        }
        return getAction() == null ? chooseTwoFactorProviderArgs.getAction() == null : getAction().equals(chooseTwoFactorProviderArgs.getAction());
    }

    public String getAction() {
        return (String) this.arguments.get("action");
    }

    public int hashCode() {
        return 31 + (getAction() != null ? getAction().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("action")) {
            bundle.putString("action", (String) this.arguments.get("action"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("action")) {
            u0Var.h("action", (String) this.arguments.get("action"));
        }
        return u0Var;
    }

    public String toString() {
        return "ChooseTwoFactorProviderArgs{action=" + getAction() + "}";
    }

    private ChooseTwoFactorProviderArgs() {
        this.arguments = new HashMap();
    }

    private ChooseTwoFactorProviderArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
