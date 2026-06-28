package com.server.auditor.ssh.client.synchronization.api.models.knownhost;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import gg.a;
import hv.c;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class KnownHostBulkV3 extends KnownHostBulk {
    private Long encryptedWith;

    @a
    public String hostname;
    private final Long localId;

    @a
    public String publicKey;
    private final long remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return KnownHostBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public KnownHostBulkV3() {
        this((String) null, (String) null, (Long) null, 0L, (String) null, (Long) null, 63, (k) null);
    }

    public static /* synthetic */ KnownHostBulkV3 copy$default(KnownHostBulkV3 knownHostBulkV3, String str, String str2, Long l10, long j10, String str3, Long l11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = knownHostBulkV3.hostname;
        }
        if ((i10 & 2) != 0) {
            str2 = knownHostBulkV3.publicKey;
        }
        if ((i10 & 4) != 0) {
            l10 = knownHostBulkV3.localId;
        }
        if ((i10 & 8) != 0) {
            j10 = knownHostBulkV3.remoteId;
        }
        if ((i10 & 16) != 0) {
            str3 = knownHostBulkV3.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l11 = knownHostBulkV3.encryptedWith;
        }
        long j11 = j10;
        Long l12 = l10;
        return knownHostBulkV3.copy(str, str2, l12, j11, str3, l11);
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(Column.HOSTNAMES)
    public static /* synthetic */ void getHostname$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o(SerializableEvent.KEY_FIELD)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(KnownHostBulkV3 knownHostBulkV3, d dVar, f fVar) {
        Long localId;
        if (dVar.E(fVar, 0) || knownHostBulkV3.hostname != null) {
            dVar.v(fVar, 0, x2.f64817a, knownHostBulkV3.hostname);
        }
        if (dVar.E(fVar, 1) || knownHostBulkV3.publicKey != null) {
            dVar.v(fVar, 1, x2.f64817a, knownHostBulkV3.publicKey);
        }
        if (dVar.E(fVar, 2) || (localId = knownHostBulkV3.getLocalId()) == null || localId.longValue() != 0) {
            dVar.v(fVar, 2, h1.f64699a, knownHostBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 3) || knownHostBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 3, knownHostBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 4) || !t.b(knownHostBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 4, x2.f64817a, knownHostBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && knownHostBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, knownHostBulkV3.getEncryptedWith());
    }

    public final String component1() {
        return this.hostname;
    }

    public final String component2() {
        return this.publicKey;
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

    public final KnownHostBulkV3 copy(String str, String str2, Long l10, long j10, String str3, Long l11) {
        return new KnownHostBulkV3(str, str2, l10, j10, str3, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KnownHostBulkV3)) {
            return false;
        }
        KnownHostBulkV3 knownHostBulkV3 = (KnownHostBulkV3) obj;
        return t.b(this.hostname, knownHostBulkV3.hostname) && t.b(this.publicKey, knownHostBulkV3.publicKey) && t.b(this.localId, knownHostBulkV3.localId) && this.remoteId == knownHostBulkV3.remoteId && t.b(this.updatedAt, knownHostBulkV3.updatedAt) && t.b(this.encryptedWith, knownHostBulkV3.encryptedWith);
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

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.hostname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.publicKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode3 = (((iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str3 = this.updatedAt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "KnownHostBulkV3(hostname=" + this.hostname + ", publicKey=" + this.publicKey + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ KnownHostBulkV3(int i10, String str, String str2, Long l10, long j10, String str3, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str;
        }
        if ((i10 & 2) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str2;
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
            this.updatedAt = str3;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ KnownHostBulkV3(String str, String str2, Long l10, long j10, String str3, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 0L : l10, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str3, (i10 & 32) != 0 ? null : l11);
    }

    public KnownHostBulkV3(String str, String str2, Long l10, long j10, String str3, Long l11) {
        super(null);
        this.hostname = str;
        this.publicKey = str2;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str3;
        this.encryptedWith = l11;
    }
}
