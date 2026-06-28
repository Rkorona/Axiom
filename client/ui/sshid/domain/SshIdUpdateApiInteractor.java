package com.server.auditor.ssh.client.ui.sshid.domain;

import androidx.annotation.Keep;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.j0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdUpdateApiInteractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41093b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41094c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SshIdUpdatePropertiesApiRepository f41095a;

    @Keep
    public static abstract class SshIdUpdatingResult {
        public static final int $stable = 0;

        @Keep
        public static final class Failed extends SshIdUpdatingResult {
            public static final int $stable = 0;
            private final String errorMessage;
            private final int responseCode;

            public Failed(int i10, String str) {
                super(null);
                this.responseCode = i10;
                this.errorMessage = str;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = failed.responseCode;
                }
                if ((i11 & 2) != 0) {
                    str = failed.errorMessage;
                }
                return failed.copy(i10, str);
            }

            public final int component1() {
                return this.responseCode;
            }

            public final String component2() {
                return this.errorMessage;
            }

            public final Failed copy(int i10, String str) {
                return new Failed(i10, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failed)) {
                    return false;
                }
                Failed failed = (Failed) obj;
                return this.responseCode == failed.responseCode && t.b(this.errorMessage, failed.errorMessage);
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final int getResponseCode() {
                return this.responseCode;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.responseCode) * 31;
                String str = this.errorMessage;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Failed(responseCode=" + this.responseCode + ", errorMessage=" + this.errorMessage + ")";
            }
        }

        @Keep
        public static final class Success extends SshIdUpdatingResult {
            public static final int $stable = 8;
            private final int responseCode;
            private final SshIdResponse sshIdData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(int i10, SshIdResponse sshIdResponse) {
                super(null);
                t.f(sshIdResponse, "sshIdData");
                this.responseCode = i10;
                this.sshIdData = sshIdResponse;
            }

            public static /* synthetic */ Success copy$default(Success success, int i10, SshIdResponse sshIdResponse, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = success.responseCode;
                }
                if ((i11 & 2) != 0) {
                    sshIdResponse = success.sshIdData;
                }
                return success.copy(i10, sshIdResponse);
            }

            public final int component1() {
                return this.responseCode;
            }

            public final SshIdResponse component2() {
                return this.sshIdData;
            }

            public final Success copy(int i10, SshIdResponse sshIdResponse) {
                t.f(sshIdResponse, "sshIdData");
                return new Success(i10, sshIdResponse);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return this.responseCode == success.responseCode && t.b(this.sshIdData, success.sshIdData);
            }

            public final int getResponseCode() {
                return this.responseCode;
            }

            public final SshIdResponse getSshIdData() {
                return this.sshIdData;
            }

            public int hashCode() {
                return (Integer.hashCode(this.responseCode) * 31) + this.sshIdData.hashCode();
            }

            public String toString() {
                return "Success(responseCode=" + this.responseCode + ", sshIdData=" + this.sshIdData + ")";
            }
        }

        @Keep
        public static final class UnexpectedError extends SshIdUpdatingResult {
            public static final int $stable = 0;
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnexpectedError(String str) {
                super(null);
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ UnexpectedError copy$default(UnexpectedError unexpectedError, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unexpectedError.message;
                }
                return unexpectedError.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final UnexpectedError copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new UnexpectedError(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnexpectedError) && t.b(this.message, ((UnexpectedError) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "UnexpectedError(message=" + this.message + ")";
            }
        }

        public /* synthetic */ SshIdUpdatingResult(k kVar) {
            this();
        }

        private SshIdUpdatingResult() {
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41096a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshIdUpdatePropertiesPayload f41098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload, e eVar) {
            super(2, eVar);
            this.f41098c = sshIdUpdatePropertiesPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return SshIdUpdateApiInteractor.this.new b(this.f41098c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41096a;
            if (i10 == 0) {
                x.b(obj);
                SshIdUpdatePropertiesApiRepository sshIdUpdatePropertiesApiRepository = SshIdUpdateApiInteractor.this.f41095a;
                SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload = this.f41098c;
                this.f41096a = 1;
                obj = sshIdUpdatePropertiesApiRepository.g(sshIdUpdatePropertiesPayload, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            SshIdUpdatePropertiesApiRepository.Result result = (SshIdUpdatePropertiesApiRepository.Result) obj;
            if (result instanceof SshIdUpdatePropertiesApiRepository.Result.d) {
                SshIdUpdatePropertiesApiRepository.Result.d dVar = (SshIdUpdatePropertiesApiRepository.Result.d) result;
                return new SshIdUpdatingResult.Success(dVar.a(), dVar.b());
            }
            if (!(result instanceof SshIdUpdatePropertiesApiRepository.Result.b)) {
                return new SshIdUpdatingResult.UnexpectedError("Unexpected error during request");
            }
            SshIdUpdatePropertiesApiRepository.Result.b bVar = (SshIdUpdatePropertiesApiRepository.Result.b) result;
            return new SshIdUpdatingResult.Failed(bVar.b(), bVar.a());
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdUpdateApiInteractor(SshIdUpdatePropertiesApiRepository sshIdUpdatePropertiesApiRepository) {
        t.f(sshIdUpdatePropertiesApiRepository, "sshIdUpdatePropertiesApiRepository");
        this.f41095a = sshIdUpdatePropertiesApiRepository;
    }

    public final Object b(SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload, e eVar) {
        return j0.e(new b(sshIdUpdatePropertiesPayload, null), eVar);
    }
}
