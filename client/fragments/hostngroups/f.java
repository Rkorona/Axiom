package com.server.auditor.ssh.client.fragments.hostngroups;

import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public final List a(List list) {
        ju.t.f(list, "preFilterList");
        dq.h0 h0Var = new dq.h0(null, null, null, 7, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            VaultKeyId vaultKeyId = ((GroupDBModel) obj).getVaultKeyId();
            ju.t.e(vaultKeyId, "<get-vaultKeyId>(...)");
            if (h0Var.d(vaultKeyId)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
