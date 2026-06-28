package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.ui.sessionlogs.data.PersonalVaultLogsSettingApiPayload;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class UpdatePersonalVaultApiResponse {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final PersonalVaultLogsSettingApiPayload sessionLogsSetting;

    public static final class b {
        private b() {
        }

        public final c serializer() {
            return a.f41409a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdatePersonalVaultApiResponse() {
        this((PersonalVaultLogsSettingApiPayload) null, 1, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ UpdatePersonalVaultApiResponse copy$default(UpdatePersonalVaultApiResponse updatePersonalVaultApiResponse, PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            personalVaultLogsSettingApiPayload = updatePersonalVaultApiResponse.sessionLogsSetting;
        }
        return updatePersonalVaultApiResponse.copy(personalVaultLogsSettingApiPayload);
    }

    @o("session_logs_settings")
    public static /* synthetic */ void getSessionLogsSetting$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UpdatePersonalVaultApiResponse updatePersonalVaultApiResponse, d dVar, f fVar) {
        if (!dVar.E(fVar, 0) && updatePersonalVaultApiResponse.sessionLogsSetting == null) {
            return;
        }
        dVar.v(fVar, 0, PersonalVaultLogsSettingApiPayload.a.f40380a, updatePersonalVaultApiResponse.sessionLogsSetting);
    }

    public final PersonalVaultLogsSettingApiPayload component1() {
        return this.sessionLogsSetting;
    }

    public final UpdatePersonalVaultApiResponse copy(PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload) {
        return new UpdatePersonalVaultApiResponse(personalVaultLogsSettingApiPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdatePersonalVaultApiResponse) && t.b(this.sessionLogsSetting, ((UpdatePersonalVaultApiResponse) obj).sessionLogsSetting);
    }

    public final PersonalVaultLogsSettingApiPayload getSessionLogsSetting() {
        return this.sessionLogsSetting;
    }

    public int hashCode() {
        PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload = this.sessionLogsSetting;
        if (personalVaultLogsSettingApiPayload == null) {
            return 0;
        }
        return personalVaultLogsSettingApiPayload.hashCode();
    }

    public String toString() {
        return "UpdatePersonalVaultApiResponse(sessionLogsSetting=" + this.sessionLogsSetting + ")";
    }

    public /* synthetic */ UpdatePersonalVaultApiResponse(int i10, PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.sessionLogsSetting = null;
        } else {
            this.sessionLogsSetting = personalVaultLogsSettingApiPayload;
        }
    }

    public UpdatePersonalVaultApiResponse(PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload) {
        this.sessionLogsSetting = personalVaultLogsSettingApiPayload;
    }

    public /* synthetic */ UpdatePersonalVaultApiResponse(PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : personalVaultLogsSettingApiPayload);
    }
}
