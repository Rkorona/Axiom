package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.server.auditor.ssh.client.R;
import tp.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class ToolbarImageButtonWithOvalRipple extends AppCompatImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarImageButtonWithOvalRipple(Context context) {
        this(context, null, 0, 6, null);
        ju.t.f(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g1.a(this, getResources().getDimensionPixelSize(R.dimen.back_button_ripple_padding));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarImageButtonWithOvalRipple(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ju.t.f(context, "context");
    }

    public /* synthetic */ ToolbarImageButtonWithOvalRipple(Context context, AttributeSet attributeSet, int i10, int i11, ju.k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarImageButtonWithOvalRipple(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ju.t.f(context, "context");
    }
}
