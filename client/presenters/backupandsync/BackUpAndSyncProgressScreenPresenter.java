package com.server.auditor.ssh.client.presenters.backupandsync;

import com.server.auditor.ssh.client.contracts.f;
import iu.p;
import ju.k;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.s0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class BackUpAndSyncProgressScreenPresenter extends MvpPresenter<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37086a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37087b = 8;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37088a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncProgressScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37088a;
            if (i10 == 0) {
                x.b(obj);
                this.f37088a = 1;
                if (s0.b(250L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            BackUpAndSyncProgressScreenPresenter.this.getViewState().P3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        getViewState().Md();
    }

    public final void q2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void r2() {
    }
}
