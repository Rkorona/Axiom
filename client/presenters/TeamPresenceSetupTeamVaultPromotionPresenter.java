package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.team.d;
import iu.p;
import java.util.UUID;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamPresenceSetupTeamVaultPromotionPresenter extends MvpPresenter<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36169b = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36170c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36171a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamPresenceSetupTeamVaultPromotionPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36171a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamPresenceSetupTeamVaultPromotionPresenter.this.getViewState().D0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36173a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamPresenceSetupTeamVaultPromotionPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36173a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamPresenceSetupTeamVaultPromotionPresenter.this.getViewState().t6(TeamPresenceSetupTeamVaultPromotionPresenter.this.f36168a, TeamPresenceSetupTeamVaultPromotionPresenter.this.f36170c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamPresenceSetupTeamVaultPromotionPresenter(int i10) {
        this.f36168a = i10;
        String string = UUID.randomUUID().toString();
        t.e(string, "toString(...)");
        this.f36170c = string;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        this.f36169b.p1();
    }

    public final void s2() {
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void u2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}
