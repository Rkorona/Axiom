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
import qg.e6;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e6 f24669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextWatcher f24671c;

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                Integer numV = su.s.v(String.valueOf(editable));
                if ((numV != null ? numV.intValue() : 0) > 65535) {
                    h.this.f24669a.f72371h.setError(h.this.f24669a.b().getContext().getString(R.string.error_incorrect_port));
                    h.this.f24669a.f72368e.setEnabled(false);
                    h.this.f24669a.f72373j.setEnabled(false);
                } else {
                    h.this.f24669a.f72371h.setError(null);
                    h.this.f24669a.f72368e.setEnabled(true);
                    h.this.f24669a.f72373j.setEnabled(true);
                }
            } catch (NumberFormatException e10) {
                y9.a.f86838a.i(e10);
                h.this.f24669a.f72371h.setError(null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public h(e6 e6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(e6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24669a = e6Var;
        this.f24670b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(h hVar, View view) {
        hVar.f24669a.f72370g.removeTextChangedListener(hVar.f24671c);
        hVar.f24670b.d3(String.valueOf(hVar.f24669a.f72370g.getText()), String.valueOf(hVar.f24669a.f72366c.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(h hVar, View view) {
        hVar.f24669a.f72370g.removeTextChangedListener(hVar.f24671c);
        hVar.f24670b.e3(String.valueOf(hVar.f24669a.f72370g.getText()), String.valueOf(hVar.f24669a.f72366c.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(h hVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if ((i10 & 6) == 0 && i10 != 0) {
            return false;
        }
        MaterialButton materialButton = hVar.f24669a.f72373j;
        ju.t.e(materialButton, "saveAndContinueButton");
        if (materialButton.getVisibility() == 0) {
            hVar.f24669a.f72373j.performClick();
            return true;
        }
        hVar.f24669a.f72368e.performClick();
        return true;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24669a.f72371h.setEnabled(true);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        ju.t.f(lVar, "callback");
        TextInputEditText textInputEditText = this.f24669a.f72370g;
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
        this.f24669a.f72368e.setOnClickListener(new View.OnClickListener() { // from class: gh.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.h.f(this.f51358a, view);
            }
        });
        this.f24669a.f72373j.setOnClickListener(new View.OnClickListener() { // from class: gh.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.h.g(this.f51360a, view);
            }
        });
        this.f24669a.f72366c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gh.a0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return com.server.auditor.ssh.client.fragments.connection.h.h(this.f51266a, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.h hVar) {
        ju.t.f(hVar, "step");
        if (hVar.b().length() > 0) {
            this.f24669a.f72370g.setText(hVar.b());
        }
        this.f24669a.f72366c.setText(hVar.a());
        MaterialButton materialButton = this.f24669a.f72373j;
        ju.t.e(materialButton, "saveAndContinueButton");
        materialButton.setVisibility(hVar.c() ? 0 : 8);
        TextInputEditText textInputEditText = this.f24669a.f72370g;
        ju.t.e(textInputEditText, "portInputField");
        a aVar = new a();
        textInputEditText.addTextChangedListener(aVar);
        this.f24671c = aVar;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24669a.f72371h.setEnabled(false);
    }
}
