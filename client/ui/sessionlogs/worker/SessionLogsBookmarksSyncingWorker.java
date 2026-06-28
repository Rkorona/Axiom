package com.server.auditor.ssh.client.ui.sessionlogs.worker;

import android.content.Context;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.k0;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.server.auditor.ssh.client.interactors.h;
import com.server.auditor.ssh.client.interactors.i;
import com.server.auditor.ssh.client.interactors.j;
import com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker;
import hg.b2;
import ho.f;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.m;
import pl.q;
import to.i2;
import to.k2;
import to.p0;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import vl.b;
import vl.e;
import wu.i0;
import wu.j1;
import yg.a;
import yg.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionLogsBookmarksSyncingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f40827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f40828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f40829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f40830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f40831e;

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40832a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40834c;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40832a = obj;
            this.f40834c |= RtlSpacingHelper.UNDEFINED;
            return SessionLogsBookmarksSyncingWorker.this.doWork(this);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40835a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return SessionLogsBookmarksSyncingWorker.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40835a;
            try {
                if (i10 == 0) {
                    x.b(obj);
                    k2 k2VarJ = SessionLogsBookmarksSyncingWorker.this.j();
                    this.f40835a = 1;
                    if (k2VarJ.f(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x.b(obj);
                }
                return ListenableWorker.a.c();
            } catch (Throwable unused) {
                return ListenableWorker.a.a();
            }
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionLogsBookmarksSyncingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        t.f(context, "applicationContext");
        t.f(workerParameters, "workerParams");
        this.f40827a = com.server.auditor.ssh.client.app.a.N();
        this.f40828b = o.a(new iu.a() { // from class: vo.v
            @Override // iu.a
            public final Object a() {
                return SessionLogsBookmarksSyncingWorker.o(this.f83863a);
            }
        });
        this.f40829c = o.a(new iu.a() { // from class: vo.w
            @Override // iu.a
            public final Object a() {
                return SessionLogsBookmarksSyncingWorker.l();
            }
        });
        this.f40830d = o.a(new iu.a() { // from class: vo.x
            @Override // iu.a
            public final Object a() {
                return SessionLogsBookmarksSyncingWorker.m();
            }
        });
        this.f40831e = o.a(new iu.a() { // from class: vo.y
            @Override // iu.a
            public final Object a() {
                return SessionLogsBookmarksSyncingWorker.n(this.f83864a);
            }
        });
    }

    private final vl.b h() {
        return (vl.b) this.f40829c.getValue();
    }

    private final vl.e i() {
        return (vl.e) this.f40830d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k2 j() {
        return (k2) this.f40831e.getValue();
    }

    private final q k() {
        return (q) this.f40828b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.b l() {
        return b.a.b(vl.b.f83635b, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.e m() {
        return e.a.b(vl.e.f83685b, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final k2 n(SessionLogsBookmarksSyncingWorker sessionLogsBookmarksSyncingWorker) {
        ho.e eVar = new ho.e(null, sessionLogsBookmarksSyncingWorker.k(), 1, 0 == true ? 1 : 0);
        com.server.auditor.ssh.client.app.a aVar = sessionLogsBookmarksSyncingWorker.f40827a;
        t.e(aVar, "termiusStorage");
        i iVar = new i(aVar);
        h hVar = new h();
        com.server.auditor.ssh.client.app.a aVar2 = sessionLogsBookmarksSyncingWorker.f40827a;
        t.e(aVar2, "termiusStorage");
        return new k2(eVar, iVar, hVar, new j(aVar2), new f(), sessionLogsBookmarksSyncingWorker.i(), sessionLogsBookmarksSyncingWorker.h(), new i2(sessionLogsBookmarksSyncingWorker.i()), new p0(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q o(SessionLogsBookmarksSyncingWorker sessionLogsBookmarksSyncingWorker) {
        b2 b2Var = b2.f52944a;
        j1 j1VarB1 = b2Var.B1();
        hg.d dVarM = sessionLogsBookmarksSyncingWorker.f40827a.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        k0 k0VarP = sessionLogsBookmarksSyncingWorker.f40827a.P();
        t.e(k0VarP, "getIsSyncingLiveData(...)");
        com.server.auditor.ssh.client.app.a aVar = sessionLogsBookmarksSyncingWorker.f40827a;
        t.e(aVar, "termiusStorage");
        return new q(j1VarB1, dVarM, k0VarP, aVar, new pl.h(null, 1, null), new pp.b(b2Var.v1()), new d.a(), new a.C1401a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(zt.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker$a r0 = (com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker.a) r0
            int r1 = r0.f40834c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40834c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker$a r0 = new com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40832a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40834c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            ut.x.b(r6)
            wu.g0 r6 = wu.x0.b()
            com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker$b r2 = new com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f40834c = r3
            java.lang.Object r6 = wu.i.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            ju.t.e(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sessionlogs.worker.SessionLogsBookmarksSyncingWorker.doWork(zt.e):java.lang.Object");
    }
}
