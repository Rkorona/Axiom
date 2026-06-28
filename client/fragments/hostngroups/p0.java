package com.server.auditor.ssh.client.fragments.hostngroups;

import com.server.auditor.ssh.client.database.models.GroupDBModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 implements kj.b {
    @Override // kj.b
    public void a(long[] jArr, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Long parentGroupId = null;
        for (long j10 : jArr) {
            if (j10 > 0) {
                GroupDBModel itemByLocalId = hg.f.p().h().getItemByLocalId(j10);
                arrayList.add(itemByLocalId);
                if (parentGroupId == null) {
                    parentGroupId = itemByLocalId.getParentGroupId();
                }
            }
        }
        if (arrayList.size() > 0) {
            c(arrayList, parentGroupId, z10);
        }
    }

    @Override // kj.b
    public void b(long j10) {
        d(hg.f.p().h().getItemByLocalId(j10));
    }

    public abstract void c(List list, Long l10, boolean z10);

    public abstract void d(GroupDBModel groupDBModel);
}
