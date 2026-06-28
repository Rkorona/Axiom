package com.server.auditor.ssh.client.fragments.viewholder;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import ju.k;
import ju.t;
import qg.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final o2 f27003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final View.OnClickListener f27004w;

    public /* synthetic */ f(o2 o2Var, View.OnDragListener onDragListener, View.OnClickListener onClickListener, int i10, k kVar) {
        this(o2Var, (i10 & 2) != 0 ? null : onDragListener, (i10 & 4) != 0 ? null : onClickListener);
    }

    public final void S(boolean z10, List list) {
        t.f(list, "teamOnlineList");
        this.f27003v.f73371c.setVisibility(z10 ? 0 : 4);
        this.f27003v.f73371c.z(list);
        if (z10) {
            this.f27003v.f73371c.setOnClickListener(this.f27004w);
        } else {
            this.f27003v.f73371c.setOnClickListener(null);
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.viewholder.c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void Q(com.server.auditor.ssh.client.fragments.hostngroups.g gVar, boolean z10, boolean z11) {
        t.f(gVar, "item");
        this.f27003v.f73370b.setText(gVar.b());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(o2 o2Var, View.OnDragListener onDragListener, View.OnClickListener onClickListener) {
        t.f(o2Var, "binding");
        ConstraintLayout constraintLayoutB = o2Var.b();
        t.e(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB);
        this.f27003v = o2Var;
        this.f27004w = onClickListener;
        this.f10534a.setOnDragListener(onDragListener);
    }
}
