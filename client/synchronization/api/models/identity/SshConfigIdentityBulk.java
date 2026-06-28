package com.server.auditor.ssh.client.synchronization.api.models.identity;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
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
public final class SshConfigIdentityBulk extends CommonBulkShareable {
    private Long encryptedWith;
    private Object identityId;
    private final Long localId;
    private final Long remoteId;
    private Object sshConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SshConfigIdentityBulk$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public SshConfigIdentityBulk() {
        this((Object) null, (Object) null, (Long) null, (Long) null, (String) null, (Long) null, 63, (k) null);
    }

    public static /* synthetic */ SshConfigIdentityBulk copy$default(SshConfigIdentityBulk sshConfigIdentityBulk, Object obj, Object obj2, Long l10, Long l11, String str, Long l12, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = sshConfigIdentityBulk.identityId;
        }
        if ((i10 & 2) != 0) {
            obj2 = sshConfigIdentityBulk.sshConfigId;
        }
        if ((i10 & 4) != 0) {
            l10 = sshConfigIdentityBulk.localId;
        }
        if ((i10 & 8) != 0) {
            l11 = sshConfigIdentityBulk.remoteId;
        }
        if ((i10 & 16) != 0) {
            str = sshConfigIdentityBulk.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l12 = sshConfigIdentityBulk.encryptedWith;
        }
        String str2 = str;
        Long l13 = l12;
        return sshConfigIdentityBulk.copy(obj, obj2, l10, l11, str2, l13);
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

    @o("ssh_config")
    public static /* synthetic */ void getSshConfigId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshConfigIdentityBulk sshConfigIdentityBulk, d dVar, f fVar) {
        CommonBulkShareable.write$Self(sshConfigIdentityBulk, dVar, fVar);
        if (dVar.E(fVar, 0) || sshConfigIdentityBulk.identityId != null) {
            dVar.v(fVar, 0, b.f80841a, sshConfigIdentityBulk.identityId);
        }
        if (dVar.E(fVar, 1) || sshConfigIdentityBulk.sshConfigId != null) {
            dVar.v(fVar, 1, b.f80841a, sshConfigIdentityBulk.sshConfigId);
        }
        if (dVar.E(fVar, 2) || sshConfigIdentityBulk.getLocalId() != null) {
            dVar.v(fVar, 2, h1.f64699a, sshConfigIdentityBulk.getLocalId());
        }
        if (dVar.E(fVar, 3) || sshConfigIdentityBulk.getRemoteId() != null) {
            dVar.v(fVar, 3, h1.f64699a, sshConfigIdentityBulk.getRemoteId());
        }
        if (dVar.E(fVar, 4) || sshConfigIdentityBulk.getUpdatedAt() != null) {
            dVar.v(fVar, 4, x2.f64817a, sshConfigIdentityBulk.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && sshConfigIdentityBulk.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, sshConfigIdentityBulk.getEncryptedWith());
    }

    public final Object component1() {
        return this.identityId;
    }

    public final Object component2() {
        return this.sshConfigId;
    }

    public final Long component3() {
        return this.localId;
    }

    public final Long component4() {
        return this.remoteId;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final Long component6() {
        return this.encryptedWith;
    }

    public final SshConfigIdentityBulk copy(Object obj, Object obj2, Long l10, Long l11, String str, Long l12) {
        return new SshConfigIdentityBulk(obj, obj2, l10, l11, str, l12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshConfigIdentityBulk)) {
            return false;
        }
        SshConfigIdentityBulk sshConfigIdentityBulk = (SshConfigIdentityBulk) obj;
        return t.b(this.identityId, sshConfigIdentityBulk.identityId) && t.b(this.sshConfigId, sshConfigIdentityBulk.sshConfigId) && t.b(this.localId, sshConfigIdentityBulk.localId) && t.b(this.remoteId, sshConfigIdentityBulk.remoteId) && t.b(this.updatedAt, sshConfigIdentityBulk.updatedAt) && t.b(this.encryptedWith, sshConfigIdentityBulk.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final Object getIdentityId() {
        return this.identityId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return this.remoteId;
    }

    public final Object getSshConfigId() {
        return this.sshConfigId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Object obj = this.identityId;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.sshConfigId;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.remoteId;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.encryptedWith;
        return iHashCode5 + (l12 != null ? l12.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setIdentityId(Object obj) {
        this.identityId = obj;
    }

    public final void setSshConfigId(Object obj) {
        this.sshConfigId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "SshConfigIdentityBulk(identityId=" + this.identityId + ", sshConfigId=" + this.sshConfigId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ SshConfigIdentityBulk(int i10, Object obj, Object obj2, Long l10, Long l11, String str, Long l12, s2 s2Var) {
        super(i10, s2Var);
        if ((i10 & 1) == 0) {
            this.identityId = null;
        } else {
            this.identityId = obj;
        }
        if ((i10 & 2) == 0) {
            this.sshConfigId = null;
        } else {
            this.sshConfigId = obj2;
        }
        if ((i10 & 4) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 8) == 0) {
            this.remoteId = null;
        } else {
            this.remoteId = l11;
        }
        if ((i10 & 16) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l12;
        }
    }

    public /* synthetic */ SshConfigIdentityBulk(Object obj, Object obj2, Long l10, Long l11, String str, Long l12, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : l11, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : l12);
    }

    public SshConfigIdentityBulk(Object obj, Object obj2, Long l10, Long l11, String str, Long l12) {
        this.identityId = obj;
        this.sshConfigId = obj2;
        this.localId = l10;
        this.remoteId = l11;
        this.updatedAt = str;
        this.encryptedWith = l12;
    }
}
