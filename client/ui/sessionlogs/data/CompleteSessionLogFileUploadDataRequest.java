package com.server.auditor.ssh.client.ui.sessionlogs.data;

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
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CompleteSessionLogFileUploadDataRequest {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String checksum;
    private final int chunkIndex;
    private final String entityTag;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40365b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40364a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.CompleteSessionLogFileUploadDataRequest", aVar, 3);
            i2Var.r("e_tag", false);
            i2Var.r("checksum", false);
            i2Var.r("part_number", false);
            descriptor = i2Var;
            f40365b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompleteSessionLogFileUploadDataRequest deserialize(e eVar) {
            String strB;
            int iE;
            String str;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                String strB2 = cVarD.B(fVar, 1);
                iE = cVarD.e(fVar, 2);
                str = strB2;
                i10 = 7;
            } else {
                strB = null;
                String strB3 = null;
                boolean z10 = true;
                int iE2 = 0;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB3 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        iE2 = cVarD.e(fVar, 2);
                        i11 |= 4;
                    }
                }
                iE = iE2;
                str = strB3;
                i10 = i11;
            }
            String str2 = strB;
            cVarD.b(fVar);
            return new CompleteSessionLogFileUploadDataRequest(i10, str2, str, iE, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, CompleteSessionLogFileUploadDataRequest completeSessionLogFileUploadDataRequest) {
            t.f(fVar, "encoder");
            t.f(completeSessionLogFileUploadDataRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            CompleteSessionLogFileUploadDataRequest.write$Self$Termius_app_googleProductionRelease(completeSessionLogFileUploadDataRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var, w0.f64808a};
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
            return a.f40364a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ CompleteSessionLogFileUploadDataRequest(int i10, String str, String str2, int i11, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, a.f40364a.getDescriptor());
        }
        this.entityTag = str;
        this.checksum = str2;
        this.chunkIndex = i11;
    }

    public static /* synthetic */ CompleteSessionLogFileUploadDataRequest copy$default(CompleteSessionLogFileUploadDataRequest completeSessionLogFileUploadDataRequest, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = completeSessionLogFileUploadDataRequest.entityTag;
        }
        if ((i11 & 2) != 0) {
            str2 = completeSessionLogFileUploadDataRequest.checksum;
        }
        if ((i11 & 4) != 0) {
            i10 = completeSessionLogFileUploadDataRequest.chunkIndex;
        }
        return completeSessionLogFileUploadDataRequest.copy(str, str2, i10);
    }

    @o("checksum")
    public static /* synthetic */ void getChecksum$annotations() {
    }

    @o("part_number")
    public static /* synthetic */ void getChunkIndex$annotations() {
    }

    @o("e_tag")
    public static /* synthetic */ void getEntityTag$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CompleteSessionLogFileUploadDataRequest completeSessionLogFileUploadDataRequest, d dVar, f fVar) {
        dVar.f(fVar, 0, completeSessionLogFileUploadDataRequest.entityTag);
        dVar.f(fVar, 1, completeSessionLogFileUploadDataRequest.checksum);
        dVar.t(fVar, 2, completeSessionLogFileUploadDataRequest.chunkIndex);
    }

    public final String component1() {
        return this.entityTag;
    }

    public final String component2() {
        return this.checksum;
    }

    public final int component3() {
        return this.chunkIndex;
    }

    public final CompleteSessionLogFileUploadDataRequest copy(String str, String str2, int i10) {
        t.f(str, "entityTag");
        t.f(str2, "checksum");
        return new CompleteSessionLogFileUploadDataRequest(str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteSessionLogFileUploadDataRequest)) {
            return false;
        }
        CompleteSessionLogFileUploadDataRequest completeSessionLogFileUploadDataRequest = (CompleteSessionLogFileUploadDataRequest) obj;
        return t.b(this.entityTag, completeSessionLogFileUploadDataRequest.entityTag) && t.b(this.checksum, completeSessionLogFileUploadDataRequest.checksum) && this.chunkIndex == completeSessionLogFileUploadDataRequest.chunkIndex;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final int getChunkIndex() {
        return this.chunkIndex;
    }

    public final String getEntityTag() {
        return this.entityTag;
    }

    public int hashCode() {
        return (((this.entityTag.hashCode() * 31) + this.checksum.hashCode()) * 31) + Integer.hashCode(this.chunkIndex);
    }

    public String toString() {
        return "CompleteSessionLogFileUploadDataRequest(entityTag=" + this.entityTag + ", checksum=" + this.checksum + ", chunkIndex=" + this.chunkIndex + ")";
    }

    public CompleteSessionLogFileUploadDataRequest(String str, String str2, int i10) {
        t.f(str, "entityTag");
        t.f(str2, "checksum");
        this.entityTag = str;
        this.checksum = str2;
        this.chunkIndex = i10;
    }
}
