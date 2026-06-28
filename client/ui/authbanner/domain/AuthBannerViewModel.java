package com.server.auditor.ssh.client.ui.authbanner.domain;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import au.b;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class AuthBannerViewModel extends i1 {
    public static final int $stable = 8;
    private w _bannerMessage;
    private final k0 bannerMessage;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39642a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, e eVar) {
            super(2, eVar);
            this.f39644c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return AuthBannerViewModel.this.new a(this.f39644c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            b.f();
            if (this.f39642a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = AuthBannerViewModel.this._bannerMessage;
            String str = this.f39644c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, str));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public AuthBannerViewModel() {
        w wVarA = zu.m0.a("");
        this._bannerMessage = wVarA;
        this.bannerMessage = h.b(wVarA);
    }

    public final k0 getBannerMessage() {
        return this.bannerMessage;
    }

    public final void updateBannerMessage(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        k.d(j1.a(this), null, null, new a(str, null), 3, null);
    }
}
