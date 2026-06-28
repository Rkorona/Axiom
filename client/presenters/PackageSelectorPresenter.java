package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.i2;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.interactors.i0;
import com.server.auditor.ssh.client.synchronization.api.adapters.SnippetPackageApiAdapter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import iu.p;
import java.util.ArrayList;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;

/* JADX INFO: loaded from: classes4.dex */
public final class PackageSelectorPresenter extends MvpPresenter<i2> implements i0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f35743f = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f35744u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VaultKeyId f35746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f35747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f35749e;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35750a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f35752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, zt.e eVar) {
            super(2, eVar);
            this.f35752c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelectorPresenter.this.new b(this.f35752c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35750a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (PackageSelectorPresenter.this.f35745a) {
                PackageSelectorPresenter.this.getViewState().Gc(this.f35752c);
            } else {
                PackageSelectorPresenter.this.getViewState().Lb(this.f35752c);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35753a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f35755c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList, zt.e eVar) {
            super(2, eVar);
            this.f35755c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelectorPresenter.this.new c(this.f35755c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35753a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PackageSelectorPresenter.this.f35747c.clear();
            PackageSelectorPresenter.this.f35747c.addAll(this.f35755c);
            PackageSelectorPresenter.this.getViewState().ia(this.f35755c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35756a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelectorPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35756a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PackageSelectorPresenter.this.getViewState().D9(PackageSelectorPresenter.this.f35746b);
            PackageSelectorPresenter.this.getViewState().Q1("Select package");
            PackageSelectorPresenter.this.f35749e.f(PackageSelectorPresenter.this.f35746b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35758a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35760c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelectorPresenter.this.new e(this.f35760c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35758a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Object obj2 = PackageSelectorPresenter.this.f35747c.get(this.f35760c);
            t.e(obj2, "get(...)");
            di.f fVar = (di.f) obj2;
            if (fVar instanceof di.a) {
                PackageSelectorPresenter.this.f35749e.b(PackageSelectorPresenter.this.f35748d, Avo.PackageOrigin.SNIPPET_EDIT_FORM, PackageSelectorPresenter.this.f35746b);
            } else if (fVar instanceof di.e) {
                PackageSelectorPresenter.this.x2(((di.e) fVar).b().getId());
            } else if (fVar instanceof di.k) {
                PackageSelectorPresenter.this.f35749e.b(((di.k) fVar).b(), Avo.PackageOrigin.HOST_TAG, PackageSelectorPresenter.this.f35746b);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35761a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f35763c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelectorPresenter.this.new f(this.f35763c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35761a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PackageSelectorPresenter.this.f35748d = this.f35763c;
            PackageSelectorPresenter.this.f35749e.e(this.f35763c, PackageSelectorPresenter.this.f35746b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35764a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f35766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, zt.e eVar) {
            super(2, eVar);
            this.f35766c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageSelectorPresenter.this.new g(this.f35766c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35764a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PackageSelectorPresenter.this.x2(this.f35766c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PackageSelectorPresenter(boolean z10, VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "searchVaultKeyId");
        this.f35745a = z10;
        this.f35746b = vaultKeyId;
        this.f35747c = new ArrayList();
        this.f35748d = "";
        SnippetPackageDBAdapter snippetPackageDBAdapterO = hg.f.p().O();
        t.e(snippetPackageDBAdapterO, "getSnippetPackageDBAdapter(...)");
        SnippetPackageApiAdapter snippetPackageApiAdapterN = hg.f.p().N();
        t.e(snippetPackageApiAdapterN, "getSnippetPackageApiAdapter(...)");
        SnippetDBAdapter snippetDBAdapterJ = hg.f.p().J();
        t.e(snippetDBAdapterJ, "getSnippetDBAdapter(...)");
        TagDBAdapter tagDBAdapterA0 = hg.f.p().a0();
        t.e(tagDBAdapterA0, "getTagDBAdapter(...)");
        this.f35749e = new i0(snippetPackageDBAdapterO, snippetPackageApiAdapterN, snippetDBAdapterJ, tagDBAdapterA0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(long j10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(j10, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.i0.a
    public void N(ArrayList arrayList) {
        t.f(arrayList, "containersList");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(arrayList, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.i0.a
    public void l2(long j10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(j10, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void y2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(i10, null), 3, null);
    }

    public final void z2(String str) {
        t.f(str, "search");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(str, null), 3, null);
    }
}
