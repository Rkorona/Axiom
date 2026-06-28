package com.server.auditor.ssh.client.synchronization.api.models.identity;

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
public final class IdentityFullData implements Shareable, CryptoErrorInterface {

    @b
    public String content;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39051id;
    private Boolean isShared;
    private Boolean isVisible;

    @a
    public String label;
    private Long localId;

    @a
    public String password;
    private String sshIdMode;
    private WithRecourseId sshKeyId;
    private String updatedAt;

    @a
    public String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return IdentityFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ IdentityFullData(int i10, int i11, String str, WithRecourseId withRecourseId, Boolean bool, Long l10, String str2, String str3, String str4, Boolean bool2, String str5, Long l11, String str6, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, IdentityFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39051id = i11;
        this.updatedAt = str;
        if ((i10 & 4) == 0) {
            this.sshKeyId = null;
        } else {
            this.sshKeyId = withRecourseId;
        }
        if ((i10 & 8) == 0) {
            this.isVisible = null;
        } else {
            this.isVisible = bool;
        }
        if ((i10 & 16) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 32) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        if ((i10 & 64) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i10 & 128) == 0) {
            this.password = null;
        } else {
            this.password = str4;
        }
        if ((i10 & 256) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool2;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.content = null;
        } else {
            this.content = str5;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
        if ((i10 & 2048) == 0) {
            this.sshIdMode = null;
        } else {
            this.sshIdMode = str6;
        }
    }

    private final int component1() {
        return this.f39051id;
    }

    private final Boolean component9() {
        return this.isShared;
    }

    public static /* synthetic */ IdentityFullData copy$default(IdentityFullData identityFullData, int i10, String str, WithRecourseId withRecourseId, Boolean bool, Long l10, String str2, String str3, String str4, Boolean bool2, String str5, Long l11, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = identityFullData.f39051id;
        }
        if ((i11 & 2) != 0) {
            str = identityFullData.updatedAt;
        }
        if ((i11 & 4) != 0) {
            withRecourseId = identityFullData.sshKeyId;
        }
        if ((i11 & 8) != 0) {
            bool = identityFullData.isVisible;
        }
        if ((i11 & 16) != 0) {
            l10 = identityFullData.localId;
        }
        if ((i11 & 32) != 0) {
            str2 = identityFullData.username;
        }
        if ((i11 & 64) != 0) {
            str3 = identityFullData.label;
        }
        if ((i11 & 128) != 0) {
            str4 = identityFullData.password;
        }
        if ((i11 & 256) != 0) {
            bool2 = identityFullData.isShared;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            str5 = identityFullData.content;
        }
        if ((i11 & File.FLAG_O_APPEND) != 0) {
            l11 = identityFullData.encryptedWith;
        }
        if ((i11 & 2048) != 0) {
            str6 = identityFullData.sshIdMode;
        }
        Long l12 = l11;
        String str7 = str6;
        Boolean bool3 = bool2;
        String str8 = str5;
        String str9 = str3;
        String str10 = str4;
        Long l13 = l10;
        String str11 = str2;
        return identityFullData.copy(i10, str, withRecourseId, bool, l13, str11, str9, str10, bool3, str8, l12, str7);
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

    @o("password")
    public static /* synthetic */ void getPassword$annotations() {
    }

    @o(IdentityBulk.SSHID_MODE_NAME)
    public static /* synthetic */ void getSshIdMode$annotations() {
    }

