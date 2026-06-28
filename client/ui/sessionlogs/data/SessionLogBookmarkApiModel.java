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
public final class SessionLogBookmarkApiModel {

    @gg.a
    public String bookmarkComment;
    private final long sessionLogRemoteId;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40391b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40390a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogBookmarkApiModel", aVar, 2);
            i2Var.r("log_id", false);
            i2Var.r("bookmark_comment", true);
            descriptor = i2Var;
            f40391b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionLogBookmarkApiModel deserialize(e eVar) {
            long jO;
            int i10;
            String str;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            String str2 = null;
            if (cVarD.l()) {
                jO = cVarD.o(fVar, 0);
                str = (String) cVarD.v(fVar, 1, x2.f64817a, null);
                i10 = 3;
            } else {
                jO = 0;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        jO = cVarD.o(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        str2 = (String) cVarD.v(fVar, 1, x2.f64817a, str2);
                        i11 |= 2;
                    }
                }
                i10 = i11;
                str = str2;
            }
            long j10 = jO;
            cVarD.b(fVar);
            return new SessionLogBookmarkApiModel(i10, j10, str, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SessionLogBookmarkApiModel sessionLogBookmarkApiModel) {
            t.f(fVar, "encoder");
            t.f(sessionLogBookmarkApiModel, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SessionLogBookmarkApiModel.write$Self$Termius_app_googleProductionRelease(sessionLogBookmarkApiModel, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{h1.f64699a, iv.a.u(x2.f64817a)};
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
            return a.f40390a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ SessionLogBookmarkApiModel(int i10, long j10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f40390a.getDescriptor());
        }
        this.sessionLogRemoteId = j10;
        if ((i10 & 2) == 0) {
            this.bookmarkComment = null;
        } else {
            this.bookmarkComment = str;
        }
    }

    public static /* synthetic */ SessionLogBookmarkApiModel copy$default(SessionLogBookmarkApiModel sessionLogBookmarkApiModel, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sessionLogBookmarkApiModel.sessionLogRemoteId;
        }
        if ((i10 & 2) != 0) {
            str = sessionLogBookmarkApiModel.bookmarkComment;
        }
        return sessionLogBookmarkApiModel.copy(j10, str);
    }

    @o("bookmark_comment")
    public static /* synthetic */ void getBookmarkComment$annotations() {
    }

    @o("log_id")
    public static /* synthetic */ void getSessionLogRemoteId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SessionLogBookmarkApiModel sessionLogBookmarkApiModel, d dVar, f fVar) {
        dVar.q(fVar, 0, sessionLogBookmarkApiModel.sessionLogRemoteId);
        if (!dVar.E(fVar, 1) && sessionLogBookmarkApiModel.bookmarkComment == null) {
            return;
        }
        dVar.v(fVar, 1, x2.f64817a, sessionLogBookmarkApiModel.bookmarkComment);
    }

    public final long component1() {
        return this.sessionLogRemoteId;
    }

    public final String component2() {
        return this.bookmarkComment;
    }

    public final SessionLogBookmarkApiModel copy(long j10, String str) {
        return new SessionLogBookmarkApiModel(j10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionLogBookmarkApiModel)) {
            return false;
        }
        SessionLogBookmarkApiModel sessionLogBookmarkApiModel = (SessionLogBookmarkApiModel) obj;
        return this.sessionLogRemoteId == sessionLogBookmarkApiModel.sessionLogRemoteId && t.b(this.bookmarkComment, sessionLogBookmarkApiModel.bookmarkComment);
    }

    public final long getSessionLogRemoteId() {
        return this.sessionLogRemoteId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.sessionLogRemoteId) * 31;
        String str = this.bookmarkComment;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SessionLogBookmarkApiModel(sessionLogRemoteId=" + this.sessionLogRemoteId + ", bookmarkComment=" + this.bookmarkComment + ")";
    }

    public SessionLogBookmarkApiModel(long j10, String str) {
        this.sessionLogRemoteId = j10;
        this.bookmarkComment = str;
    }

    public /* synthetic */ SessionLogBookmarkApiModel(long j10, String str, int i10, k kVar) {
        this(j10, (i10 & 2) != 0 ? null : str);
    }
}
