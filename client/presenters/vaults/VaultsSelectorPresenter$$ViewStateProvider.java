package com.server.auditor.ssh.client.presenters.vaults;

import com.server.auditor.ssh.client.contracts.vaults.g;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class VaultsSelectorPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new g();
    }
}
