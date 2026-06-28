package com.server.auditor.ssh.client.interactors;

import android.util.Base64;
import javax.crypto.SecretKey;
import yg.a;
import zg.c;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27439b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27440c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27441a;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public i(com.server.auditor.ssh.client.app.a aVar) {
        ju.t.f(aVar, "termiusStorage");
        this.f27441a = aVar;
    }

    public final rg.t a(boolean z10, dq.s sVar) {
        ju.t.f(sVar, "personalVaultKeyData");
        rg.d dVar = new rg.d(sVar.c(), sVar.b(), sVar.a(), null, new a.C1401a());
        SecretKey secretKeyJ = this.f27441a.J();
        ju.t.e(secretKeyJ, "getEncryptionKeySyncSafely(...)");
        SecretKey secretKeyK = this.f27441a.K();
        ju.t.e(secretKeyK, "getHMacKeySyncSafely(...)");
        byte[] bArrDecode = Base64.decode(this.f27441a.C(), 2);
        ju.t.e(bArrDecode, "decode(...)");
        byte[] bArrDecode2 = Base64.decode(this.f27441a.B(), 2);
        ju.t.e(bArrDecode2, "decode(...)");
        rg.t tVar = new rg.t(z10, dVar, new rg.o(secretKeyJ, secretKeyK, bArrDecode, bArrDecode2, new c.a()));
        if (tVar.j() == 0) {
            return tVar;
        }
        throw new IllegalStateException("Personal cryptor initialization failed");
    }
}
