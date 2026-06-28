package com.server.auditor.ssh.client.widget;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class DashRectangleView extends View {
    public static final a C = new a(null);
    public static final int D = 8;
    private final ValueAnimator A;
    private final ValueAnimator B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f46516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f46518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f46520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f46521f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Drawable f46522u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f46523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f46524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f46525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private iu.a f46526y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f46527z;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DashRectangleView.this.B.end();
            iu.a aVar = DashRectangleView.this.f46526y;
            if (aVar != null) {
                aVar.a();
            }
            DashRectangleView.this.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DashRectangleView(Context context) {
        this(context, null, 0, 6, null);
        ju.t.f(context, "context");
    }

    private final void e() {
        float length = this.f46518c[0] / r0.length;
        this.f46517b = length;
        this.B.setFloatValues(length, this.f46527z + length);
    }

    private final void f() {
        this.f46527z = new PathMeasure(this.f46516a, true).getLength();
    }

    private final void h(float f10) {
        float f11 = this.f46527z / this.f46519d;
        float f12 = 1.0f - f10;
        float f13 = f10 * f11;
        float f14 = f11 * f12;
        float[] fArr = this.f46518c;
        fArr[0] = f13;
        fArr[1] = f14;
    }

    private final void i(Drawable drawable) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float intrinsicWidth = drawable.getIntrinsicWidth() - this.f46524w;
        float intrinsicHeight = drawable.getIntrinsicHeight() - this.f46524w;
        float f10 = 2;
        int i10 = (int) (width - (intrinsicWidth / f10));
        int i11 = (int) (height - (intrinsicHeight / f10));
        drawable.setBounds(i10, i11, (int) (i10 + intrinsicWidth), (int) (i11 + intrinsicHeight));
    }

    private final void k(Canvas canvas) {
        q();
        canvas.drawPath(this.f46516a, this.f46521f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(DashRectangleView dashRectangleView, ValueAnimator valueAnimator) {
        ju.t.f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ju.t.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        dashRectangleView.h(((Float) animatedValue).floatValue());
        dashRectangleView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DashRectangleView dashRectangleView, ValueAnimator valueAnimator) {
        ju.t.f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ju.t.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        dashRectangleView.f46517b = -((Float) animatedValue).floatValue();
        dashRectangleView.invalidate();
    }

    private final void q() {
        this.f46521f.setPathEffect(new DashPathEffect(this.f46518c, this.f46517b));
    }

    private final void setDashPortion(float f10) {
        this.f46520e = f10;
        this.A.setFloatValues(f10, 1.0f);
    }

    public final void g() {
        float f10 = 2;
        float strokeWidth = this.f46521f.getStrokeWidth() / f10;
        float width = (getWidth() + (this.f46521f.getStrokeWidth() * f10)) * 0.24f;
        float height = (getHeight() + (this.f46521f.getStrokeWidth() * f10)) * 0.24f;
        this.f46516a.reset();
        float f11 = 0.0f + strokeWidth;
        this.f46516a.addRoundRect(new RectF(f11, f11, getWidth() - strokeWidth, getHeight() - strokeWidth), width, height, Path.Direction.CW);
    }

    public final void j(iu.a aVar) {
        ju.t.f(aVar, "onComplete");
        this.f46526y = aVar;
    }

    public final boolean m() {
        return this.A.isRunning();
    }

    public final boolean n() {
        return this.B.isRunning();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable;
        ju.t.f(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f46525x && (drawable = this.f46522u) != null) {
            drawable.draw(canvas);
        }
        k(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        g();
        Drawable drawable = this.f46522u;
        if (drawable != null) {
            i(drawable);
        }
        f();
        h(this.f46520e);
        e();
        q();
    }

    public final void p() {
        if (getVisibility() == 0 && getWindowVisibility() == 0 && !this.A.isRunning()) {
            if (!this.B.isRunning()) {
                this.B.start();
            }
            this.A.start();
        }
    }

    public final void r(float f10) {
        setIndeterminate(false);
        h(f10);
        setDashPortion(f10);
        invalidate();
    }

    public final void setColor(int i10) {
        this.f46521f.setColor(i10);
        invalidate();
    }

    public final void setIcon(Drawable drawable) {
        ju.t.f(drawable, "drawable");
        if (ju.t.b(this.f46522u, drawable)) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f46522u = drawableMutate;
        if (drawableMutate != null) {
            drawableMutate.setTint(this.f46523v);
        }
        Drawable drawable2 = this.f46522u;
        if (drawable2 != null) {
            i(drawable2);
        }
        invalidate();
    }

    public final void setIconColor(int i10) {
        this.f46523v = i10;
        Drawable drawable = this.f46522u;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f46522u;
        if (drawable2 != null) {
            drawable2.invalidateSelf();
        }
    }

    public final void setIconVisibility(boolean z10) {
        if (this.f46525x != z10) {
            this.f46525x = z10;
            invalidate();
        }
    }

    public final void setIndeterminate(boolean z10) {
        if (!z10) {
            if (this.B.isRunning()) {
                this.B.end();
            }
        } else {
            if (this.B.isRunning()) {
                return;
            }
            h(0.7f);
            e();
            setDashPortion(0.7f);
            this.B.start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DashRectangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ju.t.f(context, "context");
    }

    public /* synthetic */ DashRectangleView(Context context, AttributeSet attributeSet, int i10, int i11, ju.k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashRectangleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ju.t.f(context, "context");
        this.f46516a = new Path();
        this.f46518c = new float[]{0.5f, 0.5f};
        this.f46519d = 1;
        this.f46520e = 0.7f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.f46521f = paint;
        this.f46523v = androidx.core.content.a.getColor(context, R.color.white);
        this.f46524w = tp.p.a(0);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.server.auditor.ssh.client.widget.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DashRectangleView.l(this.f46798a, valueAnimator2);
            }
        });
        valueAnimator.addListener(new b());
        this.A = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setInterpolator(new LinearInterpolator());
        valueAnimator2.setDuration(2000L);
        valueAnimator2.setRepeatCount(-1);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.server.auditor.ssh.client.widget.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                DashRectangleView.o(this.f46802a, valueAnimator3);
            }
        });
        this.B = valueAnimator2;
        int[] iArr = cg.b.DashRingView;
        ju.t.e(iArr, "DashRingView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int iA = tp.c1.a(context, com.server.auditor.ssh.client.R.attr.colorAccent);
        int color = typedArrayObtainStyledAttributes.getColor(1, iA);
        this.f46523v = typedArrayObtainStyledAttributes.getColor(3, iA);
        this.f46525x = typedArrayObtainStyledAttributes.getBoolean(7, false);
        float dimension = typedArrayObtainStyledAttributes.getDimension(2, tp.p.a(4));
        this.f46524w = typedArrayObtainStyledAttributes.getDimension(6, tp.p.a(0));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.f46522u = drawableMutate;
        if (drawableMutate != null) {
            drawableMutate.setTint(this.f46523v);
        }
        this.f46519d = typedArrayObtainStyledAttributes.getInteger(4, 1);
        setDashPortion(typedArrayObtainStyledAttributes.getFraction(5, 1, 1, 0.7f));
        paint.setColor(color);
        paint.setStrokeWidth(dimension);
        paint.setStrokeCap(Paint.Cap.ROUND);
        typedArrayObtainStyledAttributes.recycle();
    }
}
