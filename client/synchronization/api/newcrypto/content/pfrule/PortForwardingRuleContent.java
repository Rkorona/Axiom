package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.pfrule;

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
public final class PortForwardingRuleContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String boundAddress;
    private final String hostname;
    private final String label;
    private final int localPort;
    private final String pfType;
    private final int remotePort;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return PortForwardingRuleContent.serializer;
        }

        public final c serializer() {
            return PortForwardingRuleContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public PortForwardingRuleContent() {
        this((String) null, 0, 0, (String) null, (String) null, (String) null, 0, 127, (k) null);
    }

    public static /* synthetic */ PortForwardingRuleContent copy$default(PortForwardingRuleContent portForwardingRuleContent, String str, int i10, int i11, String str2, String str3, String str4, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = portForwardingRuleContent.hostname;
        }
        if ((i13 & 2) != 0) {
            i10 = portForwardingRuleContent.localPort;
        }
        if ((i13 & 4) != 0) {
            i11 = portForwardingRuleContent.remotePort;
        }
        if ((i13 & 8) != 0) {
            str2 = portForwardingRuleContent.pfType;
        }
        if ((i13 & 16) != 0) {
            str3 = portForwardingRuleContent.label;
        }
        if ((i13 & 32) != 0) {
            str4 = portForwardingRuleContent.boundAddress;
        }
        if ((i13 & 64) != 0) {
            i12 = portForwardingRuleContent.version;
        }
        String str5 = str4;
        int i14 = i12;
        String str6 = str3;
        int i15 = i11;
        return portForwardingRuleContent.copy(str, i10, i15, str2, str6, str5, i14);
    }

    @o(Column.BOUND_ADDRESS)
    public static /* synthetic */ void getBoundAddress$annotations() {
    }

    @o("hostname")
    public static /* synthetic */ void getHostname$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(Column.LOCAL_PORT)
    public static /* synthetic */ void getLocalPort$annotations() {
    }

    @o("pf_type")
    public static /* synthetic */ void getPfType$annotations() {
    }

    @o(Column.REMOTE_PORT)
    public static /* synthetic */ void getRemotePort$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PortForwardingRuleContent portForwardingRuleContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(portForwardingRuleContent.hostname, "")) {
            dVar.f(fVar, 0, portForwardingRuleContent.hostname);
        }
        if (dVar.E(fVar, 1) || portForwardingRuleContent.localPort != 0) {
            dVar.t(fVar, 1, portForwardingRuleContent.localPort);
        }
        if (dVar.E(fVar, 2) || portForwardingRuleContent.remotePort != 0) {
            dVar.t(fVar, 2, portForwardingRuleContent.remotePort);
        }
        if (dVar.E(fVar, 3) || !t.b(portForwardingRuleContent.pfType, "Local Rule")) {
            dVar.f(fVar, 3, portForwardingRuleContent.pfType);
        }
        if (dVar.E(fVar, 4) || !t.b(portForwardingRuleContent.label, "")) {
            dVar.f(fVar, 4, portForwardingRuleContent.label);
        }
        if (dVar.E(fVar, 5) || !t.b(portForwardingRuleContent.boundAddress, "127.0.0.1")) {
            dVar.f(fVar, 5, portForwardingRuleContent.boundAddress);
        }
        if (!dVar.E(fVar, 6) && portForwardingRuleContent.version == 1) {
            return;
        }
        dVar.t(fVar, 6, portForwardingRuleContent.version);
    }

    public final String component1() {
        return this.hostname;
    }

    public final int component2() {
        return this.localPort;
    }

    public final int component3() {
        return this.remotePort;
    }

    public final String component4() {
        return this.pfType;
    }

    public final String component5() {
        return this.label;
    }

    public final String component6() {
        return this.boundAddress;
    }

    public final int component7() {
        return this.version;
    }

    public final PortForwardingRuleContent copy(String str, int i10, int i11, String str2, String str3, String str4, int i12) {
        t.f(str, "hostname");
        t.f(str2, "pfType");
        t.f(str3, "label");
        t.f(str4, "boundAddress");
        return new PortForwardingRuleContent(str, i10, i11, str2, str3, str4, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortForwardingRuleContent)) {
            return false;
        }
        PortForwardingRuleContent portForwardingRuleContent = (PortForwardingRuleContent) obj;
        return t.b(this.hostname, portForwardingRuleContent.hostname) && this.localPort == portForwardingRuleContent.localPort && this.remotePort == portForwardingRuleContent.remotePort && t.b(this.pfType, portForwardingRuleContent.pfType) && t.b(this.label, portForwardingRuleContent.label) && t.b(this.boundAddress, portForwardingRuleContent.boundAddress) && this.version == portForwardingRuleContent.version;
    }

    public final String getBoundAddress() {
        return this.boundAddress;
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getLocalPort() {
        return this.localPort;
    }

    public final String getPfType() {
        return this.pfType;
    }

    public final int getRemotePort() {
        return this.remotePort;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((this.hostname.hashCode() * 31) + Integer.hashCode(this.localPort)) * 31) + Integer.hashCode(this.remotePort)) * 31) + this.pfType.hashCode()) * 31) + this.label.hashCode()) * 31) + this.boundAddress.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "PortForwardingRuleContent(hostname=" + this.hostname + ", localPort=" + this.localPort + ", remotePort=" + this.remotePort + ", pfType=" + this.pfType + ", label=" + this.label + ", boundAddress=" + this.boundAddress + ", version=" + this.version + ")";
    }

    public /* synthetic */ PortForwardingRuleContent(int i10, String str, int i11, int i12, String str2, String str3, String str4, int i13, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.hostname = "";
        } else {
            this.hostname = str;
        }
        if ((i10 & 2) == 0) {
            this.localPort = 0;
        } else {
            this.localPort = i11;
        }
        if ((i10 & 4) == 0) {
            this.remotePort = 0;
        } else {
            this.remotePort = i12;
        }
        if ((i10 & 8) == 0) {
            this.pfType = "Local Rule";
        } else {
            this.pfType = str2;
        }
        if ((i10 & 16) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i10 & 32) == 0) {
            this.boundAddress = "127.0.0.1";
        } else {
            this.boundAddress = str4;
        }
        if ((i10 & 64) == 0) {
            this.version = 1;
        } else {
            this.version = i13;
        }
    }

    public PortForwardingRuleContent(String str, int i10, int i11, String str2, String str3, String str4, int i12) {
        t.f(str, "hostname");
        t.f(str2, "pfType");
        t.f(str3, "label");
        t.f(str4, "boundAddress");
        this.hostname = str;
        this.localPort = i10;
        this.remotePort = i11;
        this.pfType = str2;
        this.label = str3;
        this.boundAddress = str4;
        this.version = i12;
    }

    public /* synthetic */ PortForwardingRuleContent(String str, int i10, int i11, String str2, String str3, String str4, int i12, int i13, k kVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? "Local Rule" : str2, (i13 & 16) != 0 ? "" : str3, (i13 & 32) != 0 ? "127.0.0.1" : str4, (i13 & 64) != 0 ? 1 : i12);
    }
}
