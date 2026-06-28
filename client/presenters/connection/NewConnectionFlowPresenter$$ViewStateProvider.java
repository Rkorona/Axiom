package com.server.auditor.ssh.client.presenters.connection;

import com.server.auditor.ssh.client.contracts.connection.c;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class NewConnectionFlowPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new c();
    }
}
