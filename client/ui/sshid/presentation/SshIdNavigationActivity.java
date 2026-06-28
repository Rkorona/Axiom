package com.server.auditor.ssh.client.ui.sshid.presentation;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.activity.ComponentActivity;
import androidx.activity.r;
import androidx.compose.runtime.w;
import androidx.lifecycle.k1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.q;
import androidx.lifecycle.r0;
import co.g0;
import com.server.auditor.ssh.client.notifications.AwesomeSyncService;
import com.server.auditor.ssh.client.synchronization.SyncIntentService;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdActivityActions;
import com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor;
import com.server.auditor.ssh.client.ui.sshid.presentation.SshIdNavigationActivity;
import com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetupFlowViewModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hp.h;
import iu.l;
import iu.p;
import ju.k;
import ju.n0;
import ju.t;
import ju.u;
import kotlin.coroutines.jvm.internal.m;
import ut.j;
import ut.m0;
import ut.n;
import ut.s;
import ut.x;
import wu.i0;
import zu.a0;
import zu.g;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdNavigationActivity extends ComponentActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41102c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41103d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f41105b = new k1(n0.b(SshIdSetupFlowViewModel.class), new e(this), new d(this), new f(null, this));

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41106a;

        static final class a extends m implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f41108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SshIdNavigationActivity f41109b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sshid.presentation.SshIdNavigationActivity$b$a$a, reason: collision with other inner class name */
            static final class C0649a implements g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ SshIdNavigationActivity f41110a;

                C0649a(SshIdNavigationActivity sshIdNavigationActivity) {
                    this.f41110a = sshIdNavigationActivity;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, zt.e eVar) {
                    this.f41110a.k0(str);
                    return m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SshIdNavigationActivity sshIdNavigationActivity, zt.e eVar) {
                super(2, eVar);
                this.f41109b = sshIdNavigationActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f41109b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f41108a;
                if (i10 == 0) {
                    x.b(obj);
                    a0 a0VarA = AwesomeSyncService.f35130v.a();
                    C0649a c0649a = new C0649a(this.f41109b);
                    this.f41108a = 1;
                    if (a0VarA.collect(c0649a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x.b(obj);
                }
                throw new j();
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdNavigationActivity.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41106a;
            if (i10 == 0) {
                x.b(obj);
                SshIdNavigationActivity sshIdNavigationActivity = SshIdNavigationActivity.this;
                q.b bVar = q.b.f8799d;
                a aVar = new a(sshIdNavigationActivity, null);
                this.f41106a = 1;
                if (r0.b(sshIdNavigationActivity, bVar, aVar, this) == objF) {
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
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c implements p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SshIdStateInteractor.SshIdState f41112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Avo.SetupSSHidSource f41113c;

        static final class a implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SshIdNavigationActivity f41114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SshIdStateInteractor.SshIdState f41115b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Avo.SetupSSHidSource f41116c;

            a(SshIdNavigationActivity sshIdNavigationActivity, SshIdStateInteractor.SshIdState sshIdState, Avo.SetupSSHidSource setupSSHidSource) {
                this.f41114a = sshIdNavigationActivity;
                this.f41115b = sshIdState;
                this.f41116c = setupSSHidSource;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 e(SshIdNavigationActivity sshIdNavigationActivity) {
                sshIdNavigationActivity.b0().onHandleCloseAction();
                return m0.f82633a;
            }

            public final void d(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (w.R()) {
                    w.b0(-1691499648, i10, -1, "com.server.auditor.ssh.client.ui.sshid.presentation.SshIdNavigationActivity.onCreate.<anonymous>.<anonymous> (SshIdNavigationActivity.kt:91)");
                }
                mVar.W(-2033523184);
                if (!g0.f(mVar, 0)) {
                    g0.c(this.f41114a, 0, mVar, 0, 1);
                }
                mVar.Q();
                SshIdStateInteractor.SshIdState sshIdState = this.f41115b;
                Avo.SetupSSHidSource setupSSHidSource = this.f41116c;
                boolean z10 = this.f41114a.f41104a;
                mVar.W(5004770);
                boolean zF = mVar.F(this.f41114a);
                final SshIdNavigationActivity sshIdNavigationActivity = this.f41114a;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.b
                        @Override // iu.a
                        public final Object a() {
                            return SshIdNavigationActivity.c.a.e(sshIdNavigationActivity);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                h.o(sshIdState, setupSSHidSource, z10, (iu.a) objD, mVar, 0);
                if (w.R()) {
                    w.a0();
                }
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
                return m0.f82633a;
            }
        }

        c(SshIdStateInteractor.SshIdState sshIdState, Avo.SetupSSHidSource setupSSHidSource) {
            this.f41112b = sshIdState;
            this.f41113c = setupSSHidSource;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 e(SshIdNavigationActivity sshIdNavigationActivity, SshIdActivityActions sshIdActivityActions) {
            t.f(sshIdActivityActions, "it");
            if (!(sshIdActivityActions instanceof SshIdActivityActions.a)) {
                throw new s();
            }
            sshIdNavigationActivity.finish();
            return m0.f82633a;
        }

        public final void d(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(-1585681924, i10, -1, "com.server.auditor.ssh.client.ui.sshid.presentation.SshIdNavigationActivity.onCreate.<anonymous> (SshIdNavigationActivity.kt:76)");
            }
            r.b(SshIdNavigationActivity.this, null, null, 3, null);
            if (Build.VERSION.SDK_INT >= 29) {
                SshIdNavigationActivity.this.getWindow().setNavigationBarContrastEnforced(false);
            }
            SshIdNavigationActivity.this.j0(t.m0.a(mVar, 0));
            zu.f activityActionFlow = SshIdNavigationActivity.this.b0().getActivityActionFlow();
            mVar.W(5004770);
            boolean zF = mVar.F(SshIdNavigationActivity.this);
            final SshIdNavigationActivity sshIdNavigationActivity = SshIdNavigationActivity.this;
            Object objD = mVar.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new l() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.a
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return SshIdNavigationActivity.c.e(sshIdNavigationActivity, (SshIdActivityActions) obj);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            np.n.b(activityActionFlow, null, null, (l) objD, mVar, 0, 6);
            qk.d.d(false, q1.h.d(-1691499648, true, new a(SshIdNavigationActivity.this, this.f41112b, this.f41113c), mVar, 54), mVar, 48, 1);
            if (w.R()) {
                w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            d((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return m0.f82633a;
        }
    }

    public static final class d extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f41117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f41117a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f41117a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f41118a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f41118a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f41118a.getViewModelStore();
        }
    }

    public static final class f extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f41119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f41120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41119a = aVar;
            this.f41120b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f41119a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f41120b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SshIdSetupFlowViewModel b0() {
        return (SshIdSetupFlowViewModel) this.f41105b.getValue();
    }

    private final SyncIntentService.SshIdAction c0(Bundle bundle, String str) {
        SyncIntentService.SshIdAction sshIdAction;
        SyncIntentService.SshIdAction sshIdAction2;
        return Build.VERSION.SDK_INT >= 33 ? (bundle == null || (sshIdAction2 = (SyncIntentService.SshIdAction) bundle.getParcelable(str, SyncIntentService.SshIdAction.class)) == null) ? SyncIntentService.SshIdAction.NoNeedActions.INSTANCE : sshIdAction2 : (bundle == null || (sshIdAction = (SyncIntentService.SshIdAction) bundle.getParcelable(str)) == null) ? SyncIntentService.SshIdAction.NoNeedActions.INSTANCE : sshIdAction;
    }

    private final Avo.SetupSSHidSource e0(Bundle bundle, String str) {
        Avo.SetupSSHidSource setupSSHidSource = (Avo.SetupSSHidSource) (bundle != null ? bundle.get(str) : null);
        return setupSSHidSource == null ? Avo.SetupSSHidSource.PROFILE_SCREEN : setupSSHidSource;
    }

    private final SshIdStateInteractor.SshIdState g0(Bundle bundle, String str) {
        SshIdStateInteractor.SshIdState sshIdState;
        SshIdStateInteractor.SshIdState sshIdState2;
        return Build.VERSION.SDK_INT >= 33 ? (bundle == null || (sshIdState2 = (SshIdStateInteractor.SshIdState) bundle.getParcelable(str, SshIdStateInteractor.SshIdState.class)) == null) ? SshIdStateInteractor.SshIdState.SetupRequired.INSTANCE : sshIdState2 : (bundle == null || (sshIdState = (SshIdStateInteractor.SshIdState) bundle.getParcelable(str)) == null) ? SshIdStateInteractor.SshIdState.SetupRequired.INSTANCE : sshIdState;
    }

    private final void h0(SyncIntentService.SshIdAction sshIdAction) {
        if (sshIdAction instanceof SyncIntentService.SshIdAction.PasskeysRegeneration) {
            b0().setCaPrivateKey(((SyncIntentService.SshIdAction.PasskeysRegeneration) sshIdAction).getCaKey());
        } else if (sshIdAction instanceof SyncIntentService.SshIdAction.CaRegeneration) {
            this.f41104a = true;
        }
    }

    private final void i0() {
        wu.k.d(androidx.lifecycle.a0.a(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(boolean z10) {
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        if (Build.VERSION.SDK_INT >= 30) {
            if (z10) {
                Window window = getWindow();
                if (window == null || (insetsController2 = window.getInsetsController()) == null) {
                    return;
                }
                insetsController2.setSystemBarsAppearance(0, 8);
                return;
            }
            Window window2 = getWindow();
            if (window2 == null || (insetsController = window2.getInsetsController()) == null) {
                return;
            }
            insetsController.setSystemBarsAppearance(8, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(String str) {
        b0().setPushEvent(str);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i0();
        Bundle extras = getIntent().getExtras();
        SshIdStateInteractor.SshIdState sshIdStateG0 = g0(extras, "ssh_id_state_key");
        Avo.SetupSSHidSource setupSSHidSourceE0 = e0(extras, "sshid_source_key");
        h0(c0(extras, "ssh_id_ca_to_generate_keys"));
        e.e.b(this, null, q1.h.b(-1585681924, true, new c(sshIdStateG0, setupSSHidSourceE0)), 1, null);
    }
}
