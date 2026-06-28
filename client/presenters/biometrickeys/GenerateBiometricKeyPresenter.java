package com.server.auditor.ssh.client.presenters.biometrickeys;

import android.text.TextUtils;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.presenters.biometrickeys.GenerateBiometricKeyPresenter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshKeyApiAdapter;
import iu.l;
import iu.p;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ri.b;
import ri.f;
import ut.m0;
import ut.x;
import wu.g0;
import wu.i0;
import wu.j1;
import wu.l1;
import wu.x0;

/* JADX INFO: loaded from: classes4.dex */
public final class GenerateBiometricKeyPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> implements f.a, b.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f37209v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f37210w = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37212b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ri.b f37216f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ri.f f37217u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37211a = "Biometric Key";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37213c = "";

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37218a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37218a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateBiometricKeyPresenter.this.getViewState().wc();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37220a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37220a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateBiometricKeyPresenter.this.getViewState().f5(false);
            GenerateBiometricKeyPresenter.this.getViewState().d9(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37222a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37222a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateBiometricKeyPresenter.this.getViewState().f5(true);
            GenerateBiometricKeyPresenter.this.getViewState().d9(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37224a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37224a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateBiometricKeyPresenter.this.getViewState().E4();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37226a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37226a;
            if (i10 == 0) {
                x.b(obj);
                if (GenerateBiometricKeyPresenter.this.f37214d != 0) {
                    GenerateBiometricKeyPresenter.this.getViewState().K8(GenerateBiometricKeyPresenter.this.f37214d);
                } else if (GenerateBiometricKeyPresenter.this.f37212b) {
                    GenerateBiometricKeyPresenter.this.G();
                } else {
                    GenerateBiometricKeyPresenter.this.getViewState().A();
                    String str = GenerateBiometricKeyPresenter.this.f37211a;
                    if (str == null || str.length() == 0) {
                        GenerateBiometricKeyPresenter generateBiometricKeyPresenter = GenerateBiometricKeyPresenter.this;
                        String string = TermiusApplication.F().getString(R.string.ssh_biometric_key_name_placeholder);
                        t.e(string, "getString(...)");
                        generateBiometricKeyPresenter.f37211a = string;
                    }
                    ri.f fVar = GenerateBiometricKeyPresenter.this.f37217u;
                    String str2 = GenerateBiometricKeyPresenter.this.f37211a;
                    this.f37226a = 1;
                    if (fVar.h(str2, this) == objF) {
                        return objF;
                    }
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
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37228a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SshKeyDBModel f37231d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, SshKeyDBModel sshKeyDBModel, zt.e eVar) {
            super(2, eVar);
            this.f37230c = str;
            this.f37231d = sshKeyDBModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new g(this.f37230c, this.f37231d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37228a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateBiometricKeyPresenter.this.f37213c = this.f37230c;
            GenerateBiometricKeyPresenter.this.f37214d = (int) this.f37231d.getIdInDatabase();
            GenerateBiometricKeyPresenter.this.getViewState().g0();
            GenerateBiometricKeyPresenter.this.getViewState().z9(this.f37231d, GenerateBiometricKeyPresenter.this.f37215e);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37232a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f37234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(CharSequence charSequence, zt.e eVar) {
            super(2, eVar);
            this.f37234c = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new h(this.f37234c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37232a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateBiometricKeyPresenter.this.f37211a = !TextUtils.isEmpty(this.f37234c) ? String.valueOf(this.f37234c) : "Biometric Key";
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37235a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37235a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateBiometricKeyPresenter.this.getViewState().g0();
            GenerateBiometricKeyPresenter.this.getViewState().Yd();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37237a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateBiometricKeyPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37237a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateBiometricKeyPresenter.this.f37216f.a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public GenerateBiometricKeyPresenter() {
        String string = UUID.randomUUID().toString();
        t.e(string, "toString(...)");
        this.f37215e = string;
        androidx.biometric.e eVarG = androidx.biometric.e.g(TermiusApplication.F());
        t.e(eVarG, "from(...)");
        this.f37216f = new ri.b(eVarG, this);
        androidx.biometric.e eVarG2 = androidx.biometric.e.g(TermiusApplication.F());
        t.e(eVarG2, "from(...)");
        lj.b bVar = new lj.b(eVarG2, new l() { // from class: bl.b
            @Override // iu.l
            public final Object invoke(Object obj) {
                return GenerateBiometricKeyPresenter.A2((String) obj);
            }
        });
        SshKeyApiAdapter sshKeyApiAdapterV = hg.f.p().V();
        t.e(sshKeyApiAdapterV, "getSshKeyApiAdapter(...)");
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        IdentityDBAdapter identityDBAdapterN = hg.f.p().n();
        t.e(identityDBAdapterN, "getIdentityDBAdapter(...)");
        SshCertificateDBAdapter sshCertificateDBAdapterQ = hg.f.p().Q();
        t.e(sshCertificateDBAdapterQ, "getSshCertificateDBAdapter(...)");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        t.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        j1 j1VarC = l1.c(executorServiceNewSingleThreadExecutor);
        g0 g0VarB = x0.b();
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        this.f37217u = new ri.f(bVar, sshKeyApiAdapterV, sshKeyDBAdapterW, identityDBAdapterN, sshCertificateDBAdapterQ, j1VarC, g0VarB, aVarY, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyPairGenerator A2(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        t.f(str, "algorithm");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, TermiusApplication.f21391y);
        t.e(keyPairGenerator, "getInstance(...)");
        return keyPairGenerator;
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void E2(CharSequence charSequence) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(charSequence, null), 3, null);
    }

    public final void F2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // ri.b.a
    public void G() {
        this.f37212b = true;
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // ri.b.a
    public void J() {
        this.f37212b = false;
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    @Override // ri.f.a
    public void j1() {
        G();
    }

    @Override // ri.f.a
    public void l0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().c();
    }

    @Override // ri.f.a
    public void u(SshKeyDBModel sshKeyDBModel, String str) {
        t.f(sshKeyDBModel, "sshKey");
        t.f(str, Column.KEY_PUBLIC);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(str, sshKeyDBModel, null), 3, null);
    }
}
