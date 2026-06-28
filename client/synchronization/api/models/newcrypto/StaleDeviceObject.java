package com.server.auditor.ssh.client.synchronization.api.models.newcrypto;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
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
public final class StaleDeviceObject {
    private String appVersion;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39057id;
    private boolean isActive;
    private String latestActivity;
    private boolean logoutable;
    private String mobileType;
    private String name;
    private String osVersion;
    private String pushToken;
    private String subName;
    private String token;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return StaleDeviceObject$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ StaleDeviceObject(int i10, int i11, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, s2 s2Var) {
        if (1029 != (i10 & 1029)) {
            d2.a(i10, 1029, StaleDeviceObject$$serializer.INSTANCE.getDescriptor());
        }
        this.f39057id = i11;
        if ((i10 & 2) == 0) {
            this.latestActivity = null;
        } else {
            this.latestActivity = str;
        }
        this.logoutable = z10;
        if ((i10 & 8) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i10 & 16) == 0) {
            this.subName = null;
        } else {
            this.subName = str3;
        }
        if ((i10 & 32) == 0) {
            this.token = null;
        } else {
            this.token = str4;
        }
        if ((i10 & 64) == 0) {
            this.pushToken = null;
        } else {
            this.pushToken = str5;
        }
        if ((i10 & 128) == 0) {
            this.mobileType = null;
        } else {
            this.mobileType = str6;
        }
        if ((i10 & 256) == 0) {
            this.osVersion = null;
        } else {
            this.osVersion = str7;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.appVersion = null;
        } else {
            this.appVersion = str8;
        }
        this.isActive = z11;
    }

    public static /* synthetic */ StaleDeviceObject copy$default(StaleDeviceObject staleDeviceObject, int i10, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = staleDeviceObject.f39057id;
        }
        if ((i11 & 2) != 0) {
            str = staleDeviceObject.latestActivity;
        }
        if ((i11 & 4) != 0) {
            z10 = staleDeviceObject.logoutable;
        }
        if ((i11 & 8) != 0) {
            str2 = staleDeviceObject.name;
        }
        if ((i11 & 16) != 0) {
            str3 = staleDeviceObject.subName;
        }
        if ((i11 & 32) != 0) {
            str4 = staleDeviceObject.token;
        }
        if ((i11 & 64) != 0) {
            str5 = staleDeviceObject.pushToken;
        }
        if ((i11 & 128) != 0) {
            str6 = staleDeviceObject.mobileType;
        }
        if ((i11 & 256) != 0) {
            str7 = staleDeviceObject.osVersion;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            str8 = staleDeviceObject.appVersion;
        }
        if ((i11 & File.FLAG_O_APPEND) != 0) {
            z11 = staleDeviceObject.isActive;
        }
        String str9 = str8;
        boolean z12 = z11;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        String str14 = str3;
        boolean z13 = z10;
        return staleDeviceObject.copy(i10, str, z13, str2, str14, str12, str13, str10, str11, str9, z12);
    }

    @o("app_version")
    public static /* synthetic */ void getAppVersion$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("latest_activity")
    public static /* synthetic */ void getLatestActivity$annotations() {
    }

    @o("logoutable")
    public static /* synthetic */ void getLogoutable$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(StaleDeviceObject staleDeviceObject, d dVar, f fVar) {
        dVar.t(fVar, 0, staleDeviceObject.f39057id);
        if (dVar.E(fVar, 1) || staleDeviceObject.latestActivity != null) {
            dVar.v(fVar, 1, x2.f64817a, staleDeviceObject.latestActivity);
        }
        dVar.u(fVar, 2, staleDeviceObject.logoutable);
        if (dVar.E(fVar, 3) || staleDeviceObject.name != null) {
            dVar.v(fVar, 3, x2.f64817a, staleDeviceObject.name);
        }
        if (dVar.E(fVar, 4) || staleDeviceObject.subName != null) {
            dVar.v(fVar, 4, x2.f64817a, staleDeviceObject.subName);
        }
        if (dVar.E(fVar, 5) || staleDeviceObject.token != null) {
            dVar.v(fVar, 5, x2.f64817a, staleDeviceObject.token);
        }
        if (dVar.E(fVar, 6) || staleDeviceObject.pushToken != null) {
            dVar.v(fVar, 6, x2.f64817a, staleDeviceObject.pushToken);
        }
        if (dVar.E(fVar, 7) || staleDeviceObject.mobileType != null) {
            dVar.v(fVar, 7, x2.f64817a, staleDeviceObject.mobileType);
        }
        if (dVar.E(fVar, 8) || staleDeviceObject.osVersion != null) {
            dVar.v(fVar, 8, x2.f64817a, staleDeviceObject.osVersion);
        }
        if (dVar.E(fVar, 9) || staleDeviceObject.appVersion != null) {
            dVar.v(fVar, 9, x2.f64817a, staleDeviceObject.appVersion);
        }
        dVar.u(fVar, 10, staleDeviceObject.isActive);
    }

    public final int component1() {
        return this.f39057id;
    }

    public final String component10() {
        return this.appVersion;
    }

    public final boolean component11() {
        return this.isActive;
    }

    public final String component2() {
        return this.latestActivity;
    }

    public final boolean component3() {
        return this.logoutable;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.subName;
    }

    public final String component6() {
        return this.token;
    }

    public final String component7() {
        return this.pushToken;
    }

    public final String component8() {
        return this.mobileType;
    }

    public final String component9() {
        return this.osVersion;
    }

    public final StaleDeviceObject copy(int i10, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11) {
        return new StaleDeviceObject(i10, str, z10, str2, str3, str4, str5, str6, str7, str8, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaleDeviceObject)) {
            return false;
        }
        StaleDeviceObject staleDeviceObject = (StaleDeviceObject) obj;
        return this.f39057id == staleDeviceObject.f39057id && t.b(this.latestActivity, staleDeviceObject.latestActivity) && this.logoutable == staleDeviceObject.logoutable && t.b(this.name, staleDeviceObject.name) && t.b(this.subName, staleDeviceObject.subName) && t.b(this.token, staleDeviceObject.token) && t.b(this.pushToken, staleDeviceObject.pushToken) && t.b(this.mobileType, staleDeviceObject.mobileType) && t.b(this.osVersion, staleDeviceObject.osVersion) && t.b(this.appVersion, staleDeviceObject.appVersion) && this.isActive == staleDeviceObject.isActive;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final int getId() {
        return this.f39057id;
    }

    public final String getLatestActivity() {
        return this.latestActivity;
    }

    public final boolean getLogoutable() {
        return this.logoutable;
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
        int iHashCode = Integer.hashCode(this.f39057id) * 31;
        String str = this.latestActivity;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.logoutable)) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.token;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pushToken;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mobileType;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.osVersion;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.appVersion;
        return ((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + Boolean.hashCode(this.isActive);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z10) {
        this.isActive = z10;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setId(int i10) {
        this.f39057id = i10;
    }

    public final void setLatestActivity(String str) {
        this.latestActivity = str;
    }

    public final void setLogoutable(boolean z10) {
        this.logoutable = z10;
    }

    public final void setMobileType(String str) {
        this.mobileType = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOsVersion(String str) {
        this.osVersion = str;
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setSubName(String str) {
        this.subName = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "StaleDeviceObject(id=" + this.f39057id + ", latestActivity=" + this.latestActivity + ", logoutable=" + this.logoutable + ", name=" + this.name + ", subName=" + this.subName + ", token=" + this.token + ", pushToken=" + this.pushToken + ", mobileType=" + this.mobileType + ", osVersion=" + this.osVersion + ", appVersion=" + this.appVersion + ", isActive=" + this.isActive + ")";
    }

    public StaleDeviceObject(int i10, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11) {
        this.f39057id = i10;
        this.latestActivity = str;
        this.logoutable = z10;
        this.name = str2;
        this.subName = str3;
        this.token = str4;
        this.pushToken = str5;
        this.mobileType = str6;
        this.osVersion = str7;
        this.appVersion = str8;
        this.isActive = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StaleDeviceObject(int i10, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, int i11, k kVar) {
        boolean z12;
        String str9;
        str = (i11 & 2) != 0 ? null : str;
        str2 = (i11 & 8) != 0 ? null : str2;
        str3 = (i11 & 16) != 0 ? null : str3;
        str4 = (i11 & 32) != 0 ? null : str4;
        str5 = (i11 & 64) != 0 ? null : str5;
        str6 = (i11 & 128) != 0 ? null : str6;
        str7 = (i11 & 256) != 0 ? null : str7;
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            z12 = z11;
            str9 = null;
        } else {
            z12 = z11;
            str9 = str8;
        }
        this(i10, str, z10, str2, str3, str4, str5, str6, str7, str9, z12);
    }
}
