package com.server.auditor.ssh.client.widget.editors;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.widget.editors.HostChainEditorLayout;
import ju.k;
import ju.t;
import lq.j;
import qg.d0;
import su.s;

/* JADX INFO: loaded from: classes4.dex */
public final class HostChainEditorLayout extends ConstraintLayout implements mq.a {
    public static final a P = new a(null);
    public static final int Q = 8;
    private final d0 N;
    private b O;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a();

        void b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostChainEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    private final void F() {
        this.N.f72179i.setVisibility(0);
        this.N.f72178h.setOnClickListener(new View.OnClickListener() { // from class: lq.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.G(this.f64571a, view);
            }
        });
        this.N.f72176f.setOnClickListener(new View.OnClickListener() { // from class: lq.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.H(this.f64572a, view);
            }
        });
        this.N.f72177g.setOnClickListener(new View.OnClickListener() { // from class: lq.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.I(this.f64573a, view);
            }
        });
        T(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(HostChainEditorLayout hostChainEditorLayout, View view) {
        b bVar = hostChainEditorLayout.O;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HostChainEditorLayout hostChainEditorLayout, View view) {
        b bVar = hostChainEditorLayout.O;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HostChainEditorLayout hostChainEditorLayout, View view) {
        b bVar = hostChainEditorLayout.O;
        if (bVar != null) {
            bVar.a();
        }
    }

    private final void J() {
        this.N.f72179i.setVisibility(8);
        setEnabled(false);
        this.N.f72178h.setOnClickListener(new View.OnClickListener() { // from class: lq.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.K(view);
            }
        });
        this.N.f72176f.setOnClickListener(new View.OnClickListener() { // from class: lq.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.L(view);
            }
        });
        this.N.f72177g.setOnClickListener(new View.OnClickListener() { // from class: lq.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.M(view);
            }
        });
        T(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(View view) {
    }

    private final void N() {
        this.N.f72179i.setVisibility(8);
        setEnabled(true);
        this.N.f72178h.setOnClickListener(new View.OnClickListener() { // from class: lq.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.O(this.f64566a, view);
            }
        });
        this.N.f72176f.setOnClickListener(new View.OnClickListener() { // from class: lq.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.P(this.f64568a, view);
            }
        });
        this.N.f72177g.setOnClickListener(new View.OnClickListener() { // from class: lq.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostChainEditorLayout.Q(this.f64570a, view);
            }
        });
        T(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(HostChainEditorLayout hostChainEditorLayout, View view) {
        b bVar = hostChainEditorLayout.O;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(HostChainEditorLayout hostChainEditorLayout, View view) {
        b bVar = hostChainEditorLayout.O;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(HostChainEditorLayout hostChainEditorLayout, View view) {
        b bVar = hostChainEditorLayout.O;
        if (bVar != null) {
            bVar.b();
        }
    }

    private final void T(boolean z10) {
        this.N.f72176f.setImageState(z10 ? new int[]{R.attr.state_enabled} : new int[]{-16842910}, false);
    }

    public final void R(String str, String str2) {
        t.f(str, "hostChainTitle");
        t.f(str2, "groupTitle");
        this.N.f72178h.setText("");
        this.N.f72178h.setHint(str);
        this.N.f72174d.setText(str2);
        this.N.f72175e.setVisibility(0);
    }

    public final void S(String str) {
        t.f(str, "hostChainTitle");
        this.N.f72178h.setText(str);
        if (s.m0(str)) {
            this.N.f72178h.setHint(getResources().getString(com.server.auditor.ssh.client.R.string.chaining_hosts_field_title));
        } else {
            this.N.f72178h.setHint("");
        }
        this.N.f72174d.setText("");
        this.N.f72175e.setVisibility(8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.N.f72178h.setEnabled(z10);
        this.N.f72176f.setEnabled(z10);
        this.N.f72177g.setEnabled(z10);
    }

    public final void setOnHostChainEditorCallback(b bVar) {
        t.f(bVar, "hostChainEditorCallback");
        this.O = bVar;
    }

    @Override // mq.a
    public void setState(j jVar) {
        t.f(jVar, "state");
        if (jVar instanceof j.a) {
            F();
        } else if (jVar instanceof j.b) {
            J();
        } else {
            if (!(jVar instanceof j.c)) {
                throw new ut.s();
            }
            N();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostChainEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ HostChainEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostChainEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        d0 d0VarB = d0.b(LayoutInflater.from(context), this, true);
        t.e(d0VarB, "inflate(...)");
        this.N = d0VarB;
    }
}
