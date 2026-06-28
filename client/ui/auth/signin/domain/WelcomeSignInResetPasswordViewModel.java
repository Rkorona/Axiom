package com.server.auditor.ssh.client.ui.auth.signin.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import androidx.lifecycle.l1;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import wu.i0;
import wu.k;
import yu.d;
import yu.g;
import zt.e;
import zu.f;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeSignInResetPasswordViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final w _error;
    private final w _isProgress;
    private final d _navigateToInstructionsSent;
    private final String email;
    private final k0 error;
    private final k0 isProgress;
    private final f navigateToInstructionsSent;
    private final com.server.auditor.ssh.client.ui.auth.signin.domain.a sendResetPasswordInstructionsUseCase;

    public static final class a implements l1.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39218b;

        public a(String str) {
            t.f(str, "email");
            this.f39218b = str;
        }

        @Override // androidx.lifecycle.l1.c
        public i1 a(Class cls, i5.a aVar) {
            t.f(cls, "modelClass");
            t.f(aVar, "extras");
            Object objA = aVar.a(l1.a.f8762h);
            if (objA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new WelcomeSignInResetPasswordViewModel(this.f39218b, (Application) objA);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39219a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return WelcomeSignInResetPasswordViewModel.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        
            if (r7.b(r1, r6) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signin.domain.WelcomeSignInResetPasswordViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeSignInResetPasswordViewModel(String str, Application application) {
        super(application);
        t.f(str, "email");
        t.f(application, "application");
        this.email = str;
        w wVarA = zu.m0.a(Boolean.FALSE);
        this._isProgress = wVarA;
        this.isProgress = h.b(wVarA);
        w wVarA2 = zu.m0.a("");
        this._error = wVarA2;
        this.error = h.b(wVarA2);
        d dVarB = g.b(-2, null, null, 6, null);
        this._navigateToInstructionsSent = dVarB;
        this.navigateToInstructionsSent = h.M(dVarB);
        b2 b2Var = b2.f52944a;
        this.sendResetPasswordInstructionsUseCase = new com.server.auditor.ssh.client.ui.auth.signin.domain.a(new com.server.auditor.ssh.client.repositories.auth.m(b2Var.P1(), b2Var.B1()));
    }

    public final k0 getError() {
        return this.error;
    }

    public final f getNavigateToInstructionsSent() {
        return this.navigateToInstructionsSent;
    }

    public final k0 isProgress() {
        return this.isProgress;
    }

    public final void onGetInstructionsClick() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }
}
