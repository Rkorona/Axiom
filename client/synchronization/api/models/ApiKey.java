package com.server.auditor.ssh.client.synchronization.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySet;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySet$$serializer;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ApiKey implements Parcelable {
    private String hmacSalt;
    private EncryptedPersonalKeySet personalKeySet;
    private String salt;
    private final String token;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ApiKey> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return ApiKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<ApiKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiKey createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ApiKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EncryptedPersonalKeySet.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiKey[] newArray(int i10) {
            return new ApiKey[i10];
        }
    }

    public ApiKey() {
        this((String) null, (String) null, (String) null, (String) null, (EncryptedPersonalKeySet) null, 31, (k) null);
    }

    public static /* synthetic */ ApiKey copy$default(ApiKey apiKey, String str, String str2, String str3, String str4, EncryptedPersonalKeySet encryptedPersonalKeySet, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apiKey.username;
        }
        if ((i10 & 2) != 0) {
            str2 = apiKey.token;
        }
        if ((i10 & 4) != 0) {
            str3 = apiKey.salt;
        }
        if ((i10 & 8) != 0) {
            str4 = apiKey.hmacSalt;
        }
        if ((i10 & 16) != 0) {
            encryptedPersonalKeySet = apiKey.personalKeySet;
        }
        EncryptedPersonalKeySet encryptedPersonalKeySet2 = encryptedPersonalKeySet;
        String str5 = str3;
        return apiKey.copy(str, str2, str5, str4, encryptedPersonalKeySet2);
    }

    @o("hmac_salt")
    public static /* synthetic */ void getHmacSalt$annotations() {
    }

    @o("personal_keyset")
    public static /* synthetic */ void getPersonalKeySet$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ApiKey apiKey, kv.d dVar, jv.f fVar) {
        if (dVar.E(fVar, 0) || apiKey.username != null) {
            dVar.v(fVar, 0, x2.f64817a, apiKey.username);
        }
        if (dVar.E(fVar, 1) || apiKey.token != null) {
            dVar.v(fVar, 1, x2.f64817a, apiKey.token);
        }
        if (dVar.E(fVar, 2) || apiKey.salt != null) {
            dVar.v(fVar, 2, x2.f64817a, apiKey.salt);
        }
        if (dVar.E(fVar, 3) || apiKey.hmacSalt != null) {
            dVar.v(fVar, 3, x2.f64817a, apiKey.hmacSalt);
        }
        if (!dVar.E(fVar, 4) && apiKey.personalKeySet == null) {
            return;
        }
        dVar.v(fVar, 4, EncryptedPersonalKeySet$$serializer.INSTANCE, apiKey.personalKeySet);
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

    public final EncryptedPersonalKeySet component5() {
        return this.personalKeySet;
    }

    public final ApiKey copy(String str, String str2, String str3, String str4, EncryptedPersonalKeySet encryptedPersonalKeySet) {
        return new ApiKey(str, str2, str3, str4, encryptedPersonalKeySet);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return t.b(this.username, apiKey.username) && t.b(this.token, apiKey.token) && t.b(this.salt, apiKey.salt) && t.b(this.hmacSalt, apiKey.hmacSalt) && t.b(this.personalKeySet, apiKey.personalKeySet);
    }

    public final String getHmacSalt() {
        return this.hmacSalt;
    }

    public final EncryptedPersonalKeySet getPersonalKeySet() {
        return this.personalKeySet;
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
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        EncryptedPersonalKeySet encryptedPersonalKeySet = this.personalKeySet;
        return iHashCode4 + (encryptedPersonalKeySet != null ? encryptedPersonalKeySet.hashCode() : 0);
    }

    public final void setHmacSalt(String str) {
        this.hmacSalt = str;
    }

    public final void setPersonalKeySet(EncryptedPersonalKeySet encryptedPersonalKeySet) {
        this.personalKeySet = encryptedPersonalKeySet;
    }

    public final void setSalt(String str) {
        this.salt = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        return "ApiKey(username=" + this.username + ", token=" + this.token + ", salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ", personalKeySet=" + this.personalKeySet + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.username);
        parcel.writeString(this.token);
        parcel.writeString(this.salt);
        parcel.writeString(this.hmacSalt);
        EncryptedPersonalKeySet encryptedPersonalKeySet = this.personalKeySet;
        if (encryptedPersonalKeySet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            encryptedPersonalKeySet.writeToParcel(parcel, i10);
        }
    }

    public /* synthetic */ ApiKey(int i10, String str, String str2, String str3, String str4, EncryptedPersonalKeySet encryptedPersonalKeySet, s2 s2Var) {
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
        if ((i10 & 16) == 0) {
            this.personalKeySet = null;
        } else {
            this.personalKeySet = encryptedPersonalKeySet;
        }
    }

    public ApiKey(String str, String str2, String str3, String str4, EncryptedPersonalKeySet encryptedPersonalKeySet) {
        this.username = str;
        this.token = str2;
        this.salt = str3;
        this.hmacSalt = str4;
        this.personalKeySet = encryptedPersonalKeySet;
    }

    public /* synthetic */ ApiKey(String str, String str2, String str3, String str4, EncryptedPersonalKeySet encryptedPersonalKeySet, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : encryptedPersonalKeySet);
    }
}
