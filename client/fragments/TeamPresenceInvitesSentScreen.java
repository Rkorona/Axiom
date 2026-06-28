package com.server.auditor.ssh.client.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.k1;
import ch.m3;
import com.server.auditor.ssh.client.contracts.m2;
import com.server.auditor.ssh.client.fragments.TeamPresenceInvitesSentScreen;
import com.server.auditor.ssh.client.presenters.TeamPresenceInvitesSentPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.v7;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceInvitesSentScreen extends MvpAppCompatFragment implements m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24251d = {n0.g(new g0(TeamPresenceInvitesSentScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/TeamPresenceInvitesSentPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24252e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v7 f24253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f24254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f24255c;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24256a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInvitesSentScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24256a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamPresenceInvitesSentScreen.this.yf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24258a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInvitesSentScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24258a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarA = m3.a();
            ju.t.e(k1VarA, "actionTeamPresenceInvite…ToTeamPresenceScreen(...)");
            androidx.navigation.fragment.c.a(TeamPresenceInvitesSentScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamPresenceInvitesSentScreen() {
        iu.a aVar = new iu.a() { // from class: ch.k3
            @Override // iu.a
            public final Object a() {
                return TeamPresenceInvitesSentScreen.Bf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24255c = new MoxyKtxDelegate(mvpDelegate, TeamPresenceInvitesSentPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Af(TeamPresenceInvitesSentScreen teamPresenceInvitesSentScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        teamPresenceInvitesSentScreen.xf().q2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamPresenceInvitesSentPresenter Bf() {
        return new TeamPresenceInvitesSentPresenter();
    }

    private final void vf() {
        z0.F0(wf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final v7 wf() {
        v7 v7Var = this.f24253a;
        if (v7Var != null) {
            return v7Var;
        }
        throw new IllegalStateException();
    }

    private final TeamPresenceInvitesSentPresenter xf() {
        return (TeamPresenceInvitesSentPresenter) this.f24255c.getValue(this, f24251d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yf() {
        wf().f74179g.setOnClickListener(new View.OnClickListener() { // from class: ch.l3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamPresenceInvitesSentScreen.zf(this.f15563a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zf(TeamPresenceInvitesSentScreen teamPresenceInvitesSentScreen, View view) {
        teamPresenceInvitesSentScreen.xf().r2();
    }

    @Override // com.server.auditor.ssh.client.contracts.m2
    public void D0() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m2
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: ch.j3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamPresenceInvitesSentScreen.Af(this.f15548a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24254b = e0VarB;
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
        this.f24253a = v7.c(layoutInflater, viewGroup, false);
        vf();
        ConstraintLayout constraintLayoutB = wf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24253a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24254b;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}
