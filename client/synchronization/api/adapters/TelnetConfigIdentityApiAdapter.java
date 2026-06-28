package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class TelnetConfigIdentityApiAdapter extends ApiAdapterAbstract<TelnetConfigIdentityDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelnetConfigIdentityApiAdapter(TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapter) {
        super(telnetConfigIdentityDBAdapter);
        t.f(telnetConfigIdentityDBAdapter, "telnetConfigIdentityDBAdapter");
    }
}
