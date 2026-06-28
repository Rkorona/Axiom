package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oa {

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0.a f31801d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, e0.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f31799b = z10;
            this.f31800c = z11;
            this.f31801d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f31799b, this.f31800c, this.f31801d, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            if (e0.a.a(r7, null, r6, 1, null) != r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r6.f31798a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r7)
                goto L40
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                ut.x.b(r7)
                goto L34
            L1e:
                ut.x.b(r7)
                boolean r7 = r6.f31799b
                if (r7 == 0) goto L40
                boolean r7 = r6.f31800c
                if (r7 != 0) goto L40
                r6.f31798a = r3
                r4 = 200(0xc8, double:9.9E-322)
                java.lang.Object r7 = wu.s0.b(r4, r6)
                if (r7 != r0) goto L34
                goto L3f
            L34:
                e0.a r7 = r6.f31801d
                r6.f31798a = r2
                r1 = 0
                java.lang.Object r7 = e0.a.a(r7, r1, r6, r3, r1)
                if (r7 != r0) goto L40
            L3f:
                return r0
            L40:
                ut.m0 r7 = ut.m0.f82633a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.oa.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void h(final boolean r110, iu.l r111, iu.a r112, androidx.compose.runtime.m r113, final int r114, final int r115) {
        /*
            Method dump skipped, instruction units count: 1529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.oa.h(boolean, iu.l, iu.a, androidx.compose.runtime.m, int, int):void");
    }

    private static final j3.t0 i(androidx.compose.runtime.e2 e2Var) {
        return (j3.t0) e2Var.getValue();
    }

    private static final void j(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
        e2Var.setValue(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 k(iu.l lVar, androidx.compose.runtime.e2 e2Var, h0.j2 j2Var) {
        ju.t.f(j2Var, "$this$KeyboardActions");
        lVar.invoke(i(e2Var).m());
        j(e2Var, new j3.t0((String) null, 0L, (e3.g3) null, 7, (ju.k) null));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 l(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
        ju.t.f(t0Var, "it");
        j(e2Var, t0Var);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 m(iu.l lVar, androidx.compose.runtime.e2 e2Var) {
        lVar.invoke(i(e2Var).m());
        j(e2Var, new j3.t0((String) null, 0L, (e3.g3) null, 7, (ju.k) null));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 n(boolean z10, iu.l lVar, iu.a aVar, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        h(z10, lVar, aVar, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 o(String str) {
        ju.t.f(str, "it");
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 p() {
        return ut.m0.f82633a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final boolean r17, final op.a r18, final iu.l r19, final iu.a r20, v1.m r21, androidx.compose.runtime.m r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.oa.q(boolean, op.a, iu.l, iu.a, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 r(boolean z10, op.a aVar, iu.l lVar, iu.a aVar2, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        q(z10, aVar, lVar, aVar2, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}
