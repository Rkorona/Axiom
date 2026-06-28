package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iu.l f34963b;

    public e(String str, iu.l lVar) {
        ju.t.f(str, "editorInstanceId");
        ju.t.f(lVar, "lambda");
        this.f34962a = str;
        this.f34963b = lVar;
    }

    public final String a() {
        return this.f34962a;
    }

    public final iu.l b() {
        return this.f34963b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return ju.t.b(this.f34962a, eVar.f34962a) && ju.t.b(this.f34963b, eVar.f34963b);
    }

    public int hashCode() {
        return (this.f34962a.hashCode() * 31) + this.f34963b.hashCode();
    }

    public String toString() {
        return "DirtyCheckHolder(editorInstanceId=" + this.f34962a + ", lambda=" + this.f34963b + ")";
    }
}
