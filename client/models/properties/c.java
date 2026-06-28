package com.server.auditor.ssh.client.models.properties;

import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f27932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27934c;

    public c() {
        this(null, null, false, 7, null);
    }

    public final String a() {
        return this.f27933b;
    }

    public final Object b() {
        return this.f27932a;
    }

    public final boolean c() {
        return this.f27934c;
    }

    public final void d() {
        this.f27934c = true;
    }

    public final void e(String str) {
        this.f27933b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.b(this.f27932a, cVar.f27932a) && t.b(this.f27933b, cVar.f27933b) && this.f27934c == cVar.f27934c;
    }

    public final void f(Object obj) {
        this.f27932a = obj;
    }

    public int hashCode() {
        Object obj = this.f27932a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f27933b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f27934c);
    }

    public String toString() {
        return "InheritanceField(value=" + this.f27932a + ", sourceGroupName=" + this.f27933b + ", isHandled=" + this.f27934c + ")";
    }

    public c(Object obj, String str, boolean z10) {
        this.f27932a = obj;
        this.f27933b = str;
        this.f27934c = z10;
    }

    public /* synthetic */ c(Object obj, String str, boolean z10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10);
    }
}
