package com.server.auditor.ssh.client.presenters.team;

import androidx.lifecycle.f0;
import com.server.auditor.ssh.client.contracts.team.f;
import com.server.auditor.ssh.client.interactors.o;
import com.server.auditor.ssh.client.interactors.q;
import com.server.auditor.ssh.client.models.UserType;
import com.server.auditor.ssh.client.models.u;
import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole;
import hg.b2;
import iu.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import tp.g0;
import ut.m0;
import ut.s;
import ut.x;
import vt.v;
import wu.i0;
import wu.k;
import wu.p0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamPresencePresenter extends MvpPresenter<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f38195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TeamMembersOnlineCacheRepository f38198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hg.d f38199f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final jl.c f38200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final o f38201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final q f38202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p0 f38203x;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38204a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamPresencePresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38204a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(TeamPresencePresenter.this.f38195b.m() ? TeamPresencePresenter.this.f38195b.j() : TeamPresencePresenter.this.f38195b.r0());
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38206a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamPresencePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38206a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamPresencePresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38208a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamPresencePresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38208a;
            if (i10 == 0) {
                x.b(obj);
                jl.c cVar = TeamPresencePresenter.this.f38200u;
                this.f38208a = 1;
                obj = cVar.f(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            UserType userType = (UserType) obj;
            boolean z10 = userType instanceof UserType.TeamOwner;
            boolean z11 = userType instanceof UserType.BusinessTeamOwner;
            if (z10 || z11) {
                TeamPresencePresenter.this.getViewState().Y3(TeamPresencePresenter.this.f38194a);
            } else {
                TeamPresencePresenter.this.getViewState().N6(TeamPresencePresenter.this.f38197d);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f38213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TeamPresencePresenter f38214e;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38215a;

            static {
                int[] iArr = new int[TeamMemberRole.values().length];
                try {
                    iArr[TeamMemberRole.OWNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TeamMemberRole.MEMBER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TeamMemberRole.EDITOR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f38215a = iArr;
            }
        }

        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yt.a.e(Integer.valueOf(((u) obj).a()), Integer.valueOf(((u) obj2).a()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, TeamPresencePresenter teamPresencePresenter, e eVar) {
            super(2, eVar);
            this.f38213d = list;
            this.f38214e = teamPresencePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new d(this.f38213d, this.f38214e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List listG1;
            List list;
            Object objA0;
            u dVar;
            Object objF = au.b.f();
            int i10 = this.f38212c;
            if (i10 == 0) {
                x.b(obj);
                List<TeamMembersOnlineCacheRepository.TeamUser> listD1 = v.d1(this.f38213d);
                TeamPresencePresenter teamPresencePresenter = this.f38214e;
                ArrayList arrayList = new ArrayList(v.z(listD1, 10));
                for (TeamMembersOnlineCacheRepository.TeamUser teamUser : listD1) {
                    int i11 = a.f38215a[teamUser.getRole().ordinal()];
                    if (i11 == 1) {
                        dVar = new u.d(teamUser.getUserId(), teamUser.getUsername(), teamUser.getFullName(), teamPresencePresenter.f38201v.a(teamUser.getUserId(), teamUser.getUsername()), teamPresencePresenter.f38202w.e(teamUser.getUsername(), teamUser.getFullName()), teamUser.isOnline(), teamUser.getAvatarUri());
                    } else if (i11 == 2) {
                        dVar = new u.c(teamUser.getUserId(), teamUser.getUsername(), teamUser.getFullName(), teamPresencePresenter.f38201v.a(teamUser.getUserId(), teamUser.getUsername()), teamPresencePresenter.f38202w.e(teamUser.getUsername(), teamUser.getFullName()), teamUser.isOnline(), teamUser.getAvatarUri(), teamUser.getInvitationStatus());
                    } else {
                        if (i11 != 3) {
                            throw new s();
                        }
                        dVar = new u.c(teamUser.getUserId(), teamUser.getUsername(), teamUser.getFullName(), teamPresencePresenter.f38201v.a(teamUser.getUserId(), teamUser.getUsername()), teamPresencePresenter.f38202w.e(teamUser.getUsername(), teamUser.getFullName()), teamUser.isOnline(), teamUser.getAvatarUri(), teamUser.getInvitationStatus());
                    }
                    arrayList.add(dVar);
                }
                listG1 = v.g1(arrayList);
                try {
                    p0 p0Var = this.f38214e.f38203x;
                    this.f38210a = listG1;
                    this.f38211b = listG1;
                    this.f38212c = 1;
                    objA0 = p0Var.a0(this);
                    if (objA0 == objF) {
                        return objF;
                    }
                    list = listG1;
                } catch (CancellationException unused) {
                    list = listG1;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f38211b;
                listG1 = (List) this.f38210a;
                try {
                    x.b(obj);
                    objA0 = obj;
                } catch (CancellationException unused2) {
                }
            }
            if (((Boolean) objA0).booleanValue()) {
                list.add(u.b.f27950c);
            }
            if (list.size() > 1) {
                v.D(list, new b());
            }
            this.f38214e.getViewState().pa(listG1);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamPresencePresenter() {
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        this.f38194a = apiKey != null ? apiKey.getUsername() : null;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f38195b = aVarN;
        this.f38196c = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f38197d = !aVarN.m();
        b2 b2Var = b2.f52944a;
        this.f38198e = b2Var.Q1();
        hg.d dVarM = aVarN.M();
        this.f38199f = dVarM;
        t.e(aVarN, "termiusStorage");
        g0 g0VarY1 = b2Var.y1();
        t.e(dVarM, "insensitiveKeyValueRepository");
        hj.f fVar = new hj.f(dVarM);
        t.e(dVarM, "insensitiveKeyValueRepository");
        this.f38200u = new jl.c(aVarN, g0VarY1, fVar, new il.m(dVarM, b2Var.s1()), new com.server.auditor.ssh.client.interactors.a(b2Var.y1()));
        this.f38201v = new o();
        this.f38202w = new q();
        this.f38203x = k.b(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void A2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void B2(List list) {
        t.f(list, "teamUsers");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(list, this, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void attachView(f fVar) {
        super.attachView(fVar);
        this.f38197d = !this.f38195b.m();
        getViewState().Y9(this.f38197d);
        getViewState().c0(!this.f38197d);
        if (this.f38197d) {
            this.f38196c.o1();
        } else {
            this.f38196c.x5();
        }
    }

    public final f0 y2() {
        return this.f38198e.j();
    }

    public final void z2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}
