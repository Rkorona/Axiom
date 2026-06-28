package com.server.auditor.ssh.client.help;

import com.server.auditor.ssh.client.help.ProductBoardTokenResponseContent;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class ProductBoardTokenResponseModel {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final ProductBoardTokenResponseContent productBoardTokenContent;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27023b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f27022a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.help.ProductBoardTokenResponseModel", aVar, 1);
            i2Var.r("productboard_jwt", false);
            descriptor = i2Var;
            f27023b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductBoardTokenResponseModel deserialize(kv.e eVar) {
            ProductBoardTokenResponseContent productBoardTokenResponseContent;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                productBoardTokenResponseContent = (ProductBoardTokenResponseContent) cVarD.i(fVar, 0, ProductBoardTokenResponseContent.a.f27020a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                productBoardTokenResponseContent = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        productBoardTokenResponseContent = (ProductBoardTokenResponseContent) cVarD.i(fVar, 0, ProductBoardTokenResponseContent.a.f27020a, productBoardTokenResponseContent);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new ProductBoardTokenResponseModel(i10, productBoardTokenResponseContent, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, ProductBoardTokenResponseModel productBoardTokenResponseModel) {
            ju.t.f(fVar, "encoder");
            ju.t.f(productBoardTokenResponseModel, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            ProductBoardTokenResponseModel.write$Self$Termius_app_googleProductionRelease(productBoardTokenResponseModel, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{ProductBoardTokenResponseContent.a.f27020a};
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
            return a.f27022a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ ProductBoardTokenResponseModel(int i10, ProductBoardTokenResponseContent productBoardTokenResponseContent, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f27022a.getDescriptor());
        }
        this.productBoardTokenContent = productBoardTokenResponseContent;
    }

    public static /* synthetic */ ProductBoardTokenResponseModel copy$default(ProductBoardTokenResponseModel productBoardTokenResponseModel, ProductBoardTokenResponseContent productBoardTokenResponseContent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            productBoardTokenResponseContent = productBoardTokenResponseModel.productBoardTokenContent;
        }
        return productBoardTokenResponseModel.copy(productBoardTokenResponseContent);
    }

    @hv.o("productboard_jwt")
    public static /* synthetic */ void getProductBoardTokenContent$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProductBoardTokenResponseModel productBoardTokenResponseModel, kv.d dVar, jv.f fVar) {
        dVar.o(fVar, 0, ProductBoardTokenResponseContent.a.f27020a, productBoardTokenResponseModel.productBoardTokenContent);
    }

    public final ProductBoardTokenResponseContent component1() {
        return this.productBoardTokenContent;
    }

    public final ProductBoardTokenResponseModel copy(ProductBoardTokenResponseContent productBoardTokenResponseContent) {
        ju.t.f(productBoardTokenResponseContent, "productBoardTokenContent");
        return new ProductBoardTokenResponseModel(productBoardTokenResponseContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductBoardTokenResponseModel) && ju.t.b(this.productBoardTokenContent, ((ProductBoardTokenResponseModel) obj).productBoardTokenContent);
    }

    public final ProductBoardTokenResponseContent getProductBoardTokenContent() {
        return this.productBoardTokenContent;
    }

    public int hashCode() {
        return this.productBoardTokenContent.hashCode();
    }

    public String toString() {
        return "ProductBoardTokenResponseModel(productBoardTokenContent=" + this.productBoardTokenContent + ")";
    }

    public ProductBoardTokenResponseModel(ProductBoardTokenResponseContent productBoardTokenResponseContent) {
        ju.t.f(productBoardTokenResponseContent, "productBoardTokenContent");
        this.productBoardTokenContent = productBoardTokenResponseContent;
    }
}
