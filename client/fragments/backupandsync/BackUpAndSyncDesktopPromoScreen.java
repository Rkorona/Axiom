package com.server.auditor.ssh.client.fragments.backupandsync;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.d0;
import androidx.navigation.i1;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.backupandsync.BackUpAndSyncDesktopPromoScreen;
import com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncDesktopPromoScreenPresenter;
import com.server.auditor.ssh.client.widget.ProgressButton;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.t;
import ut.m0;
import ut.n;
import ut.o;
import ut.s;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class BackUpAndSyncDesktopPromoScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t f24293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f24294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f24295c = o.a(new iu.a() { // from class: dh.c
        @Override // iu.a
        public final Object a() {
            return BackUpAndSyncDesktopPromoScreen.Ff(this.f47802a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f24296d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24291f = {n0.g(new g0(BackUpAndSyncDesktopPromoScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/backupandsync/BackUpAndSyncDesktopPromoScreenPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24290e = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f24292u = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24297a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24297a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreen.this.Wf("", false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24300b;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            c cVar = BackUpAndSyncDesktopPromoScreen.this.new c(eVar);
            cVar.f24300b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24299a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ClipboardManager clipboardManagerHf = BackUpAndSyncDesktopPromoScreen.this.Hf();
            if (clipboardManagerHf != null) {
                BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen = BackUpAndSyncDesktopPromoScreen.this;
                clipboardManagerHf.setPrimaryClip(ClipData.newPlainText("Termius Download Link", backUpAndSyncDesktopPromoScreen.getString(R.string.termius_download_link)));
                backUpAndSyncDesktopPromoScreen.If().u2();
            } else {
                BackUpAndSyncDesktopPromoScreen.this.If().v2();
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
        int f24302a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24302a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = BackUpAndSyncDesktopPromoScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24304a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24304a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreen.this.Qf();
            BackUpAndSyncDesktopPromoScreen.this.Mf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24306a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24306a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!androidx.navigation.fragment.c.a(BackUpAndSyncDesktopPromoScreen.this).T()) {
                BackUpAndSyncDesktopPromoScreen.this.p();
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
        int f24308a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24310c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f24310c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreen.this.new g(this.f24310c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24308a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreen.this.Wf(this.f24310c, true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24311a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreen.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24311a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen = BackUpAndSyncDesktopPromoScreen.this;
            String string = backUpAndSyncDesktopPromoScreen.getString(R.string.login_registration_network_error);
            ju.t.e(string, "getString(...)");
            backUpAndSyncDesktopPromoScreen.Wf(string, true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24313a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreen.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24313a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen = BackUpAndSyncDesktopPromoScreen.this;
            String string = backUpAndSyncDesktopPromoScreen.getString(R.string.unknown_request_error);
            ju.t.e(string, "getString(...)");
            backUpAndSyncDesktopPromoScreen.Wf(string, true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressButton.b f24316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BackUpAndSyncDesktopPromoScreen f24317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ProgressButton.b bVar, BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen, zt.e eVar) {
            super(2, eVar);
            this.f24316b = bVar;
            this.f24317c = backUpAndSyncDesktopPromoScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new j(this.f24316b, this.f24317c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24315a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProgressButton.b bVar = this.f24316b;
            if (ju.t.b(bVar, ProgressButton.b.c.f46551a)) {
                this.f24317c.Gf().f73880f.setIndeterminateButtonState();
                this.f24317c.Gf().f73880f.setEnabled(false);
            } else if (ju.t.b(bVar, ProgressButton.b.C0663b.f46550a)) {
                this.f24317c.Gf().f73880f.setDefaultButtonState();
                this.f24317c.Gf().f73880f.setEnabled(true);
            } else {
                if (!ju.t.b(bVar, ProgressButton.b.a.f46549a)) {
                    throw new s();
                }
                this.f24317c.Gf().f73880f.setCompleteButtonState(false);
                this.f24317c.Gf().f73880f.setEnabled(false);
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
        int f24318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressButton.b f24319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BackUpAndSyncDesktopPromoScreen f24320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ProgressButton.b bVar, BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen, zt.e eVar) {
            super(2, eVar);
            this.f24319b = bVar;
            this.f24320c = backUpAndSyncDesktopPromoScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k(this.f24319b, this.f24320c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24318a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProgressButton.b bVar = this.f24319b;
            if (ju.t.b(bVar, ProgressButton.b.c.f46551a)) {
                this.f24320c.Gf().f73886l.setIndeterminateButtonState();
                this.f24320c.Gf().f73886l.setEnabled(false);
            } else if (ju.t.b(bVar, ProgressButton.b.C0663b.f46550a)) {
                this.f24320c.Gf().f73886l.setDefaultButtonState();
                this.f24320c.Gf().f73886l.setEnabled(true);
            } else {
                if (!ju.t.b(bVar, ProgressButton.b.a.f46549a)) {
                    throw new s();
                }
                this.f24320c.Gf().f73886l.setCompleteButtonState(false);
                this.f24320c.Gf().f73886l.setEnabled(false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BackUpAndSyncDesktopPromoScreen() {
        iu.a aVar = new iu.a() { // from class: dh.d
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDesktopPromoScreen.Vf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24296d = new MoxyKtxDelegate(mvpDelegate, BackUpAndSyncDesktopPromoScreenPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClipboardManager Ff(BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen) {
        Context context = backUpAndSyncDesktopPromoScreen.getContext();
        Object systemService = context != null ? context.getSystemService("clipboard") : null;
        if (systemService instanceof ClipboardManager) {
            return (ClipboardManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t Gf() {
        t tVar = this.f24293a;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipboardManager Hf() {
        return (ClipboardManager) this.f24295c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BackUpAndSyncDesktopPromoScreenPresenter If() {
        return (BackUpAndSyncDesktopPromoScreenPresenter) this.f24296d.getValue(this, f24291f[0]);
    }

    private final void Jf() {
        Gf().f73880f.setOnClickListener(new View.OnClickListener() { // from class: dh.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncDesktopPromoScreen.Kf(this.f47807a, view);
            }
        });
        Gf().f73880f.setOnCompleteListener(new iu.a() { // from class: dh.g
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDesktopPromoScreen.Lf(this.f47809a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen, View view) {
        backUpAndSyncDesktopPromoScreen.If().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Lf(BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen) {
        backUpAndSyncDesktopPromoScreen.Gf().f73880f.setEnabled(true);
        backUpAndSyncDesktopPromoScreen.Gf().f73880f.setClickable(true);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        Jf();
        Nf();
    }

    private final void Nf() {
        Gf().f73886l.setOnClickListener(new View.OnClickListener() { // from class: dh.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncDesktopPromoScreen.Of(this.f47800a, view);
            }
        });
        Gf().f73886l.setOnCompleteListener(new iu.a() { // from class: dh.b
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDesktopPromoScreen.Pf(this.f47801a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Of(BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen, View view) {
        backUpAndSyncDesktopPromoScreen.If().w2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Pf(BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen) {
        backUpAndSyncDesktopPromoScreen.Gf().f73886l.setEnabled(true);
        backUpAndSyncDesktopPromoScreen.Gf().f73886l.setClickable(true);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qf() {
        if (!Sf()) {
            Gf().f73876b.f72288b.setImageResource(R.drawable.close_button);
        }
        if (Tf()) {
            Gf().f73876b.f72289c.setText(getString(R.string.back_up_and_sync_title));
            Gf().f73881g.setText(getString(R.string.back_up_and_sync_desktop_promo_description));
        } else {
            Gf().f73876b.f72289c.setText(getString(R.string.back_up_and_sync_desktop_promo_screen_title));
            Gf().f73881g.setText(getString(R.string.back_up_and_sync_desktop_promo_congratulation_description));
        }
        Gf().f73876b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: dh.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncDesktopPromoScreen.Rf(this.f47805a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rf(BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen, View view) {
        backUpAndSyncDesktopPromoScreen.If().s2();
    }

    private final boolean Sf() {
        return androidx.navigation.fragment.c.a(this).A() != null;
    }

    private final boolean Tf() {
        i1 i1VarD;
        d0 d0VarA = androidx.navigation.fragment.c.a(this).A();
        return (d0VarA == null || (i1VarD = d0VarA.d()) == null || i1VarD.q() != R.id.backUpAndSyncDevicesScreen) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Uf(BackUpAndSyncDesktopPromoScreen backUpAndSyncDesktopPromoScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        backUpAndSyncDesktopPromoScreen.If().x2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackUpAndSyncDesktopPromoScreenPresenter Vf() {
        return new BackUpAndSyncDesktopPromoScreenPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Wf(String str, boolean z10) {
        Gf().f73885k.setText(str);
        TextView textView = Gf().f73885k;
        ju.t.e(textView, ErrorResponseData.JSON_ERROR_MESSAGE);
        textView.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void K0() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void T0(ProgressButton.b bVar) {
        ju.t.f(bVar, "state");
        bh.a.b(this, new j(bVar, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void a() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void b() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void n0() {
        bh.a.b(this, new h(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: dh.h
            @Override // iu.l
            public final Object invoke(Object obj) {
                return BackUpAndSyncDesktopPromoScreen.Uf(this.f47812a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24294b = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24293a = t.c(layoutInflater, viewGroup, false);
        View viewB = Gf().b();
        ju.t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f24293a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24294b;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void p() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void qa() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void s9() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void showErrorMessage(String str) {
        ju.t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        bh.a.b(this, new g(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b
    public void wd(ProgressButton.b bVar) {
        ju.t.f(bVar, "state");
        bh.a.b(this, new k(bVar, this, null));
    }
}