    @o("ssh_key")
    public static /* synthetic */ void getSshKeyId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    @o(Column.IS_VISIBLE)
    public static /* synthetic */ void isVisible$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IdentityFullData identityFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, identityFullData.f39051id);
        dVar.f(fVar, 1, identityFullData.updatedAt);
        if (dVar.E(fVar, 2) || identityFullData.sshKeyId != null) {
            dVar.v(fVar, 2, WithRecourseId$$serializer.INSTANCE, identityFullData.sshKeyId);
        }
        if (dVar.E(fVar, 3) || identityFullData.isVisible != null) {
            dVar.v(fVar, 3, i.f64704a, identityFullData.isVisible);
        }
        if (dVar.E(fVar, 4) || identityFullData.localId != null) {
            dVar.v(fVar, 4, h1.f64699a, identityFullData.localId);
        }
        if (dVar.E(fVar, 5) || identityFullData.username != null) {
            dVar.v(fVar, 5, x2.f64817a, identityFullData.username);
        }
        if (dVar.E(fVar, 6) || identityFullData.label != null) {
            dVar.v(fVar, 6, x2.f64817a, identityFullData.label);
        }
        if (dVar.E(fVar, 7) || identityFullData.password != null) {
            dVar.v(fVar, 7, x2.f64817a, identityFullData.password);
        }
        if (dVar.E(fVar, 8) || identityFullData.isShared != null) {
            dVar.v(fVar, 8, i.f64704a, identityFullData.isShared);
        }
        if (dVar.E(fVar, 9) || identityFullData.content != null) {
            dVar.v(fVar, 9, x2.f64817a, identityFullData.content);
        }
        if (dVar.E(fVar, 10) || identityFullData.getEncryptedWith() != null) {
            dVar.v(fVar, 10, h1.f64699a, identityFullData.getEncryptedWith());
        }
        if (!dVar.E(fVar, 11) && identityFullData.sshIdMode == null) {
            return;
        }
        dVar.v(fVar, 11, x2.f64817a, identityFullData.sshIdMode);
    }

    public final String component10() {
        return this.content;
    }

    public final Long component11() {
        return this.encryptedWith;
    }

    public final String component12() {
        return this.sshIdMode;
    }

    public final String component2() {
        return this.updatedAt;
    }

    public final WithRecourseId component3() {
        return this.sshKeyId;
    }

    public final Boolean component4() {
        return this.isVisible;
    }

    public final Long component5() {
        return this.localId;
    }

    public final String component6() {
        return this.username;
    }

    public final String component7() {
        return this.label;
    }

    public final String component8() {
        return this.password;
    }

    public final IdentityFullData copy(int i10, String str, WithRecourseId withRecourseId, Boolean bool, Long l10, String str2, String str3, String str4, Boolean bool2, String str5, Long l11, String str6) {
        t.f(str, "updatedAt");
        return new IdentityFullData(i10, str, withRecourseId, bool, l10, str2, str3, str4, bool2, str5, l11, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityFullData)) {
            return false;
        }
        IdentityFullData identityFullData = (IdentityFullData) obj;
        return this.f39051id == identityFullData.f39051id && t.b(this.updatedAt, identityFullData.updatedAt) && t.b(this.sshKeyId, identityFullData.sshKeyId) && t.b(this.isVisible, identityFullData.isVisible) && t.b(this.localId, identityFullData.localId) && t.b(this.username, identityFullData.username) && t.b(this.label, identityFullData.label) && t.b(this.password, identityFullData.password) && t.b(this.isShared, identityFullData.isShared) && t.b(this.content, identityFullData.content) && t.b(this.encryptedWith, identityFullData.encryptedWith) && t.b(this.sshIdMode, identityFullData.sshIdMode);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39051id;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final String getSshIdMode() {
        return this.sshIdMode;
    }

    public final WithRecourseId getSshKeyId() {
        return this.sshKeyId;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f39051id) * 31) + this.updatedAt.hashCode()) * 31;
        WithRecourseId withRecourseId = this.sshKeyId;
        int iHashCode2 = (iHashCode + (withRecourseId == null ? 0 : withRecourseId.hashCode())) * 31;
        Boolean bool = this.isVisible;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.username;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.isShared;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.content;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str5 = this.sshIdMode;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isVisible() {
        return this.isVisible;
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

    public final void setSshIdMode(String str) {
        this.sshIdMode = str;
    }

    public final void setSshKeyId(WithRecourseId withRecourseId) {
        this.sshKeyId = withRecourseId;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public final void setVisible(Boolean bool) {
        this.isVisible = bool;
    }

    public String toString() {
        return "IdentityFullData(id=" + this.f39051id + ", updatedAt=" + this.updatedAt + ", sshKeyId=" + this.sshKeyId + ", isVisible=" + this.isVisible + ", localId=" + this.localId + ", username=" + this.username + ", label=" + this.label + ", password=" + this.password + ", isShared=" + this.isShared + ", content=" + this.content + ", encryptedWith=" + this.encryptedWith + ", sshIdMode=" + this.sshIdMode + ")";
    }

    public IdentityFullData(int i10, String str, WithRecourseId withRecourseId, Boolean bool, Long l10, String str2, String str3, String str4, Boolean bool2, String str5, Long l11, String str6) {
        t.f(str, "updatedAt");
        this.f39051id = i10;
        this.updatedAt = str;
        this.sshKeyId = withRecourseId;
        this.isVisible = bool;
        this.localId = l10;
        this.username = str2;
        this.label = str3;
        this.password = str4;
        this.isShared = bool2;
        this.content = str5;
        this.encryptedWith = l11;
        this.sshIdMode = str6;
    }

    public /* synthetic */ IdentityFullData(int i10, String str, WithRecourseId withRecourseId, Boolean bool, Long l10, String str2, String str3, String str4, Boolean bool2, String str5, Long l11, String str6, int i11, k kVar) {
        this(i10, str, (i11 & 4) != 0 ? null : withRecourseId, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : l10, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : bool2, (i11 & File.FLAG_O_TRUNC) != 0 ? null : str5, (i11 & File.FLAG_O_APPEND) != 0 ? null : l11, (i11 & 2048) != 0 ? null : str6);
    }
}
