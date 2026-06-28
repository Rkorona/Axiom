package com.server.auditor.ssh.client.synchronization.api.models.user;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CentrifugoChannelToken {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String token;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CentrifugoChannelToken$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CentrifugoChannelToken(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, CentrifugoChannelToken$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
    }

    @o("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    public final String getToken() {
        return this.token;
    }

    public CentrifugoChannelToken(String str) {
        t.f(str, "token");
        this.token = str;
    }
}
