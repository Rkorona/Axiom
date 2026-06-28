package com.server.auditor.ssh.client.synchronization.api.models.sso;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class DetectFirebaseActionResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String action;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DetectFirebaseActionResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ DetectFirebaseActionResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, DetectFirebaseActionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
    }

    public static /* synthetic */ DetectFirebaseActionResponse copy$default(DetectFirebaseActionResponse detectFirebaseActionResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = detectFirebaseActionResponse.action;
        }
        return detectFirebaseActionResponse.copy(str);
    }

    @o("action")
    public static /* synthetic */ void getAction$annotations() {
    }

    public final String component1() {
        return this.action;
    }

    public final DetectFirebaseActionResponse copy(String str) {
        t.f(str, "action");
        return new DetectFirebaseActionResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetectFirebaseActionResponse) && t.b(this.action, ((DetectFirebaseActionResponse) obj).action);
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return "DetectFirebaseActionResponse(action=" + this.action + ")";
    }

    public DetectFirebaseActionResponse(String str) {
        t.f(str, "action");
        this.action = str;
    }
}
