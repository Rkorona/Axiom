package com.server.auditor.ssh.client.models;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f27985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27988d;

    public x(long j10, int i10, int i11, int i12) {
        this.f27985a = j10;
        this.f27986b = i10;
        this.f27987c = i11;
        this.f27988d = i12;
    }

    public final int a() {
        return this.f27988d;
    }

    public final int b() {
        return this.f27986b;
    }

    public final long c() {
        return this.f27985a;
    }

    public final int d() {
        return this.f27987c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f27985a == xVar.f27985a && this.f27986b == xVar.f27986b && this.f27987c == xVar.f27987c && this.f27988d == xVar.f27988d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f27985a) * 31) + Integer.hashCode(this.f27986b)) * 31) + Integer.hashCode(this.f27987c)) * 31) + Integer.hashCode(this.f27988d);
    }

    public String toString() {
        return "TwoFactorProviderItem(id=" + this.f27985a + ", icon=" + this.f27986b + ", title=" + this.f27987c + ", description=" + this.f27988d + ")";
    }
}
