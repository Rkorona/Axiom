package com.server.auditor.ssh.client.navigation;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository;
import com.server.auditor.ssh.client.app.repo.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import wu.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f28676n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f28677o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.repo.a f28678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InAppNotificationsApiRepository f28679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final og.m f28680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final og.d f28681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f28682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final og.y f28683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f28684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private wu.u1 f28685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wu.z f28687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wu.i0 f28688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.lifecycle.k0 f28689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.lifecycle.f0 f28690m;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28692b;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a2.this.new b(eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[Catch: all -> 0x001e, Exception -> 0x0021, TryCatch #1 {Exception -> 0x0021, blocks: (B:9:0x0019, B:47:0x00c4, B:18:0x0030, B:39:0x008f, B:41:0x0093, B:42:0x0099, B:19:0x0034, B:35:0x0079, B:20:0x0038, B:30:0x0062, B:32:0x006e, B:43:0x00ac, B:23:0x003f, B:25:0x004b, B:27:0x0057), top: B:55:0x000b, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0099 A[Catch: all -> 0x001e, Exception -> 0x0021, TryCatch #1 {Exception -> 0x0021, blocks: (B:9:0x0019, B:47:0x00c4, B:18:0x0030, B:39:0x008f, B:41:0x0093, B:42:0x0099, B:19:0x0034, B:35:0x0079, B:20:0x0038, B:30:0x0062, B:32:0x006e, B:43:0x00ac, B:23:0x003f, B:25:0x004b, B:27:0x0057), top: B:55:0x000b, outer: #0 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.a2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28694a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28696c;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yt.a.e(((n0) obj2).e(), ((n0) obj).e());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28696c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a2.this.new c(this.f28696c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28694a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a.AbstractC0322a abstractC0322aC = a2.this.f28678a.c();
            if (!(abstractC0322aC instanceof a.AbstractC0322a.b) && !(abstractC0322aC instanceof a.AbstractC0322a.C0323a)) {
                if (!(abstractC0322aC instanceof a.AbstractC0322a.c)) {
                    throw new ut.s();
                }
                boolean z10 = !this.f28696c;
                a.AbstractC0322a.c cVar = (a.AbstractC0322a.c) abstractC0322aC;
                String dotType = ((InAppNotificationsApiRepository.InAppMessageResponse) cVar.a()).getMeta().getDotType();
                String str = dotType != null ? dotType : "";
                List<InAppNotificationsApiRepository.InAppMessageData> objects = ((InAppNotificationsApiRepository.InAppMessageResponse) cVar.a()).getObjects();
                a2 a2Var = a2.this;
                ArrayList arrayList = new ArrayList(vt.v.z(objects, 10));
                Iterator<T> it = objects.iterator();
                while (it.hasNext()) {
                    arrayList.add(a2Var.s((InAppNotificationsApiRepository.InAppMessageData) it.next()));
                }
                return new m0(z10, str, vt.v.R0(arrayList, new a()));
            }
            return new m0(!this.f28696c, "", vt.v.o());
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(((n0) obj2).e(), ((n0) obj).e());
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f28697a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28699c;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28697a = obj;
            this.f28699c |= RtlSpacingHelper.UNDEFINED;
            return a2.this.u(this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28700a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28702c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28702c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a2.this.new f(this.f28702c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f28700a;
            if (i10 == 0) {
                ut.x.b(obj);
                a2 a2Var = a2.this;
                boolean z10 = this.f28702c;
                this.f28700a = 1;
                obj = a2Var.t(z10, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            a2.this.r((m0) obj);
            a2.this.f28686i = false;
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f28703a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28705c;

        g(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28703a = obj;
            this.f28705c |= RtlSpacingHelper.UNDEFINED;
            return a2.this.w(this);
        }
    }

    public a2(com.server.auditor.ssh.client.app.repo.a aVar, InAppNotificationsApiRepository inAppNotificationsApiRepository, og.m mVar, og.d dVar, com.server.auditor.ssh.client.utils.analytics.a aVar2, og.y yVar, com.server.auditor.ssh.client.app.a aVar3) {
        ju.t.f(aVar, "inAppNotificationsCacheRepository");
        ju.t.f(inAppNotificationsApiRepository, "inAppNotificationsApiRepository");
        ju.t.f(mVar, "inAppPredefinedNotificationsRepository");
        ju.t.f(dVar, "authorizedFeaturesRepository");
        ju.t.f(aVar2, "avoAnalytics");
        ju.t.f(yVar, "userProfileApiRepository");
        ju.t.f(aVar3, "termiusStorage");
        this.f28678a = aVar;
        this.f28679b = inAppNotificationsApiRepository;
        this.f28680c = mVar;
        this.f28681d = dVar;
        this.f28682e = aVar2;
        this.f28683f = yVar;
        this.f28684g = aVar3;
        wu.z zVarB = wu.s2.b(null, 1, null);
        this.f28687j = zVarB;
        this.f28688k = wu.j0.a(wu.x0.c().r0(zVarB));
        androidx.lifecycle.k0 k0Var = new androidx.lifecycle.k0();
        this.f28689l = k0Var;
        this.f28690m = androidx.lifecycle.h1.c(k0Var);
    }

    private final String o(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str.length() == 0 || (ju.t.b(str, "medium") && ju.t.b(str2, "critical"))) {
                str = str2;
            }
        }
        return str;
    }

    private final m0 p(m0 m0Var, m0 m0Var2) {
        return new m0(m0Var.c() || m0Var2.c(), o(m0Var.a(), m0Var2.a()), vt.v.J0(m0Var.b(), m0Var2.b()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void q(InAppNotificationsApiRepository.InAppMessageData inAppMessageData) {
        String action = inAppMessageData.getAction();
        switch (action.hashCode()) {
            case -1392163930:
                action.equals("termius-message://rooted");
                break;
            case 329662937:
                if (action.equals("termius-message://kex")) {
                    com.server.auditor.ssh.client.utils.analytics.a aVar = this.f28682e;
                    InAppNotificationsApiRepository.InAppMessageAttributes attributes = inAppMessageData.getAttributes();
                    aVar.O0(attributes != null ? attributes.getUsername() : null);
                    break;
                }
                break;
            case 646056505:
                if (action.equals("termius-message://migrate-to-new-crypto")) {
                    this.f28682e.d3();
                    break;
                }
                break;
            case 1300779131:
                if (action.equals("termius-message://ces-survey")) {
                    this.f28682e.A1();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(m0 m0Var) {
        this.f28689l.n(p(this.f28680c.a(), m0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0 s(InAppNotificationsApiRepository.InAppMessageData inAppMessageData) {
        l0 l0Var;
        int id2 = inAppMessageData.getId();
        boolean forceToDoAction = inAppMessageData.getForceToDoAction();
        boolean zIsDismissible = inAppMessageData.isDismissible();
        boolean zIsSeen = inAppMessageData.isSeen();
        String type = inAppMessageData.getType();
        String createdAt = inAppMessageData.getCreatedAt();
        String title = inAppMessageData.getTitle();
        String body = inAppMessageData.getBody();
        String buttonName = inAppMessageData.getButtonName();
        String action = inAppMessageData.getAction();
        InAppNotificationsApiRepository.InAppMessageAttributes attributes = inAppMessageData.getAttributes();
        if (attributes != null) {
            int id3 = attributes.getId();
            String username = attributes.getUsername();
            String userFullName = attributes.getUserFullName();
            if (userFullName == null) {
                userFullName = "";
            }
            l0Var = new l0(id3, username, userFullName);
        } else {
            l0Var = null;
        }
        return new n0(id2, forceToDoAction, zIsDismissible, zIsSeen, type, createdAt, title, body, buttonName, action, l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(boolean z10, zt.e eVar) {
        return wu.i.g(wu.x0.b(), new c(z10, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.navigation.a2.e
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.navigation.a2$e r0 = (com.server.auditor.ssh.client.navigation.a2.e) r0
            int r1 = r0.f28699c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28699c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.navigation.a2$e r0 = new com.server.auditor.ssh.client.navigation.a2$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28697a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f28699c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository r5 = r4.f28679b
            r0.f28699c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b r5 = (com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b) r5
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b.d
            if (r0 == 0) goto L96
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$d r5 = (com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b.d) r5
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$InAppMessageResponse r5 = r5.a()
            com.server.auditor.ssh.client.app.repo.a r0 = r4.f28678a
            r0.d(r5)
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$InAppMessageMeta r0 = r5.getMeta()
            java.lang.String r0 = r0.getDotType()
            if (r0 != 0) goto L5c
            java.lang.String r0 = ""
        L5c:
            java.util.List r5 = r5.getObjects()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = vt.v.z(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r5.next()
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$InAppMessageData r2 = (com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.InAppMessageData) r2
            r4.q(r2)
            com.server.auditor.ssh.client.navigation.n0 r2 = r4.s(r2)
            r1.add(r2)
            goto L6f
        L86:
            com.server.auditor.ssh.client.navigation.a2$d r5 = new com.server.auditor.ssh.client.navigation.a2$d
            r5.<init>()
            java.util.List r5 = vt.v.R0(r1, r5)
            com.server.auditor.ssh.client.navigation.m0 r1 = new com.server.auditor.ssh.client.navigation.m0
            r2 = 0
            r1.<init>(r2, r0, r5)
            return r1
        L96:
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b.C0320b
            r1 = 0
            if (r0 == 0) goto L9c
            return r1
        L9c:
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$c r0 = com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b.c.f21464a
            boolean r0 = ju.t.b(r5, r0)
            if (r0 == 0) goto La5
            return r1
        La5:
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b.a
            if (r0 == 0) goto Lb5
            y9.a r0 = y9.a.f86838a
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$a r5 = (com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b.a) r5
            java.lang.Exception r5 = r5.a()
            r0.i(r5)
            return r1
        Lb5:
            ut.s r5 = new ut.s
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.a2.u(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.navigation.a2.g
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.navigation.a2$g r0 = (com.server.auditor.ssh.client.navigation.a2.g) r0
            int r1 = r0.f28705c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28705c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.navigation.a2$g r0 = new com.server.auditor.ssh.client.navigation.a2$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28703a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f28705c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            og.y r5 = r4.f28683f
            r0.f28705c = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            og.y$b r5 = (og.y.b) r5
            boolean r0 = r5 instanceof og.y.b.d
            if (r0 == 0) goto L62
            og.d r0 = r4.f28681d
            og.y$b$d r5 = (og.y.b.d) r5
            com.server.auditor.ssh.client.synchronization.api.models.user.BulkAccountResponse r5 = r5.a()
            com.server.auditor.ssh.client.synchronization.api.models.user.AccountResponse r5 = r5.getAccount()
            if (r5 == 0) goto L5e
            com.server.auditor.ssh.client.synchronization.api.models.user.AuthorizedFeaturesResponse r5 = r5.getAuthorizedFeatures()
            if (r5 == 0) goto L5e
            java.lang.Boolean r5 = r5.getShowBell()
            goto L5f
        L5e:
            r5 = 0
        L5f:
            r0.d(r5)
        L62:
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.a2.w(zt.e):java.lang.Object");
    }

    public final void j() {
        wu.u1 u1Var = this.f28685h;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.f28685h = null;
        this.f28686i = false;
    }

    public final void k() {
        if (hg.a.f52933c.d()) {
            this.f28689l.p(new m0(false, "", vt.v.o()));
        }
    }

    public final void l(int i10) {
        this.f28678a.b(i10);
    }

    public final void m() {
        if (this.f28686i) {
            return;
        }
        this.f28686i = true;
        wu.u1 u1Var = this.f28685h;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.f28685h = wu.k.d(this.f28688k, null, null, new b(null), 3, null);
    }

    public final androidx.lifecycle.f0 n() {
        return this.f28690m;
    }

    public final void v(boolean z10) {
        if (this.f28686i) {
            return;
        }
        this.f28686i = true;
        wu.u1 u1Var = this.f28685h;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.f28685h = wu.k.d(this.f28688k, null, null, new f(z10, null), 3, null);
    }
}
