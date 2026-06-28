package com.server.auditor.ssh.client.widget.editors;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.widget.editors.ProxyEditorLayout;
import java.util.Arrays;
import ju.k;
import ju.t;
import lq.j;
import qg.c5;
import ut.s;

/* JADX INFO: loaded from: classes4.dex */
public final class ProxyEditorLayout extends ConstraintLayout implements mq.a {
    public static final a Q = new a(null);
    public static final int R = 8;
    private final c5 N;
    private d O;
    private c P;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f46731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f46732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f46733c;

        public b(String str, int i10, String str2) {
            t.f(str, "inheritedProxyHostname");
            this.f46731a = str;
            this.f46732b = i10;
            this.f46733c = str2;
        }

        public final String a() {
            return this.f46733c;
        }

        public final String b() {
            return this.f46731a;
        }

        public final int c() {
            return this.f46732b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.b(this.f46731a, bVar.f46731a) && this.f46732b == bVar.f46732b && t.b(this.f46733c, bVar.f46733c);
        }

        public int hashCode() {
            int iHashCode = ((this.f46731a.hashCode() * 31) + Integer.hashCode(this.f46732b)) * 31;
            String str = this.f46733c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InheritedProxyEditorProperties(inheritedProxyHostname=" + this.f46731a + ", inheritedProxyPort=" + this.f46732b + ", inheritanceName=" + this.f46733c + ")";
        }
    }

    public interface c {
        void a();

        void b(d dVar);

        void c();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f46734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Integer f46735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f46736c;

        public d(String str, Integer num, b bVar) {
            this.f46734a = str;
            this.f46735b = num;
            this.f46736c = bVar;
        }

        public static /* synthetic */ d b(d dVar, String str, Integer num, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f46734a;
            }
            if ((i10 & 2) != 0) {
                num = dVar.f46735b;
            }
            if ((i10 & 4) != 0) {
                bVar = dVar.f46736c;
            }
            return dVar.a(str, num, bVar);
        }

        public final d a(String str, Integer num, b bVar) {
            return new d(str, num, bVar);
        }

        public final b c() {
            return this.f46736c;
        }

        public final String d() {
            return this.f46734a;
        }

        public final Integer e() {
            return this.f46735b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return t.b(this.f46734a, dVar.f46734a) && t.b(this.f46735b, dVar.f46735b) && t.b(this.f46736c, dVar.f46736c);
        }

        public int hashCode() {
            String str = this.f46734a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f46735b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            b bVar = this.f46736c;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "ProxyEditorProperties(proxyHostname=" + this.f46734a + ", proxyPort=" + this.f46735b + ", inheritedProxyEditorProperties=" + this.f46736c + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProxyEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    private final void F() {
        AppCompatImageView appCompatImageView = this.N.f72139k;
        t.e(appCompatImageView, "upgradePromo");
        appCompatImageView.setVisibility(0);
        this.N.f72137i.setOnClickListener(new View.OnClickListener() { // from class: lq.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.G(this.f64565a, view);
            }
        });
        this.N.f72134f.setOnClickListener(new View.OnClickListener() { // from class: lq.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.H(this.f64567a, view);
            }
        });
        this.N.f72135g.setOnClickListener(new View.OnClickListener() { // from class: lq.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.I(this.f64569a, view);
            }
        });
        X(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(ProxyEditorLayout proxyEditorLayout, View view) {
        c cVar = proxyEditorLayout.P;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(ProxyEditorLayout proxyEditorLayout, View view) {
        c cVar = proxyEditorLayout.P;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(ProxyEditorLayout proxyEditorLayout, View view) {
        proxyEditorLayout.V();
    }

    private final void J() {
        R();
        AppCompatImageView appCompatImageView = this.N.f72139k;
        t.e(appCompatImageView, "upgradePromo");
        appCompatImageView.setVisibility(8);
        this.N.f72137i.setOnClickListener(new View.OnClickListener() { // from class: lq.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.K(view);
            }
        });
        this.N.f72134f.setOnClickListener(new View.OnClickListener() { // from class: lq.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.L(view);
            }
        });
        this.N.f72135g.setOnClickListener(new View.OnClickListener() { // from class: lq.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.M(view);
            }
        });
        X(false);
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
        this.N.f72134f.setEnabled(true);
        AppCompatImageView appCompatImageView = this.N.f72139k;
        t.e(appCompatImageView, "upgradePromo");
        appCompatImageView.setVisibility(8);
        this.N.f72137i.setOnClickListener(new View.OnClickListener() { // from class: lq.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.O(this.f64558a, view);
            }
        });
        this.N.f72134f.setOnClickListener(new View.OnClickListener() { // from class: lq.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.P(this.f64561a, view);
            }
        });
        this.N.f72135g.setOnClickListener(new View.OnClickListener() { // from class: lq.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProxyEditorLayout.Q(this.f64563a, view);
            }
        });
        X(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(ProxyEditorLayout proxyEditorLayout, View view) {
        c cVar = proxyEditorLayout.P;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(ProxyEditorLayout proxyEditorLayout, View view) {
        c cVar = proxyEditorLayout.P;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(ProxyEditorLayout proxyEditorLayout, View view) {
        proxyEditorLayout.V();
    }

    private final void R() {
        this.N.f72134f.setEnabled(false);
        this.N.f72135g.setEnabled(false);
        this.N.f72137i.setEnabled(false);
        this.N.f72133e.setEnabled(false);
        this.N.f72138j.setEnabled(false);
    }

    private final void S(boolean z10, boolean z11) {
        if (z11) {
            c5 c5Var = this.N;
            xp.a aVar = new xp.a(c5Var.f72134f, c5Var.f72135g);
            if (!z10) {
                aVar.b();
            }
            this.N.f72136h.startAnimation(aVar);
            return;
        }
        AppCompatImageButton appCompatImageButton = this.N.f72134f;
        t.e(appCompatImageButton, "sshAttachProxyButton");
        appCompatImageButton.setVisibility(!z10 ? 0 : 8);
        AppCompatImageButton appCompatImageButton2 = this.N.f72135g;
        t.e(appCompatImageButton2, "sshDetachProxyButton");
        appCompatImageButton2.setVisibility(z10 ? 0 : 8);
    }

    private final void T(boolean z10) {
        String strB;
        Integer numValueOf;
        boolean z11 = false;
        boolean z12 = this.O.d() != null;
        if (z12) {
            strB = this.O.d();
        } else {
            b bVarC = this.O.c();
            strB = bVarC != null ? bVarC.b() : null;
        }
        if (z12) {
            numValueOf = this.O.e();
        } else {
            b bVarC2 = this.O.c();
            numValueOf = bVarC2 != null ? Integer.valueOf(bVarC2.c()) : null;
        }
        String strW = W(strB, numValueOf);
        this.N.f72138j.setHint(z12 ? null : strW);
        AppCompatTextView appCompatTextView = this.N.f72138j;
        if (!z12) {
            strW = null;
        }
        appCompatTextView.setText(strW);
        AppCompatTextView appCompatTextView2 = this.N.f72132d;
        b bVarC3 = this.O.c();
        appCompatTextView2.setText(bVarC3 != null ? bVarC3.a() : null);
        if (!z12 && this.O.c() != null) {
            z11 = true;
        }
        Y(z11);
        S(z12, z10);
    }

    static /* synthetic */ void U(ProxyEditorLayout proxyEditorLayout, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        proxyEditorLayout.T(z10);
    }

    private final void V() {
        d dVarB = d.b(this.O, null, null, null, 4, null);
        this.O = dVarB;
        c cVar = this.P;
        if (cVar != null) {
            cVar.b(dVarB);
        }
        T(true);
    }

    private final String W(String str, Integer num) {
        if (str == null) {
            return "";
        }
        if (num == null || num.intValue() <= 0) {
            return str;
        }
        String str2 = String.format("%s:%s", Arrays.copyOf(new Object[]{str, num}, 2));
        t.e(str2, "format(...)");
        return str2;
    }

    private final void X(boolean z10) {
        this.N.f72134f.setImageState(z10 ? new int[]{R.attr.state_enabled} : new int[]{-16842910}, false);
    }

    private final void Y(boolean z10) {
        this.N.f72131c.setVisibility(z10 ? 0 : 8);
    }

    public final void Z(d dVar) {
        t.f(dVar, "proxyEditorProperties");
        this.O = dVar;
        U(this, false, 1, null);
    }

    public final void setOnProxyEditorCallback(c cVar) {
        t.f(cVar, "proxyEditorCallback");
        this.P = cVar;
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
                throw new s();
            }
            N();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProxyEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ ProxyEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.O = new d(null, null, null);
        c5 c5VarB = c5.b(LayoutInflater.from(context), this, true);
        t.e(c5VarB, "inflate(...)");
        this.N = c5VarB;
    }
}
