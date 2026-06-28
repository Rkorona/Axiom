package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.text.Editable;
import android.text.TextUtils;
import androidx.lifecycle.i1;
import androidx.lifecycle.k0;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.interactors.d1;
import com.server.auditor.ssh.client.models.a0;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.m;
import com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.StaleDeviceObject;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.StaleMemberObject;
import com.server.auditor.ssh.client.synchronization.retrofit.PasswordBreachApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import dq.s;
import hg.b2;
import il.c0;
import il.r0;
import il.z;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jg.i;
import jg.j;
import jg.k;
import jg.l;
import ju.t;
import og.u;
import ut.m0;
import ut.x;
import vt.v;
import wu.g0;
import wu.i0;
import wu.j1;
import wu.s0;
import wu.u1;
import wu.x0;
import yg.a;
import yg.d;

/* JADX INFO: loaded from: classes3.dex */
public final class NewCryptoViewModel extends i1 implements com.server.auditor.ssh.client.navigation.notifications.newcrypto.k, j.a, k.a, i.a {
    private static final long animationDelay = 1500;
    private static final long delayBeforeShowCheckMark = 800;
    private static final int minimalPasswordStrengthScore = 0;
    private k.c beforeProceedView;
    private final og.e changePasswordModelProvider;
    private u1 checkingSetupJob;
    private k.d checkingSetupView;
    private u1 enterPasswordMigrationJob;
    private k.f enterPasswordView;
    private k.g forgotPasswordView;
    private boolean isBeforeProceedScreen;
    private boolean isDone;
    private boolean isErrorScreen;
    private boolean isMigrating;
    private boolean isOnInitialScreen;
    private k.h landingView;
    private k.i mainView;
    private final z newCryptoAnalyticsRepository;
    private final jg.i newCryptoCheckingSetupInteractor;
    private final jg.j newCryptoCodeInteractor;
    private final jg.k newCryptoMigrationInteractor;
    private u1 newPasswordMigrationJob;
    private List<StaleDeviceObject> notUpdatedDevices;
    private List<StaleMemberObject> notUpdatedMembers;
    private k.InterfaceC0457k offlineErrorView;
    private k.l oopsErrorView;
    private final jg.l passwordBreachCheckInteractor;
    private u1 passwordBreachCheckJob;
    private final jg.m passwordStrengthInteractor;
    private u1 passwordStrengthMeasureJob;
    private final SyncRestApiClientFactory restApiClientFactory;
    private final com.server.auditor.ssh.client.navigation.notifications.newcrypto.l router;
    private final StateData stateData;
    private final SyncServiceHelper syncServiceHelper;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final String userEmail;
    private final d1 validatePasswordInteractor;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29102a;

