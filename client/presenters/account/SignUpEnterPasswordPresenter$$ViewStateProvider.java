package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.contracts.account.g0;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class SignUpEnterPasswordPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new g0();
    }
}
