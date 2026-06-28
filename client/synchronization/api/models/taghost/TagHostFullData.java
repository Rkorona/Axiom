package com.server.auditor.ssh.client.synchronization.api.models.taghost;

import android.text.format.Time;
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
import lv.i;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TagHostFullData implements CryptoErrorInterface, Shareable {
    private Long encryptedWith;
    private WithRecourseId host;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39065id;
    private Boolean isShared;
    private Long localId;
    private WithRecourseId tag;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TagHostFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TagHostFullData(int i10, int i11, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11, s2 s2Var) {
        if (15 != (i10 & 15)) {
            d2.a(i10, 15, TagHostFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39065id = i11;
        this.updatedAt = str;
        this.tag = withRecourseId;
        this.host = withRecourseId2;
        if ((i10 & 16) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 32) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 64) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39065id;
    }

    private final String component2() {
        return this.updatedAt;
    }

    public static /* synthetic */ TagHostFullData copy$default(TagHostFullData tagHostFullData, int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = tagHostFullData.f39065id;
        }
        if ((i11 & 2) != 0) {
            str = tagHostFullData.updatedAt;
        }
        if ((i11 & 4) != 0) {
            withRecourseId = tagHostFullData.tag;
        }
        if ((i11 & 8) != 0) {
            withRecourseId2 = tagHostFullData.host;
        }
        if ((i11 & 16) != 0) {
            l10 = tagHostFullData.localId;
        }
        if ((i11 & 32) != 0) {
            bool = tagHostFullData.isShared;
        }
        if ((i11 & 64) != 0) {
            l11 = tagHostFullData.encryptedWith;
        }
        Boolean bool2 = bool;
        Long l12 = l11;
        Long l13 = l10;
        WithRecourseId withRecourseId3 = withRecourseId;
        return tagHostFullData.copy(i10, str, withRecourseId3, withRecourseId2, l13, bool2, l12);
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("host")
    public static /* synthetic */ void getHost$annotations() {
    }

    @o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("tag")
    public static /* synthetic */ void getTag$annotations() {
    }

    @o("updated_at")
    private static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TagHostFullData tagHostFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, tagHostFullData.f39065id);
        dVar.f(fVar, 1, tagHostFullData.updatedAt);
        WithRecourseId$$serializer withRecourseId$$serializer = WithRecourseId$$serializer.INSTANCE;
        dVar.o(fVar, 2, withRecourseId$$serializer, tagHostFullData.tag);
        dVar.o(fVar, 3, withRecourseId$$serializer, tagHostFullData.host);
        if (dVar.E(fVar, 4) || tagHostFullData.localId != null) {
            dVar.v(fVar, 4, h1.f64699a, tagHostFullData.localId);
        }
        if (dVar.E(fVar, 5) || tagHostFullData.isShared != null) {
            dVar.v(fVar, 5, i.f64704a, tagHostFullData.isShared);
        }
        if (!dVar.E(fVar, 6) && tagHostFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 6, h1.f64699a, tagHostFullData.getEncryptedWith());
    }

    public final WithRecourseId component3() {
        return this.tag;
    }

    public final WithRecourseId component4() {
        return this.host;
    }

    public final Long component5() {
        return this.localId;
    }

    public final Boolean component6() {
        return this.isShared;
    }

    public final Long component7() {
        return this.encryptedWith;
    }

    public final TagHostFullData copy(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11) {
        t.f(str, "updatedAt");
        t.f(withRecourseId, "tag");
        t.f(withRecourseId2, "host");
        return new TagHostFullData(i10, str, withRecourseId, withRecourseId2, l10, bool, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagHostFullData)) {
            return false;
        }
        TagHostFullData tagHostFullData = (TagHostFullData) obj;
        return this.f39065id == tagHostFullData.f39065id && t.b(this.updatedAt, tagHostFullData.updatedAt) && t.b(this.tag, tagHostFullData.tag) && t.b(this.host, tagHostFullData.host) && t.b(this.localId, tagHostFullData.localId) && t.b(this.isShared, tagHostFullData.isShared) && t.b(this.encryptedWith, tagHostFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final WithRecourseId getHost() {
        return this.host;
    }

    public final int getHostId() {
        return this.host.getId();
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39065id;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final WithRecourseId getTag() {
        return this.tag;
    }

    public final int getTagId() {
        return this.tag.getId();
    }

    public final String getUpdatedAt() {
        Time time = new Time("UTC+0:00");
        time.parse3339(this.updatedAt);
        time.switchTimezone(Time.getCurrentTimezone());
        String str = time.format("%Y-%m-%d %H:%M:%S");
        t.e(str, "format(...)");
        return str;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.f39065id) * 31) + this.updatedAt.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.host.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
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

    public final void setHost(WithRecourseId withRecourseId) {
        t.f(withRecourseId, "<set-?>");
        this.host = withRecourseId;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setShared(Boolean bool) {
        this.isShared = bool;
    }

    public final void setTag(WithRecourseId withRecourseId) {
        t.f(withRecourseId, "<set-?>");
        this.tag = withRecourseId;
    }

    public String toString() {
        return "TagHostFullData(id=" + this.f39065id + ", updatedAt=" + this.updatedAt + ", tag=" + this.tag + ", host=" + this.host + ", localId=" + this.localId + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public TagHostFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11) {
        t.f(str, "updatedAt");
        t.f(withRecourseId, "tag");
        t.f(withRecourseId2, "host");
        this.f39065id = i10;
        this.updatedAt = str;
        this.tag = withRecourseId;
        this.host = withRecourseId2;
        this.localId = l10;
        this.isShared = bool;
        this.encryptedWith = l11;
    }

    public /* synthetic */ TagHostFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11, int i11, k kVar) {
        this(i10, str, withRecourseId, withRecourseId2, (i11 & 16) != 0 ? null : l10, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : l11);
    }
}
