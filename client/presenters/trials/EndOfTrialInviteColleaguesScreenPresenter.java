package com.server.auditor.ssh.client.presenters.trials;

import android.text.Editable;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import iu.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class EndOfTrialInviteColleaguesScreenPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.trials.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f38355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f38358e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38359f = com.server.auditor.ssh.client.utils.analytics.a.y();

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38360a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreenPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38360a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EndOfTrialInviteColleaguesScreenPresenter.this.C2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38362a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38362a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EndOfTrialInviteColleaguesScreenPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38364a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreenPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38364a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EndOfTrialInviteColleaguesScreenPresenter.this.f38359f.d4(0);
            EndOfTrialInviteColleaguesScreenPresenter.this.getViewState().X3(EndOfTrialInviteColleaguesScreenPresenter.this.f38354a, v.o(), EndOfTrialInviteColleaguesScreenPresenter.this.f38355b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38366a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialInviteColleaguesScreenPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38366a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            List list = EndOfTrialInviteColleaguesScreenPresenter.this.f38358e;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!s.m0(((TeamMemberInvitation) obj2).getEmail())) {
                    arrayList.add(obj2);
                }
            }
            EndOfTrialInviteColleaguesScreenPresenter.this.f38359f.d4(arrayList.size());
            EndOfTrialInviteColleaguesScreenPresenter.this.getViewState().X3(EndOfTrialInviteColleaguesScreenPresenter.this.f38354a, arrayList, EndOfTrialInviteColleaguesScreenPresenter.this.f38355b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TeamMemberInvitation f38369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f38370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EndOfTrialInviteColleaguesScreenPresenter f38371d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(TeamMemberInvitation teamMemberInvitation, Editable editable, EndOfTrialInviteColleaguesScreenPresenter endOfTrialInviteColleaguesScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f38369b = teamMemberInvitation;
            this.f38370c = editable;
            this.f38371d = endOfTrialInviteColleaguesScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f38369b, this.f38370c, this.f38371d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38368a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            this.f38369b.setEmail(String.valueOf(this.f38370c));
            this.f38371d.getViewState().T(this.f38371d.w2());
            boolean zB = t.b(v.B0(this.f38371d.f38358e), this.f38369b);
            Editable editable = this.f38370c;
            if (editable != null && !s.m0(editable) && zB) {
                this.f38371d.C2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EndOfTrialInviteColleaguesScreenPresenter(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f38354a = z10;
        this.f38355b = z11;
        this.f38356c = z12;
        this.f38357d = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2() {
        TeamMemberInvitation teamMemberInvitation = new TeamMemberInvitation(null, null, 3, null);
        this.f38358e.add(teamMemberInvitation);
        getViewState().i0(teamMemberInvitation);
    }

    private final void D2() {
        if (this.f38354a) {
            this.f38359f.m1();
        } else {
            this.f38359f.F2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w2() {
        List list = this.f38358e;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!s.m0(((TeamMemberInvitation) it.next()).getEmail())) {
                return true;
            }
        }
        return false;
    }

    public final void A2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void B2(TeamMemberInvitation teamMemberInvitation, Editable editable) {
        t.f(teamMemberInvitation, "colleagueInvitation");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(teamMemberInvitation, editable, this, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        getViewState().l0(this.f38356c);
        getViewState().M2(this.f38357d);
        C2();
        D2();
    }

    public final void x2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void y2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void z2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }
}
