package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.help.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {
    public final com.server.auditor.ssh.client.models.a0 a(Integer num) {
        return (num == null || new pu.i(0, 65535).o(num.intValue())) ? new com.server.auditor.ssh.client.models.a0(true, null, 2, null) : new com.server.auditor.ssh.client.models.a0(false, new a0.a(R.string.error_incorrect_port, new Object[0]));
    }
}
