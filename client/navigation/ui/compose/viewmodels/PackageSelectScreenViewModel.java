package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageSelectScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PackageSelectScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PackageSelectScreenViewModel a() {
            return PackageSelectScreenViewModel.composeViewModel;
        }

        public final void b(PackageSelectScreenViewModel packageSelectScreenViewModel) {
            PackageSelectScreenViewModel.composeViewModel = packageSelectScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34317a;

            public a(long j10) {
                this.f34317a = j10;
            }

            public final long a() {
                return this.f34317a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f34317a == ((a) obj).f34317a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34317a);
            }

            public String toString() {
                return "OnSelectPackageResult(packageId=" + this.f34317a + ")";
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
