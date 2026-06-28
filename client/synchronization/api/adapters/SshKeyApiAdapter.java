package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class SshKeyApiAdapter extends ApiAdapterAbstract<SshKeyDBModel> {
    public SshKeyApiAdapter(SshKeyDBAdapter sshKeyDBAdapter) {
        super(sshKeyDBAdapter);
    }
}
