package com.server.auditor.ssh.client.fragments.hostngroups;

import com.crystalnix.termius.libtermius.sftp.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f25162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f25165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f25166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f25168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f25169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f25170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f25171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f25172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f25173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f25174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f25175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f25176o;

    public n1(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15) {
        ju.t.f(list, "groupList");
        ju.t.f(list2, "sshConfigList");
        ju.t.f(list3, "telnetConfigList");
        ju.t.f(list4, "hostList");
        ju.t.f(list5, "tagList");
        ju.t.f(list6, "tagHostList");
        ju.t.f(list7, "identityList");
        ju.t.f(list8, "packageList");
        ju.t.f(list9, "snippetList");
        ju.t.f(list10, "proxyList");
        ju.t.f(list11, "chainHostList");
        ju.t.f(list12, "sharedSshConfigIdentityList");
        ju.t.f(list13, "sharedTelnetConfigIdentityList");
        ju.t.f(list14, "sshKeysList");
        ju.t.f(list15, "sshCertificatesList");
        this.f25162a = list;
        this.f25163b = list2;
        this.f25164c = list3;
        this.f25165d = list4;
        this.f25166e = list5;
        this.f25167f = list6;
        this.f25168g = list7;
        this.f25169h = list8;
        this.f25170i = list9;
        this.f25171j = list10;
        this.f25172k = list11;
        this.f25173l = list12;
        this.f25174m = list13;
        this.f25175n = list14;
        this.f25176o = list15;
    }

    public final List a() {
        return this.f25172k;
    }

    public final List b() {
        return this.f25162a;
    }

    public final List c() {
        return this.f25165d;
    }

    public final List d() {
        return this.f25168g;
    }

    public final List e() {
        return this.f25169h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return ju.t.b(this.f25162a, n1Var.f25162a) && ju.t.b(this.f25163b, n1Var.f25163b) && ju.t.b(this.f25164c, n1Var.f25164c) && ju.t.b(this.f25165d, n1Var.f25165d) && ju.t.b(this.f25166e, n1Var.f25166e) && ju.t.b(this.f25167f, n1Var.f25167f) && ju.t.b(this.f25168g, n1Var.f25168g) && ju.t.b(this.f25169h, n1Var.f25169h) && ju.t.b(this.f25170i, n1Var.f25170i) && ju.t.b(this.f25171j, n1Var.f25171j) && ju.t.b(this.f25172k, n1Var.f25172k) && ju.t.b(this.f25173l, n1Var.f25173l) && ju.t.b(this.f25174m, n1Var.f25174m) && ju.t.b(this.f25175n, n1Var.f25175n) && ju.t.b(this.f25176o, n1Var.f25176o);
    }

    public final List f() {
        return this.f25171j;
    }

    public final List g() {
        return this.f25173l;
    }

    public final List h() {
        return this.f25174m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f25162a.hashCode() * 31) + this.f25163b.hashCode()) * 31) + this.f25164c.hashCode()) * 31) + this.f25165d.hashCode()) * 31) + this.f25166e.hashCode()) * 31) + this.f25167f.hashCode()) * 31) + this.f25168g.hashCode()) * 31) + this.f25169h.hashCode()) * 31) + this.f25170i.hashCode()) * 31) + this.f25171j.hashCode()) * 31) + this.f25172k.hashCode()) * 31) + this.f25173l.hashCode()) * 31) + this.f25174m.hashCode()) * 31) + this.f25175n.hashCode()) * 31) + this.f25176o.hashCode();
    }

    public final List i() {
        return this.f25170i;
    }

    public final List j() {
        return this.f25176o;
    }

    public final List k() {
        return this.f25163b;
    }

    public final List l() {
        return this.f25175n;
    }

    public final List m() {
        return this.f25167f;
    }

    public final List n() {
        return this.f25166e;
    }

    public final List o() {
        return this.f25164c;
    }

    public String toString() {
        return "SharingResult(groupList=" + this.f25162a + ", sshConfigList=" + this.f25163b + ", telnetConfigList=" + this.f25164c + ", hostList=" + this.f25165d + ", tagList=" + this.f25166e + ", tagHostList=" + this.f25167f + ", identityList=" + this.f25168g + ", packageList=" + this.f25169h + ", snippetList=" + this.f25170i + ", proxyList=" + this.f25171j + ", chainHostList=" + this.f25172k + ", sharedSshConfigIdentityList=" + this.f25173l + ", sharedTelnetConfigIdentityList=" + this.f25174m + ", sshKeysList=" + this.f25175n + ", sshCertificatesList=" + this.f25176o + ")";
    }

    public /* synthetic */ n1(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list, (i10 & 2) != 0 ? new ArrayList() : list2, (i10 & 4) != 0 ? new ArrayList() : list3, (i10 & 8) != 0 ? new ArrayList() : list4, (i10 & 16) != 0 ? new ArrayList() : list5, (i10 & 32) != 0 ? new ArrayList() : list6, (i10 & 64) != 0 ? new ArrayList() : list7, (i10 & 128) != 0 ? new ArrayList() : list8, (i10 & 256) != 0 ? new ArrayList() : list9, (i10 & File.FLAG_O_TRUNC) != 0 ? new ArrayList() : list10, (i10 & File.FLAG_O_APPEND) != 0 ? new ArrayList() : list11, (i10 & 2048) != 0 ? new ArrayList() : list12, (i10 & 4096) != 0 ? new ArrayList() : list13, (i10 & 8192) != 0 ? new ArrayList() : list14, (i10 & 16384) != 0 ? new ArrayList() : list15);
    }
}
