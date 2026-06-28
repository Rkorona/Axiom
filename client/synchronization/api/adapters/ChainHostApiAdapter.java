package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.ChainHostsDBAdapter;
import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class ChainHostApiAdapter extends ApiAdapterAbstract<ChainHostsDBModel> {
    public ChainHostApiAdapter(ChainHostsDBAdapter chainHostsDBAdapter) {
        super(chainHostsDBAdapter);
    }
}
