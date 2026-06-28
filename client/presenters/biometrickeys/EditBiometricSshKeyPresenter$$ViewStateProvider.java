package com.server.auditor.ssh.client.presenters.biometrickeys;

import com.server.auditor.ssh.client.contracts.views.biometrickeys.a;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class EditBiometricSshKeyPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new a();
    }
}
