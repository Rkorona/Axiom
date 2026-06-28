package com.server.auditor.ssh.client.contracts.views.biometrickeys;

import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.List;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends MvpView {
    void F1();

    void F4();

    void G1(Long l10);

    void H2();

    void I7();

    void M0(boolean z10);

    void O1(String str);

    void Pe();

    void Qe();

    void R1();

    void S8(long j10);

    void Tc();

    void U1();

    void Ua(boolean z10);

    void X1();

    void Z5(String str, String str2, String str3);

    void ac();

    void h1(boolean z10);

    void k0();

    void k1(List list);

    void kc(boolean z10);

    void l2();

    void mb(String str, String str2);

    void md(String str, String str2);

    void n1(SshKeyDBModel sshKeyDBModel);

    void nb();

    void o1(boolean z10);

    void p1(boolean z10);

    void se(boolean z10, String str, VaultKeyId vaultKeyId);

    void t2(boolean z10);

    void v2(boolean z10);

    void w0(String str);

    void y0();
}
