package com.server.auditor.ssh.client.synchronization.api.models.identity;

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
public final class IdentityBulkV5 extends IdentityBulk {
    public static final String CONTENT_SERIAL_NAME = "content";

    @b
    public String content;
    private Long encryptedWith;
    private final Long localId;
    private final long remoteId;
    private String sshIdMode;
    private Object sshKeyId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return IdentityBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IdentityBulkV5() {
        this((String) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, (String) null, 127, (k) null);
    }

    public static /* synthetic */ IdentityBulkV5 copy$default(IdentityBulkV5 identityBulkV5, String str, Object obj, Long l10, long j10, String str2, Long l11, String str3, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = identityBulkV5.content;
        }
        if ((i10 & 2) != 0) {
            obj = identityBulkV5.sshKeyId;
        }
        if ((i10 & 4) != 0) {
            l10 = identityBulkV5.localId;
        }
        if ((i10 & 8) != 0) {
            j10 = identityBulkV5.remoteId;
        }
        if ((i10 & 16) != 0) {
            str2 = identityBulkV5.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l11 = identityBulkV5.encryptedWith;
        }
        if ((i10 & 64) != 0) {
            str3 = identityBulkV5.sshIdMode;
        }
        String str4 = str3;
        String str5 = str2;
        long j11 = j10;
        Long l12 = l10;
        return identityBulkV5.copy(str, obj, l12, j11, str5, l11, str4);
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

    @o(IdentityBulk.SSHID_MODE_NAME)
    public static /* synthetic */ void getSshIdMode$annotations() {
    }

    @o("ssh_key")
    public static /* synthetic */ void getSshKeyId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IdentityBulkV5 identityBulkV5, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || identityBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, identityBulkV5.content);
        }
        if (dVar.E(fVar, 1) || identityBulkV5.getSshKeyId() != null) {
            dVar.v(fVar, 1, tp.b.f80841a, identityBulkV5.getSshKeyId());
        }
        if (dVar.E(fVar, 2) || identityBulkV5.getLocalId() != null) {
            dVar.v(fVar, 2, h1.f64699a, identityBulkV5.getLocalId());
        }
        if (dVar.E(fVar, 3) || identityBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 3, identityBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 4) || !t.b(identityBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 4, x2.f64817a, identityBulkV5.getUpdatedAt());
        }
        if (dVar.E(fVar, 5) || identityBulkV5.getEncryptedWith() != null) {
            dVar.v(fVar, 5, h1.f64699a, identityBulkV5.getEncryptedWith());
        }
        if (!dVar.E(fVar, 6) && identityBulkV5.sshIdMode == null) {
            return;
        }
        dVar.v(fVar, 6, x2.f64817a, identityBulkV5.sshIdMode);
    }

    public final String component1() {
        return this.content;
    }

    public final Object component2() {
        return this.sshKeyId;
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

    public final String component7() {
        return this.sshIdMode;
    }

    public final IdentityBulkV5 copy(String str, Object obj, Long l10, long j10, String str2, Long l11, String str3) {
        return new IdentityBulkV5(str, obj, l10, j10, str2, l11, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityBulkV5)) {
            return false;
        }
        IdentityBulkV5 identityBulkV5 = (IdentityBulkV5) obj;
        return t.b(this.content, identityBulkV5.content) && t.b(this.sshKeyId, identityBulkV5.sshKeyId) && t.b(this.localId, identityBulkV5.localId) && this.remoteId == identityBulkV5.remoteId && t.b(this.updatedAt, identityBulkV5.updatedAt) && t.b(this.encryptedWith, identityBulkV5.encryptedWith) && t.b(this.sshIdMode, identityBulkV5.sshIdMode);
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

    public final String getSshIdMode() {
        return this.sshIdMode;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk
    public Object getSshKeyId() {
        return this.sshKeyId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.sshKeyId;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode3 = (((iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str2 = this.updatedAt;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.sshIdMode;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setSshIdMode(String str) {
        this.sshIdMode = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk
    public void setSshKeyId(Object obj) {
        this.sshKeyId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "IdentityBulkV5(content=" + this.content + ", sshKeyId=" + this.sshKeyId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ", sshIdMode=" + this.sshIdMode + ")";
    }

    public /* synthetic */ IdentityBulkV5(int i10, String str, Object obj, Long l10, long j10, String str2, Long l11, String str3, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 2) == 0) {
            this.sshKeyId = null;
        } else {
            this.sshKeyId = obj;
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
        if ((i10 & 64) == 0) {
            this.sshIdMode = null;
        } else {
            this.sshIdMode = str3;
        }
    }

    public /* synthetic */ IdentityBulkV5(String str, Object obj, Long l10, long j10, String str2, Long l11, String str3, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 32) != 0 ? null : l11, (i10 & 64) != 0 ? null : str3);
    }

    public IdentityBulkV5(String str, Object obj, Long l10, long j10, String str2, Long l11, String str3) {
        super(null);
        this.content = str;
        this.sshKeyId = obj;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
        this.sshIdMode = str3;
    }
}
