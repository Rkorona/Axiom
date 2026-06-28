package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.keymanager.CertificatePasteScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class SshCertificateScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static SshCertificateScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final SshCertificateScreenViewModel a() {
            return SshCertificateScreenViewModel.composeViewModel;
        }

        public final void b(SshCertificateScreenViewModel sshCertificateScreenViewModel) {
            SshCertificateScreenViewModel.composeViewModel = sshCertificateScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34651a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1449643179;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SshCertificateScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0555b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CertificatePasteScreen.PasteCertificateResultData f34652a;

            public C0555b(CertificatePasteScreen.PasteCertificateResultData pasteCertificateResultData) {
                ju.t.f(pasteCertificateResultData, "pasteCertificateResultData");
                this.f34652a = pasteCertificateResultData;
            }

            public final CertificatePasteScreen.PasteCertificateResultData a() {
                return this.f34652a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0555b) && ju.t.b(this.f34652a, ((C0555b) obj).f34652a);
            }

            public int hashCode() {
                return this.f34652a.hashCode();
            }

            public String toString() {
                return "ReturnResult(pasteCertificateResultData=" + this.f34652a + ")";
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
