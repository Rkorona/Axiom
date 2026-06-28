package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.keymanager.SshPrivateKeyPasteScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class SshKeyPasteScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static SshKeyPasteScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final SshKeyPasteScreenViewModel a() {
            return SshKeyPasteScreenViewModel.composeViewModel;
        }

        public final void b(SshKeyPasteScreenViewModel sshKeyPasteScreenViewModel) {
            SshKeyPasteScreenViewModel.composeViewModel = sshKeyPasteScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34803a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 332969862;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SshKeyPasteScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0561b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshPrivateKeyPasteScreen.PastePrivateKeyResultData f34804a;

            public C0561b(SshPrivateKeyPasteScreen.PastePrivateKeyResultData pastePrivateKeyResultData) {
                ju.t.f(pastePrivateKeyResultData, "pastePrivateKeyResultData");
                this.f34804a = pastePrivateKeyResultData;
            }

            public final SshPrivateKeyPasteScreen.PastePrivateKeyResultData a() {
                return this.f34804a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0561b) && ju.t.b(this.f34804a, ((C0561b) obj).f34804a);
            }

            public int hashCode() {
                return this.f34804a.hashCode();
            }

            public String toString() {
                return "ReturnResult(pastePrivateKeyResultData=" + this.f34804a + ")";
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
