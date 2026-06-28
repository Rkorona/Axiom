package com.server.auditor.ssh.client.fragments.quickimport;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.ImportOptionType;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.quickimport.a$a, reason: collision with other inner class name */
    public static class C0411a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26159a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26159a.containsKey("importOptionType")) {
                ImportOptionType importOptionType = (ImportOptionType) this.f26159a.get("importOptionType");
                if (!Parcelable.class.isAssignableFrom(ImportOptionType.class) && importOptionType != null) {
                    if (Serializable.class.isAssignableFrom(ImportOptionType.class)) {
                        bundle.putSerializable("importOptionType", (Serializable) Serializable.class.cast(importOptionType));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(ImportOptionType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("importOptionType", (Parcelable) Parcelable.class.cast(importOptionType));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_quickImportMainScreen_to_quickImportOptionScreen;
        }

        public ImportOptionType c() {
            return (ImportOptionType) this.f26159a.get("importOptionType");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0411a c0411a = (C0411a) obj;
            if (this.f26159a.containsKey("importOptionType") != c0411a.f26159a.containsKey("importOptionType")) {
                return false;
            }
            if (c() == null ? c0411a.c() == null : c().equals(c0411a.c())) {
                return b() == c0411a.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionQuickImportMainScreenToQuickImportOptionScreen(actionId=" + b() + "){importOptionType=" + c() + "}";
        }

        private C0411a(ImportOptionType importOptionType) {
            HashMap map = new HashMap();
            this.f26159a = map;
            if (importOptionType == null) {
                throw new IllegalArgumentException("Argument \"importOptionType\" is marked as non-null but was passed a null value.");
            }
            map.put("importOptionType", importOptionType);
        }
    }

    public static C0411a a(ImportOptionType importOptionType) {
        return new C0411a(importOptionType);
    }
}
