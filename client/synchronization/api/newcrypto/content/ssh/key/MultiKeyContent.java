package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.key;

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
public final class MultiKeyContent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final String username;
    private final int version;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return MultiKeyContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public MultiKeyContent() {
        this((String) null, (String) null, 0, 7, (k) null);
    }

    public static /* synthetic */ MultiKeyContent copy$default(MultiKeyContent multiKeyContent, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = multiKeyContent.name;
        }
        if ((i11 & 2) != 0) {
            str2 = multiKeyContent.username;
        }
        if ((i11 & 4) != 0) {
            i10 = multiKeyContent.version;
        }
        return multiKeyContent.copy(str, str2, i10);
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    @o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MultiKeyContent multiKeyContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(multiKeyContent.name, "")) {
            dVar.f(fVar, 0, multiKeyContent.name);
        }
        if (dVar.E(fVar, 1) || multiKeyContent.username != null) {
            dVar.v(fVar, 1, x2.f64817a, multiKeyContent.username);
        }
        if (!dVar.E(fVar, 2) && multiKeyContent.version == 1) {
            return;
        }
        dVar.t(fVar, 2, multiKeyContent.version);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.username;
    }

    public final int component3() {
        return this.version;
    }

    public final MultiKeyContent copy(String str, String str2, int i10) {
        t.f(str, Column.MULTI_KEY_NAME);
        return new MultiKeyContent(str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiKeyContent)) {
            return false;
        }
        MultiKeyContent multiKeyContent = (MultiKeyContent) obj;
        return t.b(this.name, multiKeyContent.name) && t.b(this.username, multiKeyContent.username) && this.version == multiKeyContent.version;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUsername() {
        return this.username;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.username;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "MultiKeyContent(name=" + this.name + ", username=" + this.username + ", version=" + this.version + ")";
    }

    public /* synthetic */ MultiKeyContent(int i10, String str, String str2, int i11, s2 s2Var) {
        this.name = (i10 & 1) == 0 ? "" : str;
        if ((i10 & 2) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        if ((i10 & 4) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public MultiKeyContent(String str, String str2, int i10) {
        t.f(str, Column.MULTI_KEY_NAME);
        this.name = str;
        this.username = str2;
        this.version = i10;
    }

    public /* synthetic */ MultiKeyContent(String str, String str2, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 1 : i10);
    }
}
