package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.lifecycle.i1;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdActivityActions;
import com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetupFlowViewModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import cp.e;
import cp.f;
import gp.x;
import hg.b2;
import java.util.UUID;
import ju.t;
import pl.q;
import tp.c0;
import ut.m0;
import wu.i0;
import wu.j1;
import yg.a;
import yg.d;
import zu.a0;
import zu.g0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdSetupFlowViewModel extends i1 {
    public static final int $stable = 8;
    private final yu.d _activityActionFlow;
    private final w _caPrivateKey;
    private final w _isSetupCompleted;
    private final w _isSkPasskeysEnabled;
    private final w _isUseBiometricKeyAsDefault;
    private final w _pushState;
    private final w _remoteEncryptByAnnotation;
    private final k0 _sshIdDbDataFlow;
    private final w _username;
    private final zu.f activityActionFlow;
    private final x analyticsInteractor;
    private String analyticsWizardId;
    private final k0 caPrivateKey;
    private final gp.g createEncryptByAnnotationCryptorUseCase;
    private final k0 isSetupCompleted;
    private final a0 isSkPasskeysEnabled;
    private final k0 isUseBiometricKeyAsDefault;
    private final k0 pushState;
    private final k0 remoteEncryptByAnnotation;
    private Avo.SSHidSetUpStep ssHidSetUpStep;
    private final cp.e sshIdDaoRepository;
    private final cp.f sshIdDevicesDao;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final k0 username;
    private final pp.b vaultsApiInteractor;
    private final q vaultsKeyringRepository;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41319a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetupFlowViewModel$a$a, reason: collision with other inner class name */
        static final class C0651a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SshIdSetupFlowViewModel f41321a;

            C0651a(SshIdSetupFlowViewModel sshIdSetupFlowViewModel) {
                this.f41321a = sshIdSetupFlowViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(bp.d dVar, zt.e eVar) {
                if (dVar == null) {
                    this.f41321a._username.setValue(c0.e());
                    this.f41321a._isSetupCompleted.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    this.f41321a._isSkPasskeysEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                } else {
                    this.f41321a._username.setValue(dVar.f());
                    this.f41321a._isSkPasskeysEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(dVar.h()));
                }
                return m0.f82633a;
            }
        }

        a(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k() {
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41319a;
            if (i10 == 0) {
                ut.x.b(obj);
                SshIdSetupFlowViewModel.this.createRemoteCryptor(new iu.a() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.p
                    @Override // iu.a
                    public final Object a() {
                        return SshIdSetupFlowViewModel.a.k();
                    }
                });
                k0 k0Var = SshIdSetupFlowViewModel.this._sshIdDbDataFlow;
                C0651a c0651a = new C0651a(SshIdSetupFlowViewModel.this);
                this.f41319a = 1;
                if (k0Var.collect(c0651a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
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
        int f41322a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41322a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this._pushState.setValue(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41325b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ iu.a f41327d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(iu.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f41327d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new c(this.f41327d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            w wVar;
            Object objF = au.b.f();
            int i10 = this.f41325b;
            if (i10 == 0) {
                ut.x.b(obj);
                w wVar2 = SshIdSetupFlowViewModel.this._remoteEncryptByAnnotation;
                gp.g gVar = SshIdSetupFlowViewModel.this.createEncryptByAnnotationCryptorUseCase;
                this.f41324a = wVar2;
                this.f41325b = 1;
                Object objB = gp.g.b(gVar, null, this, 1, null);
                if (objB == objF) {
                    return objF;
                }
                wVar = wVar2;
                obj = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (w) this.f41324a;
                ut.x.b(obj);
            }
            wVar.setValue(obj);
            this.f41327d.a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41328a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41328a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.d dVar = SshIdSetupFlowViewModel.this._activityActionFlow;
                SshIdActivityActions.a aVar = SshIdActivityActions.a.f40838a;
                this.f41328a = 1;
                if (dVar.b(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
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
        int f41330a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41330a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41331a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41331a;
            if (i10 == 0) {
                ut.x.b(obj);
                cp.f fVar = SshIdSetupFlowViewModel.this.sshIdDevicesDao;
                this.f41331a = 1;
                obj = fVar.d(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            SshIdSetupFlowViewModel.this.analyticsInteractor.b(((Number) obj).intValue());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41333a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f41335c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new g(this.f41335c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41333a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this.analyticsInteractor.h(SshIdSetupFlowViewModel.this.ssHidSetUpStep, this.f41335c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41336a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this.analyticsInteractor.g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41338a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41338a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this.analyticsInteractor.i();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41343d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Avo.SetupSSHidSource f41345f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Avo.SetupSSHidSource setupSSHidSource, zt.e eVar) {
            super(2, eVar);
            this.f41345f = setupSSHidSource;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new j(this.f41345f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Avo.SetupSSHidSource setupSSHidSource;
            x xVar;
            int i10;
            x xVar2;
            Object objF = au.b.f();
            int i11 = this.f41343d;
            if (i11 == 0) {
                ut.x.b(obj);
                x xVar3 = SshIdSetupFlowViewModel.this.analyticsInteractor;
                setupSSHidSource = this.f41345f;
                cp.f fVar = SshIdSetupFlowViewModel.this.sshIdDevicesDao;
                this.f41340a = xVar3;
                this.f41341b = setupSSHidSource;
                this.f41343d = 1;
                Object objD = fVar.d(this);
                if (objD != objF) {
                    xVar = xVar3;
                    obj = objD;
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f41342c;
                setupSSHidSource = (Avo.SetupSSHidSource) this.f41341b;
                xVar2 = (x) this.f41340a;
                ut.x.b(obj);
                xVar2.j(setupSSHidSource, i10, ((Number) obj).intValue());
                return m0.f82633a;
            }
            setupSSHidSource = (Avo.SetupSSHidSource) this.f41341b;
            xVar = (x) this.f41340a;
            ut.x.b(obj);
            int iIntValue = ((Number) obj).intValue();
            cp.f fVar2 = SshIdSetupFlowViewModel.this.sshIdDevicesDao;
            this.f41340a = xVar;
            this.f41341b = setupSSHidSource;
            this.f41342c = iIntValue;
            this.f41343d = 2;
            Object objF2 = fVar2.f(this);
            if (objF2 != objF) {
                i10 = iIntValue;
                obj = objF2;
                xVar2 = xVar;
                xVar2.j(setupSSHidSource, i10, ((Number) obj).intValue());
                return m0.f82633a;
            }
            return objF;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41346a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f41348c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new k(this.f41348c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41346a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this._caPrivateKey.setValue(this.f41348c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41349a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f41351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f41351c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new l(this.f41351c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41349a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this._isSetupCompleted.setValue(kotlin.coroutines.jvm.internal.b.a(this.f41351c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41352a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f41354c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new m(this.f41354c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41352a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this._pushState.setValue(this.f41354c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41355a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41355a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this._isUseBiometricKeyAsDefault.setValue(kotlin.coroutines.jvm.internal.b.a(true));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41357a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Avo.SSHidSetUpStep f41359c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Avo.SSHidSetUpStep sSHidSetUpStep, zt.e eVar) {
            super(2, eVar);
            this.f41359c = sSHidSetUpStep;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetupFlowViewModel.this.new o(this.f41359c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41357a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdSetupFlowViewModel.this.ssHidSetUpStep = this.f41359c;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdSetupFlowViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        pp.b bVar = new pp.b(b2Var.v1());
        this.vaultsApiInteractor = bVar;
        j1 j1VarB1 = b2Var.B1();
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        androidx.lifecycle.k0 k0VarP = aVarN.P();
        t.e(k0VarP, "getIsSyncingLiveData(...)");
        t.e(aVarN, "termiusStorage");
        q qVar = new q(j1VarB1, dVarM, k0VarP, aVarN, new pl.h(null, 1, null), bVar, new d.a(), new a.C1401a());
        this.vaultsKeyringRepository = qVar;
        t.e(aVarN, "termiusStorage");
        this.createEncryptByAnnotationCryptorUseCase = new gp.g(aVarN, qVar, b2Var.O1());
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._activityActionFlow = dVarB;
        this.activityActionFlow = zu.h.M(dVarB);
        w wVarA = zu.m0.a(null);
        this._pushState = wVarA;
        this.pushState = wVarA;
        cp.e eVarB = e.a.b(cp.e.f46961d, null, 1, null);
        this.sshIdDaoRepository = eVarB;
        this.sshIdDevicesDao = f.a.b(cp.f.f47012b, null, 1, null);
        w wVarA2 = zu.m0.a("");
        this._caPrivateKey = wVarA2;
        this.caPrivateKey = wVarA2;
        w wVarA3 = zu.m0.a(null);
        this._remoteEncryptByAnnotation = wVarA3;
        this.remoteEncryptByAnnotation = zu.h.b(wVarA3);
        this._sshIdDbDataFlow = zu.h.P(eVarB.k(), androidx.lifecycle.j1.a(this), g0.f88389a.d(), null);
        w wVarA4 = zu.m0.a("");
        this._username = wVarA4;
        this.username = zu.h.b(wVarA4);
        Boolean bool = Boolean.FALSE;
        w wVarA5 = zu.m0.a(bool);
        this._isSetupCompleted = wVarA5;
        this.isSetupCompleted = wVarA5;
        w wVarA6 = zu.m0.a(bool);
        this._isSkPasskeysEnabled = wVarA6;
        this.isSkPasskeysEnabled = wVarA6;
        w wVarA7 = zu.m0.a(bool);
        this._isUseBiometricKeyAsDefault = wVarA7;
        this.isUseBiometricKeyAsDefault = wVarA7;
        String string = UUID.randomUUID().toString();
        t.e(string, "toString(...)");
        this.analyticsWizardId = string;
        this.analyticsInteractor = new x(this.analyticsWizardId);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new a(null), 3, null);
    }

    public final void clearPushEvent() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new b(null), 3, null);
    }

    public final void createRemoteCryptor(iu.a aVar) {
        t.f(aVar, "recallMethod");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new c(aVar, null), 3, null);
    }

    public final zu.f getActivityActionFlow() {
        return this.activityActionFlow;
    }

    public final String getAnalyticsWizardId() {
        return this.analyticsWizardId;
    }

    public final k0 getCaPrivateKey() {
        return this.caPrivateKey;
    }

    public final k0 getPushState() {
        return this.pushState;
    }

    public final k0 getRemoteEncryptByAnnotation() {
        return this.remoteEncryptByAnnotation;
    }

    public final k0 getUsername() {
        return this.username;
    }

    public final k0 isSetupCompleted() {
        return this.isSetupCompleted;
    }

    public final a0 isSkPasskeysEnabled() {
        return this.isSkPasskeysEnabled;
    }

    public final k0 isUseBiometricKeyAsDefault() {
        return this.isUseBiometricKeyAsDefault;
    }

    public final void onHandleCloseAction() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onHandleDismissPopupRequest() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new e(null), 3, null);
    }

    public final void onPostponeSshIdSetupButtonPressed() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new f(null), 3, null);
    }

    public final void onSendAnalyticsAboutSshIdSetupFailed(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new g(str, null), 3, null);
    }

    public final void onSshIdPublicProfileButtonPressed() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new h(null), 3, null);
    }

    public final void onSshIdSetupStarted() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new i(null), 3, null);
    }

    public final void sendSshIdWizardPresented(Avo.SetupSSHidSource setupSSHidSource) {
        t.f(setupSSHidSource, "setupSsHidSource");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new j(setupSSHidSource, null), 3, null);
    }

    public final void setCaPrivateKey(String str) {
        t.f(str, "keyValue");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new k(str, null), 3, null);
    }

    public final void setIsSetupCompleted(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new l(z10, null), 3, null);
    }

    public final void setPushEvent(String str) {
        t.f(str, "pushType");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new m(str, null), 3, null);
    }

    public final void setUseBiometricAsDefault() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new n(null), 3, null);
    }

    public final void updateSshIdSetupStep(Avo.SSHidSetUpStep sSHidSetUpStep) {
        t.f(sSHidSetUpStep, "step");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new o(sSHidSetUpStep, null), 3, null);
    }
}
