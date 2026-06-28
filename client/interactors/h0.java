package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import il.a0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.a0 f27434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27435b;

    public interface a {
        void D(int i10);

        void P1();

        void X();

        void n0(String str);

        void v0(List list);
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27436a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27438c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27436a = obj;
            this.f27438c |= RtlSpacingHelper.UNDEFINED;
            return h0.this.b(this);
        }
    }

    public h0(il.a0 a0Var, a aVar) {
        ju.t.f(a0Var, "obtainUserActiveDevicesRepository");
        ju.t.f(aVar, "callback");
        this.f27434a = a0Var;
        this.f27435b = aVar;
    }

    private final void a(a0.a aVar) {
        if (aVar instanceof a0.a.d) {
            this.f27435b.v0(((a0.a.d) aVar).a());
            return;
        }
        if (aVar instanceof a0.a.b) {
            this.f27435b.n0(((a0.a.b) aVar).a());
            return;
        }
        if (aVar instanceof a0.a.C0830a) {
            y9.a.f86838a.i(((a0.a.C0830a) aVar).a());
            this.f27435b.P1();
        } else if (ju.t.b(aVar, a0.a.c.f56233a)) {
            this.f27435b.X();
        } else if (aVar instanceof a0.a.e) {
            this.f27435b.D(((a0.a.e) aVar).a());
        } else {
            if (!ju.t.b(aVar, a0.a.f.f56236a)) {
                throw new ut.s();
            }
            this.f27435b.P1();
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
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.interactors.h0.b
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.interactors.h0$b r0 = (com.server.auditor.ssh.client.interactors.h0.b) r0
            int r1 = r0.f27438c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27438c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.h0$b r0 = new com.server.auditor.ssh.client.interactors.h0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27436a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27438c
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
            il.a0 r5 = r4.f27434a
            r0.f27438c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            il.a0$a r5 = (il.a0.a) r5
            r4.a(r5)
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.h0.b(zt.e):java.lang.Object");
    }
}
