package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.help.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 {
    public final com.server.auditor.ssh.client.models.a0 a(byte[] bArr) {
        ju.t.f(bArr, "encodedPassword");
        return bArr.length == 0 ? new com.server.auditor.ssh.client.models.a0(false, new a0.a(R.string.error_empty_password, new Object[0])) : new com.server.auditor.ssh.client.models.a0(true, null, 2, null);
    }
}
