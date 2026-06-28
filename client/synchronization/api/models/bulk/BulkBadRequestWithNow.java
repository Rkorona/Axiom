package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class BulkBadRequestWithNow {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String now;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return BulkBadRequestWithNow.serializer;
        }

        public final c serializer() {
            return BulkBadRequestWithNow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public /* synthetic */ BulkBadRequestWithNow(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, BulkBadRequestWithNow$$serializer.INSTANCE.getDescriptor());
        }
        this.now = str;
    }

    public static /* synthetic */ BulkBadRequestWithNow copy$default(BulkBadRequestWithNow bulkBadRequestWithNow, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bulkBadRequestWithNow.now;
        }
        return bulkBadRequestWithNow.copy(str);
    }

    @o("now")
    public static /* synthetic */ void getNow$annotations() {
    }

    public final String component1() {
        return this.now;
    }

    public final BulkBadRequestWithNow copy(String str) {
        t.f(str, "now");
        return new BulkBadRequestWithNow(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BulkBadRequestWithNow) && t.b(this.now, ((BulkBadRequestWithNow) obj).now);
    }

    public final String getNow() {
        return this.now;
    }

    public int hashCode() {
        return this.now.hashCode();
    }

    public String toString() {
        return "BulkBadRequestWithNow(now=" + this.now + ")";
    }

    public BulkBadRequestWithNow(String str) {
        t.f(str, "now");
        this.now = str;
    }
}
