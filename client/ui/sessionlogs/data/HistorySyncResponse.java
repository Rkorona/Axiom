package com.server.auditor.ssh.client.ui.sessionlogs.data;

import com.server.auditor.ssh.client.synchronization.api.models.history.HostInteractionModel;
import com.server.auditor.ssh.client.synchronization.api.models.history.HostInteractionModel$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.history.ResponseHistoryConnectionModel;
import com.server.auditor.ssh.client.synchronization.api.models.history.ResponseHistoryConnectionModel$$serializer;
import com.server.auditor.ssh.client.ui.sessionlogs.data.HistoryDeviceInfo;
import com.server.auditor.ssh.client.ui.sessionlogs.data.HistorySyncResponse;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogItemApiModel;
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
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HistorySyncResponse {
    private static final n[] $childSerializers;
    private final List<Long> deleteHistoryConnectionIds;
    private final List<Long> deletedSessionLogIds;
    private final List<HistoryDeviceInfo> devicesInfo;
    private final List<ResponseHistoryConnectionModel> historyConnections;
    private final List<HostInteractionModel> hostInteractions;
    private final String revision;
    private final List<SessionLogItemApiModel> sessionLogs;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40377b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40376a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.HistorySyncResponse", aVar, 7);
            i2Var.r("log_set", false);
            i2Var.r("deleted_log_set", false);
            i2Var.r("device_set", false);
            i2Var.r("revision", true);
            i2Var.r("hostinteraction_set", false);
            i2Var.r("historyconnection_set", false);
            i2Var.r("deleted_historyconnection_set", false);
            descriptor = i2Var;
            f40377b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HistorySyncResponse deserialize(e eVar) {
            int i10;
            List list;
            List list2;
            List list3;
            List list4;
            List list5;
            String str;
            List list6;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = HistorySyncResponse.$childSerializers;
            int i11 = 3;
            int i12 = 2;
            List list7 = null;
            if (cVarD.l()) {
                List list8 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                List list9 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                List list10 = (List) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), null);
                String str2 = (String) cVarD.v(fVar, 3, x2.f64817a, null);
                List list11 = (List) cVarD.i(fVar, 4, (hv.b) nVarArr[4].getValue(), null);
                List list12 = (List) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), null);
                list = (List) cVarD.i(fVar, 6, (hv.b) nVarArr[6].getValue(), null);
                list3 = list8;
                str = str2;
                i10 = 127;
                list2 = list12;
                list6 = list11;
                list5 = list10;
                list4 = list9;
            } else {
                int i13 = 1;
                boolean z10 = true;
                int i14 = 0;
                List list13 = null;
                List list14 = null;
                List list15 = null;
                List list16 = null;
                String str3 = null;
                List list17 = null;
                while (z10) {
                    int i15 = i12;
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z10 = false;
                            i11 = 3;
                            i12 = 2;
                            i13 = 1;
                            break;
                        case 0:
                            list7 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list7);
                            i14 |= 1;
                            i11 = 3;
                            i12 = 2;
                            i13 = 1;
                            break;
                        case 1:
                            list15 = (List) cVarD.i(fVar, i13, (hv.b) nVarArr[i13].getValue(), list15);
                            i14 |= 2;
                            i11 = 3;
                            i12 = 2;
                            break;
                        case 2:
                            list16 = (List) cVarD.i(fVar, i15, (hv.b) nVarArr[i15].getValue(), list16);
                            i14 |= 4;
                            i12 = i15;
                            i11 = 3;
                            break;
                        case 3:
                            str3 = (String) cVarD.v(fVar, i11, x2.f64817a, str3);
                            i14 |= 8;
                            i12 = i15;
                            break;
                        case 4:
                            list17 = (List) cVarD.i(fVar, 4, (hv.b) nVarArr[4].getValue(), list17);
                            i14 |= 16;
                            i12 = i15;
                            break;
                        case 5:
                            list14 = (List) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), list14);
                            i14 |= 32;
                            i12 = i15;
                            break;
                        case 6:
                            list13 = (List) cVarD.i(fVar, 6, (hv.b) nVarArr[6].getValue(), list13);
                            i14 |= 64;
                            i12 = i15;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                i10 = i14;
                list = list13;
                list2 = list14;
                list3 = list7;
                list4 = list15;
                list5 = list16;
                str = str3;
                list6 = list17;
            }
            cVarD.b(fVar);
            return new HistorySyncResponse(i10, list3, list4, list5, str, list6, list2, list, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, HistorySyncResponse historySyncResponse) {
            t.f(fVar, "encoder");
            t.f(historySyncResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            HistorySyncResponse.write$Self$Termius_app_googleProductionRelease(historySyncResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = HistorySyncResponse.$childSerializers;
            return new hv.c[]{nVarArr[0].getValue(), nVarArr[1].getValue(), nVarArr[2].getValue(), iv.a.u(x2.f64817a), nVarArr[4].getValue(), nVarArr[5].getValue(), nVarArr[6].getValue()};
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
            return a.f40376a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new iu.a() { // from class: so.e
            @Override // iu.a
            public final Object a() {
                return HistorySyncResponse._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: so.f
            @Override // iu.a
            public final Object a() {
                return HistorySyncResponse._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new iu.a() { // from class: so.g
            @Override // iu.a
            public final Object a() {
                return HistorySyncResponse._childSerializers$_anonymous_$1();
            }
        }), null, o.b(rVar, new iu.a() { // from class: so.h
            @Override // iu.a
            public final Object a() {
                return HistorySyncResponse._childSerializers$_anonymous_$2();
            }
        }), o.b(rVar, new iu.a() { // from class: so.i
            @Override // iu.a
            public final Object a() {
                return HistorySyncResponse._childSerializers$_anonymous_$3();
            }
        }), o.b(rVar, new iu.a() { // from class: so.j
            @Override // iu.a
            public final Object a() {
                return HistorySyncResponse._childSerializers$_anonymous_$4();
            }
        })};
    }

    public /* synthetic */ HistorySyncResponse(int i10, List list, List list2, List list3, String str, List list4, List list5, List list6, s2 s2Var) {
        if (119 != (i10 & 119)) {
            d2.a(i10, 119, a.f40376a.getDescriptor());
        }
        this.sessionLogs = list;
        this.deletedSessionLogIds = list2;
        this.devicesInfo = list3;
        if ((i10 & 8) == 0) {
            this.revision = null;
        } else {
            this.revision = str;
        }
        this.hostInteractions = list4;
        this.historyConnections = list5;
        this.deleteHistoryConnectionIds = list6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(SessionLogItemApiModel.a.f40393a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
        return new lv.f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$1() {
        return new lv.f(HistoryDeviceInfo.a.f40374a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$2() {
        return new lv.f(HostInteractionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$3() {
        return new lv.f(ResponseHistoryConnectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$4() {
        return new lv.f(h1.f64699a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistorySyncResponse copy$default(HistorySyncResponse historySyncResponse, List list, List list2, List list3, String str, List list4, List list5, List list6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = historySyncResponse.sessionLogs;
        }
        if ((i10 & 2) != 0) {
            list2 = historySyncResponse.deletedSessionLogIds;
        }
        if ((i10 & 4) != 0) {
            list3 = historySyncResponse.devicesInfo;
        }
        if ((i10 & 8) != 0) {
            str = historySyncResponse.revision;
        }
        if ((i10 & 16) != 0) {
            list4 = historySyncResponse.hostInteractions;
        }
        if ((i10 & 32) != 0) {
            list5 = historySyncResponse.historyConnections;
        }
        if ((i10 & 64) != 0) {
            list6 = historySyncResponse.deleteHistoryConnectionIds;
        }
        List list7 = list5;
        List list8 = list6;
        List list9 = list4;
        List list10 = list3;
        return historySyncResponse.copy(list, list2, list10, str, list9, list7, list8);
    }

    @hv.o("deleted_historyconnection_set")
    public static /* synthetic */ void getDeleteHistoryConnectionIds$annotations() {
    }

    @hv.o("deleted_log_set")
    public static /* synthetic */ void getDeletedSessionLogIds$annotations() {
    }

    @hv.o("device_set")
    public static /* synthetic */ void getDevicesInfo$annotations() {
    }

    @hv.o("historyconnection_set")
    public static /* synthetic */ void getHistoryConnections$annotations() {
    }

    @hv.o("hostinteraction_set")
    public static /* synthetic */ void getHostInteractions$annotations() {
    }

    @hv.o("revision")
    public static /* synthetic */ void getRevision$annotations() {
    }

    @hv.o("log_set")
    public static /* synthetic */ void getSessionLogs$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HistorySyncResponse historySyncResponse, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), historySyncResponse.sessionLogs);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), historySyncResponse.deletedSessionLogIds);
        dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), historySyncResponse.devicesInfo);
        if (dVar.E(fVar, 3) || historySyncResponse.revision != null) {
            dVar.v(fVar, 3, x2.f64817a, historySyncResponse.revision);
        }
        dVar.o(fVar, 4, (hv.r) nVarArr[4].getValue(), historySyncResponse.hostInteractions);
        dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), historySyncResponse.historyConnections);
        dVar.o(fVar, 6, (hv.r) nVarArr[6].getValue(), historySyncResponse.deleteHistoryConnectionIds);
    }

    public final List<SessionLogItemApiModel> component1() {
        return this.sessionLogs;
    }

    public final List<Long> component2() {
        return this.deletedSessionLogIds;
    }

    public final List<HistoryDeviceInfo> component3() {
        return this.devicesInfo;
    }

    public final String component4() {
        return this.revision;
    }

    public final List<HostInteractionModel> component5() {
        return this.hostInteractions;
    }

    public final List<ResponseHistoryConnectionModel> component6() {
        return this.historyConnections;
    }

    public final List<Long> component7() {
        return this.deleteHistoryConnectionIds;
    }

    public final HistorySyncResponse copy(List<SessionLogItemApiModel> list, List<Long> list2, List<HistoryDeviceInfo> list3, String str, List<HostInteractionModel> list4, List<ResponseHistoryConnectionModel> list5, List<Long> list6) {
        t.f(list, "sessionLogs");
        t.f(list2, "deletedSessionLogIds");
        t.f(list3, "devicesInfo");
        t.f(list4, "hostInteractions");
        t.f(list5, "historyConnections");
        t.f(list6, "deleteHistoryConnectionIds");
        return new HistorySyncResponse(list, list2, list3, str, list4, list5, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistorySyncResponse)) {
            return false;
        }
        HistorySyncResponse historySyncResponse = (HistorySyncResponse) obj;
        return t.b(this.sessionLogs, historySyncResponse.sessionLogs) && t.b(this.deletedSessionLogIds, historySyncResponse.deletedSessionLogIds) && t.b(this.devicesInfo, historySyncResponse.devicesInfo) && t.b(this.revision, historySyncResponse.revision) && t.b(this.hostInteractions, historySyncResponse.hostInteractions) && t.b(this.historyConnections, historySyncResponse.historyConnections) && t.b(this.deleteHistoryConnectionIds, historySyncResponse.deleteHistoryConnectionIds);
    }

    public final List<Long> getDeleteHistoryConnectionIds() {
        return this.deleteHistoryConnectionIds;
    }

    public final List<Long> getDeletedSessionLogIds() {
        return this.deletedSessionLogIds;
    }

    public final List<HistoryDeviceInfo> getDevicesInfo() {
        return this.devicesInfo;
    }

    public final List<ResponseHistoryConnectionModel> getHistoryConnections() {
        return this.historyConnections;
    }

    public final List<HostInteractionModel> getHostInteractions() {
        return this.hostInteractions;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final List<SessionLogItemApiModel> getSessionLogs() {
        return this.sessionLogs;
    }

    public int hashCode() {
        int iHashCode = ((((this.sessionLogs.hashCode() * 31) + this.deletedSessionLogIds.hashCode()) * 31) + this.devicesInfo.hashCode()) * 31;
        String str = this.revision;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.hostInteractions.hashCode()) * 31) + this.historyConnections.hashCode()) * 31) + this.deleteHistoryConnectionIds.hashCode();
    }

    public String toString() {
        return "HistorySyncResponse(sessionLogs=" + this.sessionLogs + ", deletedSessionLogIds=" + this.deletedSessionLogIds + ", devicesInfo=" + this.devicesInfo + ", revision=" + this.revision + ", hostInteractions=" + this.hostInteractions + ", historyConnections=" + this.historyConnections + ", deleteHistoryConnectionIds=" + this.deleteHistoryConnectionIds + ")";
    }

    public HistorySyncResponse(List<SessionLogItemApiModel> list, List<Long> list2, List<HistoryDeviceInfo> list3, String str, List<HostInteractionModel> list4, List<ResponseHistoryConnectionModel> list5, List<Long> list6) {
        t.f(list, "sessionLogs");
        t.f(list2, "deletedSessionLogIds");
        t.f(list3, "devicesInfo");
        t.f(list4, "hostInteractions");
        t.f(list5, "historyConnections");
        t.f(list6, "deleteHistoryConnectionIds");
        this.sessionLogs = list;
        this.deletedSessionLogIds = list2;
        this.devicesInfo = list3;
        this.revision = str;
        this.hostInteractions = list4;
        this.historyConnections = list5;
        this.deleteHistoryConnectionIds = list6;
    }

    public /* synthetic */ HistorySyncResponse(List list, List list2, List list3, String str, List list4, List list5, List list6, int i10, k kVar) {
        this(list, list2, list3, (i10 & 8) != 0 ? null : str, list4, list5, list6);
    }
}
