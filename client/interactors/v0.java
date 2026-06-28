package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import il.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.l0 f27668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27669b;

    public interface a {
        void C0();

        void t1(String str);

        void y1();

        void z0();

        void z1(int i10);
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27670a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27672c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27670a = obj;
            this.f27672c |= RtlSpacingHelper.UNDEFINED;
            return v0.this.b(this);
        }
    }

    public v0(il.l0 l0Var, a aVar) {
        ju.t.f(l0Var, "sendBackUpAndSyncPromoEmailRepository");
        ju.t.f(aVar, "callback");
        this.f27668a = l0Var;
        this.f27669b = aVar;
    }

    private final void a(l0.a aVar) {
        if (ju.t.b(aVar, l0.a.d.f56475a)) {
            this.f27669b.y1();
            return;
        }
        if (aVar instanceof l0.a.b) {
            this.f27669b.t1(((l0.a.b) aVar).a());
            return;
        }
        if (aVar instanceof l0.a.C0844a) {
            y9.a.f86838a.i(((l0.a.C0844a) aVar).a());
            this.f27669b.C0();
        } else if (aVar instanceof l0.a.e) {
            this.f27669b.z1(((l0.a.e) aVar).a());
        } else if (ju.t.b(aVar, l0.a.c.f56474a)) {
            this.f27669b.z0();
        } else {
            if (!ju.t.b(aVar, l0.a.f.f56477a)) {
                throw new ut.s();
            }
            this.f27669b.C0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.interactors.v0.b
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.interactors.v0$b r0 = (com.server.auditor.ssh.client.interactors.v0.b) r0
            int r1 = r0.f27672c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27672c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.v0$b r0 = new com.server.auditor.ssh.client.interactors.v0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27670a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27672c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            il.l0 r5 = r4.f27668a
            r0.f27672c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            il.l0$a r5 = (il.l0.a) r5
            r4.a(r5)
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.v0.b(zt.e):java.lang.Object");
    }
}
