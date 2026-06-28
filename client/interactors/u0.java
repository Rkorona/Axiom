package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeysByDevices;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.k0 f27661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27662b;

    public interface a {
        void hd(TeamPublicKeysByDevices teamPublicKeysByDevices);

        void u3();
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27663a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27665c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27663a = obj;
            this.f27665c |= RtlSpacingHelper.UNDEFINED;
            return u0.this.a(this);
        }
    }

    public u0(il.k0 k0Var, a aVar) {
        ju.t.f(k0Var, "requestTeamPublicKeysRepository");
        ju.t.f(aVar, "callback");
        this.f27661a = k0Var;
        this.f27662b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.interactors.u0.b
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.interactors.u0$b r0 = (com.server.auditor.ssh.client.interactors.u0.b) r0
            int r1 = r0.f27665c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27665c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.u0$b r0 = new com.server.auditor.ssh.client.interactors.u0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27663a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27665c
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
            il.k0 r5 = r4.f27661a
            r0.f27665c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            il.k0$a r5 = (il.k0.a) r5
            boolean r0 = r5 instanceof il.k0.a.c
            if (r0 == 0) goto L51
            com.server.auditor.ssh.client.interactors.u0$a r0 = r4.f27662b
            il.k0$a$c r5 = (il.k0.a.c) r5
            com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeysByDevices r5 = r5.a()
            r0.hd(r5)
            goto L56
        L51:
            com.server.auditor.ssh.client.interactors.u0$a r5 = r4.f27662b
            r5.u3()
        L56:
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.u0.a(zt.e):java.lang.Object");
    }
}
