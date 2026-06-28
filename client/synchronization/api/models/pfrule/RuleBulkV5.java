package com.server.auditor.ssh.client.synchronization.api.models.pfrule;

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
public final class RuleBulkV5 extends RuleBulk {
    public static final String CONTENT_SERIAL_NAME = "content";

    @b
    public String content;
    private Long encryptedWith;
    private final Long localId;
    private final long remoteId;
    private Object serverId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return RuleBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RuleBulkV5() {
        this((String) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, 63, (k) null);
    }

    public static /* synthetic */ RuleBulkV5 copy$default(RuleBulkV5 ruleBulkV5, String str, Object obj, Long l10, long j10, String str2, Long l11, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = ruleBulkV5.content;
        }
        if ((i10 & 2) != 0) {
            obj = ruleBulkV5.serverId;
        }
        if ((i10 & 4) != 0) {
            l10 = ruleBulkV5.localId;
        }
        if ((i10 & 8) != 0) {
            j10 = ruleBulkV5.remoteId;
        }
        if ((i10 & 16) != 0) {
            str2 = ruleBulkV5.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l11 = ruleBulkV5.encryptedWith;
        }
        long j11 = j10;
        Long l12 = l10;
        return ruleBulkV5.copy(str, obj, l12, j11, str2, l11);
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("host")
    public static /* synthetic */ void getServerId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RuleBulkV5 ruleBulkV5, d dVar, f fVar) {
        Long localId;
        if (dVar.E(fVar, 0) || ruleBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, ruleBulkV5.content);
        }
        if (dVar.E(fVar, 1) || ruleBulkV5.getServerId() != null) {
            dVar.v(fVar, 1, tp.b.f80841a, ruleBulkV5.getServerId());
        }
        if (dVar.E(fVar, 2) || (localId = ruleBulkV5.getLocalId()) == null || localId.longValue() != 0) {
            dVar.v(fVar, 2, h1.f64699a, ruleBulkV5.getLocalId());
        }
        if (dVar.E(fVar, 3) || ruleBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 3, ruleBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 4) || !t.b(ruleBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 4, x2.f64817a, ruleBulkV5.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && ruleBulkV5.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, ruleBulkV5.getEncryptedWith());
    }

    public final String component1() {
        return this.content;
    }

    public final Object component2() {
        return this.serverId;
    }

    public final Long component3() {
        return this.localId;
    }

    public final long component4() {
        return this.remoteId;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final Long component6() {
        return this.encryptedWith;
    }

    public final RuleBulkV5 copy(String str, Object obj, Long l10, long j10, String str2, Long l11) {
        return new RuleBulkV5(str, obj, l10, j10, str2, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleBulkV5)) {
            return false;
        }
        RuleBulkV5 ruleBulkV5 = (RuleBulkV5) obj;
        return t.b(this.content, ruleBulkV5.content) && t.b(this.serverId, ruleBulkV5.serverId) && t.b(this.localId, ruleBulkV5.localId) && this.remoteId == ruleBulkV5.remoteId && t.b(this.updatedAt, ruleBulkV5.updatedAt) && t.b(this.encryptedWith, ruleBulkV5.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
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
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.serverId;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode3 = (((iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str2 = this.updatedAt;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
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
        return "RuleBulkV5(content=" + this.content + ", serverId=" + this.serverId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ RuleBulkV5(int i10, String str, Object obj, Long l10, long j10, String str2, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 2) == 0) {
            this.serverId = null;
        } else {
            this.serverId = obj;
        }
        if ((i10 & 4) == 0) {
            this.localId = 0L;
        } else {
            this.localId = l10;
        }
        if ((i10 & 8) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 16) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str2;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ RuleBulkV5(String str, Object obj, Long l10, long j10, String str2, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? 0L : l10, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 32) != 0 ? null : l11);
    }

    public RuleBulkV5(String str, Object obj, Long l10, long j10, String str2, Long l11) {
        super(null);
        this.content = str;
        this.serverId = obj;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
    }
}
