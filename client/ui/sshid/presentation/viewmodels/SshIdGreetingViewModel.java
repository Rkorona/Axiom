package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.annotation.Keep;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdGreetingScreenActions;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository;
import com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdDataFromBackendUseCase;
import cp.b;
import cp.d;
import cp.e;
import cp.f;
import gp.e;
import gp.v;
import hg.b2;
import io.sentry.a1;
import io.sentry.h7;
import ju.t;
import po.b;
import po.c;
import ut.m0;
import ut.x;
import wu.i0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdGreetingViewModel extends i1 {
    public static final int $stable = 8;
    private final w _greetingScreenState;
    private final yu.d _screenActionFlow;
    private final gp.d clearSshIdDataUseCase;
    private final k0 greetingScreenState;
    private final iu.l onUpdateCaPrivateKey;
    private rg.h remoteCryptor;
    private final RequestSshIdDataFromBackendUseCase requestSshIdDataFromBackendUseCase;
    private final zu.f screenActionFlow;
    private final v shouldRegeneratePasskeysUseCase;
    private final zo.b sshIdDatabaseInteractor;
    private final com.server.auditor.ssh.client.app.a termiusStorage;

    @Keep
    public static abstract class GreetingScreenState {
        public static final int $stable = 0;

        public static final class a extends GreetingScreenState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f41141a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1497671226;
            }

            public String toString() {
                return "RequestInProgress";
            }
        }

        public static final class b extends GreetingScreenState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f41142a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -98897212;
            }

            public String toString() {
                return "SshIdDoesNotFound";
            }
        }

        public /* synthetic */ GreetingScreenState(ju.k kVar) {
            this();
        }

        private GreetingScreenState() {
        }
    }

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0 f41144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshIdGreetingViewModel f41145c;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdGreetingViewModel$a$a, reason: collision with other inner class name */
        static final class C0650a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SshIdGreetingViewModel f41146a;

            C0650a(SshIdGreetingViewModel sshIdGreetingViewModel) {
                this.f41146a = sshIdGreetingViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(rg.h hVar, zt.e eVar) {
                if (this.f41146a.remoteCryptor == null && hVar != null) {
                    this.f41146a.remoteCryptor = hVar;
                    this.f41146a.checkRelevantSshIdStateOnBackend(hVar);
                }
                return m0.f82633a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0 k0Var, SshIdGreetingViewModel sshIdGreetingViewModel, zt.e eVar) {
            super(2, eVar);
            this.f41144b = k0Var;
            this.f41145c = sshIdGreetingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f41144b, this.f41145c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41143a;
            if (i10 == 0) {
                x.b(obj);
                k0 k0Var = this.f41144b;
                C0650a c0650a = new C0650a(this.f41145c);
                this.f41143a = 1;
                if (k0Var.collect(c0650a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            throw new ut.j();
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41148b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ rg.h f41150d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rg.h hVar, zt.e eVar) {
            super(2, eVar);
            this.f41150d = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(gp.e eVar, a1 a1Var) {
            io.sentry.f fVarB = y9.b.b("Error while clearing the SSH ID-related database", b.a.f70430c, c.C1098c.f70437b);
            fVarB.F(h7.ERROR);
            e.a aVar = (e.a) eVar;
            fVarB.E("Clearing SSH ID database step", aVar.b());
            fVarB.E("Clearing SSH ID database exception info", aVar.a());
            a1Var.b(fVarB);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdGreetingViewModel.this.new b(this.f41150d, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
        
            if (r8.b(r1, r7) != r0) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
        
            if (r8 == r0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
        
            if (r8.b(r1, r7) != r0) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x016c, code lost:
        
            if (r8 == r0) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 500
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdGreetingViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41151a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdGreetingViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41151a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdGreetingViewModel.this._screenActionFlow;
                SshIdGreetingScreenActions.a aVar = SshIdGreetingScreenActions.a.f40864a;
                this.f41151a = 1;
                if (dVar.b(aVar, this) == objF) {
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
        int f41153a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdGreetingViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41153a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdGreetingViewModel.this._screenActionFlow;
                SshIdGreetingScreenActions.b bVar = SshIdGreetingScreenActions.b.f40865a;
                this.f41153a = 1;
                if (dVar.b(bVar, this) == objF) {
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41155a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdGreetingViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41155a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdGreetingViewModel.this._screenActionFlow;
                SshIdGreetingScreenActions.d dVar2 = SshIdGreetingScreenActions.d.f40867a;
                this.f41155a = 1;
                if (dVar.b(dVar2, this) == objF) {
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
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public /* synthetic */ SshIdGreetingViewModel(k0 k0Var, iu.l lVar, gp.d dVar, int i10, ju.k kVar) {
        this(k0Var, lVar, (i10 & 4) != 0 ? new gp.d(null, null, 3, null) : dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkRelevantSshIdStateOnBackend(rg.h hVar) {
        wu.k.d(j1.a(this), null, null, new b(hVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGreetingScreenState(GreetingScreenState greetingScreenState) {
        this._greetingScreenState.setValue(greetingScreenState);
    }

    public final k0 getGreetingScreenState() {
        return this.greetingScreenState;
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onHandleBackButtonClicked() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onHandleLearnMoreClicked() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onHandleStartSetupClicked() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SshIdGreetingViewModel(k0 k0Var, iu.l lVar, gp.d dVar) {
        t.f(k0Var, "remoteCryptorFlow");
        t.f(lVar, "onUpdateCaPrivateKey");
        t.f(dVar, "clearSshIdDataUseCase");
        this.onUpdateCaPrivateKey = lVar;
        this.clearSshIdDataUseCase = dVar;
        this.termiusStorage = com.server.auditor.ssh.client.app.a.N();
        b2 b2Var = b2.f52944a;
        this.requestSshIdDataFromBackendUseCase = new RequestSshIdDataFromBackendUseCase(new SshIdGetInfoApiRepository(b2Var.O1(), b2Var.B1()));
        this.shouldRegeneratePasskeysUseCase = new v(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.sshIdDatabaseInteractor = new zo.b(e.a.b(cp.e.f46961d, null, 1, null), f.a.b(cp.f.f47012b, null, 1, null), d.a.b(cp.d.f46939d, null, 1, null), b.a.b(cp.b.f46898d, null, 1, null), null, 16, null);
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = zu.h.M(dVarB);
        w wVarA = zu.m0.a(GreetingScreenState.a.f41141a);
        this._greetingScreenState = wVarA;
        this.greetingScreenState = zu.h.b(wVarA);
        wu.k.d(j1.a(this), null, null, new a(k0Var, this, null), 3, null);
    }
}
