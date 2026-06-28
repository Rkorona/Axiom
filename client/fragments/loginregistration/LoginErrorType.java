package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Parcel;
import android.os.Parcelable;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorType;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.MinimalVersionErrorModel;
import java.lang.annotation.Annotation;
import lv.s2;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public abstract class LoginErrorType implements Parcelable {
    public static final int $stable = 0;
    public static final a Companion = new a(null);
    private static final ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: th.s
        @Override // iu.a
        public final Object a() {
            return LoginErrorType._init_$_anonymous_();
        }
    });

    public static final class AppIsOutDated extends LoginErrorType {
        private final String message;
        public static final Parcelable.Creator<AppIsOutDated> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppIsOutDated createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new AppIsOutDated(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppIsOutDated[] newArray(int i10) {
                return new AppIsOutDated[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppIsOutDated(String str) {
            super(null);
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
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
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            return new AppIsOutDated(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppIsOutDated) && ju.t.b(this.message, ((AppIsOutDated) obj).message);
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.message);
        }
    }

    public static final class AuthIsBlocked extends LoginErrorType {
        private final Integer seconds;
        public static final Parcelable.Creator<AuthIsBlocked> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AuthIsBlocked createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new AuthIsBlocked(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AuthIsBlocked[] newArray(int i10) {
                return new AuthIsBlocked[i10];
            }
        }

        public AuthIsBlocked(Integer num) {
            super(null);
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthIsBlocked) && ju.t.b(this.seconds, ((AuthIsBlocked) obj).seconds);
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            Integer num = this.seconds;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
        }
    }

    public static final class CannotInitializeClientSession extends LoginErrorType {
        public static final CannotInitializeClientSession INSTANCE = new CannotInitializeClientSession();
        public static final Parcelable.Creator<CannotInitializeClientSession> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CannotInitializeClientSession createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return CannotInitializeClientSession.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CannotInitializeClientSession[] newArray(int i10) {
                return new CannotInitializeClientSession[i10];
            }
        }

        private CannotInitializeClientSession() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CannotInitializeClientSession);
        }

        public int hashCode() {
            return -1569792727;
        }

        public String toString() {
            return "CannotInitializeClientSession";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class ClientNotAgreeServerPublicData extends LoginErrorType {
        public static final ClientNotAgreeServerPublicData INSTANCE = new ClientNotAgreeServerPublicData();
        public static final Parcelable.Creator<ClientNotAgreeServerPublicData> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ClientNotAgreeServerPublicData createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return ClientNotAgreeServerPublicData.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ClientNotAgreeServerPublicData[] newArray(int i10) {
                return new ClientNotAgreeServerPublicData[i10];
            }
        }

        private ClientNotAgreeServerPublicData() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClientNotAgreeServerPublicData);
        }

        public int hashCode() {
            return -1332566775;
        }

        public String toString() {
            return "ClientNotAgreeServerPublicData";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class KeyGenerationFail extends LoginErrorType {
        private final String message;
        public static final Parcelable.Creator<KeyGenerationFail> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KeyGenerationFail createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new KeyGenerationFail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final KeyGenerationFail[] newArray(int i10) {
                return new KeyGenerationFail[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyGenerationFail(String str) {
            super(null);
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
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
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            return new KeyGenerationFail(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KeyGenerationFail) && ju.t.b(this.message, ((KeyGenerationFail) obj).message);
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.message);
        }
    }

    public static final class LoginError extends LoginErrorType {
        private final String message;
        public static final Parcelable.Creator<LoginError> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoginError createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new LoginError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LoginError[] newArray(int i10) {
                return new LoginError[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginError(String str) {
            super(null);
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            this.message = str;
        }

        public static /* synthetic */ LoginError copy$default(LoginError loginError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = loginError.message;
            }
            return loginError.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final LoginError copy(String str) {
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            return new LoginError(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoginError) && ju.t.b(this.message, ((LoginError) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "LoginError(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.message);
        }
    }

    public static final class LoginFailed extends LoginErrorType {
        public static final LoginFailed INSTANCE = new LoginFailed();
        public static final Parcelable.Creator<LoginFailed> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoginFailed createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return LoginFailed.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LoginFailed[] newArray(int i10) {
                return new LoginFailed[i10];
            }
        }

        private LoginFailed() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LoginFailed);
        }

        public int hashCode() {
            return 1216583255;
        }

        public String toString() {
            return "LoginFailed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class LoginMinimalVersionError extends LoginErrorType {
        private final MinimalVersionErrorModel error;
        public static final Parcelable.Creator<LoginMinimalVersionError> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoginMinimalVersionError createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new LoginMinimalVersionError(MinimalVersionErrorModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LoginMinimalVersionError[] newArray(int i10) {
                return new LoginMinimalVersionError[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginMinimalVersionError(MinimalVersionErrorModel minimalVersionErrorModel) {
            super(null);
            ju.t.f(minimalVersionErrorModel, "error");
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
            ju.t.f(minimalVersionErrorModel, "error");
            return new LoginMinimalVersionError(minimalVersionErrorModel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoginMinimalVersionError) && ju.t.b(this.error, ((LoginMinimalVersionError) obj).error);
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            this.error.writeToParcel(parcel, i10);
        }
    }

    public static final class NetworkError extends LoginErrorType {
        public static final NetworkError INSTANCE = new NetworkError();
        public static final Parcelable.Creator<NetworkError> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NetworkError createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return NetworkError.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NetworkError[] newArray(int i10) {
                return new NetworkError[i10];
            }
        }

        private NetworkError() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkError);
        }

        public int hashCode() {
            return 409453897;
        }

        public String toString() {
            return "NetworkError";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class SignInInvalidCredentials extends LoginErrorType {
        private final String message;
        public static final Parcelable.Creator<SignInInvalidCredentials> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignInInvalidCredentials createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new SignInInvalidCredentials(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SignInInvalidCredentials[] newArray(int i10) {
                return new SignInInvalidCredentials[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignInInvalidCredentials(String str) {
            super(null);
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
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
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            return new SignInInvalidCredentials(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignInInvalidCredentials) && ju.t.b(this.message, ((SignInInvalidCredentials) obj).message);
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.message);
        }
    }

    public static final class SignInUnexpectedError extends LoginErrorType {
        public static final SignInUnexpectedError INSTANCE = new SignInUnexpectedError();
        public static final Parcelable.Creator<SignInUnexpectedError> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignInUnexpectedError createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return SignInUnexpectedError.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SignInUnexpectedError[] newArray(int i10) {
                return new SignInUnexpectedError[i10];
            }
        }

        private SignInUnexpectedError() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SignInUnexpectedError);
        }

        public int hashCode() {
            return 1141291046;
        }

        public String toString() {
            return "SignInUnexpectedError";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class TeamSSORequired extends LoginErrorType {
        public static final TeamSSORequired INSTANCE = new TeamSSORequired();
        public static final Parcelable.Creator<TeamSSORequired> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TeamSSORequired createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return TeamSSORequired.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TeamSSORequired[] newArray(int i10) {
                return new TeamSSORequired[i10];
            }
        }

        private TeamSSORequired() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TeamSSORequired);
        }

        public int hashCode() {
            return -1369895678;
        }

        public String toString() {
            return "TeamSSORequired";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class UserScheduledToDelete extends LoginErrorType {
        private final String message;
        public static final Parcelable.Creator<UserScheduledToDelete> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserScheduledToDelete createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new UserScheduledToDelete(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UserScheduledToDelete[] newArray(int i10) {
                return new UserScheduledToDelete[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserScheduledToDelete(String str) {
            super(null);
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
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
            ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            return new UserScheduledToDelete(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserScheduledToDelete) && ju.t.b(this.message, ((UserScheduledToDelete) obj).message);
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeString(this.message);
        }
    }

    public static final class a {
        private a() {
        }

        private final /* synthetic */ hv.c a() {
            return (hv.c) LoginErrorType.$cachedSerializer$delegate.getValue();
        }

        public final hv.c serializer() {
            return a();
        }

        public /* synthetic */ a(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ LoginErrorType(ju.k kVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _init_$_anonymous_() {
        return new hv.m("com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorType", ju.n0.b(LoginErrorType.class), new qu.b[0], new hv.c[0], new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(LoginErrorType loginErrorType, kv.d dVar, jv.f fVar) {
    }

    private LoginErrorType() {
    }

    public /* synthetic */ LoginErrorType(int i10, s2 s2Var) {
    }
}
