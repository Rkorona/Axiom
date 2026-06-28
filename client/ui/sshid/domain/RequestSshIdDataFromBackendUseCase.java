package com.server.auditor.ssh.client.ui.sshid.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestSshIdDataFromBackendUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SshIdGetInfoApiRepository f41040a;

    @Keep
    public static abstract class ReceivedResult {
        public static final int $stable = 0;

        public static final class a extends ReceivedResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdSetupErrorDetails f41041a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SshIdSetupErrorDetails sshIdSetupErrorDetails) {
                super(null);
                t.f(sshIdSetupErrorDetails, "errorDetails");
                this.f41041a = sshIdSetupErrorDetails;
            }

            public final SshIdSetupErrorDetails a() {
                return this.f41041a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f41041a, ((a) obj).f41041a);
            }

            public int hashCode() {
                return this.f41041a.hashCode();
            }

            public String toString() {
                return "Failed(errorDetails=" + this.f41041a + ")";
            }
        }

        public static final class b extends ReceivedResult {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41042b = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdResponse f41043a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SshIdResponse sshIdResponse) {
                super(null);
                t.f(sshIdResponse, "sshIdResponse");
                this.f41043a = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f41043a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && t.b(this.f41043a, ((b) obj).f41043a);
            }

            public int hashCode() {
                return this.f41043a.hashCode();
            }

            public String toString() {
                return "Regenerate(sshIdResponse=" + this.f41043a + ")";
            }
        }

        public static final class c extends ReceivedResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f41044a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 667960657;
            }

            public String toString() {
                return "SshIdNotFound";
            }
        }

        public static final class d extends ReceivedResult {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41045b = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdResponse f41046a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SshIdResponse sshIdResponse) {
                super(null);
                t.f(sshIdResponse, "sshIdResponse");
                this.f41046a = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f41046a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f41046a, ((d) obj).f41046a);
            }

            public int hashCode() {
                return this.f41046a.hashCode();
            }

            public String toString() {
                return "Success(sshIdResponse=" + this.f41046a + ")";
            }
        }

        public /* synthetic */ ReceivedResult(k kVar) {
            this();
        }

        private ReceivedResult() {
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41047a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41049c;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41047a = obj;
            this.f41049c |= RtlSpacingHelper.UNDEFINED;
            return RequestSshIdDataFromBackendUseCase.this.a(null, this);
        }
    }

    public RequestSshIdDataFromBackendUseCase(SshIdGetInfoApiRepository sshIdGetInfoApiRepository) {
        t.f(sshIdGetInfoApiRepository, "sshIdGetInfoApiRepository");
        this.f41040a = sshIdGetInfoApiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(rg.h r5, zt.e r6) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdDataFromBackendUseCase.a(rg.h, zt.e):java.lang.Object");
    }
}
