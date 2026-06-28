package com.server.auditor.ssh.client.synchronization.api.models.chainhost;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostFullData;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.h1;
import lv.i;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ChainHostFullData implements CryptoErrorInterface, Shareable {
    private Long encryptedWith;
    private List<Long> hostIds;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39034id;
    private Boolean isShared;
    private Long sshConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, null, o.b(r.f82638b, new a() { // from class: zm.b
        @Override // iu.a
        public final Object a() {
            return ChainHostFullData._childSerializers$_anonymous_();
        }
    }), null, null};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ChainHostFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ChainHostFullData(int i10, int i11, String str, Long l10, List list, Boolean bool, Long l11, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, ChainHostFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39034id = i11;
        if ((i10 & 2) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str;
        }
        if ((i10 & 4) == 0) {
            this.sshConfigId = null;
        } else {
            this.sshConfigId = l10;
        }
        if ((i10 & 8) == 0) {
            this.hostIds = null;
        } else {
            this.hostIds = list;
        }
        if ((i10 & 16) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(h1.f64699a);
    }

    private final int component1() {
        return this.f39034id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainHostFullData copy$default(ChainHostFullData chainHostFullData, int i10, String str, Long l10, List list, Boolean bool, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = chainHostFullData.f39034id;
        }
        if ((i11 & 2) != 0) {
            str = chainHostFullData.updatedAt;
        }
        if ((i11 & 4) != 0) {
            l10 = chainHostFullData.sshConfigId;
        }
        if ((i11 & 8) != 0) {
            list = chainHostFullData.hostIds;
        }
        if ((i11 & 16) != 0) {
            bool = chainHostFullData.isShared;
        }
        if ((i11 & 32) != 0) {
            l11 = chainHostFullData.encryptedWith;
        }
        Boolean bool2 = bool;
        Long l12 = l11;
        return chainHostFullData.copy(i10, str, l10, list, bool2, l12);
    }

    @hv.o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @hv.o("hosts_chain")
    public static /* synthetic */ void getHostIds$annotations() {
    }

    @hv.o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @hv.o("ssh_config")
    public static /* synthetic */ void getSshConfigId$annotations() {
    }

    @hv.o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @hv.o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ChainHostFullData chainHostFullData, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.t(fVar, 0, chainHostFullData.f39034id);
        if (dVar.E(fVar, 1) || chainHostFullData.updatedAt != null) {
            dVar.v(fVar, 1, x2.f64817a, chainHostFullData.updatedAt);
        }
        if (dVar.E(fVar, 2) || chainHostFullData.sshConfigId != null) {
            dVar.v(fVar, 2, h1.f64699a, chainHostFullData.sshConfigId);
        }
        if (dVar.E(fVar, 3) || chainHostFullData.hostIds != null) {
            dVar.v(fVar, 3, (hv.r) nVarArr[3].getValue(), chainHostFullData.hostIds);
        }
        if (dVar.E(fVar, 4) || chainHostFullData.isShared != null) {
            dVar.v(fVar, 4, i.f64704a, chainHostFullData.isShared);
        }
        if (!dVar.E(fVar, 5) && chainHostFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, chainHostFullData.getEncryptedWith());
    }

    public final String component2() {
        return this.updatedAt;
    }

    public final Long component3() {
        return this.sshConfigId;
    }

    public final List<Long> component4() {
        return this.hostIds;
    }

    public final Boolean component5() {
        return this.isShared;
    }

    public final Long component6() {
        return this.encryptedWith;
    }

    public final ChainHostFullData copy(int i10, String str, Long l10, List<Long> list, Boolean bool, Long l11) {
        return new ChainHostFullData(i10, str, l10, list, bool, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainHostFullData)) {
            return false;
        }
        ChainHostFullData chainHostFullData = (ChainHostFullData) obj;
        return this.f39034id == chainHostFullData.f39034id && t.b(this.updatedAt, chainHostFullData.updatedAt) && t.b(this.sshConfigId, chainHostFullData.sshConfigId) && t.b(this.hostIds, chainHostFullData.hostIds) && t.b(this.isShared, chainHostFullData.isShared) && t.b(this.encryptedWith, chainHostFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final List<Long> getHostIds() {
        return this.hostIds;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39034id;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final Long getSshConfigId() {
        return this.sshConfigId;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f39034id) * 31;
        String str = this.updatedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.sshConfigId;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        List<Long> list = this.hostIds;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode5 + (l11 != null ? l11.hashCode() : 0);
    }

    public final Boolean isShared() {
        return this.isShared;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = Boolean.FALSE;
        setEncryptedWith(null);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setHostIds(List<Long> list) {
        this.hostIds = list;
    }

    public final void setShared(Boolean bool) {
        this.isShared = bool;
    }

    public final void setSshConfigId(Long l10) {
        this.sshConfigId = l10;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "ChainHostFullData(id=" + this.f39034id + ", updatedAt=" + this.updatedAt + ", sshConfigId=" + this.sshConfigId + ", hostIds=" + this.hostIds + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public ChainHostFullData(int i10, String str, Long l10, List<Long> list, Boolean bool, Long l11) {
        this.f39034id = i10;
        this.updatedAt = str;
        this.sshConfigId = l10;
        this.hostIds = list;
        this.isShared = bool;
        this.encryptedWith = l11;
    }

    public /* synthetic */ ChainHostFullData(int i10, String str, Long l10, List list, Boolean bool, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : l10, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : l11);
    }
}
