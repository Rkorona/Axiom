package com.server.auditor.ssh.client.synchronization.api.models.chainhost;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostBulk;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.h1;
import lv.s2;
import lv.x2;
import tp.b;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ChainHostBulk extends CommonBulkShareable {
    private Long encryptedWith;
    private final List<Object> hostIds;
    private final Long localId;
    private final long remoteId;
    private Object sshConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, o.b(r.f82638b, new a() { // from class: zm.a
        @Override // iu.a
        public final Object a() {
            return ChainHostBulk._childSerializers$_anonymous_();
        }
    }), null, null, null, null};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ChainHostBulk$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChainHostBulk(int i10, Object obj, List list, Long l10, long j10, String str, Long l11, s2 s2Var) {
        super(i10, s2Var);
        if (10 != (i10 & 10)) {
            d2.a(i10, 10, ChainHostBulk$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.sshConfigId = null;
        } else {
            this.sshConfigId = obj;
        }
        this.hostIds = list;
        if ((i10 & 4) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        this.remoteId = j10;
        if ((i10 & 16) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(tp.c.f80868a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainHostBulk copy$default(ChainHostBulk chainHostBulk, Object obj, List list, Long l10, long j10, String str, Long l11, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = chainHostBulk.sshConfigId;
        }
        if ((i10 & 2) != 0) {
            list = chainHostBulk.hostIds;
        }
        if ((i10 & 4) != 0) {
            l10 = chainHostBulk.localId;
        }
        if ((i10 & 8) != 0) {
            j10 = chainHostBulk.remoteId;
        }
        if ((i10 & 16) != 0) {
            str = chainHostBulk.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l11 = chainHostBulk.encryptedWith;
        }
        long j11 = j10;
        Long l12 = l10;
        return chainHostBulk.copy(obj, list, l12, j11, str, l11);
    }

    @hv.o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @hv.o("hosts_chain")
    public static /* synthetic */ void getHostIds$annotations() {
    }

    @hv.o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @hv.o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @hv.o("ssh_config")
    public static /* synthetic */ void getSshConfigId$annotations() {
    }

    @hv.o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ChainHostBulk chainHostBulk, d dVar, jv.f fVar) {
        CommonBulkShareable.write$Self(chainHostBulk, dVar, fVar);
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || chainHostBulk.sshConfigId != null) {
            dVar.v(fVar, 0, b.f80841a, chainHostBulk.sshConfigId);
        }
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), chainHostBulk.hostIds);
        if (dVar.E(fVar, 2) || chainHostBulk.getLocalId() != null) {
            dVar.v(fVar, 2, h1.f64699a, chainHostBulk.getLocalId());
        }
        dVar.q(fVar, 3, chainHostBulk.getRemoteId().longValue());
        if (dVar.E(fVar, 4) || chainHostBulk.getUpdatedAt() != null) {
            dVar.v(fVar, 4, x2.f64817a, chainHostBulk.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && chainHostBulk.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, chainHostBulk.getEncryptedWith());
    }

    public final Object component1() {
        return this.sshConfigId;
    }

    public final List<Object> component2() {
        return this.hostIds;
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

    public final ChainHostBulk copy(Object obj, List<? extends Object> list, Long l10, long j10, String str, Long l11) {
        t.f(list, "hostIds");
        return new ChainHostBulk(obj, list, l10, j10, str, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainHostBulk)) {
            return false;
        }
        ChainHostBulk chainHostBulk = (ChainHostBulk) obj;
        return t.b(this.sshConfigId, chainHostBulk.sshConfigId) && t.b(this.hostIds, chainHostBulk.hostIds) && t.b(this.localId, chainHostBulk.localId) && this.remoteId == chainHostBulk.remoteId && t.b(this.updatedAt, chainHostBulk.updatedAt) && t.b(this.encryptedWith, chainHostBulk.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final List<Object> getHostIds() {
        return this.hostIds;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    public final Object getSshConfigId() {
        return this.sshConfigId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Object obj = this.sshConfigId;
        int iHashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + this.hostIds.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setSshConfigId(Object obj) {
        this.sshConfigId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "ChainHostBulk(sshConfigId=" + this.sshConfigId + ", hostIds=" + this.hostIds + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ ChainHostBulk(Object obj, List list, Long l10, long j10, String str, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : obj, list, (i10 & 4) != 0 ? null : l10, j10, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : l11);
    }

    public ChainHostBulk(Object obj, List<? extends Object> list, Long l10, long j10, String str, Long l11) {
        t.f(list, "hostIds");
        this.sshConfigId = obj;
        this.hostIds = list;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str;
        this.encryptedWith = l11;
    }
}
