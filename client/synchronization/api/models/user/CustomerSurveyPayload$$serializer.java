package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
import hv.b;
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
import lv.w0;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class CustomerSurveyPayload$$serializer implements n0 {
    public static final int $stable;
    public static final CustomerSurveyPayload$$serializer INSTANCE;
    private static final f descriptor;

    static {
        CustomerSurveyPayload$$serializer customerSurveyPayload$$serializer = new CustomerSurveyPayload$$serializer();
        INSTANCE = customerSurveyPayload$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyPayload", customerSurveyPayload$$serializer, 4);
        i2Var.r("action", false);
        i2Var.r("score", true);
        i2Var.r("interacted_at", false);
        i2Var.r(Column.COMMENT, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private CustomerSurveyPayload$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{CustomerSurveyPayload.$childSerializers[0].getValue(), a.u(w0.f64808a), x2Var, a.u(x2Var)};
    }

    @Override // hv.b
    public final CustomerSurveyPayload deserialize(kv.e eVar) {
        int i10;
        CustomerSurveyAction customerSurveyAction;
        Integer num;
        String str;
        String str2;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = CustomerSurveyPayload.$childSerializers;
        CustomerSurveyAction customerSurveyAction2 = null;
        if (cVarD.l()) {
            CustomerSurveyAction customerSurveyAction3 = (CustomerSurveyAction) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), null);
            Integer num2 = (Integer) cVarD.v(fVar, 1, w0.f64808a, null);
            String strB = cVarD.B(fVar, 2);
            customerSurveyAction = customerSurveyAction3;
            num = num2;
            str2 = (String) cVarD.v(fVar, 3, x2.f64817a, null);
            str = strB;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Integer num3 = null;
            String strB2 = null;
            String str3 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    customerSurveyAction2 = (CustomerSurveyAction) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), customerSurveyAction2);
                    i11 |= 1;
                } else if (iD == 1) {
                    num3 = (Integer) cVarD.v(fVar, 1, w0.f64808a, num3);
                    i11 |= 2;
                } else if (iD == 2) {
                    strB2 = cVarD.B(fVar, 2);
                    i11 |= 4;
                } else {
                    if (iD != 3) {
                        throw new e0(iD);
                    }
                    str3 = (String) cVarD.v(fVar, 3, x2.f64817a, str3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            customerSurveyAction = customerSurveyAction2;
            num = num3;
            str = strB2;
            str2 = str3;
        }
        cVarD.b(fVar);
        return new CustomerSurveyPayload(i10, customerSurveyAction, num, str, str2, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, CustomerSurveyPayload customerSurveyPayload) {
        t.f(fVar, "encoder");
        t.f(customerSurveyPayload, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        CustomerSurveyPayload.write$Self$Termius_app_googleProductionRelease(customerSurveyPayload, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
