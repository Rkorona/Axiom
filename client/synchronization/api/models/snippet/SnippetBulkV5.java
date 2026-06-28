package com.server.auditor.ssh.client.synchronization.api.models.snippet;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import gg.b;
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

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SnippetBulkV5 extends SnippetBulk {
    public static final String CONTENT_SERIAL_NAME = "content";

    @b
    public String content;
    private Long encryptedWith;
    private final Long localId;
    private Object packageId;
    private final long remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return SnippetBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SnippetBulkV5() {
        this((String) null, (Long) null, 0L, (String) null, (Long) null, (Object) null, 63, (k) null);
    }

    public static /* synthetic */ SnippetBulkV5 copy$default(SnippetBulkV5 snippetBulkV5, String str, Long l10, long j10, String str2, Long l11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = snippetBulkV5.content;
        }
        if ((i10 & 2) != 0) {
            l10 = snippetBulkV5.localId;
        }
        if ((i10 & 4) != 0) {
            j10 = snippetBulkV5.remoteId;
        }
        if ((i10 & 8) != 0) {
            str2 = snippetBulkV5.updatedAt;
        }
        if ((i10 & 16) != 0) {
            l11 = snippetBulkV5.encryptedWith;
        }
        if ((i10 & 32) != 0) {
            obj = snippetBulkV5.packageId;
        }
        Object obj3 = obj;
        String str3 = str2;
        long j11 = j10;
        return snippetBulkV5.copy(str, l10, j11, str3, l11, obj3);
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

    @o("package")
    public static /* synthetic */ void getPackageId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SnippetBulkV5 snippetBulkV5, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || snippetBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, snippetBulkV5.content);
        }
        if (dVar.E(fVar, 1) || snippetBulkV5.getLocalId() != null) {
            dVar.v(fVar, 1, h1.f64699a, snippetBulkV5.getLocalId());
        }
        if (dVar.E(fVar, 2) || snippetBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 2, snippetBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 3) || !t.b(snippetBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 3, x2.f64817a, snippetBulkV5.getUpdatedAt());
        }
        if (dVar.E(fVar, 4) || snippetBulkV5.getEncryptedWith() != null) {
            dVar.v(fVar, 4, h1.f64699a, snippetBulkV5.getEncryptedWith());
        }
        if (!dVar.E(fVar, 5) && snippetBulkV5.getPackageId() == null) {
            return;
        }
        dVar.v(fVar, 5, tp.b.f80841a, snippetBulkV5.getPackageId());
    }

    public final String component1() {
        return this.content;
    }

    public final Long component2() {
        return this.localId;
    }

    public final long component3() {
        return this.remoteId;
    }

    public final String component4() {
        return this.updatedAt;
    }

    public final Long component5() {
        return this.encryptedWith;
    }

    public final Object component6() {
        return this.packageId;
    }

    public final SnippetBulkV5 copy(String str, Long l10, long j10, String str2, Long l11, Object obj) {
        return new SnippetBulkV5(str, l10, j10, str2, l11, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetBulkV5)) {
            return false;
        }
        SnippetBulkV5 snippetBulkV5 = (SnippetBulkV5) obj;
        return t.b(this.content, snippetBulkV5.content) && t.b(this.localId, snippetBulkV5.localId) && this.remoteId == snippetBulkV5.remoteId && t.b(this.updatedAt, snippetBulkV5.updatedAt) && t.b(this.encryptedWith, snippetBulkV5.encryptedWith) && t.b(this.packageId, snippetBulkV5.packageId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk
    public Object getPackageId() {
        return this.packageId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str2 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Object obj = this.packageId;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk
    public void setPackageId(Object obj) {
        this.packageId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "SnippetBulkV5(content=" + this.content + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ", packageId=" + this.packageId + ")";
    }

    public /* synthetic */ SnippetBulkV5(int i10, String str, Long l10, long j10, String str2, Long l11, Object obj, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 4) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 8) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str2;
        }
        if ((i10 & 16) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
        if ((i10 & 32) == 0) {
            this.packageId = null;
        } else {
            this.packageId = obj;
        }
    }

    public /* synthetic */ SnippetBulkV5(String str, Long l10, long j10, String str2, Long l11, Object obj, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : obj);
    }

    public SnippetBulkV5(String str, Long l10, long j10, String str2, Long l11, Object obj) {
        super(null);
        this.content = str;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
        this.packageId = obj;
    }
}
