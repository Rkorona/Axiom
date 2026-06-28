package com.server.auditor.ssh.client.synchronization.api.models.teams;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CheckoutPageGenerationResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String url;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CheckoutPageGenerationResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CheckoutPageGenerationResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, CheckoutPageGenerationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
    }

    public static /* synthetic */ CheckoutPageGenerationResponse copy$default(CheckoutPageGenerationResponse checkoutPageGenerationResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkoutPageGenerationResponse.url;
        }
        return checkoutPageGenerationResponse.copy(str);
    }

    @o("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    public final String component1() {
        return this.url;
    }

    public final CheckoutPageGenerationResponse copy(String str) {
        t.f(str, "url");
        return new CheckoutPageGenerationResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutPageGenerationResponse) && t.b(this.url, ((CheckoutPageGenerationResponse) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "CheckoutPageGenerationResponse(url=" + this.url + ")";
    }

    public CheckoutPageGenerationResponse(String str) {
        t.f(str, "url");
        this.url = str;
    }
}
