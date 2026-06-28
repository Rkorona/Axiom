package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.database.Column;

/* JADX INFO: loaded from: classes3.dex */
public final class we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32348c;

    public we(long j10, String str, boolean z10) {
        ju.t.f(str, Column.MULTI_KEY_NAME);
        this.f32346a = j10;
        this.f32347b = str;
        this.f32348c = z10;
    }

    public final long a() {
        return this.f32346a;
    }

    public final String b() {
        return this.f32347b;
    }

    public final boolean c() {
        return this.f32348c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return this.f32346a == weVar.f32346a && ju.t.b(this.f32347b, weVar.f32347b) && this.f32348c == weVar.f32348c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f32346a) * 31) + this.f32347b.hashCode()) * 31) + Boolean.hashCode(this.f32348c);
    }

    public String toString() {
        return "TagItemModel(id=" + this.f32346a + ", name=" + this.f32347b + ", isSelected=" + this.f32348c + ")";
    }
}
