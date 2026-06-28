package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
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
public final class SshCertificateChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME = "sshcertificate_set";

    @gg.a
    public String certificate;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39043id;
    private Boolean isShared;
    private final String setName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return SshCertificateChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SshCertificateChangePasswordModel(int i10, String str, long j10, Boolean bool, Long l10, String str2, s2 s2Var) {
        super(null);
        if (2 != (i10 & 2)) {
            d2.a(i10, 2, SshCertificateChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.certificate = null;
        } else {
            this.certificate = str;
        }
        this.f39043id = j10;
        if ((i10 & 4) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 8) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
        if ((i10 & 16) == 0) {
            this.setName = CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME;
        } else {
            this.setName = str2;
        }
    }

    @o(Table.SSH_CERTIFICATE)
    public static /* synthetic */ void getCertificate$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshCertificateChangePasswordModel sshCertificateChangePasswordModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshCertificateChangePasswordModel.certificate != null) {
            dVar.v(fVar, 0, x2.f64817a, sshCertificateChangePasswordModel.certificate);
        }
        dVar.q(fVar, 1, sshCertificateChangePasswordModel.getId());
        if (dVar.E(fVar, 2) || sshCertificateChangePasswordModel.isShared != null) {
            dVar.v(fVar, 2, i.f64704a, sshCertificateChangePasswordModel.isShared);
        }
        if (dVar.E(fVar, 3) || sshCertificateChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 3, h1.f64699a, sshCertificateChangePasswordModel.getEncryptedWith());
        }
        if (!dVar.E(fVar, 4) && t.b(sshCertificateChangePasswordModel.getSetName(), CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME)) {
            return;
        }
        dVar.f(fVar, 4, sshCertificateChangePasswordModel.getSetName());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39043id;
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

    public /* synthetic */ SshCertificateChangePasswordModel(String str, long j10, Boolean bool, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, j10, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : l10);
    }

    public SshCertificateChangePasswordModel(String str, long j10, Boolean bool, Long l10) {
        super(null);
        this.certificate = str;
        this.f39043id = j10;
        this.isShared = bool;
        this.encryptedWith = l10;
        this.setName = CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME;
    }
}
