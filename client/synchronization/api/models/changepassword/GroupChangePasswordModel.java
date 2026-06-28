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
public final class GroupChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_GROUP_SET_NAME = "group_set";
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39035id;
    private Boolean isShared;

    @gg.a
    public String label;
    private final String setName;

    @gg.a
    public SshConfig sshConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return GroupChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p
    public static final class SshConfig {

        @gg.a
        public String envVariables;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public static final class Companion {
            private Companion() {
            }

            public final c serializer() {
                return GroupChangePasswordModel$SshConfig$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SshConfig() {
            this((String) null, 1, (k) (0 == true ? 1 : 0));
        }

        @o(Column.ENVIRONMENT_VARIABLES)
        public static /* synthetic */ void getEnvVariables$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshConfig sshConfig, d dVar, f fVar) {
            if (!dVar.E(fVar, 0) && sshConfig.envVariables == null) {
                return;
            }
            dVar.v(fVar, 0, x2.f64817a, sshConfig.envVariables);
        }

        public /* synthetic */ SshConfig(int i10, String str, s2 s2Var) {
            if ((i10 & 1) == 0) {
                this.envVariables = null;
            } else {
                this.envVariables = str;
            }
        }

        public SshConfig(String str) {
            this.envVariables = str;
        }

        public /* synthetic */ SshConfig(String str, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupChangePasswordModel(int i10, long j10, String str, SshConfig sshConfig, Boolean bool, Long l10, String str2, s2 s2Var) {
        super(null);
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, GroupChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f39035id = j10;
        if ((i10 & 2) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i10 & 4) == 0) {
            this.sshConfig = null;
        } else {
            this.sshConfig = sshConfig;
        }
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
            this.setName = CHANGE_PASSWORD_GROUP_SET_NAME;
        } else {
            this.setName = str2;
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

    @o(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
    }

    @o("ssh_config")
    public static /* synthetic */ void getSshConfig$annotations() {
    }

    @o(Column.IS_SHARED)
    private static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(GroupChangePasswordModel groupChangePasswordModel, d dVar, f fVar) {
        dVar.q(fVar, 0, groupChangePasswordModel.getId());
        if (dVar.E(fVar, 1) || groupChangePasswordModel.label != null) {
            dVar.v(fVar, 1, x2.f64817a, groupChangePasswordModel.label);
        }
        if (dVar.E(fVar, 2) || groupChangePasswordModel.sshConfig != null) {
            dVar.v(fVar, 2, GroupChangePasswordModel$SshConfig$$serializer.INSTANCE, groupChangePasswordModel.sshConfig);
        }
        if (dVar.E(fVar, 3) || groupChangePasswordModel.isShared != null) {
            dVar.v(fVar, 3, i.f64704a, groupChangePasswordModel.isShared);
        }
        if (dVar.E(fVar, 4) || groupChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 4, h1.f64699a, groupChangePasswordModel.getEncryptedWith());
        }
        if (!dVar.E(fVar, 5) && t.b(groupChangePasswordModel.getSetName(), CHANGE_PASSWORD_GROUP_SET_NAME)) {
            return;
        }
        dVar.f(fVar, 5, groupChangePasswordModel.getSetName());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39035id;
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

    public /* synthetic */ GroupChangePasswordModel(long j10, String str, SshConfig sshConfig, Boolean bool, Long l10, int i10, k kVar) {
        this(j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : sshConfig, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : l10);
    }

    public GroupChangePasswordModel(long j10, String str, SshConfig sshConfig, Boolean bool, Long l10) {
        super(null);
        this.f39035id = j10;
        this.label = str;
        this.sshConfig = sshConfig;
        this.isShared = bool;
        this.encryptedWith = l10;
        this.setName = CHANGE_PASSWORD_GROUP_SET_NAME;
    }
}
