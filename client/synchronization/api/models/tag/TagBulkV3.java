package com.server.auditor.ssh.client.synchronization.api.models.tag;

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
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TagBulkV3 extends TagBulk {
    private Long encryptedWith;

    @a
    public String label;
    private final Long localId;
    private final long remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TagBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public TagBulkV3() {
        this((String) null, (Long) null, 0L, (String) null, (Long) null, 31, (k) null);
    }

    public static /* synthetic */ TagBulkV3 copy$default(TagBulkV3 tagBulkV3, String str, Long l10, long j10, String str2, Long l11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tagBulkV3.label;
        }
        if ((i10 & 2) != 0) {
            l10 = tagBulkV3.localId;
        }
        if ((i10 & 4) != 0) {
            j10 = tagBulkV3.remoteId;
        }
        if ((i10 & 8) != 0) {
            str2 = tagBulkV3.updatedAt;
        }
        if ((i10 & 16) != 0) {
            l11 = tagBulkV3.encryptedWith;
        }
        long j11 = j10;
        return tagBulkV3.copy(str, l10, j11, str2, l11);
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TagBulkV3 tagBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || tagBulkV3.label != null) {
            dVar.v(fVar, 0, x2.f64817a, tagBulkV3.label);
        }
        if (dVar.E(fVar, 1) || tagBulkV3.getLocalId() != null) {
            dVar.v(fVar, 1, h1.f64699a, tagBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 2) || tagBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 2, tagBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 3) || !t.b(tagBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 3, x2.f64817a, tagBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 4) && tagBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 4, h1.f64699a, tagBulkV3.getEncryptedWith());
    }

    public final String component1() {
        return this.label;
    }

    public final Long component2() {
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

    public final TagBulkV3 copy(String str, Long l10, long j10, String str2, Long l11) {
        return new TagBulkV3(str, l10, j10, str2, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagBulkV3)) {
            return false;
        }
        TagBulkV3 tagBulkV3 = (TagBulkV3) obj;
        return t.b(this.label, tagBulkV3.label) && t.b(this.localId, tagBulkV3.localId) && this.remoteId == tagBulkV3.remoteId && t.b(this.updatedAt, tagBulkV3.updatedAt) && t.b(this.encryptedWith, tagBulkV3.encryptedWith);
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
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str2 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
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
        return "TagBulkV3(label=" + this.label + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ TagBulkV3(int i10, String str, Long l10, long j10, String str2, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 4) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 8) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str2;
        }
        if ((i10 & 16) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ TagBulkV3(String str, Long l10, long j10, String str2, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 16) != 0 ? null : l11);
    }

    public TagBulkV3(String str, Long l10, long j10, String str2, Long l11) {
        super(null);
        this.label = str;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
    }
}
