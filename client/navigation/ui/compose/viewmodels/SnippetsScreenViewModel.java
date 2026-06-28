package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import android.content.SharedPreferences;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.RtlSpacingHelper;
import bk.a;
import ci.n0;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.navigation.ui.compose.TerminalSnippetsNavGraph;
import com.server.auditor.ssh.client.navigation.ui.compose.c;
import com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility;
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
import ut.m0;
import wu.i0;
import wu.j1;
import zu.g0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class SnippetsScreenViewModel extends FragmentWrapperViewModel<f, e> {
    private static SnippetsScreenViewModel composeViewModel;
    private static SnippetsScreenViewModel snippetPickerViewModel;
    private final zu.w _actionMode;
    private final zu.w _currentPackageName;
    private final zu.w _discardChangesDialog;
    private final zu.w _editingState;
    private final zu.v _filteredItems;
    private final zu.w _hasPermissionToPackage;
    private final zu.w _isDetailPanelActive;
    private final zu.w _isSearchMode;
    private final zu.w _onlySnippetSelected;
    private final zu.w _searchQueryFieldValue;
    private final zu.w _selectedItemsCount;
    private final zu.w _showAddEntityActions;
    private final zu.w _showContextActions;
    private final zu.w _showSortTypeSelector;
    private final zu.w _snippetsScreenSortingMode;
    private final zu.w _vaultsSelectorStateFlow;
    private long currentPackageId;
    private final k0 discardChangesDialog;
    private final k0 emptyScreenStateFlow;
    private final k0 fabVisibilityState;
    private final gj.a filterEntityHelper;
    private final List<n0.a> filteredContainers;
    private final il.q getSnippetsScreenItemsUseCase;
    private final kp.c getTeamAccessStatusUseCase;
    private boolean isSearchActive;
    private boolean isSnippetsPicker;
    private final hg.d keyValueRepository;
    private final tp.g0 liveSharedPreferences;
    private final SparseBooleanArray selectedItems;
    private final com.server.auditor.ssh.client.interactors.snippets.b snippetVariablesInteractor;
    private VaultKeyId targetVaultKeyId;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private String vaultWizardId;
    private final zu.f vaultsFlow;
    private final ut.n vaultsInteractor$delegate;
    private final dq.h0 vaultsPermissionsHelper;
    private final ut.n vaultsRepository$delegate;
    public static final d Companion = new d(null);
    public static final int $stable = 8;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34530a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel$a$a, reason: collision with other inner class name */
        static final class C0552a extends kotlin.coroutines.jvm.internal.m implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f34533b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34534c;

            C0552a(zt.e eVar) {
                super(3, eVar);
            }

            public final Object i(boolean z10, t0 t0Var, zt.e eVar) {
                C0552a c0552a = new C0552a(eVar);
                c0552a.f34533b = z10;
                c0552a.f34534c = t0Var;
                return c0552a.invokeSuspend(m0.f82633a);
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i(((Boolean) obj).booleanValue(), (t0) obj2, (zt.e) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34532a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return new e.h(this.f34533b, ((t0) this.f34534c).m());
            }
        }

        static final class b implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnippetsScreenViewModel f34535a;

            b(SnippetsScreenViewModel snippetsScreenViewModel) {
                this.f34535a = snippetsScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(e.h hVar, zt.e eVar) {
                this.f34535a.sendComposeAction(hVar);
                return m0.f82633a;
            }
        }

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34530a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(zu.h.h(SnippetsScreenViewModel.this._isSearchMode, SnippetsScreenViewModel.this._searchQueryFieldValue, new C0552a(null)), 1);
                b bVar = new b(SnippetsScreenViewModel.this);
                this.f34530a = 1;
                if (fVarR.collect(bVar, this) == objF) {
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
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34536a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34538c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new a0(this.f34538c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34536a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._isSearchMode.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34538c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34539a;

        static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnippetsScreenViewModel f34541a;

            a(SnippetsScreenViewModel snippetsScreenViewModel) {
                this.f34541a = snippetsScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
                if (cVar instanceof c.b) {
                    this.f34541a.sendComposeAction(e.a.f34554a);
                }
                return m0.f82633a;
            }
        }

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34539a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(SnippetsScreenViewModel.this.getActionMode(), 1);
                a aVar = new a(SnippetsScreenViewModel.this);
                this.f34539a = 1;
                if (fVarR.collect(aVar, this) == objF) {
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
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34542a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f34544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f34544c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new b0(this.f34544c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34542a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._searchQueryFieldValue.setValue(this.f34544c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34545a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34545a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = SnippetsScreenViewModel.this._snippetsScreenSortingMode;
            hg.d dVar = SnippetsScreenViewModel.this.keyValueRepository;
            TermiusSortType termiusSortType = com.server.auditor.ssh.client.fragments.hostngroups.j.f25092a;
            String string = dVar.getString("termius_snippets_list_sort_type", termiusSortType.name());
            if (string == null) {
                string = termiusSortType.name();
            }
            wVar.setValue(TermiusSortType.valueOf(string));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34547a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(int i10, zt.e eVar) {
            super(2, eVar);
            this.f34549c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new c0(this.f34549c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34547a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._selectedItemsCount.setValue(kotlin.coroutines.jvm.internal.b.d(this.f34549c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class d {
        public /* synthetic */ d(ju.k kVar) {
            this();
        }

        public final SnippetsScreenViewModel a() {
            return SnippetsScreenViewModel.composeViewModel;
        }

        public final SnippetsScreenViewModel b() {
            return SnippetsScreenViewModel.snippetPickerViewModel;
        }

        public final void c(SnippetsScreenViewModel snippetsScreenViewModel) {
            SnippetsScreenViewModel.composeViewModel = snippetsScreenViewModel;
        }

        public final void d(SnippetsScreenViewModel snippetsScreenViewModel) {
            SnippetsScreenViewModel.snippetPickerViewModel = snippetsScreenViewModel;
        }

        private d() {
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34550a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f34553d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(boolean z10, List list, zt.e eVar) {
            super(2, eVar);
            this.f34552c = z10;
            this.f34553d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new d0(this.f34552c, this.f34553d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34550a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._showContextActions.setValue(this.f34552c ? new a.b(this.f34553d) : a.C0202a.f13051a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public interface e {

        public static final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34554a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1749872689;
            }

            public String toString() {
                return "FinishActionMode";
            }
        }

        public static final class b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f34555a;

            public b(int i10) {
                this.f34555a = i10;
            }

            public final int a() {
                return this.f34555a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f34555a == ((b) obj).f34555a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f34555a);
            }

            public String toString() {
                return "OnActionItemClick(itemId=" + this.f34555a + ")";
            }
        }

        public static final class c implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34556a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1341933126;
            }

            public String toString() {
                return "OnInviteTeamMemberClick";
            }
        }

        public static final class d implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f34557a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1258984768;
            }

            public String toString() {
                return "OnNewPackageClick";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel$e$e, reason: collision with other inner class name */
        public static final class C0553e implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0553e f34558a = new C0553e();

            private C0553e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0553e);
            }

            public int hashCode() {
                return 1456031433;
            }

            public String toString() {
                return "OnNewSnippetClick";
            }
        }

        public static final class f implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f34559a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 2037927732;
            }

            public String toString() {
                return "OnRunSnippetClick";
            }
        }

        public static final class g implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34560a;

            public g(long j10) {
                this.f34560a = j10;
            }

            public final long a() {
                return this.f34560a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f34560a == ((g) obj).f34560a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34560a);
            }

            public String toString() {
                return "UpdateList(packageId=" + this.f34560a + ")";
            }
        }

        public static final class h implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f34561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34562b;

            public h(boolean z10, String str) {
                ju.t.f(str, "query");
                this.f34561a = z10;
                this.f34562b = str;
            }

            public final boolean a() {
                return this.f34561a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.f34561a == hVar.f34561a && ju.t.b(this.f34562b, hVar.f34562b);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f34561a) * 31) + this.f34562b.hashCode();
            }

            public String toString() {
                return "UpdateSearch(isSearchMode=" + this.f34561a + ", query=" + this.f34562b + ")";
            }
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34563a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f34565c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(Object obj, zt.e eVar) {
            super(2, eVar);
            this.f34565c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new e0(this.f34565c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34563a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._discardChangesDialog.setValue(new a7.b(this.f34565c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public interface f {

        public static final class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34566a;

            public a(long j10) {
                this.f34566a = j10;
            }

            public final long a() {
                return this.f34566a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f34566a == ((a) obj).f34566a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34566a);
            }

            public String toString() {
                return "OnPackageNavigation(packageId=" + this.f34566a + ")";
            }
        }

        public static final class b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34567a;

            public b(Object obj) {
                ju.t.f(obj, "route");
                this.f34567a = obj;
            }

            public final Object a() {
                return this.f34567a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f34567a, ((b) obj).f34567a);
            }

            public int hashCode() {
                return this.f34567a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34567a + ")";
            }
        }

        public static final class c implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SnippetItem f34568a;

            public c(SnippetItem snippetItem) {
                ju.t.f(snippetItem, "snippetItem");
                this.f34568a = snippetItem;
            }

            public final SnippetItem a() {
                return this.f34568a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && ju.t.b(this.f34568a, ((c) obj).f34568a);
            }

            public int hashCode() {
                return this.f34568a.hashCode();
            }

            public String toString() {
                return "OnSnippetExecuteAction(snippetItem=" + this.f34568a + ")";
            }
        }

        public static final class d implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34569a;

            public d(long j10) {
                this.f34569a = j10;
            }

            public final long a() {
                return this.f34569a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f34569a == ((d) obj).f34569a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34569a);
            }

            public String toString() {
                return "OnSnippetPickerResult(snippetId=" + this.f34569a + ")";
            }
        }

        public static final class e implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.server.auditor.ssh.client.navigation.ui.compose.c f34570a;

            public e(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
                ju.t.f(cVar, "mode");
                this.f34570a = cVar;
            }

            public final com.server.auditor.ssh.client.navigation.ui.compose.c a() {
                return this.f34570a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && ju.t.b(this.f34570a, ((e) obj).f34570a);
            }

            public int hashCode() {
                return this.f34570a.hashCode();
            }

            public String toString() {
                return "OnTopBarModeChange(mode=" + this.f34570a + ")";
            }
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34571a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f34573c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(TermiusSortType termiusSortType, zt.e eVar) {
            super(2, eVar);
            this.f34573c = termiusSortType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new f0(this.f34573c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34571a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            hg.d dVar = SnippetsScreenViewModel.this.keyValueRepository;
            ju.t.e(dVar, "access$getKeyValueRepository$p(...)");
            TermiusSortType termiusSortType = this.f34573c;
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.putString("termius_snippets_list_sort_type", termiusSortType.name());
            editorEdit.apply();
            SnippetsScreenViewModel.this._snippetsScreenSortingMode.setValue(this.f34573c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f34574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f34576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Boolean f34577d;

        public g(List list, String str, long j10, Boolean bool) {
            ju.t.f(list, "items");
            ju.t.f(str, "query");
            this.f34574a = list;
            this.f34575b = str;
            this.f34576c = j10;
            this.f34577d = bool;
        }

        public final Boolean a() {
            return this.f34577d;
        }

        public final List b() {
            return this.f34574a;
        }

        public final String c() {
            return this.f34575b;
        }

        public final long d() {
            return this.f34576c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return ju.t.b(this.f34574a, gVar.f34574a) && ju.t.b(this.f34575b, gVar.f34575b) && this.f34576c == gVar.f34576c && ju.t.b(this.f34577d, gVar.f34577d);
        }

        public int hashCode() {
            int iHashCode = ((((this.f34574a.hashCode() * 31) + this.f34575b.hashCode()) * 31) + Long.hashCode(this.f34576c)) * 31;
            Boolean bool = this.f34577d;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "SnippetsScreenItems(items=" + this.f34574a + ", query=" + this.f34575b + ", selectedPackageId=" + this.f34576c + ", hasEditPermission=" + this.f34577d + ")";
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34578a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34580c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34580c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new g0(this.f34580c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34578a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._showSortTypeSelector.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34580c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g0) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34583c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f34585e;

        h(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34583c = obj;
            this.f34585e |= RtlSpacingHelper.UNDEFINED;
            return SnippetsScreenViewModel.this.determineEmptyScreenState(null, null, null, null, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34586a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34586a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._actionMode.setValue(c.b.f30351a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34588a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34588a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._discardChangesDialog.setValue(a7.a.f68126a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f34591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ int f34592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ boolean f34593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ boolean f34594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f34595f;

        k(zt.e eVar) {
            super(6, eVar);
        }

        @Override // iu.t
        public /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return i(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (List) obj5, (zt.e) obj6);
        }

        public final Object i(boolean z10, int i10, boolean z11, boolean z12, List list, zt.e eVar) {
            k kVar = SnippetsScreenViewModel.this.new k(eVar);
            kVar.f34591b = z10;
            kVar.f34592c = i10;
            kVar.f34593d = z11;
            kVar.f34594e = z12;
            kVar.f34595f = list;
            return kVar.invokeSuspend(m0.f82633a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r9.f34590a
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                boolean r0 = r9.f34594e
                boolean r1 = r9.f34593d
                int r3 = r9.f34592c
                boolean r4 = r9.f34591b
                ut.x.b(r10)
                goto L79
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                ut.x.b(r10)
                boolean r4 = r9.f34591b
                int r3 = r9.f34592c
                boolean r1 = r9.f34593d
                boolean r10 = r9.f34594e
                java.lang.Object r5 = r9.f34595f
                java.util.List r5 = (java.util.List) r5
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L37:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L4e
                java.lang.Object r7 = r5.next()
                r8 = r7
                tl.l2 r8 = (tl.l2) r8
                boolean r8 = r8.i()
                if (r8 == 0) goto L37
                r6.add(r7)
                goto L37
            L4e:
                int r5 = r6.size()
                if (r5 != r2) goto L85
                java.lang.Object r5 = vt.v.p0(r6)
                tl.l2 r5 = (tl.l2) r5
                boolean r5 = sp.a.g(r5)
                if (r5 == 0) goto L85
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel r5 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.this
                kp.c r5 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.access$getGetTeamAccessStatusUseCase$p(r5)
                r9.f34591b = r4
                r9.f34592c = r3
                r9.f34593d = r1
                r9.f34594e = r10
                r9.f34590a = r2
                java.lang.Object r5 = r5.b(r9)
                if (r5 != r0) goto L77
                return r0
            L77:
                r0 = r10
                r10 = r5
            L79:
                jp.a r10 = (jp.a) r10
                boolean r10 = jp.b.a(r10)
                if (r10 == 0) goto L84
                com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility r10 = com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility.HIDDEN
                return r10
            L84:
                r10 = r0
            L85:
                if (r10 == 0) goto L8a
                com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility r10 = com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility.HIDDEN
                return r10
            L8a:
                if (r4 == 0) goto L91
                if (r3 != 0) goto L91
                com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility r10 = com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility.VISIBLE_ADD
                return r10
            L91:
                if (r4 == 0) goto L9a
                if (r3 != r2) goto L9a
                if (r1 == 0) goto L9a
                com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility r10 = com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility.VISIBLE_RUN
                return r10
            L9a:
                com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility r10 = com.server.auditor.ssh.client.navigation.ui.compose.snippets.SnippetsScreenFABVisibility.HIDDEN
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34597a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34597a;
            if (i10 == 0) {
                ut.x.b(obj);
                gj.b vaultsInteractor = SnippetsScreenViewModel.this.getVaultsInteractor();
                this.f34597a = 1;
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
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34599a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34599a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._editingState.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, true, false));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34601a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnippetItem f34603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(SnippetItem snippetItem, zt.e eVar) {
            super(2, eVar);
            this.f34603c = snippetItem;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new n(this.f34603c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34601a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            boolean z10 = SnippetsScreenViewModel.this.snippetVariablesInteractor.a(SnippetsScreenViewModel.this.snippetVariablesInteractor.c(this.f34603c.getScriptStructure())) > 0;
            if (SnippetsScreenViewModel.this.snippetVariablesInteractor.b(this.f34603c) && z10) {
                SnippetsScreenViewModel.this.sendFragmentAction(new f.b(new TerminalSnippetsNavGraph.SnippetVariableSetup(this.f34603c.getId())));
            } else {
                SnippetsScreenViewModel.this.sendFragmentAction(new f.c(this.f34603c));
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
        int f34604a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ op.n f34606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(op.n nVar, zt.e eVar) {
            super(2, eVar);
            this.f34606c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new o(this.f34606c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34604a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._vaultsSelectorStateFlow.setValue(this.f34606c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34607a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34607a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._editingState.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, false, false, 7, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class q implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f34609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SnippetsScreenViewModel f34610b;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f34611a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SnippetsScreenViewModel f34612b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel$q$a$a, reason: collision with other inner class name */
            public static final class C0554a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34613a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f34614b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f34615c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f34617e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f34618f;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f34619u;

                public C0554a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34613a = obj;
                    this.f34614b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar, SnippetsScreenViewModel snippetsScreenViewModel) {
                this.f34611a = gVar;
                this.f34612b = snippetsScreenViewModel;
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
            
                if (r13.emit(r14, r6) != r0) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, zt.e r14) {
                /*
                    Method dump skipped, instruction units count: 210
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.q.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public q(zu.f fVar, SnippetsScreenViewModel snippetsScreenViewModel) {
            this.f34609a = fVar;
            this.f34610b = snippetsScreenViewModel;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f34609a.collect(new a(gVar, this.f34610b), eVar);
            return objCollect == au.b.f() ? objCollect : m0.f82633a;
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34620a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.navigation.ui.compose.c f34622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
            super(2, eVar);
            this.f34622c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new r(this.f34622c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34620a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._actionMode.setValue(this.f34622c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34623a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34625c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new s(this.f34625c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34623a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._showAddEntityActions.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34625c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34628c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f34630e;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f34632b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, zt.e eVar) {
                super(2, eVar);
                this.f34632b = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f34632b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34631a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return hg.f.p().O().getItemByLocalId(this.f34632b);
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(long j10, zt.e eVar) {
            super(2, eVar);
            this.f34630e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new t(this.f34630e, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[PHI: r1 r6 r13
          0x00bd: PHI (r1v10 zu.w) = (r1v9 zu.w), (r1v9 zu.w), (r1v12 zu.w) binds: [B:26:0x0098, B:28:0x009e, B:33:0x00b6] A[DONT_GENERATE, DONT_INLINE]
          0x00bd: PHI (r6v3 boolean) = (r6v0 boolean), (r6v0 boolean), (r6v4 boolean) binds: [B:26:0x0098, B:28:0x009e, B:33:0x00b6] A[DONT_GENERATE, DONT_INLINE]
          0x00bd: PHI (r13v9 com.server.auditor.ssh.client.database.models.SnippetPackageDBModel) = 
          (r13v7 com.server.auditor.ssh.client.database.models.SnippetPackageDBModel)
          (r13v7 com.server.auditor.ssh.client.database.models.SnippetPackageDBModel)
          (r13v12 com.server.auditor.ssh.client.database.models.SnippetPackageDBModel)
         binds: [B:26:0x0098, B:28:0x009e, B:33:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34633a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f34635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(Long l10, zt.e eVar) {
            super(2, eVar);
            this.f34635c = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new u(this.f34635c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34633a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = SnippetsScreenViewModel.this._editingState;
            Long l10 = this.f34635c;
            wVar.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(l10, l10 != null, false, 4, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34636a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34638c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34638c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new v(this.f34638c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34636a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._editingState.setValue(com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f.b((com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f) SnippetsScreenViewModel.this._editingState.getValue(), null, false, this.f34638c, 3, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34639a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34641c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new w(this.f34641c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34639a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._isDetailPanelActive.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34641c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34642a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f34644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(long j10, zt.e eVar) {
            super(2, eVar);
            this.f34644c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new x(this.f34644c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r11.f34642a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                ut.x.b(r12)
                r10 = r11
                goto L90
            L14:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1c:
                ut.x.b(r12)
                r10 = r11
                goto L52
            L21:
                ut.x.b(r12)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel r12 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.this
                il.q r4 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.access$getGetSnippetsScreenItemsUseCase$p(r12)
                long r5 = r11.f34644c
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel r12 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.this
                zu.w r12 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.access$get_searchQueryFieldValue$p(r12)
                java.lang.Object r12 = r12.getValue()
                j3.t0 r12 = (j3.t0) r12
                java.lang.String r7 = r12.m()
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel r12 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.this
                boolean r8 = r12.isSnippetsPicker()
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel r12 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.this
                com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r9 = r12.getTargetVaultKeyId()
                r11.f34642a = r3
                r10 = r11
                java.lang.Object r12 = r4.c(r5, r7, r8, r9, r10)
                if (r12 != r0) goto L52
                goto L8f
            L52:
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel$g r12 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.g) r12
                java.util.List r1 = r12.b()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L81
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.access$get_actionMode$p(r1)
                java.lang.Object r1 = r1.getValue()
                boolean r1 = r1 instanceof com.server.auditor.ssh.client.navigation.ui.compose.c.a
                if (r1 == 0) goto L81
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.access$get_actionMode$p(r1)
            L72:
                java.lang.Object r3 = r1.getValue()
                r4 = r3
                com.server.auditor.ssh.client.navigation.ui.compose.c r4 = (com.server.auditor.ssh.client.navigation.ui.compose.c) r4
                com.server.auditor.ssh.client.navigation.ui.compose.c$b r4 = com.server.auditor.ssh.client.navigation.ui.compose.c.b.f30351a
                boolean r3 = r1.g(r3, r4)
                if (r3 == 0) goto L72
            L81:
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.this
                zu.v r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.access$get_filteredItems$p(r1)
                r10.f34642a = r2
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto L90
            L8f:
                return r0
            L90:
                ut.m0 r12 = ut.m0.f82633a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34645a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34647c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34647c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new y(this.f34647c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34645a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this._onlySnippetSelected.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34647c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34648a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f34650c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(long j10, zt.e eVar) {
            super(2, eVar);
            this.f34650c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetsScreenViewModel.this.new z(this.f34650c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34648a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetsScreenViewModel.this.sendFragmentAction(new f.a(this.f34650c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SnippetsScreenViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        tp.g0 g0VarY1 = b2Var.y1();
        this.liveSharedPreferences = g0VarY1;
        hg.d dVarM = aVarN.M();
        this.keyValueRepository = dVarM;
        this._vaultsSelectorStateFlow = zu.m0.a(new op.n(false, null, 3, null));
        ju.t.e(aVarN, "termiusStorage");
        this.snippetVariablesInteractor = new com.server.auditor.ssh.client.interactors.snippets.b(aVarN);
        vl.g gVarB = vl.g.f83702b.b();
        j1 j1VarG1 = b2Var.g1();
        ju.t.e(aVarN, "termiusStorage");
        this.vaultsPermissionsHelper = new dq.h0(gVarB, j1VarG1, aVarN);
        this.currentPackageId = -1L;
        this.vaultWizardId = "";
        this._editingState = zu.m0.a(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, false, false, 7, null));
        this._currentPackageName = zu.m0.a("");
        Boolean bool = Boolean.FALSE;
        this._isSearchMode = zu.m0.a(bool);
        this._searchQueryFieldValue = zu.m0.a(new t0("", 0L, (g3) null, 6, (ju.k) null));
        this._actionMode = zu.m0.a(c.b.f30351a);
        zu.w wVarA = zu.m0.a(a7.a.f68126a);
        this._discardChangesDialog = wVarA;
        this.discardChangesDialog = zu.h.b(wVarA);
        this._snippetsScreenSortingMode = zu.m0.a(TermiusSortType.ByNameAscending);
        this.selectedItems = new SparseBooleanArray();
        zu.w wVarA2 = zu.m0.a(Boolean.TRUE);
        this._hasPermissionToPackage = wVarA2;
        zu.w wVarA3 = zu.m0.a(0);
        this._selectedItemsCount = wVarA3;
        zu.w wVarA4 = zu.m0.a(bool);
        this._onlySnippetSelected = wVarA4;
        zu.w wVarA5 = zu.m0.a(bool);
        this._isDetailPanelActive = wVarA5;
        this._showContextActions = zu.m0.a(a.C0202a.f13051a);
        this._showAddEntityActions = zu.m0.a(bool);
        this._showSortTypeSelector = zu.m0.a(bool);
        this.targetVaultKeyId = VaultKeyId.Companion.a();
        a.C0770a c0770a = gj.a.f51371c;
        this.filterEntityHelper = c0770a.e();
        zu.v vVarB = zu.c0.b(1, 0, null, 6, null);
        this._filteredItems = vVarB;
        this.filteredContainers = new ArrayList();
        q qVar = new q(vVarB, this);
        i0 i0VarA = androidx.lifecycle.j1.a(this);
        g0.a aVar = zu.g0.f88389a;
        this.emptyScreenStateFlow = zu.h.P(qVar, i0VarA, g0.a.b(aVar, 5000L, 0L, 2, null), a.b.f69469a);
        this.vaultsRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.d0
            @Override // iu.a
            public final Object a() {
                return SnippetsScreenViewModel.vaultsRepository_delegate$lambda$1();
            }
        });
        this.vaultsInteractor$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.e0
            @Override // iu.a
            public final Object a() {
                return SnippetsScreenViewModel.vaultsInteractor_delegate$lambda$2(this.f34964a);
            }
        });
        SnippetDBAdapter snippetDBAdapterJ = hg.f.p().J();
        ju.t.e(snippetDBAdapterJ, "getSnippetDBAdapter(...)");
        SnippetPackageDBAdapter snippetPackageDBAdapterO = hg.f.p().O();
        ju.t.e(snippetPackageDBAdapterO, "getSnippetPackageDBAdapter(...)");
        j1 j1VarG12 = b2Var.g1();
        gj.a aVarE = c0770a.e();
        ju.t.e(dVarM, "keyValueRepository");
        this.getSnippetsScreenItemsUseCase = new il.q(snippetDBAdapterJ, snippetPackageDBAdapterO, j1VarG12, aVarE, dVarM, null, getVaultsRepository(), 32, null);
        this.getTeamAccessStatusUseCase = new kp.c(new in.c(g0VarY1));
        zu.f fVarE = getVaultsRepository().e();
        this.vaultsFlow = fVarE;
        this.fabVisibilityState = zu.h.P(zu.h.k(wVarA2, wVarA3, wVarA4, wVarA5, fVarE, new k(null)), androidx.lifecycle.j1.a(this), aVar.c(), SnippetsScreenFABVisibility.VISIBLE_ADD);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new a(null), 3, null);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new b(null), 3, null);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object determineEmptyScreenState(java.util.List<? extends ci.n0.a> r8, java.util.List<tl.l2> r9, java.lang.Boolean r10, java.lang.String r11, zt.e<? super op.a> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.h
            if (r0 == 0) goto L13
            r0 = r12
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel$h r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.h) r0
            int r1 = r0.f34585e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34585e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel$h r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f34583c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f34585e
            r3 = -1
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 != r6) goto L36
            java.lang.Object r8 = r0.f34582b
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r0.f34581a
            r10 = r8
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            ut.x.b(r12)
            goto L6b
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            ut.x.b(r12)
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4a
            op.a$b r8 = op.a.b.f69469a
            return r8
        L4a:
            int r8 = r9.size()
            if (r8 != r6) goto L8e
            java.lang.Object r8 = vt.v.p0(r9)
            tl.l2 r8 = (tl.l2) r8
            boolean r8 = sp.a.g(r8)
            if (r8 == 0) goto L8e
            kp.c r8 = r7.getTeamAccessStatusUseCase
            r0.f34581a = r10
            r0.f34582b = r11
            r0.f34585e = r6
            java.lang.Object r12 = r8.b(r0)
            if (r12 != r1) goto L6b
            return r1
        L6b:
            jp.a r12 = (jp.a) r12
            boolean r8 = jp.b.a(r12)
            if (r8 == 0) goto L76
            op.a$c r8 = op.a.c.f69470a
            return r8
        L76:
            op.a$a r8 = new op.a$a
            long r0 = r7.currentPackageId
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 == 0) goto L80
            r9 = r6
            goto L81
        L80:
            r9 = r5
        L81:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r5)
            boolean r10 = ju.t.b(r10, r12)
            r10 = r10 ^ r6
            r8.<init>(r9, r10, r11)
            return r8
        L8e:
            op.a$a r8 = new op.a$a
            long r0 = r7.currentPackageId
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 == 0) goto L98
            r9 = r6
            goto L99
        L98:
            r9 = r5
        L99:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r5)
            boolean r10 = ju.t.b(r10, r12)
            r10 = r10 ^ r6
            r8.<init>(r9, r10, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetsScreenViewModel.determineEmptyScreenState(java.util.List, java.util.List, java.lang.Boolean, java.lang.String, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gj.b getVaultsInteractor() {
        return (gj.b) this.vaultsInteractor$delegate.getValue();
    }

    private final vl.g getVaultsRepository() {
        return (vl.g) this.vaultsRepository$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateShowContextActions$default(SnippetsScreenViewModel snippetsScreenViewModel, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = vt.v.o();
        }
        snippetsScreenViewModel.updateShowContextActions(z10, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gj.b vaultsInteractor_delegate$lambda$2(SnippetsScreenViewModel snippetsScreenViewModel) {
        return new gj.b(snippetsScreenViewModel.getVaultsRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.g vaultsRepository_delegate$lambda$1() {
        return vl.g.f83702b.b();
    }

    public final void dismissActionMode() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new i(null), 3, null);
    }

    public final void dismissDiscardChangesDialog() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new j(null), 3, null);
    }

    public final k0 getActionMode() {
        return zu.h.b(this._actionMode);
    }

    public final long getCurrentPackageId() {
        return this.currentPackageId;
    }

    public final k0 getCurrentPackageName() {
        return this._currentPackageName;
    }

    public final k0 getDiscardChangesDialog() {
        return this.discardChangesDialog;
    }

    public final k0 getEditingState() {
        return this._editingState;
    }

    public final k0 getEmptyScreenStateFlow() {
        return this.emptyScreenStateFlow;
    }

    public final k0 getFabVisibilityState() {
        return this.fabVisibilityState;
    }

    public final gj.a getFilterEntityHelper() {
        return this.filterEntityHelper;
    }

    public final List<n0.a> getFilteredContainers() {
        return this.filteredContainers;
    }

    public final zu.a0 getFilteredItems() {
        return this._filteredItems;
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

    public final k0 getShowSortTypeSelector() {
        return this._showSortTypeSelector;
    }

    public final k0 getSnippetsScreenSortingMode() {
        return zu.h.b(this._snippetsScreenSortingMode);
    }

    public final VaultKeyId getTargetVaultKeyId() {
        return this.targetVaultKeyId;
    }

    public final String getVaultWizardId() {
        return this.vaultWizardId;
    }

    public final boolean isSearchActive() {
        return this.isSearchActive;
    }

    public final k0 isSearchMode() {
        return this._isSearchMode;
    }

    public final boolean isSnippetsPicker() {
        return this.isSnippetsPicker;
    }

    public final void onBackToPersonalVaultClick() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new l(null), 3, null);
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        } else if (ju.t.b(snippetPickerViewModel, this)) {
            snippetPickerViewModel = null;
        }
    }

    public final void onStartCreatingNew() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new m(null), 3, null);
    }

    public final void onTerminalSnippetItemClick(SnippetItem snippetItem) {
        ju.t.f(snippetItem, "snippetItem");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new n(snippetItem, null), 3, null);
    }

    public final void onVaultsModeUpdated(op.n nVar) {
        ju.t.f(nVar, "vaultsSelectorState");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new o(nVar, null), 3, null);
    }

    public final void resetEditing() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new p(null), 3, null);
    }

    public final void setCurrentPackageId(long j10) {
        this.currentPackageId = j10;
    }

    public final void setSearchActive(boolean z10) {
        this.isSearchActive = z10;
    }

    public final void setSnippetsPicker(boolean z10) {
        this.isSnippetsPicker = z10;
    }

    public final void setTargetVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.targetVaultKeyId = vaultKeyId;
    }

    public final void setVaultWizardId(String str) {
        ju.t.f(str, "<set-?>");
        this.vaultWizardId = str;
    }

    public final void updateActionMode(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
        ju.t.f(cVar, "keychainTopBarState");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new r(cVar, null), 3, null);
    }

    public final void updateAddEntitySelectorVisibility(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new s(z10, null), 3, null);
    }

    public final void updateCurrentPackage(long j10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new t(j10, null), 3, null);
    }

    public final void updateEditingId(Long l10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new u(l10, null), 3, null);
    }

    public final void updateHasUnsavedChanges(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new v(z10, null), 3, null);
    }

    public final void updateIsDetailPaneActive(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new w(z10, null), 3, null);
    }

    public final void updateList(long j10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new x(j10, null), 3, null);
    }

    public final void updateOnlySnippetSelected(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new y(z10, null), 3, null);
    }

    public final void updatePackageNavigation(long j10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new z(j10, null), 3, null);
    }

    public final void updateSearchMode(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new a0(z10, null), 3, null);
    }

    public final void updateSearchQuery(t0 t0Var) {
        ju.t.f(t0Var, "query");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new b0(t0Var, null), 3, null);
    }

    public final void updateSelectedItemsCount(int i10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new c0(i10, null), 3, null);
    }

    public final void updateShowContextActions(boolean z10, List<? extends com.server.auditor.ssh.client.navigation.ui.compose.a> list) {
        ju.t.f(list, "options");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new d0(z10, list, null), 3, null);
    }

    public final void updateShowDiscardChangesDialog(Object obj) {
        ju.t.f(obj, "route");
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new e0(obj, null), 3, null);
    }

    public final void updateSnippetsScreenSortingMode(TermiusSortType termiusSortType) {
        ju.t.f(termiusSortType, Column.TYPE);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new f0(termiusSortType, null), 3, null);
    }

    public final void updateSortTypeSelectorVisibility(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new g0(z10, null), 3, null);
    }
}
