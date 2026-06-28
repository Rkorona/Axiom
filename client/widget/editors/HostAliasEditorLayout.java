package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import iu.l;
import ju.k;
import ju.t;
import qg.q2;
import su.s;

/* JADX INFO: loaded from: classes4.dex */
public final class HostAliasEditorLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q2 f46699a;

    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f46700a;

        public a(l lVar) {
            this.f46700a = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            l lVar = this.f46700a;
            String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            lVar.invoke(string);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostAliasEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    private final q2 getBinding() {
        q2 q2Var = this.f46699a;
        if (q2Var != null) {
            return q2Var;
        }
        throw new IllegalStateException();
    }

    public static /* synthetic */ void setAlias$default(HostAliasEditorLayout hostAliasEditorLayout, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        hostAliasEditorLayout.setAlias(str);
    }

    public final nq.a a() {
        TextInputLayout textInputLayout = getBinding().f73623c;
        t.e(textInputLayout, "aliasInoutLayout");
        TextInputEditText textInputEditText = getBinding().f73622b;
        t.e(textInputEditText, "aliasEditText");
        return new nq.a(textInputLayout, textInputEditText);
    }

    public final String getAlias() {
        String string;
        Editable text = getBinding().f73622b.getText();
        String string2 = (text == null || (string = text.toString()) == null) ? null : s.n1(string).toString();
        return string2 == null ? "" : string2;
    }

    public final void setAlias(String str) {
        getBinding().f73622b.setText(str != null ? s.n1(str).toString() : null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getBinding().f73623c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setNextFocusForwardId(int i10) {
        getBinding().f73622b.setNextFocusForwardId(i10);
    }

    public final void setOnAliasChangedListener(l lVar) {
        t.f(lVar, "onAfterTextChanged");
        TextInputEditText textInputEditText = getBinding().f73622b;
        t.e(textInputEditText, "aliasEditText");
        textInputEditText.addTextChangedListener(new a(lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostAliasEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ HostAliasEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostAliasEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.f46699a = q2.b(LayoutInflater.from(context), this, true);
    }
}
