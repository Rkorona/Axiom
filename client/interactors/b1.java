package com.server.auditor.ssh.client.interactors;

import android.content.SharedPreferences;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27295d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27296e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg.d f27297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f27298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final iu.a f27299c;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27301b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27303d;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27301b = obj;
            this.f27303d |= RtlSpacingHelper.UNDEFINED;
            return b1.this.b(null, this);
        }
    }

    public b1(hg.d dVar, com.server.auditor.ssh.client.utils.analytics.a aVar, iu.a aVar2) {
        ju.t.f(dVar, "insensitiveKeyValueRepository");
        ju.t.f(aVar, "avoAnalytics");
        ju.t.f(aVar2, "checkUnauthorized");
        this.f27297a = dVar;
        this.f27298b = aVar;
        this.f27299c = aVar2;
    }

    public final void a() {
        if (this.f27297a.getBoolean(WelcomeFlowViewModel.keyPrefOnboarding, false)) {
            return;
        }
        e(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(iu.a r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.interactors.b1.b
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.interactors.b1$b r0 = (com.server.auditor.ssh.client.interactors.b1.b) r0
            int r1 = r0.f27303d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27303d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.b1$b r0 = new com.server.auditor.ssh.client.interactors.b1$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27301b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27303d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f27300a
            iu.a r7 = (iu.a) r7
            ut.x.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ut.x.b(r8)
            r0.f27300a = r7
            r0.f27303d = r3
            r4 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r8 = wu.s0.b(r4, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            iu.a r8 = r6.f27299c
            java.lang.Object r8 = r8.a()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L66
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L66
            boolean r7 = r6.c()
            if (r7 == 0) goto L66
            goto L67
        L66:
            r3 = 0
        L67:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.b1.b(iu.a, zt.e):java.lang.Object");
    }

    public final boolean c() {
        return this.f27297a.getBoolean("termius_x_announcement_enabled", true);
    }

    public final void d() {
        if (c()) {
            this.f27298b.W5();
        }
        e(false);
    }

    public final void e(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f27297a.edit();
        editorEdit.putBoolean("termius_x_announcement_enabled", z10);
        editorEdit.apply();
    }

    public /* synthetic */ b1(hg.d dVar, com.server.auditor.ssh.client.utils.analytics.a aVar, iu.a aVar2, int i10, ju.k kVar) {
        this(dVar, (i10 & 2) != 0 ? com.server.auditor.ssh.client.utils.analytics.a.y() : aVar, aVar2);
    }
}
