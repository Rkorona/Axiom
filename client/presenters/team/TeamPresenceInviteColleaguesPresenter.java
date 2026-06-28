package com.server.auditor.ssh.client.presenters.team;

import android.text.Editable;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.interactors.f0;
import com.server.auditor.ssh.client.interactors.o0;
import com.server.auditor.ssh.client.interactors.y0;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.models.user.TrialResponse;
import com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository;
import com.server.auditor.ssh.client.widget.ProgressButton;
import hg.b2;
import hj.e;
import il.r0;
import il.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jg.h;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.g0;
import wu.i0;
import wu.x0;
import yg.d;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamPresenceInviteColleaguesPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.team.b> implements e.a, h.a {
    public static final a B = new a(null);
    public static final int C = 8;
    private final y0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f38141b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f38142c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f38143d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f38144e = b.C0581b.f38153a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38145f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f38146u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final r0 f38147v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final o0 f38148w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final hj.e f38149x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final jg.h f38150y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final pl.b f38151z;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f38152a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1958391629;
            }

            public String toString() {
                return "GenerateTeamEncryptionKeys";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$b$b, reason: collision with other inner class name */
        public static final class C0581b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0581b f38153a = new C0581b();

            private C0581b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0581b);
            }

            public int hashCode() {
                return 2129430656;
            }

            public String toString() {
                return "TeamCreation";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f38154a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -548732801;
            }

            public String toString() {
                return "TeamMemberInvitations";
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38155a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38157c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38155a = obj;
            this.f38157c |= RtlSpacingHelper.UNDEFINED;
            return TeamPresenceInviteColleaguesPresenter.this.A2(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38158a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38158a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (TeamPresenceInviteColleaguesPresenter.this.f38141b.get()) {
                return m0.f82633a;
            }
            TeamPresenceInviteColleaguesPresenter.this.I2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38160a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38160a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (TeamPresenceInviteColleaguesPresenter.this.f38141b.get()) {
                return m0.f82633a;
            }
            TeamPresenceInviteColleaguesPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38162a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f38164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, zt.e eVar) {
            super(2, eVar);
            this.f38164c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new f(this.f38164c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38162a;
            if (i10 == 0) {
                x.b(obj);
                TeamPresenceInviteColleaguesPresenter teamPresenceInviteColleaguesPresenter = TeamPresenceInviteColleaguesPresenter.this;
                List list = this.f38164c;
                this.f38162a = 1;
                if (teamPresenceInviteColleaguesPresenter.F2(list, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38167c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38169e;

        g(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38167c = obj;
            this.f38169e |= RtlSpacingHelper.UNDEFINED;
            return TeamPresenceInviteColleaguesPresenter.this.F2(null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38170a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38170a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (TeamPresenceInviteColleaguesPresenter.this.f38141b.get()) {
                return m0.f82633a;
            }
            TeamPresenceInviteColleaguesPresenter.this.M2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38172a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f38174c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, zt.e eVar) {
            super(2, eVar);
            this.f38174c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new i(this.f38174c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38172a;
            if (i10 == 0) {
                x.b(obj);
                TeamPresenceInviteColleaguesPresenter teamPresenceInviteColleaguesPresenter = TeamPresenceInviteColleaguesPresenter.this;
                List list = this.f38174c;
                this.f38172a = 1;
                if (teamPresenceInviteColleaguesPresenter.F2(list, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38175a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamMemberInvitation f38177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Editable f38178d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(TeamMemberInvitation teamMemberInvitation, Editable editable, zt.e eVar) {
            super(2, eVar);
            this.f38177c = teamMemberInvitation;
            this.f38178d = editable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new j(this.f38177c, this.f38178d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38175a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (TeamPresenceInviteColleaguesPresenter.this.f38141b.get()) {
                return m0.f82633a;
            }
            this.f38177c.setEmail(String.valueOf(this.f38178d));
            TeamPresenceInviteColleaguesPresenter.this.getViewState().T(TeamPresenceInviteColleaguesPresenter.this.B2());
            boolean zB = t.b(v.B0(TeamPresenceInviteColleaguesPresenter.this.f38142c), this.f38177c);
            Editable editable = this.f38178d;
            if (editable != null && !s.m0(editable) && zB) {
                TeamPresenceInviteColleaguesPresenter.this.I2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38179a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38179a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamPresenceInviteColleaguesPresenter.this.f38141b.set(false);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().A1(ProgressButton.b.C0663b.f46550a);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().r(true);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().B2(true);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().P1(true);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().C0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38181a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamPresenceInviteColleaguesPresenter.this.f38141b.set(false);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().A1(ProgressButton.b.C0663b.f46550a);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().r(true);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().B2(true);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().P1(true);
            TeamPresenceInviteColleaguesPresenter.this.getViewState().U0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38183a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38183a;
            if (i10 == 0) {
                x.b(obj);
                TeamPresenceInviteColleaguesPresenter teamPresenceInviteColleaguesPresenter = TeamPresenceInviteColleaguesPresenter.this;
                this.f38183a = 1;
                if (teamPresenceInviteColleaguesPresenter.A2(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38186b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38188d;

        n(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38186b = obj;
            this.f38188d |= RtlSpacingHelper.UNDEFINED;
            return TeamPresenceInviteColleaguesPresenter.this.J2(this);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38189a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38191c;

        o(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38189a = obj;
            this.f38191c |= RtlSpacingHelper.UNDEFINED;
            return TeamPresenceInviteColleaguesPresenter.this.L2(this);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38192a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceInviteColleaguesPresenter.this.new p(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            if (r6.K2(r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        
            if (r6.A2(r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        
            if (r6.J2(r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r5.f38192a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                ut.x.b(r6)
                goto L60
            L1e:
                ut.x.b(r6)
                com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.this
                com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$b r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.s2(r6)
                com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$b$b r1 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.b.C0581b.f38153a
                boolean r1 = ju.t.b(r6, r1)
                if (r1 == 0) goto L3a
                com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.this
                r5.f38192a = r4
                java.lang.Object r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.y2(r6, r5)
                if (r6 != r0) goto L60
                goto L5f
            L3a:
                com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$b$a r1 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.b.a.f38152a
                boolean r1 = ju.t.b(r6, r1)
                if (r1 == 0) goto L4d
                com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.this
                r5.f38192a = r3
                java.lang.Object r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.q2(r6, r5)
                if (r6 != r0) goto L60
                goto L5f
            L4d:
                com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$b$c r1 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.b.c.f38154a
                boolean r6 = ju.t.b(r6, r1)
                if (r6 == 0) goto L63
                com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.this
                r5.f38192a = r2
                java.lang.Object r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.x2(r6, r5)
                if (r6 != r0) goto L60
            L5f:
                return r0
            L60:
                ut.m0 r6 = ut.m0.f82633a
                return r6
            L63:
                ut.s r6 = new ut.s
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamPresenceInviteColleaguesPresenter(boolean z10) {
        this.f38140a = z10;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f38145f = aVarY;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f38146u = aVarN;
        SyncServiceHelper syncServiceHelperY = hg.f.p().Y();
        t.e(syncServiceHelperY, "getSyncServiceHelper(...)");
        this.f38147v = new r0(syncServiceHelperY);
        t.e(aVarN, "termiusStorage");
        b2 b2Var = b2.f52944a;
        pl.j jVarX1 = b2Var.x1();
        pl.i iVarW1 = b2Var.w1();
        il.c cVarR0 = b2Var.R0();
        rl.b bVar = new rl.b(b2Var.P1(), b2Var.B1());
        mv.b bVarS1 = b2Var.s1();
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        com.server.auditor.ssh.client.interactors.n nVar = new com.server.auditor.ssh.client.interactors.n(cVarR0, bVar, new UserAvatarDownloadAttemptTimestampRepository(bVarS1, dVarM));
        TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepositoryQ1 = b2Var.Q1();
        il.c cVarR02 = b2Var.R0();
        hg.d dVarM2 = aVarN.M();
        t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        u0 u0Var = new u0(dVarM2);
        t.e(aVarN, "termiusStorage");
        hg.d dVarM3 = aVarN.M();
        t.e(dVarM3, "getInsensitiveKeyValueRepository(...)");
        this.f38148w = new o0(aVarN, jVarX1, iVarW1, teamMembersOnlineCacheRepositoryQ1, cVarR02, nVar, u0Var, new f0(aVarN, dVarM3), b2Var.c1());
        pl.p pVar = new pl.p(b2Var.O1(), b2Var.B1());
        g0 g0VarB = x0.b();
        t.e(aVarN, "termiusStorage");
        t.e(aVarY, "avoAnalytics");
        this.f38149x = new hj.e(pVar, new jl.e(g0VarB, aVarN, aVarY, new wn.m(b2Var.y1())), this);
        this.f38150y = new jg.h(new pl.g(b2Var.O1(), b2Var.B1()), this);
        this.f38151z = new pl.b(b2Var.O1(), b2Var.B1(), new d.a(), null, null, 24, null);
        g0 g0VarB2 = x0.b();
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        t.e(groupDBAdapterH, "getGroupDBAdapter(...)");
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        PFRulesDBAdapter pFRulesDBAdapterZ = hg.f.p().z();
        t.e(pFRulesDBAdapterZ, "getPFRulesDBAdapter(...)");
        SnippetPackageDBAdapter snippetPackageDBAdapterO = hg.f.p().O();
        t.e(snippetPackageDBAdapterO, "getSnippetPackageDBAdapter(...)");
        SnippetDBAdapter snippetDBAdapterJ = hg.f.p().J();
        t.e(snippetDBAdapterJ, "getSnippetDBAdapter(...)");
        IdentityDBAdapter identityDBAdapterN = hg.f.p().n();
        t.e(identityDBAdapterN, "getIdentityDBAdapter(...)");
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        KnownHostsDBAdapter knownHostsDBAdapterR = hg.f.p().r();
        t.e(knownHostsDBAdapterR, "getKnownHostsDBAdapter(...)");
        this.A = new y0(g0VarB2, groupDBAdapterH, hostsDBAdapterI, snippetDBAdapterJ, snippetPackageDBAdapterO, pFRulesDBAdapterZ, identityDBAdapterN, sshKeyDBAdapterW, knownHostsDBAdapterR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (J2(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A2(zt.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.c
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$c r0 = (com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.c) r0
            int r1 = r0.f38157c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38157c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$c r0 = new com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38155a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38157c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r6)
            goto L91
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ut.x.b(r6)
            goto L82
        L38:
            ut.x.b(r6)
            com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$b$a r6 = com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.b.a.f38152a
            r5.f38144e = r6
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f38141b
            r6.set(r4)
            moxy.MvpView r6 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r6 = (com.server.auditor.ssh.client.contracts.team.b) r6
            com.server.auditor.ssh.client.widget.ProgressButton$b$c r2 = com.server.auditor.ssh.client.widget.ProgressButton.b.c.f46551a
            r6.A1(r2)
            moxy.MvpView r6 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r6 = (com.server.auditor.ssh.client.contracts.team.b) r6
            r2 = 0
            r6.r(r2)
            moxy.MvpView r6 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r6 = (com.server.auditor.ssh.client.contracts.team.b) r6
            r6.B2(r2)
            moxy.MvpView r6 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r6 = (com.server.auditor.ssh.client.contracts.team.b) r6
            r6.P1(r2)
            com.server.auditor.ssh.client.app.a r6 = r5.f38146u
            java.lang.Integer r6 = r6.q()
            if (r6 == 0) goto L98
            pl.b r2 = r5.f38151z
            int r6 = r6.intValue()
            r0.f38157c = r4
            java.lang.Object r6 = r2.b(r6, r0)
            if (r6 != r1) goto L82
            goto L90
        L82:
            pl.b$b r6 = (pl.b.AbstractC1082b) r6
            boolean r6 = r6 instanceof pl.b.AbstractC1082b.d
            if (r6 == 0) goto L94
            r0.f38157c = r3
            java.lang.Object r6 = r5.J2(r0)
            if (r6 != r1) goto L91
        L90:
            return r1
        L91:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        L94:
            r5.E2()
            goto L9b
        L98:
            r5.E2()
        L9b:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.A2(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B2() {
        List list = this.f38142c;
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

    private final void E2() {
        this.f38141b.set(false);
        getViewState().A1(ProgressButton.b.C0663b.f46550a);
        getViewState().r(true);
        getViewState().B2(true);
        getViewState().P1(true);
        getViewState().C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F2(java.util.List r6, zt.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.g
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$g r0 = (com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.g) r0
            int r1 = r0.f38169e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38169e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$g r0 = new com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38167c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38169e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r6 = r0.f38166b
            ut.x.b(r7)
            goto L94
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f38165a
            java.util.List r6 = (java.util.List) r6
            ut.x.b(r7)
            goto L54
        L3e:
            ut.x.b(r7)
            java.util.concurrent.atomic.AtomicInteger r7 = r5.f38143d
            int r7 = r7.decrementAndGet()
            if (r7 > 0) goto Lb3
            r0.f38165a = r6
            r0.f38169e = r4
            java.lang.Object r7 = r5.L2(r0)
            if (r7 != r1) goto L54
            goto L93
        L54:
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f38141b
            r2 = 0
            r7.set(r2)
            moxy.MvpView r7 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r7 = (com.server.auditor.ssh.client.contracts.team.b) r7
            com.server.auditor.ssh.client.widget.ProgressButton$b$b r2 = com.server.auditor.ssh.client.widget.ProgressButton.b.C0663b.f46550a
            r7.A1(r2)
            moxy.MvpView r7 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r7 = (com.server.auditor.ssh.client.contracts.team.b) r7
            r7.r(r4)
            moxy.MvpView r7 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r7 = (com.server.auditor.ssh.client.contracts.team.b) r7
            r7.B2(r4)
            moxy.MvpView r7 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r7 = (com.server.auditor.ssh.client.contracts.team.b) r7
            r7.P1(r4)
            int r6 = r6.size()
            com.server.auditor.ssh.client.interactors.y0 r7 = r5.A
            r2 = 0
            r0.f38165a = r2
            r0.f38166b = r6
            r0.f38169e = r3
            java.lang.Object r7 = r7.j(r0)
            if (r7 != r1) goto L94
        L93:
            return r1
        L94:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            boolean r0 = r5.f38140a
            if (r0 == 0) goto Laa
            if (r7 <= 0) goto Laa
            moxy.MvpView r7 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r7 = (com.server.auditor.ssh.client.contracts.team.b) r7
            r7.y9(r6)
            goto Lb3
        Laa:
            moxy.MvpView r6 = r5.getViewState()
            com.server.auditor.ssh.client.contracts.team.b r6 = (com.server.auditor.ssh.client.contracts.team.b) r6
            r6.e5()
        Lb3:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.F2(java.util.List, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        TeamMemberInvitation teamMemberInvitation = new TeamMemberInvitation(null, null, 3, null);
        this.f38142c.add(teamMemberInvitation);
        getViewState().i0(teamMemberInvitation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (F2(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(zt.e r8) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.J2(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K2(zt.e eVar) {
        this.f38144e = b.C0581b.f38153a;
        this.f38141b.set(true);
        getViewState().A1(ProgressButton.b.c.f46551a);
        getViewState().r(false);
        getViewState().B2(false);
        getViewState().P1(false);
        if (this.f38146u.m()) {
            Object objJ2 = J2(eVar);
            return objJ2 == au.b.f() ? objJ2 : m0.f82633a;
        }
        Object objB = this.f38149x.b("My Team", v.o(), eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6.i(true, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(zt.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.o
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$o r0 = (com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.o) r0
            int r1 = r0.f38191c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38191c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$o r0 = new com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38189a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38191c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ut.x.b(r6)
            goto L46
        L38:
            ut.x.b(r6)
            il.r0 r6 = r5.f38147v
            r0.f38191c = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            com.server.auditor.ssh.client.interactors.o0 r6 = r5.f38148w
            r0.f38191c = r3
            java.lang.Object r6 = r6.i(r4, r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.team.TeamPresenceInviteColleaguesPresenter.L2(zt.e):java.lang.Object");
    }

    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void G2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    public final void H2(TeamMemberInvitation teamMemberInvitation, Editable editable) {
        t.f(teamMemberInvitation, "colleagueInvitation");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(teamMemberInvitation, editable, null), 3, null);
    }

    public final void M2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(null), 3, null);
    }

    @Override // jg.h.a
    public void onFailedInviteTeamMember(List list) {
        t.f(list, "list");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(list, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        I2();
        this.f38145f.n1();
    }

    @Override // jg.h.a
    public void onInvitingTeamMember(List list) {
        t.f(list, "list");
    }

    @Override // jg.h.a
    public void onSuccessInviteTeamMember(List list) {
        t.f(list, "list");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(list, null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationFailed() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationNetworkError() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationSuccess(TrialResponse trialResponse) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }
}
