package com.server.auditor.ssh.client.widget.editors;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.snippet.SnippetScriptStructure;
import com.server.auditor.ssh.client.models.snippet.SnippetScriptStructureType;
import com.server.auditor.ssh.client.widget.editors.SnippetEditorLayout;
import com.server.auditor.ssh.client.widget.textview.RoundedBgTextView;
import com.server.auditor.ssh.client.widget.textview.TextRoundedBgAnnotation;
import java.util.Arrays;
import java.util.List;
import ju.k;
import ju.r0;
import ju.t;
import lq.j;
import qg.c7;
import ut.s;

/* JADX INFO: loaded from: classes4.dex */
public final class SnippetEditorLayout extends ConstraintLayout implements mq.a {
    public static final a S = new a(null);
    public static final int T = 8;
    private c7 N;
    private final com.server.auditor.ssh.client.interactors.snippets.b O;
    private ColorStateList P;
    private d Q;
    private c R;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SnippetItem f46737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f46738b;

        public b(SnippetItem snippetItem, String str) {
            this.f46737a = snippetItem;
            this.f46738b = str;
        }

        public final String a() {
            return this.f46738b;
        }

        public final SnippetItem b() {
            return this.f46737a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.b(this.f46737a, bVar.f46737a) && t.b(this.f46738b, bVar.f46738b);
        }

