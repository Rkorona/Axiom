package com.server.auditor.ssh.client.interactors;

import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
final class InAppMessageForceActionIds {
    private final List<Integer> list;
    public static final b Companion = new b(null);
    private static final ut.n[] $childSerializers = {ut.o.b(ut.r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.interactors.x
        @Override // iu.a
        public final Object a() {
            return InAppMessageForceActionIds._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27250b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f27249a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.interactors.InAppMessageForceActionIds", aVar, 1);
            i2Var.r("list", false);
            descriptor = i2Var;
            f27250b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InAppMessageForceActionIds deserialize(kv.e eVar) {
            List list;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            ut.n[] nVarArr = InAppMessageForceActionIds.$childSerializers;
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                list = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new hv.e0(iD);
                        }
                        list2 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new InAppMessageForceActionIds(i10, list, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, InAppMessageForceActionIds inAppMessageForceActionIds) {
            ju.t.f(fVar, "encoder");
            ju.t.f(inAppMessageForceActionIds, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            InAppMessageForceActionIds.write$Self$Termius_app_googleProductionRelease(inAppMessageForceActionIds, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{InAppMessageForceActionIds.$childSerializers[0].getValue()};
        }

        @Override // hv.c, hv.r, hv.b
        public final jv.f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f27249a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ InAppMessageForceActionIds(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f27249a.getDescriptor());
        }
        this.list = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(lv.w0.f64808a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InAppMessageForceActionIds copy$default(InAppMessageForceActionIds inAppMessageForceActionIds, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = inAppMessageForceActionIds.list;
        }
        return inAppMessageForceActionIds.copy(list);
    }

    @hv.o("list")
    public static /* synthetic */ void getList$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(InAppMessageForceActionIds inAppMessageForceActionIds, kv.d dVar, jv.f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), inAppMessageForceActionIds.list);
    }

    public final List<Integer> component1() {
        return this.list;
    }

    public final InAppMessageForceActionIds copy(List<Integer> list) {
        ju.t.f(list, "list");
        return new InAppMessageForceActionIds(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessageForceActionIds) && ju.t.b(this.list, ((InAppMessageForceActionIds) obj).list);
    }

    public final List<Integer> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        return "InAppMessageForceActionIds(list=" + this.list + ")";
    }

    public InAppMessageForceActionIds(List<Integer> list) {
        ju.t.f(list, "list");
        this.list = list;
    }
}
