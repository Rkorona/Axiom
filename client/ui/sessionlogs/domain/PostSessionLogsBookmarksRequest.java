package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogBookmarkApiModel;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.PostSessionLogsBookmarksRequest;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.k;
import ju.t;
import jv.f;
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
public final class PostSessionLogsBookmarksRequest {
    private static final n[] $childSerializers;
    private final List<SessionLogBookmarkApiModel> createAndUpdateBookmarks;
    private final List<Long> removeBookmarks;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40467b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40466a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.domain.PostSessionLogsBookmarksRequest", aVar, 2);
            i2Var.r("remove_bookmarks", false);
            i2Var.r("create_and_update_bookmarks", false);
            descriptor = i2Var;
            f40467b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PostSessionLogsBookmarksRequest deserialize(e eVar) {
            List list;
            List list2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            n[] nVarArr = PostSessionLogsBookmarksRequest.$childSerializers;
            s2 s2Var = null;
            if (cVarD.l()) {
                list2 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                list = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list3 = null;
                List list4 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        list4 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list4);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        list3 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list3);
                        i11 |= 2;
                    }
                }
                list = list3;
                list2 = list4;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new PostSessionLogsBookmarksRequest(i10, list2, list, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, PostSessionLogsBookmarksRequest postSessionLogsBookmarksRequest) {
            t.f(fVar, "encoder");
            t.f(postSessionLogsBookmarksRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            PostSessionLogsBookmarksRequest.write$Self$Termius_app_googleProductionRelease(postSessionLogsBookmarksRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = PostSessionLogsBookmarksRequest.$childSerializers;
            return new hv.c[]{nVarArr[0].getValue(), nVarArr[1].getValue()};
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
            return a.f40466a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new iu.a() { // from class: to.q0
            @Override // iu.a
            public final Object a() {
                return PostSessionLogsBookmarksRequest._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: to.r0
            @Override // iu.a
            public final Object a() {
                return PostSessionLogsBookmarksRequest._childSerializers$_anonymous_$0();
            }
        })};
    }

    public /* synthetic */ PostSessionLogsBookmarksRequest(int i10, List list, List list2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f40466a.getDescriptor());
        }
        this.removeBookmarks = list;
        this.createAndUpdateBookmarks = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
        return new lv.f(SessionLogBookmarkApiModel.a.f40390a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostSessionLogsBookmarksRequest copy$default(PostSessionLogsBookmarksRequest postSessionLogsBookmarksRequest, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = postSessionLogsBookmarksRequest.removeBookmarks;
        }
        if ((i10 & 2) != 0) {
            list2 = postSessionLogsBookmarksRequest.createAndUpdateBookmarks;
        }
        return postSessionLogsBookmarksRequest.copy(list, list2);
    }

    @hv.o("create_and_update_bookmarks")
    public static /* synthetic */ void getCreateAndUpdateBookmarks$annotations() {
    }

    @hv.o("remove_bookmarks")
    public static /* synthetic */ void getRemoveBookmarks$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PostSessionLogsBookmarksRequest postSessionLogsBookmarksRequest, kv.d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), postSessionLogsBookmarksRequest.removeBookmarks);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), postSessionLogsBookmarksRequest.createAndUpdateBookmarks);
    }

    public final List<Long> component1() {
        return this.removeBookmarks;
    }

    public final List<SessionLogBookmarkApiModel> component2() {
        return this.createAndUpdateBookmarks;
    }

    public final PostSessionLogsBookmarksRequest copy(List<Long> list, List<SessionLogBookmarkApiModel> list2) {
        t.f(list, "removeBookmarks");
        t.f(list2, "createAndUpdateBookmarks");
        return new PostSessionLogsBookmarksRequest(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostSessionLogsBookmarksRequest)) {
            return false;
        }
        PostSessionLogsBookmarksRequest postSessionLogsBookmarksRequest = (PostSessionLogsBookmarksRequest) obj;
        return t.b(this.removeBookmarks, postSessionLogsBookmarksRequest.removeBookmarks) && t.b(this.createAndUpdateBookmarks, postSessionLogsBookmarksRequest.createAndUpdateBookmarks);
    }

    public final List<SessionLogBookmarkApiModel> getCreateAndUpdateBookmarks() {
        return this.createAndUpdateBookmarks;
    }

    public final List<Long> getRemoveBookmarks() {
        return this.removeBookmarks;
    }

    public int hashCode() {
        return (this.removeBookmarks.hashCode() * 31) + this.createAndUpdateBookmarks.hashCode();
    }

    public String toString() {
        return "PostSessionLogsBookmarksRequest(removeBookmarks=" + this.removeBookmarks + ", createAndUpdateBookmarks=" + this.createAndUpdateBookmarks + ")";
    }

    public PostSessionLogsBookmarksRequest(List<Long> list, List<SessionLogBookmarkApiModel> list2) {
        t.f(list, "removeBookmarks");
        t.f(list2, "createAndUpdateBookmarks");
        this.removeBookmarks = list;
        this.createAndUpdateBookmarks = list2;
    }
}
