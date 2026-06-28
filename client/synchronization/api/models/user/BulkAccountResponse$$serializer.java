package com.server.auditor.ssh.client.synchronization.api.models.user;

import hv.b;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import java.util.List;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.s2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class BulkAccountResponse$$serializer implements n0 {
    public static final int $stable;
    public static final BulkAccountResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        BulkAccountResponse$$serializer bulkAccountResponse$$serializer = new BulkAccountResponse$$serializer();
        INSTANCE = bulkAccountResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.BulkAccountResponse", bulkAccountResponse$$serializer, 7);
        i2Var.r("trial", true);
        i2Var.r("personal_subscription", true);
        i2Var.r("team_subscription", true);
        i2Var.r("account", true);
        i2Var.r("team", true);
        i2Var.r("enterprise", true);
        i2Var.r("access_objects", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private BulkAccountResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{a.u(TrialResponse$$serializer.INSTANCE), a.u(PersonalSubscriptionResponse$$serializer.INSTANCE), a.u(TeamSubscriptionResponse$$serializer.INSTANCE), a.u(AccountResponse$$serializer.INSTANCE), a.u(TeamResponse$$serializer.INSTANCE), a.u(EnterpriseResponse$$serializer.INSTANCE), BulkAccountResponse.$childSerializers[6].getValue()};
    }

    @Override // hv.b
    public final BulkAccountResponse deserialize(kv.e eVar) {
        int i10;
        List list;
        EnterpriseResponse enterpriseResponse;
        TrialResponse trialResponse;
        PersonalSubscriptionResponse personalSubscriptionResponse;
        TeamSubscriptionResponse teamSubscriptionResponse;
        AccountResponse accountResponse;
        TeamResponse teamResponse;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = BulkAccountResponse.$childSerializers;
        int i11 = 5;
        TrialResponse trialResponse2 = null;
        if (cVarD.l()) {
            TrialResponse trialResponse3 = (TrialResponse) cVarD.v(fVar, 0, TrialResponse$$serializer.INSTANCE, null);
            PersonalSubscriptionResponse personalSubscriptionResponse2 = (PersonalSubscriptionResponse) cVarD.v(fVar, 1, PersonalSubscriptionResponse$$serializer.INSTANCE, null);
            TeamSubscriptionResponse teamSubscriptionResponse2 = (TeamSubscriptionResponse) cVarD.v(fVar, 2, TeamSubscriptionResponse$$serializer.INSTANCE, null);
            AccountResponse accountResponse2 = (AccountResponse) cVarD.v(fVar, 3, AccountResponse$$serializer.INSTANCE, null);
            TeamResponse teamResponse2 = (TeamResponse) cVarD.v(fVar, 4, TeamResponse$$serializer.INSTANCE, null);
            EnterpriseResponse enterpriseResponse2 = (EnterpriseResponse) cVarD.v(fVar, 5, EnterpriseResponse$$serializer.INSTANCE, null);
            list = (List) cVarD.i(fVar, 6, (b) nVarArr[6].getValue(), null);
            trialResponse = trialResponse3;
            enterpriseResponse = enterpriseResponse2;
            accountResponse = accountResponse2;
            teamResponse = teamResponse2;
            teamSubscriptionResponse = teamSubscriptionResponse2;
            i10 = 127;
            personalSubscriptionResponse = personalSubscriptionResponse2;
        } else {
            boolean z10 = true;
            int i12 = 0;
            List list2 = null;
            EnterpriseResponse enterpriseResponse3 = null;
            PersonalSubscriptionResponse personalSubscriptionResponse3 = null;
            TeamSubscriptionResponse teamSubscriptionResponse3 = null;
            AccountResponse accountResponse3 = null;
            TeamResponse teamResponse3 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        trialResponse2 = (TrialResponse) cVarD.v(fVar, 0, TrialResponse$$serializer.INSTANCE, trialResponse2);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        personalSubscriptionResponse3 = (PersonalSubscriptionResponse) cVarD.v(fVar, 1, PersonalSubscriptionResponse$$serializer.INSTANCE, personalSubscriptionResponse3);
                        i12 |= 2;
                        i11 = 5;
                        break;
                    case 2:
                        teamSubscriptionResponse3 = (TeamSubscriptionResponse) cVarD.v(fVar, 2, TeamSubscriptionResponse$$serializer.INSTANCE, teamSubscriptionResponse3);
                        i12 |= 4;
                        i11 = 5;
                        break;
                    case 3:
                        accountResponse3 = (AccountResponse) cVarD.v(fVar, 3, AccountResponse$$serializer.INSTANCE, accountResponse3);
                        i12 |= 8;
                        break;
                    case 4:
                        teamResponse3 = (TeamResponse) cVarD.v(fVar, 4, TeamResponse$$serializer.INSTANCE, teamResponse3);
                        i12 |= 16;
                        break;
                    case 5:
                        enterpriseResponse3 = (EnterpriseResponse) cVarD.v(fVar, i11, EnterpriseResponse$$serializer.INSTANCE, enterpriseResponse3);
                        i12 |= 32;
                        break;
                    case 6:
                        list2 = (List) cVarD.i(fVar, 6, (b) nVarArr[6].getValue(), list2);
                        i12 |= 64;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i12;
            list = list2;
            enterpriseResponse = enterpriseResponse3;
            trialResponse = trialResponse2;
            personalSubscriptionResponse = personalSubscriptionResponse3;
            teamSubscriptionResponse = teamSubscriptionResponse3;
            accountResponse = accountResponse3;
            teamResponse = teamResponse3;
        }
        cVarD.b(fVar);
        return new BulkAccountResponse(i10, trialResponse, personalSubscriptionResponse, teamSubscriptionResponse, accountResponse, teamResponse, enterpriseResponse, list, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, BulkAccountResponse bulkAccountResponse) {
        t.f(fVar, "encoder");
        t.f(bulkAccountResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        BulkAccountResponse.write$Self$Termius_app_googleProductionRelease(bulkAccountResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
