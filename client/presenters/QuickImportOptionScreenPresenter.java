package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.views.f;
import com.server.auditor.ssh.client.models.ImportOptionType;
import com.server.auditor.ssh.client.models.o;
import hg.b2;
import iu.p;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class QuickImportOptionScreenPresenter extends MvpPresenter<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImportOptionType f35807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f35808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hj.c f35809c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35810a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return QuickImportOptionScreenPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35810a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            QuickImportOptionScreenPresenter.this.getViewState().gd();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35812a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return QuickImportOptionScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35812a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            QuickImportOptionScreenPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ QuickImportOptionScreenPresenter f35816c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, QuickImportOptionScreenPresenter quickImportOptionScreenPresenter, e eVar) {
            super(2, eVar);
            this.f35815b = z10;
            this.f35816c = quickImportOptionScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new c(this.f35815b, this.f35816c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35814a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f35815b) {
                this.f35816c.getViewState().gd();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35817a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return QuickImportOptionScreenPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35817a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!QuickImportOptionScreenPresenter.this.f35808b.r0()) {
                QuickImportOptionScreenPresenter.this.getViewState().a3();
            } else if (QuickImportOptionScreenPresenter.this.f35808b.u0() && QuickImportOptionScreenPresenter.this.f35809c.f()) {
                QuickImportOptionScreenPresenter.this.getViewState().gd();
            } else {
                QuickImportOptionScreenPresenter.this.getViewState().o();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public QuickImportOptionScreenPresenter(ImportOptionType importOptionType) {
        t.f(importOptionType, "importOptionType");
        this.f35807a = importOptionType;
        this.f35808b = com.server.auditor.ssh.client.app.a.N();
        this.f35809c = new hj.c(b2.f52944a.y1());
    }

    private final List y2() {
        ArrayList arrayList = new ArrayList();
        if (!this.f35808b.r0()) {
            arrayList.add(o.a.f27918a);
            arrayList.add(o.b.f27919a);
        } else if (this.f35809c.f()) {
            arrayList.add(o.c.f27920a);
        } else {
            arrayList.add(o.f.f27923a);
            arrayList.add(o.b.f27919a);
        }
        arrayList.add(new o.d(this.f35807a));
        arrayList.add(o.e.f27922a);
        return arrayList;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        ImportOptionType importOptionType = this.f35807a;
        if (t.b(importOptionType, ImportOptionType.AWS.INSTANCE)) {
            getViewState().v6();
        } else if (t.b(importOptionType, ImportOptionType.DigitalOcean.INSTANCE)) {
            getViewState().rb();
        } else if (t.b(importOptionType, ImportOptionType.CSV.INSTANCE)) {
            getViewState().v3();
        } else if (t.b(importOptionType, ImportOptionType.MobaXTerm.INSTANCE)) {
            getViewState().Q7();
        } else if (t.b(importOptionType, ImportOptionType.PuTTY.INSTANCE)) {
            getViewState().nc();
        } else if (t.b(importOptionType, ImportOptionType.SecureCRT.INSTANCE)) {
            getViewState().B9();
        } else {
            if (!t.b(importOptionType, ImportOptionType.SshConfig.INSTANCE)) {
                throw new s();
            }
            getViewState().Qa();
        }
        getViewState().a();
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: s2, reason: merged with bridge method [inline-methods] */
    public void attachView(f fVar) {
        super.attachView(fVar);
        getViewState().C4(y2());
    }

    public final void t2() {
    }

    public final void u2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void v2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void w2(boolean z10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(z10, this, null), 3, null);
    }

    public final void x2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }
}
