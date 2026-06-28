package com.server.auditor.ssh.client.navigation;

import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PackageSelectScreenViewModel;
import com.server.auditor.ssh.client.presenters.PackageSelectorPresenter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.widget.vaultselector.VaultSelectorView;
import dq.j0;
import java.util.ArrayList;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.f7;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageSelector extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.i2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f28327u = {ju.n0.g(new ju.g0(PackageSelector.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/PackageSelectorPresenter;", 0))};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f28328v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f7 f28329a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ci.b f28331c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MoxyKtxDelegate f28334f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ut.n f28330b = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.b2
        @Override // iu.a
        public final Object a() {
            return PackageSelector.Ef();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f28332d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.navigation.x f28333e = new androidx.navigation.x(ju.n0.b(PackageSelectorArgs.class), new h(this));

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28335a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28335a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28336a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f28338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, zt.e eVar) {
            super(2, eVar);
            this.f28338c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelector.this.new b(this.f28338c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            xl.a.a(PackageSelector.this.requireContext(), PackageSelector.this.Af().b());
            PackageSelector.this.Cf().sendFragmentAction(new PackageSelectScreenViewModel.b.a(this.f28338c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28339a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28341c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList, zt.e eVar) {
            super(2, eVar);
            this.f28341c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelector.this.new c(this.f28341c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28339a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PackageSelector.this.f28331c = new ci.b(this.f28341c, PackageSelector.this.f28332d);
            PackageSelector.this.Af().f72471h.setLayoutManager(new LinearLayoutManager(PackageSelector.this.requireContext()));
            RecyclerView recyclerView = PackageSelector.this.Af().f72471h;
            ci.b bVar = PackageSelector.this.f28331c;
            if (bVar == null) {
                ju.t.t("adapter");
                bVar = null;
            }
            recyclerView.setAdapter(bVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28342a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f28344c;

        public static final class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PackageSelector f28345a;

            public a(PackageSelector packageSelector) {
                this.f28345a = packageSelector;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                this.f28345a.Bf().z2(String.valueOf(editable));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(VaultKeyId vaultKeyId, zt.e eVar) {
            super(2, eVar);
            this.f28344c = vaultKeyId;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelector.this.new d(this.f28344c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28342a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputEditText textInputEditText = PackageSelector.this.Af().f72467d;
            ju.t.e(textInputEditText, "nameEditText");
            textInputEditText.addTextChangedListener(new a(PackageSelector.this));
            j0.a aVar = dq.j0.f47941a;
            VaultSelectorView vaultSelectorView = PackageSelector.this.Af().f72472i;
            ju.t.e(vaultSelectorView, "vaultSelector");
            aVar.f(vaultSelectorView, this.f28344c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class e implements com.server.auditor.ssh.client.fragments.hostngroups.l0 {

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PackageSelector f28348b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f28349c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PackageSelector packageSelector, int i10, zt.e eVar) {
                super(2, eVar);
                this.f28348b = packageSelector;
                this.f28349c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f28348b, this.f28349c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f28347a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f28348b.Bf().y2(this.f28349c);
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        e() {
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
        public boolean Ga(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
            return false;
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
        public void V8(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
            PackageSelector packageSelector = PackageSelector.this;
            bh.a.a(packageSelector, new a(packageSelector, i10, null));
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
        public boolean hb(int i10, Point point, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
            return false;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28350a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28350a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28351a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f28353c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, zt.e eVar) {
            super(2, eVar);
            this.f28353c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelector.this.new g(this.f28353c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28351a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            xl.a.a(PackageSelector.this.requireContext(), PackageSelector.this.Af().b());
            Bundle bundle = new Bundle();
            bundle.putLong("extraPackageIdKey", this.f28353c);
            androidx.fragment.app.y.b(PackageSelector.this, "SELECT_PACKAGE_REQUEST_KEY", bundle);
            androidx.navigation.fragment.c.a(PackageSelector.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class h implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f28354a;

        public h(Fragment fragment) {
            this.f28354a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f28354a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f28354a + " has null arguments");
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28355a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ArrayList arrayList, zt.e eVar) {
            super(2, eVar);
            this.f28357c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelector.this.new i(this.f28357c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28355a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ci.b bVar = PackageSelector.this.f28331c;
            ci.b bVar2 = null;
            if (bVar == null) {
                ju.t.t("adapter");
                bVar = null;
            }
            bVar.e0(this.f28357c);
            ci.b bVar3 = PackageSelector.this.f28331c;
            if (bVar3 == null) {
                ju.t.t("adapter");
            } else {
                bVar2 = bVar3;
            }
            bVar2.o();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public PackageSelector() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.c2
            @Override // iu.a
            public final Object a() {
                return PackageSelector.Df(this.f28994a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f28334f = new MoxyKtxDelegate(mvpDelegate, PackageSelectorPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f7 Af() {
        f7 f7Var = this.f28329a;
        if (f7Var != null) {
            return f7Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PackageSelectorPresenter Bf() {
        return (PackageSelectorPresenter) this.f28334f.getValue(this, f28327u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PackageSelectScreenViewModel Cf() {
        return (PackageSelectScreenViewModel) this.f28330b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageSelectorPresenter Df(PackageSelector packageSelector) {
        boolean bundleIsPanelTerminalKey = packageSelector.zf().getBundleIsPanelTerminalKey();
        VaultKeyId targetVaultKeyId = packageSelector.zf().getTargetVaultKeyId();
        ju.t.e(targetVaultKeyId, "getTargetVaultKeyId(...)");
        return new PackageSelectorPresenter(bundleIsPanelTerminalKey, targetVaultKeyId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageSelectScreenViewModel Ef() {
        PackageSelectScreenViewModel packageSelectScreenViewModelA = PackageSelectScreenViewModel.Companion.a();
        if (packageSelectScreenViewModelA != null) {
            return packageSelectScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    private final PackageSelectorArgs zf() {
        return (PackageSelectorArgs) this.f28333e.getValue();
    }

    @Override // com.server.auditor.ssh.client.contracts.i2
    public void D9(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "vaultKeyId");
        bh.a.a(this, new d(vaultKeyId, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i2
    public void Gc(long j10) {
        bh.a.a(this, new g(j10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i2
    public void Lb(long j10) {
        bh.a.a(this, new b(j10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i2
    public void Q1(String str) {
        ju.t.f(str, "title");
    }

    @Override // com.server.auditor.ssh.client.contracts.i2
    public void Y4(ArrayList arrayList) {
        ju.t.f(arrayList, "containerList");
        bh.a.a(this, new i(arrayList, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i2
    public void ia(ArrayList arrayList) {
        ju.t.f(arrayList, "containerList");
        bh.a.a(this, new c(arrayList, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i2
    public void j() {
        bh.a.a(this, new f(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f28329a = f7.c(getLayoutInflater(), viewGroup, false);
        ConstraintLayout constraintLayoutB = Af().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayoutB = Af().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        g6.Z1(constraintLayoutB, getArguments(), Boolean.valueOf(Cf().isInPanel()));
        NestedScrollView nestedScrollView = Af().f72468e;
        ju.t.e(nestedScrollView, "nestedScroll");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(Cf().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.i2
    public void tb() {
        bh.a.a(this, new a(null));
    }
}
