package com.server.auditor.ssh.client.synchronization.api.models.snippet;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import gg.a;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i;
import lv.s2;
import lv.x2;
import tp.b;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SnippetBulkV3 extends SnippetBulk {
    public Boolean autoClose;
    private Long encryptedWith;

    @a
    public String label;
    private final Long localId;
    private Object packageId;
    private final long remoteId;

    @a
    public String script;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SnippetBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public SnippetBulkV3() {
        this((String) null, (String) null, (Boolean) null, (Long) null, 0L, (String) null, (Long) null, (Object) null, 255, (k) null);
    }

    public static /* synthetic */ SnippetBulkV3 copy$default(SnippetBulkV3 snippetBulkV3, String str, String str2, Boolean bool, Long l10, long j10, String str3, Long l11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = snippetBulkV3.label;
        }
        if ((i10 & 2) != 0) {
            str2 = snippetBulkV3.script;
        }
        if ((i10 & 4) != 0) {
            bool = snippetBulkV3.autoClose;
        }
        if ((i10 & 8) != 0) {
            l10 = snippetBulkV3.localId;
        }
        if ((i10 & 16) != 0) {
            j10 = snippetBulkV3.remoteId;
        }
        if ((i10 & 32) != 0) {
            str3 = snippetBulkV3.updatedAt;
        }
        if ((i10 & 64) != 0) {
            l11 = snippetBulkV3.encryptedWith;
        }
        if ((i10 & 128) != 0) {
            obj = snippetBulkV3.packageId;
        }
        Object obj3 = obj;
        String str4 = str3;
        long j11 = j10;
        Boolean bool2 = bool;
        Long l12 = l10;
        return snippetBulkV3.copy(str, str2, bool2, l12, j11, str4, l11, obj3);
    }

    @o("auto_close")
    public static /* synthetic */ void getAutoClose$annotations() {
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

    @o("package")
    public static /* synthetic */ void getPackageId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("script")
    public static /* synthetic */ void getScript$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SnippetBulkV3 snippetBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || snippetBulkV3.label != null) {
            dVar.v(fVar, 0, x2.f64817a, snippetBulkV3.label);
        }
        if (dVar.E(fVar, 1) || snippetBulkV3.script != null) {
            dVar.v(fVar, 1, x2.f64817a, snippetBulkV3.script);
        }
        if (dVar.E(fVar, 2) || snippetBulkV3.autoClose != null) {
            dVar.v(fVar, 2, i.f64704a, snippetBulkV3.autoClose);
        }
        if (dVar.E(fVar, 3) || snippetBulkV3.getLocalId() != null) {
            dVar.v(fVar, 3, h1.f64699a, snippetBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 4) || snippetBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 4, snippetBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 5) || !t.b(snippetBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 5, x2.f64817a, snippetBulkV3.getUpdatedAt());
        }
        if (dVar.E(fVar, 6) || snippetBulkV3.getEncryptedWith() != null) {
            dVar.v(fVar, 6, h1.f64699a, snippetBulkV3.getEncryptedWith());
        }
        if (!dVar.E(fVar, 7) && snippetBulkV3.getPackageId() == null) {
            return;
        }
        dVar.v(fVar, 7, b.f80841a, snippetBulkV3.getPackageId());
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.script;
    }

    public final Boolean component3() {
        return this.autoClose;
    }

    public final Long component4() {
        return this.localId;
    }

    public final long component5() {
        return this.remoteId;
    }

    public final String component6() {
        return this.updatedAt;
    }

    public final Long component7() {
        return this.encryptedWith;
    }

    public final Object component8() {
        return this.packageId;
    }

    public final SnippetBulkV3 copy(String str, String str2, Boolean bool, Long l10, long j10, String str3, Long l11, Object obj) {
        return new SnippetBulkV3(str, str2, bool, l10, j10, str3, l11, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetBulkV3)) {
            return false;
        }
        SnippetBulkV3 snippetBulkV3 = (SnippetBulkV3) obj;
        return t.b(this.label, snippetBulkV3.label) && t.b(this.script, snippetBulkV3.script) && t.b(this.autoClose, snippetBulkV3.autoClose) && t.b(this.localId, snippetBulkV3.localId) && this.remoteId == snippetBulkV3.remoteId && t.b(this.updatedAt, snippetBulkV3.updatedAt) && t.b(this.encryptedWith, snippetBulkV3.encryptedWith) && t.b(this.packageId, snippetBulkV3.packageId);
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
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.script;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.autoClose;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode4 = (((iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str3 = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Object obj = this.packageId;
        return iHashCode6 + (obj != null ? obj.hashCode() : 0);
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
        return "SnippetBulkV3(label=" + this.label + ", script=" + this.script + ", autoClose=" + this.autoClose + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ", packageId=" + this.packageId + ")";
    }

    public /* synthetic */ SnippetBulkV3(int i10, String str, String str2, Boolean bool, Long l10, long j10, String str3, Long l11, Object obj, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i10 & 2) == 0) {
            this.script = null;
        } else {
            this.script = str2;
        }
        if ((i10 & 4) == 0) {
            this.autoClose = null;
        } else {
            this.autoClose = bool;
        }
        if ((i10 & 8) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 16) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 32) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str3;
        }
        if ((i10 & 64) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
        if ((i10 & 128) == 0) {
            this.packageId = null;
        } else {
            this.packageId = obj;
        }
    }

    public /* synthetic */ SnippetBulkV3(String str, String str2, Boolean bool, Long l10, long j10, String str3, Long l11, Object obj, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? 0L : j10, (i10 & 32) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str3, (i10 & 64) != 0 ? null : l11, (i10 & 128) != 0 ? null : obj);
    }

    public SnippetBulkV3(String str, String str2, Boolean bool, Long l10, long j10, String str3, Long l11, Object obj) {
        super(null);
        this.label = str;
        this.script = str2;
        this.autoClose = bool;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str3;
        this.encryptedWith = l11;
        this.packageId = obj;
    }
}
