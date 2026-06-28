package com.server.auditor.ssh.client.synchronization.api.models.identity;

import com.server.auditor.ssh.client.database.Table;
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
import tp.b;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CertificateBulkV3 extends CertificateBulk {

    @a
    public String certificate;
    private Long encryptedWith;
    private final Long localId;
    private final long remoteId;
    private Object sshKeyId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CertificateBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public CertificateBulkV3() {
        this((String) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, 63, (k) null);
    }

    public static /* synthetic */ CertificateBulkV3 copy$default(CertificateBulkV3 certificateBulkV3, String str, Object obj, Long l10, long j10, String str2, Long l11, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = certificateBulkV3.certificate;
        }
        if ((i10 & 2) != 0) {
            obj = certificateBulkV3.sshKeyId;
        }
        if ((i10 & 4) != 0) {
            l10 = certificateBulkV3.localId;
        }
        if ((i10 & 8) != 0) {
            j10 = certificateBulkV3.remoteId;
        }
        if ((i10 & 16) != 0) {
            str2 = certificateBulkV3.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l11 = certificateBulkV3.encryptedWith;
        }
        long j11 = j10;
        Long l12 = l10;
        return certificateBulkV3.copy(str, obj, l12, j11, str2, l11);
    }

    @o(Table.SSH_CERTIFICATE)
    public static /* synthetic */ void getCertificate$annotations() {
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

    @o("ssh_key")
    public static /* synthetic */ void getSshKeyId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CertificateBulkV3 certificateBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || certificateBulkV3.certificate != null) {
            dVar.v(fVar, 0, x2.f64817a, certificateBulkV3.certificate);
        }
        if (dVar.E(fVar, 1) || certificateBulkV3.getSshKeyId() != null) {
            dVar.v(fVar, 1, b.f80841a, certificateBulkV3.getSshKeyId());
        }
        if (dVar.E(fVar, 2) || certificateBulkV3.getLocalId() != null) {
            dVar.v(fVar, 2, h1.f64699a, certificateBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 3) || certificateBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 3, certificateBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 4) || !t.b(certificateBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 4, x2.f64817a, certificateBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && certificateBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, certificateBulkV3.getEncryptedWith());
    }

    public final String component1() {
        return this.certificate;
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

    public final CertificateBulkV3 copy(String str, Object obj, Long l10, long j10, String str2, Long l11) {
        return new CertificateBulkV3(str, obj, l10, j10, str2, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertificateBulkV3)) {
            return false;
        }
        CertificateBulkV3 certificateBulkV3 = (CertificateBulkV3) obj;
        return t.b(this.certificate, certificateBulkV3.certificate) && t.b(this.sshKeyId, certificateBulkV3.sshKeyId) && t.b(this.localId, certificateBulkV3.localId) && this.remoteId == certificateBulkV3.remoteId && t.b(this.updatedAt, certificateBulkV3.updatedAt) && t.b(this.encryptedWith, certificateBulkV3.encryptedWith);
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

    @Override // com.server.auditor.ssh.client.synchronization.api.models.identity.CertificateBulk
    public Object getSshKeyId() {
        return this.sshKeyId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.certificate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.sshKeyId;
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

    @Override // com.server.auditor.ssh.client.synchronization.api.models.identity.CertificateBulk
    public void setSshKeyId(Object obj) {
        this.sshKeyId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "CertificateBulkV3(certificate=" + this.certificate + ", sshKeyId=" + this.sshKeyId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ CertificateBulkV3(int i10, String str, Object obj, Long l10, long j10, String str2, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.certificate = null;
        } else {
            this.certificate = str;
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
    }

    public /* synthetic */ CertificateBulkV3(String str, Object obj, Long l10, long j10, String str2, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 32) != 0 ? null : l11);
    }

    public CertificateBulkV3(String str, Object obj, Long l10, long j10, String str2, Long l11) {
        super(null);
        this.certificate = str;
        this.sshKeyId = obj;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
    }
}
