package com.server.auditor.ssh.client.ui.sessionlogs.data;

import com.crystalnix.termius.libtermius.sftp.File;
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
import so.s;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SessionLogItemApiModel {

    @gg.a
    public String bookmarkComment;
    private final String checksum;
    private final String disconnectedAt;
    private final long historyConnectionId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f40392id;
    private final String ipAddress;
    private final String location;
    private final long size;
    private final String updatedAt;
    private final SessionLogUploadStatus uploadStatus;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40394b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40393a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogItemApiModel", aVar, 10);
            i2Var.r("id", false);
            i2Var.r("size_in_bytes", false);
            i2Var.r("checksum", false);
            i2Var.r("disconnected_at", false);
            i2Var.r("history_connection", false);
            i2Var.r("updated_at", false);
            i2Var.r("upload_status", false);
            i2Var.r("ip_address", true);
            i2Var.r("location", true);
            i2Var.r("bookmark_comment", true);
            descriptor = i2Var;
            f40394b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionLogItemApiModel deserialize(e eVar) {
            int i10;
            String str;
            String str2;
            String str3;
            String str4;
            SessionLogUploadStatus sessionLogUploadStatus;
            long j10;
            long j11;
            String str5;
            String str6;
            long j12;
            int i11;
            char c10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            int i12 = 7;
            int i13 = 5;
            if (cVarD.l()) {
                long jO = cVarD.o(fVar, 0);
                long jO2 = cVarD.o(fVar, 1);
                String strB = cVarD.B(fVar, 2);
                String strB2 = cVarD.B(fVar, 3);
                long jO3 = cVarD.o(fVar, 4);
                String strB3 = cVarD.B(fVar, 5);
                SessionLogUploadStatus sessionLogUploadStatus2 = (SessionLogUploadStatus) cVarD.i(fVar, 6, s.f78188a, null);
                x2 x2Var = x2.f64817a;
                String str7 = (String) cVarD.v(fVar, 7, x2Var, null);
                String str8 = (String) cVarD.v(fVar, 8, x2Var, null);
                str2 = (String) cVarD.v(fVar, 9, x2Var, null);
                sessionLogUploadStatus = sessionLogUploadStatus2;
                str4 = str7;
                i10 = 1023;
                str6 = strB3;
                str5 = strB2;
                str3 = str8;
                j10 = jO3;
                j11 = jO2;
                j12 = jO;
                str = strB;
            } else {
                long jO4 = 0;
                long jO5 = 0;
                boolean z10 = true;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String strB4 = null;
                String strB5 = null;
                long jO6 = 0;
                int i14 = 0;
                String strB6 = null;
                SessionLogUploadStatus sessionLogUploadStatus3 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            i11 = i13;
                            c10 = 4;
                            z10 = false;
                            i13 = i11;
                            i12 = 7;
                            break;
                        case 0:
                            i11 = i13;
                            c10 = 4;
                            jO5 = cVarD.o(fVar, 0);
                            i14 |= 1;
                            i13 = i11;
                            i12 = 7;
                            break;
                        case 1:
                            i14 |= 2;
                            i13 = i13;
                            jO4 = cVarD.o(fVar, 1);
                            i12 = 7;
                            break;
                        case 2:
                            c10 = 4;
                            i14 |= 4;
                            i13 = i13;
                            strB6 = cVarD.B(fVar, 2);
                            i12 = 7;
                            break;
                        case 3:
                            i11 = i13;
                            c10 = 4;
                            strB4 = cVarD.B(fVar, 3);
                            i14 |= 8;
                            i13 = i11;
                            i12 = 7;
                            break;
                        case 4:
                            i14 |= 16;
                            i13 = i13;
                            jO6 = cVarD.o(fVar, 4);
                            break;
                        case 5:
                            int i15 = i13;
                            strB5 = cVarD.B(fVar, i15);
                            i14 |= 32;
                            i13 = i15;
                            break;
                        case 6:
                            sessionLogUploadStatus3 = (SessionLogUploadStatus) cVarD.i(fVar, 6, s.f78188a, sessionLogUploadStatus3);
                            i14 |= 64;
                            i13 = 5;
                            break;
                        case 7:
                            str11 = (String) cVarD.v(fVar, i12, x2.f64817a, str11);
                            i14 |= 128;
                            i13 = 5;
                            break;
                        case 8:
                            str10 = (String) cVarD.v(fVar, 8, x2.f64817a, str10);
                            i14 |= 256;
                            i13 = 5;
                            break;
                        case 9:
                            str9 = (String) cVarD.v(fVar, 9, x2.f64817a, str9);
                            i14 |= File.FLAG_O_TRUNC;
                            i13 = 5;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                i10 = i14;
                str = strB6;
                str2 = str9;
                str3 = str10;
                str4 = str11;
                sessionLogUploadStatus = sessionLogUploadStatus3;
                j10 = jO6;
                j11 = jO4;
                str5 = strB4;
                str6 = strB5;
                j12 = jO5;
            }
            cVarD.b(fVar);
            return new SessionLogItemApiModel(i10, j12, j11, str, str5, j10, str6, sessionLogUploadStatus, str4, str3, str2, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SessionLogItemApiModel sessionLogItemApiModel) {
            t.f(fVar, "encoder");
            t.f(sessionLogItemApiModel, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SessionLogItemApiModel.write$Self$Termius_app_googleProductionRelease(sessionLogItemApiModel, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            hv.c cVarU = iv.a.u(x2Var);
            hv.c cVarU2 = iv.a.u(x2Var);
            hv.c cVarU3 = iv.a.u(x2Var);
            h1 h1Var = h1.f64699a;
            return new hv.c[]{h1Var, h1Var, x2Var, x2Var, h1Var, x2Var, s.f78188a, cVarU, cVarU2, cVarU3};
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
            return a.f40393a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ SessionLogItemApiModel(int i10, long j10, long j11, String str, String str2, long j12, String str3, SessionLogUploadStatus sessionLogUploadStatus, String str4, String str5, String str6, s2 s2Var) {
        if (127 != (i10 & 127)) {
            d2.a(i10, 127, a.f40393a.getDescriptor());
        }
        this.f40392id = j10;
        this.size = j11;
        this.checksum = str;
        this.disconnectedAt = str2;
        this.historyConnectionId = j12;
        this.updatedAt = str3;
        this.uploadStatus = sessionLogUploadStatus;
        if ((i10 & 128) == 0) {
            this.ipAddress = null;
        } else {
            this.ipAddress = str4;
        }
        if ((i10 & 256) == 0) {
            this.location = null;
        } else {
            this.location = str5;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.bookmarkComment = null;
        } else {
            this.bookmarkComment = str6;
        }
    }

    @o("bookmark_comment")
    public static /* synthetic */ void getBookmarkComment$annotations() {
    }

    @o("checksum")
    public static /* synthetic */ void getChecksum$annotations() {
    }

    @o("disconnected_at")
    public static /* synthetic */ void getDisconnectedAt$annotations() {
    }

    @o("history_connection")
    public static /* synthetic */ void getHistoryConnectionId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("ip_address")
    public static /* synthetic */ void getIpAddress$annotations() {
    }

    @o("location")
    public static /* synthetic */ void getLocation$annotations() {
    }

    @o("size_in_bytes")
    public static /* synthetic */ void getSize$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o("upload_status")
    public static /* synthetic */ void getUploadStatus$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SessionLogItemApiModel sessionLogItemApiModel, d dVar, f fVar) {
        dVar.q(fVar, 0, sessionLogItemApiModel.f40392id);
        dVar.q(fVar, 1, sessionLogItemApiModel.size);
        dVar.f(fVar, 2, sessionLogItemApiModel.checksum);
        dVar.f(fVar, 3, sessionLogItemApiModel.disconnectedAt);
        dVar.q(fVar, 4, sessionLogItemApiModel.historyConnectionId);
        dVar.f(fVar, 5, sessionLogItemApiModel.updatedAt);
        dVar.o(fVar, 6, s.f78188a, sessionLogItemApiModel.uploadStatus);
        if (dVar.E(fVar, 7) || sessionLogItemApiModel.ipAddress != null) {
            dVar.v(fVar, 7, x2.f64817a, sessionLogItemApiModel.ipAddress);
        }
        if (dVar.E(fVar, 8) || sessionLogItemApiModel.location != null) {
            dVar.v(fVar, 8, x2.f64817a, sessionLogItemApiModel.location);
        }
        if (!dVar.E(fVar, 9) && sessionLogItemApiModel.bookmarkComment == null) {
            return;
        }
        dVar.v(fVar, 9, x2.f64817a, sessionLogItemApiModel.bookmarkComment);
    }

    public final long component1() {
        return this.f40392id;
    }

    public final String component10() {
        return this.bookmarkComment;
    }

    public final long component2() {
        return this.size;
    }

    public final String component3() {
        return this.checksum;
    }

    public final String component4() {
        return this.disconnectedAt;
    }

    public final long component5() {
        return this.historyConnectionId;
    }

    public final String component6() {
        return this.updatedAt;
    }

    public final SessionLogUploadStatus component7() {
        return this.uploadStatus;
    }

    public final String component8() {
        return this.ipAddress;
    }

    public final String component9() {
        return this.location;
    }

    public final SessionLogItemApiModel copy(long j10, long j11, String str, String str2, long j12, String str3, SessionLogUploadStatus sessionLogUploadStatus, String str4, String str5, String str6) {
        t.f(str, "checksum");
        t.f(str2, "disconnectedAt");
        t.f(str3, "updatedAt");
        t.f(sessionLogUploadStatus, "uploadStatus");
        return new SessionLogItemApiModel(j10, j11, str, str2, j12, str3, sessionLogUploadStatus, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionLogItemApiModel)) {
            return false;
        }
        SessionLogItemApiModel sessionLogItemApiModel = (SessionLogItemApiModel) obj;
        return this.f40392id == sessionLogItemApiModel.f40392id && this.size == sessionLogItemApiModel.size && t.b(this.checksum, sessionLogItemApiModel.checksum) && t.b(this.disconnectedAt, sessionLogItemApiModel.disconnectedAt) && this.historyConnectionId == sessionLogItemApiModel.historyConnectionId && t.b(this.updatedAt, sessionLogItemApiModel.updatedAt) && this.uploadStatus == sessionLogItemApiModel.uploadStatus && t.b(this.ipAddress, sessionLogItemApiModel.ipAddress) && t.b(this.location, sessionLogItemApiModel.location) && t.b(this.bookmarkComment, sessionLogItemApiModel.bookmarkComment);
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final String getDisconnectedAt() {
        return this.disconnectedAt;
    }

    public final long getHistoryConnectionId() {
        return this.historyConnectionId;
    }

    public final long getId() {
        return this.f40392id;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getLocation() {
        return this.location;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final SessionLogUploadStatus getUploadStatus() {
        return this.uploadStatus;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Long.hashCode(this.f40392id) * 31) + Long.hashCode(this.size)) * 31) + this.checksum.hashCode()) * 31) + this.disconnectedAt.hashCode()) * 31) + Long.hashCode(this.historyConnectionId)) * 31) + this.updatedAt.hashCode()) * 31) + this.uploadStatus.hashCode()) * 31;
        String str = this.ipAddress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.location;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bookmarkComment;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SessionLogItemApiModel(id=" + this.f40392id + ", size=" + this.size + ", checksum=" + this.checksum + ", disconnectedAt=" + this.disconnectedAt + ", historyConnectionId=" + this.historyConnectionId + ", updatedAt=" + this.updatedAt + ", uploadStatus=" + this.uploadStatus + ", ipAddress=" + this.ipAddress + ", location=" + this.location + ", bookmarkComment=" + this.bookmarkComment + ")";
    }

    public SessionLogItemApiModel(long j10, long j11, String str, String str2, long j12, String str3, SessionLogUploadStatus sessionLogUploadStatus, String str4, String str5, String str6) {
        t.f(str, "checksum");
        t.f(str2, "disconnectedAt");
        t.f(str3, "updatedAt");
        t.f(sessionLogUploadStatus, "uploadStatus");
        this.f40392id = j10;
        this.size = j11;
        this.checksum = str;
        this.disconnectedAt = str2;
        this.historyConnectionId = j12;
        this.updatedAt = str3;
        this.uploadStatus = sessionLogUploadStatus;
        this.ipAddress = str4;
        this.location = str5;
        this.bookmarkComment = str6;
    }

    public /* synthetic */ SessionLogItemApiModel(long j10, long j11, String str, String str2, long j12, String str3, SessionLogUploadStatus sessionLogUploadStatus, String str4, String str5, String str6, int i10, k kVar) {
        this(j10, j11, str, str2, j12, str3, sessionLogUploadStatus, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & File.FLAG_O_TRUNC) != 0 ? null : str6);
    }
}
