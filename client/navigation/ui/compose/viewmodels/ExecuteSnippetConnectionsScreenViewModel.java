package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.database.Column;
import wu.i0;
import zu.k0;
import zu.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteSnippetConnectionsScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static ExecuteSnippetConnectionsScreenViewModel composeViewModel;
    private final zu.w _isCancelableMode = m0.a(Boolean.TRUE);
    private final zu.w _screenTitle;
    private final zu.w _showCancelOptions;
    private final zu.w _summaryStatus;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final ExecuteSnippetConnectionsScreenViewModel a() {
            return ExecuteSnippetConnectionsScreenViewModel.composeViewModel;
        }

        public final void b(ExecuteSnippetConnectionsScreenViewModel executeSnippetConnectionsScreenViewModel) {
            ExecuteSnippetConnectionsScreenViewModel.composeViewModel = executeSnippetConnectionsScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33832a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -977736448;
            }

            public String toString() {
                return "OnCloseSessionsPressed";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.ExecuteSnippetConnectionsScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0525b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0525b f33833a = new C0525b();

            private C0525b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0525b);
            }

            public int hashCode() {
                return 193574231;
            }

            public String toString() {
                return "OnExitAndKeepPressed";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33834a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 966025873;
            }

            public String toString() {
                return "OnDonePressed";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33835a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33837c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f33837c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExecuteSnippetConnectionsScreenViewModel.this.new d(this.f33837c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33835a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ExecuteSnippetConnectionsScreenViewModel.this._isCancelableMode.setValue(kotlin.coroutines.jvm.internal.b.a(this.f33837c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33838a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33840c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f33840c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExecuteSnippetConnectionsScreenViewModel.this.new e(this.f33840c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33838a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ExecuteSnippetConnectionsScreenViewModel.this._screenTitle.setValue(this.f33840c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33841a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f33843c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExecuteSnippetConnectionsScreenViewModel.this.new f(this.f33843c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33841a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ExecuteSnippetConnectionsScreenViewModel.this._showCancelOptions.setValue(kotlin.coroutines.jvm.internal.b.a(this.f33843c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33844a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f33846c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExecuteSnippetConnectionsScreenViewModel.this.new g(this.f33846c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33844a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ExecuteSnippetConnectionsScreenViewModel.this._summaryStatus.setValue(this.f33846c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public ExecuteSnippetConnectionsScreenViewModel() {
        zu.w wVarA = m0.a("");
        this._screenTitle = wVarA;
        this._showCancelOptions = m0.a(Boolean.FALSE);
        this._summaryStatus = m0.a("");
        String string = TermiusApplication.F().getString(R.string.snippet_status_running_snippet);
        ju.t.e(string, "getString(...)");
        wVarA.setValue(string);
    }

    public final k0 getScreenTitle() {
        return this._screenTitle;
    }

    public final k0 getShowCancelOptions() {
        return this._showCancelOptions;
    }

    public final k0 getSummaryStatus() {
        return this._summaryStatus;
    }

    public final k0 isCancelableMode() {
        return this._isCancelableMode;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void updateIsCancelableMode(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }

    public final void updateScreenTitle(String str) {
        ju.t.f(str, "title");
        wu.k.d(j1.a(this), null, null, new e(str, null), 3, null);
    }

    public final void updateShowCancelOptions(boolean z10) {
        wu.k.d(j1.a(this), null, null, new f(z10, null), 3, null);
    }

    public final void updateSummaryStatus(String str) {
        ju.t.f(str, Column.STATUS);
        wu.k.d(j1.a(this), null, null, new g(str, null), 3, null);
    }
}
