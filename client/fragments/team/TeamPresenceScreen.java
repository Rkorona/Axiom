package com.server.auditor.ssh.client.fragments.team;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.team.TeamPresenceScreen;
import com.server.auditor.ssh.client.fragments.team.c;
import com.server.auditor.ssh.client.presenters.team.TeamPresencePresenter;
import com.server.auditor.ssh.client.widget.c1;
import iu.l;
import iu.p;
import java.util.List;
import ju.g0;
import ju.n0;
import ju.q;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.w7;
import qu.k;
import su.s;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.team.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f26626f = {n0.g(new g0(TeamPresenceScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/team/TeamPresencePresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26627u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w7 f26628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f26629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f26630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f26631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f26632e;

    /* synthetic */ class a extends q implements iu.a {
        a(Object obj) {
            super(0, obj, TeamPresencePresenter.class, "onInviteTeamMemberButtonClicked", "onInviteTeamMemberButtonClicked()V", 0);
        }

        @Override // iu.a
        public /* bridge */ /* synthetic */ Object a() {
            l();
            return m0.f82633a;
        }

        public final void l() {
            ((TeamPresencePresenter) this.f62930b).A2();
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26633a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26633a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = TeamPresenceScreen.this.requireActivity();
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
        int f26635a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26635a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamPresenceScreen.this.Nf();
            TeamPresenceScreen.this.Mf();
            TeamPresenceScreen.this.Kf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26637a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26637a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!androidx.navigation.fragment.c.a(TeamPresenceScreen.this).T()) {
                TeamPresenceScreen.this.f();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamPresenceScreen f26641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, TeamPresenceScreen teamPresenceScreen, zt.e eVar) {
            super(2, eVar);
            this.f26640b = z10;
            this.f26641c = teamPresenceScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f26640b, this.f26641c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26639a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            c.a aVarA = com.server.auditor.ssh.client.fragments.team.c.a(this.f26640b);
            t.e(aVarA, "actionTeamPresenceScreen…viteColleaguesScreen(...)");
            androidx.navigation.fragment.c.a(this.f26641c).O(aVarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamPresenceScreen f26644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, TeamPresenceScreen teamPresenceScreen, zt.e eVar) {
            super(2, eVar);
            this.f26643b = str;
            this.f26644c = teamPresenceScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f26643b, this.f26644c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26642a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String str = this.f26643b;
            String string = (str == null || s.m0(str)) ? this.f26644c.getString(R.string.team_page_site_url, "https://account.termius.com/") : this.f26644c.getString(R.string.team_page_site_with_email_url, "https://account.termius.com/", Uri.encode(this.f26643b));
            t.c(string);
            this.f26644c.Rf(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f26645a;

        g(l lVar) {
            t.f(lVar, "function");
            this.f26645a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26645a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f26645a;
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

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26646a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26648c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26648c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceScreen.this.new h(this.f26648c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26646a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            AppCompatImageView appCompatImageView = TeamPresenceScreen.this.Hf().f74285h;
            t.e(appCompatImageView, "image");
            appCompatImageView.setVisibility(this.f26648c ? 0 : 8);
            AppCompatTextView appCompatTextView = TeamPresenceScreen.this.Hf().f74283f;
            t.e(appCompatTextView, "header");
            appCompatTextView.setVisibility(this.f26648c ? 0 : 8);
            TextView textView = TeamPresenceScreen.this.Hf().f74284g;
            t.e(textView, "headerDescription");
            textView.setVisibility(this.f26648c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26649a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, zt.e eVar) {
            super(2, eVar);
            this.f26651c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceScreen.this.new i(this.f26651c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26649a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamPresenceScreen.this.Gf().N(this.f26651c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26652a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26654c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceScreen.this.new j(this.f26654c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26652a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamPresenceScreen.this.Hf().f74279b.f72393c.setVisibility(this.f26654c ? 0 : 4);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamPresenceScreen() {
        iu.a aVar = new iu.a() { // from class: fi.m0
            @Override // iu.a
            public final Object a() {
                return TeamPresenceScreen.Qf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26630c = new MoxyKtxDelegate(mvpDelegate, TeamPresencePresenter.class.getName() + ".presenter", aVar);
        this.f26631d = o.a(new iu.a() { // from class: fi.n0
            @Override // iu.a
            public final Object a() {
                return TeamPresenceScreen.Df(this.f50040a);
            }
        });
        this.f26632e = o.a(new iu.a() { // from class: fi.o0
            @Override // iu.a
            public final Object a() {
                return TeamPresenceScreen.Ff(this.f50041a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fg.a Df(TeamPresenceScreen teamPresenceScreen) {
        return new fg.a(new a(teamPresenceScreen.Jf()));
    }

    private final void Ef() {
        z0.F0(Hf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 Ff(TeamPresenceScreen teamPresenceScreen) {
        Context contextRequireContext = teamPresenceScreen.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        c1 c1Var = new c1(contextRequireContext, Integer.valueOf(teamPresenceScreen.getResources().getDimensionPixelSize(R.dimen.default_divider_size)), 0, 4, null);
        c1Var.n(tp.c1.a(teamPresenceScreen.requireContext(), R.attr.listViewDividerColor));
        return c1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fg.a Gf() {
        return (fg.a) this.f26631d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w7 Hf() {
        w7 w7Var = this.f26628a;
        if (w7Var != null) {
            return w7Var;
        }
        throw new IllegalStateException();
    }

    private final c1 If() {
        return (c1) this.f26632e.getValue();
    }

    private final TeamPresencePresenter Jf() {
        return (TeamPresencePresenter) this.f26630c.getValue(this, f26626f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        Jf().y2().j(getViewLifecycleOwner(), new g(new l() { // from class: fi.k0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamPresenceScreen.Lf(this.f50036a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Lf(TeamPresenceScreen teamPresenceScreen, List list) {
        TeamPresencePresenter teamPresencePresenterJf = teamPresenceScreen.Jf();
        t.c(list);
        teamPresencePresenterJf.B2(list);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        Hf().f74288k.setAdapter(Gf());
        Hf().f74288k.setLayoutManager(new LinearLayoutManager(requireContext()));
        Hf().f74288k.setItemAnimator(new androidx.recyclerview.widget.i());
        Hf().f74288k.i(If());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nf() {
        Hf().f74279b.f72393c.setText(getString(R.string.your_team));
        Hf().f74279b.f72392b.setOnClickListener(new View.OnClickListener() { // from class: fi.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamPresenceScreen.Of(this.f50034a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Of(TeamPresenceScreen teamPresenceScreen, View view) {
        teamPresenceScreen.Jf().z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Pf(TeamPresenceScreen teamPresenceScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        teamPresenceScreen.Jf().z2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamPresencePresenter Qf() {
        return new TeamPresencePresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new be.b(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void N6(boolean z10) {
        bh.a.b(this, new e(z10, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void Y3(String str) {
        bh.a.b(this, new f(str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void Y9(boolean z10) {
        bh.a.b(this, new h(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void b() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void c0(boolean z10) {
        bh.a.b(this, new j(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void f() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: fi.l0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamPresenceScreen.Pf(this.f50038a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26629b = e0VarB;
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
        this.f26628a = w7.c(layoutInflater, viewGroup, false);
        Ef();
        ConstraintLayout constraintLayoutB = Hf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26628a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26629b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void pa(List list) {
        t.f(list, "teamPresenceEntities");
        bh.a.b(this, new i(list, null));
    }
}
