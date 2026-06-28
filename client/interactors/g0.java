package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vl.g f27406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pp.i f27407b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27408a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27410c;

        a(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27408a = obj;
            this.f27410c |= RtlSpacingHelper.UNDEFINED;
            return g0.this.c(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27411a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27413c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27411a = obj;
            this.f27413c |= RtlSpacingHelper.UNDEFINED;
            return g0.this.d(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27414a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27416c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27414a = obj;
            this.f27416c |= RtlSpacingHelper.UNDEFINED;
            return g0.this.e(this);
        }
    }

    public g0(vl.g gVar, pp.i iVar) {
        ju.t.f(gVar, "vaultsRepository");
        ju.t.f(iVar, "requestVaultsApiInteractor");
        this.f27406a = gVar;
        this.f27407b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.interactors.g0.a
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.interactors.g0$a r0 = (com.server.auditor.ssh.client.interactors.g0.a) r0
            int r1 = r0.f27410c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27410c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.g0$a r0 = new com.server.auditor.ssh.client.interactors.g0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27408a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27410c
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
            pp.i r5 = r4.f27407b
            r0.f27410c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            pp.i$a r5 = (pp.i.a) r5
            boolean r0 = r5 instanceof pp.i.a.b
            r1 = 0
            if (r0 == 0) goto L72
            pp.i$a$b r5 = (pp.i.a.b) r5
            java.util.List r5 = r5.b()
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel r2 = (com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel) r2
            boolean r2 = r2.isDefault()
            if (r2 == 0) goto L50
            goto L65
        L64:
            r0 = r1
        L65:
            com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel r0 = (com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel) r0
            if (r0 == 0) goto L6d
            java.lang.Long r1 = r0.getOriginalKey()
        L6d:
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r5 = com.server.auditor.ssh.client.ui.vaults.data.a.d(r1)
            return r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.g0.c(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.interactors.g0.b
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.interactors.g0$b r0 = (com.server.auditor.ssh.client.interactors.g0.b) r0
            int r1 = r0.f27413c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27413c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.g0$b r0 = new com.server.auditor.ssh.client.interactors.g0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27411a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27413c
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
            vl.g r5 = r4.f27406a
            r0.f27413c = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            tl.l2 r5 = (tl.l2) r5
            if (r5 == 0) goto L48
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r5 = r5.g()
            return r5
        L48:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.g0.d(zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(zt.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.interactors.g0.c
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.interactors.g0$c r0 = (com.server.auditor.ssh.client.interactors.g0.c) r0
            int r1 = r0.f27416c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27416c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.g0$c r0 = new com.server.auditor.ssh.client.interactors.g0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27414a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27416c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ut.x.b(r6)
            goto L44
        L38:
            ut.x.b(r6)
            r0.f27416c = r4
            java.lang.Object r6 = r5.d(r0)
            if (r6 != r1) goto L44
            goto L50
        L44:
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r6 = (com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId) r6
            if (r6 != 0) goto L53
            r0.f27416c = r3
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r6 = (com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId) r6
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.g0.e(zt.e):java.lang.Object");
    }
}
