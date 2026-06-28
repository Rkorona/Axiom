package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.l1;
import ju.t;
import zu.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends l1.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0 f41393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f41394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final iu.l f41395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final iu.l f41396h;

    public o(k0 k0Var, String str, iu.l lVar, iu.l lVar2) {
        t.f(k0Var, "remoteCryptorFlow");
        t.f(str, "wizardId");
        t.f(lVar, "onUpdateCaPrivateKey");
        t.f(lVar2, "onUpdateSetupStep");
        this.f41393e = k0Var;
        this.f41394f = str;
        this.f41395g = lVar;
        this.f41396h = lVar2;
    }

    @Override // androidx.lifecycle.l1.d, androidx.lifecycle.l1.c
    public i1 c(Class cls) {
        t.f(cls, "modelClass");
        if (cls.isAssignableFrom(SshIdSetUsernameViewModel.class)) {
            return new SshIdSetUsernameViewModel(this.f41393e, this.f41394f, this.f41395g, this.f41396h);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: modelClass: " + cls.getName());
    }
}
