package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel;
import com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel$$serializer;
import com.server.auditor.ssh.client.ui.sessionlogs.data.VaultLogsSettingApiPayload;
import com.server.auditor.ssh.client.ui.vaults.data.UpdateVaultApiResponse;
import com.server.auditor.ssh.client.ui.vaults.data.VaultParticipantApiModel;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
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
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class UpdateVaultApiResponse {
    private static final n[] $childSerializers;
    private final List<VaultParticipantApiModel> participants;
    private final List<VaultLogsSettingApiPayload> sessionLogsSettings;
    private final VaultApiModel updatedVault;
    private final List<VaultApiModel> vaults;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41416b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f41415a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.vaults.data.UpdateVaultApiResponse", aVar, 4);
            i2Var.r("vault", false);
            i2Var.r("vaults", false);
            i2Var.r("participants", false);
            i2Var.r("session_logs_settings", false);
            descriptor = i2Var;
            f41416b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdateVaultApiResponse deserialize(e eVar) {
            int i10;
            VaultApiModel vaultApiModel;
            List list;
            List list2;
            List list3;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = UpdateVaultApiResponse.$childSerializers;
            VaultApiModel vaultApiModel2 = null;
            if (cVarD.l()) {
                VaultApiModel vaultApiModel3 = (VaultApiModel) cVarD.i(fVar, 0, VaultApiModel$$serializer.INSTANCE, null);
                List list4 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                List list5 = (List) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), null);
                list3 = (List) cVarD.i(fVar, 3, (hv.b) nVarArr[3].getValue(), null);
                vaultApiModel = vaultApiModel3;
                i10 = 15;
                list2 = list5;
                list = list4;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list6 = null;
                List list7 = null;
                List list8 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        vaultApiModel2 = (VaultApiModel) cVarD.i(fVar, 0, VaultApiModel$$serializer.INSTANCE, vaultApiModel2);
                        i11 |= 1;
                    } else if (iD == 1) {
                        list6 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list6);
                        i11 |= 2;
                    } else if (iD == 2) {
                        list7 = (List) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), list7);
                        i11 |= 4;
                    } else {
                        if (iD != 3) {
                            throw new e0(iD);
                        }
                        list8 = (List) cVarD.i(fVar, 3, (hv.b) nVarArr[3].getValue(), list8);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                vaultApiModel = vaultApiModel2;
                list = list6;
                list2 = list7;
                list3 = list8;
            }
            cVarD.b(fVar);
            return new UpdateVaultApiResponse(i10, vaultApiModel, list, list2, list3, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, UpdateVaultApiResponse updateVaultApiResponse) {
            t.f(fVar, "encoder");
            t.f(updateVaultApiResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            UpdateVaultApiResponse.write$Self$Termius_app_googleProductionRelease(updateVaultApiResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = UpdateVaultApiResponse.$childSerializers;
            return new hv.c[]{VaultApiModel$$serializer.INSTANCE, nVarArr[1].getValue(), nVarArr[2].getValue(), nVarArr[3].getValue()};
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
            return a.f41415a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{null, o.b(rVar, new iu.a() { // from class: op.e
            @Override // iu.a
            public final Object a() {
                return UpdateVaultApiResponse._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: op.f
            @Override // iu.a
            public final Object a() {
                return UpdateVaultApiResponse._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new iu.a() { // from class: op.g
            @Override // iu.a
            public final Object a() {
                return UpdateVaultApiResponse._childSerializers$_anonymous_$1();
            }
        })};
    }

    public /* synthetic */ UpdateVaultApiResponse(int i10, VaultApiModel vaultApiModel, List list, List list2, List list3, s2 s2Var) {
        if (15 != (i10 & 15)) {
            d2.a(i10, 15, a.f41415a.getDescriptor());
        }
        this.updatedVault = vaultApiModel;
        this.vaults = list;
        this.participants = list2;
        this.sessionLogsSettings = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(VaultApiModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
        return new lv.f(VaultParticipantApiModel.a.f41424a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$1() {
        return new lv.f(VaultLogsSettingApiPayload.a.f40403a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateVaultApiResponse copy$default(UpdateVaultApiResponse updateVaultApiResponse, VaultApiModel vaultApiModel, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vaultApiModel = updateVaultApiResponse.updatedVault;
        }
        if ((i10 & 2) != 0) {
            list = updateVaultApiResponse.vaults;
        }
        if ((i10 & 4) != 0) {
            list2 = updateVaultApiResponse.participants;
        }
        if ((i10 & 8) != 0) {
            list3 = updateVaultApiResponse.sessionLogsSettings;
        }
        return updateVaultApiResponse.copy(vaultApiModel, list, list2, list3);
    }

    @hv.o("participants")
    public static /* synthetic */ void getParticipants$annotations() {
    }

    @hv.o("session_logs_settings")
    public static /* synthetic */ void getSessionLogsSettings$annotations() {
    }

    @hv.o("vault")
    public static /* synthetic */ void getUpdatedVault$annotations() {
    }

    @hv.o("vaults")
    public static /* synthetic */ void getVaults$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UpdateVaultApiResponse updateVaultApiResponse, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, VaultApiModel$$serializer.INSTANCE, updateVaultApiResponse.updatedVault);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), updateVaultApiResponse.vaults);
        dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), updateVaultApiResponse.participants);
        dVar.o(fVar, 3, (hv.r) nVarArr[3].getValue(), updateVaultApiResponse.sessionLogsSettings);
    }

    public final VaultApiModel component1() {
        return this.updatedVault;
    }

    public final List<VaultApiModel> component2() {
        return this.vaults;
    }

    public final List<VaultParticipantApiModel> component3() {
        return this.participants;
    }

    public final List<VaultLogsSettingApiPayload> component4() {
        return this.sessionLogsSettings;
    }

    public final UpdateVaultApiResponse copy(VaultApiModel vaultApiModel, List<VaultApiModel> list, List<VaultParticipantApiModel> list2, List<VaultLogsSettingApiPayload> list3) {
        t.f(vaultApiModel, "updatedVault");
        t.f(list, "vaults");
        t.f(list2, "participants");
        t.f(list3, "sessionLogsSettings");
        return new UpdateVaultApiResponse(vaultApiModel, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateVaultApiResponse)) {
            return false;
        }
        UpdateVaultApiResponse updateVaultApiResponse = (UpdateVaultApiResponse) obj;
        return t.b(this.updatedVault, updateVaultApiResponse.updatedVault) && t.b(this.vaults, updateVaultApiResponse.vaults) && t.b(this.participants, updateVaultApiResponse.participants) && t.b(this.sessionLogsSettings, updateVaultApiResponse.sessionLogsSettings);
    }

    public final List<VaultParticipantApiModel> getParticipants() {
        return this.participants;
    }

    public final List<VaultLogsSettingApiPayload> getSessionLogsSettings() {
        return this.sessionLogsSettings;
    }

    public final VaultApiModel getUpdatedVault() {
        return this.updatedVault;
    }

    public final List<VaultApiModel> getVaults() {
        return this.vaults;
    }

    public int hashCode() {
        return (((((this.updatedVault.hashCode() * 31) + this.vaults.hashCode()) * 31) + this.participants.hashCode()) * 31) + this.sessionLogsSettings.hashCode();
    }

    public String toString() {
        return "UpdateVaultApiResponse(updatedVault=" + this.updatedVault + ", vaults=" + this.vaults + ", participants=" + this.participants + ", sessionLogsSettings=" + this.sessionLogsSettings + ")";
    }

    public UpdateVaultApiResponse(VaultApiModel vaultApiModel, List<VaultApiModel> list, List<VaultParticipantApiModel> list2, List<VaultLogsSettingApiPayload> list3) {
        t.f(vaultApiModel, "updatedVault");
        t.f(list, "vaults");
        t.f(list2, "participants");
        t.f(list3, "sessionLogsSettings");
        this.updatedVault = vaultApiModel;
        this.vaults = list;
        this.participants = list2;
        this.sessionLogsSettings = list3;
    }
}
