package com.server.auditor.ssh.client.navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.f3;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.presenters.UpdateInfoPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.o8;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateInfoFragment extends MvpAppCompatFragment implements f3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f28656d = {ju.n0.g(new ju.g0(UpdateInfoFragment.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/UpdateInfoPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28657e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o8 f28658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f28659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.b f28660c;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28661a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UpdateInfoFragment.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28661a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = UpdateInfoFragment.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.setResult(1001);
            fragmentActivityRequireActivity.finish();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28663a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UpdateInfoFragment.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28663a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            UpdateInfoFragment.this.Af();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28665a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UpdateInfoFragment.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28665a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NavigationPopUpWhenLargeActivity.a aVar = NavigationPopUpWhenLargeActivity.f28304b;
            g.b bVar = UpdateInfoFragment.this.f28660c;
            FragmentActivity fragmentActivityRequireActivity = UpdateInfoFragment.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            aVar.c(bVar, fragmentActivityRequireActivity, NavigationPopUpWhenLargeActivity.NavigationDestination.AccountLogoutFlow.INSTANCE);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28667a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UpdateInfoFragment.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28667a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = UpdateInfoFragment.this.getString(R.string.google_play_link);
            ju.t.e(string, "getString(...)");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            if (intent.resolveActivity(UpdateInfoFragment.this.requireActivity().getPackageManager()) != null) {
                UpdateInfoFragment.this.startActivity(intent);
            } else {
                UpdateInfoFragment.this.L5(string);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28669a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UpdateInfoFragment.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28669a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = UpdateInfoFragment.this.getResources().getString(R.string.site_android_link);
            ju.t.e(string, "getString(...)");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(string));
            if (intent.resolveActivity(UpdateInfoFragment.this.requireActivity().getPackageManager()) != null) {
                UpdateInfoFragment.this.startActivity(intent);
            } else {
                UpdateInfoFragment.this.L5(string);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28671a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f28673c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UpdateInfoFragment.this.new f(this.f28673c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28671a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            new be.b(UpdateInfoFragment.this.requireContext(), R.style.ChoosePlanAlertDialogTheme).setTitle(R.string.message_could_not_open_browser).setMessage(this.f28673c).setPositiveButton(android.R.string.ok, null).show();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public UpdateInfoFragment() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.b3
            @Override // iu.a
            public final Object a() {
                return UpdateInfoFragment.Df();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f28659b = new MoxyKtxDelegate(mvpDelegate, UpdateInfoPresenter.class.getName() + ".presenter", aVar);
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.navigation.c3
            @Override // g.a
            public final void a(Object obj) {
                UpdateInfoFragment.xf(this.f28995a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f28660c = bVarRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Af() {
        yf().f73442c.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateInfoFragment.Bf(this.f29039a, view);
            }
        });
        yf().f73444e.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.e3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateInfoFragment.Cf(this.f29044a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(UpdateInfoFragment updateInfoFragment, View view) {
        updateInfoFragment.zf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Cf(UpdateInfoFragment updateInfoFragment, View view) {
        updateInfoFragment.zf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateInfoPresenter Df() {
        return new UpdateInfoPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xf(UpdateInfoFragment updateInfoFragment, ActivityResult activityResult) {
        ju.t.f(activityResult, "it");
        updateInfoFragment.zf().r2(activityResult.getResultCode());
    }

    private final o8 yf() {
        o8 o8Var = this.f28658a;
        if (o8Var != null) {
            return o8Var;
        }
        throw new IllegalStateException();
    }

    private final UpdateInfoPresenter zf() {
        return (UpdateInfoPresenter) this.f28659b.getValue(this, f28656d[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.f3
    public void L5(String str) {
        ju.t.f(str, "url");
        bh.a.b(this, new f(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.f3
    public void Z3() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.f3
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.f3
    public void a4() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.f3
    public void j2() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f28658a = o8.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = yf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28658a = null;
    }

    @Override // com.server.auditor.ssh.client.contracts.f3
    public void q1() {
        bh.a.b(this, new c(null));
    }
}
