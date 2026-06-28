package com.server.auditor.ssh.client.fragments.team;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l0;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.k1;
import androidx.navigation.x;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.team.TeamPresenceInviteColleaguesScreen;
import com.server.auditor.ssh.client.fragments.team.b;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter;
import com.server.auditor.ssh.client.widget.ProgressButton;
import iu.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.g0;
import ju.n0;
import ju.t;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.n6;
import qg.t7;
import ut.m0;
import ut.s;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceInviteColleaguesScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.team.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f26584f = {n0.g(new g0(TeamPresenceInviteColleaguesScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/team/TeamPresenceInviteColleaguesPresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26585u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t7 f26586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f26587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f26588c = new x(n0.b(TeamPresenceInviteColleaguesScreenArgs.class), new h(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f26589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f26590e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26591a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamMemberInvitation f26593c;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.team.TeamPresenceInviteColleaguesScreen$a$a, reason: collision with other inner class name */
        public static final class C0416a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeamPresenceInviteColleaguesScreen f26594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TeamMemberInvitation f26595b;

            public C0416a(TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, TeamMemberInvitation teamMemberInvitation) {
                this.f26594a = teamPresenceInviteColleaguesScreen;
                this.f26595b = teamMemberInvitation;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                this.f26594a.If().H2(this.f26595b, editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TeamMemberInvitation teamMemberInvitation, zt.e eVar) {
            super(2, eVar);
            this.f26593c = teamMemberInvitation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new a(this.f26593c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26591a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            n6 n6VarC = n6.c(TeamPresenceInviteColleaguesScreen.this.getLayoutInflater(), null, false);
            t.e(n6VarC, "inflate(...)");
            n6VarC.b().setId(View.generateViewId());
            n6VarC.b().setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
            TeamPresenceInviteColleaguesScreen.this.Hf().f73989n.addView(n6VarC.b());
            TextInputEditText textInputEditText = n6VarC.f73329b;
            TeamMemberInvitation teamMemberInvitation = this.f26593c;
            TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen = TeamPresenceInviteColleaguesScreen.this;
            textInputEditText.setText(teamMemberInvitation.getEmail());
            t.c(textInputEditText);
            textInputEditText.addTextChangedListener(new C0416a(teamPresenceInviteColleaguesScreen, teamMemberInvitation));
            TeamPresenceInviteColleaguesScreen.this.f26590e.add(n6VarC);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26596a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26596a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamPresenceInviteColleaguesScreen.this.Rf();
            TeamPresenceInviteColleaguesScreen.this.Lf();
            TeamPresenceInviteColleaguesScreen.this.Qf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26598a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26598a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(TeamPresenceInviteColleaguesScreen.this).T()) {
                TeamPresenceInviteColleaguesScreen.this.f();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26600a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26600a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarA = com.server.auditor.ssh.client.fragments.team.b.a();
            t.e(k1VarA, "actionTeamPresenceInvite…tInternalErrorScreen(...)");
            androidx.navigation.fragment.c.a(TeamPresenceInviteColleaguesScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26602a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26602a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarC = com.server.auditor.ssh.client.fragments.team.b.c();
            t.e(k1VarC, "actionTeamPresenceInvite…nceInvitesSentScreen(...)");
            androidx.navigation.fragment.c.a(TeamPresenceInviteColleaguesScreen.this).O(k1VarC);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26604a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26604a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarB = com.server.auditor.ssh.client.fragments.team.b.b();
            t.e(k1VarB, "actionTeamPresenceInvite…ltNetworkErrorScreen(...)");
            androidx.navigation.fragment.c.a(TeamPresenceInviteColleaguesScreen.this).O(k1VarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamPresenceInviteColleaguesScreen f26608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, zt.e eVar) {
            super(2, eVar);
            this.f26607b = i10;
            this.f26608c = teamPresenceInviteColleaguesScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f26607b, this.f26608c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26606a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.a aVarD = com.server.auditor.ssh.client.fragments.team.b.d(this.f26607b);
            t.e(aVarD, "actionTeamPresenceInvite…VaultPromotionScreen(...)");
            androidx.navigation.fragment.c.a(this.f26608c).O(aVarD);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class h implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26609a;

        public h(Fragment fragment) {
            this.f26609a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f26609a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f26609a + " has null arguments");
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26610a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26612c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26612c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new i(this.f26612c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26610a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamPresenceInviteColleaguesScreen.this.Hf().f73978c.setEnabled(this.f26612c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26613a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26615c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26615c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new j(this.f26615c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26613a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamPresenceInviteColleaguesScreen.this.Hf().f73977b.f72392b.setEnabled(this.f26615c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26616a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26618c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new k(this.f26618c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26616a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            List list = TeamPresenceInviteColleaguesScreen.this.f26590e;
            boolean z10 = this.f26618c;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((n6) it.next()).f73330c.setEnabled(z10);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26619a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26621c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26621c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesScreen.this.new l(this.f26621c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26619a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamPresenceInviteColleaguesScreen.this.Hf().f73987l.setEnabled(this.f26621c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressButton.b f26623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamPresenceInviteColleaguesScreen f26624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ProgressButton.b bVar, TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, zt.e eVar) {
            super(2, eVar);
            this.f26623b = bVar;
            this.f26624c = teamPresenceInviteColleaguesScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new m(this.f26623b, this.f26624c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26622a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProgressButton.b bVar = this.f26623b;
            if (t.b(bVar, ProgressButton.b.a.f46549a)) {
                ProgressButton.setCompleteButtonState$default(this.f26624c.Hf().f73987l, false, 1, null);
            } else if (t.b(bVar, ProgressButton.b.C0663b.f46550a)) {
                this.f26624c.Hf().f73987l.setDefaultButtonState();
            } else {
                if (!t.b(bVar, ProgressButton.b.c.f46551a)) {
                    throw new s();
                }
                this.f26624c.Hf().f73987l.setIndeterminateButtonState();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamPresenceInviteColleaguesScreen() {
        iu.a aVar = new iu.a() { // from class: fi.d0
            @Override // iu.a
            public final Object a() {
                return TeamPresenceInviteColleaguesScreen.Uf(this.f50025a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26589d = new MoxyKtxDelegate(mvpDelegate, TeamPresenceInviteColleaguesPresenter.class.getName() + ".presenter", aVar);
        this.f26590e = new ArrayList();
    }

    private final void Ff() {
        z0.F0(Hf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final TeamPresenceInviteColleaguesScreenArgs Gf() {
        return (TeamPresenceInviteColleaguesScreenArgs) this.f26588c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t7 Hf() {
        t7 t7Var = this.f26586a;
        if (t7Var != null) {
            return t7Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeamPresenceInviteColleaguesPresenter If() {
        return (TeamPresenceInviteColleaguesPresenter) this.f26589d.getValue(this, f26584f[0]);
    }

    private final void Jf() {
        u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("SETUP_TEAM_VAULT_INTERNAL_ERROR_SCREEN_RETRY_RESULT_KEY").j(getViewLifecycleOwner(), new l0() { // from class: fi.e0
            @Override // androidx.lifecycle.l0
            public final void a(Object obj) {
                TeamPresenceInviteColleaguesScreen.Kf(this.f50027a, obj);
            }
        });
        u0VarJ.f("SETUP_TEAM_VAULT_INTERNAL_ERROR_SCREEN_RETRY_RESULT_KEY");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, Object obj) {
        teamPresenceInviteColleaguesScreen.If().M2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        Hf().f73978c.setOnClickListener(new View.OnClickListener() { // from class: fi.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamPresenceInviteColleaguesScreen.Mf(this.f50022a, view);
            }
        });
        Hf().f73987l.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamPresenceInviteColleaguesScreen.Nf(this.f50024a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, View view) {
        teamPresenceInviteColleaguesScreen.If().C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, View view) {
        teamPresenceInviteColleaguesScreen.If().G2();
    }

    private final void Of() {
        final u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("SETUP_TEAM_VAULT_NETWORK_ERROR_SCREEN_RETRY_RESULT_KEY").j(getViewLifecycleOwner(), new l0() { // from class: fi.a0
            @Override // androidx.lifecycle.l0
            public final void a(Object obj) {
                TeamPresenceInviteColleaguesScreen.Pf(this.f50018a, u0VarJ, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Pf(TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, u0 u0Var, Object obj) {
        teamPresenceInviteColleaguesScreen.If().M2();
        u0Var.f("SETUP_TEAM_VAULT_NETWORK_ERROR_SCREEN_RETRY_RESULT_KEY");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qf() {
        Of();
        Jf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf() {
        Hf().f73977b.f72393c.setText(getString(R.string.invite_team_members));
        Hf().f73977b.f72392b.setOnClickListener(new View.OnClickListener() { // from class: fi.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamPresenceInviteColleaguesScreen.Sf(this.f50029a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sf(TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, View view) {
        teamPresenceInviteColleaguesScreen.If().D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Tf(TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        teamPresenceInviteColleaguesScreen.If().D2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamPresenceInviteColleaguesPresenter Uf(TeamPresenceInviteColleaguesScreen teamPresenceInviteColleaguesScreen) {
        return new TeamPresenceInviteColleaguesPresenter(teamPresenceInviteColleaguesScreen.Gf().getIsNeedShowTeamVaultPromotion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void A1(ProgressButton.b bVar) {
        t.f(bVar, "state");
        bh.a.b(this, new m(bVar, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void B2(boolean z10) {
        bh.a.b(this, new i(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void C0() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void P1(boolean z10) {
        bh.a.b(this, new k(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void T(boolean z10) {
        bh.a.b(this, new l(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void U0() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void e5() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void i0(TeamMemberInvitation teamMemberInvitation) {
        t.f(teamMemberInvitation, "invitationData");
        bh.a.b(this, new a(teamMemberInvitation, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: fi.g0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamPresenceInviteColleaguesScreen.Tf(this.f50031a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26587b = e0VarB;
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
        this.f26586a = t7.c(layoutInflater, viewGroup, false);
        Ff();
        ConstraintLayout constraintLayoutB = Hf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26590e.clear();
        this.f26586a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26587b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void r(boolean z10) {
        bh.a.b(this, new j(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void y9(int i10) {
        bh.a.b(this, new g(i10, this, null));
    }
}
