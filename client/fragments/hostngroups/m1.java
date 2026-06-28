package com.server.auditor.ssh.client.fragments.hostngroups;

import android.util.LongSparseArray;
import com.crystalnix.termius.libtermius.sftp.File;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LongSparseArray f25140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LongSparseArray f25141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LongSparseArray f25142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray f25143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LongSparseArray f25144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LongSparseArray f25145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LongSparseArray f25146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LongSparseArray f25147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LongSparseArray f25148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LongSparseArray f25149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LongSparseArray f25150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final LongSparseArray f25151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final LongSparseArray f25152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LongSparseArray f25153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LongSparseArray f25154o;

    public m1(LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3, LongSparseArray longSparseArray4, LongSparseArray longSparseArray5, LongSparseArray longSparseArray6, LongSparseArray longSparseArray7, LongSparseArray longSparseArray8, LongSparseArray longSparseArray9, LongSparseArray longSparseArray10, LongSparseArray longSparseArray11, LongSparseArray longSparseArray12, LongSparseArray longSparseArray13, LongSparseArray longSparseArray14, LongSparseArray longSparseArray15) {
        ju.t.f(longSparseArray, "groupList");
        ju.t.f(longSparseArray2, "sshConfigList");
        ju.t.f(longSparseArray3, "telnetConfigList");
        ju.t.f(longSparseArray4, "hostList");
        ju.t.f(longSparseArray5, "tagList");
        ju.t.f(longSparseArray6, "tagHostList");
        ju.t.f(longSparseArray7, "identityList");
        ju.t.f(longSparseArray8, "packageList");
        ju.t.f(longSparseArray9, "snippetList");
        ju.t.f(longSparseArray10, "proxyList");
        ju.t.f(longSparseArray11, "chainHostList");
        ju.t.f(longSparseArray12, "sharedSshConfigIdentityList");
        ju.t.f(longSparseArray13, "sharedTelnetConfigIdentityList");
        ju.t.f(longSparseArray14, "sshKeysList");
        ju.t.f(longSparseArray15, "sshCertificates");
        this.f25140a = longSparseArray;
        this.f25141b = longSparseArray2;
        this.f25142c = longSparseArray3;
        this.f25143d = longSparseArray4;
        this.f25144e = longSparseArray5;
        this.f25145f = longSparseArray6;
        this.f25146g = longSparseArray7;
        this.f25147h = longSparseArray8;
        this.f25148i = longSparseArray9;
        this.f25149j = longSparseArray10;
        this.f25150k = longSparseArray11;
        this.f25151l = longSparseArray12;
        this.f25152m = longSparseArray13;
        this.f25153n = longSparseArray14;
        this.f25154o = longSparseArray15;
    }

    public final LongSparseArray a() {
        return this.f25150k;
    }

    public final LongSparseArray b() {
        return this.f25140a;
    }

    public final LongSparseArray c() {
        return this.f25143d;
    }

    public final LongSparseArray d() {
        return this.f25146g;
    }

    public final LongSparseArray e() {
        return this.f25147h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return ju.t.b(this.f25140a, m1Var.f25140a) && ju.t.b(this.f25141b, m1Var.f25141b) && ju.t.b(this.f25142c, m1Var.f25142c) && ju.t.b(this.f25143d, m1Var.f25143d) && ju.t.b(this.f25144e, m1Var.f25144e) && ju.t.b(this.f25145f, m1Var.f25145f) && ju.t.b(this.f25146g, m1Var.f25146g) && ju.t.b(this.f25147h, m1Var.f25147h) && ju.t.b(this.f25148i, m1Var.f25148i) && ju.t.b(this.f25149j, m1Var.f25149j) && ju.t.b(this.f25150k, m1Var.f25150k) && ju.t.b(this.f25151l, m1Var.f25151l) && ju.t.b(this.f25152m, m1Var.f25152m) && ju.t.b(this.f25153n, m1Var.f25153n) && ju.t.b(this.f25154o, m1Var.f25154o);
    }

    public final LongSparseArray f() {
        return this.f25149j;
    }

    public final LongSparseArray g() {
        return this.f25151l;
    }

    public final LongSparseArray h() {
        return this.f25152m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f25140a.hashCode() * 31) + this.f25141b.hashCode()) * 31) + this.f25142c.hashCode()) * 31) + this.f25143d.hashCode()) * 31) + this.f25144e.hashCode()) * 31) + this.f25145f.hashCode()) * 31) + this.f25146g.hashCode()) * 31) + this.f25147h.hashCode()) * 31) + this.f25148i.hashCode()) * 31) + this.f25149j.hashCode()) * 31) + this.f25150k.hashCode()) * 31) + this.f25151l.hashCode()) * 31) + this.f25152m.hashCode()) * 31) + this.f25153n.hashCode()) * 31) + this.f25154o.hashCode();
    }

    public final LongSparseArray i() {
        return this.f25148i;
    }

    public final LongSparseArray j() {
        return this.f25154o;
    }

    public final LongSparseArray k() {
        return this.f25141b;
    }

    public final LongSparseArray l() {
        return this.f25153n;
    }

    public final LongSparseArray m() {
        return this.f25145f;
    }

    public final LongSparseArray n() {
        return this.f25144e;
    }

    public final LongSparseArray o() {
        return this.f25142c;
    }

    public String toString() {
        return "SharingModel(groupList=" + this.f25140a + ", sshConfigList=" + this.f25141b + ", telnetConfigList=" + this.f25142c + ", hostList=" + this.f25143d + ", tagList=" + this.f25144e + ", tagHostList=" + this.f25145f + ", identityList=" + this.f25146g + ", packageList=" + this.f25147h + ", snippetList=" + this.f25148i + ", proxyList=" + this.f25149j + ", chainHostList=" + this.f25150k + ", sharedSshConfigIdentityList=" + this.f25151l + ", sharedTelnetConfigIdentityList=" + this.f25152m + ", sshKeysList=" + this.f25153n + ", sshCertificates=" + this.f25154o + ")";
    }

    public /* synthetic */ m1(LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3, LongSparseArray longSparseArray4, LongSparseArray longSparseArray5, LongSparseArray longSparseArray6, LongSparseArray longSparseArray7, LongSparseArray longSparseArray8, LongSparseArray longSparseArray9, LongSparseArray longSparseArray10, LongSparseArray longSparseArray11, LongSparseArray longSparseArray12, LongSparseArray longSparseArray13, LongSparseArray longSparseArray14, LongSparseArray longSparseArray15, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? new LongSparseArray() : longSparseArray, (i10 & 2) != 0 ? new LongSparseArray() : longSparseArray2, (i10 & 4) != 0 ? new LongSparseArray() : longSparseArray3, (i10 & 8) != 0 ? new LongSparseArray() : longSparseArray4, (i10 & 16) != 0 ? new LongSparseArray() : longSparseArray5, (i10 & 32) != 0 ? new LongSparseArray() : longSparseArray6, (i10 & 64) != 0 ? new LongSparseArray() : longSparseArray7, (i10 & 128) != 0 ? new LongSparseArray() : longSparseArray8, (i10 & 256) != 0 ? new LongSparseArray() : longSparseArray9, (i10 & File.FLAG_O_TRUNC) != 0 ? new LongSparseArray() : longSparseArray10, (i10 & File.FLAG_O_APPEND) != 0 ? new LongSparseArray() : longSparseArray11, (i10 & 2048) != 0 ? new LongSparseArray() : longSparseArray12, (i10 & 4096) != 0 ? new LongSparseArray() : longSparseArray13, (i10 & 8192) != 0 ? new LongSparseArray() : longSparseArray14, (i10 & 16384) != 0 ? new LongSparseArray() : longSparseArray15);
    }
}
