package com.server.auditor.ssh.client.ui.auth.promo.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class CannotRestoreSubscription {
    public static final int $stable = 0;
    public static final CannotRestoreSubscription INSTANCE = new CannotRestoreSubscription();

    private CannotRestoreSubscription() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof CannotRestoreSubscription);
    }

    public int hashCode() {
        return -957075042;
    }

    public String toString() {
        return "CannotRestoreSubscription";
    }
}
