package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.proxy.ProxyDataMediator;
import com.server.auditor.ssh.client.models.proxy.ProxyType;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface o0 extends MvpView {
    void G5(com.server.auditor.ssh.client.help.a0 a0Var);

    void Ge(int i10);

    void Hb(ProxyDataMediator proxyDataMediator);

    void I0();

    void Q5(com.server.auditor.ssh.client.help.a0 a0Var);

    void Q9(String str);

    void V5(VaultKeyId vaultKeyId, boolean z10);

    void X(boolean z10);

    void a();

    void fb(Integer num);

    void ga(com.server.auditor.ssh.client.help.a0 a0Var);

    void h2();

    void ke(ProxyType proxyType);

    void m7();

    void r9(com.server.auditor.ssh.client.help.a0 a0Var);

    void w9(Identity identity, boolean z10);
}
