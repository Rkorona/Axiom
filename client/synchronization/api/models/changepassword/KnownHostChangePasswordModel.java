package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import hv.c;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
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
public final class KnownHostChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_KNOWN_HOST_SET_NAME = "knownhost_set";
    private Long encryptedWith;

    @gg.a
    public String hostname;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39038id;
    private Boolean isShared;

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
            return KnownHostChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KnownHostChangePasswordModel(int i10, String str, String str2, long j10, Boolean bool, Long l10, String str3, s2 s2Var) {
        super(null);
        if (4 != (i10 & 4)) {
            d2.a(i10, 4, KnownHostChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str;
        }
        if ((i10 & 2) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str2;
        }
        this.f39038id = j10;
        if ((i10 & 8) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 16) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
        if ((i10 & 32) == 0) {
            this.setName = CHANGE_PASSWORD_KNOWN_HOST_SET_NAME;
        } else {
            this.setName = str3;
        }
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(Column.HOSTNAMES)
    public static /* synthetic */ void getHostname$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(SerializableEvent.KEY_FIELD)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @o(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(KnownHostChangePasswordModel knownHostChangePasswordModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || knownHostChangePasswordModel.hostname != null) {
            dVar.v(fVar, 0, x2.f64817a, knownHostChangePasswordModel.hostname);
        }
        if (dVar.E(fVar, 1) || knownHostChangePasswordModel.publicKey != null) {
            dVar.v(fVar, 1, x2.f64817a, knownHostChangePasswordModel.publicKey);
        }
        dVar.q(fVar, 2, knownHostChangePasswordModel.getId());
        if (dVar.E(fVar, 3) || knownHostChangePasswordModel.isShared != null) {
            dVar.v(fVar, 3, i.f64704a, knownHostChangePasswordModel.isShared);
        }
        if (dVar.E(fVar, 4) || knownHostChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 4, h1.f64699a, knownHostChangePasswordModel.getEncryptedWith());
        }
        if (!dVar.E(fVar, 5) && t.b(knownHostChangePasswordModel.getSetName(), CHANGE_PASSWORD_KNOWN_HOST_SET_NAME)) {
            return;
        }
        dVar.f(fVar, 5, knownHostChangePasswordModel.getSetName());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39038id;
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

    public /* synthetic */ KnownHostChangePasswordModel(String str, String str2, long j10, Boolean bool, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, j10, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : l10);
    }

    public KnownHostChangePasswordModel(String str, String str2, long j10, Boolean bool, Long l10) {
        super(null);
        this.hostname = str;
        this.publicKey = str2;
        this.f39038id = j10;
        this.isShared = bool;
        this.encryptedWith = l10;
        this.setName = CHANGE_PASSWORD_KNOWN_HOST_SET_NAME;
    }
}
