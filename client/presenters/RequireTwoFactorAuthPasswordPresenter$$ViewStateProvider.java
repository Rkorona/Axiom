package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.y2;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class RequireTwoFactorAuthPasswordPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new y2();
    }
}
