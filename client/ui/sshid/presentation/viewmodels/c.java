package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.l1;
import ju.t;
import zu.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends l1.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0 f41374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final iu.l f41375f;

    public c(k0 k0Var, iu.l lVar) {
        t.f(k0Var, "remoteCryptorFlow");
        t.f(lVar, "onUpdateCaPrivateKey");
        this.f41374e = k0Var;
        this.f41375f = lVar;
    }

    @Override // androidx.lifecycle.l1.d, androidx.lifecycle.l1.c
    public i1 c(Class cls) {
        t.f(cls, "modelClass");
        if (cls.isAssignableFrom(SshIdGreetingViewModel.class)) {
            return new SshIdGreetingViewModel(this.f41374e, this.f41375f, null, 4, null);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: modelClass: " + cls.getName());
    }
}
