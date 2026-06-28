package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import android.app.Application;
import androidx.annotation.Keep;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository;
import com.server.auditor.ssh.client.ui.sshid.domain.SshIdUpdateApiInteractor;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import cp.b;
import cp.c;
import cp.d;
import cp.e;
import cp.f;
import gp.x;
import hg.b2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ju.t;
import tp.c0;
import u9.a;
import ut.m0;
import vt.v;
import wu.i0;
import zu.a0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class DetailsScreenViewModel extends AndroidViewModel {
    private static final long DELAY_TO_SHOW_ERROR_MESSAGE = 2000;
    private static final long DELAY_TO_SHOW_READY_SCREEN = 1000;
    private final w _defaultPasskeyType;
    private final w _devicesCountWithSshId;
    private final w _devicesKeysData;
    private final w _isBottomSheetVisible;
    private final w _isSkPasskeysEnabled;
    private final w _keyTypeForSharedLink;
    private final w _passkeyTypes;
    private final w _selectedPasskeyType;
    private final w _setAsDefaultSectionUiState;
    private final w _username;
    private final x analyticsInteractor;
    private String analyticsWizardId;
    private final gp.f copyPublicKeysToClipboardUseCase;
    private final a0 defaultPasskeyType;
    private final a0 devicesCountWithSshId;
    private final k0 devicesKeysData;
    private final cp.b hardwarePasskeysRepository;
    private final k0 isBottomSheetVisible;
    private final k0 isSkPasskeysEnabled;
    private final k0 keyTypeForSharedLink;
    private final cp.c localPasskeysRepository;
    private final k0 passkeyTypes;
    private final cp.d remotePasskeysRepository;
    private final a0 selectedPasskeyType;
    private final k0 setAsDefaultSectionUiState;
    private final cp.e sshIdDaoRepository;
    private final zo.b sshIdDatabaseInteractor;
    private final cp.f sshIdDevicesDaoRepository;
    private final SshIdUpdateApiInteractor sshIdUpdateApiInteractor;
    private final k0 username;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    @Keep
    public static final class SetAsDefaultSectionState {
        public static final int $stable = 0;
        private final boolean isChecked;
        private final boolean isErrorHappened;
        private final boolean isInProgress;
        private final boolean isSuccessfullyChanged;
        private final boolean isVisible;

        public SetAsDefaultSectionState() {
            this(false, false, false, false, false, 31, null);
        }

        public static /* synthetic */ SetAsDefaultSectionState copy$default(SetAsDefaultSectionState setAsDefaultSectionState, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = setAsDefaultSectionState.isVisible;
            }
            if ((i10 & 2) != 0) {
                z11 = setAsDefaultSectionState.isChecked;
            }
            if ((i10 & 4) != 0) {
                z12 = setAsDefaultSectionState.isInProgress;
            }
            if ((i10 & 8) != 0) {
                z13 = setAsDefaultSectionState.isSuccessfullyChanged;
            }
            if ((i10 & 16) != 0) {
                z14 = setAsDefaultSectionState.isErrorHappened;
            }
            boolean z15 = z14;
            boolean z16 = z12;
            return setAsDefaultSectionState.copy(z10, z11, z16, z13, z15);
        }

        public final boolean component1() {
            return this.isVisible;
        }

        public final boolean component2() {
            return this.isChecked;
        }

        public final boolean component3() {
            return this.isInProgress;
        }

        public final boolean component4() {
            return this.isSuccessfullyChanged;
        }

        public final boolean component5() {
            return this.isErrorHappened;
        }

        public final SetAsDefaultSectionState copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            return new SetAsDefaultSectionState(z10, z11, z12, z13, z14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetAsDefaultSectionState)) {
                return false;
            }
            SetAsDefaultSectionState setAsDefaultSectionState = (SetAsDefaultSectionState) obj;
            return this.isVisible == setAsDefaultSectionState.isVisible && this.isChecked == setAsDefaultSectionState.isChecked && this.isInProgress == setAsDefaultSectionState.isInProgress && this.isSuccessfullyChanged == setAsDefaultSectionState.isSuccessfullyChanged && this.isErrorHappened == setAsDefaultSectionState.isErrorHappened;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isVisible) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.isInProgress)) * 31) + Boolean.hashCode(this.isSuccessfullyChanged)) * 31) + Boolean.hashCode(this.isErrorHappened);
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final boolean isErrorHappened() {
            return this.isErrorHappened;
        }

        public final boolean isInProgress() {
            return this.isInProgress;
        }

        public final boolean isSuccessfullyChanged() {
            return this.isSuccessfullyChanged;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }

        public String toString() {
            return "SetAsDefaultSectionState(isVisible=" + this.isVisible + ", isChecked=" + this.isChecked + ", isInProgress=" + this.isInProgress + ", isSuccessfullyChanged=" + this.isSuccessfullyChanged + ", isErrorHappened=" + this.isErrorHappened + ")";
        }

        public SetAsDefaultSectionState(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            this.isVisible = z10;
            this.isChecked = z11;
            this.isInProgress = z12;
            this.isSuccessfullyChanged = z13;
            this.isErrorHappened = z14;
        }

        public /* synthetic */ SetAsDefaultSectionState(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14);
        }
    }

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f41125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41126d;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DetailsScreenViewModel.this.new a(eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00df A[PHI: r9
          0x00df: PHI (r9v16 java.lang.Object) = (r9v11 java.lang.Object), (r9v0 java.lang.Object) binds: [B:24:0x00dc, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f7 A[PHI: r1 r9
          0x00f7: PHI (r1v13 long) = (r1v12 long), (r1v14 long) binds: [B:27:0x00f4, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]
          0x00f7: PHI (r9v21 java.lang.Object) = (r9v20 java.lang.Object), (r9v0 java.lang.Object) binds: [B:27:0x00f4, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.DetailsScreenViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41128a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DetailsScreenViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41128a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DetailsScreenViewModel.this.sendCopyPasskeysInteractedEvent();
            Iterable iterable = (Iterable) DetailsScreenViewModel.this._devicesKeysData.getValue();
            DetailsScreenViewModel detailsScreenViewModel = DetailsScreenViewModel.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (t.b(((DeviceKeyData) obj2).getKeyType(), detailsScreenViewModel._selectedPasskeyType.getValue())) {
                    arrayList.add(obj2);
                }
            }
            DetailsScreenViewModel.this.copyPublicKeysToClipboardUseCase.a(arrayList);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41131b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f41133d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f41133d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DetailsScreenViewModel.this.new d(this.f41133d, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
        
            if (wu.s0.b(com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.DetailsScreenViewModel.DELAY_TO_SHOW_READY_SCREEN, r19) != r6) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0116, code lost:
        
            if (wu.s0.b(com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.DetailsScreenViewModel.DELAY_TO_SHOW_ERROR_MESSAGE, r19) == r6) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.DetailsScreenViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class e implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f41134a;

        public e(long j10) {
            this.f41134a = j10;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Boolean.valueOf(((DeviceKeyData) obj).getDeviceId() != this.f41134a), Boolean.valueOf(((DeviceKeyData) obj2).getDeviceId() != this.f41134a));
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41135a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DetailsScreenViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41135a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DetailsScreenViewModel.this.analyticsInteractor.g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41137a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DetailsScreenViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41137a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DetailsScreenViewModel.this.analyticsInteractor.e((String) DetailsScreenViewModel.this._selectedPasskeyType.getValue(), Avo.SSHidPasskeyActionType.COPY_PASSKEYS, (String) DetailsScreenViewModel.this.getUsername().getValue());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41139a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DetailsScreenViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f41139a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DetailsScreenViewModel.this.analyticsInteractor.f((String) DetailsScreenViewModel.this._defaultPasskeyType.getValue(), (String) DetailsScreenViewModel.this._selectedPasskeyType.getValue());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsScreenViewModel(Application application) {
        super(application);
        t.f(application, "application");
        cp.e eVarB = e.a.b(cp.e.f46961d, null, 1, null);
        this.sshIdDaoRepository = eVarB;
        cp.f fVarB = f.a.b(cp.f.f47012b, null, 1, null);
        this.sshIdDevicesDaoRepository = fVarB;
        cp.d dVarB = d.a.b(cp.d.f46939d, null, 1, null);
        this.remotePasskeysRepository = dVarB;
        this.localPasskeysRepository = c.a.b(cp.c.f46918d, null, 1, null);
        cp.b bVarB = b.a.b(cp.b.f46898d, null, 1, null);
        this.hardwarePasskeysRepository = bVarB;
        this.sshIdDatabaseInteractor = new zo.b(eVarB, fVarB, dVarB, bVarB, null, 16, null);
        b2 b2Var = b2.f52944a;
        this.sshIdUpdateApiInteractor = new SshIdUpdateApiInteractor(new SshIdUpdatePropertiesApiRepository(b2Var.O1(), b2Var.B1(), new iu.l() { // from class: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.a
            @Override // iu.l
            public final Object invoke(Object obj) {
                return DetailsScreenViewModel.sshIdUpdateApiInteractor$lambda$0((Avo.SSHidSetUpStep) obj);
            }
        }));
        String string = UUID.randomUUID().toString();
        t.e(string, "toString(...)");
        this.analyticsWizardId = string;
        this.analyticsInteractor = new x(this.analyticsWizardId);
        Boolean bool = Boolean.FALSE;
        w wVarA = zu.m0.a(bool);
        this._isSkPasskeysEnabled = wVarA;
        this.isSkPasskeysEnabled = wVarA;
        w wVarA2 = zu.m0.a(v.o());
        this._devicesKeysData = wVarA2;
        this.devicesKeysData = wVarA2;
        w wVarA3 = zu.m0.a(c0.e());
        this._username = wVarA3;
        this.username = wVarA3;
        w wVarA4 = zu.m0.a(c0.e());
        this._defaultPasskeyType = wVarA4;
        this.defaultPasskeyType = wVarA4;
        w wVarA5 = zu.m0.a(c0.e());
        this._selectedPasskeyType = wVarA5;
        this.selectedPasskeyType = wVarA5;
        w wVarA6 = zu.m0.a(v.o());
        this._passkeyTypes = wVarA6;
        this.passkeyTypes = wVarA6;
        w wVarA7 = zu.m0.a(0);
        this._devicesCountWithSshId = wVarA7;
        this.devicesCountWithSshId = wVarA7;
        w wVarA8 = zu.m0.a(bool);
        this._isBottomSheetVisible = wVarA8;
        this.isBottomSheetVisible = wVarA8;
        w wVarA9 = zu.m0.a(null);
        this._keyTypeForSharedLink = wVarA9;
        this.keyTypeForSharedLink = wVarA9;
        w wVarA10 = zu.m0.a(new SetAsDefaultSectionState(false, false, false, false, false, 31, null));
        this._setAsDefaultSectionUiState = wVarA10;
        this.setAsDefaultSectionUiState = wVarA10;
        this.copyPublicKeysToClipboardUseCase = new gp.f(new wn.a(new com.server.auditor.ssh.client.help.c(application)));
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DeviceKeyData> prepareDeviceKeyData(List<bp.e> list, List<bp.c> list2, List<bp.a> list3, long j10) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (bp.c cVar : list2) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (cVar.e() == ((bp.e) next).a()) {
                    break;
                }
            }
            bp.e eVar = (bp.e) next;
            DeviceKeyData deviceKeyData = eVar != null ? new DeviceKeyData(eVar.b(), eVar.a(), eVar.e(), cVar.g(), cVar.d(), cVar.h()) : null;
            if (deviceKeyData != null) {
                arrayList.add(deviceKeyData);
            }
        }
        for (bp.a aVar : list3) {
            arrayList.add(new DeviceKeyData(UserDeviceType.FIDO, aVar.e(), aVar.f(), aVar.g(), aVar.c(), a.g.f81658b.a()));
        }
        return v.R0(arrayList, new e(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetSetAsDefaultSectionUiToDefault() {
        Boolean bool = Boolean.FALSE;
        updateSetAsDefaultSectionState(bool, bool, bool, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCopyPasskeysInteractedEvent() {
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPasskeyViewedEvent() {
        wu.k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 sshIdUpdateApiInteractor$lambda$0(Avo.SSHidSetUpStep sSHidSetUpStep) {
        t.f(sSHidSetUpStep, "it");
        return m0.f82633a;
    }

    private final void updateSetAsDefaultSectionState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        Object value;
        SetAsDefaultSectionState setAsDefaultSectionState;
        w wVar = this._setAsDefaultSectionUiState;
        do {
            value = wVar.getValue();
            setAsDefaultSectionState = (SetAsDefaultSectionState) value;
        } while (!wVar.g(value, setAsDefaultSectionState.copy(bool != null ? bool.booleanValue() : setAsDefaultSectionState.isVisible(), bool2 != null ? bool2.booleanValue() : setAsDefaultSectionState.isChecked(), bool3 != null ? bool3.booleanValue() : setAsDefaultSectionState.isInProgress(), bool4 != null ? bool4.booleanValue() : setAsDefaultSectionState.isSuccessfullyChanged(), bool5 != null ? bool5.booleanValue() : setAsDefaultSectionState.isErrorHappened())));
    }

    static /* synthetic */ void updateSetAsDefaultSectionState$default(DetailsScreenViewModel detailsScreenViewModel, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        if ((i10 & 2) != 0) {
            bool2 = null;
        }
        if ((i10 & 4) != 0) {
            bool3 = null;
        }
        if ((i10 & 8) != 0) {
            bool4 = null;
        }
        if ((i10 & 16) != 0) {
            bool5 = null;
        }
        detailsScreenViewModel.updateSetAsDefaultSectionState(bool, bool2, bool3, bool4, bool5);
    }

    public final void copyKeysToClipBoard() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final a0 getDefaultPasskeyType() {
        return this.defaultPasskeyType;
    }

    public final a0 getDevicesCountWithSshId() {
        return this.devicesCountWithSshId;
    }

    public final k0 getDevicesKeysData() {
        return this.devicesKeysData;
    }

    public final k0 getKeyTypeForSharedLink() {
        return this.keyTypeForSharedLink;
    }

    public final k0 getPasskeyTypes() {
        return this.passkeyTypes;
    }

    public final a0 getSelectedPasskeyType() {
        return this.selectedPasskeyType;
    }

    public final k0 getSetAsDefaultSectionUiState() {
        return this.setAsDefaultSectionUiState;
    }

    public final k0 getUsername() {
        return this.username;
    }

    public final k0 isBottomSheetVisible() {
        return this.isBottomSheetVisible;
    }

    public final k0 isSkPasskeysEnabled() {
        return this.isSkPasskeysEnabled;
    }

    public final void onSetAsDefaultRequested(String str) {
        t.f(str, "passkeyTypeToSet");
        wu.k.d(j1.a(this), null, null, new d(str, null), 3, null);
    }

    public final void sendClickPublicProfileAnalyticsEvent() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final void setPasskeyBottomSheetVisibility(boolean z10) {
        this._isBottomSheetVisible.setValue(Boolean.valueOf(z10));
    }

    public final void setSelectedPasskeyType(String str) {
        t.f(str, "selectedKeyType");
        this._selectedPasskeyType.setValue(str);
        w wVar = this._keyTypeForSharedLink;
        if (t.b(str, this._defaultPasskeyType.getValue())) {
            str = null;
        }
        wVar.setValue(str);
        sendPasskeyViewedEvent();
        boolean z10 = false;
        if (!t.b(this._selectedPasskeyType.getValue(), a.g.f81658b.a()) ? !t.b(this._selectedPasskeyType.getValue(), this._defaultPasskeyType.getValue()) : !(t.b(this._selectedPasskeyType.getValue(), this._defaultPasskeyType.getValue()) || !((Boolean) this._isSkPasskeysEnabled.getValue()).booleanValue())) {
            z10 = true;
        }
        updateSetAsDefaultSectionState$default(this, Boolean.valueOf(z10), null, null, null, null, 30, null);
    }

    @Keep
    public static final class DeviceKeyData {
        public static final int $stable = 0;
        private final String createdAt;
        private final long deviceId;
        private final String deviceName;
        private final UserDeviceType deviceType;
        private final String keyBody;
        private final String keyType;

        public DeviceKeyData(UserDeviceType userDeviceType, long j10, String str, String str2, String str3, String str4) {
            t.f(userDeviceType, "deviceType");
            t.f(str, "deviceName");
            t.f(str2, "keyBody");
            t.f(str3, "createdAt");
            t.f(str4, "keyType");
            this.deviceType = userDeviceType;
            this.deviceId = j10;
            this.deviceName = str;
            this.keyBody = str2;
            this.createdAt = str3;
            this.keyType = str4;
        }

        public static /* synthetic */ DeviceKeyData copy$default(DeviceKeyData deviceKeyData, UserDeviceType userDeviceType, long j10, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                userDeviceType = deviceKeyData.deviceType;
            }
            if ((i10 & 2) != 0) {
                j10 = deviceKeyData.deviceId;
            }
            if ((i10 & 4) != 0) {
                str = deviceKeyData.deviceName;
            }
            if ((i10 & 8) != 0) {
                str2 = deviceKeyData.keyBody;
            }
            if ((i10 & 16) != 0) {
                str3 = deviceKeyData.createdAt;
            }
            if ((i10 & 32) != 0) {
                str4 = deviceKeyData.keyType;
            }
            return deviceKeyData.copy(userDeviceType, j10, str, str2, str3, str4);
        }

        public final UserDeviceType component1() {
            return this.deviceType;
        }

        public final long component2() {
            return this.deviceId;
        }

        public final String component3() {
            return this.deviceName;
        }

        public final String component4() {
            return this.keyBody;
        }

        public final String component5() {
            return this.createdAt;
        }

        public final String component6() {
            return this.keyType;
        }

        public final DeviceKeyData copy(UserDeviceType userDeviceType, long j10, String str, String str2, String str3, String str4) {
            t.f(userDeviceType, "deviceType");
            t.f(str, "deviceName");
            t.f(str2, "keyBody");
            t.f(str3, "createdAt");
            t.f(str4, "keyType");
            return new DeviceKeyData(userDeviceType, j10, str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceKeyData)) {
                return false;
            }
            DeviceKeyData deviceKeyData = (DeviceKeyData) obj;
            return this.deviceType == deviceKeyData.deviceType && this.deviceId == deviceKeyData.deviceId && t.b(this.deviceName, deviceKeyData.deviceName) && t.b(this.keyBody, deviceKeyData.keyBody) && t.b(this.createdAt, deviceKeyData.createdAt) && t.b(this.keyType, deviceKeyData.keyType);
        }

        public final String getCreatedAt() {
            return this.createdAt;
        }

        public final long getDeviceId() {
            return this.deviceId;
        }

        public final String getDeviceName() {
            return this.deviceName;
        }

        public final UserDeviceType getDeviceType() {
            return this.deviceType;
        }

        public final String getKeyBody() {
            return this.keyBody;
        }

        public final String getKeyType() {
            return this.keyType;
        }

        public int hashCode() {
            return (((((((((this.deviceType.hashCode() * 31) + Long.hashCode(this.deviceId)) * 31) + this.deviceName.hashCode()) * 31) + this.keyBody.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.keyType.hashCode();
        }

        public String toString() {
            return "DeviceKeyData(deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceName=" + this.deviceName + ", keyBody=" + this.keyBody + ", createdAt=" + this.createdAt + ", keyType=" + this.keyType + ")";
        }

        public /* synthetic */ DeviceKeyData(UserDeviceType userDeviceType, long j10, String str, String str2, String str3, String str4, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? UserDeviceType.UNKNOWN : userDeviceType, j10, (i10 & 4) != 0 ? c0.e() : str, str2, str3, str4);
        }
    }
}
