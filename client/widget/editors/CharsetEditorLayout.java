package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.widget.editors.CharsetEditorLayout;
import ju.k;
import ju.t;
import mq.c;
import qg.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class CharsetEditorLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h0 f46687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f46688b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CharsetEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CharsetEditorLayout charsetEditorLayout, View view) {
        c cVar = charsetEditorLayout.f46688b;
        if (cVar != null) {
            cVar.pc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CharsetEditorLayout charsetEditorLayout, View view) {
        c cVar = charsetEditorLayout.f46688b;
        if (cVar != null) {
            cVar.pc();
        }
    }

    private final void e() {
        getBinding().f72592g.setVisibility(8);
    }

    private final void f(String str) {
        getBinding().f72590e.setText(str);
        getBinding().f72592g.setVisibility(0);
    }

    private final h0 getBinding() {
        h0 h0Var = this.f46687a;
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalStateException();
    }

    public final void setCharsetActionsListener(c cVar) {
        t.f(cVar, "charsetActionsListener");
        this.f46688b = cVar;
    }

    public final void setCharsetForUI(String str, String str2) {
        t.f(str, Column.CHARSET);
        getBinding().f72589d.setText(str);
        if (str2 == null) {
            e();
        } else {
            f(str2);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getBinding().f72589d.setEnabled(z10);
        getBinding().f72588c.setEnabled(z10);
        getBinding().b().setClickable(z10);
        getBinding().f72589d.setClickable(z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CharsetEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ CharsetEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharsetEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.f46687a = h0.c(LayoutInflater.from(context), this, true);
        getBinding().b().setOnClickListener(new View.OnClickListener() { // from class: lq.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharsetEditorLayout.c(this.f64547a, view);
            }
        });
        getBinding().f72589d.setOnClickListener(new View.OnClickListener() { // from class: lq.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharsetEditorLayout.d(this.f64549a, view);
            }
        });
    }
}
