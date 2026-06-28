package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetPackageEditorScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f28648a = new HashMap();

        public SnippetPackageEditorScreenArgs a() {
            return new SnippetPackageEditorScreenArgs(this.f28648a);
        }

        public a b(long j10) {
            this.f28648a.put("snippetPackageToEditId", Long.valueOf(j10));
            return this;
        }
    }

    public static SnippetPackageEditorScreenArgs fromBundle(Bundle bundle) {
        SnippetPackageEditorScreenArgs snippetPackageEditorScreenArgs = new SnippetPackageEditorScreenArgs();
        bundle.setClassLoader(SnippetPackageEditorScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("snippetPackageToEditId")) {
            snippetPackageEditorScreenArgs.arguments.put("snippetPackageToEditId", -1L);
            return snippetPackageEditorScreenArgs;
        }
        snippetPackageEditorScreenArgs.arguments.put("snippetPackageToEditId", Long.valueOf(bundle.getLong("snippetPackageToEditId")));
        return snippetPackageEditorScreenArgs;
    }

    public static SnippetPackageEditorScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        SnippetPackageEditorScreenArgs snippetPackageEditorScreenArgs = new SnippetPackageEditorScreenArgs();
        if (!u0Var.b("snippetPackageToEditId")) {
            snippetPackageEditorScreenArgs.arguments.put("snippetPackageToEditId", -1L);
            return snippetPackageEditorScreenArgs;
        }
        Long l10 = (Long) u0Var.c("snippetPackageToEditId");
        l10.longValue();
        snippetPackageEditorScreenArgs.arguments.put("snippetPackageToEditId", l10);
        return snippetPackageEditorScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnippetPackageEditorScreenArgs snippetPackageEditorScreenArgs = (SnippetPackageEditorScreenArgs) obj;
        return this.arguments.containsKey("snippetPackageToEditId") == snippetPackageEditorScreenArgs.arguments.containsKey("snippetPackageToEditId") && getSnippetPackageToEditId() == snippetPackageEditorScreenArgs.getSnippetPackageToEditId();
    }

    public long getSnippetPackageToEditId() {
        return ((Long) this.arguments.get("snippetPackageToEditId")).longValue();
    }

    public int hashCode() {
        return 31 + ((int) (getSnippetPackageToEditId() ^ (getSnippetPackageToEditId() >>> 32)));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("snippetPackageToEditId")) {
            bundle.putLong("snippetPackageToEditId", ((Long) this.arguments.get("snippetPackageToEditId")).longValue());
            return bundle;
        }
        bundle.putLong("snippetPackageToEditId", -1L);
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
        if (!this.arguments.containsKey("snippetPackageToEditId")) {
            u0Var.h("snippetPackageToEditId", -1L);
            return u0Var;
        }
        Long l10 = (Long) this.arguments.get("snippetPackageToEditId");
        l10.longValue();
        u0Var.h("snippetPackageToEditId", l10);
        return u0Var;
    }

    public String toString() {
        return "SnippetPackageEditorScreenArgs{snippetPackageToEditId=" + getSnippetPackageToEditId() + "}";
    }

    private SnippetPackageEditorScreenArgs() {
        this.arguments = new HashMap();
    }

    private SnippetPackageEditorScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
