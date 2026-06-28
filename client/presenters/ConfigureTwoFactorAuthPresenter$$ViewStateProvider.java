package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.q2;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigureTwoFactorAuthPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new q2();
    }
}
