package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ChoosePlansViewPager extends ViewPager {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f28118y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final a f28117z0 = new a(null);
    public static final int A0 = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChoosePlansViewPager(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        ju.t.f(context, "context");
    }

    private final void R() {
        if (this.f28118y0 && getChildCount() > 0) {
            int measuredWidth = getMeasuredWidth();
            int dimensionPixelSize = getResources().getBoolean(R.bool.isTablet) ? getResources().getDimensionPixelSize(R.dimen.common_tablet_maximum_width) + 100 : measuredWidth;
            if (measuredWidth > 0) {
                this.f28118y0 = false;
                setPageMargin(-(measuredWidth - dimensionPixelSize));
                setOffscreenPageLimit(((int) Math.ceil(measuredWidth / dimensionPixelSize)) + 1);
                requestLayout();
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        R();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f28118y0 = true;
    }

    public /* synthetic */ ChoosePlansViewPager(Context context, AttributeSet attributeSet, int i10, ju.k kVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChoosePlansViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ju.t.f(context, "context");
        this.f28118y0 = true;
        setClipChildren(false);
    }
}
