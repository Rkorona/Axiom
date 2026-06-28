package com.server.auditor.ssh.client.synchronization.api.models.newcrypto;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class StaleMemberObject {
    private String email;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return StaleMemberObject$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ StaleMemberObject(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, StaleMemberObject$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
    }

    public static /* synthetic */ StaleMemberObject copy$default(StaleMemberObject staleMemberObject, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = staleMemberObject.email;
        }
        return staleMemberObject.copy(str);
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    public final String component1() {
        return this.email;
    }

    public final StaleMemberObject copy(String str) {
        t.f(str, "email");
        return new StaleMemberObject(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaleMemberObject) && t.b(this.email, ((StaleMemberObject) obj).email);
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public final void setEmail(String str) {
        t.f(str, "<set-?>");
        this.email = str;
    }

    public String toString() {
        return "StaleMemberObject(email=" + this.email + ")";
    }

    public StaleMemberObject(String str) {
        t.f(str, "email");
        this.email = str;
    }
}
