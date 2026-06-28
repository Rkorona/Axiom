package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.database.Column;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.h1;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class VaultApiModel {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39032id;
    private boolean isDefault;
    private final String name;
    private final Long originalKey;
    private String role;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return VaultApiModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ VaultApiModel(int i10, String str, long j10, boolean z10, Long l10, String str2, s2 s2Var) {
        if (23 != (i10 & 23)) {
            d2.a(i10, 23, VaultApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.f39032id = j10;
        this.isDefault = z10;
        if ((i10 & 8) == 0) {
            this.originalKey = null;
        } else {
            this.originalKey = l10;
        }
        this.role = str2;
    }

    public static /* synthetic */ VaultApiModel copy$default(VaultApiModel vaultApiModel, String str, long j10, boolean z10, Long l10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vaultApiModel.name;
        }
        if ((i10 & 2) != 0) {
            j10 = vaultApiModel.f39032id;
        }
        if ((i10 & 4) != 0) {
            z10 = vaultApiModel.isDefault;
        }
        if ((i10 & 8) != 0) {
            l10 = vaultApiModel.originalKey;
        }
        if ((i10 & 16) != 0) {
            str2 = vaultApiModel.role;
        }
        String str3 = str2;
        boolean z11 = z10;
        return vaultApiModel.copy(str, j10, z11, l10, str3);
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    @o("original_key")
    public static /* synthetic */ void getOriginalKey$annotations() {
    }

    @o("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    @o("is_default")
    public static /* synthetic */ void isDefault$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(VaultApiModel vaultApiModel, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, vaultApiModel.name);
        dVar.q(fVar, 1, vaultApiModel.f39032id);
        dVar.u(fVar, 2, vaultApiModel.isDefault);
        if (dVar.E(fVar, 3) || vaultApiModel.originalKey != null) {
            dVar.v(fVar, 3, h1.f64699a, vaultApiModel.originalKey);
        }
        dVar.f(fVar, 4, vaultApiModel.role);
    }

    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.f39032id;
    }

    public final boolean component3() {
        return this.isDefault;
    }

    public final Long component4() {
        return this.originalKey;
    }

    public final String component5() {
        return this.role;
    }

    public final VaultApiModel copy(String str, long j10, boolean z10, Long l10, String str2) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str2, "role");
        return new VaultApiModel(str, j10, z10, l10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultApiModel)) {
            return false;
        }
        VaultApiModel vaultApiModel = (VaultApiModel) obj;
        return t.b(this.name, vaultApiModel.name) && this.f39032id == vaultApiModel.f39032id && this.isDefault == vaultApiModel.isDefault && t.b(this.originalKey, vaultApiModel.originalKey) && t.b(this.role, vaultApiModel.role);
    }

    public final long getId() {
        return this.f39032id;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getOriginalKey() {
        return this.originalKey;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + Long.hashCode(this.f39032id)) * 31) + Boolean.hashCode(this.isDefault)) * 31;
        Long l10 = this.originalKey;
        return ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.role.hashCode();
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final void setDefault(boolean z10) {
        this.isDefault = z10;
    }

    public final void setRole(String str) {
        t.f(str, "<set-?>");
        this.role = str;
    }

    public String toString() {
        return "VaultApiModel(name=" + this.name + ", id=" + this.f39032id + ", isDefault=" + this.isDefault + ", originalKey=" + this.originalKey + ", role=" + this.role + ")";
    }

    public VaultApiModel(String str, long j10, boolean z10, Long l10, String str2) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str2, "role");
        this.name = str;
        this.f39032id = j10;
        this.isDefault = z10;
        this.originalKey = l10;
        this.role = str2;
    }

    public /* synthetic */ VaultApiModel(String str, long j10, boolean z10, Long l10, String str2, int i10, k kVar) {
        this(str, j10, z10, (i10 & 8) != 0 ? null : l10, str2);
    }
}
