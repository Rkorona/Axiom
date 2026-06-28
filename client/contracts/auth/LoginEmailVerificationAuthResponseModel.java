package com.server.auditor.ssh.client.contracts.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.user.AuthResponseModel;
import ju.t;

/* JADX INFO: loaded from: classes2.dex */
public final class LoginEmailVerificationAuthResponseModel implements Parcelable {
    private final AuthResponseModel authResponseModel;
    public static final Parcelable.Creator<LoginEmailVerificationAuthResponseModel> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoginEmailVerificationAuthResponseModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new LoginEmailVerificationAuthResponseModel(AuthResponseModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LoginEmailVerificationAuthResponseModel[] newArray(int i10) {
            return new LoginEmailVerificationAuthResponseModel[i10];
        }
    }

    public LoginEmailVerificationAuthResponseModel(AuthResponseModel authResponseModel) {
        t.f(authResponseModel, "authResponseModel");
        this.authResponseModel = authResponseModel;
    }

    public static /* synthetic */ LoginEmailVerificationAuthResponseModel copy$default(LoginEmailVerificationAuthResponseModel loginEmailVerificationAuthResponseModel, AuthResponseModel authResponseModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            authResponseModel = loginEmailVerificationAuthResponseModel.authResponseModel;
        }
        return loginEmailVerificationAuthResponseModel.copy(authResponseModel);
    }

    public final AuthResponseModel component1() {
        return this.authResponseModel;
    }

    public final LoginEmailVerificationAuthResponseModel copy(AuthResponseModel authResponseModel) {
        t.f(authResponseModel, "authResponseModel");
        return new LoginEmailVerificationAuthResponseModel(authResponseModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginEmailVerificationAuthResponseModel) && t.b(this.authResponseModel, ((LoginEmailVerificationAuthResponseModel) obj).authResponseModel);
    }

    public final AuthResponseModel getAuthResponseModel() {
        return this.authResponseModel;
    }

    public int hashCode() {
        return this.authResponseModel.hashCode();
    }

    public String toString() {
        return "LoginEmailVerificationAuthResponseModel(authResponseModel=" + this.authResponseModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        this.authResponseModel.writeToParcel(parcel, i10);
    }
}
