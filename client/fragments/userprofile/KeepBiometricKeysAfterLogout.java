package com.server.auditor.ssh.client.fragments.userprofile;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.m0;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.userprofile.KeepBiometricKeysAfterLogout;
import com.server.auditor.ssh.client.presenters.biometrickeys.KeepBiometricKeysAfterLogoutPresenter;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.u2;
import qu.k;
import ut.n;
import ut.o;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class KeepBiometricKeysAfterLogout extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.views.biometrickeys.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26969e = {n0.g(new g0(KeepBiometricKeysAfterLogout.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/biometrickeys/KeepBiometricKeysAfterLogoutPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26970f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u2 f26971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f26972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f26973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f26974d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26975a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeepBiometricKeysAfterLogout.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f26975a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            m0 m0VarA = androidx.navigation.fragment.c.a(KeepBiometricKeysAfterLogout.this);
            d0 d0VarA = m0VarA.A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("CONFIRM_LOGOUT_SCREEN_RESULT_KEY", kotlin.coroutines.jvm.internal.b.a(true));
            }
            if (!m0VarA.T()) {
                KeepBiometricKeysAfterLogout.this.zf(1001);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26977a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeepBiometricKeysAfterLogout.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26977a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (KeepBiometricKeysAfterLogout.this.Cf().isShowing()) {
                KeepBiometricKeysAfterLogout.this.Cf().dismiss();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26979a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeepBiometricKeysAfterLogout.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26979a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            KeepBiometricKeysAfterLogout.this.Df();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26981a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeepBiometricKeysAfterLogout.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f26981a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            m0 m0VarA = androidx.navigation.fragment.c.a(KeepBiometricKeysAfterLogout.this);
            d0 d0VarA = m0VarA.A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("CONFIRM_LOGOUT_SCREEN_RESULT_KEY", kotlin.coroutines.jvm.internal.b.a(false));
            }
            if (!m0VarA.T()) {
                KeepBiometricKeysAfterLogout.this.zf(1000);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26983a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeepBiometricKeysAfterLogout.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26983a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!KeepBiometricKeysAfterLogout.this.Cf().isShowing()) {
                KeepBiometricKeysAfterLogout.this.Cf().show();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26985a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26987c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return KeepBiometricKeysAfterLogout.this.new f(this.f26987c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26985a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            AppCompatTextView appCompatTextView = KeepBiometricKeysAfterLogout.this.Af().f74043h;
            Resources resources = KeepBiometricKeysAfterLogout.this.getResources();
            int i10 = this.f26987c;
            appCompatTextView.setText(resources.getQuantityString(R.plurals.you_have_n_keys_android_key_store, i10, kotlin.coroutines.jvm.internal.b.d(i10)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public KeepBiometricKeysAfterLogout() {
        iu.a aVar = new iu.a() { // from class: ji.a
            @Override // iu.a
            public final Object a() {
                return KeepBiometricKeysAfterLogout.Gf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26972b = new MoxyKtxDelegate(mvpDelegate, KeepBiometricKeysAfterLogoutPresenter.class.getName() + ".presenter", aVar);
        this.f26974d = o.a(new iu.a() { // from class: ji.b
            @Override // iu.a
            public final Object a() {
                return KeepBiometricKeysAfterLogout.Hf(this.f62029a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u2 Af() {
        u2 u2Var = this.f26971a;
        if (u2Var != null) {
            return u2Var;
        }
        throw new IllegalStateException();
    }

    private final KeepBiometricKeysAfterLogoutPresenter Bf() {
        return (KeepBiometricKeysAfterLogoutPresenter) this.f26972b.getValue(this, f26969e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Cf() {
        return (AlertDialog) this.f26974d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df() {
        Af().f74041f.setOnClickListener(new View.OnClickListener() { // from class: ji.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepBiometricKeysAfterLogout.Ef(this.f62031a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(KeepBiometricKeysAfterLogout keepBiometricKeysAfterLogout, View view) {
        keepBiometricKeysAfterLogout.Bf().t2(keepBiometricKeysAfterLogout.Af().f74039d.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Ff(KeepBiometricKeysAfterLogout keepBiometricKeysAfterLogout, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        keepBiometricKeysAfterLogout.Bf().s2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeepBiometricKeysAfterLogoutPresenter Gf() {
        return new KeepBiometricKeysAfterLogoutPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Hf(KeepBiometricKeysAfterLogout keepBiometricKeysAfterLogout) {
        Context contextRequireContext = keepBiometricKeysAfterLogout.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zf(int i10) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(i10);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void L4(int i10) {
        bh.a.b(this, new f(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void b() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void c() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void d() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void e() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void h0() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: ji.c
            @Override // iu.l
            public final Object invoke(Object obj) {
                return KeepBiometricKeysAfterLogout.Ff(this.f62030a, (e0) obj);
            }
        }, 2, null);
        this.f26973c = e0VarB;
        if (e0VarB == null) {
            t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f26971a = u2.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = Af().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26971a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        e0 e0Var = this.f26973c;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
    }
}
