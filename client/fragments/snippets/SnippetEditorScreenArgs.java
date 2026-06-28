package com.server.auditor.ssh.client.fragments.snippets;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetEditorScreenArgs implements w {
    private final HashMap arguments;

    private SnippetEditorScreenArgs() {
        this.arguments = new HashMap();
    }

    public static SnippetEditorScreenArgs fromBundle(Bundle bundle) {
        SnippetEditorScreenArgs snippetEditorScreenArgs = new SnippetEditorScreenArgs();
        bundle.setClassLoader(SnippetEditorScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("bundle_is_panel_terminal_key")) {
            throw new IllegalArgumentException("Required argument \"bundle_is_panel_terminal_key\" is missing and does not have an android:defaultValue");
        }
        snippetEditorScreenArgs.arguments.put("bundle_is_panel_terminal_key", Boolean.valueOf(bundle.getBoolean("bundle_is_panel_terminal_key")));
        return snippetEditorScreenArgs;
    }

    public static SnippetEditorScreenArgs fromSavedStateHandle(u0 u0Var) {
        SnippetEditorScreenArgs snippetEditorScreenArgs = new SnippetEditorScreenArgs();
        if (!u0Var.b("bundle_is_panel_terminal_key")) {
            throw new IllegalArgumentException("Required argument \"bundle_is_panel_terminal_key\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("bundle_is_panel_terminal_key");
        bool.booleanValue();
        snippetEditorScreenArgs.arguments.put("bundle_is_panel_terminal_key", bool);
        return snippetEditorScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnippetEditorScreenArgs snippetEditorScreenArgs = (SnippetEditorScreenArgs) obj;
        return this.arguments.containsKey("bundle_is_panel_terminal_key") == snippetEditorScreenArgs.arguments.containsKey("bundle_is_panel_terminal_key") && getBundleIsPanelTerminalKey() == snippetEditorScreenArgs.getBundleIsPanelTerminalKey();
    }

    public boolean getBundleIsPanelTerminalKey() {
        return ((Boolean) this.arguments.get("bundle_is_panel_terminal_key")).booleanValue();
    }

    public int hashCode() {
        return 31 + (getBundleIsPanelTerminalKey() ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("bundle_is_panel_terminal_key")) {
            bundle.putBoolean("bundle_is_panel_terminal_key", ((Boolean) this.arguments.get("bundle_is_panel_terminal_key")).booleanValue());
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("bundle_is_panel_terminal_key")) {
            Boolean bool = (Boolean) this.arguments.get("bundle_is_panel_terminal_key");
            bool.booleanValue();
            u0Var.h("bundle_is_panel_terminal_key", bool);
        }
        return u0Var;
    }

    public String toString() {
        return "SnippetEditorScreenArgs{bundleIsPanelTerminalKey=" + getBundleIsPanelTerminalKey() + "}";
    }

    private SnippetEditorScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
