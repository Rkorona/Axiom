package com.server.auditor.ssh.client.fragments.quickimport;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.a0;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.quickimport.QuickImportDesktopPromoScreen;
import com.server.auditor.ssh.client.presenters.QuickImportDesktopPromoScreenPresenter;
import com.server.auditor.ssh.client.widget.ProgressButton;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.g5;
import qu.k;
import ut.m0;
import ut.n;
import ut.o;
import ut.s;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class QuickImportDesktopPromoScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.views.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g5 f26081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f26082b = o.a(new iu.a() { // from class: zh.a
        @Override // iu.a
        public final Object a() {
            return QuickImportDesktopPromoScreen.Df(this.f87939a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f26083c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26079e = {n0.g(new g0(QuickImportDesktopPromoScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/QuickImportDesktopPromoScreenPresenter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26078d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26080f = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26084a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportDesktopPromoScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26084a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = QuickImportDesktopPromoScreen.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26087b;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            c cVar = QuickImportDesktopPromoScreen.this.new c(eVar);
            cVar.f26087b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26086a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ClipboardManager clipboardManagerFf = QuickImportDesktopPromoScreen.this.Ff();
            if (clipboardManagerFf != null) {
                QuickImportDesktopPromoScreen quickImportDesktopPromoScreen = QuickImportDesktopPromoScreen.this;
                clipboardManagerFf.setPrimaryClip(ClipData.newPlainText("Termius Download Link", quickImportDesktopPromoScreen.getString(R.string.termius_download_link)));
                quickImportDesktopPromoScreen.Gf().u2();
            } else {
                QuickImportDesktopPromoScreen.this.Gf().v2();
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
        int f26089a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportDesktopPromoScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26089a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            QuickImportDesktopPromoScreen.this.Hf();
            QuickImportDesktopPromoScreen.this.Jf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressButton.b f26092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ QuickImportDesktopPromoScreen f26093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ProgressButton.b bVar, QuickImportDesktopPromoScreen quickImportDesktopPromoScreen, zt.e eVar) {
            super(2, eVar);
            this.f26092b = bVar;
            this.f26093c = quickImportDesktopPromoScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f26092b, this.f26093c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26091a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProgressButton.b bVar = this.f26092b;
            if (t.b(bVar, ProgressButton.b.c.f46551a)) {
                this.f26093c.Ef().f72543f.setIndeterminateButtonState();
                this.f26093c.Ef().f72543f.setEnabled(false);
            } else if (t.b(bVar, ProgressButton.b.C0663b.f46550a)) {
                this.f26093c.Ef().f72543f.setDefaultButtonState();
                this.f26093c.Ef().f72543f.setEnabled(true);
            } else {
                if (!t.b(bVar, ProgressButton.b.a.f46549a)) {
                    throw new s();
                }
                this.f26093c.Ef().f72543f.setCompleteButtonState(false);
                this.f26093c.Ef().f72543f.setEnabled(false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ QuickImportDesktopPromoScreenPresenter.b f26095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ QuickImportDesktopPromoScreen f26096c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(QuickImportDesktopPromoScreenPresenter.b bVar, QuickImportDesktopPromoScreen quickImportDesktopPromoScreen, zt.e eVar) {
            super(2, eVar);
            this.f26095b = bVar;
            this.f26096c = quickImportDesktopPromoScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f26095b, this.f26096c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26094a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            QuickImportDesktopPromoScreenPresenter.b bVar = this.f26095b;
            if (bVar instanceof QuickImportDesktopPromoScreenPresenter.b.a) {
                this.f26096c.Ef().f72547j.setText(((QuickImportDesktopPromoScreenPresenter.b.a) this.f26095b).a());
            } else {
                if (t.b(bVar, QuickImportDesktopPromoScreenPresenter.b.c.f35773a)) {
                    this.f26096c.Ef().f72547j.setText("");
                    this.f26096c.Ef().f72547j.setVisibility(8);
                    return m0.f82633a;
                }
                if (t.b(bVar, QuickImportDesktopPromoScreenPresenter.b.C0572b.f35772a)) {
                    this.f26096c.Ef().f72547j.setText(this.f26096c.getString(R.string.login_registration_network_error));
                } else {
                    if (!t.b(bVar, QuickImportDesktopPromoScreenPresenter.b.d.f35774a)) {
                        throw new s();
                    }
                    this.f26096c.Ef().f72547j.setText(this.f26096c.getString(R.string.unknown_request_error));
                }
            }
            this.f26096c.Ef().f72547j.setVisibility(0);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressButton.b f26098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ QuickImportDesktopPromoScreen f26099c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ProgressButton.b bVar, QuickImportDesktopPromoScreen quickImportDesktopPromoScreen, zt.e eVar) {
            super(2, eVar);
            this.f26098b = bVar;
            this.f26099c = quickImportDesktopPromoScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f26098b, this.f26099c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26097a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProgressButton.b bVar = this.f26098b;
            if (t.b(bVar, ProgressButton.b.c.f46551a)) {
                this.f26099c.Ef().f72548k.setIndeterminateButtonState();
                this.f26099c.Ef().f72548k.setEnabled(false);
            } else if (t.b(bVar, ProgressButton.b.C0663b.f46550a)) {
                this.f26099c.Ef().f72548k.setDefaultButtonState();
                this.f26099c.Ef().f72548k.setEnabled(true);
            } else {
                if (!t.b(bVar, ProgressButton.b.a.f46549a)) {
                    throw new s();
                }
                this.f26099c.Ef().f72548k.setCompleteButtonState(false);
                this.f26099c.Ef().f72548k.setEnabled(false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public QuickImportDesktopPromoScreen() {
        iu.a aVar = new iu.a() { // from class: zh.b
            @Override // iu.a
            public final Object a() {
                return QuickImportDesktopPromoScreen.Of();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26083c = new MoxyKtxDelegate(mvpDelegate, QuickImportDesktopPromoScreenPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClipboardManager Df(QuickImportDesktopPromoScreen quickImportDesktopPromoScreen) {
        Context context = quickImportDesktopPromoScreen.getContext();
        Object systemService = context != null ? context.getSystemService("clipboard") : null;
        if (systemService instanceof ClipboardManager) {
            return (ClipboardManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g5 Ef() {
        g5 g5Var = this.f26081a;
        if (g5Var != null) {
            return g5Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipboardManager Ff() {
        return (ClipboardManager) this.f26082b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QuickImportDesktopPromoScreenPresenter Gf() {
        return (QuickImportDesktopPromoScreenPresenter) this.f26083c.getValue(this, f26079e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf() {
        Ef().f72539b.f72288b.setImageResource(R.drawable.close_button);
        Ef().f72539b.f72289c.setText(getString(R.string.install_on_desktop_title));
        Ef().f72539b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: zh.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickImportDesktopPromoScreen.If(this.f87940a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void If(QuickImportDesktopPromoScreen quickImportDesktopPromoScreen, View view) {
        quickImportDesktopPromoScreen.Gf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        Ef().f72543f.setOnClickListener(new View.OnClickListener() { // from class: zh.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickImportDesktopPromoScreen.Kf(this.f87941a, view);
            }
        });
        Ef().f72548k.setOnClickListener(new View.OnClickListener() { // from class: zh.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickImportDesktopPromoScreen.Lf(this.f87942a, view);
            }
        });
        Ef().f72548k.setOnCompleteListener(new iu.a() { // from class: zh.f
            @Override // iu.a
            public final Object a() {
                return QuickImportDesktopPromoScreen.Mf(this.f87943a);
            }
        });
        Ef().f72543f.setOnCompleteListener(new iu.a() { // from class: zh.g
            @Override // iu.a
            public final Object a() {
                return QuickImportDesktopPromoScreen.Nf(this.f87944a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(QuickImportDesktopPromoScreen quickImportDesktopPromoScreen, View view) {
        quickImportDesktopPromoScreen.Gf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(QuickImportDesktopPromoScreen quickImportDesktopPromoScreen, View view) {
        quickImportDesktopPromoScreen.Gf().w2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Mf(QuickImportDesktopPromoScreen quickImportDesktopPromoScreen) {
        quickImportDesktopPromoScreen.Ef().f72548k.setEnabled(true);
        quickImportDesktopPromoScreen.Ef().f72548k.setClickable(true);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Nf(QuickImportDesktopPromoScreen quickImportDesktopPromoScreen) {
        quickImportDesktopPromoScreen.Ef().f72543f.setEnabled(true);
        quickImportDesktopPromoScreen.Ef().f72543f.setClickable(true);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickImportDesktopPromoScreenPresenter Of() {
        return new QuickImportDesktopPromoScreenPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void K0() {
        a0.a(this).d(new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void T0(ProgressButton.b bVar) {
        t.f(bVar, "state");
        a0.a(this).d(new e(bVar, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void a() {
        a0.a(this).d(new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void f() {
        a0.a(this).d(new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f26081a = g5.c(layoutInflater, viewGroup, false);
        View viewB = Ef().b();
        t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26081a = null;
    }

    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void sd(QuickImportDesktopPromoScreenPresenter.b bVar) {
        t.f(bVar, "errorType");
        a0.a(this).d(new f(bVar, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void x4(ProgressButton.b bVar) {
        t.f(bVar, "state");
        a0.a(this).d(new g(bVar, this, null));
    }
}
