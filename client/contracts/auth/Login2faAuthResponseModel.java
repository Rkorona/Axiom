package com.server.auditor.ssh.client.contracts.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.user.AuthResponseModel;
import ju.t;

/* JADX INFO: loaded from: classes2.dex */
public final class Login2faAuthResponseModel implements Parcelable {
    private final AuthResponseModel authResponseModel;
    public static final Parcelable.Creator<Login2faAuthResponseModel> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Login2faAuthResponseModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new Login2faAuthResponseModel(AuthResponseModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Login2faAuthResponseModel[] newArray(int i10) {
            return new Login2faAuthResponseModel[i10];
        }
    }

    public Login2faAuthResponseModel(AuthResponseModel authResponseModel) {
        t.f(authResponseModel, "authResponseModel");
        this.authResponseModel = authResponseModel;
    }

    public static /* synthetic */ Login2faAuthResponseModel copy$default(Login2faAuthResponseModel login2faAuthResponseModel, AuthResponseModel authResponseModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            authResponseModel = login2faAuthResponseModel.authResponseModel;
        }
        return login2faAuthResponseModel.copy(authResponseModel);
    }

    public final AuthResponseModel component1() {
        return this.authResponseModel;
    }

    public final Login2faAuthResponseModel copy(AuthResponseModel authResponseModel) {
        t.f(authResponseModel, "authResponseModel");
        return new Login2faAuthResponseModel(authResponseModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Login2faAuthResponseModel) && t.b(this.authResponseModel, ((Login2faAuthResponseModel) obj).authResponseModel);
    }

    public final AuthResponseModel getAuthResponseModel() {
        return this.authResponseModel;
    }

    public int hashCode() {
        return this.authResponseModel.hashCode();
    }

    public String toString() {
        return "Login2faAuthResponseModel(authResponseModel=" + this.authResponseModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        this.authResponseModel.writeToParcel(parcel, i10);
    }
}
