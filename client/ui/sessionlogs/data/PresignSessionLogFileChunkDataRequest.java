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
public final class PresignSessionLogFileChunkDataRequest {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String checksum;
    private final int partNumber;
    private final int size;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40383b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40382a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.PresignSessionLogFileChunkDataRequest", aVar, 3);
            i2Var.r("size", false);
            i2Var.r("checksum", false);
            i2Var.r("part_number", false);
            descriptor = i2Var;
            f40383b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PresignSessionLogFileChunkDataRequest deserialize(e eVar) {
            int iE;
            int iE2;
            String str;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                iE = cVarD.e(fVar, 0);
                String strB = cVarD.B(fVar, 1);
                iE2 = cVarD.e(fVar, 2);
                str = strB;
                i10 = 7;
            } else {
                String strB2 = null;
                boolean z10 = true;
                iE = 0;
                int iE3 = 0;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        iE = cVarD.e(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB2 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        iE3 = cVarD.e(fVar, 2);
                        i11 |= 4;
                    }
                }
                iE2 = iE3;
                str = strB2;
                i10 = i11;
            }
            int i12 = iE;
            cVarD.b(fVar);
            return new PresignSessionLogFileChunkDataRequest(i10, i12, str, iE2, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, PresignSessionLogFileChunkDataRequest presignSessionLogFileChunkDataRequest) {
            t.f(fVar, "encoder");
            t.f(presignSessionLogFileChunkDataRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            PresignSessionLogFileChunkDataRequest.write$Self$Termius_app_googleProductionRelease(presignSessionLogFileChunkDataRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            w0 w0Var = w0.f64808a;
            return new hv.c[]{w0Var, x2.f64817a, w0Var};
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
            return a.f40382a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ PresignSessionLogFileChunkDataRequest(int i10, int i11, String str, int i12, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, a.f40382a.getDescriptor());
        }
        this.size = i11;
        this.checksum = str;
        this.partNumber = i12;
    }

    public static /* synthetic */ PresignSessionLogFileChunkDataRequest copy$default(PresignSessionLogFileChunkDataRequest presignSessionLogFileChunkDataRequest, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = presignSessionLogFileChunkDataRequest.size;
        }
        if ((i12 & 2) != 0) {
            str = presignSessionLogFileChunkDataRequest.checksum;
        }
        if ((i12 & 4) != 0) {
            i11 = presignSessionLogFileChunkDataRequest.partNumber;
        }
        return presignSessionLogFileChunkDataRequest.copy(i10, str, i11);
    }

    @o("checksum")
    public static /* synthetic */ void getChecksum$annotations() {
    }

    @o("part_number")
    public static /* synthetic */ void getPartNumber$annotations() {
    }

    @o("size")
    public static /* synthetic */ void getSize$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PresignSessionLogFileChunkDataRequest presignSessionLogFileChunkDataRequest, d dVar, f fVar) {
        dVar.t(fVar, 0, presignSessionLogFileChunkDataRequest.size);
        dVar.f(fVar, 1, presignSessionLogFileChunkDataRequest.checksum);
        dVar.t(fVar, 2, presignSessionLogFileChunkDataRequest.partNumber);
    }

    public final int component1() {
        return this.size;
    }

    public final String component2() {
        return this.checksum;
    }

    public final int component3() {
        return this.partNumber;
    }

    public final PresignSessionLogFileChunkDataRequest copy(int i10, String str, int i11) {
        t.f(str, "checksum");
        return new PresignSessionLogFileChunkDataRequest(i10, str, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresignSessionLogFileChunkDataRequest)) {
            return false;
        }
        PresignSessionLogFileChunkDataRequest presignSessionLogFileChunkDataRequest = (PresignSessionLogFileChunkDataRequest) obj;
        return this.size == presignSessionLogFileChunkDataRequest.size && t.b(this.checksum, presignSessionLogFileChunkDataRequest.checksum) && this.partNumber == presignSessionLogFileChunkDataRequest.partNumber;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final int getPartNumber() {
        return this.partNumber;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.size) * 31) + this.checksum.hashCode()) * 31) + Integer.hashCode(this.partNumber);
    }

    public String toString() {
        return "PresignSessionLogFileChunkDataRequest(size=" + this.size + ", checksum=" + this.checksum + ", partNumber=" + this.partNumber + ")";
    }

    public PresignSessionLogFileChunkDataRequest(int i10, String str, int i11) {
        t.f(str, "checksum");
        this.size = i10;
        this.checksum = str;
        this.partNumber = i11;
    }
}
