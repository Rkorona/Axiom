package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46806a;

    public n(Context context, int i10) {
        ju.t.f(context, "context");
        this.f46806a = (int) context.getResources().getDimension(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        ju.t.f(rect, "outRect");
        ju.t.f(view, "view");
        ju.t.f(recyclerView, "parent");
        ju.t.f(a0Var, "state");
        int i10 = this.f46806a;
        rect.right = i10;
        rect.left = i10;
    }
}
