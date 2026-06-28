package com.server.auditor.ssh.client.ui.auth.promo.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class NavigateToCongratulationScreen {
    public static final int $stable = 0;
    private final int trialDays;

    public NavigateToCongratulationScreen(int i10) {
        this.trialDays = i10;
    }

    public static /* synthetic */ NavigateToCongratulationScreen copy$default(NavigateToCongratulationScreen navigateToCongratulationScreen, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = navigateToCongratulationScreen.trialDays;
        }
        return navigateToCongratulationScreen.copy(i10);
    }

    public final int component1() {
        return this.trialDays;
    }

    public final NavigateToCongratulationScreen copy(int i10) {
        return new NavigateToCongratulationScreen(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NavigateToCongratulationScreen) && this.trialDays == ((NavigateToCongratulationScreen) obj).trialDays;
    }

    public final int getTrialDays() {
        return this.trialDays;
    }

    public int hashCode() {
        return Integer.hashCode(this.trialDays);
    }

    public String toString() {
        return "NavigateToCongratulationScreen(trialDays=" + this.trialDays + ")";
    }
}
