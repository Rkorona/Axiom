package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.ui.vaults.data.UpdateVaultApiRequest;
import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class UpdateVaultApiRequestBody {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final UpdateVaultApiRequest updateVault;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41414b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f41413a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.vaults.data.UpdateVaultApiRequestBody", aVar, 1);
            i2Var.r("vault", false);
            descriptor = i2Var;
            f41414b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdateVaultApiRequestBody deserialize(e eVar) {
            UpdateVaultApiRequest updateVaultApiRequest;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                updateVaultApiRequest = (UpdateVaultApiRequest) cVarD.i(fVar, 0, UpdateVaultApiRequest.a.f41411a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                updateVaultApiRequest = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        updateVaultApiRequest = (UpdateVaultApiRequest) cVarD.i(fVar, 0, UpdateVaultApiRequest.a.f41411a, updateVaultApiRequest);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new UpdateVaultApiRequestBody(i10, updateVaultApiRequest, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, UpdateVaultApiRequestBody updateVaultApiRequestBody) {
            t.f(fVar, "encoder");
            t.f(updateVaultApiRequestBody, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            UpdateVaultApiRequestBody.write$Self$Termius_app_googleProductionRelease(updateVaultApiRequestBody, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{UpdateVaultApiRequest.a.f41411a};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
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
            return a.f41413a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ UpdateVaultApiRequestBody(int i10, UpdateVaultApiRequest updateVaultApiRequest, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f41413a.getDescriptor());
        }
        this.updateVault = updateVaultApiRequest;
    }

    public static /* synthetic */ UpdateVaultApiRequestBody copy$default(UpdateVaultApiRequestBody updateVaultApiRequestBody, UpdateVaultApiRequest updateVaultApiRequest, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            updateVaultApiRequest = updateVaultApiRequestBody.updateVault;
        }
        return updateVaultApiRequestBody.copy(updateVaultApiRequest);
    }

    @o("vault")
    public static /* synthetic */ void getUpdateVault$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UpdateVaultApiRequestBody updateVaultApiRequestBody, d dVar, f fVar) {
        dVar.o(fVar, 0, UpdateVaultApiRequest.a.f41411a, updateVaultApiRequestBody.updateVault);
    }

    public final UpdateVaultApiRequest component1() {
        return this.updateVault;
    }

    public final UpdateVaultApiRequestBody copy(UpdateVaultApiRequest updateVaultApiRequest) {
        t.f(updateVaultApiRequest, "updateVault");
        return new UpdateVaultApiRequestBody(updateVaultApiRequest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateVaultApiRequestBody) && t.b(this.updateVault, ((UpdateVaultApiRequestBody) obj).updateVault);
    }

    public final UpdateVaultApiRequest getUpdateVault() {
        return this.updateVault;
    }

    public int hashCode() {
        return this.updateVault.hashCode();
    }

    public String toString() {
        return "UpdateVaultApiRequestBody(updateVault=" + this.updateVault + ")";
    }

    public UpdateVaultApiRequestBody(UpdateVaultApiRequest updateVaultApiRequest) {
        t.f(updateVaultApiRequest, "updateVault");
        this.updateVault = updateVaultApiRequest;
    }
}
