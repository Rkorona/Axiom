package com.server.auditor.ssh.client.contracts.auth;

import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorContainer;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends MvpView {
    void G4();

    void Ic();

    void Q8(AuthenticationModel authenticationModel, String str);

    void a();

    void b();

    void d();

    void e();

    void g();

    void h();

    void i();

    void k(String str);

    void n();

    void s(String str);

    void s0(LoginErrorContainer loginErrorContainer);

    void t(boolean z10);
}
