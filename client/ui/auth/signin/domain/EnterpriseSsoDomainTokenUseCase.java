package com.server.auditor.ssh.client.ui.auth.signin.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.repositories.auth.l;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenResponse;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class EnterpriseSsoDomainTokenUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f39131a;

    @Keep
    public interface TokenResult {

        public static final class a implements TokenResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f39132a;

            public a(String str) {
                t.f(str, "error");
                this.f39132a = str;
            }

            public final String a() {
                return this.f39132a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f39132a, ((a) obj).f39132a);
            }

            public int hashCode() {
                return this.f39132a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f39132a + ")";
            }
        }

        public static final class b implements TokenResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f39133a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1791142160;
            }

            public String toString() {
                return "NetworkException";
            }
        }

        public static final class c implements TokenResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f39134a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -477455189;
            }

            public String toString() {
                return "NotMigratedError";
            }
        }

        public static final class d implements TokenResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SsoDomainTokenResponse f39135a;

            public d(SsoDomainTokenResponse ssoDomainTokenResponse) {
                t.f(ssoDomainTokenResponse, "response");
                this.f39135a = ssoDomainTokenResponse;
            }

            public final SsoDomainTokenResponse a() {
                return this.f39135a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f39135a, ((d) obj).f39135a);
            }

            public int hashCode() {
                return this.f39135a.hashCode();
            }

            public String toString() {
                return "Success(response=" + this.f39135a + ")";
            }
        }

        public static final class e implements TokenResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f39136a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1277224184;
            }

            public String toString() {
                return "UnexpectedError";
            }
        }

        public static final class f implements TokenResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f39137a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 30766943;
            }

            public String toString() {
                return "UserNotFoundError";
            }
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39138a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39140c;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39138a = obj;
            this.f39140c |= RtlSpacingHelper.UNDEFINED;
            return EnterpriseSsoDomainTokenUseCase.this.a(null, this);
        }
    }

    public EnterpriseSsoDomainTokenUseCase(l lVar) {
        t.f(lVar, "requestSsoDomainTokenRepository");
        this.f39131a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, zt.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase.a
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$a r0 = (com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase.a) r0
            int r1 = r0.f39140c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39140c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$a r0 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39138a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39140c
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
            com.server.auditor.ssh.client.repositories.auth.l r6 = r4.f39131a
            r0.f39140c = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.server.auditor.ssh.client.repositories.auth.l$b r6 = (com.server.auditor.ssh.client.repositories.auth.l.b) r6
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.l.b.e
            if (r5 == 0) goto L51
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$d r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$d
            com.server.auditor.ssh.client.repositories.auth.l$b$e r6 = (com.server.auditor.ssh.client.repositories.auth.l.b.e) r6
            com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenResponse r6 = r6.a()
            r5.<init>(r6)
            return r5
        L51:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.l.b.d
            if (r5 == 0) goto L58
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$c r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase.TokenResult.c.f39134a
            return r5
        L58:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.l.b.g
            if (r5 == 0) goto L5f
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$f r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase.TokenResult.f.f39137a
            return r5
        L5f:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.l.b.C0594b
            if (r5 == 0) goto L6f
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$a r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$a
            com.server.auditor.ssh.client.repositories.auth.l$b$b r6 = (com.server.auditor.ssh.client.repositories.auth.l.b.C0594b) r6
            java.lang.String r6 = r6.a()
            r5.<init>(r6)
            return r5
        L6f:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.l.b.c
            if (r5 == 0) goto L76
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$b r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase.TokenResult.b.f39133a
            return r5
        L76:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.l.b.f
            if (r5 == 0) goto L7d
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$e r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase.TokenResult.e.f39136a
            return r5
        L7d:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.l.b.a
            if (r5 == 0) goto L8f
            y9.a r5 = y9.a.f86838a
            com.server.auditor.ssh.client.repositories.auth.l$b$a r6 = (com.server.auditor.ssh.client.repositories.auth.l.b.a) r6
            java.lang.Exception r6 = r6.a()
            r5.i(r6)
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase$TokenResult$e r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase.TokenResult.e.f39136a
            return r5
        L8f:
            ut.s r5 = new ut.s
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase.a(java.lang.String, zt.e):java.lang.Object");
    }
}
