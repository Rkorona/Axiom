package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface b0 extends MvpView {
    void C9(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11);

    void P0();

    void R(boolean z10);

    void V2(boolean z10);

    void a();

    void b();

    void b0(boolean z10);

    void d();

    void dc(String str);

    void e();

    void g();

    void h();

    void i();

    void j0();

    void j1(com.server.auditor.ssh.client.help.a0 a0Var);

    void k(String str);

    void l();

    void mc(com.server.auditor.ssh.client.help.a0 a0Var);

    void n();

    void o0(AuthenticationModel authenticationModel, String str);

    void q();

    void x1(EmailAuthentication emailAuthentication, String str);
}
