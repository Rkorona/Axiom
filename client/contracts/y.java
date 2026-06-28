package com.server.auditor.ssh.client.contracts;

import android.text.SpannableStringBuilder;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.ArrayList;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface y extends MvpView {
    void B7();

    void Ha(HostIconUtil.OsModelType osModelType);

    void L7(ArrayList arrayList);

    void R9(ChainingHost chainingHost);

    void U9(String str);

    void X4(SpannableStringBuilder spannableStringBuilder);

    void a();

    void j();

    void z7(long[] jArr, VaultKeyId vaultKeyId);
}
