package com.server.auditor.ssh.client.widget.textview;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ju.k;
import ju.t;
import pq.e;
import pq.h;

/* JADX INFO: loaded from: classes4.dex */
public final class RoundedBgTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46864b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46865c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f46866a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedBgTextView(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        t.f(canvas, "canvas");
        if ((getText() instanceof Spanned) && getLayout() != null) {
            int lineCount = getLayout().getLineCount() - 1;
            int ellipsisStart = (getEllipsize() != TextUtils.TruncateAt.END || getLayout().getEllipsisCount(lineCount) <= 0) ? -1 : getLayout().getEllipsisStart(lineCount);
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int iSave = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop);
            try {
                h hVar = this.f46866a;
                CharSequence text = getText();
                t.d(text, "null cannot be cast to non-null type android.text.Spanned");
                Layout layout = getLayout();
                t.e(layout, "getLayout(...)");
                hVar.d(canvas, (Spanned) text, layout, ellipsisStart);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedBgTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ RoundedBgTextView(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.textViewStyle : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedBgTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        e eVar = new e(context, attributeSet);
        this.f46866a = new h(eVar.f(), eVar.g(), eVar.e(), eVar.a(), eVar.b(), eVar.c(), eVar.d());
    }
}
