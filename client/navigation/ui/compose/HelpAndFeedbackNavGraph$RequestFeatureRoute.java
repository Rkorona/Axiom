package com.server.auditor.ssh.client.navigation.ui.compose;

import com.server.auditor.ssh.client.database.Column;
import io.split.android.client.dtos.SerializableEvent;
import lv.n0;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class HelpAndFeedbackNavGraph$RequestFeatureRoute {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String address;

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30181b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f30180a = aVar;
            lv.i2 i2Var = new lv.i2("com.server.auditor.ssh.client.navigation.ui.compose.HelpAndFeedbackNavGraph.RequestFeatureRoute", aVar, 1);
            i2Var.r(Column.ADDRESS, false);
            descriptor = i2Var;
            f30181b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HelpAndFeedbackNavGraph$RequestFeatureRoute deserialize(kv.e eVar) {
            String strB;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            int i10 = 1;
            lv.s2 s2Var = null;
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
            } else {
                boolean z10 = true;
                int i11 = 0;
                strB = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new hv.e0(iD);
                        }
                        strB = cVarD.B(fVar, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new HelpAndFeedbackNavGraph$RequestFeatureRoute(i10, strB, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, HelpAndFeedbackNavGraph$RequestFeatureRoute helpAndFeedbackNavGraph$RequestFeatureRoute) {
            ju.t.f(fVar, "encoder");
            ju.t.f(helpAndFeedbackNavGraph$RequestFeatureRoute, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            HelpAndFeedbackNavGraph$RequestFeatureRoute.write$Self$Termius_app_googleProductionRelease(helpAndFeedbackNavGraph$RequestFeatureRoute, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{lv.x2.f64817a};
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
            return a.f30180a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ HelpAndFeedbackNavGraph$RequestFeatureRoute(int i10, String str, lv.s2 s2Var) {
        if (1 != (i10 & 1)) {
            lv.d2.a(i10, 1, a.f30180a.getDescriptor());
        }
        this.address = str;
    }

    public static /* synthetic */ HelpAndFeedbackNavGraph$RequestFeatureRoute copy$default(HelpAndFeedbackNavGraph$RequestFeatureRoute helpAndFeedbackNavGraph$RequestFeatureRoute, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpAndFeedbackNavGraph$RequestFeatureRoute.address;
        }
        return helpAndFeedbackNavGraph$RequestFeatureRoute.copy(str);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HelpAndFeedbackNavGraph$RequestFeatureRoute helpAndFeedbackNavGraph$RequestFeatureRoute, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, helpAndFeedbackNavGraph$RequestFeatureRoute.address);
    }

    public final String component1() {
        return this.address;
    }

    public final HelpAndFeedbackNavGraph$RequestFeatureRoute copy(String str) {
        ju.t.f(str, Column.ADDRESS);
        return new HelpAndFeedbackNavGraph$RequestFeatureRoute(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpAndFeedbackNavGraph$RequestFeatureRoute) && ju.t.b(this.address, ((HelpAndFeedbackNavGraph$RequestFeatureRoute) obj).address);
    }

    public final String getAddress() {
        return this.address;
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    public String toString() {
        return "RequestFeatureRoute(address=" + this.address + ")";
    }

    public HelpAndFeedbackNavGraph$RequestFeatureRoute(String str) {
        ju.t.f(str, Column.ADDRESS);
        this.address = str;
    }
}
