package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import android.content.Context;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.room.AppDatabase;
import ju.k;
import ju.t;
import so.l0;
import tl.m2;
import ut.m0;
import zt.e;
import zu.f;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40635b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40636c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile d f40637d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m2 f40638a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public static /* synthetic */ d b(a aVar, Context context, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = TermiusApplication.F();
            }
            return aVar.a(context);
        }

        public final d a(Context context) {
            d dVar;
            t.f(context, "context");
            d dVar2 = d.f40637d;
            if (dVar2 != null) {
                return dVar2;
            }
            synchronized (this) {
                dVar = d.f40637d;
                if (dVar == null) {
                    dVar = new d(AppDatabase.f38762a.a(context).F());
                    d.f40637d = dVar;
                }
            }
            return dVar;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40640b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f40642d;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40640b = obj;
            this.f40642d |= RtlSpacingHelper.UNDEFINED;
            return d.this.c(null, null, this);
        }
    }

    public d(m2 m2Var) {
        t.f(m2Var, "vaultLogsSettingsDao");
        this.f40638a = m2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6.g(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r6, java.util.List r7, zt.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.ui.sessionlogs.domain.d.b
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.ui.sessionlogs.domain.d$b r0 = (com.server.auditor.ssh.client.ui.sessionlogs.domain.d.b) r0
            int r1 = r0.f40642d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40642d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sessionlogs.domain.d$b r0 = new com.server.auditor.ssh.client.ui.sessionlogs.domain.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f40640b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40642d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r8)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f40639a
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            ut.x.b(r8)
            goto L4d
        L3d:
            ut.x.b(r8)
            tl.m2 r8 = r5.f40638a
            r0.f40639a = r7
            r0.f40642d = r4
            java.lang.Object r6 = r8.h(r6, r0)
            if (r6 != r1) goto L4d
            goto L5a
        L4d:
            tl.m2 r6 = r5.f40638a
            r8 = 0
            r0.f40639a = r8
            r0.f40642d = r3
            java.lang.Object r6 = r6.g(r7, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sessionlogs.domain.d.c(java.util.List, java.util.List, zt.e):java.lang.Object");
    }

    public final Object d(long j10, e eVar) {
        Object objE = this.f40638a.e(j10, eVar);
        return objE == au.b.f() ? objE : m0.f82633a;
    }

    public final Object e(e eVar) {
        Object objC = this.f40638a.c(eVar);
        return objC == au.b.f() ? objC : m0.f82633a;
    }

    public final Object f(long j10, e eVar) {
        return this.f40638a.a(j10, eVar);
    }

    public final Object g(e eVar) {
        return this.f40638a.b(eVar);
    }

    public final f h() {
        return this.f40638a.d();
    }

    public final Object i(l0 l0Var, e eVar) {
        Object objF = this.f40638a.f(l0Var, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }
}
