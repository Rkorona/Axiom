package com.server.auditor.ssh.client.presenters.totp;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.p2;
import iu.p;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class ChooseTwoFactorProviderPresenter extends MvpPresenter<p2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38268b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38269a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ChooseTwoFactorProviderPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38269a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChooseTwoFactorProviderPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38271a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ChooseTwoFactorProviderPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38271a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChooseTwoFactorProviderPresenter.this.f38268b.O2();
            ChooseTwoFactorProviderPresenter.this.getViewState().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38273a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, e eVar) {
            super(2, eVar);
            this.f38275c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ChooseTwoFactorProviderPresenter.this.new c(this.f38275c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38273a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChooseTwoFactorProviderPresenter.this.f38268b.V2(kotlin.coroutines.jvm.internal.b.e(this.f38275c));
            ChooseTwoFactorProviderPresenter.this.getViewState().S2(ChooseTwoFactorProviderPresenter.this.f38267a, this.f38275c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38276a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ChooseTwoFactorProviderPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38276a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChooseTwoFactorProviderPresenter.this.getViewState().M3(ChooseTwoFactorProviderPresenter.this.w2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChooseTwoFactorProviderPresenter(String str) {
        t.f(str, "action");
        this.f38267a = str;
        this.f38268b = com.server.auditor.ssh.client.utils.analytics.a.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List w2() {
        ArrayList arrayList = new ArrayList();
        com.server.auditor.ssh.client.models.x xVar = new com.server.auditor.ssh.client.models.x(0L, R.drawable.ic_totp, R.string.two_factor_provider_totp_name, R.string.two_factor_provider_totp_description);
        com.server.auditor.ssh.client.models.x xVar2 = new com.server.auditor.ssh.client.models.x(1L, R.drawable.ic_authy_red, R.string.two_factor_provider_authy_name, R.string.two_factor_provider_authy_description);
        arrayList.add(xVar);
        arrayList.add(xVar2);
        return arrayList;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void u2(long j10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(j10, null), 3, null);
    }

    public final void v2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }
}
