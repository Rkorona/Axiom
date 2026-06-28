package com.server.auditor.ssh.client.presenters.team;

import com.server.auditor.ssh.client.contracts.v0;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class ExpiredTeamMemberPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new v0();
    }
}
