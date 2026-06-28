package com.server.auditor.ssh.client.contracts;

import android.text.Editable;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface k2 extends MvpView {
    void B(qq.b bVar);

    void D7();

    void De(VaultKeyId vaultKeyId);

    void G8();

    void H8(boolean z10, VaultKeyId vaultKeyId);

    void I();

    void T3(long j10);

    void V6();

    void W7(boolean z10);

    void X(boolean z10);

    void Z1(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2);

    void a();

    void ce(com.server.auditor.ssh.client.help.a0 a0Var);

    void h4(Editable editable);

    void ic(qq.a aVar);

    void j();

    void j7();

    void j8();

    void l();

    void l3();

    void o4(SnippetPackageDBModel snippetPackageDBModel, String str);

    void s8();

    void u9(Editable editable);

    void v1(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2);
}
