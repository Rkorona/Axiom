package com.server.auditor.ssh.client.ui.sshid.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestSshIdUploadPasskeysUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SshIdUploadPasskeysApiRepository f41050a;

    @Keep
    public static abstract class UploadingResult {
        public static final int $stable = 0;

        public static final class a extends UploadingResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdSetupErrorDetails f41051a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SshIdSetupErrorDetails sshIdSetupErrorDetails) {
                super(null);
                t.f(sshIdSetupErrorDetails, "errorDetails");
                this.f41051a = sshIdSetupErrorDetails;
            }

            public final SshIdSetupErrorDetails a() {
                return this.f41051a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f41051a, ((a) obj).f41051a);
            }

            public int hashCode() {
                return this.f41051a.hashCode();
            }

            public String toString() {
                return "Failed(errorDetails=" + this.f41051a + ")";
            }
        }

        public static final class b extends UploadingResult {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41052b = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdResponse f41053a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SshIdResponse sshIdResponse) {
                super(null);
                t.f(sshIdResponse, "sshIdResponse");
                this.f41053a = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f41053a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && t.b(this.f41053a, ((b) obj).f41053a);
            }

            public int hashCode() {
                return this.f41053a.hashCode();
            }

            public String toString() {
                return "Success(sshIdResponse=" + this.f41053a + ")";
            }
        }

        public /* synthetic */ UploadingResult(k kVar) {
            this();
        }

        private UploadingResult() {
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41054a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41056c;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41054a = obj;
            this.f41056c |= RtlSpacingHelper.UNDEFINED;
            return RequestSshIdUploadPasskeysUseCase.this.a(null, null, this);
        }
    }

    public RequestSshIdUploadPasskeysUseCase(SshIdUploadPasskeysApiRepository sshIdUploadPasskeysApiRepository) {
        t.f(sshIdUploadPasskeysApiRepository, "sshIdUploadPasskeysApiRepository");
        this.f41050a = sshIdUploadPasskeysApiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload r5, rg.h r6, zt.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase.a
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$a r0 = (com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase.a) r0
            int r1 = r0.f41056c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41056c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$a r0 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41054a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41056c
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
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository r7 = r4.f41050a
            r0.f41056c = r3
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result) r7
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.d
            if (r5 == 0) goto L51
            com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$b r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$b
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$d r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.d) r7
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r6 = r7.a()
            r5.<init>(r6)
            return r5
        L51:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.b
            if (r5 == 0) goto L6a
            com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r6 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$b r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.b) r7
            int r0 = r7.b()
            java.lang.String r7 = r7.a()
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        L6a:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.e
            if (r5 == 0) goto L83
            com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$c r6 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$c
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$e r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.e) r7
            int r0 = r7.a()
            int r7 = r7.b()
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        L83:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.c
            r6 = 2
            r0 = 0
            if (r5 == 0) goto L9a
            com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r1 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$c r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.c) r7
            int r7 = r7.a()
            r1.<init>(r7, r0, r6, r0)
            r5.<init>(r1)
            return r5
        L9a:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.f
            if (r5 == 0) goto Lb3
            com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r6 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$f r7 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.Result.f) r7
            int r0 = r7.b()
            java.lang.String r7 = r7.a()
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        Lb3:
            com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a r5 = new com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase$UploadingResult$a
            com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a r1 = new com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails$a
            int r7 = r7.getCode()
            r1.<init>(r7, r0, r6, r0)
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdUploadPasskeysUseCase.a(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload, rg.h, zt.e):java.lang.Object");
    }
}
