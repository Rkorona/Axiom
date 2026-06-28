package com.server.auditor.ssh.client.synchronization.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ChangePasswordResponse implements Parcelable {
    private String hmacSalt;
    private String salt;
    private final String token;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChangePasswordResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return ChangePasswordResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<ChangePasswordResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangePasswordResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ChangePasswordResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangePasswordResponse[] newArray(int i10) {
            return new ChangePasswordResponse[i10];
        }
    }

    public ChangePasswordResponse() {
        this((String) null, (String) null, (String) null, (String) null, 15, (k) null);
    }

    public static /* synthetic */ ChangePasswordResponse copy$default(ChangePasswordResponse changePasswordResponse, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = changePasswordResponse.username;
        }
        if ((i10 & 2) != 0) {
            str2 = changePasswordResponse.token;
        }
        if ((i10 & 4) != 0) {
            str3 = changePasswordResponse.salt;
        }
        if ((i10 & 8) != 0) {
            str4 = changePasswordResponse.hmacSalt;
        }
        return changePasswordResponse.copy(str, str2, str3, str4);
    }

    @o("hmac_salt")
    public static /* synthetic */ void getHmacSalt$annotations() {
    }

    @o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    @o("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ChangePasswordResponse changePasswordResponse, kv.d dVar, jv.f fVar) {
        if (dVar.E(fVar, 0) || changePasswordResponse.username != null) {
            dVar.v(fVar, 0, x2.f64817a, changePasswordResponse.username);
        }
        if (dVar.E(fVar, 1) || changePasswordResponse.token != null) {
            dVar.v(fVar, 1, x2.f64817a, changePasswordResponse.token);
        }
        if (dVar.E(fVar, 2) || changePasswordResponse.salt != null) {
            dVar.v(fVar, 2, x2.f64817a, changePasswordResponse.salt);
        }
        if (!dVar.E(fVar, 3) && changePasswordResponse.hmacSalt == null) {
            return;
        }
        dVar.v(fVar, 3, x2.f64817a, changePasswordResponse.hmacSalt);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.token;
    }

    public final String component3() {
        return this.salt;
    }

    public final String component4() {
        return this.hmacSalt;
    }

    public final ChangePasswordResponse copy(String str, String str2, String str3, String str4) {
        return new ChangePasswordResponse(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordResponse)) {
            return false;
        }
        ChangePasswordResponse changePasswordResponse = (ChangePasswordResponse) obj;
        return t.b(this.username, changePasswordResponse.username) && t.b(this.token, changePasswordResponse.token) && t.b(this.salt, changePasswordResponse.salt) && t.b(this.hmacSalt, changePasswordResponse.hmacSalt);
    }

    public final String getHmacSalt() {
        return this.hmacSalt;
    }

    public final String getSalt() {
        return this.salt;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.salt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hmacSalt;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setHmacSalt(String str) {
        this.hmacSalt = str;
    }

    public final void setSalt(String str) {
        this.salt = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        return "ChangePasswordResponse(username=" + this.username + ", token=" + this.token + ", salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.username);
        parcel.writeString(this.token);
        parcel.writeString(this.salt);
        parcel.writeString(this.hmacSalt);
    }

    public /* synthetic */ ChangePasswordResponse(int i10, String str, String str2, String str3, String str4, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.username = null;
        } else {
            this.username = str;
        }
        if ((i10 & 2) == 0) {
            this.token = null;
        } else {
            this.token = str2;
        }
        if ((i10 & 4) == 0) {
            this.salt = null;
        } else {
            this.salt = str3;
        }
        if ((i10 & 8) == 0) {
            this.hmacSalt = null;
        } else {
            this.hmacSalt = str4;
        }
    }

    public ChangePasswordResponse(String str, String str2, String str3, String str4) {
        this.username = str;
        this.token = str2;
        this.salt = str3;
        this.hmacSalt = str4;
    }

    public /* synthetic */ ChangePasswordResponse(String str, String str2, String str3, String str4, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
