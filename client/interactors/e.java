package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.interactors.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27355a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final su.p f27356b = new su.p("(CREATE (?>TABLE|INDEX|VIEW)) [\"'`]?(\\w+)[\"'`]?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f27357c = vt.v.r("CREATE TABLE uris", "CREATE TABLE ssh_connections", "CREATE INDEX ssh_connections_index");

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(su.m mVar) {
            ju.t.f(mVar, "matchResult");
            return ((String) mVar.a().get(1)) + " " + ((String) mVar.a().get(2));
        }

        public final String b(String str) {
            ju.t.f(str, "<this>");
            List<String> listJ = new su.p("(?=[(),])|(?<=[(),])").j(new su.p("\\s{2,}|\\n").h(e.f27356b.g(str, new iu.l() { // from class: com.server.auditor.ssh.client.interactors.d
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return e.a.c((su.m) obj);
                }
            }), " "), 0);
            ArrayList arrayList = new ArrayList();
            for (String str2 : listJ) {
                String string = su.s.m0(str2) ? null : su.s.n1(str2).toString();
                if (string != null) {
                    arrayList.add(string);
                }
            }
            return new su.p("(?<=[,><=])(?=\\S)|(?<=\\))(?=\\w)|(?<=\\w)(?=[><=])").h(vt.v.z0(arrayList, "", null, null, 0, null, null, 62, null), " ");
        }

        private a() {
        }
    }

    private final StringBuilder b(StringBuilder sb2, String str, String str2) {
        String str3 = String.format("Expected database schema:\n\"\"\"\n%s\n\"\"\"\n", Arrays.copyOf(new Object[]{str}, 1));
        ju.t.e(str3, "format(...)");
        sb2.append(str3);
        sb2.append('\n');
        String str4 = String.format("Actual database schema:\n\"\"\"\n%s\n\"\"\"\n", Arrays.copyOf(new Object[]{str2}, 1));
        ju.t.e(str4, "format(...)");
        sb2.append(str4);
        sb2.append('\n');
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map c(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "\n"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            java.util.List r8 = su.s.Q0(r1, r2, r3, r4, r5, r6)
            r0 = 10
            int r0 = vt.v.z(r8, r0)
            int r0 = vt.s0.e(r0)
            r1 = 16
            int r0 = pu.m.e(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L28:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r8.next()
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            su.p r3 = com.server.auditor.ssh.client.interactors.e.f27356b
            r4 = 0
            r5 = 0
            r6 = 2
            su.m r2 = su.p.c(r3, r2, r4, r6, r5)
            if (r2 == 0) goto L6b
            java.util.List r3 = r2.a()
            r4 = 1
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r2 = r2.a()
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            if (r2 != 0) goto L6d
        L6b:
            java.lang.String r2 = "unknown sql instruction"
        L6d:
            r1.put(r2, r0)
            goto L28
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.e.c(java.lang.String):java.util.Map");
    }

    public final String d(String str, String str2) {
        Iterator it;
        ut.a0 a0Var;
        ju.t.f(str, "expectedDatabaseSchema");
        ju.t.f(str2, "actualDatabaseSchema");
        StringBuilder sb2 = new StringBuilder();
        if (su.s.m0(str2)) {
            sb2.append("It is not possible to detect inconsistencies between databases because the actual database is empty.\n");
            sb2.append('\n');
            b(sb2, str, str2);
            String string = sb2.toString();
            ju.t.e(string, "toString(...)");
            return string;
        }
        Map mapC = c(str);
        Map mapC2 = c(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = mapC.entrySet().iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                vt.v.y();
            }
            Map.Entry entry = (Map.Entry) next;
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            linkedHashSet.add(str3);
            Iterator it3 = mapC2.entrySet().iterator();
            int i12 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    it = it2;
                    a0Var = null;
                    break;
                }
                Object next2 = it3.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    vt.v.y();
                }
                Map.Entry entry2 = (Map.Entry) next2;
                if (ju.t.b(entry2.getKey(), str3)) {
                    it = it2;
                    a0Var = new ut.a0(Integer.valueOf(i12), entry2.getKey(), entry2.getValue());
                    break;
                }
                i12 = i13;
            }
            if (a0Var != null) {
                int iIntValue = ((Number) a0Var.a()).intValue();
                String str5 = (String) a0Var.c();
                if (!ju.t.b(str4, str5)) {
                    String str6 = String.format("SQL statement is different from expected:\nexpected statement position %d:\t\"%s\"\nactual statement position %d:\t\"%s\"\n", Arrays.copyOf(new Object[]{Integer.valueOf(i10), str4, Integer.valueOf(iIntValue), str5}, 4));
                    ju.t.e(str6, "format(...)");
                    sb2.append(str6);
                    sb2.append('\n');
                }
            } else if (!f27357c.contains(str3)) {
                ju.r0 r0Var = ju.r0.f62955a;
                String str7 = String.format("The actual database schema does not contain the expected SQL statement:\n\"%s\"\n", Arrays.copyOf(new Object[]{str4}, 1));
                ju.t.e(str7, "format(...)");
                sb2.append(str7);
                sb2.append('\n');
            }
            i10 = i11;
            it2 = it;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry3 : mapC2.entrySet()) {
            if (!linkedHashSet.contains((String) entry3.getKey())) {
                linkedHashMap.put(entry3.getKey(), entry3.getValue());
            }
        }
        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
            String str8 = (String) entry4.getKey();
            String str9 = (String) entry4.getValue();
            if (ju.t.b(str8, "unknown sql instruction")) {
                String str10 = String.format("Encountered unknown SQL instruction. Analyze the actual database schema.\n", Arrays.copyOf(new Object[]{str9}, 1));
                ju.t.e(str10, "format(...)");
                sb2.append(str10);
                sb2.append('\n');
            } else {
                String str11 = String.format("The actual database schema has extra SQL statement:\n\"%s\"\n", Arrays.copyOf(new Object[]{str9}, 1));
                ju.t.e(str11, "format(...)");
                sb2.append(str11);
                sb2.append('\n');
            }
        }
        if (!su.s.m0(sb2)) {
            sb2 = b(sb2, str, str2);
        }
        String string2 = sb2.toString();
        ju.t.e(string2, "toString(...)");
        return string2;
    }
}
