package com.server.auditor.ssh.client.synchronization.api.models.pfrule;

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
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class RuleFullData implements Shareable, CryptoErrorInterface {
    private String boundAddress;

    @b
    public String content;
    private String createdAt;
    private Long encryptedWith;

    @a
    public String host;
    private WithRecourseId hostId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39058id;
    private Boolean isShared;
    private final String label;
    private Long localId;
    private Integer localPort;
    private Integer remotePort;
    private String type;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return RuleFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ RuleFullData(int i10, WithRecourseId withRecourseId, int i11, String str, String str2, Long l10, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, Boolean bool, Long l11, s2 s2Var) {
        if (10 != (i10 & 10)) {
            d2.a(i10, 10, RuleFullData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.hostId = null;
        } else {
            this.hostId = withRecourseId;
        }
        this.f39058id = i11;
        if ((i10 & 4) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str;
        }
        this.updatedAt = str2;
        if ((i10 & 16) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 32) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
        if ((i10 & 64) == 0) {
            this.boundAddress = null;
        } else {
            this.boundAddress = str4;
        }
        if ((i10 & 128) == 0) {
            this.localPort = null;
        } else {
            this.localPort = num;
        }
        if ((i10 & 256) == 0) {
            this.remotePort = null;
        } else {
            this.remotePort = num2;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.host = null;
        } else {
            this.host = str5;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.content = null;
        } else {
            this.content = str6;
        }
        if ((i10 & 2048) == 0) {
            this.label = null;
        } else {
            this.label = str7;
        }
        if ((i10 & 4096) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 8192) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final Boolean component13() {
        return this.isShared;
    }

    private final int component2() {
        return this.f39058id;
    }

    @o(Column.BOUND_ADDRESS)
    public static /* synthetic */ void getBoundAddress$annotations() {
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o(Column.CREATED_AT)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("hostname")
    public static /* synthetic */ void getHost$annotations() {
    }

    @o("host")
    public static /* synthetic */ void getHostId$annotations() {
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

    @o(Column.LOCAL_PORT)
    public static /* synthetic */ void getLocalPort$annotations() {
    }

    @o(Column.REMOTE_PORT)
    public static /* synthetic */ void getRemotePort$annotations() {
    }

    @o("pf_type")
    public static /* synthetic */ void getType$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RuleFullData ruleFullData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || ruleFullData.hostId != null) {
            dVar.v(fVar, 0, WithRecourseId$$serializer.INSTANCE, ruleFullData.hostId);
        }
        dVar.t(fVar, 1, ruleFullData.f39058id);
        if (dVar.E(fVar, 2) || ruleFullData.createdAt != null) {
            dVar.v(fVar, 2, x2.f64817a, ruleFullData.createdAt);
        }
        dVar.f(fVar, 3, ruleFullData.updatedAt);
        if (dVar.E(fVar, 4) || ruleFullData.localId != null) {
            dVar.v(fVar, 4, h1.f64699a, ruleFullData.localId);
        }
        if (dVar.E(fVar, 5) || ruleFullData.type != null) {
            dVar.v(fVar, 5, x2.f64817a, ruleFullData.type);
        }
        if (dVar.E(fVar, 6) || ruleFullData.boundAddress != null) {
            dVar.v(fVar, 6, x2.f64817a, ruleFullData.boundAddress);
        }
        if (dVar.E(fVar, 7) || ruleFullData.localPort != null) {
            dVar.v(fVar, 7, w0.f64808a, ruleFullData.localPort);
        }
        if (dVar.E(fVar, 8) || ruleFullData.remotePort != null) {
            dVar.v(fVar, 8, w0.f64808a, ruleFullData.remotePort);
        }
        if (dVar.E(fVar, 9) || ruleFullData.host != null) {
            dVar.v(fVar, 9, x2.f64817a, ruleFullData.host);
        }
        if (dVar.E(fVar, 10) || ruleFullData.content != null) {
            dVar.v(fVar, 10, x2.f64817a, ruleFullData.content);
        }
        if (dVar.E(fVar, 11) || ruleFullData.label != null) {
            dVar.v(fVar, 11, x2.f64817a, ruleFullData.label);
        }
        if (dVar.E(fVar, 12) || ruleFullData.isShared != null) {
            dVar.v(fVar, 12, i.f64704a, ruleFullData.isShared);
        }
        if (!dVar.E(fVar, 13) && ruleFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 13, h1.f64699a, ruleFullData.getEncryptedWith());
    }

    public final WithRecourseId component1() {
        return this.hostId;
    }

    public final String component10() {
        return this.host;
    }

    public final String component11() {
        return this.content;
    }

    public final String component12() {
        return this.label;
    }

    public final Long component14() {
        return this.encryptedWith;
    }

    public final String component3() {
        return this.createdAt;
    }

    public final String component4() {
        return this.updatedAt;
    }

    public final Long component5() {
        return this.localId;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.boundAddress;
    }

    public final Integer component8() {
        return this.localPort;
    }

    public final Integer component9() {
        return this.remotePort;
    }

    public final RuleFullData copy(WithRecourseId withRecourseId, int i10, String str, String str2, Long l10, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, Boolean bool, Long l11) {
        t.f(str2, "updatedAt");
        return new RuleFullData(withRecourseId, i10, str, str2, l10, str3, str4, num, num2, str5, str6, str7, bool, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleFullData)) {
            return false;
        }
        RuleFullData ruleFullData = (RuleFullData) obj;
        return t.b(this.hostId, ruleFullData.hostId) && this.f39058id == ruleFullData.f39058id && t.b(this.createdAt, ruleFullData.createdAt) && t.b(this.updatedAt, ruleFullData.updatedAt) && t.b(this.localId, ruleFullData.localId) && t.b(this.type, ruleFullData.type) && t.b(this.boundAddress, ruleFullData.boundAddress) && t.b(this.localPort, ruleFullData.localPort) && t.b(this.remotePort, ruleFullData.remotePort) && t.b(this.host, ruleFullData.host) && t.b(this.content, ruleFullData.content) && t.b(this.label, ruleFullData.label) && t.b(this.isShared, ruleFullData.isShared) && t.b(this.encryptedWith, ruleFullData.encryptedWith);
    }

    public final String getBoundAddress() {
        return this.boundAddress;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final WithRecourseId getHostId() {
        return this.hostId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39058id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final Integer getLocalPort() {
        return this.localPort;
    }

    public final Integer getRemotePort() {
        return this.remotePort;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        WithRecourseId withRecourseId = this.hostId;
        int iHashCode = (((withRecourseId == null ? 0 : withRecourseId.hashCode()) * 31) + Integer.hashCode(this.f39058id)) * 31;
        String str = this.createdAt;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.updatedAt.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.boundAddress;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.localPort;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.remotePort;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.host;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.content;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.label;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode11 + (l11 != null ? l11.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = Boolean.FALSE;
        setEncryptedWith(null);
    }

    public final void setBoundAddress(String str) {
        this.boundAddress = str;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setHostId(WithRecourseId withRecourseId) {
        this.hostId = withRecourseId;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setLocalPort(Integer num) {
        this.localPort = num;
    }

    public final void setRemotePort(Integer num) {
        this.remotePort = num;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "RuleFullData(hostId=" + this.hostId + ", id=" + this.f39058id + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", localId=" + this.localId + ", type=" + this.type + ", boundAddress=" + this.boundAddress + ", localPort=" + this.localPort + ", remotePort=" + this.remotePort + ", host=" + this.host + ", content=" + this.content + ", label=" + this.label + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public RuleFullData(WithRecourseId withRecourseId, int i10, String str, String str2, Long l10, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, Boolean bool, Long l11) {
        t.f(str2, "updatedAt");
        this.hostId = withRecourseId;
        this.f39058id = i10;
        this.createdAt = str;
        this.updatedAt = str2;
        this.localId = l10;
        this.type = str3;
        this.boundAddress = str4;
        this.localPort = num;
        this.remotePort = num2;
        this.host = str5;
        this.content = str6;
        this.label = str7;
        this.isShared = bool;
        this.encryptedWith = l11;
    }

    public /* synthetic */ RuleFullData(WithRecourseId withRecourseId, int i10, String str, String str2, Long l10, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, Boolean bool, Long l11, int i11, k kVar) {
        this((i11 & 1) != 0 ? null : withRecourseId, i10, (i11 & 4) != 0 ? null : str, str2, (i11 & 16) != 0 ? null : l10, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : num, (i11 & 256) != 0 ? null : num2, (i11 & File.FLAG_O_TRUNC) != 0 ? null : str5, (i11 & File.FLAG_O_APPEND) != 0 ? null : str6, (i11 & 2048) != 0 ? null : str7, (i11 & 4096) != 0 ? null : bool, (i11 & 8192) != 0 ? null : l11);
    }
}
