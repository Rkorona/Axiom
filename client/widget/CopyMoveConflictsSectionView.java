package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CopyMoveConflictsSectionView extends ConstraintLayout {
    public static final a O = new a(null);
    public static final int P = 8;
    private qg.w0 N;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CopyMoveConflictsSectionView(Context context) {
        this(context, null, 0, 0, 14, null);
        ju.t.f(context, "context");
    }

    private final qg.w0 getBinding() {
        qg.w0 w0Var = this.N;
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException();
    }

    private final void setInternalParameters(List<ConflictsArgData> list) {
        for (ConflictsArgData conflictsArgData : list) {
            Context context = getContext();
            ju.t.e(context, "getContext(...)");
            ConflictInfoItemView conflictInfoItemView = new ConflictInfoItemView(context, null, 0, 0, 14, null);
            conflictInfoItemView.setParameters(conflictsArgData);
            getBinding().f74210e.addView(conflictInfoItemView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(CopyMoveConflictsSectionView copyMoveConflictsSectionView, View view) {
        LinearLayoutCompat linearLayoutCompat = copyMoveConflictsSectionView.getBinding().f74210e;
        ju.t.e(linearLayoutCompat, "listLayout");
        LinearLayoutCompat linearLayoutCompat2 = copyMoveConflictsSectionView.getBinding().f74210e;
        ju.t.e(linearLayoutCompat2, "listLayout");
        linearLayoutCompat.setVisibility(linearLayoutCompat2.getVisibility() == 0 ? 8 : 0);
        copyMoveConflictsSectionView.getBinding().f74211f.animate().rotationBy(180.0f);
    }

    private final int y(Class cls) {
        Integer num = (Integer) eq.b0.f48942a.n().get(cls);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final String z(Class cls, int i10) {
        Integer num = (Integer) eq.b0.f48942a.o().get(cls);
        if (num == null) {
            return "";
        }
        String quantityString = getBinding().b().getContext().getResources().getQuantityString(num.intValue(), i10, Integer.valueOf(i10));
        ju.t.e(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public final void setParameters(List<ConflictsArgData> list) {
        ju.t.f(list, "conflicts");
        int size = list.size();
        Class<? extends SyncableModel> entityType = list.get(0).getEntityType();
        getBinding().f74208c.setText(z(entityType, size));
        getBinding().f74207b.setImageResource(y(entityType));
        setInternalParameters(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CopyMoveConflictsSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        ju.t.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CopyMoveConflictsSectionView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        ju.t.f(context, "context");
    }

    public /* synthetic */ CopyMoveConflictsSectionView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, ju.k kVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyMoveConflictsSectionView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        ju.t.f(context, "context");
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        this.N = qg.w0.c(LayoutInflater.from(context), this, true);
        getBinding().f74211f.setRotation(180.0f);
        getBinding().b().setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CopyMoveConflictsSectionView.x(this.f46679a, view);
            }
        });
    }
}
