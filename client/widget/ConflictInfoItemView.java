package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;

/* JADX INFO: loaded from: classes4.dex */
public final class ConflictInfoItemView extends ConstraintLayout {
    private qg.s0 N;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConflictInfoItemView(Context context) {
        this(context, null, 0, 0, 14, null);
        ju.t.f(context, "context");
    }

    private final qg.s0 getBinding() {
        qg.s0 s0Var = this.N;
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException();
    }

    public final void setParameters(ConflictsArgData conflictsArgData) {
        ju.t.f(conflictsArgData, "conflictData");
        getBinding().f73762c.setText(conflictsArgData.getHeader());
        getBinding().f73761b.setText(conflictsArgData.getFooter());
        Integer iconResId = conflictsArgData.getIconResId();
        if (iconResId != null) {
            getBinding().f73763d.setImageResource(iconResId.intValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConflictInfoItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        ju.t.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConflictInfoItemView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        ju.t.f(context, "context");
    }

    public /* synthetic */ ConflictInfoItemView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, ju.k kVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConflictInfoItemView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        ju.t.f(context, "context");
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        this.N = qg.s0.b(LayoutInflater.from(context), this, true);
    }
}
