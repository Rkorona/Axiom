package com.server.auditor.ssh.client.presenters.sshkey;

import cj.a;
import cj.c;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.models.Host;
import il.r;
import iu.p;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class ExportSshKeyPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.sshkey.f> implements c.a, a.InterfaceC0259a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SshKeyDBModel f37999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38004f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final cj.c f38006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final cj.a f38007w;

    static final class a extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38008a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38008a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.getViewState().p();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38010a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38012c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f38012c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new b(this.f38012c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38010a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.f38003e = this.f38012c;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38013a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38013a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.getViewState().b9();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38015a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38017c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, zt.e eVar) {
            super(2, eVar);
            this.f38017c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new d(this.f38017c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38015a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.f38006v.c(this.f38017c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38018a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38018a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.getViewState().O3();
            ExportSshKeyPresenter.this.getViewState().i3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38020a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38020a;
            if (i10 == 0) {
                x.b(obj);
                com.server.auditor.ssh.client.utils.analytics.a aVar = ExportSshKeyPresenter.this.f38005u;
                String biometricAlias = ExportSshKeyPresenter.this.f37999a.getBiometricAlias();
                aVar.G2(!(biometricAlias == null || biometricAlias.length() == 0));
                ExportSshKeyPresenter.this.getViewState().O3();
                if (ExportSshKeyPresenter.this.f38001c) {
                    cj.a aVar2 = ExportSshKeyPresenter.this.f38007w;
                    long j10 = ExportSshKeyPresenter.this.f38000b;
                    int idInDatabase = (int) ExportSshKeyPresenter.this.f37999a.getIdInDatabase();
                    String biometricAlias2 = ExportSshKeyPresenter.this.f37999a.getBiometricAlias();
                    boolean z10 = biometricAlias2 == null || biometricAlias2.length() == 0;
                    this.f38020a = 1;
                    if (aVar2.f(j10, idInDatabase, !z10, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38022a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38022a;
            if (i10 == 0) {
                x.b(obj);
                cj.c cVar = ExportSshKeyPresenter.this.f38006v;
                String str = ExportSshKeyPresenter.this.f38002d;
                String str2 = ExportSshKeyPresenter.this.f38003e;
                String str3 = ExportSshKeyPresenter.this.f38004f;
                SshKeyDBModel sshKeyDBModel = ExportSshKeyPresenter.this.f37999a;
                long j10 = ExportSshKeyPresenter.this.f38000b;
                this.f38022a = 1;
                if (cVar.e(str, str2, str3, sshKeyDBModel, j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38024a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38026c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f38026c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new h(this.f38026c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.f38004f = this.f38026c;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38027a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38027a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Host hostS = hg.f.p().j().s(kotlin.coroutines.jvm.internal.b.e(ExportSshKeyPresenter.this.f38000b));
            List<TagDBModel> itemListWhichNotDeleted = hg.f.p().a0().getItemListWhichNotDeleted();
            List<TagHostDBModel> itemListWhichNotDeleted2 = hg.f.p().c0().getItemListWhichNotDeleted();
            if (hostS != null) {
                com.server.auditor.ssh.client.contracts.sshkey.f viewState = ExportSshKeyPresenter.this.getViewState();
                t.c(itemListWhichNotDeleted);
                t.c(itemListWhichNotDeleted2);
                viewState.v4(hostS, itemListWhichNotDeleted, itemListWhichNotDeleted2);
            } else {
                ExportSshKeyPresenter.this.getViewState().b9();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38029a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38029a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.f38006v.d();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38031a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38031a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.getViewState().b9();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38033a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f38035c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new l(this.f38035c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38033a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.f38002d = this.f38035c;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38036a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExportSshKeyPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38036a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExportSshKeyPresenter.this.getViewState().d();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ExportSshKeyPresenter(SshKeyDBModel sshKeyDBModel, long j10) {
        t.f(sshKeyDBModel, "sshKeyDBModel");
        this.f37999a = sshKeyDBModel;
        this.f38000b = j10;
        this.f38001c = !sshKeyDBModel.isShared() || com.server.auditor.ssh.client.app.a.N().z();
        this.f38002d = "";
        this.f38003e = "";
        this.f38004f = "";
        this.f38005u = com.server.auditor.ssh.client.utils.analytics.a.y();
        SessionManager sessionManager = SessionManager.getInstance();
        t.e(sessionManager, "getInstance(...)");
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        r rVarJ = hg.f.p().j();
        t.e(rVarJ, "getHostDBRepository(...)");
        this.f38006v = new cj.c(sessionManager, dVarM, rVarJ, this);
        IdentityDBAdapter identityDBAdapterN = hg.f.p().n();
        t.e(identityDBAdapterN, "getIdentityDBAdapter(...)");
        SshConfigIdentityDBAdapter sshConfigIdentityDBAdapterU = hg.f.p().U();
        t.e(sshConfigIdentityDBAdapterU, "getSshConfigIdentityDBAdapter(...)");
        SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapterE = hg.f.p().E();
        t.e(sharedSshConfigIdentityDBAdapterE, "getSharedSshConfigIdentityDBAdapter(...)");
        r rVarJ2 = hg.f.p().j();
        t.e(rVarJ2, "getHostDBRepository(...)");
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        zp.e eVarK = hg.f.p().k(hg.f.p().Y());
        t.e(eVarK, "getHostManager(...)");
        this.f38007w = new cj.a(identityDBAdapterN, sshConfigIdentityDBAdapterU, sharedSshConfigIdentityDBAdapterE, rVarJ2, sshKeyDBAdapterW, eVarK, this);
    }

    public final void C2(String str) {
        t.f(str, "text");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str, null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void E2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(i10, null), 3, null);
    }

    public final void F2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void G2(String str) {
        t.f(str, "text");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, null), 3, null);
    }

    public final void H2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    public final void I2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    public final void J2(String str) {
        t.f(str, "text");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, null), 3, null);
    }

    @Override // cj.c.a
    public void S1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    @Override // cj.c.a
    public void p0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    @Override // cj.a.InterfaceC0259a
    public void r0(ArrayList arrayList) {
        t.f(arrayList, "list");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    @Override // cj.c.a
    public void t0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }
}
