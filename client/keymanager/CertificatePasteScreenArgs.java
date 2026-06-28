package com.server.auditor.ssh.client.keymanager;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class CertificatePasteScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f27765a;

        public a(String str) {
            HashMap map = new HashMap();
            this.f27765a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"certificateText\" is marked as non-null but was passed a null value.");
            }
            map.put("certificateText", str);
        }

        public CertificatePasteScreenArgs a() {
            return new CertificatePasteScreenArgs(this.f27765a);
        }
    }

    public static CertificatePasteScreenArgs fromBundle(Bundle bundle) {
        CertificatePasteScreenArgs certificatePasteScreenArgs = new CertificatePasteScreenArgs();
        bundle.setClassLoader(CertificatePasteScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("certificateText")) {
            throw new IllegalArgumentException("Required argument \"certificateText\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("certificateText");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"certificateText\" is marked as non-null but was passed a null value.");
        }
        certificatePasteScreenArgs.arguments.put("certificateText", string);
        return certificatePasteScreenArgs;
    }

    public static CertificatePasteScreenArgs fromSavedStateHandle(u0 u0Var) {
        CertificatePasteScreenArgs certificatePasteScreenArgs = new CertificatePasteScreenArgs();
        if (!u0Var.b("certificateText")) {
            throw new IllegalArgumentException("Required argument \"certificateText\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("certificateText");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"certificateText\" is marked as non-null but was passed a null value.");
        }
        certificatePasteScreenArgs.arguments.put("certificateText", str);
        return certificatePasteScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertificatePasteScreenArgs certificatePasteScreenArgs = (CertificatePasteScreenArgs) obj;
        if (this.arguments.containsKey("certificateText") != certificatePasteScreenArgs.arguments.containsKey("certificateText")) {
            return false;
        }
        return getCertificateText() == null ? certificatePasteScreenArgs.getCertificateText() == null : getCertificateText().equals(certificatePasteScreenArgs.getCertificateText());
    }

    public String getCertificateText() {
        return (String) this.arguments.get("certificateText");
    }

    public int hashCode() {
        return 31 + (getCertificateText() != null ? getCertificateText().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("certificateText")) {
            bundle.putString("certificateText", (String) this.arguments.get("certificateText"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("certificateText")) {
            u0Var.h("certificateText", (String) this.arguments.get("certificateText"));
        }
        return u0Var;
    }

    public String toString() {
        return "CertificatePasteScreenArgs{certificateText=" + getCertificateText() + "}";
    }

    private CertificatePasteScreenArgs() {
        this.arguments = new HashMap();
    }

    private CertificatePasteScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}
