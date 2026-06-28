package com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi;

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
public final class MultiKeyBulkV5 extends MultiKeyBulk {
    public static final String CONTENT_SERIAL_NAME = "content";

    @b
    public String content;
    private Long encryptedWith;
    private final long localId;
    private final long remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return MultiKeyBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MultiKeyBulkV5() {
        this((String) null, 0L, 0L, (String) null, (Long) null, 31, (k) null);
    }

    public static /* synthetic */ MultiKeyBulkV5 copy$default(MultiKeyBulkV5 multiKeyBulkV5, String str, long j10, long j11, String str2, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = multiKeyBulkV5.content;
        }
        if ((i10 & 2) != 0) {
            j10 = multiKeyBulkV5.localId;
        }
        if ((i10 & 4) != 0) {
            j11 = multiKeyBulkV5.remoteId;
        }
        if ((i10 & 8) != 0) {
            str2 = multiKeyBulkV5.updatedAt;
        }
        if ((i10 & 16) != 0) {
            l10 = multiKeyBulkV5.encryptedWith;
        }
        long j12 = j11;
        return multiKeyBulkV5.copy(str, j10, j12, str2, l10);
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

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MultiKeyBulkV5 multiKeyBulkV5, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || multiKeyBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, multiKeyBulkV5.content);
        }
        if (dVar.E(fVar, 1) || multiKeyBulkV5.getLocalId().longValue() != 0) {
            dVar.q(fVar, 1, multiKeyBulkV5.getLocalId().longValue());
        }
        if (dVar.E(fVar, 2) || multiKeyBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 2, multiKeyBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 3) || !t.b(multiKeyBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 3, x2.f64817a, multiKeyBulkV5.getUpdatedAt());
        }
        if (!dVar.E(fVar, 4) && multiKeyBulkV5.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 4, h1.f64699a, multiKeyBulkV5.getEncryptedWith());
    }

    public final String component1() {
        return this.content;
    }

    public final long component2() {
        return this.localId;
    }

    public final long component3() {
        return this.remoteId;
    }

    public final String component4() {
        return this.updatedAt;
    }

    public final Long component5() {
        return this.encryptedWith;
    }

    public final MultiKeyBulkV5 copy(String str, long j10, long j11, String str2, Long l10) {
        return new MultiKeyBulkV5(str, j10, j11, str2, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiKeyBulkV5)) {
            return false;
        }
        MultiKeyBulkV5 multiKeyBulkV5 = (MultiKeyBulkV5) obj;
        return t.b(this.content, multiKeyBulkV5.content) && this.localId == multiKeyBulkV5.localId && this.remoteId == multiKeyBulkV5.remoteId && t.b(this.updatedAt, multiKeyBulkV5.updatedAt) && t.b(this.encryptedWith, multiKeyBulkV5.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return Long.valueOf(this.localId);
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
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.localId)) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str2 = this.updatedAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.encryptedWith;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
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
        return "MultiKeyBulkV5(content=" + this.content + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ MultiKeyBulkV5(int i10, String str, long j10, long j11, String str2, Long l10, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 2) == 0) {
            this.localId = 0L;
        } else {
            this.localId = j10;
        }
        if ((i10 & 4) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j11;
        }
        if ((i10 & 8) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str2;
        }
        if ((i10 & 16) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
    }

    public /* synthetic */ MultiKeyBulkV5(String str, long j10, long j11, String str2, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? 0L : j11, (i10 & 8) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 16) != 0 ? null : l10);
    }

    public MultiKeyBulkV5(String str, long j10, long j11, String str2, Long l10) {
        super(null);
        this.content = str;
        this.localId = j10;
        this.remoteId = j11;
        this.updatedAt = str2;
        this.encryptedWith = l10;
    }
}
