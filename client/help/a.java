package com.server.auditor.ssh.client.help;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27032d;

    public a(String str, String str2, String str3, String str4) {
        this.f27029a = str;
        this.f27030b = str2;
        this.f27031c = str3;
        this.f27032d = str4;
    }

    public final String a() {
        return this.f27030b;
    }

    public final String b() {
        return this.f27031c;
    }

    public final String c() {
        return this.f27032d;
    }

    public final String d() {
        return this.f27029a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return ju.t.b(this.f27029a, aVar.f27029a) && ju.t.b(this.f27030b, aVar.f27030b) && ju.t.b(this.f27031c, aVar.f27031c) && ju.t.b(this.f27032d, aVar.f27032d);
    }

    public int hashCode() {
        String str = this.f27029a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27030b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27031c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27032d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationInfo(osVersion=" + this.f27029a + ", appVersion=" + this.f27030b + ", deviceBrand=" + this.f27031c + ", deviceModel=" + this.f27032d + ")";
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? Build.VERSION.RELEASE : str, (i10 & 2) != 0 ? "7.6.0" : str2, (i10 & 4) != 0 ? Build.BRAND : str3, (i10 & 8) != 0 ? Build.MODEL : str4);
    }
}
