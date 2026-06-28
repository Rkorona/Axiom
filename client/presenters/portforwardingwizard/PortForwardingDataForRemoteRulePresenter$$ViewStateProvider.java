package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import com.server.auditor.ssh.client.contracts.portforwardingwizard.q;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class PortForwardingDataForRemoteRulePresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new q();
    }
}
