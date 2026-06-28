package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorContainer;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface j0 extends MvpView {
    void ae(EmailAuthentication emailAuthentication, String str);

    void b();

    void d();

    void d1();

    void e();

    void g();

    void n();

    void s0(LoginErrorContainer loginErrorContainer);

    void u(String str);

    void ve(com.server.auditor.ssh.client.help.a0 a0Var);
}
