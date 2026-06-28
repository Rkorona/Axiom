package com.server.auditor.ssh.client.help;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class ProductBoardTokenResponseContent {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String token;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27021b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f27020a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.help.ProductBoardTokenResponseContent", aVar, 1);
            i2Var.r("jwt", false);
            descriptor = i2Var;
            f27021b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductBoardTokenResponseContent deserialize(kv.e eVar) {
            String strB;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            int i10 = 1;
            s2 s2Var = null;
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
                            throw new e0(iD);
                        }
                        strB = cVarD.B(fVar, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new ProductBoardTokenResponseContent(i10, strB, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, ProductBoardTokenResponseContent productBoardTokenResponseContent) {
            ju.t.f(fVar, "encoder");
            ju.t.f(productBoardTokenResponseContent, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            ProductBoardTokenResponseContent.write$Self$Termius_app_googleProductionRelease(productBoardTokenResponseContent, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{x2.f64817a};
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
            return a.f27020a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ ProductBoardTokenResponseContent(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f27020a.getDescriptor());
        }
        this.token = str;
    }

    public static /* synthetic */ ProductBoardTokenResponseContent copy$default(ProductBoardTokenResponseContent productBoardTokenResponseContent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = productBoardTokenResponseContent.token;
        }
        return productBoardTokenResponseContent.copy(str);
    }

    @hv.o("jwt")
    public static /* synthetic */ void getToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProductBoardTokenResponseContent productBoardTokenResponseContent, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, productBoardTokenResponseContent.token);
    }

    public final String component1() {
        return this.token;
    }

    public final ProductBoardTokenResponseContent copy(String str) {
        ju.t.f(str, "token");
        return new ProductBoardTokenResponseContent(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductBoardTokenResponseContent) && ju.t.b(this.token, ((ProductBoardTokenResponseContent) obj).token);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return "ProductBoardTokenResponseContent(token=" + this.token + ")";
    }

    public ProductBoardTokenResponseContent(String str) {
        ju.t.f(str, "token");
        this.token = str;
    }
}
