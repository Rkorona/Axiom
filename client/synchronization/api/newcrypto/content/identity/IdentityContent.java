package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.identity;

import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class IdentityContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final boolean isVisible;
    private final String label;
    private final String password;
    private final String username;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return IdentityContent.serializer;
        }

        public final c serializer() {
            return IdentityContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public IdentityContent() {
        this((String) null, (String) null, false, (String) null, 0, 31, (k) null);
    }

    public static /* synthetic */ IdentityContent copy$default(IdentityContent identityContent, String str, String str2, boolean z10, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = identityContent.username;
        }
        if ((i11 & 2) != 0) {
            str2 = identityContent.password;
        }
        if ((i11 & 4) != 0) {
            z10 = identityContent.isVisible;
        }
        if ((i11 & 8) != 0) {
            str3 = identityContent.label;
        }
        if ((i11 & 16) != 0) {
            i10 = identityContent.version;
        }
        int i12 = i10;
        boolean z11 = z10;
        return identityContent.copy(str, str2, z11, str3, i12);
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o("password")
    public static /* synthetic */ void getPassword$annotations() {
    }

    @o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    @o(Column.IS_VISIBLE)
    public static /* synthetic */ void isVisible$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IdentityContent identityContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || identityContent.username != null) {
            dVar.v(fVar, 0, x2.f64817a, identityContent.username);
        }
        if (dVar.E(fVar, 1) || identityContent.password != null) {
            dVar.v(fVar, 1, x2.f64817a, identityContent.password);
        }
        if (dVar.E(fVar, 2) || identityContent.isVisible) {
            dVar.u(fVar, 2, identityContent.isVisible);
        }
        if (dVar.E(fVar, 3) || !t.b(identityContent.label, "")) {
            dVar.f(fVar, 3, identityContent.label);
        }
        if (!dVar.E(fVar, 4) && identityContent.version == 1) {
            return;
        }
        dVar.t(fVar, 4, identityContent.version);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.password;
    }

    public final boolean component3() {
        return this.isVisible;
    }

    public final String component4() {
        return this.label;
    }

    public final int component5() {
        return this.version;
    }

    public final IdentityContent copy(String str, String str2, boolean z10, String str3, int i10) {
        t.f(str3, "label");
        return new IdentityContent(str, str2, z10, str3, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityContent)) {
            return false;
        }
        IdentityContent identityContent = (IdentityContent) obj;
        return t.b(this.username, identityContent.username) && t.b(this.password, identityContent.password) && this.isVisible == identityContent.isVisible && t.b(this.label, identityContent.label) && this.version == identityContent.version;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        return "IdentityContent(username=" + this.username + ", password=" + this.password + ", isVisible=" + this.isVisible + ", label=" + this.label + ", version=" + this.version + ")";
    }

    public /* synthetic */ IdentityContent(int i10, String str, String str2, boolean z10, String str3, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.username = null;
        } else {
            this.username = str;
        }
        if ((i10 & 2) == 0) {
            this.password = null;
        } else {
            this.password = str2;
        }
        if ((i10 & 4) == 0) {
            this.isVisible = false;
        } else {
            this.isVisible = z10;
        }
        if ((i10 & 8) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i10 & 16) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public IdentityContent(String str, String str2, boolean z10, String str3, int i10) {
        t.f(str3, "label");
        this.username = str;
        this.password = str2;
        this.isVisible = z10;
        this.label = str3;
        this.version = i10;
    }

    public /* synthetic */ IdentityContent(String str, String str2, boolean z10, String str3, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? 1 : i10);
    }
}
