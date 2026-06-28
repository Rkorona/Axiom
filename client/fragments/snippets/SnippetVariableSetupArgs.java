package com.server.auditor.ssh.client.fragments.snippets;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.snippet.SnippetSourceOrigin;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetVariableSetupArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26346a;

        public a(boolean z10, int i10, SnippetItem snippetItem, boolean z11, SnippetSourceOrigin snippetSourceOrigin) {
            HashMap map = new HashMap();
            this.f26346a = map;
            map.put("isMultiExecution", Boolean.valueOf(z10));
            map.put("sessionId", Integer.valueOf(i10));
            if (snippetItem == null) {
                throw new IllegalArgumentException("Argument \"snippet\" is marked as non-null but was passed a null value.");
            }
            map.put(Table.SNIPPET, snippetItem);
            map.put("isNeedExecuteImmediately", Boolean.valueOf(z11));
            if (snippetSourceOrigin == null) {
                throw new IllegalArgumentException("Argument \"snippetSource\" is marked as non-null but was passed a null value.");
            }
            map.put("snippetSource", snippetSourceOrigin);
        }

        public SnippetVariableSetupArgs a() {
            return new SnippetVariableSetupArgs(this.f26346a);
        }
    }

    public static SnippetVariableSetupArgs fromBundle(Bundle bundle) {
        SnippetVariableSetupArgs snippetVariableSetupArgs = new SnippetVariableSetupArgs();
        bundle.setClassLoader(SnippetVariableSetupArgs.class.getClassLoader());
        if (!bundle.containsKey("isMultiExecution")) {
            throw new IllegalArgumentException("Required argument \"isMultiExecution\" is missing and does not have an android:defaultValue");
        }
        snippetVariableSetupArgs.arguments.put("isMultiExecution", Boolean.valueOf(bundle.getBoolean("isMultiExecution")));
        if (!bundle.containsKey("sessionId")) {
            throw new IllegalArgumentException("Required argument \"sessionId\" is missing and does not have an android:defaultValue");
        }
        snippetVariableSetupArgs.arguments.put("sessionId", Integer.valueOf(bundle.getInt("sessionId")));
        if (!bundle.containsKey(Table.SNIPPET)) {
            throw new IllegalArgumentException("Required argument \"snippet\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SnippetItem.class) && !Serializable.class.isAssignableFrom(SnippetItem.class)) {
            throw new UnsupportedOperationException(SnippetItem.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        SnippetItem snippetItem = (SnippetItem) bundle.get(Table.SNIPPET);
        if (snippetItem == null) {
            throw new IllegalArgumentException("Argument \"snippet\" is marked as non-null but was passed a null value.");
        }
        snippetVariableSetupArgs.arguments.put(Table.SNIPPET, snippetItem);
        if (!bundle.containsKey("isNeedExecuteImmediately")) {
            throw new IllegalArgumentException("Required argument \"isNeedExecuteImmediately\" is missing and does not have an android:defaultValue");
        }
        snippetVariableSetupArgs.arguments.put("isNeedExecuteImmediately", Boolean.valueOf(bundle.getBoolean("isNeedExecuteImmediately")));
        if (!bundle.containsKey("snippetSource")) {
            throw new IllegalArgumentException("Required argument \"snippetSource\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SnippetSourceOrigin.class) && !Serializable.class.isAssignableFrom(SnippetSourceOrigin.class)) {
            throw new UnsupportedOperationException(SnippetSourceOrigin.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        SnippetSourceOrigin snippetSourceOrigin = (SnippetSourceOrigin) bundle.get("snippetSource");
        if (snippetSourceOrigin == null) {
            throw new IllegalArgumentException("Argument \"snippetSource\" is marked as non-null but was passed a null value.");
        }
        snippetVariableSetupArgs.arguments.put("snippetSource", snippetSourceOrigin);
        return snippetVariableSetupArgs;
    }

    public static SnippetVariableSetupArgs fromSavedStateHandle(u0 u0Var) {
        SnippetVariableSetupArgs snippetVariableSetupArgs = new SnippetVariableSetupArgs();
        if (!u0Var.b("isMultiExecution")) {
            throw new IllegalArgumentException("Required argument \"isMultiExecution\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("isMultiExecution");
        bool.booleanValue();
        snippetVariableSetupArgs.arguments.put("isMultiExecution", bool);
        if (!u0Var.b("sessionId")) {
            throw new IllegalArgumentException("Required argument \"sessionId\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("sessionId");
        num.intValue();
        snippetVariableSetupArgs.arguments.put("sessionId", num);
        if (!u0Var.b(Table.SNIPPET)) {
            throw new IllegalArgumentException("Required argument \"snippet\" is missing and does not have an android:defaultValue");
        }
        SnippetItem snippetItem = (SnippetItem) u0Var.c(Table.SNIPPET);
        if (snippetItem == null) {
            throw new IllegalArgumentException("Argument \"snippet\" is marked as non-null but was passed a null value.");
        }
        snippetVariableSetupArgs.arguments.put(Table.SNIPPET, snippetItem);
        if (!u0Var.b("isNeedExecuteImmediately")) {
            throw new IllegalArgumentException("Required argument \"isNeedExecuteImmediately\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) u0Var.c("isNeedExecuteImmediately");
        bool2.booleanValue();
        snippetVariableSetupArgs.arguments.put("isNeedExecuteImmediately", bool2);
        if (!u0Var.b("snippetSource")) {
            throw new IllegalArgumentException("Required argument \"snippetSource\" is missing and does not have an android:defaultValue");
        }
        SnippetSourceOrigin snippetSourceOrigin = (SnippetSourceOrigin) u0Var.c("snippetSource");
        if (snippetSourceOrigin == null) {
            throw new IllegalArgumentException("Argument \"snippetSource\" is marked as non-null but was passed a null value.");
        }
        snippetVariableSetupArgs.arguments.put("snippetSource", snippetSourceOrigin);
        return snippetVariableSetupArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnippetVariableSetupArgs snippetVariableSetupArgs = (SnippetVariableSetupArgs) obj;
        if (this.arguments.containsKey("isMultiExecution") != snippetVariableSetupArgs.arguments.containsKey("isMultiExecution") || getIsMultiExecution() != snippetVariableSetupArgs.getIsMultiExecution() || this.arguments.containsKey("sessionId") != snippetVariableSetupArgs.arguments.containsKey("sessionId") || getSessionId() != snippetVariableSetupArgs.getSessionId() || this.arguments.containsKey(Table.SNIPPET) != snippetVariableSetupArgs.arguments.containsKey(Table.SNIPPET)) {
            return false;
        }
        if (getSnippet() == null ? snippetVariableSetupArgs.getSnippet() != null : !getSnippet().equals(snippetVariableSetupArgs.getSnippet())) {
            return false;
        }
        if (this.arguments.containsKey("isNeedExecuteImmediately") == snippetVariableSetupArgs.arguments.containsKey("isNeedExecuteImmediately") && getIsNeedExecuteImmediately() == snippetVariableSetupArgs.getIsNeedExecuteImmediately() && this.arguments.containsKey("snippetSource") == snippetVariableSetupArgs.arguments.containsKey("snippetSource")) {
            return getSnippetSource() == null ? snippetVariableSetupArgs.getSnippetSource() == null : getSnippetSource().equals(snippetVariableSetupArgs.getSnippetSource());
        }
        return false;
    }

    public boolean getIsMultiExecution() {
        return ((Boolean) this.arguments.get("isMultiExecution")).booleanValue();
    }

    public boolean getIsNeedExecuteImmediately() {
        return ((Boolean) this.arguments.get("isNeedExecuteImmediately")).booleanValue();
    }

    public int getSessionId() {
        return ((Integer) this.arguments.get("sessionId")).intValue();
    }

    public SnippetItem getSnippet() {
        return (SnippetItem) this.arguments.get(Table.SNIPPET);
    }

    public SnippetSourceOrigin getSnippetSource() {
        return (SnippetSourceOrigin) this.arguments.get("snippetSource");
    }

    public int hashCode() {
        return (((((((((getIsMultiExecution() ? 1 : 0) + 31) * 31) + getSessionId()) * 31) + (getSnippet() != null ? getSnippet().hashCode() : 0)) * 31) + (getIsNeedExecuteImmediately() ? 1 : 0)) * 31) + (getSnippetSource() != null ? getSnippetSource().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("isMultiExecution")) {
            bundle.putBoolean("isMultiExecution", ((Boolean) this.arguments.get("isMultiExecution")).booleanValue());
        }
        if (this.arguments.containsKey("sessionId")) {
            bundle.putInt("sessionId", ((Integer) this.arguments.get("sessionId")).intValue());
        }
        if (this.arguments.containsKey(Table.SNIPPET)) {
            SnippetItem snippetItem = (SnippetItem) this.arguments.get(Table.SNIPPET);
            if (Parcelable.class.isAssignableFrom(SnippetItem.class) || snippetItem == null) {
                bundle.putParcelable(Table.SNIPPET, (Parcelable) Parcelable.class.cast(snippetItem));
            } else {
                if (!Serializable.class.isAssignableFrom(SnippetItem.class)) {
                    throw new UnsupportedOperationException(SnippetItem.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable(Table.SNIPPET, (Serializable) Serializable.class.cast(snippetItem));
            }
        }
        if (this.arguments.containsKey("isNeedExecuteImmediately")) {
            bundle.putBoolean("isNeedExecuteImmediately", ((Boolean) this.arguments.get("isNeedExecuteImmediately")).booleanValue());
        }
        if (this.arguments.containsKey("snippetSource")) {
            SnippetSourceOrigin snippetSourceOrigin = (SnippetSourceOrigin) this.arguments.get("snippetSource");
            if (!Parcelable.class.isAssignableFrom(SnippetSourceOrigin.class) && snippetSourceOrigin != null) {
                if (Serializable.class.isAssignableFrom(SnippetSourceOrigin.class)) {
                    bundle.putSerializable("snippetSource", (Serializable) Serializable.class.cast(snippetSourceOrigin));
                    return bundle;
                }
                throw new UnsupportedOperationException(SnippetSourceOrigin.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("snippetSource", (Parcelable) Parcelable.class.cast(snippetSourceOrigin));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("isMultiExecution")) {
            Boolean bool = (Boolean) this.arguments.get("isMultiExecution");
            bool.booleanValue();
            u0Var.h("isMultiExecution", bool);
        }
        if (this.arguments.containsKey("sessionId")) {
            Integer num = (Integer) this.arguments.get("sessionId");
            num.intValue();
            u0Var.h("sessionId", num);
        }
        if (this.arguments.containsKey(Table.SNIPPET)) {
            SnippetItem snippetItem = (SnippetItem) this.arguments.get(Table.SNIPPET);
            if (Parcelable.class.isAssignableFrom(SnippetItem.class) || snippetItem == null) {
                u0Var.h(Table.SNIPPET, (Parcelable) Parcelable.class.cast(snippetItem));
            } else {
                if (!Serializable.class.isAssignableFrom(SnippetItem.class)) {
                    throw new UnsupportedOperationException(SnippetItem.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                u0Var.h(Table.SNIPPET, (Serializable) Serializable.class.cast(snippetItem));
            }
        }
        if (this.arguments.containsKey("isNeedExecuteImmediately")) {
            Boolean bool2 = (Boolean) this.arguments.get("isNeedExecuteImmediately");
            bool2.booleanValue();
            u0Var.h("isNeedExecuteImmediately", bool2);
        }
        if (this.arguments.containsKey("snippetSource")) {
            SnippetSourceOrigin snippetSourceOrigin = (SnippetSourceOrigin) this.arguments.get("snippetSource");
            if (!Parcelable.class.isAssignableFrom(SnippetSourceOrigin.class) && snippetSourceOrigin != null) {
                if (Serializable.class.isAssignableFrom(SnippetSourceOrigin.class)) {
                    u0Var.h("snippetSource", (Serializable) Serializable.class.cast(snippetSourceOrigin));
                    return u0Var;
                }
                throw new UnsupportedOperationException(SnippetSourceOrigin.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("snippetSource", (Parcelable) Parcelable.class.cast(snippetSourceOrigin));
        }
        return u0Var;
    }

    public String toString() {
        return "SnippetVariableSetupArgs{isMultiExecution=" + getIsMultiExecution() + ", sessionId=" + getSessionId() + ", snippet=" + getSnippet() + ", isNeedExecuteImmediately=" + getIsNeedExecuteImmediately() + ", snippetSource=" + getSnippetSource() + "}";
    }

    private SnippetVariableSetupArgs() {
        this.arguments = new HashMap();
    }

    private SnippetVariableSetupArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
