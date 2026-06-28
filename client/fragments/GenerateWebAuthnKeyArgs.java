package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import androidx.lifecycle.u0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class GenerateWebAuthnKeyArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f24029a;

        public a(String str) {
            HashMap map = new HashMap();
            this.f24029a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
            }
            map.put("funnelId", str);
        }

        public GenerateWebAuthnKeyArgs a() {
            return new GenerateWebAuthnKeyArgs(this.f24029a);
        }
    }

    public static GenerateWebAuthnKeyArgs fromBundle(Bundle bundle) {
        GenerateWebAuthnKeyArgs generateWebAuthnKeyArgs = new GenerateWebAuthnKeyArgs();
        bundle.setClassLoader(GenerateWebAuthnKeyArgs.class.getClassLoader());
        if (!bundle.containsKey("funnelId")) {
            throw new IllegalArgumentException("Required argument \"funnelId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("funnelId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
        }
        generateWebAuthnKeyArgs.arguments.put("funnelId", string);
        return generateWebAuthnKeyArgs;
    }

    public static GenerateWebAuthnKeyArgs fromSavedStateHandle(u0 u0Var) {
        GenerateWebAuthnKeyArgs generateWebAuthnKeyArgs = new GenerateWebAuthnKeyArgs();
        if (!u0Var.b("funnelId")) {
            throw new IllegalArgumentException("Required argument \"funnelId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("funnelId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
        }
        generateWebAuthnKeyArgs.arguments.put("funnelId", str);
        return generateWebAuthnKeyArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateWebAuthnKeyArgs generateWebAuthnKeyArgs = (GenerateWebAuthnKeyArgs) obj;
        if (this.arguments.containsKey("funnelId") != generateWebAuthnKeyArgs.arguments.containsKey("funnelId")) {
            return false;
        }
        return getFunnelId() == null ? generateWebAuthnKeyArgs.getFunnelId() == null : getFunnelId().equals(generateWebAuthnKeyArgs.getFunnelId());
    }

    public String getFunnelId() {
        return (String) this.arguments.get("funnelId");
    }

    public int hashCode() {
        return 31 + (getFunnelId() != null ? getFunnelId().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("funnelId")) {
            bundle.putString("funnelId", (String) this.arguments.get("funnelId"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("funnelId")) {
            u0Var.h("funnelId", (String) this.arguments.get("funnelId"));
        }
        return u0Var;
    }

    public String toString() {
        return "GenerateWebAuthnKeyArgs{funnelId=" + getFunnelId() + "}";
    }

    private GenerateWebAuthnKeyArgs() {
        this.arguments = new HashMap();
    }

    private GenerateWebAuthnKeyArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
