package com.server.auditor.ssh.client.presenters;

import android.text.SpannableStringBuilder;
import com.server.auditor.ssh.client.contracts.y;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import il.s;
import iu.p;
import java.util.ArrayList;
import java.util.Iterator;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import si.a;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class ChainHostEditPresenter extends MvpPresenter<y> implements a.InterfaceC1215a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f35252u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f35253v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ChainingHost f35255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f35257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VaultKeyId f35258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final si.a f35259f;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f35261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ChainHostEditPresenter f35262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, ChainHostEditPresenter chainHostEditPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35261b = j10;
            this.f35262c = chainHostEditPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f35261b, this.f35262c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35260a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f35261b != -1) {
                this.f35262c.f35259f.a(this.f35261b);
            } else {
                y viewState = this.f35262c.getViewState();
                ChainingHost chainingHost = this.f35262c.f35255b;
                viewState.L7(chainingHost != null ? chainingHost.getHostList() : null);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35263a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChainHostEditPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList<Host> hostList;
            au.b.f();
            if (this.f35263a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ArrayList arrayList = new ArrayList();
            ChainingHost chainingHost = ChainHostEditPresenter.this.f35255b;
            if (chainingHost != null && (hostList = chainingHost.getHostList()) != null) {
                Iterator<T> it = hostList.iterator();
                while (it.hasNext()) {
                    arrayList.add(kotlin.coroutines.jvm.internal.b.e(((Host) it.next()).getId()));
                }
            }
            if (ChainHostEditPresenter.this.f35257d != -1) {
                arrayList.add(kotlin.coroutines.jvm.internal.b.e(ChainHostEditPresenter.this.f35257d));
            }
            ChainHostEditPresenter.this.getViewState().z7(v.e1(arrayList), ChainHostEditPresenter.this.f35258e);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35265a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChainHostEditPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList<Host> hostList;
            au.b.f();
            if (this.f35265a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChainingHost chainingHost = ChainHostEditPresenter.this.f35255b;
            if (chainingHost != null && (hostList = chainingHost.getHostList()) != null) {
                hostList.clear();
            }
            ChainHostEditPresenter.this.D2(new ChainingHost());
            ChainHostEditPresenter.this.getViewState().B7();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35267a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChainHostEditPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35267a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChainHostEditPresenter.this.f35259f.c(ChainHostEditPresenter.this.f35257d, ChainHostEditPresenter.this.f35256c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35269a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChainHostEditPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35269a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChainHostEditPresenter.this.getViewState().a();
            y viewState = ChainHostEditPresenter.this.getViewState();
            ChainingHost chainingHost = ChainHostEditPresenter.this.f35255b;
            viewState.L7(chainingHost != null ? chainingHost.getHostList() : null);
            ChainHostEditPresenter.this.getViewState().U9(ChainHostEditPresenter.this.f35254a);
            ChainHostEditPresenter chainHostEditPresenter = ChainHostEditPresenter.this;
            chainHostEditPresenter.D2(chainHostEditPresenter.f35255b);
            ChainHostEditPresenter.this.A2();
            ChainHostEditPresenter.this.C2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Host f35272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ChainHostEditPresenter f35273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Host host, ChainHostEditPresenter chainHostEditPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35272b = host;
            this.f35273c = chainHostEditPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f35272b, this.f35273c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList<Host> hostList;
            au.b.f();
            if (this.f35271a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f35272b != null) {
                ChainingHost chainingHost = this.f35273c.f35255b;
                if (chainingHost != null && (hostList = chainingHost.getHostList()) != null) {
                    hostList.add(0, this.f35272b);
                }
                ChainHostEditPresenter chainHostEditPresenter = this.f35273c;
                chainHostEditPresenter.D2(chainHostEditPresenter.f35255b);
                y viewState = this.f35273c.getViewState();
                ChainingHost chainingHost2 = this.f35273c.f35255b;
                viewState.L7(chainingHost2 != null ? chainingHost2.getHostList() : null);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35274a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HostIconUtil.OsModelType f35276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(HostIconUtil.OsModelType osModelType, zt.e eVar) {
            super(2, eVar);
            this.f35276c = osModelType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChainHostEditPresenter.this.new h(this.f35276c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35274a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChainHostEditPresenter.this.getViewState().Ha(this.f35276c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35277a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChainHostEditPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35277a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChainHostEditPresenter.this.getViewState().R9(ChainHostEditPresenter.this.f35255b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35279a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f35281c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(SpannableStringBuilder spannableStringBuilder, zt.e eVar) {
            super(2, eVar);
            this.f35281c = spannableStringBuilder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChainHostEditPresenter.this.new j(this.f35281c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35279a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChainHostEditPresenter.this.getViewState().X4(this.f35281c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35282a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChainHostEditPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35282a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (t.b(ChainHostEditPresenter.this.f35256c, "host")) {
                com.server.auditor.ssh.client.utils.analytics.a.y().r3(Avo.Entity.HOST);
            } else {
                com.server.auditor.ssh.client.utils.analytics.a.y().r3(Avo.Entity.GROUP);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ChainingHost f35285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ChainHostEditPresenter f35286c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ChainingHost chainingHost, ChainHostEditPresenter chainHostEditPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35285b = chainingHost;
            this.f35286c = chainHostEditPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new l(this.f35285b, this.f35286c, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                au.b.f()
                int r0 = r2.f35284a
                if (r0 != 0) goto L55
                ut.x.b(r3)
                com.server.auditor.ssh.client.models.ChainingHost r3 = r2.f35285b
                if (r3 == 0) goto L3d
                java.util.ArrayList r3 = r3.getHostList()
                java.lang.String r0 = "getHostList(...)"
                ju.t.e(r3, r0)
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L3d
                com.server.auditor.ssh.client.models.ChainingHost r3 = r2.f35285b
                java.util.ArrayList r3 = r3.getHostList()
                r0 = 0
                java.lang.Object r3 = r3.get(r0)
                com.server.auditor.ssh.client.models.Host r3 = (com.server.auditor.ssh.client.models.Host) r3
                java.lang.String r3 = r3.getHeaderText()
                com.server.auditor.ssh.client.presenters.ChainHostEditPresenter r0 = r2.f35286c
                si.a r0 = com.server.auditor.ssh.client.presenters.ChainHostEditPresenter.q2(r0)
                ju.t.c(r3)
                java.lang.String r1 = "host"
                r0.d(r3, r1)
                goto L52
            L3d:
                com.server.auditor.ssh.client.presenters.ChainHostEditPresenter r3 = r2.f35286c
                si.a r3 = com.server.auditor.ssh.client.presenters.ChainHostEditPresenter.q2(r3)
                com.server.auditor.ssh.client.presenters.ChainHostEditPresenter r0 = r2.f35286c
                java.lang.String r0 = com.server.auditor.ssh.client.presenters.ChainHostEditPresenter.t2(r0)
                com.server.auditor.ssh.client.presenters.ChainHostEditPresenter r1 = r2.f35286c
                java.lang.String r1 = com.server.auditor.ssh.client.presenters.ChainHostEditPresenter.r2(r1)
                r3.d(r0, r1)
            L52:
                ut.m0 r3 = ut.m0.f82633a
                return r3
            L55:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.ChainHostEditPresenter.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChainHostEditPresenter(String str, ChainingHost chainingHost, String str2, long j10, VaultKeyId vaultKeyId) {
        t.f(str, "entityName");
        t.f(str2, "chainType");
        t.f(vaultKeyId, "filterVaultKeyId");
        this.f35254a = str;
        this.f35255b = chainingHost;
        this.f35256c = str2;
        this.f35257d = j10;
        this.f35258e = vaultKeyId;
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        this.f35259f = new si.a(hostsDBAdapterI, new s(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    public final void A2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // si.a.InterfaceC1215a
    public void B0(HostIconUtil.OsModelType osModelType) {
        t.f(osModelType, "osModelType");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(osModelType, null), 3, null);
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    public final void D2(ChainingHost chainingHost) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(chainingHost, this, null), 3, null);
    }

    @Override // si.a.InterfaceC1215a
    public void S(Host host) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(host, this, null), 3, null);
    }

    @Override // si.a.InterfaceC1215a
    public void h2(SpannableStringBuilder spannableStringBuilder) {
        t.f(spannableStringBuilder, "formattedTitle");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(spannableStringBuilder, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void x2(long j10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(j10, this, null), 3, null);
    }

    public final void y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }
}
