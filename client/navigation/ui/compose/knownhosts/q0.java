package com.server.auditor.ssh.client.navigation.ui.compose.knownhosts;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.models.KnownHost;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import wu.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32762h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f32763i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map f32764j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KnownHostsDBAdapter f32765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HostsDBAdapter f32766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final il.s f32767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j1 f32768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gj.a f32769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hg.d f32770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vl.g f32771g;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f32775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f32776e;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f32778u;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32776e = obj;
            this.f32778u |= RtlSpacingHelper.UNDEFINED;
            return q0.this.d(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32779a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return q0.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32779a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            List<KnownHost> knownHostsItems = q0.this.f32765a.getKnownHostsItems();
            il.s sVar = q0.this.f32767c;
            List<HostDBModel> itemListWhichNotDeleted = q0.this.f32766b.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
            return new ut.u(knownHostsItems, sVar.b(itemListWhichNotDeleted));
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f32781a;

        public d(Comparator comparator) {
            this.f32781a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Comparator comparator = this.f32781a;
            String host = ((KnownHost) obj).getHost();
            if (host == null) {
                host = "";
            }
            if (host.length() <= 0) {
                host = null;
            }
            if (host == null) {
                host = "";
            }
            String host2 = ((KnownHost) obj2).getHost();
            if (host2 == null) {
                host2 = "";
            }
            String str = host2.length() > 0 ? host2 : null;
            return comparator.compare(host, str != null ? str : "");
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Long.valueOf(((KnownHost) obj).getId()), Long.valueOf(((KnownHost) obj2).getId()));
        }
    }

    public static final class f implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f32782a;

        public f(Comparator comparator) {
            this.f32782a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Comparator comparator = this.f32782a;
            String host = ((KnownHost) obj2).getHost();
            if (host == null) {
                host = "";
            }
            if (host.length() <= 0) {
                host = null;
            }
            if (host == null) {
                host = "";
            }
            String host2 = ((KnownHost) obj).getHost();
            if (host2 == null) {
                host2 = "";
            }
            String str = host2.length() > 0 ? host2 : null;
            return comparator.compare(host, str != null ? str : "");
        }
    }

    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Long.valueOf(((KnownHost) obj2).getId()), Long.valueOf(((KnownHost) obj).getId()));
        }
    }

    static {
        TermiusSortType termiusSortType = TermiusSortType.ByNameAscending;
        ju.r0 r0Var = ju.r0.f62955a;
        f32764j = vt.s0.k(ut.b0.a(termiusSortType, new d(su.s.G(r0Var))), ut.b0.a(TermiusSortType.ByNameDescending, new f(su.s.G(r0Var))), ut.b0.a(TermiusSortType.ByDateAscending, new e()), ut.b0.a(TermiusSortType.ByDateDescending, new g()));
    }

    public q0(KnownHostsDBAdapter knownHostsDBAdapter, HostsDBAdapter hostsDBAdapter, il.s sVar, j1 j1Var, gj.a aVar, hg.d dVar, vl.g gVar) {
        ju.t.f(knownHostsDBAdapter, "knownHostsDBAdapter");
        ju.t.f(hostsDBAdapter, "hostsDBAdapter");
        ju.t.f(sVar, "hostDBRepositoryOptimized");
        ju.t.f(j1Var, "dbDispatcher");
        ju.t.f(aVar, "filterEntityHelper");
        ju.t.f(dVar, "keyValueRepository");
        ju.t.f(gVar, "vaultsRepository");
        this.f32765a = knownHostsDBAdapter;
        this.f32766b = hostsDBAdapter;
        this.f32767c = sVar;
        this.f32768d = j1Var;
        this.f32769e = aVar;
        this.f32770f = dVar;
        this.f32771g = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r25, zt.e r26) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.q0.d(java.lang.String, zt.e):java.lang.Object");
    }
}
