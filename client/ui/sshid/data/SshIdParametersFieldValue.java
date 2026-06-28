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
public final class SshIdParametersFieldValue implements Parcelable {
    private final String parentGroupName;
    private final String valueFromCredentials;
    private final String valueFromInheritedCredentials;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<SshIdParametersFieldValue> CREATOR = new c();
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40860b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40859a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.SshIdParametersFieldValue", aVar, 3);
            i2Var.r("valueFromCredentials", false);
            i2Var.r("valueFromInheritedCredentials", false);
            i2Var.r("parentGroupName", false);
            descriptor = i2Var;
            f40860b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdParametersFieldValue deserialize(e eVar) {
            int i10;
            String str;
            String str2;
            String strB;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            String strB2 = null;
            if (cVarD.l()) {
                String strB3 = cVarD.B(fVar, 0);
                String str3 = (String) cVarD.v(fVar, 1, x2.f64817a, null);
                str = strB3;
                strB = cVarD.B(fVar, 2);
                str2 = str3;
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str4 = null;
                String strB4 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB2 = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        str4 = (String) cVarD.v(fVar, 1, x2.f64817a, str4);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        strB4 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                str = strB2;
                str2 = str4;
                strB = strB4;
            }
            cVarD.b(fVar);
            return new SshIdParametersFieldValue(i10, str, str2, strB, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdParametersFieldValue sshIdParametersFieldValue) {
            t.f(fVar, "encoder");
            t.f(sshIdParametersFieldValue, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshIdParametersFieldValue.write$Self$Termius_app_googleProductionRelease(sshIdParametersFieldValue, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, iv.a.u(x2Var), x2Var};
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
            return a.f40859a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdParametersFieldValue createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new SshIdParametersFieldValue(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SshIdParametersFieldValue[] newArray(int i10) {
            return new SshIdParametersFieldValue[i10];
        }
    }

    public /* synthetic */ SshIdParametersFieldValue(int i10, String str, String str2, String str3, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, a.f40859a.getDescriptor());
        }
        this.valueFromCredentials = str;
        this.valueFromInheritedCredentials = str2;
        this.parentGroupName = str3;
    }

    public static /* synthetic */ SshIdParametersFieldValue copy$default(SshIdParametersFieldValue sshIdParametersFieldValue, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sshIdParametersFieldValue.valueFromCredentials;
        }
        if ((i10 & 2) != 0) {
            str2 = sshIdParametersFieldValue.valueFromInheritedCredentials;
        }
        if ((i10 & 4) != 0) {
            str3 = sshIdParametersFieldValue.parentGroupName;
        }
        return sshIdParametersFieldValue.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdParametersFieldValue sshIdParametersFieldValue, d dVar, f fVar) {
        dVar.f(fVar, 0, sshIdParametersFieldValue.valueFromCredentials);
        dVar.v(fVar, 1, x2.f64817a, sshIdParametersFieldValue.valueFromInheritedCredentials);
        dVar.f(fVar, 2, sshIdParametersFieldValue.parentGroupName);
    }

    public final String component1() {
        return this.valueFromCredentials;
    }

    public final String component2() {
        return this.valueFromInheritedCredentials;
    }

    public final String component3() {
        return this.parentGroupName;
    }

    public final SshIdParametersFieldValue copy(String str, String str2, String str3) {
        t.f(str, "valueFromCredentials");
        t.f(str3, "parentGroupName");
        return new SshIdParametersFieldValue(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdParametersFieldValue)) {
            return false;
        }
        SshIdParametersFieldValue sshIdParametersFieldValue = (SshIdParametersFieldValue) obj;
        return t.b(this.valueFromCredentials, sshIdParametersFieldValue.valueFromCredentials) && t.b(this.valueFromInheritedCredentials, sshIdParametersFieldValue.valueFromInheritedCredentials) && t.b(this.parentGroupName, sshIdParametersFieldValue.parentGroupName);
    }

    public final String getParentGroupName() {
        return this.parentGroupName;
    }

    public final String getValueFromCredentials() {
        return this.valueFromCredentials;
    }

    public final String getValueFromInheritedCredentials() {
        return this.valueFromInheritedCredentials;
    }

    public int hashCode() {
        int iHashCode = this.valueFromCredentials.hashCode() * 31;
        String str = this.valueFromInheritedCredentials;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.parentGroupName.hashCode();
    }

    public String toString() {
        return "SshIdParametersFieldValue(valueFromCredentials=" + this.valueFromCredentials + ", valueFromInheritedCredentials=" + this.valueFromInheritedCredentials + ", parentGroupName=" + this.parentGroupName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.valueFromCredentials);
        parcel.writeString(this.valueFromInheritedCredentials);
        parcel.writeString(this.parentGroupName);
    }

    public SshIdParametersFieldValue(String str, String str2, String str3) {
        t.f(str, "valueFromCredentials");
        t.f(str3, "parentGroupName");
        this.valueFromCredentials = str;
        this.valueFromInheritedCredentials = str2;
        this.parentGroupName = str3;
    }
}
