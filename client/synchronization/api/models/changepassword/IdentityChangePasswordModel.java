package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.database.Column;
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
public final class IdentityChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_IDENTITY_SET_NAME = "identity_set";
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39037id;
    private Boolean isShared;
    private final Boolean isVisible;

    @gg.a
    public String label;

    @gg.a
    public String password;
    private final String setName;

    @gg.a
    public String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return IdentityChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IdentityChangePasswordModel(int i10, String str, String str2, String str3, Boolean bool, long j10, Boolean bool2, Long l10, String str4, s2 s2Var) {
        super(null);
        if (16 != (i10 & 16)) {
            d2.a(i10, 16, IdentityChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
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
        this.f39037id = j10;
        if ((i10 & 32) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool2;
        }
        if ((i10 & 64) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
        if ((i10 & 128) == 0) {
            this.setName = CHANGE_PASSWORD_IDENTITY_SET_NAME;
        } else {
            this.setName = str4;
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

    @o("password")
    public static /* synthetic */ void getPassword$annotations() {
    }

    @o(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IdentityChangePasswordModel identityChangePasswordModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || identityChangePasswordModel.username != null) {
            dVar.v(fVar, 0, x2.f64817a, identityChangePasswordModel.username);
        }
        if (dVar.E(fVar, 1) || identityChangePasswordModel.label != null) {
            dVar.v(fVar, 1, x2.f64817a, identityChangePasswordModel.label);
        }
        if (dVar.E(fVar, 2) || identityChangePasswordModel.password != null) {
            dVar.v(fVar, 2, x2.f64817a, identityChangePasswordModel.password);
        }
        if (dVar.E(fVar, 3) || identityChangePasswordModel.isVisible != null) {
            dVar.v(fVar, 3, i.f64704a, identityChangePasswordModel.isVisible);
        }
        dVar.q(fVar, 4, identityChangePasswordModel.getId());
        if (dVar.E(fVar, 5) || identityChangePasswordModel.isShared != null) {
            dVar.v(fVar, 5, i.f64704a, identityChangePasswordModel.isShared);
        }
        if (dVar.E(fVar, 6) || identityChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 6, h1.f64699a, identityChangePasswordModel.getEncryptedWith());
        }
        if (!dVar.E(fVar, 7) && t.b(identityChangePasswordModel.getSetName(), CHANGE_PASSWORD_IDENTITY_SET_NAME)) {
            return;
        }
        dVar.f(fVar, 7, identityChangePasswordModel.getSetName());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39037id;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public String getSetName() {
        return this.setName;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
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

    public /* synthetic */ IdentityChangePasswordModel(String str, String str2, String str3, Boolean bool, long j10, Boolean bool2, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : bool, j10, (i10 & 32) != 0 ? null : bool2, (i10 & 64) != 0 ? null : l10);
    }

    public IdentityChangePasswordModel(String str, String str2, String str3, Boolean bool, long j10, Boolean bool2, Long l10) {
        super(null);
        this.username = str;
        this.label = str2;
        this.password = str3;
        this.isVisible = bool;
        this.f39037id = j10;
        this.isShared = bool2;
        this.encryptedWith = l10;
        this.setName = CHANGE_PASSWORD_IDENTITY_SET_NAME;
    }
}
