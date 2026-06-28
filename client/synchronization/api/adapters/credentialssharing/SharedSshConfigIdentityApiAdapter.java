package com.server.auditor.ssh.client.synchronization.api.adapters.credentialssharing;

import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.ApiAdapterAbstract;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedSshConfigIdentityApiAdapter extends ApiAdapterAbstract<SharedSshConfigIdentityDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSshConfigIdentityApiAdapter(SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter) {
        super(sharedSshConfigIdentityDBAdapter);
        t.f(sharedSshConfigIdentityDBAdapter, "sharedSshConfigIdentityDBAdapter");
    }
}
