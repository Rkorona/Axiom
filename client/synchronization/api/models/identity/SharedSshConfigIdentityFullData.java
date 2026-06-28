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
public final class SharedSshConfigIdentityFullData implements CryptoErrorInterface, Shareable {
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39052id;
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
            return SharedSshConfigIdentityFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SharedSshConfigIdentityFullData(int i10, int i11, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11, s2 s2Var) {
        if (14 != (i10 & 14)) {
            d2.a(i10, 14, SharedSshConfigIdentityFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39052id = (i10 & 1) == 0 ? 0 : i11;
        this.updatedAt = str;
        this.sshConfigId = withRecourseId;
        this.identityId = withRecourseId2;
        if ((i10 & 16) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 32) == 0) {
            this.isShared = true;
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
        return this.f39052id;
    }

    public static /* synthetic */ SharedSshConfigIdentityFullData copy$default(SharedSshConfigIdentityFullData sharedSshConfigIdentityFullData, int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sharedSshConfigIdentityFullData.f39052id;
        }
        if ((i11 & 2) != 0) {
            str = sharedSshConfigIdentityFullData.updatedAt;
        }
        if ((i11 & 4) != 0) {
            withRecourseId = sharedSshConfigIdentityFullData.sshConfigId;
        }
        if ((i11 & 8) != 0) {
            withRecourseId2 = sharedSshConfigIdentityFullData.identityId;
        }
        if ((i11 & 16) != 0) {
            l10 = sharedSshConfigIdentityFullData.localId;
        }
        if ((i11 & 32) != 0) {
            z10 = sharedSshConfigIdentityFullData.isShared;
        }
        if ((i11 & 64) != 0) {
            l11 = sharedSshConfigIdentityFullData.encryptedWith;
        }
        boolean z11 = z10;
        Long l12 = l11;
        Long l13 = l10;
        WithRecourseId withRecourseId3 = withRecourseId;
        return sharedSshConfigIdentityFullData.copy(i10, str, withRecourseId3, withRecourseId2, l13, z11, l12);
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SharedSshConfigIdentityFullData sharedSshConfigIdentityFullData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sharedSshConfigIdentityFullData.f39052id != 0) {
            dVar.t(fVar, 0, sharedSshConfigIdentityFullData.f39052id);
        }
        dVar.f(fVar, 1, sharedSshConfigIdentityFullData.updatedAt);
        WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
        dVar.o(fVar, 2, withRecourseId$$serializer, sharedSshConfigIdentityFullData.sshConfigId);
        dVar.o(fVar, 3, withRecourseId$$serializer, sharedSshConfigIdentityFullData.identityId);
        if (dVar.E(fVar, 4) || sharedSshConfigIdentityFullData.localId != null) {
            dVar.v(fVar, 4, h1.f64699a, sharedSshConfigIdentityFullData.localId);
        }
        if (dVar.E(fVar, 5) || !sharedSshConfigIdentityFullData.isShared) {
            dVar.u(fVar, 5, sharedSshConfigIdentityFullData.isShared);
        }
        if (!dVar.E(fVar, 6) && sharedSshConfigIdentityFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 6, h1.f64699a, sharedSshConfigIdentityFullData.getEncryptedWith());
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

    public final SharedSshConfigIdentityFullData copy(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11) {
        t.f(str, "updatedAt");
        t.f(withRecourseId, "sshConfigId");
        t.f(withRecourseId2, "identityId");
        return new SharedSshConfigIdentityFullData(i10, str, withRecourseId, withRecourseId2, l10, z10, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedSshConfigIdentityFullData)) {
            return false;
        }
        SharedSshConfigIdentityFullData sharedSshConfigIdentityFullData = (SharedSshConfigIdentityFullData) obj;
        return this.f39052id == sharedSshConfigIdentityFullData.f39052id && t.b(this.updatedAt, sharedSshConfigIdentityFullData.updatedAt) && t.b(this.sshConfigId, sharedSshConfigIdentityFullData.sshConfigId) && t.b(this.identityId, sharedSshConfigIdentityFullData.identityId) && t.b(this.localId, sharedSshConfigIdentityFullData.localId) && this.isShared == sharedSshConfigIdentityFullData.isShared && t.b(this.encryptedWith, sharedSshConfigIdentityFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39052id;
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
        int iHashCode = ((((((Integer.hashCode(this.f39052id) * 31) + this.updatedAt.hashCode()) * 31) + this.sshConfigId.hashCode()) * 31) + this.identityId.hashCode()) * 31;
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
        return "SharedSshConfigIdentityFullData(id=" + this.f39052id + ", updatedAt=" + this.updatedAt + ", sshConfigId=" + this.sshConfigId + ", identityId=" + this.identityId + ", localId=" + this.localId + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public SharedSshConfigIdentityFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, boolean z10, Long l11) {
        t.f(str, "updatedAt");
        t.f(withRecourseId, "sshConfigId");
        t.f(withRecourseId2, "identityId");
        this.f39052id = i10;
        this.updatedAt = str;
        this.sshConfigId = withRecourseId;
        this.identityId = withRecourseId2;
        this.localId = l10;
        this.isShared = z10;
        this.encryptedWith = l11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ SharedSshConfigIdentityFullData(int r2, java.lang.String r3, com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId r4, com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId r5, java.lang.Long r6, boolean r7, java.lang.Long r8, int r9, ju.k r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 16
            r0 = 0
            if (r10 == 0) goto Lb
            r6 = r0
        Lb:
            r10 = r9 & 32
            if (r10 == 0) goto L10
            r7 = 1
        L10:
            r9 = r9 & 64
            if (r9 == 0) goto L1d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L25
        L1d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L25:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityFullData.<init>(int, java.lang.String, com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId, com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId, java.lang.Long, boolean, java.lang.Long, int, ju.k):void");
    }
}
