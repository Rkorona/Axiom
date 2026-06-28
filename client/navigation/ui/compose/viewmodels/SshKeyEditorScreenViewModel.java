package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.keymanager.CertificatePasteScreen;
import com.server.auditor.ssh.client.keymanager.SshPrivateKeyPasteScreen;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.UUID;
import ut.m0;
import wu.i0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class SshKeyEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static SshKeyEditorScreenViewModel composeViewModel;
    private final zu.w _canEdit;
    private final zu.w _hasPublicKey;
    private final zu.w _isMoreEnabled;
    private final zu.w _isSaveEnabled;
    private final zu.w _screenTitle;
    private final zu.w _showMoreMenu;
    private final String uniqueId;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final SshKeyEditorScreenViewModel a() {
            return SshKeyEditorScreenViewModel.composeViewModel;
        }

        public final void b(SshKeyEditorScreenViewModel sshKeyEditorScreenViewModel) {
            SshKeyEditorScreenViewModel.composeViewModel = sshKeyEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34653a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1339495714;
            }

            public String toString() {
                return "OnAttachKeyClick";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SshKeyEditorScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0556b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0556b f34654a = new C0556b();

            private C0556b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0556b);
            }

            public int hashCode() {
                return -561416677;
            }

            public String toString() {
                return "OnCopyPublicKeyClick";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34655a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -627549295;
            }

            public String toString() {
                return "OnExportKeyClick";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f34656a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 131303953;
            }

            public String toString() {
                return "OnPasteCertificateCanceled";
            }
        }

        public static final class e implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f34657b = CertificatePasteScreen.PasteCertificateResultData.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CertificatePasteScreen.PasteCertificateResultData f34658a;

            public e(CertificatePasteScreen.PasteCertificateResultData pasteCertificateResultData) {
                ju.t.f(pasteCertificateResultData, "pasteCertificateResult");
                this.f34658a = pasteCertificateResultData;
            }

            public final CertificatePasteScreen.PasteCertificateResultData a() {
                return this.f34658a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && ju.t.b(this.f34658a, ((e) obj).f34658a);
            }

            public int hashCode() {
                return this.f34658a.hashCode();
            }

            public String toString() {
                return "OnPasteCertificateResult(pasteCertificateResult=" + this.f34658a + ")";
            }
        }

        public static final class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f34659a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -144707623;
            }

            public String toString() {
                return "OnPasteKeyCanceled";
            }
        }

        public static final class g implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshPrivateKeyPasteScreen.PastePrivateKeyResultData f34660a;

            public g(SshPrivateKeyPasteScreen.PastePrivateKeyResultData pastePrivateKeyResultData) {
                ju.t.f(pastePrivateKeyResultData, "pastePrivateKeyResult");
                this.f34660a = pastePrivateKeyResultData;
            }

            public final SshPrivateKeyPasteScreen.PastePrivateKeyResultData a() {
                return this.f34660a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && ju.t.b(this.f34660a, ((g) obj).f34660a);
            }

            public int hashCode() {
                return this.f34660a.hashCode();
            }

            public String toString() {
                return "OnPasteKeyResult(pastePrivateKeyResult=" + this.f34660a + ")";
            }
        }

        public static final class h implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f34661a = new h();

            private h() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return -858883175;
            }

            public String toString() {
                return "OnRemoveSshKeyClick";
            }
        }

        public static final class i implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f34662a = new i();

            private i() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public int hashCode() {
                return -512362441;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }

        public static final class j implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f34663a = new j();

            private j() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public int hashCode() {
                return 926551477;
            }

            public String toString() {
                return "OnSavePublicKeyAsFileClick";
            }
        }

        public static final class k implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34664a;

            public k(long j10) {
                this.f34664a = j10;
            }

            public final long a() {
                return this.f34664a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && this.f34664a == ((k) obj).f34664a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34664a);
            }

            public String toString() {
                return "OnSelectHostIdResult(selectedHostId=" + this.f34664a + ")";
            }
        }

        public static final class l implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f34665a = new l();

            private l() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public int hashCode() {
                return -555648786;
            }

            public String toString() {
                return "OnSendPublicKeyClick";
            }
        }

        public static final class m implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final m f34666a = new m();

            private m() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public int hashCode() {
                return -1292691235;
            }

            public String toString() {
                return "OnSharePublicKeyClick";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34674a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34676c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34676c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshKeyEditorScreenViewModel.this.new d(this.f34676c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34674a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshKeyEditorScreenViewModel.this._canEdit.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34676c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34677a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34679c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34679c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshKeyEditorScreenViewModel.this.new e(this.f34679c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34677a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshKeyEditorScreenViewModel.this._hasPublicKey.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34679c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34680a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34682c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34682c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshKeyEditorScreenViewModel.this.new f(this.f34682c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34680a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshKeyEditorScreenViewModel.this._isMoreEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34682c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34683a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34685c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshKeyEditorScreenViewModel.this.new g(this.f34685c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34683a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshKeyEditorScreenViewModel.this._isSaveEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34685c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34686a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f34688c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshKeyEditorScreenViewModel.this.new h(this.f34688c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34686a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshKeyEditorScreenViewModel.this._screenTitle.setValue(this.f34688c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34689a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34691c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshKeyEditorScreenViewModel.this.new i(this.f34691c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34689a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshKeyEditorScreenViewModel.this._showMoreMenu.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34691c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshKeyEditorScreenViewModel() {
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        this.uniqueId = string;
        Boolean bool = Boolean.FALSE;
        this._isSaveEnabled = zu.m0.a(bool);
        this._isMoreEnabled = zu.m0.a(bool);
        this._showMoreMenu = zu.m0.a(bool);
        this._canEdit = zu.m0.a(bool);
        this._hasPublicKey = zu.m0.a(bool);
        this._screenTitle = zu.m0.a(TermiusApplication.F().getString(R.string.edit_key_title));
    }

    public final k0 getCanEdit() {
        return this._canEdit;
    }

    public final k0 getHasPublicKey() {
        return this._hasPublicKey;
    }

    public final k0 getScreenTitle() {
        return this._screenTitle;
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

    public final void updateCanEdit(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }

    public final void updateHasPublicKey(boolean z10) {
        wu.k.d(j1.a(this), null, null, new e(z10, null), 3, null);
    }

    public final void updateMoreButton(boolean z10) {
        wu.k.d(j1.a(this), null, null, new f(z10, null), 3, null);
    }

    public final void updateSaveButton(boolean z10) {
        wu.k.d(j1.a(this), null, null, new g(z10, null), 3, null);
    }

    public final void updateScreenTitle(String str) {
        ju.t.f(str, "title");
        wu.k.d(j1.a(this), null, null, new h(str, null), 3, null);
    }

    public final void updateShowMoreMenu(boolean z10) {
        wu.k.d(j1.a(this), null, null, new i(z10, null), 3, null);
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34667a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1656262518;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SshKeyEditorScreenViewModel$c$c, reason: collision with other inner class name */
        public static final class C0557c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34671a;

            public C0557c(String str) {
                ju.t.f(str, Table.SSH_CERTIFICATE);
                this.f34671a = str;
            }

            public final String a() {
                return this.f34671a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0557c) && ju.t.b(this.f34671a, ((C0557c) obj).f34671a);
            }

            public int hashCode() {
                return this.f34671a.hashCode();
            }

            public String toString() {
                return "NavigateToPasteCertificate(certificate=" + this.f34671a + ")";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34672a;

            public d(String str) {
                ju.t.f(str, Column.KEY_PRIVATE);
                this.f34672a = str;
            }

            public final String a() {
                return this.f34672a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && ju.t.b(this.f34672a, ((d) obj).f34672a);
            }

            public int hashCode() {
                return this.f34672a.hashCode();
            }

            public String toString() {
                return "NavigateToPastePrivateKey(privateKey=" + this.f34672a + ")";
            }
        }

        public static final class e implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34673a;

            public e(long j10) {
                this.f34673a = j10;
            }

            public final long a() {
                return this.f34673a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f34673a == ((e) obj).f34673a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34673a);
            }

            public String toString() {
                return "SshKeyCreated(sshKeyId=" + this.f34673a + ")";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f34668c = VaultKeyId.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f34669a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final VaultKeyId f34670b;

            public b(Long l10, VaultKeyId vaultKeyId) {
                ju.t.f(vaultKeyId, "vaultKeyId");
                this.f34669a = l10;
                this.f34670b = vaultKeyId;
            }

            public final Long a() {
                return this.f34669a;
            }

            public final VaultKeyId b() {
                return this.f34670b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return ju.t.b(this.f34669a, bVar.f34669a) && ju.t.b(this.f34670b, bVar.f34670b);
            }

            public int hashCode() {
                Long l10 = this.f34669a;
                return ((l10 == null ? 0 : l10.hashCode()) * 31) + this.f34670b.hashCode();
            }

            public String toString() {
                return "NavigateToHostSelector(id=" + this.f34669a + ", vaultKeyId=" + this.f34670b + ")";
            }

            public /* synthetic */ b(Long l10, VaultKeyId vaultKeyId, int i10, ju.k kVar) {
                this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? VaultKeyId.Companion.a() : vaultKeyId);
            }
        }
    }
}
