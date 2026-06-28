package com.server.auditor.ssh.client.fragments.hostngroups;

import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.fragments.hostngroups.HostsRecyclerFragment;
import com.server.auditor.ssh.client.fragments.viewholder.j;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qg.f5;
import qg.o2;
import qg.o5;
import qg.x3;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends em.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f25098x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f25099y = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f25100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f25101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final l0 f25102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View.OnDragListener f25103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j.b f25104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final View.OnClickListener f25105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f25106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList f25107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String[] f25109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f25110t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List f25111u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private HostsRecyclerFragment.SelectionMode f25112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f25113w;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public k(SparseBooleanArray sparseBooleanArray, List list, l0 l0Var, View.OnDragListener onDragListener, j.b bVar, View.OnClickListener onClickListener) {
        ju.t.f(sparseBooleanArray, "selectedItemsArray");
        ju.t.f(list, "containerList");
        ju.t.f(l0Var, "mOnItemInteractListener");
        ju.t.f(onDragListener, "onItemDragListener");
        this.f25100j = sparseBooleanArray;
        this.f25101k = list;
        this.f25102l = l0Var;
        this.f25103m = onDragListener;
        this.f25104n = bVar;
        this.f25105o = onClickListener;
        this.f25107q = new ArrayList();
        this.f25109s = new String[0];
        this.f25110t = new ArrayList();
        this.f25111u = new ArrayList();
        this.f25112v = HostsRecyclerFragment.SelectionMode.Common;
        I(true);
    }

    private final long d0(GroupDBModel groupDBModel) {
        long idInDatabase = groupDBModel.getIdInDatabase();
        return (HostBulk.GROUP_ID_SERIAL_NAME + idInDatabase).hashCode();
    }

    private final long e0(Host host) {
        long id2 = host.getId();
        return ("host" + id2).hashCode();
    }

    private final void h0() {
        int iQ0 = q0();
        if (iQ0 >= 0) {
            p(iQ0);
        }
    }

    private final int q0() {
        Iterator it = this.f25101k.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((d) it.next()).a() == -1) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // em.b
    protected Integer P(long j10) {
        int size = this.f25101k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (j(i10) == j10) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    @Override // em.b
    public SparseBooleanArray S() {
        return this.f25100j;
    }

    public final long c0() {
        return this.f25106p;
    }

    public final List f0() {
        return this.f25110t;
    }

    public final List g0() {
        return this.f25111u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f25101k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void z(com.server.auditor.ssh.client.fragments.viewholder.c cVar, int i10) {
        ju.t.f(cVar, "holder");
        d dVar = (d) this.f25101k.get(i10);
        if ((cVar instanceof com.server.auditor.ssh.client.fragments.viewholder.g) && (dVar instanceof i)) {
            com.server.auditor.ssh.client.fragments.viewholder.g gVar = (com.server.auditor.ssh.client.fragments.viewholder.g) cVar;
            gVar.e0(this.f25109s);
            gVar.f0(this.f25110t);
            gVar.g0(this.f25111u);
            gVar.Q(dVar, W(i10), T(i10));
            return;
        }
        if ((cVar instanceof com.server.auditor.ssh.client.fragments.viewholder.e) && (dVar instanceof e)) {
            com.server.auditor.ssh.client.fragments.viewholder.e eVar = (com.server.auditor.ssh.client.fragments.viewholder.e) cVar;
            eVar.g0(this.f25109s);
            eVar.Q(dVar, W(i10), T(i10));
            return;
        }
        if (!(cVar instanceof com.server.auditor.ssh.client.fragments.viewholder.f) || !(dVar instanceof g)) {
            if ((cVar instanceof com.server.auditor.ssh.client.fragments.viewholder.h) && (dVar instanceof s0)) {
                com.server.auditor.ssh.client.fragments.viewholder.c.R(cVar, dVar, false, false, 6, null);
                return;
            } else {
                if ((cVar instanceof com.server.auditor.ssh.client.fragments.viewholder.j) && (dVar instanceof t0)) {
                    com.server.auditor.ssh.client.fragments.viewholder.c.R(cVar, dVar, false, false, 6, null);
                    return;
                }
                return;
            }
        }
        com.server.auditor.ssh.client.fragments.viewholder.c.R(cVar, dVar, false, false, 6, null);
        boolean z10 = false;
        if (i10 != q0()) {
            ((com.server.auditor.ssh.client.fragments.viewholder.f) cVar).S(false, vt.v.o());
            return;
        }
        com.server.auditor.ssh.client.fragments.viewholder.f fVar = (com.server.auditor.ssh.client.fragments.viewholder.f) cVar;
        if (this.f25108r && !this.f25113w) {
            z10 = true;
        }
        fVar.S(z10, this.f25107q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long j(int i10) {
        int i11;
        try {
            d dVar = (d) this.f25101k.get(i10);
            if (dVar instanceof g) {
                return ((g) dVar).b().hashCode();
            }
            if (dVar instanceof i) {
                return e0(((i) dVar).e());
            }
            if (dVar instanceof e) {
                return d0(((e) dVar).b());
            }
            if (dVar instanceof s0) {
                i11 = -588233312;
            } else if (dVar instanceof u0) {
                i11 = -1147980343;
            } else if (dVar instanceof t0) {
                i11 = -938105986;
            } else {
                if (!(dVar instanceof h)) {
                    throw new ut.s();
                }
                i11 = 926934164;
            }
            return i11;
        } catch (IndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public com.server.auditor.ssh.client.fragments.viewholder.c B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == -1) {
            o2 o2VarC = o2.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(o2VarC, "inflate(...)");
            return new com.server.auditor.ssh.client.fragments.viewholder.f(o2VarC, this.f25103m, this.f25105o);
        }
        if (i10 == 0) {
            x3 x3VarC = x3.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(x3VarC, "inflate(...)");
            return new com.server.auditor.ssh.client.fragments.viewholder.g(x3VarC, this.f25102l, this.f25112v, this.f25113w, this.f25103m);
        }
        if (i10 == 1) {
            x3 x3VarC2 = x3.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(x3VarC2, "inflate(...)");
            return new com.server.auditor.ssh.client.fragments.viewholder.e(x3VarC2, this.f25102l, this.f25103m);
        }
        if (i10 == 5) {
            f5 f5VarC = f5.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(f5VarC, "inflate(...)");
            return new com.server.auditor.ssh.client.fragments.viewholder.h(f5VarC, this.f25102l);
        }
        if (i10 != 11) {
            throw new IllegalArgumentException("Unsupported view type");
        }
        j.b bVar = this.f25104n;
        if (bVar == null) {
            throw new IllegalStateException("A callback for the RateUs cannot be null");
        }
        o5 o5VarC = o5.c(layoutInflaterFrom, viewGroup, false);
        ju.t.e(o5VarC, "inflate(...)");
        return new com.server.auditor.ssh.client.fragments.viewholder.j(o5VarC, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int k(int i10) {
        return ((d) this.f25101k.get(i10)).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void F(com.server.auditor.ssh.client.fragments.viewholder.c cVar) {
        ju.t.f(cVar, "holder");
        cVar.f10534a.setAlpha(1.0f);
    }

    public void l0(com.server.auditor.ssh.client.fragments.viewholder.e eVar) {
        ju.t.f(eVar, "groupViewHolder");
        eVar.a(1.0f);
    }

    public void m0(com.server.auditor.ssh.client.fragments.viewholder.e eVar) {
        ju.t.f(eVar, "groupViewHolder");
        eVar.a(0.8f);
    }

    public final void n0(String[] strArr) {
        ju.t.f(strArr, "<set-?>");
        this.f25109s = strArr;
    }

    public final void o0(HostsRecyclerFragment.SelectionMode selectionMode) {
        ju.t.f(selectionMode, "<set-?>");
        this.f25112v = selectionMode;
    }

    public final void p0(boolean z10) {
        this.f25108r = z10;
    }

    public final void r0(List list) {
        ju.t.f(list, "items");
        this.f25107q.clear();
        this.f25107q.addAll(list);
        h0();
    }
}
