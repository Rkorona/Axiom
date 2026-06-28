package com.server.auditor.ssh.client.synchronization.api.models.host;

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
public final class HostFullData implements Shareable, CryptoErrorInterface {

    @a
    public String address;
    private String backspaceType;

    @b
    public String content;
    public String credentialsMode;
    private Long encryptedWith;
    private WithRecourseId group;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39050id;
    private String interactionDate;
    private Boolean isShared;

    @a
    public String label;
    private Long localId;
    private String osName;
    private WithRecourseId sshConfig;
    private WithRecourseId telnetConfig;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return HostFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ HostFullData(int i10, int i11, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, Long l11, s2 s2Var) {
        if (5 != (i10 & 5)) {
            d2.a(i10, 5, HostFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39050id = i11;
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        this.updatedAt = str;
        if ((i10 & 8) == 0) {
            this.sshConfig = null;
        } else {
            this.sshConfig = withRecourseId;
        }
        if ((i10 & 16) == 0) {
            this.telnetConfig = null;
        } else {
            this.telnetConfig = withRecourseId2;
        }
        if ((i10 & 32) == 0) {
            this.group = null;
        } else {
            this.group = withRecourseId3;
        }
        if ((i10 & 64) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i10 & 128) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        if ((i10 & 256) == 0) {
            this.label = null;
        } else {
            this.label = str4;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.osName = null;
        } else {
            this.osName = str5;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.interactionDate = null;
        } else {
            this.interactionDate = str6;
        }
        if ((i10 & 2048) == 0) {
            this.backspaceType = null;
        } else {
            this.backspaceType = str7;
        }
        if ((i10 & 4096) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 8192) == 0) {
            this.credentialsMode = null;
        } else {
            this.credentialsMode = str8;
        }
        if ((i10 & 16384) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39050id;
    }

    private final Boolean component13() {
        return this.isShared;
    }

    @o(Column.ADDRESS)
    public static /* synthetic */ void getAddress$annotations() {
    }

    @o("backspace")
    public static /* synthetic */ void getBackspaceType$annotations() {
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
    public static /* synthetic */ void getGroup$annotations() {
    }

    @o("id")
    private static /* synthetic */ void getId$annotations() {
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

    @o("ssh_config")
    public static /* synthetic */ void getSshConfig$annotations() {
    }

    @o("telnet_config")
    public static /* synthetic */ void getTelnetConfig$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HostFullData hostFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, hostFullData.f39050id);
        if (dVar.E(fVar, 1) || hostFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, hostFullData.localId);
        }
        dVar.f(fVar, 2, hostFullData.updatedAt);
        if (dVar.E(fVar, 3) || hostFullData.sshConfig != null) {
            dVar.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, hostFullData.sshConfig);
        }
        if (dVar.E(fVar, 4) || hostFullData.telnetConfig != null) {
            dVar.v(fVar, 4, WithRecourseId$$serializer.INSTANCE, hostFullData.telnetConfig);
        }
        if (dVar.E(fVar, 5) || hostFullData.group != null) {
            dVar.v(fVar, 5, WithRecourseId$$serializer.INSTANCE, hostFullData.group);
        }
        if (dVar.E(fVar, 6) || hostFullData.content != null) {
            dVar.v(fVar, 6, x2.f64817a, hostFullData.content);
        }
        if (dVar.E(fVar, 7) || hostFullData.address != null) {
            dVar.v(fVar, 7, x2.f64817a, hostFullData.address);
        }
        if (dVar.E(fVar, 8) || hostFullData.label != null) {
            dVar.v(fVar, 8, x2.f64817a, hostFullData.label);
        }
        if (dVar.E(fVar, 9) || hostFullData.osName != null) {
            dVar.v(fVar, 9, x2.f64817a, hostFullData.osName);
        }
        if (dVar.E(fVar, 10) || hostFullData.interactionDate != null) {
            dVar.v(fVar, 10, x2.f64817a, hostFullData.interactionDate);
        }
        if (dVar.E(fVar, 11) || hostFullData.backspaceType != null) {
            dVar.v(fVar, 11, x2.f64817a, hostFullData.backspaceType);
        }
        if (dVar.E(fVar, 12) || hostFullData.isShared != null) {
            dVar.v(fVar, 12, i.f64704a, hostFullData.isShared);
        }
        if (dVar.E(fVar, 13) || hostFullData.credentialsMode != null) {
            dVar.v(fVar, 13, x2.f64817a, hostFullData.credentialsMode);
        }
        if (!dVar.E(fVar, 14) && hostFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 14, h1.f64699a, hostFullData.getEncryptedWith());
    }

    public final String component10() {
        return this.osName;
    }

    public final String component11() {
        return this.interactionDate;
    }

    public final String component12() {
        return this.backspaceType;
    }

    public final String component14() {
        return this.credentialsMode;
    }

    public final Long component15() {
        return this.encryptedWith;
    }

