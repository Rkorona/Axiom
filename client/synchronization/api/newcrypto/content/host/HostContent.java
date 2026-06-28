package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host;

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
public final class HostContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String address;
    private final String backspace;
    private final String interactionDate;
    private final String label;
    private final String osName;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return HostContent.serializer;
        }

        public final c serializer() {
            return HostContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public HostContent() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, 63, (k) null);
    }

    public static /* synthetic */ HostContent copy$default(HostContent hostContent, String str, String str2, String str3, String str4, String str5, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hostContent.label;
        }
        if ((i11 & 2) != 0) {
            str2 = hostContent.address;
        }
        if ((i11 & 4) != 0) {
            str3 = hostContent.osName;
        }
        if ((i11 & 8) != 0) {
            str4 = hostContent.backspace;
        }
        if ((i11 & 16) != 0) {
            str5 = hostContent.interactionDate;
        }
        if ((i11 & 32) != 0) {
            i10 = hostContent.version;
        }
        String str6 = str5;
        int i12 = i10;
        return hostContent.copy(str, str2, str3, str4, str6, i12);
    }

    @o(Column.ADDRESS)
    public static /* synthetic */ void getAddress$annotations() {
    }

    @o("backspace")
    public static /* synthetic */ void getBackspace$annotations() {
    }

    @o(Column.INTERACTION_DATE)
    public static /* synthetic */ void getInteractionDate$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o("os_name")
    public static /* synthetic */ void getOsName$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HostContent hostContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(hostContent.label, "")) {
            dVar.f(fVar, 0, hostContent.label);
        }
        if (dVar.E(fVar, 1) || !t.b(hostContent.address, "")) {
            dVar.f(fVar, 1, hostContent.address);
        }
        if (dVar.E(fVar, 2) || !t.b(hostContent.osName, "")) {
            dVar.f(fVar, 2, hostContent.osName);
        }
        if (dVar.E(fVar, 3) || !t.b(hostContent.backspace, HostContentKt.BACKSPACE_TYPE_DEFAULT)) {
            dVar.f(fVar, 3, hostContent.backspace);
        }
        if (dVar.E(fVar, 4) || hostContent.interactionDate != null) {
            dVar.v(fVar, 4, x2.f64817a, hostContent.interactionDate);
        }
        if (!dVar.E(fVar, 5) && hostContent.version == 1) {
            return;
        }
        dVar.t(fVar, 5, hostContent.version);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.address;
    }

    public final String component3() {
        return this.osName;
    }

    public final String component4() {
        return this.backspace;
    }

    public final String component5() {
        return this.interactionDate;
    }

    public final int component6() {
        return this.version;
    }

    public final HostContent copy(String str, String str2, String str3, String str4, String str5, int i10) {
        t.f(str, "label");
        t.f(str2, Column.ADDRESS);
        t.f(str3, "osName");
        t.f(str4, "backspace");
        return new HostContent(str, str2, str3, str4, str5, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostContent)) {
            return false;
        }
        HostContent hostContent = (HostContent) obj;
        return t.b(this.label, hostContent.label) && t.b(this.address, hostContent.address) && t.b(this.osName, hostContent.osName) && t.b(this.backspace, hostContent.backspace) && t.b(this.interactionDate, hostContent.interactionDate) && this.version == hostContent.version;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getBackspace() {
        return this.backspace;
    }

    public final String getInteractionDate() {
        return this.interactionDate;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((((this.label.hashCode() * 31) + this.address.hashCode()) * 31) + this.osName.hashCode()) * 31) + this.backspace.hashCode()) * 31;
        String str = this.interactionDate;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "HostContent(label=" + this.label + ", address=" + this.address + ", osName=" + this.osName + ", backspace=" + this.backspace + ", interactionDate=" + this.interactionDate + ", version=" + this.version + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostContent(String str) {
        this(str, (String) null, (String) null, (String) null, (String) null, 0, 62, (k) null);
        t.f(str, "label");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostContent(String str, String str2) {
        this(str, str2, (String) null, (String) null, (String) null, 0, 60, (k) null);
        t.f(str, "label");
        t.f(str2, Column.ADDRESS);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostContent(String str, String str2, String str3) {
        this(str, str2, str3, (String) null, (String) null, 0, 56, (k) null);
        t.f(str, "label");
        t.f(str2, Column.ADDRESS);
        t.f(str3, "osName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostContent(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, (String) null, 0, 48, (k) null);
        t.f(str, "label");
        t.f(str2, Column.ADDRESS);
        t.f(str3, "osName");
        t.f(str4, "backspace");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostContent(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, 0, 32, (k) null);
        t.f(str, "label");
        t.f(str2, Column.ADDRESS);
        t.f(str3, "osName");
        t.f(str4, "backspace");
    }

    public /* synthetic */ HostContent(int i10, String str, String str2, String str3, String str4, String str5, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i10 & 2) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        if ((i10 & 4) == 0) {
            this.osName = "";
        } else {
            this.osName = str3;
        }
        if ((i10 & 8) == 0) {
            this.backspace = HostContentKt.BACKSPACE_TYPE_DEFAULT;
        } else {
            this.backspace = str4;
        }
        if ((i10 & 16) == 0) {
            this.interactionDate = null;
        } else {
            this.interactionDate = str5;
        }
        if ((i10 & 32) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public HostContent(String str, String str2, String str3, String str4, String str5, int i10) {
        t.f(str, "label");
        t.f(str2, Column.ADDRESS);
        t.f(str3, "osName");
        t.f(str4, "backspace");
        this.label = str;
        this.address = str2;
        this.osName = str3;
        this.backspace = str4;
        this.interactionDate = str5;
        this.version = i10;
    }

    public /* synthetic */ HostContent(String str, String str2, String str3, String str4, String str5, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? HostContentKt.BACKSPACE_TYPE_DEFAULT : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? 1 : i10);
    }
}
