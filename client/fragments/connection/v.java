package com.server.auditor.ssh.client.fragments.connection;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import qg.j6;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j6 f24715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24717c;

    public v(j6 j6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(j6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24715a = j6Var;
        this.f24716b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(v vVar, View view) {
        vVar.f24716b.C3(String.valueOf(vVar.f24715a.f72873i.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(v vVar, View view) {
        vVar.f24716b.D3(String.valueOf(vVar.f24715a.f72873i.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(v vVar, View view) {
        vVar.f24716b.p3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(v vVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if ((i10 & 6) == 0 && i10 != 0) {
            return false;
        }
        MaterialButton materialButton = vVar.f24715a.f72869e;
        ju.t.e(materialButton, "saveAndContinueButton");
        if (materialButton.getVisibility() == 0) {
            vVar.f24715a.f72869e.performClick();
            return true;
        }
        vVar.f24715a.f72867c.performClick();
        return true;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24715a.f72874j.setEnabled(true);
        this.f24715a.f72870f.setEnabled(this.f24717c);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        ju.t.f(lVar, "callback");
        TextInputEditText textInputEditText = this.f24715a.f72873i;
        ju.t.e(textInputEditText, "usernameInputField");
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
        this.f24715a.f72867c.setOnClickListener(new View.OnClickListener() { // from class: gh.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.v.f(this.f51338a, view);
            }
        });
        this.f24715a.f72869e.setOnClickListener(new View.OnClickListener() { // from class: gh.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.v.g(this.f51341a, view);
            }
        });
        this.f24715a.f72870f.setOnClickListener(new View.OnClickListener() { // from class: gh.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.v.h(this.f51344a, view);
            }
        });
        this.f24715a.f72873i.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gh.s1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return com.server.auditor.ssh.client.fragments.connection.v.i(this.f51347a, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.t tVar) {
        ju.t.f(tVar, "step");
        String string = this.f24715a.b().getContext().getString(R.string.connection_flow_host_username_request, tVar.b());
        ju.t.e(string, "getString(...)");
        this.f24715a.f72873i.setText((CharSequence) null);
        this.f24715a.f72875k.setText(m4.b.a(string, 0));
        this.f24715a.f72870f.setEnabled(tVar.a());
        this.f24717c = tVar.a();
        MaterialButton materialButton = this.f24715a.f72869e;
        ju.t.e(materialButton, "saveAndContinueButton");
        materialButton.setVisibility(tVar.c() ? 0 : 8);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24715a.f72874j.setEnabled(false);
        this.f24715a.f72870f.setEnabled(false);
    }
}
