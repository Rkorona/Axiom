package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SsoDomainUser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String encryptionSchema;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return SsoDomainUser$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SsoDomainUser(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SsoDomainUser$$serializer.INSTANCE.getDescriptor());
        }
        this.encryptionSchema = str;
    }

    public static /* synthetic */ SsoDomainUser copy$default(SsoDomainUser ssoDomainUser, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ssoDomainUser.encryptionSchema;
        }
        return ssoDomainUser.copy(str);
    }

    @o("encryption_schema")
    public static /* synthetic */ void getEncryptionSchema$annotations() {
    }

    public final String component1() {
        return this.encryptionSchema;
    }

    public final SsoDomainUser copy(String str) {
        t.f(str, "encryptionSchema");
        return new SsoDomainUser(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SsoDomainUser) && t.b(this.encryptionSchema, ((SsoDomainUser) obj).encryptionSchema);
    }

    public final String getEncryptionSchema() {
        return this.encryptionSchema;
    }

    public int hashCode() {
        return this.encryptionSchema.hashCode();
    }

    public String toString() {
        return "SsoDomainUser(encryptionSchema=" + this.encryptionSchema + ")";
    }

    public SsoDomainUser(String str) {
        t.f(str, "encryptionSchema");
        this.encryptionSchema = str;
    }
}
