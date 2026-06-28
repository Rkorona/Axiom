package com.server.auditor.ssh.client.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.adapters.x;
import java.util.List;
import qg.a2;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f21373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mq.g f21374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21375f;

    public final class a extends RecyclerView.e0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final a2 f21376u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final mq.g f21377v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ x f21378w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, a2 a2Var, mq.g gVar) {
            super(a2Var.b());
            ju.t.f(a2Var, "binding");
            ju.t.f(gVar, "actionListener");
            this.f21378w = xVar;
            this.f21376u = a2Var;
            this.f21377v = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void V(a aVar, int i10, View view) {
            aVar.f21377v.b(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void W(a aVar, int i10, View view) {
            aVar.f21377v.a(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void X(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Y(View view) {
        }

        public final void U(ut.u uVar, final int i10) {
            ju.t.f(uVar, "variable");
            this.f21376u.b().setEnabled(this.f21378w.f21375f);
            this.f21376u.f71866c.setEnabled(this.f21378w.f21375f);
            this.f21376u.f71865b.setEnabled(this.f21378w.f21375f);
            this.f21376u.f71866c.setText(uVar.c() + " = " + uVar.d());
            if (this.f21378w.f21375f) {
                this.f21376u.f71866c.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        x.a.V(this.f21369a, i10, view);
                    }
                });
                this.f21376u.f71865b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        x.a.W(this.f21371a, i10, view);
                    }
                });
            } else {
                this.f21376u.f71866c.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        x.a.X(view);
                    }
                });
                this.f21376u.f71865b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        x.a.Y(view);
                    }
                });
            }
        }
    }

    public x(List list, mq.g gVar) {
        ju.t.f(list, "variables");
        ju.t.f(gVar, "actionListener");
        this.f21373d = list;
        this.f21374e = gVar;
        this.f21375f = true;
        I(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void z(a aVar, int i10) {
        ju.t.f(aVar, "holder");
        aVar.U((ut.u) this.f21373d.get(i10), i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public a B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        a2 a2VarC = a2.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(a2VarC, "inflate(...)");
        return new a(this, a2VarC, this.f21374e);
    }

    public final void O(boolean z10) {
        this.f21375f = z10;
    }

    public final void P(List list) {
        ju.t.f(list, "updatedVariables");
        this.f21373d.clear();
        this.f21373d.addAll(list);
        o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21373d.size();
    }
}
