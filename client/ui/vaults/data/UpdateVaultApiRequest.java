package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.ui.sessionlogs.data.VaultLogsSettingApiPayload;
import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class UpdateVaultApiRequest {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final VaultLogsSettingApiPayload sessionLogsSetting;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41412b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f41411a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.vaults.data.UpdateVaultApiRequest", aVar, 1);
            i2Var.r("session_logs_settings", false);
            descriptor = i2Var;
            f41412b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdateVaultApiRequest deserialize(e eVar) {
            VaultLogsSettingApiPayload vaultLogsSettingApiPayload;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                vaultLogsSettingApiPayload = (VaultLogsSettingApiPayload) cVarD.i(fVar, 0, VaultLogsSettingApiPayload.a.f40403a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                vaultLogsSettingApiPayload = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        vaultLogsSettingApiPayload = (VaultLogsSettingApiPayload) cVarD.i(fVar, 0, VaultLogsSettingApiPayload.a.f40403a, vaultLogsSettingApiPayload);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new UpdateVaultApiRequest(i10, vaultLogsSettingApiPayload, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, UpdateVaultApiRequest updateVaultApiRequest) {
            t.f(fVar, "encoder");
            t.f(updateVaultApiRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            UpdateVaultApiRequest.write$Self$Termius_app_googleProductionRelease(updateVaultApiRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{VaultLogsSettingApiPayload.a.f40403a};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f41411a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ UpdateVaultApiRequest(int i10, VaultLogsSettingApiPayload vaultLogsSettingApiPayload, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f41411a.getDescriptor());
        }
        this.sessionLogsSetting = vaultLogsSettingApiPayload;
    }

    public static /* synthetic */ UpdateVaultApiRequest copy$default(UpdateVaultApiRequest updateVaultApiRequest, VaultLogsSettingApiPayload vaultLogsSettingApiPayload, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vaultLogsSettingApiPayload = updateVaultApiRequest.sessionLogsSetting;
        }
        return updateVaultApiRequest.copy(vaultLogsSettingApiPayload);
    }

    @o("session_logs_settings")
    public static /* synthetic */ void getSessionLogsSetting$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UpdateVaultApiRequest updateVaultApiRequest, d dVar, f fVar) {
        dVar.o(fVar, 0, VaultLogsSettingApiPayload.a.f40403a, updateVaultApiRequest.sessionLogsSetting);
    }

    public final VaultLogsSettingApiPayload component1() {
        return this.sessionLogsSetting;
    }

    public final UpdateVaultApiRequest copy(VaultLogsSettingApiPayload vaultLogsSettingApiPayload) {
        t.f(vaultLogsSettingApiPayload, "sessionLogsSetting");
        return new UpdateVaultApiRequest(vaultLogsSettingApiPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateVaultApiRequest) && t.b(this.sessionLogsSetting, ((UpdateVaultApiRequest) obj).sessionLogsSetting);
    }

    public final VaultLogsSettingApiPayload getSessionLogsSetting() {
        return this.sessionLogsSetting;
    }

    public int hashCode() {
        return this.sessionLogsSetting.hashCode();
    }

    public String toString() {
        return "UpdateVaultApiRequest(sessionLogsSetting=" + this.sessionLogsSetting + ")";
    }

    public UpdateVaultApiRequest(VaultLogsSettingApiPayload vaultLogsSettingApiPayload) {
        t.f(vaultLogsSettingApiPayload, "sessionLogsSetting");
        this.sessionLogsSetting = vaultLogsSettingApiPayload;
    }
}
