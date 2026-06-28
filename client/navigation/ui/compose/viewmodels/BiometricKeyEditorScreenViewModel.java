package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.keymanager.CertificatePasteScreen;
import java.util.UUID;
import ut.m0;
import wu.i0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class BiometricKeyEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static BiometricKeyEditorScreenViewModel composeViewModel;
    private final zu.w _isMoreEnabled;
    private final zu.w _isSaveEnabled;
    private final zu.w _showMoreMenu;
    private final String uniqueId;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final BiometricKeyEditorScreenViewModel a() {
            return BiometricKeyEditorScreenViewModel.composeViewModel;
        }

        public final void b(BiometricKeyEditorScreenViewModel biometricKeyEditorScreenViewModel) {
            BiometricKeyEditorScreenViewModel.composeViewModel = biometricKeyEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33804a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1313053998;
            }

            public String toString() {
                return "OnAttachKeyClick";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.BiometricKeyEditorScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0523b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0523b f33805a = new C0523b();

            private C0523b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0523b);
            }

            public int hashCode() {
                return 212888523;
            }

            public String toString() {
                return "OnCopyPublicKeyClick";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f33806a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1014868289;
            }

            public String toString() {
                return "OnExportKeyClick";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f33807a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 913800129;
            }

            public String toString() {
                return "OnPasteCertificateCanceled";
            }
        }

        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CertificatePasteScreen.PasteCertificateResultData f33808a;

            public e(CertificatePasteScreen.PasteCertificateResultData pasteCertificateResultData) {
                ju.t.f(pasteCertificateResultData, "pasteCertificateResult");
                this.f33808a = pasteCertificateResultData;
            }

            public final CertificatePasteScreen.PasteCertificateResultData a() {
                return this.f33808a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && ju.t.b(this.f33808a, ((e) obj).f33808a);
            }

            public int hashCode() {
                return this.f33808a.hashCode();
            }

            public String toString() {
                return "OnPasteCertificateResult(pasteCertificateResult=" + this.f33808a + ")";
            }
        }

        public static final class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f33809a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 135925737;
            }

            public String toString() {
                return "OnRemoveSshKeyClick";
            }
        }

        public static final class g implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f33810a = new g();

            private g() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -1602036601;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }

        public static final class h implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f33811a = new h();

            private h() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return 1709047653;
            }

            public String toString() {
                return "OnSavePublicKeyAsFileClick";
            }
        }

        public static final class i implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f33812a;

            public i(long j10) {
                this.f33812a = j10;
            }

            public final long a() {
                return this.f33812a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.f33812a == ((i) obj).f33812a;
            }

            public int hashCode() {
                return Long.hashCode(this.f33812a);
            }

            public String toString() {
                return "OnSelectHostIdResult(hostId=" + this.f33812a + ")";
            }
        }

        public static final class j implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f33813a = new j();

            private j() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public int hashCode() {
                return 218656414;
            }

            public String toString() {
                return "OnSendPublicKeyClick";
            }
        }

        public static final class k implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f33814a = new k();

            private k() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public int hashCode() {
                return 1235933485;
            }

            public String toString() {
                return "OnSharePublicKeyClick";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f33815a;

            public a(long j10) {
                this.f33815a = j10;
            }

            public final long a() {
                return this.f33815a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f33815a == ((a) obj).f33815a;
            }

            public int hashCode() {
                return Long.hashCode(this.f33815a);
            }

            public String toString() {
                return "BiometricKeyCreated(sshKeyId=" + this.f33815a + ")";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f33816a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -2058865370;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.BiometricKeyEditorScreenViewModel$c$c, reason: collision with other inner class name */
        public static final class C0524c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f33817a;

            public C0524c(long j10) {
                this.f33817a = j10;
            }

            public final long a() {
                return this.f33817a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0524c) && this.f33817a == ((C0524c) obj).f33817a;
            }

            public int hashCode() {
                return Long.hashCode(this.f33817a);
            }

            public String toString() {
                return "NavigateToExportKey(id=" + this.f33817a + ")";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f33818a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1478976174;
            }

            public String toString() {
                return "NavigateToHostSelector";
            }
        }

        public static final class e implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f33819a;

            public e(String str) {
                ju.t.f(str, Table.SSH_CERTIFICATE);
                this.f33819a = str;
            }

            public final String a() {
                return this.f33819a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && ju.t.b(this.f33819a, ((e) obj).f33819a);
            }

            public int hashCode() {
                return this.f33819a.hashCode();
            }

            public String toString() {
                return "NavigateToPasteCertificate(certificate=" + this.f33819a + ")";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33820a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f33822c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BiometricKeyEditorScreenViewModel.this.new d(this.f33822c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33820a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            BiometricKeyEditorScreenViewModel.this._showMoreMenu.setValue(kotlin.coroutines.jvm.internal.b.a(this.f33822c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BiometricKeyEditorScreenViewModel() {
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        this.uniqueId = string;
        Boolean bool = Boolean.TRUE;
        this._isSaveEnabled = zu.m0.a(bool);
        this._isMoreEnabled = zu.m0.a(bool);
        this._showMoreMenu = zu.m0.a(Boolean.FALSE);
    }

    public final k0 getShowMoreMenu() {
        return this._showMoreMenu;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final k0 isMoreEnabled() {
        return this._isMoreEnabled;
    }

    public final k0 isSaveEnabled() {
        return this._isSaveEnabled;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void updateShowMoreMenu(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }
}
