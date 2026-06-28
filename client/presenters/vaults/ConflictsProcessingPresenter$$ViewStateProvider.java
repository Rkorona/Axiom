package com.server.auditor.ssh.client.presenters.vaults;

import com.server.auditor.ssh.client.contracts.vaults.a;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class ConflictsProcessingPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new a();
    }
}
