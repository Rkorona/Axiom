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
public final class ResetPasswordRequestModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String username;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ResetPasswordRequestModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ResetPasswordRequestModel(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, ResetPasswordRequestModel$$serializer.INSTANCE.getDescriptor());
        }
        this.username = str;
    }

    public static /* synthetic */ ResetPasswordRequestModel copy$default(ResetPasswordRequestModel resetPasswordRequestModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resetPasswordRequestModel.username;
        }
        return resetPasswordRequestModel.copy(str);
    }

    @o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    public final String component1() {
        return this.username;
    }

    public final ResetPasswordRequestModel copy(String str) {
        t.f(str, "username");
        return new ResetPasswordRequestModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResetPasswordRequestModel) && t.b(this.username, ((ResetPasswordRequestModel) obj).username);
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.username.hashCode();
    }

    public String toString() {
        return "ResetPasswordRequestModel(username=" + this.username + ")";
    }

    public ResetPasswordRequestModel(String str) {
        t.f(str, "username");
        this.username = str;
    }
}
