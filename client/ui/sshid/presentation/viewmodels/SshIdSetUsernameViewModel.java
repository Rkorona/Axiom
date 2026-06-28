package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.crystalnix.termius.libtermius.SshKey;
import com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdSetUsernameScreenActions;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdCreationPayload;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository;
import com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase;
import com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import cp.b;
import cp.d;
import cp.e;
import cp.f;
import gp.y;
import hg.b2;
import ju.t;
import tp.c0;
import u9.a;
import ut.m0;
import ut.x;
import wu.i0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdSetUsernameViewModel extends i1 {
    private static final int DEFAULT_CA_KEY_TYPE = 3;
    private static final String GENERIC_ERROR_MESSAGE_CA_GENERATION = "Error during CA generation";
    private static final String GENERIC_ERROR_MESSAGE_INTERNAL_DB = "Internal database error.";
    private final w _continueButtonUiState;
    private final yu.d _screenActionFlow;
    private final w _setupErrorDetails;
    private final w _sshIdUsername;
    private final k0 continueButtonUiState;
    private final iu.l onUpdateCaPrivateKey;
    private final iu.l onUpdateSetupStep;
    private final k0 remoteCryptorFlow;
    private final RequestToCreateSshIdUseCase requestToCreateSshIdUseCase;
    private final zu.f screenActionFlow;
    private final k0 setupErrorDetails;
    private final y sshIdCAGenerationUseCase;
    private final zo.b sshIdDatabaseInteractor;
    private final k0 sshIdUsername;
    private final String wizardId;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    @Keep
    public static abstract class ContinueButtonState {
        public static final int $stable = 0;

        public static final class a extends ContinueButtonState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f41297a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1763655327;
            }

            public String toString() {
                return "DisabledState";
            }
        }

        public static final class b extends ContinueButtonState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f41298a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1886463334;
            }

            public String toString() {
                return "EnabledState";
            }
        }

        public static final class c extends ContinueButtonState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f41299a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2107819893;
            }

            public String toString() {
                return "RequestInProgress";
            }
        }

        public /* synthetic */ ContinueButtonState(ju.k kVar) {
            this();
        }

        private ContinueButtonState() {
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41301b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41303d;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41301b = obj;
            this.f41303d |= RtlSpacingHelper.UNDEFINED;
            return SshIdSetUsernameViewModel.this.createSshId(null, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41304a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ rg.h f41307d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, rg.h hVar, zt.e eVar) {
            super(2, eVar);
            this.f41306c = str;
            this.f41307d = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetUsernameViewModel.this.new c(this.f41306c, this.f41307d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41304a;
            if (i10 == 0) {
                x.b(obj);
                SshIdSetUsernameViewModel.this.setContinueButtonState(ContinueButtonState.c.f41299a);
                SshIdCreationPayload sshIdCreationPayloadPreparePayloadToCreateSshId = SshIdSetUsernameViewModel.this.preparePayloadToCreateSshId(this.f41306c);
                if (sshIdCreationPayloadPreparePayloadToCreateSshId == null) {
                    SshIdSetUsernameViewModel.this.setSetupError(new SshIdSetupErrorDetails.b(100, null, 2, null));
                    SshIdSetUsernameViewModel.this.setContinueButtonState(ContinueButtonState.b.f41298a);
                } else {
                    SshIdSetUsernameViewModel sshIdSetUsernameViewModel = SshIdSetUsernameViewModel.this;
                    rg.h hVar = this.f41307d;
                    this.f41304a = 1;
                    if (sshIdSetUsernameViewModel.createSshId(sshIdCreationPayloadPreparePayloadToCreateSshId, hVar, this) == objF) {
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
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41308a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetUsernameViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41308a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdSetUsernameViewModel.this._screenActionFlow;
                SshIdSetUsernameScreenActions.a aVar = SshIdSetUsernameScreenActions.a.f40877a;
                this.f41308a = 1;
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41310a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41312c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f41312c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetUsernameViewModel.this.new e(this.f41312c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41310a;
            if (i10 == 0) {
                x.b(obj);
                SshIdSetUsernameViewModel.this.resetUsernameError();
                SshIdSetUsernameViewModel.this.onContinueButtonPressed(this.f41312c);
                yu.d dVar = SshIdSetUsernameViewModel.this._screenActionFlow;
                SshIdSetUsernameScreenActions.b bVar = SshIdSetUsernameScreenActions.b.f40878a;
                this.f41310a = 1;
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
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41313a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41315c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f41315c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetUsernameViewModel.this.new f(this.f41315c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41313a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshIdSetUsernameViewModel.this._sshIdUsername.setValue(this.f41315c);
            SshIdSetUsernameViewModel.this.updateContinueButtonByUsername(this.f41315c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41316a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f41318c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdSetUsernameViewModel.this.new g(this.f41318c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41316a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshIdSetUsernameViewModel.this.resetUsernameError();
            if (this.f41318c.length() == 0) {
                SshIdSetUsernameViewModel.this.setContinueButtonState(ContinueButtonState.a.f41297a);
            } else {
                SshIdSetUsernameViewModel.this.setContinueButtonState(ContinueButtonState.b.f41298a);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdSetUsernameViewModel(k0 k0Var, String str, iu.l lVar, iu.l lVar2) {
        t.f(k0Var, "remoteCryptorFlow");
        t.f(str, "wizardId");
        t.f(lVar, "onUpdateCaPrivateKey");
        t.f(lVar2, "onUpdateSetupStep");
        this.remoteCryptorFlow = k0Var;
        this.wizardId = str;
        this.onUpdateCaPrivateKey = lVar;
        this.onUpdateSetupStep = lVar2;
        this.sshIdCAGenerationUseCase = new y();
        b2 b2Var = b2.f52944a;
        this.requestToCreateSshIdUseCase = new RequestToCreateSshIdUseCase(new SshIdCreationApiRepository(b2Var.O1(), b2Var.B1(), lVar2));
        this.sshIdDatabaseInteractor = new zo.b(e.a.b(cp.e.f46961d, null, 1, null), f.a.b(cp.f.f47012b, null, 1, null), d.a.b(cp.d.f46939d, null, 1, null), b.a.b(cp.b.f46898d, null, 1, null), null, 16, null);
        w wVarA = zu.m0.a(null);
        this._setupErrorDetails = wVarA;
        this.setupErrorDetails = zu.h.b(wVarA);
        w wVarA2 = zu.m0.a(ContinueButtonState.a.f41297a);
        this._continueButtonUiState = wVarA2;
        this.continueButtonUiState = zu.h.b(wVarA2);
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = zu.h.M(dVarB);
        w wVarA3 = zu.m0.a(c0.e());
        this._sshIdUsername = wVarA3;
        this.sshIdUsername = wVarA3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r8.b(r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createSshId(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdCreationPayload r8, rg.h r9, zt.e<? super ut.m0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel.b
            if (r0 == 0) goto L13
            r0 = r10
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel$b r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel.b) r0
            int r1 = r0.f41303d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41303d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel$b r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41301b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41303d
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 2
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3d
            if (r2 == r6) goto L39
            if (r2 != r3) goto L31
            ut.x.b(r10)
            goto La2
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            ut.x.b(r10)
            goto L7a
        L3d:
            java.lang.Object r8 = r0.f41300a
            r9 = r8
            rg.h r9 = (rg.h) r9
            ut.x.b(r10)
            goto L56
        L46:
            ut.x.b(r10)
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase r10 = r7.requestToCreateSshIdUseCase
            r0.f41300a = r9
            r0.f41303d = r4
            java.lang.Object r10 = r10.a(r8, r9, r0)
            if (r10 != r1) goto L56
            goto La1
        L56:
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase$CreationResult r10 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase.CreationResult) r10
            boolean r8 = r10 instanceof com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase.CreationResult.b
            if (r8 == 0) goto La5
            iu.l r8 = r7.onUpdateCaPrivateKey
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase$CreationResult$b r10 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase.CreationResult.b) r10
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r2 = r10.a()
            java.lang.String r2 = r2.caEncryptedPrivateKey
            r8.invoke(r2)
            zo.b r8 = r7.sshIdDatabaseInteractor
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r10 = r10.a()
            r0.f41300a = r5
            r0.f41303d = r6
            java.lang.Object r10 = r8.j(r10, r9, r0)
            if (r10 != r1) goto L7a
            goto La1
        L7a:
            bp.d r10 = (bp.d) r10
            if (r10 != 0) goto L8e
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$b r8 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$b
            r9 = 101(0x65, float:1.42E-43)
            r8.<init>(r9, r5, r6, r5)
            r7.setSetupError(r8)
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel$ContinueButtonState$b r8 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel.ContinueButtonState.b.f41298a
            r7.setContinueButtonState(r8)
            goto Lb7
        L8e:
            com.server.auditor.ssh.client.utils.analytics.a r8 = com.server.auditor.ssh.client.utils.analytics.a.y()
            r8.v6()
            yu.d r8 = r7._screenActionFlow
            com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdSetUsernameScreenActions$c r9 = com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdSetUsernameScreenActions.c.f40879a
            r0.f41303d = r3
            java.lang.Object r8 = r8.b(r9, r0)
            if (r8 != r1) goto La2
        La1:
            return r1
        La2:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        La5:
            boolean r8 = r10 instanceof com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase.CreationResult.a
            if (r8 == 0) goto Lba
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase$CreationResult$a r10 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestToCreateSshIdUseCase.CreationResult.a) r10
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails r8 = r10.a()
            r7.setSetupError(r8)
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel$ContinueButtonState$b r8 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel.ContinueButtonState.b.f41298a
            r7.setContinueButtonState(r8)
        Lb7:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        Lba:
            ut.s r8 = new ut.s
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdSetUsernameViewModel.createSshId(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdCreationPayload, rg.h, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SshIdCreationPayload preparePayloadToCreateSshId(String str) {
        this.onUpdateSetupStep.invoke(Avo.SSHidSetUpStep.GENERATING_C_A);
        SshKey sshKeyA = this.sshIdCAGenerationUseCase.a();
        if (sshKeyA == null) {
            return null;
        }
        String privateKey = sshKeyA.getPrivateKey();
        t.e(privateKey, "getPrivateKey(...)");
        String publicKey = sshKeyA.getPublicKey();
        t.e(publicKey, "getPublicKey(...)");
        return new SshIdCreationPayload(privateKey, publicKey, str, a.c.f81654b.a(), this.wizardId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetUsernameError() {
        this._setupErrorDetails.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContinueButtonState(ContinueButtonState continueButtonState) {
        this._continueButtonUiState.setValue(continueButtonState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSetupError(SshIdSetupErrorDetails sshIdSetupErrorDetails) {
        this._setupErrorDetails.setValue(sshIdSetupErrorDetails);
    }

    public final k0 getContinueButtonUiState() {
        return this.continueButtonUiState;
    }

    public final k0 getRemoteCryptorFlow() {
        return this.remoteCryptorFlow;
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final k0 getSetupErrorDetails() {
        return this.setupErrorDetails;
    }

    public final k0 getSshIdUsername() {
        return this.sshIdUsername;
    }

    public final void onContinueButtonPressed(String str) {
        t.f(str, "sshIdUsername");
        rg.h hVar = (rg.h) this.remoteCryptorFlow.getValue();
        if (hVar != null) {
            wu.k.d(j1.a(this), null, null, new c(str, hVar, null), 3, null);
        }
    }

    public final void onHandleBackButtonClicked() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onHandleContinueButtonClicked(String str) {
        t.f(str, "username");
        wu.k.d(j1.a(this), null, null, new e(str, null), 3, null);
    }

    public final void onUpdateSshIdUsername(String str) {
        t.f(str, "username");
        wu.k.d(j1.a(this), null, null, new f(str, null), 3, null);
    }

    public final void updateContinueButtonByUsername(String str) {
        t.f(str, "username");
        wu.k.d(j1.a(this), null, null, new g(str, null), 3, null);
    }
}
