package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.j1;
import bk.a;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.MultiKeyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;
import com.server.auditor.ssh.client.navigation.ui.compose.c;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute;
import com.server.auditor.ssh.client.synchronization.api.adapters.MultiKeyApiAdapter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import e3.g3;
import gj.a;
import hg.b2;
import j3.t0;
import java.util.ArrayList;
import java.util.List;
import ok.a7;
import op.a;
import rh.z;
import tl.l2;
import zu.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class KeychainScreenViewModel extends FragmentWrapperViewModel<g, f> {
    private static KeychainScreenViewModel composeViewModel;
    private static KeychainScreenViewModel identityPickerViewModel;
    private final zu.w _actionMode;
    private final zu.w _discardChangesDialog;
    private final zu.w _editingState;
    private final zu.v _filteredItems;
    private final zu.w _isFabSend;
    private final zu.w _isImportingDialogShown;
    private final zu.w _isSearchMode;
    private final zu.w _keychainSortingMode;
    private final zu.w _searchQueryFieldValue;
    private final zu.w _selectIdentitySortingMode;
    private final zu.w _showAddEntityActions;
    private final zu.w _showAddSshCertificateActions;
    private final zu.w _showAddSshKeyActions;
    private final zu.w _showContextActions;
    private final zu.w _showSortTypeSelector;
    private final zu.w _vaultsSelectorStateFlow;
    private final zu.k0 discardChangesDialog;
    private final zu.k0 editingState;
    private final zu.k0 emptyScreenStateFlow;
    private final gj.a filterEntityHelper;
    private final List<z.a> filteredContainers;
    private final il.o getKeychainScreenItemsUseCase;
    private final kp.c getTeamAccessStatusUseCase;
    private final com.server.auditor.ssh.client.interactors.r googleServicesAvailabilityInteractor;
    private final ut.n importCertificateUseCase$delegate;
    private final ut.n importSshKeyUseCase$delegate;
    private final zu.k0 isBiometricAvailable;
    private final zu.k0 isFabVisible;
    private final zu.k0 isGoogleServicesAvailable;
    private boolean isIdentityPicker;
    private final zu.k0 isImportingDialogShown;
    private boolean isNavigationTypeRail;
    private boolean isSearchActive;
    private final hg.d keyValueRepository;
    private final tp.g0 liveSharedPreferences;
    private final SparseBooleanArray selectedItems;
    private VaultKeyId targetVaultKeyId;
    private SshKeyDBModel tempSshKeyDBModelForExport;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private String vaultWizardId;
    private final zu.f vaultsFlow;
    private final ut.n vaultsInteractor$delegate;
    private final ut.n vaultsRepository$delegate;
    public static final e Companion = new e(null);
    public static final int $stable = 8;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34158a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel$a$a, reason: collision with other inner class name */
        static final class C0538a extends kotlin.coroutines.jvm.internal.m implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f34161b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34162c;

            C0538a(zt.e eVar) {
                super(3, eVar);
            }

            public final Object i(boolean z10, t0 t0Var, zt.e eVar) {
                C0538a c0538a = new C0538a(eVar);
                c0538a.f34161b = z10;
                c0538a.f34162c = t0Var;
                return c0538a.invokeSuspend(ut.m0.f82633a);
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i(((Boolean) obj).booleanValue(), (t0) obj2, (zt.e) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34160a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return new f.m(this.f34161b, ((t0) this.f34162c).m());
            }
        }

        static final class b implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ KeychainScreenViewModel f34163a;

            b(KeychainScreenViewModel keychainScreenViewModel) {
                this.f34163a = keychainScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(f.m mVar, zt.e eVar) {
                this.f34163a.sendComposeAction(mVar);
                return ut.m0.f82633a;
            }
        }

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34158a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(zu.h.h(KeychainScreenViewModel.this._isSearchMode, KeychainScreenViewModel.this._searchQueryFieldValue, new C0538a(null)), 1);
                b bVar = new b(KeychainScreenViewModel.this);
                this.f34158a = 1;
                if (fVarR.collect(bVar, this) == objF) {
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
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class a0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f34164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeychainScreenViewModel f34165b;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f34166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KeychainScreenViewModel f34167b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel$a0$a$a, reason: collision with other inner class name */
            public static final class C0539a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34168a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f34169b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f34170c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f34172e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f34173f;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f34174u;

                public C0539a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34168a = obj;
                    this.f34169b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar, KeychainScreenViewModel keychainScreenViewModel) {
                this.f34166a = gVar;
                this.f34167b = keychainScreenViewModel;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
            
                if (r13.emit(r14, r0) != r1) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, zt.e r14) {
                /*
                    Method dump skipped, instruction units count: 202
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.a0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public a0(zu.f fVar, KeychainScreenViewModel keychainScreenViewModel) {
            this.f34164a = fVar;
            this.f34165b = keychainScreenViewModel;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f34164a.collect(new a(gVar, this.f34165b), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34175a;

        static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ KeychainScreenViewModel f34177a;

            a(KeychainScreenViewModel keychainScreenViewModel) {
                this.f34177a = keychainScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
                if (cVar instanceof c.b) {
                    this.f34177a.sendComposeAction(f.a.f34194a);
                }
                return ut.m0.f82633a;
            }
        }

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34175a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(KeychainScreenViewModel.this.getActionMode(), 1);
                a aVar = new a(KeychainScreenViewModel.this);
                this.f34175a = 1;
                if (fVarR.collect(aVar, this) == objF) {
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
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34178a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.navigation.ui.compose.c f34180c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
            super(2, eVar);
            this.f34180c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new b0(this.f34180c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34178a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._actionMode.setValue(this.f34180c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34181a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = KeychainScreenViewModel.this._keychainSortingMode;
            hg.d dVar = KeychainScreenViewModel.this.keyValueRepository;
            TermiusSortType termiusSortType = com.server.auditor.ssh.client.fragments.hostngroups.j.f25092a;
            String string = dVar.getString("termius_keychain_sort_type", termiusSortType.name());
            if (string == null) {
                string = termiusSortType.name();
            }
            wVar.setValue(TermiusSortType.valueOf(string));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34183a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34185c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new c0(this.f34185c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34183a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._showAddEntityActions.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34185c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34186a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34186a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = KeychainScreenViewModel.this._selectIdentitySortingMode;
            hg.d dVar = KeychainScreenViewModel.this.keyValueRepository;
            TermiusSortType termiusSortType = com.server.auditor.ssh.client.fragments.hostngroups.j.f25092a;
            String string = dVar.getString("termius_identity_picker_sort_type", termiusSortType.name());
            if (string == null) {
                string = termiusSortType.name();
            }
            wVar.setValue(TermiusSortType.valueOf(string));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34188a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34190c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new d0(this.f34190c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34188a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._showAddSshCertificateActions.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34190c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class e {
        public /* synthetic */ e(ju.k kVar) {
            this();
        }

        public final KeychainScreenViewModel a() {
            return KeychainScreenViewModel.composeViewModel;
        }

        public final KeychainScreenViewModel b() {
            return KeychainScreenViewModel.identityPickerViewModel;
        }

        public final void c(KeychainScreenViewModel keychainScreenViewModel) {
            KeychainScreenViewModel.composeViewModel = keychainScreenViewModel;
        }

        public final void d(KeychainScreenViewModel keychainScreenViewModel) {
            KeychainScreenViewModel.identityPickerViewModel = keychainScreenViewModel;
        }

        private e() {
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34191a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34193c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34193c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new e0(this.f34193c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34191a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._showAddSshKeyActions.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34193c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public interface f {

        public static final class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34194a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -488249981;
            }

            public String toString() {
                return "FinishActionMode";
            }
        }

        public static final class b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f34195a;

            public b(int i10) {
                this.f34195a = i10;
            }

            public final int a() {
                return this.f34195a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f34195a == ((b) obj).f34195a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f34195a);
            }

            public String toString() {
                return "OnActionItemClick(itemId=" + this.f34195a + ")";
            }
        }

        public static final class c implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34196a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1362281030;
            }

            public String toString() {
                return "OnGenerateSshKeyClick";
            }
        }

        public static final class d implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f34197a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 761092958;
            }

            public String toString() {
                return "OnImportSshCertificateClick";
            }
        }

        public static final class e implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f34198a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1261160298;
            }

            public String toString() {
                return "OnImportSshKeyClick";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel$f$f, reason: collision with other inner class name */
        public static final class C0540f implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0540f f34199a = new C0540f();

            private C0540f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0540f);
            }

            public int hashCode() {
                return -852271598;
            }

            public String toString() {
                return "OnInviteTeamMemberClick";
            }
        }

        public static final class g implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f34200a = new g();

            private g() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -905436073;
            }

            public String toString() {
                return "OnNewBiometricKeyClick";
            }
        }

        public static final class h implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f34201a = new h();

            private h() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return -792895935;
            }

            public String toString() {
                return "OnNewFidoKeyClick";
            }
        }

        public static final class i implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f34202a = new i();

            private i() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public int hashCode() {
                return -1138648420;
            }

            public String toString() {
                return "OnPasteSshCertificateClick";
            }
        }

        public static final class j implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f34203a = new j();

            private j() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public int hashCode() {
                return 1018336724;
            }

            public String toString() {
                return "OnPasteSshKeyClick";
            }
        }

        public static final class k implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f34204a = new k();

            private k() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public int hashCode() {
                return 1539228391;
            }

            public String toString() {
                return "OnSendKeyClick";
            }
        }

        public static final class l implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f34205a = new l();

            private l() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public int hashCode() {
                return -23280162;
            }

            public String toString() {
                return "UpdateList";
            }
        }

        public static final class m implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f34206a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34207b;

            public m(boolean z10, String str) {
                ju.t.f(str, "query");
                this.f34206a = z10;
                this.f34207b = str;
            }

            public final boolean a() {
                return this.f34206a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return this.f34206a == mVar.f34206a && ju.t.b(this.f34207b, mVar.f34207b);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f34206a) * 31) + this.f34207b.hashCode();
            }

            public String toString() {
                return "UpdateSearch(isSearchMode=" + this.f34206a + ", query=" + this.f34207b + ")";
            }
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34208a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f34210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(Long l10, zt.e eVar) {
            super(2, eVar);
            this.f34210c = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new f0(this.f34210c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34208a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = KeychainScreenViewModel.this._editingState;
            Long l10 = this.f34210c;
            wVar.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(l10, l10 != null, false, 4, null));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public interface g {

        public static final class a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34211a;

            public a(long j10) {
                this.f34211a = j10;
            }

            public final long a() {
                return this.f34211a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f34211a == ((a) obj).f34211a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34211a);
            }

            public String toString() {
                return "OnIdentityPickerResult(identityId=" + this.f34211a + ")";
            }
        }

        public static final class b implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final KeychainNavGraphRoute f34212a;

            public b(KeychainNavGraphRoute keychainNavGraphRoute) {
                ju.t.f(keychainNavGraphRoute, "route");
                this.f34212a = keychainNavGraphRoute;
            }

            public final KeychainNavGraphRoute a() {
                return this.f34212a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f34212a, ((b) obj).f34212a);
            }

            public int hashCode() {
                return this.f34212a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34212a + ")";
            }
        }

        public static final class c implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.server.auditor.ssh.client.navigation.ui.compose.c f34213a;

            public c(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
                ju.t.f(cVar, "mode");
                this.f34213a = cVar;
            }

            public final com.server.auditor.ssh.client.navigation.ui.compose.c a() {
                return this.f34213a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && ju.t.b(this.f34213a, ((c) obj).f34213a);
            }

            public int hashCode() {
                return this.f34213a.hashCode();
            }

            public String toString() {
                return "OnTopBarModeChange(mode=" + this.f34213a + ")";
            }
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34214a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34216c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new g0(this.f34216c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34214a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._isFabSend.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34216c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f34217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34218b;

        public h(List list, String str) {
            ju.t.f(list, "items");
            ju.t.f(str, "query");
            this.f34217a = list;
            this.f34218b = str;
        }

        public final List a() {
            return this.f34217a;
        }

        public final String b() {
            return this.f34218b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return ju.t.b(this.f34217a, hVar.f34217a) && ju.t.b(this.f34218b, hVar.f34218b);
        }

        public int hashCode() {
            return (this.f34217a.hashCode() * 31) + this.f34218b.hashCode();
        }

        public String toString() {
            return "KeychainScreenItems(items=" + this.f34217a + ", query=" + this.f34218b + ")";
        }
    }

    static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34219a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f34221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(TermiusSortType termiusSortType, zt.e eVar) {
            super(2, eVar);
            this.f34221c = termiusSortType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new h0(this.f34221c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34219a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            hg.d dVar = KeychainScreenViewModel.this.keyValueRepository;
            ju.t.e(dVar, "access$getKeyValueRepository$p(...)");
            TermiusSortType termiusSortType = this.f34221c;
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.putString("termius_keychain_sort_type", termiusSortType.name());
            editorEdit.apply();
            KeychainScreenViewModel.this._keychainSortingMode.setValue(this.f34221c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34223b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f34225d;

        i(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34223b = obj;
            this.f34225d |= RtlSpacingHelper.UNDEFINED;
            return KeychainScreenViewModel.this.determineEmptyScreenState(null, null, null, this);
        }
    }

    static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34226a;

        i0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new i0(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r10.f34226a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                ut.x.b(r11)
                r9 = r10
                goto L8f
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                ut.x.b(r11)
                r9 = r10
                goto L51
            L21:
                ut.x.b(r11)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel r11 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.this
                il.o r4 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.access$getGetKeychainScreenItemsUseCase$p(r11)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel r11 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.this
                zu.w r11 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.access$get_searchQueryFieldValue$p(r11)
                java.lang.Object r11 = r11.getValue()
                j3.t0 r11 = (j3.t0) r11
                java.lang.String r5 = r11.m()
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel r11 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.this
                boolean r6 = r11.isIdentityPicker()
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel r11 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.this
                com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r8 = r11.getTargetVaultKeyId()
                r10.f34226a = r3
                r7 = 0
                r9 = r10
                java.lang.Object r11 = r4.d(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L51
                goto L8e
            L51:
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel$h r11 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.h) r11
                java.util.List r1 = r11.a()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L80
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.access$get_actionMode$p(r1)
                java.lang.Object r1 = r1.getValue()
                boolean r1 = r1 instanceof com.server.auditor.ssh.client.navigation.ui.compose.c.a
                if (r1 == 0) goto L80
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.access$get_actionMode$p(r1)
            L71:
                java.lang.Object r3 = r1.getValue()
                r4 = r3
                com.server.auditor.ssh.client.navigation.ui.compose.c r4 = (com.server.auditor.ssh.client.navigation.ui.compose.c) r4
                com.server.auditor.ssh.client.navigation.ui.compose.c$b r4 = com.server.auditor.ssh.client.navigation.ui.compose.c.b.f30351a
                boolean r3 = r1.g(r3, r4)
                if (r3 == 0) goto L71
            L80:
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.this
                zu.v r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.access$get_filteredItems$p(r1)
                r9.f34226a = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L8f
            L8e:
                return r0
            L8f:
                ut.m0 r11 = ut.m0.f82633a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34228a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34228a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._actionMode.setValue(c.b.f30351a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34230a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34232c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new j0(this.f34232c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34230a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._isSearchMode.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34232c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34233a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34233a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._discardChangesDialog.setValue(a7.a.f68126a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34235a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f34237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f34237c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new k0(this.f34237c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34235a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._searchQueryFieldValue.setValue(this.f34237c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f34239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f34241d;

        l(zt.e eVar) {
            super(4, eVar);
        }

        public final Object i(boolean z10, com.server.auditor.ssh.client.navigation.ui.compose.c cVar, List list, zt.e eVar) {
            l lVar = KeychainScreenViewModel.this.new l(eVar);
            lVar.f34239b = z10;
            lVar.f34240c = cVar;
            lVar.f34241d = list;
            return lVar.invokeSuspend(ut.m0.f82633a);
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return i(((Boolean) obj).booleanValue(), (com.server.auditor.ssh.client.navigation.ui.compose.c) obj2, (List) obj3, (zt.e) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34238a;
            boolean z10 = true;
            if (i10 == 0) {
                ut.x.b(obj);
                boolean z11 = this.f34239b;
                com.server.auditor.ssh.client.navigation.ui.compose.c cVar = (com.server.auditor.ssh.client.navigation.ui.compose.c) this.f34240c;
                List list = (List) this.f34241d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((l2) obj2).i()) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() != 1 || !sp.a.g((l2) vt.v.p0(arrayList))) {
                    if (!ju.t.b(cVar, c.b.f30351a)) {
                        if (!(cVar instanceof c.a)) {
                            throw new ut.s();
                        }
                        if (!z11) {
                            z10 = false;
                        }
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                kp.c cVar2 = KeychainScreenViewModel.this.getTeamAccessStatusUseCase;
                this.f34240c = null;
                this.f34238a = 1;
                obj = cVar2.b(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(!jp.b.a((jp.a) obj));
        }
    }

    static final class l0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34243a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f34245c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(TermiusSortType termiusSortType, zt.e eVar) {
            super(2, eVar);
            this.f34245c = termiusSortType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new l0(this.f34245c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34243a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            hg.d dVar = KeychainScreenViewModel.this.keyValueRepository;
            ju.t.e(dVar, "access$getKeyValueRepository$p(...)");
            TermiusSortType termiusSortType = this.f34245c;
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.putString("termius_identity_picker_sort_type", termiusSortType.name());
            editorEdit.apply();
            KeychainScreenViewModel.this._selectIdentitySortingMode.setValue(this.f34245c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34246a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34246a;
            if (i10 == 0) {
                ut.x.b(obj);
                gj.b vaultsInteractor = KeychainScreenViewModel.this.getVaultsInteractor();
                this.f34246a = 1;
                if (vaultsInteractor.f(Long.MIN_VALUE, this) == objF) {
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
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34248a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f34251d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(boolean z10, List list, zt.e eVar) {
            super(2, eVar);
            this.f34250c = z10;
            this.f34251d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new m0(this.f34250c, this.f34251d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34248a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._showContextActions.setValue(this.f34250c ? new a.b(this.f34251d) : a.C0202a.f13051a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f34253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ KeychainScreenViewModel f34255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f34256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f34257f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Intent intent, int i10, KeychainScreenViewModel keychainScreenViewModel, VaultKeyId vaultKeyId, String str, zt.e eVar) {
            super(2, eVar);
            this.f34253b = intent;
            this.f34254c = i10;
            this.f34255d = keychainScreenViewModel;
            this.f34256e = vaultKeyId;
            this.f34257f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new n(this.f34253b, this.f34254c, this.f34255d, this.f34256e, this.f34257f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objE;
            Object value2;
            Object objF = au.b.f();
            int i10 = this.f34252a;
            if (i10 == 0) {
                ut.x.b(obj);
                Intent intent = this.f34253b;
                Uri data = intent != null ? intent.getData() : null;
                if (this.f34254c == -1 && data != null) {
                    zu.w wVar = this.f34255d._isImportingDialogShown;
                    do {
                        value = wVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
                    no.e importCertificateUseCase = this.f34255d.getImportCertificateUseCase();
                    Context contextF = TermiusApplication.F();
                    ju.t.e(contextF, "getTermiusAppContext(...)");
                    this.f34252a = 1;
                    objE = importCertificateUseCase.e(contextF, data, this);
                    if (objE == objF) {
                        return objF;
                    }
                }
                return ut.m0.f82633a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            objE = obj;
            EditKeyData editKeyData = (EditKeyData) objE;
            zu.w wVar2 = this.f34255d._isImportingDialogShown;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(false)));
            if (editKeyData == null) {
                return ut.m0.f82633a;
            }
            this.f34255d.sendFragmentAction(new g.b(new KeychainNavGraphRoute.EditSshKeyRoute(kotlin.coroutines.jvm.internal.b.e(0L), "import_certificate_action", "", "", "", "", editKeyData.getCertificate(), this.f34256e, this.f34257f, false)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34258a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f34260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(Object obj, zt.e eVar) {
            super(2, eVar);
            this.f34260c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new n0(this.f34260c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34258a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._discardChangesDialog.setValue(new a7.b(this.f34260c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34261a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34261a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this.sendComposeAction(f.c.f34196a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34263a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34265c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34265c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new o0(this.f34265c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34263a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._showSortTypeSelector.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34265c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34266a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34266a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this.sendComposeAction(f.d.f34197a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34268a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34268a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this.sendComposeAction(f.e.f34198a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34270a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34270a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this.sendComposeAction(f.g.f34200a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34272a;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new s(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34272a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this.sendComposeAction(f.h.f34201a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34274a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34274a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this.sendComposeAction(f.i.f34202a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34276a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34276a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this.sendComposeAction(f.j.f34203a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f34279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ KeychainScreenViewModel f34281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f34282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f34283f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(Intent intent, int i10, KeychainScreenViewModel keychainScreenViewModel, VaultKeyId vaultKeyId, String str, zt.e eVar) {
            super(2, eVar);
            this.f34279b = intent;
            this.f34280c = i10;
            this.f34281d = keychainScreenViewModel;
            this.f34282e = vaultKeyId;
            this.f34283f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new v(this.f34279b, this.f34280c, this.f34281d, this.f34282e, this.f34283f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objE;
            Object value2;
            Object objF = au.b.f();
            int i10 = this.f34278a;
            if (i10 == 0) {
                ut.x.b(obj);
                Intent intent = this.f34279b;
                Uri data = intent != null ? intent.getData() : null;
                if (this.f34280c == -1 && data != null) {
                    zu.w wVar = this.f34281d._isImportingDialogShown;
                    do {
                        value = wVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
                    no.f importSshKeyUseCase = this.f34281d.getImportSshKeyUseCase();
                    Context contextF = TermiusApplication.F();
                    ju.t.e(contextF, "getTermiusAppContext(...)");
                    this.f34278a = 1;
                    objE = importSshKeyUseCase.e(contextF, data, this);
                    if (objE == objF) {
                        return objF;
                    }
                }
                return ut.m0.f82633a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            objE = obj;
            EditKeyData editKeyData = (EditKeyData) objE;
            SshKeyDBModel sshKeyDBModel = editKeyData != null ? editKeyData.getSshKeyDBModel() : null;
            zu.w wVar2 = this.f34281d._isImportingDialogShown;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(false)));
            if (sshKeyDBModel == null) {
                return ut.m0.f82633a;
            }
            KeychainScreenViewModel keychainScreenViewModel = this.f34281d;
            Long lE = kotlin.coroutines.jvm.internal.b.e(0L);
            String label = sshKeyDBModel.getLabel();
            ju.t.e(label, "getLabel(...)");
            String privateKey = sshKeyDBModel.getPrivateKey();
            ju.t.e(privateKey, "getPrivateKey(...)");
            String publicKey = sshKeyDBModel.getPublicKey();
            ju.t.e(publicKey, "getPublicKey(...)");
            keychainScreenViewModel.sendFragmentAction(new g.b(new KeychainNavGraphRoute.EditSshKeyRoute(lE, "import_key_action", label, "", privateKey, publicKey, "", this.f34282e, this.f34283f, false)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34284a;

        w(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new w(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34284a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._editingState.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, true, false));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34286a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ op.n f34288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(op.n nVar, zt.e eVar) {
            super(2, eVar);
            this.f34288c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new x(this.f34288c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34286a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._vaultsSelectorStateFlow.setValue(this.f34288c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34289a;

        y(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeychainScreenViewModel.this.new y(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34289a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KeychainScreenViewModel.this._editingState.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, false, false, 7, null));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34291a;

        z(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new z(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34291a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a.y().i3(false);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public KeychainScreenViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        tp.g0 g0VarY1 = b2Var.y1();
        this.liveSharedPreferences = g0VarY1;
        this.keyValueRepository = aVarN.M();
        this._vaultsSelectorStateFlow = zu.m0.a(new op.n(false, null, 3, null));
        zu.w wVarA = zu.m0.a(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, false, false, 7, null));
        this._editingState = wVarA;
        this.editingState = zu.h.b(wVarA);
        zu.w wVarA2 = zu.m0.a(a7.a.f68126a);
        this._discardChangesDialog = wVarA2;
        this.discardChangesDialog = zu.h.b(wVarA2);
        Boolean bool = Boolean.FALSE;
        this._isSearchMode = zu.m0.a(bool);
        this._searchQueryFieldValue = zu.m0.a(new t0("", 0L, (g3) null, 6, (ju.k) null));
        zu.w wVarA3 = zu.m0.a(c.b.f30351a);
        this._actionMode = wVarA3;
        TermiusSortType termiusSortType = TermiusSortType.ByNameAscending;
        this._keychainSortingMode = zu.m0.a(termiusSortType);
        this._selectIdentitySortingMode = zu.m0.a(termiusSortType);
        zu.w wVarA4 = zu.m0.a(bool);
        this._isImportingDialogShown = wVarA4;
        this.isImportingDialogShown = zu.h.b(wVarA4);
        this.selectedItems = new SparseBooleanArray();
        this._showContextActions = zu.m0.a(a.C0202a.f13051a);
        this.targetVaultKeyId = VaultKeyId.Companion.a();
        this._showAddEntityActions = zu.m0.a(bool);
        this._showAddSshKeyActions = zu.m0.a(bool);
        this._showAddSshCertificateActions = zu.m0.a(bool);
        this._showSortTypeSelector = zu.m0.a(bool);
        com.server.auditor.ssh.client.interactors.r rVarN1 = b2Var.n1();
        this.googleServicesAvailabilityInteractor = rVarN1;
        this.vaultWizardId = "";
        this.isBiometricAvailable = zu.m0.a(Boolean.valueOf(isBiometricKeyGeneratorAvailable()));
        this.isGoogleServicesAvailable = zu.m0.a(Boolean.valueOf(rVarN1.b()));
        a.C0770a c0770a = gj.a.f51371c;
        this.filterEntityHelper = c0770a.e();
        zu.v vVarB = zu.c0.b(1, 0, null, 6, null);
        this._filteredItems = vVarB;
        this.filteredContainers = new ArrayList();
        a0 a0Var = new a0(vVarB, this);
        wu.i0 i0VarA = j1.a(this);
        g0.a aVar = zu.g0.f88389a;
        this.emptyScreenStateFlow = zu.h.P(a0Var, i0VarA, g0.a.b(aVar, 5000L, 0L, 2, null), a.b.f69469a);
        this.vaultsRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.u
            @Override // iu.a
            public final Object a() {
                return KeychainScreenViewModel.vaultsRepository_delegate$lambda$1();
            }
        });
        this.vaultsInteractor$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.v
            @Override // iu.a
            public final Object a() {
                return KeychainScreenViewModel.vaultsInteractor_delegate$lambda$2(this.f34980a);
            }
        });
        il.t tVarO = hg.f.p().o();
        ju.t.e(tVarO, "getIdentityDBRepository(...)");
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        ju.t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        SshCertificateDBAdapter sshCertificateDBAdapterQ = hg.f.p().Q();
        ju.t.e(sshCertificateDBAdapterQ, "getSshCertificateDBAdapter(...)");
        MultiKeyDBAdapter multiKeyDBAdapterX = hg.f.p().x();
        ju.t.e(multiKeyDBAdapterX, "getMultiKeyDBAdapter(...)");
        MultiKeyApiAdapter multiKeyApiAdapterW = hg.f.p().w();
        ju.t.e(multiKeyApiAdapterW, "getMultiKeyApiAdapter(...)");
        il.y yVar = new il.y(multiKeyDBAdapterX, multiKeyApiAdapterW);
        wu.j1 j1VarG1 = b2Var.g1();
        gj.a aVarE = c0770a.e();
        hg.d dVarM = aVarN.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        ju.t.e(aVarN, "termiusStorage");
        this.getKeychainScreenItemsUseCase = new il.o(tVarO, sshKeyDBAdapterW, sshCertificateDBAdapterQ, yVar, j1VarG1, aVarE, dVarM, aVarN, getVaultsRepository());
        this.getTeamAccessStatusUseCase = new kp.c(new in.c(g0VarY1));
        this.importSshKeyUseCase$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.w
            @Override // iu.a
            public final Object a() {
                return KeychainScreenViewModel.importSshKeyUseCase_delegate$lambda$3();
            }
        });
        this.importCertificateUseCase$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.x
            @Override // iu.a
            public final Object a() {
                return KeychainScreenViewModel.importCertificateUseCase_delegate$lambda$4();
            }
        });
        zu.f fVarE = getVaultsRepository().e();
        this.vaultsFlow = fVarE;
        zu.w wVarA5 = zu.m0.a(bool);
        this._isFabSend = wVarA5;
        this.isFabVisible = zu.h.P(zu.h.i(wVarA5, wVarA3, fVarE, new l(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), bool);
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object determineEmptyScreenState(java.util.List<? extends rh.z.a> r6, java.util.List<tl.l2> r7, java.lang.String r8, zt.e<? super op.a> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.i
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel$i r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.i) r0
            int r1 = r0.f34225d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34225d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel$i r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel$i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f34223b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f34225d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r6 = r0.f34222a
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            ut.x.b(r9)
            goto L62
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            ut.x.b(r9)
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L43
            op.a$b r6 = op.a.b.f69469a
            return r6
        L43:
            int r6 = r7.size()
            if (r6 != r4) goto L73
            java.lang.Object r6 = vt.v.p0(r7)
            tl.l2 r6 = (tl.l2) r6
            boolean r6 = sp.a.g(r6)
            if (r6 == 0) goto L73
            kp.c r6 = r5.getTeamAccessStatusUseCase
            r0.f34222a = r8
            r0.f34225d = r4
            java.lang.Object r9 = r6.b(r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            jp.a r9 = (jp.a) r9
            boolean r6 = jp.b.a(r9)
            if (r6 == 0) goto L6d
            op.a$c r6 = op.a.c.f69470a
            return r6
        L6d:
            op.a$a r6 = new op.a$a
            r6.<init>(r3, r4, r8)
            return r6
        L73:
            op.a$a r6 = new op.a$a
            r6.<init>(r3, r4, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.KeychainScreenViewModel.determineEmptyScreenState(java.util.List, java.util.List, java.lang.String, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final no.e getImportCertificateUseCase() {
        return (no.e) this.importCertificateUseCase$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final no.f getImportSshKeyUseCase() {
        return (no.f) this.importSshKeyUseCase$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gj.b getVaultsInteractor() {
        return (gj.b) this.vaultsInteractor$delegate.getValue();
    }

    private final vl.g getVaultsRepository() {
        return (vl.g) this.vaultsRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final no.e importCertificateUseCase_delegate$lambda$4() {
        return new no.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final no.f importSshKeyUseCase_delegate$lambda$3() {
        return new no.f();
    }

    private final boolean isBiometricKeyGeneratorAvailable() {
        return com.server.auditor.ssh.client.app.a.N().M().getBoolean("is_hardware_key_storage_available", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateShowContextActions$default(KeychainScreenViewModel keychainScreenViewModel, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = vt.v.o();
        }
        keychainScreenViewModel.updateShowContextActions(z10, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gj.b vaultsInteractor_delegate$lambda$2(KeychainScreenViewModel keychainScreenViewModel) {
        return new gj.b(keychainScreenViewModel.getVaultsRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.g vaultsRepository_delegate$lambda$1() {
        return vl.g.f83702b.b();
    }

    public final void dismissActionMode() {
        wu.k.d(j1.a(this), null, null, new j(null), 3, null);
    }

    public final void dismissDiscardChangesDialog() {
        wu.k.d(j1.a(this), null, null, new k(null), 3, null);
    }

    public final zu.k0 getActionMode() {
        return zu.h.b(this._actionMode);
    }

    public final zu.k0 getDiscardChangesDialog() {
        return this.discardChangesDialog;
    }

    public final zu.k0 getEditingState() {
        return this.editingState;
    }

    public final zu.k0 getEmptyScreenStateFlow() {
        return this.emptyScreenStateFlow;
    }

    public final gj.a getFilterEntityHelper() {
        return this.filterEntityHelper;
    }

    public final List<z.a> getFilteredContainers() {
        return this.filteredContainers;
    }

    public final zu.a0 getFilteredItems() {
        return this._filteredItems;
    }

    public final zu.k0 getKeychainSortingMode() {
        return zu.h.b(this._keychainSortingMode);
    }

    public final zu.k0 getSearchQueryFieldValue() {
        return this._searchQueryFieldValue;
    }

    public final zu.k0 getSelectIdentitySortingMode() {
        return zu.h.b(this._selectIdentitySortingMode);
    }

    public final SparseBooleanArray getSelectedItems() {
        return this.selectedItems;
    }

    public final zu.k0 getShowAddEntityActions() {
        return this._showAddEntityActions;
    }

    public final zu.k0 getShowAddSshCertificateActions() {
        return this._showAddSshCertificateActions;
    }

    public final zu.k0 getShowAddSshKeyActions() {
        return this._showAddSshKeyActions;
    }

    public final zu.k0 getShowContextActions() {
        return this._showContextActions;
    }

    public final zu.k0 getShowSortTypeSelector() {
        return this._showSortTypeSelector;
    }

    public final VaultKeyId getTargetVaultKeyId() {
        return this.targetVaultKeyId;
    }

    public final SshKeyDBModel getTempSshKeyDBModelForExport() {
        return this.tempSshKeyDBModelForExport;
    }

    public final String getVaultWizardId() {
        return this.vaultWizardId;
    }

    public final zu.k0 isBiometricAvailable() {
        return this.isBiometricAvailable;
    }

    public final zu.k0 isFabSend() {
        return this._isFabSend;
    }

    public final zu.k0 isFabVisible() {
        return this.isFabVisible;
    }

    public final zu.k0 isGoogleServicesAvailable() {
        return this.isGoogleServicesAvailable;
    }

    public final boolean isIdentityPicker() {
        return this.isIdentityPicker;
    }

    public final zu.k0 isImportingDialogShown() {
        return this.isImportingDialogShown;
    }

    public final boolean isNavigationTypeRail() {
        return this.isNavigationTypeRail;
    }

    public final boolean isSearchActive() {
        return this.isSearchActive;
    }

    public final zu.k0 isSearchMode() {
        return this._isSearchMode;
    }

    public final void onBackToPersonalVaultClick() {
        wu.k.d(j1.a(this), null, null, new m(null), 3, null);
    }

    public final void onCertificateImportResultReceived(int i10, Intent intent, VaultKeyId vaultKeyId, String str) {
        ju.t.f(vaultKeyId, "vaultKeyId");
        ju.t.f(str, "funnelId");
        wu.k.d(j1.a(this), null, null, new n(intent, i10, this, vaultKeyId, str, null), 3, null);
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        } else if (ju.t.b(identityPickerViewModel, this)) {
            identityPickerViewModel = null;
        }
    }

    public final void onGenerateSshKeyClick() {
        wu.k.d(j1.a(this), null, null, new o(null), 3, null);
    }

    public final void onImportSshCertificateClick() {
        wu.k.d(j1.a(this), null, null, new p(null), 3, null);
    }

    public final void onImportSshKeyClick() {
        wu.k.d(j1.a(this), null, null, new q(null), 3, null);
    }

    public final void onNewBiometricKeyClick() {
        wu.k.d(j1.a(this), null, null, new r(null), 3, null);
    }

    public final void onNewFidoKeyClick() {
        wu.k.d(j1.a(this), null, null, new s(null), 3, null);
    }

    public final void onPasteSshCertificateClick() {
        wu.k.d(j1.a(this), null, null, new t(null), 3, null);
    }

    public final void onPasteSshKeyClick() {
        wu.k.d(j1.a(this), null, null, new u(null), 3, null);
    }

    public final void onSshKeyImportResultReceived(int i10, Intent intent, VaultKeyId vaultKeyId, String str) {
        ju.t.f(vaultKeyId, "vaultKeyId");
        ju.t.f(str, "funnelId");
        wu.k.d(j1.a(this), null, null, new v(intent, i10, this, vaultKeyId, str, null), 3, null);
    }

    public final void onStartCreatingNew() {
        wu.k.d(j1.a(this), null, null, new w(null), 3, null);
    }

    public final void onVaultsModeUpdated(op.n nVar) {
        ju.t.f(nVar, "vaultsSelectorState");
        wu.k.d(j1.a(this), null, null, new x(nVar, null), 3, null);
    }

    public final void resetEditing() {
        wu.k.d(j1.a(this), null, null, new y(null), 3, null);
    }

    public final void sendNewKeyButtonPressedEvent() {
        wu.k.d(j1.a(this), null, null, new z(null), 3, null);
    }

    public final void setIdentityPicker(boolean z10) {
        this.isIdentityPicker = z10;
    }

    public final void setNavigationTypeRail(boolean z10) {
        this.isNavigationTypeRail = z10;
    }

    public final void setSearchActive(boolean z10) {
        this.isSearchActive = z10;
    }

    public final void setTargetVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.targetVaultKeyId = vaultKeyId;
    }

    public final void setTempSshKeyDBModelForExport(SshKeyDBModel sshKeyDBModel) {
        this.tempSshKeyDBModelForExport = sshKeyDBModel;
    }

    public final void setVaultWizardId(String str) {
        ju.t.f(str, "<set-?>");
        this.vaultWizardId = str;
    }

    public final void updateActionMode(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
        ju.t.f(cVar, "keychainTopBarState");
        wu.k.d(j1.a(this), null, null, new b0(cVar, null), 3, null);
    }

    public final void updateAddEntitySelectorVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new c0(z10, null), 3, null);
    }

    public final void updateAddNewSshCertificateSelectorVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d0(z10, null), 3, null);
    }

    public final void updateAddNewSshKeySelectorVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new e0(z10, null), 3, null);
    }

    public final void updateEditingId(Long l10) {
        wu.k.d(j1.a(this), null, null, new f0(l10, null), 3, null);
    }

    public final void updateIsFabSend(boolean z10) {
        wu.k.d(j1.a(this), null, null, new g0(z10, null), 3, null);
    }

    public final void updateKeychainSortingMode(TermiusSortType termiusSortType) {
        ju.t.f(termiusSortType, Column.TYPE);
        wu.k.d(j1.a(this), null, null, new h0(termiusSortType, null), 3, null);
    }

    public final void updateList() {
        wu.k.d(j1.a(this), null, null, new i0(null), 3, null);
    }

    public final void updateSearchMode(boolean z10) {
        wu.k.d(j1.a(this), null, null, new j0(z10, null), 3, null);
    }

    public final void updateSearchQuery(t0 t0Var) {
        ju.t.f(t0Var, "query");
        wu.k.d(j1.a(this), null, null, new k0(t0Var, null), 3, null);
    }

    public final void updateSelectIdentitySortingMode(TermiusSortType termiusSortType) {
        ju.t.f(termiusSortType, Column.TYPE);
        wu.k.d(j1.a(this), null, null, new l0(termiusSortType, null), 3, null);
    }

    public final void updateShowContextActions(boolean z10, List<? extends com.server.auditor.ssh.client.navigation.ui.compose.a> list) {
        ju.t.f(list, "options");
        wu.k.d(j1.a(this), null, null, new m0(z10, list, null), 3, null);
    }

    public final void updateShowDiscardChangesDialog(Object obj) {
        ju.t.f(obj, "route");
        wu.k.d(j1.a(this), null, null, new n0(obj, null), 3, null);
    }

    public final void updateSortTypeSelectorVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new o0(z10, null), 3, null);
    }
}
