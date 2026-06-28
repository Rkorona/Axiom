package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {
    public final boolean a(ConflictsArgData[] conflictsArgDataArr) {
        ju.t.f(conflictsArgDataArr, "conflicts");
        for (ConflictsArgData conflictsArgData : conflictsArgDataArr) {
            if (ju.t.b(conflictsArgData.getEntityType(), RuleDBModel.class)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(ConflictsArgData[] conflictsArgDataArr) {
        ju.t.f(conflictsArgDataArr, "conflicts");
        for (ConflictsArgData conflictsArgData : conflictsArgDataArr) {
            if (!ju.t.b(conflictsArgData.getEntityType(), RuleDBModel.class)) {
                return false;
            }
        }
        return true;
    }
}
