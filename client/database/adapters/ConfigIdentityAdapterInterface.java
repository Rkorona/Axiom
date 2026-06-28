package com.server.auditor.ssh.client.database.adapters;

import com.server.auditor.ssh.client.database.adapters.ConfigIdentityDbModelInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface ConfigIdentityAdapterInterface<T extends ConfigIdentityDbModelInterface> {
    T findModelByConfigId(long j10);
}
