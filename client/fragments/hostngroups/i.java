package com.server.auditor.ssh.client.fragments.hostngroups;

import com.server.auditor.ssh.client.models.Host;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Host f25085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25088e;

    public /* synthetic */ i(Host host, int i10, boolean z10, boolean z11, int i11, ju.k kVar) {
        this(host, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11);
    }

    public final int b() {
        return this.f25086c;
    }

    public final boolean c() {
        return this.f25088e;
    }

    public final boolean d() {
        return this.f25087d;
    }

    public final Host e() {
        return this.f25085b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return ju.t.b(this.f25085b, iVar.f25085b) && this.f25086c == iVar.f25086c && this.f25087d == iVar.f25087d && this.f25088e == iVar.f25088e;
    }

    public int hashCode() {
        return (((((this.f25085b.hashCode() * 31) + Integer.hashCode(this.f25086c)) * 31) + Boolean.hashCode(this.f25087d)) * 31) + Boolean.hashCode(this.f25088e);
    }

    public String toString() {
        return "HostContainer(host=" + this.f25085b + ", countActiveConnections=" + this.f25086c + ", hasConnecting=" + this.f25087d + ", hasConnected=" + this.f25088e + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Host host, int i10, boolean z10, boolean z11) {
        super(0, null);
        ju.t.f(host, "host");
        this.f25085b = host;
        this.f25086c = i10;
        this.f25087d = z10;
        this.f25088e = z11;
    }
}
