package com.server.auditor.ssh.client.ui.auth.signin.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.repositories.auth.m;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f39228a;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.signin.domain.a$a, reason: collision with other inner class name */
    public interface InterfaceC0603a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$a, reason: collision with other inner class name */
        public static final class C0604a implements InterfaceC0603a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f39229a;

            public C0604a(Exception exc) {
                t.f(exc, "e");
                this.f39229a = exc;
            }

            public final Exception a() {
                return this.f39229a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0604a) && t.b(this.f39229a, ((C0604a) obj).f39229a);
            }

            public int hashCode() {
                return this.f39229a.hashCode();
            }

            public String toString() {
                return "OnResetPasswordError(e=" + this.f39229a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$b */
        public static final class b implements InterfaceC0603a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f39230a;

            public b(String str) {
                t.f(str, "error");
                this.f39230a = str;
            }

            public final String a() {
                return this.f39230a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && t.b(this.f39230a, ((b) obj).f39230a);
            }

            public int hashCode() {
                return this.f39230a.hashCode();
            }

            public String toString() {
                return "OnResetPasswordFailed(error=" + this.f39230a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$c */
        public static final class c implements InterfaceC0603a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f39231a;

            public c(Exception exc) {
                t.f(exc, "e");
                this.f39231a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f39231a, ((c) obj).f39231a);
            }

            public int hashCode() {
                return this.f39231a.hashCode();
            }

            public String toString() {
                return "OnResetPasswordNetworkError(e=" + this.f39231a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$d */
        public static final class d implements InterfaceC0603a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f39232a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1240267516;
            }

            public String toString() {
                return "OnResetPasswordSuccess";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$e */
        public static final class e implements InterfaceC0603a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f39233a;

            public e(int i10) {
                this.f39233a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f39233a == ((e) obj).f39233a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f39233a);
            }

            public String toString() {
                return "OonResetPasswordThrottled(seconds=" + this.f39233a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$f */
        public static final class f implements InterfaceC0603a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f39234a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 133103366;
            }

            public String toString() {
                return "OonResetPasswordUnknownError";
            }
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39235a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39237c;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39235a = obj;
            this.f39237c |= RtlSpacingHelper.UNDEFINED;
            return a.this.a(null, this);
        }
    }

    public a(m mVar) {
        t.f(mVar, "resetPasswordApiRepository");
        this.f39228a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, zt.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.auth.signin.domain.a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.auth.signin.domain.a$b r0 = (com.server.auditor.ssh.client.ui.auth.signin.domain.a.b) r0
            int r1 = r0.f39237c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39237c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.auth.signin.domain.a$b r0 = new com.server.auditor.ssh.client.ui.auth.signin.domain.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39235a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39237c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ut.x.b(r6)
            com.server.auditor.ssh.client.repositories.auth.m r6 = r4.f39228a
            r0.f39237c = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.server.auditor.ssh.client.repositories.auth.m$a r6 = (com.server.auditor.ssh.client.repositories.auth.m.a) r6
            com.server.auditor.ssh.client.repositories.auth.m$a$d r5 = com.server.auditor.ssh.client.repositories.auth.m.a.d.f38697a
            boolean r5 = ju.t.b(r6, r5)
            if (r5 == 0) goto L4c
            com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$d r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.a.InterfaceC0603a.d.f39232a
            return r5
        L4c:
            com.server.auditor.ssh.client.repositories.auth.m$a$f r5 = com.server.auditor.ssh.client.repositories.auth.m.a.f.f38699a
            boolean r5 = ju.t.b(r6, r5)
            if (r5 == 0) goto L57
            com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$f r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.a.InterfaceC0603a.f.f39234a
            return r5
        L57:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.m.a.C0595a
            if (r5 == 0) goto L67
            com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$a r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$a
            com.server.auditor.ssh.client.repositories.auth.m$a$a r6 = (com.server.auditor.ssh.client.repositories.auth.m.a.C0595a) r6
            java.lang.Exception r6 = r6.a()
            r5.<init>(r6)
            return r5
        L67:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.m.a.b
            if (r5 == 0) goto L77
            com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$b r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$b
            com.server.auditor.ssh.client.repositories.auth.m$a$b r6 = (com.server.auditor.ssh.client.repositories.auth.m.a.b) r6
            java.lang.String r6 = r6.a()
            r5.<init>(r6)
            return r5
        L77:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.m.a.c
            if (r5 == 0) goto L87
            com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$c r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$c
            com.server.auditor.ssh.client.repositories.auth.m$a$c r6 = (com.server.auditor.ssh.client.repositories.auth.m.a.c) r6
            java.io.IOException r6 = r6.a()
            r5.<init>(r6)
            return r5
        L87:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.m.a.e
            if (r5 == 0) goto L97
            com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$e r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.a$a$e
            com.server.auditor.ssh.client.repositories.auth.m$a$e r6 = (com.server.auditor.ssh.client.repositories.auth.m.a.e) r6
            int r6 = r6.a()
            r5.<init>(r6)
            return r5
        L97:
            ut.s r5 = new ut.s
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signin.domain.a.a(java.lang.String, zt.e):java.lang.Object");
    }
}
