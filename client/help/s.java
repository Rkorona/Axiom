package com.server.auditor.ssh.client.help;

import android.content.Context;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.help.u;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f27090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.help.b f27091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f27092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final og.v f27093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f27094e;

    public interface a {
        void b0(String str);

        void g();

        void s1();

        void w();
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27095a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27097c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27095a = obj;
            this.f27097c |= RtlSpacingHelper.UNDEFINED;
            return s.this.e(this);
        }
    }

    public s(u uVar, com.server.auditor.ssh.client.help.b bVar, c cVar, og.v vVar, a aVar) {
        ju.t.f(uVar, "productBoardTokenApiRepository");
        ju.t.f(bVar, "applicationInfoRepository");
        ju.t.f(cVar, "clipBoardRepository");
        ju.t.f(vVar, "storageTeamInfoRepository");
        ju.t.f(aVar, "callback");
        this.f27090a = uVar;
        this.f27091b = bVar;
        this.f27092c = cVar;
        this.f27093d = vVar;
        this.f27094e = aVar;
    }

    private final void c(u.b bVar) {
        if (bVar instanceof u.b.C0427b) {
            this.f27094e.w();
            return;
        }
        if (ju.t.b(bVar, u.b.a.f27102a)) {
            this.f27094e.w();
            return;
        }
        if (ju.t.b(bVar, u.b.c.f27104a)) {
            this.f27094e.w();
            return;
        }
        if (ju.t.b(bVar, u.b.d.f27105a)) {
            this.f27094e.g();
            return;
        }
        if (ju.t.b(bVar, u.b.e.f27106a)) {
            this.f27094e.w();
        } else if (ju.t.b(bVar, u.b.g.f27108a)) {
            this.f27094e.w();
        } else {
            this.f27094e.w();
        }
    }

    private final void d(u.b bVar) {
        if (!(bVar instanceof u.b.f)) {
            c(bVar);
        } else {
            this.f27094e.b0(((u.b.f) bVar).a().getProductBoardTokenContent().getToken());
        }
    }

    public final void a(String str, String str2) {
        ju.t.f(str, "label");
        ju.t.f(str2, "text");
        this.f27092c.a().setPrimaryClip(this.f27092c.b(str, str2));
    }

    public final String b() {
        Context contextF = TermiusApplication.F();
        com.server.auditor.ssh.client.help.b bVar = this.f27091b;
        ju.t.c(contextF);
        return bVar.a(contextF);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.help.s.b
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.help.s$b r0 = (com.server.auditor.ssh.client.help.s.b) r0
            int r1 = r0.f27097c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27097c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.help.s$b r0 = new com.server.auditor.ssh.client.help.s$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27095a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27097c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            og.v r5 = r4.f27093d
            boolean r5 = r5.a()
            if (r5 == 0) goto L42
            com.server.auditor.ssh.client.help.s$a r5 = r4.f27094e
            r5.s1()
            goto L52
        L42:
            com.server.auditor.ssh.client.help.u r5 = r4.f27090a
            r0.f27097c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            com.server.auditor.ssh.client.help.u$b r5 = (com.server.auditor.ssh.client.help.u.b) r5
            r4.d(r5)
        L52:
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.help.s.e(zt.e):java.lang.Object");
    }
}
