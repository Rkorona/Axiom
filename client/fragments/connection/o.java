package com.server.auditor.ssh.client.fragments.connection;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import qg.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f24688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24689b;

    public o(t0 t0Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(t0Var, "view");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24688a = t0Var;
        this.f24689b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(o oVar, View view) {
        oVar.f24689b.P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(o oVar, View view) {
        oVar.f24689b.O2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(o oVar, View view) {
        oVar.f24689b.Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(o oVar, View view) {
        oVar.f24689b.u3(oVar.f24688a.f73897i.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(o oVar, View view) {
        oVar.f24689b.Y2(oVar.f24688a.f73897i.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(o oVar, View view) {
        oVar.f24689b.x3(oVar.f24688a.f73897i.isChecked());
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24688a.f73901m.setEnabled(true);
        this.f24688a.f73894f.setEnabled(true);
        this.f24688a.f73907s.setEnabled(true);
        this.f24688a.f73899k.setEnabled(true);
        this.f24688a.f73892d.setEnabled(true);
        this.f24688a.f73905q.setEnabled(true);
        this.f24688a.f73897i.setEnabled(true);
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
        this.f24688a.f73901m.setOnClickListener(new View.OnClickListener() { // from class: gh.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.o.h(this.f51349a, view);
            }
        });
        this.f24688a.f73894f.setOnClickListener(new View.OnClickListener() { // from class: gh.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.o.i(this.f51351a, view);
            }
        });
        this.f24688a.f73907s.setOnClickListener(new View.OnClickListener() { // from class: gh.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.o.j(this.f51353a, view);
            }
        });
        this.f24688a.f73899k.setOnClickListener(new View.OnClickListener() { // from class: gh.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.o.k(this.f51355a, view);
            }
        });
        this.f24688a.f73892d.setOnClickListener(new View.OnClickListener() { // from class: gh.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.o.l(this.f51357a, view);
            }
        });
        this.f24688a.f73905q.setOnClickListener(new View.OnClickListener() { // from class: gh.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.o.m(this.f51359a, view);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.d dVar) {
        ju.t.f(dVar, "step");
        String string = dVar.b().length() > 0 ? this.f24688a.b().getContext().getString(R.string.connection_flow_select_protocol_request, dVar.b(), dVar.a()) : this.f24688a.b().getContext().getString(R.string.connection_flow_select_protocol_request_no_alias, dVar.a());
        ju.t.c(string);
        boolean z10 = false;
        Spanned spannedA = m4.b.a(string, 0);
        ju.t.e(spannedA, "fromHtml(...)");
        this.f24688a.f73896h.setText(spannedA);
        MaterialSwitch materialSwitch = this.f24688a.f73897i;
        ju.t.e(materialSwitch, "saveToHostSwitch");
        materialSwitch.setVisibility(dVar.e() ? 0 : 8);
        MaterialSwitch materialSwitch2 = this.f24688a.f73897i;
        if (dVar.c() && dVar.e()) {
            z10 = true;
        }
        materialSwitch2.setChecked(z10);
        String strF = dVar.f();
        if (strF != null) {
            t0 t0Var = this.f24688a;
            t0Var.f73900l.setText(t0Var.b().getResources().getString(R.string.connection_flow_ssh_param_subtitle_variable, strF));
        }
        String strD = dVar.d();
        if (strD != null) {
            this.f24688a.f73893e.setEllipsize(TextUtils.TruncateAt.START);
            this.f24688a.f73893e.setText(strD);
        }
        String strG = dVar.g();
        if (strG != null) {
            t0 t0Var2 = this.f24688a;
            t0Var2.f73906r.setText(t0Var2.b().getResources().getString(R.string.connection_flow_telnet_param_subtitle_variable, strG));
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24688a.f73901m.setEnabled(false);
        this.f24688a.f73894f.setEnabled(false);
        this.f24688a.f73907s.setEnabled(false);
        this.f24688a.f73899k.setEnabled(false);
        this.f24688a.f73892d.setEnabled(false);
        this.f24688a.f73905q.setEnabled(false);
        this.f24688a.f73897i.setEnabled(false);
    }
}
