package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import jl.d;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jl.d f27654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27655b;

    public interface a {
        void onRequestProTrialExtensionFailed(String str);

        void onRequestProTrialExtensionNetworkError();

        void onRequestProTrialExtensionNotAllowed();

        void onRequestProTrialExtensionSuccess(String str);

        void onRequestProTrialExtensionUnknownError();
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27656a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27658c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27656a = obj;
            this.f27658c |= RtlSpacingHelper.UNDEFINED;
            return t0.this.b(this);
        }
    }

    public t0(jl.d dVar, a aVar) {
        ju.t.f(dVar, "requestProTrialExtensionRepository");
        ju.t.f(aVar, "callback");
        this.f27654a = dVar;
        this.f27655b = aVar;
    }

    private final void a(d.a aVar) {
        if (aVar instanceof d.a.e) {
            this.f27655b.onRequestProTrialExtensionSuccess(((d.a.e) aVar).a());
            return;
        }
        if (aVar instanceof d.a.b) {
            this.f27655b.onRequestProTrialExtensionFailed(((d.a.b) aVar).a());
            return;
        }
        if (aVar instanceof d.a.C0932a) {
            this.f27655b.onRequestProTrialExtensionUnknownError();
            return;
        }
        if (ju.t.b(aVar, d.a.c.f62681a)) {
            this.f27655b.onRequestProTrialExtensionNetworkError();
        } else if (ju.t.b(aVar, d.a.f.f62684a)) {
            this.f27655b.onRequestProTrialExtensionUnknownError();
        } else {
            if (!ju.t.b(aVar, d.a.C0933d.f62682a)) {
                throw new ut.s();
            }
            this.f27655b.onRequestProTrialExtensionNotAllowed();
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
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.interactors.t0.b
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.interactors.t0$b r0 = (com.server.auditor.ssh.client.interactors.t0.b) r0
            int r1 = r0.f27658c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27658c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.t0$b r0 = new com.server.auditor.ssh.client.interactors.t0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27656a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27658c
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
            jl.d r5 = r4.f27654a
            r0.f27658c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            jl.d$a r5 = (jl.d.a) r5
            r4.a(r5)
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.t0.b(zt.e):java.lang.Object");
    }
}
