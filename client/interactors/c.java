package com.server.auditor.ssh.client.interactors;

import android.util.Base64;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.models.user.CentrifugoChannelToken;
import com.server.auditor.ssh.client.synchronization.api.models.user.CentrifugoChannelTokenList;
import il.g0;
import il.h0;
import io.split.android.client.service.sseclient.EventStreamParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vq.m1;
import vq.q1;
import vq.r1;
import vq.t1;
import vq.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f27304o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f27305p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TeamMembersOnlineCacheRepository f27306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final il.g f27307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final il.h0 f27308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final il.g0 f27309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final hg.d f27310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SyncServiceHelper f27311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wu.g0 f27312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final mv.b f27313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f27314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private vq.h0 f27317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q1 f27318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q1 f27319n;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27321b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27323d;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27321b = obj;
            this.f27323d |= RtlSpacingHelper.UNDEFINED;
            return c.this.q(this);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.c$c, reason: collision with other inner class name */
    static final class C0434c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27324a;

        C0434c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new C0434c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27324a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return obj;
            }
            ut.x.b(obj);
            il.h0 h0Var = c.this.f27308c;
            this.f27324a = 1;
            Object objB = h0Var.b(this);
            return objB == objF ? objF : objB;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((C0434c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27326a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27326a;
            if (i10 == 0) {
                ut.x.b(obj);
                c cVar = c.this;
                this.f27326a = 1;
                if (cVar.q(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class e extends vq.t0 {

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27329a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f27330b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, zt.e eVar) {
                super(2, eVar);
                this.f27330b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f27330b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f27329a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    return obj;
                }
                ut.x.b(obj);
                il.h0 h0Var = this.f27330b.f27308c;
                this.f27329a = 1;
                Object objB = h0Var.b(this);
                return objB == objF ? objF : objB;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        e() {
        }

        @Override // vq.t0
        public void a(vq.h0 h0Var, vq.o0 o0Var) {
            ju.t.f(h0Var, "client");
            ju.t.f(o0Var, EventStreamParser.EVENT_FIELD);
            if (c.this.f27317l != null) {
                return;
            }
            c.this.f27317l = h0Var;
            c.this.f27316k = true;
            c.this.f27314i = 0L;
            c.this.C();
        }

        @Override // vq.t0
        public void b(vq.h0 h0Var, vq.q0 q0Var) {
            ju.t.f(h0Var, "client");
            ju.t.f(q0Var, EventStreamParser.EVENT_FIELD);
            c.this.f27314i = 0L;
            if (ju.t.b(q0Var.a(), "connection error") && q0Var.b().booleanValue()) {
                c.this.f27306a.q();
                return;
            }
            if (ju.t.b(h0Var, c.this.f27317l)) {
                c.this.f27316k = false;
                c.this.f27317l = null;
                c.this.f27318m = null;
                c.this.f27306a.w(new ArrayList());
                if (ju.t.b(q0Var.a(), "private subscribe error") && c.this.f27315j) {
                    h0Var.Z();
                } else if ((ju.t.b(q0Var.a(), "expired") && q0Var.b().booleanValue()) || ju.t.b(q0Var.a(), "stale")) {
                    c.this.f27307b.b();
                    c.this.s();
                }
            }
        }

        @Override // vq.t0
        public void g(vq.h0 h0Var, vq.z0 z0Var, t1 t1Var) {
            ju.t.f(h0Var, "client");
            ju.t.f(z0Var, EventStreamParser.EVENT_FIELD);
            ju.t.f(t1Var, "cb");
            c.this.A(z0Var, t1Var);
        }

        @Override // vq.t0
        public void i(vq.h0 h0Var, vq.b1 b1Var, t1 t1Var) {
            ju.t.f(h0Var, "client");
            ju.t.f(b1Var, EventStreamParser.EVENT_FIELD);
            ju.t.f(t1Var, "cb");
            h0.a aVar = (h0.a) wu.i.e(c.this.f27312g, new a(c.this, null));
            if (aVar instanceof h0.a.c) {
                t1Var.b(((h0.a.c) aVar).a().getToken());
            } else {
                t1Var.a(new RuntimeException("unable to get auth token"));
            }
        }
    }

    public static final class f extends r1 {

        public static final class a implements vq.c1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f27332a;

            a(c cVar) {
                this.f27332a = cVar;
            }

            @Override // vq.c1
            public void a(Throwable th2) {
                ju.t.f(th2, "e");
                y9.a.f86838a.i(th2);
            }

            @Override // vq.c1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(vq.d1 d1Var, vq.y0 y0Var) {
                ju.t.f(y0Var, "result");
                c cVar = this.f27332a;
                Map mapA = y0Var.a();
                ju.t.e(mapA, "getPresence(...)");
                if (this.f27332a.f27306a.w(cVar.y(mapA))) {
                    return;
                }
                this.f27332a.f27311f.requestTeamMembersList(false);
            }
        }

        f() {
        }

        @Override // vq.r1
        public void a(q1 q1Var, vq.u0 u0Var) {
            ju.t.f(q1Var, "sub");
            ju.t.f(u0Var, EventStreamParser.EVENT_FIELD);
            byte[] bArrB = u0Var.a().b();
            ju.t.e(bArrB, "getChanInfo(...)");
            String str = new String(bArrB, su.d.f78241b);
            String strC = u0Var.a().c();
            try {
                mv.b bVar = c.this.f27313h;
                bVar.a();
                TeamMembersOnlineCacheRepository.OnlineInfoEntity onlineInfoEntity = (TeamMembersOnlineCacheRepository.OnlineInfoEntity) bVar.b(TeamMembersOnlineCacheRepository.OnlineInfoEntity.Companion.serializer(), str);
                TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepository = c.this.f27306a;
                ju.t.c(strC);
                if (teamMembersOnlineCacheRepository.r(new TeamMembersOnlineCacheRepository.ClientOnlineInfo(strC, onlineInfoEntity))) {
                    return;
                }
                c.this.f27311f.requestTeamMembersList(false);
            } catch (IllegalArgumentException e10) {
                y9.a.f86838a.i(e10);
            }
        }

        @Override // vq.r1
        public void b(q1 q1Var, vq.v0 v0Var) {
            ju.t.f(q1Var, "sub");
            ju.t.f(v0Var, EventStreamParser.EVENT_FIELD);
            byte[] bArrB = v0Var.a().b();
            ju.t.e(bArrB, "getChanInfo(...)");
            String str = new String(bArrB, su.d.f78241b);
            String strC = v0Var.a().c();
            try {
                mv.b bVar = c.this.f27313h;
                bVar.a();
                TeamMembersOnlineCacheRepository.OnlineInfoEntity onlineInfoEntity = (TeamMembersOnlineCacheRepository.OnlineInfoEntity) bVar.b(TeamMembersOnlineCacheRepository.OnlineInfoEntity.Companion.serializer(), str);
                TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepository = c.this.f27306a;
                ju.t.c(strC);
                teamMembersOnlineCacheRepository.s(new TeamMembersOnlineCacheRepository.ClientOnlineInfo(strC, onlineInfoEntity));
            } catch (IllegalArgumentException e10) {
                y9.a.f86838a.i(e10);
            }
        }

        @Override // vq.r1
        public void e(q1 q1Var, m1 m1Var) {
            ju.t.f(q1Var, "sub");
            ju.t.f(m1Var, EventStreamParser.EVENT_FIELD);
            try {
                c.this.f27318m = q1Var;
                q1Var.p(new a(c.this));
            } catch (Exception e10) {
                y9.a.f86838a.i(e10);
            }
        }

        @Override // vq.r1
        public void f(q1 q1Var, u1 u1Var) {
            ju.t.f(q1Var, "sub");
            ju.t.f(u1Var, EventStreamParser.EVENT_FIELD);
            try {
                c.this.f27318m = null;
            } catch (Exception e10) {
                y9.a.f86838a.i(e10);
            }
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27333a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vq.z0 f27335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(vq.z0 z0Var, zt.e eVar) {
            super(2, eVar);
            this.f27335c = z0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new g(this.f27335c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27333a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            il.g0 g0Var = c.this.f27309d;
            String strA = this.f27335c.a();
            ju.t.e(strA, "getClient(...)");
            return g0Var.c(strA);
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public c(TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepository, il.g gVar, il.h0 h0Var, il.g0 g0Var, hg.d dVar, SyncServiceHelper syncServiceHelper, wu.g0 g0Var2, mv.b bVar) {
        ju.t.f(teamMembersOnlineCacheRepository, "teamMembersOnlineCacheRepository");
        ju.t.f(gVar, "cacheCentrifugeTokenRepository");
        ju.t.f(h0Var, "requestCentrifugeTokenRepository");
        ju.t.f(g0Var, "requestCentrifugeChannelsRepository");
        ju.t.f(dVar, "insensitiveKeyValueRepository");
        ju.t.f(syncServiceHelper, "syncServiceHelper");
        ju.t.f(g0Var2, "centrifugeDispatcher");
        ju.t.f(bVar, "jsonConverter");
        this.f27306a = teamMembersOnlineCacheRepository;
        this.f27307b = gVar;
        this.f27308c = h0Var;
        this.f27309d = g0Var;
        this.f27310e = dVar;
        this.f27311f = syncServiceHelper;
        this.f27312g = g0Var2;
        this.f27313h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(vq.z0 z0Var, t1 t1Var) {
        g0.a aVar = (g0.a) wu.i.e(this.f27312g, new g(z0Var, null));
        if (aVar instanceof g0.a.c) {
            CentrifugoChannelTokenList centrifugoChannelTokenListA = ((g0.a.c) aVar).a();
            if (!centrifugoChannelTokenListA.getChannels().isEmpty()) {
                t1Var.b(((CentrifugoChannelToken) vt.v.p0(centrifugoChannelTokenListA.getChannels())).getToken());
                return;
            } else {
                z();
                t1Var.a(new RuntimeException("unable to get sub token"));
                return;
            }
        }
        if (!(aVar instanceof g0.a.d)) {
            z();
            t1Var.a(new RuntimeException("unable to get sub token"));
        } else {
            z();
            this.f27315j = true;
            t1Var.a(new RuntimeException("unable to get sub token"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        try {
            int i10 = this.f27310e.getInt("team_id", 0);
            vq.h0 h0Var = this.f27317l;
            if (h0Var == null) {
                return;
            }
            this.f27319n = h0Var.p0("$teams:team_" + i10, x());
        } catch (Exception unused) {
            if (this.f27316k) {
                z();
                vq.h0 h0Var2 = this.f27317l;
                if (h0Var2 != null) {
                    h0Var2.Z();
                }
                this.f27317l = null;
                this.f27316k = false;
                this.f27318m = null;
            }
        }
    }

    private final void r(String str) {
        try {
            if (!this.f27316k && !u()) {
                this.f27314i = System.currentTimeMillis();
                vq.h0 h0Var = new vq.h0("wss://api.termius.com/centrifugo/connection/websocket?format=protobuf", new vq.x0(), w());
                h0Var.D0(str);
                h0Var.Y();
            }
        } catch (Exception e10) {
            y9.a.f86838a.i(e10);
        }
    }

    private final boolean u() {
        long j10 = this.f27314i;
        return j10 != 0 && System.currentTimeMillis() - j10 < 60000;
    }

    private final boolean v(String str) throws JSONException {
        List listQ0 = su.s.Q0(str, new String[]{"."}, false, 0, 6, null);
        if (su.s.e0(str) >= 1) {
            byte[] bArrDecode = Base64.decode((String) listQ0.get(1), 8);
            ju.t.e(bArrDecode, "decode(...)");
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, su.d.f78241b));
            if (jSONObject.has("exp")) {
                long j10 = jSONObject.getLong("exp");
                if (j10 > 0 && System.currentTimeMillis() / 1000 < j10) {
                    return false;
                }
            }
        }
        return true;
    }

    private final e w() {
        return new e();
    }

    private final f x() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList y(Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            vq.n0 n0Var = (vq.n0) map.get((String) it.next());
            if (n0Var != null) {
                String strC = n0Var.c();
                byte[] bArrB = n0Var.b();
                ju.t.e(bArrB, "getChanInfo(...)");
                String str = new String(bArrB, su.d.f78241b);
                try {
                    mv.b bVar = this.f27313h;
                    bVar.a();
                    TeamMembersOnlineCacheRepository.OnlineInfoEntity onlineInfoEntity = (TeamMembersOnlineCacheRepository.OnlineInfoEntity) bVar.b(TeamMembersOnlineCacheRepository.OnlineInfoEntity.Companion.serializer(), str);
                    ju.t.c(strC);
                    arrayList.add(new TeamMembersOnlineCacheRepository.ClientOnlineInfo(strC, onlineInfoEntity));
                } catch (IllegalArgumentException e10) {
                    y9.a.f86838a.i(e10);
                }
            }
        }
        return arrayList;
    }

    private final void z() {
        q1 q1Var = this.f27319n;
        if (q1Var != null) {
            vq.h0 h0Var = this.f27317l;
            if (h0Var != null) {
                h0Var.u0(q1Var);
            }
            this.f27319n = null;
        }
    }

    public final void B() {
        this.f27315j = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.interactors.c.b
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.interactors.c$b r0 = (com.server.auditor.ssh.client.interactors.c.b) r0
            int r1 = r0.f27323d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27323d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.c$b r0 = new com.server.auditor.ssh.client.interactors.c$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27321b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27323d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f27320a
            java.lang.String r0 = (java.lang.String) r0
            ut.x.b(r7)
            goto L98
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            ut.x.b(r7)
            goto L74
        L3f:
            ut.x.b(r7)
            goto L51
        L43:
            ut.x.b(r7)
            il.g r7 = r6.f27307b
            r0.f27323d = r5
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L51
            goto L96
        L51:
            java.lang.String r7 = (java.lang.String) r7
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L63
            boolean r2 = r6.v(r7)
            if (r2 != 0) goto L63
            r6.r(r7)
            goto L9b
        L63:
            wu.g0 r7 = r6.f27312g
            com.server.auditor.ssh.client.interactors.c$c r2 = new com.server.auditor.ssh.client.interactors.c$c
            r5 = 0
            r2.<init>(r5)
            r0.f27323d = r4
            java.lang.Object r7 = wu.i.g(r7, r2, r0)
            if (r7 != r1) goto L74
            goto L96
        L74:
            il.h0$a r7 = (il.h0.a) r7
            boolean r2 = r7 instanceof il.h0.a.c
            if (r2 == 0) goto L9b
            il.h0$a$c r7 = (il.h0.a.c) r7
            com.server.auditor.ssh.client.synchronization.api.models.user.CentrifugeToken r7 = r7.a()
            java.lang.String r7 = r7.getToken()
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L9b
            il.g r2 = r6.f27307b
            r0.f27320a = r7
            r0.f27323d = r3
            java.lang.Object r0 = r2.d(r7, r0)
            if (r0 != r1) goto L97
        L96:
            return r1
        L97:
            r0 = r7
        L98:
            r6.r(r0)
        L9b:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.c.q(zt.e):java.lang.Object");
    }

    public final void s() {
        wu.j.b(null, new d(null), 1, null);
    }

    public final void t() {
        if (this.f27316k) {
            try {
                vq.h0 h0Var = this.f27317l;
                if (h0Var != null) {
                    h0Var.X(100L);
                    this.f27317l = null;
                    this.f27318m = null;
                    this.f27316k = false;
                    this.f27314i = 0L;
                }
            } catch (Exception e10) {
                y9.a.f86838a.i(e10);
            }
        }
    }
}
