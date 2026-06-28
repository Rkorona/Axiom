package com.server.auditor.ssh.client.ui.auth.signup.domain;

import androidx.annotation.Keep;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.repositories.auth.j;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.AuthyTokenErrorModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.MinimalVersionErrorModel;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.m;
import lg.c;
import og.k;
import og.o;
import og.u;
import qi.e;
import ut.m0;
import ut.w;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class LoginWithEncryptionKeysInteractorWithResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f39274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f39275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f39276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f39277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kl.a f39278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final og.a f39279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f39280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SyncServiceHelper f39281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f39282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final fj.a f39283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f39284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i0 f39285l;

    @Keep
    public interface Result {

        @Keep
        public static final class AppIsOutDated implements Result {
            public static final int $stable = 0;
            private final String message;

            public AppIsOutDated(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ AppIsOutDated copy$default(AppIsOutDated appIsOutDated, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = appIsOutDated.message;
                }
                return appIsOutDated.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final AppIsOutDated copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new AppIsOutDated(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AppIsOutDated) && t.b(this.message, ((AppIsOutDated) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "AppIsOutDated(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class AuthIsBlocked implements Result {
            public static final int $stable = 0;
            private final Integer seconds;

            public AuthIsBlocked(Integer num) {
                this.seconds = num;
            }

            public static /* synthetic */ AuthIsBlocked copy$default(AuthIsBlocked authIsBlocked, Integer num, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    num = authIsBlocked.seconds;
                }
                return authIsBlocked.copy(num);
            }

            public final Integer component1() {
                return this.seconds;
            }

            public final AuthIsBlocked copy(Integer num) {
                return new AuthIsBlocked(num);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AuthIsBlocked) && t.b(this.seconds, ((AuthIsBlocked) obj).seconds);
            }

            public final Integer getSeconds() {
                return this.seconds;
            }

            public int hashCode() {
                Integer num = this.seconds;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public String toString() {
                return "AuthIsBlocked(seconds=" + this.seconds + ")";
            }
        }

        @Keep
        public static final class CannotInitializeClientSession implements Result {
            public static final int $stable = 0;
            public static final CannotInitializeClientSession INSTANCE = new CannotInitializeClientSession();

            private CannotInitializeClientSession() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CannotInitializeClientSession);
            }

            public int hashCode() {
                return -1020945790;
            }

            public String toString() {
                return "CannotInitializeClientSession";
            }
        }

        @Keep
        public static final class ClientNotAgreeServerPublicData implements Result {
            public static final int $stable = 0;
            public static final ClientNotAgreeServerPublicData INSTANCE = new ClientNotAgreeServerPublicData();

            private ClientNotAgreeServerPublicData() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ClientNotAgreeServerPublicData);
            }

            public int hashCode() {
                return -1498180912;
            }

            public String toString() {
                return "ClientNotAgreeServerPublicData";
            }
        }

        @Keep
        public static final class KeyGenerationFail implements Result {
            public static final int $stable = 0;
            private final String message;

            public KeyGenerationFail(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ KeyGenerationFail copy$default(KeyGenerationFail keyGenerationFail, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = keyGenerationFail.message;
                }
                return keyGenerationFail.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final KeyGenerationFail copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new KeyGenerationFail(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof KeyGenerationFail) && t.b(this.message, ((KeyGenerationFail) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "KeyGenerationFail(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class LoginApprovalRequired implements Result {
            public static final int $stable = 0;
            private final String details;

            public LoginApprovalRequired(String str) {
                t.f(str, "details");
                this.details = str;
            }

            public static /* synthetic */ LoginApprovalRequired copy$default(LoginApprovalRequired loginApprovalRequired, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = loginApprovalRequired.details;
                }
                return loginApprovalRequired.copy(str);
            }

            public final String component1() {
                return this.details;
            }

            public final LoginApprovalRequired copy(String str) {
                t.f(str, "details");
                return new LoginApprovalRequired(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoginApprovalRequired) && t.b(this.details, ((LoginApprovalRequired) obj).details);
            }

            public final String getDetails() {
                return this.details;
            }

            public int hashCode() {
                return this.details.hashCode();
            }

            public String toString() {
                return "LoginApprovalRequired(details=" + this.details + ")";
            }
        }

        @Keep
        public static final class LoginError implements Result {
            public static final int $stable = 0;
            private final String details;

            public LoginError(String str) {
                t.f(str, "details");
                this.details = str;
            }

            public static /* synthetic */ LoginError copy$default(LoginError loginError, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = loginError.details;
                }
                return loginError.copy(str);
            }

            public final String component1() {
                return this.details;
            }

            public final LoginError copy(String str) {
                t.f(str, "details");
                return new LoginError(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoginError) && t.b(this.details, ((LoginError) obj).details);
            }

            public final String getDetails() {
                return this.details;
            }

            public int hashCode() {
                return this.details.hashCode();
            }

            public String toString() {
                return "LoginError(details=" + this.details + ")";
            }
        }

        @Keep
        public static final class LoginFailed implements Result {
            public static final int $stable = 0;
            public static final LoginFailed INSTANCE = new LoginFailed();

            private LoginFailed() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LoginFailed);
            }

            public int hashCode() {
                return -704108560;
            }

            public String toString() {
                return "LoginFailed";
            }
        }

        @Keep
        public static final class LoginMinimalVersionError implements Result {
            public static final int $stable = 8;
            private final MinimalVersionErrorModel error;

            public LoginMinimalVersionError(MinimalVersionErrorModel minimalVersionErrorModel) {
                t.f(minimalVersionErrorModel, "error");
                this.error = minimalVersionErrorModel;
            }

            public static /* synthetic */ LoginMinimalVersionError copy$default(LoginMinimalVersionError loginMinimalVersionError, MinimalVersionErrorModel minimalVersionErrorModel, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    minimalVersionErrorModel = loginMinimalVersionError.error;
                }
                return loginMinimalVersionError.copy(minimalVersionErrorModel);
            }

            public final MinimalVersionErrorModel component1() {
                return this.error;
            }

            public final LoginMinimalVersionError copy(MinimalVersionErrorModel minimalVersionErrorModel) {
                t.f(minimalVersionErrorModel, "error");
                return new LoginMinimalVersionError(minimalVersionErrorModel);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoginMinimalVersionError) && t.b(this.error, ((LoginMinimalVersionError) obj).error);
            }

            public final MinimalVersionErrorModel getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "LoginMinimalVersionError(error=" + this.error + ")";
            }
        }

        @Keep
        public static final class LoginNetworkError implements Result {
            public static final int $stable = 0;
            public static final LoginNetworkError INSTANCE = new LoginNetworkError();

            private LoginNetworkError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LoginNetworkError);
            }

            public int hashCode() {
                return -132483603;
            }

            public String toString() {
                return "LoginNetworkError";
            }
        }

        @Keep
        public static final class LoginOTPError implements Result {
            public static final int $stable = 8;
            private final AuthyTokenErrorModel error;

            public LoginOTPError(AuthyTokenErrorModel authyTokenErrorModel) {
                t.f(authyTokenErrorModel, "error");
                this.error = authyTokenErrorModel;
            }

            public static /* synthetic */ LoginOTPError copy$default(LoginOTPError loginOTPError, AuthyTokenErrorModel authyTokenErrorModel, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authyTokenErrorModel = loginOTPError.error;
                }
                return loginOTPError.copy(authyTokenErrorModel);
            }

            public final AuthyTokenErrorModel component1() {
                return this.error;
            }

            public final LoginOTPError copy(AuthyTokenErrorModel authyTokenErrorModel) {
                t.f(authyTokenErrorModel, "error");
                return new LoginOTPError(authyTokenErrorModel);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoginOTPError) && t.b(this.error, ((LoginOTPError) obj).error);
            }

            public final AuthyTokenErrorModel getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "LoginOTPError(error=" + this.error + ")";
            }
        }

        @Keep
        public static final class SignInInvalidCredentials implements Result {
            public static final int $stable = 0;
            private final String message;

            public SignInInvalidCredentials(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ SignInInvalidCredentials copy$default(SignInInvalidCredentials signInInvalidCredentials, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = signInInvalidCredentials.message;
                }
                return signInInvalidCredentials.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final SignInInvalidCredentials copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new SignInInvalidCredentials(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignInInvalidCredentials) && t.b(this.message, ((SignInInvalidCredentials) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "SignInInvalidCredentials(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class SignInUnexpectedError implements Result {
            public static final int $stable = 0;
            public static final SignInUnexpectedError INSTANCE = new SignInUnexpectedError();

            private SignInUnexpectedError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SignInUnexpectedError);
            }

            public int hashCode() {
                return 1115217535;
            }

            public String toString() {
                return "SignInUnexpectedError";
            }
        }

        @Keep
        public static final class TeamSSORequired implements Result {
            public static final int $stable = 0;
            public static final TeamSSORequired INSTANCE = new TeamSSORequired();

            private TeamSSORequired() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof TeamSSORequired);
            }

            public int hashCode() {
                return -577164773;
            }

            public String toString() {
                return "TeamSSORequired";
            }
        }

        @Keep
        public static final class UserScheduledToDelete implements Result {
            public static final int $stable = 0;
            private final String message;

            public UserScheduledToDelete(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ UserScheduledToDelete copy$default(UserScheduledToDelete userScheduledToDelete, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = userScheduledToDelete.message;
                }
                return userScheduledToDelete.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final UserScheduledToDelete copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new UserScheduledToDelete(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserScheduledToDelete) && t.b(this.message, ((UserScheduledToDelete) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "UserScheduledToDelete(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class UserSuccessfullySignedIn implements Result {
            public static final int $stable = 0;
            private final boolean isProModeActive;

            public UserSuccessfullySignedIn(boolean z10) {
                this.isProModeActive = z10;
            }

            public static /* synthetic */ UserSuccessfullySignedIn copy$default(UserSuccessfullySignedIn userSuccessfullySignedIn, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = userSuccessfullySignedIn.isProModeActive;
                }
                return userSuccessfullySignedIn.copy(z10);
            }

            public final boolean component1() {
                return this.isProModeActive;
            }

            public final UserSuccessfullySignedIn copy(boolean z10) {
                return new UserSuccessfullySignedIn(z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserSuccessfullySignedIn) && this.isProModeActive == ((UserSuccessfullySignedIn) obj).isProModeActive;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isProModeActive);
            }

            public final boolean isProModeActive() {
                return this.isProModeActive;
            }

            public String toString() {
                return "UserSuccessfullySignedIn(isProModeActive=" + this.isProModeActive + ")";
            }
        }
    }

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f39287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AuthenticationModel f39288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ byte[] f39289d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, AuthenticationModel authenticationModel, byte[] bArr, zt.e eVar2) {
            super(2, eVar2);
            this.f39287b = eVar;
            this.f39288c = authenticationModel;
            this.f39289d = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f39287b, this.f39288c, this.f39289d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39286a;
            if (i10 == 0) {
                x.b(obj);
                e eVar = this.f39287b;
                AuthenticationModel authenticationModel = this.f39288c;
                byte[] bArr = this.f39289d;
                this.f39286a = 1;
                if (eVar.C(authenticationModel, bArr, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zt.e f39290a;

        b(zt.e eVar) {
            this.f39290a = eVar;
        }

        @Override // qi.e.a
        public void Q0(boolean z10) {
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.UserSuccessfullySignedIn(z10)));
        }

        @Override // qi.e.a
        public void a(AuthyTokenErrorModel authyTokenErrorModel) {
            t.f(authyTokenErrorModel, "error");
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.LoginOTPError(authyTokenErrorModel)));
        }

        @Override // qi.e.a
        public void b(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.KeyGenerationFail(str)));
        }

        @Override // qi.e.a
        public void c() {
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.TeamSSORequired.INSTANCE));
        }

        @Override // qi.e.a
        public void d() {
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.ClientNotAgreeServerPublicData.INSTANCE));
        }

        @Override // qi.e.a
        public void e() {
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.LoginNetworkError.INSTANCE));
        }

        @Override // qi.e.a
        public void f(MinimalVersionErrorModel minimalVersionErrorModel) {
            t.f(minimalVersionErrorModel, "error");
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.LoginMinimalVersionError(minimalVersionErrorModel)));
        }

        @Override // qi.e.a
        public void h() {
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.LoginFailed.INSTANCE));
        }

        @Override // qi.e.a
        public void i(String str) {
            t.f(str, "details");
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.LoginApprovalRequired(str)));
        }

        @Override // qi.e.a
        public void j(Integer num) {
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.AuthIsBlocked(num)));
        }

        @Override // qi.e.a
        public void k(String str) {
            t.f(str, "details");
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.LoginError(str)));
        }

        @Override // qi.e.a
        public void l(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.UserScheduledToDelete(str)));
        }

        @Override // qi.e.a
        public void m(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.SignInInvalidCredentials(str)));
        }

        @Override // qi.e.a
        public void n() {
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.CannotInitializeClientSession.INSTANCE));
        }

        @Override // qi.e.a
        public void o(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.AppIsOutDated(str)));
        }

        @Override // qi.e.a
        public void p() {
            zt.e eVar = this.f39290a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.SignInUnexpectedError.INSTANCE));
        }
    }

    public LoginWithEncryptionKeysInteractorWithResult(c cVar, j jVar, u uVar, k kVar, kl.a aVar, og.a aVar2, o oVar, SyncServiceHelper syncServiceHelper, com.server.auditor.ssh.client.app.a aVar3, fj.a aVar4, com.server.auditor.ssh.client.utils.analytics.a aVar5, i0 i0Var) {
        t.f(cVar, "signInGrpcRepository");
        t.f(jVar, "loginApiRepository");
        t.f(uVar, "srpSessionRepo");
        t.f(kVar, "encryptionKeyCryptoSystemRepo");
        t.f(aVar, "deviceInfoRepository");
        t.f(aVar2, "appApiKeyRepository");
        t.f(oVar, "localDataClearRepository");
        t.f(syncServiceHelper, "syncServiceHelper");
        t.f(aVar3, "termiusStorage");
        t.f(aVar4, "clearSharedEntitiesOfExTeamMemberInteractor");
        t.f(aVar5, "analytics");
        t.f(i0Var, "presenterScope");
        this.f39274a = cVar;
        this.f39275b = jVar;
        this.f39276c = uVar;
        this.f39277d = kVar;
        this.f39278e = aVar;
        this.f39279f = aVar2;
        this.f39280g = oVar;
        this.f39281h = syncServiceHelper;
        this.f39282i = aVar3;
        this.f39283j = aVar4;
        this.f39284k = aVar5;
        this.f39285l = i0Var;
    }

    public final Object a(AuthenticationModel authenticationModel, byte[] bArr, zt.e eVar) throws Throwable {
        zt.k kVar = new zt.k(au.b.c(eVar));
        wu.j.b(null, new a(new e(this.f39274a, this.f39275b, this.f39276c, this.f39277d, this.f39278e, this.f39279f, this.f39280g, this.f39281h, this.f39282i, this.f39283j, this.f39284k, this.f39285l, new b(kVar)), authenticationModel, bArr, null), 1, null);
        Object objA = kVar.a();
        if (objA == au.b.f()) {
            h.c(eVar);
        }
        return objA;
    }
}
