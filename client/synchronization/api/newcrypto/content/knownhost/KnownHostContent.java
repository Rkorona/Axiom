package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.knownhost;

import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class KnownHostContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String hostnames;
    private final String key;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return KnownHostContent.serializer;
        }

        public final c serializer() {
            return KnownHostContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public KnownHostContent() {
        this((String) null, (String) null, 0, 7, (k) null);
    }

    public static /* synthetic */ KnownHostContent copy$default(KnownHostContent knownHostContent, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = knownHostContent.hostnames;
        }
        if ((i11 & 2) != 0) {
            str2 = knownHostContent.key;
        }
        if ((i11 & 4) != 0) {
            i10 = knownHostContent.version;
        }
        return knownHostContent.copy(str, str2, i10);
    }

    @o(Column.HOSTNAMES)
    public static /* synthetic */ void getHostnames$annotations() {
    }

    @o(SerializableEvent.KEY_FIELD)
    public static /* synthetic */ void getKey$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(KnownHostContent knownHostContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(knownHostContent.hostnames, "")) {
            dVar.f(fVar, 0, knownHostContent.hostnames);
        }
        if (dVar.E(fVar, 1) || !t.b(knownHostContent.key, "")) {
            dVar.f(fVar, 1, knownHostContent.key);
        }
        if (!dVar.E(fVar, 2) && knownHostContent.version == 1) {
            return;
        }
        dVar.t(fVar, 2, knownHostContent.version);
    }

    public final String component1() {
        return this.hostnames;
    }

    public final String component2() {
        return this.key;
    }

    public final int component3() {
        return this.version;
    }

    public final KnownHostContent copy(String str, String str2, int i10) {
        t.f(str, Column.HOSTNAMES);
        t.f(str2, SerializableEvent.KEY_FIELD);
        return new KnownHostContent(str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KnownHostContent)) {
            return false;
        }
        KnownHostContent knownHostContent = (KnownHostContent) obj;
        return t.b(this.hostnames, knownHostContent.hostnames) && t.b(this.key, knownHostContent.key) && this.version == knownHostContent.version;
    }

    public final String getHostnames() {
        return this.hostnames;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.hostnames.hashCode() * 31) + this.key.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "KnownHostContent(hostnames=" + this.hostnames + ", key=" + this.key + ", version=" + this.version + ")";
    }

    public /* synthetic */ KnownHostContent(int i10, String str, String str2, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.hostnames = "";
        } else {
            this.hostnames = str;
        }
        if ((i10 & 2) == 0) {
            this.key = "";
        } else {
            this.key = str2;
        }
        if ((i10 & 4) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public KnownHostContent(String str, String str2, int i10) {
        t.f(str, Column.HOSTNAMES);
        t.f(str2, SerializableEvent.KEY_FIELD);
        this.hostnames = str;
        this.key = str2;
        this.version = i10;
    }

    public /* synthetic */ KnownHostContent(String str, String str2, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 1 : i10);
    }
}
