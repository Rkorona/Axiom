package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.snippet;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class PackageContent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String label;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return PackageContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PackageContent() {
        this((String) null, 1, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ PackageContent copy$default(PackageContent packageContent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = packageContent.label;
        }
        return packageContent.copy(str);
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PackageContent packageContent, d dVar, f fVar) {
        if (!dVar.E(fVar, 0) && t.b(packageContent.label, "")) {
            return;
        }
        dVar.f(fVar, 0, packageContent.label);
    }

    public final String component1() {
        return this.label;
    }

    public final PackageContent copy(String str) {
        t.f(str, "label");
        return new PackageContent(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PackageContent) && t.b(this.label, ((PackageContent) obj).label);
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode();
    }

    public String toString() {
        return "PackageContent(label=" + this.label + ")";
    }

    public /* synthetic */ PackageContent(int i10, String str, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
    }

    public PackageContent(String str) {
        t.f(str, "label");
        this.label = str;
    }

    public /* synthetic */ PackageContent(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
