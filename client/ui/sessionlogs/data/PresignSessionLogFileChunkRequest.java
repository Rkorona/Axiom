package com.server.auditor.ssh.client.ui.sessionlogs.data;

import com.server.auditor.ssh.client.ui.sessionlogs.data.PresignSessionLogFileChunkDataRequest;
import com.server.auditor.ssh.client.ui.sessionlogs.data.PresignSessionLogFileChunkRequest;
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
public final class PresignSessionLogFileChunkRequest {
    private final List<PresignSessionLogFileChunkDataRequest> presignDataRequests;
    public static final b Companion = new b(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: so.l
        @Override // iu.a
        public final Object a() {
            return PresignSessionLogFileChunkRequest._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40385b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40384a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.PresignSessionLogFileChunkRequest", aVar, 1);
            i2Var.r("presign_parts", false);
            descriptor = i2Var;
            f40385b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PresignSessionLogFileChunkRequest deserialize(e eVar) {
            List list;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = PresignSessionLogFileChunkRequest.$childSerializers;
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                list = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        list2 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new PresignSessionLogFileChunkRequest(i10, list, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, PresignSessionLogFileChunkRequest presignSessionLogFileChunkRequest) {
            t.f(fVar, "encoder");
            t.f(presignSessionLogFileChunkRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            PresignSessionLogFileChunkRequest.write$Self$Termius_app_googleProductionRelease(presignSessionLogFileChunkRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{PresignSessionLogFileChunkRequest.$childSerializers[0].getValue()};
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
            return a.f40384a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ PresignSessionLogFileChunkRequest(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f40384a.getDescriptor());
        }
        this.presignDataRequests = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(PresignSessionLogFileChunkDataRequest.a.f40382a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PresignSessionLogFileChunkRequest copy$default(PresignSessionLogFileChunkRequest presignSessionLogFileChunkRequest, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = presignSessionLogFileChunkRequest.presignDataRequests;
        }
        return presignSessionLogFileChunkRequest.copy(list);
    }

    @hv.o("presign_parts")
    public static /* synthetic */ void getPresignDataRequests$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PresignSessionLogFileChunkRequest presignSessionLogFileChunkRequest, d dVar, f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), presignSessionLogFileChunkRequest.presignDataRequests);
    }

    public final List<PresignSessionLogFileChunkDataRequest> component1() {
        return this.presignDataRequests;
    }

    public final PresignSessionLogFileChunkRequest copy(List<PresignSessionLogFileChunkDataRequest> list) {
        t.f(list, "presignDataRequests");
        return new PresignSessionLogFileChunkRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresignSessionLogFileChunkRequest) && t.b(this.presignDataRequests, ((PresignSessionLogFileChunkRequest) obj).presignDataRequests);
    }

    public final List<PresignSessionLogFileChunkDataRequest> getPresignDataRequests() {
        return this.presignDataRequests;
    }

    public int hashCode() {
        return this.presignDataRequests.hashCode();
    }

    public String toString() {
        return "PresignSessionLogFileChunkRequest(presignDataRequests=" + this.presignDataRequests + ")";
    }

    public PresignSessionLogFileChunkRequest(List<PresignSessionLogFileChunkDataRequest> list) {
        t.f(list, "presignDataRequests");
        this.presignDataRequests = list;
    }
}
