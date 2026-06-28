package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.server.auditor.ssh.client.widget.editors.ColorSchemeEditorLayout;
import ju.k;
import ju.t;
import mq.e;
import qg.l0;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorSchemeEditorLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l0 f46689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f46690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46691c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorSchemeEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ColorSchemeEditorLayout colorSchemeEditorLayout, View view) {
        e eVar = colorSchemeEditorLayout.f46690b;
        if (eVar != null) {
            eVar.Ab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ColorSchemeEditorLayout colorSchemeEditorLayout, View view) {
        e eVar = colorSchemeEditorLayout.f46690b;
        if (eVar != null) {
            eVar.Ab();
        }
    }

    private final void e() {
        getBinding().f73005g.setVisibility(8);
    }

    private final void f(String str) {
        getBinding().f73004f.setText(str);
        getBinding().f73005g.setVisibility(0);
    }

    private final l0 getBinding() {
        l0 l0Var = this.f46689a;
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalStateException();
    }

    public final void setColorSchemeActionsListener(e eVar) {
        t.f(eVar, "colorSchemeActionsListener");
        this.f46690b = eVar;
    }

    public final void setColorSchemeName(String str, String str2) {
        t.f(str, "schemeName");
        getBinding().f73003e.setText(str);
        if (str2 == null) {
            e();
        } else {
            f(str2);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getBinding().f73003e.setEnabled(z10);
        getBinding().f73000b.setEnabled(z10);
        getBinding().b().setClickable(z10);
        getBinding().f73000b.setClickable(z10);
    }

    public final void setIsGroupEditor(boolean z10) {
        this.f46691c = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorSchemeEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ ColorSchemeEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorSchemeEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.f46689a = l0.c(LayoutInflater.from(context), this, true);
        getBinding().b().setOnClickListener(new View.OnClickListener() { // from class: lq.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorSchemeEditorLayout.c(this.f64551a, view);
            }
        });
        getBinding().f73003e.setOnClickListener(new View.OnClickListener() { // from class: lq.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorSchemeEditorLayout.d(this.f64553a, view);
            }
        });
    }
}
