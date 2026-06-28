package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.models.account.AccountAccessObject;
import hg.b2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tp.g0 f27251a;

    public a(tp.g0 g0Var) {
        ju.t.f(g0Var, "liveSharedPreferences");
        this.f27251a = g0Var;
    }

    private final List a(String str) {
        if (str.length() == 0) {
            return vt.v.o();
        }
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            bVarS1.a();
            return (List) bVarS1.b(new lv.f(AccountAccessObject.Companion.serializer()), str);
        } catch (IllegalArgumentException e10) {
            y9.a.f86838a.i(e10);
            return vt.v.o();
        }
    }

    public final List b() {
        String strE;
        try {
            strE = this.f27251a.d().getString("key_bulk_account_access_objects", null);
            if (strE == null) {
                strE = tp.c0.e();
            }
        } catch (ClassCastException unused) {
            strE = tp.c0.e();
        }
        return a(strE);
    }
}
