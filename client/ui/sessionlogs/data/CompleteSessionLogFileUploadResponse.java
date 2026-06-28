package com.server.auditor.ssh.client.ui.sessionlogs.data;

import com.server.auditor.ssh.client.ui.sessionlogs.data.CompleteSessionLogFileUploadResponse;
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
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CompleteSessionLogFileUploadResponse {
    private final List<Long> deletedSessionLogs;
    private final SessionLogItemApiModel uploadedSessionLog;
    public static final b Companion = new b(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, o.b(r.f82638b, new iu.a() { // from class: so.b
        @Override // iu.a
        public final Object a() {
            return CompleteSessionLogFileUploadResponse._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40369b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40368a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.CompleteSessionLogFileUploadResponse", aVar, 2);
            i2Var.r("completed_log", true);
            i2Var.r("deleted_logs", false);
            descriptor = i2Var;
            f40369b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompleteSessionLogFileUploadResponse deserialize(e eVar) {
            List list;
            SessionLogItemApiModel sessionLogItemApiModel;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = CompleteSessionLogFileUploadResponse.$childSerializers;
            s2 s2Var = null;
            if (cVarD.l()) {
                sessionLogItemApiModel = (SessionLogItemApiModel) cVarD.v(fVar, 0, SessionLogItemApiModel.a.f40393a, null);
                list = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                SessionLogItemApiModel sessionLogItemApiModel2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        sessionLogItemApiModel2 = (SessionLogItemApiModel) cVarD.v(fVar, 0, SessionLogItemApiModel.a.f40393a, sessionLogItemApiModel2);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list2);
                        i11 |= 2;
                    }
                }
                list = list2;
                sessionLogItemApiModel = sessionLogItemApiModel2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new CompleteSessionLogFileUploadResponse(i10, sessionLogItemApiModel, list, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, CompleteSessionLogFileUploadResponse completeSessionLogFileUploadResponse) {
            t.f(fVar, "encoder");
            t.f(completeSessionLogFileUploadResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            CompleteSessionLogFileUploadResponse.write$Self$Termius_app_googleProductionRelease(completeSessionLogFileUploadResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{iv.a.u(SessionLogItemApiModel.a.f40393a), CompleteSessionLogFileUploadResponse.$childSerializers[1].getValue()};
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
            return a.f40368a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ CompleteSessionLogFileUploadResponse(int i10, SessionLogItemApiModel sessionLogItemApiModel, List list, s2 s2Var) {
        if (2 != (i10 & 2)) {
            d2.a(i10, 2, a.f40368a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.uploadedSessionLog = null;
        } else {
            this.uploadedSessionLog = sessionLogItemApiModel;
        }
        this.deletedSessionLogs = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(h1.f64699a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompleteSessionLogFileUploadResponse copy$default(CompleteSessionLogFileUploadResponse completeSessionLogFileUploadResponse, SessionLogItemApiModel sessionLogItemApiModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sessionLogItemApiModel = completeSessionLogFileUploadResponse.uploadedSessionLog;
        }
        if ((i10 & 2) != 0) {
            list = completeSessionLogFileUploadResponse.deletedSessionLogs;
        }
        return completeSessionLogFileUploadResponse.copy(sessionLogItemApiModel, list);
    }

    @hv.o("deleted_logs")
    public static /* synthetic */ void getDeletedSessionLogs$annotations() {
    }

    @hv.o("completed_log")
    public static /* synthetic */ void getUploadedSessionLog$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CompleteSessionLogFileUploadResponse completeSessionLogFileUploadResponse, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || completeSessionLogFileUploadResponse.uploadedSessionLog != null) {
            dVar.v(fVar, 0, SessionLogItemApiModel.a.f40393a, completeSessionLogFileUploadResponse.uploadedSessionLog);
        }
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), completeSessionLogFileUploadResponse.deletedSessionLogs);
    }

    public final SessionLogItemApiModel component1() {
        return this.uploadedSessionLog;
    }

    public final List<Long> component2() {
        return this.deletedSessionLogs;
    }

    public final CompleteSessionLogFileUploadResponse copy(SessionLogItemApiModel sessionLogItemApiModel, List<Long> list) {
        t.f(list, "deletedSessionLogs");
        return new CompleteSessionLogFileUploadResponse(sessionLogItemApiModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteSessionLogFileUploadResponse)) {
            return false;
        }
        CompleteSessionLogFileUploadResponse completeSessionLogFileUploadResponse = (CompleteSessionLogFileUploadResponse) obj;
        return t.b(this.uploadedSessionLog, completeSessionLogFileUploadResponse.uploadedSessionLog) && t.b(this.deletedSessionLogs, completeSessionLogFileUploadResponse.deletedSessionLogs);
    }

    public final List<Long> getDeletedSessionLogs() {
        return this.deletedSessionLogs;
    }

    public final SessionLogItemApiModel getUploadedSessionLog() {
        return this.uploadedSessionLog;
    }

    public int hashCode() {
        SessionLogItemApiModel sessionLogItemApiModel = this.uploadedSessionLog;
        return ((sessionLogItemApiModel == null ? 0 : sessionLogItemApiModel.hashCode()) * 31) + this.deletedSessionLogs.hashCode();
    }

    public String toString() {
        return "CompleteSessionLogFileUploadResponse(uploadedSessionLog=" + this.uploadedSessionLog + ", deletedSessionLogs=" + this.deletedSessionLogs + ")";
    }

    public CompleteSessionLogFileUploadResponse(SessionLogItemApiModel sessionLogItemApiModel, List<Long> list) {
        t.f(list, "deletedSessionLogs");
        this.uploadedSessionLog = sessionLogItemApiModel;
        this.deletedSessionLogs = list;
    }

    public /* synthetic */ CompleteSessionLogFileUploadResponse(SessionLogItemApiModel sessionLogItemApiModel, List list, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : sessionLogItemApiModel, list);
    }
}
