package com.server.auditor.ssh.client.navigation;

import com.crystalnix.termius.libtermius.sftp.File;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f29080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f29081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f29082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f29083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f29084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l0 f29085k;

    public n0(int i10, boolean z10, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, String str6, l0 l0Var) {
        ju.t.f(str2, "createdAt");
        ju.t.f(str3, "title");
        ju.t.f(str4, "body");
        ju.t.f(str6, "action");
        this.f29075a = i10;
        this.f29076b = z10;
        this.f29077c = z11;
        this.f29078d = z12;
        this.f29079e = str;
        this.f29080f = str2;
        this.f29081g = str3;
        this.f29082h = str4;
        this.f29083i = str5;
        this.f29084j = str6;
        this.f29085k = l0Var;
    }

    public final String a() {
        return this.f29084j;
    }

    public final l0 b() {
        return this.f29085k;
    }

    public final String c() {
        return this.f29082h;
    }

    public final String d() {
        return this.f29083i;
    }

    public final String e() {
        return this.f29080f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f29075a == n0Var.f29075a && this.f29076b == n0Var.f29076b && this.f29077c == n0Var.f29077c && this.f29078d == n0Var.f29078d && ju.t.b(this.f29079e, n0Var.f29079e) && ju.t.b(this.f29080f, n0Var.f29080f) && ju.t.b(this.f29081g, n0Var.f29081g) && ju.t.b(this.f29082h, n0Var.f29082h) && ju.t.b(this.f29083i, n0Var.f29083i) && ju.t.b(this.f29084j, n0Var.f29084j) && ju.t.b(this.f29085k, n0Var.f29085k);
    }

    public final boolean f() {
        return this.f29076b;
    }

    public final int g() {
        return this.f29075a;
    }

    public final String h() {
        return this.f29081g;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.f29075a) * 31) + Boolean.hashCode(this.f29076b)) * 31) + Boolean.hashCode(this.f29077c)) * 31) + Boolean.hashCode(this.f29078d)) * 31;
        String str = this.f29079e;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f29080f.hashCode()) * 31) + this.f29081g.hashCode()) * 31) + this.f29082h.hashCode()) * 31;
        String str2 = this.f29083i;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f29084j.hashCode()) * 31;
        l0 l0Var = this.f29085k;
        return iHashCode3 + (l0Var != null ? l0Var.hashCode() : 0);
    }

    public final boolean i() {
        return this.f29078d;
    }

    public String toString() {
        return "InAppMessageModel(id=" + this.f29075a + ", forceToDoAction=" + this.f29076b + ", isDismissible=" + this.f29077c + ", isSeen=" + this.f29078d + ", type=" + this.f29079e + ", createdAt=" + this.f29080f + ", title=" + this.f29081g + ", body=" + this.f29082h + ", buttonName=" + this.f29083i + ", action=" + this.f29084j + ", attributes=" + this.f29085k + ")";
    }

    public /* synthetic */ n0(int i10, boolean z10, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, String str6, l0 l0Var, int i11, ju.k kVar) {
        this(i10, z10, z11, z12, str, str2, str3, str4, str5, str6, (i11 & File.FLAG_O_APPEND) != 0 ? null : l0Var);
    }
}
