package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.annotation.Keep;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdReadyScreenActions;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository;
import com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase;
import com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import cp.b;
import cp.d;
import cp.e;
import cp.f;
import hg.b2;
import ju.t;
import u9.a;
import ut.m0;
import ut.x;
import wu.i0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdReadyScreenViewModel extends i1 {
    public static final int $stable = 8;
    private final w _isRequestExecuted;
    private final w _readyUIState;
    private final yu.d _screenActionFlow;
    private final w _setupErrorDetails;
    private final k0 isRequestExecuted;
    private final k0 readyUIState;
    private final RequestToCompleteSshIdSetupUseCase requestToCompleteSetupSshIdUseCase;
    private final zu.f screenActionFlow;
    private final k0 setupErrorDetails;
    private final zo.b sshIdDatabaseInteractor;
    private final String sshIdUsername;
    private final String wizardId;

    @Keep
    public static final class SshIdReadyScreenUiState {
        public static final int $stable = 0;
        private final boolean isCompleteFailed;
        private final boolean isCompleteSuccessful;
        private final boolean isRequestInProgress;

        public SshIdReadyScreenUiState() {
            this(false, false, false, 7, null);
        }

        public static /* synthetic */ SshIdReadyScreenUiState copy$default(SshIdReadyScreenUiState sshIdReadyScreenUiState, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = sshIdReadyScreenUiState.isRequestInProgress;
            }
            if ((i10 & 2) != 0) {
                z11 = sshIdReadyScreenUiState.isCompleteSuccessful;
            }
            if ((i10 & 4) != 0) {
                z12 = sshIdReadyScreenUiState.isCompleteFailed;
            }
            return sshIdReadyScreenUiState.copy(z10, z11, z12);
        }

        public final boolean component1() {
            return this.isRequestInProgress;
        }

        public final boolean component2() {
            return this.isCompleteSuccessful;
        }

        public final boolean component3() {
            return this.isCompleteFailed;
        }

        public final SshIdReadyScreenUiState copy(boolean z10, boolean z11, boolean z12) {
            return new SshIdReadyScreenUiState(z10, z11, z12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SshIdReadyScreenUiState)) {
                return false;
            }
            SshIdReadyScreenUiState sshIdReadyScreenUiState = (SshIdReadyScreenUiState) obj;
            return this.isRequestInProgress == sshIdReadyScreenUiState.isRequestInProgress && this.isCompleteSuccessful == sshIdReadyScreenUiState.isCompleteSuccessful && this.isCompleteFailed == sshIdReadyScreenUiState.isCompleteFailed;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isRequestInProgress) * 31) + Boolean.hashCode(this.isCompleteSuccessful)) * 31) + Boolean.hashCode(this.isCompleteFailed);
        }

        public final boolean isCompleteFailed() {
            return this.isCompleteFailed;
        }

        public final boolean isCompleteSuccessful() {
            return this.isCompleteSuccessful;
        }

        public final boolean isRequestInProgress() {
            return this.isRequestInProgress;
        }

        public String toString() {
            return "SshIdReadyScreenUiState(isRequestInProgress=" + this.isRequestInProgress + ", isCompleteSuccessful=" + this.isCompleteSuccessful + ", isCompleteFailed=" + this.isCompleteFailed + ")";
        }

        public SshIdReadyScreenUiState(boolean z10, boolean z11, boolean z12) {
            this.isRequestInProgress = z10;
            this.isCompleteSuccessful = z11;
            this.isCompleteFailed = z12;
        }

        public /* synthetic */ SshIdReadyScreenUiState(boolean z10, boolean z11, boolean z12, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
        }
    }

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41288a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdReadyScreenViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41288a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdReadyScreenViewModel.this._screenActionFlow;
                SshIdReadyScreenActions.b bVar = SshIdReadyScreenActions.b.f40875a;
                this.f41288a = 1;
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
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41290a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdReadyScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41290a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdReadyScreenViewModel.this._screenActionFlow;
                SshIdReadyScreenActions.c cVar = SshIdReadyScreenActions.c.f40876a;
                this.f41290a = 1;
                if (dVar.b(cVar, this) == objF) {
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

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41292a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdReadyScreenViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41292a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdReadyScreenViewModel.this._screenActionFlow;
                SshIdReadyScreenActions.a aVar = SshIdReadyScreenActions.a.f40874a;
                this.f41292a = 1;
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
        int f41294a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f41296c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f41296c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdReadyScreenViewModel.this.new d(this.f41296c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
        
            if (zo.b.k(r3, r4, null, r6, 2, null) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r9.f41294a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                ut.x.b(r10)
                r6 = r9
                goto L7f
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                ut.x.b(r10)
                goto L60
            L1f:
                ut.x.b(r10)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$resetGenerationError(r10)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$setProgressStateForUI(r10)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                boolean r1 = r9.f41296c
                java.lang.String r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$determineDefaultPasskeyType(r10, r1)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r1 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                java.lang.String r1 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$getWizardId$p(r1)
                com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload r4 = new com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
                r4.<init>(r10, r5, r1)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                zu.w r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$get_isRequestExecuted$p(r10)
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
                r10.setValue(r1)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$getRequestToCompleteSetupSshIdUseCase$p(r10)
                r9.f41294a = r3
                java.lang.Object r10 = r10.a(r4, r9)
                if (r10 != r0) goto L60
                r6 = r9
                goto L7e
            L60:
                com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult r10 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase.CompleteSetupResult) r10
                boolean r1 = r10 instanceof com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase.CompleteSetupResult.b
                if (r1 == 0) goto L8c
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r1 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                zo.b r3 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$getSshIdDatabaseInteractor$p(r1)
                com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$b r10 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase.CompleteSetupResult.b) r10
                com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r4 = r10.a()
                r9.f41294a = r2
                r5 = 0
                r7 = 2
                r8 = 0
                r6 = r9
                java.lang.Object r10 = zo.b.k(r3, r4, r5, r6, r7, r8)
                if (r10 != r0) goto L7f
            L7e:
                return r0
            L7f:
                com.server.auditor.ssh.client.utils.analytics.a r10 = com.server.auditor.ssh.client.utils.analytics.a.y()
                r10.v6()
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                r10.setSuccessStateForUI()
                goto La1
            L8c:
                r6 = r9
                boolean r0 = r10 instanceof com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase.CompleteSetupResult.a
                if (r0 == 0) goto La4
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r0 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a r10 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase.CompleteSetupResult.a) r10
                com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails r10 = r10.a()
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$setSetupError(r0, r10)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel r10 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.this
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.access$setFailedStateForUI(r10)
            La1:
                ut.m0 r10 = ut.m0.f82633a
                return r10
            La4:
                ut.s r10 = new ut.s
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdReadyScreenViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdReadyScreenViewModel(String str, String str2) {
        t.f(str, "sshIdUsername");
        t.f(str2, "wizardId");
        this.sshIdUsername = str;
        this.wizardId = str2;
        b2 b2Var = b2.f52944a;
        this.requestToCompleteSetupSshIdUseCase = new RequestToCompleteSshIdSetupUseCase(new SshIdUpdatePropertiesApiRepository(b2Var.O1(), b2Var.B1(), new iu.l() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.m
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SshIdReadyScreenViewModel.requestToCompleteSetupSshIdUseCase$lambda$0((Avo.SSHidSetUpStep) obj);
            }
        }));
        this.sshIdDatabaseInteractor = new zo.b(e.a.b(cp.e.f46961d, null, 1, null), f.a.b(cp.f.f47012b, null, 1, null), d.a.b(cp.d.f46939d, null, 1, null), b.a.b(cp.b.f46898d, null, 1, null), null, 16, null);
        w wVarA = zu.m0.a(getInitialState());
        this._readyUIState = wVarA;
        this.readyUIState = zu.h.b(wVarA);
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = zu.h.M(dVarB);
        w wVarA2 = zu.m0.a(null);
        this._setupErrorDetails = wVarA2;
        this.setupErrorDetails = zu.h.b(wVarA2);
        w wVarA3 = zu.m0.a(Boolean.FALSE);
        this._isRequestExecuted = wVarA3;
        this.isRequestExecuted = zu.h.b(wVarA3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String determineDefaultPasskeyType(boolean z10) {
        return z10 ? a.g.f81658b.a() : a.c.f81654b.a();
    }

    private final SshIdReadyScreenUiState getInitialState() {
        return new SshIdReadyScreenUiState(true, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 requestToCompleteSetupSshIdUseCase$lambda$0(Avo.SSHidSetUpStep sSHidSetUpStep) {
        t.f(sSHidSetUpStep, "it");
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetGenerationError() {
        this._setupErrorDetails.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFailedStateForUI() {
        updateSshIdReadyUIState$default(this, Boolean.FALSE, null, Boolean.TRUE, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgressStateForUI() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        updateSshIdReadyUIState(bool, bool2, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSetupError(SshIdSetupErrorDetails sshIdSetupErrorDetails) {
        this._setupErrorDetails.setValue(sshIdSetupErrorDetails);
    }

    private final void updateSshIdReadyUIState(Boolean bool, Boolean bool2, Boolean bool3) {
        Object value;
        SshIdReadyScreenUiState sshIdReadyScreenUiState;
        w wVar = this._readyUIState;
        do {
            value = wVar.getValue();
            sshIdReadyScreenUiState = (SshIdReadyScreenUiState) value;
        } while (!wVar.g(value, sshIdReadyScreenUiState.copy(bool != null ? bool.booleanValue() : sshIdReadyScreenUiState.isRequestInProgress(), bool2 != null ? bool2.booleanValue() : sshIdReadyScreenUiState.isCompleteSuccessful(), bool3 != null ? bool3.booleanValue() : sshIdReadyScreenUiState.isCompleteFailed())));
    }

    static /* synthetic */ void updateSshIdReadyUIState$default(SshIdReadyScreenViewModel sshIdReadyScreenViewModel, Boolean bool, Boolean bool2, Boolean bool3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        if ((i10 & 2) != 0) {
            bool2 = null;
        }
        if ((i10 & 4) != 0) {
            bool3 = null;
        }
        sshIdReadyScreenViewModel.updateSshIdReadyUIState(bool, bool2, bool3);
    }

    public final k0 getReadyUIState() {
        return this.readyUIState;
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final k0 getSetupErrorDetails() {
        return this.setupErrorDetails;
    }

    public final k0 isRequestExecuted() {
        return this.isRequestExecuted;
    }

    public final void onHandleCheckItOutClicked() {
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final void onHandleDoneButtonClicked() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onHandleFinishLaterButtonClicked() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onSendRequestToUpdateDataAndCompleteSetup(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }

    public final void setSuccessStateForUI() {
        updateSshIdReadyUIState$default(this, Boolean.FALSE, Boolean.TRUE, null, 4, null);
    }
}
