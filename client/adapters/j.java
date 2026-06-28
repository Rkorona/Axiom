package com.server.auditor.ssh.client.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.server.auditor.ssh.client.widget.ProgressButton;
import java.util.Iterator;
import java.util.List;
import qg.w3;
import qg.w5;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends RecyclerView.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f21324f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21325g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f21326h = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final iu.p f21327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.recyclerview.widget.d f21328e;

    public static final class a extends j.f {
        a() {
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(h hVar, h hVar2) {
            ju.t.f(hVar, "oldItem");
            ju.t.f(hVar2, "newItem");
            return ju.t.b(hVar, hVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar, h hVar2) {
            ju.t.f(hVar, "oldItem");
            ju.t.f(hVar2, "newItem");
            return hVar.c() == hVar2.c();
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public j(iu.p pVar) {
        ju.t.f(pVar, "onActionButtonClicked");
        this.f21327d = pVar;
        this.f21328e = new androidx.recyclerview.widget.d(this, f21326h);
        I(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(j jVar, mi.g gVar, View view) {
        jVar.f21327d.invoke(Integer.valueOf(gVar.m()), null);
    }

    public final h M(int i10) {
        h hVar = (h) this.f21328e.a().get(i10);
        if (hVar == null) {
            return null;
        }
        return hVar;
    }

    public final int N(int i10) {
        List listA = this.f21328e.a();
        ju.t.e(listA, "getCurrentList(...)");
        Iterator it = listA.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((h) it.next()).c() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void z(mi.a aVar, int i10) {
        ju.t.f(aVar, "holder");
        h hVarM = M(i10);
        if ((aVar instanceof mi.c) && (hVarM instanceof y)) {
            ((mi.c) aVar).T((y) hVarM);
            return;
        }
        if ((aVar instanceof mi.g) && (hVarM instanceof y)) {
            ((mi.g) aVar).S((y) hVarM);
            return;
        }
        if ((aVar instanceof mi.h) && (hVarM instanceof y)) {
            ((mi.h) aVar).R((y) hVarM);
        } else if ((aVar instanceof mi.f) && (hVarM instanceof m)) {
            ((mi.f) aVar).W((m) hVarM);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public mi.a B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == 1) {
            qg.g0 g0VarC = qg.g0.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(g0VarC, "inflate(...)");
            return new mi.c(g0VarC);
        }
        if (i10 == 2) {
            w3 w3VarC = w3.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(w3VarC, "inflate(...)");
            final mi.g gVar = new mi.g(w3VarC);
            gVar.R().f74247b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j.Q(this.f21322a, gVar, view);
                }
            });
            return gVar;
        }
        if (i10 == 4) {
            w5 w5VarC = w5.c(layoutInflaterFrom, viewGroup, false);
            ju.t.e(w5VarC, "inflate(...)");
            return new mi.h(w5VarC);
        }
        if (i10 != 5) {
            throw new IllegalArgumentException();
        }
        qg.a aVarC = qg.a.c(layoutInflaterFrom, viewGroup, false);
        ju.t.e(aVarC, "inflate(...)");
        return new mi.f(aVarC, this.f21327d);
    }

    public final void R(List list) {
        ju.t.f(list, "data");
        this.f21328e.d(list);
    }

    public final void S(int i10, ProgressButton.b bVar) {
        ju.t.f(bVar, "progressButtonState");
        int iN = N(i10);
        if (iN < 0 || iN >= i()) {
            return;
        }
        h hVarM = M(iN);
        m mVar = hVarM instanceof m ? (m) hVarM : null;
        if (mVar != null) {
            mVar.o(bVar);
        }
        p(iN);
    }

    public final void T(int i10, String str) {
        int iN = N(i10);
        if (iN < 0 || iN >= i()) {
            return;
        }
        h hVarM = M(iN);
        m mVar = hVarM instanceof m ? (m) hVarM : null;
        if (mVar != null) {
            mVar.p(str);
        }
        p(iN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21328e.a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long j(int i10) {
        try {
            return Integer.hashCode(((h) this.f21328e.a().get(i10)).c());
        } catch (IndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int k(int i10) {
        String strG = ((h) this.f21328e.a().get(i10)).g();
        int iHashCode = strG.hashCode();
        return iHashCode != -1392163930 ? iHashCode != 329662937 ? (iHashCode == 646056505 && strG.equals("termius-message://migrate-to-new-crypto")) ? 2 : 1 : !strG.equals("termius-message://kex") ? 1 : 5 : !strG.equals("termius-message://rooted") ? 1 : 4;
    }
}
