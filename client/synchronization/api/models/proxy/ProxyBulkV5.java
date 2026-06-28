package com.server.auditor.ssh.client.synchronization.api.models.proxy;

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
public final class ProxyBulkV5 extends ProxyBulk {
    public static final String CONTENT_SERIAL_NAME = "content";

    @b
    public String content;
    private Long encryptedWith;
    private Object identityId;
    private final Long localId;
    private final long remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return ProxyBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProxyBulkV5() {
        this((String) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, 63, (k) null);
    }

    public static /* synthetic */ ProxyBulkV5 copy$default(ProxyBulkV5 proxyBulkV5, String str, Object obj, Long l10, long j10, String str2, Long l11, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = proxyBulkV5.content;
        }
        if ((i10 & 2) != 0) {
            obj = proxyBulkV5.identityId;
        }
        if ((i10 & 4) != 0) {
            l10 = proxyBulkV5.localId;
        }
        if ((i10 & 8) != 0) {
            j10 = proxyBulkV5.remoteId;
        }
        if ((i10 & 16) != 0) {
            str2 = proxyBulkV5.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l11 = proxyBulkV5.encryptedWith;
        }
        long j11 = j10;
        Long l12 = l10;
        return proxyBulkV5.copy(str, obj, l12, j11, str2, l11);
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("identity")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProxyBulkV5 proxyBulkV5, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || proxyBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, proxyBulkV5.content);
        }
        if (dVar.E(fVar, 1) || proxyBulkV5.getIdentityId() != null) {
            dVar.v(fVar, 1, tp.b.f80841a, proxyBulkV5.getIdentityId());
        }
        if (dVar.E(fVar, 2) || proxyBulkV5.getLocalId() != null) {
            dVar.v(fVar, 2, h1.f64699a, proxyBulkV5.getLocalId());
        }
        if (dVar.E(fVar, 3) || proxyBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 3, proxyBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 4) || !t.b(proxyBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 4, x2.f64817a, proxyBulkV5.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && proxyBulkV5.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, proxyBulkV5.getEncryptedWith());
    }

    public final String component1() {
        return this.content;
    }

    public final Object component2() {
        return this.identityId;
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

    public final ProxyBulkV5 copy(String str, Object obj, Long l10, long j10, String str2, Long l11) {
        return new ProxyBulkV5(str, obj, l10, j10, str2, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProxyBulkV5)) {
            return false;
        }
        ProxyBulkV5 proxyBulkV5 = (ProxyBulkV5) obj;
        return t.b(this.content, proxyBulkV5.content) && t.b(this.identityId, proxyBulkV5.identityId) && t.b(this.localId, proxyBulkV5.localId) && this.remoteId == proxyBulkV5.remoteId && t.b(this.updatedAt, proxyBulkV5.updatedAt) && t.b(this.encryptedWith, proxyBulkV5.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulk
    public Object getIdentityId() {
        return this.identityId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.identityId;
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

    @Override // com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulk
    public void setIdentityId(Object obj) {
        this.identityId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "ProxyBulkV5(content=" + this.content + ", identityId=" + this.identityId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ ProxyBulkV5(int i10, String str, Object obj, Long l10, long j10, String str2, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 2) == 0) {
            this.identityId = null;
        } else {
            this.identityId = obj;
        }
        if ((i10 & 4) == 0) {
            this.localId = null;
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

    public /* synthetic */ ProxyBulkV5(String str, Object obj, Long l10, long j10, String str2, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 32) != 0 ? null : l11);
    }

    public ProxyBulkV5(String str, Object obj, Long l10, long j10, String str2, Long l11) {
        super(null);
        this.content = str;
        this.identityId = obj;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
    }
}
