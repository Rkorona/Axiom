package com.server.auditor.ssh.client.fragments.connection;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import qg.i6;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i6 f24711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextWatcher f24713c;

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                Integer numV = su.s.v(String.valueOf(editable));
                if ((numV != null ? numV.intValue() : 0) > 65535) {
                    u.this.f24711a.f72753f.setError(u.this.f24711a.b().getContext().getString(R.string.error_incorrect_port));
                    u.this.f24711a.f72750c.setEnabled(false);
                    u.this.f24711a.f72755h.setEnabled(false);
                } else {
                    u.this.f24711a.f72753f.setError(null);
                    u.this.f24711a.f72750c.setEnabled(true);
                    u.this.f24711a.f72755h.setEnabled(true);
                }
            } catch (NumberFormatException e10) {
                y9.a.f86838a.i(e10);
                u.this.f24711a.f72753f.setError(null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public u(i6 i6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(i6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24711a = i6Var;
        this.f24712b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(u uVar, View view) {
        uVar.f24711a.f72752e.removeTextChangedListener(uVar.f24713c);
        uVar.f24712b.h3(String.valueOf(uVar.f24711a.f72752e.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(u uVar, View view) {
        uVar.f24711a.f72752e.removeTextChangedListener(uVar.f24713c);
        uVar.f24712b.i3(String.valueOf(uVar.f24711a.f72752e.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(u uVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if ((i10 & 6) == 0 && i10 != 0) {
            return false;
        }
        MaterialButton materialButton = uVar.f24711a.f72755h;
        ju.t.e(materialButton, "saveAndContinueButton");
        if (materialButton.getVisibility() == 0) {
            uVar.f24711a.f72755h.performClick();
            return true;
        }
        uVar.f24711a.f72750c.performClick();
        return true;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24711a.f72753f.setEnabled(true);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        ju.t.f(lVar, "callback");
        TextInputEditText textInputEditText = this.f24711a.f72752e;
        ju.t.e(textInputEditText, "portInputField");
        lVar.invoke(textInputEditText);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void L1(boolean z10) {
        c.a.e(this, z10);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        c.a.c(this, aVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
        this.f24711a.f72750c.setOnClickListener(new View.OnClickListener() { // from class: gh.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.u.f(this.f51313a, view);
            }
        });
        this.f24711a.f72755h.setOnClickListener(new View.OnClickListener() { // from class: gh.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.u.g(this.f51317a, view);
            }
        });
        this.f24711a.f72752e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gh.m1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return com.server.auditor.ssh.client.fragments.connection.u.h(this.f51319a, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.s sVar) {
        ju.t.f(sVar, "step");
        if (sVar.a().length() > 0) {
            this.f24711a.f72752e.setText(sVar.a());
        }
        MaterialButton materialButton = this.f24711a.f72755h;
        ju.t.e(materialButton, "saveAndContinueButton");
        materialButton.setVisibility(sVar.b() ? 0 : 8);
        TextInputEditText textInputEditText = this.f24711a.f72752e;
        ju.t.e(textInputEditText, "portInputField");
        a aVar = new a();
        textInputEditText.addTextChangedListener(aVar);
        this.f24713c = aVar;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24711a.f72753f.setEnabled(false);
    }
}
