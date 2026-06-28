package com.server.auditor.ssh.client.synchronization.api.models.proxy;

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
public final class ProxyBulkV3 extends ProxyBulk {
    private Long encryptedWith;

    @a
    public String hostname;
    private Object identityId;
    private final Long localId;
    private Integer port;
    private final long remoteId;
    private String type;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ProxyBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public ProxyBulkV3() {
        this((String) null, (String) null, (Integer) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, 255, (k) null);
    }

    public static /* synthetic */ ProxyBulkV3 copy$default(ProxyBulkV3 proxyBulkV3, String str, String str2, Integer num, Object obj, Long l10, long j10, String str3, Long l11, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = proxyBulkV3.type;
        }
        if ((i10 & 2) != 0) {
            str2 = proxyBulkV3.hostname;
        }
        if ((i10 & 4) != 0) {
            num = proxyBulkV3.port;
        }
        if ((i10 & 8) != 0) {
            obj = proxyBulkV3.identityId;
        }
        if ((i10 & 16) != 0) {
            l10 = proxyBulkV3.localId;
        }
        if ((i10 & 32) != 0) {
            j10 = proxyBulkV3.remoteId;
        }
        if ((i10 & 64) != 0) {
            str3 = proxyBulkV3.updatedAt;
        }
        if ((i10 & 128) != 0) {
            l11 = proxyBulkV3.encryptedWith;
        }
        long j11 = j10;
        Object obj3 = obj;
        Long l12 = l10;
        Integer num2 = num;
        return proxyBulkV3.copy(str, str2, num2, obj3, l12, j11, str3, l11);
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("hostname")
    public static /* synthetic */ void getHostname$annotations() {
    }

    @o("identity")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o(Column.TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProxyBulkV3 proxyBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || proxyBulkV3.type != null) {
            dVar.v(fVar, 0, x2.f64817a, proxyBulkV3.type);
        }
        if (dVar.E(fVar, 1) || proxyBulkV3.hostname != null) {
            dVar.v(fVar, 1, x2.f64817a, proxyBulkV3.hostname);
        }
        if (dVar.E(fVar, 2) || proxyBulkV3.port != null) {
            dVar.v(fVar, 2, w0.f64808a, proxyBulkV3.port);
        }
        if (dVar.E(fVar, 3) || proxyBulkV3.getIdentityId() != null) {
            dVar.v(fVar, 3, b.f80841a, proxyBulkV3.getIdentityId());
        }
        if (dVar.E(fVar, 4) || proxyBulkV3.getLocalId() != null) {
            dVar.v(fVar, 4, h1.f64699a, proxyBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 5) || proxyBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 5, proxyBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 6) || !t.b(proxyBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 6, x2.f64817a, proxyBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 7) && proxyBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 7, h1.f64699a, proxyBulkV3.getEncryptedWith());
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.hostname;
    }

    public final Integer component3() {
        return this.port;
    }

    public final Object component4() {
        return this.identityId;
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

    public final ProxyBulkV3 copy(String str, String str2, Integer num, Object obj, Long l10, long j10, String str3, Long l11) {
        return new ProxyBulkV3(str, str2, num, obj, l10, j10, str3, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProxyBulkV3)) {
            return false;
        }
        ProxyBulkV3 proxyBulkV3 = (ProxyBulkV3) obj;
        return t.b(this.type, proxyBulkV3.type) && t.b(this.hostname, proxyBulkV3.hostname) && t.b(this.port, proxyBulkV3.port) && t.b(this.identityId, proxyBulkV3.identityId) && t.b(this.localId, proxyBulkV3.localId) && this.remoteId == proxyBulkV3.remoteId && t.b(this.updatedAt, proxyBulkV3.updatedAt) && t.b(this.encryptedWith, proxyBulkV3.encryptedWith);
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

    public final Integer getPort() {
        return this.port;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    public final String getType() {
        return this.type;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hostname;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.port;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.identityId;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode5 = (((iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str3 = this.updatedAt;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode6 + (l11 != null ? l11.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulk
    public void setIdentityId(Object obj) {
        this.identityId = obj;
    }

    public final void setPort(Integer num) {
        this.port = num;
    }

    public final void setType(String str) {
        this.type = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "ProxyBulkV3(type=" + this.type + ", hostname=" + this.hostname + ", port=" + this.port + ", identityId=" + this.identityId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ ProxyBulkV3(int i10, String str, String str2, Integer num, Object obj, Long l10, long j10, String str3, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i10 & 2) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str2;
        }
        if ((i10 & 4) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        if ((i10 & 8) == 0) {
            this.identityId = null;
        } else {
            this.identityId = obj;
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
            this.updatedAt = str3;
        }
        if ((i10 & 128) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ ProxyBulkV3(String str, String str2, Integer num, Object obj, Long l10, long j10, String str3, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : obj, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? 0L : j10, (i10 & 64) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str3, (i10 & 128) != 0 ? null : l11);
    }

    public ProxyBulkV3(String str, String str2, Integer num, Object obj, Long l10, long j10, String str3, Long l11) {
        super(null);
        this.type = str;
        this.hostname = str2;
        this.port = num;
        this.identityId = obj;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str3;
        this.encryptedWith = l11;
    }
}
