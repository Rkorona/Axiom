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
public final class RequestToUpdateSshIdCaUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SshIdUpdatePropertiesApiRepository f41070a;

    @Keep
    public static abstract class UpdateCaResult {
        public static final int $stable = 0;

        public static final class a extends UpdateCaResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdSetupErrorDetails f41071a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SshIdSetupErrorDetails sshIdSetupErrorDetails) {
                super(null);
                t.f(sshIdSetupErrorDetails, "errorDetails");
                this.f41071a = sshIdSetupErrorDetails;
            }

            public final SshIdSetupErrorDetails a() {
                return this.f41071a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f41071a, ((a) obj).f41071a);
            }

            public int hashCode() {
                return this.f41071a.hashCode();
            }

            public String toString() {
                return "FailedUpdatingResult(errorDetails=" + this.f41071a + ")";
            }
        }

        public static final class b extends UpdateCaResult {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41072b = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdResponse f41073a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SshIdResponse sshIdResponse) {
                super(null);
                t.f(sshIdResponse, "sshIdResponse");
                this.f41073a = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f41073a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && t.b(this.f41073a, ((b) obj).f41073a);
            }

            public int hashCode() {
                return this.f41073a.hashCode();
            }

            public String toString() {
                return "SuccessUpdatingResult(sshIdResponse=" + this.f41073a + ")";
            }
        }

        public /* synthetic */ UpdateCaResult(k kVar) {
            this();
        }

        private UpdateCaResult() {
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41074a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41076c;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41074a = obj;
            this.f41076c |= RtlSpacingHelper.UNDEFINED;
            return RequestToUpdateSshIdCaUseCase.this.a(null, null, this);
        }
    }

    public RequestToUpdateSshIdCaUseCase(SshIdUpdatePropertiesApiRepository sshIdUpdatePropertiesApiRepository) {
        t.f(sshIdUpdatePropertiesApiRepository, "sshIdUpdatePropertiesApiRepository");
        this.f41070a = sshIdUpdatePropertiesApiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdateCaPayload r5, rg.h r6, zt.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase.a
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$a r0 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase.a) r0
            int r1 = r0.f41076c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41076c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$a r0 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41074a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41076c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ut.x.b(r7)
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository r7 = r4.f41070a
            r0.f41076c = r3
            java.lang.Object r7 = r7.f(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result) r7
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.d
            if (r5 == 0) goto L51
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$b r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$b
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$d r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.d) r7
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r6 = r7.b()
            r5.<init>(r6)
            return r5
        L51:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.b
            if (r5 == 0) goto L6a
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r6 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$b r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.b) r7
            int r0 = r7.b()
            java.lang.String r7 = r7.a()
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        L6a:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.f
            if (r5 == 0) goto L83
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r6 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$f r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.f) r7
            int r0 = r7.b()
            java.lang.String r7 = r7.a()
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        L83:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.c
            r6 = 2
            r0 = 0
            if (r5 == 0) goto L9a
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r1 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$c r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.c) r7
            int r7 = r7.a()
            r1.<init>(r7, r0, r6, r0)
            r5.<init>(r1)
            return r5
        L9a:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.e
            if (r5 == 0) goto Lb3
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$c r6 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$c
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$e r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.Result.e) r7
            int r0 = r7.a()
            int r7 = r7.b()
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        Lb3:
            com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase$UpdateCaResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r1 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            int r7 = r7.getCode()
            r1.<init>(r7, r0, r6, r0)
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.domain.RequestToUpdateSshIdCaUseCase.a(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdateCaPayload, rg.h, zt.e):java.lang.Object");
    }
}
