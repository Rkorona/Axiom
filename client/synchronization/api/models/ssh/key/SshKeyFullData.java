package com.server.auditor.ssh.client.synchronization.api.models.ssh.key;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
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
public final class SshKeyFullData implements Shareable, CryptoErrorInterface {

    @b
    public String content;
    private String createdAt;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39063id;
    private Boolean isShared;

    @a
    public String label;
    private Long localId;

    @a
    public String passphrase;

    @a
    public String privateKey;

    @a
    public String publicKey;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SshKeyFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SshKeyFullData(int i10, int i11, String str, String str2, Long l10, String str3, String str4, String str5, String str6, String str7, Boolean bool, Long l11, s2 s2Var) {
        if (5 != (i10 & 5)) {
            d2.a(i10, 5, SshKeyFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39063id = i11;
        if ((i10 & 2) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str;
        }
        this.updatedAt = str2;
        if ((i10 & 8) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i10 & 32) == 0) {
            this.passphrase = null;
        } else {
            this.passphrase = str4;
        }
        if ((i10 & 64) == 0) {
            this.privateKey = null;
        } else {
            this.privateKey = str5;
        }
        if ((i10 & 128) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str6;
        }
        if ((i10 & 256) == 0) {
            this.content = null;
        } else {
            this.content = str7;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39063id;
    }

    public static /* synthetic */ SshKeyFullData copy$default(SshKeyFullData sshKeyFullData, int i10, String str, String str2, Long l10, String str3, String str4, String str5, String str6, String str7, Boolean bool, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sshKeyFullData.f39063id;
        }
        if ((i11 & 2) != 0) {
            str = sshKeyFullData.createdAt;
        }
        if ((i11 & 4) != 0) {
            str2 = sshKeyFullData.updatedAt;
        }
        if ((i11 & 8) != 0) {
            l10 = sshKeyFullData.localId;
        }
        if ((i11 & 16) != 0) {
            str3 = sshKeyFullData.label;
        }
        if ((i11 & 32) != 0) {
            str4 = sshKeyFullData.passphrase;
        }
        if ((i11 & 64) != 0) {
            str5 = sshKeyFullData.privateKey;
        }
        if ((i11 & 128) != 0) {
            str6 = sshKeyFullData.publicKey;
        }
        if ((i11 & 256) != 0) {
            str7 = sshKeyFullData.content;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            bool = sshKeyFullData.isShared;
        }
        if ((i11 & File.FLAG_O_APPEND) != 0) {
            l11 = sshKeyFullData.encryptedWith;
        }
        Boolean bool2 = bool;
        Long l12 = l11;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        String str13 = str2;
        return sshKeyFullData.copy(i10, str, str13, l10, str12, str10, str11, str8, str9, bool2, l12);
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

    @o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o(SshOptions.EXTRA_PASSPHRASE)
    public static /* synthetic */ void getPassphrase$annotations() {
    }

    @o("private_key")
    public static /* synthetic */ void getPrivateKey$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshKeyFullData sshKeyFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, sshKeyFullData.f39063id);
        if (dVar.E(fVar, 1) || sshKeyFullData.createdAt != null) {
            dVar.v(fVar, 1, x2.f64817a, sshKeyFullData.createdAt);
        }
        dVar.f(fVar, 2, sshKeyFullData.updatedAt);
        if (dVar.E(fVar, 3) || sshKeyFullData.localId != null) {
            dVar.v(fVar, 3, h1.f64699a, sshKeyFullData.localId);
        }
        if (dVar.E(fVar, 4) || sshKeyFullData.label != null) {
            dVar.v(fVar, 4, x2.f64817a, sshKeyFullData.label);
        }
        if (dVar.E(fVar, 5) || sshKeyFullData.passphrase != null) {
            dVar.v(fVar, 5, x2.f64817a, sshKeyFullData.passphrase);
        }
        if (dVar.E(fVar, 6) || sshKeyFullData.privateKey != null) {
            dVar.v(fVar, 6, x2.f64817a, sshKeyFullData.privateKey);
        }
        if (dVar.E(fVar, 7) || sshKeyFullData.publicKey != null) {
            dVar.v(fVar, 7, x2.f64817a, sshKeyFullData.publicKey);
        }
        if (dVar.E(fVar, 8) || sshKeyFullData.content != null) {
            dVar.v(fVar, 8, x2.f64817a, sshKeyFullData.content);
        }
        if (dVar.E(fVar, 9) || sshKeyFullData.isShared != null) {
            dVar.v(fVar, 9, i.f64704a, sshKeyFullData.isShared);
        }
        if (!dVar.E(fVar, 10) && sshKeyFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 10, h1.f64699a, sshKeyFullData.getEncryptedWith());
    }

