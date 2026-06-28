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
import qg.h6;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f24692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextWatcher f24694c;

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                Integer numV = su.s.v(String.valueOf(editable));
                if ((numV != null ? numV.intValue() : 0) > 65535) {
                    q.this.f24692a.f72656f.setError(q.this.f24692a.b().getContext().getString(R.string.error_incorrect_port));
                    q.this.f24692a.f72653c.setEnabled(false);
                    q.this.f24692a.f72658h.setEnabled(false);
                } else {
                    q.this.f24692a.f72656f.setError(null);
                    q.this.f24692a.f72653c.setEnabled(true);
                    q.this.f24692a.f72658h.setEnabled(true);
                }
            } catch (NumberFormatException e10) {
                y9.a.f86838a.i(e10);
                q.this.f24692a.f72656f.setError(null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public q(h6 h6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(h6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24692a = h6Var;
        this.f24693b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(q qVar, View view) {
        qVar.f24692a.f72655e.removeTextChangedListener(qVar.f24694c);
        qVar.f24693b.f3(String.valueOf(qVar.f24692a.f72655e.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(q qVar, View view) {
        qVar.f24692a.f72655e.removeTextChangedListener(qVar.f24694c);
        qVar.f24693b.g3(String.valueOf(qVar.f24692a.f72655e.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(q qVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if ((i10 & 6) == 0 && i10 != 0) {
            return false;
        }
        MaterialButton materialButton = qVar.f24692a.f72658h;
        ju.t.e(materialButton, "saveAndContinueButton");
        if (materialButton.getVisibility() == 0) {
            qVar.f24692a.f72658h.performClick();
            return true;
        }
        qVar.f24692a.f72653c.performClick();
        return true;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24692a.f72656f.setEnabled(true);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        ju.t.f(lVar, "callback");
        TextInputEditText textInputEditText = this.f24692a.f72655e;
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
        this.f24692a.f72653c.setOnClickListener(new View.OnClickListener() { // from class: gh.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.q.f(this.f51267a, view);
            }
        });
        this.f24692a.f72658h.setOnClickListener(new View.OnClickListener() { // from class: gh.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.q.g(this.f51272a, view);
            }
        });
        this.f24692a.f72655e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gh.c1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return com.server.auditor.ssh.client.fragments.connection.q.h(this.f51275a, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.r rVar) {
        ju.t.f(rVar, "step");
        if (rVar.a().length() > 0) {
            this.f24692a.f72655e.setText(rVar.a());
        }
        MaterialButton materialButton = this.f24692a.f72658h;
        ju.t.e(materialButton, "saveAndContinueButton");
        materialButton.setVisibility(rVar.b() ? 0 : 8);
        TextInputEditText textInputEditText = this.f24692a.f72655e;
        ju.t.e(textInputEditText, "portInputField");
        a aVar = new a();
        textInputEditText.addTextChangedListener(aVar);
        this.f24694c = aVar;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24692a.f72656f.setEnabled(false);
    }
}
