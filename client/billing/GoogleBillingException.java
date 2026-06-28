package com.server.auditor.ssh.client.billing;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class GoogleBillingException extends IllegalStateException {
    public static final int $stable = 8;
    private final String message;

    public GoogleBillingException(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
