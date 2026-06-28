package com.server.auditor.ssh.client.synchronization.api.models.host;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import gg.b;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HostBulkV5 extends HostBulk {
    public static final String CONTENT_SERIAL_NAME = "content";

    @b
    public String content;
    private String credentialsMode;
    private Long encryptedWith;
    private Object groupId;
    private final Long localId;
    private final long remoteId;
    private Object sshConfigId;
    private Object telnetConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return HostBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HostBulkV5() {
        this((String) null, (Object) null, (Object) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, (String) null, 511, (k) null);
    }

    public static /* synthetic */ HostBulkV5 copy$default(HostBulkV5 hostBulkV5, String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            str = hostBulkV5.content;
        }
        if ((i10 & 2) != 0) {
            obj = hostBulkV5.sshConfigId;
        }
        if ((i10 & 4) != 0) {
            obj2 = hostBulkV5.telnetConfigId;
        }
        if ((i10 & 8) != 0) {
            obj3 = hostBulkV5.groupId;
        }
        if ((i10 & 16) != 0) {
            l10 = hostBulkV5.localId;
        }
        if ((i10 & 32) != 0) {
            j10 = hostBulkV5.remoteId;
        }
        if ((i10 & 64) != 0) {
            str2 = hostBulkV5.updatedAt;
        }
        if ((i10 & 128) != 0) {
            l11 = hostBulkV5.encryptedWith;
        }
        if ((i10 & 256) != 0) {
            str3 = hostBulkV5.credentialsMode;
        }
        String str4 = str3;
        String str5 = str2;
        long j11 = j10;
        Object obj5 = obj3;
        Long l12 = l10;
        Object obj6 = obj2;
        return hostBulkV5.copy(str, obj, obj6, obj5, l12, j11, str5, l11, str4);
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("credentials_mode")
    public static /* synthetic */ void getCredentialsMode$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(HostBulk.GROUP_ID_SERIAL_NAME)
    public static /* synthetic */ void getGroupId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("ssh_config")
    public static /* synthetic */ void getSshConfigId$annotations() {
    }

    @o("telnet_config")
    public static /* synthetic */ void getTelnetConfigId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HostBulkV5 hostBulkV5, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || hostBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, hostBulkV5.content);
        }
        if (dVar.E(fVar, 1) || hostBulkV5.getSshConfigId() != null) {
            dVar.v(fVar, 1, tp.b.f80841a, hostBulkV5.getSshConfigId());
        }
        if (dVar.E(fVar, 2) || hostBulkV5.getTelnetConfigId() != null) {
            dVar.v(fVar, 2, tp.b.f80841a, hostBulkV5.getTelnetConfigId());
        }
        if (dVar.E(fVar, 3) || hostBulkV5.getGroupId() != null) {
            dVar.v(fVar, 3, tp.b.f80841a, hostBulkV5.getGroupId());
        }
        if (dVar.E(fVar, 4) || hostBulkV5.getLocalId() != null) {
            dVar.v(fVar, 4, h1.f64699a, hostBulkV5.getLocalId());
        }
        if (dVar.E(fVar, 5) || hostBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 5, hostBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 6) || !t.b(hostBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 6, x2.f64817a, hostBulkV5.getUpdatedAt());
        }
        if (dVar.E(fVar, 7) || hostBulkV5.getEncryptedWith() != null) {
            dVar.v(fVar, 7, h1.f64699a, hostBulkV5.getEncryptedWith());
        }
        if (!dVar.E(fVar, 8) && hostBulkV5.getCredentialsMode() == null) {
            return;
        }
        dVar.v(fVar, 8, x2.f64817a, hostBulkV5.getCredentialsMode());
    }

    public final String component1() {
        return this.content;
    }

    public final Object component2() {
        return this.sshConfigId;
    }

    public final Object component3() {
        return this.telnetConfigId;
    }

    public final Object component4() {
        return this.groupId;
    }

    public final Long component5() {
        return this.localId;
    }

    public final long component6() {
        return this.remoteId;
    }

    public final String component7() {
        return this.updatedAt;
    }

    public final Long component8() {
        return this.encryptedWith;
    }

    public final String component9() {
        return this.credentialsMode;
    }

    public final HostBulkV5 copy(String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3) {
        return new HostBulkV5(str, obj, obj2, obj3, l10, j10, str2, l11, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostBulkV5)) {
            return false;
        }
        HostBulkV5 hostBulkV5 = (HostBulkV5) obj;
        return t.b(this.content, hostBulkV5.content) && t.b(this.sshConfigId, hostBulkV5.sshConfigId) && t.b(this.telnetConfigId, hostBulkV5.telnetConfigId) && t.b(this.groupId, hostBulkV5.groupId) && t.b(this.localId, hostBulkV5.localId) && this.remoteId == hostBulkV5.remoteId && t.b(this.updatedAt, hostBulkV5.updatedAt) && t.b(this.encryptedWith, hostBulkV5.encryptedWith) && t.b(this.credentialsMode, hostBulkV5.credentialsMode);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk
    public String getCredentialsMode() {
        return this.credentialsMode;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk
    public Object getGroupId() {
        return this.groupId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk
    public Object getSshConfigId() {
        return this.sshConfigId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk
    public Object getTelnetConfigId() {
        return this.telnetConfigId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.sshConfigId;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.telnetConfigId;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.groupId;
        int iHashCode4 = (iHashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode5 = (((iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str2 = this.updatedAt;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.credentialsMode;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk
    public void setCredentialsMode(String str) {
        this.credentialsMode = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk
    public void setGroupId(Object obj) {
        this.groupId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk
    public void setSshConfigId(Object obj) {
        this.sshConfigId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk
    public void setTelnetConfigId(Object obj) {
        this.telnetConfigId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "HostBulkV5(content=" + this.content + ", sshConfigId=" + this.sshConfigId + ", telnetConfigId=" + this.telnetConfigId + ", groupId=" + this.groupId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ", credentialsMode=" + this.credentialsMode + ")";
    }

    public /* synthetic */ HostBulkV5(int i10, String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 2) == 0) {
            this.sshConfigId = null;
        } else {
            this.sshConfigId = obj;
        }
        if ((i10 & 4) == 0) {
            this.telnetConfigId = null;
        } else {
            this.telnetConfigId = obj2;
        }
        if ((i10 & 8) == 0) {
            this.groupId = null;
        } else {
            this.groupId = obj3;
        }
        if ((i10 & 16) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 32) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 64) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str2;
        }
        if ((i10 & 128) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
        if ((i10 & 256) == 0) {
            this.credentialsMode = null;
        } else {
            this.credentialsMode = str3;
        }
    }

    public /* synthetic */ HostBulkV5(String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? null : obj3, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? 0L : j10, (i10 & 64) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 128) != 0 ? null : l11, (i10 & 256) != 0 ? null : str3);
    }

    public HostBulkV5(String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3) {
        super(null);
        this.content = str;
        this.sshConfigId = obj;
        this.telnetConfigId = obj2;
        this.groupId = obj3;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
        this.credentialsMode = str3;
    }
}
