package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
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
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class PersonalSubscriptionResponse$$serializer implements n0 {
    public static final int $stable;
    public static final PersonalSubscriptionResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        PersonalSubscriptionResponse$$serializer personalSubscriptionResponse$$serializer = new PersonalSubscriptionResponse$$serializer();
        INSTANCE = personalSubscriptionResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.PersonalSubscriptionResponse", personalSubscriptionResponse$$serializer, 5);
        i2Var.r("platform", false);
        i2Var.r("current_period", true);
        i2Var.r("valid_until", false);
        i2Var.r(Column.CREATED_AT, false);
        i2Var.r(Column.STATUS, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private PersonalSubscriptionResponse$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        x2 x2Var = x2.f64817a;
        return new c[]{x2Var, a.u(CurrentPeriodResponse$$serializer.INSTANCE), x2Var, x2Var, a.u(x2Var)};
    }

    @Override // hv.b
    public final PersonalSubscriptionResponse deserialize(kv.e eVar) {
        int i10;
        String str;
        CurrentPeriodResponse currentPeriodResponse;
        String str2;
        String strB;
        String str3;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String strB2 = null;
        if (cVarD.l()) {
            String strB3 = cVarD.B(fVar, 0);
            CurrentPeriodResponse currentPeriodResponse2 = (CurrentPeriodResponse) cVarD.v(fVar, 1, CurrentPeriodResponse$$serializer.INSTANCE, null);
            String strB4 = cVarD.B(fVar, 2);
            str = strB3;
            strB = cVarD.B(fVar, 3);
            str3 = (String) cVarD.v(fVar, 4, x2.f64817a, null);
            str2 = strB4;
            currentPeriodResponse = currentPeriodResponse2;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            CurrentPeriodResponse currentPeriodResponse3 = null;
            String strB5 = null;
            String strB6 = null;
            String str4 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else if (iD == 0) {
                    strB2 = cVarD.B(fVar, 0);
                    i11 |= 1;
                } else if (iD == 1) {
                    currentPeriodResponse3 = (CurrentPeriodResponse) cVarD.v(fVar, 1, CurrentPeriodResponse$$serializer.INSTANCE, currentPeriodResponse3);
                    i11 |= 2;
                } else if (iD == 2) {
                    strB5 = cVarD.B(fVar, 2);
                    i11 |= 4;
                } else if (iD == 3) {
                    strB6 = cVarD.B(fVar, 3);
                    i11 |= 8;
                } else {
                    if (iD != 4) {
                        throw new e0(iD);
                    }
                    str4 = (String) cVarD.v(fVar, 4, x2.f64817a, str4);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = strB2;
            currentPeriodResponse = currentPeriodResponse3;
            str2 = strB5;
            strB = strB6;
            str3 = str4;
        }
        cVarD.b(fVar);
        return new PersonalSubscriptionResponse(i10, str, currentPeriodResponse, str2, strB, str3, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, PersonalSubscriptionResponse personalSubscriptionResponse) {
        t.f(fVar, "encoder");
        t.f(personalSubscriptionResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        PersonalSubscriptionResponse.write$Self$Termius_app_googleProductionRelease(personalSubscriptionResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
