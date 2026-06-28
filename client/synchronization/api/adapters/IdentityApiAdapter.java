package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class IdentityApiAdapter extends ApiAdapterAbstract<IdentityDBModel> {
    public IdentityApiAdapter(IdentityDBAdapter identityDBAdapter) {
        super(identityDBAdapter);
    }
}
