package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CheckEmailModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String email;
    private final String recaptcha;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return CheckEmailModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CheckEmailModel(int i10, String str, String str2, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, CheckEmailModel$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
        if ((i10 & 2) == 0) {
            this.recaptcha = null;
        } else {
            this.recaptcha = str2;
        }
    }

    public static /* synthetic */ CheckEmailModel copy$default(CheckEmailModel checkEmailModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkEmailModel.email;
        }
        if ((i10 & 2) != 0) {
            str2 = checkEmailModel.recaptcha;
        }
        return checkEmailModel.copy(str, str2);
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @o("recaptcha")
    public static /* synthetic */ void getRecaptcha$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CheckEmailModel checkEmailModel, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, checkEmailModel.email);
        if (!dVar.E(fVar, 1) && checkEmailModel.recaptcha == null) {
            return;
        }
        dVar.v(fVar, 1, x2.f64817a, checkEmailModel.recaptcha);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.recaptcha;
    }

    public final CheckEmailModel copy(String str, String str2) {
        t.f(str, "email");
        return new CheckEmailModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckEmailModel)) {
            return false;
        }
        CheckEmailModel checkEmailModel = (CheckEmailModel) obj;
        return t.b(this.email, checkEmailModel.email) && t.b(this.recaptcha, checkEmailModel.recaptcha);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRecaptcha() {
        return this.recaptcha;
    }

    public int hashCode() {
        int iHashCode = this.email.hashCode() * 31;
        String str = this.recaptcha;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CheckEmailModel(email=" + this.email + ", recaptcha=" + this.recaptcha + ")";
    }

    public CheckEmailModel(String str, String str2) {
        t.f(str, "email");
        this.email = str;
        this.recaptcha = str2;
    }

    public /* synthetic */ CheckEmailModel(String str, String str2, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
