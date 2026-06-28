package com.server.auditor.ssh.client.navigation.totp;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.t2;
import com.server.auditor.ssh.client.navigation.totp.TwoFactorCopyCode;
import com.server.auditor.ssh.client.navigation.totp.f;
import com.server.auditor.ssh.client.presenters.totp.TwoFactorCopyCodePresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.h8;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class TwoFactorCopyCode extends MvpAppCompatFragment implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ClipboardManager f30140a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h8 f30142c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MoxyKtxDelegate f30144e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f30138u = {n0.g(new g0(TwoFactorCopyCode.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/totp/TwoFactorCopyCodePresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f30137f = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f30139v = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30141b = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f30143d = new x(n0.b(TwoFactorCopyCodeArgs.class), new i(this));

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30145a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TwoFactorCopyCode.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30145a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TwoFactorCopyCode.this.dg();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30147a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f30149c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TwoFactorCopyCode.this.new c(this.f30149c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30147a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ClipboardManager clipboardManager = TwoFactorCopyCode.this.f30140a;
            if (clipboardManager != null) {
                String str = this.f30149c;
                TwoFactorCopyCode twoFactorCopyCode = TwoFactorCopyCode.this;
                clipboardManager.setPrimaryClip(ClipData.newPlainText("TwoFactorCode", str));
                twoFactorCopyCode.Kf();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30150a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30154e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, String str3, zt.e eVar) {
            super(2, eVar);
            this.f30152c = str;
            this.f30153d = str2;
            this.f30154e = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TwoFactorCopyCode.this.new d(this.f30152c, this.f30153d, this.f30154e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30150a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TwoFactorCopyCode twoFactorCopyCode = TwoFactorCopyCode.this;
            String str = this.f30152c;
            String string = twoFactorCopyCode.getString(R.string.otp_scheme_for_2fa_providers_app, str, this.f30153d, this.f30154e, str);
            t.e(string, "getString(...)");
            twoFactorCopyCode.f30141b = string;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30155a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TwoFactorCopyCode.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30155a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TwoFactorCopyCode twoFactorCopyCode = TwoFactorCopyCode.this;
            Context context = twoFactorCopyCode.getContext();
            Object systemService = context != null ? context.getSystemService("clipboard") : null;
            twoFactorCopyCode.f30140a = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            TwoFactorCopyCode.this.Rf();
            TwoFactorCopyCode.this.Yf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30157a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TwoFactorCopyCode.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30157a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(TwoFactorCopyCode.this).T()) {
                TwoFactorCopyCode.this.Mf(0);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30159a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30161c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f30161c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TwoFactorCopyCode.this.new g(this.f30161c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30159a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TwoFactorCopyCode.this.Of().f72674l.setText(this.f30161c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TwoFactorCopyCode f30164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, TwoFactorCopyCode twoFactorCopyCode, zt.e eVar) {
            super(2, eVar);
            this.f30163b = str;
            this.f30164c = twoFactorCopyCode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f30163b, this.f30164c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30162a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            f.a aVarA = com.server.auditor.ssh.client.navigation.totp.f.a(this.f30163b);
            t.e(aVarA, "actionTwoFactorCopyCodeToTwoFactorEnableTOTP(...)");
            androidx.navigation.fragment.c.a(this.f30164c).O(aVarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class i implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f30165a;

        public i(Fragment fragment) {
            this.f30165a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f30165a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f30165a + " has null arguments");
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30166a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TwoFactorCopyCode.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30166a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TwoFactorCopyCode twoFactorCopyCode = TwoFactorCopyCode.this;
            Intent intentPf = twoFactorCopyCode.Pf(twoFactorCopyCode.f30141b);
            if (TwoFactorCopyCode.this.bg(intentPf)) {
                try {
                    TwoFactorCopyCode.this.startActivity(intentPf);
                } catch (ActivityNotFoundException unused) {
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30168a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TwoFactorCopyCode.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30168a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TwoFactorCopyCode twoFactorCopyCode = TwoFactorCopyCode.this;
            Intent intentPf = twoFactorCopyCode.Pf(twoFactorCopyCode.f30141b);
            MaterialButton materialButton = TwoFactorCopyCode.this.Of().f72670h;
            t.e(materialButton, "open2faProviderAppButton");
            materialButton.setVisibility(TwoFactorCopyCode.this.bg(intentPf) ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TwoFactorCopyCode() {
        iu.a aVar = new iu.a() { // from class: zj.p0
            @Override // iu.a
            public final Object a() {
                return TwoFactorCopyCode.cg(this.f87997a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f30144e = new MoxyKtxDelegate(mvpDelegate, TwoFactorCopyCodePresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        Of().f72668f.setText(getString(R.string.copied));
        Context context = getContext();
        if (context != null) {
            Of().f72668f.setIcon(androidx.core.content.a.getDrawable(context, 2131231311));
        }
        Of().f72668f.animate().setDuration(2000L).withEndAction(new Runnable() { // from class: zj.o0
            @Override // java.lang.Runnable
            public final void run() {
                TwoFactorCopyCode.Lf(this.f87996a);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(TwoFactorCopyCode twoFactorCopyCode) {
        bh.a.b(twoFactorCopyCode, twoFactorCopyCode.new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf(int i10) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(i10);
        fragmentActivityRequireActivity.finish();
    }

    private final TwoFactorCopyCodeArgs Nf() {
        return (TwoFactorCopyCodeArgs) this.f30143d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h8 Of() {
        h8 h8Var = this.f30142c;
        if (h8Var != null) {
            return h8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent Pf(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    private final TwoFactorCopyCodePresenter Qf() {
        return (TwoFactorCopyCodePresenter) this.f30144e.getValue(this, f30138u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf() {
        Of().f72664b.f72289c.setText(getString(R.string.totp_2fa_copy_code_title));
        Of().f72664b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: zj.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TwoFactorCopyCode.Sf(this.f87994a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sf(TwoFactorCopyCode twoFactorCopyCode, View view) {
        twoFactorCopyCode.Qf().v2();
    }

    private final void Tf() {
        Of().f72667e.setOnClickListener(new View.OnClickListener() { // from class: zj.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TwoFactorCopyCode.Uf(this.f87998a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uf(TwoFactorCopyCode twoFactorCopyCode, View view) {
        twoFactorCopyCode.Qf().w2();
    }

    private final void Vf() {
        Of().f72668f.setOnTouchListener(new View.OnTouchListener() { // from class: zj.r0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TwoFactorCopyCode.Wf(this.f88000a, view, motionEvent);
            }
        });
        Of().f72668f.setOnClickListener(new View.OnClickListener() { // from class: zj.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TwoFactorCopyCode.Xf(this.f88002a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Wf(TwoFactorCopyCode twoFactorCopyCode, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        twoFactorCopyCode.dg();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Xf(TwoFactorCopyCode twoFactorCopyCode, View view) {
        twoFactorCopyCode.Qf().x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Yf() {
        Vf();
        Tf();
        Zf();
    }

    private final void Zf() {
        Of().f72670h.setOnClickListener(new View.OnClickListener() { // from class: zj.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TwoFactorCopyCode.ag(this.f88004a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ag(TwoFactorCopyCode twoFactorCopyCode, View view) {
        twoFactorCopyCode.Qf().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean bg(Intent intent) {
        FragmentActivity activity = getActivity();
        return (activity == null || intent.resolveActivity(activity.getPackageManager()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TwoFactorCopyCodePresenter cg(TwoFactorCopyCode twoFactorCopyCode) {
        String token = twoFactorCopyCode.Nf().getToken();
        t.e(token, "getToken(...)");
        String providerCode = twoFactorCopyCode.Nf().getProviderCode();
        t.e(providerCode, "getProviderCode(...)");
        String issuer = twoFactorCopyCode.Nf().getIssuer();
        t.e(issuer, "getIssuer(...)");
        String email = twoFactorCopyCode.Nf().getEmail();
        t.e(email, "getEmail(...)");
        return new TwoFactorCopyCodePresenter(token, providerCode, issuer, email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dg() {
        Of().f72668f.setText(getString(R.string.copy));
        Of().f72668f.setIcon(null);
    }

    @Override // com.server.auditor.ssh.client.contracts.t2
    public void Bd() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.t2
    public void P5(String str) {
        t.f(str, "twoFactorCode");
        bh.a.b(this, new c(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.t2
    public void U6(String str) {
        t.f(str, "token");
        bh.a.b(this, new h(str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.t2
    public void Z4() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.t2
    public void ab(String str, String str2, String str3) {
        t.f(str, "issuer");
        t.f(str2, "email");
        t.f(str3, "code");
        bh.a.b(this, new d(str, str2, str3, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.t2
    public void i8(String str) {
        t.f(str, "twoFactorCode");
        bh.a.b(this, new g(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        bh.a.b(this, new f(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f30142c = h8.c(layoutInflater, viewGroup, false);
        View viewB = Of().b();
        t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f30142c = null;
    }
}
