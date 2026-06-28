package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.t0;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class ExpiredEnterpriseBasicPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new t0();
    }
}
