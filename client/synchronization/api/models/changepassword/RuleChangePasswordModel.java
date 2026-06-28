package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.crystalnix.termius.libtermius.sftp.File;
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
public final class RuleChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_PF_RULE_SET_NAME = "pfrule_set";
    private final String boundAddress;
    private Long encryptedWith;

    @gg.a
    public String host;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39041id;
    private Boolean isShared;
    private final String label;
    private final Integer localPort;
    private final Integer remotePort;
    private final String setName;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return RuleChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RuleChangePasswordModel(int i10, String str, String str2, String str3, String str4, Integer num, Integer num2, long j10, Boolean bool, Long l10, String str5, s2 s2Var) {
        super(null);
        if (64 != (i10 & 64)) {
            d2.a(i10, 64, RuleChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i10 & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i10 & 4) == 0) {
            this.boundAddress = null;
        } else {
            this.boundAddress = str3;
        }
        if ((i10 & 8) == 0) {
            this.host = null;
        } else {
            this.host = str4;
        }
        if ((i10 & 16) == 0) {
            this.localPort = null;
        } else {
            this.localPort = num;
        }
        if ((i10 & 32) == 0) {
            this.remotePort = null;
        } else {
            this.remotePort = num2;
        }
        this.f39041id = j10;
        if ((i10 & 128) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 256) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.setName = CHANGE_PASSWORD_PF_RULE_SET_NAME;
        } else {
            this.setName = str5;
        }
    }

    @o(Column.BOUND_ADDRESS)
    public static /* synthetic */ void getBoundAddress$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("hostname")
    public static /* synthetic */ void getHost$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(Column.LOCAL_PORT)
    public static /* synthetic */ void getLocalPort$annotations() {
    }

    @o(Column.REMOTE_PORT)
    public static /* synthetic */ void getRemotePort$annotations() {
    }

    @o(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
    }

    @o("pf_type")
    public static /* synthetic */ void getType$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RuleChangePasswordModel ruleChangePasswordModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || ruleChangePasswordModel.label != null) {
            dVar.v(fVar, 0, x2.f64817a, ruleChangePasswordModel.label);
        }
        if (dVar.E(fVar, 1) || ruleChangePasswordModel.type != null) {
            dVar.v(fVar, 1, x2.f64817a, ruleChangePasswordModel.type);
        }
        if (dVar.E(fVar, 2) || ruleChangePasswordModel.boundAddress != null) {
            dVar.v(fVar, 2, x2.f64817a, ruleChangePasswordModel.boundAddress);
        }
        if (dVar.E(fVar, 3) || ruleChangePasswordModel.host != null) {
            dVar.v(fVar, 3, x2.f64817a, ruleChangePasswordModel.host);
        }
        if (dVar.E(fVar, 4) || ruleChangePasswordModel.localPort != null) {
            dVar.v(fVar, 4, w0.f64808a, ruleChangePasswordModel.localPort);
        }
        if (dVar.E(fVar, 5) || ruleChangePasswordModel.remotePort != null) {
            dVar.v(fVar, 5, w0.f64808a, ruleChangePasswordModel.remotePort);
        }
        dVar.q(fVar, 6, ruleChangePasswordModel.getId());
        if (dVar.E(fVar, 7) || ruleChangePasswordModel.isShared != null) {
            dVar.v(fVar, 7, i.f64704a, ruleChangePasswordModel.isShared);
        }
        if (dVar.E(fVar, 8) || ruleChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 8, h1.f64699a, ruleChangePasswordModel.getEncryptedWith());
        }
        if (!dVar.E(fVar, 9) && t.b(ruleChangePasswordModel.getSetName(), CHANGE_PASSWORD_PF_RULE_SET_NAME)) {
            return;
        }
        dVar.f(fVar, 9, ruleChangePasswordModel.getSetName());
    }

    public final String getBoundAddress() {
        return this.boundAddress;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39041id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getLocalPort() {
        return this.localPort;
    }

    public final Integer getRemotePort() {
        return this.remotePort;
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

    public /* synthetic */ RuleChangePasswordModel(String str, String str2, String str3, String str4, Integer num, Integer num2, long j10, Boolean bool, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, j10, (i10 & 128) != 0 ? null : bool, (i10 & 256) != 0 ? null : l10);
    }

    public RuleChangePasswordModel(String str, String str2, String str3, String str4, Integer num, Integer num2, long j10, Boolean bool, Long l10) {
        super(null);
        this.label = str;
        this.type = str2;
        this.boundAddress = str3;
        this.host = str4;
        this.localPort = num;
        this.remotePort = num2;
        this.f39041id = j10;
        this.isShared = bool;
        this.encryptedWith = l10;
        this.setName = CHANGE_PASSWORD_PF_RULE_SET_NAME;
    }
}
