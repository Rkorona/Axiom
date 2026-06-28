package com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
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
public final class PackageFullData implements Shareable, CryptoErrorInterface {

    @b
    public String content;
    private String createdAt;
    private Long encryptedWith;
    private boolean isShared;

    @a
    public String label;
    private Long localId;
    private int remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return PackageFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ PackageFullData(int i10, int i11, Long l10, String str, String str2, boolean z10, String str3, String str4, Long l11, s2 s2Var) {
        if (4 != (i10 & 4)) {
            d2.a(i10, 4, PackageFullData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.remoteId = 0;
        } else {
            this.remoteId = i11;
        }
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        this.updatedAt = str;
        if ((i10 & 8) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str2;
        }
        if ((i10 & 16) == 0) {
            this.isShared = false;
        } else {
            this.isShared = z10;
        }
        if ((i10 & 32) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i10 & 64) == 0) {
            this.content = null;
        } else {
            this.content = str4;
        }
        if ((i10 & 128) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public static /* synthetic */ PackageFullData copy$default(PackageFullData packageFullData, int i10, Long l10, String str, String str2, boolean z10, String str3, String str4, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = packageFullData.remoteId;
        }
        if ((i11 & 2) != 0) {
            l10 = packageFullData.localId;
        }
        if ((i11 & 4) != 0) {
            str = packageFullData.updatedAt;
        }
        if ((i11 & 8) != 0) {
            str2 = packageFullData.createdAt;
        }
        if ((i11 & 16) != 0) {
            z10 = packageFullData.isShared;
        }
        if ((i11 & 32) != 0) {
            str3 = packageFullData.label;
        }
        if ((i11 & 64) != 0) {
            str4 = packageFullData.content;
        }
        if ((i11 & 128) != 0) {
            l11 = packageFullData.encryptedWith;
        }
        String str5 = str4;
        Long l12 = l11;
        boolean z11 = z10;
        String str6 = str3;
        return packageFullData.copy(i10, l10, str, str2, z11, str6, str5, l12);
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o(Column.CREATED_AT)
    public static /* synthetic */ void getCreatedAt$annotations() {
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

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PackageFullData packageFullData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || packageFullData.remoteId != 0) {
            dVar.t(fVar, 0, packageFullData.remoteId);
        }
        if (dVar.E(fVar, 1) || packageFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, packageFullData.localId);
        }
        dVar.f(fVar, 2, packageFullData.updatedAt);
        if (dVar.E(fVar, 3) || packageFullData.createdAt != null) {
            dVar.v(fVar, 3, x2.f64817a, packageFullData.createdAt);
        }
        if (dVar.E(fVar, 4) || packageFullData.isShared) {
            dVar.u(fVar, 4, packageFullData.isShared);
        }
        if (dVar.E(fVar, 5) || !t.b(packageFullData.label, "")) {
            dVar.f(fVar, 5, packageFullData.label);
        }
        if (dVar.E(fVar, 6) || packageFullData.content != null) {
            dVar.v(fVar, 6, x2.f64817a, packageFullData.content);
        }
        if (!dVar.E(fVar, 7) && packageFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 7, h1.f64699a, packageFullData.getEncryptedWith());
    }

    public final int component1() {
        return this.remoteId;
    }

    public final Long component2() {
        return this.localId;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final boolean component5() {
        return this.isShared;
    }

    public final String component6() {
        return this.label;
    }

    public final String component7() {
        return this.content;
    }

    public final Long component8() {
        return this.encryptedWith;
    }

    public final PackageFullData copy(int i10, Long l10, String str, String str2, boolean z10, String str3, String str4, Long l11) {
        t.f(str, "updatedAt");
        t.f(str3, "label");
        return new PackageFullData(i10, l10, str, str2, z10, str3, str4, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageFullData)) {
            return false;
        }
        PackageFullData packageFullData = (PackageFullData) obj;
        return this.remoteId == packageFullData.remoteId && t.b(this.localId, packageFullData.localId) && t.b(this.updatedAt, packageFullData.updatedAt) && t.b(this.createdAt, packageFullData.createdAt) && this.isShared == packageFullData.isShared && t.b(this.label, packageFullData.label) && t.b(this.content, packageFullData.content) && t.b(this.encryptedWith, packageFullData.encryptedWith);
    }

    public final String getCreatedAt() {
        return this.createdAt;
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

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.remoteId) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.updatedAt.hashCode()) * 31;
        String str = this.createdAt;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isShared)) * 31) + this.label.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
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

    public final void setCreatedAt(String str) {
        this.createdAt = str;
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

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "PackageFullData(remoteId=" + this.remoteId + ", localId=" + this.localId + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", isShared=" + this.isShared + ", label=" + this.label + ", content=" + this.content + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public PackageFullData(int i10, Long l10, String str, String str2, boolean z10, String str3, String str4, Long l11) {
        t.f(str, "updatedAt");
        t.f(str3, "label");
        this.remoteId = i10;
        this.localId = l10;
        this.updatedAt = str;
        this.createdAt = str2;
        this.isShared = z10;
        this.label = str3;
        this.content = str4;
        this.encryptedWith = l11;
    }

    public /* synthetic */ PackageFullData(int i10, Long l10, String str, String str2, boolean z10, String str3, String str4, Long l11, int i11, k kVar) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : l10, str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? "" : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : l11);
    }
}
