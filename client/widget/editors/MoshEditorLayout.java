package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.widget.editors.MoshEditorLayout;
import ju.k;
import ju.t;
import qg.g3;
import su.s;
import ut.n;
import ut.o;

/* JADX INFO: loaded from: classes4.dex */
public final class MoshEditorLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g3 f46720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f46721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f46722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f46723d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f46724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f46725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f46726c;

        public a(boolean z10, String str, String str2) {
            this.f46724a = z10;
            this.f46725b = str;
            this.f46726c = str2;
        }

        public final String a() {
            return this.f46726c;
        }

        public final String b() {
            return this.f46725b;
        }

        public final boolean c() {
            return this.f46724a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f46724a == aVar.f46724a && t.b(this.f46725b, aVar.f46725b) && t.b(this.f46726c, aVar.f46726c);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f46724a) * 31;
            String str = this.f46725b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f46726c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InheritedMoshEditorProperties(isMoshEnabled=" + this.f46724a + ", inheritedMoshCommand=" + this.f46725b + ", inheritanceName=" + this.f46726c + ")";
        }
    }

    public interface b {
        void a();
    }

    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String string;
            String string2 = (charSequence == null || (string = charSequence.toString()) == null) ? null : s.n1(string).toString();
            MoshEditorLayout moshEditorLayout = MoshEditorLayout.this;
            moshEditorLayout.f46721b = c.b(moshEditorLayout.f46721b, false, string2, null, 5, null);
            a aVarC = MoshEditorLayout.this.f46721b.c();
            boolean z10 = false;
            if (aVarC != null && aVarC.c() && (string2 == null || string2.length() <= 0)) {
                z10 = true;
            }
            MoshEditorLayout.this.o(z10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoshEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    private final String getDefaultMoshCommand() {
        return (String) this.f46722c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Context context) {
        return context.getString(R.string.hint_mosh_command);
    }

    private final void i() {
        this.f46720a.f72520b.setSaveEnabled(true);
        this.f46720a.f72524f.setSaveEnabled(true);
        TextInputEditText textInputEditText = this.f46720a.f72524f;
        t.e(textInputEditText, "moshCommandEditText");
        textInputEditText.addTextChangedListener(new d());
        this.f46720a.f72520b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lq.z
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                MoshEditorLayout.j(this.f64581a, compoundButton, z10);
            }
        });
        this.f46720a.f72526h.setOnClickListener(new View.OnClickListener() { // from class: lq.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoshEditorLayout.k(this.f64537a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MoshEditorLayout moshEditorLayout, CompoundButton compoundButton, boolean z10) {
        moshEditorLayout.n(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MoshEditorLayout moshEditorLayout, View view) {
        b bVar = moshEditorLayout.f46723d;
        if (bVar != null) {
            bVar.a();
        }
    }

    private final void l() {
        a aVarC = this.f46721b.c();
        boolean z10 = aVarC != null && aVarC.c();
        n(z10 ? true : this.f46721b.e());
        this.f46720a.f72520b.setEnabled(z10 ? false : isEnabled());
        this.f46720a.f72524f.setText(this.f46721b.d());
        TextInputLayout textInputLayout = this.f46720a.f72525g;
        a aVarC2 = this.f46721b.c();
        String strB = aVarC2 != null ? aVarC2.b() : null;
        if (strB == null || s.m0(strB)) {
            strB = null;
        }
        if (strB == null) {
            strB = getDefaultMoshCommand();
        }
        textInputLayout.setPlaceholderText(strB);
        AppCompatTextView appCompatTextView = this.f46720a.f72521c;
        a aVarC3 = this.f46721b.c();
        appCompatTextView.setText(aVarC3 != null ? aVarC3.a() : null);
        this.f46720a.f72524f.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: lq.y
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                MoshEditorLayout.m(this.f64579a, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MoshEditorLayout moshEditorLayout, View view, boolean z10) {
        if (z10) {
            Editable text = moshEditorLayout.f46720a.f72524f.getText();
            if (text == null || s.m0(text)) {
                g3 g3Var = moshEditorLayout.f46720a;
                g3Var.f72524f.setText(g3Var.f72525g.getPlaceholderText());
            }
        }
    }

    private final void n(boolean z10) {
        this.f46721b = c.b(this.f46721b, z10, null, null, 6, null);
        this.f46720a.f72520b.setChecked(z10);
        this.f46720a.f72524f.setEnabled(z10);
        p(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z10) {
        this.f46720a.f72522d.setVisibility(z10 ? 0 : 4);
    }

    private final void p(boolean z10) {
        LinearLayout linearLayout = this.f46720a.f72523e;
        t.e(linearLayout, "moshCommandContainer");
        linearLayout.setVisibility(z10 ? 0 : 8);
    }

    public final c getMoshProperties() {
        boolean zE = this.f46721b.e();
        return new c(zE, zE ? this.f46721b.d() : null, null, 4, null);
    }

    public final void q(c cVar) {
        t.f(cVar, "newMoshProperties");
        this.f46721b = cVar;
        l();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f46720a.f72520b.setEnabled(z10);
        this.f46720a.f72524f.setEnabled(z10);
        this.f46720a.f72527i.setEnabled(z10);
    }

    public final void setOnMoshEditorCallback(b bVar) {
        t.f(bVar, "moshEditorCallback");
        this.f46723d = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoshEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ MoshEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f46727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f46728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f46729c;

        public c(boolean z10, String str, a aVar) {
            this.f46727a = z10;
            this.f46728b = str;
            this.f46729c = aVar;
        }

        public static /* synthetic */ c b(c cVar, boolean z10, String str, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = cVar.f46727a;
            }
            if ((i10 & 2) != 0) {
                str = cVar.f46728b;
            }
            if ((i10 & 4) != 0) {
                aVar = cVar.f46729c;
            }
            return cVar.a(z10, str, aVar);
        }

        public final c a(boolean z10, String str, a aVar) {
            return new c(z10, str, aVar);
        }

        public final a c() {
            return this.f46729c;
        }

        public final String d() {
            return this.f46728b;
        }

        public final boolean e() {
            return this.f46727a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f46727a == cVar.f46727a && t.b(this.f46728b, cVar.f46728b) && t.b(this.f46729c, cVar.f46729c);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f46727a) * 31;
            String str = this.f46728b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.f46729c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "MoshEditorProperties(isMoshEnabled=" + this.f46727a + ", moshCommand=" + this.f46728b + ", inheritedMoshProperties=" + this.f46729c + ")";
        }

        public /* synthetic */ c(boolean z10, String str, a aVar, int i10, k kVar) {
            this(z10, str, (i10 & 4) != 0 ? null : aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoshEditorLayout(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.f46721b = new c(false, null, null, 4, null);
        this.f46722c = o.a(new iu.a() { // from class: lq.x
            @Override // iu.a
            public final Object a() {
                return MoshEditorLayout.h(context);
            }
        });
        g3 g3VarB = g3.b(LayoutInflater.from(context), this, true);
        t.e(g3VarB, "inflate(...)");
        this.f46720a = g3VarB;
        i();
    }
}
