package com.server.auditor.ssh.client.room;

import androidx.appcompat.widget.RtlSpacingHelper;
import tl.r0;

/* JADX INFO: loaded from: classes4.dex */
public interface d {

    public static final class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.room.d$a$a, reason: collision with other inner class name */
        static final class C0599a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f38816a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f38817b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38818c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f38819d;

            C0599a(zt.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f38818c = obj;
                this.f38819d |= RtlSpacingHelper.UNDEFINED;
                return a.a(null, null, this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if (r6.d(r7, r0) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
        
            if (r6.b(r8, r4, r0) == r1) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(com.server.auditor.ssh.client.room.d r6, tl.r0 r7, zt.e r8) {
            /*
                boolean r0 = r8 instanceof com.server.auditor.ssh.client.room.d.a.C0599a
                if (r0 == 0) goto L13
                r0 = r8
                com.server.auditor.ssh.client.room.d$a$a r0 = (com.server.auditor.ssh.client.room.d.a.C0599a) r0
                int r1 = r0.f38819d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f38819d = r1
                goto L18
            L13:
                com.server.auditor.ssh.client.room.d$a$a r0 = new com.server.auditor.ssh.client.room.d$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f38818c
                java.lang.Object r1 = au.b.f()
                int r2 = r0.f38819d
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L48
                if (r2 == r5) goto L3b
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                ut.x.b(r8)
                goto L86
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                ut.x.b(r8)
                goto L6e
            L3b:
                java.lang.Object r6 = r0.f38817b
                r7 = r6
                tl.r0 r7 = (tl.r0) r7
                java.lang.Object r6 = r0.f38816a
                com.server.auditor.ssh.client.room.d r6 = (com.server.auditor.ssh.client.room.d) r6
                ut.x.b(r8)
                goto L5c
            L48:
                ut.x.b(r8)
                java.lang.String r8 = r7.a()
                r0.f38816a = r6
                r0.f38817b = r7
                r0.f38819d = r5
                java.lang.Object r8 = r6.c(r8, r0)
                if (r8 != r1) goto L5c
                goto L85
            L5c:
                tl.r0 r8 = (tl.r0) r8
                r2 = 0
                if (r8 != 0) goto L71
                r0.f38816a = r2
                r0.f38817b = r2
                r0.f38819d = r4
                java.lang.Object r6 = r6.d(r7, r0)
                if (r6 != r1) goto L6e
                goto L85
            L6e:
                ut.m0 r6 = ut.m0.f82633a
                return r6
            L71:
                java.lang.String r8 = r7.a()
                long r4 = r7.c()
                r0.f38816a = r2
                r0.f38817b = r2
                r0.f38819d = r3
                java.lang.Object r6 = r6.b(r8, r4, r0)
                if (r6 != r1) goto L86
            L85:
                return r1
            L86:
                ut.m0 r6 = ut.m0.f82633a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.room.d.a.a(com.server.auditor.ssh.client.room.d, tl.r0, zt.e):java.lang.Object");
        }
    }

    Object a(String str, zt.e eVar);

    Object b(String str, long j10, zt.e eVar);

    Object c(String str, zt.e eVar);

    Object d(r0 r0Var, zt.e eVar);

    Object e(r0 r0Var, zt.e eVar);
}
