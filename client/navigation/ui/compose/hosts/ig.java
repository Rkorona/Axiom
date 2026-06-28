package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.appcompat.widget.RtlSpacingHelper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ig {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31456d;

        a(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31455c = obj;
            this.f31456d |= RtlSpacingHelper.UNDEFINED;
            return ig.a(null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r5.f(r7, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e1.d r5, java.lang.Object r6, zt.e r7) {
        /*
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.navigation.ui.compose.hosts.ig.a
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.navigation.ui.compose.hosts.ig$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.hosts.ig.a) r0
            int r1 = r0.f31456d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31456d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.navigation.ui.compose.hosts.ig$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.hosts.ig$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31455c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f31456d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r7)
            goto L72
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f31454b
            e1.d r5 = (e1.d) r5
            java.lang.Object r6 = r0.f31453a
            ut.x.b(r7)
            goto L5e
        L3e:
            ut.x.b(r7)
            e1.b$a r7 = e1.b.f48366b
            java.lang.String r2 = r7.a()
            boolean r2 = r5.d(r2)
            if (r2 == 0) goto L5e
            java.lang.String r7 = r7.a()
            r0.f31453a = r6
            r0.f31454b = r5
            r0.f31456d = r4
            java.lang.Object r7 = r5.e(r7, r0)
            if (r7 != r1) goto L5e
            goto L71
        L5e:
            c1.t r7 = c1.t.f14791a
            c1.i1 r7 = r7.a()
            r2 = 0
            r0.f31453a = r2
            r0.f31454b = r2
            r0.f31456d = r3
            java.lang.Object r5 = r5.f(r7, r6, r0)
            if (r5 != r1) goto L72
        L71:
            return r1
        L72:
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ig.a(e1.d, java.lang.Object, zt.e):java.lang.Object");
    }
}
