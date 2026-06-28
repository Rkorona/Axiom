package com.server.auditor.ssh.client.synchronization.api.models.ssh.key.certificates;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId$$serializer;
import gg.a;
import gg.b;
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

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SshCertificateFullData implements Shareable, CryptoErrorInterface {

    @a
    public String certificate;

    @b
    public String content;
    private Long encryptedWith;
    private boolean isShared;
    private Long localId;
    private int remoteId;
    private WithRecourseId sshKeyId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SshCertificateFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SshCertificateFullData(int i10, int i11, Long l10, String str, String str2, WithRecourseId withRecourseId, String str3, boolean z10, Long l11, s2 s2Var) {
        if (112 != (i10 & 112)) {
            d2.a(i10, 112, SshCertificateFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.remoteId = (i10 & 1) == 0 ? 0 : i11;
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 4) == 0) {
            this.certificate = null;
        } else {
            this.certificate = str;
        }
        if ((i10 & 8) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        this.sshKeyId = withRecourseId;
        this.updatedAt = str3;
        this.isShared = z10;
        if ((i10 & 128) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public static /* synthetic */ SshCertificateFullData copy$default(SshCertificateFullData sshCertificateFullData, int i10, Long l10, String str, String str2, WithRecourseId withRecourseId, String str3, boolean z10, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sshCertificateFullData.remoteId;
        }
        if ((i11 & 2) != 0) {
            l10 = sshCertificateFullData.localId;
        }
        if ((i11 & 4) != 0) {
            str = sshCertificateFullData.certificate;
        }
        if ((i11 & 8) != 0) {
            str2 = sshCertificateFullData.content;
        }
        if ((i11 & 16) != 0) {
            withRecourseId = sshCertificateFullData.sshKeyId;
        }
        if ((i11 & 32) != 0) {
            str3 = sshCertificateFullData.updatedAt;
        }
        if ((i11 & 64) != 0) {
            z10 = sshCertificateFullData.isShared;
        }
        if ((i11 & 128) != 0) {
            l11 = sshCertificateFullData.encryptedWith;
        }
        boolean z11 = z10;
        Long l12 = l11;
        WithRecourseId withRecourseId2 = withRecourseId;
        String str4 = str3;
        return sshCertificateFullData.copy(i10, l10, str, str2, withRecourseId2, str4, z11, l12);
    }

    @o(Table.SSH_CERTIFICATE)
    public static /* synthetic */ void getCertificate$annotations() {
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

    @o("ssh_key")
    public static /* synthetic */ void getSshKeyId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshCertificateFullData sshCertificateFullData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshCertificateFullData.remoteId != 0) {
            dVar.t(fVar, 0, sshCertificateFullData.remoteId);
        }
        if (dVar.E(fVar, 1) || sshCertificateFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, sshCertificateFullData.localId);
        }
        if (dVar.E(fVar, 2) || sshCertificateFullData.certificate != null) {
            dVar.v(fVar, 2, x2.f64817a, sshCertificateFullData.certificate);
        }
        if (dVar.E(fVar, 3) || sshCertificateFullData.content != null) {
            dVar.v(fVar, 3, x2.f64817a, sshCertificateFullData.content);
        }
        dVar.o(fVar, 4, WithRecourseId$$serializer.INSTANCE, sshCertificateFullData.sshKeyId);
        dVar.f(fVar, 5, sshCertificateFullData.updatedAt);
        dVar.u(fVar, 6, sshCertificateFullData.isShared);
        if (!dVar.E(fVar, 7) && sshCertificateFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 7, h1.f64699a, sshCertificateFullData.getEncryptedWith());
    }

    public final int component1() {
        return this.remoteId;
    }

    public final Long component2() {
        return this.localId;
    }

    public final String component3() {
        return this.certificate;
    }

    public final String component4() {
        return this.content;
    }

    public final WithRecourseId component5() {
        return this.sshKeyId;
    }

    public final String component6() {
        return this.updatedAt;
    }

    public final boolean component7() {
        return this.isShared;
    }

    public final Long component8() {
        return this.encryptedWith;
    }

    public final SshCertificateFullData copy(int i10, Long l10, String str, String str2, WithRecourseId withRecourseId, String str3, boolean z10, Long l11) {
        t.f(withRecourseId, "sshKeyId");
        t.f(str3, "updatedAt");
        return new SshCertificateFullData(i10, l10, str, str2, withRecourseId, str3, z10, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshCertificateFullData)) {
            return false;
        }
        SshCertificateFullData sshCertificateFullData = (SshCertificateFullData) obj;
        return this.remoteId == sshCertificateFullData.remoteId && t.b(this.localId, sshCertificateFullData.localId) && t.b(this.certificate, sshCertificateFullData.certificate) && t.b(this.content, sshCertificateFullData.content) && t.b(this.sshKeyId, sshCertificateFullData.sshKeyId) && t.b(this.updatedAt, sshCertificateFullData.updatedAt) && this.isShared == sshCertificateFullData.isShared && t.b(this.encryptedWith, sshCertificateFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.remoteId;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final int getRemoteId() {
        return this.remoteId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return Boolean.valueOf(this.isShared);
    }

    public final WithRecourseId getSshKeyId() {
        return this.sshKeyId;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.remoteId) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.certificate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.sshKeyId.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + Boolean.hashCode(this.isShared)) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    public final boolean isShared() {
        return this.isShared;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = false;
        setEncryptedWith(null);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setRemoteId(int i10) {
        this.remoteId = i10;
    }

    public final void setShared(boolean z10) {
        this.isShared = z10;
    }

    public final void setSshKeyId(WithRecourseId withRecourseId) {
        t.f(withRecourseId, "<set-?>");
        this.sshKeyId = withRecourseId;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "SshCertificateFullData(remoteId=" + this.remoteId + ", localId=" + this.localId + ", certificate=" + this.certificate + ", content=" + this.content + ", sshKeyId=" + this.sshKeyId + ", updatedAt=" + this.updatedAt + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public SshCertificateFullData(int i10, Long l10, String str, String str2, WithRecourseId withRecourseId, String str3, boolean z10, Long l11) {
        t.f(withRecourseId, "sshKeyId");
        t.f(str3, "updatedAt");
        this.remoteId = i10;
        this.localId = l10;
        this.certificate = str;
        this.content = str2;
        this.sshKeyId = withRecourseId;
        this.updatedAt = str3;
        this.isShared = z10;
        this.encryptedWith = l11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SshCertificateFullData(int r2, java.lang.Long r3, java.lang.String r4, java.lang.String r5, com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId r6, java.lang.String r7, boolean r8, java.lang.Long r9, int r10, ju.k r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r2 = 0
        L5:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lb
            r3 = r0
        Lb:
            r11 = r10 & 4
            if (r11 == 0) goto L10
            r4 = r0
        L10:
            r11 = r10 & 8
            if (r11 == 0) goto L15
            r5 = r0
        L15:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L23
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2c
        L23:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2c:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.api.models.ssh.key.certificates.SshCertificateFullData.<init>(int, java.lang.Long, java.lang.String, java.lang.String, com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId, java.lang.String, boolean, java.lang.Long, int, ju.k):void");
    }
}
