package com.server.auditor.ssh.client.ui.sshid.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestToCompleteSshIdSetupUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SshIdUpdatePropertiesApiRepository f41057a;

    @Keep
    public static abstract class CompleteSetupResult {
        public static final int $stable = 0;

        public static final class a extends CompleteSetupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdSetupErrorDetails f41058a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SshIdSetupErrorDetails sshIdSetupErrorDetails) {
                super(null);
                t.f(sshIdSetupErrorDetails, "errorDetails");
                this.f41058a = sshIdSetupErrorDetails;
            }

            public final SshIdSetupErrorDetails a() {
                return this.f41058a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f41058a, ((a) obj).f41058a);
            }

            public int hashCode() {
                return this.f41058a.hashCode();
            }

            public String toString() {
                return "FailCompleted(errorDetails=" + this.f41058a + ")";
            }
        }

        public static final class b extends CompleteSetupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdResponse f41059a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SshIdResponse sshIdResponse) {
                super(null);
                t.f(sshIdResponse, "sshIdResponse");
                this.f41059a = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f41059a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && t.b(this.f41059a, ((b) obj).f41059a);
            }

            public int hashCode() {
                return this.f41059a.hashCode();
            }

            public String toString() {
                return "SuccessCompleted(sshIdResponse=" + this.f41059a + ")";
            }
        }

        public /* synthetic */ CompleteSetupResult(k kVar) {
            this();
        }

        private CompleteSetupResult() {
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41060a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41062c;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41060a = obj;
            this.f41062c |= RtlSpacingHelper.UNDEFINED;
            return RequestToCompleteSshIdSetupUseCase.this.a(null, this);
        }
    }

    public RequestToCompleteSshIdSetupUseCase(SshIdUpdatePropertiesApiRepository sshIdUpdatePropertiesApiRepository) {
        t.f(sshIdUpdatePropertiesApiRepository, "sshIdUpdatePropertiesApiRepository");
        this.f41057a = sshIdUpdatePropertiesApiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload r5, zt.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase.a
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$a r0 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase.a) r0
            int r1 = r0.f41062c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41062c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$a r0 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41060a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41062c
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
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository r6 = r4.f41057a
            r0.f41062c = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result r6 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result) r6
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.d
            if (r5 == 0) goto L51
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$b r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$b
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$d r6 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.d) r6
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r6 = r6.b()
            r5.<init>(r6)
            return r5
        L51:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.b
            if (r5 == 0) goto L6a
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r0 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$b r6 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.b) r6
            int r1 = r6.b()
            java.lang.String r6 = r6.a()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        L6a:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.f
            if (r5 == 0) goto L83
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r0 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$f r6 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.f) r6
            int r1 = r6.b()
            java.lang.String r6 = r6.a()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        L83:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.c
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L9a
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r2 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$c r6 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.c) r6
            int r6 = r6.a()
            r2.<init>(r6, r1, r0, r1)
            r5.<init>(r2)
            return r5
        L9a:
            boolean r5 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.e
            if (r5 == 0) goto Lb3
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$c r0 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$c
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$e r6 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.e) r6
            int r1 = r6.a()
            int r6 = r6.b()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        Lb3:
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase$CompleteSetupResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r2 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            int r6 = r6.getCode()
            r2.<init>(r6, r1, r0, r1)
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.domain.RequestToCompleteSshIdSetupUseCase.a(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload, zt.e):java.lang.Object");
    }
}
