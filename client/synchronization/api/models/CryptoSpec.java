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
public final class CryptoSpec implements Parcelable {
    private String hmacSalt;
    private String salt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CryptoSpec> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return CryptoSpec$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<CryptoSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoSpec createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new CryptoSpec(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoSpec[] newArray(int i10) {
            return new CryptoSpec[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoSpec() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CryptoSpec copy$default(CryptoSpec cryptoSpec, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cryptoSpec.salt;
        }
        if ((i10 & 2) != 0) {
            str2 = cryptoSpec.hmacSalt;
        }
        return cryptoSpec.copy(str, str2);
    }

    @o("hmac_salt")
    public static /* synthetic */ void getHmacSalt$annotations() {
    }

    @o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CryptoSpec cryptoSpec, kv.d dVar, jv.f fVar) {
        if (dVar.E(fVar, 0) || cryptoSpec.salt != null) {
            dVar.v(fVar, 0, x2.f64817a, cryptoSpec.salt);
        }
        if (!dVar.E(fVar, 1) && cryptoSpec.hmacSalt == null) {
            return;
        }
        dVar.v(fVar, 1, x2.f64817a, cryptoSpec.hmacSalt);
    }

    public final String component1() {
        return this.salt;
    }

    public final String component2() {
        return this.hmacSalt;
    }

    public final CryptoSpec copy(String str, String str2) {
        return new CryptoSpec(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoSpec)) {
            return false;
        }
        CryptoSpec cryptoSpec = (CryptoSpec) obj;
        return t.b(this.salt, cryptoSpec.salt) && t.b(this.hmacSalt, cryptoSpec.hmacSalt);
    }

    public final String getHmacSalt() {
        return this.hmacSalt;
    }

    public final String getSalt() {
        return this.salt;
    }

    public int hashCode() {
        String str = this.salt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hmacSalt;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setHmacSalt(String str) {
        this.hmacSalt = str;
    }

    public final void setSalt(String str) {
        this.salt = str;
    }

    public String toString() {
        return "CryptoSpec(salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.salt);
        parcel.writeString(this.hmacSalt);
    }

    public /* synthetic */ CryptoSpec(int i10, String str, String str2, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.salt = null;
        } else {
            this.salt = str;
        }
        if ((i10 & 2) == 0) {
            this.hmacSalt = null;
        } else {
            this.hmacSalt = str2;
        }
    }

    public CryptoSpec(String str, String str2) {
        this.salt = str;
        this.hmacSalt = str2;
    }

    public /* synthetic */ CryptoSpec(String str, String str2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
