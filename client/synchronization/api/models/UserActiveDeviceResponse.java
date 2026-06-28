package com.server.auditor.ssh.client.synchronization.api.models;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.i;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class UserActiveDeviceResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String appVersion;
    private final UserDeviceType deviceType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f39031id;
    private final Boolean isAbleToLogOut;
    private final String latestActivity;
    private final String name;
    private final String osVersion;
    private final String pushToken;
    private final String subName;
    private final String token;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return UserActiveDeviceResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ UserActiveDeviceResponse(int i10, int i11, String str, Boolean bool, String str2, String str3, String str4, String str5, UserDeviceType userDeviceType, String str6, String str7, s2 s2Var) {
        if (169 != (i10 & 169)) {
            d2.a(i10, 169, UserActiveDeviceResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f39031id = i11;
        if ((i10 & 2) == 0) {
            this.latestActivity = null;
        } else {
            this.latestActivity = str;
        }
        if ((i10 & 4) == 0) {
            this.isAbleToLogOut = null;
        } else {
            this.isAbleToLogOut = bool;
        }
        this.name = str2;
        if ((i10 & 16) == 0) {
            this.subName = null;
        } else {
            this.subName = str3;
        }
        this.token = str4;
        if ((i10 & 64) == 0) {
            this.pushToken = null;
        } else {
            this.pushToken = str5;
        }
        this.deviceType = userDeviceType;
        if ((i10 & 256) == 0) {
            this.osVersion = null;
        } else {
            this.osVersion = str6;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.appVersion = null;
        } else {
            this.appVersion = str7;
        }
    }

    public static /* synthetic */ UserActiveDeviceResponse copy$default(UserActiveDeviceResponse userActiveDeviceResponse, int i10, String str, Boolean bool, String str2, String str3, String str4, String str5, UserDeviceType userDeviceType, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = userActiveDeviceResponse.f39031id;
        }
        if ((i11 & 2) != 0) {
            str = userActiveDeviceResponse.latestActivity;
        }
        if ((i11 & 4) != 0) {
            bool = userActiveDeviceResponse.isAbleToLogOut;
        }
        if ((i11 & 8) != 0) {
            str2 = userActiveDeviceResponse.name;
        }
        if ((i11 & 16) != 0) {
            str3 = userActiveDeviceResponse.subName;
        }
        if ((i11 & 32) != 0) {
            str4 = userActiveDeviceResponse.token;
        }
        if ((i11 & 64) != 0) {
            str5 = userActiveDeviceResponse.pushToken;
        }
        if ((i11 & 128) != 0) {
            userDeviceType = userActiveDeviceResponse.deviceType;
        }
        if ((i11 & 256) != 0) {
            str6 = userActiveDeviceResponse.osVersion;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            str7 = userActiveDeviceResponse.appVersion;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        UserDeviceType userDeviceType2 = userDeviceType;
        String str11 = str3;
        String str12 = str4;
        return userActiveDeviceResponse.copy(i10, str, bool, str2, str11, str12, str10, userDeviceType2, str8, str9);
    }

    @o("app_version")
    public static /* synthetic */ void getAppVersion$annotations() {
    }

    @o("mobile_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("latest_activity")
    public static /* synthetic */ void getLatestActivity$annotations() {
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

    @o("logoutable")
    public static /* synthetic */ void isAbleToLogOut$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UserActiveDeviceResponse userActiveDeviceResponse, kv.d dVar, jv.f fVar) {
        dVar.t(fVar, 0, userActiveDeviceResponse.f39031id);
        if (dVar.E(fVar, 1) || userActiveDeviceResponse.latestActivity != null) {
            dVar.v(fVar, 1, x2.f64817a, userActiveDeviceResponse.latestActivity);
        }
        if (dVar.E(fVar, 2) || userActiveDeviceResponse.isAbleToLogOut != null) {
            dVar.v(fVar, 2, i.f64704a, userActiveDeviceResponse.isAbleToLogOut);
        }
        dVar.f(fVar, 3, userActiveDeviceResponse.name);
        if (dVar.E(fVar, 4) || userActiveDeviceResponse.subName != null) {
            dVar.v(fVar, 4, x2.f64817a, userActiveDeviceResponse.subName);
        }
        dVar.f(fVar, 5, userActiveDeviceResponse.token);
        if (dVar.E(fVar, 6) || userActiveDeviceResponse.pushToken != null) {
            dVar.v(fVar, 6, x2.f64817a, userActiveDeviceResponse.pushToken);
        }
        dVar.o(fVar, 7, UserDeviceTypeSerializer.INSTANCE, userActiveDeviceResponse.deviceType);
        if (dVar.E(fVar, 8) || userActiveDeviceResponse.osVersion != null) {
            dVar.v(fVar, 8, x2.f64817a, userActiveDeviceResponse.osVersion);
        }
        if (!dVar.E(fVar, 9) && userActiveDeviceResponse.appVersion == null) {
            return;
        }
        dVar.v(fVar, 9, x2.f64817a, userActiveDeviceResponse.appVersion);
    }

    public final int component1() {
        return this.f39031id;
    }

    public final String component10() {
        return this.appVersion;
    }

    public final String component2() {
        return this.latestActivity;
    }

    public final Boolean component3() {
        return this.isAbleToLogOut;
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

    public final UserDeviceType component8() {
        return this.deviceType;
    }

    public final String component9() {
        return this.osVersion;
    }

    public final UserActiveDeviceResponse copy(int i10, String str, Boolean bool, String str2, String str3, String str4, String str5, UserDeviceType userDeviceType, String str6, String str7) {
        t.f(str2, Column.MULTI_KEY_NAME);
        t.f(str4, "token");
        t.f(userDeviceType, "deviceType");
        return new UserActiveDeviceResponse(i10, str, bool, str2, str3, str4, str5, userDeviceType, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserActiveDeviceResponse)) {
            return false;
        }
        UserActiveDeviceResponse userActiveDeviceResponse = (UserActiveDeviceResponse) obj;
        return this.f39031id == userActiveDeviceResponse.f39031id && t.b(this.latestActivity, userActiveDeviceResponse.latestActivity) && t.b(this.isAbleToLogOut, userActiveDeviceResponse.isAbleToLogOut) && t.b(this.name, userActiveDeviceResponse.name) && t.b(this.subName, userActiveDeviceResponse.subName) && t.b(this.token, userActiveDeviceResponse.token) && t.b(this.pushToken, userActiveDeviceResponse.pushToken) && this.deviceType == userActiveDeviceResponse.deviceType && t.b(this.osVersion, userActiveDeviceResponse.osVersion) && t.b(this.appVersion, userActiveDeviceResponse.appVersion);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final UserDeviceType getDeviceType() {
        return this.deviceType;
    }

    public final int getId() {
        return this.f39031id;
    }

    public final String getLatestActivity() {
        return this.latestActivity;
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
        int iHashCode = Integer.hashCode(this.f39031id) * 31;
        String str = this.latestActivity;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isAbleToLogOut;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str2 = this.subName;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.token.hashCode()) * 31;
        String str3 = this.pushToken;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.deviceType.hashCode()) * 31;
        String str4 = this.osVersion;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appVersion;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isAbleToLogOut() {
        return this.isAbleToLogOut;
    }

    public String toString() {
        return "UserActiveDeviceResponse(id=" + this.f39031id + ", latestActivity=" + this.latestActivity + ", isAbleToLogOut=" + this.isAbleToLogOut + ", name=" + this.name + ", subName=" + this.subName + ", token=" + this.token + ", pushToken=" + this.pushToken + ", deviceType=" + this.deviceType + ", osVersion=" + this.osVersion + ", appVersion=" + this.appVersion + ")";
    }

    public UserActiveDeviceResponse(int i10, String str, Boolean bool, String str2, String str3, String str4, String str5, UserDeviceType userDeviceType, String str6, String str7) {
        t.f(str2, Column.MULTI_KEY_NAME);
        t.f(str4, "token");
        t.f(userDeviceType, "deviceType");
        this.f39031id = i10;
        this.latestActivity = str;
        this.isAbleToLogOut = bool;
        this.name = str2;
        this.subName = str3;
        this.token = str4;
        this.pushToken = str5;
        this.deviceType = userDeviceType;
        this.osVersion = str6;
        this.appVersion = str7;
    }

    public /* synthetic */ UserActiveDeviceResponse(int i10, String str, Boolean bool, String str2, String str3, String str4, String str5, UserDeviceType userDeviceType, String str6, String str7, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bool, str2, (i11 & 16) != 0 ? null : str3, str4, (i11 & 64) != 0 ? null : str5, userDeviceType, (i11 & 256) != 0 ? null : str6, (i11 & File.FLAG_O_TRUNC) != 0 ? null : str7);
    }
}
