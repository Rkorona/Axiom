package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.MultiKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.MultiKeyDBModel;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiKeyApiAdapter extends ApiAdapterAbstract<MultiKeyDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiKeyApiAdapter(MultiKeyDBAdapter multiKeyDBAdapter) {
        super(multiKeyDBAdapter);
        t.f(multiKeyDBAdapter, "multiKeyDBAdapter");
    }
}
