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
public final class DetectFirebaseActionModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String firebaseToken;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DetectFirebaseActionModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ DetectFirebaseActionModel(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, DetectFirebaseActionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.firebaseToken = str;
    }

    public static /* synthetic */ DetectFirebaseActionModel copy$default(DetectFirebaseActionModel detectFirebaseActionModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = detectFirebaseActionModel.firebaseToken;
        }
        return detectFirebaseActionModel.copy(str);
    }

    @o("firebase_token")
    public static /* synthetic */ void getFirebaseToken$annotations() {
    }

    public final String component1() {
        return this.firebaseToken;
    }

    public final DetectFirebaseActionModel copy(String str) {
        t.f(str, "firebaseToken");
        return new DetectFirebaseActionModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetectFirebaseActionModel) && t.b(this.firebaseToken, ((DetectFirebaseActionModel) obj).firebaseToken);
    }

    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    public int hashCode() {
        return this.firebaseToken.hashCode();
    }

    public String toString() {
        return "DetectFirebaseActionModel(firebaseToken=" + this.firebaseToken + ")";
    }

    public DetectFirebaseActionModel(String str) {
        t.f(str, "firebaseToken");
        this.firebaseToken = str;
    }
}
