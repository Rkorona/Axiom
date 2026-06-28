package com.server.auditor.ssh.client.navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.u0;
import com.server.auditor.ssh.client.presenters.InstallAuthyPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class InstallAuthyFragment extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.d3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f28195d = {ju.n0.g(new ju.g0(InstallAuthyFragment.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/InstallAuthyPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28196e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qg.t2 f28197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f28198b = new androidx.navigation.x(ju.n0.b(InstallAuthyFragmentArgs.class), new e(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f28199c;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28200a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return InstallAuthyFragment.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28200a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            InstallAuthyFragment.this.Df();
            InstallAuthyFragment.this.Ff();
            String string = InstallAuthyFragment.this.getString(R.string.two_auth_instructions_link_text);
            ju.t.e(string, "getString(...)");
            Spanned spannedA = m4.b.a(string, 0);
            ju.t.e(spannedA, "fromHtml(...)");
            InstallAuthyFragment.this.Bf().f73922e.setText(spannedA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28202a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return InstallAuthyFragment.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28202a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(InstallAuthyFragment.this).T()) {
                InstallAuthyFragment.this.zf(0);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28204a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return InstallAuthyFragment.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28204a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Intent intent = new Intent("android.intent.action.VIEW");
            String string = InstallAuthyFragment.this.requireActivity().getString(R.string.two_auth_instructions_link);
            ju.t.e(string, "getString(...)");
            intent.setData(Uri.parse(string));
            if (InstallAuthyFragment.this.getContext() instanceof FragmentActivity) {
                if (intent.resolveActivity(InstallAuthyFragment.this.requireActivity().getPackageManager()) != null) {
                    InstallAuthyFragment.this.requireActivity().startActivity(intent);
                } else {
                    new be.b(InstallAuthyFragment.this.requireContext()).setTitle(R.string.message_could_not_open_browser).setMessage(string).setPositiveButton(android.R.string.ok, null).show();
                }
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallAuthyFragment f28208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, InstallAuthyFragment installAuthyFragment, zt.e eVar) {
            super(2, eVar);
            this.f28207b = str;
            this.f28208c = installAuthyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f28207b, this.f28208c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28206a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            u0.a aVarA = u0.a(this.f28207b);
            ju.t.e(aVarA, "actionInstallAuthyToEnterPhoneNumber(...)");
            androidx.navigation.fragment.c.a(this.f28208c).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class e implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f28209a;

        public e(Fragment fragment) {
            this.f28209a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f28209a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f28209a + " has null arguments");
        }
    }

    public InstallAuthyFragment() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.t0
            @Override // iu.a
            public final Object a() {
                return InstallAuthyFragment.If(this.f29864a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f28199c = new MoxyKtxDelegate(mvpDelegate, InstallAuthyPresenter.class.getName() + ".presenter", aVar);
    }

    private final InstallAuthyFragmentArgs Af() {
        return (InstallAuthyFragmentArgs) this.f28198b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qg.t2 Bf() {
        qg.t2 t2Var = this.f28197a;
        if (t2Var != null) {
            return t2Var;
        }
        throw new IllegalStateException();
    }

    private final InstallAuthyPresenter Cf() {
        return (InstallAuthyPresenter) this.f28199c.getValue(this, f28195d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df() {
        Bf().f73919b.f72289c.setText(getString(R.string.two_factor_dialog_install_authy));
        Bf().f73919b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallAuthyFragment.Ef(this.f29582a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(InstallAuthyFragment installAuthyFragment, View view) {
        installAuthyFragment.Cf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ff() {
        Bf().f73920c.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallAuthyFragment.Gf(this.f29575a, view);
            }
        });
        Bf().f73922e.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallAuthyFragment.Hf(this.f29578a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gf(InstallAuthyFragment installAuthyFragment, View view) {
        installAuthyFragment.Cf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Hf(InstallAuthyFragment installAuthyFragment, View view) {
        installAuthyFragment.Cf().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallAuthyPresenter If(InstallAuthyFragment installAuthyFragment) {
        String token = installAuthyFragment.Af().getToken();
        ju.t.e(token, "getToken(...)");
        return new InstallAuthyPresenter(token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zf(int i10) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(i10);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.server.auditor.ssh.client.contracts.d3
    public void Se() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.d3
    public void Va(String str) {
        ju.t.f(str, "token");
        bh.a.b(this, new d(str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        this.f28197a = qg.t2.c(layoutInflater, viewGroup, false);
        View viewB = Bf().b();
        ju.t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28197a = null;
    }
}
