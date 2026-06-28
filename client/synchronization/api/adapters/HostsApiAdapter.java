package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.models.HostDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class HostsApiAdapter extends ApiAdapterAbstract<HostDBModel> {
    public HostsApiAdapter(HostsDBAdapter hostsDBAdapter) {
        super(hostsDBAdapter);
    }
}
