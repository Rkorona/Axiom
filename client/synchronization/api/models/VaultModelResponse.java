package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.Meta;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.Meta$$serializer;
import hv.p;
import java.util.List;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class VaultModelResponse {
    private final Meta meta;
    private final List<VaultApiModel> objects;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.api.models.f
        @Override // iu.a
        public final Object a() {
            return VaultModelResponse._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return VaultModelResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ VaultModelResponse(int i10, Meta meta, List list, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, VaultModelResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.meta = meta;
        this.objects = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(VaultApiModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VaultModelResponse copy$default(VaultModelResponse vaultModelResponse, Meta meta, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            meta = vaultModelResponse.meta;
        }
        if ((i10 & 2) != 0) {
            list = vaultModelResponse.objects;
        }
        return vaultModelResponse.copy(meta, list);
    }

    @hv.o("meta")
    public static /* synthetic */ void getMeta$annotations() {
    }

    @hv.o("objects")
    public static /* synthetic */ void getObjects$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(VaultModelResponse vaultModelResponse, kv.d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, Meta$$serializer.INSTANCE, vaultModelResponse.meta);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), vaultModelResponse.objects);
    }

    public final Meta component1() {
        return this.meta;
    }

    public final List<VaultApiModel> component2() {
        return this.objects;
    }

    public final VaultModelResponse copy(Meta meta, List<VaultApiModel> list) {
        t.f(meta, "meta");
        t.f(list, "objects");
        return new VaultModelResponse(meta, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultModelResponse)) {
            return false;
        }
        VaultModelResponse vaultModelResponse = (VaultModelResponse) obj;
        return t.b(this.meta, vaultModelResponse.meta) && t.b(this.objects, vaultModelResponse.objects);
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final List<VaultApiModel> getObjects() {
        return this.objects;
    }

    public int hashCode() {
        return (this.meta.hashCode() * 31) + this.objects.hashCode();
    }

    public String toString() {
        return "VaultModelResponse(meta=" + this.meta + ", objects=" + this.objects + ")";
    }

    public VaultModelResponse(Meta meta, List<VaultApiModel> list) {
        t.f(meta, "meta");
        t.f(list, "objects");
        this.meta = meta;
        this.objects = list;
    }
}
