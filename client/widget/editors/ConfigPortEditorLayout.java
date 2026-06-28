package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import ju.k;
import ju.t;
import qg.o0;
import su.s;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfigPortEditorLayout extends ConstraintLayout {
    public static final a R = new a(null);
    public static final int S = 8;
    private final TextInputLayout N;
    private final TextInputEditText O;
    private TextWatcher P;
    private o0 Q;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ConfigPortEditorLayout.this.A(charSequence != null ? charSequence.toString() : null);
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ConfigPortEditorLayout.this.z();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigPortEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(String str) {
        if (str != null) {
            if (str.length() == 0) {
                B();
            } else {
                x();
            }
        }
    }

    private final void B() {
        getBinding().f73363d.setVisibility(0);
    }

    private final o0 getBinding() {
        o0 o0Var = this.Q;
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalStateException();
    }

    public static /* synthetic */ void setHint$default(ConfigPortEditorLayout configPortEditorLayout, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        configPortEditorLayout.setHint(str);
    }

    public static /* synthetic */ void setPort$default(ConfigPortEditorLayout configPortEditorLayout, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        configPortEditorLayout.setPort(str);
    }

    private final void x() {
        getBinding().f73363d.setVisibility(8);
    }

    public final String getPort() {
        String string;
        Editable text = this.O.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.O.setEnabled(z10);
        this.N.setEnabled(z10);
    }

    public final void setHint(String str) {
        this.N.setExpandedHintEnabled(false);
        this.N.setPlaceholderText(str);
    }

    public final void setInheritGroupTitle(String str) {
        getBinding().f73362c.setText(str);
        TextWatcher textWatcher = this.P;
        if (textWatcher != null) {
            this.O.removeTextChangedListener(textWatcher);
        }
        if (TextUtils.isEmpty(str)) {
            x();
            return;
        }
        TextInputEditText textInputEditText = this.O;
        b bVar = new b();
        textInputEditText.addTextChangedListener(bVar);
        this.P = bVar;
        Editable text = this.O.getText();
        A(text != null ? text.toString() : null);
    }

    public final void setPort(String str) {
        this.O.setText(str);
    }

    public final void setPortLabel(int i10) {
        this.N.setHint(getContext().getString(i10));
    }

    public final void y(boolean z10, int i10) {
        this.O.setSaveEnabled(z10);
        this.O.setId(i10);
    }

    public final boolean z() {
        Integer numV;
        Editable text = this.O.getText();
        String string = text != null ? text.toString() : null;
        boolean z10 = TextUtils.isEmpty(string) || ((string == null || (numV = s.v(string)) == null) ? 0 : numV.intValue()) <= 65535;
        if (z10) {
            this.N.setError(null);
            return z10;
        }
        this.N.setError(getContext().getString(R.string.error_incorrect_port));
        return z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigPortEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ ConfigPortEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigPortEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.Q = o0.b(LayoutInflater.from(context), this, true);
        TextInputLayout textInputLayout = getBinding().f73365f;
        t.e(textInputLayout, "portInputLayout");
        this.N = textInputLayout;
        TextInputEditText textInputEditText = getBinding().f73364e;
        t.e(textInputEditText, "portEditText");
        this.O = textInputEditText;
        textInputEditText.addTextChangedListener(new c());
    }
}
