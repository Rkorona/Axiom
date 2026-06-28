package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.ui.util.JsonDecodeFromStringFailed;
import io.sentry.i4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mv.b f27456a;

    public m(mv.b bVar) {
        ju.t.f(bVar, "json");
        this.f27456a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JsonDecodeFromStringFailed jsonDecodeFromStringFailed, io.sentry.a1 a1Var) {
        ju.t.f(a1Var, "scope");
        a1Var.O(jsonDecodeFromStringFailed.asAttachment());
    }

    public final String b(List list) {
        ju.t.f(list, "list");
        try {
            mv.b bVar = this.f27456a;
            Map mapS = vt.s0.s(list);
            bVar.a();
            x2 x2Var = x2.f64817a;
            return bVar.c(new lv.b1(x2Var, x2Var), mapS);
        } catch (hv.q e10) {
            y9.a.f86838a.i(e10);
            return null;
        }
    }

    public final List c(String str) {
        if (str == null || str.length() == 0) {
            return vt.v.o();
        }
        try {
            mv.b bVar = this.f27456a;
            try {
                bVar.a();
                x2 x2Var = x2.f64817a;
                Map map = (Map) bVar.b(new lv.b1(x2Var, x2Var), str);
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new ut.u(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (IllegalArgumentException e10) {
                throw new JsonDecodeFromStringFailed(np.k.b(new np.l().f(str).toString()), null, e10, 2, null);
            }
        } catch (JsonDecodeFromStringFailed e11) {
            y9.a.f86838a.j(e11, new i4() { // from class: com.server.auditor.ssh.client.interactors.l
                @Override // io.sentry.i4
                public final void a(io.sentry.a1 a1Var) {
                    m.d(e11, a1Var);
                }
            });
            return vt.v.o();
        }
    }
}
