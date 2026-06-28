package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.l1;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends l1.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f41390g = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f41391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f41392f;

    public n(String str, String str2) {
        t.f(str, "sshIdUsername");
        t.f(str2, "wizardId");
        this.f41391e = str;
        this.f41392f = str2;
    }

    @Override // androidx.lifecycle.l1.d, androidx.lifecycle.l1.c
    public i1 c(Class cls) {
        t.f(cls, "modelClass");
        if (cls.isAssignableFrom(SshIdReadyScreenViewModel.class)) {
            return new SshIdReadyScreenViewModel(this.f41391e, this.f41392f);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: modelClass: " + cls.getName());
    }
}
