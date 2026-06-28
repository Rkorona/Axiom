package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;

/* JADX INFO: loaded from: classes3.dex */
public final class SshKeyGeneratorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static SshKeyGeneratorScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final SshKeyGeneratorScreenViewModel a() {
            return SshKeyGeneratorScreenViewModel.composeViewModel;
        }

        public final void b(SshKeyGeneratorScreenViewModel sshKeyGeneratorScreenViewModel) {
            SshKeyGeneratorScreenViewModel.composeViewModel = sshKeyGeneratorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34694a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -521209881;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34695a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1381991878;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final EditKeyData f34696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34697b;

            public b(EditKeyData editKeyData, String str) {
                ju.t.f(editKeyData, "editKeyData");
                ju.t.f(str, "funnelId");
                this.f34696a = editKeyData;
                this.f34697b = str;
            }

            public final EditKeyData a() {
                return this.f34696a;
            }

            public final String b() {
                return this.f34697b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return ju.t.b(this.f34696a, bVar.f34696a) && ju.t.b(this.f34697b, bVar.f34697b);
            }

            public int hashCode() {
                return (this.f34696a.hashCode() * 31) + this.f34697b.hashCode();
            }

            public String toString() {
                return "NavigateToKeyEdit(editKeyData=" + this.f34696a + ", funnelId=" + this.f34697b + ")";
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
