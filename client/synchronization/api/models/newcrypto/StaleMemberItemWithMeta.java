package com.server.auditor.ssh.client.synchronization.api.models.newcrypto;

import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.StaleMemberItemWithMeta;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class StaleMemberItemWithMeta {
    private Meta meta;
    private List<StaleMemberObject> objects;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, o.b(r.f82638b, new a() { // from class: bn.b
        @Override // iu.a
        public final Object a() {
            return StaleMemberItemWithMeta._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return StaleMemberItemWithMeta$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ StaleMemberItemWithMeta(int i10, Meta meta, List list, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, StaleMemberItemWithMeta$$serializer.INSTANCE.getDescriptor());
        }
        this.meta = meta;
        this.objects = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(StaleMemberObject$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaleMemberItemWithMeta copy$default(StaleMemberItemWithMeta staleMemberItemWithMeta, Meta meta, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            meta = staleMemberItemWithMeta.meta;
        }
        if ((i10 & 2) != 0) {
            list = staleMemberItemWithMeta.objects;
        }
        return staleMemberItemWithMeta.copy(meta, list);
    }

    @hv.o("meta")
    public static /* synthetic */ void getMeta$annotations() {
    }

    @hv.o("objects")
    public static /* synthetic */ void getObjects$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(StaleMemberItemWithMeta staleMemberItemWithMeta, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, Meta$$serializer.INSTANCE, staleMemberItemWithMeta.meta);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), staleMemberItemWithMeta.objects);
    }

    public final Meta component1() {
        return this.meta;
    }

    public final List<StaleMemberObject> component2() {
        return this.objects;
    }

    public final StaleMemberItemWithMeta copy(Meta meta, List<StaleMemberObject> list) {
        t.f(meta, "meta");
        t.f(list, "objects");
        return new StaleMemberItemWithMeta(meta, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaleMemberItemWithMeta)) {
            return false;
        }
        StaleMemberItemWithMeta staleMemberItemWithMeta = (StaleMemberItemWithMeta) obj;
        return t.b(this.meta, staleMemberItemWithMeta.meta) && t.b(this.objects, staleMemberItemWithMeta.objects);
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final List<StaleMemberObject> getObjects() {
        return this.objects;
    }

    public int hashCode() {
        return (this.meta.hashCode() * 31) + this.objects.hashCode();
    }

    public final void setMeta(Meta meta) {
        t.f(meta, "<set-?>");
        this.meta = meta;
    }

    public final void setObjects(List<StaleMemberObject> list) {
        t.f(list, "<set-?>");
        this.objects = list;
    }

    public String toString() {
        return "StaleMemberItemWithMeta(meta=" + this.meta + ", objects=" + this.objects + ")";
    }

    public StaleMemberItemWithMeta(Meta meta, List<StaleMemberObject> list) {
        t.f(meta, "meta");
        t.f(list, "objects");
        this.meta = meta;
        this.objects = list;
    }
}
