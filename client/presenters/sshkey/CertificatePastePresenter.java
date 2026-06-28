package com.server.auditor.ssh.client.presenters.sshkey;

import com.crystalnix.termius.libtermius.Keygen;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class CertificatePastePresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.sshkey.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f37817b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37818a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return CertificatePastePresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37818a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            CertificatePastePresenter.this.getViewState().z1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CertificatePastePresenter f37822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, CertificatePastePresenter certificatePastePresenter, e eVar) {
            super(2, eVar);
            this.f37821b = str;
            this.f37822c = certificatePastePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(this.f37821b, this.f37822c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37820a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!t.b(this.f37821b, this.f37822c.f37816a)) {
                this.f37822c.getViewState().tc();
                this.f37822c.getViewState().F0(this.f37821b.length() > 0);
            } else if (this.f37821b.length() == 0) {
                this.f37822c.getViewState().F0(false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37823a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, e eVar) {
            super(2, eVar);
            this.f37825c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return CertificatePastePresenter.this.new c(this.f37825c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37823a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            CertificatePastePresenter.this.getViewState().c5(this.f37825c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37826a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, e eVar) {
            super(2, eVar);
            this.f37828c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return CertificatePastePresenter.this.new d(this.f37828c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37826a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            CertificatePastePresenter.this.f37817b.h6(Avo.KeychainItem.SSH_CERTIFICATE);
            if (Keygen.checkPublicKeyIsCertificate(this.f37828c)) {
                CertificatePastePresenter.this.getViewState().tc();
                CertificatePastePresenter.this.getViewState().c5(this.f37828c);
            } else {
                CertificatePastePresenter.this.getViewState().y2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public CertificatePastePresenter(String str) {
        t.f(str, "certificatePasteText");
        this.f37816a = str;
        this.f37817b = com.server.auditor.ssh.client.utils.analytics.a.y();
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.f37817b.a6(true);
        getViewState().c();
        getViewState().a8(this.f37816a);
        getViewState().F0(this.f37816a.length() > 0);
        if (this.f37816a.length() > 0) {
            getViewState().y2();
        } else {
            getViewState().K2();
        }
    }

    public final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void t2(String str) {
        t.f(str, "input");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str, this, null), 3, null);
    }

    public final void u2(String str) {
        t.f(str, "certificateText");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, null), 3, null);
    }

    public final void v2(String str) {
        t.f(str, "certificateText");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(str, null), 3, null);
    }
}
