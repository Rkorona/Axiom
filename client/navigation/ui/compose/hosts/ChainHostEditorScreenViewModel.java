package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.navigation.chainhosts.ChainingHostResult;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.FragmentWrapperViewModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ChainHostEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static ChainHostEditorScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final ChainHostEditorScreenViewModel a() {
            return ChainHostEditorScreenViewModel.composeViewModel;
        }

        public final void b(ChainHostEditorScreenViewModel chainHostEditorScreenViewModel) {
            ChainHostEditorScreenViewModel.composeViewModel = chainHostEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f30639a;

            public a(long j10) {
                this.f30639a = j10;
            }

            public final long a() {
                return this.f30639a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f30639a == ((a) obj).f30639a;
            }

            public int hashCode() {
                return Long.hashCode(this.f30639a);
            }

            public String toString() {
                return "OnHostSelected(hostId=" + this.f30639a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ChainHostEditorScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0475b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0475b f30640a = new C0475b();

            private C0475b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0475b);
            }

            public int hashCode() {
                return 519472385;
            }

            public String toString() {
                return "OnSavePressed";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30641a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 493979623;
            }

            public String toString() {
                return "OnCloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long[] f30642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final VaultKeyId f30643b;

            public b(long[] jArr, VaultKeyId vaultKeyId) {
                ju.t.f(jArr, "filteredHostIds");
                ju.t.f(vaultKeyId, "vaultKeyId");
                this.f30642a = jArr;
                this.f30643b = vaultKeyId;
            }

            public final long[] a() {
                return this.f30642a;
            }

            public final VaultKeyId b() {
                return this.f30643b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!ju.t.b(b.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                ju.t.d(obj, "null cannot be cast to non-null type com.server.auditor.ssh.client.navigation.ui.compose.hosts.ChainHostEditorScreenViewModel.FragmentActions.OnNavigateToChooseHost");
                b bVar = (b) obj;
                return Arrays.equals(this.f30642a, bVar.f30642a) && ju.t.b(this.f30643b, bVar.f30643b);
            }

            public int hashCode() {
                return (Arrays.hashCode(this.f30642a) * 31) + this.f30643b.hashCode();
            }

            public String toString() {
                return "OnNavigateToChooseHost(filteredHostIds=" + Arrays.toString(this.f30642a) + ", vaultKeyId=" + this.f30643b + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ChainHostEditorScreenViewModel$c$c, reason: collision with other inner class name */
        public static final class C0476c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ChainingHostResult f30644a;

            public C0476c(ChainingHostResult chainingHostResult) {
                ju.t.f(chainingHostResult, "result");
                this.f30644a = chainingHostResult;
            }

            public final ChainingHostResult a() {
                return this.f30644a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0476c) && ju.t.b(this.f30644a, ((C0476c) obj).f30644a);
            }

            public int hashCode() {
                return this.f30644a.hashCode();
            }

            public String toString() {
                return "OnResult(result=" + this.f30644a + ")";
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
