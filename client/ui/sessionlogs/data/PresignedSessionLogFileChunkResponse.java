package com.server.auditor.ssh.client.ui.sessionlogs.data;

import com.server.auditor.ssh.client.ui.sessionlogs.data.PresignedSessionLogFileChunkDataResponse;
import com.server.auditor.ssh.client.ui.sessionlogs.data.PresignedSessionLogFileChunkResponse;
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
public final class PresignedSessionLogFileChunkResponse {
    private final List<PresignedSessionLogFileChunkDataResponse> presignedDataResponse;
    public static final b Companion = new b(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: so.m
        @Override // iu.a
        public final Object a() {
            return PresignedSessionLogFileChunkResponse._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40389b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40388a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.PresignedSessionLogFileChunkResponse", aVar, 1);
            i2Var.r("presigned", false);
            descriptor = i2Var;
            f40389b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PresignedSessionLogFileChunkResponse deserialize(e eVar) {
            List list;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = PresignedSessionLogFileChunkResponse.$childSerializers;
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
            return new PresignedSessionLogFileChunkResponse(i10, list, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, PresignedSessionLogFileChunkResponse presignedSessionLogFileChunkResponse) {
            t.f(fVar, "encoder");
            t.f(presignedSessionLogFileChunkResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            PresignedSessionLogFileChunkResponse.write$Self$Termius_app_googleProductionRelease(presignedSessionLogFileChunkResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{PresignedSessionLogFileChunkResponse.$childSerializers[0].getValue()};
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
            return a.f40388a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ PresignedSessionLogFileChunkResponse(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f40388a.getDescriptor());
        }
        this.presignedDataResponse = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(PresignedSessionLogFileChunkDataResponse.a.f40386a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PresignedSessionLogFileChunkResponse copy$default(PresignedSessionLogFileChunkResponse presignedSessionLogFileChunkResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = presignedSessionLogFileChunkResponse.presignedDataResponse;
        }
        return presignedSessionLogFileChunkResponse.copy(list);
    }

    @hv.o("presigned")
    public static /* synthetic */ void getPresignedDataResponse$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PresignedSessionLogFileChunkResponse presignedSessionLogFileChunkResponse, d dVar, f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), presignedSessionLogFileChunkResponse.presignedDataResponse);
    }

    public final List<PresignedSessionLogFileChunkDataResponse> component1() {
        return this.presignedDataResponse;
    }

    public final PresignedSessionLogFileChunkResponse copy(List<PresignedSessionLogFileChunkDataResponse> list) {
        t.f(list, "presignedDataResponse");
        return new PresignedSessionLogFileChunkResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresignedSessionLogFileChunkResponse) && t.b(this.presignedDataResponse, ((PresignedSessionLogFileChunkResponse) obj).presignedDataResponse);
    }

    public final List<PresignedSessionLogFileChunkDataResponse> getPresignedDataResponse() {
        return this.presignedDataResponse;
    }

    public int hashCode() {
        return this.presignedDataResponse.hashCode();
    }

    public String toString() {
        return "PresignedSessionLogFileChunkResponse(presignedDataResponse=" + this.presignedDataResponse + ")";
    }

    public PresignedSessionLogFileChunkResponse(List<PresignedSessionLogFileChunkDataResponse> list) {
        t.f(list, "presignedDataResponse");
        this.presignedDataResponse = list;
    }
}
