package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.i;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class DeviceModel implements Parcelable {
    private final String appVersion;
    private final Boolean isActive;
    private final String mobileType;
    private final String name;
    private final String osVersion;
    private final String pushToken;
    private final String subName;
    private final String token;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeviceModel> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DeviceModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<DeviceModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            t.f(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeviceModel(string, string2, string3, string4, string5, string6, string7, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceModel[] newArray(int i10) {
            return new DeviceModel[i10];
        }
    }

    public /* synthetic */ DeviceModel(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, s2 s2Var) {
        if (21 != (i10 & 21)) {
            d2.a(i10, 21, DeviceModel$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i10 & 2) == 0) {
            this.subName = null;
        } else {
            this.subName = str2;
        }
        this.token = str3;
        if ((i10 & 8) == 0) {
            this.pushToken = null;
        } else {
            this.pushToken = str4;
        }
        this.mobileType = str5;
        if ((i10 & 32) == 0) {
            this.osVersion = null;
        } else {
            this.osVersion = str6;
        }
        if ((i10 & 64) == 0) {
            this.appVersion = null;
        } else {
            this.appVersion = str7;
        }
        if ((i10 & 128) == 0) {
            this.isActive = null;
        } else {
            this.isActive = bool;
        }
    }

    public static /* synthetic */ DeviceModel copy$default(DeviceModel deviceModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceModel.name;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceModel.subName;
        }
        if ((i10 & 4) != 0) {
            str3 = deviceModel.token;
        }
        if ((i10 & 8) != 0) {
            str4 = deviceModel.pushToken;
        }
        if ((i10 & 16) != 0) {
            str5 = deviceModel.mobileType;
        }
        if ((i10 & 32) != 0) {
            str6 = deviceModel.osVersion;
        }
        if ((i10 & 64) != 0) {
            str7 = deviceModel.appVersion;
        }
        if ((i10 & 128) != 0) {
            bool = deviceModel.isActive;
        }
        String str8 = str7;
        Boolean bool2 = bool;
        String str9 = str5;
        String str10 = str6;
        return deviceModel.copy(str, str2, str3, str4, str9, str10, str8, bool2);
    }

    @o("app_version")
    public static /* synthetic */ void getAppVersion$annotations() {
    }

    @o("mobile_type")
    public static /* synthetic */ void getMobileType$annotations() {
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    @o("os_version")
    public static /* synthetic */ void getOsVersion$annotations() {
    }

    @o("push_token")
    public static /* synthetic */ void getPushToken$annotations() {
    }

    @o("sub_name")
    public static /* synthetic */ void getSubName$annotations() {
    }

    @o("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @o("is_active")
    public static /* synthetic */ void isActive$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DeviceModel deviceModel, d dVar, f fVar) {
        dVar.f(fVar, 0, deviceModel.name);
        if (dVar.E(fVar, 1) || deviceModel.subName != null) {
            dVar.v(fVar, 1, x2.f64817a, deviceModel.subName);
        }
        dVar.f(fVar, 2, deviceModel.token);
        if (dVar.E(fVar, 3) || deviceModel.pushToken != null) {
            dVar.v(fVar, 3, x2.f64817a, deviceModel.pushToken);
        }
        dVar.f(fVar, 4, deviceModel.mobileType);
        if (dVar.E(fVar, 5) || deviceModel.osVersion != null) {
            dVar.v(fVar, 5, x2.f64817a, deviceModel.osVersion);
        }
        if (dVar.E(fVar, 6) || deviceModel.appVersion != null) {
            dVar.v(fVar, 6, x2.f64817a, deviceModel.appVersion);
        }
        if (!dVar.E(fVar, 7) && deviceModel.isActive == null) {
            return;
        }
        dVar.v(fVar, 7, i.f64704a, deviceModel.isActive);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.subName;
    }

    public final String component3() {
        return this.token;
    }

    public final String component4() {
        return this.pushToken;
    }

    public final String component5() {
        return this.mobileType;
    }

    public final String component6() {
        return this.osVersion;
    }

    public final String component7() {
        return this.appVersion;
    }

    public final Boolean component8() {
        return this.isActive;
    }

    public final DeviceModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str3, "token");
        t.f(str5, "mobileType");
        return new DeviceModel(str, str2, str3, str4, str5, str6, str7, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceModel)) {
            return false;
        }
        DeviceModel deviceModel = (DeviceModel) obj;
        return t.b(this.name, deviceModel.name) && t.b(this.subName, deviceModel.subName) && t.b(this.token, deviceModel.token) && t.b(this.pushToken, deviceModel.pushToken) && t.b(this.mobileType, deviceModel.mobileType) && t.b(this.osVersion, deviceModel.osVersion) && t.b(this.appVersion, deviceModel.appVersion) && t.b(this.isActive, deviceModel.isActive);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getMobileType() {
        return this.mobileType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final String getSubName() {
        return this.subName;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.subName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.token.hashCode()) * 31;
        String str2 = this.pushToken;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.mobileType.hashCode()) * 31;
        String str3 = this.osVersion;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appVersion;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isActive;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "DeviceModel(name=" + this.name + ", subName=" + this.subName + ", token=" + this.token + ", pushToken=" + this.pushToken + ", mobileType=" + this.mobileType + ", osVersion=" + this.osVersion + ", appVersion=" + this.appVersion + ", isActive=" + this.isActive + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.name);
        parcel.writeString(this.subName);
        parcel.writeString(this.token);
        parcel.writeString(this.pushToken);
        parcel.writeString(this.mobileType);
        parcel.writeString(this.osVersion);
        parcel.writeString(this.appVersion);
        Boolean bool = this.isActive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public DeviceModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str3, "token");
        t.f(str5, "mobileType");
        this.name = str;
        this.subName = str2;
        this.token = str3;
        this.pushToken = str4;
        this.mobileType = str5;
        this.osVersion = str6;
        this.appVersion = str7;
        this.isActive = bool;
    }

    public /* synthetic */ DeviceModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4, str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : bool);
    }
}