    public final Long component2() {
        return this.localId;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final WithRecourseId component4() {
        return this.sshConfig;
    }

    public final WithRecourseId component5() {
        return this.telnetConfig;
    }

    public final WithRecourseId component6() {
        return this.group;
    }

    public final String component7() {
        return this.content;
    }

    public final String component8() {
        return this.address;
    }

    public final String component9() {
        return this.label;
    }

    public final HostFullData copy(int i10, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, Long l11) {
        t.f(str, "updatedAt");
        return new HostFullData(i10, l10, str, withRecourseId, withRecourseId2, withRecourseId3, str2, str3, str4, str5, str6, str7, bool, str8, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostFullData)) {
            return false;
        }
        HostFullData hostFullData = (HostFullData) obj;
        return this.f39050id == hostFullData.f39050id && t.b(this.localId, hostFullData.localId) && t.b(this.updatedAt, hostFullData.updatedAt) && t.b(this.sshConfig, hostFullData.sshConfig) && t.b(this.telnetConfig, hostFullData.telnetConfig) && t.b(this.group, hostFullData.group) && t.b(this.content, hostFullData.content) && t.b(this.address, hostFullData.address) && t.b(this.label, hostFullData.label) && t.b(this.osName, hostFullData.osName) && t.b(this.interactionDate, hostFullData.interactionDate) && t.b(this.backspaceType, hostFullData.backspaceType) && t.b(this.isShared, hostFullData.isShared) && t.b(this.credentialsMode, hostFullData.credentialsMode) && t.b(this.encryptedWith, hostFullData.encryptedWith);
    }

    public final String getBackspaceType() {
        return this.backspaceType;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final WithRecourseId getGroup() {
        return this.group;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39050id;
    }

    public final String getInteractionDate() {
        return this.interactionDate;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final String getOsName() {
        return this.osName;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final WithRecourseId getSshConfig() {
        return this.sshConfig;
    }

    public final WithRecourseId getTelnetConfig() {
        return this.telnetConfig;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f39050id) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.updatedAt.hashCode()) * 31;
        WithRecourseId withRecourseId = this.sshConfig;
        int iHashCode3 = (iHashCode2 + (withRecourseId == null ? 0 : withRecourseId.hashCode())) * 31;
        WithRecourseId withRecourseId2 = this.telnetConfig;
        int iHashCode4 = (iHashCode3 + (withRecourseId2 == null ? 0 : withRecourseId2.hashCode())) * 31;
        WithRecourseId withRecourseId3 = this.group;
        int iHashCode5 = (iHashCode4 + (withRecourseId3 == null ? 0 : withRecourseId3.hashCode())) * 31;
        String str = this.content;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.osName;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.interactionDate;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.backspaceType;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.credentialsMode;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode13 + (l11 != null ? l11.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = Boolean.FALSE;
        setEncryptedWith(null);
    }

    public final void setBackspaceType(String str) {
        this.backspaceType = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setGroup(WithRecourseId withRecourseId) {
        this.group = withRecourseId;
    }

    public final void setInteractionDate(String str) {
        this.interactionDate = str;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setOsName(String str) {
        this.osName = str;
    }

    public final void setSshConfig(WithRecourseId withRecourseId) {
        this.sshConfig = withRecourseId;
    }

    public final void setTelnetConfig(WithRecourseId withRecourseId) {
        this.telnetConfig = withRecourseId;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "HostFullData(id=" + this.f39050id + ", localId=" + this.localId + ", updatedAt=" + this.updatedAt + ", sshConfig=" + this.sshConfig + ", telnetConfig=" + this.telnetConfig + ", group=" + this.group + ", content=" + this.content + ", address=" + this.address + ", label=" + this.label + ", osName=" + this.osName + ", interactionDate=" + this.interactionDate + ", backspaceType=" + this.backspaceType + ", isShared=" + this.isShared + ", credentialsMode=" + this.credentialsMode + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public HostFullData(int i10, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, Long l11) {
        t.f(str, "updatedAt");
        this.f39050id = i10;
        this.localId = l10;
        this.updatedAt = str;
        this.sshConfig = withRecourseId;
        this.telnetConfig = withRecourseId2;
        this.group = withRecourseId3;
        this.content = str2;
        this.address = str3;
        this.label = str4;
        this.osName = str5;
        this.interactionDate = str6;
        this.backspaceType = str7;
        this.isShared = bool;
        this.credentialsMode = str8;
        this.encryptedWith = l11;
    }

    public /* synthetic */ HostFullData(int i10, Long l10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, WithRecourseId withRecourseId3, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : l10, str, (i11 & 8) != 0 ? null : withRecourseId, (i11 & 16) != 0 ? null : withRecourseId2, (i11 & 32) != 0 ? null : withRecourseId3, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4, (i11 & File.FLAG_O_TRUNC) != 0 ? null : str5, (i11 & File.FLAG_O_APPEND) != 0 ? null : str6, (i11 & 2048) != 0 ? null : str7, (i11 & 4096) != 0 ? null : bool, (i11 & 8192) != 0 ? null : str8, (i11 & 16384) != 0 ? null : l11);
    }
}
