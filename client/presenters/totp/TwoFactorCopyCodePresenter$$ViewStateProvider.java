package com.server.auditor.ssh.client.presenters.totp;

import com.server.auditor.ssh.client.contracts.s2;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class TwoFactorCopyCodePresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new s2();
    }
}
