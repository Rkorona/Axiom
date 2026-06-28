package com.server.auditor.ssh.client.fragments.connection;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import gh.s0;
import qg.g6;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g6 f24686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24687b;

    public n(g6 g6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(g6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24686a = g6Var;
        this.f24687b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(n nVar, View view) {
        nVar.f24687b.m3(String.valueOf(nVar.f24686a.f72557f.getText()));
        nVar.f24686a.f72557f.setTransformationMethod(new PasswordTransformationMethod());
        TextInputEditText textInputEditText = nVar.f24686a.f72557f;
        Editable text = textInputEditText.getText();
        textInputEditText.setText(text != null ? s0.a(text.length()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(n nVar, View view) {
        nVar.f24687b.n3(String.valueOf(nVar.f24686a.f72557f.getText()));
        nVar.f24686a.f72557f.setTransformationMethod(new PasswordTransformationMethod());
        TextInputEditText textInputEditText = nVar.f24686a.f72557f;
        Editable text = textInputEditText.getText();
        textInputEditText.setText(text != null ? s0.a(text.length()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(n nVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if ((i10 & 6) == 0 && i10 != 0) {
            return false;
        }
        MaterialButton materialButton = nVar.f24686a.f72559h;
        ju.t.e(materialButton, "saveAndContinueButton");
        if (materialButton.getVisibility() == 0) {
            nVar.f24686a.f72559h.performClick();
            return true;
        }
        nVar.f24686a.f72554c.performClick();
        return true;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24686a.f72557f.setText((CharSequence) null);
        this.f24686a.f72558g.setEnabled(true);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        ju.t.f(lVar, "callback");
        TextInputEditText textInputEditText = this.f24686a.f72557f;
        ju.t.e(textInputEditText, "passwordInputField");
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
        this.f24686a.f72554c.setOnClickListener(new View.OnClickListener() { // from class: gh.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.n.e(this.f51337a, view);
            }
        });
        this.f24686a.f72559h.setOnClickListener(new View.OnClickListener() { // from class: gh.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.n.f(this.f51340a, view);
            }
        });
        this.f24686a.f72557f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gh.r0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return com.server.auditor.ssh.client.fragments.connection.n.g(this.f51343a, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.j jVar) {
        ju.t.f(jVar, "step");
        String string = this.f24686a.b().getContext().getString(R.string.connection_flow_host_password_request, jVar.a());
        ju.t.e(string, "getString(...)");
        this.f24686a.f72557f.setText((CharSequence) null);
        this.f24686a.f72556e.setText(m4.b.a(string, 0));
        MaterialButton materialButton = this.f24686a.f72559h;
        ju.t.e(materialButton, "saveAndContinueButton");
        materialButton.setVisibility(jVar.b() ? 0 : 8);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24686a.f72558g.setEnabled(false);
    }
}
