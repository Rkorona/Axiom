package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class KnownHostsApiAdapter extends ApiAdapterAbstract<KnownHostsDBModel> {
    public KnownHostsApiAdapter(KnownHostsDBAdapter knownHostsDBAdapter) {
        super(knownHostsDBAdapter);
    }
}
