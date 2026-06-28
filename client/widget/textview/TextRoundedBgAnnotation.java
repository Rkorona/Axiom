package com.server.auditor.ssh.client.widget.textview;

import android.graphics.drawable.Drawable;
import android.text.Annotation;
import ju.k;

/* JADX INFO: loaded from: classes4.dex */
public final class TextRoundedBgAnnotation extends Annotation {
    public static final int $stable = 8;
    private Integer backgroundColor;
    private Drawable drawable;
    private Drawable drawableLeft;
    private Drawable drawableMid;
    private Drawable drawableRight;

    public TextRoundedBgAnnotation() {
        this(null, null, null, null, null, 31, null);
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final Drawable getDrawableLeft() {
        return this.drawableLeft;
    }

    public final Drawable getDrawableMid() {
        return this.drawableMid;
    }

    public final Drawable getDrawableRight() {
        return this.drawableRight;
    }

    public final void setBackgroundColor(Integer num) {
        this.backgroundColor = num;
    }

    public final void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public final void setDrawableLeft(Drawable drawable) {
        this.drawableLeft = drawable;
    }

    public final void setDrawableMid(Drawable drawable) {
        this.drawableMid = drawable;
    }

    public final void setDrawableRight(Drawable drawable) {
        this.drawableRight = drawable;
    }

    public /* synthetic */ TextRoundedBgAnnotation(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Integer num, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : drawable, (i10 & 2) != 0 ? null : drawable2, (i10 & 4) != 0 ? null : drawable3, (i10 & 8) != 0 ? null : drawable4, (i10 & 16) != 0 ? null : num);
    }

    public TextRoundedBgAnnotation(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Integer num) {
        super("", "rounded");
        this.drawable = drawable;
        this.drawableLeft = drawable2;
        this.drawableMid = drawable3;
        this.drawableRight = drawable4;
        this.backgroundColor = num;
    }
}
