package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.config;

import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.i;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SshConfigContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final Boolean agentForwarding;
    private final String charset;
    private final String colorScheme;
    private final String envVariables;
    private final String moshServerCommand;
    private final Integer port;
    private final Boolean useMosh;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return SshConfigContent.serializer;
        }

        public final c serializer() {
            return SshConfigContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public SshConfigContent() {
        this((Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, 0, 255, (k) null);
    }

    public static /* synthetic */ SshConfigContent copy$default(SshConfigContent sshConfigContent, Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = sshConfigContent.useMosh;
        }
        if ((i11 & 2) != 0) {
            bool2 = sshConfigContent.agentForwarding;
        }
        if ((i11 & 4) != 0) {
            str = sshConfigContent.moshServerCommand;
        }
        if ((i11 & 8) != 0) {
            str2 = sshConfigContent.envVariables;
        }
        if ((i11 & 16) != 0) {
            num = sshConfigContent.port;
        }
        if ((i11 & 32) != 0) {
            str3 = sshConfigContent.charset;
        }
        if ((i11 & 64) != 0) {
            str4 = sshConfigContent.colorScheme;
        }
        if ((i11 & 128) != 0) {
            i10 = sshConfigContent.version;
        }
        String str5 = str4;
        int i12 = i10;
        Integer num2 = num;
        String str6 = str3;
        return sshConfigContent.copy(bool, bool2, str, str2, num2, str6, str5, i12);
    }

    @o("agent_forwarding")
    public static /* synthetic */ void getAgentForwarding$annotations() {
    }

    @o(Column.CHARSET)
    public static /* synthetic */ void getCharset$annotations() {
    }

    @o("color_scheme")
    public static /* synthetic */ void getColorScheme$annotations() {
    }

    @o(Column.ENVIRONMENT_VARIABLES)
    public static /* synthetic */ void getEnvVariables$annotations() {
    }

    @o(Column.MOSH_SERVER_COMMAND)
    public static /* synthetic */ void getMoshServerCommand$annotations() {
    }

    @o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @o(SshOptions.EXTRA_SSH_USE_MOSH)
    public static /* synthetic */ void getUseMosh$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshConfigContent sshConfigContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshConfigContent.useMosh != null) {
            dVar.v(fVar, 0, i.f64704a, sshConfigContent.useMosh);
        }
        if (dVar.E(fVar, 1) || sshConfigContent.agentForwarding != null) {
            dVar.v(fVar, 1, i.f64704a, sshConfigContent.agentForwarding);
        }
        if (dVar.E(fVar, 2) || sshConfigContent.moshServerCommand != null) {
            dVar.v(fVar, 2, x2.f64817a, sshConfigContent.moshServerCommand);
        }
        if (dVar.E(fVar, 3) || sshConfigContent.envVariables != null) {
            dVar.v(fVar, 3, x2.f64817a, sshConfigContent.envVariables);
        }
        if (dVar.E(fVar, 4) || sshConfigContent.port != null) {
            dVar.v(fVar, 4, w0.f64808a, sshConfigContent.port);
        }
        if (dVar.E(fVar, 5) || sshConfigContent.charset != null) {
            dVar.v(fVar, 5, x2.f64817a, sshConfigContent.charset);
        }
        if (dVar.E(fVar, 6) || sshConfigContent.colorScheme != null) {
            dVar.v(fVar, 6, x2.f64817a, sshConfigContent.colorScheme);
        }
        if (!dVar.E(fVar, 7) && sshConfigContent.version == 1) {
            return;
        }
        dVar.t(fVar, 7, sshConfigContent.version);
    }

    public final Boolean component1() {
        return this.useMosh;
    }

    public final Boolean component2() {
        return this.agentForwarding;
    }

    public final String component3() {
        return this.moshServerCommand;
    }

    public final String component4() {
        return this.envVariables;
    }

    public final Integer component5() {
        return this.port;
    }

    public final String component6() {
        return this.charset;
    }

    public final String component7() {
        return this.colorScheme;
    }

    public final int component8() {
        return this.version;
    }

    public final SshConfigContent copy(Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, int i10) {
        return new SshConfigContent(bool, bool2, str, str2, num, str3, str4, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshConfigContent)) {
            return false;
        }
        SshConfigContent sshConfigContent = (SshConfigContent) obj;
        return t.b(this.useMosh, sshConfigContent.useMosh) && t.b(this.agentForwarding, sshConfigContent.agentForwarding) && t.b(this.moshServerCommand, sshConfigContent.moshServerCommand) && t.b(this.envVariables, sshConfigContent.envVariables) && t.b(this.port, sshConfigContent.port) && t.b(this.charset, sshConfigContent.charset) && t.b(this.colorScheme, sshConfigContent.colorScheme) && this.version == sshConfigContent.version;
    }

    public final Boolean getAgentForwarding() {
        return this.agentForwarding;
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getColorScheme() {
        return this.colorScheme;
    }

    public final String getEnvVariables() {
        return this.envVariables;
    }

    public final String getMoshServerCommand() {
        return this.moshServerCommand;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final Boolean getUseMosh() {
        return this.useMosh;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        Boolean bool = this.useMosh;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.agentForwarding;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.moshServerCommand;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.envVariables;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.port;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.charset;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.colorScheme;
        return ((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "SshConfigContent(useMosh=" + this.useMosh + ", agentForwarding=" + this.agentForwarding + ", moshServerCommand=" + this.moshServerCommand + ", envVariables=" + this.envVariables + ", port=" + this.port + ", charset=" + this.charset + ", colorScheme=" + this.colorScheme + ", version=" + this.version + ")";
    }

    public /* synthetic */ SshConfigContent(int i10, Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.useMosh = null;
        } else {
            this.useMosh = bool;
        }
        if ((i10 & 2) == 0) {
            this.agentForwarding = null;
        } else {
            this.agentForwarding = bool2;
        }
        if ((i10 & 4) == 0) {
            this.moshServerCommand = null;
        } else {
            this.moshServerCommand = str;
        }
        if ((i10 & 8) == 0) {
            this.envVariables = null;
        } else {
            this.envVariables = str2;
        }
        if ((i10 & 16) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        if ((i10 & 32) == 0) {
            this.charset = null;
        } else {
            this.charset = str3;
        }
        if ((i10 & 64) == 0) {
            this.colorScheme = null;
        } else {
            this.colorScheme = str4;
        }
        if ((i10 & 128) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public SshConfigContent(Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, int i10) {
        this.useMosh = bool;
        this.agentForwarding = bool2;
        this.moshServerCommand = str;
        this.envVariables = str2;
        this.port = num;
        this.charset = str3;
        this.colorScheme = str4;
        this.version = i10;
    }

    public /* synthetic */ SshConfigContent(Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? 1 : i10);
    }
}
