package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class TerminalTabLayout extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46566f = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f46567u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f46568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f46569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f46570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46572e;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TerminalTabLayout(Context context) {
        this(context, null, 0, 0, 14, null);
        ju.t.f(context, "context");
    }

    private final void a(int i10, int i11) {
        RectF rectF = this.f46570c;
        rectF.left = this.f46572e;
        rectF.top = 0.0f;
        rectF.right = i10 - r1;
        rectF.bottom = i11;
    }

    private final void b(Canvas canvas) {
        Path path = this.f46569b;
        path.reset();
        RectF rectF = this.f46570c;
        float f10 = rectF.left;
        float f11 = rectF.top;
        int i10 = this.f46571d;
        path.arcTo(f10, f11, (i10 * 2) + f10, (i10 * 2) + f11, 180.0f, 90.0f, false);
        RectF rectF2 = this.f46570c;
        float f12 = rectF2.right;
        int i11 = this.f46571d;
        float f13 = rectF2.top;
        path.arcTo(f12 - (i11 * 2), f13, f12, (i11 * 2) + f13, 270.0f, 90.0f, false);
        if (isSelected()) {
            RectF rectF3 = this.f46570c;
            float f14 = rectF3.right;
            float f15 = rectF3.bottom;
            int i12 = this.f46572e;
            path.arcTo(f14, f15 - (i12 * 2), (i12 * 2) + f14, f15, 180.0f, -90.0f, false);
            RectF rectF4 = this.f46570c;
            float f16 = rectF4.left;
            int i13 = this.f46572e;
            float f17 = rectF4.bottom;
            path.arcTo(f16 - (i13 * 2), f17 - (i13 * 2), f16, f17, 90.0f, -90.0f, false);
        } else {
            RectF rectF5 = this.f46570c;
            path.lineTo(rectF5.right, rectF5.bottom);
            RectF rectF6 = this.f46570c;
            path.lineTo(rectF6.left, rectF6.bottom);
        }
        path.close();
        canvas.drawPath(this.f46569b, this.f46568a);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        ju.t.f(canvas, "canvas");
        b(canvas);
        canvas.save();
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a(i10, i11);
    }

    public final void setTabColor(int i10) {
        this.f46568a.setColor(i10);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TerminalTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        ju.t.f(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(attributeSet);
        int i10 = this.f46572e;
        layoutParamsGenerateLayoutParams.setMargins(layoutParamsGenerateLayoutParams.leftMargin + i10, layoutParamsGenerateLayoutParams.topMargin, layoutParamsGenerateLayoutParams.rightMargin + i10, layoutParamsGenerateLayoutParams.bottomMargin);
        ju.t.c(layoutParamsGenerateLayoutParams);
        return layoutParamsGenerateLayoutParams;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TerminalTabLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        ju.t.f(context, "context");
    }

    public /* synthetic */ TerminalTabLayout(Context context, AttributeSet attributeSet, int i10, int i11, int i12, ju.k kVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminalTabLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        ju.t.f(context, "context");
        Paint paint = new Paint(1);
        this.f46568a = paint;
        this.f46569b = new Path();
        this.f46570c = new RectF();
        this.f46571d = tp.p.a(12);
        this.f46572e = tp.p.a(2);
        setWillNotDraw(false);
        int[] iArr = cg.b.TerminalTabLayout;
        ju.t.e(iArr, "TerminalTabLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int color = typedArrayObtainStyledAttributes.getColor(1, -12303292);
        this.f46571d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.f46571d);
        this.f46572e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f46572e);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        typedArrayObtainStyledAttributes.recycle();
    }
}
