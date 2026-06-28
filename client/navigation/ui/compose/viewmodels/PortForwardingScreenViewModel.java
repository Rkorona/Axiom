package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import android.content.SharedPreferences;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.j1;
import bk.a;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.navigation.ui.compose.c;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import e3.g3;
import gj.a;
import hg.b2;
import j3.t0;
import java.util.ArrayList;
import java.util.List;
import ok.a7;
import op.a;
import tl.l2;
import uh.d;
import ut.m0;
import wu.i0;
import zu.g0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingScreenViewModel extends FragmentWrapperViewModel<f, e> {
    private static PortForwardingScreenViewModel composeViewModel;
    private final zu.w _actionMode;
    private final zu.w _discardChangesDialog;
    private final zu.w _editingState;
    private final zu.v _filteredItems;
    private final zu.w _isSearchMode;
    private final zu.w _portForwardingSortingMode;
    private final zu.w _searchQueryFieldValue;
    private final zu.w _showContextActions;
    private final zu.w _showSortTypeSelector;
    private final zu.w _vaultsSelectorStateFlow;
    private final k0 discardChangesDialog;
    private final k0 editingState;
    private final k0 emptyScreenStateFlow;
    private final gj.a filterEntityHelper;
    private final List<d.a> filteredContainers;
    private final il.p getPortForwardingScreenItemsUseCase;
    private final kp.c getTeamAccessStatusUseCase;
    private final k0 isFabVisible;
    private boolean isSearchActive;
    private final hg.d keyValueRepository;
    private final tp.g0 liveSharedPreferences;
    private final SparseBooleanArray selectedItems;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private String vaultWizardId;
    private final zu.f vaultsFlow;
    private final ut.n vaultsInteractor$delegate;
    private final ut.n vaultsRepository$delegate;
    public static final d Companion = new d(null);
    public static final int $stable = 8;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34424a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel$a$a, reason: collision with other inner class name */
        static final class C0547a extends kotlin.coroutines.jvm.internal.m implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34426a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f34427b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34428c;

            C0547a(zt.e eVar) {
                super(3, eVar);
            }

            public final Object i(boolean z10, t0 t0Var, zt.e eVar) {
                C0547a c0547a = new C0547a(eVar);
                c0547a.f34427b = z10;
                c0547a.f34428c = t0Var;
                return c0547a.invokeSuspend(m0.f82633a);
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i(((Boolean) obj).booleanValue(), (t0) obj2, (zt.e) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34426a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return new e.f(this.f34427b, ((t0) this.f34428c).m());
            }
        }

        static final class b implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingScreenViewModel f34429a;

            b(PortForwardingScreenViewModel portForwardingScreenViewModel) {
                this.f34429a = portForwardingScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(e.f fVar, zt.e eVar) {
                this.f34429a.sendComposeAction(fVar);
                return m0.f82633a;
            }
        }

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34424a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(zu.h.h(PortForwardingScreenViewModel.this._isSearchMode, PortForwardingScreenViewModel.this._searchQueryFieldValue, new C0547a(null)), 1);
                b bVar = new b(PortForwardingScreenViewModel.this);
                this.f34424a = 1;
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

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34430a;

        static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingScreenViewModel f34432a;

            a(PortForwardingScreenViewModel portForwardingScreenViewModel) {
                this.f34432a = portForwardingScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
                if (cVar instanceof c.b) {
                    this.f34432a.sendComposeAction(e.a.f34435a);
                }
                return m0.f82633a;
            }
        }

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34430a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(PortForwardingScreenViewModel.this.getActionMode(), 1);
                a aVar = new a(PortForwardingScreenViewModel.this);
                this.f34430a = 1;
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

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34433a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34433a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = PortForwardingScreenViewModel.this._portForwardingSortingMode;
            hg.d dVar = PortForwardingScreenViewModel.this.keyValueRepository;
            TermiusSortType termiusSortType = com.server.auditor.ssh.client.fragments.hostngroups.j.f25092a;
            String string = dVar.getString("termius_port_forwarding_sort_type", termiusSortType.name());
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

    public static final class d {
        public /* synthetic */ d(ju.k kVar) {
            this();
        }

        public final PortForwardingScreenViewModel a() {
            return PortForwardingScreenViewModel.composeViewModel;
        }

        public final void b(PortForwardingScreenViewModel portForwardingScreenViewModel) {
            PortForwardingScreenViewModel.composeViewModel = portForwardingScreenViewModel;
        }

        private d() {
        }
    }

    public interface e {

        public static final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34435a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 400300647;
            }

            public String toString() {
                return "FinishActionMode";
            }
        }

        public static final class b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f34436a;

            public b(int i10) {
                this.f34436a = i10;
            }

            public final int a() {
                return this.f34436a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f34436a == ((b) obj).f34436a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f34436a);
            }

            public String toString() {
                return "OnActionItemClick(itemId=" + this.f34436a + ")";
            }
        }

        public static final class c implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34437a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1294410117;
            }

            public String toString() {
                return "OnFabClick";
            }
        }

        public static final class d implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f34438a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 2032574638;
            }

            public String toString() {
                return "OnInviteTeamMemberClick";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel$e$e, reason: collision with other inner class name */
        public static final class C0548e implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0548e f34439a = new C0548e();

            private C0548e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0548e);
            }

            public int hashCode() {
                return -502958654;
            }

            public String toString() {
                return "UpdateList";
            }
        }

        public static final class f implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f34440a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34441b;

            public f(boolean z10, String str) {
                ju.t.f(str, "query");
                this.f34440a = z10;
                this.f34441b = str;
            }

            public final boolean a() {
                return this.f34440a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f34440a == fVar.f34440a && ju.t.b(this.f34441b, fVar.f34441b);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f34440a) * 31) + this.f34441b.hashCode();
            }

            public String toString() {
                return "UpdateSearch(isSearchMode=" + this.f34440a + ", query=" + this.f34441b + ")";
            }
        }
    }

    public interface f {

        public static final class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34442a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34442a = obj;
            }

            public final Object a() {
                return this.f34442a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34442a, ((a) obj).f34442a);
            }

            public int hashCode() {
                return this.f34442a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34442a + ")";
            }
        }

        public static final class b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.server.auditor.ssh.client.navigation.ui.compose.c f34443a;

            public b(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
                ju.t.f(cVar, "mode");
                this.f34443a = cVar;
            }

            public final com.server.auditor.ssh.client.navigation.ui.compose.c a() {
                return this.f34443a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f34443a, ((b) obj).f34443a);
            }

            public int hashCode() {
                return this.f34443a.hashCode();
            }

            public String toString() {
                return "OnTopBarModeChange(mode=" + this.f34443a + ")";
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f34444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34445b;

        public g(List list, String str) {
            ju.t.f(list, "items");
            ju.t.f(str, "query");
            this.f34444a = list;
            this.f34445b = str;
        }

        public final List a() {
            return this.f34444a;
        }

        public final String b() {
            return this.f34445b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return ju.t.b(this.f34444a, gVar.f34444a) && ju.t.b(this.f34445b, gVar.f34445b);
        }

        public int hashCode() {
            return (this.f34444a.hashCode() * 31) + this.f34445b.hashCode();
        }

        public String toString() {
            return "PortForwardingScreenItems(items=" + this.f34444a + ", query=" + this.f34445b + ")";
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34447b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f34449d;

        h(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34447b = obj;
            this.f34449d |= RtlSpacingHelper.UNDEFINED;
            return PortForwardingScreenViewModel.this.determineEmptyScreenState(null, null, null, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34450a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34450a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._actionMode.setValue(c.b.f30351a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34452a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34452a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._discardChangesDialog.setValue(a7.a.f68126a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34456c;

        k(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, List list, zt.e eVar) {
            k kVar = PortForwardingScreenViewModel.this.new k(eVar);
            kVar.f34455b = cVar;
            kVar.f34456c = list;
            return kVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34454a;
            boolean z10 = true;
            if (i10 == 0) {
                ut.x.b(obj);
                com.server.auditor.ssh.client.navigation.ui.compose.c cVar = (com.server.auditor.ssh.client.navigation.ui.compose.c) this.f34455b;
                List list = (List) this.f34456c;
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
                        if (((c.a) cVar).b() != 0) {
                            z10 = false;
                        }
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                kp.c cVar2 = PortForwardingScreenViewModel.this.getTeamAccessStatusUseCase;
                this.f34455b = null;
                this.f34454a = 1;
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

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34458a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34458a;
            if (i10 == 0) {
                ut.x.b(obj);
                gj.b vaultsInteractor = PortForwardingScreenViewModel.this.getVaultsInteractor();
                this.f34458a = 1;
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
        int f34460a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34460a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._editingState.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, true, false));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34462a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ op.n f34464c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(op.n nVar, zt.e eVar) {
            super(2, eVar);
            this.f34464c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new n(this.f34464c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34462a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._vaultsSelectorStateFlow.setValue(this.f34464c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34465a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34465a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._editingState.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, false, false, 7, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class p implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f34467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PortForwardingScreenViewModel f34468b;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f34469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PortForwardingScreenViewModel f34470b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel$p$a$a, reason: collision with other inner class name */
            public static final class C0549a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34471a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f34472b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f34473c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f34475e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f34476f;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f34477u;

                public C0549a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34471a = obj;
                    this.f34472b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar, PortForwardingScreenViewModel portForwardingScreenViewModel) {
                this.f34469a = gVar;
                this.f34470b = portForwardingScreenViewModel;
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
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.p.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public p(zu.f fVar, PortForwardingScreenViewModel portForwardingScreenViewModel) {
            this.f34467a = fVar;
            this.f34468b = portForwardingScreenViewModel;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f34467a.collect(new a(gVar, this.f34468b), eVar);
            return objCollect == au.b.f() ? objCollect : m0.f82633a;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34478a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.navigation.ui.compose.c f34480c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
            super(2, eVar);
            this.f34480c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new q(this.f34480c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34478a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._actionMode.setValue(this.f34480c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34481a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f34483c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(Long l10, zt.e eVar) {
            super(2, eVar);
            this.f34483c = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new r(this.f34483c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34481a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = PortForwardingScreenViewModel.this._editingState;
            Long l10 = this.f34483c;
            wVar.setValue(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(l10, l10 != null, false, 4, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34484a;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new s(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r6.f34484a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                ut.x.b(r7)
                goto L8c
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                ut.x.b(r7)
                goto L4e
            L1f:
                ut.x.b(r7)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel r7 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.this
                il.p r7 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.access$getGetPortForwardingScreenItemsUseCase$p(r7)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.access$get_searchQueryFieldValue$p(r1)
                java.lang.Object r1 = r1.getValue()
                j3.t0 r1 = (j3.t0) r1
                java.lang.String r1 = r1.m()
                com.crystalnix.termius.libtermius.wrappers.SessionManager r4 = com.crystalnix.termius.libtermius.wrappers.SessionManager.getInstance()
                java.util.List r4 = r4.getPFSessionsIds()
                java.lang.String r5 = "getPFSessionsIds(...)"
                ju.t.e(r4, r5)
                r6.f34484a = r3
                java.lang.Object r7 = r7.b(r1, r4, r6)
                if (r7 != r0) goto L4e
                goto L8b
            L4e:
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel$g r7 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.g) r7
                java.util.List r1 = r7.a()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L7d
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.access$get_actionMode$p(r1)
                java.lang.Object r1 = r1.getValue()
                boolean r1 = r1 instanceof com.server.auditor.ssh.client.navigation.ui.compose.c.a
                if (r1 == 0) goto L7d
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.access$get_actionMode$p(r1)
            L6e:
                java.lang.Object r3 = r1.getValue()
                r4 = r3
                com.server.auditor.ssh.client.navigation.ui.compose.c r4 = (com.server.auditor.ssh.client.navigation.ui.compose.c) r4
                com.server.auditor.ssh.client.navigation.ui.compose.c$b r4 = com.server.auditor.ssh.client.navigation.ui.compose.c.b.f30351a
                boolean r3 = r1.g(r3, r4)
                if (r3 == 0) goto L6e
            L7d:
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.this
                zu.v r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.access$get_filteredItems$p(r1)
                r6.f34484a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L8c
            L8b:
                return r0
            L8c:
                ut.m0 r7 = ut.m0.f82633a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34486a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f34488c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(TermiusSortType termiusSortType, zt.e eVar) {
            super(2, eVar);
            this.f34488c = termiusSortType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new t(this.f34488c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34486a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            hg.d dVar = PortForwardingScreenViewModel.this.keyValueRepository;
            ju.t.e(dVar, "access$getKeyValueRepository$p(...)");
            TermiusSortType termiusSortType = this.f34488c;
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.putString("termius_port_forwarding_sort_type", termiusSortType.name());
            editorEdit.apply();
            PortForwardingScreenViewModel.this._portForwardingSortingMode.setValue(this.f34488c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34489a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34491c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34491c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new u(this.f34491c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34489a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._isSearchMode.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34491c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34492a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f34494c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f34494c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new v(this.f34494c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34492a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._searchQueryFieldValue.setValue(this.f34494c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34495a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f34498d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z10, List list, zt.e eVar) {
            super(2, eVar);
            this.f34497c = z10;
            this.f34498d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new w(this.f34497c, this.f34498d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34495a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._showContextActions.setValue(this.f34497c ? new a.b(this.f34498d) : a.C0202a.f13051a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34499a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f34501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(Object obj, zt.e eVar) {
            super(2, eVar);
            this.f34501c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new x(this.f34501c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34499a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._discardChangesDialog.setValue(new a7.b(this.f34501c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34502a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34504c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34504c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingScreenViewModel.this.new y(this.f34504c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34502a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingScreenViewModel.this._showSortTypeSelector.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34504c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingScreenViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        tp.g0 g0VarY1 = b2Var.y1();
        this.liveSharedPreferences = g0VarY1;
        this.keyValueRepository = aVarN.M();
        this._vaultsSelectorStateFlow = zu.m0.a(new op.n(false, null, 3, null));
        Boolean bool = Boolean.FALSE;
        this._isSearchMode = zu.m0.a(bool);
        zu.w wVarA = zu.m0.a(new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f(null, false, false, 7, null));
        this._editingState = wVarA;
        this.editingState = zu.h.b(wVarA);
        zu.w wVarA2 = zu.m0.a(a7.a.f68126a);
        this._discardChangesDialog = wVarA2;
        this.discardChangesDialog = zu.h.b(wVarA2);
        this._searchQueryFieldValue = zu.m0.a(new t0("", 0L, (g3) null, 6, (ju.k) null));
        zu.w wVarA3 = zu.m0.a(c.b.f30351a);
        this._actionMode = wVarA3;
        this._portForwardingSortingMode = zu.m0.a(TermiusSortType.ByNameAscending);
        this._showContextActions = zu.m0.a(a.C0202a.f13051a);
        this._showSortTypeSelector = zu.m0.a(bool);
        this.selectedItems = new SparseBooleanArray();
        this.vaultWizardId = "";
        a.C0770a c0770a = gj.a.f51371c;
        this.filterEntityHelper = c0770a.e();
        zu.v vVarB = zu.c0.b(1, 0, null, 6, null);
        this._filteredItems = vVarB;
        this.filteredContainers = new ArrayList();
        p pVar = new p(vVarB, this);
        i0 i0VarA = j1.a(this);
        g0.a aVar = zu.g0.f88389a;
        this.emptyScreenStateFlow = zu.h.P(pVar, i0VarA, g0.a.b(aVar, 5000L, 0L, 2, null), a.b.f69469a);
        this.vaultsRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b0
            @Override // iu.a
            public final Object a() {
                return PortForwardingScreenViewModel.vaultsRepository_delegate$lambda$1();
            }
        });
        this.vaultsInteractor$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.c0
            @Override // iu.a
            public final Object a() {
                return PortForwardingScreenViewModel.vaultsInteractor_delegate$lambda$2(this.f34958a);
            }
        });
        PFRulesDBAdapter pFRulesDBAdapterZ = hg.f.p().z();
        ju.t.e(pFRulesDBAdapterZ, "getPFRulesDBAdapter(...)");
        wu.j1 j1VarG1 = b2Var.g1();
        gj.a aVarE = c0770a.e();
        hg.d dVarM = aVarN.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.getPortForwardingScreenItemsUseCase = new il.p(pFRulesDBAdapterZ, j1VarG1, aVarE, dVarM, getVaultsRepository());
        this.getTeamAccessStatusUseCase = new kp.c(new in.c(g0VarY1));
        zu.f fVarE = getVaultsRepository().e();
        this.vaultsFlow = fVarE;
        this.isFabVisible = zu.h.P(zu.h.h(wVarA3, fVarE, new k(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), bool);
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object determineEmptyScreenState(java.util.List<? extends uh.d.a> r6, java.util.List<tl.l2> r7, java.lang.String r8, zt.e<? super op.a> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.h
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel$h r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.h) r0
            int r1 = r0.f34449d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34449d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel$h r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f34447b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f34449d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r6 = r0.f34446a
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
            r0.f34446a = r8
            r0.f34449d = r4
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
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingScreenViewModel.determineEmptyScreenState(java.util.List, java.util.List, java.lang.String, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gj.b getVaultsInteractor() {
        return (gj.b) this.vaultsInteractor$delegate.getValue();
    }

    private final vl.g getVaultsRepository() {
        return (vl.g) this.vaultsRepository$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateShowContextActions$default(PortForwardingScreenViewModel portForwardingScreenViewModel, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = vt.v.o();
        }
        portForwardingScreenViewModel.updateShowContextActions(z10, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gj.b vaultsInteractor_delegate$lambda$2(PortForwardingScreenViewModel portForwardingScreenViewModel) {
        return new gj.b(portForwardingScreenViewModel.getVaultsRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.g vaultsRepository_delegate$lambda$1() {
        return vl.g.f83702b.b();
    }

    public final void dismissActionMode() {
        wu.k.d(j1.a(this), null, null, new i(null), 3, null);
    }

    public final void dismissDiscardChangesDialog() {
        wu.k.d(j1.a(this), null, null, new j(null), 3, null);
    }

    public final k0 getActionMode() {
        return zu.h.b(this._actionMode);
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

    public final gj.a getFilterEntityHelper() {
        return this.filterEntityHelper;
    }

    public final List<d.a> getFilteredContainers() {
        return this.filteredContainers;
    }

    public final zu.a0 getFilteredItems() {
        return this._filteredItems;
    }

    public final k0 getPortForwardingSortingMode() {
        return zu.h.b(this._portForwardingSortingMode);
    }

    public final k0 getSearchQueryFieldValue() {
        return this._searchQueryFieldValue;
    }

    public final SparseBooleanArray getSelectedItems() {
        return this.selectedItems;
    }

    public final k0 getShowContextActions() {
        return this._showContextActions;
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

    public final boolean isSearchActive() {
        return this.isSearchActive;
    }

    public final k0 isSearchMode() {
        return this._isSearchMode;
    }

    public final void onBackToPersonalVaultClick() {
        wu.k.d(j1.a(this), null, null, new l(null), 3, null);
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void onStartCreatingNew() {
        wu.k.d(j1.a(this), null, null, new m(null), 3, null);
    }

    public final void onVaultsModeUpdated(op.n nVar) {
        ju.t.f(nVar, "vaultsSelectorState");
        wu.k.d(j1.a(this), null, null, new n(nVar, null), 3, null);
    }

    public final void resetEditing() {
        wu.k.d(j1.a(this), null, null, new o(null), 3, null);
    }

    public final void setSearchActive(boolean z10) {
        this.isSearchActive = z10;
    }

    public final void setVaultWizardId(String str) {
        ju.t.f(str, "<set-?>");
        this.vaultWizardId = str;
    }

    public final void updateActionMode(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
        ju.t.f(cVar, "keychainTopBarState");
        wu.k.d(j1.a(this), null, null, new q(cVar, null), 3, null);
    }

    public final void updateEditingId(Long l10) {
        wu.k.d(j1.a(this), null, null, new r(l10, null), 3, null);
    }

    public final void updateList() {
        wu.k.d(j1.a(this), null, null, new s(null), 3, null);
    }

    public final void updatePortForwardingSortingMode(TermiusSortType termiusSortType) {
        ju.t.f(termiusSortType, Column.TYPE);
        wu.k.d(j1.a(this), null, null, new t(termiusSortType, null), 3, null);
    }

    public final void updateSearchMode(boolean z10) {
        wu.k.d(j1.a(this), null, null, new u(z10, null), 3, null);
    }

    public final void updateSearchQuery(t0 t0Var) {
        ju.t.f(t0Var, "query");
        wu.k.d(j1.a(this), null, null, new v(t0Var, null), 3, null);
    }

    public final void updateShowContextActions(boolean z10, List<? extends com.server.auditor.ssh.client.navigation.ui.compose.a> list) {
        ju.t.f(list, "options");
        wu.k.d(j1.a(this), null, null, new w(z10, list, null), 3, null);
    }

    public final void updateShowDiscardChangesDialog(Object obj) {
        ju.t.f(obj, "route");
        wu.k.d(j1.a(this), null, null, new x(obj, null), 3, null);
    }

    public final void updateSortTypeSelectorVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new y(z10, null), 3, null);
    }
}
