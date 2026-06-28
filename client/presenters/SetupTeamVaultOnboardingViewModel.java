package com.server.auditor.ssh.client.presenters;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.models.q;
import iu.p;
import java.util.List;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import zu.a0;
import zu.c0;
import zu.k0;
import zu.v;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SetupTeamVaultOnboardingViewModel extends i1 {
    private static final long SYNC_STATUS_DEBOUNCE = 500;
    private final v _navigationEvent;
    private final w _uiState;
    private final String analyticsFunnelId;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final zu.f isSyncing;
    private final a0 navigationEvent;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final List<TypedEntityIdentifier> typedEntityToShareIdentifiers;
    private final k0 uiState;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35977a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultOnboardingViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f35977a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = SetupTeamVaultOnboardingViewModel.this._uiState;
            SetupTeamVaultOnboardingViewModel setupTeamVaultOnboardingViewModel = SetupTeamVaultOnboardingViewModel.this;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, c.b((c) value, !setupTeamVaultOnboardingViewModel.typedEntityToShareIdentifiers.isEmpty(), false, 2, null)));
            SetupTeamVaultOnboardingViewModel.this.avoAnalytics.N4();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35981a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultOnboardingViewModel.this.new d(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r6.proceedToSetupTeamVault(r5) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r5.f35981a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                ut.x.b(r6)
                goto L58
            L1e:
                ut.x.b(r6)
                goto L30
            L22:
                ut.x.b(r6)
                com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.this
                r5.f35981a = r4
                java.lang.Object r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.access$waitSyncToComplete(r6, r5)
                if (r6 != r0) goto L30
                goto L57
            L30:
                com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.this
                com.server.auditor.ssh.client.app.a r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.access$getTermiusStorage$p(r6)
                boolean r6 = r6.m()
                if (r6 == 0) goto L4d
                com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.this
                zu.v r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.access$get_navigationEvent$p(r6)
                com.server.auditor.ssh.client.models.q$a r1 = com.server.auditor.ssh.client.models.q.a.f27939a
                r5.f35981a = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L58
                goto L57
            L4d:
                com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.this
                r5.f35981a = r2
                java.lang.Object r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.access$proceedToSetupTeamVault(r6, r5)
                if (r6 != r0) goto L58
            L57:
                return r0
            L58:
                ut.m0 r6 = ut.m0.f82633a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35983a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultOnboardingViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35983a;
            if (i10 == 0) {
                x.b(obj);
                if (((c) SetupTeamVaultOnboardingViewModel.this._uiState.getValue()).d()) {
                    return m0.f82633a;
                }
                v vVar = SetupTeamVaultOnboardingViewModel.this._navigationEvent;
                q.a aVar = q.a.f27939a;
                this.f35983a = 1;
                if (vVar.emit(aVar, this) == objF) {
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

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35985a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultOnboardingViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35985a;
            if (i10 == 0) {
                x.b(obj);
                v vVar = SetupTeamVaultOnboardingViewModel.this._navigationEvent;
                q.a aVar = q.a.f27939a;
                this.f35985a = 1;
                if (vVar.emit(aVar, this) == objF) {
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
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35987a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultOnboardingViewModel.this.new g(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r5.proceedToSetupTeamVault(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r4.f35987a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                ut.x.b(r5)
                goto L46
            L1b:
                ut.x.b(r5)
                com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel r5 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.this
                com.server.auditor.ssh.client.app.a r5 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.access$getTermiusStorage$p(r5)
                boolean r5 = r5.r0()
                if (r5 == 0) goto L35
                com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel r5 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.this
                r4.f35987a = r3
                java.lang.Object r5 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.access$proceedToSetupTeamVault(r5, r4)
                if (r5 != r0) goto L46
                goto L45
            L35:
                com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel r5 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.this
                zu.v r5 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.access$get_navigationEvent$p(r5)
                com.server.auditor.ssh.client.models.q$b r1 = com.server.auditor.ssh.client.models.q.b.f27940a
                r4.f35987a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35989a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35991c;

        h(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35989a = obj;
            this.f35991c |= RtlSpacingHelper.UNDEFINED;
            return SetupTeamVaultOnboardingViewModel.this.waitSyncToComplete(this);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35993b;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            i iVar = new i(eVar);
            iVar.f35993b = obj;
            return iVar;
        }

        @Override // iu.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Boolean bool, zt.e eVar) {
            return ((i) create(bool, eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35992a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(!((Boolean) this.f35993b).booleanValue());
        }
    }

    public SetupTeamVaultOnboardingViewModel(List<TypedEntityIdentifier> list, String str) {
        t.f(list, "typedEntityToShareIdentifiers");
        t.f(str, "analyticsFunnelId");
        this.typedEntityToShareIdentifiers = list;
        this.analyticsFunnelId = str;
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        androidx.lifecycle.k0 k0VarP = aVarN.P();
        t.e(k0VarP, "getIsSyncingLiveData(...)");
        this.isSyncing = androidx.lifecycle.m.a(k0VarP);
        boolean z10 = false;
        w wVarA = zu.m0.a(new c(z10, z10, 3, null));
        this._uiState = wVarA;
        this.uiState = zu.h.b(wVarA);
        v vVarB = c0.b(0, 0, null, 7, null);
        this._navigationEvent = vVarB;
        this.navigationEvent = zu.h.a(vVarB);
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object proceedToSetupTeamVault(zt.e<? super m0> eVar) {
        if (this.typedEntityToShareIdentifiers.isEmpty()) {
            Object objEmit = this._navigationEvent.emit(new q.d(false, this.analyticsFunnelId), eVar);
            return objEmit == au.b.f() ? objEmit : m0.f82633a;
        }
        Object objEmit2 = this._navigationEvent.emit(new q.c(this.typedEntityToShareIdentifiers, this.analyticsFunnelId), eVar);
        return objEmit2 == au.b.f() ? objEmit2 : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitSyncToComplete(zt.e<? super ut.m0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.h
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$h r0 = (com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.h) r0
            int r1 = r0.f35991c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35991c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$h r0 = new com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f35989a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f35991c
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2b
            ut.x.b(r9)
            goto L5f
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            ut.x.b(r9)
            zu.w r9 = r8._uiState
        L38:
            java.lang.Object r2 = r9.getValue()
            r6 = r2
            com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$c r6 = (com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.c) r6
            com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$c r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.c.b(r6, r4, r5, r5, r3)
            boolean r2 = r9.g(r2, r6)
            if (r2 == 0) goto L38
            zu.f r9 = r8.isSyncing
            r6 = 500(0x1f4, double:2.47E-321)
            zu.f r9 = zu.h.o(r9, r6)
            com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$i r2 = new com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$i
            r2.<init>(r3)
            r0.f35991c = r5
            java.lang.Object r9 = zu.h.z(r9, r2, r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            zu.w r2 = r8._uiState
        L61:
            java.lang.Object r9 = r2.getValue()
            r0 = r9
            com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$c r0 = (com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.c) r0
            com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel$c r0 = com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.c.b(r0, r4, r4, r5, r3)
            boolean r9 = r2.g(r9, r0)
            if (r9 == 0) goto L61
            ut.m0 r9 = ut.m0.f82633a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.SetupTeamVaultOnboardingViewModel.waitSyncToComplete(zt.e):java.lang.Object");
    }

    public final a0 getNavigationEvent() {
        return this.navigationEvent;
    }

    public final k0 getUiState() {
        return this.uiState;
    }

    public final void onAuthenticationFailed() {
    }

    public final void onAuthenticationSuccess() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onBackButtonPressed() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void onDoItLaterButtonClicked() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final void onStartSetupButtonClicked() {
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f35979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f35980b;

        public c(boolean z10, boolean z11) {
            this.f35979a = z10;
            this.f35980b = z11;
        }

        public static /* synthetic */ c b(c cVar, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = cVar.f35979a;
            }
            if ((i10 & 2) != 0) {
                z11 = cVar.f35980b;
            }
            return cVar.a(z10, z11);
        }

        public final c a(boolean z10, boolean z11) {
            return new c(z10, z11);
        }

        public final boolean c() {
            return this.f35979a;
        }

        public final boolean d() {
            return this.f35980b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f35979a == cVar.f35979a && this.f35980b == cVar.f35980b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f35979a) * 31) + Boolean.hashCode(this.f35980b);
        }

        public String toString() {
            return "SetupTeamVaultOnboardingUiState(hasProvidedEntitiesToShare=" + this.f35979a + ", isProgress=" + this.f35980b + ")";
        }

        public /* synthetic */ c(boolean z10, boolean z11, int i10, k kVar) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
        }
    }
}
