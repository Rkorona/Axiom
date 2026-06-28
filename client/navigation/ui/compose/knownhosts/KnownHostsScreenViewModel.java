package com.server.auditor.ssh.client.navigation.ui.compose.knownhosts;

import android.content.SharedPreferences;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.j1;
import bk.a;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.navigation.ui.compose.c;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.FragmentWrapperViewModel;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import e3.g3;
import gj.a;
import hg.b2;
import java.util.ArrayList;
import java.util.List;
import op.a;
import sh.d;
import zu.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class KnownHostsScreenViewModel extends FragmentWrapperViewModel<e, d> {
    private static KnownHostsScreenViewModel composeViewModel;
    private final zu.w _actionMode;
    private final zu.v _filteredItems;
    private final zu.w _isSearchMode;
    private final zu.w _knownHostsSortingMode;
    private final zu.w _searchQueryFieldValue;
    private final zu.w _showContextActions;
    private final zu.w _showSortTypeSelector;
    private final zu.w _vaultsSelectorStateFlow;
    private final zu.k0 emptyScreenStateFlow;
    private final gj.a filterEntityHelper;
    private final List<d.a> filteredContainers;
    private final q0 getKnownHostsScreenItemsUseCase;
    private final kp.c getTeamAccessStatusUseCase;
    private boolean isSearchActive;
    private final hg.d keyValueRepository;
    private final tp.g0 liveSharedPreferences;
    private final SparseBooleanArray selectedItems;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final ut.n vaultsInteractor$delegate;
    private final ut.n vaultsRepository$delegate;
    public static final c Companion = new c(null);
    public static final int $stable = 8;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32555a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel$a$a, reason: collision with other inner class name */
        static final class C0498a extends kotlin.coroutines.jvm.internal.m implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f32557a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f32558b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f32559c;

            C0498a(zt.e eVar) {
                super(3, eVar);
            }

            public final Object i(boolean z10, j3.t0 t0Var, zt.e eVar) {
                C0498a c0498a = new C0498a(eVar);
                c0498a.f32558b = z10;
                c0498a.f32559c = t0Var;
                return c0498a.invokeSuspend(ut.m0.f82633a);
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i(((Boolean) obj).booleanValue(), (j3.t0) obj2, (zt.e) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f32557a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return new d.f(this.f32558b, ((j3.t0) this.f32559c).m());
            }
        }

        static final class b implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ KnownHostsScreenViewModel f32560a;

            b(KnownHostsScreenViewModel knownHostsScreenViewModel) {
                this.f32560a = knownHostsScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(d.f fVar, zt.e eVar) {
                this.f32560a.sendComposeAction(fVar);
                return ut.m0.f82633a;
            }
        }

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f32555a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(zu.h.h(KnownHostsScreenViewModel.this._isSearchMode, KnownHostsScreenViewModel.this._searchQueryFieldValue, new C0498a(null)), 1);
                b bVar = new b(KnownHostsScreenViewModel.this);
                this.f32555a = 1;
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

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32561a;

        static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ KnownHostsScreenViewModel f32563a;

            a(KnownHostsScreenViewModel knownHostsScreenViewModel) {
                this.f32563a = knownHostsScreenViewModel;
            }

            @Override // zu.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
                if (cVar instanceof c.b) {
                    this.f32563a.sendComposeAction(d.a.f32564a);
                }
                return ut.m0.f82633a;
            }
        }

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f32561a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.f fVarR = zu.h.r(KnownHostsScreenViewModel.this.getActionMode(), 1);
                a aVar = new a(KnownHostsScreenViewModel.this);
                this.f32561a = 1;
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

    public static final class c {
        public /* synthetic */ c(ju.k kVar) {
            this();
        }

        public final KnownHostsScreenViewModel a() {
            return KnownHostsScreenViewModel.composeViewModel;
        }

        public final void b(KnownHostsScreenViewModel knownHostsScreenViewModel) {
            KnownHostsScreenViewModel.composeViewModel = knownHostsScreenViewModel;
        }

        private c() {
        }
    }

    public interface d {

        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32564a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1238276886;
            }

            public String toString() {
                return "FinishActionMode";
            }
        }

        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f32565a;

            public b(int i10) {
                this.f32565a = i10;
            }

            public final int a() {
                return this.f32565a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f32565a == ((b) obj).f32565a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f32565a);
            }

            public String toString() {
                return "OnActionItemClick(itemId=" + this.f32565a + ")";
            }
        }

        public static final class c implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f32566a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -636280838;
            }

            public String toString() {
                return "OnDismissDetailPane";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel$d$d, reason: collision with other inner class name */
        public static final class C0499d implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0499d f32567a = new C0499d();

            private C0499d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0499d);
            }

            public int hashCode() {
                return 743558431;
            }

            public String toString() {
                return "OnInviteTeamMemberClick";
            }
        }

        public static final class e implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f32568a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1722423887;
            }

            public String toString() {
                return "UpdateList";
            }
        }

        public static final class f implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f32569a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f32570b;

            public f(boolean z10, String str) {
                ju.t.f(str, "query");
                this.f32569a = z10;
                this.f32570b = str;
            }

            public final boolean a() {
                return this.f32569a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f32569a == fVar.f32569a && ju.t.b(this.f32570b, fVar.f32570b);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f32569a) * 31) + this.f32570b.hashCode();
            }

            public String toString() {
                return "UpdateSearch(isSearchMode=" + this.f32569a + ", query=" + this.f32570b + ")";
            }
        }
    }

    public interface e {

        public static final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f32571a;

            public a(String str) {
                ju.t.f(str, "hostPort");
                this.f32571a = str;
            }

            public final String a() {
                return this.f32571a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f32571a, ((a) obj).f32571a);
            }

            public int hashCode() {
                return this.f32571a.hashCode();
            }

            public String toString() {
                return "OnAddToHostsRequest(hostPort=" + this.f32571a + ")";
            }
        }

        public static final class b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f32572a;

            public b(Object obj) {
                ju.t.f(obj, "route");
                this.f32572a = obj;
            }

            public final Object a() {
                return this.f32572a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f32572a, ((b) obj).f32572a);
            }

            public int hashCode() {
                return this.f32572a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f32572a + ")";
            }
        }

        public static final class c implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.server.auditor.ssh.client.navigation.ui.compose.c f32573a;

            public c(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
                ju.t.f(cVar, "mode");
                this.f32573a = cVar;
            }

            public final com.server.auditor.ssh.client.navigation.ui.compose.c a() {
                return this.f32573a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && ju.t.b(this.f32573a, ((c) obj).f32573a);
            }

            public int hashCode() {
                return this.f32573a.hashCode();
            }

            public String toString() {
                return "OnTopBarModeChange(mode=" + this.f32573a + ")";
            }
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f32574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f32575b;

        public f(List list, String str) {
            ju.t.f(list, "items");
            ju.t.f(str, "query");
            this.f32574a = list;
            this.f32575b = str;
        }

        public final List a() {
            return this.f32574a;
        }

        public final String b() {
            return this.f32575b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return ju.t.b(this.f32574a, fVar.f32574a) && ju.t.b(this.f32575b, fVar.f32575b);
        }

        public int hashCode() {
            return (this.f32574a.hashCode() * 31) + this.f32575b.hashCode();
        }

        public String toString() {
            return "KnownHostsScreenItems(items=" + this.f32574a + ", query=" + this.f32575b + ")";
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32577b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32579d;

        g(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32577b = obj;
            this.f32579d |= RtlSpacingHelper.UNDEFINED;
            return KnownHostsScreenViewModel.this.determineEmptyScreenState(null, null, null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32580a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32580a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KnownHostsScreenViewModel.this._actionMode.setValue(c.b.f30351a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32582a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f32582a;
            if (i10 == 0) {
                ut.x.b(obj);
                gj.b vaultsInteractor = KnownHostsScreenViewModel.this.getVaultsInteractor();
                this.f32582a = 1;
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
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32584a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ op.n f32586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(op.n nVar, zt.e eVar) {
            super(2, eVar);
            this.f32586c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new j(this.f32586c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32584a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KnownHostsScreenViewModel.this._vaultsSelectorStateFlow.setValue(this.f32586c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class k implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f32587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KnownHostsScreenViewModel f32588b;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f32589a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KnownHostsScreenViewModel f32590b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel$k$a$a, reason: collision with other inner class name */
            public static final class C0500a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f32591a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f32592b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f32593c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f32595e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f32596f;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f32597u;

                public C0500a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f32591a = obj;
                    this.f32592b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar, KnownHostsScreenViewModel knownHostsScreenViewModel) {
                this.f32589a = gVar;
                this.f32590b = knownHostsScreenViewModel;
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
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.k.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public k(zu.f fVar, KnownHostsScreenViewModel knownHostsScreenViewModel) {
            this.f32587a = fVar;
            this.f32588b = knownHostsScreenViewModel;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f32587a.collect(new a(gVar, this.f32588b), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32598a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.navigation.ui.compose.c f32600c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.server.auditor.ssh.client.navigation.ui.compose.c cVar, zt.e eVar) {
            super(2, eVar);
            this.f32600c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new l(this.f32600c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32598a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KnownHostsScreenViewModel.this._actionMode.setValue(this.f32600c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32601a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f32603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(TermiusSortType termiusSortType, zt.e eVar) {
            super(2, eVar);
            this.f32603c = termiusSortType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new m(this.f32603c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32601a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            hg.d dVar = KnownHostsScreenViewModel.this.keyValueRepository;
            ju.t.e(dVar, "access$getKeyValueRepository$p(...)");
            TermiusSortType termiusSortType = this.f32603c;
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.putString("termius_known_hosts_sort_type", termiusSortType.name());
            editorEdit.apply();
            KnownHostsScreenViewModel.this._knownHostsSortingMode.setValue(this.f32603c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32604a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new n(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L22;
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
                int r1 = r5.f32604a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r6)
                goto L7e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                ut.x.b(r6)
                goto L40
            L1e:
                ut.x.b(r6)
                com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel r6 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.this
                com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.q0 r6 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.access$getGetKnownHostsScreenItemsUseCase$p(r6)
                com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.access$get_searchQueryFieldValue$p(r1)
                java.lang.Object r1 = r1.getValue()
                j3.t0 r1 = (j3.t0) r1
                java.lang.String r1 = r1.m()
                r5.f32604a = r3
                java.lang.Object r6 = r6.d(r1, r5)
                if (r6 != r0) goto L40
                goto L7d
            L40:
                com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel$f r6 = (com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.f) r6
                java.util.List r1 = r6.a()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L6f
                com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.access$get_actionMode$p(r1)
                java.lang.Object r1 = r1.getValue()
                boolean r1 = r1 instanceof com.server.auditor.ssh.client.navigation.ui.compose.c.a
                if (r1 == 0) goto L6f
                com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.this
                zu.w r1 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.access$get_actionMode$p(r1)
            L60:
                java.lang.Object r3 = r1.getValue()
                r4 = r3
                com.server.auditor.ssh.client.navigation.ui.compose.c r4 = (com.server.auditor.ssh.client.navigation.ui.compose.c) r4
                com.server.auditor.ssh.client.navigation.ui.compose.c$b r4 = com.server.auditor.ssh.client.navigation.ui.compose.c.b.f30351a
                boolean r3 = r1.g(r3, r4)
                if (r3 == 0) goto L60
            L6f:
                com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.this
                zu.v r1 = com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.access$get_filteredItems$p(r1)
                r5.f32604a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L7e
            L7d:
                return r0
            L7e:
                ut.m0 r6 = ut.m0.f82633a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32606a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f32608c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new o(this.f32608c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32606a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KnownHostsScreenViewModel.this._isSearchMode.setValue(kotlin.coroutines.jvm.internal.b.a(this.f32608c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32609a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j3.t0 f32611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(j3.t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f32611c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new p(this.f32611c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32609a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KnownHostsScreenViewModel.this._searchQueryFieldValue.setValue(this.f32611c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32612a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f32615d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z10, List list, zt.e eVar) {
            super(2, eVar);
            this.f32614c = z10;
            this.f32615d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new q(this.f32614c, this.f32615d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32612a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KnownHostsScreenViewModel.this._showContextActions.setValue(this.f32614c ? new a.b(this.f32615d) : a.C0202a.f13051a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32616a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f32618c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KnownHostsScreenViewModel.this.new r(this.f32618c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32616a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            KnownHostsScreenViewModel.this._showSortTypeSelector.setValue(kotlin.coroutines.jvm.internal.b.a(this.f32618c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public KnownHostsScreenViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        tp.g0 g0VarY1 = b2Var.y1();
        this.liveSharedPreferences = g0VarY1;
        hg.d dVarM = aVarN.M();
        this.keyValueRepository = dVarM;
        this._vaultsSelectorStateFlow = zu.m0.a(new op.n(false, null, 3, null));
        Boolean bool = Boolean.FALSE;
        this._isSearchMode = zu.m0.a(bool);
        this._searchQueryFieldValue = zu.m0.a(new j3.t0("", 0L, (g3) null, 6, (ju.k) null));
        this._actionMode = zu.m0.a(c.b.f30351a);
        zu.w wVarA = zu.m0.a(TermiusSortType.ByNameAscending);
        this._knownHostsSortingMode = wVarA;
        this._showContextActions = zu.m0.a(a.C0202a.f13051a);
        this._showSortTypeSelector = zu.m0.a(bool);
        this.selectedItems = new SparseBooleanArray();
        a.C0770a c0770a = gj.a.f51371c;
        this.filterEntityHelper = c0770a.e();
        zu.v vVarB = zu.c0.b(1, 0, null, 6, null);
        this._filteredItems = vVarB;
        this.filteredContainers = new ArrayList();
        this.emptyScreenStateFlow = zu.h.P(new k(vVarB, this), j1.a(this), g0.a.b(zu.g0.f88389a, 5000L, 0L, 2, null), a.b.f69469a);
        this.vaultsRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.t0
            @Override // iu.a
            public final Object a() {
                return KnownHostsScreenViewModel.vaultsRepository_delegate$lambda$1();
            }
        });
        this.vaultsInteractor$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.u0
            @Override // iu.a
            public final Object a() {
                return KnownHostsScreenViewModel.vaultsInteractor_delegate$lambda$2(this.f32793a);
            }
        });
        KnownHostsDBAdapter knownHostsDBAdapterR = hg.f.p().r();
        ju.t.e(knownHostsDBAdapterR, "getKnownHostsDBAdapter(...)");
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        ju.t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        il.s sVar = new il.s(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        wu.j1 j1VarG1 = b2Var.g1();
        gj.a aVarE = c0770a.e();
        hg.d dVarM2 = com.server.auditor.ssh.client.app.a.N().M();
        ju.t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        this.getKnownHostsScreenItemsUseCase = new q0(knownHostsDBAdapterR, hostsDBAdapterI, sVar, j1VarG1, aVarE, dVarM2, vl.g.f83702b.b());
        this.getTeamAccessStatusUseCase = new kp.c(new in.c(g0VarY1));
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
        TermiusSortType termiusSortType = com.server.auditor.ssh.client.fragments.hostngroups.j.f25092a;
        String string = dVarM.getString("termius_known_hosts_sort_type", termiusSortType.name());
        wVarA.setValue(TermiusSortType.valueOf(string == null ? termiusSortType.name() : string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object determineEmptyScreenState(java.util.List<? extends sh.d.a> r6, java.util.List<tl.l2> r7, java.lang.String r8, zt.e<? super op.a> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.g
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel$g r0 = (com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.g) r0
            int r1 = r0.f32579d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32579d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel$g r0 = new com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f32577b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f32579d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r6 = r0.f32576a
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
            r0.f32576a = r8
            r0.f32579d = r4
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
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.KnownHostsScreenViewModel.determineEmptyScreenState(java.util.List, java.util.List, java.lang.String, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gj.b getVaultsInteractor() {
        return (gj.b) this.vaultsInteractor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vl.g getVaultsRepository() {
        return (vl.g) this.vaultsRepository$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateShowContextActions$default(KnownHostsScreenViewModel knownHostsScreenViewModel, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = vt.v.o();
        }
        knownHostsScreenViewModel.updateShowContextActions(z10, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gj.b vaultsInteractor_delegate$lambda$2(KnownHostsScreenViewModel knownHostsScreenViewModel) {
        return new gj.b(knownHostsScreenViewModel.getVaultsRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.g vaultsRepository_delegate$lambda$1() {
        return vl.g.f83702b.b();
    }

    public final void dismissActionMode() {
        wu.k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    public final zu.k0 getActionMode() {
        return zu.h.b(this._actionMode);
    }

    public final zu.k0 getEmptyScreenStateFlow() {
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

    public final zu.k0 getKnownHostsSortingMode() {
        return zu.h.b(this._knownHostsSortingMode);
    }

    public final zu.k0 getSearchQueryFieldValue() {
        return this._searchQueryFieldValue;
    }

    public final SparseBooleanArray getSelectedItems() {
        return this.selectedItems;
    }

    public final zu.k0 getShowContextActions() {
        return this._showContextActions;
    }

    public final zu.k0 getShowSortTypeSelector() {
        return this._showSortTypeSelector;
    }

    public final boolean isSearchActive() {
        return this.isSearchActive;
    }

    public final zu.k0 isSearchMode() {
        return this._isSearchMode;
    }

    public final void onBackToPersonalVaultClick() {
        wu.k.d(j1.a(this), null, null, new i(null), 3, null);
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void onVaultsModeUpdated(op.n nVar) {
        ju.t.f(nVar, "vaultsSelectorState");
        wu.k.d(j1.a(this), null, null, new j(nVar, null), 3, null);
    }

    public final void setSearchActive(boolean z10) {
        this.isSearchActive = z10;
    }

    public final void updateActionMode(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
        ju.t.f(cVar, "keychainTopBarState");
        wu.k.d(j1.a(this), null, null, new l(cVar, null), 3, null);
    }

    public final void updateKnownHostsSortingMode(TermiusSortType termiusSortType) {
        ju.t.f(termiusSortType, Column.TYPE);
        wu.k.d(j1.a(this), null, null, new m(termiusSortType, null), 3, null);
    }

    public final void updateList() {
        wu.k.d(j1.a(this), null, null, new n(null), 3, null);
    }

    public final void updateSearchMode(boolean z10) {
        wu.k.d(j1.a(this), null, null, new o(z10, null), 3, null);
    }

    public final void updateSearchQuery(j3.t0 t0Var) {
        ju.t.f(t0Var, "query");
        wu.k.d(j1.a(this), null, null, new p(t0Var, null), 3, null);
    }

    public final void updateShowContextActions(boolean z10, List<? extends com.server.auditor.ssh.client.navigation.ui.compose.a> list) {
        ju.t.f(list, "options");
        wu.k.d(j1.a(this), null, null, new q(z10, list, null), 3, null);
    }

    public final void updateSortTypeSelectorVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new r(z10, null), 3, null);
    }
}
