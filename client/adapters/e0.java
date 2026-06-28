package com.server.auditor.ssh.client.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.adapters.e0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import qg.h7;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final iu.l f21294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f21295e;

    public final class a extends RecyclerView.e0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final h7 f21296u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final iu.l f21297v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ e0 f21298w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, h7 h7Var, iu.l lVar) {
            super(h7Var.b());
            ju.t.f(h7Var, "binding");
            ju.t.f(lVar, "onSnippetVariableClicked");
            this.f21298w = e0Var;
            this.f21296u = h7Var;
            this.f21297v = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void S(a aVar, String str, View view) {
            aVar.f21297v.invoke(str);
        }

        public final void R(final String str) {
            ju.t.f(str, "snippetVariable");
            this.f21296u.f72662b.setText(str);
            this.f21296u.f72662b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e0.a.S(this.f21282a, str, view);
                }
            });
        }
    }

    public e0(iu.l lVar) {
        ju.t.f(lVar, "onSnippetVariableClicked");
        this.f21294d = lVar;
        this.f21295e = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void z(a aVar, int i10) {
        ju.t.f(aVar, "holder");
        String str = (String) vt.v.l0(this.f21295e, i10);
        if (str != null) {
            aVar.R(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public a B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        h7 h7VarC = h7.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(h7VarC, "inflate(...)");
        return new a(this, h7VarC, this.f21294d);
    }

    public final void N(List list) {
        ju.t.f(list, "data");
        this.f21295e.clear();
        this.f21295e.addAll(list);
        o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21295e.size();
    }
}
