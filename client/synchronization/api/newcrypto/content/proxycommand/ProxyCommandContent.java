package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.proxycommand;

import com.server.auditor.ssh.client.database.Column;
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
public final class ProxyCommandContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String hostname;
    private final int port;
    private final String type;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return ProxyCommandContent.serializer;
        }

        public final c serializer() {
            return ProxyCommandContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public ProxyCommandContent() {
        this((String) null, (String) null, 0, 0, 15, (k) null);
    }

    public static /* synthetic */ ProxyCommandContent copy$default(ProxyCommandContent proxyCommandContent, String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = proxyCommandContent.type;
        }
        if ((i12 & 2) != 0) {
            str2 = proxyCommandContent.hostname;
        }
        if ((i12 & 4) != 0) {
            i10 = proxyCommandContent.port;
        }
        if ((i12 & 8) != 0) {
            i11 = proxyCommandContent.version;
        }
        return proxyCommandContent.copy(str, str2, i10, i11);
    }

    @o("hostname")
    public static /* synthetic */ void getHostname$annotations() {
    }

    @o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @o(Column.TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProxyCommandContent proxyCommandContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(proxyCommandContent.type, "http")) {
            dVar.f(fVar, 0, proxyCommandContent.type);
        }
        if (dVar.E(fVar, 1) || !t.b(proxyCommandContent.hostname, "")) {
            dVar.f(fVar, 1, proxyCommandContent.hostname);
        }
        if (dVar.E(fVar, 2) || proxyCommandContent.port != 3128) {
            dVar.t(fVar, 2, proxyCommandContent.port);
        }
        if (!dVar.E(fVar, 3) && proxyCommandContent.version == 1) {
            return;
        }
        dVar.t(fVar, 3, proxyCommandContent.version);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.hostname;
    }

    public final int component3() {
        return this.port;
    }

    public final int component4() {
        return this.version;
    }

    public final ProxyCommandContent copy(String str, String str2, int i10, int i11) {
        t.f(str, Column.TYPE);
        t.f(str2, "hostname");
        return new ProxyCommandContent(str, str2, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProxyCommandContent)) {
            return false;
        }
        ProxyCommandContent proxyCommandContent = (ProxyCommandContent) obj;
        return t.b(this.type, proxyCommandContent.type) && t.b(this.hostname, proxyCommandContent.hostname) && this.port == proxyCommandContent.port && this.version == proxyCommandContent.version;
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final int getPort() {
        return this.port;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.hostname.hashCode()) * 31) + Integer.hashCode(this.port)) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "ProxyCommandContent(type=" + this.type + ", hostname=" + this.hostname + ", port=" + this.port + ", version=" + this.version + ")";
    }

    public /* synthetic */ ProxyCommandContent(int i10, String str, String str2, int i11, int i12, s2 s2Var) {
        this.type = (i10 & 1) == 0 ? "http" : str;
        if ((i10 & 2) == 0) {
            this.hostname = "";
        } else {
            this.hostname = str2;
        }
        if ((i10 & 4) == 0) {
            this.port = 3128;
        } else {
            this.port = i11;
        }
        if ((i10 & 8) == 0) {
            this.version = 1;
        } else {
            this.version = i12;
        }
    }

    public ProxyCommandContent(String str, String str2, int i10, int i11) {
        t.f(str, Column.TYPE);
        t.f(str2, "hostname");
        this.type = str;
        this.hostname = str2;
        this.port = i10;
        this.version = i11;
    }

    public /* synthetic */ ProxyCommandContent(String str, String str2, int i10, int i11, int i12, k kVar) {
        this((i12 & 1) != 0 ? "http" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? 3128 : i10, (i12 & 8) != 0 ? 1 : i11);
    }
}
