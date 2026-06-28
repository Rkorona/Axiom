package com.server.auditor.ssh.client.fragments.containers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public class MultiSwipeRefreshLayout extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f24718i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f24719j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final int f24720k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private View[] f24721l0;

    public MultiSwipeRefreshLayout(Context context) {
        super(context);
        this.f24720k0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private static boolean u(View view) {
        return view.canScrollVertically(-1);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public boolean c() {
        View[] viewArr = this.f24721l0;
        if (viewArr == null || viewArr.length <= 0) {
            return true;
        }
        for (View view : viewArr) {
            if (view != null && view.isShown() && !u(view)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f24718i0 = motionEvent.getX();
            this.f24719j0 = motionEvent.getY();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f24718i0);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f24719j0);
            if (fAbs > this.f24720k0 && fAbs > fAbs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        getParent().requestDisallowInterceptTouchEvent(z10);
    }

    public void setSwipeableChildren(int... iArr) {
        this.f24721l0 = new View[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f24721l0[i10] = findViewById(iArr[i10]);
        }
    }

    public MultiSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24720k0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
