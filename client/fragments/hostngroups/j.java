package com.server.auditor.ssh.client.fragments.hostngroups;

import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import cq.b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TermiusSortType f25092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f25093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f25094c;

    static {
        TermiusSortType termiusSortType = TermiusSortType.ByNameAscending;
        f25092a = termiusSortType;
        HashMap map = new HashMap();
        f25093b = map;
        HashMap map2 = new HashMap();
        f25094c = map2;
        b.a aVar = cq.b.f47028a;
        map.put(termiusSortType, aVar.g());
        TermiusSortType termiusSortType2 = TermiusSortType.ByNameDescending;
        map.put(termiusSortType2, aVar.h());
        TermiusSortType termiusSortType3 = TermiusSortType.ByDateDescending;
        map.put(termiusSortType3, aVar.e());
        TermiusSortType termiusSortType4 = TermiusSortType.ByDateAscending;
        map.put(termiusSortType4, aVar.f());
        map2.put(termiusSortType, aVar.c());
        map2.put(termiusSortType2, aVar.d());
        map2.put(termiusSortType3, aVar.b());
        map2.put(termiusSortType4, aVar.a());
    }

    public static Comparator a(String str) {
        TermiusSortType termiusSortTypeC = c(str);
        Map map = f25094c;
        return map.containsKey(termiusSortTypeC) ? (Comparator) map.get(termiusSortTypeC) : cq.b.f47028a.c();
    }

    public static Comparator b(String str) {
        TermiusSortType termiusSortTypeC = c(str);
        Map map = f25093b;
        return map.containsKey(termiusSortTypeC) ? (Comparator) map.get(termiusSortTypeC) : cq.b.f47028a.g();
    }

    public static TermiusSortType c(String str) {
        String string = com.server.auditor.ssh.client.app.a.N().M().getString(str, f25092a.name());
        TermiusSortType termiusSortType = TermiusSortType.ByNameAscending;
        for (TermiusSortType termiusSortType2 : TermiusSortType.getEntries()) {
            if (termiusSortType2.name().equals(string)) {
                return termiusSortType2;
            }
        }
        return termiusSortType;
    }

    public static void d(List list, String str) {
        list.sort(a(str));
    }

    public static void e(List list, String str) {
        list.sort(b(str));
    }
}
