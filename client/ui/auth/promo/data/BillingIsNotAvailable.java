package com.server.auditor.ssh.client.ui.auth.promo.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class BillingIsNotAvailable {
    public static final int $stable = 0;
    public static final BillingIsNotAvailable INSTANCE = new BillingIsNotAvailable();

    private BillingIsNotAvailable() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof BillingIsNotAvailable);
    }

    public int hashCode() {
        return 1090161329;
    }

    public String toString() {
        return "BillingIsNotAvailable";
    }
}
