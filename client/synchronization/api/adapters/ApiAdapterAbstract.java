package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract;
import kj.a;
import kj.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ApiAdapterAbstract<T extends a & f> {
    private DbAdapterAbstract<T> mDBAdapter;

    public ApiAdapterAbstract(DbAdapterAbstract<T> dbAdapterAbstract) {
        this.mDBAdapter = dbAdapterAbstract;
    }

    public void deleteItem(T t10) {
        if (t10 == null) {
            return;
        }
        T t11 = t10;
        Long lValueOf = Long.valueOf(t11.getIdOnServer());
        long idInDatabase = t11.getIdInDatabase();
        if (lValueOf.longValue() == -1) {
            this.mDBAdapter.removeItemByLocalId(idInDatabase);
        } else {
            t11.setStatus(2);
            this.mDBAdapter.editByLocalId(idInDatabase, t10);
        }
    }

    public Long postItem(T t10) {
        T t11 = t10;
        t11.setStatus(1);
        long jAdd = this.mDBAdapter.add(t10);
        Long lValueOf = Long.valueOf(jAdd);
        t11.setIdInDatabase(jAdd);
        return lValueOf;
    }

    public int putItem(T t10) {
        if (t10 == null) {
            return -1;
        }
        T t11 = t10;
        long idInDatabase = t11.getIdInDatabase();
        t11.setStatus(1);
        return this.mDBAdapter.editByLocalId(idInDatabase, t10);
    }
}
