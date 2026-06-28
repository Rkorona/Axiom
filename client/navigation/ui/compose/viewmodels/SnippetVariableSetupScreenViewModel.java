package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import wu.i0;
import zu.k0;
import zu.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class SnippetVariableSetupScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static SnippetVariableSetupScreenViewModel composeViewModel;
    private final zu.w _isRunButtonEnabled = m0.a(Boolean.FALSE);
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final SnippetVariableSetupScreenViewModel a() {
            return SnippetVariableSetupScreenViewModel.composeViewModel;
        }

        public final void b(SnippetVariableSetupScreenViewModel snippetVariableSetupScreenViewModel) {
            SnippetVariableSetupScreenViewModel.composeViewModel = snippetVariableSetupScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34520a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -140916143;
            }

            public String toString() {
                return "OnRunClick";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34521a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -944445272;
            }

            public String toString() {
                return "OnCancel";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34522a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34523b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f34524c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f34525d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f34526e;

            public b(long j10, String str, int i10, boolean z10, String str2) {
                ju.t.f(str, "script");
                ju.t.f(str2, "snippetSourceOriginName");
                this.f34522a = j10;
                this.f34523b = str;
                this.f34524c = i10;
                this.f34525d = z10;
                this.f34526e = str2;
            }

            public final String a() {
                return this.f34523b;
            }

            public final long b() {
                return this.f34522a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f34522a == bVar.f34522a && ju.t.b(this.f34523b, bVar.f34523b) && this.f34524c == bVar.f34524c && this.f34525d == bVar.f34525d && ju.t.b(this.f34526e, bVar.f34526e);
            }

            public int hashCode() {
                return (((((((Long.hashCode(this.f34522a) * 31) + this.f34523b.hashCode()) * 31) + Integer.hashCode(this.f34524c)) * 31) + Boolean.hashCode(this.f34525d)) * 31) + this.f34526e.hashCode();
            }

            public String toString() {
                return "OnSelectPackageResult(snippetId=" + this.f34522a + ", script=" + this.f34523b + ", sessionId=" + this.f34524c + ", isNeedExecuteImmediately=" + this.f34525d + ", snippetSourceOriginName=" + this.f34526e + ")";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34527a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34529c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetVariableSetupScreenViewModel.this.new d(this.f34529c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34527a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetVariableSetupScreenViewModel.this._isRunButtonEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34529c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public final k0 isRunButtonEnabled() {
        return this._isRunButtonEnabled;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void updateRunButtonEnabled(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }
}
