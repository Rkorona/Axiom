package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import android.content.Context;
import androidx.appcompat.widget.RtlSpacingHelper;
import ju.t;
import pp.l;
import pp.n;
import tl.l2;
import to.p;
import vk.g;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f40605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f40606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f40607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f40608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.ui.sessionlogs.domain.d f40609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p f40610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final to.d f40611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final to.c f40612h;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.domain.a$a, reason: collision with other inner class name */
    public interface InterfaceC0638a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.domain.a$a$a, reason: collision with other inner class name */
        public static final class C0639a implements InterfaceC0638a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0639a f40613a = new C0639a();

            private C0639a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0639a);
            }

            public int hashCode() {
                return 1998855242;
            }

            public String toString() {
                return "Failed";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.domain.a$a$b */
        public static final class b implements InterfaceC0638a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f40614a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1054390678;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f40616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40617c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40619e;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40617c = obj;
            this.f40619e |= RtlSpacingHelper.UNDEFINED;
            return a.this.e(null, false, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f40621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f40622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f40623d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f40625f;

        c(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40623d = obj;
            this.f40625f |= RtlSpacingHelper.UNDEFINED;
            return a.this.f(null, null, false, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f40627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f40628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f40629d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f40631f;

        d(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40629d = obj;
            this.f40631f |= RtlSpacingHelper.UNDEFINED;
            return a.this.g(null, null, false, this);
        }
    }

    public a(com.server.auditor.ssh.client.app.a aVar, g gVar, n nVar, l lVar, com.server.auditor.ssh.client.ui.sessionlogs.domain.d dVar, p pVar, to.d dVar2, to.c cVar) {
        t.f(aVar, "termiusStorage");
        t.f(gVar, "isProModeRepository");
        t.f(nVar, "updateVaultApiInteractor");
        t.f(lVar, "updatePersonalVaultApiInteractor");
        t.f(dVar, "vaultLogsSettingsDaoRepository");
        t.f(pVar, "deleteSessionLogsFromVaultUseCase");
        t.f(dVar2, "cacheVaultSessionLogsSettingUseCase");
        t.f(cVar, "cachePersonalVaultSessionLogsSettingUseCase");
        this.f40605a = aVar;
        this.f40606b = gVar;
        this.f40607c = nVar;
        this.f40608d = lVar;
        this.f40609e = dVar;
        this.f40610f = pVar;
        this.f40611g = dVar2;
        this.f40612h = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r9.a(r10, r11, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.content.Context r9, boolean r10, zt.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.server.auditor.ssh.client.ui.sessionlogs.domain.a.b
            if (r0 == 0) goto L13
            r0 = r11
            com.server.auditor.ssh.client.ui.sessionlogs.domain.a$b r0 = (com.server.auditor.ssh.client.ui.sessionlogs.domain.a.b) r0
            int r1 = r0.f40619e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40619e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sessionlogs.domain.a$b r0 = new com.server.auditor.ssh.client.ui.sessionlogs.domain.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f40617c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40619e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            ut.x.b(r11)
            goto La4
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            boolean r9 = r0.f40616b
            java.lang.Object r10 = r0.f40615a
            android.content.Context r10 = (android.content.Context) r10
            ut.x.b(r11)
            goto L86
        L42:
            boolean r10 = r0.f40616b
            java.lang.Object r9 = r0.f40615a
            android.content.Context r9 = (android.content.Context) r9
            ut.x.b(r11)
            goto L68
        L4c:
            ut.x.b(r11)
            pp.l r11 = r8.f40608d
            com.server.auditor.ssh.client.ui.vaults.data.UpdatePersonalVaultApiRequest r2 = new com.server.auditor.ssh.client.ui.vaults.data.UpdatePersonalVaultApiRequest
            com.server.auditor.ssh.client.ui.sessionlogs.data.PersonalVaultLogsSettingApiPayload r6 = new com.server.auditor.ssh.client.ui.sessionlogs.data.PersonalVaultLogsSettingApiPayload
            r6.<init>(r10)
            r2.<init>(r6)
            r0.f40615a = r9
            r0.f40616b = r10
            r0.f40619e = r5
            java.lang.Object r11 = r11.b(r2, r0)
            if (r11 != r1) goto L68
            goto La3
        L68:
            pp.l$a r11 = (pp.l.a) r11
            boolean r2 = r11 instanceof pp.l.a.b
            if (r2 == 0) goto La7
            to.c r2 = r8.f40612h
            pp.l$a$b r11 = (pp.l.a.b) r11
            com.server.auditor.ssh.client.ui.sessionlogs.data.PersonalVaultLogsSettingApiPayload r11 = r11.a()
            r0.f40615a = r9
            r0.f40616b = r10
            r0.f40619e = r4
            java.lang.Object r11 = r2.a(r11, r0)
            if (r11 != r1) goto L83
            goto La3
        L83:
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            vk.g r11 = r8.f40606b
            boolean r11 = r11.a()
            if (r11 != 0) goto La4
            if (r9 != 0) goto La4
            to.p r9 = r8.f40610f
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId$b r11 = com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId.Companion
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r11 = r11.a()
            r2 = 0
            r0.f40615a = r2
            r0.f40619e = r3
            java.lang.Object r9 = r9.a(r10, r11, r0)
            if (r9 != r1) goto La4
        La3:
            return r1
        La4:
            com.server.auditor.ssh.client.ui.sessionlogs.domain.a$a$b r9 = com.server.auditor.ssh.client.ui.sessionlogs.domain.a.InterfaceC0638a.b.f40614a
            return r9
        La7:
            pp.l$a$a r9 = pp.l.a.C1108a.f70559a
            boolean r9 = ju.t.b(r11, r9)
            if (r9 == 0) goto Lb2
            com.server.auditor.ssh.client.ui.sessionlogs.domain.a$a$a r9 = com.server.auditor.ssh.client.ui.sessionlogs.domain.a.InterfaceC0638a.C0639a.f40613a
            return r9
        Lb2:
            ut.s r9 = new ut.s
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sessionlogs.domain.a.e(android.content.Context, boolean, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r10.a(r8, r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.content.Context r8, tl.l2 r9, boolean r10, zt.e r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.server.auditor.ssh.client.ui.sessionlogs.domain.a.c
            if (r0 == 0) goto L13
            r0 = r11
            com.server.auditor.ssh.client.ui.sessionlogs.domain.a$c r0 = (com.server.auditor.ssh.client.ui.sessionlogs.domain.a.c) r0
            int r1 = r0.f40625f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40625f = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sessionlogs.domain.a$c r0 = new com.server.auditor.ssh.client.ui.sessionlogs.domain.a$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f40623d
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40625f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r11)
            goto L76
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            boolean r10 = r0.f40622c
            java.lang.Object r8 = r0.f40621b
            r9 = r8
            tl.l2 r9 = (tl.l2) r9
            java.lang.Object r8 = r0.f40620a
            android.content.Context r8 = (android.content.Context) r8
            ut.x.b(r11)
            goto L60
        L43:
            ut.x.b(r11)
            com.server.auditor.ssh.client.ui.sessionlogs.domain.d r11 = r7.f40609e
            so.l0 r2 = new so.l0
            long r5 = r9.e()
            r2.<init>(r5, r10)
            r0.f40620a = r8
            r0.f40621b = r9
            r0.f40622c = r10
            r0.f40625f = r4
            java.lang.Object r11 = r11.i(r2, r0)
            if (r11 != r1) goto L60
            goto L75
        L60:
            if (r10 != 0) goto L76
            to.p r10 = r7.f40610f
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r9 = r9.g()
            r11 = 0
            r0.f40620a = r11
            r0.f40621b = r11
            r0.f40625f = r3
            java.lang.Object r8 = r10.a(r8, r9, r0)
            if (r8 != r1) goto L76
        L75:
            return r1
        L76:
            com.server.auditor.ssh.client.ui.sessionlogs.domain.a$a$b r8 = com.server.auditor.ssh.client.ui.sessionlogs.domain.a.InterfaceC0638a.b.f40614a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sessionlogs.domain.a.f(android.content.Context, tl.l2, boolean, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        if (r0.a(r6, r1, r2) != r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.content.Context r14, tl.l2 r15, boolean r16, zt.e r17) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sessionlogs.domain.a.g(android.content.Context, tl.l2, boolean, zt.e):java.lang.Object");
    }

    public final Object d(Context context, l2 l2Var, boolean z10, e eVar) {
        return this.f40605a.r0() ? sp.a.f(l2Var) ? e(context, z10, eVar) : g(context, l2Var, z10, eVar) : f(context, l2Var, z10, eVar);
    }
}
