package com.server.auditor.ssh.client.keymanager;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SshPrivateKeyPasteScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f27853a;

        public a(String str) {
            HashMap map = new HashMap();
            this.f27853a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"sshPrivateKeyText\" is marked as non-null but was passed a null value.");
            }
            map.put("sshPrivateKeyText", str);
        }

        public SshPrivateKeyPasteScreenArgs a() {
            return new SshPrivateKeyPasteScreenArgs(this.f27853a);
        }
    }

    public static SshPrivateKeyPasteScreenArgs fromBundle(Bundle bundle) {
        SshPrivateKeyPasteScreenArgs sshPrivateKeyPasteScreenArgs = new SshPrivateKeyPasteScreenArgs();
        bundle.setClassLoader(SshPrivateKeyPasteScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("sshPrivateKeyText")) {
            throw new IllegalArgumentException("Required argument \"sshPrivateKeyText\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sshPrivateKeyText");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sshPrivateKeyText\" is marked as non-null but was passed a null value.");
        }
        sshPrivateKeyPasteScreenArgs.arguments.put("sshPrivateKeyText", string);
        return sshPrivateKeyPasteScreenArgs;
    }

    public static SshPrivateKeyPasteScreenArgs fromSavedStateHandle(u0 u0Var) {
        SshPrivateKeyPasteScreenArgs sshPrivateKeyPasteScreenArgs = new SshPrivateKeyPasteScreenArgs();
        if (!u0Var.b("sshPrivateKeyText")) {
            throw new IllegalArgumentException("Required argument \"sshPrivateKeyText\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("sshPrivateKeyText");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"sshPrivateKeyText\" is marked as non-null but was passed a null value.");
        }
        sshPrivateKeyPasteScreenArgs.arguments.put("sshPrivateKeyText", str);
        return sshPrivateKeyPasteScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SshPrivateKeyPasteScreenArgs sshPrivateKeyPasteScreenArgs = (SshPrivateKeyPasteScreenArgs) obj;
        if (this.arguments.containsKey("sshPrivateKeyText") != sshPrivateKeyPasteScreenArgs.arguments.containsKey("sshPrivateKeyText")) {
            return false;
        }
        return getSshPrivateKeyText() == null ? sshPrivateKeyPasteScreenArgs.getSshPrivateKeyText() == null : getSshPrivateKeyText().equals(sshPrivateKeyPasteScreenArgs.getSshPrivateKeyText());
    }

    public String getSshPrivateKeyText() {
        return (String) this.arguments.get("sshPrivateKeyText");
    }

    public int hashCode() {
        return 31 + (getSshPrivateKeyText() != null ? getSshPrivateKeyText().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("sshPrivateKeyText")) {
            bundle.putString("sshPrivateKeyText", (String) this.arguments.get("sshPrivateKeyText"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("sshPrivateKeyText")) {
            u0Var.h("sshPrivateKeyText", (String) this.arguments.get("sshPrivateKeyText"));
        }
        return u0Var;
    }

    public String toString() {
        return "SshPrivateKeyPasteScreenArgs{sshPrivateKeyText=" + getSshPrivateKeyText() + "}";
    }

    private SshPrivateKeyPasteScreenArgs() {
        this.arguments = new HashMap();
    }

    private SshPrivateKeyPasteScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
