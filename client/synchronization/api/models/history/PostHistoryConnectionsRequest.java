package com.server.auditor.ssh.client.synchronization.api.models.history;

import com.server.auditor.ssh.client.synchronization.api.models.PostHistoryConnectionModel;
import com.server.auditor.ssh.client.synchronization.api.models.PostHistoryConnectionModel$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.history.PostHistoryConnectionsRequest;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class PostHistoryConnectionsRequest {
    private final List<PostHistoryConnectionModel> historyConnections;
    private final String revision;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new a() { // from class: an.c
        @Override // iu.a
        public final Object a() {
            return PostHistoryConnectionsRequest._childSerializers$_anonymous_();
        }
    }), null};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return PostHistoryConnectionsRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ PostHistoryConnectionsRequest(int i10, List list, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, PostHistoryConnectionsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.historyConnections = list;
        if ((i10 & 2) == 0) {
            this.revision = null;
        } else {
            this.revision = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(PostHistoryConnectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostHistoryConnectionsRequest copy$default(PostHistoryConnectionsRequest postHistoryConnectionsRequest, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = postHistoryConnectionsRequest.historyConnections;
        }
        if ((i10 & 2) != 0) {
            str = postHistoryConnectionsRequest.revision;
        }
        return postHistoryConnectionsRequest.copy(list, str);
    }

    @hv.o("historyconnection_set")
    public static /* synthetic */ void getHistoryConnections$annotations() {
    }

    @hv.o("revision")
    public static /* synthetic */ void getRevision$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PostHistoryConnectionsRequest postHistoryConnectionsRequest, d dVar, jv.f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), postHistoryConnectionsRequest.historyConnections);
        if (!dVar.E(fVar, 1) && postHistoryConnectionsRequest.revision == null) {
            return;
        }
        dVar.v(fVar, 1, x2.f64817a, postHistoryConnectionsRequest.revision);
    }

    public final List<PostHistoryConnectionModel> component1() {
        return this.historyConnections;
    }

    public final String component2() {
        return this.revision;
    }

    public final PostHistoryConnectionsRequest copy(List<PostHistoryConnectionModel> list, String str) {
        t.f(list, "historyConnections");
        return new PostHistoryConnectionsRequest(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostHistoryConnectionsRequest)) {
            return false;
        }
        PostHistoryConnectionsRequest postHistoryConnectionsRequest = (PostHistoryConnectionsRequest) obj;
        return t.b(this.historyConnections, postHistoryConnectionsRequest.historyConnections) && t.b(this.revision, postHistoryConnectionsRequest.revision);
    }

    public final List<PostHistoryConnectionModel> getHistoryConnections() {
        return this.historyConnections;
    }

    public final String getRevision() {
        return this.revision;
    }

    public int hashCode() {
        int iHashCode = this.historyConnections.hashCode() * 31;
        String str = this.revision;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PostHistoryConnectionsRequest(historyConnections=" + this.historyConnections + ", revision=" + this.revision + ")";
    }

    public PostHistoryConnectionsRequest(List<PostHistoryConnectionModel> list, String str) {
        t.f(list, "historyConnections");
        this.historyConnections = list;
        this.revision = str;
    }

    public /* synthetic */ PostHistoryConnectionsRequest(List list, String str, int i10, k kVar) {
        this(list, (i10 & 2) != 0 ? null : str);
    }
}
