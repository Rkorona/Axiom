package com.server.auditor.ssh.client.adapters;

import android.net.Uri;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.widget.ProgressButton;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f21340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f21341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Uri f21342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f21343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f21344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f21345r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f21346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f21347t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ProgressButton.b f21348u;

    public /* synthetic */ m(int i10, String str, String str2, String str3, boolean z10, String str4, String str5, Uri uri, int i11, String str6, String str7, int i12, String str8, ProgressButton.b bVar, int i13, ju.k kVar) {
        this(i10, str, str2, str3, z10, str4, str5, (i13 & 128) != 0 ? null : uri, i11, str6, str7, i12, (i13 & 4096) != 0 ? null : str8, (i13 & 8192) != 0 ? ProgressButton.b.C0663b.f46550a : bVar);
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String a() {
        return this.f21341n;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String b() {
        return this.f21337j;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public int c() {
        return this.f21335h;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public boolean d() {
        return this.f21339l;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String e() {
        return this.f21338k;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m) || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return ju.t.b(this.f21342o, mVar.f21342o) && this.f21346s == mVar.f21346s;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String f() {
        return this.f21336i;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String g() {
        return this.f21340m;
    }

    public final int h() {
        return this.f21343p;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Uri uri = this.f21342o;
        return ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f21346s;
    }

    public final String i() {
        return this.f21344q;
    }

    public final Uri j() {
        return this.f21342o;
    }

    public final ProgressButton.b k() {
        return this.f21348u;
    }

    public final String l() {
        return this.f21347t;
    }

    public final String m() {
        return this.f21345r;
    }

    public final int n() {
        return this.f21346s;
    }

    public final void o(ProgressButton.b bVar) {
        ju.t.f(bVar, "<set-?>");
        this.f21348u = bVar;
    }

    public final void p(String str) {
        this.f21347t = str;
    }

    public String toString() {
        return "ConfirmAccessNotificationModel(id=" + this.f21335h + ", title=" + this.f21336i + ", description=" + this.f21337j + ", time=" + this.f21338k + ", showed=" + this.f21339l + ", type=" + this.f21340m + ", buttonName=" + this.f21341n + ", avatarURI=" + this.f21342o + ", avatarColorResId=" + this.f21343p + ", avatarInitials=" + this.f21344q + ", teamMemberFullName=" + this.f21345r + ", teamMemberUserId=" + this.f21346s + ", message=" + this.f21347t + ", buttonState=" + this.f21348u + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i10, String str, String str2, String str3, boolean z10, String str4, String str5, Uri uri, int i11, String str6, String str7, int i12, String str8, ProgressButton.b bVar) {
        super(i10, str, str2, str3, z10, str4, str5);
        ju.t.f(str, "title");
        ju.t.f(str2, "description");
        ju.t.f(str3, "time");
        ju.t.f(str4, Column.TYPE);
        ju.t.f(str6, "avatarInitials");
        ju.t.f(str7, "teamMemberFullName");
        ju.t.f(bVar, "buttonState");
        this.f21335h = i10;
        this.f21336i = str;
        this.f21337j = str2;
        this.f21338k = str3;
        this.f21339l = z10;
        this.f21340m = str4;
        this.f21341n = str5;
        this.f21342o = uri;
        this.f21343p = i11;
        this.f21344q = str6;
        this.f21345r = str7;
        this.f21346s = i12;
        this.f21347t = str8;
        this.f21348u = bVar;
    }
}
