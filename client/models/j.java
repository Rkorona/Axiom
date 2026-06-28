package com.server.auditor.ssh.client.models;

import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypedSessionId f27907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HostIconUtil.OsModelType f27908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final URI f27910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f27912f;

    public j(TypedSessionId typedSessionId, HostIconUtil.OsModelType osModelType, String str, URI uri, String str2, String str3) {
        ju.t.f(typedSessionId, "sessionId");
        ju.t.f(osModelType, "osModelType");
        this.f27907a = typedSessionId;
        this.f27908b = osModelType;
        this.f27909c = str;
        this.f27910d = uri;
        this.f27911e = str2;
        this.f27912f = str3;
    }

    public final String a() {
        return this.f27911e;
    }

    public final String b() {
        return this.f27909c;
    }

    public final HostIconUtil.OsModelType c() {
        return this.f27908b;
    }

    public final TypedSessionId d() {
        return this.f27907a;
    }

    public final String e() {
        return this.f27912f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return ju.t.b(this.f27907a, jVar.f27907a) && this.f27908b == jVar.f27908b && ju.t.b(this.f27909c, jVar.f27909c) && ju.t.b(this.f27910d, jVar.f27910d) && ju.t.b(this.f27911e, jVar.f27911e) && ju.t.b(this.f27912f, jVar.f27912f);
    }

    public final URI f() {
        return this.f27910d;
    }

    public int hashCode() {
        int iHashCode = ((this.f27907a.hashCode() * 31) + this.f27908b.hashCode()) * 31;
        String str = this.f27909c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        URI uri = this.f27910d;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.f27911e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27912f;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "EssentialConnectionItem(sessionId=" + this.f27907a + ", osModelType=" + this.f27908b + ", colorScheme=" + this.f27909c + ", uri=" + this.f27910d + ", alias=" + this.f27911e + ", subtitle=" + this.f27912f + ")";
    }

    public /* synthetic */ j(TypedSessionId typedSessionId, HostIconUtil.OsModelType osModelType, String str, URI uri, String str2, String str3, int i10, ju.k kVar) {
        this(typedSessionId, osModelType, str, uri, str2, (i10 & 32) != 0 ? null : str3);
    }
}
