package com.server.auditor.ssh.client.ui.util;

import androidx.annotation.Keep;
import ju.k;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class MissingCryptorException extends Exception {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public MissingCryptorException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MissingCryptorException(String str, Throwable th2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
    }

    public MissingCryptorException(String str, Throwable th2) {
        super(str, th2);
    }
}
