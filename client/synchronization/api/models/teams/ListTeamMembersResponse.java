package com.server.auditor.ssh.client.synchronization.api.models.teams;

import com.server.auditor.ssh.client.synchronization.api.models.teams.ListTeamMembersResponse;
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
public final class ListTeamMembersResponse {
    private final int count;
    private final String next;
    private final String previous;
    private final List<TeamMemberResult> results;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new a() { // from class: fn.c
        @Override // iu.a
        public final Object a() {
            return ListTeamMembersResponse._childSerializers$_anonymous_();
        }
    }), null, null, null};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ListTeamMembersResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ListTeamMembersResponse(int i10, List list, int i11, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, ListTeamMembersResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.results = list;
        this.count = i11;
        if ((i10 & 4) == 0) {
            this.previous = null;
        } else {
            this.previous = str;
        }
        if ((i10 & 8) == 0) {
            this.next = null;
        } else {
            this.next = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(TeamMemberResult$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListTeamMembersResponse copy$default(ListTeamMembersResponse listTeamMembersResponse, List list, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = listTeamMembersResponse.results;
        }
        if ((i11 & 2) != 0) {
            i10 = listTeamMembersResponse.count;
        }
        if ((i11 & 4) != 0) {
            str = listTeamMembersResponse.previous;
        }
        if ((i11 & 8) != 0) {
            str2 = listTeamMembersResponse.next;
        }
        return listTeamMembersResponse.copy(list, i10, str, str2);
    }

    @hv.o("count")
    public static /* synthetic */ void getCount$annotations() {
    }

    @hv.o("next")
    public static /* synthetic */ void getNext$annotations() {
    }

    @hv.o("previous")
    public static /* synthetic */ void getPrevious$annotations() {
    }

    @hv.o("results")
    public static /* synthetic */ void getResults$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ListTeamMembersResponse listTeamMembersResponse, d dVar, jv.f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), listTeamMembersResponse.results);
        dVar.t(fVar, 1, listTeamMembersResponse.count);
        if (dVar.E(fVar, 2) || listTeamMembersResponse.previous != null) {
            dVar.v(fVar, 2, x2.f64817a, listTeamMembersResponse.previous);
        }
        if (!dVar.E(fVar, 3) && listTeamMembersResponse.next == null) {
            return;
        }
        dVar.v(fVar, 3, x2.f64817a, listTeamMembersResponse.next);
    }

    public final List<TeamMemberResult> component1() {
        return this.results;
    }

    public final int component2() {
        return this.count;
    }

    public final String component3() {
        return this.previous;
    }

    public final String component4() {
        return this.next;
    }

    public final ListTeamMembersResponse copy(List<TeamMemberResult> list, int i10, String str, String str2) {
        t.f(list, "results");
        return new ListTeamMembersResponse(list, i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTeamMembersResponse)) {
            return false;
        }
        ListTeamMembersResponse listTeamMembersResponse = (ListTeamMembersResponse) obj;
        return t.b(this.results, listTeamMembersResponse.results) && this.count == listTeamMembersResponse.count && t.b(this.previous, listTeamMembersResponse.previous) && t.b(this.next, listTeamMembersResponse.next);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public final List<TeamMemberResult> getResults() {
        return this.results;
    }

    public int hashCode() {
        int iHashCode = ((this.results.hashCode() * 31) + Integer.hashCode(this.count)) * 31;
        String str = this.previous;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.next;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ListTeamMembersResponse(results=" + this.results + ", count=" + this.count + ", previous=" + this.previous + ", next=" + this.next + ")";
    }

    public ListTeamMembersResponse(List<TeamMemberResult> list, int i10, String str, String str2) {
        t.f(list, "results");
        this.results = list;
        this.count = i10;
        this.previous = str;
        this.next = str2;
    }

    public /* synthetic */ ListTeamMembersResponse(List list, int i10, String str, String str2, int i11, k kVar) {
        this(list, i10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2);
    }
}
