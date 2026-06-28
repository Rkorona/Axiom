package com.server.auditor.ssh.client.fragments.quickimport;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.adapters.b0;
import com.server.auditor.ssh.client.fragments.quickimport.QuickImportMainScreen;
import com.server.auditor.ssh.client.fragments.quickimport.a;
import com.server.auditor.ssh.client.models.ImportOptionType;
import com.server.auditor.ssh.client.presenters.QuickImportMainScreenPresenter;
import com.server.auditor.ssh.client.widget.d1;
import iu.l;
import iu.p;
import java.util.List;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.i5;
import qu.k;
import tp.c1;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes3.dex */
public final class QuickImportMainScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.views.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f26100f = {n0.g(new g0(QuickImportMainScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/QuickImportMainScreenPresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26101u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i5 f26102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f26103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f26104c = o.a(new iu.a() { // from class: zh.i
        @Override // iu.a
        public final Object a() {
            return QuickImportMainScreen.Af(this.f87946a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f26105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f26106e;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26107a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return QuickImportMainScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26107a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = QuickImportMainScreen.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26109a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f26112d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, List list2, e eVar) {
            super(2, eVar);
            this.f26111c = list;
            this.f26112d = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return QuickImportMainScreen.this.new b(this.f26111c, this.f26112d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26109a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            QuickImportMainScreen.this.Ef();
            QuickImportMainScreen.this.Gf(this.f26111c);
            QuickImportMainScreen.this.Hf(this.f26112d);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImportOptionType f26114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ QuickImportMainScreen f26115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ImportOptionType importOptionType, QuickImportMainScreen quickImportMainScreen, e eVar) {
            super(2, eVar);
            this.f26114b = importOptionType;
            this.f26115c = quickImportMainScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new c(this.f26114b, this.f26115c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26113a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            a.C0411a c0411aA = com.server.auditor.ssh.client.fragments.quickimport.a.a(this.f26114b);
            t.e(c0411aA, "actionQuickImportMainScr…ckImportOptionScreen(...)");
            androidx.navigation.fragment.c.a(this.f26115c).O(c0411aA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26116a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImportOptionType f26118c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ImportOptionType importOptionType, e eVar) {
            super(2, eVar);
            this.f26118c = importOptionType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return QuickImportMainScreen.this.new d(this.f26118c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26116a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            QuickImportMainScreen.this.Df().s2(this.f26118c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public QuickImportMainScreen() {
        iu.a aVar = new iu.a() { // from class: zh.j
            @Override // iu.a
            public final Object a() {
                return QuickImportMainScreen.Kf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26105d = new MoxyKtxDelegate(mvpDelegate, QuickImportMainScreenPresenter.class.getName() + ".presenter", aVar);
        this.f26106e = new l() { // from class: zh.k
            @Override // iu.l
            public final Object invoke(Object obj) {
                return QuickImportMainScreen.Jf(this.f87947a, (ImportOptionType) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d1 Af(QuickImportMainScreen quickImportMainScreen) {
        Context contextRequireContext = quickImportMainScreen.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        d1 d1Var = new d1(contextRequireContext);
        d1Var.n(c1.a(quickImportMainScreen.getContext(), R.attr.colorControlHighlight));
        return d1Var;
    }

    private final i5 Bf() {
        i5 i5Var = this.f26102a;
        if (i5Var != null) {
            return i5Var;
        }
        throw new IllegalStateException();
    }

    private final d1 Cf() {
        return (d1) this.f26104c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QuickImportMainScreenPresenter Df() {
        return (QuickImportMainScreenPresenter) this.f26105d.getValue(this, f26100f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ef() {
        Bf().f72736b.f72289c.setText(getString(R.string.import_your_servers_title));
        Bf().f72736b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: zh.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickImportMainScreen.Ff(this.f87948a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ff(QuickImportMainScreen quickImportMainScreen, View view) {
        quickImportMainScreen.Df().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Gf(List list) {
        Bf().f72742h.setAdapter(new b0(list, this.f26106e));
        Bf().f72742h.setLayoutManager(new LinearLayoutManager(requireContext()));
        Bf().f72742h.i(Cf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf(List list) {
        Bf().f72744j.setAdapter(new b0(list, this.f26106e));
        Bf().f72744j.setLayoutManager(new LinearLayoutManager(requireContext()));
        Bf().f72744j.i(Cf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 If(QuickImportMainScreen quickImportMainScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        quickImportMainScreen.Df().r2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Jf(QuickImportMainScreen quickImportMainScreen, ImportOptionType importOptionType) {
        t.f(importOptionType, "it");
        a0.a(quickImportMainScreen).d(quickImportMainScreen.new d(importOptionType, null));
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickImportMainScreenPresenter Kf() {
        return new QuickImportMainScreenPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.views.d
    public void Sc(List list, List list2) {
        t.f(list, "importFromCloudOptions");
        t.f(list2, "importFromToolsOptions");
        a0.a(this).d(new b(list, list2, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.d
    public void Uc(ImportOptionType importOptionType) {
        t.f(importOptionType, "importOptionType");
        a0.a(this).d(new c(importOptionType, this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: zh.h
            @Override // iu.l
            public final Object invoke(Object obj) {
                return QuickImportMainScreen.If(this.f87945a, (e0) obj);
            }
        }, 2, null);
        this.f26103b = e0VarB;
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
        this.f26102a = i5.c(layoutInflater, viewGroup, false);
        View viewB = Bf().b();
        t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26102a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26103b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.views.d
    public void p() {
        a0.a(this).d(new a(null));
    }
}
