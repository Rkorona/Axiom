package com.server.auditor.ssh.client.fragments.connection;

import android.view.View;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qg.r f24665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24666b;

    public f(qg.r rVar, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(rVar, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24665a = rVar;
        this.f24666b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(f fVar, View view) {
        fVar.f24666b.T2();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24665a.f73668d.setEnabled(true);
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
        this.f24665a.f73668d.setOnClickListener(new View.OnClickListener() { // from class: gh.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.f.b(this.f51348a, view);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.e eVar) {
        ju.t.f(eVar, "step");
        String string = this.f24665a.b().getContext().getString(R.string.connection_flow_host_fingerprint_request, eVar.c(), eVar.b(), eVar.a());
        ju.t.e(string, "getString(...)");
        this.f24665a.f73667c.setText(m4.b.a(string, 0));
        this.f24665a.f73668d.requestFocus();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24665a.f73668d.setEnabled(false);
    }
}
