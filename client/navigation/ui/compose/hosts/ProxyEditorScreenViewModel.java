package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.proxy.ProxyDataMediator;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.FragmentWrapperViewModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;

/* JADX INFO: loaded from: classes3.dex */
public final class ProxyEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static ProxyEditorScreenViewModel composeViewModel;
    private ProxyDataMediator proxy;
    public static final a Companion = new a(null);
    public static final int $stable = 8;
    private VaultKeyId vaultKeyId = VaultKeyId.Companion.a();
    private final zu.w _isSaveEnabled = zu.m0.a(Boolean.FALSE);

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final ProxyEditorScreenViewModel a() {
            return ProxyEditorScreenViewModel.composeViewModel;
        }

        public final void b(ProxyEditorScreenViewModel proxyEditorScreenViewModel) {
            ProxyEditorScreenViewModel.composeViewModel = proxyEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Identity f30831a;

            public a(Identity identity) {
                ju.t.f(identity, "identity");
                this.f30831a = identity;
            }

            public final Identity a() {
                return this.f30831a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f30831a, ((a) obj).f30831a);
            }

            public int hashCode() {
                return this.f30831a.hashCode();
            }

            public String toString() {
                return "OnIdentitySelected(identity=" + this.f30831a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ProxyEditorScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0483b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0483b f30832a = new C0483b();

            private C0483b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0483b);
            }

            public int hashCode() {
                return 1164483878;
            }

            public String toString() {
                return "OnSavePressed";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f30833a;

            public a(VaultKeyId vaultKeyId) {
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                this.f30833a = vaultKeyId;
            }

            public final VaultKeyId a() {
                return this.f30833a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f30833a, ((a) obj).f30833a);
            }

            public int hashCode() {
                return this.f30833a.hashCode();
            }

            public String toString() {
                return "OnRequestShowIdentitySelector(targetVaultKeyId=" + this.f30833a + ")";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30834a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f30836c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f30836c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProxyEditorScreenViewModel.this.new d(this.f30836c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30834a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProxyEditorScreenViewModel.this._isSaveEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(this.f30836c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public final ProxyDataMediator getProxy() {
        return this.proxy;
    }

    public final VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    public final zu.k0 isSaveEnabled() {
        return this._isSaveEnabled;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setProxy(ProxyDataMediator proxyDataMediator) {
        this.proxy = proxyDataMediator;
    }

    public final void setVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.vaultKeyId = vaultKeyId;
    }

    public final void updateSaveButtonState(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new d(z10, null), 3, null);
    }
}
