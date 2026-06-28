package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.TeamMemberInvitationStatus;
import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.synchronization.api.models.teams.InviteResult;
import java.util.ArrayList;
import java.util.List;
import pl.i;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f27494j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f27495k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pl.j f27497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pl.i f27498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TeamMembersOnlineCacheRepository f27499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final il.c f27500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f27501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final il.u0 f27502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0 f27503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final iu.a f27504i;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f27509e;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f27511u;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27509e = obj;
            this.f27511u |= RtlSpacingHelper.UNDEFINED;
            return o0.this.d(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f27517f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f27518u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f27519v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f27520w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f27521x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f27523z;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27521x = obj;
            this.f27523z |= RtlSpacingHelper.UNDEFINED;
            return o0.this.f(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27527d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27529f;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27527d = obj;
            this.f27529f |= RtlSpacingHelper.UNDEFINED;
            return o0.this.g(this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f27530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27533d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27535f;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27533d = obj;
            this.f27535f |= RtlSpacingHelper.UNDEFINED;
            return o0.this.h(this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f27540e;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f27542u;

        f(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27540e = obj;
            this.f27542u |= RtlSpacingHelper.UNDEFINED;
            return o0.this.i(false, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27543a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27545c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f27545c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return o0.this.new g(this.f27545c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27543a;
            if (i10 == 0) {
                ut.x.b(obj);
                o0 o0Var = o0.this;
                boolean z10 = this.f27545c;
                this.f27543a = 1;
                if (o0Var.i(z10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public o0(com.server.auditor.ssh.client.app.a aVar, pl.j jVar, pl.i iVar, TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepository, il.c cVar, n nVar, il.u0 u0Var, f0 f0Var, iu.a aVar2) {
        ju.t.f(aVar, "termiusStorage");
        ju.t.f(jVar, "listTeamMembersApiRepository");
        ju.t.f(iVar, "listPendingInvitesApiRepository");
        ju.t.f(teamMembersOnlineCacheRepository, "teamMembersOnlineCacheRepository");
        ju.t.f(cVar, "avatarsCacheRepository");
        ju.t.f(nVar, "getOrDownloadUserAvatarUseCase");
        ju.t.f(u0Var, "userFullNameRepository");
        ju.t.f(f0Var, "obtainTeamOwnerInfoInteractor");
        ju.t.f(aVar2, "currentUserIdRepository");
        this.f27496a = aVar;
        this.f27497b = jVar;
        this.f27498c = iVar;
        this.f27499d = teamMembersOnlineCacheRepository;
        this.f27500e = cVar;
        this.f27501f = nVar;
        this.f27502g = u0Var;
        this.f27503h = f0Var;
        this.f27504i = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0089 -> B:12:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r22, zt.e r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof com.server.auditor.ssh.client.interactors.o0.b
            if (r2 == 0) goto L17
            r2 = r1
            com.server.auditor.ssh.client.interactors.o0$b r2 = (com.server.auditor.ssh.client.interactors.o0.b) r2
            int r3 = r2.f27511u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f27511u = r3
            goto L1c
        L17:
            com.server.auditor.ssh.client.interactors.o0$b r2 = new com.server.auditor.ssh.client.interactors.o0$b
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f27509e
            java.lang.Object r3 = au.b.f()
            int r4 = r2.f27511u
            r5 = 1
            if (r4 == 0) goto L46
            if (r4 != r5) goto L3e
            java.lang.Object r4 = r2.f27508d
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r6 = r2.f27507c
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$TeamUser r6 = (com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.TeamUser) r6
            java.lang.Object r7 = r2.f27506b
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r2.f27505a
            java.util.Collection r8 = (java.util.Collection) r8
            ut.x.b(r1)
        L3c:
            r9 = r6
            goto L8b
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L46:
            ut.x.b(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            r6 = r22
            int r4 = vt.v.z(r6, r4)
            r1.<init>(r4)
            java.util.Iterator r4 = r6.iterator()
            r7 = r4
            r4 = r1
        L5c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r7.next()
            r6 = r1
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$TeamUser r6 = (com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.TeamUser) r6
            com.server.auditor.ssh.client.interactors.n r1 = r0.f27501f
            android.content.Context r8 = com.server.auditor.ssh.client.app.TermiusApplication.F()
            java.lang.String r9 = "getTermiusAppContext(...)"
            ju.t.e(r8, r9)
            long r9 = r6.getUserId()
            r2.f27505a = r4
            r2.f27506b = r7
            r2.f27507c = r6
            r2.f27508d = r4
            r2.f27511u = r5
            java.lang.Object r1 = r1.d(r8, r9, r2)
            if (r1 != r3) goto L89
            return r3
        L89:
            r8 = r4
            goto L3c
        L8b:
            r16 = r1
            android.net.Uri r16 = (android.net.Uri) r16
            r19 = 223(0xdf, float:3.12E-43)
            r20 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$TeamUser r1 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.TeamUser.copy$default(r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add(r1)
            r4 = r8
            goto L5c
        La6:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.o0.d(java.util.List, zt.e):java.lang.Object");
    }

    private final List e(i.b.d dVar) {
        List<InviteResult> results = dVar.a().getResults();
        ArrayList arrayList = new ArrayList(vt.v.z(results, 10));
        for (InviteResult inviteResult : results) {
            arrayList.add(new TeamMembersOnlineCacheRepository.TeamUser(0L, inviteResult.getEmail(), null, false, "", null, inviteResult.getRole(), TeamMemberInvitationStatus.PENDING, 4, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d1 -> B:25:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(pl.j.b.d r21, zt.e r22) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.o0.f(pl.j$b$d, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(zt.e r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.server.auditor.ssh.client.interactors.o0.e
            if (r0 == 0) goto L13
            r0 = r13
            com.server.auditor.ssh.client.interactors.o0$e r0 = (com.server.auditor.ssh.client.interactors.o0.e) r0
            int r1 = r0.f27535f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27535f = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.o0$e r0 = new com.server.auditor.ssh.client.interactors.o0$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f27533d
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27535f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            long r1 = r0.f27530a
            java.lang.Object r3 = r0.f27532c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.f27531b
            java.lang.String r0 = (java.lang.String) r0
            ut.x.b(r13)
            r4 = r3
            r3 = r0
            goto L71
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3d:
            ut.x.b(r13)
            com.server.auditor.ssh.client.interactors.f0 r13 = r12.f27503h
            long r4 = r13.c()
            com.server.auditor.ssh.client.interactors.f0 r13 = r12.f27503h
            java.lang.String r13 = r13.a()
            com.server.auditor.ssh.client.interactors.f0 r2 = r12.f27503h
            java.lang.String r2 = r2.b()
            il.c r6 = r12.f27500e
            android.content.Context r7 = com.server.auditor.ssh.client.app.TermiusApplication.F()
            java.lang.String r8 = "getTermiusAppContext(...)"
            ju.t.e(r7, r8)
            r0.f27531b = r13
            r0.f27532c = r2
            r0.f27530a = r4
            r0.f27535f = r3
            java.lang.Object r0 = r6.h(r7, r4, r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r10 = r4
            r4 = r2
            r1 = r10
            r3 = r13
            r13 = r0
        L71:
            r7 = r13
            android.net.Uri r7 = (android.net.Uri) r7
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$TeamUser r0 = new com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$TeamUser
            com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole r8 = com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole.OWNER
            r9 = 0
            r5 = 0
            java.lang.String r6 = ""
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.o0.h(zt.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(zt.e r18) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.o0.g(zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0139, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105 A[PHI: r2 r6 r11
      0x0105: PHI (r2v5 java.util.List) = (r2v4 java.util.List), (r2v7 java.util.List) binds: [B:35:0x00e9, B:40:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r6v3 java.util.List) = (r6v2 java.util.List), (r6v4 java.util.List) binds: [B:35:0x00e9, B:40:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r11v9 com.server.auditor.ssh.client.interactors.o0) = (r11v8 com.server.auditor.ssh.client.interactors.o0), (r11v10 com.server.auditor.ssh.client.interactors.o0) binds: [B:35:0x00e9, B:40:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(boolean r11, zt.e r12) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.o0.i(boolean, zt.e):java.lang.Object");
    }

    public final void j(boolean z10) {
        wu.j.b(null, new g(z10, null), 1, null);
    }
}
