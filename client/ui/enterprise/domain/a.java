package com.server.auditor.ssh.client.ui.enterprise.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import il.m;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import kp.c;
import og.s;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f40188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f40189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f40190c;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.enterprise.domain.a$a, reason: collision with other inner class name */
    public interface InterfaceC0626a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.enterprise.domain.a$a$a, reason: collision with other inner class name */
        public static final class C0627a implements InterfaceC0626a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0627a f40191a = new C0627a();

            private C0627a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0627a);
            }

            public int hashCode() {
                return 2046138321;
            }

            public String toString() {
                return "AccessDenied";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.enterprise.domain.a$a$b */
        public static final class b implements InterfaceC0626a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f40192a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 37891874;
            }

            public String toString() {
                return "NotEnterprise";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.enterprise.domain.a$a$c */
        public static final class c implements InterfaceC0626a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f40193a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -67079262;
            }

            public String toString() {
                return "Passed";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.enterprise.domain.a$a$d */
        public static final class d implements InterfaceC0626a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f40194a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 160034930;
            }

            public String toString() {
                return "WaitingForAccess";
            }
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40195a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40197c;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40195a = obj;
            this.f40197c |= RtlSpacingHelper.UNDEFINED;
            return a.this.a(this);
        }
    }

    public a(m mVar, s sVar, c cVar) {
        t.f(mVar, "enterprisePlanInfoRepository");
        t.f(sVar, "promotionsRepository");
        t.f(cVar, "getTeamAccessStatusUseCase");
        this.f40188a = mVar;
        this.f40189b = sVar;
        this.f40190c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.ui.enterprise.domain.a.b
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.ui.enterprise.domain.a$b r0 = (com.server.auditor.ssh.client.ui.enterprise.domain.a.b) r0
            int r1 = r0.f40197c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40197c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.enterprise.domain.a$b r0 = new com.server.auditor.ssh.client.ui.enterprise.domain.a$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f40195a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40197c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L5c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            il.m r5 = r4.f40188a
            com.server.auditor.ssh.client.models.EnterprisePlanData r5 = r5.c()
            if (r5 == 0) goto L3e
            r5 = r3
            goto L3f
        L3e:
            r5 = 0
        L3f:
            og.s r2 = r4.f40189b
            boolean r2 = r2.c()
            if (r5 != 0) goto L4c
            if (r2 != 0) goto L4c
            com.server.auditor.ssh.client.ui.enterprise.domain.a$a$b r5 = com.server.auditor.ssh.client.ui.enterprise.domain.a.InterfaceC0626a.b.f40192a
            return r5
        L4c:
            if (r2 == 0) goto L51
            com.server.auditor.ssh.client.ui.enterprise.domain.a$a$a r5 = com.server.auditor.ssh.client.ui.enterprise.domain.a.InterfaceC0626a.C0627a.f40191a
            return r5
        L51:
            kp.c r5 = r4.f40190c
            r0.f40197c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            jp.a r5 = (jp.a) r5
            boolean r5 = jp.b.a(r5)
            if (r5 == 0) goto L67
            com.server.auditor.ssh.client.ui.enterprise.domain.a$a$d r5 = com.server.auditor.ssh.client.ui.enterprise.domain.a.InterfaceC0626a.d.f40194a
            return r5
        L67:
            com.server.auditor.ssh.client.ui.enterprise.domain.a$a$c r5 = com.server.auditor.ssh.client.ui.enterprise.domain.a.InterfaceC0626a.c.f40193a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.enterprise.domain.a.a(zt.e):java.lang.Object");
    }
}
