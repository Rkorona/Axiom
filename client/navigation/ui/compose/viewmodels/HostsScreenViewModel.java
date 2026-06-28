package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import android.content.SharedPreferences;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.j1;
import bk.a;
import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.ChainHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.navigation.ui.compose.c;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.u6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.q;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagHostApiAdapter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import e3.g3;
import hg.b2;
import j3.t0;
import java.util.ArrayList;
import java.util.List;
import ml.a;
import ok.a7;
import op.a;
import tl.l2;
import ut.m0;
import wu.x0;
import zu.g0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class HostsScreenViewModel extends FragmentWrapperViewModel<com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.q, d> {
    public static volatile HostsScreenViewModel composeViewModel;
    private final zu.w _actionMode;
    private final zu.w _allHostsDBModels;
    private final zu.w _discardChangesDialog;
    private final zu.w _editingState;
    private final zu.f _filteredItems;
    private final zu.f _fullContainersFlow;
    private final zu.w _groupItems;
    private final zu.f _hostsAndActiveConnections;
    private final zu.w _hostsSortingMode;
    private final k0 _isRateUsVirtualItemEnabled;
    private final zu.w _isSearchMode;
    private final zu.w _needShowAddLocalHostButton;
    private final zu.w _onGroupSelected;
    private final zu.w _searchQueryFieldValue;
    private final zu.w _showAddEntityActions;
    private final zu.w _showContextActions;
    private final zu.w _showDiscoverLocalDevices;
    private final zu.w _showGroupBreadcrumbsSelector;
    private final zu.w _showSortTypeSelector;
    private final zu.w _vaultsSelectorStateFlow;
    private final zu.w _willingGroupId;
    private final k0 connectionStyles;
    private final eo.a createGroupBreadcrumbsListUseCase;
    private Long currentGroupId;
    private final k0 discardChangesDialog;
    private final k0 editingState;
    private final k0 emptyScreenStateFlow;
    private ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers;
    private final k0 filteredItems;
    private final ml.a getHostsScreenItemsUseCase;
    private final kp.c getTeamAccessStatusUseCase;
    private final xi.a hostVaultInteractor;
    private final List<Long> hostsToChangeGroup;
    private final k0 isFabVisible;
    private boolean isRateUsBottomSheetDialogShowing;
    private final hg.d keyValueRepository;
    private final cg.a latestTriggerProcessor;
    private final tp.g0 liveSharedPreferences;
    private final SparseBooleanArray selectedItems = new SparseBooleanArray();
    private final k0 showDiscoverLocalDevices;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private String vaultWizardId;
    private final zu.f vaultsFlow;
    private final ut.n vaultsInteractor$delegate;
    private final dq.h0 vaultsPermissionsHelper;
    private final ut.n vaultsRepository$delegate;
    public static final c Companion = new c(null);
    public static final int $stable = 8;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34025a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel$a$a, reason: collision with other inner class name */
        static final class C0533a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ HostsScreenViewModel f34027a;

            C0533a(HostsScreenViewModel hostsScreenViewModel) {
                this.f34027a = hostsScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
                if (cVar instanceof c.b) {
                    this.f34027a.sendComposeAction(d.a.f34042a);
                }
                return m0.f82633a;
            }
        }

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34025a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(HostsScreenViewModel.this.getActionMode(), 1);
                C0533a c0533a = new C0533a(HostsScreenViewModel.this);
                this.f34025a = 1;
                if (fVarR.collect(c0533a, this) == objF) {
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
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34028a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f34031d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(List list, boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34030c = list;
            this.f34031d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new a0(this.f34030c, this.f34031d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34028a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._groupItems.setValue(this.f34030c);
            HostsScreenViewModel.this._needShowAddLocalHostButton.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f34031d));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34032a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34032a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HostsScreenViewModel.this._hostsSortingMode;
            hg.d dVar = HostsScreenViewModel.this.keyValueRepository;
            TermiusSortType termiusSortType = com.server.auditor.ssh.client.fragments.hostngroups.j.f25092a;
            String string = dVar.getString("termius_hosts_sort_type", termiusSortType.name());
            if (string == null) {
                string = termiusSortType.name();
            }
            wVar.setValue(TermiusSortType.valueOf(string));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f34035b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f34037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f34038e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(Long l10, boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34037d = l10;
            this.f34038e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new b0(this.f34037d, this.f34038e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            HostsScreenViewModel hostsScreenViewModel;
            Object objF = au.b.f();
            int i10 = this.f34035b;
            if (i10 == 0) {
                ut.x.b(obj);
                HostsScreenViewModel hostsScreenViewModel2 = HostsScreenViewModel.this;
                eo.a aVar = hostsScreenViewModel2.createGroupBreadcrumbsListUseCase;
                Long l10 = this.f34037d;
                this.f34034a = hostsScreenViewModel2;
                this.f34035b = 1;
                Object objB = aVar.b(l10, this);
                if (objB == objF) {
                    return objF;
                }
                hostsScreenViewModel = hostsScreenViewModel2;
                obj = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hostsScreenViewModel = (HostsScreenViewModel) this.f34034a;
                ut.x.b(obj);
            }
            hostsScreenViewModel.updateGroupItems((List) obj, this.f34038e);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class c {
        public /* synthetic */ c(ju.k kVar) {
            this();
        }

        private c() {
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34039a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f34041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(TermiusSortType termiusSortType, zt.e eVar) {
            super(2, eVar);
            this.f34041c = termiusSortType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new c0(this.f34041c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34039a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            hg.d dVar = HostsScreenViewModel.this.keyValueRepository;
            ju.t.e(dVar, "access$getKeyValueRepository$p(...)");
            TermiusSortType termiusSortType = this.f34041c;
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.putString("termius_hosts_sort_type", termiusSortType.name());
            editorEdit.apply();
            HostsScreenViewModel.this._hostsSortingMode.setValue(this.f34041c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public interface d {

        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34042a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 346495106;
            }

            public String toString() {
                return "FinishActionMode";
            }
        }

        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f34043a;

            public b(int i10) {
                this.f34043a = i10;
            }

            public final int a() {
                return this.f34043a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f34043a == ((b) obj).f34043a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f34043a);
            }

            public String toString() {
                return "OnActionItemClick(itemId=" + this.f34043a + ")";
            }
        }

        public static final class c implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34044a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1736156080;
            }

            public String toString() {
                return "OnFabConnectClick";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel$d$d, reason: collision with other inner class name */
        public static final class C0534d implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0534d f34045a = new C0534d();

            private C0534d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0534d);
            }

            public int hashCode() {
                return -1000235469;
            }

            public String toString() {
                return "OnInviteTeamMemberClick";
            }
        }

        public static final class e implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f34046a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 626205144;
            }

            public String toString() {
                return "OnSetTargetDefaultsClick";
            }
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34047a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f34049c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(Long l10, zt.e eVar) {
            super(2, eVar);
            this.f34049c = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new d0(this.f34049c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34047a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HostsScreenViewModel.this._willingGroupId;
            Long l10 = this.f34049c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, l10));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34060a;

        e0(zt.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(zt.e eVar) {
            return HostsScreenViewModel.this.new e0(eVar);
        }

        @Override // iu.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zt.e eVar) {
            return ((e0) create(eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = au.b.f();
            int i10 = this.f34060a;
            if (i10 == 0) {
                ut.x.b(obj);
                ml.a aVar = HostsScreenViewModel.this.getHostsScreenItemsUseCase;
                this.f34060a = 1;
                obj = aVar.m(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            a.b bVar = (a.b) obj;
            zu.w wVar = HostsScreenViewModel.this._allHostsDBModels;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, bVar));
            return m0.f82633a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34064c;

        f(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, t0 t0Var, zt.e eVar2) {
            f fVar = HostsScreenViewModel.this.new f(eVar2);
            fVar.f34063b = eVar;
            fVar.f34064c = t0Var;
            return fVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34062a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return obj;
            }
            ut.x.b(obj);
            e eVar = (e) this.f34063b;
            t0 t0Var = (t0) this.f34064c;
            ml.a aVar = HostsScreenViewModel.this.getHostsScreenItemsUseCase;
            String strM = t0Var.m();
            this.f34063b = null;
            this.f34062a = 1;
            Object objQ = aVar.q(eVar, strM, this);
            return objQ == objF ? objF : objQ;
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34066a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34068c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34068c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new f0(this.f34068c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34066a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._isSearchMode.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34068c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f34072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ boolean f34073e;

        g(zt.e eVar) {
            super(6, eVar);
        }

        @Override // iu.t
        public /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return i((ut.a0) obj, (Long) obj2, (TermiusSortType) obj3, (List) obj4, ((Boolean) obj5).booleanValue(), (zt.e) obj6);
        }

        public final Object i(ut.a0 a0Var, Long l10, TermiusSortType termiusSortType, List list, boolean z10, zt.e eVar) {
            g gVar = HostsScreenViewModel.this.new g(eVar);
            gVar.f34070b = a0Var;
            gVar.f34071c = l10;
            gVar.f34072d = list;
            gVar.f34073e = z10;
            return gVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34069a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return obj;
            }
            ut.x.b(obj);
            ut.a0 a0Var = (ut.a0) this.f34070b;
            Long l10 = (Long) this.f34071c;
            List list = (List) this.f34072d;
            boolean z10 = this.f34073e;
            ml.a aVar = HostsScreenViewModel.this.getHostsScreenItemsUseCase;
            a.b bVar = (a.b) a0Var.d();
            List listO = vt.v.o();
            VaultKeyIdSpecification.Specified specifiedB = VaultKeyIdSpecification.Companion.b();
            Object objF2 = a0Var.f();
            ju.t.e(objF2, "<get-third>(...)");
            boolean zBooleanValue = ((Boolean) objF2).booleanValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((l2) obj2).i()) {
                    arrayList.add(obj2);
                }
            }
            this.f34070b = null;
            this.f34071c = null;
            this.f34069a = 1;
            Object objN = aVar.n(bVar, (8194 & 2) != 0 ? vt.v.o() : null, l10, z10, listO, false, false, false, null, specifiedB, arrayList, (8194 & 2048) != 0 ? false : zBooleanValue, "termius_hosts_sort_type", (8194 & 8192) != 0 ? vt.v.o() : null, this);
            return objN == objF ? objF : objN;
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34075a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f34077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f34077c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new g0(this.f34077c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34075a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HostsScreenViewModel.this._searchQueryFieldValue;
            t0 t0Var = this.f34077c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, t0Var));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34079b;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            h hVar = HostsScreenViewModel.this.new h(eVar);
            hVar.f34079b = obj;
            return hVar;
        }

        @Override // iu.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, zt.e eVar2) {
            return ((h) create(eVar, eVar2)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34078a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            e eVar = (e) this.f34079b;
            if (eVar.d().isEmpty() && (HostsScreenViewModel.this._actionMode.getValue() instanceof c.a)) {
                zu.w wVar = HostsScreenViewModel.this._actionMode;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, c.b.f30351a));
            }
            HostsScreenViewModel.this.setCurrentGroupId(eVar.f());
            HostsScreenViewModel.this.updateGroupNavigation(eVar.f(), eVar.j());
            return m0.f82633a;
        }
    }

    static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34081a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f34084d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(boolean z10, List list, zt.e eVar) {
            super(2, eVar);
            this.f34083c = z10;
            this.f34084d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new h0(this.f34083c, this.f34084d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34081a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._showContextActions.setValue(this.f34083c ? new a.b(this.f34084d) : a.C0202a.f13051a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f34088d;

        i(zt.e eVar) {
            super(4, eVar);
        }

        @Override // iu.r
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.b bVar, com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.z zVar, Boolean bool, zt.e eVar) {
            i iVar = new i(eVar);
            iVar.f34086b = bVar;
            iVar.f34087c = zVar;
            iVar.f34088d = bool;
            return iVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34085a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return new ut.a0((a.b) this.f34086b, (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.z) this.f34087c, (Boolean) this.f34088d);
        }
    }

    static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34089a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f34091c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(Object obj, zt.e eVar) {
            super(2, eVar);
            this.f34091c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new i0(this.f34091c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34089a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._discardChangesDialog.setValue(new a7.b(this.f34091c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f34092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f34093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f34095d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f34097f;

        j(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34095d = obj;
            this.f34097f |= RtlSpacingHelper.UNDEFINED;
            return HostsScreenViewModel.this.determineEmptyScreenState(null, null, false, false, null, this);
        }
    }

    static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34098a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34100c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new j0(this.f34100c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34098a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._showSortTypeSelector.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34100c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34101a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34101a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._actionMode.setValue(c.b.f30351a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34103a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34103a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._discardChangesDialog.setValue(a7.a.f68126a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34105a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34105a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HostsScreenViewModel.this._showDiscoverLocalDevices;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34107a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Host f34109c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Host host, zt.e eVar) {
            super(2, eVar);
            this.f34109c = host;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(HostsScreenViewModel hostsScreenViewModel) {
            hostsScreenViewModel.updateList(hostsScreenViewModel.getCurrentGroupId());
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new n(this.f34109c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34107a;
            if (i10 == 0) {
                ut.x.b(obj);
                xi.a aVar = HostsScreenViewModel.this.hostVaultInteractor;
                Host host = this.f34109c;
                final HostsScreenViewModel hostsScreenViewModel = HostsScreenViewModel.this;
                iu.a aVar2 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.t
                    @Override // iu.a
                    public final Object a() {
                        return HostsScreenViewModel.n.k(hostsScreenViewModel);
                    }
                };
                this.f34107a = 1;
                if (aVar.g(host, aVar2, this) == objF) {
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
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34110a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34110a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel hostsScreenViewModel = HostsScreenViewModel.this;
            hostsScreenViewModel.updateList(hostsScreenViewModel.getCurrentGroupId());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(zu.g gVar, zt.e eVar) {
            return ((o) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34114c;

        p(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, List list2, zt.e eVar) {
            p pVar = HostsScreenViewModel.this.new p(eVar);
            pVar.f34113b = list;
            pVar.f34114c = list2;
            return pVar.invokeSuspend(m0.f82633a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        
            if (r9 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
        
            if (r9 == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r8.f34112a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                ut.x.b(r9)
                goto Lb6
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                ut.x.b(r9)
                goto L6e
            L1f:
                ut.x.b(r9)
                java.lang.Object r9 = r8.f34113b
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r1 = r8.f34114c
                java.util.List r1 = (java.util.List) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r1 = r1.iterator()
            L33:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L4a
                java.lang.Object r5 = r1.next()
                r6 = r5
                tl.l2 r6 = (tl.l2) r6
                boolean r6 = r6.i()
                if (r6 == 0) goto L33
                r4.add(r5)
                goto L33
            L4a:
                int r1 = r4.size()
                r5 = 0
                if (r1 != r3) goto L7a
                java.lang.Object r1 = vt.v.p0(r4)
                tl.l2 r1 = (tl.l2) r1
                boolean r1 = sp.a.g(r1)
                if (r1 == 0) goto L7a
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel r9 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.this
                kp.c r9 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.access$getGetTeamAccessStatusUseCase$p(r9)
                r8.f34113b = r5
                r8.f34112a = r3
                java.lang.Object r9 = r9.b(r8)
                if (r9 != r0) goto L6e
                goto Lb5
            L6e:
                jp.a r9 = (jp.a) r9
                boolean r9 = jp.b.a(r9)
                r9 = r9 ^ r3
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r9)
                return r9
            L7a:
                java.lang.Object r9 = vt.v.r0(r9)
                com.server.auditor.ssh.client.navigation.ui.compose.hosts.u6 r9 = (com.server.auditor.ssh.client.navigation.ui.compose.hosts.u6) r9
                if (r9 == 0) goto Lbc
                java.lang.Long r9 = r9.a()
                if (r9 == 0) goto Lbc
                long r6 = r9.longValue()
                hg.f r9 = hg.f.p()
                com.server.auditor.ssh.client.database.adapters.GroupDBAdapter r9 = r9.h()
                kj.a r9 = r9.getItemByLocalId(r6)
                com.server.auditor.ssh.client.database.models.GroupDBModel r9 = (com.server.auditor.ssh.client.database.models.GroupDBModel) r9
                if (r9 == 0) goto Lbc
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.this
                dq.h0 r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.access$getVaultsPermissionsHelper$p(r1)
                com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r9 = r9.getVaultKeyId()
                java.lang.String r3 = "<get-vaultKeyId>(...)"
                ju.t.e(r9, r3)
                r8.f34113b = r5
                r8.f34112a = r2
                java.lang.Object r9 = r1.c(r9, r8)
                if (r9 != r0) goto Lb6
            Lb5:
                return r0
            Lb6:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r3 = r9.booleanValue()
            Lbc:
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r3)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34116a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34116a;
            if (i10 == 0) {
                ut.x.b(obj);
                gj.b vaultsInteractor = HostsScreenViewModel.this.getVaultsInteractor();
                this.f34116a = 1;
                if (vaultsInteractor.f(Long.MIN_VALUE, this) == objF) {
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
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34118a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f34121d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z10, Long l10, zt.e eVar) {
            super(2, eVar);
            this.f34120c = z10;
            this.f34121d = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new r(this.f34120c, this.f34121d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34118a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._onGroupSelected.setValue(new ut.u(kotlin.coroutines.jvm.internal.b.a(this.f34120c), this.f34121d));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34122a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ op.n f34124c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(op.n nVar, zt.e eVar) {
            super(2, eVar);
            this.f34124c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new s(this.f34124c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34122a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._vaultsSelectorStateFlow.setValue(this.f34124c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34125a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34125a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._editingState.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, false, false, 7, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34127a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34127a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HostsScreenViewModel.this._showDiscoverLocalDevices;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class v implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f34129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HostsScreenViewModel f34130b;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f34131a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HostsScreenViewModel f34132b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel$v$a$a, reason: collision with other inner class name */
            public static final class C0535a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34133a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f34134b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f34135c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f34137e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f34138f;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f34139u;

                public C0535a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34133a = obj;
                    this.f34134b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar, HostsScreenViewModel hostsScreenViewModel) {
                this.f34131a = gVar;
                this.f34132b = hostsScreenViewModel;
            }

            /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
            
                if (r14.emit(r15, r7) != r0) goto L40;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, zt.e r15) {
                /*
                    Method dump skipped, instruction units count: 230
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.v.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public v(zu.f fVar, HostsScreenViewModel hostsScreenViewModel) {
            this.f34129a = fVar;
            this.f34130b = hostsScreenViewModel;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f34129a.collect(new a(gVar, this.f34130b), eVar);
            return objCollect == au.b.f() ? objCollect : m0.f82633a;
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34140a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.navigation.ui.compose.c f34142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
            super(2, eVar);
            this.f34142c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new w(this.f34142c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34140a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._actionMode.setValue(this.f34142c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34143a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34145c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34145c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new x(this.f34145c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34143a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._showAddEntityActions.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34145c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34146a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f34148c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Long l10, zt.e eVar) {
            super(2, eVar);
            this.f34148c = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new y(this.f34148c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34146a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HostsScreenViewModel.this._editingState;
            Long l10 = this.f34148c;
            wVar.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(l10, l10 != null, false, 4, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34149a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34151c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34151c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HostsScreenViewModel.this.new z(this.f34151c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34149a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HostsScreenViewModel.this._showGroupBreadcrumbsSelector.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34151c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public HostsScreenViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        tp.g0 g0VarY1 = b2Var.y1();
        this.liveSharedPreferences = g0VarY1;
        this.keyValueRepository = aVarN.M();
        this.vaultsRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.r
            @Override // iu.a
            public final Object a() {
                return HostsScreenViewModel.vaultsRepository_delegate$lambda$0();
            }
        });
        dq.h0 h0Var = new dq.h0(getVaultsRepository(), null, null, 6, null);
        this.vaultsPermissionsHelper = h0Var;
        k0 connectionTabBarItems = SessionManager.getInstance().terminalSessionHelper.getConnectionTabBarItems();
        this.connectionStyles = connectionTabBarItems;
        il.r rVarJ = hg.f.p().j();
        ju.t.e(rVarJ, "getHostDBRepository(...)");
        ChainHostsDBAdapter chainHostsDBAdapterC = hg.f.p().c();
        ju.t.e(chainHostsDBAdapterC, "getChainHostsDBAdapter(...)");
        TagHostDBAdapter tagHostDBAdapterC0 = hg.f.p().c0();
        ju.t.e(tagHostDBAdapterC0, "getTagHostDBAdapter(...)");
        TagDBAdapter tagDBAdapterA0 = hg.f.p().a0();
        ju.t.e(tagDBAdapterA0, "getTagDBAdapter(...)");
        TagHostApiAdapter tagHostApiAdapterB0 = hg.f.p().b0();
        ju.t.e(tagHostApiAdapterB0, "getTagHostApiAdapter(...)");
        TagApiAdapter tagApiAdapterZ = hg.f.p().Z();
        ju.t.e(tagApiAdapterZ, "getTagApiAdapter(...)");
        com.server.auditor.ssh.client.fragments.editors.base.j0 j0Var = new com.server.auditor.ssh.client.fragments.editors.base.j0(tagHostDBAdapterC0, tagDBAdapterA0, tagHostApiAdapterB0, tagApiAdapterZ);
        zp.e eVarK = hg.f.p().k(hg.f.p().Y());
        ju.t.e(eVarK, "getHostManager(...)");
        this.hostVaultInteractor = new xi.a(rVarJ, chainHostsDBAdapterC, j0Var, eVarK, h0Var, new dl.b(), b2Var.g1());
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        ju.t.e(groupDBAdapterH, "getGroupDBAdapter(...)");
        this.createGroupBreadcrumbsListUseCase = new eo.a(groupDBAdapterH);
        zu.f fVarE = getVaultsRepository().e();
        this.vaultsFlow = fVarE;
        this._vaultsSelectorStateFlow = zu.m0.a(new op.n(false, null, 3, null));
        zu.w wVarA = zu.m0.a(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, false, false, 7, null));
        this._editingState = wVarA;
        this.editingState = zu.h.b(wVarA);
        zu.w wVarA2 = zu.m0.a(a7.a.f68126a);
        this._discardChangesDialog = wVarA2;
        this.discardChangesDialog = zu.h.b(wVarA2);
        Boolean bool = Boolean.FALSE;
        zu.w wVarA3 = zu.m0.a(bool);
        this._isSearchMode = wVarA3;
        zu.w wVarA4 = zu.m0.a(new t0("", 0L, (g3) null, 6, (ju.k) null));
        this._searchQueryFieldValue = wVarA4;
        this._actionMode = zu.m0.a(c.b.f30351a);
        zu.w wVarA5 = zu.m0.a(TermiusSortType.ByNameAscending);
        this._hostsSortingMode = wVarA5;
        zu.w wVarA6 = zu.m0.a(vt.v.o());
        this._groupItems = wVarA6;
        this._needShowAddLocalHostButton = zu.m0.a(bool);
        zu.w wVarA7 = zu.m0.a(bool);
        this._showDiscoverLocalDevices = wVarA7;
        this.showDiscoverLocalDevices = zu.h.b(wVarA7);
        this._showContextActions = zu.m0.a(a.C0202a.f13051a);
        this._showAddEntityActions = zu.m0.a(bool);
        this._showSortTypeSelector = zu.m0.a(bool);
        this._showGroupBreadcrumbsSelector = zu.m0.a(bool);
        this.filteredContainers = new ArrayList<>();
        this.vaultWizardId = "";
        List list = null;
        List list2 = null;
        List list3 = null;
        zu.w wVarA8 = zu.m0.a(new a.b(list, list2, list3, null, 15, null));
        this._allHostsDBModels = wVarA8;
        zu.w wVarA9 = zu.m0.a(null);
        this._willingGroupId = wVarA9;
        zu.f fVarA = androidx.lifecycle.m.a(b2Var.y1().b("show_rate_us_hosts_item", false));
        wu.i0 i0VarA = j1.a(this);
        g0.a aVar = zu.g0.f88389a;
        k0 k0VarP = zu.h.P(fVarA, i0VarA, g0.a.b(aVar, 5000L, 0L, 2, null), bool);
        this._isRateUsVirtualItemEnabled = k0VarP;
        zu.f fVarI = zu.h.i(wVarA8, connectionTabBarItems, k0VarP, new i(null));
        this._hostsAndActiveConnections = fVarI;
        zu.f fVarK = zu.h.K(zu.h.k(fVarI, wVarA9, wVarA5, fVarE, wVarA3, new g(null)), new h(null));
        this._fullContainersFlow = fVarK;
        zu.f fVarH = zu.h.h(fVarK, wVarA4, new f(null));
        this._filteredItems = fVarH;
        this.filteredItems = zu.h.P(zu.h.L(fVarH, new o(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), new e(null, null, null, null, false, null, null, null, null, null, 1023, null));
        this.emptyScreenStateFlow = zu.h.P(new v(fVarH, this), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), a.b.f69469a);
        this.hostsToChangeGroup = new ArrayList();
        this._onGroupSelected = zu.m0.a(new ut.u(bool, null));
        this.isFabVisible = zu.h.P(zu.h.h(wVarA6, fVarE, new p(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), bool);
        this.latestTriggerProcessor = new cg.a(j1.a(this));
        this.vaultsInteractor$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.s
            @Override // iu.a
            public final Object a() {
                return HostsScreenViewModel.vaultsInteractor_delegate$lambda$2(this.f34978a);
            }
        });
        kp.c cVar = new kp.c(new in.c(g0VarY1));
        this.getTeamAccessStatusUseCase = cVar;
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        ju.t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        GroupDBAdapter groupDBAdapterH2 = hg.f.p().h();
        ju.t.e(groupDBAdapterH2, "getGroupDBAdapter(...)");
        TagDBAdapter tagDBAdapterA02 = hg.f.p().a0();
        ju.t.e(tagDBAdapterA02, "getTagDBAdapter(...)");
        TagHostDBAdapter tagHostDBAdapterC02 = hg.f.p().c0();
        ju.t.e(tagHostDBAdapterC02, "getTagHostDBAdapter(...)");
        wu.j1 j1VarG1 = b2Var.g1();
        gj.a aVarE = gj.a.f51371c.e();
        ju.t.e(aVarN, "termiusStorage");
        this.getHostsScreenItemsUseCase = new ml.a(hostsDBAdapterI, groupDBAdapterH2, tagDBAdapterA02, tagHostDBAdapterC02, j1VarG1, aVarE, aVarN, null, null, null, null, cVar, 1920, null);
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object determineEmptyScreenState(java.util.List<? extends com.server.auditor.ssh.client.fragments.hostngroups.d> r5, java.util.List<tl.l2> r6, boolean r7, boolean r8, java.lang.String r9, zt.e<? super op.a> r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.j
            if (r0 == 0) goto L13
            r0 = r10
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel$j r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.j) r0
            int r1 = r0.f34097f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34097f = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel$j r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f34095d
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f34097f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r8 = r0.f34093b
            boolean r7 = r0.f34092a
            java.lang.Object r5 = r0.f34094c
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            ut.x.b(r10)
            goto L69
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            ut.x.b(r10)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L46
            op.a$b r5 = op.a.b.f69469a
            return r5
        L46:
            int r5 = r6.size()
            if (r5 != r3) goto L7a
            java.lang.Object r5 = vt.v.p0(r6)
            tl.l2 r5 = (tl.l2) r5
            boolean r5 = sp.a.g(r5)
            if (r5 == 0) goto L7a
            kp.c r5 = r4.getTeamAccessStatusUseCase
            r0.f34094c = r9
            r0.f34092a = r7
            r0.f34093b = r8
            r0.f34097f = r3
            java.lang.Object r10 = r5.b(r0)
            if (r10 != r1) goto L69
            return r1
        L69:
            jp.a r10 = (jp.a) r10
            boolean r5 = jp.b.a(r10)
            if (r5 == 0) goto L74
            op.a$c r5 = op.a.c.f69470a
            return r5
        L74:
            op.a$a r5 = new op.a$a
            r5.<init>(r7, r8, r9)
            return r5
        L7a:
            op.a$a r5 = new op.a$a
            r5.<init>(r7, r8, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel.determineEmptyScreenState(java.util.List, java.util.List, boolean, boolean, java.lang.String, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gj.b getVaultsInteractor() {
        return (gj.b) this.vaultsInteractor$delegate.getValue();
    }

    private final vl.g getVaultsRepository() {
        return (vl.g) this.vaultsRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGroupItems(List<u6> list, boolean z10) {
        wu.k.d(j1.a(this), null, null, new a0(list, z10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGroupNavigation(Long l10, boolean z10) {
        wu.k.d(j1.a(this), null, null, new b0(l10, z10, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateShowContextActions$default(HostsScreenViewModel hostsScreenViewModel, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = vt.v.o();
        }
        hostsScreenViewModel.updateShowContextActions(z10, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gj.b vaultsInteractor_delegate$lambda$2(HostsScreenViewModel hostsScreenViewModel) {
        return new gj.b(hostsScreenViewModel.getVaultsRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.g vaultsRepository_delegate$lambda$0() {
        return vl.g.f83702b.b();
    }

    public final void dismissActionMode() {
        wu.k.d(j1.a(this), null, null, new k(null), 3, null);
    }

    public final void dismissDiscardChangesDialog() {
        wu.k.d(j1.a(this), null, null, new l(null), 3, null);
    }

    public final void dismissDiscoverLocalDevices() {
        wu.k.d(j1.a(this), null, null, new m(null), 3, null);
    }

    public final void duplicateHost(Host host) {
        ju.t.f(host, "host");
        wu.k.d(j1.a(this), null, null, new n(host, null), 3, null);
    }

    public final k0 getActionMode() {
        return zu.h.b(this._actionMode);
    }

    public final Long getCurrentGroupId() {
        return this.currentGroupId;
    }

    public final k0 getDiscardChangesDialog() {
        return this.discardChangesDialog;
    }

    public final k0 getEditingState() {
        return this.editingState;
    }

    public final k0 getEmptyScreenStateFlow() {
        return this.emptyScreenStateFlow;
    }

    public final ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> getFilteredContainers() {
        return this.filteredContainers;
    }

    public final k0 getFilteredItems() {
        return this.filteredItems;
    }

    public final k0 getGroupItems() {
        return this._groupItems;
    }

    public final k0 getHostsSortingMode() {
        return zu.h.b(this._hostsSortingMode);
    }

    public final List<Long> getHostsToChangeGroup() {
        return this.hostsToChangeGroup;
    }

    public final k0 getNeedShowAddLocalHostButton() {
        return this._needShowAddLocalHostButton;
    }

    public final k0 getOnGroupSelected() {
        return this._onGroupSelected;
    }

    public final k0 getSearchQueryFieldValue() {
        return this._searchQueryFieldValue;
    }

    public final SparseBooleanArray getSelectedItems() {
        return this.selectedItems;
    }

    public final k0 getShowAddEntityActions() {
        return this._showAddEntityActions;
    }

    public final k0 getShowContextActions() {
        return this._showContextActions;
    }

    public final k0 getShowDiscoverLocalDevices() {
        return this.showDiscoverLocalDevices;
    }

    public final k0 getShowGroupBreadcrumbsSelector() {
        return this._showGroupBreadcrumbsSelector;
    }

    public final k0 getShowSortTypeSelector() {
        return this._showSortTypeSelector;
    }

    public final String getVaultWizardId() {
        return this.vaultWizardId;
    }

    public final k0 isFabVisible() {
        return this.isFabVisible;
    }

    public final boolean isRateUsBottomSheetDialogShowing() {
        return this.isRateUsBottomSheetDialogShowing;
    }

    public final k0 isSearchMode() {
        return this._isSearchMode;
    }

    public final void onBackToPersonalVaultClick() {
        wu.k.d(j1.a(this), null, null, new q(null), 3, null);
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        this.hostsToChangeGroup.clear();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void onCreateNewGroupClicked() {
        u6 u6Var = (u6) vt.v.r0((List) getGroupItems().getValue());
        sendFragmentAction(new q.a(new HostsNavGraphRoute.EditGroupRoute((Long) null, u6Var != null ? u6Var.a() : null, 1, (ju.k) null)));
    }

    public final void onGroupSelected(boolean z10, Long l10) {
        wu.k.d(j1.a(this), null, null, new r(z10, l10, null), 3, null);
    }

    public final void onVaultsModeUpdated(op.n nVar) {
        ju.t.f(nVar, "vaultsSelectorState");
        wu.k.d(j1.a(this), null, null, new s(nVar, null), 3, null);
    }

    public final void resetEditing() {
        wu.k.d(j1.a(this), null, null, new t(null), 3, null);
    }

    public final void setCurrentGroupId(Long l10) {
        this.currentGroupId = l10;
    }

    public final void setFilteredContainers(ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> arrayList) {
        ju.t.f(arrayList, "<set-?>");
        this.filteredContainers = arrayList;
    }

    public final void setRateUsBottomSheetDialogShowing(boolean z10) {
        this.isRateUsBottomSheetDialogShowing = z10;
    }

    public final void setVaultWizardId(String str) {
        ju.t.f(str, "<set-?>");
        this.vaultWizardId = str;
    }

    public final void showDiscoverLocalDevices() {
        wu.k.d(j1.a(this), null, null, new u(null), 3, null);
    }

    public final void updateActionMode(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
        ju.t.f(cVar, "hostsTopBarState");
        wu.k.d(j1.a(this), null, null, new w(cVar, null), 3, null);
    }

    public final void updateAddEntityBottomSheetVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new x(z10, null), 3, null);
    }

    public final void updateEditingId(Long l10) {
        wu.k.d(j1.a(this), null, null, new y(l10, null), 3, null);
    }

    public final void updateGroupBreadcrumbBottomSheetVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new z(z10, null), 3, null);
    }

    public final void updateHostsSortingMode(TermiusSortType termiusSortType) {
        ju.t.f(termiusSortType, Column.TYPE);
        wu.k.d(j1.a(this), null, null, new c0(termiusSortType, null), 3, null);
    }

    public final void updateList(Long l10) {
        wu.k.d(j1.a(this), null, null, new d0(l10, null), 3, null);
        this.latestTriggerProcessor.b(new e0(null));
    }

    public final void updateSearchMode(boolean z10) {
        wu.k.d(j1.a(this), null, null, new f0(z10, null), 3, null);
    }

    public final void updateSearchQuery(t0 t0Var) {
        ju.t.f(t0Var, "query");
        wu.k.d(j1.a(this), x0.c().P2(), null, new g0(t0Var, null), 2, null);
    }

    public final void updateShowContextActions(boolean z10, List<? extends com.server.auditor.ssh.client.navigation.ui.compose.a> list) {
        ju.t.f(list, "options");
        wu.k.d(j1.a(this), null, null, new h0(z10, list, null), 3, null);
    }

    public final void updateShowDiscardChangesDialog(Object obj) {
        ju.t.f(obj, "route");
        wu.k.d(j1.a(this), null, null, new i0(obj, null), 3, null);
    }

    public final void updateSortBottomSheetVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new j0(z10, null), 3, null);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f34050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Long f34052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Boolean f34053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f34054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f34055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f34056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f34057h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List f34058i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f34059j;

        public e(List list, String str, Long l10, Boolean bool, boolean z10, List list2, List list3, List list4, List list5, List list6) {
            ju.t.f(list, "items");
            ju.t.f(str, "query");
            ju.t.f(list2, "selectedHostIds");
            ju.t.f(list3, "allHosts");
            ju.t.f(list4, "allGroups");
            ju.t.f(list5, "tagList");
            ju.t.f(list6, "tagHostList");
            this.f34050a = list;
            this.f34051b = str;
            this.f34052c = l10;
            this.f34053d = bool;
            this.f34054e = z10;
            this.f34055f = list2;
            this.f34056g = list3;
            this.f34057h = list4;
            this.f34058i = list5;
            this.f34059j = list6;
        }

        public static /* synthetic */ e b(e eVar, List list, String str, Long l10, Boolean bool, boolean z10, List list2, List list3, List list4, List list5, List list6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = eVar.f34050a;
            }
            if ((i10 & 2) != 0) {
                str = eVar.f34051b;
            }
            if ((i10 & 4) != 0) {
                l10 = eVar.f34052c;
            }
            if ((i10 & 8) != 0) {
                bool = eVar.f34053d;
            }
            if ((i10 & 16) != 0) {
                z10 = eVar.f34054e;
            }
            if ((i10 & 32) != 0) {
                list2 = eVar.f34055f;
            }
            if ((i10 & 64) != 0) {
                list3 = eVar.f34056g;
            }
            if ((i10 & 128) != 0) {
                list4 = eVar.f34057h;
            }
            if ((i10 & 256) != 0) {
                list5 = eVar.f34058i;
            }
            if ((i10 & File.FLAG_O_TRUNC) != 0) {
                list6 = eVar.f34059j;
            }
            List list7 = list5;
            List list8 = list6;
            List list9 = list3;
            List list10 = list4;
            boolean z11 = z10;
            List list11 = list2;
            return eVar.a(list, str, l10, bool, z11, list11, list9, list10, list7, list8);
        }

        public final e a(List list, String str, Long l10, Boolean bool, boolean z10, List list2, List list3, List list4, List list5, List list6) {
            ju.t.f(list, "items");
            ju.t.f(str, "query");
            ju.t.f(list2, "selectedHostIds");
            ju.t.f(list3, "allHosts");
            ju.t.f(list4, "allGroups");
            ju.t.f(list5, "tagList");
            ju.t.f(list6, "tagHostList");
            return new e(list, str, l10, bool, z10, list2, list3, list4, list5, list6);
        }

        public final Boolean c() {
            return this.f34053d;
        }

        public final List d() {
            return this.f34050a;
        }

        public final String e() {
            return this.f34051b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return ju.t.b(this.f34050a, eVar.f34050a) && ju.t.b(this.f34051b, eVar.f34051b) && ju.t.b(this.f34052c, eVar.f34052c) && ju.t.b(this.f34053d, eVar.f34053d) && this.f34054e == eVar.f34054e && ju.t.b(this.f34055f, eVar.f34055f) && ju.t.b(this.f34056g, eVar.f34056g) && ju.t.b(this.f34057h, eVar.f34057h) && ju.t.b(this.f34058i, eVar.f34058i) && ju.t.b(this.f34059j, eVar.f34059j);
        }

        public final Long f() {
            return this.f34052c;
        }

        public final List g() {
            return this.f34055f;
        }

        public final List h() {
            return this.f34059j;
        }

        public int hashCode() {
            int iHashCode = ((this.f34050a.hashCode() * 31) + this.f34051b.hashCode()) * 31;
            Long l10 = this.f34052c;
            int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            Boolean bool = this.f34053d;
            return ((((((((((((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.f34054e)) * 31) + this.f34055f.hashCode()) * 31) + this.f34056g.hashCode()) * 31) + this.f34057h.hashCode()) * 31) + this.f34058i.hashCode()) * 31) + this.f34059j.hashCode();
        }

        public final List i() {
            return this.f34058i;
        }

        public final boolean j() {
            return this.f34054e;
        }

        public String toString() {
            return "HostScreenItems(items=" + this.f34050a + ", query=" + this.f34051b + ", selectedGroupId=" + this.f34052c + ", hasEditPermissions=" + this.f34053d + ", isSharedGroup=" + this.f34054e + ", selectedHostIds=" + this.f34055f + ", allHosts=" + this.f34056g + ", allGroups=" + this.f34057h + ", tagList=" + this.f34058i + ", tagHostList=" + this.f34059j + ")";
        }

        public /* synthetic */ e(List list, String str, Long l10, Boolean bool, boolean z10, List list2, List list3, List list4, List list5, List list6, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? vt.v.o() : list, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? vt.v.o() : list2, (i10 & 64) != 0 ? vt.v.o() : list3, (i10 & 128) != 0 ? vt.v.o() : list4, (i10 & 256) != 0 ? vt.v.o() : list5, (i10 & File.FLAG_O_TRUNC) != 0 ? vt.v.o() : list6);
        }
    }
}
