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
public final class PresignedSessionLogFileChunkDataResponse {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final int chunkIndex;
    private final String presignedChecksum;
    private final String presignedUrl;
    private final String urlExpiresAt;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40387b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40386a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.PresignedSessionLogFileChunkDataResponse", aVar, 4);
            i2Var.r("part_number", false);
            i2Var.r("url", false);
            i2Var.r("expires_at", false);
            i2Var.r("checksum", false);
            descriptor = i2Var;
            f40387b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PresignedSessionLogFileChunkDataResponse deserialize(e eVar) {
            int iE;
            String strB;
            String str;
            String str2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                iE = cVarD.e(fVar, 0);
                String strB2 = cVarD.B(fVar, 1);
                String strB3 = cVarD.B(fVar, 2);
                strB = cVarD.B(fVar, 3);
                str = strB3;
                str2 = strB2;
                i10 = 15;
            } else {
                String strB4 = null;
                String strB5 = null;
                String strB6 = null;
                boolean z10 = true;
                iE = 0;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        iE = cVarD.e(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB6 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB5 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iD != 3) {
                            throw new e0(iD);
                        }
                        strB4 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    }
                }
                strB = strB4;
                str = strB5;
                str2 = strB6;
                i10 = i11;
            }
            int i12 = iE;
            cVarD.b(fVar);
            return new PresignedSessionLogFileChunkDataResponse(i10, i12, str2, str, strB, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, PresignedSessionLogFileChunkDataResponse presignedSessionLogFileChunkDataResponse) {
            t.f(fVar, "encoder");
            t.f(presignedSessionLogFileChunkDataResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            PresignedSessionLogFileChunkDataResponse.write$Self$Termius_app_googleProductionRelease(presignedSessionLogFileChunkDataResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{w0.f64808a, x2Var, x2Var, x2Var};
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
            return a.f40386a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ PresignedSessionLogFileChunkDataResponse(int i10, int i11, String str, String str2, String str3, s2 s2Var) {
        if (15 != (i10 & 15)) {
            d2.a(i10, 15, a.f40386a.getDescriptor());
        }
        this.chunkIndex = i11;
        this.presignedUrl = str;
        this.urlExpiresAt = str2;
        this.presignedChecksum = str3;
    }

    public static /* synthetic */ PresignedSessionLogFileChunkDataResponse copy$default(PresignedSessionLogFileChunkDataResponse presignedSessionLogFileChunkDataResponse, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = presignedSessionLogFileChunkDataResponse.chunkIndex;
        }
        if ((i11 & 2) != 0) {
            str = presignedSessionLogFileChunkDataResponse.presignedUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = presignedSessionLogFileChunkDataResponse.urlExpiresAt;
        }
        if ((i11 & 8) != 0) {
            str3 = presignedSessionLogFileChunkDataResponse.presignedChecksum;
        }
        return presignedSessionLogFileChunkDataResponse.copy(i10, str, str2, str3);
    }

    @o("part_number")
    public static /* synthetic */ void getChunkIndex$annotations() {
    }

    @o("checksum")
    public static /* synthetic */ void getPresignedChecksum$annotations() {
    }

    @o("url")
    public static /* synthetic */ void getPresignedUrl$annotations() {
    }

    @o("expires_at")
    public static /* synthetic */ void getUrlExpiresAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PresignedSessionLogFileChunkDataResponse presignedSessionLogFileChunkDataResponse, d dVar, f fVar) {
        dVar.t(fVar, 0, presignedSessionLogFileChunkDataResponse.chunkIndex);
        dVar.f(fVar, 1, presignedSessionLogFileChunkDataResponse.presignedUrl);
        dVar.f(fVar, 2, presignedSessionLogFileChunkDataResponse.urlExpiresAt);
        dVar.f(fVar, 3, presignedSessionLogFileChunkDataResponse.presignedChecksum);
    }

    public final int component1() {
        return this.chunkIndex;
    }

    public final String component2() {
        return this.presignedUrl;
    }

    public final String component3() {
        return this.urlExpiresAt;
    }

    public final String component4() {
        return this.presignedChecksum;
    }

    public final PresignedSessionLogFileChunkDataResponse copy(int i10, String str, String str2, String str3) {
        t.f(str, "presignedUrl");
        t.f(str2, "urlExpiresAt");
        t.f(str3, "presignedChecksum");
        return new PresignedSessionLogFileChunkDataResponse(i10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresignedSessionLogFileChunkDataResponse)) {
            return false;
        }
        PresignedSessionLogFileChunkDataResponse presignedSessionLogFileChunkDataResponse = (PresignedSessionLogFileChunkDataResponse) obj;
        return this.chunkIndex == presignedSessionLogFileChunkDataResponse.chunkIndex && t.b(this.presignedUrl, presignedSessionLogFileChunkDataResponse.presignedUrl) && t.b(this.urlExpiresAt, presignedSessionLogFileChunkDataResponse.urlExpiresAt) && t.b(this.presignedChecksum, presignedSessionLogFileChunkDataResponse.presignedChecksum);
    }

    public final int getChunkIndex() {
        return this.chunkIndex;
    }

    public final String getPresignedChecksum() {
        return this.presignedChecksum;
    }

    public final String getPresignedUrl() {
        return this.presignedUrl;
    }

    public final String getUrlExpiresAt() {
        return this.urlExpiresAt;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.chunkIndex) * 31) + this.presignedUrl.hashCode()) * 31) + this.urlExpiresAt.hashCode()) * 31) + this.presignedChecksum.hashCode();
    }

    public String toString() {
        return "PresignedSessionLogFileChunkDataResponse(chunkIndex=" + this.chunkIndex + ", presignedUrl=" + this.presignedUrl + ", urlExpiresAt=" + this.urlExpiresAt + ", presignedChecksum=" + this.presignedChecksum + ")";
    }

    public PresignedSessionLogFileChunkDataResponse(int i10, String str, String str2, String str3) {
        t.f(str, "presignedUrl");
        t.f(str2, "urlExpiresAt");
        t.f(str3, "presignedChecksum");
        this.chunkIndex = i10;
        this.presignedUrl = str;
        this.urlExpiresAt = str2;
        this.presignedChecksum = str3;
    }
}
