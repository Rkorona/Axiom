package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes4.dex */
public final class NarrowCroppedCircleGradientView extends ConstraintLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NarrowCroppedCircleGradientView(Context context) {
        this(context, null);
        ju.t.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NarrowCroppedCircleGradientView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        ju.t.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NarrowCroppedCircleGradientView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ju.t.f(context, "context");
        LayoutInflater.from(context).inflate(R.layout.narrow_cropped_circle_gradient, this);
    }
}
