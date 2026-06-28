package com.server.auditor.ssh.client.synchronization.api.models.snippethost;

import android.text.format.Time;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
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
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SnippetHostFullData implements CryptoErrorInterface, Shareable {
    private Long encryptedWith;
    private WithRecourseId host;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39061id;
    private Boolean isShared;
    private Long localId;
    private WithRecourseId snippet;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SnippetHostFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SnippetHostFullData(int i10, int i11, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SnippetHostFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39061id = i11;
        if ((i10 & 2) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str;
        }
        if ((i10 & 4) == 0) {
            this.snippet = null;
        } else {
            this.snippet = withRecourseId;
        }
        if ((i10 & 8) == 0) {
            this.host = null;
        } else {
            this.host = withRecourseId2;
        }
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
        return this.f39061id;
    }

    private final String component2() {
        return this.updatedAt;
    }

    public static /* synthetic */ SnippetHostFullData copy$default(SnippetHostFullData snippetHostFullData, int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = snippetHostFullData.f39061id;
        }
        if ((i11 & 2) != 0) {
            str = snippetHostFullData.updatedAt;
        }
        if ((i11 & 4) != 0) {
            withRecourseId = snippetHostFullData.snippet;
        }
        if ((i11 & 8) != 0) {
            withRecourseId2 = snippetHostFullData.host;
        }
        if ((i11 & 16) != 0) {
            l10 = snippetHostFullData.localId;
        }
        if ((i11 & 32) != 0) {
            bool = snippetHostFullData.isShared;
        }
        if ((i11 & 64) != 0) {
            l11 = snippetHostFullData.encryptedWith;
        }
        Boolean bool2 = bool;
        Long l12 = l11;
        Long l13 = l10;
        WithRecourseId withRecourseId3 = withRecourseId;
        return snippetHostFullData.copy(i10, str, withRecourseId3, withRecourseId2, l13, bool2, l12);
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

    @o(Table.SNIPPET)
    public static /* synthetic */ void getSnippet$annotations() {
    }

    @o("updated_at")
    private static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SnippetHostFullData snippetHostFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, snippetHostFullData.f39061id);
        if (dVar.E(fVar, 1) || snippetHostFullData.updatedAt != null) {
            dVar.v(fVar, 1, x2.f64817a, snippetHostFullData.updatedAt);
        }
        if (dVar.E(fVar, 2) || snippetHostFullData.snippet != null) {
            dVar.v(fVar, 2, WithRecourseId$$serializer.INSTANCE, snippetHostFullData.snippet);
        }
        if (dVar.E(fVar, 3) || snippetHostFullData.host != null) {
            dVar.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, snippetHostFullData.host);
        }
        if (dVar.E(fVar, 4) || snippetHostFullData.localId != null) {
            dVar.v(fVar, 4, h1.f64699a, snippetHostFullData.localId);
        }
        if (dVar.E(fVar, 5) || snippetHostFullData.isShared != null) {
            dVar.v(fVar, 5, i.f64704a, snippetHostFullData.isShared);
        }
        if (!dVar.E(fVar, 6) && snippetHostFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 6, h1.f64699a, snippetHostFullData.getEncryptedWith());
    }

    public final WithRecourseId component3() {
        return this.snippet;
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

    public final SnippetHostFullData copy(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11) {
        return new SnippetHostFullData(i10, str, withRecourseId, withRecourseId2, l10, bool, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetHostFullData)) {
            return false;
        }
        SnippetHostFullData snippetHostFullData = (SnippetHostFullData) obj;
        return this.f39061id == snippetHostFullData.f39061id && t.b(this.updatedAt, snippetHostFullData.updatedAt) && t.b(this.snippet, snippetHostFullData.snippet) && t.b(this.host, snippetHostFullData.host) && t.b(this.localId, snippetHostFullData.localId) && t.b(this.isShared, snippetHostFullData.isShared) && t.b(this.encryptedWith, snippetHostFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final WithRecourseId getHost() {
        return this.host;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39061id;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final WithRecourseId getSnippet() {
        return this.snippet;
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
        int iHashCode = Integer.hashCode(this.f39061id) * 31;
        String str = this.updatedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        WithRecourseId withRecourseId = this.snippet;
        int iHashCode3 = (iHashCode2 + (withRecourseId == null ? 0 : withRecourseId.hashCode())) * 31;
        WithRecourseId withRecourseId2 = this.host;
        int iHashCode4 = (iHashCode3 + (withRecourseId2 == null ? 0 : withRecourseId2.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode6 + (l11 != null ? l11.hashCode() : 0);
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
        this.host = withRecourseId;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setShared(Boolean bool) {
        this.isShared = bool;
    }

    public final void setSnippet(WithRecourseId withRecourseId) {
        this.snippet = withRecourseId;
    }

    public String toString() {
        return "SnippetHostFullData(id=" + this.f39061id + ", updatedAt=" + this.updatedAt + ", snippet=" + this.snippet + ", host=" + this.host + ", localId=" + this.localId + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public SnippetHostFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11) {
        this.f39061id = i10;
        this.updatedAt = str;
        this.snippet = withRecourseId;
        this.host = withRecourseId2;
        this.localId = l10;
        this.isShared = bool;
        this.encryptedWith = l11;
    }

    public /* synthetic */ SnippetHostFullData(int i10, String str, WithRecourseId withRecourseId, WithRecourseId withRecourseId2, Long l10, Boolean bool, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : withRecourseId, (i11 & 8) != 0 ? null : withRecourseId2, (i11 & 16) != 0 ? null : l10, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : l11);
    }
}
