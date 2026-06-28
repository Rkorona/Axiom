package com.server.auditor.ssh.client.synchronization.api.models.teams;

import com.server.auditor.ssh.client.synchronization.api.models.teams.ListPendingInvitesResponse;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ListPendingInvitesResponse {
    private final List<InviteResult> results;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new a() { // from class: fn.b
        @Override // iu.a
        public final Object a() {
            return ListPendingInvitesResponse._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ListPendingInvitesResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ListPendingInvitesResponse(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, ListPendingInvitesResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.results = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(InviteResult$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListPendingInvitesResponse copy$default(ListPendingInvitesResponse listPendingInvitesResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = listPendingInvitesResponse.results;
        }
        return listPendingInvitesResponse.copy(list);
    }

    @hv.o("results")
    public static /* synthetic */ void getResults$annotations() {
    }

    public final List<InviteResult> component1() {
        return this.results;
    }

    public final ListPendingInvitesResponse copy(List<InviteResult> list) {
        t.f(list, "results");
        return new ListPendingInvitesResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListPendingInvitesResponse) && t.b(this.results, ((ListPendingInvitesResponse) obj).results);
    }

    public final List<InviteResult> getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.results.hashCode();
    }

    public String toString() {
        return "ListPendingInvitesResponse(results=" + this.results + ")";
    }

    public ListPendingInvitesResponse(List<InviteResult> list) {
        t.f(list, "results");
        this.results = list;
    }
}
