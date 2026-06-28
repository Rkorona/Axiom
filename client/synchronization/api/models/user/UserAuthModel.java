package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class UserAuthModel implements Parcelable {
    public static final int $stable = 0;
    private final String authyToken;
    private final DeviceModel deviceInfo;
    private final String email;
    private final String firebaseToken;
    private final String password;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UserAuthModel> CREATOR = new Creator();

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return UserAuthModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<UserAuthModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserAuthModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new UserAuthModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), DeviceModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserAuthModel[] newArray(int i10) {
            return new UserAuthModel[i10];
        }
    }

    public /* synthetic */ UserAuthModel(int i10, String str, String str2, String str3, String str4, DeviceModel deviceModel, s2 s2Var) {
        if (19 != (i10 & 19)) {
            d2.a(i10, 19, UserAuthModel$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
        this.password = str2;
        if ((i10 & 4) == 0) {
            this.authyToken = null;
        } else {
            this.authyToken = str3;
        }
        if ((i10 & 8) == 0) {
            this.firebaseToken = null;
        } else {
            this.firebaseToken = str4;
        }
        this.deviceInfo = deviceModel;
    }

    public static /* synthetic */ UserAuthModel copy$default(UserAuthModel userAuthModel, String str, String str2, String str3, String str4, DeviceModel deviceModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userAuthModel.email;
        }
        if ((i10 & 2) != 0) {
            str2 = userAuthModel.password;
        }
        if ((i10 & 4) != 0) {
            str3 = userAuthModel.authyToken;
        }
        if ((i10 & 8) != 0) {
            str4 = userAuthModel.firebaseToken;
        }
        if ((i10 & 16) != 0) {
            deviceModel = userAuthModel.deviceInfo;
        }
        DeviceModel deviceModel2 = deviceModel;
        String str5 = str3;
        return userAuthModel.copy(str, str2, str5, str4, deviceModel2);
    }

    @o("authy_token")
    public static /* synthetic */ void getAuthyToken$annotations() {
    }

    @o("device")
    public static /* synthetic */ void getDeviceInfo$annotations() {
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @o("firebase_token")
    public static /* synthetic */ void getFirebaseToken$annotations() {
    }

    @o("password")
    public static /* synthetic */ void getPassword$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UserAuthModel userAuthModel, d dVar, f fVar) {
        dVar.f(fVar, 0, userAuthModel.email);
        dVar.f(fVar, 1, userAuthModel.password);
        if (dVar.E(fVar, 2) || userAuthModel.authyToken != null) {
            dVar.v(fVar, 2, x2.f64817a, userAuthModel.authyToken);
        }
        if (dVar.E(fVar, 3) || userAuthModel.firebaseToken != null) {
            dVar.v(fVar, 3, x2.f64817a, userAuthModel.firebaseToken);
        }
        dVar.o(fVar, 4, DeviceModel$$serializer.INSTANCE, userAuthModel.deviceInfo);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.authyToken;
    }

    public final String component4() {
        return this.firebaseToken;
    }

    public final DeviceModel component5() {
        return this.deviceInfo;
    }

    public final UserAuthModel copy(String str, String str2, String str3, String str4, DeviceModel deviceModel) {
        t.f(str, "email");
        t.f(str2, "password");
        t.f(deviceModel, "deviceInfo");
        return new UserAuthModel(str, str2, str3, str4, deviceModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAuthModel)) {
            return false;
        }
        UserAuthModel userAuthModel = (UserAuthModel) obj;
        return t.b(this.email, userAuthModel.email) && t.b(this.password, userAuthModel.password) && t.b(this.authyToken, userAuthModel.authyToken) && t.b(this.firebaseToken, userAuthModel.firebaseToken) && t.b(this.deviceInfo, userAuthModel.deviceInfo);
    }

    public final String getAuthyToken() {
        return this.authyToken;
    }

    public final DeviceModel getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        int iHashCode = ((this.email.hashCode() * 31) + this.password.hashCode()) * 31;
        String str = this.authyToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firebaseToken;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.deviceInfo.hashCode();
    }

    public String toString() {
        return "UserAuthModel(email=" + this.email + ", password=" + this.password + ", authyToken=" + this.authyToken + ", firebaseToken=" + this.firebaseToken + ", deviceInfo=" + this.deviceInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.email);
        parcel.writeString(this.password);
        parcel.writeString(this.authyToken);
        parcel.writeString(this.firebaseToken);
        this.deviceInfo.writeToParcel(parcel, i10);
    }

    public UserAuthModel(String str, String str2, String str3, String str4, DeviceModel deviceModel) {
        t.f(str, "email");
        t.f(str2, "password");
        t.f(deviceModel, "deviceInfo");
        this.email = str;
        this.password = str2;
        this.authyToken = str3;
        this.firebaseToken = str4;
        this.deviceInfo = deviceModel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserAuthModel(String str, String str2, String str3, String str4, DeviceModel deviceModel, int i10, k kVar) {
        DeviceModel deviceModel2;
        String str5;
        str3 = (i10 & 4) != 0 ? null : str3;
        if ((i10 & 8) != 0) {
            deviceModel2 = deviceModel;
            str5 = null;
        } else {
            deviceModel2 = deviceModel;
            str5 = str4;
        }
        this(str, str2, str3, str5, deviceModel2);
    }
}
