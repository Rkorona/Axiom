package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;

/* JADX INFO: loaded from: classes3.dex */
public final class WebAuthnKeyGeneratorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static WebAuthnKeyGeneratorScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final WebAuthnKeyGeneratorScreenViewModel a() {
            return WebAuthnKeyGeneratorScreenViewModel.composeViewModel;
        }

        public final void b(WebAuthnKeyGeneratorScreenViewModel webAuthnKeyGeneratorScreenViewModel) {
            WebAuthnKeyGeneratorScreenViewModel.composeViewModel = webAuthnKeyGeneratorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34941a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1773242535;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34942a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1223685268;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final EditKeyData f34943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34944b;

            public b(EditKeyData editKeyData, String str) {
                ju.t.f(editKeyData, "editKeyData");
                ju.t.f(str, "funnelId");
                this.f34943a = editKeyData;
                this.f34944b = str;
            }

            public final EditKeyData a() {
                return this.f34943a;
            }

            public final String b() {
                return this.f34944b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return ju.t.b(this.f34943a, bVar.f34943a) && ju.t.b(this.f34944b, bVar.f34944b);
            }

            public int hashCode() {
                return (this.f34943a.hashCode() * 31) + this.f34944b.hashCode();
            }

            public String toString() {
                return "NavigateToKeyEdit(editKeyData=" + this.f34943a + ", funnelId=" + this.f34944b + ")";
            }
        }
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }
}
