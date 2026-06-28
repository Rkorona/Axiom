package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host.HostContentKt;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.h1;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HostChangePasswordModel extends EntityChangePasswordModel implements Shareable {
    public static final String CHANGE_PASSWORD_HOST_SET_NAME = "host_set";

    @gg.a
    public String address;
    private final String backspaceType;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39036id;
    private final String interactionDate;
    private boolean isShared;

    @gg.a
    public String label;
    private final String osName;
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
            return HostChangePasswordModel$$serializer.INSTANCE;
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
                return HostChangePasswordModel$SshConfig$$serializer.INSTANCE;
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
    public /* synthetic */ HostChangePasswordModel(int i10, long j10, String str, Long l10, String str2, String str3, String str4, String str5, SshConfig sshConfig, String str6, boolean z10, s2 s2Var) {
        super(null);
        if (865 != (i10 & 865)) {
            d2.a(i10, 865, HostChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f39036id = j10;
        if ((i10 & 2) == 0) {
            this.setName = CHANGE_PASSWORD_HOST_SET_NAME;
        } else {
            this.setName = str;
        }
        if ((i10 & 4) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
        if ((i10 & 8) == 0) {
            this.address = null;
        } else {
            this.address = str2;
        }
        if ((i10 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        this.osName = str4;
        this.interactionDate = str5;
        if ((i10 & 128) == 0) {
            this.sshConfig = null;
        } else {
            this.sshConfig = sshConfig;
        }
        this.backspaceType = str6;
        this.isShared = z10;
    }

    @o(Column.ADDRESS)
    public static /* synthetic */ void getAddress$annotations() {
    }

    @o("backspace")
    private static /* synthetic */ void getBackspaceType$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(Column.INTERACTION_DATE)
    private static /* synthetic */ void getInteractionDate$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o("os_name")
    private static /* synthetic */ void getOsName$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HostChangePasswordModel hostChangePasswordModel, d dVar, f fVar) {
        dVar.q(fVar, 0, hostChangePasswordModel.getId());
        if (dVar.E(fVar, 1) || !t.b(hostChangePasswordModel.getSetName(), CHANGE_PASSWORD_HOST_SET_NAME)) {
            dVar.f(fVar, 1, hostChangePasswordModel.getSetName());
        }
        if (dVar.E(fVar, 2) || hostChangePasswordModel.getEncryptedWith() != null) {
            dVar.v(fVar, 2, h1.f64699a, hostChangePasswordModel.getEncryptedWith());
        }
        if (dVar.E(fVar, 3) || hostChangePasswordModel.address != null) {
            dVar.v(fVar, 3, x2.f64817a, hostChangePasswordModel.address);
        }
        if (dVar.E(fVar, 4) || hostChangePasswordModel.label != null) {
            dVar.v(fVar, 4, x2.f64817a, hostChangePasswordModel.label);
        }
        x2 x2Var = x2.f64817a;
        dVar.v(fVar, 5, x2Var, hostChangePasswordModel.osName);
        dVar.v(fVar, 6, x2Var, hostChangePasswordModel.interactionDate);
        if (dVar.E(fVar, 7) || hostChangePasswordModel.sshConfig != null) {
            dVar.v(fVar, 7, HostChangePasswordModel$SshConfig$$serializer.INSTANCE, hostChangePasswordModel.sshConfig);
        }
        dVar.v(fVar, 8, x2Var, hostChangePasswordModel.backspaceType);
        dVar.u(fVar, 9, hostChangePasswordModel.isShared);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public long getId() {
        return this.f39036id;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel
    public String getSetName() {
        return this.setName;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return Boolean.valueOf(this.isShared);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = false;
        setEncryptedWith(null);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public HostChangePasswordModel(String str, String str2, String str3, long j10, String str4, Boolean bool, SshConfig sshConfig, boolean z10, Long l10) {
        String str5;
        super(null);
        this.setName = CHANGE_PASSWORD_HOST_SET_NAME;
        this.address = str;
        this.label = str2;
        this.osName = str3;
        this.f39036id = j10;
        this.interactionDate = str4;
        if (t.b(bool, Boolean.TRUE)) {
            str5 = HostContentKt.BACKSPACE_TYPE_LEGACY;
        } else {
            str5 = HostContentKt.BACKSPACE_TYPE_DEFAULT;
        }
        this.backspaceType = str5;
        this.sshConfig = sshConfig;
        this.isShared = z10;
        setEncryptedWith(l10);
    }
}