    public final Boolean component10() {
        return this.isShared;
    }

    public final Long component11() {
        return this.encryptedWith;
    }

    public final String component2() {
        return this.createdAt;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final Long component4() {
        return this.localId;
    }

    public final String component5() {
        return this.label;
    }

    public final String component6() {
        return this.passphrase;
    }

    public final String component7() {
        return this.privateKey;
    }

    public final String component8() {
        return this.publicKey;
    }

    public final String component9() {
        return this.content;
    }

    public final SshKeyFullData copy(int i10, String str, String str2, Long l10, String str3, String str4, String str5, String str6, String str7, Boolean bool, Long l11) {
        t.f(str2, "updatedAt");
        return new SshKeyFullData(i10, str, str2, l10, str3, str4, str5, str6, str7, bool, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshKeyFullData)) {
            return false;
        }
        SshKeyFullData sshKeyFullData = (SshKeyFullData) obj;
        return this.f39063id == sshKeyFullData.f39063id && t.b(this.createdAt, sshKeyFullData.createdAt) && t.b(this.updatedAt, sshKeyFullData.updatedAt) && t.b(this.localId, sshKeyFullData.localId) && t.b(this.label, sshKeyFullData.label) && t.b(this.passphrase, sshKeyFullData.passphrase) && t.b(this.privateKey, sshKeyFullData.privateKey) && t.b(this.publicKey, sshKeyFullData.publicKey) && t.b(this.content, sshKeyFullData.content) && t.b(this.isShared, sshKeyFullData.isShared) && t.b(this.encryptedWith, sshKeyFullData.encryptedWith);
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
        return this.f39063id;
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
        int iHashCode = Integer.hashCode(this.f39063id) * 31;
        String str = this.createdAt;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.updatedAt.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.passphrase;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.privateKey;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.publicKey;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.content;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
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

    public final void setShared(Boolean bool) {
        this.isShared = bool;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "SshKeyFullData(id=" + this.f39063id + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", localId=" + this.localId + ", label=" + this.label + ", passphrase=" + this.passphrase + ", privateKey=" + this.privateKey + ", publicKey=" + this.publicKey + ", content=" + this.content + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public SshKeyFullData(int i10, String str, String str2, Long l10, String str3, String str4, String str5, String str6, String str7, Boolean bool, Long l11) {
        t.f(str2, "updatedAt");
        this.f39063id = i10;
        this.createdAt = str;
        this.updatedAt = str2;
        this.localId = l10;
        this.label = str3;
        this.passphrase = str4;
        this.privateKey = str5;
        this.publicKey = str6;
        this.content = str7;
        this.isShared = bool;
        this.encryptedWith = l11;
    }

    public /* synthetic */ SshKeyFullData(int i10, String str, String str2, Long l10, String str3, String str4, String str5, String str6, String str7, Boolean bool, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : str, str2, (i11 & 8) != 0 ? null : l10, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & File.FLAG_O_TRUNC) != 0 ? null : bool, (i11 & File.FLAG_O_APPEND) != 0 ? null : l11);
    }
}
