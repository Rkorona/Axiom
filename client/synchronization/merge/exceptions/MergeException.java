package com.server.auditor.ssh.client.synchronization.merge.exceptions;

import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class MergeException extends RuntimeException {
    public static final int $stable = 8;

    public MergeException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergeException(String str) {
        super(str);
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergeException(Throwable th2) {
        super(th2);
        t.f(th2, "cause");
    }
}
