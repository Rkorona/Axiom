package com.server.auditor.ssh.client.repositories.auth;

import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg.d f38619a;

    public g(hg.d dVar) {
        t.f(dVar, "insensitiveKeyValueRepository");
        this.f38619a = dVar;
    }

    public final String a() {
        String string = this.f38619a.getString("feature_toggle_encryption_schema", "v3");
        return string == null ? "v3" : string;
    }
}
