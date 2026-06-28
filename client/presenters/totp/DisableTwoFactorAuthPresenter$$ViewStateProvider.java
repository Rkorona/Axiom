package com.server.auditor.ssh.client.presenters.totp;

import com.server.auditor.ssh.client.contracts.u2;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class DisableTwoFactorAuthPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new u2();
    }
}
