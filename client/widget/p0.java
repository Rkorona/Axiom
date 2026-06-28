package com.server.auditor.ssh.client.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import io.split.android.client.dtos.SerializableEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends Drawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46836e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46837f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f46838g = tp.p.a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f46841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f46842d;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public p0(Context context) {
        ju.t.f(context, "context");
        this.f46839a = context;
        this.f46840b = "";
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(tp.c1.a(context, R.attr.textColor));
        paint.setTextSize(TypedValue.applyDimension(2, 14.0f, context.getResources().getDisplayMetrics()));
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f46841c = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(-7829368);
        this.f46842d = paint2;
    }

    private final void a(Canvas canvas, Rect rect, float f10, float f11, float f12, float f13) {
    }

    public final String b() {
        return this.f46840b;
    }

    public final void c(int i10) {
        this.f46842d.setColor(i10);
        invalidateSelf();
    }

    public final void d(String str) {
        ju.t.f(str, SerializableEvent.VALUE_FIELD);
        this.f46840b = str;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ju.t.f(canvas, "canvas");
        Rect rectCopyBounds = copyBounds();
        ju.t.e(rectCopyBounds, "copyBounds(...)");
        Paint.FontMetrics fontMetrics = this.f46841c.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = 2;
        float fCenterY = rectCopyBounds.centerY() + (((f10 - fontMetrics.top) / f11) - f10);
        float f12 = fCenterY + fontMetrics.ascent;
        float fM = fCenterY - tp.c0.m(this.f46841c);
        float f13 = fCenterY + fontMetrics.descent;
        float f14 = (fCenterY - fM) / f11;
        float fH = pu.m.h(rectCopyBounds.bottom - f14, rectCopyBounds.top + f14);
        canvas.drawRoundRect(new RectF(rectCopyBounds.left, f12 - fH, rectCopyBounds.right, fH + fCenterY), 30.0f, 30.0f, this.f46842d);
        canvas.drawText(this.f46840b, rectCopyBounds.centerX(), fCenterY, this.f46841c);
        a(canvas, rectCopyBounds, fCenterY, f12, fM, f13);
    }

    public final void e(int i10) {
        this.f46841c.setTextSize(TypedValue.applyDimension(2, i10, this.f46839a.getResources().getDisplayMetrics()));
        invalidateSelf();
    }

    public final void f(Typeface typeface) {
        ju.t.f(typeface, "typeface");
        this.f46841c.setTypeface(typeface);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f46841c.getFontMetricsInt(null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Paint paint = this.f46841c;
        String str = this.f46840b;
        return (int) (paint.measureText(str, 0, str.length()) + (f46838g * 2));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f46841c.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f46841c.setColorFilter(colorFilter);
    }
}
