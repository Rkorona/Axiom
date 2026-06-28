package com.server.auditor.ssh.client.interactors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import yg.a;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27447b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27448c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27449a;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public j(com.server.auditor.ssh.client.app.a aVar) {
        ju.t.f(aVar, "termiusStorage");
        this.f27449a = aVar;
    }

    public static /* synthetic */ rg.v b(j jVar, boolean z10, List list, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return jVar.a(z10, list, z11);
    }

    public final rg.v a(boolean z10, List list, boolean z11) {
        Object next;
        ju.t.f(list, "teamKeys");
        if (z11 && list.isEmpty()) {
            throw new IllegalStateException("Cannot create Team Cryptors, because team keys are empty!");
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((dq.x) next).e()) {
                        break;
                    }
                }
                dq.x xVar = (dq.x) next;
                return new rg.v(xVar != null ? (rg.h) map.get(Long.valueOf(xVar.c())) : null, map);
            }
            dq.x xVar2 = (dq.x) it.next();
            long jC = xVar2.c();
            rg.x xVar3 = new rg.x(new rg.d(xVar2.a(), this.f27449a.f(), xVar2.b(), Long.valueOf(jC), new a.C1401a()), null);
            rg.h hVar = new rg.h(xVar3, z10, xVar2.d());
            if (xVar3.k() != 0) {
                String str = String.format("Team cryptor for key %s initialization failed", Arrays.copyOf(new Object[]{Long.valueOf(jC)}, 1));
                ju.t.e(str, "format(...)");
                throw new IllegalStateException(str.toString());
            }
            map.put(Long.valueOf(jC), hVar);
        }
    }
}
