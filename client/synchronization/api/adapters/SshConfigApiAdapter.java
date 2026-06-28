package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class SshConfigApiAdapter extends ApiAdapterAbstract<SshRemoteConfigDBModel> {
    public SshConfigApiAdapter(SshConfigDBAdapter sshConfigDBAdapter) {
        super(sshConfigDBAdapter);
    }
}
