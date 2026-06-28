package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import com.server.auditor.ssh.client.ui.sshid.data.DeviceStatusData;
import com.server.auditor.ssh.client.ui.sshid.data.LocalPasskeyModelWithCertificate;
import com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdPasskeysGenerationScreenActions;
import com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus;
import com.server.auditor.ssh.client.ui.sshid.data.enums.StateOfGenerationPasskeys;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.DeviceKeyBoundApiModel;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository;
import com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase;
import com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdDataFromBackendUseCase;
import com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase;
import com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase;
import com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails;
import com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel;
import cp.b;
import cp.c;
import cp.d;
import cp.e;
import cp.f;
import gp.e;
import hg.b2;
import io.sentry.a1;
import io.sentry.h7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import po.b;
import po.c;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdPasskeysGenerationViewModel extends i1 {
    private static final long DEFAULT_ANIMATION_DELAY = 1000;
    private static final String GENERIC_ERROR_MESSAGE_SOFTWARE_KEYS_GENERATION = "Error during Software passkey generation";
    public static final long NOTIFICATIONS_HANDLING_PERIOD = 6000;
    private static final long UNKNOWN_DEVICE_ID = -1;
    private final zu.w _fullDeviceList;
    private final yu.d _screenActionFlow;
    private final zu.w _screenUiState;
    private final zu.w _setupErrorDetails;
    private final gp.x analyticsInteractor;
    private final String analyticsWizardId;
    private final gp.a biometricPasskeyGenerateUseCase;
    private String biometricTypeOfCurrentDevice;
    private final zu.k0 caPrivateKeyFlow;
    private final gp.d clearSshIdDataUseCase;
    private long currentDeviceId;
    private final gp.l deviceListSorter;
    private final zu.k0 fullDeviceList;
    private final cp.b hardwareDeviceBoundKeyDaoRepository;
    private final List<SecurityKeyBoundApiModel> hardwarePasskeysToUploadToBackend;
    private boolean isHardwareKeyStorageAvailable;
    private boolean isSetupCompleted;
    private final cp.c localDeviceBoundKeyDaoRepository;
    private final List<LocalPasskeyModelWithCertificate> localPasskeysToUploadToBackend;
    private final LogoutSpecificDeviceUseCase logoutSpecificDeviceUseCase;
    private boolean needToAskAboutBiometricKeys;
    private final iu.l onRequestRemoteCryptor;
    private final iu.l onUpdateCaPrivateKey;
    private final iu.l onUpdateIsCompleteSetup;
    private final iu.l onUpdateSetupStep;
    private final zu.k0 remoteCryptorFlow;
    private final cp.d remoteDeviceBoundKeyDaoRepository;
    private final RequestSshIdDataFromBackendUseCase requestSshIdDataFromBackendUseCase;
    private final RequestSshIdUploadPasskeysUseCase requestSshIdUploadPasskeysUseCase;
    private final RequestToUpdateSshIdCaUseCase requestToUpdateSshIdCaUseCase;
    private StartStepForRetryAction retryStartStep;
    private final zu.f screenActionFlow;
    private final zu.k0 screenUiState;
    private final zu.k0 setupErrorDetails;
    private final gp.v shouldRegeneratePasskeysUseCase;
    private final gp.w softwarePasskeyGenerateUseCase;
    private final gp.y sshIdCAGenerationUseCase;
    private final cp.e sshIdDaoRepository;
    private final zo.b sshIdDatabaseInteractor;
    private final cp.f sshIdDevicesDaoRepository;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    @Keep
    public static final class ScreenUiState {
        public static final int $stable = 0;
        private final boolean isOnlyOneDeviceInTheList;
        private final StateOfGenerationPasskeys statusOfDeviceList;

        /* JADX WARN: Multi-variable type inference failed */
        public ScreenUiState() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ScreenUiState copy$default(ScreenUiState screenUiState, StateOfGenerationPasskeys stateOfGenerationPasskeys, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                stateOfGenerationPasskeys = screenUiState.statusOfDeviceList;
            }
            if ((i10 & 2) != 0) {
                z10 = screenUiState.isOnlyOneDeviceInTheList;
            }
            return screenUiState.copy(stateOfGenerationPasskeys, z10);
        }

        public final StateOfGenerationPasskeys component1() {
            return this.statusOfDeviceList;
        }

        public final boolean component2() {
            return this.isOnlyOneDeviceInTheList;
        }

        public final ScreenUiState copy(StateOfGenerationPasskeys stateOfGenerationPasskeys, boolean z10) {
            ju.t.f(stateOfGenerationPasskeys, "statusOfDeviceList");
            return new ScreenUiState(stateOfGenerationPasskeys, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenUiState)) {
                return false;
            }
            ScreenUiState screenUiState = (ScreenUiState) obj;
            return this.statusOfDeviceList == screenUiState.statusOfDeviceList && this.isOnlyOneDeviceInTheList == screenUiState.isOnlyOneDeviceInTheList;
        }

        public final StateOfGenerationPasskeys getStatusOfDeviceList() {
            return this.statusOfDeviceList;
        }

        public int hashCode() {
            return (this.statusOfDeviceList.hashCode() * 31) + Boolean.hashCode(this.isOnlyOneDeviceInTheList);
        }

        public final boolean isOnlyOneDeviceInTheList() {
            return this.isOnlyOneDeviceInTheList;
        }

        public String toString() {
            return "ScreenUiState(statusOfDeviceList=" + this.statusOfDeviceList + ", isOnlyOneDeviceInTheList=" + this.isOnlyOneDeviceInTheList + ")";
        }

        public ScreenUiState(StateOfGenerationPasskeys stateOfGenerationPasskeys, boolean z10) {
            ju.t.f(stateOfGenerationPasskeys, "statusOfDeviceList");
            this.statusOfDeviceList = stateOfGenerationPasskeys;
            this.isOnlyOneDeviceInTheList = z10;
        }

        public /* synthetic */ ScreenUiState(StateOfGenerationPasskeys stateOfGenerationPasskeys, boolean z10, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? StateOfGenerationPasskeys.GETTING_DEVICE_LIST : stateOfGenerationPasskeys, (i10 & 2) != 0 ? true : z10);
        }
    }

    @Keep
    public static abstract class StartStepForRetryAction {
        public static final int $stable = 0;

        public static final class a extends StartStepForRetryAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f41157a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1393432925;
            }

            public String toString() {
                return "CaRegeneration";
            }
        }

        public static final class b extends StartStepForRetryAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f41158a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -418892629;
            }

            public String toString() {
                return "NoAction";
            }
        }

        public static final class c extends StartStepForRetryAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f41159a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -168649468;
            }

            public String toString() {
                return "PasskeysRegeneration";
            }
        }

        public /* synthetic */ StartStepForRetryAction(ju.k kVar) {
            this();
        }

        private StartStepForRetryAction() {
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41162c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41164e;

        a0(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41162c = obj;
            this.f41164e |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.runProcessOfCaRegeneration(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41165a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object objF = au.b.f();
            int i10 = this.f41165a;
            if (i10 == 0) {
                ut.x.b(obj);
                if (!SshIdPasskeysGenerationViewModel.this.areAllDevicesReadyForSshId()) {
                    Iterable iterable = (Iterable) SshIdPasskeysGenerationViewModel.this._fullDeviceList.getValue();
                    SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel = SshIdPasskeysGenerationViewModel.this;
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((DeviceStatusData) next).getDeviceId() == sshIdPasskeysGenerationViewModel.currentDeviceId) {
                            break;
                        }
                    }
                    DeviceStatusData deviceStatusData = (DeviceStatusData) next;
                    if ((deviceStatusData != null ? deviceStatusData.getStatus() : null) == DeviceStatus.READY) {
                        SshIdPasskeysGenerationViewModel.this.updateStateOfTheScreenElements(StateOfGenerationPasskeys.WAITING_FOR_OTHER_DEVICES);
                    }
                    return ut.m0.f82633a;
                }
                SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel2 = SshIdPasskeysGenerationViewModel.this;
                this.f41165a = 1;
                if (sshIdPasskeysGenerationViewModel2.determineIsSetupCompleted(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            SshIdPasskeysGenerationViewModel.this.updateStateOfTheScreenElements(StateOfGenerationPasskeys.ALL_DEVICES_ARE_READY);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41167a;

        b0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new b0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41167a;
            if (i10 == 0) {
                ut.x.b(obj);
                SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel = SshIdPasskeysGenerationViewModel.this;
                this.f41167a = 1;
                if (sshIdPasskeysGenerationViewModel.runProcessOfCaRegeneration(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41169a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f41171c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(iu.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f41171c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new c(this.f41171c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r5 == r0) goto L17;
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
                int r1 = r4.f41169a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r5)
                goto L47
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                ut.x.b(r5)
                goto L30
            L1e:
                ut.x.b(r5)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                cp.e r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$getSshIdDaoRepository$p(r5)
                r4.f41169a = r3
                java.lang.Object r5 = r5.n(r4)
                if (r5 != r0) goto L30
                goto L46
            L30:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L54
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                cp.c r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$getLocalDeviceBoundKeyDaoRepository$p(r5)
                r4.f41169a = r2
                java.lang.Object r5 = r5.k(r4)
                if (r5 != r0) goto L47
            L46:
                return r0
            L47:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L54
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$setFailedGenerationFlag(r5)
            L54:
                iu.a r5 = r4.f41171c
                r5.a()
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41173b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41175d;

        c0(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41173b = obj;
            this.f41175d |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.runProcessOfPasskeysRegeneration(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41176a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41178c;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41176a = obj;
            this.f41178c |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.clearPasskeysInDatabase(this);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41179a;

        d0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new d0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41179a;
            if (i10 == 0) {
                ut.x.b(obj);
                SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel = SshIdPasskeysGenerationViewModel.this;
                this.f41179a = 1;
                if (sshIdPasskeysGenerationViewModel.runProcessOfPasskeysRegeneration(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f41183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41184d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f41186f;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41184d = obj;
            this.f41186f |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.collectActualInfoAboutUsersDevices(this);
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41187a;

        e0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new e0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41187a;
            if (i10 == 0) {
                ut.x.b(obj);
                SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel = SshIdPasskeysGenerationViewModel.this;
                this.f41187a = 1;
                if (sshIdPasskeysGenerationViewModel.runProcessOfPasskeysRegeneration(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41190b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41192d;

        f(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41190b = obj;
            this.f41192d |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.determineIsSetupCompleted(this);
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f41195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41196d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f41198f;

        f0(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41196d = obj;
            this.f41198f |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.saveHardwareKeysToDatabase(null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41199a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41199a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (SshIdPasskeysGenerationViewModel.this.retryStartStep instanceof StartStepForRetryAction.c) {
                SshIdPasskeysGenerationViewModel.this.startForcedPasskeysRegenerationFlow();
            } else if (SshIdPasskeysGenerationViewModel.this.retryStartStep instanceof StartStepForRetryAction.a) {
                SshIdPasskeysGenerationViewModel.this.startPasskeyGenerationFlow(true);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41202b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41204d;

        g0(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41202b = obj;
            this.f41204d |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.saveLocalDeviceBoundKeysToDatabase(this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41207c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41209e;

        h(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41207c = obj;
            this.f41209e |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.fetchActualSshIdDataFromBackendThenDoAction(null, null, this);
        }
    }

    static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41210a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(String str, zt.e eVar) {
            super(2, eVar);
            this.f41212c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new h0(this.f41212c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41210a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdPasskeysGenerationViewModel.this.biometricTypeOfCurrentDevice = this.f41212c;
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41214b;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f41216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SshIdPasskeysGenerationViewModel f41217b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel, zt.e eVar) {
                super(2, eVar);
                this.f41217b = sshIdPasskeysGenerationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f41217b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f41216a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f41217b.fetchSshIdDataFromBackend();
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        i(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 l() {
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 m(SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel) {
            wu.k.d(j1.a(sshIdPasskeysGenerationViewModel), null, null, new a(sshIdPasskeysGenerationViewModel, null), 3, null);
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            rg.h hVar;
            Object objF = au.b.f();
            int i10 = this.f41214b;
            if (i10 == 0) {
                ut.x.b(obj);
                rg.h hVar2 = (rg.h) SshIdPasskeysGenerationViewModel.this.getRemoteCryptorFlow().getValue();
                if (hVar2 != null) {
                    SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel = SshIdPasskeysGenerationViewModel.this;
                    iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.k
                        @Override // iu.a
                        public final Object a() {
                            return SshIdPasskeysGenerationViewModel.i.l();
                        }
                    };
                    this.f41213a = hVar2;
                    this.f41214b = 1;
                    if (sshIdPasskeysGenerationViewModel.fetchActualSshIdDataFromBackendThenDoAction(aVar, hVar2, this) == objF) {
                        return objF;
                    }
                    hVar = hVar2;
                }
                final SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel2 = SshIdPasskeysGenerationViewModel.this;
                sshIdPasskeysGenerationViewModel2.askForActualRemoteCryptorThenRepeatAction(new iu.a() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.l
                    @Override // iu.a
                    public final Object a() {
                        return SshIdPasskeysGenerationViewModel.i.m(sshIdPasskeysGenerationViewModel2);
                    }
                });
                ut.m0 m0Var = ut.m0.f82633a;
                return ut.m0.f82633a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (rg.h) this.f41213a;
            ut.x.b(obj);
            if (hVar == null) {
                final SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel22 = SshIdPasskeysGenerationViewModel.this;
                sshIdPasskeysGenerationViewModel22.askForActualRemoteCryptorThenRepeatAction(new iu.a() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.l
                    @Override // iu.a
                    public final Object a() {
                        return SshIdPasskeysGenerationViewModel.i.m(sshIdPasskeysGenerationViewModel22);
                    }
                });
                ut.m0 m0Var2 = ut.m0.f82633a;
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41218a;

        i0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new i0(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r5.runProcessOfPasskeysRegeneration(r4) == r0) goto L15;
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
                int r1 = r4.f41218a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r5)
                goto L37
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                ut.x.b(r5)
                goto L2c
            L1e:
                ut.x.b(r5)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                r4.f41218a = r3
                java.lang.Object r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$prepareStatesAndDataBeforeRegeneration(r5, r4)
                if (r5 != r0) goto L2c
                goto L36
            L2c:
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                r4.f41218a = r2
                java.lang.Object r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$runProcessOfPasskeysRegeneration(r5, r4)
                if (r5 != r0) goto L37
            L36:
                return r0
            L37:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41220a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41222c;

        j(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41220a = obj;
            this.f41222c |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.generateAndCollectBiometricKey(null, null, this);
        }
    }

    static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41223a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f41225c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f41225c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new j0(this.f41225c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r5.handleActionForPasskeysGenerationStep(r1, r4) == r0) goto L17;
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
                int r1 = r4.f41223a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r5)
                goto L41
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                ut.x.b(r5)
                goto L2c
            L1e:
                ut.x.b(r5)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                r4.f41223a = r3
                java.lang.Object r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$collectActualInfoAboutUsersDevices(r5, r4)
                if (r5 != r0) goto L2c
                goto L40
            L2c:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L41
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                boolean r1 = r4.f41225c
                r4.f41223a = r2
                java.lang.Object r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$handleActionForPasskeysGenerationStep(r5, r1, r4)
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f41226a = new k();

        k() {
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void a() {
            throw new IllegalStateException(SshIdPasskeysGenerationViewModel.GENERIC_ERROR_MESSAGE_SOFTWARE_KEYS_GENERATION);
        }
    }

    static final class k0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41227a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41229c;

        k0(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41227a = obj;
            this.f41229c |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.updateDeviceListAfterActualInfoAboutSshIdReceived(this);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41230a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41232c;

        l(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41230a = obj;
            this.f41232c |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.handleActionForPasskeysGenerationStep(false, this);
        }
    }

    static final class l0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41234b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41236d;

        l0(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41234b = obj;
            this.f41236d |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.updateFlagToAskAboutUseBiometric(this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41237a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41237a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdPasskeysGenerationViewModel.this.openNextScreenDependsOnBiometricKeysAvailability();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StateOfGenerationPasskeys f41240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshIdPasskeysGenerationViewModel f41241c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f41242a;

            static {
                int[] iArr = new int[StateOfGenerationPasskeys.values().length];
                try {
                    iArr[StateOfGenerationPasskeys.KEY_GENERATION_SUCCESS_MESSAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StateOfGenerationPasskeys.WAITING_FOR_OTHER_DEVICES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StateOfGenerationPasskeys.KEY_GENERATION_RETRY_NEEDED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StateOfGenerationPasskeys.KEY_GENERATION_IN_PROGRESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f41242a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(StateOfGenerationPasskeys stateOfGenerationPasskeys, SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel, zt.e eVar) {
            super(2, eVar);
            this.f41240b = stateOfGenerationPasskeys;
            this.f41241c = sshIdPasskeysGenerationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new m0(this.f41240b, this.f41241c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        
            if (r5.runAnimationToShowFailedPasskeyGeneration(r4) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        
            if (r5.runAnimationToShowSuccessPasskeyGeneration(r4) == r0) goto L25;
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
                int r1 = r4.f41239a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r5)
                goto L65
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                ut.x.b(r5)
                goto L60
            L1e:
                ut.x.b(r5)
                com.server.auditor.ssh.client.ui.sshid.data.enums.StateOfGenerationPasskeys r5 = r4.f41240b
                int[] r1 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.m0.a.f41242a
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 == r3) goto L55
                if (r5 == r2) goto L4b
                r1 = 3
                if (r5 == r1) goto L40
                r0 = 4
                if (r5 == r0) goto L36
                goto L65
            L36:
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = r4.f41241c
                com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r0 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.RETRY_GENERATION
                com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r1 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.GENERATING
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$updateStateOfDeviceItems(r5, r0, r1)
                goto L65
            L40:
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = r4.f41241c
                r4.f41239a = r2
                java.lang.Object r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$runAnimationToShowFailedPasskeyGeneration(r5, r4)
                if (r5 != r0) goto L65
                goto L5f
            L4b:
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = r4.f41241c
                com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r0 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.WAITING_FOR_MAIN_DEVICE
                com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r1 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.WAITING_FOR_COMPLETING
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$updateStateOfDeviceItems(r5, r0, r1)
                goto L65
            L55:
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = r4.f41241c
                r4.f41239a = r3
                java.lang.Object r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$runAnimationToShowSuccessPasskeyGeneration(r5, r4)
                if (r5 != r0) goto L60
            L5f:
                return r0
            L60:
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = r4.f41241c
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$checkStateOfDevices(r5)
            L65:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41243a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f41245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ UserDeviceType f41246d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j10, UserDeviceType userDeviceType, zt.e eVar) {
            super(2, eVar);
            this.f41245c = j10;
            this.f41246d = userDeviceType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new n(this.f41245c, this.f41246d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41243a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.d dVar = SshIdPasskeysGenerationViewModel.this._screenActionFlow;
                SshIdPasskeysGenerationScreenActions.c cVar = new SshIdPasskeysGenerationScreenActions.c(this.f41245c, this.f41246d);
                this.f41243a = 1;
                if (dVar.b(cVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41247a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StateOfGenerationPasskeys f41249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f41250d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(StateOfGenerationPasskeys stateOfGenerationPasskeys, Boolean bool, zt.e eVar) {
            super(2, eVar);
            this.f41249c = stateOfGenerationPasskeys;
            this.f41250d = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new n0(this.f41249c, this.f41250d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            ScreenUiState screenUiState;
            au.b.f();
            if (this.f41247a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = SshIdPasskeysGenerationViewModel.this._screenUiState;
            StateOfGenerationPasskeys stateOfGenerationPasskeys = this.f41249c;
            Boolean bool = this.f41250d;
            do {
                value = wVar.getValue();
                screenUiState = (ScreenUiState) value;
            } while (!wVar.g(value, screenUiState.copy(stateOfGenerationPasskeys == null ? screenUiState.getStatusOfDeviceList() : stateOfGenerationPasskeys, bool != null ? bool.booleanValue() : screenUiState.isOnlyOneDeviceInTheList())));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41251a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41251a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.d dVar = SshIdPasskeysGenerationViewModel.this._screenActionFlow;
                SshIdPasskeysGenerationScreenActions.b bVar = SshIdPasskeysGenerationScreenActions.b.f40869a;
                this.f41251a = 1;
                if (dVar.b(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41254b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41256d;

        o0(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41254b = obj;
            this.f41256d |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.uploadPasskeys(null, null, this);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41257a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41257a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshIdPasskeysGenerationViewModel.this.onSendFinishSetupButtonPressedEvent();
            SshIdPasskeysGenerationViewModel.this.openNextScreenDependsOnBiometricKeysAvailability();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41259a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41259a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.d dVar = SshIdPasskeysGenerationViewModel.this._screenActionFlow;
                SshIdPasskeysGenerationScreenActions.a aVar = SshIdPasskeysGenerationScreenActions.a.f40868a;
                this.f41259a = 1;
                if (dVar.b(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41263c;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            gp.x xVar;
            int i10;
            Object objF = au.b.f();
            int i11 = this.f41263c;
            if (i11 == 0) {
                ut.x.b(obj);
                gp.x xVar2 = SshIdPasskeysGenerationViewModel.this.analyticsInteractor;
                cp.d dVar = SshIdPasskeysGenerationViewModel.this.remoteDeviceBoundKeyDaoRepository;
                this.f41261a = xVar2;
                this.f41263c = 1;
                Object objF2 = dVar.f(this);
                if (objF2 != objF) {
                    xVar = xVar2;
                    obj = objF2;
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f41262b;
                xVar = (gp.x) this.f41261a;
                ut.x.b(obj);
                xVar.a(i10, ((Boolean) obj).booleanValue());
                return ut.m0.f82633a;
            }
            xVar = (gp.x) this.f41261a;
            ut.x.b(obj);
            int iIntValue = ((Number) obj).intValue();
            cp.e eVar = SshIdPasskeysGenerationViewModel.this.sshIdDaoRepository;
            this.f41261a = xVar;
            this.f41262b = iIntValue;
            this.f41263c = 2;
            Object objS = eVar.s(this);
            if (objS != objF) {
                i10 = iIntValue;
                obj = objS;
                xVar.a(i10, ((Boolean) obj).booleanValue());
                return ut.m0.f82633a;
            }
            return objF;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41266b;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new s(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            gp.x xVar;
            Object objF = au.b.f();
            int i10 = this.f41266b;
            if (i10 == 0) {
                ut.x.b(obj);
                gp.x xVar2 = SshIdPasskeysGenerationViewModel.this.analyticsInteractor;
                cp.c cVar = SshIdPasskeysGenerationViewModel.this.localDeviceBoundKeyDaoRepository;
                this.f41265a = xVar2;
                this.f41266b = 1;
                Object objK = cVar.k(this);
                if (objK == objF) {
                    return objF;
                }
                xVar = xVar2;
                obj = objK;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = (gp.x) this.f41265a;
                ut.x.b(obj);
            }
            xVar.c(((Boolean) obj).booleanValue());
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41268a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new t(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r5.b(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (r5.b(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
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
                int r1 = r4.f41268a
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
                goto L48
            L1b:
                ut.x.b(r5)
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                boolean r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$getNeedToAskAboutBiometricKeys$p(r5)
                if (r5 == 0) goto L37
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                yu.d r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$get_screenActionFlow$p(r5)
                com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdPasskeysGenerationScreenActions$e r1 = com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdPasskeysGenerationScreenActions.e.f40873a
                r4.f41268a = r3
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L48
                goto L47
            L37:
                com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.this
                yu.d r5 = com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.access$get_screenActionFlow$p(r5)
                com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdPasskeysGenerationScreenActions$d r1 = com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdPasskeysGenerationScreenActions.d.f40872a
                r4.f41268a = r2
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41270a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41272c;

        u(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41270a = obj;
            this.f41272c |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.prepareStatesAndDataBeforeRegeneration(this);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41273a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41275c;

        v(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41273a = obj;
            this.f41275c |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.runAnimationToShowFailedPasskeyGeneration(this);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41276a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41278c;

        w(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41276a = obj;
            this.f41278c |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.runAnimationToShowSuccessPasskeyGeneration(this);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41279a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f41281c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(long j10, zt.e eVar) {
            super(2, eVar);
            this.f41281c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new x(this.f41281c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41279a;
            if (i10 == 0) {
                ut.x.b(obj);
                SshIdPasskeysGenerationViewModel.this.setLogoutInProgressForDevice(this.f41281c);
                LogoutSpecificDeviceUseCase logoutSpecificDeviceUseCase = SshIdPasskeysGenerationViewModel.this.logoutSpecificDeviceUseCase;
                int i11 = (int) this.f41281c;
                this.f41279a = 1;
                obj = logoutSpecificDeviceUseCase.a(i11, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            LogoutSpecificDeviceUseCase.DeviceLogoutResult deviceLogoutResult = (LogoutSpecificDeviceUseCase.DeviceLogoutResult) obj;
            if (deviceLogoutResult instanceof LogoutSpecificDeviceUseCase.DeviceLogoutResult.b) {
                SshIdPasskeysGenerationViewModel.this.fetchSshIdDataFromBackend();
            } else {
                if (!(deviceLogoutResult instanceof LogoutSpecificDeviceUseCase.DeviceLogoutResult.a)) {
                    throw new ut.s();
                }
                SshIdPasskeysGenerationViewModel.this.setDeviceAsWaitingForCompleting(this.f41281c);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41283b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41285d;

        y(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41283b = obj;
            this.f41285d |= RtlSpacingHelper.UNDEFINED;
            return SshIdPasskeysGenerationViewModel.this.runPasskeysUploading(this);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41286a;

        z(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdPasskeysGenerationViewModel.this.new z(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41286a;
            if (i10 == 0) {
                ut.x.b(obj);
                SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel = SshIdPasskeysGenerationViewModel.this;
                this.f41286a = 1;
                if (sshIdPasskeysGenerationViewModel.runPasskeysUploading(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public /* synthetic */ SshIdPasskeysGenerationViewModel(zu.k0 k0Var, zu.k0 k0Var2, String str, iu.l lVar, iu.l lVar2, iu.l lVar3, iu.l lVar4, gp.d dVar, int i10, ju.k kVar) {
        this(k0Var, k0Var2, str, lVar, lVar2, lVar3, lVar4, (i10 & 128) != 0 ? new gp.d(null, null, 3, null) : dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean areAllDevicesReadyForSshId() {
        Iterable iterable = (Iterable) this._fullDeviceList.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((DeviceStatusData) it.next()).getStatus() != DeviceStatus.READY) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void askForActualRemoteCryptorThenRepeatAction(final iu.a aVar) {
        this.onRequestRemoteCryptor.invoke(new iu.a() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.f
            @Override // iu.a
            public final Object a() {
                return SshIdPasskeysGenerationViewModel.askForActualRemoteCryptorThenRepeatAction$lambda$3(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 askForActualRemoteCryptorThenRepeatAction$lambda$3(iu.a aVar) {
        aVar.a();
        return ut.m0.f82633a;
    }

    private final boolean checkPassKeysFromBackendAreCorrect(SshIdResponse sshIdResponse) {
        List<DeviceKeyBoundApiModel> deviceBoundKeys = sshIdResponse.getDeviceBoundKeys();
        List<LocalPasskeyModelWithCertificate> list = this.localPasskeysToUploadToBackend;
        ArrayList arrayList = new ArrayList(vt.v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(su.s.p1(((LocalPasskeyModelWithCertificate) it.next()).getLocalPasskeyDbModel().h()).toString());
        }
        ArrayList arrayList2 = new ArrayList(vt.v.z(deviceBoundKeys, 10));
        Iterator<T> it2 = deviceBoundKeys.iterator();
        while (it2.hasNext()) {
            arrayList2.add(su.s.p1(((DeviceKeyBoundApiModel) it2.next()).getPublicKey()).toString());
        }
        Set setI1 = vt.v.i1(arrayList2);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (!setI1.contains((String) it3.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkStateOfDevices() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6.c(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearPasskeysInDatabase(zt.e<? super ut.m0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.d
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$d r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.d) r0
            int r1 = r0.f41178c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41178c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$d r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41176a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41178c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ut.x.b(r6)
            goto L46
        L38:
            ut.x.b(r6)
            cp.c r6 = r5.localDeviceBoundKeyDaoRepository
            r0.f41178c = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            cp.d r6 = r5.remoteDeviceBoundKeyDaoRepository
            r0.f41178c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.clearPasskeysInDatabase(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        if (updateFlagToAskAboutUseBiometric(r0) != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectActualInfoAboutUsersDevices(zt.e<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.collectActualInfoAboutUsersDevices(zt.e):java.lang.Object");
    }

    private final DeviceStatus determineInitialDeviceStatus(long j10, List<Long> list) {
        return list.contains(Long.valueOf(j10)) ? DeviceStatus.READY : DeviceStatus.WAITING_FOR_MAIN_DEVICE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (updateFlagToAskAboutUseBiometric(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object determineIsSetupCompleted(zt.e<? super ut.m0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.f
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$f r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.f) r0
            int r1 = r0.f41192d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41192d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$f r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41190b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41192d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r6)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f41189a
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r2 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel) r2
            ut.x.b(r6)
            goto L4d
        L3c:
            ut.x.b(r6)
            cp.e r6 = r5.sshIdDaoRepository
            r0.f41189a = r5
            r0.f41192d = r4
            java.lang.Object r6 = r6.q(r0)
            if (r6 != r1) goto L4c
            goto L6b
        L4c:
            r2 = r5
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r2.isSetupCompleted = r6
            iu.l r6 = r5.onUpdateIsCompleteSetup
            boolean r2 = r5.isSetupCompleted
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r2)
            r6.invoke(r2)
            r6 = 0
            r0.f41189a = r6
            r0.f41192d = r3
            java.lang.Object r6 = r5.updateFlagToAskAboutUseBiometric(r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.determineIsSetupCompleted(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (r9 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
    
        if (r9 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018f, code lost:
    
        if (r9 == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc A[PHI: r7
      0x00fc: PHI (r7v29 com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdDataFromBackendUseCase$ReceivedResult) = 
      (r7v26 com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdDataFromBackendUseCase$ReceivedResult)
      (r7v39 com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdDataFromBackendUseCase$ReceivedResult)
     binds: [B:41:0x00f8, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchActualSshIdDataFromBackendThenDoAction(iu.a r7, rg.h r8, zt.e<? super ut.m0> r9) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.fetchActualSshIdDataFromBackendThenDoAction(iu.a, rg.h, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchActualSshIdDataFromBackendThenDoAction$lambda$31(gp.e eVar, a1 a1Var) {
        ju.t.f(a1Var, "scope");
        io.sentry.f fVarB = y9.b.b("Error while clearing the SSH ID-related database", b.a.f70430c, c.C1098c.f70437b);
        fVarB.F(h7.ERROR);
        e.a aVar = (e.a) eVar;
        fVarB.E("Clearing SSH ID database step", aVar.b());
        fVarB.E("Clearing SSH ID database exception info", aVar.a());
        a1Var.b(fVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object generateAndCollectBiometricKey(java.lang.String r9, java.lang.String r10, zt.e<? super ut.m0> r11) throws java.lang.IllegalStateException {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.j
            if (r0 == 0) goto L14
            r0 = r11
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$j r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.j) r0
            int r1 = r0.f41222c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f41222c = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$j r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$j
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.f41220a
            java.lang.Object r0 = au.b.f()
            int r1 = r7.f41222c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            ut.x.b(r11)
            goto L5b
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            ut.x.b(r11)
            boolean r11 = r8.isHardwareKeyStorageAvailable
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r11)
            boolean r1 = r11.booleanValue()
            r3 = 0
            if (r1 == 0) goto L44
            goto L45
        L44:
            r11 = r3
        L45:
            if (r11 == 0) goto L61
            r11 = r3
            java.lang.String r3 = r8.biometricTypeOfCurrentDevice
            if (r3 == 0) goto L5f
            gp.a r1 = r8.biometricPasskeyGenerateUseCase
            long r4 = r8.currentDeviceId
            r7.f41222c = r2
            r6 = r9
            r2 = r10
            java.lang.Object r11 = r1.a(r2, r3, r4, r6, r7)
            if (r11 != r0) goto L5b
            return r0
        L5b:
            r3 = r11
            com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper$BiometricKeyGenerationResult r3 = (com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper.BiometricKeyGenerationResult) r3
            goto L62
        L5f:
            r3 = r11
            goto L62
        L61:
            r11 = r3
        L62:
            if (r3 == 0) goto L8b
            boolean r9 = r3 instanceof com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper.BiometricKeyGenerationResult.d
            if (r9 == 0) goto L78
            java.util.List<com.server.auditor.ssh.client.ui.sshid.data.LocalPasskeyModelWithCertificate> r9 = r8.localPasskeysToUploadToBackend
            com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper$BiometricKeyGenerationResult$d r3 = (com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper.BiometricKeyGenerationResult.d) r3
            com.server.auditor.ssh.client.ui.sshid.data.LocalPasskeyModelWithCertificate r10 = r3.a()
            boolean r9 = r9.add(r10)
            kotlin.coroutines.jvm.internal.b.a(r9)
            goto L8b
        L78:
            boolean r9 = r3 instanceof com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper.BiometricKeyGenerationResult.a
            if (r9 != 0) goto L8b
            boolean r9 = r3 instanceof com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper.BiometricKeyGenerationResult.b
            if (r9 != 0) goto L8b
            boolean r9 = r3 instanceof com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper.BiometricKeyGenerationResult.c
            if (r9 == 0) goto L85
            goto L8b
        L85:
            ut.s r9 = new ut.s
            r9.<init>()
            throw r9
        L8b:
            ut.m0 r9 = ut.m0.f82633a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.generateAndCollectBiometricKey(java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }

    private final void generateAndCollectSoftwareKeys(String str, String str2) throws IllegalStateException {
        Iterator it = gp.w.f51446c.a().iterator();
        while (it.hasNext()) {
            String str3 = str;
            String str4 = str2;
            LocalPasskeyModelWithCertificate localPasskeyModelWithCertificateC = this.softwarePasskeyGenerateUseCase.c(str4, ((Number) it.next()).intValue(), this.currentDeviceId, str3);
            if (localPasskeyModelWithCertificateC != null) {
                this.localPasskeysToUploadToBackend.add(localPasskeyModelWithCertificateC);
            } else {
                k kVar = k.f41226a;
            }
            str2 = str4;
            str = str3;
        }
    }

    private final String getRelevantSshIdCaPrivateKey() {
        return (String) this.caPrivateKeyFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (runProcessOfCaRegeneration(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (determineIsSetupCompleted(r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (runProcessOfPasskeysRegeneration(r0) != r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleActionForPasskeysGenerationStep(boolean r5, zt.e<? super ut.m0> r6) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.handleActionForPasskeysGenerationStep(boolean, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSendFinishSetupButtonPressedEvent() {
        wu.k.d(j1.a(this), null, null, new r(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openNextScreenDependsOnBiometricKeysAvailability() {
        wu.k.d(j1.a(this), null, null, new t(null), 3, null);
    }

    private final List<DeviceStatusData> prepareDeviceStatusData(List<bp.e> list, List<bp.a> list2, DeviceStatus deviceStatus) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bp.e) obj).c()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(vt.v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((bp.e) it.next()).a()));
        }
        ArrayList arrayList3 = new ArrayList(vt.v.z(list, 10));
        for (bp.e eVar : list) {
            arrayList3.add(new DeviceStatusData(eVar.b(), eVar.e(), this.currentDeviceId == eVar.a() ? arrayList2.contains(Long.valueOf(this.currentDeviceId)) ? DeviceStatus.READY : deviceStatus : determineInitialDeviceStatus(eVar.a(), arrayList2), eVar.a()));
        }
        ArrayList arrayList4 = new ArrayList(vt.v.z(list2, 10));
        for (bp.a aVar : list2) {
            arrayList4.add(new DeviceStatusData(UserDeviceType.FIDO, aVar.f(), DeviceStatus.READY, aVar.e()));
        }
        return vt.v.J0(arrayList3, arrayList4);
    }

    private final SshIdUploadPasskeysPayload preparePayloadForPasskeysUploading() {
        List<LocalPasskeyModelWithCertificate> list = this.localPasskeysToUploadToBackend;
        ArrayList arrayList = new ArrayList(vt.v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LocalPasskeyModelWithCertificate) it.next()).convertToApiModel());
        }
        return new SshIdUploadPasskeysPayload(arrayList, this.hardwarePasskeysToUploadToBackend, this.analyticsWizardId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareStatesAndDataBeforeRegeneration(zt.e<? super ut.m0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.u
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$u r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.u) r0
            int r1 = r0.f41272c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41272c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$u r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$u
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f41270a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41272c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            r0.f41272c = r3
            java.lang.Object r5 = r4.clearPasskeysInDatabase(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.server.auditor.ssh.client.ui.sshid.data.enums.StateOfGenerationPasskeys r5 = com.server.auditor.ssh.client.ui.sshid.data.enums.StateOfGenerationPasskeys.KEY_GENERATION_IN_PROGRESS
            r4.updateStateOfTheScreenElements(r5)
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r5 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.GENERATING
            r4.setStatusOfCurrentDevice(r5)
            r4.resetGenerationError()
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.prepareStatesAndDataBeforeRegeneration(zt.e):java.lang.Object");
    }

    private final void resetGenerationError() {
        this._setupErrorDetails.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAnimationToShowFailedPasskeyGeneration(zt.e<? super ut.m0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.v
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$v r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.v) r0
            int r1 = r0.f41275c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41275c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$v r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$v
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f41273a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41275c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r5 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.GENERATING
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r2 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.GENERATE_ERROR_MESSAGE
            r4.updateStateOfDeviceItems(r5, r2)
            r0.f41275c = r3
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = wu.s0.b(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r5 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.GENERATE_ERROR_MESSAGE
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r0 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.RETRY_GENERATION
            r4.updateStateOfDeviceItems(r5, r0)
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.runAnimationToShowFailedPasskeyGeneration(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAnimationToShowSuccessPasskeyGeneration(zt.e<? super ut.m0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.w
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$w r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.w) r0
            int r1 = r0.f41278c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41278c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$w r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$w
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f41276a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41278c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r5 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.GENERATING
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r2 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.GENERATE_SUCCESS_MESSAGE
            r4.updateStateOfDeviceItems(r5, r2)
            r0.f41278c = r3
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = wu.s0.b(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r5 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.GENERATE_SUCCESS_MESSAGE
            com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus r0 = com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus.READY
            r4.updateStateOfDeviceItems(r5, r0)
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.runAnimationToShowSuccessPasskeyGeneration(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runPasskeysUploading(zt.e<? super ut.m0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.y
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$y r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.y) r0
            int r1 = r0.f41285d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41285d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$y r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$y
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f41283b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41285d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f41282a
            rg.h r0 = (rg.h) r0
            ut.x.b(r5)
            goto L77
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            ut.x.b(r5)
            iu.l r5 = r4.onUpdateSetupStep
            com.server.auditor.ssh.client.utils.analytics.Avo$SSHidSetUpStep r2 = com.server.auditor.ssh.client.utils.analytics.Avo.SSHidSetUpStep.UPLOADING_PASSKEYS
            r5.invoke(r2)
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload r5 = r4.preparePayloadForPasskeysUploading()
            java.util.List r2 = r5.getDeviceBoundKeys()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L61
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$b r5 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$b
            r0 = 104(0x68, float:1.46E-43)
            r1 = 2
            r2 = 0
            r5.<init>(r0, r2, r1, r2)
            r4.setSetupError(r5)
            com.server.auditor.ssh.client.ui.sshid.data.enums.StateOfGenerationPasskeys r5 = com.server.auditor.ssh.client.ui.sshid.data.enums.StateOfGenerationPasskeys.KEY_GENERATION_RETRY_NEEDED
            r4.updateStateOfTheScreenElements(r5)
            ut.m0 r5 = ut.m0.f82633a
            goto L83
        L61:
            zu.k0 r2 = r4.remoteCryptorFlow
            java.lang.Object r2 = r2.getValue()
            rg.h r2 = (rg.h) r2
            if (r2 == 0) goto L79
            r0.f41282a = r2
            r0.f41285d = r3
            java.lang.Object r5 = r4.uploadPasskeys(r5, r2, r0)
            if (r5 != r1) goto L76
            return r1
        L76:
            r0 = r2
        L77:
            if (r0 != 0) goto L83
        L79:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.j r5 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.j
            r5.<init>()
            r4.askForActualRemoteCryptorThenRepeatAction(r5)
            ut.m0 r5 = ut.m0.f82633a
        L83:
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.runPasskeysUploading(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 runPasskeysUploading$lambda$6(SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel) {
        wu.k.d(j1.a(sshIdPasskeysGenerationViewModel), null, null, sshIdPasskeysGenerationViewModel.new z(null), 3, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runProcessOfCaRegeneration(zt.e<? super ut.m0> r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.runProcessOfCaRegeneration(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 runProcessOfCaRegeneration$lambda$34(SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel) {
        wu.k.d(j1.a(sshIdPasskeysGenerationViewModel), null, null, sshIdPasskeysGenerationViewModel.new b0(null), 3, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (runPasskeysUploading(r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runProcessOfPasskeysRegeneration(zt.e<? super ut.m0> r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.runProcessOfPasskeysRegeneration(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 runProcessOfPasskeysRegeneration$lambda$1$lambda$0(SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel) {
        wu.k.d(j1.a(sshIdPasskeysGenerationViewModel), null, null, sshIdPasskeysGenerationViewModel.new d0(null), 3, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 runProcessOfPasskeysRegeneration$lambda$2(SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel) {
        wu.k.d(j1.a(sshIdPasskeysGenerationViewModel), null, null, sshIdPasskeysGenerationViewModel.new e0(null), 3, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r1.e(r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveHardwareKeysToDatabase(java.util.List<com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel> r20, zt.e<? super ut.m0> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.f0
            if (r2 == 0) goto L17
            r2 = r1
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$f0 r2 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.f0) r2
            int r3 = r2.f41198f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f41198f = r3
            goto L1c
        L17:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$f0 r2 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$f0
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f41196d
            java.lang.Object r3 = au.b.f()
            int r4 = r2.f41198f
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L4c
            if (r4 == r6) goto L44
            if (r4 != r5) goto L3c
            java.lang.Object r4 = r2.f41195c
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r6 = r2.f41194b
            rg.h r6 = (rg.h) r6
            java.lang.Object r7 = r2.f41193a
            rg.h r7 = (rg.h) r7
            ut.x.b(r1)
            goto L6e
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L44:
            java.lang.Object r4 = r2.f41193a
            java.util.List r4 = (java.util.List) r4
            ut.x.b(r1)
            goto L5e
        L4c:
            ut.x.b(r1)
            cp.b r1 = r0.hardwareDeviceBoundKeyDaoRepository
            r4 = r20
            r2.f41193a = r4
            r2.f41198f = r6
            java.lang.Object r1 = r1.e(r2)
            if (r1 != r3) goto L5e
            goto Laf
        L5e:
            zu.k0 r1 = r0.remoteCryptorFlow
            java.lang.Object r1 = r1.getValue()
            rg.h r1 = (rg.h) r1
            if (r1 == 0) goto Lb0
            java.util.Iterator r4 = r4.iterator()
            r6 = r1
            r7 = r6
        L6e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r4.next()
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel r1 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel) r1
            java.lang.Class<com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel> r8 = com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel.class
            java.lang.Object r1 = r6.k(r1, r8)
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel r1 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel) r1
            java.lang.String r13 = r1.getPublicKey()
            long r11 = r1.getRemoteId()
            java.lang.String r14 = r1.encryptedMetadata
            java.lang.String r15 = r1.getLabel()
            java.lang.String r16 = r1.getCreatedAt()
            bp.a r8 = new bp.a
            r17 = 1
            r18 = 0
            r9 = 0
            r8.<init>(r9, r11, r13, r14, r15, r16, r17, r18)
            cp.b r1 = r0.hardwareDeviceBoundKeyDaoRepository
            r2.f41193a = r7
            r2.f41194b = r6
            r2.f41195c = r4
            r2.f41198f = r5
            java.lang.Object r1 = r1.j(r8, r2)
            if (r1 != r3) goto L6e
        Laf:
            return r3
        Lb0:
            ut.m0 r1 = ut.m0.f82633a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.saveHardwareKeysToDatabase(java.util.List, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveLocalDeviceBoundKeysToDatabase(zt.e<? super ut.m0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.g0
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$g0 r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.g0) r0
            int r1 = r0.f41204d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41204d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$g0 r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$g0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41202b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41204d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f41201a
            java.util.Iterator r2 = (java.util.Iterator) r2
            ut.x.b(r6)
            goto L3f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            ut.x.b(r6)
            java.util.List<com.server.auditor.ssh.client.ui.sshid.data.LocalPasskeyModelWithCertificate> r6 = r5.localPasskeysToUploadToBackend
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L3f:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r2.next()
            com.server.auditor.ssh.client.ui.sshid.data.LocalPasskeyModelWithCertificate r6 = (com.server.auditor.ssh.client.ui.sshid.data.LocalPasskeyModelWithCertificate) r6
            cp.c r4 = r5.localDeviceBoundKeyDaoRepository
            bp.b r6 = r6.getLocalPasskeyDbModel()
            r0.f41201a = r2
            r0.f41204d = r3
            java.lang.Object r6 = r4.j(r6, r0)
            if (r6 != r1) goto L3f
            return r1
        L5c:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.saveLocalDeviceBoundKeysToDatabase(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDeviceAsWaitingForCompleting(long j10) {
        zu.w wVar = this._fullDeviceList;
        Iterable<DeviceStatusData> iterable = (Iterable) wVar.getValue();
        ArrayList arrayList = new ArrayList(vt.v.z(iterable, 10));
        for (DeviceStatusData deviceStatusDataCopy$default : iterable) {
            if (deviceStatusDataCopy$default.getDeviceId() == j10) {
                deviceStatusDataCopy$default = DeviceStatusData.copy$default(deviceStatusDataCopy$default, null, null, DeviceStatus.WAITING_FOR_COMPLETING, 0L, 11, null);
            }
            arrayList.add(deviceStatusDataCopy$default);
        }
        wVar.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFailedGenerationFlag() {
        this.termiusStorage.M().edit().putBoolean("ssh_id_generation_error_occurred", true).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLogoutInProgressForDevice(long j10) {
        zu.w wVar = this._fullDeviceList;
        Iterable<DeviceStatusData> iterable = (Iterable) wVar.getValue();
        ArrayList arrayList = new ArrayList(vt.v.z(iterable, 10));
        for (DeviceStatusData deviceStatusDataCopy$default : iterable) {
            if (deviceStatusDataCopy$default.getDeviceId() == j10) {
                deviceStatusDataCopy$default = DeviceStatusData.copy$default(deviceStatusDataCopy$default, null, null, DeviceStatus.LOGOUT_IS_IN_PROGRESS, 0L, 11, null);
            }
            arrayList.add(deviceStatusDataCopy$default);
        }
        wVar.setValue(arrayList);
    }

    private final void setSetupError(SshIdSetupErrorDetails sshIdSetupErrorDetails) {
        this._setupErrorDetails.setValue(sshIdSetupErrorDetails);
    }

    private final void setStatusOfCurrentDevice(DeviceStatus deviceStatus) {
        DeviceStatus deviceStatus2;
        zu.w wVar = this._fullDeviceList;
        Iterable<DeviceStatusData> iterable = (Iterable) wVar.getValue();
        ArrayList arrayList = new ArrayList(vt.v.z(iterable, 10));
        for (DeviceStatusData deviceStatusDataCopy$default : iterable) {
            if (deviceStatusDataCopy$default.getDeviceId() == this.currentDeviceId) {
                deviceStatus2 = deviceStatus;
                deviceStatusDataCopy$default = DeviceStatusData.copy$default(deviceStatusDataCopy$default, null, null, deviceStatus2, 0L, 11, null);
            } else {
                deviceStatus2 = deviceStatus;
            }
            arrayList.add(deviceStatusDataCopy$default);
            deviceStatus = deviceStatus2;
        }
        wVar.setValue(arrayList);
    }

    private final void setSuccessGenerationFlag() {
        this.termiusStorage.M().edit().putBoolean("ssh_id_generation_error_occurred", false).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startForcedPasskeysRegenerationFlow() {
        wu.k.d(j1.a(this), null, null, new i0(null), 3, null);
    }

    public static /* synthetic */ void startPasskeyGenerationFlow$default(SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        sshIdPasskeysGenerationViewModel.startPasskeyGenerationFlow(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateDeviceListAfterActualInfoAboutSshIdReceived(zt.e<? super ut.m0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.k0
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$k0 r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.k0) r0
            int r1 = r0.f41229c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41229c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$k0 r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$k0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f41227a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41229c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            r0.f41229c = r3
            java.lang.Object r5 = r4.collectActualInfoAboutUsersDevices(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r4.checkStateOfDevices()
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.updateDeviceListAfterActualInfoAboutSshIdReceived(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateFlagToAskAboutUseBiometric(zt.e<? super ut.m0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.l0
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$l0 r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.l0) r0
            int r1 = r0.f41236d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41236d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$l0 r0 = new com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel$l0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41234b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41236d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f41233a
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r0 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel) r0
            ut.x.b(r6)
            goto L6b
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            java.lang.Object r2 = r0.f41233a
            com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel r2 = (com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel) r2
            ut.x.b(r6)
            goto L55
        L40:
            ut.x.b(r6)
            boolean r6 = r5.isSetupCompleted
            if (r6 != 0) goto L76
            cp.e r6 = r5.sshIdDaoRepository
            r0.f41233a = r5
            r0.f41236d = r4
            java.lang.Object r6 = r6.s(r0)
            if (r6 != r1) goto L54
            goto L69
        L54:
            r2 = r5
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L77
            cp.f r6 = r5.sshIdDevicesDaoRepository
            r0.f41233a = r2
            r0.f41236d = r3
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            r0 = r2
        L6b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L74
            goto L79
        L74:
            r2 = r0
            goto L77
        L76:
            r2 = r5
        L77:
            r4 = 0
            r0 = r2
        L79:
            r0.needToAskAboutBiometricKeys = r4
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.updateFlagToAskAboutUseBiometric(zt.e):java.lang.Object");
    }

    private final void updateFullDeviceList(List<DeviceStatusData> list) {
        this._fullDeviceList.setValue(list);
    }

    private final void updateListItemsAccordingToScreenUIState(StateOfGenerationPasskeys stateOfGenerationPasskeys) {
        wu.k.d(j1.a(this), null, null, new m0(stateOfGenerationPasskeys, this, null), 3, null);
    }

    private final void updateScreenUiState(StateOfGenerationPasskeys stateOfGenerationPasskeys, Boolean bool) {
        wu.k.d(j1.a(this), null, null, new n0(stateOfGenerationPasskeys, bool, null), 3, null);
    }

    static /* synthetic */ void updateScreenUiState$default(SshIdPasskeysGenerationViewModel sshIdPasskeysGenerationViewModel, StateOfGenerationPasskeys stateOfGenerationPasskeys, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            stateOfGenerationPasskeys = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        sshIdPasskeysGenerationViewModel.updateScreenUiState(stateOfGenerationPasskeys, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateOfDeviceItems(DeviceStatus deviceStatus, DeviceStatus deviceStatus2) {
        DeviceStatus deviceStatus3;
        zu.w wVar = this._fullDeviceList;
        Iterable<DeviceStatusData> iterable = (Iterable) wVar.getValue();
        ArrayList arrayList = new ArrayList(vt.v.z(iterable, 10));
        for (DeviceStatusData deviceStatusDataCopy$default : iterable) {
            if (deviceStatusDataCopy$default.getStatus() == deviceStatus) {
                deviceStatus3 = deviceStatus2;
                deviceStatusDataCopy$default = DeviceStatusData.copy$default(deviceStatusDataCopy$default, null, null, deviceStatus3, 0L, 11, null);
            } else {
                deviceStatus3 = deviceStatus2;
            }
            arrayList.add(deviceStatusDataCopy$default);
            deviceStatus2 = deviceStatus3;
        }
        wVar.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateOfTheScreenElements(StateOfGenerationPasskeys stateOfGenerationPasskeys) {
        updateScreenUiState(stateOfGenerationPasskeys, Boolean.valueOf(((List) this._fullDeviceList.getValue()).size() == 1));
        updateListItemsAccordingToScreenUIState(stateOfGenerationPasskeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (saveHardwareKeysToDatabase(r9, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadPasskeys(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload r9, rg.h r10, zt.e<? super ut.m0> r11) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdPasskeysGenerationViewModel.uploadPasskeys(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload, rg.h, zt.e):java.lang.Object");
    }

    public final void checkTheStateOfSshIdBeforeFinishLater(iu.a aVar) {
        ju.t.f(aVar, "actionAfterCheck");
        wu.k.d(j1.a(this), null, null, new c(aVar, null), 3, null);
    }

    public final void doRetryAction() {
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    public final void fetchSshIdDataFromBackend() {
        wu.k.d(j1.a(this), null, null, new i(null), 3, null);
    }

    public final zu.k0 getCaPrivateKeyFlow() {
        return this.caPrivateKeyFlow;
    }

    public final zu.k0 getFullDeviceList() {
        return this.fullDeviceList;
    }

    public final zu.k0 getRemoteCryptorFlow() {
        return this.remoteCryptorFlow;
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final zu.k0 getScreenUiState() {
        return this.screenUiState;
    }

    public final zu.k0 getSetupErrorDetails() {
        return this.setupErrorDetails;
    }

    public final boolean isHardwareKeyStorageAvailable() {
        return this.isHardwareKeyStorageAvailable;
    }

    public final void onHandleContinueButtonClicked() {
        wu.k.d(j1.a(this), null, null, new m(null), 3, null);
    }

    public final void onHandleDeviceLogoutButtonClicked(long j10, UserDeviceType userDeviceType) {
        ju.t.f(userDeviceType, "deviceType");
        wu.k.d(j1.a(this), null, null, new n(j10, userDeviceType, null), 3, null);
    }

    public final void onHandleFinishLaterButtonClicked() {
        wu.k.d(j1.a(this), null, null, new o(null), 3, null);
    }

    public final void onHandleFinishSetupButtonClicked() {
        wu.k.d(j1.a(this), null, null, new p(null), 3, null);
    }

    public final void onHandleRetryButtonClicked() {
        wu.k.d(j1.a(this), null, null, new q(null), 3, null);
    }

    public final void onSendRetrySshIdCreationButtonPressedEvent() {
        wu.k.d(j1.a(this), null, null, new s(null), 3, null);
    }

    public final void runLogoutProcessForDevice(long j10) {
        wu.k.d(j1.a(this), null, null, new x(j10, null), 3, null);
    }

    public final void setBiometricTypeForThisDevice(String str) {
        wu.k.d(j1.a(this), null, null, new h0(str, null), 3, null);
    }

    public final void setHardwareKeyStorageAvailable(boolean z10) {
        this.isHardwareKeyStorageAvailable = z10;
    }

    public final void startPasskeyGenerationFlow(boolean z10) {
        wu.k.d(j1.a(this), null, null, new j0(z10, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SshIdPasskeysGenerationViewModel(zu.k0 k0Var, zu.k0 k0Var2, String str, iu.l lVar, iu.l lVar2, iu.l lVar3, iu.l lVar4, gp.d dVar) {
        ju.t.f(k0Var, "remoteCryptorFlow");
        ju.t.f(k0Var2, "caPrivateKeyFlow");
        ju.t.f(str, "analyticsWizardId");
        ju.t.f(lVar, "onUpdateCaPrivateKey");
        ju.t.f(lVar2, "onRequestRemoteCryptor");
        ju.t.f(lVar3, "onUpdateIsCompleteSetup");
        ju.t.f(lVar4, "onUpdateSetupStep");
        ju.t.f(dVar, "clearSshIdDataUseCase");
        this.remoteCryptorFlow = k0Var;
        this.caPrivateKeyFlow = k0Var2;
        this.analyticsWizardId = str;
        this.onUpdateCaPrivateKey = lVar;
        this.onRequestRemoteCryptor = lVar2;
        this.onUpdateIsCompleteSetup = lVar3;
        this.onUpdateSetupStep = lVar4;
        this.clearSshIdDataUseCase = dVar;
        this.termiusStorage = com.server.auditor.ssh.client.app.a.N();
        this.deviceListSorter = new gp.l();
        this.analyticsInteractor = new gp.x(str);
        cp.e eVarB = e.a.b(cp.e.f46961d, null, 1, null);
        this.sshIdDaoRepository = eVarB;
        cp.f fVarB = f.a.b(cp.f.f47012b, null, 1, null);
        this.sshIdDevicesDaoRepository = fVarB;
        this.localDeviceBoundKeyDaoRepository = c.a.b(cp.c.f46918d, null, 1, null);
        cp.d dVarB = d.a.b(cp.d.f46939d, null, 1, null);
        this.remoteDeviceBoundKeyDaoRepository = dVarB;
        cp.b bVarB = b.a.b(cp.b.f46898d, null, 1, null);
        this.hardwareDeviceBoundKeyDaoRepository = bVarB;
        this.sshIdDatabaseInteractor = new zo.b(eVarB, fVarB, dVarB, bVarB, null, 16, null);
        this.retryStartStep = StartStepForRetryAction.b.f41158a;
        this.localPasskeysToUploadToBackend = new ArrayList();
        this.hardwarePasskeysToUploadToBackend = new ArrayList();
        this.currentDeviceId = -1L;
        this.isHardwareKeyStorageAvailable = com.server.auditor.ssh.client.app.a.N().M().getBoolean("is_hardware_key_storage_available", false);
        this.softwarePasskeyGenerateUseCase = new gp.w(null, null, 3, null);
        this.biometricPasskeyGenerateUseCase = new gp.a(null, 1, null);
        this.sshIdCAGenerationUseCase = new gp.y();
        b2 b2Var = b2.f52944a;
        this.requestSshIdDataFromBackendUseCase = new RequestSshIdDataFromBackendUseCase(new SshIdGetInfoApiRepository(b2Var.O1(), b2Var.B1()));
        this.requestToUpdateSshIdCaUseCase = new RequestToUpdateSshIdCaUseCase(new SshIdUpdatePropertiesApiRepository(b2Var.O1(), b2Var.B1(), lVar4));
        this.requestSshIdUploadPasskeysUseCase = new RequestSshIdUploadPasskeysUseCase(new SshIdUploadPasskeysApiRepository(b2Var.O1(), b2Var.B1()));
        this.logoutSpecificDeviceUseCase = new LogoutSpecificDeviceUseCase(new nl.a(b2Var.O1()));
        this.shouldRegeneratePasskeysUseCase = new gp.v(null, null, 3, null);
        yu.d dVarB2 = yu.g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB2;
        zu.w wVarA = zu.m0.a(new ScreenUiState(null, false, 3, 0 == true ? 1 : 0));
        this._screenUiState = wVarA;
        zu.w wVarA2 = zu.m0.a(vt.v.o());
        this._fullDeviceList = wVarA2;
        zu.w wVarA3 = zu.m0.a(null);
        this._setupErrorDetails = wVarA3;
        this.screenActionFlow = zu.h.M(dVarB2);
        this.screenUiState = zu.h.b(wVarA);
        this.fullDeviceList = zu.h.b(wVarA2);
        this.setupErrorDetails = zu.h.b(wVarA3);
    }
}
