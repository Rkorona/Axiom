package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class ScrollableViewPager extends ViewPager {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f46555y0;

    public class a extends Scroller {
        public a(Context context) {
            super(context, new DecelerateInterpolator());
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, 500);
        }
    }

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46555y0 = false;
        T();
    }

    private void T() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("x");
            declaredField.setAccessible(true);
            declaredField.set(this, new a(getContext()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void R() {
        this.f46555y0 = true;
    }

    public void S() {
        this.f46555y0 = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f46555y0) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }
}
