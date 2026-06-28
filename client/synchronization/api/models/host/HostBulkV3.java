package com.server.auditor.ssh.client.synchronization.api.models.host;

import com.crystalnix.termius.libtermius.sftp.File;
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
import lv.s2;
import lv.x2;
import tp.b;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HostBulkV3 extends HostBulk {

    @a
    public String address;
    private final String backspaceType;
    private String credentialsMode;
    private Long encryptedWith;
    private Object groupId;
    private final String interactionDate;

    @a
    public String label;
    private final Long localId;
    private String osName;
    private final long remoteId;
    private Object sshConfigId;
    private Object telnetConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return HostBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public HostBulkV3() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Object) null, (Object) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, (String) null, 8191, (k) null);
    }

    @o(Column.ADDRESS)
    public static /* synthetic */ void getAddress$annotations() {
    }

    @o("backspace")
    public static /* synthetic */ void getBackspaceType$annotations() {
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

    @o(Column.INTERACTION_DATE)
    public static /* synthetic */ void getInteractionDate$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("os_name")
    public static /* synthetic */ void getOsName$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HostBulkV3 hostBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || hostBulkV3.label != null) {
            dVar.v(fVar, 0, x2.f64817a, hostBulkV3.label);
        }
        if (dVar.E(fVar, 1) || hostBulkV3.address != null) {
            dVar.v(fVar, 1, x2.f64817a, hostBulkV3.address);
        }
        if (dVar.E(fVar, 2) || hostBulkV3.osName != null) {
            dVar.v(fVar, 2, x2.f64817a, hostBulkV3.osName);
        }
        if (dVar.E(fVar, 3) || hostBulkV3.interactionDate != null) {
            dVar.v(fVar, 3, x2.f64817a, hostBulkV3.interactionDate);
        }
        if (dVar.E(fVar, 4) || hostBulkV3.backspaceType != null) {
            dVar.v(fVar, 4, x2.f64817a, hostBulkV3.backspaceType);
        }
        if (dVar.E(fVar, 5) || hostBulkV3.getSshConfigId() != null) {
            dVar.v(fVar, 5, b.f80841a, hostBulkV3.getSshConfigId());
        }
        if (dVar.E(fVar, 6) || hostBulkV3.getTelnetConfigId() != null) {
            dVar.v(fVar, 6, b.f80841a, hostBulkV3.getTelnetConfigId());
        }
        if (dVar.E(fVar, 7) || hostBulkV3.getGroupId() != null) {
            dVar.v(fVar, 7, b.f80841a, hostBulkV3.getGroupId());
        }
        if (dVar.E(fVar, 8) || hostBulkV3.getLocalId() != null) {
            dVar.v(fVar, 8, h1.f64699a, hostBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 9) || hostBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 9, hostBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 10) || !t.b(hostBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 10, x2.f64817a, hostBulkV3.getUpdatedAt());
        }
        if (dVar.E(fVar, 11) || hostBulkV3.getEncryptedWith() != null) {
            dVar.v(fVar, 11, h1.f64699a, hostBulkV3.getEncryptedWith());
        }
        if (!dVar.E(fVar, 12) && hostBulkV3.getCredentialsMode() == null) {
            return;
        }
        dVar.v(fVar, 12, x2.f64817a, hostBulkV3.getCredentialsMode());
    }

    public final String component1() {
        return this.label;
    }

    public final long component10() {
        return this.remoteId;
    }

    public final String component11() {
        return this.updatedAt;
    }

    public final Long component12() {
        return this.encryptedWith;
    }

    public final String component13() {
        return this.credentialsMode;
    }

    public final String component2() {
        return this.address;
    }

    public final String component3() {
        return this.osName;
    }

    public final String component4() {
        return this.interactionDate;
    }

    public final String component5() {
        return this.backspaceType;
    }

    public final Object component6() {
        return this.sshConfigId;
    }

    public final Object component7() {
        return this.telnetConfigId;
    }

    public final Object component8() {
        return this.groupId;
    }

    public final Long component9() {
        return this.localId;
    }

    public final HostBulkV3 copy(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2, Object obj3, Long l10, long j10, String str6, Long l11, String str7) {
        return new HostBulkV3(str, str2, str3, str4, str5, obj, obj2, obj3, l10, j10, str6, l11, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostBulkV3)) {
            return false;
        }
        HostBulkV3 hostBulkV3 = (HostBulkV3) obj;
        return t.b(this.label, hostBulkV3.label) && t.b(this.address, hostBulkV3.address) && t.b(this.osName, hostBulkV3.osName) && t.b(this.interactionDate, hostBulkV3.interactionDate) && t.b(this.backspaceType, hostBulkV3.backspaceType) && t.b(this.sshConfigId, hostBulkV3.sshConfigId) && t.b(this.telnetConfigId, hostBulkV3.telnetConfigId) && t.b(this.groupId, hostBulkV3.groupId) && t.b(this.localId, hostBulkV3.localId) && this.remoteId == hostBulkV3.remoteId && t.b(this.updatedAt, hostBulkV3.updatedAt) && t.b(this.encryptedWith, hostBulkV3.encryptedWith) && t.b(this.credentialsMode, hostBulkV3.credentialsMode);
    }

    public final String getBackspaceType() {
        return this.backspaceType;
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

    public final String getInteractionDate() {
        return this.interactionDate;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    public final String getOsName() {
        return this.osName;
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
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.osName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.interactionDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backspaceType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj = this.sshConfigId;
        int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.telnetConfigId;
        int iHashCode7 = (iHashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.groupId;
        int iHashCode8 = (iHashCode7 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode9 = (((iHashCode8 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str6 = this.updatedAt;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str7 = this.credentialsMode;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
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

    public final void setOsName(String str) {
        this.osName = str;
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
        return "HostBulkV3(label=" + this.label + ", address=" + this.address + ", osName=" + this.osName + ", interactionDate=" + this.interactionDate + ", backspaceType=" + this.backspaceType + ", sshConfigId=" + this.sshConfigId + ", telnetConfigId=" + this.telnetConfigId + ", groupId=" + this.groupId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ", credentialsMode=" + this.credentialsMode + ")";
    }

    public /* synthetic */ HostBulkV3(int i10, String str, String str2, String str3, String str4, String str5, Object obj, Object obj2, Object obj3, Long l10, long j10, String str6, Long l11, String str7, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i10 & 2) == 0) {
            this.address = null;
        } else {
            this.address = str2;
        }
        if ((i10 & 4) == 0) {
            this.osName = null;
        } else {
            this.osName = str3;
        }
        if ((i10 & 8) == 0) {
            this.interactionDate = null;
        } else {
            this.interactionDate = str4;
        }
        if ((i10 & 16) == 0) {
            this.backspaceType = null;
        } else {
            this.backspaceType = str5;
        }
        if ((i10 & 32) == 0) {
            this.sshConfigId = null;
        } else {
            this.sshConfigId = obj;
        }
        if ((i10 & 64) == 0) {
            this.telnetConfigId = null;
        } else {
            this.telnetConfigId = obj2;
        }
        if ((i10 & 128) == 0) {
            this.groupId = null;
        } else {
            this.groupId = obj3;
        }
        if ((i10 & 256) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str6;
        }
        if ((i10 & 2048) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
        if ((i10 & 4096) == 0) {
            this.credentialsMode = null;
        } else {
            this.credentialsMode = str7;
        }
    }

    public /* synthetic */ HostBulkV3(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2, Object obj3, Long l10, long j10, String str6, Long l11, String str7, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : obj, (i10 & 64) != 0 ? null : obj2, (i10 & 128) != 0 ? null : obj3, (i10 & 256) != 0 ? null : l10, (i10 & File.FLAG_O_TRUNC) != 0 ? 0L : j10, (i10 & File.FLAG_O_APPEND) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str6, (i10 & 2048) != 0 ? null : l11, (i10 & 4096) != 0 ? null : str7);
    }

    public HostBulkV3(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2, Object obj3, Long l10, long j10, String str6, Long l11, String str7) {
        super(null);
        this.label = str;
        this.address = str2;
        this.osName = str3;
        this.interactionDate = str4;
        this.backspaceType = str5;
        this.sshConfigId = obj;
        this.telnetConfigId = obj2;
        this.groupId = obj3;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str6;
        this.encryptedWith = l11;
        this.credentialsMode = str7;
    }
}
