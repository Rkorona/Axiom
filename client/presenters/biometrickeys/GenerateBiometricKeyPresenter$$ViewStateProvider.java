package com.server.auditor.ssh.client.presenters.biometrickeys;

import com.server.auditor.ssh.client.contracts.views.biometrickeys.c;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class GenerateBiometricKeyPresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new c();
    }
}
