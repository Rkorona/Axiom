package com.server.auditor.ssh.client.ui.auth.signin.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.repositories.auth.k;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlResponse;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class EnterpriseSsoDomainUrlUseCase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39141b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39142c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f39143a;

    @Keep
    public interface DomainResult {

        @Keep
        public static final class Error implements DomainResult {
            public static final int $stable = 8;
            private final Exception exception;

            public Error(Exception exc) {
                t.f(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = error.exception;
                }
                return error.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final Error copy(Exception exc) {
                t.f(exc, "exception");
                return new Error(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && t.b(this.exception, ((Error) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.exception + ")";
            }
        }

        @Keep
        public static final class Failed implements DomainResult {
            public static final int $stable = 0;
            private final String error;

            public Failed(String str) {
                t.f(str, "error");
                this.error = str;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = failed.error;
                }
                return failed.copy(str);
            }

            public final String component1() {
                return this.error;
            }

            public final Failed copy(String str) {
                t.f(str, "error");
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && t.b(this.error, ((Failed) obj).error);
            }

            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }
        }

        @Keep
        public static final class InvalidEmail implements DomainResult {
            public static final int $stable = 0;
            private final String error;

            public InvalidEmail(String str) {
                t.f(str, "error");
                this.error = str;
            }

            public static /* synthetic */ InvalidEmail copy$default(InvalidEmail invalidEmail, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidEmail.error;
                }
                return invalidEmail.copy(str);
            }

            public final String component1() {
                return this.error;
            }

            public final InvalidEmail copy(String str) {
                t.f(str, "error");
                return new InvalidEmail(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvalidEmail) && t.b(this.error, ((InvalidEmail) obj).error);
            }

            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "InvalidEmail(error=" + this.error + ")";
            }
        }

        @Keep
        public static final class NetworkException implements DomainResult {
            public static final int $stable = 0;
            public static final NetworkException INSTANCE = new NetworkException();

            private NetworkException() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NetworkException);
            }

            public int hashCode() {
                return 915419617;
            }

            public String toString() {
                return "NetworkException";
            }
        }

        @Keep
        public static final class Success implements DomainResult {
            public static final int $stable = 0;
            private final SsoDomainAuthUrlResponse result;

            public Success(SsoDomainAuthUrlResponse ssoDomainAuthUrlResponse) {
                t.f(ssoDomainAuthUrlResponse, "result");
                this.result = ssoDomainAuthUrlResponse;
            }

            public static /* synthetic */ Success copy$default(Success success, SsoDomainAuthUrlResponse ssoDomainAuthUrlResponse, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    ssoDomainAuthUrlResponse = success.result;
                }
                return success.copy(ssoDomainAuthUrlResponse);
            }

            public final SsoDomainAuthUrlResponse component1() {
                return this.result;
            }

            public final Success copy(SsoDomainAuthUrlResponse ssoDomainAuthUrlResponse) {
                t.f(ssoDomainAuthUrlResponse, "result");
                return new Success(ssoDomainAuthUrlResponse);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && t.b(this.result, ((Success) obj).result);
            }

            public final SsoDomainAuthUrlResponse getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.result + ")";
            }
        }

        @Keep
        public static final class ThrottledError implements DomainResult {
            public static final int $stable = 0;
            private final int seconds;

            public ThrottledError(int i10) {
                this.seconds = i10;
            }

            public static /* synthetic */ ThrottledError copy$default(ThrottledError throttledError, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = throttledError.seconds;
                }
                return throttledError.copy(i10);
            }

            public final int component1() {
                return this.seconds;
            }

            public final ThrottledError copy(int i10) {
                return new ThrottledError(i10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrottledError) && this.seconds == ((ThrottledError) obj).seconds;
            }

            public final int getSeconds() {
                return this.seconds;
            }

            public int hashCode() {
                return Integer.hashCode(this.seconds);
            }

            public String toString() {
                return "ThrottledError(seconds=" + this.seconds + ")";
            }
        }

        @Keep
        public static final class UnexpectedError implements DomainResult {
            public static final int $stable = 0;
            public static final UnexpectedError INSTANCE = new UnexpectedError();

            private UnexpectedError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UnexpectedError);
            }

            public int hashCode() {
                return 80000023;
            }

            public String toString() {
                return "UnexpectedError";
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39144a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39146c;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39144a = obj;
            this.f39146c |= RtlSpacingHelper.UNDEFINED;
            return EnterpriseSsoDomainUrlUseCase.this.a(null, this);
        }
    }

    public EnterpriseSsoDomainUrlUseCase(k kVar) {
        t.f(kVar, "requestDomainSsoAuthUrlRepository");
        this.f39143a = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, zt.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase.b
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$b r0 = (com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase.b) r0
            int r1 = r0.f39146c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39146c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$b r0 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39144a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39146c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ut.x.b(r6)
            com.server.auditor.ssh.client.repositories.auth.k r6 = r4.f39143a
            r0.f39146c = r3
            java.lang.String r2 = "/enterprise/sso/mobile/"
            java.lang.Object r6 = r6.b(r5, r2, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.server.auditor.ssh.client.repositories.auth.k$a r6 = (com.server.auditor.ssh.client.repositories.auth.k.a) r6
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.k.a.C0593a
            if (r5 == 0) goto L53
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$Error r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$Error
            com.server.auditor.ssh.client.repositories.auth.k$a$a r6 = (com.server.auditor.ssh.client.repositories.auth.k.a.C0593a) r6
            java.lang.Exception r6 = r6.a()
            r5.<init>(r6)
            return r5
        L53:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.k.a.b
            if (r5 == 0) goto L63
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$Failed r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$Failed
            com.server.auditor.ssh.client.repositories.auth.k$a$b r6 = (com.server.auditor.ssh.client.repositories.auth.k.a.b) r6
            java.lang.String r6 = r6.a()
            r5.<init>(r6)
            return r5
        L63:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.k.a.c
            if (r5 == 0) goto L73
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$InvalidEmail r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$InvalidEmail
            com.server.auditor.ssh.client.repositories.auth.k$a$c r6 = (com.server.auditor.ssh.client.repositories.auth.k.a.c) r6
            java.lang.String r6 = r6.a()
            r5.<init>(r6)
            return r5
        L73:
            com.server.auditor.ssh.client.repositories.auth.k$a$d r5 = com.server.auditor.ssh.client.repositories.auth.k.a.d.f38664a
            boolean r5 = ju.t.b(r6, r5)
            if (r5 == 0) goto L7e
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$NetworkException r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase.DomainResult.NetworkException.INSTANCE
            return r5
        L7e:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.k.a.e
            if (r5 == 0) goto L8e
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$Success r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$Success
            com.server.auditor.ssh.client.repositories.auth.k$a$e r6 = (com.server.auditor.ssh.client.repositories.auth.k.a.e) r6
            com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlResponse r6 = r6.a()
            r5.<init>(r6)
            return r5
        L8e:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.repositories.auth.k.a.f
            if (r5 == 0) goto L9e
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$ThrottledError r5 = new com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$ThrottledError
            com.server.auditor.ssh.client.repositories.auth.k$a$f r6 = (com.server.auditor.ssh.client.repositories.auth.k.a.f) r6
            int r6 = r6.a()
            r5.<init>(r6)
            return r5
        L9e:
            com.server.auditor.ssh.client.repositories.auth.k$a$g r5 = com.server.auditor.ssh.client.repositories.auth.k.a.g.f38667a
            boolean r5 = ju.t.b(r6, r5)
            if (r5 == 0) goto La9
            com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase$DomainResult$UnexpectedError r5 = com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase.DomainResult.UnexpectedError.INSTANCE
            return r5
        La9:
            ut.s r5 = new ut.s
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase.a(java.lang.String, zt.e):java.lang.Object");
    }
}
