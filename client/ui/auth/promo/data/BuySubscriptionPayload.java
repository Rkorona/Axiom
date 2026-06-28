package com.server.auditor.ssh.client.ui.auth.promo.data;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.billing.BillingSubscriptionType;
import com.server.auditor.ssh.client.billing.b;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class BuySubscriptionPayload {
    public static final int $stable = 8;
    private final b billingService;
    private final BillingSubscriptionType.Pro subscriptionType;

    public BuySubscriptionPayload(b bVar, BillingSubscriptionType.Pro pro) {
        t.f(bVar, "billingService");
        t.f(pro, "subscriptionType");
        this.billingService = bVar;
        this.subscriptionType = pro;
    }

    public static /* synthetic */ BuySubscriptionPayload copy$default(BuySubscriptionPayload buySubscriptionPayload, b bVar, BillingSubscriptionType.Pro pro, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = buySubscriptionPayload.billingService;
        }
        if ((i10 & 2) != 0) {
            pro = buySubscriptionPayload.subscriptionType;
        }
        return buySubscriptionPayload.copy(bVar, pro);
    }

    public final b component1() {
        return this.billingService;
    }

    public final BillingSubscriptionType.Pro component2() {
        return this.subscriptionType;
    }

    public final BuySubscriptionPayload copy(b bVar, BillingSubscriptionType.Pro pro) {
        t.f(bVar, "billingService");
        t.f(pro, "subscriptionType");
        return new BuySubscriptionPayload(bVar, pro);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuySubscriptionPayload)) {
            return false;
        }
        BuySubscriptionPayload buySubscriptionPayload = (BuySubscriptionPayload) obj;
        return t.b(this.billingService, buySubscriptionPayload.billingService) && t.b(this.subscriptionType, buySubscriptionPayload.subscriptionType);
    }

    public final b getBillingService() {
        return this.billingService;
    }

    public final BillingSubscriptionType.Pro getSubscriptionType() {
        return this.subscriptionType;
    }

    public int hashCode() {
        return (this.billingService.hashCode() * 31) + this.subscriptionType.hashCode();
    }

    public String toString() {
        return "BuySubscriptionPayload(billingService=" + this.billingService + ", subscriptionType=" + this.subscriptionType + ")";
    }
}
