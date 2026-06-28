package com.server.auditor.ssh.client.navigation.ui.compose;

/* JADX INFO: loaded from: classes3.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32528c;

    public ja(boolean z10, int i10, int i11) {
        this.f32526a = z10;
        this.f32527b = i10;
        this.f32528c = i11;
    }

    public final int a() {
        return this.f32527b;
    }

    public final int b() {
        return this.f32528c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return this.f32526a == jaVar.f32526a && this.f32527b == jaVar.f32527b && this.f32528c == jaVar.f32528c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f32526a) * 31) + Integer.hashCode(this.f32527b)) * 31) + Integer.hashCode(this.f32528c);
    }

    public String toString() {
        return "TermiusScreenMetrics(isTablet=" + this.f32526a + ", selectedTabWidth=" + this.f32527b + ", unselectedTabWidth=" + this.f32528c + ")";
    }
}
