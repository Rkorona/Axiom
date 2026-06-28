package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends androidx.recyclerview.widget.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46676f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46677g = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Drawable f46678e;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context) {
        super(context, 1);
        ju.t.f(context, "context");
        this.f46678e = l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        ju.t.f(canvas, "canvas");
        ju.t.f(recyclerView, "parent");
        ju.t.f(a0Var, "state");
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            TextView textView = (TextView) childAt.findViewById(R.id.label);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ju.t.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.q qVar = (RecyclerView.q) layoutParams;
            Drawable drawable = this.f46678e;
            if (drawable != null) {
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
                drawable.setBounds(recyclerView.getPaddingLeft() + (textView != null ? Float.valueOf(textView.getX()) : 0).intValue(), bottom, width, drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
            }
        }
    }

    public final void n(int i10) {
        Drawable drawable = this.f46678e;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f46678e;
        if (drawable2 != null) {
            drawable2.invalidateSelf();
        }
    }
}
