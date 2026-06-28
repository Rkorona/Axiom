package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.proxy.Proxy;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdSettingsData;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface o extends m {
    void A7();

    void A9();

    void D2(String str);

    void E0(String str);

    void F2(String str);

    void G0(String str);

    void G2(boolean z10);

    void Gb(String str);

    void Gd(VaultKeyId vaultKeyId);

    void J0(boolean z10);

    void N0(String str);

    void R3(boolean z10);

    void T4(boolean z10);

    void T5();

    void V0(boolean z10);

    void V3(Proxy proxy, VaultKeyId vaultKeyId);

    void W0(String str);

    void W8(String str);

    void X0(boolean z10);

    void X7(String str, boolean z10, String str2, String str3);

    void Ye(boolean z10);

    void Z0(String str);

    void a1(String str);

    void a7();

    void b8(IdentityEditorLayout.c cVar, boolean z10);

    void d2(boolean z10);

    void e4(String str, String str2, int i10);

    void f2(qq.a aVar, boolean z10);

    void f3(String str);

    void f4(IdentityEditorLayout.d dVar);

    void i2(String str);

    void ja(boolean z10);

    void k2(boolean z10);

    void l1(IdentityEditorLayout.IdentityEditorMode identityEditorMode);

    void l5(boolean z10);

    void o7(VaultKeyId vaultKeyId);

    void ob(VaultKeyId vaultKeyId);

    void p7(List list);

    void pd(IdentityEditorLayout.d dVar);

    void q2(IdentityEditorLayout.b bVar, boolean z10);

    void q8(String str);

    void qb(boolean z10);

    void t1(boolean z10);

    void u2(String str);

    void x0(boolean z10);

    void x9(SshIdSettingsData sshIdSettingsData);

    void y1(boolean z10);
}
