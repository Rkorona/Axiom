package com.server.auditor.ssh.client.presenters.sshkey;

import com.server.auditor.ssh.client.contracts.sshkey.j;
import io.split.android.client.dtos.SerializableEvent;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SshPrivateKeyPastePresenter extends MvpPresenter<j> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f38084d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38085e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38088c;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38089a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPastePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38089a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshPrivateKeyPastePresenter.this.getViewState().z1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshPrivateKeyPastePresenter f38093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, SshPrivateKeyPastePresenter sshPrivateKeyPastePresenter, zt.e eVar) {
            super(2, eVar);
            this.f38092b = str;
            this.f38093c = sshPrivateKeyPastePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f38092b, this.f38093c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38091a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!t.b(this.f38092b, this.f38093c.f38086a)) {
                this.f38093c.getViewState().Da();
                this.f38093c.getViewState().F0(this.f38092b.length() > 0);
            } else if (this.f38092b.length() == 0) {
                this.f38093c.getViewState().F0(false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38094a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38096c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f38096c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPastePresenter.this.new d(this.f38096c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38094a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshPrivateKeyPastePresenter.this.getViewState().Vd(this.f38096c, SshPrivateKeyPastePresenter.this.f38088c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f38097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38098b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f38100d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f38100d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPastePresenter.this.new e(this.f38100d, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
        
            if (wu.s0.b(300, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.sshkey.SshPrivateKeyPastePresenter.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshPrivateKeyPastePresenter(String str) {
        t.f(str, "privateKeyText");
        this.f38086a = str;
        this.f38087b = com.server.auditor.ssh.client.utils.analytics.a.y();
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.f38087b.a6(false);
        getViewState().c();
        getViewState().od(this.f38086a);
        if (this.f38086a.length() > 0) {
            getViewState().n9();
        } else {
            getViewState().K2();
        }
    }

    public final void u2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void v2(String str) {
        t.f(str, "input");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, this, null), 3, null);
    }

    public final void w2(String str) {
        t.f(str, SerializableEvent.KEY_FIELD);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(str, null), 3, null);
    }

    public final void x2(String str) {
        t.f(str, SerializableEvent.KEY_FIELD);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(str, null), 3, null);
    }
}
