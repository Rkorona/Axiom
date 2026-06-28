package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

/* JADX INFO: loaded from: classes3.dex */
public final class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f31828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31830c;

    public oe(Long l10, String str, boolean z10) {
        this.f31828a = l10;
        this.f31829b = str;
        this.f31830c = z10;
    }

    public final Long a() {
        return this.f31828a;
    }

    public final String b() {
        return this.f31829b;
    }

    public final boolean c() {
        return this.f31830c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return ju.t.b(this.f31828a, oeVar.f31828a) && ju.t.b(this.f31829b, oeVar.f31829b) && this.f31830c == oeVar.f31830c;
    }

    public int hashCode() {
        Long l10 = this.f31828a;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.f31829b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f31830c);
    }

    public String toString() {
        return "OpenHostEditorOneTimeSignal(hostId=" + this.f31828a + ", hostPort=" + this.f31829b + ", startConnection=" + this.f31830c + ")";
    }

    public /* synthetic */ oe(Long l10, String str, boolean z10, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10);
    }
}
