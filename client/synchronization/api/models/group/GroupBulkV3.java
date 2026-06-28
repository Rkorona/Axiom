package com.server.auditor.ssh.client.synchronization.api.models.group;

import com.crystalnix.termius.libtermius.sftp.File;
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
public final class GroupBulkV3 extends GroupBulk {
    private String credentialsMode;
    private Long encryptedWith;
    private Object groupId;

    @a
    public String label;
    private final Long localId;
    private final long remoteId;
    private String sharingMode;
    private Object sshConfigId;
    private Object telnetConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return GroupBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public GroupBulkV3() {
        this((String) null, (Object) null, (Object) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, (String) null, (String) null, 1023, (k) null);
    }

    public static /* synthetic */ GroupBulkV3 copy$default(GroupBulkV3 groupBulkV3, String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3, String str4, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            str = groupBulkV3.label;
        }
        if ((i10 & 2) != 0) {
            obj = groupBulkV3.sshConfigId;
        }
        if ((i10 & 4) != 0) {
            obj2 = groupBulkV3.telnetConfigId;
        }
        if ((i10 & 8) != 0) {
            obj3 = groupBulkV3.groupId;
        }
        if ((i10 & 16) != 0) {
            l10 = groupBulkV3.localId;
        }
        if ((i10 & 32) != 0) {
            j10 = groupBulkV3.remoteId;
        }
        if ((i10 & 64) != 0) {
            str2 = groupBulkV3.updatedAt;
        }
        if ((i10 & 128) != 0) {
            l11 = groupBulkV3.encryptedWith;
        }
        if ((i10 & 256) != 0) {
            str3 = groupBulkV3.sharingMode;
        }
        if ((i10 & File.FLAG_O_TRUNC) != 0) {
            str4 = groupBulkV3.credentialsMode;
        }
        long j11 = j10;
        Object obj5 = obj3;
        Long l12 = l10;
        Object obj6 = obj2;
        return groupBulkV3.copy(str, obj, obj6, obj5, l12, j11, str2, l11, str3, str4);
    }

    @o("credentials_mode")
    public static /* synthetic */ void getCredentialsMode$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("parent_group")
    public static /* synthetic */ void getGroupId$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("sharing_mode")
    public static /* synthetic */ void getSharingMode$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(GroupBulkV3 groupBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || groupBulkV3.label != null) {
            dVar.v(fVar, 0, x2.f64817a, groupBulkV3.label);
        }
        if (dVar.E(fVar, 1) || groupBulkV3.getSshConfigId() != null) {
            dVar.v(fVar, 1, b.f80841a, groupBulkV3.getSshConfigId());
        }
        if (dVar.E(fVar, 2) || groupBulkV3.getTelnetConfigId() != null) {
            dVar.v(fVar, 2, b.f80841a, groupBulkV3.getTelnetConfigId());
        }
        if (dVar.E(fVar, 3) || groupBulkV3.getGroupId() != null) {
            dVar.v(fVar, 3, b.f80841a, groupBulkV3.getGroupId());
        }
        if (dVar.E(fVar, 4) || groupBulkV3.getLocalId() != null) {
            dVar.v(fVar, 4, h1.f64699a, groupBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 5) || groupBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 5, groupBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 6) || !t.b(groupBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 6, x2.f64817a, groupBulkV3.getUpdatedAt());
        }
        if (dVar.E(fVar, 7) || groupBulkV3.getEncryptedWith() != null) {
            dVar.v(fVar, 7, h1.f64699a, groupBulkV3.getEncryptedWith());
        }
        if (dVar.E(fVar, 8) || groupBulkV3.getSharingMode() != null) {
            dVar.v(fVar, 8, x2.f64817a, groupBulkV3.getSharingMode());
        }
        if (!dVar.E(fVar, 9) && groupBulkV3.getCredentialsMode() == null) {
            return;
        }
        dVar.v(fVar, 9, x2.f64817a, groupBulkV3.getCredentialsMode());
    }

    public final String component1() {
        return this.label;
    }

    public final String component10() {
        return this.credentialsMode;
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
        return this.sharingMode;
    }

    public final GroupBulkV3 copy(String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3, String str4) {
        return new GroupBulkV3(str, obj, obj2, obj3, l10, j10, str2, l11, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupBulkV3)) {
            return false;
        }
        GroupBulkV3 groupBulkV3 = (GroupBulkV3) obj;
        return t.b(this.label, groupBulkV3.label) && t.b(this.sshConfigId, groupBulkV3.sshConfigId) && t.b(this.telnetConfigId, groupBulkV3.telnetConfigId) && t.b(this.groupId, groupBulkV3.groupId) && t.b(this.localId, groupBulkV3.localId) && this.remoteId == groupBulkV3.remoteId && t.b(this.updatedAt, groupBulkV3.updatedAt) && t.b(this.encryptedWith, groupBulkV3.encryptedWith) && t.b(this.sharingMode, groupBulkV3.sharingMode) && t.b(this.credentialsMode, groupBulkV3.credentialsMode);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
    public String getCredentialsMode() {
        return this.credentialsMode;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
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

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
    public String getSharingMode() {
        return this.sharingMode;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
    public Object getSshConfigId() {
        return this.sshConfigId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
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
        String str3 = this.sharingMode;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.credentialsMode;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
    public void setCredentialsMode(String str) {
        this.credentialsMode = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
    public void setGroupId(Object obj) {
        this.groupId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
    public void setSharingMode(String str) {
        this.sharingMode = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
    public void setSshConfigId(Object obj) {
        this.sshConfigId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk
    public void setTelnetConfigId(Object obj) {
        this.telnetConfigId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "GroupBulkV3(label=" + this.label + ", sshConfigId=" + this.sshConfigId + ", telnetConfigId=" + this.telnetConfigId + ", groupId=" + this.groupId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ", sharingMode=" + this.sharingMode + ", credentialsMode=" + this.credentialsMode + ")";
    }

    public /* synthetic */ GroupBulkV3(int i10, String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3, String str4, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
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
            this.sharingMode = null;
        } else {
            this.sharingMode = str3;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.credentialsMode = null;
        } else {
            this.credentialsMode = str4;
        }
    }

    public /* synthetic */ GroupBulkV3(String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3, String str4, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? null : obj3, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? 0L : j10, (i10 & 64) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 128) != 0 ? null : l11, (i10 & 256) != 0 ? null : str3, (i10 & File.FLAG_O_TRUNC) != 0 ? null : str4);
    }

    public GroupBulkV3(String str, Object obj, Object obj2, Object obj3, Long l10, long j10, String str2, Long l11, String str3, String str4) {
        super(null);
        this.label = str;
        this.sshConfigId = obj;
        this.telnetConfigId = obj2;
        this.groupId = obj3;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
        this.sharingMode = str3;
        this.credentialsMode = str4;
    }
}
