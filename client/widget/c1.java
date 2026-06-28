package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends androidx.recyclerview.widget.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f46668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f46669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Drawable f46670g;

    public /* synthetic */ c1(Context context, Integer num, int i10, int i11, ju.k kVar) {
        this(context, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        ju.t.f(canvas, "canvas");
        ju.t.f(recyclerView, "parent");
        ju.t.f(a0Var, "state");
        int paddingLeft = recyclerView.getPaddingLeft() + this.f46669f;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f46669f;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ju.t.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.q qVar = (RecyclerView.q) layoutParams;
            Drawable drawable = this.f46670g;
            if (drawable != null) {
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
                Integer num = this.f46668e;
                drawable.setBounds(paddingLeft, bottom, width, (num != null ? num.intValue() : drawable.getIntrinsicHeight()) + bottom);
                drawable.draw(canvas);
            }
        }
    }

    public final void n(int i10) {
        Drawable drawable = this.f46670g;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f46670g;
        if (drawable2 != null) {
            drawable2.invalidateSelf();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Context context, Integer num, int i10) {
        super(context, 1);
        ju.t.f(context, "context");
        this.f46668e = num;
        this.f46669f = i10;
        this.f46670g = l();
    }
}
