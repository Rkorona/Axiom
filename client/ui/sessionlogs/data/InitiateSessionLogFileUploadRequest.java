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
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class InitiateSessionLogFileUploadRequest {

    @gg.a
    public String bookmarkComment;
    private final String disconnectedAt;
    private final long historyConnectionId;
    private final String logFileChecksum;
    private final long logFileSize;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40379b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40378a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.InitiateSessionLogFileUploadRequest", aVar, 5);
            i2Var.r("history_connection", false);
            i2Var.r("size_in_bytes", false);
            i2Var.r("checksum", false);
            i2Var.r("disconnected_at", false);
            i2Var.r("bookmark_comment", false);
            descriptor = i2Var;
            f40379b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InitiateSessionLogFileUploadRequest deserialize(e eVar) {
            int i10;
            String strB;
            long j10;
            String strB2;
            String str;
            long j11;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            String strB3 = null;
            if (cVarD.l()) {
                long jO = cVarD.o(fVar, 0);
                long jO2 = cVarD.o(fVar, 1);
                strB = cVarD.B(fVar, 2);
                strB2 = cVarD.B(fVar, 3);
                str = (String) cVarD.v(fVar, 4, x2.f64817a, null);
                i10 = 31;
                j10 = jO2;
                j11 = jO;
            } else {
                long jO3 = 0;
                boolean z10 = true;
                int i11 = 0;
                String strB4 = null;
                String str2 = null;
                long jO4 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        jO4 = cVarD.o(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        jO3 = cVarD.o(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB3 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else if (iD == 3) {
                        strB4 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iD != 4) {
                            throw new e0(iD);
                        }
                        str2 = (String) cVarD.v(fVar, 4, x2.f64817a, str2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                strB = strB3;
                j10 = jO3;
                strB2 = strB4;
                str = str2;
                j11 = jO4;
            }
            cVarD.b(fVar);
            return new InitiateSessionLogFileUploadRequest(i10, j11, j10, strB, strB2, str, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, InitiateSessionLogFileUploadRequest initiateSessionLogFileUploadRequest) {
            t.f(fVar, "encoder");
            t.f(initiateSessionLogFileUploadRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            InitiateSessionLogFileUploadRequest.write$Self$Termius_app_googleProductionRelease(initiateSessionLogFileUploadRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            hv.c cVarU = iv.a.u(x2Var);
            h1 h1Var = h1.f64699a;
            return new hv.c[]{h1Var, h1Var, x2Var, x2Var, cVarU};
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
            return a.f40378a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ InitiateSessionLogFileUploadRequest(int i10, long j10, long j11, String str, String str2, String str3, s2 s2Var) {
        if (31 != (i10 & 31)) {
            d2.a(i10, 31, a.f40378a.getDescriptor());
        }
        this.historyConnectionId = j10;
        this.logFileSize = j11;
        this.logFileChecksum = str;
        this.disconnectedAt = str2;
        this.bookmarkComment = str3;
    }

    public static /* synthetic */ InitiateSessionLogFileUploadRequest copy$default(InitiateSessionLogFileUploadRequest initiateSessionLogFileUploadRequest, long j10, long j11, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = initiateSessionLogFileUploadRequest.historyConnectionId;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = initiateSessionLogFileUploadRequest.logFileSize;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            str = initiateSessionLogFileUploadRequest.logFileChecksum;
        }
        String str4 = str;
        if ((i10 & 8) != 0) {
            str2 = initiateSessionLogFileUploadRequest.disconnectedAt;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = initiateSessionLogFileUploadRequest.bookmarkComment;
        }
        return initiateSessionLogFileUploadRequest.copy(j12, j13, str4, str5, str3);
    }

    @o("bookmark_comment")
    public static /* synthetic */ void getBookmarkComment$annotations() {
    }

    @o("disconnected_at")
    public static /* synthetic */ void getDisconnectedAt$annotations() {
    }

    @o("history_connection")
    public static /* synthetic */ void getHistoryConnectionId$annotations() {
    }

    @o("checksum")
    public static /* synthetic */ void getLogFileChecksum$annotations() {
    }

    @o("size_in_bytes")
    public static /* synthetic */ void getLogFileSize$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(InitiateSessionLogFileUploadRequest initiateSessionLogFileUploadRequest, d dVar, f fVar) {
        dVar.q(fVar, 0, initiateSessionLogFileUploadRequest.historyConnectionId);
        dVar.q(fVar, 1, initiateSessionLogFileUploadRequest.logFileSize);
        dVar.f(fVar, 2, initiateSessionLogFileUploadRequest.logFileChecksum);
        dVar.f(fVar, 3, initiateSessionLogFileUploadRequest.disconnectedAt);
        dVar.v(fVar, 4, x2.f64817a, initiateSessionLogFileUploadRequest.bookmarkComment);
    }

    public final long component1() {
        return this.historyConnectionId;
    }

    public final long component2() {
        return this.logFileSize;
    }

    public final String component3() {
        return this.logFileChecksum;
    }

    public final String component4() {
        return this.disconnectedAt;
    }

    public final String component5() {
        return this.bookmarkComment;
    }

    public final InitiateSessionLogFileUploadRequest copy(long j10, long j11, String str, String str2, String str3) {
        t.f(str, "logFileChecksum");
        t.f(str2, "disconnectedAt");
        return new InitiateSessionLogFileUploadRequest(j10, j11, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiateSessionLogFileUploadRequest)) {
            return false;
        }
        InitiateSessionLogFileUploadRequest initiateSessionLogFileUploadRequest = (InitiateSessionLogFileUploadRequest) obj;
        return this.historyConnectionId == initiateSessionLogFileUploadRequest.historyConnectionId && this.logFileSize == initiateSessionLogFileUploadRequest.logFileSize && t.b(this.logFileChecksum, initiateSessionLogFileUploadRequest.logFileChecksum) && t.b(this.disconnectedAt, initiateSessionLogFileUploadRequest.disconnectedAt) && t.b(this.bookmarkComment, initiateSessionLogFileUploadRequest.bookmarkComment);
    }

    public final String getDisconnectedAt() {
        return this.disconnectedAt;
    }

    public final long getHistoryConnectionId() {
        return this.historyConnectionId;
    }

    public final String getLogFileChecksum() {
        return this.logFileChecksum;
    }

    public final long getLogFileSize() {
        return this.logFileSize;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.historyConnectionId) * 31) + Long.hashCode(this.logFileSize)) * 31) + this.logFileChecksum.hashCode()) * 31) + this.disconnectedAt.hashCode()) * 31;
        String str = this.bookmarkComment;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InitiateSessionLogFileUploadRequest(historyConnectionId=" + this.historyConnectionId + ", logFileSize=" + this.logFileSize + ", logFileChecksum=" + this.logFileChecksum + ", disconnectedAt=" + this.disconnectedAt + ", bookmarkComment=" + this.bookmarkComment + ")";
    }

    public InitiateSessionLogFileUploadRequest(long j10, long j11, String str, String str2, String str3) {
        t.f(str, "logFileChecksum");
        t.f(str2, "disconnectedAt");
        this.historyConnectionId = j10;
        this.logFileSize = j11;
        this.logFileChecksum = str;
        this.disconnectedAt = str2;
        this.bookmarkComment = str3;
    }
}
