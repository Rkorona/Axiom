package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import il.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.n0 f27676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27677b;

    public interface a {
        void K(String str);

        void R();

        void Z();

        void j2(int i10);

        void r();
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27678a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27680c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27678a = obj;
            this.f27680c |= RtlSpacingHelper.UNDEFINED;
            return w0.this.b(this);
        }
    }

    public w0(il.n0 n0Var, a aVar) {
        ju.t.f(n0Var, "sendQuickImportPromoEmailRepository");
        ju.t.f(aVar, "callback");
        this.f27676a = n0Var;
        this.f27677b = aVar;
    }

    private final void a(n0.a aVar) {
        if (ju.t.b(aVar, n0.a.d.f56513a)) {
            this.f27677b.r();
            return;
        }
        if (aVar instanceof n0.a.b) {
            this.f27677b.K(((n0.a.b) aVar).a());
            return;
        }
        if (aVar instanceof n0.a.C0847a) {
            y9.a.f86838a.i(((n0.a.C0847a) aVar).a());
            this.f27677b.R();
        } else if (aVar instanceof n0.a.e) {
            this.f27677b.j2(((n0.a.e) aVar).a());
        } else if (ju.t.b(aVar, n0.a.c.f56512a)) {
            this.f27677b.Z();
        } else {
            if (!ju.t.b(aVar, n0.a.f.f56515a)) {
                throw new ut.s();
            }
            this.f27677b.R();
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
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.interactors.w0.b
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.interactors.w0$b r0 = (com.server.auditor.ssh.client.interactors.w0.b) r0
            int r1 = r0.f27680c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27680c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.w0$b r0 = new com.server.auditor.ssh.client.interactors.w0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27678a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27680c
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
            il.n0 r5 = r4.f27676a
            r0.f27680c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            il.n0$a r5 = (il.n0.a) r5
            r4.a(r5)
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.w0.b(zt.e):java.lang.Object");
    }
}
