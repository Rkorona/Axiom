package com.server.auditor.ssh.client.presenters.auth;

import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class LoginRequireTwoFactorCodePresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new com.server.auditor.ssh.client.contracts.auth.a();
    }
}
