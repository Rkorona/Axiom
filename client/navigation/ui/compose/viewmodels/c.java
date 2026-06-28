package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import c2.n1;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypedSessionId f34952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jo.a f34953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f34954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f34955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f34956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f34957h;

    public /* synthetic */ c(String str, String str2, TypedSessionId typedSessionId, jo.a aVar, long j10, long j11, long j12, boolean z10, ju.k kVar) {
        this(str, str2, typedSessionId, aVar, j10, j11, j12, z10);
    }

    public static /* synthetic */ c b(c cVar, String str, String str2, TypedSessionId typedSessionId, jo.a aVar, long j10, long j11, long j12, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f34950a;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.f34951b;
        }
        if ((i10 & 4) != 0) {
            typedSessionId = cVar.f34952c;
        }
        if ((i10 & 8) != 0) {
            aVar = cVar.f34953d;
        }
        if ((i10 & 16) != 0) {
            j10 = cVar.f34954e;
        }
        if ((i10 & 32) != 0) {
            j11 = cVar.f34955f;
        }
        if ((i10 & 64) != 0) {
            j12 = cVar.f34956g;
        }
        if ((i10 & 128) != 0) {
            z10 = cVar.f34957h;
        }
        boolean z11 = z10;
        long j13 = j12;
        long j14 = j11;
        long j15 = j10;
        return cVar.a(str, str2, typedSessionId, aVar, j15, j14, j13, z11);
    }

    public final c a(String str, String str2, TypedSessionId typedSessionId, jo.a aVar, long j10, long j11, long j12, boolean z10) {
        ju.t.f(str, "title");
        ju.t.f(str2, "subtitle");
        ju.t.f(typedSessionId, "connectionId");
        ju.t.f(aVar, "hostIcon");
        return new c(str, str2, typedSessionId, aVar, j10, j11, j12, z10, null);
    }

    public final long c() {
        return this.f34954e;
    }

    public final TypedSessionId d() {
        return this.f34952c;
    }

    public final long e() {
        return this.f34955f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return ju.t.b(this.f34950a, cVar.f34950a) && ju.t.b(this.f34951b, cVar.f34951b) && ju.t.b(this.f34952c, cVar.f34952c) && ju.t.b(this.f34953d, cVar.f34953d) && n1.p(this.f34954e, cVar.f34954e) && n1.p(this.f34955f, cVar.f34955f) && n1.p(this.f34956g, cVar.f34956g) && this.f34957h == cVar.f34957h;
    }

    public final jo.a f() {
        return this.f34953d;
    }

    public final String g() {
        return this.f34951b;
    }

    public final long h() {
        return this.f34956g;
    }

    public int hashCode() {
        return (((((((((((((this.f34950a.hashCode() * 31) + this.f34951b.hashCode()) * 31) + this.f34952c.hashCode()) * 31) + this.f34953d.hashCode()) * 31) + n1.v(this.f34954e)) * 31) + n1.v(this.f34955f)) * 31) + n1.v(this.f34956g)) * 31) + Boolean.hashCode(this.f34957h);
    }

    public final String i() {
        return this.f34950a;
    }

    public final boolean j() {
        return this.f34957h;
    }

    public String toString() {
        return "ConnectionStyle(title=" + this.f34950a + ", subtitle=" + this.f34951b + ", connectionId=" + this.f34952c + ", hostIcon=" + this.f34953d + ", backgroundColor=" + n1.w(this.f34954e) + ", foregroundColor=" + n1.w(this.f34955f) + ", terminalUIColor=" + n1.w(this.f34956g) + ", isSelected=" + this.f34957h + ")";
    }

    private c(String str, String str2, TypedSessionId typedSessionId, jo.a aVar, long j10, long j11, long j12, boolean z10) {
        ju.t.f(str, "title");
        ju.t.f(str2, "subtitle");
        ju.t.f(typedSessionId, "connectionId");
        ju.t.f(aVar, "hostIcon");
        this.f34950a = str;
        this.f34951b = str2;
        this.f34952c = typedSessionId;
        this.f34953d = aVar;
        this.f34954e = j10;
        this.f34955f = j11;
        this.f34956g = j12;
        this.f34957h = z10;
    }
}
