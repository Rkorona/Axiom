package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.ui.sessionlogs.data.PersonalVaultLogsSettingApiPayload;
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
public final class UpdatePersonalVaultApiRequest {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final PersonalVaultLogsSettingApiPayload sessionLogsSetting;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41408b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f41407a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.vaults.data.UpdatePersonalVaultApiRequest", aVar, 1);
            i2Var.r("session_logs_settings", false);
            descriptor = i2Var;
            f41408b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdatePersonalVaultApiRequest deserialize(e eVar) {
            PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                personalVaultLogsSettingApiPayload = (PersonalVaultLogsSettingApiPayload) cVarD.i(fVar, 0, PersonalVaultLogsSettingApiPayload.a.f40380a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                personalVaultLogsSettingApiPayload = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        personalVaultLogsSettingApiPayload = (PersonalVaultLogsSettingApiPayload) cVarD.i(fVar, 0, PersonalVaultLogsSettingApiPayload.a.f40380a, personalVaultLogsSettingApiPayload);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new UpdatePersonalVaultApiRequest(i10, personalVaultLogsSettingApiPayload, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, UpdatePersonalVaultApiRequest updatePersonalVaultApiRequest) {
            t.f(fVar, "encoder");
            t.f(updatePersonalVaultApiRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            UpdatePersonalVaultApiRequest.write$Self$Termius_app_googleProductionRelease(updatePersonalVaultApiRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{PersonalVaultLogsSettingApiPayload.a.f40380a};
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
            return a.f41407a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ UpdatePersonalVaultApiRequest(int i10, PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f41407a.getDescriptor());
        }
        this.sessionLogsSetting = personalVaultLogsSettingApiPayload;
    }

    public static /* synthetic */ UpdatePersonalVaultApiRequest copy$default(UpdatePersonalVaultApiRequest updatePersonalVaultApiRequest, PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            personalVaultLogsSettingApiPayload = updatePersonalVaultApiRequest.sessionLogsSetting;
        }
        return updatePersonalVaultApiRequest.copy(personalVaultLogsSettingApiPayload);
    }

    @o("session_logs_settings")
    public static /* synthetic */ void getSessionLogsSetting$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UpdatePersonalVaultApiRequest updatePersonalVaultApiRequest, d dVar, f fVar) {
        dVar.o(fVar, 0, PersonalVaultLogsSettingApiPayload.a.f40380a, updatePersonalVaultApiRequest.sessionLogsSetting);
    }

    public final PersonalVaultLogsSettingApiPayload component1() {
        return this.sessionLogsSetting;
    }

    public final UpdatePersonalVaultApiRequest copy(PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload) {
        t.f(personalVaultLogsSettingApiPayload, "sessionLogsSetting");
        return new UpdatePersonalVaultApiRequest(personalVaultLogsSettingApiPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdatePersonalVaultApiRequest) && t.b(this.sessionLogsSetting, ((UpdatePersonalVaultApiRequest) obj).sessionLogsSetting);
    }

    public final PersonalVaultLogsSettingApiPayload getSessionLogsSetting() {
        return this.sessionLogsSetting;
    }

    public int hashCode() {
        return this.sessionLogsSetting.hashCode();
    }

    public String toString() {
        return "UpdatePersonalVaultApiRequest(sessionLogsSetting=" + this.sessionLogsSetting + ")";
    }

    public UpdatePersonalVaultApiRequest(PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload) {
        t.f(personalVaultLogsSettingApiPayload, "sessionLogsSetting");
        this.sessionLogsSetting = personalVaultLogsSettingApiPayload;
    }
}
