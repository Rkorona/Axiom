package com.server.auditor.ssh.client.fragments.trials;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.trials.EndOfTrialInviteColleaguesScreen;
import com.server.auditor.ssh.client.fragments.trials.a;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.presenters.trials.EndOfTrialInviteColleaguesScreenPresenter;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
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
import o4.a2;
import o4.z0;
import qg.n1;
import qg.o1;
import qu.k;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class EndOfTrialInviteColleaguesScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.trials.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26783e = {n0.g(new g0(EndOfTrialInviteColleaguesScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/trials/EndOfTrialInviteColleaguesScreenPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26784f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n1 f26785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f26786b = new x(n0.b(EndOfTrialInviteColleaguesScreenArgs.class), new f(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f26787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f26788d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26789a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamMemberInvitation f26791c;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.trials.EndOfTrialInviteColleaguesScreen$a$a, reason: collision with other inner class name */
        public static final class C0422a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ EndOfTrialInviteColleaguesScreen f26792a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TeamMemberInvitation f26793b;

            public C0422a(EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen, TeamMemberInvitation teamMemberInvitation) {
                this.f26792a = endOfTrialInviteColleaguesScreen;
                this.f26793b = teamMemberInvitation;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                this.f26792a.Ef().B2(this.f26793b, editable);
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
            this.f26791c = teamMemberInvitation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreen.this.new a(this.f26791c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26789a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            o1 o1VarC = o1.c(EndOfTrialInviteColleaguesScreen.this.getLayoutInflater(), null, false);
            t.e(o1VarC, "inflate(...)");
            o1VarC.b().setId(View.generateViewId());
            o1VarC.b().setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
            EndOfTrialInviteColleaguesScreen.this.Df().f73289o.addView(o1VarC.b());
            TextInputEditText textInputEditText = o1VarC.f73367b;
            TeamMemberInvitation teamMemberInvitation = this.f26791c;
            EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen = EndOfTrialInviteColleaguesScreen.this;
            textInputEditText.setText(teamMemberInvitation.getEmail());
            t.c(textInputEditText);
            textInputEditText.addTextChangedListener(new C0422a(endOfTrialInviteColleaguesScreen, teamMemberInvitation));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26794a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26794a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = EndOfTrialInviteColleaguesScreen.this.requireActivity();
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
        int f26796a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26796a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialInviteColleaguesScreen.this.Ff();
            EndOfTrialInviteColleaguesScreen.this.Hf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26798a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26798a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(EndOfTrialInviteColleaguesScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f26803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ EndOfTrialInviteColleaguesScreen f26804e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, List list, boolean z11, EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen, zt.e eVar) {
            super(2, eVar);
            this.f26801b = z10;
            this.f26802c = list;
            this.f26803d = z11;
            this.f26804e = endOfTrialInviteColleaguesScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f26801b, this.f26802c, this.f26803d, this.f26804e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26800a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a.C0425a c0425aA = com.server.auditor.ssh.client.fragments.trials.a.a(this.f26801b, (TeamMemberInvitation[]) this.f26802c.toArray(new TeamMemberInvitation[0]), this.f26803d);
            t.e(c0425aA, "actionEndOfTrialInviteCo…mTrialProgressScreen(...)");
            androidx.navigation.fragment.c.a(this.f26804e).O(c0425aA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class f implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26805a;

        public f(Fragment fragment) {
            this.f26805a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f26805a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f26805a + " has null arguments");
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26806a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26808c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreen.this.new g(this.f26808c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26806a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = EndOfTrialInviteColleaguesScreen.this.Df().f73276b.f72288b;
            t.e(toolbarImageButtonWithOvalRipple, "actionBarBackButton");
            toolbarImageButtonWithOvalRipple.setVisibility(this.f26808c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26809a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26811c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26811c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreen.this.new h(this.f26811c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26809a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = EndOfTrialInviteColleaguesScreen.this.Df().f73285k;
            t.e(appCompatTextView, "doItLaterButton");
            appCompatTextView.setVisibility(this.f26811c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26812a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26814c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26814c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreen.this.new i(this.f26814c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26812a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialInviteColleaguesScreen.this.Df().f73287m.setEnabled(this.f26814c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EndOfTrialInviteColleaguesScreen() {
        iu.a aVar = new iu.a() { // from class: ii.e
            @Override // iu.a
            public final Object a() {
                return EndOfTrialInviteColleaguesScreen.Mf(this.f56197a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26787c = new MoxyKtxDelegate(mvpDelegate, EndOfTrialInviteColleaguesScreenPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Bf() {
        pi.c cVar = new pi.c(a2.l.i(), a2.l.d());
        z0.N0(Df().b(), cVar);
        z0.F0(Df().b(), cVar);
        ConstraintLayout constraintLayout = Df().f73280f;
        ConstraintLayout constraintLayout2 = Df().f73280f;
        t.e(constraintLayout2, "bottomPanel");
        z0.N0(constraintLayout, new pi.d(constraintLayout2, a2.l.i(), a2.l.d(), 1));
    }

    private final EndOfTrialInviteColleaguesScreenArgs Cf() {
        return (EndOfTrialInviteColleaguesScreenArgs) this.f26786b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n1 Df() {
        n1 n1Var = this.f26785a;
        if (n1Var != null) {
            return n1Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EndOfTrialInviteColleaguesScreenPresenter Ef() {
        return (EndOfTrialInviteColleaguesScreenPresenter) this.f26787c.getValue(this, f26783e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ff() {
        Df().f73276b.f72289c.setText(getString(R.string.invite_your_colleagues));
        Df().f73276b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: ii.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialInviteColleaguesScreen.Gf(this.f56198a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gf(EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen, View view) {
        endOfTrialInviteColleaguesScreen.Ef().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf() {
        Df().f73277c.setOnClickListener(new View.OnClickListener() { // from class: ii.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialInviteColleaguesScreen.If(this.f56192a, view);
            }
        });
        Df().f73285k.setOnClickListener(new View.OnClickListener() { // from class: ii.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialInviteColleaguesScreen.Jf(this.f56194a, view);
            }
        });
        Df().f73287m.setOnClickListener(new View.OnClickListener() { // from class: ii.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialInviteColleaguesScreen.Kf(this.f56195a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void If(EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen, View view) {
        endOfTrialInviteColleaguesScreen.Ef().x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen, View view) {
        endOfTrialInviteColleaguesScreen.Ef().z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen, View view) {
        endOfTrialInviteColleaguesScreen.Ef().A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Lf(EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        endOfTrialInviteColleaguesScreen.Ef().y2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EndOfTrialInviteColleaguesScreenPresenter Mf(EndOfTrialInviteColleaguesScreen endOfTrialInviteColleaguesScreen) {
        return new EndOfTrialInviteColleaguesScreenPresenter(endOfTrialInviteColleaguesScreen.Cf().getIsNeedCreateTeam(), endOfTrialInviteColleaguesScreen.Cf().getIsNeedShowSuccessScreen(), endOfTrialInviteColleaguesScreen.Cf().getCanSkipInviteColleagues(), endOfTrialInviteColleaguesScreen.Cf().getCanNavigateBack());
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void M2(boolean z10) {
        bh.a.b(this, new g(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void T(boolean z10) {
        bh.a.b(this, new i(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void X3(boolean z10, List list, boolean z11) {
        t.f(list, "invites");
        bh.a.b(this, new e(z10, list, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void b() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void f() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void i0(TeamMemberInvitation teamMemberInvitation) {
        t.f(teamMemberInvitation, "invitationData");
        bh.a.b(this, new a(teamMemberInvitation, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void l0(boolean z10) {
        bh.a.b(this, new h(z10, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: ii.d
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EndOfTrialInviteColleaguesScreen.Lf(this.f56196a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26788d = e0VarB;
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
        this.f26785a = n1.c(layoutInflater, viewGroup, false);
        Bf();
        ConstraintLayout constraintLayoutB = Df().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26785a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26788d;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}
