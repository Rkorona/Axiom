package com.server.auditor.ssh.client.fragments.quickimport;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.l0;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.k1;
import androidx.navigation.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.adapters.c0;
import com.server.auditor.ssh.client.fragments.hostngroups.o1;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginActivity;
import com.server.auditor.ssh.client.fragments.loginregistration.SignUpChooserScreenArgs;
import com.server.auditor.ssh.client.fragments.quickimport.QuickImportOptionScreen;
import com.server.auditor.ssh.client.fragments.quickimport.b;
import com.server.auditor.ssh.client.models.ImportOptionType;
import com.server.auditor.ssh.client.presenters.QuickImportOptionScreenPresenter;
import java.util.List;
import ju.g0;
import ju.n0;
import ju.t;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.k5;
import tp.w0;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class QuickImportOptionScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.views.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k5 f26122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f26123b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f26124c = new x(n0.b(QuickImportOptionScreenArgs.class), new p(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f26125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g.b f26126e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f26120u = {n0.g(new g0(QuickImportOptionScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/QuickImportOptionScreenPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f26119f = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f26121v = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26127a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26127a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = QuickImportOptionScreen.this.getString(R.string.quick_import_aws_option_label);
            t.e(string, "getString(...)");
            QuickImportOptionScreen.this.Vf(string);
            QuickImportOptionScreen.this.Uf(androidx.core.content.a.getDrawable(QuickImportOptionScreen.this.requireContext(), R.drawable.ic_aws));
            QuickImportOptionScreen quickImportOptionScreen = QuickImportOptionScreen.this;
            String string2 = quickImportOptionScreen.getString(R.string.sync_with_clouds_description, string);
            t.e(string2, "getString(...)");
            quickImportOptionScreen.Wf(string2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26129a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26129a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            QuickImportOptionScreen quickImportOptionScreen = QuickImportOptionScreen.this;
            String string = quickImportOptionScreen.getString(R.string.quick_import_csv_option_label);
            t.e(string, "getString(...)");
            quickImportOptionScreen.Vf(string);
            QuickImportOptionScreen.this.Uf(androidx.core.content.a.getDrawable(QuickImportOptionScreen.this.requireContext(), R.drawable.ic_csv_file));
            QuickImportOptionScreen quickImportOptionScreen2 = QuickImportOptionScreen.this;
            String string2 = quickImportOptionScreen2.getString(R.string.import_from_other_tools_description);
            t.e(string2, "getString(...)");
            quickImportOptionScreen2.Wf(string2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26131a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26131a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = QuickImportOptionScreen.this.getString(R.string.quick_import_digital_ocean_option_label);
            t.e(string, "getString(...)");
            QuickImportOptionScreen.this.Vf(string);
            QuickImportOptionScreen.this.Uf(androidx.core.content.a.getDrawable(QuickImportOptionScreen.this.requireContext(), R.drawable.ic_digital_ocean));
            QuickImportOptionScreen quickImportOptionScreen = QuickImportOptionScreen.this;
            String string2 = quickImportOptionScreen.getString(R.string.sync_with_clouds_description, string);
            t.e(string2, "getString(...)");
            quickImportOptionScreen.Wf(string2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26133a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26133a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            QuickImportOptionScreen quickImportOptionScreen = QuickImportOptionScreen.this;
            String string = quickImportOptionScreen.getString(R.string.quick_import_mobaxterm_option_label);
            t.e(string, "getString(...)");
            quickImportOptionScreen.Vf(string);
            QuickImportOptionScreen.this.Uf(androidx.core.content.a.getDrawable(QuickImportOptionScreen.this.requireContext(), R.drawable.ic_mobaxterm));
            QuickImportOptionScreen quickImportOptionScreen2 = QuickImportOptionScreen.this;
            String string2 = quickImportOptionScreen2.getString(R.string.import_from_other_tools_description);
            t.e(string2, "getString(...)");
            quickImportOptionScreen2.Wf(string2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26135a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26135a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            QuickImportOptionScreen quickImportOptionScreen = QuickImportOptionScreen.this;
            String string = quickImportOptionScreen.getString(R.string.quick_import_putty_option_label);
            t.e(string, "getString(...)");
            quickImportOptionScreen.Vf(string);
            QuickImportOptionScreen.this.Uf(androidx.core.content.a.getDrawable(QuickImportOptionScreen.this.requireContext(), R.drawable.ic_putty));
            QuickImportOptionScreen quickImportOptionScreen2 = QuickImportOptionScreen.this;
            String string2 = quickImportOptionScreen2.getString(R.string.import_from_other_tools_description);
            t.e(string2, "getString(...)");
            quickImportOptionScreen2.Wf(string2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26137a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26137a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            QuickImportOptionScreen quickImportOptionScreen = QuickImportOptionScreen.this;
            String string = quickImportOptionScreen.getString(R.string.quick_import_securecrt_option_label);
            t.e(string, "getString(...)");
            quickImportOptionScreen.Vf(string);
            QuickImportOptionScreen.this.Uf(androidx.core.content.a.getDrawable(QuickImportOptionScreen.this.requireContext(), R.drawable.ic_securecrt));
            QuickImportOptionScreen quickImportOptionScreen2 = QuickImportOptionScreen.this;
            String string2 = quickImportOptionScreen2.getString(R.string.import_from_other_tools_description);
            t.e(string2, "getString(...)");
            quickImportOptionScreen2.Wf(string2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26139a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26139a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            QuickImportOptionScreen quickImportOptionScreen = QuickImportOptionScreen.this;
            String string = quickImportOptionScreen.getString(R.string.quick_import_ssh_config_option_label);
            t.e(string, "getString(...)");
            quickImportOptionScreen.Vf(string);
            QuickImportOptionScreen.this.Uf(androidx.core.content.a.getDrawable(QuickImportOptionScreen.this.requireContext(), R.drawable.ic_file));
            QuickImportOptionScreen quickImportOptionScreen2 = QuickImportOptionScreen.this;
            String string2 = quickImportOptionScreen2.getString(R.string.import_from_other_tools_description);
            t.e(string2, "getString(...)");
            quickImportOptionScreen2.Wf(string2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26141a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26141a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            QuickImportOptionScreen.this.Kf();
            QuickImportOptionScreen.this.Of();
            QuickImportOptionScreen.this.Rf();
            QuickImportOptionScreen.this.Qf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26143a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26143a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(QuickImportOptionScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26145a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26145a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.a aVarA = com.server.auditor.ssh.client.fragments.quickimport.b.a("QUICK_IMPORT");
            t.e(aVarA, "actionQuickImportOptionScreenToEndOfTrialFlow(...)");
            androidx.navigation.fragment.c.a(QuickImportOptionScreen.this).O(aVarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26147a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26147a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Intent intent = new Intent(QuickImportOptionScreen.this.requireActivity(), (Class<?>) LoginActivity.class);
            intent.setAction("registrationFlowAction");
            Bundle bundle = new SignUpChooserScreenArgs.a(120, true, true).a().toBundle();
            t.e(bundle, "toBundle(...)");
            intent.putExtras(bundle);
            QuickImportOptionScreen.this.f26126e.a(intent);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26149a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26149a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarB = com.server.auditor.ssh.client.fragments.quickimport.b.b();
            t.e(k1VarB, "actionQuickImportOptionS…rtDesktopPromoScreen(...)");
            androidx.navigation.fragment.c.a(QuickImportOptionScreen.this).O(k1VarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResult f26152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ QuickImportOptionScreen f26153c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ActivityResult activityResult, QuickImportOptionScreen quickImportOptionScreen, zt.e eVar) {
            super(2, eVar);
            this.f26152b = activityResult;
            this.f26153c = quickImportOptionScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new n(this.f26152b, this.f26153c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26151a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            int resultCode = this.f26152b.getResultCode();
            if (resultCode == 1 || resultCode == 2 || resultCode == 3) {
                this.f26153c.Jf().u2();
            } else {
                this.f26153c.Jf().t2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f26154a;

        o(iu.l lVar) {
            t.f(lVar, "function");
            this.f26154a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26154a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f26154a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof ju.n)) {
                return t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class p implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26155a;

        public p(Fragment fragment) {
            this.f26155a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f26155a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f26155a + " has null arguments");
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26156a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26158c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(List list, zt.e eVar) {
            super(2, eVar);
            this.f26158c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return QuickImportOptionScreen.this.new q(this.f26158c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26156a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            QuickImportOptionScreen.this.f26123b.N(this.f26158c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public QuickImportOptionScreen() {
        iu.a aVar = new iu.a() { // from class: zh.n
            @Override // iu.a
            public final Object a() {
                return QuickImportOptionScreen.Tf(this.f87949a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26125d = new MoxyKtxDelegate(mvpDelegate, QuickImportOptionScreenPresenter.class.getName() + ".presenter", aVar);
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new g.a() { // from class: zh.o
            @Override // g.a
            public final void a(Object obj) {
                QuickImportOptionScreen.Gf(this.f87950a, (ActivityResult) obj);
            }
        });
        t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f26126e = bVarRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gf(QuickImportOptionScreen quickImportOptionScreen, ActivityResult activityResult) {
        t.f(activityResult, "it");
        quickImportOptionScreen.Sf(activityResult);
    }

    private final QuickImportOptionScreenArgs Hf() {
        return (QuickImportOptionScreenArgs) this.f26124c.getValue();
    }

    private final k5 If() {
        k5 k5Var = this.f26122a;
        if (k5Var != null) {
            return k5Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QuickImportOptionScreenPresenter Jf() {
        return (QuickImportOptionScreenPresenter) this.f26125d.getValue(this, f26120u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        If().f72953b.f72483b.setOnClickListener(new View.OnClickListener() { // from class: zh.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickImportOptionScreen.Lf(this.f87954a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(QuickImportOptionScreen quickImportOptionScreen, View view) {
        quickImportOptionScreen.Jf().v2();
    }

    private final void Mf() {
        final u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("CHOOSE_PLAN_RESULT_CODE_KEY").j(getViewLifecycleOwner(), new o(new iu.l() { // from class: zh.q
            @Override // iu.l
            public final Object invoke(Object obj) {
                return QuickImportOptionScreen.Nf(this.f87952a, u0VarJ, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Nf(QuickImportOptionScreen quickImportOptionScreen, u0 u0Var, Boolean bool) {
        QuickImportOptionScreenPresenter quickImportOptionScreenPresenterJf = quickImportOptionScreen.Jf();
        t.c(bool);
        quickImportOptionScreenPresenterJf.w2(bool.booleanValue());
        u0Var.f("CHOOSE_PLAN_RESULT_CODE_KEY");
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Of() {
        If().f72962k.setOnClickListener(new View.OnClickListener() { // from class: zh.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickImportOptionScreen.Pf(this.f87951a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Pf(QuickImportOptionScreen quickImportOptionScreen, View view) {
        quickImportOptionScreen.Jf().x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qf() {
        Mf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf() {
        If().f72959h.i(new o1(tp.p.a(0), tp.p.a(10)));
        If().f72959h.setLayoutManager(new LinearLayoutManager(requireContext()));
        If().f72959h.setAdapter(this.f26123b);
    }

    private final void Sf(ActivityResult activityResult) {
        bh.a.b(this, new n(activityResult, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickImportOptionScreenPresenter Tf(QuickImportOptionScreen quickImportOptionScreen) {
        ImportOptionType importOptionType = quickImportOptionScreen.Hf().getImportOptionType();
        t.e(importOptionType, "getImportOptionType(...)");
        return new QuickImportOptionScreenPresenter(importOptionType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uf(Drawable drawable) {
        AppCompatImageView appCompatImageView = If().f72953b.f72484c;
        t.e(appCompatImageView, "actionBarIcon");
        appCompatImageView.setVisibility(drawable != null ? 0 : 8);
        if (drawable != null) {
            If().f72953b.f72484c.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Vf(String str) {
        If().f72953b.f72485d.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Wf(String str) {
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String string = getString(R.string.import_option_description_helper);
        t.e(string, "getString(...)");
        If().f72956e.setText(aVar.a(spannableStringBuilder, string, new StyleSpan(1)));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void B9() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void C4(List list) {
        t.f(list, "quickImportInstructionSteps");
        bh.a.b(this, new q(list, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void Q7() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void Qa() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void a() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void a3() {
        a0.a(this).b(new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void b() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void gd() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void nc() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void o() {
        bh.a.b(this, new k(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f26122a = k5.c(layoutInflater, viewGroup, false);
        View viewB = If().b();
        t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26122a = null;
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void rb() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void v3() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.f
    public void v6() {
        bh.a.b(this, new b(null));
    }
}
