package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class SshKeyExporterScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static SshKeyExporterScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final SshKeyExporterScreenViewModel a() {
            return SshKeyExporterScreenViewModel.composeViewModel;
        }

        public final void b(SshKeyExporterScreenViewModel sshKeyExporterScreenViewModel) {
            SshKeyExporterScreenViewModel.composeViewModel = sshKeyExporterScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34692a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -44842046;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SshKeyExporterScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0558b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0558b f34693a = new C0558b();

            private C0558b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0558b);
            }

            public int hashCode() {
                return 326210180;
            }

            public String toString() {
                return "FinishFlow";
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
