package com.server.auditor.ssh.client.widget.editors;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.widget.editors.AgentForwardingEditorLayout;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import lq.j;
import qg.o;
import ut.s;

/* JADX INFO: loaded from: classes4.dex */
public final class AgentForwardingEditorLayout extends ConstraintLayout implements mq.a {
    private o N;
    private boolean O;
    private b P;
    private a Q;

    public interface a {
        void a();

        void b(b bVar);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f46683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f46684b;

        public c(boolean z10, String str) {
            this.f46683a = z10;
            this.f46684b = str;
        }

        public final String a() {
            return this.f46684b;
        }

        public final boolean b() {
            return this.f46683a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f46683a == cVar.f46683a && t.b(this.f46684b, cVar.f46684b);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f46683a) * 31;
            String str = this.f46684b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InheritedAgentForwardingProperties(isAgentForwardingEnabled=" + this.f46683a + ", inheritanceName=" + this.f46684b + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AgentForwardingEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(AgentForwardingEditorLayout agentForwardingEditorLayout, View view) {
        a aVar = agentForwardingEditorLayout.Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(AgentForwardingEditorLayout agentForwardingEditorLayout, View view) {
        a aVar = agentForwardingEditorLayout.Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    private final void C() {
        setEnabled(false);
        getBinding().f73355c.setOnCheckedChangeListener(null);
        getBinding().f73355c.setOnClickListener(null);
        getBinding().b().setOnClickListener(null);
    }

    private final void D() {
        AppCompatImageView appCompatImageView = getBinding().f73359g;
        t.e(appCompatImageView, "upgradePromo");
        appCompatImageView.setVisibility(8);
        getBinding().f73355c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lq.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                AgentForwardingEditorLayout.E(this.f64536a, compoundButton, z10);
            }
        });
        getBinding().b().setClickable(false);
        getBinding().b().setFocusable(false);
        getBinding().b().setFocusableInTouchMode(false);
        getBinding().f73355c.setOnClickListener(null);
        getBinding().b().setOnClickListener(null);
        getBinding().b().setBackground(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(AgentForwardingEditorLayout agentForwardingEditorLayout, CompoundButton compoundButton, boolean z10) {
        if (z10 != agentForwardingEditorLayout.F()) {
            agentForwardingEditorLayout.O = true;
            b bVarB = b.b(agentForwardingEditorLayout.P, z10, null, 2, null);
            agentForwardingEditorLayout.P = bVarB;
            a aVar = agentForwardingEditorLayout.Q;
            if (aVar != null) {
                aVar.b(bVarB);
            }
        }
    }

    private final boolean F() {
        if (!this.O && this.P.c() != null) {
            c cVarC = this.P.c();
            return (cVarC != null && cVarC.b()) || this.P.d();
        }
        return this.P.d();
    }

    private final void G() {
        AppCompatTextView appCompatTextView = getBinding().f73356d;
        c cVarC = this.P.c();
        String strA = cVarC != null ? cVarC.a() : null;
        if (strA == null) {
            strA = "";
        }
        appCompatTextView.setText(strA);
        getBinding().f73355c.setChecked(F());
        I(this.P.c() != null);
    }

    private final void I(boolean z10) {
        LinearLayout linearLayout = getBinding().f73357e;
        t.e(linearLayout, "inheritedTitleAfLayout");
        linearLayout.setVisibility(z10 ? 0 : 8);
    }

    private final o getBinding() {
        o oVar = this.N;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException();
    }

    private final void z() {
        AppCompatImageView appCompatImageView = getBinding().f73359g;
        t.e(appCompatImageView, "upgradePromo");
        appCompatImageView.setVisibility(0);
        getBinding().f73355c.setOnCheckedChangeListener(null);
        getBinding().b().setOnClickListener(new View.OnClickListener() { // from class: lq.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AgentForwardingEditorLayout.A(this.f64539a, view);
            }
        });
        getBinding().f73355c.setOnClickListener(new View.OnClickListener() { // from class: lq.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AgentForwardingEditorLayout.B(this.f64541a, view);
            }
        });
        getBinding().b().setClickable(true);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        getBinding().b().setBackgroundResource(typedValue.resourceId);
    }

    public final void H(b bVar) {
        t.f(bVar, SerializableEvent.PROPERTIES_FIELD);
        this.P = bVar;
        G();
    }

    public final void setAgentForwardingEditorLayoutCallback(a aVar) {
        t.f(aVar, "callback");
        this.Q = aVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getBinding().f73355c.setEnabled(z10);
        getBinding().f73358f.setEnabled(z10);
        getBinding().b().setEnabled(z10);
    }

    @Override // mq.a
    public void setState(j jVar) {
        t.f(jVar, "state");
        if (jVar instanceof j.a) {
            z();
        } else if (jVar instanceof j.b) {
            C();
        } else {
            if (!(jVar instanceof j.c)) {
                throw new s();
            }
            D();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AgentForwardingEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f46681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f46682b;

        public b(boolean z10, c cVar) {
            this.f46681a = z10;
            this.f46682b = cVar;
        }

        public static /* synthetic */ b b(b bVar, boolean z10, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = bVar.f46681a;
            }
            if ((i10 & 2) != 0) {
                cVar = bVar.f46682b;
            }
            return bVar.a(z10, cVar);
        }

        public final b a(boolean z10, c cVar) {
            return new b(z10, cVar);
        }

        public final c c() {
            return this.f46682b;
        }

        public final boolean d() {
            return this.f46681a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f46681a == bVar.f46681a && t.b(this.f46682b, bVar.f46682b);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f46681a) * 31;
            c cVar = this.f46682b;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "AgentForwardingProperties(isAgentForwardingEnabled=" + this.f46681a + ", inheritedAgentForwardingProperties=" + this.f46682b + ")";
        }

        public /* synthetic */ b(boolean z10, c cVar, int i10, k kVar) {
            this(z10, (i10 & 2) != 0 ? null : cVar);
        }
    }

    public /* synthetic */ AgentForwardingEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentForwardingEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.P = new b(false, null, 2, 0 == true ? 1 : 0);
        this.N = o.c(LayoutInflater.from(context), this, true);
    }
}
