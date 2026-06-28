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
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ProxyChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_PROXY_SET_NAME = "proxycommand_set";
    private Long encryptedWith;

    @gg.a
    public String hostname;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39040id;
    private Boolean isShared;
    private Integer port;
    private final String setName;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return ProxyChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProxyChangePasswordModel(int i10, String str, String str2, Integer num, long j10, Boolean bool, Long l10, String str3, s2 s2Var) {
        super(null);
        if (8 != (i10 & 8)) {
            d2.a(i10, 8, ProxyChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i10 & 2) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str2;
        }
        if ((i10 & 4) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        this.f39040id = j10;
        if ((i10 & 16) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
        if ((i10 & 64) == 0) {
            this.setName = CHANGE_PASSWORD_PROXY_SET_NAME;
        } else {
            this.setName = str3;
        }
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("hostname")
    public static /* synthetic */ void getHostname$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @o(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
    }

    @o(Column.TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProxyChangePasswordModel proxyChangePasswordModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || proxyChangePasswordModel.type != null) {
            dVar.v(fVar, 0, x2.f64817a, proxyChangePasswordModel.type);
        }
        if (dVar.E(fVar, 1) || proxyChangePasswordModel.hostname != null) {
            dVar.v(fVar, 1, x2.f64817a, proxyChangePasswordModel.hostname);
        }
        if (dVar.E(fVar, 2) || proxyChangePasswordModel.port != null) {
            dVar.v(fVar, 2, w0.f64808a, proxyChangePasswordModel.port);
        }
        dVar.q(fVar, 3, proxyChangePasswordModel.getId());
        if (dVar.E(fVar, 4) || proxyChangePasswordModel.isShared != null) {
            dVar.v(fVar, 4, i.f64704a, proxyChangePasswordModel.isShared);
        }
        if (dVar.E(fVar, 5) || proxyChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 5, h1.f64699a, proxyChangePasswordModel.getEncryptedWith());
        }
        if (!dVar.E(fVar, 6) && t.b(proxyChangePasswordModel.getSetName(), CHANGE_PASSWORD_PROXY_SET_NAME)) {
            return;
        }
        dVar.f(fVar, 6, proxyChangePasswordModel.getSetName());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39040id;
    }

    public final Integer getPort() {
        return this.port;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public String getSetName() {
        return this.setName;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final String getType() {
        return this.type;
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

    public final void setPort(Integer num) {
        this.port = num;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public /* synthetic */ ProxyChangePasswordModel(String str, String str2, Integer num, long j10, Boolean bool, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, j10, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : l10);
    }

    public ProxyChangePasswordModel(String str, String str2, Integer num, long j10, Boolean bool, Long l10) {
        super(null);
        this.type = str;
        this.hostname = str2;
        this.port = num;
        this.f39040id = j10;
        this.isShared = bool;
        this.encryptedWith = l10;
        this.setName = CHANGE_PASSWORD_PROXY_SET_NAME;
    }
}
