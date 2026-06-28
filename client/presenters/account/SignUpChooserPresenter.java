package com.server.auditor.ssh.client.presenters.account;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.contracts.account.d0;
import com.server.auditor.ssh.client.models.account.AppleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.GoogleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import hg.b2;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import nj.e;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SignUpChooserPresenter extends MvpPresenter<d0> implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f36715d = com.server.auditor.ssh.client.app.a.N();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36716e = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qi.c f36717f;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36718a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36718a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().P8();
            SignUpChooserPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36720a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36722c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f36722c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new b(this.f36722c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36720a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().k(this.f36722c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36723a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36726d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f36725c = str;
            this.f36726d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new c(this.f36725c, this.f36726d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36723a;
            if (i10 == 0) {
                x.b(obj);
                SignUpChooserPresenter.this.getViewState().e2();
                AppleSingleSignOnAuthentication appleSingleSignOnAuthentication = new AppleSingleSignOnAuthentication(this.f36725c, this.f36726d);
                SignUpChooserPresenter signUpChooserPresenter = SignUpChooserPresenter.this;
                this.f36723a = 1;
                if (signUpChooserPresenter.I2(appleSingleSignOnAuthentication, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36727a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36727a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36729a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36729a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().c1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36731a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36731a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().ba(SignUpChooserPresenter.this.f36712a, SignUpChooserPresenter.this.f36714c, SignUpChooserPresenter.this.f36713b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36733a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36733a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().H1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36735a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36735a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().e();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36737a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f36739c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new i(this.f36739c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36737a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().e();
            SignUpChooserPresenter.this.getViewState().Y(this.f36739c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36740a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36740a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().e();
            SignUpChooserPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36742a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f36744c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new k(this.f36744c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36742a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().e();
            SignUpChooserPresenter.this.getViewState().k(this.f36744c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36745a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36748d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f36747c = str;
            this.f36748d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new l(this.f36747c, this.f36748d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36745a;
            if (i10 == 0) {
                x.b(obj);
                SignUpChooserPresenter.this.getViewState().A2();
                SignUpChooserPresenter.this.getViewState().e2();
                GoogleSingleSignOnAuthentication googleSingleSignOnAuthentication = new GoogleSingleSignOnAuthentication(this.f36747c, this.f36748d);
                SignUpChooserPresenter signUpChooserPresenter = SignUpChooserPresenter.this;
                this.f36745a = 1;
                if (signUpChooserPresenter.I2(googleSingleSignOnAuthentication, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36749a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36749a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().v0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36751a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36751a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().N(SignUpChooserPresenter.this.f36712a, SignUpChooserPresenter.this.f36713b, SignUpChooserPresenter.this.f36714c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36753a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f36755c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Intent intent, zt.e eVar) {
            super(2, eVar);
            this.f36755c = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new o(this.f36755c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36753a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().d();
            SignUpChooserPresenter.this.getViewState().K1(this.f36755c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36756a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36756a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            hg.d dVarM = SignUpChooserPresenter.this.f36715d.M();
            t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
            SharedPreferences.Editor editorEdit = dVarM.edit();
            editorEdit.putBoolean(WelcomeFlowViewModel.keyPrefOnboarding, true);
            editorEdit.apply();
            SignUpChooserPresenter.this.f36715d.X0(WelcomeFlowViewModel.planTypeFree);
            SignUpChooserPresenter.this.f36716e.X5();
            SignUpChooserPresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36758a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpChooserPresenter.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36758a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpChooserPresenter.this.getViewState().V1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36761b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36763d;

        r(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36761b = obj;
            this.f36763d |= RtlSpacingHelper.UNDEFINED;
            return SignUpChooserPresenter.this.I2(null, this);
        }
    }

    public SignUpChooserPresenter(int i10, boolean z10, boolean z11) {
        this.f36712a = i10;
        this.f36713b = z10;
        this.f36714c = z11;
        b2 b2Var = b2.f52944a;
        this.f36717f = new qi.c(new com.server.auditor.ssh.client.repositories.auth.h(b2Var.O1(), b2Var.B1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication r5, zt.e r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.account.SignUpChooserPresenter.I2(com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication, zt.e):java.lang.Object");
    }

    public final void A2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // nj.e.a
    public void D0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // nj.e.a
    public void D1(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(str, null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    public final void E2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    public final void F2(Intent intent) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(intent, null), 3, null);
    }

    public final void G2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(null), 3, null);
    }

    public final void H2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    @Override // nj.e.a
    public void T1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // nj.e.a
    public void Y1(String str, String str2) {
        t.f(str, "token");
        t.f(str2, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str2, str, null), 3, null);
    }

    @Override // nj.e.a
    public void f0(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(str, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        boolean z10 = false;
        boolean z11 = this.f36715d.M().getBoolean(WelcomeFlowViewModel.keyPrefOnboarding, false);
        d0 viewState = getViewState();
        if (!z11 && !this.f36715d.r0()) {
            z10 = true;
        }
        viewState.ea(z10);
        getViewState().gf(this.f36712a);
        this.f36716e.d5(this.f36712a);
    }

    public final void w2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void x2(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str, null), 3, null);
    }

    public final void y2(String str, String str2) {
        t.f(str, "token");
        t.f(str2, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str2, str, null), 3, null);
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }
}
