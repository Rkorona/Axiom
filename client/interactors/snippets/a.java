package com.server.auditor.ssh.client.interactors.snippets;

import android.content.SharedPreferences;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.server.auditor.ssh.client.database.models.CompletionDBModel;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import il.h;
import il.p0;
import iu.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f27598k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27599l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SessionManager f27600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f27601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f27602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hg.d f27603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final il.a f27604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SyncServiceHelper f27605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0441a f27606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList f27608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27609j;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.snippets.a$a, reason: collision with other inner class name */
    public interface InterfaceC0441a {
        void e();

        void i();

        void t();

        void w();

        void y(List list);
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27610a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27612c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27610a = obj;
            this.f27612c |= RtlSpacingHelper.UNDEFINED;
            return a.this.c(this);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27613a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27613a;
            if (i10 == 0) {
                x.b(obj);
                p0 p0Var = a.this.f27602c;
                this.f27613a = 1;
                obj = p0Var.a(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(!((Collection) obj).isEmpty());
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27618d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27620f;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27618d = obj;
            this.f27620f |= RtlSpacingHelper.UNDEFINED;
            return a.this.f(this);
        }
    }

    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Integer.valueOf(((CompletionDBModel) obj2).getUseCounter()), Integer.valueOf(((CompletionDBModel) obj).getUseCounter()));
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27622b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27624d;

        g(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27622b = obj;
            this.f27624d |= RtlSpacingHelper.UNDEFINED;
            return a.this.k(this);
        }
    }

    public a(SessionManager sessionManager, h hVar, p0 p0Var, hg.d dVar, il.a aVar, SyncServiceHelper syncServiceHelper, InterfaceC0441a interfaceC0441a) {
        t.f(sessionManager, "sessionManager");
        t.f(hVar, "completionDBRepository");
        t.f(p0Var, "snippetDBRepository");
        t.f(dVar, "insensitiveKeyValueRepository");
        t.f(aVar, "analyticsRepository");
        t.f(syncServiceHelper, "syncServiceHelper");
        t.f(interfaceC0441a, "callback");
        this.f27600a = sessionManager;
        this.f27601b = hVar;
        this.f27602c = p0Var;
        this.f27603d = dVar;
        this.f27604e = aVar;
        this.f27605f = syncServiceHelper;
        this.f27606g = interfaceC0441a;
        this.f27608i = new ArrayList();
    }

    private final List e(List list) {
        ArrayList arrayList = new ArrayList(v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("• " + ((String) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.interactors.snippets.a.g
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.interactors.snippets.a$g r0 = (com.server.auditor.ssh.client.interactors.snippets.a.g) r0
            int r1 = r0.f27624d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27624d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.snippets.a$g r0 = new com.server.auditor.ssh.client.interactors.snippets.a$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27622b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27624d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f27621a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            ut.x.b(r7)
            goto L4d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            ut.x.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            il.h r2 = r6.f27601b
            r0.f27621a = r7
            r0.f27624d = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r5 = r0
            r0 = r7
            r7 = r5
        L4d:
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r7)
            int r7 = r1.size()
            if (r7 <= r3) goto L62
            com.server.auditor.ssh.client.interactors.snippets.a$f r7 = new com.server.auditor.ssh.client.interactors.snippets.a$f
            r7.<init>()
            vt.v.D(r1, r7)
        L62:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L6b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L87
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.server.auditor.ssh.client.database.models.CompletionDBModel r3 = (com.server.auditor.ssh.client.database.models.CompletionDBModel) r3
            java.lang.String r3 = r3.getCommand()
            int r3 = r3.length()
            r4 = 5
            if (r3 < r4) goto L6b
            r7.add(r2)
            goto L6b
        L87:
            int r1 = r7.size()
            r2 = 10
            if (r1 < r2) goto Lb8
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = vt.v.z(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L9c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lb0
            java.lang.Object r2 = r7.next()
            com.server.auditor.ssh.client.database.models.CompletionDBModel r2 = (com.server.auditor.ssh.client.database.models.CompletionDBModel) r2
            java.lang.String r2 = r2.getCommand()
            r1.add(r2)
            goto L9c
        Lb0:
            r7 = 3
            java.util.List r7 = vt.v.U0(r1, r7)
            r0.addAll(r7)
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.snippets.a.k(zt.e):java.lang.Object");
    }

    private final void l() {
        SharedPreferences.Editor editorEdit = this.f27603d.edit();
        editorEdit.putBoolean("was_add_to_snippets_hint_presented", true);
        editorEdit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.interactors.snippets.a.c
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.interactors.snippets.a$c r0 = (com.server.auditor.ssh.client.interactors.snippets.a.c) r0
            int r1 = r0.f27612c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27612c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.snippets.a$c r0 = new com.server.auditor.ssh.client.interactors.snippets.a$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27610a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27612c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r7)
            goto L86
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            ut.x.b(r7)
            goto L72
        L38:
            ut.x.b(r7)
            hg.d r7 = r6.f27603d
            java.lang.String r2 = "was_add_to_snippets_hint_presented"
            r5 = 0
            boolean r7 = r7.getBoolean(r2, r5)
            com.crystalnix.termius.libtermius.wrappers.SessionManager r2 = r6.f27600a
            com.crystalnix.termius.libtermius.wrappers.SftpSessionHelper r2 = r2.sftpSessionHelper
            java.util.List r2 = r2.getSftpSessionIds()
            boolean r2 = r2.isEmpty()
            if (r7 != 0) goto La3
            boolean r7 = r6.f27607h
            if (r7 != 0) goto La3
            if (r2 == 0) goto La3
            boolean r7 = r6.d()
            if (r7 == 0) goto L5f
            goto La3
        L5f:
            wu.g0 r7 = wu.x0.b()
            com.server.auditor.ssh.client.interactors.snippets.a$d r2 = new com.server.auditor.ssh.client.interactors.snippets.a$d
            r5 = 0
            r2.<init>(r5)
            r0.f27612c = r4
            java.lang.Object r7 = wu.i.g(r7, r2, r0)
            if (r7 != r1) goto L72
            goto L85
        L72:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7d
            ut.m0 r7 = ut.m0.f82633a
            return r7
        L7d:
            r0.f27612c = r3
            java.lang.Object r7 = r6.k(r0)
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            java.util.List r7 = (java.util.List) r7
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto La0
            java.util.ArrayList r0 = r6.f27608i
            r0.addAll(r7)
            r6.f27607h = r4
            com.server.auditor.ssh.client.interactors.snippets.a$a r7 = r6.f27606g
            java.util.ArrayList r0 = r6.f27608i
            java.util.List r0 = r6.e(r0)
            r7.y(r0)
        La0:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        La3:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.snippets.a.c(zt.e):java.lang.Object");
    }

    public final boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - this.f27603d.getLong("time_of_first_successful_terminal_session", jCurrentTimeMillis) < 86400000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009f -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(zt.e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.server.auditor.ssh.client.interactors.snippets.a.e
            if (r0 == 0) goto L13
            r0 = r10
            com.server.auditor.ssh.client.interactors.snippets.a$e r0 = (com.server.auditor.ssh.client.interactors.snippets.a.e) r0
            int r1 = r0.f27620f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27620f = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.snippets.a$e r0 = new com.server.auditor.ssh.client.interactors.snippets.a$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27618d
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27620f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r2 = r0.f27617c
            il.a r2 = (il.a) r2
            java.lang.Object r6 = r0.f27616b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f27615a
            java.util.Iterator r7 = (java.util.Iterator) r7
            ut.x.b(r10)
            goto La2
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L41:
            java.lang.Object r2 = r0.f27616b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.f27615a
            java.util.Iterator r6 = (java.util.Iterator) r6
            ut.x.b(r10)
            r7 = r6
        L4d:
            r6 = r2
            goto L8f
        L4f:
            ut.x.b(r10)
            r9.l()
            java.util.ArrayList r10 = r9.f27608i
            java.util.Iterator r10 = r10.iterator()
            java.lang.String r2 = "iterator(...)"
            ju.t.e(r10, r2)
        L60:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r10.next()
            java.lang.String r6 = "next(...)"
            ju.t.e(r2, r6)
            java.lang.String r2 = (java.lang.String) r2
            com.server.auditor.ssh.client.database.models.SnippetDBModel r6 = new com.server.auditor.ssh.client.database.models.SnippetDBModel
            java.lang.String r7 = ""
            r6.<init>(r7, r2)
            r6.setShared(r3)
            il.p0 r7 = r9.f27602c
            r0.f27615a = r10
            r0.f27616b = r2
            r8 = 0
            r0.f27617c = r8
            r0.f27620f = r5
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L8d
            goto La1
        L8d:
            r7 = r10
            goto L4d
        L8f:
            il.a r2 = r9.f27604e
            il.p0 r10 = r9.f27602c
            r0.f27615a = r7
            r0.f27616b = r6
            r0.f27617c = r2
            r0.f27620f = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto La2
        La1:
            return r1
        La2:
            java.util.List r10 = (java.util.List) r10
            int r10 = r10.size()
            r2.a(r10, r5, r6, r3)
            r10 = r7
            goto L60
        Lad:
            r9.f27609j = r5
            com.server.auditor.ssh.client.synchronization.SyncServiceHelper r10 = r9.f27605f
            r10.startFullSync()
            com.server.auditor.ssh.client.interactors.snippets.a$a r10 = r9.f27606g
            r10.w()
            ut.m0 r10 = ut.m0.f82633a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.snippets.a.f(zt.e):java.lang.Object");
    }

    public final boolean g() {
        if (!this.f27607h) {
            return false;
        }
        this.f27607h = false;
        l();
        this.f27604e.b();
        this.f27606g.e();
        return true;
    }

    public final void h() {
        this.f27607h = false;
        l();
        this.f27604e.b();
        this.f27606g.e();
        this.f27606g.i();
    }

    public final void i() {
        this.f27607h = false;
        l();
        this.f27606g.e();
        this.f27606g.t();
    }

    public final void j() {
        if (this.f27609j) {
            this.f27607h = false;
            l();
            this.f27606g.e();
        }
    }
}
