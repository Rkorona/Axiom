package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class TelnetConfigApiAdapter extends ApiAdapterAbstract<TelnetRemoteConfigDBModel> {
    public TelnetConfigApiAdapter(TelnetConfigDBAdapter telnetConfigDBAdapter) {
        super(telnetConfigDBAdapter);
    }
}
