package com.server.auditor.ssh.client.ui.auth.signin.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class FinishWelcomeSignInAction {
    public static final int $stable = 0;
    private final boolean isProModeActive;

    public FinishWelcomeSignInAction(boolean z10) {
        this.isProModeActive = z10;
    }

    public static /* synthetic */ FinishWelcomeSignInAction copy$default(FinishWelcomeSignInAction finishWelcomeSignInAction, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = finishWelcomeSignInAction.isProModeActive;
        }
        return finishWelcomeSignInAction.copy(z10);
    }

    public final boolean component1() {
        return this.isProModeActive;
    }

    public final FinishWelcomeSignInAction copy(boolean z10) {
        return new FinishWelcomeSignInAction(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FinishWelcomeSignInAction) && this.isProModeActive == ((FinishWelcomeSignInAction) obj).isProModeActive;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isProModeActive);
    }

    public final boolean isProModeActive() {
        return this.isProModeActive;
    }

    public String toString() {
        return "FinishWelcomeSignInAction(isProModeActive=" + this.isProModeActive + ")";
    }
}
