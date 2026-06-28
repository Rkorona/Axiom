package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.server.auditor.ssh.client.widget.editors.BackspaceTypeEditorLayout;
import ju.k;
import ju.t;
import mq.b;
import qg.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class BackspaceTypeEditorLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b0 f46685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f46686b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackspaceTypeEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BackspaceTypeEditorLayout backspaceTypeEditorLayout, CompoundButton compoundButton, boolean z10) {
        backspaceTypeEditorLayout.setBackspaceType(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BackspaceTypeEditorLayout backspaceTypeEditorLayout, View view) {
        backspaceTypeEditorLayout.getBinding().f71944d.setChecked(!backspaceTypeEditorLayout.getBinding().f71944d.isChecked());
    }

    private final b0 getBinding() {
        b0 b0Var = this.f46685a;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException();
    }

    public final void setBackspaceType(Boolean bool) {
        if (bool != null) {
            getBinding().f71944d.setChecked(bool.booleanValue());
            b bVar = this.f46686b;
            if (bVar != null) {
                bVar.hf(bool);
            }
        }
    }

    public final void setBackspaceTypeSetListener(b bVar) {
        t.f(bVar, "backspaceTypeSetListener");
        this.f46686b = bVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getBinding().f71944d.setEnabled(z10);
        getBinding().f71943c.setEnabled(z10);
        getBinding().f71942b.setEnabled(z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackspaceTypeEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ BackspaceTypeEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackspaceTypeEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.f46685a = b0.b(LayoutInflater.from(context), this, true);
        getBinding().f71944d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lq.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                BackspaceTypeEditorLayout.c(this.f64544a, compoundButton, z10);
            }
        });
        getBinding().f71943c.setOnClickListener(new View.OnClickListener() { // from class: lq.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackspaceTypeEditorLayout.d(this.f64546a, view);
            }
        });
    }
}