        b(zt.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(zt.e eVar) {
            return NewCryptoViewModel.this.new b(eVar);
        }

        @Override // iu.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zt.e eVar) {
            return ((b) create(eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29102a;
            if (i10 == 0) {
                x.b(obj);
                b2 b2Var = b2.f52944a;
                j1 j1VarB1 = b2Var.B1();
                hg.d dVarM = NewCryptoViewModel.this.termiusStorage.M();
                t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
                k0 k0VarP = NewCryptoViewModel.this.termiusStorage.P();
                t.e(k0VarP, "getIsSyncingLiveData(...)");
                com.server.auditor.ssh.client.app.a aVar = NewCryptoViewModel.this.termiusStorage;
                t.e(aVar, "access$getTermiusStorage$p(...)");
                pl.q qVar = new pl.q(j1VarB1, dVarM, k0VarP, aVar, new pl.h(null, 1, null), new pp.b(b2Var.v1()), new d.a(), new a.C1401a());
                ApiKey apiKey = NewCryptoViewModel.this.termiusStorage.getApiKey();
                if (apiKey == null) {
                    throw new IllegalStateException();
                }
                SyncRestInterface syncRestInterfaceCreateCustomApiKeyApiClient = NewCryptoViewModel.this.restApiClientFactory.createCustomApiKeyApiClient(apiKey);
                this.f29102a = 1;
                obj = qVar.e(syncRestInterfaceCreateCustomApiKeyApiClient, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            pl.r rVar = (pl.r) obj;
            s sVarB = rVar.b();
            if (rVar.c() || sVarB == null) {
                throw new IllegalStateException();
            }
            com.server.auditor.ssh.client.app.a aVar2 = NewCryptoViewModel.this.termiusStorage;
            t.e(aVar2, "access$getTermiusStorage$p(...)");
            com.server.auditor.ssh.client.interactors.i iVar = new com.server.auditor.ssh.client.interactors.i(aVar2);
            com.server.auditor.ssh.client.interactors.h hVar = new com.server.auditor.ssh.client.interactors.h();
            boolean zP0 = NewCryptoViewModel.this.termiusStorage.p0();
            return hVar.a(iVar.a(zP0, sVarB), zP0);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29105b;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            c cVar = NewCryptoViewModel.this.new c(eVar);
            cVar.f29105b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29104a;
            if (i10 == 0) {
                x.b(obj);
                i0 i0Var = (i0) this.f29105b;
                jg.k kVar = NewCryptoViewModel.this.newCryptoMigrationInteractor;
                String code = NewCryptoViewModel.this.stateData.getCode();
                byte[] encodedPassword = NewCryptoViewModel.this.stateData.getEncodedPassword();
                this.f29104a = 1;
                if (kVar.I(code, encodedPassword, i0Var, this) == objF) {
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
        int f29107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29108b;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            d dVar = NewCryptoViewModel.this.new d(eVar);
            dVar.f29108b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29107a;
            if (i10 == 0) {
                x.b(obj);
                i0 i0Var = (i0) this.f29108b;
                jg.k kVar = NewCryptoViewModel.this.newCryptoMigrationInteractor;
                byte[] encodedPassword = NewCryptoViewModel.this.stateData.getEncodedPassword();
                this.f29107a = 1;
                if (kVar.G(encodedPassword, i0Var, this) == objF) {
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
        int f29110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29111b;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            e eVar2 = NewCryptoViewModel.this.new e(eVar);
            eVar2.f29111b = obj;
            return eVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29110a;
            if (i10 == 0) {
                x.b(obj);
                i0 i0Var = (i0) this.f29111b;
                jg.j jVar = NewCryptoViewModel.this.newCryptoCodeInteractor;
                this.f29110a = 1;
                if (jVar.h(i0Var, this) == objF) {
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

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29113a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29113a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            NewCryptoViewModel.this.newCryptoCodeInteractor.d(-1);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29115a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29115a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            NewCryptoViewModel.this.newCryptoCodeInteractor.d(1);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29117a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29117a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            NewCryptoViewModel.this.newCryptoCodeInteractor.d(0);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29119a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29119a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            NewCryptoViewModel.this.newCryptoCodeInteractor.d(-1);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29121a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29121a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            NewCryptoViewModel.this.newCryptoCodeInteractor.d(-1);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29124b;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            k kVar = NewCryptoViewModel.this.new k(eVar);
            kVar.f29124b = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29123a;
            if (i10 == 0) {
                x.b(obj);
                i0 i0Var = (i0) this.f29124b;
                jg.j jVar = NewCryptoViewModel.this.newCryptoCodeInteractor;
                this.f29123a = 1;
                if (jVar.h(i0Var, this) == objF) {
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
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29126a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29126a;
            if (i10 == 0) {
                x.b(obj);
                this.f29126a = 1;
                if (s0.b(NewCryptoViewModel.delayBeforeShowCheckMark, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            k.d dVar = NewCryptoViewModel.this.checkingSetupView;
            if (dVar != null) {
                dVar.n7();
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
        int f29128a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29128a;
            if (i10 == 0) {
                x.b(obj);
                this.f29128a = 1;
                if (s0.b(NewCryptoViewModel.animationDelay, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            NewCryptoViewModel.this.onContinueBeforeProceed();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29130a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29130a;
            if (i10 == 0) {
                x.b(obj);
                this.f29130a = 1;
                if (s0.b(NewCryptoViewModel.delayBeforeShowCheckMark, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            k.d dVar = NewCryptoViewModel.this.checkingSetupView;
            if (dVar != null) {
                dVar.n7();
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
        int f29132a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29132a;
            if (i10 == 0) {
                x.b(obj);
                this.f29132a = 1;
                if (s0.b(NewCryptoViewModel.animationDelay, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            NewCryptoViewModel.this.onContinueBeforeProceed();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29134a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29134a;
            if (i10 == 0) {
                x.b(obj);
                k.g gVar = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar != null) {
                    gVar.c2(false);
                }
                k.g gVar2 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar2 != null) {
                    gVar2.f0(false);
                }
                k.g gVar3 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar3 != null) {
                    gVar3.e1(false);
                }
                k.g gVar4 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar4 != null) {
                    gVar4.J2(false);
                }
                k.g gVar5 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar5 != null) {
                    gVar5.K(false);
                }
                k.g gVar6 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar6 != null) {
                    gVar6.S(true);
                }
                jg.l lVar = NewCryptoViewModel.this.passwordBreachCheckInteractor;
                byte[] encodedPassword = NewCryptoViewModel.this.stateData.getEncodedPassword();
                this.f29134a = 1;
                obj = lVar.d(encodedPassword, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            l.b bVar = (l.b) obj;
            if (t.b(bVar, l.b.a.f61688a)) {
                NewCryptoViewModel.this.stateData.setPasswordStrengthScore(0);
                k.g gVar7 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar7 != null) {
                    gVar7.V(NewCryptoViewModel.this.stateData.getPasswordStrengthScore());
                }
                k.g gVar8 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar8 != null) {
                    gVar8.E(false);
                }
                k.g gVar9 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar9 != null) {
                    gVar9.d0();
                }
                k.g gVar10 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar10 != null) {
                    gVar10.c2(true);
                }
            } else if (t.b(bVar, l.b.d.f61691a)) {
                k.g gVar11 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar11 != null) {
                    gVar11.U();
                }
                k.g gVar12 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar12 != null) {
                    gVar12.c2(true);
                }
            } else {
                if (!t.b(bVar, l.b.C0925b.f61689a) && !t.b(bVar, l.b.c.f61690a)) {
                    throw new ut.s();
                }
                k.g gVar13 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar13 != null) {
                    gVar13.L();
                }
            }
            k.g gVar14 = NewCryptoViewModel.this.forgotPasswordView;
            if (gVar14 != null) {
                gVar14.S(false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29136a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k.g gVar;
            k.g gVar2;
            k.g gVar3;
            Object objF = au.b.f();
            int i10 = this.f29136a;
            boolean z10 = false;
            if (i10 == 0) {
                x.b(obj);
                k.g gVar4 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar4 != null) {
                    gVar4.c2(false);
                }
                k.g gVar5 = NewCryptoViewModel.this.forgotPasswordView;
                if (gVar5 != null) {
                    gVar5.S(false);
                }
                jg.m mVar = NewCryptoViewModel.this.passwordStrengthInteractor;
                byte[] encodedPassword = NewCryptoViewModel.this.stateData.getEncodedPassword();
                List listE = v.e(NewCryptoViewModel.this.userEmail);
                this.f29136a = 1;
                obj = mVar.e(encodedPassword, listE, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            com.server.auditor.ssh.client.models.n nVar = (com.server.auditor.ssh.client.models.n) obj;
            NewCryptoViewModel.this.stateData.setPasswordStrengthScore(nVar.a());
            k.g gVar6 = NewCryptoViewModel.this.forgotPasswordView;
            if (gVar6 != null) {
                gVar6.V(NewCryptoViewModel.this.stateData.getPasswordStrengthScore());
            }
            k.g gVar7 = NewCryptoViewModel.this.forgotPasswordView;
            if (gVar7 != null) {
                gVar7.E(NewCryptoViewModel.this.isAllFieldsFilled());
            }
            String str = (String) v.r0(nVar.c());
            if (str != null && (gVar3 = NewCryptoViewModel.this.forgotPasswordView) != null) {
                gVar3.Q(str);
            }
            k.g gVar8 = NewCryptoViewModel.this.forgotPasswordView;
            if (gVar8 != null) {
                gVar8.f0(str != null);
            }
            String str2 = (String) v.s0(nVar.b(), 0);
            String str3 = (String) v.s0(nVar.b(), 1);
            if (str2 != null && (gVar2 = NewCryptoViewModel.this.forgotPasswordView) != null) {
                gVar2.u0(str2);
            }
            if (str3 != null && (gVar = NewCryptoViewModel.this.forgotPasswordView) != null) {
                gVar.z2(str3);
            }
            k.g gVar9 = NewCryptoViewModel.this.forgotPasswordView;
            if (gVar9 != null) {
                gVar9.e1(str2 != null);
            }
            k.g gVar10 = NewCryptoViewModel.this.forgotPasswordView;
            if (gVar10 != null) {
                gVar10.J2(str3 != null);
            }
            k.g gVar11 = NewCryptoViewModel.this.forgotPasswordView;
            if (gVar11 != null) {
                if (nVar.c().isEmpty() && nVar.b().isEmpty() && NewCryptoViewModel.this.isPasswordStrengthEnough()) {
                    z10 = true;
                }
                gVar11.K(z10);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29138a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoViewModel.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f29138a;
            if (i10 == 0) {
                x.b(obj);
                jg.i iVar = NewCryptoViewModel.this.newCryptoCheckingSetupInteractor;
                this.f29138a = 1;
                if (iVar.k(this) == objF) {
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
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public NewCryptoViewModel() {
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        String username = apiKey != null ? apiKey.getUsername() : null;
        this.userEmail = username == null ? "" : username;
        this.router = new com.server.auditor.ssh.client.navigation.notifications.newcrypto.l();
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        SyncRestApiClientFactory syncRestApiClientFactoryO1 = b2Var.O1();
        this.restApiClientFactory = syncRestApiClientFactoryO1;
        SyncServiceHelper syncServiceHelperY = hg.f.p().Y();
        this.syncServiceHelper = syncServiceHelperY;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        this.newCryptoAnalyticsRepository = new z(aVarY);
        this.passwordStrengthInteractor = new jg.m();
        c0 c0Var = new c0(new PasswordBreachApiClientFactory(), b2Var.B1());
        com.server.auditor.ssh.client.utils.analytics.a aVarY2 = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY2, "getInstance(...)");
        this.passwordBreachCheckInteractor = new jg.l(c0Var, aVarY2);
        this.validatePasswordInteractor = new d1();
        this.newCryptoCodeInteractor = new jg.j(this, new NewCryptoCodeRepo(syncRestApiClientFactoryO1, b2Var.B1()), new og.r(b2Var.R1()));
        ChangePasswordConverters.SshKeyConverter sshKeyConverter = new ChangePasswordConverters.SshKeyConverter();
        ChangePasswordConverters.IdentityConverter identityConverter = new ChangePasswordConverters.IdentityConverter();
        ChangePasswordConverters.HostConverter hostConverter = new ChangePasswordConverters.HostConverter();
        ChangePasswordConverters.RuleConverter ruleConverter = new ChangePasswordConverters.RuleConverter();
        ChangePasswordConverters.GroupConverter groupConverter = new ChangePasswordConverters.GroupConverter();
        ChangePasswordConverters.TagConverter tagConverter = new ChangePasswordConverters.TagConverter();
        ChangePasswordConverters.SnippetConverter snippetConverter = new ChangePasswordConverters.SnippetConverter();
        ChangePasswordConverters.KnownHostConverter knownHostConverter = new ChangePasswordConverters.KnownHostConverter();
        ChangePasswordConverters.ProxyConverter proxyConverter = new ChangePasswordConverters.ProxyConverter();
        ChangePasswordConverters.SshCertificateConverter sshCertificateConverter = new ChangePasswordConverters.SshCertificateConverter();
        ChangePasswordConverters.PackageConverter packageConverter = new ChangePasswordConverters.PackageConverter();
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        IdentityDBAdapter identityDBAdapterN = hg.f.p().n();
        t.e(identityDBAdapterN, "getIdentityDBAdapter(...)");
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        PFRulesDBAdapter pFRulesDBAdapterZ = hg.f.p().z();
        t.e(pFRulesDBAdapterZ, "getPFRulesDBAdapter(...)");
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        t.e(groupDBAdapterH, "getGroupDBAdapter(...)");
        TagDBAdapter tagDBAdapterA0 = hg.f.p().a0();
        t.e(tagDBAdapterA0, "getTagDBAdapter(...)");
        SnippetDBAdapter snippetDBAdapterJ = hg.f.p().J();
        t.e(snippetDBAdapterJ, "getSnippetDBAdapter(...)");
        KnownHostsDBAdapter knownHostsDBAdapterR = hg.f.p().r();
        t.e(knownHostsDBAdapterR, "getKnownHostsDBAdapter(...)");
        ProxyDBAdapter proxyDBAdapterB = hg.f.p().B();
        t.e(proxyDBAdapterB, "getProxyDBAdapter(...)");
        SshConfigDBAdapter sshConfigDBAdapterS = hg.f.p().S();
        t.e(sshConfigDBAdapterS, "getSshConfigDBAdapter(...)");
        SshCertificateDBAdapter sshCertificateDBAdapterQ = hg.f.p().Q();
        t.e(sshCertificateDBAdapterQ, "getSshCertificateDBAdapter(...)");
        SnippetPackageDBAdapter snippetPackageDBAdapterO = hg.f.p().O();
        t.e(snippetPackageDBAdapterO, "getSnippetPackageDBAdapter(...)");
        og.e eVar = new og.e(sshKeyConverter, identityConverter, hostConverter, ruleConverter, groupConverter, tagConverter, snippetConverter, knownHostConverter, proxyConverter, sshCertificateConverter, packageConverter, sshKeyDBAdapterW, identityDBAdapterN, hostsDBAdapterI, pFRulesDBAdapterZ, groupDBAdapterH, tagDBAdapterA0, snippetDBAdapterJ, knownHostsDBAdapterR, proxyDBAdapterB, sshConfigDBAdapterS, sshCertificateDBAdapterQ, snippetPackageDBAdapterO, new b(null));
        this.changePasswordModelProvider = eVar;
        u uVar = new u();
        og.t tVarN1 = b2Var.N1();
        og.a aVarO0 = b2Var.O0();
        og.g gVarX0 = b2Var.X0();
        com.server.auditor.ssh.client.repositories.auth.n nVar = new com.server.auditor.ssh.client.repositories.auth.n(syncRestApiClientFactoryO1, b2Var.B1());
        com.server.auditor.ssh.client.repositories.auth.c cVarB1 = b2Var.b1();
        DevicePasswordRecoveryApiRepo devicePasswordRecoveryApiRepoJ1 = b2Var.j1();
        og.p pVar = new og.p(syncRestApiClientFactoryO1, b2Var.B1(), b2Var.s1());
        g0 g0VarB = x0.b();
        GroupDBAdapter groupDBAdapterH2 = hg.f.p().h();
        t.e(groupDBAdapterH2, "getGroupDBAdapter(...)");
        HostsDBAdapter hostsDBAdapterI2 = hg.f.p().i();
        t.e(hostsDBAdapterI2, "getHostDBAdapter(...)");
        SshConfigDBAdapter sshConfigDBAdapterS2 = hg.f.p().S();
        t.e(sshConfigDBAdapterS2, "getSshConfigDBAdapter(...)");
        TelnetConfigDBAdapter telnetConfigDBAdapterE0 = hg.f.p().e0();
        t.e(telnetConfigDBAdapterE0, "getTelnetConfigDBAdapter(...)");
        IdentityDBAdapter identityDBAdapterN2 = hg.f.p().n();
        t.e(identityDBAdapterN2, "getIdentityDBAdapter(...)");
        SshKeyDBAdapter sshKeyDBAdapterW2 = hg.f.p().W();
        t.e(sshKeyDBAdapterW2, "getSshKeyDBAdapter(...)");
        SshCertificateDBAdapter sshCertificateDBAdapterQ2 = hg.f.p().Q();
        t.e(sshCertificateDBAdapterQ2, "getSshCertificateDBAdapter(...)");
        ProxyDBAdapter proxyDBAdapterB2 = hg.f.p().B();
        t.e(proxyDBAdapterB2, "getProxyDBAdapter(...)");
        SnippetPackageDBAdapter snippetPackageDBAdapterO2 = hg.f.p().O();
        t.e(snippetPackageDBAdapterO2, "getSnippetPackageDBAdapter(...)");
        SnippetDBAdapter snippetDBAdapterJ2 = hg.f.p().J();
        t.e(snippetDBAdapterJ2, "getSnippetDBAdapter(...)");
        PFRulesDBAdapter pFRulesDBAdapterZ2 = hg.f.p().z();
        t.e(pFRulesDBAdapterZ2, "getPFRulesDBAdapter(...)");
        TagDBAdapter tagDBAdapterA02 = hg.f.p().a0();
        t.e(tagDBAdapterA02, "getTagDBAdapter(...)");
        KnownHostsDBAdapter knownHostsDBAdapterR2 = hg.f.p().r();
        t.e(knownHostsDBAdapterR2, "getKnownHostsDBAdapter(...)");
        og.n nVar2 = new og.n(g0VarB, groupDBAdapterH2, hostsDBAdapterI2, sshConfigDBAdapterS2, telnetConfigDBAdapterE0, identityDBAdapterN2, sshKeyDBAdapterW2, sshCertificateDBAdapterQ2, proxyDBAdapterB2, snippetPackageDBAdapterO2, snippetDBAdapterJ2, pFRulesDBAdapterZ2, tagDBAdapterA02, knownHostsDBAdapterR2);
        t.e(syncServiceHelperY, "syncServiceHelper");
        r0 r0Var = new r0(syncServiceHelperY);
        og.r rVar = new og.r(b2Var.R1());
        com.server.auditor.ssh.client.app.repo.a aVarQ1 = b2Var.q1();
        rg.j jVar = new rg.j(null, null, null, null, null, null, 63, null);
        y9.a aVar = y9.a.f86838a;
        t.e(aVarN, "termiusStorage");
        this.newCryptoMigrationInteractor = new jg.k(this, uVar, tVarN1, aVarO0, eVar, gVarX0, nVar, cVarB1, devicePasswordRecoveryApiRepoJ1, pVar, nVar2, r0Var, rVar, aVarQ1, jVar, aVar, new og.v(aVarN));
        og.q qVar = new og.q(syncRestApiClientFactoryO1, b2Var.B1());
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        rl.a aVar2 = new rl.a(dVarM);
        hg.d dVarM2 = aVarN.M();
        t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        com.server.auditor.ssh.client.repositories.auth.g gVar = new com.server.auditor.ssh.client.repositories.auth.g(dVarM2);
        t.e(syncServiceHelperY, "syncServiceHelper");
        r0 r0Var2 = new r0(syncServiceHelperY);
        il.n nVar3 = new il.n(syncRestApiClientFactoryO1, b2Var.B1());
        t.e(aVarN, "termiusStorage");
        this.newCryptoCheckingSetupInteractor = new jg.i(this, qVar, aVar2, gVar, r0Var2, nVar3, new wg.a(aVarN, new d.a()));
        this.stateData = new StateData((byte[]) null, (String) null, 0, 0L, 11, (ju.k) null);
        this.notUpdatedDevices = v.o();
        this.notUpdatedMembers = v.o();
    }

    private final void clearAllViews() {
        this.landingView = null;
        this.checkingSetupView = null;
        this.oopsErrorView = null;
        this.offlineErrorView = null;
        this.beforeProceedView = null;
        this.enterPasswordView = null;
        this.forgotPasswordView = null;
    }

    private final byte[] encodePassword(Editable editable) {
        if (editable == null || su.s.m0(editable)) {
            return new byte[0];
        }
        char[] cArr = new char[editable.length()];
        editable.getChars(0, editable.length(), cArr, 0);
        byte[] bArrE = rg.l.e(cArr);
        Arrays.fill(cArr, (char) 0);
        char[] cArrD = rg.l.d(bArrE);
        Arrays.fill(bArrE, (byte) 0);
        byte[] bArrE2 = rg.l.e(cArrD);
        Arrays.fill(cArrD, (char) 0);
        t.c(bArrE2);
        return bArrE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAllFieldsFilled() {
        a0 a0VarA = this.validatePasswordInteractor.a(this.stateData.getEncodedPassword());
        boolean z10 = this.stateData.getCode().length() > 0 && !su.s.m0(this.stateData.getCode());
        List listE = v.e(a0VarA);
        if (listE == null || !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                if (!((a0) it.next()).b()) {
                    break;
                }
            }
            if (z10 || !isPasswordStrengthEnough()) {
                break;
            }
            return true;
        }
        if (z10) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPasswordStrengthEnough() {
        return this.stateData.getPasswordStrengthScore() >= 3;
    }

    private final void requestPasswordBreachCheck() {
        u1 u1Var = this.passwordBreachCheckJob;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.passwordBreachCheckJob = wu.k.d(androidx.lifecycle.j1.a(this), null, null, new p(null), 3, null);
    }

    private final void requestPasswordStrengthMeasure() {
        u1 u1Var = this.passwordBreachCheckJob;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        u1 u1Var2 = this.passwordStrengthMeasureJob;
        if (u1Var2 != null) {
            u1.a.a(u1Var2, null, 1, null);
        }
        this.passwordStrengthMeasureJob = wu.k.d(androidx.lifecycle.j1.a(this), null, null, new q(null), 3, null);
    }

    private final void runCheckingSetup() {
        u1 u1Var = this.checkingSetupJob;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.checkingSetupJob = wu.k.d(androidx.lifecycle.j1.a(this), null, null, new r(null), 3, null);
    }

    @Override // jg.k.a, jg.i.a
    public void onAlreadyMigrated() {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar = this.mainView;
        if (iVar == null) {
            t.t("mainView");
            iVar = null;
        }
        lVar.f(iVar, m.a.f29319a);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onAlreadyMigratedViewCreated(k.a aVar) {
        t.f(aVar, "view");
        clearAllViews();
        aVar.c();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onBack() {
        k.i iVar = null;
        if (this.isOnInitialScreen) {
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
            k.i iVar2 = this.mainView;
            if (iVar2 == null) {
                t.t("mainView");
            } else {
                iVar = iVar2;
            }
            lVar.c(iVar);
            return;
        }
        if (this.isBeforeProceedScreen) {
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar2 = this.router;
            k.i iVar3 = this.mainView;
            if (iVar3 == null) {
                t.t("mainView");
            } else {
                iVar = iVar3;
            }
            lVar2.b(iVar);
            return;
        }
        if (this.isErrorScreen || !(this.isMigrating || this.isDone)) {
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar3 = this.router;
            k.i iVar4 = this.mainView;
            if (iVar4 == null) {
                t.t("mainView");
            } else {
                iVar = iVar4;
            }
            lVar3.a(iVar);
            return;
        }
        if (this.isDone) {
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar4 = this.router;
            k.i iVar5 = this.mainView;
            if (iVar5 == null) {
                t.t("mainView");
            } else {
                iVar = iVar5;
            }
            lVar4.d(iVar);
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onBeforeProceedViewCreated(k.c cVar) {
        t.f(cVar, "view");
        this.newCryptoAnalyticsRepository.a();
        clearAllViews();
        this.beforeProceedView = cVar;
        this.isOnInitialScreen = false;
        this.isBeforeProceedScreen = true;
        this.isErrorScreen = false;
        cVar.c();
        if (this.notUpdatedDevices.isEmpty()) {
            cVar.N2();
        } else {
            cVar.Ub(this.notUpdatedDevices);
            cVar.A5();
        }
        if (this.notUpdatedMembers.isEmpty()) {
            cVar.Ve();
        } else {
            cVar.j4(this.notUpdatedMembers);
            cVar.I5();
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onCheckPasswordBreachButtonClicked() {
        if (this.forgotPasswordView == null) {
            return;
        }
        requestPasswordBreachCheck();
    }

    @Override // jg.i.a
    public void onCheckingSetupError() {
        onOopsErrorOccurred();
    }

    @Override // jg.i.a
    public void onCheckingSetupException() {
        onOopsErrorOccurred();
    }

    @Override // jg.i.a
    public void onCheckingSetupNetworkError() {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar = this.mainView;
        if (iVar == null) {
            t.t("mainView");
            iVar = null;
        }
        lVar.g(iVar, m.h.f29326a);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onCheckingSetupViewCreated(k.d dVar) {
        t.f(dVar, "view");
        clearAllViews();
        this.checkingSetupView = dVar;
        dVar.c();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onCloseErrorScreen() {
        k.i iVar = null;
        this.landingView = null;
        this.forgotPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.c(iVar);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onCodeCheck(String str) {
        k.g gVar;
        t.f(str, "code");
        String string = su.s.n1(str).toString();
        Locale locale = Locale.ENGLISH;
        t.e(locale, "ENGLISH");
        String upperCase = string.toUpperCase(locale);
        t.e(upperCase, "toUpperCase(...)");
        if (TextUtils.equals(upperCase, str) || (gVar = this.forgotPasswordView) == null) {
            return;
        }
        gVar.Yb(upperCase);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onCodeEdit(String str) {
        t.f(str, "code");
        this.stateData.setCode(str);
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.E(isAllFieldsFilled());
        }
    }

    @Override // jg.j.a
    public void onCodeSendingFinished() {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.s3();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.gc();
        }
    }

    @Override // jg.j.a
    public void onCodeSendingProgress() {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.v8();
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onContinueBeforeProceed() {
        k.i iVar = null;
        this.landingView = null;
        this.forgotPasswordView = null;
        this.enterPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.g(iVar, m.e.f29323a);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onContinueWithNewPassword() {
        u1 u1Var = this.newPasswordMigrationJob;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.newPasswordMigrationJob = wu.k.d(androidx.lifecycle.j1.a(this), null, null, new c(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onContinueWithPassword() {
        u1 u1Var = this.enterPasswordMigrationJob;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.enterPasswordMigrationJob = wu.k.d(androidx.lifecycle.j1.a(this), null, null, new d(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onDoItLaterClick() {
        u1 u1Var = this.checkingSetupJob;
        k.i iVar = null;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.c(iVar);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onDoneClick() {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar = this.mainView;
        if (iVar == null) {
            t.t("mainView");
            iVar = null;
        }
        lVar.d(iVar);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onDoneViewCreated(k.e eVar) {
        t.f(eVar, "view");
        this.newCryptoAnalyticsRepository.d();
        clearAllViews();
        eVar.c();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onEnableNewEncryptionClick() {
        k.i iVar = null;
        this.landingView = null;
        this.forgotPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.e(iVar, m.c.f29321a);
        this.isOnInitialScreen = false;
        this.isBeforeProceedScreen = false;
        this.isErrorScreen = false;
        runCheckingSetup();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onEnterPasswordBack() {
        this.stateData.setEncodedPassword(new byte[0]);
        k.i iVar = null;
        this.enterPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.b(iVar);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onEnterPasswordViewCreated(k.f fVar) {
        t.f(fVar, "view");
        this.newCryptoAnalyticsRepository.b();
        clearAllViews();
        this.forgotPasswordView = null;
        this.isOnInitialScreen = false;
        this.isBeforeProceedScreen = false;
        this.isErrorScreen = false;
        this.enterPasswordView = fVar;
        fVar.c();
        fVar.g9();
        fVar.Xb(false);
        fVar.G3();
        fVar.O0("");
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onEnterPasswordViewDestroyed() {
        this.enterPasswordView = null;
    }

    @Override // jg.j.a
    public void onExpiredCodeResendAvailable() {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.H4();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.n5();
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.gc();
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onForgotPasswordBack() {
        this.stateData.setEncodedPassword(new byte[0]);
        this.stateData.setCode("");
        k.i iVar = null;
        this.forgotPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.a(iVar);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onForgotPasswordClick() {
        this.stateData.setEncodedPassword(new byte[0]);
        this.stateData.setCode("");
        k.i iVar = null;
        this.forgotPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.e(iVar, m.f.f29324a);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onForgotPasswordViewCreated(k.g gVar) {
        t.f(gVar, "view");
        this.newCryptoAnalyticsRepository.c();
        clearAllViews();
        this.forgotPasswordView = gVar;
        this.enterPasswordView = null;
        gVar.c();
        gVar.E(false);
        gVar.O0("");
        gVar.aa(this.stateData.getCode());
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new e(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onForgotPasswordViewDestroyed() {
        this.forgotPasswordView = null;
    }

    public void onFoundNotUpdatedDevices(List<StaleDeviceObject> list, List<StaleMemberObject> list2) {
        t.f(list, "devicesList");
        t.f(list2, "membersList");
        this.notUpdatedDevices = list;
        this.notUpdatedMembers = list2;
        k.i iVar = null;
        this.landingView = null;
        this.forgotPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.g(iVar, m.b.f29320a);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onHowDoWeKnowButtonClicked() {
        k.i iVar = this.mainView;
        if (iVar == null) {
            t.t("mainView");
            iVar = null;
        }
        iVar.f1();
    }

    @Override // jg.j.a
    public void onInfoCodeResendAvailable() {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.Aa();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.rd();
        }
    }

    @Override // jg.j.a
    public void onInfoCodeResendNotYetAvailable(int i10) {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.Aa();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.U8(i10);
        }
    }

    @Override // jg.j.a
    public void onInfoIsNotAvailable() {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.d5();
        }
    }

    @Override // jg.j.a
    public void onInvalidCodeResendAvailable() {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.H4();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.Eb();
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.gc();
        }
    }

    @Override // jg.j.a
    public void onInvalidCodeResendAvailableByTimer() {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.H4();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.Eb();
        }
    }

    @Override // jg.j.a
    public void onInvalidCodeResendNotYetAvailable(int i10) {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.H4();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.bd(i10);
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onLandingViewCreated(k.h hVar) {
        t.f(hVar, "view");
        this.newCryptoAnalyticsRepository.e();
        clearAllViews();
        this.landingView = hVar;
        this.isOnInitialScreen = true;
        this.isBeforeProceedScreen = false;
        this.isErrorScreen = false;
        hVar.c();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onLandingViewDestroyed() {
        this.landingView = null;
        this.isOnInitialScreen = false;
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onMainViewCreate(k.i iVar, int i10) {
        t.f(iVar, "view");
        clearAllViews();
        this.mainView = iVar;
        this.newCryptoMigrationInteractor.F(i10);
        if (this.router.h(iVar)) {
            return;
        }
        this.stateData.setEncodedPassword(new byte[0]);
        this.stateData.setCode("");
        k.i iVar2 = null;
        this.landingView = null;
        this.enterPasswordView = null;
        this.forgotPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar3 = this.mainView;
        if (iVar3 == null) {
            t.t("mainView");
        } else {
            iVar2 = iVar3;
        }
        lVar.e(iVar2, m.g.f29325a);
    }

    @Override // jg.k.a
    public void onMigratedSuccessfully() {
        Arrays.fill(this.stateData.getEncodedPassword(), (byte) 0);
        this.stateData.setEncodedPassword(new byte[0]);
        this.isMigrating = false;
        this.isDone = true;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar = this.mainView;
        if (iVar == null) {
            t.t("mainView");
            iVar = null;
        }
        lVar.e(iVar, m.d.f29322a);
    }

    @Override // jg.k.a
    public void onMigratingEnterPassword() {
        this.isMigrating = true;
        k.f fVar = this.enterPasswordView;
        if (fVar != null) {
            fVar.g9();
            fVar.r(false);
            fVar.E9(false);
            fVar.E(false);
            fVar.Wd(false);
            fVar.Xb(true);
        }
    }

    @Override // jg.k.a
    public void onMigratingNewPassword() {
        this.isMigrating = true;
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.c2(false);
            gVar.f0(false);
            gVar.e1(false);
            gVar.J2(false);
            gVar.K(false);
            gVar.S(false);
            gVar.d5();
            gVar.E(false);
            gVar.r(false);
            gVar.l4(false);
            gVar.g8(true);
        }
    }

    @Override // jg.k.a
    public void onMigrationEnterPasswordInvalid(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        this.isMigrating = false;
        k.f fVar = this.enterPasswordView;
        if (fVar != null) {
            fVar.Xb(false);
        }
        k.f fVar2 = this.enterPasswordView;
        if (fVar2 != null) {
            fVar2.r(true);
        }
        k.f fVar3 = this.enterPasswordView;
        if (fVar3 != null) {
            fVar3.E9(true);
        }
        k.f fVar4 = this.enterPasswordView;
        if (fVar4 != null) {
            fVar4.E(true);
        }
        k.f fVar5 = this.enterPasswordView;
        if (fVar5 != null) {
            fVar5.Wd(true);
        }
        k.f fVar6 = this.enterPasswordView;
        if (fVar6 != null) {
            fVar6.O9(str);
        }
    }

    @Override // jg.k.a
    public void onMigrationEnterPasswordNetworkError() {
        this.isMigrating = false;
        k.f fVar = this.enterPasswordView;
        if (fVar != null) {
            fVar.Xb(false);
        }
        k.f fVar2 = this.enterPasswordView;
        if (fVar2 != null) {
            fVar2.r(true);
        }
        k.f fVar3 = this.enterPasswordView;
        if (fVar3 != null) {
            fVar3.E9(true);
        }
        k.f fVar4 = this.enterPasswordView;
        if (fVar4 != null) {
            fVar4.E(true);
        }
        k.f fVar5 = this.enterPasswordView;
        if (fVar5 != null) {
            fVar5.Wd(true);
        }
        k.f fVar6 = this.enterPasswordView;
        if (fVar6 != null) {
            fVar6.g();
        }
    }

    @Override // jg.k.a
    public void onMigrationEnterPasswordThrottlingError(Integer num) {
        this.isMigrating = false;
        k.f fVar = this.enterPasswordView;
        if (fVar != null) {
            fVar.Xb(false);
        }
        k.f fVar2 = this.enterPasswordView;
        if (fVar2 != null) {
            fVar2.r(true);
        }
        k.f fVar3 = this.enterPasswordView;
        if (fVar3 != null) {
            fVar3.E9(true);
        }
        k.f fVar4 = this.enterPasswordView;
        if (fVar4 != null) {
            fVar4.m2(num);
        }
    }

    @Override // jg.k.a
    public void onMigrationEnterPasswordUnexpectedError() {
        this.isMigrating = false;
        k.f fVar = this.enterPasswordView;
        if (fVar != null) {
            fVar.Xb(false);
        }
        k.f fVar2 = this.enterPasswordView;
        if (fVar2 != null) {
            fVar2.r(true);
        }
        k.f fVar3 = this.enterPasswordView;
        if (fVar3 != null) {
            fVar3.E9(true);
        }
        k.f fVar4 = this.enterPasswordView;
        if (fVar4 != null) {
            fVar4.E(true);
        }
        k.f fVar5 = this.enterPasswordView;
        if (fVar5 != null) {
            fVar5.Wd(true);
        }
        k.f fVar6 = this.enterPasswordView;
        if (fVar6 != null) {
            fVar6.h();
        }
    }

    @Override // jg.k.a
    public void onMigrationNewPasswordDetailedError(String str) {
        t.f(str, "details");
        this.isMigrating = false;
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.g8(false);
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.r(true);
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.l4(true);
        }
        k.g gVar4 = this.forgotPasswordView;
        if (gVar4 != null) {
            gVar4.G(str);
        }
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new f(null), 3, null);
    }

    @Override // jg.k.a
    public void onMigrationNewPasswordFailedCodeExpired() {
        this.isMigrating = false;
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.g8(false);
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.r(true);
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.l4(true);
        }
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new g(null), 3, null);
    }

    @Override // jg.k.a
    public void onMigrationNewPasswordFailedCodeInvalid() {
        this.isMigrating = false;
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.g8(false);
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.r(true);
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.l4(true);
        }
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new h(null), 3, null);
    }

    @Override // jg.k.a
    public void onMigrationNewPasswordNetworkError() {
        this.isMigrating = false;
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.g8(false);
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.r(true);
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.l4(true);
        }
        k.g gVar4 = this.forgotPasswordView;
        if (gVar4 != null) {
            gVar4.g();
        }
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new i(null), 3, null);
    }

    @Override // jg.k.a
    public void onMigrationNewPasswordThrottlingError(Integer num) {
        this.isMigrating = false;
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.g8(false);
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.r(true);
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.l4(true);
        }
        k.g gVar4 = this.forgotPasswordView;
        if (gVar4 != null) {
            gVar4.m2(num);
        }
    }

    @Override // jg.k.a
    public void onMigrationNewPasswordUnexpectedError() {
        this.isMigrating = false;
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.g8(false);
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.r(true);
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.l4(true);
        }
        k.g gVar4 = this.forgotPasswordView;
        if (gVar4 != null) {
            gVar4.h();
        }
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new j(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onNewEncryptionLinkClick() {
        k.i iVar = this.mainView;
        if (iVar == null) {
            t.t("mainView");
            iVar = null;
        }
        iVar.p4();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onOfflineErrorViewCreated(k.InterfaceC0457k interfaceC0457k) {
        t.f(interfaceC0457k, "view");
        clearAllViews();
        this.offlineErrorView = interfaceC0457k;
        this.isOnInitialScreen = false;
        this.isBeforeProceedScreen = false;
        this.isErrorScreen = true;
        interfaceC0457k.c();
    }

    public void onOopsErrorOccurred() {
        k.i iVar = null;
        this.landingView = null;
        this.forgotPasswordView = null;
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.l lVar = this.router;
        k.i iVar2 = this.mainView;
        if (iVar2 == null) {
            t.t("mainView");
        } else {
            iVar = iVar2;
        }
        lVar.g(iVar, m.i.f29327a);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onOopsErrorViewCreated(k.l lVar) {
        t.f(lVar, "view");
        clearAllViews();
        this.oopsErrorView = lVar;
        this.isOnInitialScreen = false;
        this.isBeforeProceedScreen = false;
        this.isErrorScreen = true;
        lVar.c();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onPasswordChanged(Editable editable) {
        this.stateData.setEncodedPassword(encodePassword(editable));
        k.f fVar = this.enterPasswordView;
        if (fVar != null) {
            fVar.E(!(this.stateData.getEncodedPassword().length == 0));
        }
        k.f fVar2 = this.enterPasswordView;
        if (fVar2 != null) {
            fVar2.g9();
        }
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            if (gVar != null) {
                gVar.G(null);
            }
            requestPasswordStrengthMeasure();
        }
    }

    @Override // jg.j.a
    public void onRequestCodeErrorRetryAvailable(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.H4();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            gVar2.R5(str);
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.gc();
        }
    }

    @Override // jg.j.a
    public void onRequestCodeNetworkErrorRetryAvailable() {
        k.g gVar = this.forgotPasswordView;
        if (gVar != null) {
            gVar.H4();
        }
        k.g gVar2 = this.forgotPasswordView;
        if (gVar2 != null) {
            String string = TermiusApplication.F().getString(R.string.new_crypto_network_error);
            t.e(string, "getString(...)");
            gVar2.R5(string);
        }
        k.g gVar3 = this.forgotPasswordView;
        if (gVar3 != null) {
            gVar3.gc();
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k
    public void onResendCodeClick() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new k(null), 3, null);
    }

    @Override // jg.i.a
    public void onShowDevicesAndMembersToUpdate(List<StaleDeviceObject> list, List<StaleMemberObject> list2) {
        t.f(list, "devicesList");
        t.f(list2, "membersList");
        if (!list.isEmpty() || !list2.isEmpty()) {
            onFoundNotUpdatedDevices(list, list2);
            return;
        }
        k.d dVar = this.checkingSetupView;
        if (dVar != null) {
            dVar.U4();
        }
        k.d dVar2 = this.checkingSetupView;
        if (dVar2 != null) {
            dVar2.s4();
        }
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new l(null), 3, null);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new m(null), 3, null);
    }

    @Override // jg.i.a
    public void onShowDevicesToUpdate(List<StaleDeviceObject> list) {
        t.f(list, "devicesList");
        if (!list.isEmpty()) {
            onFoundNotUpdatedDevices(list, v.o());
            return;
        }
        k.d dVar = this.checkingSetupView;
        if (dVar != null) {
            dVar.U4();
        }
        k.d dVar2 = this.checkingSetupView;
        if (dVar2 != null) {
            dVar2.s4();
        }
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new n(null), 3, null);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new o(null), 3, null);
    }
}
