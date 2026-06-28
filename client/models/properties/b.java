package com.server.auditor.ssh.client.models.properties;

import com.server.auditor.ssh.client.database.Column;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27931c;

    public b(String str, String str2, int i10) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str2, SerializableEvent.VALUE_FIELD);
        this.f27929a = str;
        this.f27930b = str2;
        this.f27931c = i10;
    }

    public final int a() {
        return this.f27931c;
    }

    public final String b() {
        return this.f27929a;
    }

    public final String c() {
        return this.f27930b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.b(this.f27929a, bVar.f27929a) && t.b(this.f27930b, bVar.f27930b) && this.f27931c == bVar.f27931c;
    }

    public int hashCode() {
        return (((this.f27929a.hashCode() * 31) + this.f27930b.hashCode()) * 31) + Integer.hashCode(this.f27931c);
    }

    public String toString() {
        return "EnvironmentVariablesEditingModel(name=" + this.f27929a + ", value=" + this.f27930b + ", index=" + this.f27931c + ")";
    }
}
