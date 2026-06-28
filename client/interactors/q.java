package com.server.auditor.ssh.client.interactors;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27559a = new a(null);

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final String b(String str) {
        String str2 = (String) vt.v.r0(su.s.Q0(str, new String[]{"@"}, false, 0, 6, null));
        if (str2 == null) {
            str2 = "";
        }
        List listJ = new su.p("[.\\-_+]").j(str2, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return vt.v.z0(vt.v.U0(arrayList, 2), "", null, null, 0, null, new iu.l() { // from class: com.server.auditor.ssh.client.interactors.p
            @Override // iu.l
            public final Object invoke(Object obj2) {
                return q.c((String) obj2);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(String str) {
        ju.t.f(str, "it");
        String strValueOf = String.valueOf(su.s.r1(str));
        ju.t.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        ju.t.e(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private final String d(String str) {
        int i10 = 0;
        List listQ0 = su.s.Q0(su.s.n1(str).toString(), new String[]{" "}, false, 0, 6, null);
        String str2 = "";
        for (Object obj : listQ0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                vt.v.y();
            }
            String str3 = (String) obj;
            if (i10 == 0 || i10 == vt.v.q(listQ0)) {
                Character chS1 = su.s.s1(str3);
                String string = chS1 != null ? Character.valueOf(Character.toUpperCase(chS1.charValue())).toString() : null;
                if (string == null) {
                    string = "";
                }
                str2 = str2 + string;
            }
            i10 = i11;
        }
        return str2;
    }

    public final String e(String str, String str2) {
        ju.t.f(str, "email");
        ju.t.f(str2, "fullName");
        String strD = d(str2);
        if (su.s.m0(strD)) {
            strD = null;
        }
        if (strD != null) {
            return strD;
        }
        String strB = b(str);
        String str3 = su.s.m0(strB) ? null : strB;
        return str3 == null ? "" : str3;
    }
}
