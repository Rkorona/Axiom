package com.server.auditor.ssh.client.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.adapters.l;
import com.server.auditor.ssh.client.database.Column;
import java.util.List;
import qg.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f21331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mq.d f21332e;

    public final class a extends RecyclerView.e0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final i0 f21333u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ l f21334v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, i0 i0Var) {
            super(i0Var.b());
            ju.t.f(i0Var, "binding");
            this.f21334v = lVar;
            this.f21333u = i0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void S(l lVar, String str, View view) {
            lVar.f21332e.g2(str);
        }

        public final void R(final String str) {
            ju.t.f(str, Column.CHARSET);
            this.f21333u.f72683b.setText(str);
            ConstraintLayout constraintLayoutB = this.f21333u.b();
            final l lVar = this.f21334v;
            constraintLayoutB.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.a.S(lVar, str, view);
                }
            });
        }
    }

    public l(List list, mq.d dVar) {
        ju.t.f(list, "charsetList");
        ju.t.f(dVar, "chooseListener");
        this.f21331d = list;
        this.f21332e = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void z(a aVar, int i10) {
        ju.t.f(aVar, "holder");
        aVar.R((String) this.f21331d.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public a B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        i0 i0VarC = i0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(i0VarC, "inflate(...)");
        return new a(this, i0VarC);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21331d.size();
    }
}
