package com.server.auditor.ssh.client.fragments;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.e2;
import com.server.auditor.ssh.client.fragments.SetupTeamVaultInviteColleaguesScreen;
import com.server.auditor.ssh.client.fragments.v;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter;
import com.server.auditor.ssh.client.widget.ProgressButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.n6;
import qg.o6;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class SetupTeamVaultInviteColleaguesScreen extends MvpAppCompatFragment implements e2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24151f = {n0.g(new g0(SetupTeamVaultInviteColleaguesScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/SetupTeamVaultInviteColleaguesPresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f24152u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o6 f24153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f24154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.navigation.x f24155c = new androidx.navigation.x(n0.b(SetupTeamVaultInviteColleaguesScreenArgs.class), new i(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f24156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f24157e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24158a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamMemberInvitation f24160c;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.SetupTeamVaultInviteColleaguesScreen$a$a, reason: collision with other inner class name */
        public static final class C0386a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SetupTeamVaultInviteColleaguesScreen f24161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TeamMemberInvitation f24162b;

            public C0386a(SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, TeamMemberInvitation teamMemberInvitation) {
                this.f24161a = setupTeamVaultInviteColleaguesScreen;
                this.f24162b = teamMemberInvitation;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                this.f24161a.If().V2(this.f24162b, editable);
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
            this.f24160c = teamMemberInvitation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new a(this.f24160c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24158a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            n6 n6VarC = n6.c(SetupTeamVaultInviteColleaguesScreen.this.getLayoutInflater(), null, false);
            ju.t.e(n6VarC, "inflate(...)");
            n6VarC.b().setId(View.generateViewId());
            n6VarC.b().setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
            SetupTeamVaultInviteColleaguesScreen.this.Hf().f73422o.addView(n6VarC.b());
            TextInputEditText textInputEditText = n6VarC.f73329b;
            TeamMemberInvitation teamMemberInvitation = this.f24160c;
            SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen = SetupTeamVaultInviteColleaguesScreen.this;
            textInputEditText.setText(teamMemberInvitation.getEmail());
            ju.t.c(textInputEditText);
            textInputEditText.addTextChangedListener(new C0386a(setupTeamVaultInviteColleaguesScreen, teamMemberInvitation));
            SetupTeamVaultInviteColleaguesScreen.this.f24157e.add(n6VarC);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24163a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24165c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, zt.e eVar) {
            super(2, eVar);
            this.f24165c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new b(this.f24165c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24163a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = SetupTeamVaultInviteColleaguesScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.setResult(this.f24165c);
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24166a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24166a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultInviteColleaguesScreen.this.Sf();
            SetupTeamVaultInviteColleaguesScreen.this.Jf();
            SetupTeamVaultInviteColleaguesScreen.this.Mf();
            SetupTeamVaultInviteColleaguesScreen.this.Rf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24168a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24168a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(SetupTeamVaultInviteColleaguesScreen.this).T()) {
                SetupTeamVaultInviteColleaguesScreen.this.x(1002);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f24172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f24173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultInviteColleaguesScreen f24174e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, List list, String str, SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, zt.e eVar) {
            super(2, eVar);
            this.f24171b = i10;
            this.f24172c = list;
            this.f24173d = str;
            this.f24174e = setupTeamVaultInviteColleaguesScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f24171b, this.f24172c, this.f24173d, this.f24174e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24170a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            v.a aVarA = v.a(this.f24171b, (TypedEntityIdentifier[]) this.f24172c.toArray(new TypedEntityIdentifier[0]), this.f24173d);
            ju.t.e(aVarA, "actionSetupTeamVaultInvi…redentialsModeScreen(...)");
            androidx.navigation.fragment.c.a(this.f24174e).O(aVarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24175a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24175a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarB = v.b();
            ju.t.e(k1VarB, "actionSetupTeamVaultInvi…tInternalErrorScreen(...)");
            androidx.navigation.fragment.c.a(SetupTeamVaultInviteColleaguesScreen.this).O(k1VarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24177a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24177a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarC = v.c();
            ju.t.e(k1VarC, "actionSetupTeamVaultInvi…ltNetworkErrorScreen(...)");
            androidx.navigation.fragment.c.a(SetupTeamVaultInviteColleaguesScreen.this).O(k1VarC);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f24181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultInviteColleaguesScreen f24182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, List list, SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, zt.e eVar) {
            super(2, eVar);
            this.f24180b = i10;
            this.f24181c = list;
            this.f24182d = setupTeamVaultInviteColleaguesScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f24180b, this.f24181c, this.f24182d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24179a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            v.b bVarD = v.d(this.f24180b, (SetupTeamVaultShareEntitiesSectionType[]) this.f24181c.toArray(new SetupTeamVaultShareEntitiesSectionType[0]));
            ju.t.e(bVarD, "actionSetupTeamVaultInvi…amVaultSuccessScreen(...)");
            androidx.navigation.fragment.c.a(this.f24182d).O(bVarD);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class i implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24183a;

        public i(Fragment fragment) {
            this.f24183a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f24183a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f24183a + " has null arguments");
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24184a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24186c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new j(this.f24186c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24184a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultInviteColleaguesScreen.this.Hf().f73410c.setEnabled(this.f24186c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24187a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24189c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new k(this.f24189c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24187a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultInviteColleaguesScreen.this.Hf().f73409b.f72392b.setEnabled(this.f24189c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24190a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24192c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new l(this.f24192c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24190a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            List list = SetupTeamVaultInviteColleaguesScreen.this.f24157e;
            boolean z10 = this.f24192c;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((n6) it.next()).f73330c.setEnabled(z10);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24193a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24195c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24195c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new m(this.f24195c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24193a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultInviteColleaguesScreen.this.Hf().f73419l.setEnabled(this.f24195c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressButton.b f24197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultInviteColleaguesScreen f24198c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ProgressButton.b bVar, SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, zt.e eVar) {
            super(2, eVar);
            this.f24197b = bVar;
            this.f24198c = setupTeamVaultInviteColleaguesScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new n(this.f24197b, this.f24198c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24196a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProgressButton.b bVar = this.f24197b;
            if (ju.t.b(bVar, ProgressButton.b.a.f46549a)) {
                ProgressButton.setCompleteButtonState$default(this.f24198c.Hf().f73419l, false, 1, null);
            } else if (ju.t.b(bVar, ProgressButton.b.C0663b.f46550a)) {
                this.f24198c.Hf().f73419l.setDefaultButtonState();
            } else {
                if (!ju.t.b(bVar, ProgressButton.b.c.f46551a)) {
                    throw new ut.s();
                }
                this.f24198c.Hf().f73419l.setIndeterminateButtonState();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24199a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24201c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesScreen.this.new o(this.f24201c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24199a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextView textView = SetupTeamVaultInviteColleaguesScreen.this.Hf().f73420m;
            ju.t.e(textView, "setupStepInfo");
            textView.setVisibility(this.f24201c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SetupTeamVaultInviteColleaguesScreen() {
        iu.a aVar = new iu.a() { // from class: ch.i2
            @Override // iu.a
            public final Object a() {
                return SetupTeamVaultInviteColleaguesScreen.Vf(this.f15538a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24156d = new MoxyKtxDelegate(mvpDelegate, SetupTeamVaultInviteColleaguesPresenter.class.getName() + ".presenter", aVar);
        this.f24157e = new ArrayList();
    }

    private final void Ff() {
        z0.F0(Hf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final SetupTeamVaultInviteColleaguesScreenArgs Gf() {
        return (SetupTeamVaultInviteColleaguesScreenArgs) this.f24155c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o6 Hf() {
        o6 o6Var = this.f24153a;
        if (o6Var != null) {
            return o6Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SetupTeamVaultInviteColleaguesPresenter If() {
        return (SetupTeamVaultInviteColleaguesPresenter) this.f24156d.getValue(this, f24151f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        TextView textView = Hf().f73420m;
        TypedEntityIdentifier[] typedEntityToShareIdentifiers = Gf().getTypedEntityToShareIdentifiers();
        ju.t.e(typedEntityToShareIdentifiers, "getTypedEntityToShareIdentifiers(...)");
        textView.setText(typedEntityToShareIdentifiers.length == 0 ? getString(R.string.setup_team_vault_step_info, 1, 3) : getString(R.string.setup_team_vault_step_info, 2, 2));
    }

    private final void Kf() {
        u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("SETUP_TEAM_VAULT_INTERNAL_ERROR_SCREEN_RETRY_RESULT_KEY").j(getViewLifecycleOwner(), new l0() { // from class: ch.g2
            @Override // androidx.lifecycle.l0
            public final void a(Object obj) {
                SetupTeamVaultInviteColleaguesScreen.Lf(this.f15505a, obj);
            }
        });
        u0VarJ.f("SETUP_TEAM_VAULT_INTERNAL_ERROR_SCREEN_RETRY_RESULT_KEY");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, Object obj) {
        setupTeamVaultInviteColleaguesScreen.If().a3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        Hf().f73410c.setOnClickListener(new View.OnClickListener() { // from class: ch.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupTeamVaultInviteColleaguesScreen.Nf(this.f15555a, view);
            }
        });
        Hf().f73419l.setOnClickListener(new View.OnClickListener() { // from class: ch.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupTeamVaultInviteColleaguesScreen.Of(this.f15562a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, View view) {
        setupTeamVaultInviteColleaguesScreen.If().P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Of(SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, View view) {
        setupTeamVaultInviteColleaguesScreen.If().U2();
    }

    private final void Pf() {
        final u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("SETUP_TEAM_VAULT_NETWORK_ERROR_SCREEN_RETRY_RESULT_KEY").j(getViewLifecycleOwner(), new l0() { // from class: ch.h2
            @Override // androidx.lifecycle.l0
            public final void a(Object obj) {
                SetupTeamVaultInviteColleaguesScreen.Qf(this.f15513a, u0VarJ, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qf(SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, u0 u0Var, Object obj) {
        setupTeamVaultInviteColleaguesScreen.If().a3();
        u0Var.f("SETUP_TEAM_VAULT_NETWORK_ERROR_SCREEN_RETRY_RESULT_KEY");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf() {
        Pf();
        Kf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Sf() {
        Hf().f73409b.f72393c.setText(getString(R.string.team_vault_setup));
        Hf().f73409b.f72392b.setOnClickListener(new View.OnClickListener() { // from class: ch.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupTeamVaultInviteColleaguesScreen.Tf(this.f15547a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Tf(SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, View view) {
        setupTeamVaultInviteColleaguesScreen.If().Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Uf(SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        setupTeamVaultInviteColleaguesScreen.If().Q2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetupTeamVaultInviteColleaguesPresenter Vf(SetupTeamVaultInviteColleaguesScreen setupTeamVaultInviteColleaguesScreen) {
        TypedEntityIdentifier[] typedEntityToShareIdentifiers = setupTeamVaultInviteColleaguesScreen.Gf().getTypedEntityToShareIdentifiers();
        ju.t.e(typedEntityToShareIdentifiers, "getTypedEntityToShareIdentifiers(...)");
        List listG1 = vt.n.g1(typedEntityToShareIdentifiers);
        boolean isSharedCredentials = setupTeamVaultInviteColleaguesScreen.Gf().getIsSharedCredentials();
        String analyticsFunnelId = setupTeamVaultInviteColleaguesScreen.Gf().getAnalyticsFunnelId();
        ju.t.e(analyticsFunnelId, "getAnalyticsFunnelId(...)");
        return new SetupTeamVaultInviteColleaguesPresenter(listG1, isSharedCredentials, analyticsFunnelId);
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void A1(ProgressButton.b bVar) {
        ju.t.f(bVar, "state");
        bh.a.b(this, new n(bVar, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void B2(boolean z10) {
        bh.a.b(this, new j(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void C0() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void P1(boolean z10) {
        bh.a.b(this, new l(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void T(boolean z10) {
        bh.a.b(this, new m(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void U0() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void b() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void c8(boolean z10) {
        bh.a.b(this, new o(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void i0(TeamMemberInvitation teamMemberInvitation) {
        ju.t.f(teamMemberInvitation, "invitationData");
        bh.a.b(this, new a(teamMemberInvitation, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void m4(List list, int i10) {
        ju.t.f(list, "sharedEntities");
        bh.a.b(this, new h(i10, list, this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: ch.f2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SetupTeamVaultInviteColleaguesScreen.Uf(this.f15498a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24154b = e0VarB;
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
        this.f24153a = o6.c(layoutInflater, viewGroup, false);
        Ff();
        ConstraintLayout constraintLayoutB = Hf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24157e.clear();
        this.f24153a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24154b;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void r(boolean z10) {
        bh.a.b(this, new k(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void x(int i10) {
        bh.a.b(this, new b(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e2
    public void ya(int i10, List list, String str) {
        ju.t.f(list, "typedEntityToShareIdentifiers");
        ju.t.f(str, "analyticsFunnelId");
        bh.a.b(this, new e(i10, list, str, this, null));
    }
}
