package com.server.auditor.ssh.client.ui.sshid.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public final class SshIdHostParameters implements Parcelable {
    private final String passkeyType;
    private final String password;
    private final String username;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<SshIdHostParameters> CREATOR = new c();
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40840b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40839a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.SshIdHostParameters", aVar, 3);
            i2Var.r("username", false);
            i2Var.r("password", false);
            i2Var.r("passkeyType", false);
            descriptor = i2Var;
            f40840b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdHostParameters deserialize(e eVar) {
            String strB;
            String strB2;
            String str;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                String strB3 = cVarD.B(fVar, 1);
                strB2 = cVarD.B(fVar, 2);
                str = strB3;
                i10 = 7;
            } else {
                strB = null;
                String strB4 = null;
                String strB5 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB5 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        strB4 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    }
                }
                strB2 = strB4;
                str = strB5;
                i10 = i11;
            }
            String str2 = strB;
            cVarD.b(fVar);
            return new SshIdHostParameters(i10, str2, str, strB2, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdHostParameters sshIdHostParameters) {
            t.f(fVar, "encoder");
            t.f(sshIdHostParameters, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshIdHostParameters.write$Self$Termius_app_googleProductionRelease(sshIdHostParameters, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var, x2Var};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f40839a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdHostParameters createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new SshIdHostParameters(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SshIdHostParameters[] newArray(int i10) {
            return new SshIdHostParameters[i10];
        }
    }

    public /* synthetic */ SshIdHostParameters(int i10, String str, String str2, String str3, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, a.f40839a.getDescriptor());
        }
        this.username = str;
        this.password = str2;
        this.passkeyType = str3;
    }

    public static /* synthetic */ SshIdHostParameters copy$default(SshIdHostParameters sshIdHostParameters, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sshIdHostParameters.username;
        }
        if ((i10 & 2) != 0) {
            str2 = sshIdHostParameters.password;
        }
        if ((i10 & 4) != 0) {
            str3 = sshIdHostParameters.passkeyType;
        }
        return sshIdHostParameters.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdHostParameters sshIdHostParameters, d dVar, f fVar) {
        dVar.f(fVar, 0, sshIdHostParameters.username);
        dVar.f(fVar, 1, sshIdHostParameters.password);
        dVar.f(fVar, 2, sshIdHostParameters.passkeyType);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.passkeyType;
    }

    public final SshIdHostParameters copy(String str, String str2, String str3) {
        t.f(str, "username");
        t.f(str2, "password");
        t.f(str3, "passkeyType");
        return new SshIdHostParameters(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdHostParameters)) {
            return false;
        }
        SshIdHostParameters sshIdHostParameters = (SshIdHostParameters) obj;
        return t.b(this.username, sshIdHostParameters.username) && t.b(this.password, sshIdHostParameters.password) && t.b(this.passkeyType, sshIdHostParameters.passkeyType);
    }

    public final String getPasskeyType() {
        return this.passkeyType;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.passkeyType.hashCode();
    }

    public String toString() {
        return "SshIdHostParameters(username=" + this.username + ", password=" + this.password + ", passkeyType=" + this.passkeyType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.username);
        parcel.writeString(this.password);
        parcel.writeString(this.passkeyType);
    }

    public SshIdHostParameters(String str, String str2, String str3) {
        t.f(str, "username");
        t.f(str2, "password");
        t.f(str3, "passkeyType");
        this.username = str;
        this.password = str2;
        this.passkeyType = str3;
    }
}
