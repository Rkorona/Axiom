package com.server.auditor.ssh.client.models;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27901a;

    public d(boolean z10) {
        this.f27901a = z10;
    }

    public final boolean a() {
        return this.f27901a;
    }

    public final void b(boolean z10) {
        this.f27901a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f27901a == ((d) obj).f27901a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f27901a);
    }

    public String toString() {
        return "ActiveDevicesHeaderState(isAnimated=" + this.f27901a + ")";
    }

    public /* synthetic */ d(boolean z10, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
