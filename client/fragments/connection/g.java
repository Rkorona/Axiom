package com.server.auditor.ssh.client.fragments.connection;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import gh.s0;
import qg.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2 f24667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24668b;

    public g(w2 w2Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(w2Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24667a = w2Var;
        this.f24668b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(g gVar, View view) {
        gVar.f24668b.W2(String.valueOf(gVar.f24667a.f74240e.getText()));
        gVar.f24667a.f74240e.setTransformationMethod(new PasswordTransformationMethod());
        TextInputEditText textInputEditText = gVar.f24667a.f74240e;
        Editable text = textInputEditText.getText();
        textInputEditText.setText(text != null ? s0.a(text.length()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g gVar, View view) {
        gVar.f24668b.B3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(g gVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if ((i10 & 6) == 0 && i10 != 0) {
            return false;
        }
        gVar.f24667a.f74238c.performClick();
        return true;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24667a.f74241f.setEnabled(true);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        ju.t.f(lVar, "callback");
        TextInputEditText textInputEditText = this.f24667a.f74240e;
        ju.t.e(textInputEditText, "interactiveInputField");
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
        this.f24667a.f74238c.setOnClickListener(new View.OnClickListener() { // from class: gh.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.g.e(this.f51352a, view);
            }
        });
        this.f24667a.f74245j.setOnClickListener(new View.OnClickListener() { // from class: gh.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.g.f(this.f51354a, view);
            }
        });
        this.f24667a.f74240e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gh.x
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return com.server.auditor.ssh.client.fragments.connection.g.g(this.f51356a, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.f fVar) {
        ju.t.f(fVar, "step");
        this.f24667a.f74242g.setText(fVar.a());
        this.f24667a.f74240e.setText((CharSequence) null);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24667a.f74241f.setEnabled(false);
    }
}
