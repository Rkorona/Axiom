package com.server.auditor.ssh.client.synchronization.api.models.identity;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
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
public final class IdentityBulkV3 extends IdentityBulk {
    private Long encryptedWith;
    private Boolean isVisible;

    @a
    public String label;
    private final Long localId;

    @a
    public String password;
    private final long remoteId;
    private String sshIdMode;
    private Object sshKeyId;
    private String updatedAt;

    @a
    public String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return IdentityBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public IdentityBulkV3() {
        this((String) null, (String) null, (String) null, (Boolean) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, (String) null, 1023, (k) null);
    }

    public static /* synthetic */ IdentityBulkV3 copy$default(IdentityBulkV3 identityBulkV3, String str, String str2, String str3, Boolean bool, Object obj, Long l10, long j10, String str4, Long l11, String str5, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = identityBulkV3.username;
        }
        if ((i10 & 2) != 0) {
            str2 = identityBulkV3.label;
        }
        if ((i10 & 4) != 0) {
            str3 = identityBulkV3.password;
        }
        if ((i10 & 8) != 0) {
            bool = identityBulkV3.isVisible;
        }
        if ((i10 & 16) != 0) {
            obj = identityBulkV3.sshKeyId;
        }
        if ((i10 & 32) != 0) {
            l10 = identityBulkV3.localId;
        }
        if ((i10 & 64) != 0) {
            j10 = identityBulkV3.remoteId;
        }
        if ((i10 & 128) != 0) {
            str4 = identityBulkV3.updatedAt;
        }
        if ((i10 & 256) != 0) {
            l11 = identityBulkV3.encryptedWith;
        }
        if ((i10 & File.FLAG_O_TRUNC) != 0) {
            str5 = identityBulkV3.sshIdMode;
        }
        String str6 = str5;
        String str7 = str4;
        long j11 = j10;
        Object obj3 = obj;
        Long l12 = l10;
        String str8 = str3;
        Boolean bool2 = bool;
        return identityBulkV3.copy(str, str2, str8, bool2, obj3, l12, j11, str7, l11, str6);
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

    @o("password")
    public static /* synthetic */ void getPassword$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
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

    @o(Column.IS_VISIBLE)
    public static /* synthetic */ void isVisible$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IdentityBulkV3 identityBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || identityBulkV3.username != null) {
            dVar.v(fVar, 0, x2.f64817a, identityBulkV3.username);
        }
        if (dVar.E(fVar, 1) || identityBulkV3.label != null) {
            dVar.v(fVar, 1, x2.f64817a, identityBulkV3.label);
        }
        if (dVar.E(fVar, 2) || identityBulkV3.password != null) {
            dVar.v(fVar, 2, x2.f64817a, identityBulkV3.password);
        }
        if (dVar.E(fVar, 3) || identityBulkV3.isVisible != null) {
            dVar.v(fVar, 3, i.f64704a, identityBulkV3.isVisible);
        }
        if (dVar.E(fVar, 4) || identityBulkV3.getSshKeyId() != null) {
            dVar.v(fVar, 4, b.f80841a, identityBulkV3.getSshKeyId());
        }
        if (dVar.E(fVar, 5) || identityBulkV3.getLocalId() != null) {
            dVar.v(fVar, 5, h1.f64699a, identityBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 6) || identityBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 6, identityBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 7) || !t.b(identityBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 7, x2.f64817a, identityBulkV3.getUpdatedAt());
        }
        if (dVar.E(fVar, 8) || identityBulkV3.getEncryptedWith() != null) {
            dVar.v(fVar, 8, h1.f64699a, identityBulkV3.getEncryptedWith());
        }
        if (!dVar.E(fVar, 9) && identityBulkV3.sshIdMode == null) {
            return;
        }
        dVar.v(fVar, 9, x2.f64817a, identityBulkV3.sshIdMode);
    }

    public final String component1() {
        return this.username;
    }

    public final String component10() {
        return this.sshIdMode;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.password;
    }

    public final Boolean component4() {
        return this.isVisible;
    }

    public final Object component5() {
        return this.sshKeyId;
    }

    public final Long component6() {
        return this.localId;
    }

    public final long component7() {
        return this.remoteId;
    }

    public final String component8() {
        return this.updatedAt;
    }

    public final Long component9() {
        return this.encryptedWith;
    }

    public final IdentityBulkV3 copy(String str, String str2, String str3, Boolean bool, Object obj, Long l10, long j10, String str4, Long l11, String str5) {
        return new IdentityBulkV3(str, str2, str3, bool, obj, l10, j10, str4, l11, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityBulkV3)) {
            return false;
        }
        IdentityBulkV3 identityBulkV3 = (IdentityBulkV3) obj;
        return t.b(this.username, identityBulkV3.username) && t.b(this.label, identityBulkV3.label) && t.b(this.password, identityBulkV3.password) && t.b(this.isVisible, identityBulkV3.isVisible) && t.b(this.sshKeyId, identityBulkV3.sshKeyId) && t.b(this.localId, identityBulkV3.localId) && this.remoteId == identityBulkV3.remoteId && t.b(this.updatedAt, identityBulkV3.updatedAt) && t.b(this.encryptedWith, identityBulkV3.encryptedWith) && t.b(this.sshIdMode, identityBulkV3.sshIdMode);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    public final String getSshIdMode() {
        return this.sshIdMode;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk
    public Object getSshKeyId() {
        return this.sshKeyId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isVisible;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Object obj = this.sshKeyId;
        int iHashCode5 = (iHashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode6 = (((iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str4 = this.updatedAt;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str5 = this.sshIdMode;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isVisible() {
        return this.isVisible;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setSshIdMode(String str) {
        this.sshIdMode = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk
    public void setSshKeyId(Object obj) {
        this.sshKeyId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final void setVisible(Boolean bool) {
        this.isVisible = bool;
    }

    public String toString() {
        return "IdentityBulkV3(username=" + this.username + ", label=" + this.label + ", password=" + this.password + ", isVisible=" + this.isVisible + ", sshKeyId=" + this.sshKeyId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ", sshIdMode=" + this.sshIdMode + ")";
    }

    public /* synthetic */ IdentityBulkV3(int i10, String str, String str2, String str3, Boolean bool, Object obj, Long l10, long j10, String str4, Long l11, String str5, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.username = null;
        } else {
            this.username = str;
        }
        if ((i10 & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i10 & 4) == 0) {
            this.password = null;
        } else {
            this.password = str3;
        }
        if ((i10 & 8) == 0) {
            this.isVisible = null;
        } else {
            this.isVisible = bool;
        }
        if ((i10 & 16) == 0) {
            this.sshKeyId = null;
        } else {
            this.sshKeyId = obj;
        }
        if ((i10 & 32) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 64) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 128) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str4;
        }
        if ((i10 & 256) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.sshIdMode = null;
        } else {
            this.sshIdMode = str5;
        }
    }

    public /* synthetic */ IdentityBulkV3(String str, String str2, String str3, Boolean bool, Object obj, Long l10, long j10, String str4, Long l11, String str5, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : obj, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? 0L : j10, (i10 & 128) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str4, (i10 & 256) != 0 ? null : l11, (i10 & File.FLAG_O_TRUNC) != 0 ? null : str5);
    }

    public IdentityBulkV3(String str, String str2, String str3, Boolean bool, Object obj, Long l10, long j10, String str4, Long l11, String str5) {
        super(null);
        this.username = str;
        this.label = str2;
        this.password = str3;
        this.isVisible = bool;
        this.sshKeyId = obj;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str4;
        this.encryptedWith = l11;
        this.sshIdMode = str5;
    }
}
