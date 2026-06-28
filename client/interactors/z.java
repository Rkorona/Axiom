package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import wu.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f27710h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27711i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SyncServiceHelper f27713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TeamMembersOnlineCacheRepository f27714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f27715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u1 f27716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private wu.i0 f27717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zu.f f27718g;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27719a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27721a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f27722b;

            a(zt.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                a aVar = new a(eVar);
                aVar.f27722b = obj;
                return aVar;
            }

            @Override // iu.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Boolean bool, zt.e eVar) {
                return ((a) create(bool, eVar)).invokeSuspend(ut.m0.f82633a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f27721a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!((Boolean) this.f27722b).booleanValue());
            }
        }

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return z.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        
            if (r7.g(r6) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r6.f27719a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                ut.x.b(r7)
                goto L97
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                ut.x.b(r7)
                goto L3d
            L1f:
                ut.x.b(r7)
                com.server.auditor.ssh.client.interactors.z r7 = com.server.auditor.ssh.client.interactors.z.this
                zu.f r7 = com.server.auditor.ssh.client.interactors.z.e(r7)
                r4 = 600(0x258, double:2.964E-321)
                zu.f r7 = zu.h.o(r7, r4)
                com.server.auditor.ssh.client.interactors.z$b$a r1 = new com.server.auditor.ssh.client.interactors.z$b$a
                r4 = 0
                r1.<init>(r4)
                r6.f27719a = r3
                java.lang.Object r7 = zu.h.z(r7, r1, r6)
                if (r7 != r0) goto L3d
                goto L8d
            L3d:
                com.server.auditor.ssh.client.interactors.z r7 = com.server.auditor.ssh.client.interactors.z.this
                com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository r7 = com.server.auditor.ssh.client.interactors.z.c(r7)
                com.server.auditor.ssh.client.interactors.z r1 = com.server.auditor.ssh.client.interactors.z.this
                com.server.auditor.ssh.client.app.a r1 = com.server.auditor.ssh.client.interactors.z.d(r1)
                java.lang.Integer r1 = r1.q()
                r7.n(r1)
                com.server.auditor.ssh.client.interactors.z r7 = com.server.auditor.ssh.client.interactors.z.this
                com.server.auditor.ssh.client.app.a r7 = com.server.auditor.ssh.client.interactors.z.d(r7)
                boolean r7 = r7.m()
                if (r7 == 0) goto L67
                com.server.auditor.ssh.client.interactors.z r7 = com.server.auditor.ssh.client.interactors.z.this
                com.server.auditor.ssh.client.synchronization.SyncServiceHelper r7 = com.server.auditor.ssh.client.interactors.z.b(r7)
                r0 = 0
                r7.requestTeamMembersList(r0)
                goto L97
            L67:
                com.server.auditor.ssh.client.interactors.z r7 = com.server.auditor.ssh.client.interactors.z.this
                com.server.auditor.ssh.client.app.a r7 = com.server.auditor.ssh.client.interactors.z.d(r7)
                boolean r7 = r7.m()
                if (r7 != 0) goto L8e
                com.server.auditor.ssh.client.interactors.z r7 = com.server.auditor.ssh.client.interactors.z.this
                com.server.auditor.ssh.client.app.a r7 = com.server.auditor.ssh.client.interactors.z.d(r7)
                boolean r7 = r7.r0()
                if (r7 == 0) goto L8e
                com.server.auditor.ssh.client.interactors.z r7 = com.server.auditor.ssh.client.interactors.z.this
                com.server.auditor.ssh.client.interactors.o0 r7 = com.server.auditor.ssh.client.interactors.z.a(r7)
                r6.f27719a = r2
                java.lang.Object r7 = r7.g(r6)
                if (r7 != r0) goto L97
            L8d:
                return r0
            L8e:
                com.server.auditor.ssh.client.interactors.z r7 = com.server.auditor.ssh.client.interactors.z.this
                com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository r7 = com.server.auditor.ssh.client.interactors.z.c(r7)
                r7.h()
            L97:
                ut.m0 r7 = ut.m0.f82633a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public z(com.server.auditor.ssh.client.app.a aVar, SyncServiceHelper syncServiceHelper, TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepository, o0 o0Var) {
        ju.t.f(aVar, "termiusStorage");
        ju.t.f(syncServiceHelper, "syncServiceHelper");
        ju.t.f(teamMembersOnlineCacheRepository, "teamMembersOnlineCacheRepository");
        ju.t.f(o0Var, "preparePresenceEntitiesInteractor");
        this.f27712a = aVar;
        this.f27713b = syncServiceHelper;
        this.f27714c = teamMembersOnlineCacheRepository;
        this.f27715d = o0Var;
        this.f27717f = wu.j0.a(wu.x0.a());
        androidx.lifecycle.k0 k0VarP = aVar.P();
        ju.t.e(k0VarP, "getIsSyncingLiveData(...)");
        this.f27718g = androidx.lifecycle.m.a(k0VarP);
    }

    public final Object f(zt.e eVar) {
        u1 u1Var = this.f27716e;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.f27716e = wu.k.d(this.f27717f, null, null, new b(null), 3, null);
        return ut.m0.f82633a;
    }
}
