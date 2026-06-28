package com.server.auditor.ssh.client.synchronization;

import ju.t;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkModelCreatorFactory {
    public static final int $stable = 0;

    public final BulkModelCreator createBulkModelCreator(rg.h hVar, v vVar) {
        t.f(hVar, "remoteCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        return new BulkModelCreator(hVar, vVar);
    }
}
