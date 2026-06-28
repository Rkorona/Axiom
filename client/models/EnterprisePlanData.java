package com.server.auditor.ssh.client.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class EnterprisePlanData {
    public static final int $stable = 0;
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f27856id;
    private final String organizationName;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27858b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f27857a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.EnterprisePlanData", aVar, 2);
            i2Var.r("id", false);
            i2Var.r("organization_name", false);
            descriptor = i2Var;
            f27858b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnterprisePlanData deserialize(kv.e eVar) {
            int iE;
            String strB;
            int i10;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            s2 s2Var = null;
            if (cVarD.l()) {
                iE = cVarD.e(fVar, 0);
                strB = cVarD.B(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                iE = 0;
                int i11 = 0;
                String strB2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        iE = cVarD.e(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        strB2 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    }
                }
                strB = strB2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new EnterprisePlanData(i10, iE, strB, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, EnterprisePlanData enterprisePlanData) {
            ju.t.f(fVar, "encoder");
            ju.t.f(enterprisePlanData, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            EnterprisePlanData.write$Self$Termius_app_googleProductionRelease(enterprisePlanData, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{w0.f64808a, x2.f64817a};
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
            return a.f27857a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ EnterprisePlanData(int i10, int i11, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f27857a.getDescriptor());
        }
        this.f27856id = i11;
        this.organizationName = str;
    }

    public static /* synthetic */ EnterprisePlanData copy$default(EnterprisePlanData enterprisePlanData, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = enterprisePlanData.f27856id;
        }
        if ((i11 & 2) != 0) {
            str = enterprisePlanData.organizationName;
        }
        return enterprisePlanData.copy(i10, str);
    }

    @hv.o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @hv.o("organization_name")
    public static /* synthetic */ void getOrganizationName$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EnterprisePlanData enterprisePlanData, kv.d dVar, jv.f fVar) {
        dVar.t(fVar, 0, enterprisePlanData.f27856id);
        dVar.f(fVar, 1, enterprisePlanData.organizationName);
    }

    public final int component1() {
        return this.f27856id;
    }

    public final String component2() {
        return this.organizationName;
    }

    public final EnterprisePlanData copy(int i10, String str) {
        ju.t.f(str, "organizationName");
        return new EnterprisePlanData(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterprisePlanData)) {
            return false;
        }
        EnterprisePlanData enterprisePlanData = (EnterprisePlanData) obj;
        return this.f27856id == enterprisePlanData.f27856id && ju.t.b(this.organizationName, enterprisePlanData.organizationName);
    }

    public final int getId() {
        return this.f27856id;
    }

    public final String getOrganizationName() {
        return this.organizationName;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f27856id) * 31) + this.organizationName.hashCode();
    }

    public String toString() {
        return "EnterprisePlanData(id=" + this.f27856id + ", organizationName=" + this.organizationName + ")";
    }

    public EnterprisePlanData(int i10, String str) {
        ju.t.f(str, "organizationName");
        this.f27856id = i10;
        this.organizationName = str;
    }
}
