package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f34965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34967c;

    public f(Long l10, boolean z10, boolean z11) {
        this.f34965a = l10;
        this.f34966b = z10;
        this.f34967c = z11;
    }

    public static /* synthetic */ f b(f fVar, Long l10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = fVar.f34965a;
        }
        if ((i10 & 2) != 0) {
            z10 = fVar.f34966b;
        }
        if ((i10 & 4) != 0) {
            z11 = fVar.f34967c;
        }
        return fVar.a(l10, z10, z11);
    }

    public final f a(Long l10, boolean z10, boolean z11) {
        return new f(l10, z10, z11);
    }

    public final Long c() {
        return this.f34965a;
    }

    public final boolean d() {
        return this.f34967c;
    }

    public final boolean e() {
        return this.f34966b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ju.t.b(this.f34965a, fVar.f34965a) && this.f34966b == fVar.f34966b && this.f34967c == fVar.f34967c;
    }

    public int hashCode() {
        Long l10 = this.f34965a;
        return ((((l10 == null ? 0 : l10.hashCode()) * 31) + Boolean.hashCode(this.f34966b)) * 31) + Boolean.hashCode(this.f34967c);
    }

    public String toString() {
        return "EntityEditingState(editingId=" + this.f34965a + ", isEditing=" + this.f34966b + ", hasUnsavedChanges=" + this.f34967c + ")";
    }

    public /* synthetic */ f(Long l10, boolean z10, boolean z11, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
