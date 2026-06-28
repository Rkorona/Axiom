package com.server.auditor.ssh.client.synchronization.api.models.identity;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId$$serializer;
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

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SshConfigIdentityFullData implements CryptoErrorInterface, Shareable {
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39054id;
    private WithRecourseId identityId;
    private boolean isShared;
    private Long localId;
    private WithRecourseId sshConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SshConfigIdentityFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SshConfigIdentityFullData(int i10, int i11, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11, s2 s2Var) {
        if (14 != (i10 & 14)) {
            d2.a(i10, 14, SshConfigIdentityFullData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f39054id = 0;
        } else {
            this.f39054id = i11;
        }
        this.updatedAt = str;
        this.sshConfigId = withRecourseId;
        this.identityId = withRecourseId2;
        if ((i10 & 16) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 32) == 0) {
            this.isShared = false;
        } else {
            this.isShared = z10;
        }
        if ((i10 & 64) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39054id;
    }

    public static /* synthetic */ SshConfigIdentityFullData copy$default(SshConfigIdentityFullData sshConfigIdentityFullData, int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sshConfigIdentityFullData.f39054id;
        }
        if ((i11 & 2) != 0) {
            str = sshConfigIdentityFullData.updatedAt;
        }
        if ((i11 & 4) != 0) {
            withRecourseId = sshConfigIdentityFullData.sshConfigId;
        }
        if ((i11 & 8) != 0) {
            withRecourseId2 = sshConfigIdentityFullData.identityId;
        }
        if ((i11 & 16) != 0) {
            l10 = sshConfigIdentityFullData.localId;
        }
        if ((i11 & 32) != 0) {
            z10 = sshConfigIdentityFullData.isShared;
        }
        if ((i11 & 64) != 0) {
            l11 = sshConfigIdentityFullData.encryptedWith;
        }
        boolean z11 = z10;
        Long l12 = l11;
        Long l13 = l10;
        WithRecourseId withRecourseId3 = withRecourseId;
        return sshConfigIdentityFullData.copy(i10, str, withRecourseId3, withRecourseId2, l13, z11, l12);
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @o("identity")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("ssh_config")
    public static /* synthetic */ void getSshConfigId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshConfigIdentityFullData sshConfigIdentityFullData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshConfigIdentityFullData.f39054id != 0) {
            dVar.t(fVar, 0, sshConfigIdentityFullData.f39054id);
        }
        dVar.f(fVar, 1, sshConfigIdentityFullData.updatedAt);
        WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
        dVar.o(fVar, 2, withRecourseId$$serializer, sshConfigIdentityFullData.sshConfigId);
        dVar.o(fVar, 3, withRecourseId$$serializer, sshConfigIdentityFullData.identityId);
        if (dVar.E(fVar, 4) || sshConfigIdentityFullData.localId != null) {
            dVar.v(fVar, 4, h1.f64699a, sshConfigIdentityFullData.localId);
        }
        if (dVar.E(fVar, 5) || sshConfigIdentityFullData.isShared) {
            dVar.u(fVar, 5, sshConfigIdentityFullData.isShared);
        }
        if (!dVar.E(fVar, 6) && sshConfigIdentityFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 6, h1.f64699a, sshConfigIdentityFullData.getEncryptedWith());
    }

    public final String component2() {
        return this.updatedAt;
    }

    public final WithRecourseId component3() {
        return this.sshConfigId;
    }

    public final WithRecourseId component4() {
        return this.identityId;
    }

    public final Long component5() {
        return this.localId;
    }

    public final boolean component6() {
        return this.isShared;
    }

    public final Long component7() {
        return this.encryptedWith;
    }

    public final SshConfigIdentityFullData copy(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11) {
        t.f(str, "updatedAt");
        t.f(withRecourseId, "sshConfigId");
        t.f(withRecourseId2, "identityId");
        return new SshConfigIdentityFullData(i10, str, withRecourseId, withRecourseId2, l10, z10, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshConfigIdentityFullData)) {
            return false;
        }
        SshConfigIdentityFullData sshConfigIdentityFullData = (SshConfigIdentityFullData) obj;
        return this.f39054id == sshConfigIdentityFullData.f39054id && t.b(this.updatedAt, sshConfigIdentityFullData.updatedAt) && t.b(this.sshConfigId, sshConfigIdentityFullData.sshConfigId) && t.b(this.identityId, sshConfigIdentityFullData.identityId) && t.b(this.localId, sshConfigIdentityFullData.localId) && this.isShared == sshConfigIdentityFullData.isShared && t.b(this.encryptedWith, sshConfigIdentityFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39054id;
    }

    public final WithRecourseId getIdentityId() {
        return this.identityId;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return Boolean.valueOf(this.isShared);
    }

    public final WithRecourseId getSshConfigId() {
        return this.sshConfigId;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.f39054id) * 31) + this.updatedAt.hashCode()) * 31) + this.sshConfigId.hashCode()) * 31) + this.identityId.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + Boolean.hashCode(this.isShared)) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
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

    public final void setIdentityId(WithRecourseId withRecourseId) {
        t.f(withRecourseId, "<set-?>");
        this.identityId = withRecourseId;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setShared(boolean z10) {
        this.isShared = z10;
    }

    public final void setSshConfigId(WithRecourseId withRecourseId) {
        t.f(withRecourseId, "<set-?>");
        this.sshConfigId = withRecourseId;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "SshConfigIdentityFullData(id=" + this.f39054id + ", updatedAt=" + this.updatedAt + ", sshConfigId=" + this.sshConfigId + ", identityId=" + this.identityId + ", localId=" + this.localId + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public SshConfigIdentityFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11) {
        t.f(str, "updatedAt");
        t.f(withRecourseId, "sshConfigId");
        t.f(withRecourseId2, "identityId");
        this.f39054id = i10;
        this.updatedAt = str;
        this.sshConfigId = withRecourseId;
        this.identityId = withRecourseId2;
        this.localId = l10;
        this.isShared = z10;
        this.encryptedWith = l11;
    }

    public /* synthetic */ SshConfigIdentityFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11, int i11, k kVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, withRecourseId, withRecourseId2, (i11 & 16) != 0 ? null : l10, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? null : l11);
    }
}
