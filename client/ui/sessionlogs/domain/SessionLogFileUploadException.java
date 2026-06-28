package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import androidx.annotation.Keep;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class SessionLogFileUploadException extends IllegalStateException {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionLogFileUploadException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SessionLogFileUploadException(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionLogFileUploadException(String str) {
        super(str);
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
    }
}
