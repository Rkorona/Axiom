package com.server.auditor.ssh.client.fragments.connection;

import android.app.Activity;
import androidx.biometric.f;
import androidx.fragment.app.FragmentActivity;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import qg.m8;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f24620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24621b;

    public static final class a extends f.a {
        a() {
        }

        @Override // androidx.biometric.f.a
        public void a(int i10, CharSequence charSequence) {
            ju.t.f(charSequence, "errString");
            com.server.auditor.ssh.client.app.a.N().H0(null);
            b.this.f24621b.Z2();
        }

        @Override // androidx.biometric.f.a
        public void b() {
        }

        @Override // androidx.biometric.f.a
        public void c(f.b bVar) {
            ju.t.f(bVar, "result");
            com.server.auditor.ssh.client.app.a.N().H0(null);
            b.this.f24621b.o3();
        }
    }

    public b(m8 m8Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(m8Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24620a = m8Var;
        this.f24621b = newConnectionFlowPresenter;
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
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.a aVar) {
        ju.t.f(aVar, "step");
        Activity activityA = hg.a.f52933c.a();
        if (activityA != null) {
            androidx.biometric.f fVar = new androidx.biometric.f((FragmentActivity) activityA, androidx.core.content.a.getMainExecutor(activityA), new a());
            f.d dVarA = new f.d.a().d(this.f24620a.b().getContext().getString(R.string.app_name)).c(this.f24620a.b().getContext().getString(android.R.string.cancel)).b(15).a();
            ju.t.e(dVarA, "build(...)");
            f.c cVarE = com.server.auditor.ssh.client.app.a.N().E();
            ju.t.c(cVarE);
            fVar.b(dVarA, cVarE);
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        ju.t.f(aVar, "callback");
        aVar.a();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        c.a.a(this);
    }
}
