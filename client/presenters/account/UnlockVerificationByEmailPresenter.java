package com.server.auditor.ssh.client.presenters.account;

import android.content.SharedPreferences;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.contracts.account.j0;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorContainer;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorType;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.presenters.account.UnlockVerificationByEmailPresenter;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.AuthyTokenErrorModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.MinimalVersionErrorModel;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository;
import hg.b2;
import java.util.Arrays;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import og.u;
import qi.e;
import ut.m0;
import ut.x;
import wu.i0;
import wu.x0;
import yg.c;

/* JADX INFO: loaded from: classes4.dex */
public final class UnlockVerificationByEmailPresenter extends MvpPresenter<j0> implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AuthenticationModel f36898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f36899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f36900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qi.e f36902e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36903a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, zt.e eVar) {
            super(2, eVar);
            this.f36905c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new a(this.f36905c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36903a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(new LoginErrorType.AppIsOutDated(this.f36905c)));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36906a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f36908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Integer num, zt.e eVar) {
            super(2, eVar);
            this.f36908c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new b(this.f36908c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36906a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(new LoginErrorType.AuthIsBlocked(this.f36908c)));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36909a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36909a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36911a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36911a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(LoginErrorType.CannotInitializeClientSession.INSTANCE));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36913a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36913a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(LoginErrorType.ClientNotAgreeServerPublicData.INSTANCE));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36915a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36915a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().d1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36917a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(UnlockVerificationByEmailPresenter unlockVerificationByEmailPresenter, boolean z10) {
            if (z10) {
                unlockVerificationByEmailPresenter.D2();
            } else {
                unlockVerificationByEmailPresenter.getViewState().g();
                unlockVerificationByEmailPresenter.getViewState().s0(new LoginErrorContainer(LoginErrorType.NetworkError.INSTANCE));
            }
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36917a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            final UnlockVerificationByEmailPresenter unlockVerificationByEmailPresenter = UnlockVerificationByEmailPresenter.this;
            tp.d.a(new iu.l() { // from class: com.server.auditor.ssh.client.presenters.account.c
                @Override // iu.l
                public final Object invoke(Object obj2) {
                    return UnlockVerificationByEmailPresenter.g.k(unlockVerificationByEmailPresenter, ((Boolean) obj2).booleanValue());
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36919a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f36921c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new h(this.f36921c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36919a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(new LoginErrorType.KeyGenerationFail(this.f36921c)));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36922a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36922a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().e();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36924a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f36926c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new j(this.f36926c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36924a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(new LoginErrorType.LoginError(this.f36926c)));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36927a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36927a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(LoginErrorType.LoginFailed.INSTANCE));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36929a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MinimalVersionErrorModel f36931c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(MinimalVersionErrorModel minimalVersionErrorModel, zt.e eVar) {
            super(2, eVar);
            this.f36931c = minimalVersionErrorModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new l(this.f36931c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36929a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(new LoginErrorType.LoginMinimalVersionError(this.f36931c)));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36932a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36932a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().e();
            UnlockVerificationByEmailPresenter.this.getViewState().g();
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(LoginErrorType.NetworkError.INSTANCE));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36934a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36934a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (UnlockVerificationByEmailPresenter.this.f36898a instanceof EmailAuthentication) {
                UnlockVerificationByEmailPresenter.this.getViewState().ae((EmailAuthentication) UnlockVerificationByEmailPresenter.this.f36898a, new String(UnlockVerificationByEmailPresenter.this.f36899b, su.d.f78241b));
            } else {
                UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(LoginErrorType.LoginFailed.INSTANCE));
                UnlockVerificationByEmailPresenter.this.getViewState().b();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36936a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, zt.e eVar) {
            super(2, eVar);
            this.f36938c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new o(this.f36938c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36936a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(new LoginErrorType.SignInInvalidCredentials(this.f36938c)));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36939a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36939a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(LoginErrorType.SignInUnexpectedError.INSTANCE));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36941a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36941a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(LoginErrorType.TeamSSORequired.INSTANCE));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36943a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36945c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, zt.e eVar) {
            super(2, eVar);
            this.f36945c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new r(this.f36945c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36943a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.getViewState().s0(new LoginErrorContainer(new LoginErrorType.UserScheduledToDelete(this.f36945c)));
            UnlockVerificationByEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36946a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f36948c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f36948c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new s(this.f36948c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36946a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UnlockVerificationByEmailPresenter.this.C2();
            UnlockVerificationByEmailPresenter.this.x2();
            UnlockVerificationByEmailPresenter.this.f36900c.Y0(this.f36948c);
            UnlockVerificationByEmailPresenter.this.getViewState().n();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36949a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailPresenter.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36949a;
            if (i10 == 0) {
                x.b(obj);
                qi.e eVar = UnlockVerificationByEmailPresenter.this.f36902e;
                AuthenticationModel authenticationModel = UnlockVerificationByEmailPresenter.this.f36898a;
                byte[] bArr = UnlockVerificationByEmailPresenter.this.f36899b;
                this.f36949a = 1;
                if (eVar.C(authenticationModel, bArr, this) == objF) {
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
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public UnlockVerificationByEmailPresenter(AuthenticationModel authenticationModel, byte[] bArr) {
        ju.t.f(authenticationModel, "authenticationModel");
        ju.t.f(bArr, "encodedPassword");
        this.f36898a = authenticationModel;
        this.f36899b = bArr;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f36900c = aVarN;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f36901d = aVarY;
        lg.c cVar = new lg.c();
        b2 b2Var = b2.f52944a;
        com.server.auditor.ssh.client.repositories.auth.j jVar = new com.server.auditor.ssh.client.repositories.auth.j(b2Var.P1(), b2Var.B1(), b2Var.s1());
        u uVar = new u();
        og.k kVar = new og.k(new c.a());
        kl.a aVarI1 = b2Var.i1();
        og.a aVarO0 = b2Var.O0();
        ju.t.e(aVarY, "avoAnalytics");
        og.o oVar = new og.o(aVarY, x0.c(), null, 4, null);
        SyncServiceHelper syncServiceHelperY = hg.f.p().Y();
        ju.t.e(syncServiceHelperY, "getSyncServiceHelper(...)");
        ju.t.e(aVarN, "termiusStorage");
        ju.t.e(aVarN, "termiusStorage");
        wn.m mVar = new wn.m(b2Var.y1());
        mv.b bVarS1 = b2Var.s1();
        hg.d dVarM = aVarN.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        fj.a aVar = new fj.a(aVarN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mVar, new UserAvatarDownloadAttemptTimestampRepository(bVarS1, dVarM), null, 5242878, null);
        ju.t.e(aVarY, "avoAnalytics");
        this.f36902e = new qi.e(cVar, jVar, uVar, kVar, aVarI1, aVarO0, oVar, syncServiceHelperY, aVarN, aVar, aVarY, PresenterScopeKt.getPresenterScope(this), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2() {
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        SharedPreferences.Editor editorEdit = dVarM.edit();
        editorEdit.putBoolean(WelcomeFlowViewModel.keyPrefOnboarding, true);
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2() {
        getViewState().d();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new t(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2() {
        Arrays.fill(this.f36899b, (byte) 0);
    }

    private final String y2(AuthenticationModel authenticationModel) {
        if (authenticationModel instanceof EmailAuthentication) {
            return ((EmailAuthentication) authenticationModel).getEmail();
        }
        if (authenticationModel instanceof EnterpriseSingleSignOnAuthentication) {
            return ((EnterpriseSingleSignOnAuthentication) authenticationModel).getEmail();
        }
        if (authenticationModel instanceof FirebaseSingleSignOnAuthentication) {
            return ((FirebaseSingleSignOnAuthentication) authenticationModel).getEmail();
        }
        throw new ut.s();
    }

    public final void A2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // qi.e.a
    public void Q0(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new s(z10, null), 3, null);
    }

    @Override // qi.e.a
    public void a(AuthyTokenErrorModel authyTokenErrorModel) {
        ju.t.f(authyTokenErrorModel, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    @Override // qi.e.a
    public void b(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, null), 3, null);
    }

    @Override // qi.e.a
    public void c() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    @Override // qi.e.a
    public void d() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // qi.e.a
    public void e() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    @Override // qi.e.a
    public void f(MinimalVersionErrorModel minimalVersionErrorModel) {
        ju.t.f(minimalVersionErrorModel, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(minimalVersionErrorModel, null), 3, null);
    }

    @Override // qi.e.a
    public void h() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // qi.e.a
    public void i(String str) {
        ju.t.f(str, "details");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    @Override // qi.e.a
    public void j(Integer num) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(num, null), 3, null);
    }

    @Override // qi.e.a
    public void k(String str) {
        ju.t.f(str, "details");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(str, null), 3, null);
    }

    @Override // qi.e.a
    public void l(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r(str, null), 3, null);
    }

    @Override // qi.e.a
    public void m(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(str, null), 3, null);
    }

    @Override // qi.e.a
    public void n() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // qi.e.a
    public void o(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(str, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().u(y2(this.f36898a));
    }

    @Override // qi.e.a
    public void p() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(null), 3, null);
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }
}
