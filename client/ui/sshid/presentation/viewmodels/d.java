package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.l1;
import ju.t;
import zu.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends l1.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0 f41376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0 f41377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f41378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final iu.l f41379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final iu.l f41380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final iu.l f41381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final iu.l f41382k;

    public d(k0 k0Var, k0 k0Var2, String str, iu.l lVar, iu.l lVar2, iu.l lVar3, iu.l lVar4) {
        t.f(k0Var, "remoteCryptorFlow");
        t.f(k0Var2, "caPrivateKeyFlow");
        t.f(str, "analyticsWizardId");
        t.f(lVar, "onUpdateCaPrivateKey");
        t.f(lVar2, "onRequestRemoteCryptor");
        t.f(lVar3, "onUpdateIsCompleteSetup");
        t.f(lVar4, "onUpdateSetupStep");
        this.f41376e = k0Var;
        this.f41377f = k0Var2;
        this.f41378g = str;
        this.f41379h = lVar;
        this.f41380i = lVar2;
        this.f41381j = lVar3;
        this.f41382k = lVar4;
    }

    @Override // androidx.lifecycle.l1.d, androidx.lifecycle.l1.c
    public i1 c(Class cls) {
        t.f(cls, "modelClass");
        if (!cls.isAssignableFrom(SshIdPasskeysGenerationViewModel.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class: modelClass: " + cls.getName());
        }
        return new SshIdPasskeysGenerationViewModel(this.f41376e, this.f41377f, this.f41378g, this.f41379h, this.f41380i, this.f41381j, this.f41382k, null, 128, null);
    }
}
