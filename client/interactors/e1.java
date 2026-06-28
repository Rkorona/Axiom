package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.help.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {
    public final com.server.auditor.ssh.client.models.a0 a(String str) {
        ju.t.f(str, "proxyAddress");
        return su.s.m0(str) ? new com.server.auditor.ssh.client.models.a0(false, new a0.a(R.string.required_field, new Object[0])) : !tp.e1.b(str) ? new com.server.auditor.ssh.client.models.a0(false, new a0.a(R.string.error_incorrect_format, new Object[0])) : new com.server.auditor.ssh.client.models.a0(true, null, 2, null);
    }
}
