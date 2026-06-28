package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import op.l;
import op.m;
import tl.l2;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.b f27547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final og.s f27548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kp.e f27549d;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f27550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f27551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f27552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f27553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f27555f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27556u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f27558w;

        a(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27556u = obj;
            this.f27558w |= RtlSpacingHelper.UNDEFINED;
            return p0.this.b(false, false, null, null, this);
        }
    }

    public p0(com.server.auditor.ssh.client.app.a aVar, gj.b bVar, og.s sVar, kp.e eVar) {
        ju.t.f(aVar, "termiusStorage");
        ju.t.f(bVar, "vaultsInteractor");
        ju.t.f(sVar, "promotionsRepository");
        ju.t.f(eVar, "hasAbilityToCreateNewVaultUseCase");
        this.f27546a = aVar;
        this.f27547b = bVar;
        this.f27548c = sVar;
        this.f27549d = eVar;
    }

    private final op.m a(l2 l2Var, boolean z10, boolean z11, boolean z12) {
        return (sp.a.f(l2Var) && z10 && !z11) ? m.a.f69480a : sp.a.g(l2Var) ? z10 ? m.b.f69481a : z12 ? m.d.f69483a : m.c.f69482a : m.c.f69482a;
    }

    private final l.f c(l2 l2Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new l.f(l2Var.c(), l2Var.d(), (z10 && z11) ? false : l2Var.i(), a(l2Var, z12, z13, z14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r14, boolean r15, jp.a r16, java.util.List r17, zt.e r18) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.p0.b(boolean, boolean, jp.a, java.util.List, zt.e):java.lang.Object");
    }
}
