package com.server.auditor.ssh.client.synchronization.api.models.knownhost;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import gg.a;
import gg.b;
import hv.c;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class KnownHostFullData implements Shareable, CryptoErrorInterface {

    @b
    public String content;
    private Long encryptedWith;

    @a
    public String hostname;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39056id;
    private boolean isShared;
    private Long localId;

    @a
    public String publicKey;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return KnownHostFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public KnownHostFullData() {
        this(0, (Long) null, (String) null, (String) null, (String) null, (String) null, false, (Long) null, 255, (k) null);
    }

    private final int component1() {
        return this.f39056id;
    }

    public static /* synthetic */ KnownHostFullData copy$default(KnownHostFullData knownHostFullData, int i10, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = knownHostFullData.f39056id;
        }
        if ((i11 & 2) != 0) {
            l10 = knownHostFullData.localId;
        }
        if ((i11 & 4) != 0) {
            str = knownHostFullData.updatedAt;
        }
        if ((i11 & 8) != 0) {
            str2 = knownHostFullData.hostname;
        }
        if ((i11 & 16) != 0) {
            str3 = knownHostFullData.publicKey;
        }
        if ((i11 & 32) != 0) {
            str4 = knownHostFullData.content;
        }
        if ((i11 & 64) != 0) {
            z10 = knownHostFullData.isShared;
        }
        if ((i11 & 128) != 0) {
            l11 = knownHostFullData.encryptedWith;
        }
        boolean z11 = z10;
        Long l12 = l11;
        String str5 = str3;
        String str6 = str4;
        return knownHostFullData.copy(i10, l10, str, str2, str5, str6, z11, l12);
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(Column.HOSTNAMES)
    public static /* synthetic */ void getHostname$annotations() {
    }

    @o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o(SerializableEvent.KEY_FIELD)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(KnownHostFullData knownHostFullData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || knownHostFullData.f39056id != 0) {
            dVar.t(fVar, 0, knownHostFullData.f39056id);
        }
        if (dVar.E(fVar, 1) || knownHostFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, knownHostFullData.localId);
        }
        if (dVar.E(fVar, 2) || knownHostFullData.updatedAt != null) {
            dVar.v(fVar, 2, x2.f64817a, knownHostFullData.updatedAt);
        }
        if (dVar.E(fVar, 3) || knownHostFullData.hostname != null) {
            dVar.v(fVar, 3, x2.f64817a, knownHostFullData.hostname);
        }
        if (dVar.E(fVar, 4) || knownHostFullData.publicKey != null) {
            dVar.v(fVar, 4, x2.f64817a, knownHostFullData.publicKey);
        }
        if (dVar.E(fVar, 5) || knownHostFullData.content != null) {
            dVar.v(fVar, 5, x2.f64817a, knownHostFullData.content);
        }
        if (dVar.E(fVar, 6) || knownHostFullData.isShared) {
            dVar.u(fVar, 6, knownHostFullData.isShared);
        }
        if (!dVar.E(fVar, 7) && knownHostFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 7, h1.f64699a, knownHostFullData.getEncryptedWith());
    }

    public final Long component2() {
        return this.localId;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.hostname;
    }

    public final String component5() {
        return this.publicKey;
    }

    public final String component6() {
        return this.content;
    }

    public final boolean component7() {
        return this.isShared;
    }

    public final Long component8() {
        return this.encryptedWith;
    }

    public final KnownHostFullData copy(int i10, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11) {
        return new KnownHostFullData(i10, l10, str, str2, str3, str4, z10, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KnownHostFullData)) {
            return false;
        }
        KnownHostFullData knownHostFullData = (KnownHostFullData) obj;
        return this.f39056id == knownHostFullData.f39056id && t.b(this.localId, knownHostFullData.localId) && t.b(this.updatedAt, knownHostFullData.updatedAt) && t.b(this.hostname, knownHostFullData.hostname) && t.b(this.publicKey, knownHostFullData.publicKey) && t.b(this.content, knownHostFullData.content) && this.isShared == knownHostFullData.isShared && t.b(this.encryptedWith, knownHostFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39056id;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return Boolean.valueOf(this.isShared);
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f39056id) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hostname;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publicKey;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isShared)) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode6 + (l11 != null ? l11.hashCode() : 0);
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

    public final void setShared(boolean z10) {
        this.isShared = z10;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "KnownHostFullData(id=" + this.f39056id + ", localId=" + this.localId + ", updatedAt=" + this.updatedAt + ", hostname=" + this.hostname + ", publicKey=" + this.publicKey + ", content=" + this.content + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ KnownHostFullData(int i10, int i11, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.f39056id = 0;
        } else {
            this.f39056id = i11;
        }
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 4) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str;
        }
        if ((i10 & 8) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str2;
        }
        if ((i10 & 16) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str3;
        }
        if ((i10 & 32) == 0) {
            this.content = null;
        } else {
            this.content = str4;
        }
        if ((i10 & 64) == 0) {
            this.isShared = false;
        } else {
            this.isShared = z10;
        }
        if ((i10 & 128) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public KnownHostFullData(int i10, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11) {
        this.f39056id = i10;
        this.localId = l10;
        this.updatedAt = str;
        this.hostname = str2;
        this.publicKey = str3;
        this.content = str4;
        this.isShared = z10;
        this.encryptedWith = l11;
    }

    public /* synthetic */ KnownHostFullData(int i10, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11, int i11, k kVar) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : l10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? false : z10, (i11 & 128) != 0 ? null : l11);
    }
}
