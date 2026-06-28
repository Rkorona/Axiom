package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
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
public final class SshKeyChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_SSH_KEY_SET_NAME = "sshkeycrypt_set";
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39044id;
    private Boolean isShared;

    @gg.a
    public String label;

    @gg.a
    public String passphrase;

    @gg.a
    public String privateKey;

    @gg.a
    public String publicKey;
    private final String setName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return SshKeyChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SshKeyChangePasswordModel(int i10, String str, String str2, String str3, String str4, long j10, Boolean bool, Long l10, String str5, s2 s2Var) {
        super(null);
        if (16 != (i10 & 16)) {
            d2.a(i10, 16, SshKeyChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
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
        this.f39044id = j10;
        if ((i10 & 32) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 64) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
        if ((i10 & 128) == 0) {
            this.setName = CHANGE_PASSWORD_SSH_KEY_SET_NAME;
        } else {
            this.setName = str5;
        }
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
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

    @o(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshKeyChangePasswordModel sshKeyChangePasswordModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshKeyChangePasswordModel.label != null) {
            dVar.v(fVar, 0, x2.f64817a, sshKeyChangePasswordModel.label);
        }
        if (dVar.E(fVar, 1) || sshKeyChangePasswordModel.passphrase != null) {
            dVar.v(fVar, 1, x2.f64817a, sshKeyChangePasswordModel.passphrase);
        }
        if (dVar.E(fVar, 2) || sshKeyChangePasswordModel.privateKey != null) {
            dVar.v(fVar, 2, x2.f64817a, sshKeyChangePasswordModel.privateKey);
        }
        if (dVar.E(fVar, 3) || sshKeyChangePasswordModel.publicKey != null) {
            dVar.v(fVar, 3, x2.f64817a, sshKeyChangePasswordModel.publicKey);
        }
        dVar.q(fVar, 4, sshKeyChangePasswordModel.getId());
        if (dVar.E(fVar, 5) || sshKeyChangePasswordModel.isShared != null) {
            dVar.v(fVar, 5, i.f64704a, sshKeyChangePasswordModel.isShared);
        }
        if (dVar.E(fVar, 6) || sshKeyChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 6, h1.f64699a, sshKeyChangePasswordModel.getEncryptedWith());
        }
        if (!dVar.E(fVar, 7) && t.b(sshKeyChangePasswordModel.getSetName(), CHANGE_PASSWORD_SSH_KEY_SET_NAME)) {
            return;
        }
        dVar.f(fVar, 7, sshKeyChangePasswordModel.getSetName());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39044id;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public String getSetName() {
        return this.setName;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
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

    public /* synthetic */ SshKeyChangePasswordModel(String str, String str2, String str3, String str4, long j10, Boolean bool, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, j10, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : l10);
    }

    public SshKeyChangePasswordModel(String str, String str2, String str3, String str4, long j10, Boolean bool, Long l10) {
        super(null);
        this.label = str;
        this.passphrase = str2;
        this.privateKey = str3;
        this.publicKey = str4;
        this.f39044id = j10;
        this.isShared = bool;
        this.encryptedWith = l10;
        this.setName = CHANGE_PASSWORD_SSH_KEY_SET_NAME;
    }
}
