package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey$$serializer;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.s2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class AuthResponseModel$$serializer implements n0 {
    public static final int $stable;
    public static final AuthResponseModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AuthResponseModel$$serializer authResponseModel$$serializer = new AuthResponseModel$$serializer();
        INSTANCE = authResponseModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.AuthResponseModel", authResponseModel$$serializer, 2);
        i2Var.r("credentials", true);
        i2Var.r("bulk_account", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private AuthResponseModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{a.u(ApiKey$$serializer.INSTANCE), BulkAccountResponse$$serializer.INSTANCE};
    }

    @Override // hv.b
    public final AuthResponseModel deserialize(kv.e eVar) {
        ApiKey apiKey;
        BulkAccountResponse bulkAccountResponse;
        int i10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        if (cVarD.l()) {
            apiKey = (ApiKey) cVarD.v(fVar, 0, ApiKey$$serializer.INSTANCE, null);
            bulkAccountResponse = (BulkAccountResponse) cVarD.i(fVar, 1, BulkAccountResponse$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            apiKey = null;
            BulkAccountResponse bulkAccountResponse2 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    apiKey = (ApiKey) cVarD.v(fVar, 0, ApiKey$$serializer.INSTANCE, apiKey);
                    i11 |= 1;
                } else {
                    if (iD != 1) {
                        throw new e0(iD);
                    }
                    bulkAccountResponse2 = (BulkAccountResponse) cVarD.i(fVar, 1, BulkAccountResponse$$serializer.INSTANCE, bulkAccountResponse2);
                    i11 |= 2;
                }
            }
            bulkAccountResponse = bulkAccountResponse2;
            i10 = i11;
        }
        cVarD.b(fVar);
        return new AuthResponseModel(i10, apiKey, bulkAccountResponse, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, AuthResponseModel authResponseModel) {
        t.f(fVar, "encoder");
        t.f(authResponseModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        AuthResponseModel.write$Self$Termius_app_googleProductionRelease(authResponseModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
