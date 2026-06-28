package com.server.auditor.ssh.client.synchronization.api.adapters.credentialssharing;

import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedTelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.ApiAdapterAbstract;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedTelnetConfigIdentityApiAdapter extends ApiAdapterAbstract<SharedTelnetConfigIdentityDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTelnetConfigIdentityApiAdapter(SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter) {
        super(sharedTelnetConfigIdentityDBAdapter);
        t.f(sharedTelnetConfigIdentityDBAdapter, "sharedTelnetConfigIdentityDBAdapter");
    }
}
