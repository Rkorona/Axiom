package com.server.auditor.ssh.client.synchronization.api.models.snippet;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId$$serializer;
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
public final class SnippetFullData implements Shareable, CryptoErrorInterface {
    public Boolean autoClose;

    @b
    public String content;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39060id;
    private Boolean isShared;

    @a
    public String label;
    private Long localId;
    public WithRecourseId packageId;

    @a
    public String script;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SnippetFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SnippetFullData(int i10, int i11, Long l10, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, WithRecourseId withRecourseId, Long l11, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SnippetFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39060id = i11;
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
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i10 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i10 & 32) == 0) {
            this.script = null;
        } else {
            this.script = str4;
        }
        if ((i10 & 64) == 0) {
            this.autoClose = null;
        } else {
            this.autoClose = bool;
        }
        if ((i10 & 128) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool2;
        }
        if ((i10 & 256) == 0) {
            this.packageId = null;
        } else {
            this.packageId = withRecourseId;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39060id;
    }

    public static /* synthetic */ SnippetFullData copy$default(SnippetFullData snippetFullData, int i10, Long l10, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, WithRecourseId withRecourseId, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = snippetFullData.f39060id;
        }
        if ((i11 & 2) != 0) {
            l10 = snippetFullData.localId;
        }
        if ((i11 & 4) != 0) {
            str = snippetFullData.updatedAt;
        }
        if ((i11 & 8) != 0) {
            str2 = snippetFullData.content;
        }
        if ((i11 & 16) != 0) {
            str3 = snippetFullData.label;
        }
        if ((i11 & 32) != 0) {
            str4 = snippetFullData.script;
        }
        if ((i11 & 64) != 0) {
            bool = snippetFullData.autoClose;
        }
        if ((i11 & 128) != 0) {
            bool2 = snippetFullData.isShared;
        }
        if ((i11 & 256) != 0) {
            withRecourseId = snippetFullData.packageId;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            l11 = snippetFullData.encryptedWith;
        }
        WithRecourseId withRecourseId2 = withRecourseId;
        Long l12 = l11;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str5 = str3;
        String str6 = str4;
        return snippetFullData.copy(i10, l10, str, str2, str5, str6, bool3, bool4, withRecourseId2, l12);
    }

    @o("auto_close")
    public static /* synthetic */ void getAutoClose$annotations() {
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

    @o("package")
    public static /* synthetic */ void getPackageId$annotations() {
    }

    @o("script")
    public static /* synthetic */ void getScript$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SnippetFullData snippetFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, snippetFullData.f39060id);
        if (dVar.E(fVar, 1) || snippetFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, snippetFullData.localId);
        }
        if (dVar.E(fVar, 2) || snippetFullData.updatedAt != null) {
            dVar.v(fVar, 2, x2.f64817a, snippetFullData.updatedAt);
        }
        if (dVar.E(fVar, 3) || snippetFullData.content != null) {
            dVar.v(fVar, 3, x2.f64817a, snippetFullData.content);
        }
        if (dVar.E(fVar, 4) || snippetFullData.label != null) {
            dVar.v(fVar, 4, x2.f64817a, snippetFullData.label);
        }
        if (dVar.E(fVar, 5) || snippetFullData.script != null) {
            dVar.v(fVar, 5, x2.f64817a, snippetFullData.script);
        }
        if (dVar.E(fVar, 6) || snippetFullData.autoClose != null) {
            dVar.v(fVar, 6, i.f64704a, snippetFullData.autoClose);
        }
        if (dVar.E(fVar, 7) || snippetFullData.isShared != null) {
            dVar.v(fVar, 7, i.f64704a, snippetFullData.isShared);
        }
        if (dVar.E(fVar, 8) || snippetFullData.packageId != null) {
            dVar.v(fVar, 8, WithRecourseId$$serializer.INSTANCE, snippetFullData.packageId);
        }
        if (!dVar.E(fVar, 9) && snippetFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 9, h1.f64699a, snippetFullData.getEncryptedWith());
    }

    public final Long component10() {
        return this.encryptedWith;
    }

    public final Long component2() {
        return this.localId;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.content;
    }

    public final String component5() {
        return this.label;
    }

    public final String component6() {
        return this.script;
    }

    public final Boolean component7() {
        return this.autoClose;
    }

    public final Boolean component8() {
        return this.isShared;
    }

    public final WithRecourseId component9() {
        return this.packageId;
    }

    public final SnippetFullData copy(int i10, Long l10, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, WithRecourseId withRecourseId, Long l11) {
        return new SnippetFullData(i10, l10, str, str2, str3, str4, bool, bool2, withRecourseId, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetFullData)) {
            return false;
        }
        SnippetFullData snippetFullData = (SnippetFullData) obj;
        return this.f39060id == snippetFullData.f39060id && t.b(this.localId, snippetFullData.localId) && t.b(this.updatedAt, snippetFullData.updatedAt) && t.b(this.content, snippetFullData.content) && t.b(this.label, snippetFullData.label) && t.b(this.script, snippetFullData.script) && t.b(this.autoClose, snippetFullData.autoClose) && t.b(this.isShared, snippetFullData.isShared) && t.b(this.packageId, snippetFullData.packageId) && t.b(this.encryptedWith, snippetFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39060id;
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
        int iHashCode = Integer.hashCode(this.f39060id) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.script;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.autoClose;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isShared;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        WithRecourseId withRecourseId = this.packageId;
        int iHashCode9 = (iHashCode8 + (withRecourseId == null ? 0 : withRecourseId.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode9 + (l11 != null ? l11.hashCode() : 0);
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
        this.updatedAt = str;
    }

    public String toString() {
        return "SnippetFullData(id=" + this.f39060id + ", localId=" + this.localId + ", updatedAt=" + this.updatedAt + ", content=" + this.content + ", label=" + this.label + ", script=" + this.script + ", autoClose=" + this.autoClose + ", isShared=" + this.isShared + ", packageId=" + this.packageId + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public SnippetFullData(int i10, Long l10, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, WithRecourseId withRecourseId, Long l11) {
        this.f39060id = i10;
        this.localId = l10;
        this.updatedAt = str;
        this.content = str2;
        this.label = str3;
        this.script = str4;
        this.autoClose = bool;
        this.isShared = bool2;
        this.packageId = withRecourseId;
        this.encryptedWith = l11;
    }

    public /* synthetic */ SnippetFullData(int i10, Long l10, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, WithRecourseId withRecourseId, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : l10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : bool2, (i11 & 256) != 0 ? null : withRecourseId, (i11 & File.FLAG_O_TRUNC) != 0 ? null : l11);
    }
}
