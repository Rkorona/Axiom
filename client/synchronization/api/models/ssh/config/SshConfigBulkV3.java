package com.server.auditor.ssh.client.synchronization.api.models.ssh.config;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import gg.a;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i;
import lv.s2;
import lv.w0;
import lv.x2;
import tp.b;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SshConfigBulkV3 extends SshConfigBulk {
    private final String charset;
    private final String colorScheme;
    private Long encryptedWith;

    @a
    public String envVariables;
    private final Boolean isUseAgentForwarding;
    private final Boolean isUseMosh;
    private final Long localId;
    private final String moshServerCommand;
    private final Integer port;
    private Object proxyId;
    private final long remoteId;
    private Object snippetId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SshConfigBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public SshConfigBulkV3() {
        this((Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Object) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, 8191, (k) null);
    }

    @o(Column.CHARSET)
    public static /* synthetic */ void getCharset$annotations() {
    }

    @o("color_scheme")
    public static /* synthetic */ void getColorScheme$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(Column.ENVIRONMENT_VARIABLES)
    public static /* synthetic */ void getEnvVariables$annotations() {
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

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o(SshConfigBulk.STARTUP_SNIPPET_ID_SERIAL_NAME)
    public static /* synthetic */ void getSnippetId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o("agent_forwarding")
    public static /* synthetic */ void isUseAgentForwarding$annotations() {
    }

    @o(SshOptions.EXTRA_SSH_USE_MOSH)
    public static /* synthetic */ void isUseMosh$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshConfigBulkV3 sshConfigBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshConfigBulkV3.isUseMosh != null) {
            dVar.v(fVar, 0, i.f64704a, sshConfigBulkV3.isUseMosh);
        }
        if (dVar.E(fVar, 1) || sshConfigBulkV3.isUseAgentForwarding != null) {
            dVar.v(fVar, 1, i.f64704a, sshConfigBulkV3.isUseAgentForwarding);
        }
        if (dVar.E(fVar, 2) || sshConfigBulkV3.moshServerCommand != null) {
            dVar.v(fVar, 2, x2.f64817a, sshConfigBulkV3.moshServerCommand);
        }
        if (dVar.E(fVar, 3) || sshConfigBulkV3.envVariables != null) {
            dVar.v(fVar, 3, x2.f64817a, sshConfigBulkV3.envVariables);
        }
        if (dVar.E(fVar, 4) || sshConfigBulkV3.port != null) {
            dVar.v(fVar, 4, w0.f64808a, sshConfigBulkV3.port);
        }
        if (dVar.E(fVar, 5) || sshConfigBulkV3.charset != null) {
            dVar.v(fVar, 5, x2.f64817a, sshConfigBulkV3.charset);
        }
        if (dVar.E(fVar, 6) || sshConfigBulkV3.colorScheme != null) {
            dVar.v(fVar, 6, x2.f64817a, sshConfigBulkV3.colorScheme);
        }
        if (dVar.E(fVar, 7) || sshConfigBulkV3.getProxyId() != null) {
            dVar.v(fVar, 7, b.f80841a, sshConfigBulkV3.getProxyId());
        }
        if (dVar.E(fVar, 8) || sshConfigBulkV3.getSnippetId() != null) {
            dVar.v(fVar, 8, b.f80841a, sshConfigBulkV3.getSnippetId());
        }
        if (dVar.E(fVar, 9) || sshConfigBulkV3.getLocalId() != null) {
            dVar.v(fVar, 9, h1.f64699a, sshConfigBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 10) || sshConfigBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 10, sshConfigBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 11) || !t.b(sshConfigBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 11, x2.f64817a, sshConfigBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 12) && sshConfigBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 12, h1.f64699a, sshConfigBulkV3.getEncryptedWith());
    }

    public final Boolean component1() {
        return this.isUseMosh;
    }

    public final Long component10() {
        return this.localId;
    }

    public final long component11() {
        return this.remoteId;
    }

    public final String component12() {
        return this.updatedAt;
    }

    public final Long component13() {
        return this.encryptedWith;
    }

    public final Boolean component2() {
        return this.isUseAgentForwarding;
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

    public final Object component8() {
        return this.proxyId;
    }

    public final Object component9() {
        return this.snippetId;
    }

    public final SshConfigBulkV3 copy(Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, Object obj, Object obj2, Long l10, long j10, String str5, Long l11) {
        return new SshConfigBulkV3(bool, bool2, str, str2, num, str3, str4, obj, obj2, l10, j10, str5, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshConfigBulkV3)) {
            return false;
        }
        SshConfigBulkV3 sshConfigBulkV3 = (SshConfigBulkV3) obj;
        return t.b(this.isUseMosh, sshConfigBulkV3.isUseMosh) && t.b(this.isUseAgentForwarding, sshConfigBulkV3.isUseAgentForwarding) && t.b(this.moshServerCommand, sshConfigBulkV3.moshServerCommand) && t.b(this.envVariables, sshConfigBulkV3.envVariables) && t.b(this.port, sshConfigBulkV3.port) && t.b(this.charset, sshConfigBulkV3.charset) && t.b(this.colorScheme, sshConfigBulkV3.colorScheme) && t.b(this.proxyId, sshConfigBulkV3.proxyId) && t.b(this.snippetId, sshConfigBulkV3.snippetId) && t.b(this.localId, sshConfigBulkV3.localId) && this.remoteId == sshConfigBulkV3.remoteId && t.b(this.updatedAt, sshConfigBulkV3.updatedAt) && t.b(this.encryptedWith, sshConfigBulkV3.encryptedWith);
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getColorScheme() {
        return this.colorScheme;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    public final String getMoshServerCommand() {
        return this.moshServerCommand;
    }

    public final Integer getPort() {
        return this.port;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk
    public Object getProxyId() {
        return this.proxyId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk
    public Object getSnippetId() {
        return this.snippetId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Boolean bool = this.isUseMosh;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isUseAgentForwarding;
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
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Object obj = this.proxyId;
        int iHashCode8 = (iHashCode7 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.snippetId;
        int iHashCode9 = (iHashCode8 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode10 = (((iHashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str5 = this.updatedAt;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode11 + (l11 != null ? l11.hashCode() : 0);
    }

    public final Boolean isUseAgentForwarding() {
        return this.isUseAgentForwarding;
    }

    public final Boolean isUseMosh() {
        return this.isUseMosh;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk
    public void setProxyId(Object obj) {
        this.proxyId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk
    public void setSnippetId(Object obj) {
        this.snippetId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "SshConfigBulkV3(isUseMosh=" + this.isUseMosh + ", isUseAgentForwarding=" + this.isUseAgentForwarding + ", moshServerCommand=" + this.moshServerCommand + ", envVariables=" + this.envVariables + ", port=" + this.port + ", charset=" + this.charset + ", colorScheme=" + this.colorScheme + ", proxyId=" + this.proxyId + ", snippetId=" + this.snippetId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ SshConfigBulkV3(int i10, Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, Object obj, Object obj2, Long l10, long j10, String str5, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.isUseMosh = null;
        } else {
            this.isUseMosh = bool;
        }
        if ((i10 & 2) == 0) {
            this.isUseAgentForwarding = null;
        } else {
            this.isUseAgentForwarding = bool2;
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
            this.proxyId = null;
        } else {
            this.proxyId = obj;
        }
        if ((i10 & 256) == 0) {
            this.snippetId = null;
        } else {
            this.snippetId = obj2;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        this.updatedAt = (i10 & 2048) == 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str5;
        if ((i10 & 4096) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ SshConfigBulkV3(Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, Object obj, Object obj2, Long l10, long j10, String str5, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : obj, (i10 & 256) != 0 ? null : obj2, (i10 & File.FLAG_O_TRUNC) != 0 ? null : l10, (i10 & File.FLAG_O_APPEND) != 0 ? 0L : j10, (i10 & 2048) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str5, (i10 & 4096) != 0 ? null : l11);
    }

    public SshConfigBulkV3(Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, Object obj, Object obj2, Long l10, long j10, String str5, Long l11) {
        super(null);
        this.isUseMosh = bool;
        this.isUseAgentForwarding = bool2;
        this.moshServerCommand = str;
        this.envVariables = str2;
        this.port = num;
        this.charset = str3;
        this.colorScheme = str4;
        this.proxyId = obj;
        this.snippetId = obj2;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str5;
        this.encryptedWith = l11;
    }
}
