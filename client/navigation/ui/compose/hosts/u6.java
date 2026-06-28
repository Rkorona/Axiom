package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.database.Column;

/* JADX INFO: loaded from: classes3.dex */
public final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f32277b;

    public u6(String str, Long l10) {
        ju.t.f(str, Column.MULTI_KEY_NAME);
        this.f32276a = str;
        this.f32277b = l10;
    }

    public final Long a() {
        return this.f32277b;
    }

    public final String b() {
        return this.f32276a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return ju.t.b(this.f32276a, u6Var.f32276a) && ju.t.b(this.f32277b, u6Var.f32277b);
    }

    public int hashCode() {
        int iHashCode = this.f32276a.hashCode() * 31;
        Long l10 = this.f32277b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "GroupBreadcrumb(name=" + this.f32276a + ", id=" + this.f32277b + ")";
    }

    public /* synthetic */ u6(String str, Long l10, int i10, ju.k kVar) {
        this(str, (i10 & 2) != 0 ? null : l10);
    }
}
