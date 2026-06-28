package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.widget.editors.ParentGroupEditorLayout;
import ju.k;
import ju.t;
import lq.j;
import mq.a;
import mq.i;
import qg.e4;
import su.s;

/* JADX INFO: loaded from: classes4.dex */
public final class ParentGroupEditorLayout extends ConstraintLayout implements a {
    private final e4 N;
    private i O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ParentGroupEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    private final void E() {
        this.N.f72357g.setEnabled(false);
        this.N.f72354d.setEnabled(false);
        this.N.f72355e.setEnabled(false);
        this.N.f72353c.setEnabled(false);
        this.N.f72352b.setEnabled(false);
        this.N.f72357g.setOnClickListener(new View.OnClickListener() { // from class: lq.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentGroupEditorLayout.F(view);
            }
        });
        this.N.f72355e.setOnClickListener(new View.OnClickListener() { // from class: lq.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentGroupEditorLayout.G(view);
            }
        });
        this.N.f72353c.setOnClickListener(new View.OnClickListener() { // from class: lq.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentGroupEditorLayout.H(view);
            }
        });
        this.N.f72352b.setOnClickListener(new View.OnClickListener() { // from class: lq.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentGroupEditorLayout.I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(View view) {
    }

    private final void J() {
        this.N.f72357g.setOnClickListener(new View.OnClickListener() { // from class: lq.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentGroupEditorLayout.K(this.f64548a, view);
            }
        });
        this.N.f72355e.setOnClickListener(new View.OnClickListener() { // from class: lq.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentGroupEditorLayout.L(this.f64550a, view);
            }
        });
        this.N.f72353c.setOnClickListener(new View.OnClickListener() { // from class: lq.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentGroupEditorLayout.M(this.f64552a, view);
            }
        });
        this.N.f72352b.setOnClickListener(new View.OnClickListener() { // from class: lq.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentGroupEditorLayout.N(this.f64554a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(ParentGroupEditorLayout parentGroupEditorLayout, View view) {
        i iVar = parentGroupEditorLayout.O;
        if (iVar != null) {
            iVar.Y7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(ParentGroupEditorLayout parentGroupEditorLayout, View view) {
        i iVar = parentGroupEditorLayout.O;
        if (iVar != null) {
            iVar.Y7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(ParentGroupEditorLayout parentGroupEditorLayout, View view) {
        i iVar = parentGroupEditorLayout.O;
        if (iVar != null) {
            iVar.Y7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ParentGroupEditorLayout parentGroupEditorLayout, View view) {
        i iVar = parentGroupEditorLayout.O;
        if (iVar != null) {
            iVar.Ra();
        }
    }

    public final void O(String str) {
        t.f(str, "hintText");
        this.N.f72354d.setText(str);
    }

    public final void P(String str) {
        t.f(str, "groupName");
        this.N.f72355e.setText(str);
        AppCompatImageButton appCompatImageButton = this.N.f72352b;
        t.e(appCompatImageButton, "detachGroupButton");
        appCompatImageButton.setVisibility(!s.m0(str) ? 0 : 8);
        AppCompatImageButton appCompatImageButton2 = this.N.f72353c;
        t.e(appCompatImageButton2, "groupChooserImageButton");
        appCompatImageButton2.setVisibility(s.m0(str) ? 0 : 8);
    }

    public final void setOnParentGroupEditorListener(i iVar) {
        t.f(iVar, "listener");
        this.O = iVar;
    }

    @Override // mq.a
    public void setState(j jVar) {
        t.f(jVar, "state");
        if (jVar instanceof j.b) {
            E();
        } else {
            J();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ParentGroupEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ ParentGroupEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParentGroupEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        e4 e4VarB = e4.b(LayoutInflater.from(context), this, true);
        t.e(e4VarB, "inflate(...)");
        this.N = e4VarB;
    }
}
