package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel;
import com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel$$serializer;
import com.server.auditor.ssh.client.ui.sessionlogs.data.VaultLogsSettingApiPayload;
import com.server.auditor.ssh.client.ui.vaults.data.RequestVaultsApiResponse;
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
public final class RequestVaultsApiResponse {
    private static final n[] $childSerializers;
    private final List<VaultParticipantApiModel> participants;
    private final List<VaultLogsSettingApiPayload> sessionLogsSettings;
    private final List<VaultApiModel> vaults;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41406b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f41405a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.vaults.data.RequestVaultsApiResponse", aVar, 3);
            i2Var.r("vaults", false);
            i2Var.r("participants", false);
            i2Var.r("session_logs_settings", false);
            descriptor = i2Var;
            f41406b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RequestVaultsApiResponse deserialize(e eVar) {
            int i10;
            List list;
            List list2;
            List list3;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = RequestVaultsApiResponse.$childSerializers;
            List list4 = null;
            if (cVarD.l()) {
                List list5 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                List list6 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                list3 = (List) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), null);
                list = list5;
                i10 = 7;
                list2 = list6;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list7 = null;
                List list8 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        list4 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list4);
                        i11 |= 1;
                    } else if (iD == 1) {
                        list7 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list7);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        list8 = (List) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), list8);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                list = list4;
                list2 = list7;
                list3 = list8;
            }
            cVarD.b(fVar);
            return new RequestVaultsApiResponse(i10, list, list2, list3, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, RequestVaultsApiResponse requestVaultsApiResponse) {
            t.f(fVar, "encoder");
            t.f(requestVaultsApiResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            RequestVaultsApiResponse.write$Self$Termius_app_googleProductionRelease(requestVaultsApiResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = RequestVaultsApiResponse.$childSerializers;
            return new hv.c[]{nVarArr[0].getValue(), nVarArr[1].getValue(), nVarArr[2].getValue()};
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
            return a.f41405a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new iu.a() { // from class: op.b
            @Override // iu.a
            public final Object a() {
                return RequestVaultsApiResponse._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: op.c
            @Override // iu.a
            public final Object a() {
                return RequestVaultsApiResponse._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new iu.a() { // from class: op.d
            @Override // iu.a
            public final Object a() {
                return RequestVaultsApiResponse._childSerializers$_anonymous_$1();
            }
        })};
    }

    public /* synthetic */ RequestVaultsApiResponse(int i10, List list, List list2, List list3, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, a.f41405a.getDescriptor());
        }
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
    public static /* synthetic */ RequestVaultsApiResponse copy$default(RequestVaultsApiResponse requestVaultsApiResponse, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = requestVaultsApiResponse.vaults;
        }
        if ((i10 & 2) != 0) {
            list2 = requestVaultsApiResponse.participants;
        }
        if ((i10 & 4) != 0) {
            list3 = requestVaultsApiResponse.sessionLogsSettings;
        }
        return requestVaultsApiResponse.copy(list, list2, list3);
    }

    @hv.o("participants")
    public static /* synthetic */ void getParticipants$annotations() {
    }

    @hv.o("session_logs_settings")
    public static /* synthetic */ void getSessionLogsSettings$annotations() {
    }

    @hv.o("vaults")
    public static /* synthetic */ void getVaults$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RequestVaultsApiResponse requestVaultsApiResponse, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), requestVaultsApiResponse.vaults);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), requestVaultsApiResponse.participants);
        dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), requestVaultsApiResponse.sessionLogsSettings);
    }

    public final List<VaultApiModel> component1() {
        return this.vaults;
    }

    public final List<VaultParticipantApiModel> component2() {
        return this.participants;
    }

    public final List<VaultLogsSettingApiPayload> component3() {
        return this.sessionLogsSettings;
    }

    public final RequestVaultsApiResponse copy(List<VaultApiModel> list, List<VaultParticipantApiModel> list2, List<VaultLogsSettingApiPayload> list3) {
        t.f(list, "vaults");
        t.f(list2, "participants");
        t.f(list3, "sessionLogsSettings");
        return new RequestVaultsApiResponse(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestVaultsApiResponse)) {
            return false;
        }
        RequestVaultsApiResponse requestVaultsApiResponse = (RequestVaultsApiResponse) obj;
        return t.b(this.vaults, requestVaultsApiResponse.vaults) && t.b(this.participants, requestVaultsApiResponse.participants) && t.b(this.sessionLogsSettings, requestVaultsApiResponse.sessionLogsSettings);
    }

    public final List<VaultParticipantApiModel> getParticipants() {
        return this.participants;
    }

    public final List<VaultLogsSettingApiPayload> getSessionLogsSettings() {
        return this.sessionLogsSettings;
    }

    public final List<VaultApiModel> getVaults() {
        return this.vaults;
    }

    public int hashCode() {
        return (((this.vaults.hashCode() * 31) + this.participants.hashCode()) * 31) + this.sessionLogsSettings.hashCode();
    }

    public String toString() {
        return "RequestVaultsApiResponse(vaults=" + this.vaults + ", participants=" + this.participants + ", sessionLogsSettings=" + this.sessionLogsSettings + ")";
    }

    public RequestVaultsApiResponse(List<VaultApiModel> list, List<VaultParticipantApiModel> list2, List<VaultLogsSettingApiPayload> list3) {
        t.f(list, "vaults");
        t.f(list2, "participants");
        t.f(list3, "sessionLogsSettings");
        this.vaults = list;
        this.participants = list2;
        this.sessionLogsSettings = list3;
    }
}