        public int hashCode() {
            SnippetItem snippetItem = this.f46737a;
            int iHashCode = (snippetItem == null ? 0 : snippetItem.hashCode()) * 31;
            String str = this.f46738b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "InheritedSnippetEditorProperties(snippetItem=" + this.f46737a + ", inheritanceName=" + this.f46738b + ")";
        }
    }

    public interface c {
        void a();

        void b(d dVar);

        void c();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SnippetItem f46739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f46740b;

        public d(SnippetItem snippetItem, b bVar) {
            this.f46739a = snippetItem;
            this.f46740b = bVar;
        }

        public static /* synthetic */ d b(d dVar, SnippetItem snippetItem, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                snippetItem = dVar.f46739a;
            }
            if ((i10 & 2) != 0) {
                bVar = dVar.f46740b;
            }
            return dVar.a(snippetItem, bVar);
        }

        public final d a(SnippetItem snippetItem, b bVar) {
            return new d(snippetItem, bVar);
        }

        public final b c() {
            return this.f46740b;
        }

        public final SnippetItem d() {
            return this.f46739a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return t.b(this.f46739a, dVar.f46739a) && t.b(this.f46740b, dVar.f46740b);
        }

        public int hashCode() {
            SnippetItem snippetItem = this.f46739a;
            int iHashCode = (snippetItem == null ? 0 : snippetItem.hashCode()) * 31;
            b bVar = this.f46740b;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "SnippetEditorProperties(snippetItem=" + this.f46739a + ", inheritedSnippetEditorProperties=" + this.f46740b + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnippetEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    private final void F() {
        AppCompatImageView appCompatImageView = getBinding().f72157k;
        t.e(appCompatImageView, "upgradePromo");
        appCompatImageView.setVisibility(0);
        getBinding().f72155i.setOnClickListener(new View.OnClickListener() { // from class: lq.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.G(this.f64574a, view);
            }
        });
        getBinding().f72152f.setOnClickListener(new View.OnClickListener() { // from class: lq.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.H(this.f64576a, view);
            }
        });
        getBinding().f72153g.setOnClickListener(new View.OnClickListener() { // from class: lq.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.I(this.f64578a, view);
            }
        });
        X(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(SnippetEditorLayout snippetEditorLayout, View view) {
        c cVar = snippetEditorLayout.R;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(SnippetEditorLayout snippetEditorLayout, View view) {
        c cVar = snippetEditorLayout.R;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(SnippetEditorLayout snippetEditorLayout, View view) {
        snippetEditorLayout.W();
    }

    private final void J() {
        R();
        AppCompatImageView appCompatImageView = getBinding().f72157k;
        t.e(appCompatImageView, "upgradePromo");
        appCompatImageView.setVisibility(8);
        getBinding().f72155i.setOnClickListener(new View.OnClickListener() { // from class: lq.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.K(view);
            }
        });
        getBinding().f72152f.setOnClickListener(new View.OnClickListener() { // from class: lq.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.L(view);
            }
        });
        getBinding().f72153g.setOnClickListener(new View.OnClickListener() { // from class: lq.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.M(view);
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
        getBinding().f72152f.setEnabled(true);
        AppCompatImageView appCompatImageView = getBinding().f72157k;
        t.e(appCompatImageView, "upgradePromo");
        appCompatImageView.setVisibility(8);
        getBinding().f72155i.setOnClickListener(new View.OnClickListener() { // from class: lq.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.O(this.f64580a, view);
            }
        });
        getBinding().f72152f.setOnClickListener(new View.OnClickListener() { // from class: lq.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.P(this.f64582a, view);
            }
        });
        getBinding().f72153g.setOnClickListener(new View.OnClickListener() { // from class: lq.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnippetEditorLayout.Q(this.f64538a, view);
            }
        });
        X(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(SnippetEditorLayout snippetEditorLayout, View view) {
        c cVar = snippetEditorLayout.R;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(SnippetEditorLayout snippetEditorLayout, View view) {
        c cVar = snippetEditorLayout.R;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(SnippetEditorLayout snippetEditorLayout, View view) {
        snippetEditorLayout.W();
    }

    private final void R() {
        getBinding().f72152f.setEnabled(false);
        getBinding().f72153g.setEnabled(false);
        getBinding().f72155i.setEnabled(false);
        getBinding().f72151e.setEnabled(false);
        getBinding().f72156j.setEnabled(false);
    }

    private final void S(boolean z10, boolean z11) {
        if (z11) {
            xp.a aVar = new xp.a(getBinding().f72152f, getBinding().f72153g);
            if (!z10) {
                aVar.b();
            }
            getBinding().f72154h.startAnimation(aVar);
            return;
        }
        AppCompatImageButton appCompatImageButton = getBinding().f72152f;
        t.e(appCompatImageButton, "sshAttachSnippetButton");
        appCompatImageButton.setVisibility(!z10 ? 0 : 8);
        AppCompatImageButton appCompatImageButton2 = getBinding().f72153g;
        t.e(appCompatImageButton2, "sshDetachSnippetButton");
        appCompatImageButton2.setVisibility(z10 ? 0 : 8);
    }

    private final Editable T(SnippetItem snippetItem) {
        List<SnippetScriptStructure> listC = this.O.c(snippetItem != null ? snippetItem.getScriptStructure() : null);
        if (listC == null || listC.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (SnippetScriptStructure snippetScriptStructure : listC) {
            SnippetScriptStructureType snippetScriptStructureTypeComponent1 = snippetScriptStructure.component1();
            String strComponent2 = snippetScriptStructure.component2();
            if (snippetScriptStructureTypeComponent1 == SnippetScriptStructureType.VARIABLE) {
                r0 r0Var = r0.f62955a;
                String str = String.format("  %s  ", Arrays.copyOf(new Object[]{strComponent2}, 1));
                t.e(str, "format(...)");
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.setSpan(new TextRoundedBgAnnotation(null, null, null, null, null, 31, null), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) strComponent2);
            }
        }
        return spannableStringBuilder;
    }

    private final void U(boolean z10) {
        SnippetItem snippetItemB;
        boolean z11 = false;
        boolean z12 = this.Q.d() != null;
        if (z12) {
            snippetItemB = this.Q.d();
        } else {
            b bVarC = this.Q.c();
            snippetItemB = bVarC != null ? bVarC.b() : null;
        }
        Editable editableT = T(snippetItemB);
        getBinding().f72156j.setTextColor(this.P);
        if (editableT != null) {
            getBinding().f72156j.setEllipsize(TextUtils.TruncateAt.END);
            if (z12) {
                getBinding().f72156j.setText(editableT, TextView.BufferType.SPANNABLE);
            } else {
                getBinding().f72156j.setTextColor(getBinding().f72156j.getHintTextColors());
                getBinding().f72156j.setText(editableT, TextView.BufferType.SPANNABLE);
            }
        } else {
            RoundedBgTextView roundedBgTextView = getBinding().f72156j;
            String title = snippetItemB != null ? snippetItemB.getTitle() : null;
            if (title == null) {
                title = "";
            }
            roundedBgTextView.setText(title);
        }
        getBinding().f72156j.setTag(snippetItemB);
        AppCompatTextView appCompatTextView = getBinding().f72149c;
        b bVarC2 = this.Q.c();
        appCompatTextView.setText(bVarC2 != null ? bVarC2.a() : null);
        if (!z12 && this.Q.c() != null) {
            z11 = true;
        }
        Y(z11);
        S(z12, z10);
    }

    static /* synthetic */ void V(SnippetEditorLayout snippetEditorLayout, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        snippetEditorLayout.U(z10);
    }

    private final void W() {
        d dVarB = d.b(this.Q, null, null, 2, null);
        this.Q = dVarB;
        c cVar = this.R;
        if (cVar != null) {
            cVar.b(dVarB);
        }
        U(true);
    }

    private final void X(boolean z10) {
        getBinding().f72152f.setImageState(z10 ? new int[]{R.attr.state_enabled} : new int[]{-16842910}, false);
    }

    private final void Y(boolean z10) {
        getBinding().f72150d.setVisibility(z10 ? 0 : 8);
    }

    private final c7 getBinding() {
        c7 c7Var = this.N;
        if (c7Var != null) {
            return c7Var;
        }
        throw new IllegalStateException();
    }

    public final void Z(d dVar) {
        t.f(dVar, "snippetEditorProperties");
        this.Q = dVar;
        V(this, false, 1, null);
    }

    public final void setOnSnippetEditorCallback(c cVar) {
        t.f(cVar, "snippetEditorCallback");
        this.R = cVar;
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
    public SnippetEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ SnippetEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        t.e(aVarN, "getInstance(...)");
        this.O = new com.server.auditor.ssh.client.interactors.snippets.b(aVarN);
        this.Q = new d(null, null);
        this.N = c7.b(LayoutInflater.from(context), this, true);
        this.P = getBinding().f72156j.getTextColors();
    }
}
