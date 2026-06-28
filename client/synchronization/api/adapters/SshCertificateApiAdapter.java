package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SshCertificateApiAdapter extends ApiAdapterAbstract<SshCertificateDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshCertificateApiAdapter(SshCertificateDBAdapter sshCertificateDBAdapter) {
        super(sshCertificateDBAdapter);
        t.f(sshCertificateDBAdapter, "sshCertificateDBAdapter");
    }
}
