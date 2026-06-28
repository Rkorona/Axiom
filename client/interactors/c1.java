package com.server.auditor.ssh.client.interactors;

import android.util.Patterns;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.help.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 {
    public final com.server.auditor.ssh.client.models.a0 a(String str) {
        ju.t.f(str, "email");
        return su.s.m0(str) ? new com.server.auditor.ssh.client.models.a0(false, new a0.a(R.string.required_field, new Object[0])) : !Patterns.EMAIL_ADDRESS.matcher(str).matches() ? new com.server.auditor.ssh.client.models.a0(false, new a0.a(R.string.error_enter_valid_email, new Object[0])) : new com.server.auditor.ssh.client.models.a0(true, null, 2, null);
    }
}
