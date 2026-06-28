package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.views.d;
import com.server.auditor.ssh.client.models.ImportOptionType;
import iu.p;
import java.util.List;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.s;
import ut.x;
import vt.v;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class QuickImportMainScreenPresenter extends MvpPresenter<d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f35796c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35797d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f35798e = v.r(ImportOptionType.AWS.INSTANCE, ImportOptionType.DigitalOcean.INSTANCE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f35799f = v.r(ImportOptionType.SecureCRT.INSTANCE, ImportOptionType.PuTTY.INSTANCE, ImportOptionType.MobaXTerm.INSTANCE, ImportOptionType.CSV.INSTANCE, ImportOptionType.SshConfig.INSTANCE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35800a = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f35801b = com.server.auditor.ssh.client.app.a.N();

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35802a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return QuickImportMainScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35802a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            QuickImportMainScreenPresenter.this.getViewState().p();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImportOptionType f35805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ QuickImportMainScreenPresenter f35806c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ImportOptionType importOptionType, QuickImportMainScreenPresenter quickImportMainScreenPresenter, e eVar) {
            super(2, eVar);
            this.f35805b = importOptionType;
            this.f35806c = quickImportMainScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new c(this.f35805b, this.f35806c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35804a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ImportOptionType importOptionType = this.f35805b;
            if (t.b(importOptionType, ImportOptionType.AWS.INSTANCE)) {
                this.f35806c.f35800a.M3();
            } else if (t.b(importOptionType, ImportOptionType.CSV.INSTANCE)) {
                this.f35806c.f35800a.N3();
            } else if (t.b(importOptionType, ImportOptionType.DigitalOcean.INSTANCE)) {
                this.f35806c.f35800a.Q3();
            } else if (t.b(importOptionType, ImportOptionType.MobaXTerm.INSTANCE)) {
                this.f35806c.f35800a.S3();
            } else if (t.b(importOptionType, ImportOptionType.PuTTY.INSTANCE)) {
                this.f35806c.f35800a.T3();
            } else if (t.b(importOptionType, ImportOptionType.SecureCRT.INSTANCE)) {
                this.f35806c.f35800a.U3();
            } else {
                if (!t.b(importOptionType, ImportOptionType.SshConfig.INSTANCE)) {
                    throw new s();
                }
                this.f35806c.f35800a.V3();
            }
            this.f35806c.getViewState().Uc(this.f35805b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().Sc(f35798e, f35799f);
        this.f35801b.R0(false);
    }

    public final void r2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void s2(ImportOptionType importOptionType) {
        t.f(importOptionType, "importOption");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(importOptionType, this, null), 3, null);
    }
}
