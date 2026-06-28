package com.server.auditor.ssh.client.models;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.b;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UserDeviceType f27868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f27869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f27870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f27872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f27873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f27874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f27876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f27877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f27878l;

    public a(int i10, UserDeviceType userDeviceType, Date date, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, b bVar) {
        ju.t.f(userDeviceType, "deviceType");
        ju.t.f(str, Column.MULTI_KEY_NAME);
        ju.t.f(str3, "token");
        ju.t.f(bVar, "state");
        this.f27867a = i10;
        this.f27868b = userDeviceType;
        this.f27869c = date;
        this.f27870d = bool;
        this.f27871e = str;
        this.f27872f = str2;
        this.f27873g = str3;
        this.f27874h = str4;
        this.f27875i = str5;
        this.f27876j = str6;
        this.f27877k = z10;
        this.f27878l = bVar;
    }

    public static /* synthetic */ a b(a aVar, int i10, UserDeviceType userDeviceType, Date date, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.f27867a;
        }
        if ((i11 & 2) != 0) {
            userDeviceType = aVar.f27868b;
        }
        if ((i11 & 4) != 0) {
            date = aVar.f27869c;
        }
        if ((i11 & 8) != 0) {
            bool = aVar.f27870d;
        }
        if ((i11 & 16) != 0) {
            str = aVar.f27871e;
        }
        if ((i11 & 32) != 0) {
            str2 = aVar.f27872f;
        }
        if ((i11 & 64) != 0) {
            str3 = aVar.f27873g;
        }
        if ((i11 & 128) != 0) {
            str4 = aVar.f27874h;
        }
        if ((i11 & 256) != 0) {
            str5 = aVar.f27875i;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            str6 = aVar.f27876j;
        }
        if ((i11 & File.FLAG_O_APPEND) != 0) {
            z10 = aVar.f27877k;
        }
        if ((i11 & 2048) != 0) {
            bVar = aVar.f27878l;
        }
        boolean z11 = z10;
        b bVar2 = bVar;
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        String str11 = str;
        String str12 = str2;
        return aVar.a(i10, userDeviceType, date, bool, str11, str12, str9, str10, str7, str8, z11, bVar2);
    }

    public final a a(int i10, UserDeviceType userDeviceType, Date date, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, b bVar) {
        ju.t.f(userDeviceType, "deviceType");
        ju.t.f(str, Column.MULTI_KEY_NAME);
        ju.t.f(str3, "token");
        ju.t.f(bVar, "state");
        return new a(i10, userDeviceType, date, bool, str, str2, str3, str4, str5, str6, z10, bVar);
    }

    public final UserDeviceType c() {
        return this.f27868b;
    }

    public final int d() {
        return this.f27867a;
    }

    public final Date e() {
        return this.f27869c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27867a == aVar.f27867a && this.f27868b == aVar.f27868b && ju.t.b(this.f27869c, aVar.f27869c) && ju.t.b(this.f27870d, aVar.f27870d) && ju.t.b(this.f27871e, aVar.f27871e) && ju.t.b(this.f27872f, aVar.f27872f) && ju.t.b(this.f27873g, aVar.f27873g) && ju.t.b(this.f27874h, aVar.f27874h) && ju.t.b(this.f27875i, aVar.f27875i) && ju.t.b(this.f27876j, aVar.f27876j) && this.f27877k == aVar.f27877k && ju.t.b(this.f27878l, aVar.f27878l);
    }

    public final String f() {
        return this.f27871e;
    }

    public final b g() {
        return this.f27878l;
    }

    public final String h() {
        return this.f27873g;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f27867a) * 31) + this.f27868b.hashCode()) * 31;
        Date date = this.f27869c;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool = this.f27870d;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.f27871e.hashCode()) * 31;
        String str = this.f27872f;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f27873g.hashCode()) * 31;
        String str2 = this.f27874h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27875i;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27876j;
        return ((((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.f27877k)) * 31) + this.f27878l.hashCode();
    }

    public final Boolean i() {
        return this.f27870d;
    }

    public final boolean j() {
        return this.f27877k;
    }

    public String toString() {
        return "ActiveDeviceModel(id=" + this.f27867a + ", deviceType=" + this.f27868b + ", latestActivity=" + this.f27869c + ", isAbleToLogOut=" + this.f27870d + ", name=" + this.f27871e + ", subName=" + this.f27872f + ", token=" + this.f27873g + ", pushToken=" + this.f27874h + ", osVersion=" + this.f27875i + ", appVersion=" + this.f27876j + ", isCurrentDevice=" + this.f27877k + ", state=" + this.f27878l + ")";
    }

    public /* synthetic */ a(int i10, UserDeviceType userDeviceType, Date date, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, b bVar, int i11, ju.k kVar) {
        this(i10, userDeviceType, date, bool, str, str2, str3, str4, str5, str6, (i11 & File.FLAG_O_APPEND) != 0 ? false : z10, (i11 & 2048) != 0 ? b.a.f27895a : bVar);
    }
}
