package com.server.auditor.ssh.client.contracts.portforwardingwizard;

import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import java.util.List;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends MvpView {
    void B(qq.b bVar);

    void I();

    void J5();

    void Je(qq.a aVar);

    void Le();

    void O(boolean z10);

    void P2(a0 a0Var);

    void Pd(String str);

    void Rb(String str);

    void V4(String str);

    void V9(VaultKeyId vaultKeyId);

    void Vc(boolean z10, VaultKeyId vaultKeyId);

    void X(boolean z10);

    void Z1(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2);

    void Za();

    void a();

    void a5(String str);

    void b7(a0 a0Var);

    void c3(boolean z10);

    void c6(a0 a0Var);

    void e6(boolean z10);

    void f();

    void je(int i10);

    void l7(a0 a0Var);

    void m5(String str);

    void o8(String str);

    void p0(VaultKeyId vaultKeyId);

    void p9();

    void pe();

    void t9();

    void ua(RuleDBModel ruleDBModel, String str);

    void v1(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2);

    void w1(PortForwardingWizardData portForwardingWizardData);

    void w2(List list);

    void xd(a0 a0Var);

    void y5(boolean z10);
}
