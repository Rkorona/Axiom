package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.widget.editors.HostnameEditorLayout;
import iu.l;
import ju.k;
import ju.t;
import mq.h;
import qg.r2;
import su.s;

/* JADX INFO: loaded from: classes4.dex */
public final class HostnameEditorLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f46701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r2 f46702b;

    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f46703a;

        public a(l lVar) {
            this.f46703a = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            l lVar = this.f46703a;
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
    public HostnameEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(HostnameEditorLayout hostnameEditorLayout, View view) {
        h hVar = hostnameEditorLayout.f46701a;
        if (hVar != null) {
            hVar.cd();
        }
    }

    public final void c(String str) {
        this.f46702b.f73710b.setError(str);
    }

    public final String getHostname() {
        String string;
        String string2;
        Editable text = this.f46702b.f73711c.getText();
        return (text == null || (string = text.toString()) == null || (string2 = s.n1(string).toString()) == null) ? "" : string2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f46702b.f73710b.setEnabled(z10);
        this.f46702b.f73712d.setEnabled(z10);
    }

    public final void setHostname(String str) {
        this.f46702b.f73711c.setText(str);
    }

    public final void setNsdActionsListener(h hVar) {
        t.f(hVar, "listener");
        this.f46701a = hVar;
    }

    public final void setOnHostnameChangedListener(l lVar) {
        t.f(lVar, "onAfterTextChanged");
        TextInputEditText textInputEditText = this.f46702b.f73711c;
        t.e(textInputEditText, "hostEditText");
        textInputEditText.addTextChangedListener(new a(lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HostnameEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ HostnameEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostnameEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        r2 r2VarB = r2.b(LayoutInflater.from(context), this, true);
        t.e(r2VarB, "inflate(...)");
        this.f46702b = r2VarB;
        r2VarB.f73712d.setOnClickListener(new View.OnClickListener() { // from class: lq.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostnameEditorLayout.b(this.f64575a, view);
            }
        });
    }
}
