package com.server.auditor.ssh.client.synchronization.api.models.ssh.key;

import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
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
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SshKeyBulkV3 extends SshKeyBulk {
    private Long encryptedWith;

    @a
    public String label;
    private final Long localId;

    @a
    public String passphrase;

    @a
    public String privateKey;

    @a
    public String publicKey;
    private final long remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SshKeyBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public SshKeyBulkV3() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, 0L, (String) null, (Long) null, 255, (k) null);
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

    @o(SshOptions.EXTRA_PASSPHRASE)
    public static /* synthetic */ void getPassphrase$annotations() {
    }

    @o("private_key")
    public static /* synthetic */ void getPrivateKey$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshKeyBulkV3 sshKeyBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshKeyBulkV3.label != null) {
            dVar.v(fVar, 0, x2.f64817a, sshKeyBulkV3.label);
        }
        if (dVar.E(fVar, 1) || sshKeyBulkV3.passphrase != null) {
            dVar.v(fVar, 1, x2.f64817a, sshKeyBulkV3.passphrase);
        }
        if (dVar.E(fVar, 2) || sshKeyBulkV3.privateKey != null) {
            dVar.v(fVar, 2, x2.f64817a, sshKeyBulkV3.privateKey);
        }
        if (dVar.E(fVar, 3) || sshKeyBulkV3.publicKey != null) {
            dVar.v(fVar, 3, x2.f64817a, sshKeyBulkV3.publicKey);
        }
        if (dVar.E(fVar, 4) || sshKeyBulkV3.getLocalId() != null) {
            dVar.v(fVar, 4, h1.f64699a, sshKeyBulkV3.getLocalId());
        }
        if (dVar.E(fVar, 5) || sshKeyBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 5, sshKeyBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 6) || !t.b(sshKeyBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 6, x2.f64817a, sshKeyBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 7) && sshKeyBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 7, h1.f64699a, sshKeyBulkV3.getEncryptedWith());
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

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public /* synthetic */ SshKeyBulkV3(int i10, String str, String str2, String str3, String str4, Long l10, long j10, String str5, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i10 & 2) == 0) {
            this.passphrase = null;
        } else {
            this.passphrase = str2;
        }
        if ((i10 & 4) == 0) {
            this.privateKey = null;
        } else {
            this.privateKey = str3;
        }
        if ((i10 & 8) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str4;
        }
        if ((i10 & 16) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 32) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 64) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str5;
        }
        if ((i10 & 128) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ SshKeyBulkV3(String str, String str2, String str3, String str4, Long l10, long j10, String str5, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? 0L : j10, (i10 & 64) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str5, (i10 & 128) != 0 ? null : l11);
    }

    public SshKeyBulkV3(String str, String str2, String str3, String str4, Long l10, long j10, String str5, Long l11) {
        super(null);
        this.label = str;
        this.passphrase = str2;
        this.privateKey = str3;
        this.publicKey = str4;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str5;
        this.encryptedWith = l11;
    }
}
