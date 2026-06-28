package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;
import wu.i0;
import zu.k0;
import zu.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class BiometricKeyGeneratorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static BiometricKeyGeneratorScreenViewModel composeViewModel;
    private final zu.w _isGenerateButtonEnabled = m0.a(Boolean.FALSE);
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final BiometricKeyGeneratorScreenViewModel a() {
            return BiometricKeyGeneratorScreenViewModel.composeViewModel;
        }

        public final void b(BiometricKeyGeneratorScreenViewModel biometricKeyGeneratorScreenViewModel) {
            BiometricKeyGeneratorScreenViewModel.composeViewModel = biometricKeyGeneratorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33823a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1641287273;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33824a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1019331094;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final EditKeyData f33825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f33826b;

            public b(EditKeyData editKeyData, String str) {
                ju.t.f(editKeyData, "editKeyData");
                ju.t.f(str, "funnelId");
                this.f33825a = editKeyData;
                this.f33826b = str;
            }

            public final EditKeyData a() {
                return this.f33825a;
            }

            public final String b() {
                return this.f33826b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return ju.t.b(this.f33825a, bVar.f33825a) && ju.t.b(this.f33826b, bVar.f33826b);
            }

            public int hashCode() {
                return (this.f33825a.hashCode() * 31) + this.f33826b.hashCode();
            }

            public String toString() {
                return "NavigateToKeyEdit(editKeyData=" + this.f33825a + ", funnelId=" + this.f33826b + ")";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33827a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f33829c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BiometricKeyGeneratorScreenViewModel.this.new d(this.f33829c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33827a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            BiometricKeyGeneratorScreenViewModel.this._isGenerateButtonEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(this.f33829c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public final k0 isGenerateButtonEnabled() {
        return this._isGenerateButtonEnabled;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void updateGenerateButtonEnabled(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }
}
