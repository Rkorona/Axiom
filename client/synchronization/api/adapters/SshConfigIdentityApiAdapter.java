package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SshConfigIdentityApiAdapter extends ApiAdapterAbstract<SshConfigIdentityDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshConfigIdentityApiAdapter(SshConfigIdentityDBAdapter sshConfigIdentityDBAdapter) {
        super(sshConfigIdentityDBAdapter);
        t.f(sshConfigIdentityDBAdapter, "sshConfigIdentityDBAdapter");
    }
}
