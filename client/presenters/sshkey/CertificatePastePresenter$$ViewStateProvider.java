package com.server.auditor.ssh.client.presenters.sshkey;

import com.server.auditor.ssh.client.contracts.sshkey.a;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* JADX INFO: loaded from: classes4.dex */
public class CertificatePastePresenter$$ViewStateProvider extends ViewStateProvider {
    @Override // moxy.ViewStateProvider
    public MvpViewState<? extends MvpView> getViewState() {
        return new a();
    }
}
