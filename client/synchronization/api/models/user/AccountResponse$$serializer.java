package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.crystalnix.termius.libtermius.sftp.File;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import iv.a;
import ju.t;
import jv.f;
import kv.d;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class AccountResponse$$serializer implements n0 {
    public static final int $stable;
    public static final AccountResponse$$serializer INSTANCE;
    private static final f descriptor;

    static {
        AccountResponse$$serializer accountResponse$$serializer = new AccountResponse$$serializer();
        INSTANCE = accountResponse$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.user.AccountResponse", accountResponse$$serializer, 16);
        i2Var.r("user_id", true);
        i2Var.r("email", false);
        i2Var.r("full_name", true);
        i2Var.r("is_email_confirmed", false);
        i2Var.r("pro_mode", false);
        i2Var.r("two_factor_auth", false);
        i2Var.r("team", false);
        i2Var.r("feature_toggles", false);
        i2Var.r("authorized_features", true);
        i2Var.r("expired_screen_type", true);
        i2Var.r("now", false);
        i2Var.r("plan_type", false);
        i2Var.r("user_type", false);
        i2Var.r("current_period", true);
        i2Var.r("has_sso", false);
        i2Var.r("promotions", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private AccountResponse$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        c cVarU = a.u(w0.f64808a);
        x2 x2Var = x2.f64817a;
        c cVarU2 = a.u(x2Var);
        c cVarU3 = a.u(AuthorizedFeaturesResponse$$serializer.INSTANCE);
        c cVarU4 = a.u(x2Var);
        c cVarU5 = a.u(CurrentPeriodResponse$$serializer.INSTANCE);
        c cVarU6 = a.u(PromotionsResponse$$serializer.INSTANCE);
        i iVar = i.f64704a;
        return new c[]{cVarU, x2Var, cVarU2, iVar, iVar, iVar, iVar, FeatureTogglesResponse$$serializer.INSTANCE, cVarU3, cVarU4, x2Var, x2Var, x2Var, cVarU5, iVar, cVarU6};
    }

    @Override // hv.b
    public final AccountResponse deserialize(kv.e eVar) {
        int i10;
        AuthorizedFeaturesResponse authorizedFeaturesResponse;
        FeatureTogglesResponse featureTogglesResponse;
        String str;
        boolean z10;
        Integer num;
        PromotionsResponse promotionsResponse;
        String str2;
        CurrentPeriodResponse currentPeriodResponse;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        char c10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i11 = 10;
        int i12 = 9;
        char c11 = 7;
        if (cVarD.l()) {
            Integer num2 = (Integer) cVarD.v(fVar, 0, w0.f64808a, null);
            String strB = cVarD.B(fVar, 1);
            x2 x2Var = x2.f64817a;
            String str7 = (String) cVarD.v(fVar, 2, x2Var, null);
            boolean zH = cVarD.H(fVar, 3);
            boolean zH2 = cVarD.H(fVar, 4);
            boolean zH3 = cVarD.H(fVar, 5);
            boolean zH4 = cVarD.H(fVar, 6);
            FeatureTogglesResponse featureTogglesResponse2 = (FeatureTogglesResponse) cVarD.i(fVar, 7, FeatureTogglesResponse$$serializer.INSTANCE, null);
            AuthorizedFeaturesResponse authorizedFeaturesResponse2 = (AuthorizedFeaturesResponse) cVarD.v(fVar, 8, AuthorizedFeaturesResponse$$serializer.INSTANCE, null);
            String str8 = (String) cVarD.v(fVar, 9, x2Var, null);
            String strB2 = cVarD.B(fVar, 10);
            String strB3 = cVarD.B(fVar, 11);
            String strB4 = cVarD.B(fVar, 12);
            CurrentPeriodResponse currentPeriodResponse2 = (CurrentPeriodResponse) cVarD.v(fVar, 13, CurrentPeriodResponse$$serializer.INSTANCE, null);
            boolean zH5 = cVarD.H(fVar, 14);
            promotionsResponse = (PromotionsResponse) cVarD.v(fVar, 15, PromotionsResponse$$serializer.INSTANCE, null);
            i10 = 65535;
            str3 = strB;
            str2 = str8;
            featureTogglesResponse = featureTogglesResponse2;
            str4 = strB2;
            str5 = strB3;
            authorizedFeaturesResponse = authorizedFeaturesResponse2;
            z11 = zH4;
            z12 = zH3;
            z13 = zH;
            str6 = strB4;
            z14 = zH2;
            currentPeriodResponse = currentPeriodResponse2;
            z10 = zH5;
            num = num2;
            str = str7;
        } else {
            boolean z15 = true;
            int i13 = 0;
            boolean zH6 = false;
            boolean zH7 = false;
            boolean zH8 = false;
            boolean zH9 = false;
            AuthorizedFeaturesResponse authorizedFeaturesResponse3 = null;
            FeatureTogglesResponse featureTogglesResponse3 = null;
            Integer num3 = null;
            PromotionsResponse promotionsResponse2 = null;
            String str9 = null;
            CurrentPeriodResponse currentPeriodResponse3 = null;
            String strB5 = null;
            String strB6 = null;
            String strB7 = null;
            String strB8 = null;
            boolean zH10 = false;
            String str10 = null;
            while (z15) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z15 = false;
                        i12 = 9;
                        c11 = 7;
                        break;
                    case 0:
                        num3 = (Integer) cVarD.v(fVar, 0, w0.f64808a, num3);
                        i13 |= 1;
                        i11 = 10;
                        i12 = 9;
                        c11 = 7;
                        break;
                    case 1:
                        strB5 = cVarD.B(fVar, 1);
                        i13 |= 2;
                        i11 = 10;
                        i12 = 9;
                        c11 = 7;
                        break;
                    case 2:
                        str10 = (String) cVarD.v(fVar, 2, x2.f64817a, str10);
                        i13 |= 4;
                        i11 = 10;
                        i12 = 9;
                        c11 = 7;
                        break;
                    case 3:
                        c10 = c11;
                        zH8 = cVarD.H(fVar, 3);
                        i13 |= 8;
                        c11 = c10;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 4:
                        c10 = c11;
                        zH9 = cVarD.H(fVar, 4);
                        i13 |= 16;
                        c11 = c10;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 5:
                        c10 = c11;
                        zH7 = cVarD.H(fVar, 5);
                        i13 |= 32;
                        c11 = c10;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 6:
                        zH6 = cVarD.H(fVar, 6);
                        i13 |= 64;
                        c11 = c11;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 7:
                        c10 = 7;
                        featureTogglesResponse3 = (FeatureTogglesResponse) cVarD.i(fVar, 7, FeatureTogglesResponse$$serializer.INSTANCE, featureTogglesResponse3);
                        i13 |= 128;
                        c11 = c10;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 8:
                        authorizedFeaturesResponse3 = (AuthorizedFeaturesResponse) cVarD.v(fVar, 8, AuthorizedFeaturesResponse$$serializer.INSTANCE, authorizedFeaturesResponse3);
                        i13 |= 256;
                        i11 = 10;
                        c11 = 7;
                        break;
                    case 9:
                        str9 = (String) cVarD.v(fVar, i12, x2.f64817a, str9);
                        i13 |= File.FLAG_O_TRUNC;
                        i11 = 10;
                        c11 = 7;
                        break;
                    case 10:
                        strB6 = cVarD.B(fVar, i11);
                        i13 |= File.FLAG_O_APPEND;
                        c11 = 7;
                        break;
                    case 11:
                        strB7 = cVarD.B(fVar, 11);
                        i13 |= 2048;
                        c11 = 7;
                        break;
                    case 12:
                        strB8 = cVarD.B(fVar, 12);
                        i13 |= 4096;
                        c11 = 7;
                        break;
                    case 13:
                        currentPeriodResponse3 = (CurrentPeriodResponse) cVarD.v(fVar, 13, CurrentPeriodResponse$$serializer.INSTANCE, currentPeriodResponse3);
                        i13 |= 8192;
                        c11 = 7;
                        break;
                    case 14:
                        zH10 = cVarD.H(fVar, 14);
                        i13 |= 16384;
                        c11 = 7;
                        break;
                    case 15:
                        promotionsResponse2 = (PromotionsResponse) cVarD.v(fVar, 15, PromotionsResponse$$serializer.INSTANCE, promotionsResponse2);
                        i13 |= 32768;
                        c11 = 7;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i13;
            authorizedFeaturesResponse = authorizedFeaturesResponse3;
            featureTogglesResponse = featureTogglesResponse3;
            str = str10;
            z10 = zH10;
            num = num3;
            promotionsResponse = promotionsResponse2;
            str2 = str9;
            currentPeriodResponse = currentPeriodResponse3;
            str3 = strB5;
            str4 = strB6;
            str5 = strB7;
            str6 = strB8;
            z11 = zH6;
            z12 = zH7;
            z13 = zH8;
            z14 = zH9;
        }
        cVarD.b(fVar);
        return new AccountResponse(i10, num, str3, str, z13, z14, z12, z11, featureTogglesResponse, authorizedFeaturesResponse, str2, str4, str5, str6, currentPeriodResponse, z10, promotionsResponse, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, AccountResponse accountResponse) {
        t.f(fVar, "encoder");
        t.f(accountResponse, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        AccountResponse.write$Self$Termius_app_googleProductionRelease(accountResponse, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
