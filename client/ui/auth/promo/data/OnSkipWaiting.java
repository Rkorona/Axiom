package com.server.auditor.ssh.client.ui.auth.promo.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class OnSkipWaiting {
    public static final int $stable = 0;
    public static final OnSkipWaiting INSTANCE = new OnSkipWaiting();

    private OnSkipWaiting() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof OnSkipWaiting);
    }

    public int hashCode() {
        return 795036229;
    }

    public String toString() {
        return "OnSkipWaiting";
    }
}
