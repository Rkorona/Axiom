package com.server.auditor.ssh.client.fragments.hostngroups;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.fragments.hostngroups.HostsRecyclerFragment;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import java.util.List;
import qg.o2;
import qg.x3;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends em.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f25155o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f25156p = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f25157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l0 f25158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String[] f25159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HostsRecyclerFragment.SelectionMode f25160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25161n;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public n0(List list, l0 l0Var) {
        ju.t.f(list, "containerList");
        ju.t.f(l0Var, "onItemInteractListener");
        this.f25157j = list;
        this.f25158k = l0Var;
        this.f25159l = new String[0];
        this.f25160m = HostsRecyclerFragment.SelectionMode.Common;
        I(true);
    }

    private final long c0(GroupDBModel groupDBModel) {
        long idInDatabase = groupDBModel.getIdInDatabase();
        return (HostBulk.GROUP_ID_SERIAL_NAME + idInDatabase).hashCode();
    }

    private final long d0(Host host) {
        long id2 = host.getId();
        return ("host" + id2).hashCode();
    }

    @Override // em.b
    protected Integer P(long j10) {
        int size = this.f25157j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (j(i10) == j10) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void z(com.server.auditor.ssh.client.fragments.viewholder.c cVar, int i10) {
        ju.t.f(cVar, "holder");
        d dVar = (d) this.f25157j.get(i10);
        if ((cVar instanceof com.server.auditor.ssh.client.fragments.viewholder.g) && (dVar instanceof i)) {
            ((com.server.auditor.ssh.client.fragments.viewholder.g) cVar).e0(this.f25159l);
            com.server.auditor.ssh.client.fragments.viewholder.c.R(cVar, dVar, W(i10), false, 4, null);
        } else if ((cVar instanceof com.server.auditor.ssh.client.fragments.viewholder.e) && (dVar instanceof e)) {
            ((com.server.auditor.ssh.client.fragments.viewholder.e) cVar).g0(this.f25159l);
            com.server.auditor.ssh.client.fragments.viewholder.c.R(cVar, dVar, W(i10), false, 4, null);
        } else if ((cVar instanceof com.server.auditor.ssh.client.fragments.viewholder.f) && (dVar instanceof g)) {
            com.server.auditor.ssh.client.fragments.viewholder.c.R(cVar, dVar, W(i10), false, 4, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public com.server.auditor.ssh.client.fragments.viewholder.c B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == -1) {
            o2 o2VarC = o2.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(o2VarC, "inflate(...)");
            return new com.server.auditor.ssh.client.fragments.viewholder.f(o2VarC, null, null, 6, null);
        }
        if (i10 == 0) {
            x3 x3VarC = x3.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(x3VarC, "inflate(...)");
            return new com.server.auditor.ssh.client.fragments.viewholder.g(x3VarC, this.f25158k, this.f25160m, this.f25161n, null, 16, null);
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unsupported view type");
        }
        x3 x3VarC2 = x3.c(layoutInflaterFrom, viewGroup, false);
        ju.t.e(x3VarC2, "inflate(...)");
        return new com.server.auditor.ssh.client.fragments.viewholder.e(x3VarC2, this.f25158k, null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f25157j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long j(int i10) {
        try {
            d dVar = (d) this.f25157j.get(i10);
            if (dVar instanceof g) {
                return ((g) dVar).b().hashCode();
            }
            if (dVar instanceof i) {
                return d0(((i) dVar).e());
            }
            if (dVar instanceof e) {
                return c0(((e) dVar).b());
            }
            return -1L;
        } catch (IndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int k(int i10) {
        return ((d) this.f25157j.get(i10)).a();
    }
}
