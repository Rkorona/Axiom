package com.server.auditor.ssh.client.synchronization.api.models.pfrule;

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
import lv.w0;
import lv.x2;
import tp.b;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class RuleBulkV3 extends RuleBulk {
    private final String boundAddress;
    private Long encryptedWith;

    @a
    public String host;
    private final String label;
    private final Long localId;
    private final Integer localPort;
    private final long remoteId;
    private final Integer remotePort;
    private Object serverId;
    public String type;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return RuleBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public RuleBulkV3() {
        this((String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, 2047, (k) null);
    }

    public static /* synthetic */ RuleBulkV3 copy$default(RuleBulkV3 ruleBulkV3, String str, String str2, Integer num, Integer num2, String str3, String str4, Object obj, Long l10, long j10, String str5, Long l11, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = ruleBulkV3.type;
        }
        if ((i10 & 2) != 0) {
            str2 = ruleBulkV3.boundAddress;
        }
        if ((i10 & 4) != 0) {
            num = ruleBulkV3.localPort;
        }
        if ((i10 & 8) != 0) {
            num2 = ruleBulkV3.remotePort;
        }
        if ((i10 & 16) != 0) {
            str3 = ruleBulkV3.host;
        }
        if ((i10 & 32) != 0) {
            str4 = ruleBulkV3.label;
        }
        if ((i10 & 64) != 0) {
            obj = ruleBulkV3.serverId;
        }
        if ((i10 & 128) != 0) {
            l10 = ruleBulkV3.localId;
        }
        if ((i10 & 256) != 0) {
            j10 = ruleBulkV3.remoteId;
        }
        if ((i10 & File.FLAG_O_TRUNC) != 0) {
            str5 = ruleBulkV3.updatedAt;
        }
        if ((i10 & File.FLAG_O_APPEND) != 0) {
            l11 = ruleBulkV3.encryptedWith;
        }
        long j11 = j10;
        Object obj3 = obj;
        Long l12 = l10;
        String str6 = str3;
        String str7 = str4;
        Integer num3 = num;
        Integer num4 = num2;
        return ruleBulkV3.copy(str, str2, num3, num4, str6, str7, obj3, l12, j11, str5, l11);
    }

    @o(Column.BOUND_ADDRESS)
    public static /* synthetic */ void getBoundAddress$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("hostname")
    public static /* synthetic */ void getHost$annotations() {
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

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o(Column.REMOTE_PORT)
    public static /* synthetic */ void getRemotePort$annotations() {
    }

    @o("host")
    public static /* synthetic */ void getServerId$annotations() {
    }

    @o("pf_type")
    public static /* synthetic */ void getType$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RuleBulkV3 ruleBulkV3, d dVar, f fVar) {
        Long localId;
        if (dVar.E(fVar, 0) || ruleBulkV3.type != null) {
            dVar.v(fVar, 0, x2.f64817a, ruleBulkV3.type);
        }
        if (dVar.E(fVar, 1) || ruleBulkV3.boundAddress != null) {
            dVar.v(fVar, 1, x2.f64817a, ruleBulkV3.boundAddress);
        }
        if (dVar.E(fVar, 2) || ruleBulkV3.localPort != null) {
            dVar.v(fVar, 2, w0.f64808a, ruleBulkV3.localPort);
        }
        if (dVar.E(fVar, 3) || ruleBulkV3.remotePort != null) {
            dVar.v(fVar, 3, w0.f64808a, ruleBulkV3.remotePort);
        }
        if (dVar.E(fVar, 4) || ruleBulkV3.host != null) {
            dVar.v(fVar, 4, x2.f64817a, ruleBulkV3.host);
        }
        if (dVar.E(fVar, 5) || ruleBulkV3.label != null) {
            dVar.v(fVar, 5, x2.f64817a, ruleBulkV3.label);
        }
        if (dVar.E(fVar, 6) || ruleBulkV3.getServerId() != null) {
            dVar.v(fVar, 6, b.f80841a, ruleBulkV3.getServerId());
        }
        if (dVar.E(fVar, 7) || (localId = ruleBulkV3.getLocalId()) == null || localId.longValue() != 0) {
            dVar.v(fVar, 7, h1.f64699a, ruleBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 8) || ruleBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 8, ruleBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 9) || !t.b(ruleBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 9, x2.f64817a, ruleBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 10) && ruleBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 10, h1.f64699a, ruleBulkV3.getEncryptedWith());
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.updatedAt;
    }

    public final Long component11() {
        return this.encryptedWith;
    }

    public final String component2() {
        return this.boundAddress;
    }

    public final Integer component3() {
        return this.localPort;
    }

    public final Integer component4() {
        return this.remotePort;
    }

    public final String component5() {
        return this.host;
    }

    public final String component6() {
        return this.label;
    }

    public final Object component7() {
        return this.serverId;
    }

    public final Long component8() {
        return this.localId;
    }

    public final long component9() {
        return this.remoteId;
    }

    public final RuleBulkV3 copy(String str, String str2, Integer num, Integer num2, String str3, String str4, Object obj, Long l10, long j10, String str5, Long l11) {
        return new RuleBulkV3(str, str2, num, num2, str3, str4, obj, l10, j10, str5, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleBulkV3)) {
            return false;
        }
        RuleBulkV3 ruleBulkV3 = (RuleBulkV3) obj;
        return t.b(this.type, ruleBulkV3.type) && t.b(this.boundAddress, ruleBulkV3.boundAddress) && t.b(this.localPort, ruleBulkV3.localPort) && t.b(this.remotePort, ruleBulkV3.remotePort) && t.b(this.host, ruleBulkV3.host) && t.b(this.label, ruleBulkV3.label) && t.b(this.serverId, ruleBulkV3.serverId) && t.b(this.localId, ruleBulkV3.localId) && this.remoteId == ruleBulkV3.remoteId && t.b(this.updatedAt, ruleBulkV3.updatedAt) && t.b(this.encryptedWith, ruleBulkV3.encryptedWith);
    }

    public final String getBoundAddress() {
        return this.boundAddress;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    public final Integer getLocalPort() {
        return this.localPort;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    public final Integer getRemotePort() {
        return this.remotePort;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleBulk
    public Object getServerId() {
        return this.serverId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.boundAddress;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.localPort;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.remotePort;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.host;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Object obj = this.serverId;
        int iHashCode7 = (iHashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode8 = (((iHashCode7 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str5 = this.updatedAt;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode9 + (l11 != null ? l11.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleBulk
    public void setServerId(Object obj) {
        this.serverId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "RuleBulkV3(type=" + this.type + ", boundAddress=" + this.boundAddress + ", localPort=" + this.localPort + ", remotePort=" + this.remotePort + ", host=" + this.host + ", label=" + this.label + ", serverId=" + this.serverId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ RuleBulkV3(int i10, String str, String str2, Integer num, Integer num2, String str3, String str4, Object obj, Long l10, long j10, String str5, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i10 & 2) == 0) {
            this.boundAddress = null;
        } else {
            this.boundAddress = str2;
        }
        if ((i10 & 4) == 0) {
            this.localPort = null;
        } else {
            this.localPort = num;
        }
        if ((i10 & 8) == 0) {
            this.remotePort = null;
        } else {
            this.remotePort = num2;
        }
        if ((i10 & 16) == 0) {
            this.host = null;
        } else {
            this.host = str3;
        }
        if ((i10 & 32) == 0) {
            this.label = null;
        } else {
            this.label = str4;
        }
        if ((i10 & 64) == 0) {
            this.serverId = null;
        } else {
            this.serverId = obj;
        }
        if ((i10 & 128) == 0) {
            this.localId = 0L;
        } else {
            this.localId = l10;
        }
        if ((i10 & 256) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str5;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ RuleBulkV3(String str, String str2, Integer num, Integer num2, String str3, String str4, Object obj, Long l10, long j10, String str5, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : obj, (i10 & 128) != 0 ? 0L : l10, (i10 & 256) == 0 ? j10 : 0L, (i10 & File.FLAG_O_TRUNC) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str5, (i10 & File.FLAG_O_APPEND) != 0 ? null : l11);
    }

    public RuleBulkV3(String str, String str2, Integer num, Integer num2, String str3, String str4, Object obj, Long l10, long j10, String str5, Long l11) {
        super(null);
        this.type = str;
        this.boundAddress = str2;
        this.localPort = num;
        this.remotePort = num2;
        this.host = str3;
        this.label = str4;
        this.serverId = obj;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str5;
        this.encryptedWith = l11;
    }
}
