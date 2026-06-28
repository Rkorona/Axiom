package com.server.auditor.ssh.client.fragments.team.dialogs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.teamtrial.h;
import com.server.auditor.ssh.client.fragments.team.dialogs.TeamTrialExtensionRejectedScreen;
import com.server.auditor.ssh.client.presenters.teamtrial.TeamTrialExtensionRejectedScreenPresenter;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.a8;
import qu.k;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamTrialExtensionRejectedScreen extends MvpAppCompatFragment implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ k[] f26694d = {n0.g(new g0(TeamTrialExtensionRejectedScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/teamtrial/TeamTrialExtensionRejectedScreenPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26695e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a8 f26696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f26697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f26698c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26699a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamTrialExtensionRejectedScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26699a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamTrialExtensionRejectedScreen.this.Ef();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26701a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamTrialExtensionRejectedScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26701a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.fragment.c.a(TeamTrialExtensionRejectedScreen.this).U(R.id.endOfTrialScreen, false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26703a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamTrialExtensionRejectedScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26703a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String string = TeamTrialExtensionRejectedScreen.this.getString(R.string.support_new_request_url);
            t.e(string, "getString(...)");
            TeamTrialExtensionRejectedScreen.this.Jf(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamTrialExtensionRejectedScreen() {
        iu.a aVar = new iu.a() { // from class: gi.f
            @Override // iu.a
            public final Object a() {
                return TeamTrialExtensionRejectedScreen.If();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26697b = new MoxyKtxDelegate(mvpDelegate, TeamTrialExtensionRejectedScreenPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Af(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Bf(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final a8 Cf() {
        a8 a8Var = this.f26696a;
        if (a8Var != null) {
            return a8Var;
        }
        throw new IllegalStateException();
    }

    private final TeamTrialExtensionRejectedScreenPresenter Df() {
        return (TeamTrialExtensionRejectedScreenPresenter) this.f26697b.getValue(this, f26694d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ef() {
        Cf().f71925d.setOnClickListener(new View.OnClickListener() { // from class: gi.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamTrialExtensionRejectedScreen.Ff(this.f51362a, view);
            }
        });
        Cf().f71926e.setOnClickListener(new View.OnClickListener() { // from class: gi.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamTrialExtensionRejectedScreen.Gf(this.f51363a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ff(TeamTrialExtensionRejectedScreen teamTrialExtensionRejectedScreen, View view) {
        teamTrialExtensionRejectedScreen.Df().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gf(TeamTrialExtensionRejectedScreen teamTrialExtensionRejectedScreen, View view) {
        teamTrialExtensionRejectedScreen.Df().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Hf(TeamTrialExtensionRejectedScreen teamTrialExtensionRejectedScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        teamTrialExtensionRejectedScreen.Df().q2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamTrialExtensionRejectedScreenPresenter If() {
        return new TeamTrialExtensionRejectedScreenPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new be.b(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    private final void zf() {
        z0.F0(Cf().b(), new o4.i0() { // from class: gi.a
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TeamTrialExtensionRejectedScreen.Af(view, a2Var);
            }
        });
        z0.F0(Cf().f71924c, new o4.i0() { // from class: gi.b
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TeamTrialExtensionRejectedScreen.Bf(view, a2Var);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.h
    public void C2() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.h
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.h
    public void o() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: gi.e
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamTrialExtensionRejectedScreen.Hf(this.f51364a, (e0) obj);
            }
        }, 2, null);
        this.f26698c = e0VarB;
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
        this.f26696a = a8.c(getLayoutInflater(), viewGroup, false);
        zf();
        ConstraintLayout constraintLayoutB = Cf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26696a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26698c;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}
