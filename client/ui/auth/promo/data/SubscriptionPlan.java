package com.server.auditor.ssh.client.ui.auth.promo.data;

import androidx.annotation.Keep;
import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.billing.BillingSubscriptionType;
import java.util.Date;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class SubscriptionPlan {
    public static final int $stable = 8;
    private final BillingSubscriptionType.Pro billingSubscriptionType;
    private final String economy;
    private final Date firstChargeDate;
    private final boolean isSelected;
    private final String planName;
    private final String price;
    private final String saveBadge;
    private final String subtitle;
    private final String title;
    private final int trialDays;

    public SubscriptionPlan(BillingSubscriptionType.Pro pro, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, Date date, int i10) {
        t.f(pro, "billingSubscriptionType");
        t.f(str, "planName");
        t.f(str2, "title");
        t.f(str3, "subtitle");
        t.f(str4, "price");
        t.f(str5, "economy");
        t.f(str6, "saveBadge");
        t.f(date, "firstChargeDate");
        this.billingSubscriptionType = pro;
        this.planName = str;
        this.isSelected = z10;
        this.title = str2;
        this.subtitle = str3;
        this.price = str4;
        this.economy = str5;
        this.saveBadge = str6;
        this.firstChargeDate = date;
        this.trialDays = i10;
    }

    public static /* synthetic */ SubscriptionPlan copy$default(SubscriptionPlan subscriptionPlan, BillingSubscriptionType.Pro pro, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, Date date, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pro = subscriptionPlan.billingSubscriptionType;
        }
        if ((i11 & 2) != 0) {
            str = subscriptionPlan.planName;
        }
        if ((i11 & 4) != 0) {
            z10 = subscriptionPlan.isSelected;
        }
        if ((i11 & 8) != 0) {
            str2 = subscriptionPlan.title;
        }
        if ((i11 & 16) != 0) {
            str3 = subscriptionPlan.subtitle;
        }
        if ((i11 & 32) != 0) {
            str4 = subscriptionPlan.price;
        }
        if ((i11 & 64) != 0) {
            str5 = subscriptionPlan.economy;
        }
        if ((i11 & 128) != 0) {
            str6 = subscriptionPlan.saveBadge;
        }
        if ((i11 & 256) != 0) {
            date = subscriptionPlan.firstChargeDate;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            i10 = subscriptionPlan.trialDays;
        }
        Date date2 = date;
        int i12 = i10;
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return subscriptionPlan.copy(pro, str, z10, str2, str9, str10, str7, str8, date2, i12);
    }

    public final BillingSubscriptionType.Pro component1() {
        return this.billingSubscriptionType;
    }

    public final int component10() {
        return this.trialDays;
    }

    public final String component2() {
        return this.planName;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.price;
    }

    public final String component7() {
        return this.economy;
    }

    public final String component8() {
        return this.saveBadge;
    }

    public final Date component9() {
        return this.firstChargeDate;
    }

    public final SubscriptionPlan copy(BillingSubscriptionType.Pro pro, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, Date date, int i10) {
        t.f(pro, "billingSubscriptionType");
        t.f(str, "planName");
        t.f(str2, "title");
        t.f(str3, "subtitle");
        t.f(str4, "price");
        t.f(str5, "economy");
        t.f(str6, "saveBadge");
        t.f(date, "firstChargeDate");
        return new SubscriptionPlan(pro, str, z10, str2, str3, str4, str5, str6, date, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPlan)) {
            return false;
        }
        SubscriptionPlan subscriptionPlan = (SubscriptionPlan) obj;
        return t.b(this.billingSubscriptionType, subscriptionPlan.billingSubscriptionType) && t.b(this.planName, subscriptionPlan.planName) && this.isSelected == subscriptionPlan.isSelected && t.b(this.title, subscriptionPlan.title) && t.b(this.subtitle, subscriptionPlan.subtitle) && t.b(this.price, subscriptionPlan.price) && t.b(this.economy, subscriptionPlan.economy) && t.b(this.saveBadge, subscriptionPlan.saveBadge) && t.b(this.firstChargeDate, subscriptionPlan.firstChargeDate) && this.trialDays == subscriptionPlan.trialDays;
    }

    public final BillingSubscriptionType.Pro getBillingSubscriptionType() {
        return this.billingSubscriptionType;
    }

    public final String getEconomy() {
        return this.economy;
    }

    public final Date getFirstChargeDate() {
        return this.firstChargeDate;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getSaveBadge() {
        return this.saveBadge;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTrialDays() {
        return this.trialDays;
    }

    public int hashCode() {
        return (((((((((((((((((this.billingSubscriptionType.hashCode() * 31) + this.planName.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.price.hashCode()) * 31) + this.economy.hashCode()) * 31) + this.saveBadge.hashCode()) * 31) + this.firstChargeDate.hashCode()) * 31) + Integer.hashCode(this.trialDays);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "SubscriptionPlan(billingSubscriptionType=" + this.billingSubscriptionType + ", planName=" + this.planName + ", isSelected=" + this.isSelected + ", title=" + this.title + ", subtitle=" + this.subtitle + ", price=" + this.price + ", economy=" + this.economy + ", saveBadge=" + this.saveBadge + ", firstChargeDate=" + this.firstChargeDate + ", trialDays=" + this.trialDays + ")";
    }

    public /* synthetic */ SubscriptionPlan(BillingSubscriptionType.Pro pro, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, Date date, int i10, int i11, k kVar) {
        this(pro, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? new Date() : date, (i11 & File.FLAG_O_TRUNC) != 0 ? 0 : i10);
    }
}
