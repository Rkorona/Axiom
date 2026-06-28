package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import io.split.android.client.dtos.SerializableEvent;
import lv.n0;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
@Keep
public final class NsdSearchResult implements Parcelable {
    private final String address;
    private final String alias;
    private final Integer port;
    private final String type;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<NsdSearchResult> CREATOR = new c();
    public static final int $stable = 8;

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30827b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f30826a = aVar;
            lv.i2 i2Var = new lv.i2("com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResult", aVar, 4);
            i2Var.r(Column.TYPE, false);
            i2Var.r("alias", false);
            i2Var.r(Column.ADDRESS, false);
            i2Var.r(Column.PORT, false);
            descriptor = i2Var;
            f30827b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NsdSearchResult deserialize(kv.e eVar) {
            int i10;
            String str;
            String str2;
            String str3;
            Integer num;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            String str4 = null;
            if (cVarD.l()) {
                lv.x2 x2Var = lv.x2.f64817a;
                String str5 = (String) cVarD.v(fVar, 0, x2Var, null);
                String str6 = (String) cVarD.v(fVar, 1, x2Var, null);
                str3 = (String) cVarD.v(fVar, 2, x2Var, null);
                num = (Integer) cVarD.v(fVar, 3, lv.w0.f64808a, null);
                i10 = 15;
                str2 = str6;
                str = str5;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str7 = null;
                String str8 = null;
                Integer num2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        str4 = (String) cVarD.v(fVar, 0, lv.x2.f64817a, str4);
                        i11 |= 1;
                    } else if (iD == 1) {
                        str7 = (String) cVarD.v(fVar, 1, lv.x2.f64817a, str7);
                        i11 |= 2;
                    } else if (iD == 2) {
                        str8 = (String) cVarD.v(fVar, 2, lv.x2.f64817a, str8);
                        i11 |= 4;
                    } else {
                        if (iD != 3) {
                            throw new hv.e0(iD);
                        }
                        num2 = (Integer) cVarD.v(fVar, 3, lv.w0.f64808a, num2);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                str = str4;
                str2 = str7;
                str3 = str8;
                num = num2;
            }
            cVarD.b(fVar);
            return new NsdSearchResult(i10, str, str2, str3, num, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, NsdSearchResult nsdSearchResult) {
            ju.t.f(fVar, "encoder");
            ju.t.f(nsdSearchResult, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            NsdSearchResult.write$Self$Termius_app_googleProductionRelease(nsdSearchResult, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            lv.x2 x2Var = lv.x2.f64817a;
            return new hv.c[]{iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(x2Var), iv.a.u(lv.w0.f64808a)};
        }

        @Override // hv.c, hv.r, hv.b
        public final jv.f getDescriptor() {
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
            return a.f30826a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NsdSearchResult createFromParcel(Parcel parcel) {
            ju.t.f(parcel, "parcel");
            return new NsdSearchResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NsdSearchResult[] newArray(int i10) {
            return new NsdSearchResult[i10];
        }
    }

    public /* synthetic */ NsdSearchResult(int i10, String str, String str2, String str3, Integer num, lv.s2 s2Var) {
        if (15 != (i10 & 15)) {
            lv.d2.a(i10, 15, a.f30826a.getDescriptor());
        }
        this.type = str;
        this.alias = str2;
        this.address = str3;
        this.port = num;
    }

    public static /* synthetic */ NsdSearchResult copy$default(NsdSearchResult nsdSearchResult, String str, String str2, String str3, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nsdSearchResult.type;
        }
        if ((i10 & 2) != 0) {
            str2 = nsdSearchResult.alias;
        }
        if ((i10 & 4) != 0) {
            str3 = nsdSearchResult.address;
        }
        if ((i10 & 8) != 0) {
            num = nsdSearchResult.port;
        }
        return nsdSearchResult.copy(str, str2, str3, num);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(NsdSearchResult nsdSearchResult, kv.d dVar, jv.f fVar) {
        lv.x2 x2Var = lv.x2.f64817a;
        dVar.v(fVar, 0, x2Var, nsdSearchResult.type);
        dVar.v(fVar, 1, x2Var, nsdSearchResult.alias);
        dVar.v(fVar, 2, x2Var, nsdSearchResult.address);
        dVar.v(fVar, 3, lv.w0.f64808a, nsdSearchResult.port);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.alias;
    }

    public final String component3() {
        return this.address;
    }

    public final Integer component4() {
        return this.port;
    }

    public final NsdSearchResult copy(String str, String str2, String str3, Integer num) {
        return new NsdSearchResult(str, str2, str3, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NsdSearchResult)) {
            return false;
        }
        NsdSearchResult nsdSearchResult = (NsdSearchResult) obj;
        return ju.t.b(this.type, nsdSearchResult.type) && ju.t.b(this.alias, nsdSearchResult.alias) && ju.t.b(this.address, nsdSearchResult.address) && ju.t.b(this.port, nsdSearchResult.port);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alias;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.port;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "NsdSearchResult(type=" + this.type + ", alias=" + this.alias + ", address=" + this.address + ", port=" + this.port + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ju.t.f(parcel, "dest");
        parcel.writeString(this.type);
        parcel.writeString(this.alias);
        parcel.writeString(this.address);
        Integer num = this.port;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public NsdSearchResult(String str, String str2, String str3, Integer num) {
        this.type = str;
        this.alias = str2;
        this.address = str3;
        this.port = num;
    }
}
