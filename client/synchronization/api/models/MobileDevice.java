package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.database.Column;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;
import lv.w0;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class MobileDevice {
    private boolean active;
    public String appVersion;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private Integer f39030id;
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

        public final hv.c serializer() {
            return MobileDevice$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ MobileDevice(int i10, String str, String str2, String str3, String str4, boolean z10, Integer num, String str5, String str6, String str7, s2 s2Var) {
        if (479 != (i10 & 479)) {
            d2.a(i10, 479, MobileDevice$$serializer.INSTANCE.getDescriptor());
        }
        this.pushToken = str;
        this.appVersion = str2;
        this.osVersion = str3;
        this.token = str4;
        this.active = z10;
        if ((i10 & 32) == 0) {
            this.f39030id = null;
        } else {
            this.f39030id = num;
        }
        this.mobileType = str5;
        this.name = str6;
        this.subName = str7;
    }

    public static /* synthetic */ MobileDevice copy$default(MobileDevice mobileDevice, String str, String str2, String str3, String str4, boolean z10, Integer num, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mobileDevice.pushToken;
        }
        if ((i10 & 2) != 0) {
            str2 = mobileDevice.appVersion;
        }
        if ((i10 & 4) != 0) {
            str3 = mobileDevice.osVersion;
        }
        if ((i10 & 8) != 0) {
            str4 = mobileDevice.token;
        }
        if ((i10 & 16) != 0) {
            z10 = mobileDevice.active;
        }
        if ((i10 & 32) != 0) {
            num = mobileDevice.f39030id;
        }
        if ((i10 & 64) != 0) {
            str5 = mobileDevice.mobileType;
        }
        if ((i10 & 128) != 0) {
            str6 = mobileDevice.name;
        }
        if ((i10 & 256) != 0) {
            str7 = mobileDevice.subName;
        }
        String str8 = str6;
        String str9 = str7;
        Integer num2 = num;
        String str10 = str5;
        boolean z11 = z10;
        String str11 = str3;
        return mobileDevice.copy(str, str2, str11, str4, z11, num2, str10, str8, str9);
    }

    @o("is_active")
    public static /* synthetic */ void getActive$annotations() {
    }

    @o("app_version")
    public static /* synthetic */ void getAppVersion$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MobileDevice mobileDevice, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, mobileDevice.pushToken);
        dVar.f(fVar, 1, mobileDevice.appVersion);
        dVar.f(fVar, 2, mobileDevice.osVersion);
        dVar.f(fVar, 3, mobileDevice.token);
        dVar.u(fVar, 4, mobileDevice.active);
        if (dVar.E(fVar, 5) || mobileDevice.f39030id != null) {
            dVar.v(fVar, 5, w0.f64808a, mobileDevice.f39030id);
        }
        dVar.f(fVar, 6, mobileDevice.mobileType);
        dVar.f(fVar, 7, mobileDevice.name);
        dVar.f(fVar, 8, mobileDevice.subName);
    }

    public final String component1() {
        return this.pushToken;
    }

    public final String component2() {
        return this.appVersion;
    }

    public final String component3() {
        return this.osVersion;
    }

    public final String component4() {
        return this.token;
    }

    public final boolean component5() {
        return this.active;
    }

    public final Integer component6() {
        return this.f39030id;
    }

    public final String component7() {
        return this.mobileType;
    }

    public final String component8() {
        return this.name;
    }

    public final String component9() {
        return this.subName;
    }

    public final MobileDevice copy(String str, String str2, String str3, String str4, boolean z10, Integer num, String str5, String str6, String str7) {
        t.f(str, "pushToken");
        t.f(str2, "appVersion");
        t.f(str3, "osVersion");
        t.f(str4, "token");
        t.f(str5, "mobileType");
        t.f(str6, Column.MULTI_KEY_NAME);
        t.f(str7, "subName");
        return new MobileDevice(str, str2, str3, str4, z10, num, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileDevice)) {
            return false;
        }
        MobileDevice mobileDevice = (MobileDevice) obj;
        return t.b(this.pushToken, mobileDevice.pushToken) && t.b(this.appVersion, mobileDevice.appVersion) && t.b(this.osVersion, mobileDevice.osVersion) && t.b(this.token, mobileDevice.token) && this.active == mobileDevice.active && t.b(this.f39030id, mobileDevice.f39030id) && t.b(this.mobileType, mobileDevice.mobileType) && t.b(this.name, mobileDevice.name) && t.b(this.subName, mobileDevice.subName);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Integer getId() {
        return this.f39030id;
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
        int iHashCode = ((((((((this.pushToken.hashCode() * 31) + this.appVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.token.hashCode()) * 31) + Boolean.hashCode(this.active)) * 31;
        Integer num = this.f39030id;
        return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.mobileType.hashCode()) * 31) + this.name.hashCode()) * 31) + this.subName.hashCode();
    }

    public final void setActive(boolean z10) {
        this.active = z10;
    }

    public final void setId(Integer num) {
        this.f39030id = num;
    }

    public final void setMobileType(String str) {
        t.f(str, "<set-?>");
        this.mobileType = str;
    }

    public final void setName(String str) {
        t.f(str, "<set-?>");
        this.name = str;
    }

    public final void setOsVersion(String str) {
        t.f(str, "<set-?>");
        this.osVersion = str;
    }

    public final void setPushToken(String str) {
        t.f(str, "<set-?>");
        this.pushToken = str;
    }

    public final void setSubName(String str) {
        t.f(str, "<set-?>");
        this.subName = str;
    }

    public final void setToken(String str) {
        t.f(str, "<set-?>");
        this.token = str;
    }

    public String toString() {
        return "MobileDevice(pushToken=" + this.pushToken + ", appVersion=" + this.appVersion + ", osVersion=" + this.osVersion + ", token=" + this.token + ", active=" + this.active + ", id=" + this.f39030id + ", mobileType=" + this.mobileType + ", name=" + this.name + ", subName=" + this.subName + ")";
    }

    public MobileDevice(String str, String str2, String str3, String str4, boolean z10, Integer num, String str5, String str6, String str7) {
        t.f(str, "pushToken");
        t.f(str2, "appVersion");
        t.f(str3, "osVersion");
        t.f(str4, "token");
        t.f(str5, "mobileType");
        t.f(str6, Column.MULTI_KEY_NAME);
        t.f(str7, "subName");
        this.pushToken = str;
        this.appVersion = str2;
        this.osVersion = str3;
        this.token = str4;
        this.active = z10;
        this.f39030id = num;
        this.mobileType = str5;
        this.name = str6;
        this.subName = str7;
    }

    public /* synthetic */ MobileDevice(String str, String str2, String str3, String str4, boolean z10, Integer num, String str5, String str6, String str7, int i10, k kVar) {
        this(str, str2, str3, str4, z10, (i10 & 32) != 0 ? null : num, str5, str6, str7);
    }
}
