package com.server.auditor.ssh.client.synchronization.api.models.taghost;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.h1;
import lv.s2;
import lv.x2;
import tp.b;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TagHostBulk extends CommonBulkShareable {
    private Long encryptedWith;
    private Object hostId;
    private final Long localId;
    private final long remoteId;
    private Object tagId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TagHostBulk$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TagHostBulk(int i10, Object obj, Object obj2, Long l10, long j10, String str, Long l11, s2 s2Var) {
        super(i10, s2Var);
        if (8 != (i10 & 8)) {
            d2.a(i10, 8, TagHostBulk$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.tagId = null;
        } else {
            this.tagId = obj;
        }
        if ((i10 & 2) == 0) {
            this.hostId = null;
        } else {
            this.hostId = obj2;
        }
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

    public static /* synthetic */ TagHostBulk copy$default(TagHostBulk tagHostBulk, Object obj, Object obj2, Long l10, long j10, String str, Long l11, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = tagHostBulk.tagId;
        }
        if ((i10 & 2) != 0) {
            obj2 = tagHostBulk.hostId;
        }
        if ((i10 & 4) != 0) {
            l10 = tagHostBulk.localId;
        }
        if ((i10 & 8) != 0) {
            j10 = tagHostBulk.remoteId;
        }
        if ((i10 & 16) != 0) {
            str = tagHostBulk.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l11 = tagHostBulk.encryptedWith;
        }
        long j11 = j10;
        Long l12 = l10;
        return tagHostBulk.copy(obj, obj2, l12, j11, str, l11);
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("host")
    public static /* synthetic */ void getHostId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("tag")
    public static /* synthetic */ void getTagId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TagHostBulk tagHostBulk, d dVar, f fVar) {
        CommonBulkShareable.write$Self(tagHostBulk, dVar, fVar);
        if (dVar.E(fVar, 0) || tagHostBulk.tagId != null) {
            dVar.v(fVar, 0, b.f80841a, tagHostBulk.tagId);
        }
        if (dVar.E(fVar, 1) || tagHostBulk.hostId != null) {
            dVar.v(fVar, 1, b.f80841a, tagHostBulk.hostId);
        }
        if (dVar.E(fVar, 2) || tagHostBulk.getLocalId() != null) {
            dVar.v(fVar, 2, h1.f64699a, tagHostBulk.getLocalId());
        }
        dVar.q(fVar, 3, tagHostBulk.getRemoteId().longValue());
        if (dVar.E(fVar, 4) || tagHostBulk.getUpdatedAt() != null) {
            dVar.v(fVar, 4, x2.f64817a, tagHostBulk.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && tagHostBulk.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, tagHostBulk.getEncryptedWith());
    }

    public final Object component1() {
        return this.tagId;
    }

    public final Object component2() {
        return this.hostId;
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

    public final TagHostBulk copy(Object obj, Object obj2, Long l10, long j10, String str, Long l11) {
        return new TagHostBulk(obj, obj2, l10, j10, str, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagHostBulk)) {
            return false;
        }
        TagHostBulk tagHostBulk = (TagHostBulk) obj;
        return t.b(this.tagId, tagHostBulk.tagId) && t.b(this.hostId, tagHostBulk.hostId) && t.b(this.localId, tagHostBulk.localId) && this.remoteId == tagHostBulk.remoteId && t.b(this.updatedAt, tagHostBulk.updatedAt) && t.b(this.encryptedWith, tagHostBulk.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final Object getHostId() {
        return this.hostId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    public final Object getTagId() {
        return this.tagId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Object obj = this.tagId;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.hostId;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode3 = (((iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str = this.updatedAt;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setHostId(Object obj) {
        this.hostId = obj;
    }

    public final void setTagId(Object obj) {
        this.tagId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "TagHostBulk(tagId=" + this.tagId + ", hostId=" + this.hostId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ TagHostBulk(Object obj, Object obj2, Long l10, long j10, String str, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : l10, j10, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : l11);
    }

    public TagHostBulk(Object obj, Object obj2, Long l10, long j10, String str, Long l11) {
        this.tagId = obj;
        this.hostId = obj2;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str;
        this.encryptedWith = l11;
    }
}
