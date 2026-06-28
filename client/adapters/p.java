package com.server.auditor.ssh.client.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import qg.m1;
import qg.r1;
import qg.u1;
import qg.w1;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends RecyclerView.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21355e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21356f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f21357d = new ArrayList();

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public final n L(int i10) {
        return (n) vt.v.s0(this.f21357d, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void z(ni.a aVar, int i10) {
        ju.t.f(aVar, "holder");
        Object obj = this.f21357d.get(i10);
        ju.t.e(obj, "get(...)");
        n nVar = (n) obj;
        if ((aVar instanceof ni.f) && (nVar instanceof r)) {
            com.server.auditor.ssh.client.fragments.viewholder.c.R(aVar, nVar, false, false, 6, null);
            return;
        }
        if ((aVar instanceof ni.e) && (nVar instanceof q)) {
            com.server.auditor.ssh.client.fragments.viewholder.c.R(aVar, nVar, false, false, 6, null);
            return;
        }
        if ((aVar instanceof ni.h) && (nVar instanceof s)) {
            com.server.auditor.ssh.client.fragments.viewholder.c.R(aVar, nVar, false, false, 6, null);
        } else {
            if (!(aVar instanceof ni.c) || !(nVar instanceof o)) {
                throw new IllegalArgumentException("Incorrect usage of this adapter class.");
            }
            com.server.auditor.ssh.client.fragments.viewholder.c.R(aVar, nVar, false, false, 6, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public ni.a B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == 0) {
            u1 u1VarC = u1.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(u1VarC, "inflate(...)");
            return new ni.f(u1VarC);
        }
        if (i10 == 1) {
            r1 r1VarC = r1.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(r1VarC, "inflate(...)");
            return new ni.e(r1VarC);
        }
        if (i10 == 2) {
            w1 w1VarC = w1.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(w1VarC, "inflate(...)");
            return new ni.h(w1VarC);
        }
        if (i10 != 3) {
            throw new IllegalArgumentException();
        }
        m1 m1VarC = m1.c(layoutInflaterFrom, viewGroup, false);
        ju.t.e(m1VarC, "inflate(...)");
        return new ni.c(m1VarC);
    }

    public final void O(List list) {
        ju.t.f(list, "newPlans");
        this.f21357d.clear();
        this.f21357d.addAll(list);
        o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21357d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int k(int i10) {
        n nVar = (n) this.f21357d.get(i10);
        if (nVar instanceof r) {
            return 0;
        }
        if (nVar instanceof q) {
            return 1;
        }
        if (nVar instanceof s) {
            return 2;
        }
        if (nVar instanceof o) {
            return 3;
        }
        throw new ut.s();
    }
}
