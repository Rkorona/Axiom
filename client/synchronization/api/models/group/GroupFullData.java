package com.server.auditor.ssh.client.synchronization.api.models.group;

import com.crystalnix.termius.libtermius.sftp.File;
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
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class GroupFullData implements Shareable, CryptoErrorInterface, IParentGroup {

    @b
    public String content;
    public String credentialsMode;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39046id;
    private Boolean isShared;

    @a
    public String label;
    private Long localId;
    private WithRecourseId parentGroupId;
    public String sharingMode;
    private WithRecourseId sshConfigId;
    private WithRecourseId telnetConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return GroupFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ GroupFullData(int i10, int i11, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, Boolean bool, String str4, String str5, Long l11, s2 s2Var) {
        if (5 != (i10 & 5)) {
            d2.a(i10, 5, GroupFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39046id = i11;
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        this.updatedAt = str;
        if ((i10 & 8) == 0) {
            this.sshConfigId = null;
        } else {
            this.sshConfigId = withRecourseId;
        }
        if ((i10 & 16) == 0) {
            this.telnetConfigId = null;
        } else {
            this.telnetConfigId = withRecourseId2;
        }
        if ((i10 & 32) == 0) {
            this.parentGroupId = null;
        } else {
            this.parentGroupId = withRecourseId3;
        }
        if ((i10 & 64) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i10 & 128) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i10 & 256) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.sharingMode = null;
        } else {
            this.sharingMode = str4;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.credentialsMode = null;
        } else {
            this.credentialsMode = str5;
        }
        if ((i10 & 2048) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39046id;
    }

    public static /* synthetic */ GroupFullData copy$default(GroupFullData groupFullData, int i10, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, Boolean bool, String str4, String str5, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = groupFullData.f39046id;
        }
        if ((i11 & 2) != 0) {
            l10 = groupFullData.localId;
        }
        if ((i11 & 4) != 0) {
            str = groupFullData.updatedAt;
        }
        if ((i11 & 8) != 0) {
            withRecourseId = groupFullData.sshConfigId;
        }
        if ((i11 & 16) != 0) {
            withRecourseId2 = groupFullData.telnetConfigId;
        }
        if ((i11 & 32) != 0) {
            withRecourseId3 = groupFullData.parentGroupId;
        }
        if ((i11 & 64) != 0) {
            str2 = groupFullData.content;
        }
        if ((i11 & 128) != 0) {
            str3 = groupFullData.label;
        }
        if ((i11 & 256) != 0) {
            bool = groupFullData.isShared;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            str4 = groupFullData.sharingMode;
        }
        if ((i11 & File.FLAG_O_APPEND) != 0) {
            str5 = groupFullData.credentialsMode;
        }
        if ((i11 & 2048) != 0) {
            l11 = groupFullData.encryptedWith;
        }
        String str6 = str5;
        Long l12 = l11;
        Boolean bool2 = bool;
        String str7 = str4;
        String str8 = str2;
        String str9 = str3;
        WithRecourseId withRecourseId4 = withRecourseId2;
        WithRecourseId withRecourseId5 = withRecourseId3;
        return groupFullData.copy(i10, l10, str, withRecourseId, withRecourseId4, withRecourseId5, str8, str9, bool2, str7, str6, l12);
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

    @o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("parent_group")
    public static /* synthetic */ void getParentGroupId$annotations() {
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

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(GroupFullData groupFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, groupFullData.f39046id);
        if (dVar.E(fVar, 1) || groupFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, groupFullData.localId);
        }
        dVar.f(fVar, 2, groupFullData.updatedAt);
        if (dVar.E(fVar, 3) || groupFullData.sshConfigId != null) {
            dVar.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, groupFullData.sshConfigId);
        }
        if (dVar.E(fVar, 4) || groupFullData.telnetConfigId != null) {
            dVar.v(fVar, 4, WithRecourseId$$serializer.INSTANCE, groupFullData.telnetConfigId);
        }
        if (dVar.E(fVar, 5) || groupFullData.parentGroupId != null) {
            dVar.v(fVar, 5, WithRecourseId$$serializer.INSTANCE, groupFullData.parentGroupId);
        }
        if (dVar.E(fVar, 6) || groupFullData.content != null) {
            dVar.v(fVar, 6, x2.f64817a, groupFullData.content);
        }
        if (dVar.E(fVar, 7) || groupFullData.label != null) {
            dVar.v(fVar, 7, x2.f64817a, groupFullData.label);
        }
        if (dVar.E(fVar, 8) || groupFullData.isShared != null) {
            dVar.v(fVar, 8, i.f64704a, groupFullData.isShared);
        }
        if (dVar.E(fVar, 9) || groupFullData.sharingMode != null) {
            dVar.v(fVar, 9, x2.f64817a, groupFullData.sharingMode);
        }
        if (dVar.E(fVar, 10) || groupFullData.credentialsMode != null) {
            dVar.v(fVar, 10, x2.f64817a, groupFullData.credentialsMode);
        }
        if (!dVar.E(fVar, 11) && groupFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 11, h1.f64699a, groupFullData.getEncryptedWith());
    }

    public final String component10() {
        return this.sharingMode;
    }

    public final String component11() {
        return this.credentialsMode;
    }

    public final Long component12() {
        return this.encryptedWith;
    }

    public final Long component2() {
        return this.localId;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final WithRecourseId component4() {
        return this.sshConfigId;
    }

    public final WithRecourseId component5() {
        return this.telnetConfigId;
    }

    public final WithRecourseId component6() {
        return this.parentGroupId;
    }

    public final String component7() {
        return this.content;
    }

    public final String component8() {
        return this.label;
    }

    public final Boolean component9() {
        return this.isShared;
    }

    public final GroupFullData copy(int i10, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, Boolean bool, String str4, String str5, Long l11) {
        t.f(str, "updatedAt");
        return new GroupFullData(i10, l10, str, withRecourseId, withRecourseId2, withRecourseId3, str2, str3, bool, str4, str5, l11);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.IParentGroup
    public Long currentId() {
        return Long.valueOf(this.f39046id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupFullData)) {
            return false;
        }
        GroupFullData groupFullData = (GroupFullData) obj;
        return this.f39046id == groupFullData.f39046id && t.b(this.localId, groupFullData.localId) && t.b(this.updatedAt, groupFullData.updatedAt) && t.b(this.sshConfigId, groupFullData.sshConfigId) && t.b(this.telnetConfigId, groupFullData.telnetConfigId) && t.b(this.parentGroupId, groupFullData.parentGroupId) && t.b(this.content, groupFullData.content) && t.b(this.label, groupFullData.label) && t.b(this.isShared, groupFullData.isShared) && t.b(this.sharingMode, groupFullData.sharingMode) && t.b(this.credentialsMode, groupFullData.credentialsMode) && t.b(this.encryptedWith, groupFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39046id;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final WithRecourseId getParentGroupId() {
        return this.parentGroupId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final WithRecourseId getSshConfigId() {
        return this.sshConfigId;
    }

    public final WithRecourseId getTelnetConfigId() {
        return this.telnetConfigId;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f39046id) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.updatedAt.hashCode()) * 31;
        WithRecourseId withRecourseId = this.sshConfigId;
        int iHashCode3 = (iHashCode2 + (withRecourseId == null ? 0 : withRecourseId.hashCode())) * 31;
        WithRecourseId withRecourseId2 = this.telnetConfigId;
        int iHashCode4 = (iHashCode3 + (withRecourseId2 == null ? 0 : withRecourseId2.hashCode())) * 31;
        WithRecourseId withRecourseId3 = this.parentGroupId;
        int iHashCode5 = (iHashCode4 + (withRecourseId3 == null ? 0 : withRecourseId3.hashCode())) * 31;
        String str = this.content;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.sharingMode;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.credentialsMode;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode10 + (l11 != null ? l11.hashCode() : 0);
    }

    public final Boolean isShared() {
        return this.isShared;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.group.IParentGroup
    public Long parentGroupId() {
        if (this.parentGroupId == null) {
            return null;
        }
        return Long.valueOf(r0.getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = Boolean.FALSE;
        setEncryptedWith(null);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setParentGroupId(WithRecourseId withRecourseId) {
        this.parentGroupId = withRecourseId;
    }

    public final void setShared(Boolean bool) {
        this.isShared = bool;
    }

    public final void setSshConfigId(WithRecourseId withRecourseId) {
        this.sshConfigId = withRecourseId;
    }

    public final void setTelnetConfigId(WithRecourseId withRecourseId) {
        this.telnetConfigId = withRecourseId;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "GroupFullData(id=" + this.f39046id + ", localId=" + this.localId + ", updatedAt=" + this.updatedAt + ", sshConfigId=" + this.sshConfigId + ", telnetConfigId=" + this.telnetConfigId + ", parentGroupId=" + this.parentGroupId + ", content=" + this.content + ", label=" + this.label + ", isShared=" + this.isShared + ", sharingMode=" + this.sharingMode + ", credentialsMode=" + this.credentialsMode + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public GroupFullData(int i10, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, Boolean bool, String str4, String str5, Long l11) {
        t.f(str, "updatedAt");
        this.f39046id = i10;
        this.localId = l10;
        this.updatedAt = str;
        this.sshConfigId = withRecourseId;
        this.telnetConfigId = withRecourseId2;
        this.parentGroupId = withRecourseId3;
        this.content = str2;
        this.label = str3;
        this.isShared = bool;
        this.sharingMode = str4;
        this.credentialsMode = str5;
        this.encryptedWith = l11;
    }

    public /* synthetic */ GroupFullData(int i10, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, Boolean bool, String str4, String str5, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : l10, str, (i11 & 8) != 0 ? null : withRecourseId, (i11 & 16) != 0 ? null : withRecourseId2, (i11 & 32) != 0 ? null : withRecourseId3, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : bool, (i11 & File.FLAG_O_TRUNC) != 0 ? null : str4, (i11 & File.FLAG_O_APPEND) != 0 ? null : str5, (i11 & 2048) != 0 ? null : l11);
    }
}
