package com.server.auditor.ssh.client.models;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static final int a(SubscriptionPeriod subscriptionPeriod) {
        ju.t.f(subscriptionPeriod, "<this>");
        Long lB = np.h.f67075a.b(subscriptionPeriod.getUntil());
        if (lB != null) {
            long jLongValue = lB.longValue() - System.currentTimeMillis();
            if (jLongValue > 0) {
                return (int) (jLongValue / 86400000);
            }
        }
        return 0;
    }

    public static final int b(SubscriptionPeriod subscriptionPeriod) {
        ju.t.f(subscriptionPeriod, "<this>");
        Long lB = np.h.f67075a.b(subscriptionPeriod.getUntil());
        if (lB != null) {
            long jLongValue = lB.longValue() - System.currentTimeMillis();
            if (jLongValue > 0) {
                return (int) (jLongValue / 3600000);
            }
        }
        return 0;
    }

    public static final int c(SubscriptionPeriod subscriptionPeriod) {
        ju.t.f(subscriptionPeriod, "<this>");
        Long lB = np.h.f67075a.b(subscriptionPeriod.getUntil());
        if (lB != null) {
            long jLongValue = lB.longValue() - System.currentTimeMillis();
            if (jLongValue > 0) {
                return (int) (jLongValue / 60000);
            }
        }
        return 0;
    }

    public static final boolean d(SubscriptionPeriod subscriptionPeriod) {
        ju.t.f(subscriptionPeriod, "<this>");
        Long lB = np.h.f67075a.b(subscriptionPeriod.getUntil());
        return lB != null && lB.longValue() - System.currentTimeMillis() <= 0;
    }
}
