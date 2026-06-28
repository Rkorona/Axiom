package com.server.auditor.ssh.client.synchronization.api.models.ssh.config;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId$$serializer;
import gg.a;
import gg.b;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.h1;
import lv.i;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SshConfigFullData implements Shareable, CryptoErrorInterface {
    private String charset;
    private String colorScheme;

    @b
    public String content;
    private Boolean cursorBlink;
    private Long encryptedWith;

    @a
    public String envVariables;
    private Integer fontSize;
    private Boolean forwardPorts;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39062id;
    private WithRecourseId identityId;
    private Boolean isShared;
    private Integer keepAlivePackages;
    private Long localId;
    private final String moshServerCommand;
    private Integer port;
    private WithRecourseId proxyId;
    private WithRecourseId startupSnippetId;
    private Boolean strictHostKeyCheck;
    private Integer timeout;
    private String updatedAt;
    private Boolean useAgentForwarding;
    private Boolean useMosh;
    private Boolean useSshKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SshConfigFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SshConfigFullData(int i10, int i11, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, WithRecourseId withRecourseId3, String str2, String str3, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, Boolean bool7, String str6, Long l11, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SshConfigFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39062id = i11;
        if ((i10 & 2) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str;
        }
        if ((i10 & 4) == 0) {
            this.identityId = null;
        } else {
            this.identityId = withRecourseId;
        }
        if ((i10 & 8) == 0) {
            this.proxyId = null;
        } else {
            this.proxyId = withRecourseId2;
        }
        if ((i10 & 16) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 32) == 0) {
            this.startupSnippetId = null;
        } else {
            this.startupSnippetId = withRecourseId3;
        }
        if ((i10 & 64) == 0) {
            this.colorScheme = null;
        } else {
            this.colorScheme = str2;
        }
        if ((i10 & 128) == 0) {
            this.charset = null;
        } else {
            this.charset = str3;
        }
        if ((i10 & 256) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num2;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.strictHostKeyCheck = null;
        } else {
            this.strictHostKeyCheck = bool;
        }
        if ((i10 & 2048) == 0) {
            this.useSshKey = null;
        } else {
            this.useSshKey = bool2;
        }
        if ((i10 & 4096) == 0) {
            this.timeout = null;
        } else {
            this.timeout = num3;
        }
        if ((i10 & 8192) == 0) {
            this.forwardPorts = null;
        } else {
            this.forwardPorts = bool3;
        }
        if ((i10 & 16384) == 0) {
            this.keepAlivePackages = null;
        } else {
            this.keepAlivePackages = num4;
        }
        if ((32768 & i10) == 0) {
            this.cursorBlink = null;
        } else {
            this.cursorBlink = bool4;
        }
        if ((65536 & i10) == 0) {
            this.useMosh = null;
        } else {
            this.useMosh = bool5;
        }
        if ((131072 & i10) == 0) {
            this.useAgentForwarding = null;
        } else {
            this.useAgentForwarding = bool6;
        }
        if ((262144 & i10) == 0) {
            this.moshServerCommand = null;
        } else {
            this.moshServerCommand = str4;
        }
        if ((524288 & i10) == 0) {
            this.envVariables = null;
        } else {
            this.envVariables = str5;
        }
        if ((1048576 & i10) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool7;
        }
        if ((2097152 & i10) == 0) {
            this.content = null;
        } else {
            this.content = str6;
        }
        if ((i10 & 4194304) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39062id;
    }

    public static /* synthetic */ SshConfigFullData copy$default(SshConfigFullData sshConfigFullData, int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, WithRecourseId withRecourseId3, String str2, String str3, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, Boolean bool7, String str6, Long l11, int i11, Object obj) {
        Long l12;
        String str7;
        int i12 = (i11 & 1) != 0 ? sshConfigFullData.f39062id : i10;
        String str8 = (i11 & 2) != 0 ? sshConfigFullData.updatedAt : str;
        WithRecourseId withRecourseId4 = (i11 & 4) != 0 ? sshConfigFullData.identityId : withRecourseId;
        WithRecourseId withRecourseId5 = (i11 & 8) != 0 ? sshConfigFullData.proxyId : withRecourseId2;
        Long l13 = (i11 & 16) != 0 ? sshConfigFullData.localId : l10;
        WithRecourseId withRecourseId6 = (i11 & 32) != 0 ? sshConfigFullData.startupSnippetId : withRecourseId3;
        String str9 = (i11 & 64) != 0 ? sshConfigFullData.colorScheme : str2;
        String str10 = (i11 & 128) != 0 ? sshConfigFullData.charset : str3;
        Integer num5 = (i11 & 256) != 0 ? sshConfigFullData.port : num;
        Integer num6 = (i11 & File.FLAG_O_TRUNC) != 0 ? sshConfigFullData.fontSize : num2;
        Boolean bool8 = (i11 & File.FLAG_O_APPEND) != 0 ? sshConfigFullData.strictHostKeyCheck : bool;
        Boolean bool9 = (i11 & 2048) != 0 ? sshConfigFullData.useSshKey : bool2;
        Integer num7 = (i11 & 4096) != 0 ? sshConfigFullData.timeout : num3;
        Boolean bool10 = (i11 & 8192) != 0 ? sshConfigFullData.forwardPorts : bool3;
        int i13 = i12;
        Integer num8 = (i11 & 16384) != 0 ? sshConfigFullData.keepAlivePackages : num4;
        Boolean bool11 = (i11 & 32768) != 0 ? sshConfigFullData.cursorBlink : bool4;
        Boolean bool12 = (i11 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? sshConfigFullData.useMosh : bool5;
        Boolean bool13 = (i11 & 131072) != 0 ? sshConfigFullData.useAgentForwarding : bool6;
        String str11 = (i11 & 262144) != 0 ? sshConfigFullData.moshServerCommand : str4;
        String str12 = (i11 & 524288) != 0 ? sshConfigFullData.envVariables : str5;
        Boolean bool14 = (i11 & 1048576) != 0 ? sshConfigFullData.isShared : bool7;
        String str13 = (i11 & 2097152) != 0 ? sshConfigFullData.content : str6;
        if ((i11 & 4194304) != 0) {
            str7 = str13;
            l12 = sshConfigFullData.encryptedWith;
        } else {
            l12 = l11;
            str7 = str13;
        }
        return sshConfigFullData.copy(i13, str8, withRecourseId4, withRecourseId5, l13, withRecourseId6, str9, str10, num5, num6, bool8, bool9, num7, bool10, num8, bool11, bool12, bool13, str11, str12, bool14, str7, l12);
    }

    @o(Column.CHARSET)
    public static /* synthetic */ void getCharset$annotations() {
    }

    @o("color_scheme")
    public static /* synthetic */ void getColorScheme$annotations() {
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("cursor_blink")
    public static /* synthetic */ void getCursorBlink$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(Column.ENVIRONMENT_VARIABLES)
    public static /* synthetic */ void getEnvVariables$annotations() {
    }

    @o(Column.FONT_SIZE)
    public static /* synthetic */ void getFontSize$annotations() {
    }

    @o("is_forward_ports")
    public static /* synthetic */ void getForwardPorts$annotations() {
    }

    @o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @o("identity")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    @o(Column.KEEP_ALIVE_PACKAGES)
    public static /* synthetic */ void getKeepAlivePackages$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o(Column.MOSH_SERVER_COMMAND)
    public static /* synthetic */ void getMoshServerCommand$annotations() {
    }

    @o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @o(SshConfigBulk.PROXY_ID_SERIAL_NAME)
    public static /* synthetic */ void getProxyId$annotations() {
    }

    @o(SshConfigBulk.STARTUP_SNIPPET_ID_SERIAL_NAME)
    public static /* synthetic */ void getStartupSnippetId$annotations() {
    }

    @o("strict_host_key_check")
    public static /* synthetic */ void getStrictHostKeyCheck$annotations() {
    }

    @o(Column.TIMEOUT)
    public static /* synthetic */ void getTimeout$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o("agent_forwarding")
    public static /* synthetic */ void getUseAgentForwarding$annotations() {
    }

    @o(SshOptions.EXTRA_SSH_USE_MOSH)
    public static /* synthetic */ void getUseMosh$annotations() {
    }

    @o(Column.USE_SSH_KEY)
    public static /* synthetic */ void getUseSshKey$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshConfigFullData sshConfigFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, sshConfigFullData.f39062id);
        if (dVar.E(fVar, 1) || sshConfigFullData.updatedAt != null) {
            dVar.v(fVar, 1, x2.f64817a, sshConfigFullData.updatedAt);
        }
        if (dVar.E(fVar, 2) || sshConfigFullData.identityId != null) {
            dVar.v(fVar, 2, WithRecourseId$$serializer.INSTANCE, sshConfigFullData.identityId);
        }
        if (dVar.E(fVar, 3) || sshConfigFullData.proxyId != null) {
            dVar.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, sshConfigFullData.proxyId);
        }
        if (dVar.E(fVar, 4) || sshConfigFullData.localId != null) {
            dVar.v(fVar, 4, h1.f64699a, sshConfigFullData.localId);
        }
        if (dVar.E(fVar, 5) || sshConfigFullData.startupSnippetId != null) {
            dVar.v(fVar, 5, WithRecourseId$$serializer.INSTANCE, sshConfigFullData.startupSnippetId);
        }
        if (dVar.E(fVar, 6) || sshConfigFullData.colorScheme != null) {
            dVar.v(fVar, 6, x2.f64817a, sshConfigFullData.colorScheme);
        }
        if (dVar.E(fVar, 7) || sshConfigFullData.charset != null) {
            dVar.v(fVar, 7, x2.f64817a, sshConfigFullData.charset);
        }
        if (dVar.E(fVar, 8) || sshConfigFullData.port != null) {
            dVar.v(fVar, 8, w0.f64808a, sshConfigFullData.port);
        }
        if (dVar.E(fVar, 9) || sshConfigFullData.fontSize != null) {
            dVar.v(fVar, 9, w0.f64808a, sshConfigFullData.fontSize);
        }
        if (dVar.E(fVar, 10) || sshConfigFullData.strictHostKeyCheck != null) {
            dVar.v(fVar, 10, i.f64704a, sshConfigFullData.strictHostKeyCheck);
        }
        if (dVar.E(fVar, 11) || sshConfigFullData.useSshKey != null) {
            dVar.v(fVar, 11, i.f64704a, sshConfigFullData.useSshKey);
        }
        if (dVar.E(fVar, 12) || sshConfigFullData.timeout != null) {
            dVar.v(fVar, 12, w0.f64808a, sshConfigFullData.timeout);
        }
        if (dVar.E(fVar, 13) || sshConfigFullData.forwardPorts != null) {
            dVar.v(fVar, 13, i.f64704a, sshConfigFullData.forwardPorts);
        }
        if (dVar.E(fVar, 14) || sshConfigFullData.keepAlivePackages != null) {
            dVar.v(fVar, 14, w0.f64808a, sshConfigFullData.keepAlivePackages);
        }
        if (dVar.E(fVar, 15) || sshConfigFullData.cursorBlink != null) {
            dVar.v(fVar, 15, i.f64704a, sshConfigFullData.cursorBlink);
        }
        if (dVar.E(fVar, 16) || sshConfigFullData.useMosh != null) {
            dVar.v(fVar, 16, i.f64704a, sshConfigFullData.useMosh);
        }
        if (dVar.E(fVar, 17) || sshConfigFullData.useAgentForwarding != null) {
            dVar.v(fVar, 17, i.f64704a, sshConfigFullData.useAgentForwarding);
        }
        if (dVar.E(fVar, 18) || sshConfigFullData.moshServerCommand != null) {
            dVar.v(fVar, 18, x2.f64817a, sshConfigFullData.moshServerCommand);
        }
        if (dVar.E(fVar, 19) || sshConfigFullData.envVariables != null) {
            dVar.v(fVar, 19, x2.f64817a, sshConfigFullData.envVariables);
        }
        if (dVar.E(fVar, 20) || sshConfigFullData.isShared != null) {
            dVar.v(fVar, 20, i.f64704a, sshConfigFullData.isShared);
        }
        if (dVar.E(fVar, 21) || sshConfigFullData.content != null) {
            dVar.v(fVar, 21, x2.f64817a, sshConfigFullData.content);
        }
        if (!dVar.E(fVar, 22) && sshConfigFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 22, h1.f64699a, sshConfigFullData.getEncryptedWith());
    }

    public final Integer component10() {
        return this.fontSize;
    }

    public final Boolean component11() {
        return this.strictHostKeyCheck;
    }

    public final Boolean component12() {
        return this.useSshKey;
    }

    public final Integer component13() {
        return this.timeout;
    }

    public final Boolean component14() {
        return this.forwardPorts;
    }

    public final Integer component15() {
        return this.keepAlivePackages;
    }

    public final Boolean component16() {
        return this.cursorBlink;
    }

    public final Boolean component17() {
        return this.useMosh;
    }

    public final Boolean component18() {
        return this.useAgentForwarding;
    }

    public final String component19() {
        return this.moshServerCommand;
    }

    public final String component2() {
        return this.updatedAt;
    }

    public final String component20() {
        return this.envVariables;
    }

    public final Boolean component21() {
        return this.isShared;
    }

    public final String component22() {
        return this.content;
    }

    public final Long component23() {
        return this.encryptedWith;
    }

    public final WithRecourseId component3() {
        return this.identityId;
    }

    public final WithRecourseId component4() {
        return this.proxyId;
    }

    public final Long component5() {
        return this.localId;
    }

    public final WithRecourseId component6() {
        return this.startupSnippetId;
    }

    public final String component7() {
        return this.colorScheme;
    }

    public final String component8() {
        return this.charset;
    }

    public final Integer component9() {
        return this.port;
    }

    public final SshConfigFullData copy(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, WithRecourseId withRecourseId3, String str2, String str3, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, Boolean bool7, String str6, Long l11) {
        return new SshConfigFullData(i10, str, withRecourseId, withRecourseId2, l10, withRecourseId3, str2, str3, num, num2, bool, bool2, num3, bool3, num4, bool4, bool5, bool6, str4, str5, bool7, str6, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshConfigFullData)) {
            return false;
        }
        SshConfigFullData sshConfigFullData = (SshConfigFullData) obj;
        return this.f39062id == sshConfigFullData.f39062id && t.b(this.updatedAt, sshConfigFullData.updatedAt) && t.b(this.identityId, sshConfigFullData.identityId) && t.b(this.proxyId, sshConfigFullData.proxyId) && t.b(this.localId, sshConfigFullData.localId) && t.b(this.startupSnippetId, sshConfigFullData.startupSnippetId) && t.b(this.colorScheme, sshConfigFullData.colorScheme) && t.b(this.charset, sshConfigFullData.charset) && t.b(this.port, sshConfigFullData.port) && t.b(this.fontSize, sshConfigFullData.fontSize) && t.b(this.strictHostKeyCheck, sshConfigFullData.strictHostKeyCheck) && t.b(this.useSshKey, sshConfigFullData.useSshKey) && t.b(this.timeout, sshConfigFullData.timeout) && t.b(this.forwardPorts, sshConfigFullData.forwardPorts) && t.b(this.keepAlivePackages, sshConfigFullData.keepAlivePackages) && t.b(this.cursorBlink, sshConfigFullData.cursorBlink) && t.b(this.useMosh, sshConfigFullData.useMosh) && t.b(this.useAgentForwarding, sshConfigFullData.useAgentForwarding) && t.b(this.moshServerCommand, sshConfigFullData.moshServerCommand) && t.b(this.envVariables, sshConfigFullData.envVariables) && t.b(this.isShared, sshConfigFullData.isShared) && t.b(this.content, sshConfigFullData.content) && t.b(this.encryptedWith, sshConfigFullData.encryptedWith);
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getColorScheme() {
        return this.colorScheme;
    }

    public final Boolean getCursorBlink() {
        return this.cursorBlink;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final Integer getFontSize() {
        return this.fontSize;
    }

    public final Boolean getForwardPorts() {
        return this.forwardPorts;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39062id;
    }

    public final WithRecourseId getIdentityId() {
        return this.identityId;
    }

    public final Integer getKeepAlivePackages() {
        return this.keepAlivePackages;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final String getMoshServerCommand() {
        return this.moshServerCommand;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final WithRecourseId getProxyId() {
        return this.proxyId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final WithRecourseId getStartupSnippetId() {
        return this.startupSnippetId;
    }

    public final Boolean getStrictHostKeyCheck() {
        return this.strictHostKeyCheck;
    }

    public final Integer getTimeout() {
        return this.timeout;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final Boolean getUseAgentForwarding() {
        return this.useAgentForwarding;
    }

    public final Boolean getUseMosh() {
        return this.useMosh;
    }

    public final Boolean getUseSshKey() {
        return this.useSshKey;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f39062id) * 31;
        String str = this.updatedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        WithRecourseId withRecourseId = this.identityId;
        int iHashCode3 = (iHashCode2 + (withRecourseId == null ? 0 : withRecourseId.hashCode())) * 31;
        WithRecourseId withRecourseId2 = this.proxyId;
        int iHashCode4 = (iHashCode3 + (withRecourseId2 == null ? 0 : withRecourseId2.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        WithRecourseId withRecourseId3 = this.startupSnippetId;
        int iHashCode6 = (iHashCode5 + (withRecourseId3 == null ? 0 : withRecourseId3.hashCode())) * 31;
        String str2 = this.colorScheme;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.charset;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.port;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fontSize;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.strictHostKeyCheck;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.useSshKey;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.timeout;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.forwardPorts;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num4 = this.keepAlivePackages;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool4 = this.cursorBlink;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.useMosh;
        int iHashCode17 = (iHashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.useAgentForwarding;
        int iHashCode18 = (iHashCode17 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str4 = this.moshServerCommand;
        int iHashCode19 = (iHashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.envVariables;
        int iHashCode20 = (iHashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool7 = this.isShared;
        int iHashCode21 = (iHashCode20 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str6 = this.content;
        int iHashCode22 = (iHashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode22 + (l11 != null ? l11.hashCode() : 0);
    }

    public final Boolean isShared() {
        return this.isShared;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = Boolean.FALSE;
        setEncryptedWith(null);
    }

    public final void setCharset(String str) {
        this.charset = str;
    }

    public final void setColorScheme(String str) {
        this.colorScheme = str;
    }

    public final void setCursorBlink(Boolean bool) {
        this.cursorBlink = bool;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setFontSize(Integer num) {
        this.fontSize = num;
    }

    public final void setForwardPorts(Boolean bool) {
        this.forwardPorts = bool;
    }

    public final void setIdentityId(WithRecourseId withRecourseId) {
        this.identityId = withRecourseId;
    }

    public final void setKeepAlivePackages(Integer num) {
        this.keepAlivePackages = num;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setPort(Integer num) {
        this.port = num;
    }

    public final void setProxyId(WithRecourseId withRecourseId) {
        this.proxyId = withRecourseId;
    }

    public final void setShared(Boolean bool) {
        this.isShared = bool;
    }

    public final void setStartupSnippetId(WithRecourseId withRecourseId) {
        this.startupSnippetId = withRecourseId;
    }

    public final void setStrictHostKeyCheck(Boolean bool) {
        this.strictHostKeyCheck = bool;
    }

    public final void setTimeout(Integer num) {
        this.timeout = num;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final void setUseAgentForwarding(Boolean bool) {
        this.useAgentForwarding = bool;
    }

    public final void setUseMosh(Boolean bool) {
        this.useMosh = bool;
    }

    public final void setUseSshKey(Boolean bool) {
        this.useSshKey = bool;
    }

    public String toString() {
        return "SshConfigFullData(id=" + this.f39062id + ", updatedAt=" + this.updatedAt + ", identityId=" + this.identityId + ", proxyId=" + this.proxyId + ", localId=" + this.localId + ", startupSnippetId=" + this.startupSnippetId + ", colorScheme=" + this.colorScheme + ", charset=" + this.charset + ", port=" + this.port + ", fontSize=" + this.fontSize + ", strictHostKeyCheck=" + this.strictHostKeyCheck + ", useSshKey=" + this.useSshKey + ", timeout=" + this.timeout + ", forwardPorts=" + this.forwardPorts + ", keepAlivePackages=" + this.keepAlivePackages + ", cursorBlink=" + this.cursorBlink + ", useMosh=" + this.useMosh + ", useAgentForwarding=" + this.useAgentForwarding + ", moshServerCommand=" + this.moshServerCommand + ", envVariables=" + this.envVariables + ", isShared=" + this.isShared + ", content=" + this.content + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public SshConfigFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, WithRecourseId withRecourseId3, String str2, String str3, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, Boolean bool7, String str6, Long l11) {
        this.f39062id = i10;
        this.updatedAt = str;
        this.identityId = withRecourseId;
        this.proxyId = withRecourseId2;
        this.localId = l10;
        this.startupSnippetId = withRecourseId3;
        this.colorScheme = str2;
        this.charset = str3;
        this.port = num;
        this.fontSize = num2;
        this.strictHostKeyCheck = bool;
        this.useSshKey = bool2;
        this.timeout = num3;
        this.forwardPorts = bool3;
        this.keepAlivePackages = num4;
        this.cursorBlink = bool4;
        this.useMosh = bool5;
        this.useAgentForwarding = bool6;
        this.moshServerCommand = str4;
        this.envVariables = str5;
        this.isShared = bool7;
        this.content = str6;
        this.encryptedWith = l11;
    }

    public /* synthetic */ SshConfigFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, WithRecourseId withRecourseId3, String str2, String str3, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, Boolean bool7, String str6, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : withRecourseId, (i11 & 8) != 0 ? null : withRecourseId2, (i11 & 16) != 0 ? null : l10, (i11 & 32) != 0 ? null : withRecourseId3, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : num, (i11 & File.FLAG_O_TRUNC) != 0 ? null : num2, (i11 & File.FLAG_O_APPEND) != 0 ? null : bool, (i11 & 2048) != 0 ? null : bool2, (i11 & 4096) != 0 ? null : num3, (i11 & 8192) != 0 ? null : bool3, (i11 & 16384) != 0 ? null : num4, (i11 & 32768) != 0 ? null : bool4, (i11 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? null : bool5, (i11 & 131072) != 0 ? null : bool6, (i11 & 262144) != 0 ? null : str4, (i11 & 524288) != 0 ? null : str5, (i11 & 1048576) != 0 ? null : bool7, (i11 & 2097152) != 0 ? null : str6, (i11 & 4194304) != 0 ? null : l11);
    }
}
