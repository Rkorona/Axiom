package com.server.auditor.ssh.client.interactors;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hg.d f27383b;

    public f0(com.server.auditor.ssh.client.app.a aVar, hg.d dVar) {
        ju.t.f(aVar, "termiusStorage");
        ju.t.f(dVar, "insensitiveKeyValueRepository");
        this.f27382a = aVar;
        this.f27383b = dVar;
    }

    public final String a() {
        byte[] bArrB0 = this.f27382a.b0();
        if (bArrB0 == null) {
            bArrB0 = new byte[0];
        }
        return new String(bArrB0, su.d.f78241b);
    }

    public final String b() {
        byte[] bArrC0 = this.f27382a.c0();
        if (bArrC0 == null) {
            bArrC0 = new byte[0];
        }
        return new String(bArrC0, su.d.f78241b);
    }

    public final long c() {
        return this.f27383b.getInt("team_owner_id", 0);
    }
}
