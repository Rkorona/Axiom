package com.server.auditor.ssh.client.fragments.connection;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import gh.s0;
import qg.f6;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f6 f24684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24685b;

    public m(f6 f6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(f6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24684a = f6Var;
        this.f24685b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(m mVar, View view) {
        mVar.f24685b.j3(String.valueOf(mVar.f24684a.f72457h.getText()));
        mVar.f24684a.f72457h.setTransformationMethod(new PasswordTransformationMethod());
        TextInputEditText textInputEditText = mVar.f24684a.f72457h;
        Editable text = textInputEditText.getText();
        textInputEditText.setText(text != null ? s0.a(text.length()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(m mVar, View view) {
        mVar.f24685b.l3(String.valueOf(mVar.f24684a.f72457h.getText()));
        mVar.f24684a.f72457h.setTransformationMethod(new PasswordTransformationMethod());
        TextInputEditText textInputEditText = mVar.f24684a.f72457h;
        Editable text = textInputEditText.getText();
        textInputEditText.setText(text != null ? s0.a(text.length()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(m mVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if ((i10 & 6) == 0 && i10 != 0) {
            return false;
        }
        MaterialButton materialButton = mVar.f24684a.f72460k;
        ju.t.e(materialButton, "saveAndContinueButton");
        if (materialButton.getVisibility() == 0) {
            mVar.f24684a.f72460k.performClick();
            return true;
        }
        mVar.f24684a.f72452c.performClick();
        return true;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24684a.f72458i.setEnabled(true);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        ju.t.f(lVar, "callback");
        TextInputEditText textInputEditText = this.f24684a.f72457h;
        ju.t.e(textInputEditText, "passphraseInputField");
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
        this.f24684a.f72452c.setOnClickListener(new View.OnClickListener() { // from class: gh.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.m.e(this.f51318a, view);
            }
        });
        this.f24684a.f72460k.setOnClickListener(new View.OnClickListener() { // from class: gh.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.m.f(this.f51329a, view);
            }
        });
        this.f24684a.f72457h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gh.o0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return com.server.auditor.ssh.client.fragments.connection.m.g(this.f51335a, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.i iVar) {
        ju.t.f(iVar, "step");
        this.f24684a.f72457h.setText((CharSequence) null);
        this.f24684a.f72455f.setText(iVar.b());
        this.f24684a.f72454e.setText(iVar.c());
        MaterialButton materialButton = this.f24684a.f72460k;
        ju.t.e(materialButton, "saveAndContinueButton");
        materialButton.setVisibility(iVar.a() ? 0 : 8);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24684a.f72458i.setEnabled(false);
    }
}
