package com.server.auditor.ssh.client.synchronization.api.models.tag;

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
import lv.i;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TagFullData implements Shareable, CryptoErrorInterface {

    @b
    public String content;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39064id;
    private Boolean isShared;

    @a
    public String label;
    private Long localId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TagFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TagFullData(int i10, int i11, Long l10, Boolean bool, String str, String str2, String str3, Long l11, s2 s2Var) {
        if (9 != (i10 & 9)) {
            d2.a(i10, 9, TagFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39064id = i11;
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 4) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        this.updatedAt = str;
        if ((i10 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i10 & 32) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i10 & 64) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39064id;
    }

    public static /* synthetic */ TagFullData copy$default(TagFullData tagFullData, int i10, Long l10, Boolean bool, String str, String str2, String str3, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = tagFullData.f39064id;
        }
        if ((i11 & 2) != 0) {
            l10 = tagFullData.localId;
        }
        if ((i11 & 4) != 0) {
            bool = tagFullData.isShared;
        }
        if ((i11 & 8) != 0) {
            str = tagFullData.updatedAt;
        }
        if ((i11 & 16) != 0) {
            str2 = tagFullData.label;
        }
        if ((i11 & 32) != 0) {
            str3 = tagFullData.content;
        }
        if ((i11 & 64) != 0) {
            l11 = tagFullData.encryptedWith;
        }
        String str4 = str3;
        Long l12 = l11;
        String str5 = str2;
        Boolean bool2 = bool;
        return tagFullData.copy(i10, l10, bool2, str, str5, str4, l12);
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TagFullData tagFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, tagFullData.f39064id);
        if (dVar.E(fVar, 1) || tagFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, tagFullData.localId);
        }
        if (dVar.E(fVar, 2) || tagFullData.isShared != null) {
            dVar.v(fVar, 2, i.f64704a, tagFullData.isShared);
        }
        dVar.f(fVar, 3, tagFullData.updatedAt);
        if (dVar.E(fVar, 4) || tagFullData.label != null) {
            dVar.v(fVar, 4, x2.f64817a, tagFullData.label);
        }
        if (dVar.E(fVar, 5) || tagFullData.content != null) {
            dVar.v(fVar, 5, x2.f64817a, tagFullData.content);
        }
        if (!dVar.E(fVar, 6) && tagFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 6, h1.f64699a, tagFullData.getEncryptedWith());
    }

    public final Long component2() {
        return this.localId;
    }

    public final Boolean component3() {
        return this.isShared;
    }

    public final String component4() {
        return this.updatedAt;
    }

    public final String component5() {
        return this.label;
    }

    public final String component6() {
        return this.content;
    }

    public final Long component7() {
        return this.encryptedWith;
    }

    public final TagFullData copy(int i10, Long l10, Boolean bool, String str, String str2, String str3, Long l11) {
        t.f(str, "updatedAt");
        return new TagFullData(i10, l10, bool, str, str2, str3, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagFullData)) {
            return false;
        }
        TagFullData tagFullData = (TagFullData) obj;
        return this.f39064id == tagFullData.f39064id && t.b(this.localId, tagFullData.localId) && t.b(this.isShared, tagFullData.isShared) && t.b(this.updatedAt, tagFullData.updatedAt) && t.b(this.label, tagFullData.label) && t.b(this.content, tagFullData.content) && t.b(this.encryptedWith, tagFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39064id;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f39064id) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.updatedAt.hashCode()) * 31;
        String str = this.label;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
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

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setShared(Boolean bool) {
        this.isShared = bool;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "TagFullData(id=" + this.f39064id + ", localId=" + this.localId + ", isShared=" + this.isShared + ", updatedAt=" + this.updatedAt + ", label=" + this.label + ", content=" + this.content + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public TagFullData(int i10, Long l10, Boolean bool, String str, String str2, String str3, Long l11) {
        t.f(str, "updatedAt");
        this.f39064id = i10;
        this.localId = l10;
        this.isShared = bool;
        this.updatedAt = str;
        this.label = str2;
        this.content = str3;
        this.encryptedWith = l11;
    }

    public /* synthetic */ TagFullData(int i10, Long l10, Boolean bool, String str, String str2, String str3, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : l10, (i11 & 4) != 0 ? null : bool, str, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : l11);
    }
}
