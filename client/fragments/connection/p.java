package com.server.auditor.ssh.client.fragments.connection;

import android.view.View;
import android.widget.TextView;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import com.server.auditor.ssh.client.widget.textview.RoundedBgTextView;
import qg.g7;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f24690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24691b;

    public p(g7 g7Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(g7Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24690a = g7Var;
        this.f24691b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p pVar, View view) {
        pVar.f24691b.r3();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        c.a.b(this);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        c.a.d(this, lVar);
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
        this.f24690a.f72563b.setOnClickListener(new View.OnClickListener() { // from class: gh.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.p.b(this.f51361a, view);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.q qVar) {
        ju.t.f(qVar, "step");
        String string = this.f24690a.b().getContext().getString(R.string.connection_flow_host_snippet_variable_error, qVar.a());
        ju.t.e(string, "getString(...)");
        this.f24690a.f72570i.setText(m4.b.a(string, 0));
        this.f24690a.f72566e.setText(qVar.d());
        if (ju.t.b(qVar.d(), qVar.c())) {
            this.f24690a.f72566e.setText(qVar.b(), TextView.BufferType.SPANNABLE);
            RoundedBgTextView roundedBgTextView = this.f24690a.f72565d;
            ju.t.e(roundedBgTextView, "footerText");
            roundedBgTextView.setVisibility(8);
            return;
        }
        this.f24690a.f72566e.setText(qVar.d());
        RoundedBgTextView roundedBgTextView2 = this.f24690a.f72565d;
        CharSequence charSequenceB = qVar.b();
        if (charSequenceB == null) {
            charSequenceB = qVar.c();
        }
        roundedBgTextView2.setText(charSequenceB, TextView.BufferType.SPANNABLE);
        RoundedBgTextView roundedBgTextView3 = this.f24690a.f72565d;
        ju.t.e(roundedBgTextView3, "footerText");
        roundedBgTextView3.setVisibility(0);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        c.a.a(this);
    }
}
